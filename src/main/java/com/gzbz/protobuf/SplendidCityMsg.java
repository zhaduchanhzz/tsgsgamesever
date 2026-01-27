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

public final class SplendidCityMsg {
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_GameBuilding_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_GameBuilding_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_GameEvent_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_GameEvent_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_GameMain_17201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_GameMain_17201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_GameMain_17202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_GameMain_17202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_GameRollDice_17203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_GameRollDice_17203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_GameRollDice_17204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_GameRollDice_17204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_GameAddRandomDice_17205_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_GameAddRandomDice_17205_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_GameAddRandomDice_17206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_GameAddRandomDice_17206_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_GameGoldDiceBuy_17207_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_GameGoldDiceBuy_17207_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_GameGoldDiceBuy_17208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_GameGoldDiceBuy_17208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_GameEvent_17209_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_GameEvent_17209_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_GameEvent_17210_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_GameEvent_17210_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTask_17211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTask_17211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTask_17212_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTask_17212_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTaskCommit_17213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTaskCommit_17213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskCommit_17214_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskCommit_17214_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskNotify_17216_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskNotify_17216_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_GameBuildingReward_17217_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_GameBuildingReward_17217_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_GameBuildingReward_17218_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_GameBuildingReward_17218_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_FancyReward_17221_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_FancyReward_17221_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_FancyReward_17222_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_FancyReward_17222_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_SmashEgg_17223_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_SmashEgg_17223_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_SmashEgg_17224_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_SmashEgg_17224_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_TakeLuckReward_17227_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_TakeLuckReward_17227_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_TakeLuckReward_17228_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_TakeLuckReward_17228_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_OpenEggUi_17229_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_OpenEggUi_17229_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_OpenEggUi_17230_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_OpenEggUi_17230_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_AddUpTotalInfo_17253_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_AddUpTotalInfo_17253_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_AddUpTotalInfo_17254_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_AddUpTotalInfo_17254_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveAddUpReward_17255_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveAddUpReward_17255_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_SignTotalInfo_17256_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_SignTotalInfo_17256_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_SignTotalInfo_17257_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_SignTotalInfo_17257_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_Sign_17258_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_Sign_17258_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_ShopAddUpInfo_17259_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_ShopAddUpInfo_17259_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_ShopAddUpInfo_17260_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_ShopAddUpInfo_17260_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_17261_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_17261_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_ActivityInfo_17270_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_ActivityInfo_17270_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_ActivityInfo_17271_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_ActivityInfo_17271_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_MyDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_DrawRecord_17272_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_DrawRecord_17272_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_DrawRecord_17273_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_DrawRecord_17273_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_C2S_ServerDrawRecord_17274_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_C2S_ServerDrawRecord_17274_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_splendidCity_com_gzbz_protobuf_S2C_ServerDrawRecord_17275_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_splendidCity_com_gzbz_protobuf_S2C_ServerDrawRecord_17275_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private SplendidCityMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012SplendidCity.proto\u0012\u001esplendidCity.com.gzbz.protobuf\u001a\fcommon.proto\u001a\nRank.proto\"=\n\fGameBuilding\u0012\u000f\n\u0007buildId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0002(\u0005\u0012\u0010\n\brewardLv\u0018\u0003 \u0003(\u0005\"0\n\tGameEvent\u0012\u000f\n\u0007eventId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\neventParam\u0018\u0002 \u0003(\u0005\"\u0014\n\u0012C2S_GameMain_17201\"É\u0001\n\u0012S2C_GameMain_17202\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bdiceRecover\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000ebuyGoldDiceNum\u0018\u0003 \u0002(\u0005\u0012>\n\bbuilding\u0018\u0004 \u0003(\u000b2,.splendidCity.com.gzbz.protobuf.GameBuilding\u00128\n\u0005event\u0018\u0005 \u0001(\u000b2).splendidCity.com.gzbz.protobuf.GameEvent\"3\n\u0016C2S_GameRollDice_17203\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0001(\u0005\"Ð\u0001\n\u0016S2C_GameRollDice_17204\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004grid\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bdiceRecover\u0018\u0004 \u0002(\u0005\u00128\n\u0005event\u0018\u0005 \u0001(\u000b2).splendidCity.com.gzbz.protobuf.GameEvent\u0012>\n\bbuilding\u0018\u0006 \u0001(\u000b2,.splendidCity.com.gzbz.protobuf.GameBuilding\"\u001d\n\u001bC2S_GameAddRandomDice_17205\"2\n\u001bS2C_GameAddRandomDice_17206\u0012\u0013\n\u000bdiceRecover\u0018\u0001 \u0002(\u0005\"\u001b\n\u0019C2S_GameGoldDiceBuy_17207\"3\n\u0019S2C_GameGoldDiceBuy_17208\u0012\u0016\n\u000ebuyGoldDiceNum\u0018\u0001 \u0002(\u0005\"O\n\u0013C2S_GameEvent_17209\u00128\n\u0005event\u0018\u0001 \u0002(\u000b2).splendidCity.com.gzbz.protobuf.GameEvent\"Û\u0001\n\u0013S2C_GameEvent_17210\u00128\n\u0005event\u0018\u0001 \u0002(\u000b2).splendidCity.com.gzbz.protobuf.GameEvent\u0012\f\n\u0004grid\u0018\u0002 \u0002(\u0005\u0012>\n\bbuilding\u0018\u0003 \u0001(\u000b2,.splendidCity.com.gzbz.protobuf.GameBuilding\u0012<\n\tnextEvent\u0018\u0004 \u0001(\u000b2).splendidCity.com.gzbz.protobuf.GameEvent\"\u0014\n\u0012C2S_GameTask_17211\"0\n\u0012S2C_GameTask_17212\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"*\n\u0018C2S_GameTaskCommit_17213\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"*\n\u0018S2C_GameTaskCommit_17214\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"6\n\u0018S2C_GameTaskNotify_17216\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\">\n\u001cC2S_GameBuildingReward_17217\u0012\u0012\n\nbuildingId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0002(\u0005\">\n\u001cS2C_GameBuildingReward_17218\u0012\u0012\n\nbuildingId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0002(\u0005\"*\n\u0015C2S_FancyReward_17221\u0012\u0011\n\titemIndex\u0018\u0001 \u0002(\u0005\":\n\u0015S2C_FancyReward_17222\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0011\n\titemIndex\u0018\u0002 \u0002(\u0005\"0\n\u0012C2S_SmashEgg_17223\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005index\u0018\u0002 \u0002(\u0005\"Ô\u0001\n\u0012S2C_SmashEgg_17224\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005index\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007isReset\u0018\u0003 \u0002(\b\u0012!\n\u0006indexs\u0018\u0004 \u0003(\u000b2\u0011.common.MapDataII\u0012$\n\tseniorNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bsmashEggNum\u0018\u0006 \u0002(\u0005\u0012\u0013\n\u000bisHaveFancy\u0018\u0007 \u0001(\b\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0001(\u0005\",\n\u0018C2S_TakeLuckReward_17227\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\";\n\u0018S2C_TakeLuckReward_17228\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007takedId\u0018\u0002 \u0003(\u0005\"\u0015\n\u0013C2S_OpenEggUi_17229\"¶\u0001\n\u0013S2C_OpenEggUi_17230\u0012\u000f\n\u0007fancyId\u0018\u0001 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bsmashEggNum\u0018\u0003 \u0002(\u0005\u0012\u0011\n\ttakedLuck\u0018\u0004 \u0003(\u0005\u0012\u001f\n\u0004eggs\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\u0006 \u0001(\u0005\"\u001a\n\u0018C2S_AddUpTotalInfo_17253\"E\n\u0018S2C_AddUpTotalInfo_17254\u0012\u0012\n\ngotRewards\u0018\u0001 \u0003(\u0005\u0012\u0015\n\rstageRecharge\u0018\u0002 \u0002(\u0005\"0\n\u001cC2S_ReceiveAddUpReward_17255\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_SignTotalInfo_17256\"F\n\u0017S2C_SignTotalInfo_17257\u0012\u0013\n\u000bactivityDay\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esignGotRewards\u0018\u0002 \u0003(\u0005\"\u001d\n\u000eC2S_Sign_17258\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_ShopAddUpInfo_17259\"D\n\u0017S2C_ShopAddUpInfo_17260\u0012\u0015\n\rdailyRecharge\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRewards\u0018\u0002 \u0003(\u0005\".\n C2S_ReceiveShopAddUpReward_17261\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_ActivityInfo_17270\"U\n\u0016S2C_ActivityInfo_17271\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rsmashEggStage\u0018\u0003 \u0002(\u0005\"Z\n\fMyDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"r\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0005 \u0001(\u0005\"\u0016\n\u0014C2S_DrawRecord_17272\"V\n\u0014S2C_DrawRecord_17273\u0012>\n\bmyRecord\u0018\u0001 \u0003(\u000b2,.splendidCity.com.gzbz.protobuf.MyDrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_17274\"d\n\u001aS2C_ServerDrawRecord_17275\u0012F\n\fserverRecord\u0018\u0001 \u0003(\u000b20.splendidCity.com.gzbz.protobuf.ServerDrawRecordB&\n\u0011com.gzbz.protobufB\u000fSplendidCityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), RankMsg.getDescriptor()});
      internal_static_splendidCity_com_gzbz_protobuf_GameBuilding_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_splendidCity_com_gzbz_protobuf_GameBuilding_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_GameBuilding_descriptor, new String[]{"BuildId", "Lv", "RewardLv"});
      internal_static_splendidCity_com_gzbz_protobuf_GameEvent_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_splendidCity_com_gzbz_protobuf_GameEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_GameEvent_descriptor, new String[]{"EventId", "EventParam"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameMain_17201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameMain_17201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_GameMain_17201_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameMain_17202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameMain_17202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_GameMain_17202_descriptor, new String[]{"Grid", "DiceRecover", "BuyGoldDiceNum", "Building", "Event"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameRollDice_17203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameRollDice_17203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_GameRollDice_17203_descriptor, new String[]{"Type", "Num"});
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameRollDice_17204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameRollDice_17204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_GameRollDice_17204_descriptor, new String[]{"Type", "Num", "Grid", "DiceRecover", "Event", "Building"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameAddRandomDice_17205_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameAddRandomDice_17205_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_GameAddRandomDice_17205_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameAddRandomDice_17206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameAddRandomDice_17206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_GameAddRandomDice_17206_descriptor, new String[]{"DiceRecover"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameGoldDiceBuy_17207_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameGoldDiceBuy_17207_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_GameGoldDiceBuy_17207_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameGoldDiceBuy_17208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameGoldDiceBuy_17208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_GameGoldDiceBuy_17208_descriptor, new String[]{"BuyGoldDiceNum"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameEvent_17209_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameEvent_17209_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_GameEvent_17209_descriptor, new String[]{"Event"});
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameEvent_17210_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameEvent_17210_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_GameEvent_17210_descriptor, new String[]{"Event", "Grid", "Building", "NextEvent"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTask_17211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTask_17211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTask_17211_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTask_17212_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTask_17212_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTask_17212_descriptor, new String[]{"Task"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTaskCommit_17213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTaskCommit_17213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTaskCommit_17213_descriptor, new String[]{"TaskId"});
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskCommit_17214_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskCommit_17214_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskCommit_17214_descriptor, new String[]{"TaskId"});
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskNotify_17216_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskNotify_17216_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskNotify_17216_descriptor, new String[]{"Task"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameBuildingReward_17217_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_GameBuildingReward_17217_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_GameBuildingReward_17217_descriptor, new String[]{"BuildingId", "Lv"});
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameBuildingReward_17218_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_GameBuildingReward_17218_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_GameBuildingReward_17218_descriptor, new String[]{"BuildingId", "Lv"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_FancyReward_17221_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_FancyReward_17221_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_FancyReward_17221_descriptor, new String[]{"ItemIndex"});
      internal_static_splendidCity_com_gzbz_protobuf_S2C_FancyReward_17222_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_FancyReward_17222_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_FancyReward_17222_descriptor, new String[]{"Result", "ItemIndex"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_SmashEgg_17223_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_SmashEgg_17223_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_SmashEgg_17223_descriptor, new String[]{"Num", "Index"});
      internal_static_splendidCity_com_gzbz_protobuf_S2C_SmashEgg_17224_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_SmashEgg_17224_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_SmashEgg_17224_descriptor, new String[]{"Result", "Index", "IsReset", "Indexs", "SeniorNum", "SmashEggNum", "IsHaveFancy", "FancyGroupDrawTimes"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_TakeLuckReward_17227_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_TakeLuckReward_17227_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_TakeLuckReward_17227_descriptor, new String[]{"RewardId"});
      internal_static_splendidCity_com_gzbz_protobuf_S2C_TakeLuckReward_17228_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_TakeLuckReward_17228_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_TakeLuckReward_17228_descriptor, new String[]{"Result", "TakedId"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_OpenEggUi_17229_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_OpenEggUi_17229_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_OpenEggUi_17229_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_OpenEggUi_17230_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_OpenEggUi_17230_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_OpenEggUi_17230_descriptor, new String[]{"FancyId", "SeniorRewards", "SmashEggNum", "TakedLuck", "Eggs", "FancyGroupDrawTimes"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_AddUpTotalInfo_17253_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_AddUpTotalInfo_17253_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_AddUpTotalInfo_17253_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_AddUpTotalInfo_17254_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_AddUpTotalInfo_17254_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_AddUpTotalInfo_17254_descriptor, new String[]{"GotRewards", "StageRecharge"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveAddUpReward_17255_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveAddUpReward_17255_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveAddUpReward_17255_descriptor, new String[]{"RewardId"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_SignTotalInfo_17256_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_SignTotalInfo_17256_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_SignTotalInfo_17256_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_SignTotalInfo_17257_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_SignTotalInfo_17257_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_SignTotalInfo_17257_descriptor, new String[]{"ActivityDay", "SignGotRewards"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_Sign_17258_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_Sign_17258_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_Sign_17258_descriptor, new String[]{"Day"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_ShopAddUpInfo_17259_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_ShopAddUpInfo_17259_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_ShopAddUpInfo_17259_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_ShopAddUpInfo_17260_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_ShopAddUpInfo_17260_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_ShopAddUpInfo_17260_descriptor, new String[]{"DailyRecharge", "GotRewards"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_17261_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_17261_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_17261_descriptor, new String[]{"Id"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_ActivityInfo_17270_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_ActivityInfo_17270_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_ActivityInfo_17270_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_ActivityInfo_17271_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_ActivityInfo_17271_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_ActivityInfo_17271_descriptor, new String[]{"OpenDay", "ActivityDay", "SmashEggStage"});
      internal_static_splendidCity_com_gzbz_protobuf_MyDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_splendidCity_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_MyDrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_splendidCity_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_splendidCity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId", "Stage"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_DrawRecord_17272_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_DrawRecord_17272_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_DrawRecord_17272_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_DrawRecord_17273_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(41);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_DrawRecord_17273_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_DrawRecord_17273_descriptor, new String[]{"MyRecord"});
      internal_static_splendidCity_com_gzbz_protobuf_C2S_ServerDrawRecord_17274_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(42);
      internal_static_splendidCity_com_gzbz_protobuf_C2S_ServerDrawRecord_17274_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_C2S_ServerDrawRecord_17274_descriptor, new String[0]);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_ServerDrawRecord_17275_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(43);
      internal_static_splendidCity_com_gzbz_protobuf_S2C_ServerDrawRecord_17275_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_splendidCity_com_gzbz_protobuf_S2C_ServerDrawRecord_17275_descriptor, new String[]{"ServerRecord"});
      CommonMsg.getDescriptor();
      RankMsg.getDescriptor();
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_GameBuilding_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_GameBuilding_fieldAccessorTable.ensureFieldAccessorsInitialized(GameBuilding.class, Builder.class);
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_GameBuilding_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_GameBuilding_fieldAccessorTable.ensureFieldAccessorsInitialized(GameBuilding.class, Builder.class);
         }

         private Builder() {
            this.rewardLv_ = SplendidCityMsg.GameBuilding.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardLv_ = SplendidCityMsg.GameBuilding.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.GameBuilding.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buildId_ = 0;
            this.bitField0_ &= -2;
            this.lv_ = 0;
            this.bitField0_ &= -3;
            this.rewardLv_ = SplendidCityMsg.GameBuilding.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_GameBuilding_descriptor;
         }

         public GameBuilding getDefaultInstanceForType() {
            return SplendidCityMsg.GameBuilding.getDefaultInstance();
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
            if (other == SplendidCityMsg.GameBuilding.getDefaultInstance()) {
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
               parsedMessage = (GameBuilding)SplendidCityMsg.GameBuilding.PARSER.parsePartialFrom(input, extensionRegistry);
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
               this.rewardLv_ = SplendidCityMsg.GameBuilding.mutableCopy(this.rewardLv_);
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
            this.rewardLv_ = SplendidCityMsg.GameBuilding.emptyIntList();
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_GameEvent_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_GameEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(GameEvent.class, Builder.class);
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_GameEvent_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_GameEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(GameEvent.class, Builder.class);
         }

         private Builder() {
            this.eventParam_ = SplendidCityMsg.GameEvent.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.eventParam_ = SplendidCityMsg.GameEvent.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.GameEvent.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.eventId_ = 0;
            this.bitField0_ &= -2;
            this.eventParam_ = SplendidCityMsg.GameEvent.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_GameEvent_descriptor;
         }

         public GameEvent getDefaultInstanceForType() {
            return SplendidCityMsg.GameEvent.getDefaultInstance();
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
            if (other == SplendidCityMsg.GameEvent.getDefaultInstance()) {
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
               parsedMessage = (GameEvent)SplendidCityMsg.GameEvent.PARSER.parsePartialFrom(input, extensionRegistry);
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
               this.eventParam_ = SplendidCityMsg.GameEvent.mutableCopy(this.eventParam_);
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
            this.eventParam_ = SplendidCityMsg.GameEvent.emptyIntList();
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

   public static final class C2S_GameMain_17201 extends GeneratedMessageV3 implements C2S_GameMain_17201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameMain_17201 DEFAULT_INSTANCE = new C2S_GameMain_17201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameMain_17201> PARSER = new AbstractParser<C2S_GameMain_17201>() {
         public C2S_GameMain_17201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameMain_17201(input, extensionRegistry);
         }
      };

      private C2S_GameMain_17201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameMain_17201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameMain_17201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameMain_17201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameMain_17201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameMain_17201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameMain_17201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameMain_17201)) {
            return super.equals(obj);
         } else {
            C2S_GameMain_17201 other = (C2S_GameMain_17201)obj;
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

      public static C2S_GameMain_17201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameMain_17201)PARSER.parseFrom(data);
      }

      public static C2S_GameMain_17201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameMain_17201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameMain_17201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameMain_17201)PARSER.parseFrom(data);
      }

      public static C2S_GameMain_17201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameMain_17201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameMain_17201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameMain_17201)PARSER.parseFrom(data);
      }

      public static C2S_GameMain_17201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameMain_17201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameMain_17201 parseFrom(InputStream input) throws IOException {
         return (C2S_GameMain_17201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameMain_17201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameMain_17201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameMain_17201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameMain_17201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameMain_17201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameMain_17201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameMain_17201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameMain_17201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameMain_17201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameMain_17201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameMain_17201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameMain_17201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameMain_17201> parser() {
         return PARSER;
      }

      public Parser<C2S_GameMain_17201> getParserForType() {
         return PARSER;
      }

      public C2S_GameMain_17201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameMain_17201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameMain_17201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameMain_17201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameMain_17201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_GameMain_17201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameMain_17201_descriptor;
         }

         public C2S_GameMain_17201 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_GameMain_17201.getDefaultInstance();
         }

         public C2S_GameMain_17201 build() {
            C2S_GameMain_17201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameMain_17201 buildPartial() {
            C2S_GameMain_17201 result = new C2S_GameMain_17201(this);
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
            if (other instanceof C2S_GameMain_17201) {
               return this.mergeFrom((C2S_GameMain_17201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameMain_17201 other) {
            if (other == SplendidCityMsg.C2S_GameMain_17201.getDefaultInstance()) {
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
            C2S_GameMain_17201 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameMain_17201)SplendidCityMsg.C2S_GameMain_17201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameMain_17201)e.getUnfinishedMessage();
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

   public static final class S2C_GameMain_17202 extends GeneratedMessageV3 implements S2C_GameMain_17202OrBuilder {
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
      private static final S2C_GameMain_17202 DEFAULT_INSTANCE = new S2C_GameMain_17202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameMain_17202> PARSER = new AbstractParser<S2C_GameMain_17202>() {
         public S2C_GameMain_17202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameMain_17202(input, extensionRegistry);
         }
      };

      private S2C_GameMain_17202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameMain_17202() {
         this.memoizedIsInitialized = -1;
         this.building_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameMain_17202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameMain_17202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.building_.add(input.readMessage(SplendidCityMsg.GameBuilding.PARSER, extensionRegistry));
                        break;
                     case 42:
                        GameEvent.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.event_.toBuilder();
                        }

                        this.event_ = (GameEvent)input.readMessage(SplendidCityMsg.GameEvent.PARSER, extensionRegistry);
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameMain_17202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameMain_17202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameMain_17202.class, Builder.class);
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
         return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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
         } else if (!(obj instanceof S2C_GameMain_17202)) {
            return super.equals(obj);
         } else {
            S2C_GameMain_17202 other = (S2C_GameMain_17202)obj;
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

      public static S2C_GameMain_17202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameMain_17202)PARSER.parseFrom(data);
      }

      public static S2C_GameMain_17202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameMain_17202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameMain_17202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameMain_17202)PARSER.parseFrom(data);
      }

      public static S2C_GameMain_17202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameMain_17202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameMain_17202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameMain_17202)PARSER.parseFrom(data);
      }

      public static S2C_GameMain_17202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameMain_17202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameMain_17202 parseFrom(InputStream input) throws IOException {
         return (S2C_GameMain_17202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameMain_17202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameMain_17202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameMain_17202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameMain_17202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameMain_17202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameMain_17202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameMain_17202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameMain_17202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameMain_17202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameMain_17202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameMain_17202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameMain_17202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameMain_17202> parser() {
         return PARSER;
      }

      public Parser<S2C_GameMain_17202> getParserForType() {
         return PARSER;
      }

      public S2C_GameMain_17202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameMain_17202OrBuilder {
         private int bitField0_;
         private int grid_;
         private int diceRecover_;
         private int buyGoldDiceNum_;
         private List<GameBuilding> building_;
         private RepeatedFieldBuilderV3<GameBuilding, GameBuilding.Builder, GameBuildingOrBuilder> buildingBuilder_;
         private GameEvent event_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> eventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameMain_17202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameMain_17202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameMain_17202.class, Builder.class);
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
            if (SplendidCityMsg.S2C_GameMain_17202.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameMain_17202_descriptor;
         }

         public S2C_GameMain_17202 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_GameMain_17202.getDefaultInstance();
         }

         public S2C_GameMain_17202 build() {
            S2C_GameMain_17202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameMain_17202 buildPartial() {
            S2C_GameMain_17202 result = new S2C_GameMain_17202(this);
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
            if (other instanceof S2C_GameMain_17202) {
               return this.mergeFrom((S2C_GameMain_17202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameMain_17202 other) {
            if (other == SplendidCityMsg.S2C_GameMain_17202.getDefaultInstance()) {
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
                     this.buildingBuilder_ = SplendidCityMsg.S2C_GameMain_17202.alwaysUseFieldBuilders ? this.getBuildingFieldBuilder() : null;
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
            S2C_GameMain_17202 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameMain_17202)SplendidCityMsg.S2C_GameMain_17202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameMain_17202)e.getUnfinishedMessage();
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
            return (GameBuilding.Builder)this.getBuildingFieldBuilder().addBuilder(SplendidCityMsg.GameBuilding.getDefaultInstance());
         }

         public GameBuilding.Builder addBuildingBuilder(int index) {
            return (GameBuilding.Builder)this.getBuildingFieldBuilder().addBuilder(index, SplendidCityMsg.GameBuilding.getDefaultInstance());
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
               return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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
               if ((this.bitField0_ & 16) != 0 && this.event_ != null && this.event_ != SplendidCityMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = SplendidCityMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
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
               return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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

   public static final class C2S_GameRollDice_17203 extends GeneratedMessageV3 implements C2S_GameRollDice_17203OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_GameRollDice_17203 DEFAULT_INSTANCE = new C2S_GameRollDice_17203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameRollDice_17203> PARSER = new AbstractParser<C2S_GameRollDice_17203>() {
         public C2S_GameRollDice_17203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameRollDice_17203(input, extensionRegistry);
         }
      };

      private C2S_GameRollDice_17203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameRollDice_17203() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameRollDice_17203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameRollDice_17203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameRollDice_17203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameRollDice_17203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameRollDice_17203.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameRollDice_17203)) {
            return super.equals(obj);
         } else {
            C2S_GameRollDice_17203 other = (C2S_GameRollDice_17203)obj;
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

      public static C2S_GameRollDice_17203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_17203)PARSER.parseFrom(data);
      }

      public static C2S_GameRollDice_17203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_17203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameRollDice_17203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_17203)PARSER.parseFrom(data);
      }

      public static C2S_GameRollDice_17203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_17203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameRollDice_17203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_17203)PARSER.parseFrom(data);
      }

      public static C2S_GameRollDice_17203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_17203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameRollDice_17203 parseFrom(InputStream input) throws IOException {
         return (C2S_GameRollDice_17203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameRollDice_17203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameRollDice_17203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameRollDice_17203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameRollDice_17203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameRollDice_17203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameRollDice_17203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameRollDice_17203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameRollDice_17203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameRollDice_17203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameRollDice_17203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameRollDice_17203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameRollDice_17203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameRollDice_17203> parser() {
         return PARSER;
      }

      public Parser<C2S_GameRollDice_17203> getParserForType() {
         return PARSER;
      }

      public C2S_GameRollDice_17203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameRollDice_17203OrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameRollDice_17203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameRollDice_17203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameRollDice_17203.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_GameRollDice_17203.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameRollDice_17203_descriptor;
         }

         public C2S_GameRollDice_17203 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_GameRollDice_17203.getDefaultInstance();
         }

         public C2S_GameRollDice_17203 build() {
            C2S_GameRollDice_17203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameRollDice_17203 buildPartial() {
            C2S_GameRollDice_17203 result = new C2S_GameRollDice_17203(this);
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
            if (other instanceof C2S_GameRollDice_17203) {
               return this.mergeFrom((C2S_GameRollDice_17203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameRollDice_17203 other) {
            if (other == SplendidCityMsg.C2S_GameRollDice_17203.getDefaultInstance()) {
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
            C2S_GameRollDice_17203 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameRollDice_17203)SplendidCityMsg.C2S_GameRollDice_17203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameRollDice_17203)e.getUnfinishedMessage();
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

   public static final class S2C_GameRollDice_17204 extends GeneratedMessageV3 implements S2C_GameRollDice_17204OrBuilder {
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
      private static final S2C_GameRollDice_17204 DEFAULT_INSTANCE = new S2C_GameRollDice_17204();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameRollDice_17204> PARSER = new AbstractParser<S2C_GameRollDice_17204>() {
         public S2C_GameRollDice_17204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameRollDice_17204(input, extensionRegistry);
         }
      };

      private S2C_GameRollDice_17204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameRollDice_17204() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameRollDice_17204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameRollDice_17204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.event_ = (GameEvent)input.readMessage(SplendidCityMsg.GameEvent.PARSER, extensionRegistry);
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

                        this.building_ = (GameBuilding)input.readMessage(SplendidCityMsg.GameBuilding.PARSER, extensionRegistry);
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameRollDice_17204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameRollDice_17204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameRollDice_17204.class, Builder.class);
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
         return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public boolean hasBuilding() {
         return (this.bitField0_ & 32) != 0;
      }

      public GameBuilding getBuilding() {
         return this.building_ == null ? SplendidCityMsg.GameBuilding.getDefaultInstance() : this.building_;
      }

      public GameBuildingOrBuilder getBuildingOrBuilder() {
         return this.building_ == null ? SplendidCityMsg.GameBuilding.getDefaultInstance() : this.building_;
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
         } else if (!(obj instanceof S2C_GameRollDice_17204)) {
            return super.equals(obj);
         } else {
            S2C_GameRollDice_17204 other = (S2C_GameRollDice_17204)obj;
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

      public static S2C_GameRollDice_17204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_17204)PARSER.parseFrom(data);
      }

      public static S2C_GameRollDice_17204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_17204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameRollDice_17204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_17204)PARSER.parseFrom(data);
      }

      public static S2C_GameRollDice_17204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_17204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameRollDice_17204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_17204)PARSER.parseFrom(data);
      }

      public static S2C_GameRollDice_17204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_17204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameRollDice_17204 parseFrom(InputStream input) throws IOException {
         return (S2C_GameRollDice_17204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameRollDice_17204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameRollDice_17204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameRollDice_17204 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameRollDice_17204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameRollDice_17204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameRollDice_17204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameRollDice_17204 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameRollDice_17204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameRollDice_17204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameRollDice_17204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameRollDice_17204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameRollDice_17204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameRollDice_17204> parser() {
         return PARSER;
      }

      public Parser<S2C_GameRollDice_17204> getParserForType() {
         return PARSER;
      }

      public S2C_GameRollDice_17204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameRollDice_17204OrBuilder {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameRollDice_17204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameRollDice_17204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameRollDice_17204.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_GameRollDice_17204.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameRollDice_17204_descriptor;
         }

         public S2C_GameRollDice_17204 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_GameRollDice_17204.getDefaultInstance();
         }

         public S2C_GameRollDice_17204 build() {
            S2C_GameRollDice_17204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameRollDice_17204 buildPartial() {
            S2C_GameRollDice_17204 result = new S2C_GameRollDice_17204(this);
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
            if (other instanceof S2C_GameRollDice_17204) {
               return this.mergeFrom((S2C_GameRollDice_17204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameRollDice_17204 other) {
            if (other == SplendidCityMsg.S2C_GameRollDice_17204.getDefaultInstance()) {
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
            S2C_GameRollDice_17204 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameRollDice_17204)SplendidCityMsg.S2C_GameRollDice_17204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameRollDice_17204)e.getUnfinishedMessage();
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
               return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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
               if ((this.bitField0_ & 16) != 0 && this.event_ != null && this.event_ != SplendidCityMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = SplendidCityMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
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
               return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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
               return this.building_ == null ? SplendidCityMsg.GameBuilding.getDefaultInstance() : this.building_;
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
               if ((this.bitField0_ & 32) != 0 && this.building_ != null && this.building_ != SplendidCityMsg.GameBuilding.getDefaultInstance()) {
                  this.building_ = SplendidCityMsg.GameBuilding.newBuilder(this.building_).mergeFrom(value).buildPartial();
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
               return this.building_ == null ? SplendidCityMsg.GameBuilding.getDefaultInstance() : this.building_;
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

   public static final class C2S_GameAddRandomDice_17205 extends GeneratedMessageV3 implements C2S_GameAddRandomDice_17205OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameAddRandomDice_17205 DEFAULT_INSTANCE = new C2S_GameAddRandomDice_17205();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameAddRandomDice_17205> PARSER = new AbstractParser<C2S_GameAddRandomDice_17205>() {
         public C2S_GameAddRandomDice_17205 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameAddRandomDice_17205(input, extensionRegistry);
         }
      };

      private C2S_GameAddRandomDice_17205(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameAddRandomDice_17205() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameAddRandomDice_17205();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameAddRandomDice_17205(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameAddRandomDice_17205_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameAddRandomDice_17205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameAddRandomDice_17205.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameAddRandomDice_17205)) {
            return super.equals(obj);
         } else {
            C2S_GameAddRandomDice_17205 other = (C2S_GameAddRandomDice_17205)obj;
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

      public static C2S_GameAddRandomDice_17205 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_17205)PARSER.parseFrom(data);
      }

      public static C2S_GameAddRandomDice_17205 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_17205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_17205 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_17205)PARSER.parseFrom(data);
      }

      public static C2S_GameAddRandomDice_17205 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_17205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_17205 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_17205)PARSER.parseFrom(data);
      }

      public static C2S_GameAddRandomDice_17205 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_17205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_17205 parseFrom(InputStream input) throws IOException {
         return (C2S_GameAddRandomDice_17205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameAddRandomDice_17205 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameAddRandomDice_17205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_17205 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameAddRandomDice_17205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameAddRandomDice_17205 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameAddRandomDice_17205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_17205 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameAddRandomDice_17205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameAddRandomDice_17205 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameAddRandomDice_17205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameAddRandomDice_17205 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameAddRandomDice_17205 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameAddRandomDice_17205> parser() {
         return PARSER;
      }

      public Parser<C2S_GameAddRandomDice_17205> getParserForType() {
         return PARSER;
      }

      public C2S_GameAddRandomDice_17205 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameAddRandomDice_17205OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameAddRandomDice_17205_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameAddRandomDice_17205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameAddRandomDice_17205.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_GameAddRandomDice_17205.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameAddRandomDice_17205_descriptor;
         }

         public C2S_GameAddRandomDice_17205 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_GameAddRandomDice_17205.getDefaultInstance();
         }

         public C2S_GameAddRandomDice_17205 build() {
            C2S_GameAddRandomDice_17205 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameAddRandomDice_17205 buildPartial() {
            C2S_GameAddRandomDice_17205 result = new C2S_GameAddRandomDice_17205(this);
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
            if (other instanceof C2S_GameAddRandomDice_17205) {
               return this.mergeFrom((C2S_GameAddRandomDice_17205)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameAddRandomDice_17205 other) {
            if (other == SplendidCityMsg.C2S_GameAddRandomDice_17205.getDefaultInstance()) {
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
            C2S_GameAddRandomDice_17205 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameAddRandomDice_17205)SplendidCityMsg.C2S_GameAddRandomDice_17205.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameAddRandomDice_17205)e.getUnfinishedMessage();
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

   public static final class S2C_GameAddRandomDice_17206 extends GeneratedMessageV3 implements S2C_GameAddRandomDice_17206OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DICERECOVER_FIELD_NUMBER = 1;
      private int diceRecover_;
      private byte memoizedIsInitialized;
      private static final S2C_GameAddRandomDice_17206 DEFAULT_INSTANCE = new S2C_GameAddRandomDice_17206();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameAddRandomDice_17206> PARSER = new AbstractParser<S2C_GameAddRandomDice_17206>() {
         public S2C_GameAddRandomDice_17206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameAddRandomDice_17206(input, extensionRegistry);
         }
      };

      private S2C_GameAddRandomDice_17206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameAddRandomDice_17206() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameAddRandomDice_17206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameAddRandomDice_17206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameAddRandomDice_17206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameAddRandomDice_17206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameAddRandomDice_17206.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameAddRandomDice_17206)) {
            return super.equals(obj);
         } else {
            S2C_GameAddRandomDice_17206 other = (S2C_GameAddRandomDice_17206)obj;
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

      public static S2C_GameAddRandomDice_17206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_17206)PARSER.parseFrom(data);
      }

      public static S2C_GameAddRandomDice_17206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_17206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_17206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_17206)PARSER.parseFrom(data);
      }

      public static S2C_GameAddRandomDice_17206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_17206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_17206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_17206)PARSER.parseFrom(data);
      }

      public static S2C_GameAddRandomDice_17206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_17206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_17206 parseFrom(InputStream input) throws IOException {
         return (S2C_GameAddRandomDice_17206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameAddRandomDice_17206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameAddRandomDice_17206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_17206 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameAddRandomDice_17206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameAddRandomDice_17206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameAddRandomDice_17206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_17206 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameAddRandomDice_17206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameAddRandomDice_17206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameAddRandomDice_17206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameAddRandomDice_17206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameAddRandomDice_17206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameAddRandomDice_17206> parser() {
         return PARSER;
      }

      public Parser<S2C_GameAddRandomDice_17206> getParserForType() {
         return PARSER;
      }

      public S2C_GameAddRandomDice_17206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameAddRandomDice_17206OrBuilder {
         private int bitField0_;
         private int diceRecover_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameAddRandomDice_17206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameAddRandomDice_17206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameAddRandomDice_17206.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_GameAddRandomDice_17206.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.diceRecover_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameAddRandomDice_17206_descriptor;
         }

         public S2C_GameAddRandomDice_17206 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_GameAddRandomDice_17206.getDefaultInstance();
         }

         public S2C_GameAddRandomDice_17206 build() {
            S2C_GameAddRandomDice_17206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameAddRandomDice_17206 buildPartial() {
            S2C_GameAddRandomDice_17206 result = new S2C_GameAddRandomDice_17206(this);
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
            if (other instanceof S2C_GameAddRandomDice_17206) {
               return this.mergeFrom((S2C_GameAddRandomDice_17206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameAddRandomDice_17206 other) {
            if (other == SplendidCityMsg.S2C_GameAddRandomDice_17206.getDefaultInstance()) {
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
            S2C_GameAddRandomDice_17206 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameAddRandomDice_17206)SplendidCityMsg.S2C_GameAddRandomDice_17206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameAddRandomDice_17206)e.getUnfinishedMessage();
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

   public static final class C2S_GameGoldDiceBuy_17207 extends GeneratedMessageV3 implements C2S_GameGoldDiceBuy_17207OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameGoldDiceBuy_17207 DEFAULT_INSTANCE = new C2S_GameGoldDiceBuy_17207();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameGoldDiceBuy_17207> PARSER = new AbstractParser<C2S_GameGoldDiceBuy_17207>() {
         public C2S_GameGoldDiceBuy_17207 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameGoldDiceBuy_17207(input, extensionRegistry);
         }
      };

      private C2S_GameGoldDiceBuy_17207(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameGoldDiceBuy_17207() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameGoldDiceBuy_17207();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameGoldDiceBuy_17207(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameGoldDiceBuy_17207_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameGoldDiceBuy_17207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameGoldDiceBuy_17207.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameGoldDiceBuy_17207)) {
            return super.equals(obj);
         } else {
            C2S_GameGoldDiceBuy_17207 other = (C2S_GameGoldDiceBuy_17207)obj;
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

      public static C2S_GameGoldDiceBuy_17207 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_17207)PARSER.parseFrom(data);
      }

      public static C2S_GameGoldDiceBuy_17207 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_17207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_17207 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_17207)PARSER.parseFrom(data);
      }

      public static C2S_GameGoldDiceBuy_17207 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_17207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_17207 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_17207)PARSER.parseFrom(data);
      }

      public static C2S_GameGoldDiceBuy_17207 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_17207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_17207 parseFrom(InputStream input) throws IOException {
         return (C2S_GameGoldDiceBuy_17207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameGoldDiceBuy_17207 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameGoldDiceBuy_17207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_17207 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameGoldDiceBuy_17207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameGoldDiceBuy_17207 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameGoldDiceBuy_17207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_17207 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameGoldDiceBuy_17207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameGoldDiceBuy_17207 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameGoldDiceBuy_17207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameGoldDiceBuy_17207 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameGoldDiceBuy_17207 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameGoldDiceBuy_17207> parser() {
         return PARSER;
      }

      public Parser<C2S_GameGoldDiceBuy_17207> getParserForType() {
         return PARSER;
      }

      public C2S_GameGoldDiceBuy_17207 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameGoldDiceBuy_17207OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameGoldDiceBuy_17207_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameGoldDiceBuy_17207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameGoldDiceBuy_17207.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_GameGoldDiceBuy_17207.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameGoldDiceBuy_17207_descriptor;
         }

         public C2S_GameGoldDiceBuy_17207 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_GameGoldDiceBuy_17207.getDefaultInstance();
         }

         public C2S_GameGoldDiceBuy_17207 build() {
            C2S_GameGoldDiceBuy_17207 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameGoldDiceBuy_17207 buildPartial() {
            C2S_GameGoldDiceBuy_17207 result = new C2S_GameGoldDiceBuy_17207(this);
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
            if (other instanceof C2S_GameGoldDiceBuy_17207) {
               return this.mergeFrom((C2S_GameGoldDiceBuy_17207)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameGoldDiceBuy_17207 other) {
            if (other == SplendidCityMsg.C2S_GameGoldDiceBuy_17207.getDefaultInstance()) {
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
            C2S_GameGoldDiceBuy_17207 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameGoldDiceBuy_17207)SplendidCityMsg.C2S_GameGoldDiceBuy_17207.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameGoldDiceBuy_17207)e.getUnfinishedMessage();
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

   public static final class S2C_GameGoldDiceBuy_17208 extends GeneratedMessageV3 implements S2C_GameGoldDiceBuy_17208OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYGOLDDICENUM_FIELD_NUMBER = 1;
      private int buyGoldDiceNum_;
      private byte memoizedIsInitialized;
      private static final S2C_GameGoldDiceBuy_17208 DEFAULT_INSTANCE = new S2C_GameGoldDiceBuy_17208();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameGoldDiceBuy_17208> PARSER = new AbstractParser<S2C_GameGoldDiceBuy_17208>() {
         public S2C_GameGoldDiceBuy_17208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameGoldDiceBuy_17208(input, extensionRegistry);
         }
      };

      private S2C_GameGoldDiceBuy_17208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameGoldDiceBuy_17208() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameGoldDiceBuy_17208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameGoldDiceBuy_17208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameGoldDiceBuy_17208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameGoldDiceBuy_17208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameGoldDiceBuy_17208.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameGoldDiceBuy_17208)) {
            return super.equals(obj);
         } else {
            S2C_GameGoldDiceBuy_17208 other = (S2C_GameGoldDiceBuy_17208)obj;
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

      public static S2C_GameGoldDiceBuy_17208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_17208)PARSER.parseFrom(data);
      }

      public static S2C_GameGoldDiceBuy_17208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_17208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_17208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_17208)PARSER.parseFrom(data);
      }

      public static S2C_GameGoldDiceBuy_17208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_17208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_17208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_17208)PARSER.parseFrom(data);
      }

      public static S2C_GameGoldDiceBuy_17208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_17208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_17208 parseFrom(InputStream input) throws IOException {
         return (S2C_GameGoldDiceBuy_17208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameGoldDiceBuy_17208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameGoldDiceBuy_17208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_17208 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameGoldDiceBuy_17208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameGoldDiceBuy_17208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameGoldDiceBuy_17208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_17208 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameGoldDiceBuy_17208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameGoldDiceBuy_17208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameGoldDiceBuy_17208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameGoldDiceBuy_17208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameGoldDiceBuy_17208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameGoldDiceBuy_17208> parser() {
         return PARSER;
      }

      public Parser<S2C_GameGoldDiceBuy_17208> getParserForType() {
         return PARSER;
      }

      public S2C_GameGoldDiceBuy_17208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameGoldDiceBuy_17208OrBuilder {
         private int bitField0_;
         private int buyGoldDiceNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameGoldDiceBuy_17208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameGoldDiceBuy_17208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameGoldDiceBuy_17208.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_GameGoldDiceBuy_17208.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyGoldDiceNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameGoldDiceBuy_17208_descriptor;
         }

         public S2C_GameGoldDiceBuy_17208 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_GameGoldDiceBuy_17208.getDefaultInstance();
         }

         public S2C_GameGoldDiceBuy_17208 build() {
            S2C_GameGoldDiceBuy_17208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameGoldDiceBuy_17208 buildPartial() {
            S2C_GameGoldDiceBuy_17208 result = new S2C_GameGoldDiceBuy_17208(this);
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
            if (other instanceof S2C_GameGoldDiceBuy_17208) {
               return this.mergeFrom((S2C_GameGoldDiceBuy_17208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameGoldDiceBuy_17208 other) {
            if (other == SplendidCityMsg.S2C_GameGoldDiceBuy_17208.getDefaultInstance()) {
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
            S2C_GameGoldDiceBuy_17208 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameGoldDiceBuy_17208)SplendidCityMsg.S2C_GameGoldDiceBuy_17208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameGoldDiceBuy_17208)e.getUnfinishedMessage();
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

   public static final class C2S_GameEvent_17209 extends GeneratedMessageV3 implements C2S_GameEvent_17209OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENT_FIELD_NUMBER = 1;
      private GameEvent event_;
      private byte memoizedIsInitialized;
      private static final C2S_GameEvent_17209 DEFAULT_INSTANCE = new C2S_GameEvent_17209();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameEvent_17209> PARSER = new AbstractParser<C2S_GameEvent_17209>() {
         public C2S_GameEvent_17209 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameEvent_17209(input, extensionRegistry);
         }
      };

      private C2S_GameEvent_17209(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameEvent_17209() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameEvent_17209();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameEvent_17209(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.event_ = (GameEvent)input.readMessage(SplendidCityMsg.GameEvent.PARSER, extensionRegistry);
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameEvent_17209_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameEvent_17209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameEvent_17209.class, Builder.class);
      }

      public boolean hasEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public GameEvent getEvent() {
         return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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
         } else if (!(obj instanceof C2S_GameEvent_17209)) {
            return super.equals(obj);
         } else {
            C2S_GameEvent_17209 other = (C2S_GameEvent_17209)obj;
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

      public static C2S_GameEvent_17209 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_17209)PARSER.parseFrom(data);
      }

      public static C2S_GameEvent_17209 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_17209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameEvent_17209 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_17209)PARSER.parseFrom(data);
      }

      public static C2S_GameEvent_17209 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_17209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameEvent_17209 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_17209)PARSER.parseFrom(data);
      }

      public static C2S_GameEvent_17209 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_17209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameEvent_17209 parseFrom(InputStream input) throws IOException {
         return (C2S_GameEvent_17209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameEvent_17209 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameEvent_17209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameEvent_17209 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameEvent_17209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameEvent_17209 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameEvent_17209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameEvent_17209 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameEvent_17209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameEvent_17209 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameEvent_17209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameEvent_17209 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameEvent_17209 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameEvent_17209> parser() {
         return PARSER;
      }

      public Parser<C2S_GameEvent_17209> getParserForType() {
         return PARSER;
      }

      public C2S_GameEvent_17209 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameEvent_17209OrBuilder {
         private int bitField0_;
         private GameEvent event_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> eventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameEvent_17209_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameEvent_17209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameEvent_17209.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_GameEvent_17209.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameEvent_17209_descriptor;
         }

         public C2S_GameEvent_17209 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_GameEvent_17209.getDefaultInstance();
         }

         public C2S_GameEvent_17209 build() {
            C2S_GameEvent_17209 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameEvent_17209 buildPartial() {
            C2S_GameEvent_17209 result = new C2S_GameEvent_17209(this);
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
            if (other instanceof C2S_GameEvent_17209) {
               return this.mergeFrom((C2S_GameEvent_17209)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameEvent_17209 other) {
            if (other == SplendidCityMsg.C2S_GameEvent_17209.getDefaultInstance()) {
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
            C2S_GameEvent_17209 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameEvent_17209)SplendidCityMsg.C2S_GameEvent_17209.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameEvent_17209)e.getUnfinishedMessage();
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
               return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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
               if ((this.bitField0_ & 1) != 0 && this.event_ != null && this.event_ != SplendidCityMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = SplendidCityMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
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
               return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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

   public static final class S2C_GameEvent_17210 extends GeneratedMessageV3 implements S2C_GameEvent_17210OrBuilder {
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
      private static final S2C_GameEvent_17210 DEFAULT_INSTANCE = new S2C_GameEvent_17210();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameEvent_17210> PARSER = new AbstractParser<S2C_GameEvent_17210>() {
         public S2C_GameEvent_17210 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameEvent_17210(input, extensionRegistry);
         }
      };

      private S2C_GameEvent_17210(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameEvent_17210() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameEvent_17210();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameEvent_17210(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.event_ = (GameEvent)input.readMessage(SplendidCityMsg.GameEvent.PARSER, extensionRegistry);
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

                        this.building_ = (GameBuilding)input.readMessage(SplendidCityMsg.GameBuilding.PARSER, extensionRegistry);
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

                        this.nextEvent_ = (GameEvent)input.readMessage(SplendidCityMsg.GameEvent.PARSER, extensionRegistry);
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameEvent_17210_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameEvent_17210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameEvent_17210.class, Builder.class);
      }

      public boolean hasEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public GameEvent getEvent() {
         return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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
         return this.building_ == null ? SplendidCityMsg.GameBuilding.getDefaultInstance() : this.building_;
      }

      public GameBuildingOrBuilder getBuildingOrBuilder() {
         return this.building_ == null ? SplendidCityMsg.GameBuilding.getDefaultInstance() : this.building_;
      }

      public boolean hasNextEvent() {
         return (this.bitField0_ & 8) != 0;
      }

      public GameEvent getNextEvent() {
         return this.nextEvent_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
      }

      public GameEventOrBuilder getNextEventOrBuilder() {
         return this.nextEvent_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
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
         } else if (!(obj instanceof S2C_GameEvent_17210)) {
            return super.equals(obj);
         } else {
            S2C_GameEvent_17210 other = (S2C_GameEvent_17210)obj;
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

      public static S2C_GameEvent_17210 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_17210)PARSER.parseFrom(data);
      }

      public static S2C_GameEvent_17210 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_17210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameEvent_17210 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_17210)PARSER.parseFrom(data);
      }

      public static S2C_GameEvent_17210 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_17210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameEvent_17210 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_17210)PARSER.parseFrom(data);
      }

      public static S2C_GameEvent_17210 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_17210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameEvent_17210 parseFrom(InputStream input) throws IOException {
         return (S2C_GameEvent_17210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameEvent_17210 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameEvent_17210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameEvent_17210 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameEvent_17210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameEvent_17210 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameEvent_17210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameEvent_17210 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameEvent_17210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameEvent_17210 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameEvent_17210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameEvent_17210 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameEvent_17210 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameEvent_17210> parser() {
         return PARSER;
      }

      public Parser<S2C_GameEvent_17210> getParserForType() {
         return PARSER;
      }

      public S2C_GameEvent_17210 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameEvent_17210OrBuilder {
         private int bitField0_;
         private GameEvent event_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> eventBuilder_;
         private int grid_;
         private GameBuilding building_;
         private SingleFieldBuilderV3<GameBuilding, GameBuilding.Builder, GameBuildingOrBuilder> buildingBuilder_;
         private GameEvent nextEvent_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> nextEventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameEvent_17210_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameEvent_17210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameEvent_17210.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_GameEvent_17210.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameEvent_17210_descriptor;
         }

         public S2C_GameEvent_17210 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_GameEvent_17210.getDefaultInstance();
         }

         public S2C_GameEvent_17210 build() {
            S2C_GameEvent_17210 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameEvent_17210 buildPartial() {
            S2C_GameEvent_17210 result = new S2C_GameEvent_17210(this);
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
            if (other instanceof S2C_GameEvent_17210) {
               return this.mergeFrom((S2C_GameEvent_17210)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameEvent_17210 other) {
            if (other == SplendidCityMsg.S2C_GameEvent_17210.getDefaultInstance()) {
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
            S2C_GameEvent_17210 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameEvent_17210)SplendidCityMsg.S2C_GameEvent_17210.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameEvent_17210)e.getUnfinishedMessage();
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
               return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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
               if ((this.bitField0_ & 1) != 0 && this.event_ != null && this.event_ != SplendidCityMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = SplendidCityMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
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
               return this.event_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.event_;
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
               return this.building_ == null ? SplendidCityMsg.GameBuilding.getDefaultInstance() : this.building_;
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
               if ((this.bitField0_ & 4) != 0 && this.building_ != null && this.building_ != SplendidCityMsg.GameBuilding.getDefaultInstance()) {
                  this.building_ = SplendidCityMsg.GameBuilding.newBuilder(this.building_).mergeFrom(value).buildPartial();
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
               return this.building_ == null ? SplendidCityMsg.GameBuilding.getDefaultInstance() : this.building_;
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
               return this.nextEvent_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
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
               if ((this.bitField0_ & 8) != 0 && this.nextEvent_ != null && this.nextEvent_ != SplendidCityMsg.GameEvent.getDefaultInstance()) {
                  this.nextEvent_ = SplendidCityMsg.GameEvent.newBuilder(this.nextEvent_).mergeFrom(value).buildPartial();
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
               return this.nextEvent_ == null ? SplendidCityMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
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

   public static final class C2S_GameTask_17211 extends GeneratedMessageV3 implements C2S_GameTask_17211OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameTask_17211 DEFAULT_INSTANCE = new C2S_GameTask_17211();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameTask_17211> PARSER = new AbstractParser<C2S_GameTask_17211>() {
         public C2S_GameTask_17211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameTask_17211(input, extensionRegistry);
         }
      };

      private C2S_GameTask_17211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameTask_17211() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameTask_17211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameTask_17211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTask_17211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTask_17211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTask_17211.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameTask_17211)) {
            return super.equals(obj);
         } else {
            C2S_GameTask_17211 other = (C2S_GameTask_17211)obj;
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

      public static C2S_GameTask_17211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameTask_17211)PARSER.parseFrom(data);
      }

      public static C2S_GameTask_17211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTask_17211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTask_17211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameTask_17211)PARSER.parseFrom(data);
      }

      public static C2S_GameTask_17211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTask_17211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTask_17211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameTask_17211)PARSER.parseFrom(data);
      }

      public static C2S_GameTask_17211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTask_17211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTask_17211 parseFrom(InputStream input) throws IOException {
         return (C2S_GameTask_17211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTask_17211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTask_17211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTask_17211 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameTask_17211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameTask_17211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTask_17211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTask_17211 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameTask_17211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTask_17211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTask_17211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameTask_17211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameTask_17211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameTask_17211> parser() {
         return PARSER;
      }

      public Parser<C2S_GameTask_17211> getParserForType() {
         return PARSER;
      }

      public C2S_GameTask_17211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameTask_17211OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTask_17211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTask_17211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTask_17211.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_GameTask_17211.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTask_17211_descriptor;
         }

         public C2S_GameTask_17211 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_GameTask_17211.getDefaultInstance();
         }

         public C2S_GameTask_17211 build() {
            C2S_GameTask_17211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameTask_17211 buildPartial() {
            C2S_GameTask_17211 result = new C2S_GameTask_17211(this);
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
            if (other instanceof C2S_GameTask_17211) {
               return this.mergeFrom((C2S_GameTask_17211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameTask_17211 other) {
            if (other == SplendidCityMsg.C2S_GameTask_17211.getDefaultInstance()) {
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
            C2S_GameTask_17211 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameTask_17211)SplendidCityMsg.C2S_GameTask_17211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameTask_17211)e.getUnfinishedMessage();
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

   public static final class S2C_GameTask_17212 extends GeneratedMessageV3 implements S2C_GameTask_17212OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_GameTask_17212 DEFAULT_INSTANCE = new S2C_GameTask_17212();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameTask_17212> PARSER = new AbstractParser<S2C_GameTask_17212>() {
         public S2C_GameTask_17212 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameTask_17212(input, extensionRegistry);
         }
      };

      private S2C_GameTask_17212(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameTask_17212() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameTask_17212();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameTask_17212(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTask_17212_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTask_17212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTask_17212.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameTask_17212)) {
            return super.equals(obj);
         } else {
            S2C_GameTask_17212 other = (S2C_GameTask_17212)obj;
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

      public static S2C_GameTask_17212 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameTask_17212)PARSER.parseFrom(data);
      }

      public static S2C_GameTask_17212 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTask_17212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTask_17212 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameTask_17212)PARSER.parseFrom(data);
      }

      public static S2C_GameTask_17212 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTask_17212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTask_17212 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameTask_17212)PARSER.parseFrom(data);
      }

      public static S2C_GameTask_17212 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTask_17212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTask_17212 parseFrom(InputStream input) throws IOException {
         return (S2C_GameTask_17212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTask_17212 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTask_17212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTask_17212 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameTask_17212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameTask_17212 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTask_17212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTask_17212 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameTask_17212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTask_17212 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTask_17212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameTask_17212 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameTask_17212 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameTask_17212> parser() {
         return PARSER;
      }

      public Parser<S2C_GameTask_17212> getParserForType() {
         return PARSER;
      }

      public S2C_GameTask_17212 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameTask_17212OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTask_17212_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTask_17212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTask_17212.class, Builder.class);
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
            if (SplendidCityMsg.S2C_GameTask_17212.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTask_17212_descriptor;
         }

         public S2C_GameTask_17212 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_GameTask_17212.getDefaultInstance();
         }

         public S2C_GameTask_17212 build() {
            S2C_GameTask_17212 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameTask_17212 buildPartial() {
            S2C_GameTask_17212 result = new S2C_GameTask_17212(this);
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
            if (other instanceof S2C_GameTask_17212) {
               return this.mergeFrom((S2C_GameTask_17212)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameTask_17212 other) {
            if (other == SplendidCityMsg.S2C_GameTask_17212.getDefaultInstance()) {
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
                     this.taskBuilder_ = SplendidCityMsg.S2C_GameTask_17212.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_GameTask_17212 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameTask_17212)SplendidCityMsg.S2C_GameTask_17212.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameTask_17212)e.getUnfinishedMessage();
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

   public static final class C2S_GameTaskCommit_17213 extends GeneratedMessageV3 implements C2S_GameTaskCommit_17213OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_GameTaskCommit_17213 DEFAULT_INSTANCE = new C2S_GameTaskCommit_17213();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameTaskCommit_17213> PARSER = new AbstractParser<C2S_GameTaskCommit_17213>() {
         public C2S_GameTaskCommit_17213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameTaskCommit_17213(input, extensionRegistry);
         }
      };

      private C2S_GameTaskCommit_17213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameTaskCommit_17213() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameTaskCommit_17213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameTaskCommit_17213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTaskCommit_17213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTaskCommit_17213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTaskCommit_17213.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameTaskCommit_17213)) {
            return super.equals(obj);
         } else {
            C2S_GameTaskCommit_17213 other = (C2S_GameTaskCommit_17213)obj;
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

      public static C2S_GameTaskCommit_17213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_17213)PARSER.parseFrom(data);
      }

      public static C2S_GameTaskCommit_17213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_17213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTaskCommit_17213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_17213)PARSER.parseFrom(data);
      }

      public static C2S_GameTaskCommit_17213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_17213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTaskCommit_17213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_17213)PARSER.parseFrom(data);
      }

      public static C2S_GameTaskCommit_17213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_17213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTaskCommit_17213 parseFrom(InputStream input) throws IOException {
         return (C2S_GameTaskCommit_17213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTaskCommit_17213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTaskCommit_17213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTaskCommit_17213 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameTaskCommit_17213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameTaskCommit_17213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTaskCommit_17213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTaskCommit_17213 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameTaskCommit_17213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTaskCommit_17213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTaskCommit_17213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameTaskCommit_17213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameTaskCommit_17213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameTaskCommit_17213> parser() {
         return PARSER;
      }

      public Parser<C2S_GameTaskCommit_17213> getParserForType() {
         return PARSER;
      }

      public C2S_GameTaskCommit_17213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameTaskCommit_17213OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTaskCommit_17213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTaskCommit_17213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTaskCommit_17213.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_GameTaskCommit_17213.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameTaskCommit_17213_descriptor;
         }

         public C2S_GameTaskCommit_17213 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_GameTaskCommit_17213.getDefaultInstance();
         }

         public C2S_GameTaskCommit_17213 build() {
            C2S_GameTaskCommit_17213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameTaskCommit_17213 buildPartial() {
            C2S_GameTaskCommit_17213 result = new C2S_GameTaskCommit_17213(this);
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
            if (other instanceof C2S_GameTaskCommit_17213) {
               return this.mergeFrom((C2S_GameTaskCommit_17213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameTaskCommit_17213 other) {
            if (other == SplendidCityMsg.C2S_GameTaskCommit_17213.getDefaultInstance()) {
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
            C2S_GameTaskCommit_17213 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameTaskCommit_17213)SplendidCityMsg.C2S_GameTaskCommit_17213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameTaskCommit_17213)e.getUnfinishedMessage();
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

   public static final class S2C_GameTaskCommit_17214 extends GeneratedMessageV3 implements S2C_GameTaskCommit_17214OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_GameTaskCommit_17214 DEFAULT_INSTANCE = new S2C_GameTaskCommit_17214();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameTaskCommit_17214> PARSER = new AbstractParser<S2C_GameTaskCommit_17214>() {
         public S2C_GameTaskCommit_17214 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameTaskCommit_17214(input, extensionRegistry);
         }
      };

      private S2C_GameTaskCommit_17214(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameTaskCommit_17214() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameTaskCommit_17214();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameTaskCommit_17214(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskCommit_17214_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskCommit_17214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskCommit_17214.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameTaskCommit_17214)) {
            return super.equals(obj);
         } else {
            S2C_GameTaskCommit_17214 other = (S2C_GameTaskCommit_17214)obj;
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

      public static S2C_GameTaskCommit_17214 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_17214)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskCommit_17214 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_17214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskCommit_17214 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_17214)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskCommit_17214 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_17214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskCommit_17214 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_17214)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskCommit_17214 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_17214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskCommit_17214 parseFrom(InputStream input) throws IOException {
         return (S2C_GameTaskCommit_17214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskCommit_17214 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskCommit_17214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskCommit_17214 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameTaskCommit_17214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameTaskCommit_17214 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskCommit_17214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskCommit_17214 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameTaskCommit_17214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskCommit_17214 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskCommit_17214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameTaskCommit_17214 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameTaskCommit_17214 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameTaskCommit_17214> parser() {
         return PARSER;
      }

      public Parser<S2C_GameTaskCommit_17214> getParserForType() {
         return PARSER;
      }

      public S2C_GameTaskCommit_17214 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameTaskCommit_17214OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskCommit_17214_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskCommit_17214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskCommit_17214.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_GameTaskCommit_17214.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskCommit_17214_descriptor;
         }

         public S2C_GameTaskCommit_17214 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_GameTaskCommit_17214.getDefaultInstance();
         }

         public S2C_GameTaskCommit_17214 build() {
            S2C_GameTaskCommit_17214 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameTaskCommit_17214 buildPartial() {
            S2C_GameTaskCommit_17214 result = new S2C_GameTaskCommit_17214(this);
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
            if (other instanceof S2C_GameTaskCommit_17214) {
               return this.mergeFrom((S2C_GameTaskCommit_17214)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameTaskCommit_17214 other) {
            if (other == SplendidCityMsg.S2C_GameTaskCommit_17214.getDefaultInstance()) {
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
            S2C_GameTaskCommit_17214 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameTaskCommit_17214)SplendidCityMsg.S2C_GameTaskCommit_17214.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameTaskCommit_17214)e.getUnfinishedMessage();
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

   public static final class S2C_GameTaskNotify_17216 extends GeneratedMessageV3 implements S2C_GameTaskNotify_17216OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_GameTaskNotify_17216 DEFAULT_INSTANCE = new S2C_GameTaskNotify_17216();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameTaskNotify_17216> PARSER = new AbstractParser<S2C_GameTaskNotify_17216>() {
         public S2C_GameTaskNotify_17216 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameTaskNotify_17216(input, extensionRegistry);
         }
      };

      private S2C_GameTaskNotify_17216(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameTaskNotify_17216() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameTaskNotify_17216();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameTaskNotify_17216(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskNotify_17216_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskNotify_17216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskNotify_17216.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameTaskNotify_17216)) {
            return super.equals(obj);
         } else {
            S2C_GameTaskNotify_17216 other = (S2C_GameTaskNotify_17216)obj;
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

      public static S2C_GameTaskNotify_17216 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_17216)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskNotify_17216 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_17216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskNotify_17216 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_17216)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskNotify_17216 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_17216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskNotify_17216 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_17216)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskNotify_17216 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_17216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskNotify_17216 parseFrom(InputStream input) throws IOException {
         return (S2C_GameTaskNotify_17216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskNotify_17216 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskNotify_17216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskNotify_17216 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameTaskNotify_17216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameTaskNotify_17216 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskNotify_17216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskNotify_17216 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameTaskNotify_17216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskNotify_17216 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskNotify_17216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameTaskNotify_17216 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameTaskNotify_17216 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameTaskNotify_17216> parser() {
         return PARSER;
      }

      public Parser<S2C_GameTaskNotify_17216> getParserForType() {
         return PARSER;
      }

      public S2C_GameTaskNotify_17216 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameTaskNotify_17216OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskNotify_17216_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskNotify_17216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskNotify_17216.class, Builder.class);
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
            if (SplendidCityMsg.S2C_GameTaskNotify_17216.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameTaskNotify_17216_descriptor;
         }

         public S2C_GameTaskNotify_17216 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_GameTaskNotify_17216.getDefaultInstance();
         }

         public S2C_GameTaskNotify_17216 build() {
            S2C_GameTaskNotify_17216 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameTaskNotify_17216 buildPartial() {
            S2C_GameTaskNotify_17216 result = new S2C_GameTaskNotify_17216(this);
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
            if (other instanceof S2C_GameTaskNotify_17216) {
               return this.mergeFrom((S2C_GameTaskNotify_17216)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameTaskNotify_17216 other) {
            if (other == SplendidCityMsg.S2C_GameTaskNotify_17216.getDefaultInstance()) {
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
                     this.taskBuilder_ = SplendidCityMsg.S2C_GameTaskNotify_17216.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_GameTaskNotify_17216 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameTaskNotify_17216)SplendidCityMsg.S2C_GameTaskNotify_17216.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameTaskNotify_17216)e.getUnfinishedMessage();
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

   public static final class C2S_GameBuildingReward_17217 extends GeneratedMessageV3 implements C2S_GameBuildingReward_17217OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUILDINGID_FIELD_NUMBER = 1;
      private int buildingId_;
      public static final int LV_FIELD_NUMBER = 2;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final C2S_GameBuildingReward_17217 DEFAULT_INSTANCE = new C2S_GameBuildingReward_17217();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameBuildingReward_17217> PARSER = new AbstractParser<C2S_GameBuildingReward_17217>() {
         public C2S_GameBuildingReward_17217 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameBuildingReward_17217(input, extensionRegistry);
         }
      };

      private C2S_GameBuildingReward_17217(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameBuildingReward_17217() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameBuildingReward_17217();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameBuildingReward_17217(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameBuildingReward_17217_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameBuildingReward_17217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameBuildingReward_17217.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameBuildingReward_17217)) {
            return super.equals(obj);
         } else {
            C2S_GameBuildingReward_17217 other = (C2S_GameBuildingReward_17217)obj;
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

      public static C2S_GameBuildingReward_17217 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_17217)PARSER.parseFrom(data);
      }

      public static C2S_GameBuildingReward_17217 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_17217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameBuildingReward_17217 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_17217)PARSER.parseFrom(data);
      }

      public static C2S_GameBuildingReward_17217 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_17217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameBuildingReward_17217 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_17217)PARSER.parseFrom(data);
      }

      public static C2S_GameBuildingReward_17217 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_17217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameBuildingReward_17217 parseFrom(InputStream input) throws IOException {
         return (C2S_GameBuildingReward_17217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameBuildingReward_17217 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameBuildingReward_17217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameBuildingReward_17217 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameBuildingReward_17217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameBuildingReward_17217 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameBuildingReward_17217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameBuildingReward_17217 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameBuildingReward_17217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameBuildingReward_17217 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameBuildingReward_17217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameBuildingReward_17217 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameBuildingReward_17217 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameBuildingReward_17217> parser() {
         return PARSER;
      }

      public Parser<C2S_GameBuildingReward_17217> getParserForType() {
         return PARSER;
      }

      public C2S_GameBuildingReward_17217 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameBuildingReward_17217OrBuilder {
         private int bitField0_;
         private int buildingId_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameBuildingReward_17217_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameBuildingReward_17217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameBuildingReward_17217.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_GameBuildingReward_17217.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_GameBuildingReward_17217_descriptor;
         }

         public C2S_GameBuildingReward_17217 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_GameBuildingReward_17217.getDefaultInstance();
         }

         public C2S_GameBuildingReward_17217 build() {
            C2S_GameBuildingReward_17217 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameBuildingReward_17217 buildPartial() {
            C2S_GameBuildingReward_17217 result = new C2S_GameBuildingReward_17217(this);
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
            if (other instanceof C2S_GameBuildingReward_17217) {
               return this.mergeFrom((C2S_GameBuildingReward_17217)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameBuildingReward_17217 other) {
            if (other == SplendidCityMsg.C2S_GameBuildingReward_17217.getDefaultInstance()) {
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
            C2S_GameBuildingReward_17217 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameBuildingReward_17217)SplendidCityMsg.C2S_GameBuildingReward_17217.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameBuildingReward_17217)e.getUnfinishedMessage();
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

   public static final class S2C_GameBuildingReward_17218 extends GeneratedMessageV3 implements S2C_GameBuildingReward_17218OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUILDINGID_FIELD_NUMBER = 1;
      private int buildingId_;
      public static final int LV_FIELD_NUMBER = 2;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final S2C_GameBuildingReward_17218 DEFAULT_INSTANCE = new S2C_GameBuildingReward_17218();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameBuildingReward_17218> PARSER = new AbstractParser<S2C_GameBuildingReward_17218>() {
         public S2C_GameBuildingReward_17218 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameBuildingReward_17218(input, extensionRegistry);
         }
      };

      private S2C_GameBuildingReward_17218(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameBuildingReward_17218() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameBuildingReward_17218();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameBuildingReward_17218(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameBuildingReward_17218_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameBuildingReward_17218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameBuildingReward_17218.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameBuildingReward_17218)) {
            return super.equals(obj);
         } else {
            S2C_GameBuildingReward_17218 other = (S2C_GameBuildingReward_17218)obj;
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

      public static S2C_GameBuildingReward_17218 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_17218)PARSER.parseFrom(data);
      }

      public static S2C_GameBuildingReward_17218 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_17218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameBuildingReward_17218 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_17218)PARSER.parseFrom(data);
      }

      public static S2C_GameBuildingReward_17218 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_17218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameBuildingReward_17218 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_17218)PARSER.parseFrom(data);
      }

      public static S2C_GameBuildingReward_17218 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_17218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameBuildingReward_17218 parseFrom(InputStream input) throws IOException {
         return (S2C_GameBuildingReward_17218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameBuildingReward_17218 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameBuildingReward_17218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameBuildingReward_17218 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameBuildingReward_17218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameBuildingReward_17218 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameBuildingReward_17218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameBuildingReward_17218 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameBuildingReward_17218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameBuildingReward_17218 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameBuildingReward_17218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameBuildingReward_17218 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameBuildingReward_17218 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameBuildingReward_17218> parser() {
         return PARSER;
      }

      public Parser<S2C_GameBuildingReward_17218> getParserForType() {
         return PARSER;
      }

      public S2C_GameBuildingReward_17218 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameBuildingReward_17218OrBuilder {
         private int bitField0_;
         private int buildingId_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameBuildingReward_17218_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameBuildingReward_17218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameBuildingReward_17218.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_GameBuildingReward_17218.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_GameBuildingReward_17218_descriptor;
         }

         public S2C_GameBuildingReward_17218 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_GameBuildingReward_17218.getDefaultInstance();
         }

         public S2C_GameBuildingReward_17218 build() {
            S2C_GameBuildingReward_17218 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameBuildingReward_17218 buildPartial() {
            S2C_GameBuildingReward_17218 result = new S2C_GameBuildingReward_17218(this);
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
            if (other instanceof S2C_GameBuildingReward_17218) {
               return this.mergeFrom((S2C_GameBuildingReward_17218)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameBuildingReward_17218 other) {
            if (other == SplendidCityMsg.S2C_GameBuildingReward_17218.getDefaultInstance()) {
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
            S2C_GameBuildingReward_17218 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameBuildingReward_17218)SplendidCityMsg.S2C_GameBuildingReward_17218.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameBuildingReward_17218)e.getUnfinishedMessage();
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

   public static final class C2S_FancyReward_17221 extends GeneratedMessageV3 implements C2S_FancyReward_17221OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMINDEX_FIELD_NUMBER = 1;
      private int itemIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_17221 DEFAULT_INSTANCE = new C2S_FancyReward_17221();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_17221> PARSER = new AbstractParser<C2S_FancyReward_17221>() {
         public C2S_FancyReward_17221 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_17221(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_17221(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_17221() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_17221();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_17221(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemIndex_ = input.readInt32();
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_FancyReward_17221_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_FancyReward_17221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_17221.class, Builder.class);
      }

      public boolean hasItemIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemIndex() {
         return this.itemIndex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemIndex_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FancyReward_17221)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_17221 other = (C2S_FancyReward_17221)obj;
            if (this.hasItemIndex() != other.hasItemIndex()) {
               return false;
            } else if (this.hasItemIndex() && this.getItemIndex() != other.getItemIndex()) {
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
            if (this.hasItemIndex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FancyReward_17221 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17221)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_17221 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_17221 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17221)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_17221 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_17221 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17221)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_17221 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_17221 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_17221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_17221 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_17221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_17221 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_17221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_17221 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_17221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_17221 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_17221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_17221 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_17221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_17221 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_17221 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_17221> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_17221> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_17221 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_17221OrBuilder {
         private int bitField0_;
         private int itemIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_FancyReward_17221_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_FancyReward_17221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_17221.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_FancyReward_17221.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemIndex_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_FancyReward_17221_descriptor;
         }

         public C2S_FancyReward_17221 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_FancyReward_17221.getDefaultInstance();
         }

         public C2S_FancyReward_17221 build() {
            C2S_FancyReward_17221 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_17221 buildPartial() {
            C2S_FancyReward_17221 result = new C2S_FancyReward_17221(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemIndex_ = this.itemIndex_;
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
            if (other instanceof C2S_FancyReward_17221) {
               return this.mergeFrom((C2S_FancyReward_17221)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_17221 other) {
            if (other == SplendidCityMsg.C2S_FancyReward_17221.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemIndex()) {
                  this.setItemIndex(other.getItemIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasItemIndex();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FancyReward_17221 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_17221)SplendidCityMsg.C2S_FancyReward_17221.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_17221)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemIndex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemIndex() {
            return this.itemIndex_;
         }

         public Builder setItemIndex(int value) {
            this.bitField0_ |= 1;
            this.itemIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemIndex() {
            this.bitField0_ &= -2;
            this.itemIndex_ = 0;
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

   public static final class S2C_FancyReward_17222 extends GeneratedMessageV3 implements S2C_FancyReward_17222OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ITEMINDEX_FIELD_NUMBER = 2;
      private int itemIndex_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_17222 DEFAULT_INSTANCE = new S2C_FancyReward_17222();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_17222> PARSER = new AbstractParser<S2C_FancyReward_17222>() {
         public S2C_FancyReward_17222 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_17222(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_17222(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_17222() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_17222();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_17222(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemIndex_ = input.readInt32();
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_FancyReward_17222_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_FancyReward_17222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_17222.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasItemIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemIndex() {
         return this.itemIndex_;
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
         } else if (!this.hasItemIndex()) {
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
            output.writeInt32(2, this.itemIndex_);
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
               size += CodedOutputStream.computeInt32Size(2, this.itemIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FancyReward_17222)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_17222 other = (S2C_FancyReward_17222)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasItemIndex() != other.hasItemIndex()) {
               return false;
            } else if (this.hasItemIndex() && this.getItemIndex() != other.getItemIndex()) {
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

            if (this.hasItemIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FancyReward_17222 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17222)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_17222 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_17222 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17222)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_17222 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_17222 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17222)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_17222 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_17222 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_17222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_17222 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_17222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_17222 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_17222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_17222 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_17222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_17222 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_17222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_17222 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_17222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_17222 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_17222 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_17222> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_17222> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_17222 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_17222OrBuilder {
         private int bitField0_;
         private int result_;
         private int itemIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_FancyReward_17222_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_FancyReward_17222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_17222.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_FancyReward_17222.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.itemIndex_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_FancyReward_17222_descriptor;
         }

         public S2C_FancyReward_17222 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_FancyReward_17222.getDefaultInstance();
         }

         public S2C_FancyReward_17222 build() {
            S2C_FancyReward_17222 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_17222 buildPartial() {
            S2C_FancyReward_17222 result = new S2C_FancyReward_17222(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemIndex_ = this.itemIndex_;
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
            if (other instanceof S2C_FancyReward_17222) {
               return this.mergeFrom((S2C_FancyReward_17222)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_17222 other) {
            if (other == SplendidCityMsg.S2C_FancyReward_17222.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasItemIndex()) {
                  this.setItemIndex(other.getItemIndex());
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
               return this.hasItemIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FancyReward_17222 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_17222)SplendidCityMsg.S2C_FancyReward_17222.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_17222)e.getUnfinishedMessage();
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

         public boolean hasItemIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemIndex() {
            return this.itemIndex_;
         }

         public Builder setItemIndex(int value) {
            this.bitField0_ |= 2;
            this.itemIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemIndex() {
            this.bitField0_ &= -3;
            this.itemIndex_ = 0;
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

   public static final class C2S_SmashEgg_17223 extends GeneratedMessageV3 implements C2S_SmashEgg_17223OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      public static final int INDEX_FIELD_NUMBER = 2;
      private int index_;
      private byte memoizedIsInitialized;
      private static final C2S_SmashEgg_17223 DEFAULT_INSTANCE = new C2S_SmashEgg_17223();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SmashEgg_17223> PARSER = new AbstractParser<C2S_SmashEgg_17223>() {
         public C2S_SmashEgg_17223 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SmashEgg_17223(input, extensionRegistry);
         }
      };

      private C2S_SmashEgg_17223(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SmashEgg_17223() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SmashEgg_17223();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SmashEgg_17223(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.num_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_SmashEgg_17223_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_SmashEgg_17223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SmashEgg_17223.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasIndex() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.num_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.index_);
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
               size += CodedOutputStream.computeInt32Size(1, this.num_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.index_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SmashEgg_17223)) {
            return super.equals(obj);
         } else {
            C2S_SmashEgg_17223 other = (C2S_SmashEgg_17223)obj;
            if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasIndex() != other.hasIndex()) {
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
            if (this.hasNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SmashEgg_17223 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17223)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_17223 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_17223 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17223)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_17223 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_17223 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17223)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_17223 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_17223 parseFrom(InputStream input) throws IOException {
         return (C2S_SmashEgg_17223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_17223 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_17223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SmashEgg_17223 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SmashEgg_17223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_17223 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_17223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SmashEgg_17223 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SmashEgg_17223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_17223 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_17223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SmashEgg_17223 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SmashEgg_17223 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SmashEgg_17223> parser() {
         return PARSER;
      }

      public Parser<C2S_SmashEgg_17223> getParserForType() {
         return PARSER;
      }

      public C2S_SmashEgg_17223 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SmashEgg_17223OrBuilder {
         private int bitField0_;
         private int num_;
         private int index_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_SmashEgg_17223_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_SmashEgg_17223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SmashEgg_17223.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_SmashEgg_17223.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            this.index_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_SmashEgg_17223_descriptor;
         }

         public C2S_SmashEgg_17223 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_SmashEgg_17223.getDefaultInstance();
         }

         public C2S_SmashEgg_17223 build() {
            C2S_SmashEgg_17223 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SmashEgg_17223 buildPartial() {
            C2S_SmashEgg_17223 result = new C2S_SmashEgg_17223(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.index_ = this.index_;
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
            if (other instanceof C2S_SmashEgg_17223) {
               return this.mergeFrom((C2S_SmashEgg_17223)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SmashEgg_17223 other) {
            if (other == SplendidCityMsg.C2S_SmashEgg_17223.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasIndex()) {
                  this.setIndex(other.getIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNum()) {
               return false;
            } else {
               return this.hasIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SmashEgg_17223 parsedMessage = null;

            try {
               parsedMessage = (C2S_SmashEgg_17223)SplendidCityMsg.C2S_SmashEgg_17223.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SmashEgg_17223)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 1;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getIndex() {
            return this.index_;
         }

         public Builder setIndex(int value) {
            this.bitField0_ |= 2;
            this.index_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.bitField0_ &= -3;
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

   public static final class S2C_SmashEgg_17224 extends GeneratedMessageV3 implements S2C_SmashEgg_17224OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INDEX_FIELD_NUMBER = 2;
      private int index_;
      public static final int ISRESET_FIELD_NUMBER = 3;
      private boolean isReset_;
      public static final int INDEXS_FIELD_NUMBER = 4;
      private List<CommonMsg.MapDataII> indexs_;
      public static final int SENIORNUM_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> seniorNum_;
      public static final int SMASHEGGNUM_FIELD_NUMBER = 6;
      private int smashEggNum_;
      public static final int ISHAVEFANCY_FIELD_NUMBER = 7;
      private boolean isHaveFancy_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 8;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_SmashEgg_17224 DEFAULT_INSTANCE = new S2C_SmashEgg_17224();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SmashEgg_17224> PARSER = new AbstractParser<S2C_SmashEgg_17224>() {
         public S2C_SmashEgg_17224 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SmashEgg_17224(input, extensionRegistry);
         }
      };

      private S2C_SmashEgg_17224(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SmashEgg_17224() {
         this.memoizedIsInitialized = -1;
         this.indexs_ = Collections.emptyList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SmashEgg_17224();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SmashEgg_17224(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.index_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isReset_ = input.readBool();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.indexs_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.indexs_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.seniorNum_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.seniorNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 48:
                        this.bitField0_ |= 8;
                        this.smashEggNum_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 16;
                        this.isHaveFancy_ = input.readBool();
                        break;
                     case 64:
                        this.bitField0_ |= 32;
                        this.fancyGroupDrawTimes_ = input.readInt32();
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
                  this.indexs_ = Collections.unmodifiableList(this.indexs_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.seniorNum_ = Collections.unmodifiableList(this.seniorNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_SmashEgg_17224_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_SmashEgg_17224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SmashEgg_17224.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getIndex() {
         return this.index_;
      }

      public boolean hasIsReset() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsReset() {
         return this.isReset_;
      }

      public List<CommonMsg.MapDataII> getIndexsList() {
         return this.indexs_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getIndexsOrBuilderList() {
         return this.indexs_;
      }

      public int getIndexsCount() {
         return this.indexs_.size();
      }

      public CommonMsg.MapDataII getIndexs(int index) {
         return (CommonMsg.MapDataII)this.indexs_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getIndexsOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.indexs_.get(index);
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

      public boolean hasSmashEggNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSmashEggNum() {
         return this.smashEggNum_;
      }

      public boolean hasIsHaveFancy() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsHaveFancy() {
         return this.isHaveFancy_;
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
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsReset()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSmashEggNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getIndexsCount(); ++i) {
               if (!this.getIndexs(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.index_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isReset_);
         }

         for(int i = 0; i < this.indexs_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.indexs_.get(i));
         }

         for(int i = 0; i < this.seniorNum_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.seniorNum_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.smashEggNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(7, this.isHaveFancy_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.index_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isReset_);
            }

            for(int i = 0; i < this.indexs_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.indexs_.get(i));
            }

            for(int i = 0; i < this.seniorNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.seniorNum_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.smashEggNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(7, this.isHaveFancy_);
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
         } else if (!(obj instanceof S2C_SmashEgg_17224)) {
            return super.equals(obj);
         } else {
            S2C_SmashEgg_17224 other = (S2C_SmashEgg_17224)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasIndex() != other.hasIndex()) {
               return false;
            } else if (this.hasIndex() && this.getIndex() != other.getIndex()) {
               return false;
            } else if (this.hasIsReset() != other.hasIsReset()) {
               return false;
            } else if (this.hasIsReset() && this.getIsReset() != other.getIsReset()) {
               return false;
            } else if (!this.getIndexsList().equals(other.getIndexsList())) {
               return false;
            } else if (!this.getSeniorNumList().equals(other.getSeniorNumList())) {
               return false;
            } else if (this.hasSmashEggNum() != other.hasSmashEggNum()) {
               return false;
            } else if (this.hasSmashEggNum() && this.getSmashEggNum() != other.getSmashEggNum()) {
               return false;
            } else if (this.hasIsHaveFancy() != other.hasIsHaveFancy()) {
               return false;
            } else if (this.hasIsHaveFancy() && this.getIsHaveFancy() != other.getIsHaveFancy()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIndex();
            }

            if (this.hasIsReset()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsReset());
            }

            if (this.getIndexsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getIndexsList().hashCode();
            }

            if (this.getSeniorNumCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSeniorNumList().hashCode();
            }

            if (this.hasSmashEggNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getSmashEggNum();
            }

            if (this.hasIsHaveFancy()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHaveFancy());
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

      public static S2C_SmashEgg_17224 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17224)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_17224 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_17224 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17224)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_17224 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_17224 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17224)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_17224 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_17224 parseFrom(InputStream input) throws IOException {
         return (S2C_SmashEgg_17224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_17224 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_17224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SmashEgg_17224 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SmashEgg_17224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_17224 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_17224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SmashEgg_17224 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SmashEgg_17224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_17224 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_17224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SmashEgg_17224 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SmashEgg_17224 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SmashEgg_17224> parser() {
         return PARSER;
      }

      public Parser<S2C_SmashEgg_17224> getParserForType() {
         return PARSER;
      }

      public S2C_SmashEgg_17224 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SmashEgg_17224OrBuilder {
         private int bitField0_;
         private int result_;
         private int index_;
         private boolean isReset_;
         private List<CommonMsg.MapDataII> indexs_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> indexsBuilder_;
         private List<CommonMsg.MapDataII> seniorNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorNumBuilder_;
         private int smashEggNum_;
         private boolean isHaveFancy_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_SmashEgg_17224_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_SmashEgg_17224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SmashEgg_17224.class, Builder.class);
         }

         private Builder() {
            this.indexs_ = Collections.emptyList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.indexs_ = Collections.emptyList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_SmashEgg_17224.alwaysUseFieldBuilders) {
               this.getIndexsFieldBuilder();
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.index_ = 0;
            this.bitField0_ &= -3;
            this.isReset_ = false;
            this.bitField0_ &= -5;
            if (this.indexsBuilder_ == null) {
               this.indexs_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.indexsBuilder_.clear();
            }

            if (this.seniorNumBuilder_ == null) {
               this.seniorNum_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.seniorNumBuilder_.clear();
            }

            this.smashEggNum_ = 0;
            this.bitField0_ &= -33;
            this.isHaveFancy_ = false;
            this.bitField0_ &= -65;
            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_SmashEgg_17224_descriptor;
         }

         public S2C_SmashEgg_17224 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_SmashEgg_17224.getDefaultInstance();
         }

         public S2C_SmashEgg_17224 build() {
            S2C_SmashEgg_17224 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SmashEgg_17224 buildPartial() {
            S2C_SmashEgg_17224 result = new S2C_SmashEgg_17224(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.index_ = this.index_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isReset_ = this.isReset_;
               to_bitField0_ |= 4;
            }

            if (this.indexsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.indexs_ = Collections.unmodifiableList(this.indexs_);
                  this.bitField0_ &= -9;
               }

               result.indexs_ = this.indexs_;
            } else {
               result.indexs_ = this.indexsBuilder_.build();
            }

            if (this.seniorNumBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.seniorNum_ = Collections.unmodifiableList(this.seniorNum_);
                  this.bitField0_ &= -17;
               }

               result.seniorNum_ = this.seniorNum_;
            } else {
               result.seniorNum_ = this.seniorNumBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.smashEggNum_ = this.smashEggNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.isHaveFancy_ = this.isHaveFancy_;
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
            if (other instanceof S2C_SmashEgg_17224) {
               return this.mergeFrom((S2C_SmashEgg_17224)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SmashEgg_17224 other) {
            if (other == SplendidCityMsg.S2C_SmashEgg_17224.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasIndex()) {
                  this.setIndex(other.getIndex());
               }

               if (other.hasIsReset()) {
                  this.setIsReset(other.getIsReset());
               }

               if (this.indexsBuilder_ == null) {
                  if (!other.indexs_.isEmpty()) {
                     if (this.indexs_.isEmpty()) {
                        this.indexs_ = other.indexs_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureIndexsIsMutable();
                        this.indexs_.addAll(other.indexs_);
                     }

                     this.onChanged();
                  }
               } else if (!other.indexs_.isEmpty()) {
                  if (this.indexsBuilder_.isEmpty()) {
                     this.indexsBuilder_.dispose();
                     this.indexsBuilder_ = null;
                     this.indexs_ = other.indexs_;
                     this.bitField0_ &= -9;
                     this.indexsBuilder_ = SplendidCityMsg.S2C_SmashEgg_17224.alwaysUseFieldBuilders ? this.getIndexsFieldBuilder() : null;
                  } else {
                     this.indexsBuilder_.addAllMessages(other.indexs_);
                  }
               }

               if (this.seniorNumBuilder_ == null) {
                  if (!other.seniorNum_.isEmpty()) {
                     if (this.seniorNum_.isEmpty()) {
                        this.seniorNum_ = other.seniorNum_;
                        this.bitField0_ &= -17;
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
                     this.bitField0_ &= -17;
                     this.seniorNumBuilder_ = SplendidCityMsg.S2C_SmashEgg_17224.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
                  } else {
                     this.seniorNumBuilder_.addAllMessages(other.seniorNum_);
                  }
               }

               if (other.hasSmashEggNum()) {
                  this.setSmashEggNum(other.getSmashEggNum());
               }

               if (other.hasIsHaveFancy()) {
                  this.setIsHaveFancy(other.getIsHaveFancy());
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
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasIndex()) {
               return false;
            } else if (!this.hasIsReset()) {
               return false;
            } else if (!this.hasSmashEggNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getIndexsCount(); ++i) {
                  if (!this.getIndexs(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getSeniorNumCount(); ++i) {
                  if (!this.getSeniorNum(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SmashEgg_17224 parsedMessage = null;

            try {
               parsedMessage = (S2C_SmashEgg_17224)SplendidCityMsg.S2C_SmashEgg_17224.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SmashEgg_17224)e.getUnfinishedMessage();
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

         public boolean hasIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getIndex() {
            return this.index_;
         }

         public Builder setIndex(int value) {
            this.bitField0_ |= 2;
            this.index_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.bitField0_ &= -3;
            this.index_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsReset() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsReset() {
            return this.isReset_;
         }

         public Builder setIsReset(boolean value) {
            this.bitField0_ |= 4;
            this.isReset_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsReset() {
            this.bitField0_ &= -5;
            this.isReset_ = false;
            this.onChanged();
            return this;
         }

         private void ensureIndexsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.indexs_ = new ArrayList(this.indexs_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.MapDataII> getIndexsList() {
            return this.indexsBuilder_ == null ? Collections.unmodifiableList(this.indexs_) : this.indexsBuilder_.getMessageList();
         }

         public int getIndexsCount() {
            return this.indexsBuilder_ == null ? this.indexs_.size() : this.indexsBuilder_.getCount();
         }

         public CommonMsg.MapDataII getIndexs(int index) {
            return this.indexsBuilder_ == null ? (CommonMsg.MapDataII)this.indexs_.get(index) : (CommonMsg.MapDataII)this.indexsBuilder_.getMessage(index);
         }

         public Builder setIndexs(int index, CommonMsg.MapDataII value) {
            if (this.indexsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureIndexsIsMutable();
               this.indexs_.set(index, value);
               this.onChanged();
            } else {
               this.indexsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setIndexs(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.indexsBuilder_ == null) {
               this.ensureIndexsIsMutable();
               this.indexs_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.indexsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addIndexs(CommonMsg.MapDataII value) {
            if (this.indexsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureIndexsIsMutable();
               this.indexs_.add(value);
               this.onChanged();
            } else {
               this.indexsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addIndexs(int index, CommonMsg.MapDataII value) {
            if (this.indexsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureIndexsIsMutable();
               this.indexs_.add(index, value);
               this.onChanged();
            } else {
               this.indexsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addIndexs(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.indexsBuilder_ == null) {
               this.ensureIndexsIsMutable();
               this.indexs_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.indexsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addIndexs(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.indexsBuilder_ == null) {
               this.ensureIndexsIsMutable();
               this.indexs_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.indexsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllIndexs(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.indexsBuilder_ == null) {
               this.ensureIndexsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.indexs_);
               this.onChanged();
            } else {
               this.indexsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearIndexs() {
            if (this.indexsBuilder_ == null) {
               this.indexs_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.indexsBuilder_.clear();
            }

            return this;
         }

         public Builder removeIndexs(int index) {
            if (this.indexsBuilder_ == null) {
               this.ensureIndexsIsMutable();
               this.indexs_.remove(index);
               this.onChanged();
            } else {
               this.indexsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getIndexsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getIndexsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getIndexsOrBuilder(int index) {
            return this.indexsBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.indexs_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.indexsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getIndexsOrBuilderList() {
            return this.indexsBuilder_ != null ? this.indexsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.indexs_);
         }

         public CommonMsg.MapDataII.Builder addIndexsBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getIndexsFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addIndexsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getIndexsFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getIndexsBuilderList() {
            return this.getIndexsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getIndexsFieldBuilder() {
            if (this.indexsBuilder_ == null) {
               this.indexsBuilder_ = new RepeatedFieldBuilderV3(this.indexs_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.indexs_ = null;
            }

            return this.indexsBuilder_;
         }

         private void ensureSeniorNumIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.seniorNum_ = new ArrayList(this.seniorNum_);
               this.bitField0_ |= 16;
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
               this.bitField0_ &= -17;
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
               this.seniorNumBuilder_ = new RepeatedFieldBuilderV3(this.seniorNum_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.seniorNum_ = null;
            }

            return this.seniorNumBuilder_;
         }

         public boolean hasSmashEggNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getSmashEggNum() {
            return this.smashEggNum_;
         }

         public Builder setSmashEggNum(int value) {
            this.bitField0_ |= 32;
            this.smashEggNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSmashEggNum() {
            this.bitField0_ &= -33;
            this.smashEggNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsHaveFancy() {
            return (this.bitField0_ & 64) != 0;
         }

         public boolean getIsHaveFancy() {
            return this.isHaveFancy_;
         }

         public Builder setIsHaveFancy(boolean value) {
            this.bitField0_ |= 64;
            this.isHaveFancy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsHaveFancy() {
            this.bitField0_ &= -65;
            this.isHaveFancy_ = false;
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

   public static final class C2S_TakeLuckReward_17227 extends GeneratedMessageV3 implements C2S_TakeLuckReward_17227OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeLuckReward_17227 DEFAULT_INSTANCE = new C2S_TakeLuckReward_17227();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeLuckReward_17227> PARSER = new AbstractParser<C2S_TakeLuckReward_17227>() {
         public C2S_TakeLuckReward_17227 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeLuckReward_17227(input, extensionRegistry);
         }
      };

      private C2S_TakeLuckReward_17227(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeLuckReward_17227() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeLuckReward_17227();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeLuckReward_17227(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardId_ = input.readInt32();
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_TakeLuckReward_17227_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_TakeLuckReward_17227_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeLuckReward_17227.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TakeLuckReward_17227)) {
            return super.equals(obj);
         } else {
            C2S_TakeLuckReward_17227 other = (C2S_TakeLuckReward_17227)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
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
            if (this.hasRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TakeLuckReward_17227 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17227)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_17227 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_17227 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17227)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_17227 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_17227 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17227)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_17227 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_17227 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeLuckReward_17227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_17227 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_17227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeLuckReward_17227 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeLuckReward_17227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_17227 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_17227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeLuckReward_17227 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeLuckReward_17227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_17227 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_17227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeLuckReward_17227 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeLuckReward_17227 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeLuckReward_17227> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeLuckReward_17227> getParserForType() {
         return PARSER;
      }

      public C2S_TakeLuckReward_17227 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeLuckReward_17227OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_TakeLuckReward_17227_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_TakeLuckReward_17227_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeLuckReward_17227.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_TakeLuckReward_17227.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_TakeLuckReward_17227_descriptor;
         }

         public C2S_TakeLuckReward_17227 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_TakeLuckReward_17227.getDefaultInstance();
         }

         public C2S_TakeLuckReward_17227 build() {
            C2S_TakeLuckReward_17227 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeLuckReward_17227 buildPartial() {
            C2S_TakeLuckReward_17227 result = new C2S_TakeLuckReward_17227(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_TakeLuckReward_17227) {
               return this.mergeFrom((C2S_TakeLuckReward_17227)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeLuckReward_17227 other) {
            if (other == SplendidCityMsg.C2S_TakeLuckReward_17227.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRewardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TakeLuckReward_17227 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeLuckReward_17227)SplendidCityMsg.C2S_TakeLuckReward_17227.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeLuckReward_17227)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 1;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
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

   public static final class S2C_TakeLuckReward_17228 extends GeneratedMessageV3 implements S2C_TakeLuckReward_17228OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TAKEDID_FIELD_NUMBER = 2;
      private Internal.IntList takedId_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeLuckReward_17228 DEFAULT_INSTANCE = new S2C_TakeLuckReward_17228();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeLuckReward_17228> PARSER = new AbstractParser<S2C_TakeLuckReward_17228>() {
         public S2C_TakeLuckReward_17228 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeLuckReward_17228(input, extensionRegistry);
         }
      };

      private S2C_TakeLuckReward_17228(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeLuckReward_17228() {
         this.memoizedIsInitialized = -1;
         this.takedId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeLuckReward_17228();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeLuckReward_17228(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.takedId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.takedId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.takedId_.addInt(input.readInt32());
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
                  this.takedId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_TakeLuckReward_17228_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_TakeLuckReward_17228_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeLuckReward_17228.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<Integer> getTakedIdList() {
         return this.takedId_;
      }

      public int getTakedIdCount() {
         return this.takedId_.size();
      }

      public int getTakedId(int index) {
         return this.takedId_.getInt(index);
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
         }

         for(int i = 0; i < this.takedId_.size(); ++i) {
            output.writeInt32(2, this.takedId_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.takedId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeLuckReward_17228)) {
            return super.equals(obj);
         } else {
            S2C_TakeLuckReward_17228 other = (S2C_TakeLuckReward_17228)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getTakedIdList().equals(other.getTakedIdList())) {
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

            if (this.getTakedIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTakedIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeLuckReward_17228 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17228)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_17228 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_17228 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17228)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_17228 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_17228 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17228)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_17228 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_17228 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeLuckReward_17228)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_17228 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_17228)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeLuckReward_17228 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeLuckReward_17228)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_17228 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_17228)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeLuckReward_17228 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeLuckReward_17228)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_17228 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_17228)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeLuckReward_17228 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeLuckReward_17228 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeLuckReward_17228> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeLuckReward_17228> getParserForType() {
         return PARSER;
      }

      public S2C_TakeLuckReward_17228 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeLuckReward_17228OrBuilder {
         private int bitField0_;
         private int result_;
         private Internal.IntList takedId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_TakeLuckReward_17228_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_TakeLuckReward_17228_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeLuckReward_17228.class, Builder.class);
         }

         private Builder() {
            this.takedId_ = SplendidCityMsg.S2C_TakeLuckReward_17228.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.takedId_ = SplendidCityMsg.S2C_TakeLuckReward_17228.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_TakeLuckReward_17228.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.takedId_ = SplendidCityMsg.S2C_TakeLuckReward_17228.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_TakeLuckReward_17228_descriptor;
         }

         public S2C_TakeLuckReward_17228 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_TakeLuckReward_17228.getDefaultInstance();
         }

         public S2C_TakeLuckReward_17228 build() {
            S2C_TakeLuckReward_17228 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeLuckReward_17228 buildPartial() {
            S2C_TakeLuckReward_17228 result = new S2C_TakeLuckReward_17228(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.takedId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.takedId_ = this.takedId_;
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
            if (other instanceof S2C_TakeLuckReward_17228) {
               return this.mergeFrom((S2C_TakeLuckReward_17228)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeLuckReward_17228 other) {
            if (other == SplendidCityMsg.S2C_TakeLuckReward_17228.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (!other.takedId_.isEmpty()) {
                  if (this.takedId_.isEmpty()) {
                     this.takedId_ = other.takedId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTakedIdIsMutable();
                     this.takedId_.addAll(other.takedId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasResult();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TakeLuckReward_17228 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeLuckReward_17228)SplendidCityMsg.S2C_TakeLuckReward_17228.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeLuckReward_17228)e.getUnfinishedMessage();
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

         private void ensureTakedIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.takedId_ = SplendidCityMsg.S2C_TakeLuckReward_17228.mutableCopy(this.takedId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getTakedIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.takedId_) : this.takedId_);
         }

         public int getTakedIdCount() {
            return this.takedId_.size();
         }

         public int getTakedId(int index) {
            return this.takedId_.getInt(index);
         }

         public Builder setTakedId(int index, int value) {
            this.ensureTakedIdIsMutable();
            this.takedId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedId(int value) {
            this.ensureTakedIdIsMutable();
            this.takedId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedId(Iterable<? extends Integer> values) {
            this.ensureTakedIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedId_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedId() {
            this.takedId_ = SplendidCityMsg.S2C_TakeLuckReward_17228.emptyIntList();
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

   public static final class C2S_OpenEggUi_17229 extends GeneratedMessageV3 implements C2S_OpenEggUi_17229OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenEggUi_17229 DEFAULT_INSTANCE = new C2S_OpenEggUi_17229();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenEggUi_17229> PARSER = new AbstractParser<C2S_OpenEggUi_17229>() {
         public C2S_OpenEggUi_17229 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenEggUi_17229(input, extensionRegistry);
         }
      };

      private C2S_OpenEggUi_17229(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenEggUi_17229() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenEggUi_17229();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenEggUi_17229(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_OpenEggUi_17229_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_OpenEggUi_17229_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenEggUi_17229.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenEggUi_17229)) {
            return super.equals(obj);
         } else {
            C2S_OpenEggUi_17229 other = (C2S_OpenEggUi_17229)obj;
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

      public static C2S_OpenEggUi_17229 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17229)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_17229 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_17229 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17229)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_17229 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_17229 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17229)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_17229 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_17229 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenEggUi_17229)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_17229 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_17229)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenEggUi_17229 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenEggUi_17229)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_17229 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_17229)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenEggUi_17229 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenEggUi_17229)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_17229 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_17229)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenEggUi_17229 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenEggUi_17229 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenEggUi_17229> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenEggUi_17229> getParserForType() {
         return PARSER;
      }

      public C2S_OpenEggUi_17229 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenEggUi_17229OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_OpenEggUi_17229_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_OpenEggUi_17229_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenEggUi_17229.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_OpenEggUi_17229.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_OpenEggUi_17229_descriptor;
         }

         public C2S_OpenEggUi_17229 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_OpenEggUi_17229.getDefaultInstance();
         }

         public C2S_OpenEggUi_17229 build() {
            C2S_OpenEggUi_17229 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenEggUi_17229 buildPartial() {
            C2S_OpenEggUi_17229 result = new C2S_OpenEggUi_17229(this);
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
            if (other instanceof C2S_OpenEggUi_17229) {
               return this.mergeFrom((C2S_OpenEggUi_17229)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenEggUi_17229 other) {
            if (other == SplendidCityMsg.C2S_OpenEggUi_17229.getDefaultInstance()) {
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
            C2S_OpenEggUi_17229 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenEggUi_17229)SplendidCityMsg.C2S_OpenEggUi_17229.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenEggUi_17229)e.getUnfinishedMessage();
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

   public static final class S2C_OpenEggUi_17230 extends GeneratedMessageV3 implements S2C_OpenEggUi_17230OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FANCYID_FIELD_NUMBER = 1;
      private int fancyId_;
      public static final int SENIORREWARDS_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> seniorRewards_;
      public static final int SMASHEGGNUM_FIELD_NUMBER = 3;
      private int smashEggNum_;
      public static final int TAKEDLUCK_FIELD_NUMBER = 4;
      private Internal.IntList takedLuck_;
      public static final int EGGS_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> eggs_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 6;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenEggUi_17230 DEFAULT_INSTANCE = new S2C_OpenEggUi_17230();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenEggUi_17230> PARSER = new AbstractParser<S2C_OpenEggUi_17230>() {
         public S2C_OpenEggUi_17230 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenEggUi_17230(input, extensionRegistry);
         }
      };

      private S2C_OpenEggUi_17230(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenEggUi_17230() {
         this.memoizedIsInitialized = -1;
         this.seniorRewards_ = Collections.emptyList();
         this.takedLuck_ = emptyIntList();
         this.eggs_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenEggUi_17230();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenEggUi_17230(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fancyId_ = input.readInt32();
                        continue;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.seniorRewards_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.seniorRewards_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 24:
                        this.bitField0_ |= 2;
                        this.smashEggNum_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.takedLuck_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.takedLuck_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedLuck_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.eggs_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.eggs_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 48:
                        this.bitField0_ |= 4;
                        this.fancyGroupDrawTimes_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.takedLuck_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.seniorRewards_ = Collections.unmodifiableList(this.seniorRewards_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.takedLuck_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.eggs_ = Collections.unmodifiableList(this.eggs_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_OpenEggUi_17230_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_OpenEggUi_17230_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenEggUi_17230.class, Builder.class);
      }

      public boolean hasFancyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFancyId() {
         return this.fancyId_;
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

      public boolean hasSmashEggNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSmashEggNum() {
         return this.smashEggNum_;
      }

      public List<Integer> getTakedLuckList() {
         return this.takedLuck_;
      }

      public int getTakedLuckCount() {
         return this.takedLuck_.size();
      }

      public int getTakedLuck(int index) {
         return this.takedLuck_.getInt(index);
      }

      public List<CommonMsg.MapDataII> getEggsList() {
         return this.eggs_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getEggsOrBuilderList() {
         return this.eggs_;
      }

      public int getEggsCount() {
         return this.eggs_.size();
      }

      public CommonMsg.MapDataII getEggs(int index) {
         return (CommonMsg.MapDataII)this.eggs_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getEggsOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.eggs_.get(index);
      }

      public boolean hasFancyGroupDrawTimes() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasFancyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSmashEggNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getSeniorRewardsCount(); ++i) {
               if (!this.getSeniorRewards(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getEggsCount(); ++i) {
               if (!this.getEggs(i).isInitialized()) {
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
            output.writeInt32(1, this.fancyId_);
         }

         for(int i = 0; i < this.seniorRewards_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.seniorRewards_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.smashEggNum_);
         }

         for(int i = 0; i < this.takedLuck_.size(); ++i) {
            output.writeInt32(4, this.takedLuck_.getInt(i));
         }

         for(int i = 0; i < this.eggs_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.eggs_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(6, this.fancyGroupDrawTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fancyId_);
            }

            for(int i = 0; i < this.seniorRewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.seniorRewards_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.smashEggNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.takedLuck_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedLuck_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedLuckList().size();

            for(int i = 0; i < this.eggs_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.eggs_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.fancyGroupDrawTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenEggUi_17230)) {
            return super.equals(obj);
         } else {
            S2C_OpenEggUi_17230 other = (S2C_OpenEggUi_17230)obj;
            if (this.hasFancyId() != other.hasFancyId()) {
               return false;
            } else if (this.hasFancyId() && this.getFancyId() != other.getFancyId()) {
               return false;
            } else if (!this.getSeniorRewardsList().equals(other.getSeniorRewardsList())) {
               return false;
            } else if (this.hasSmashEggNum() != other.hasSmashEggNum()) {
               return false;
            } else if (this.hasSmashEggNum() && this.getSmashEggNum() != other.getSmashEggNum()) {
               return false;
            } else if (!this.getTakedLuckList().equals(other.getTakedLuckList())) {
               return false;
            } else if (!this.getEggsList().equals(other.getEggsList())) {
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
            if (this.hasFancyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFancyId();
            }

            if (this.getSeniorRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSeniorRewardsList().hashCode();
            }

            if (this.hasSmashEggNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSmashEggNum();
            }

            if (this.getTakedLuckCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTakedLuckList().hashCode();
            }

            if (this.getEggsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getEggsList().hashCode();
            }

            if (this.hasFancyGroupDrawTimes()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getFancyGroupDrawTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenEggUi_17230 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17230)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_17230 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_17230 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17230)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_17230 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_17230 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17230)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_17230 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_17230 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenEggUi_17230)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_17230 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_17230)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenEggUi_17230 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenEggUi_17230)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_17230 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_17230)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenEggUi_17230 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenEggUi_17230)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_17230 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_17230)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenEggUi_17230 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenEggUi_17230 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenEggUi_17230> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenEggUi_17230> getParserForType() {
         return PARSER;
      }

      public S2C_OpenEggUi_17230 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenEggUi_17230OrBuilder {
         private int bitField0_;
         private int fancyId_;
         private List<CommonMsg.MapDataII> seniorRewards_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorRewardsBuilder_;
         private int smashEggNum_;
         private Internal.IntList takedLuck_;
         private List<CommonMsg.MapDataII> eggs_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> eggsBuilder_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_OpenEggUi_17230_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_OpenEggUi_17230_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenEggUi_17230.class, Builder.class);
         }

         private Builder() {
            this.seniorRewards_ = Collections.emptyList();
            this.takedLuck_ = SplendidCityMsg.S2C_OpenEggUi_17230.emptyIntList();
            this.eggs_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.seniorRewards_ = Collections.emptyList();
            this.takedLuck_ = SplendidCityMsg.S2C_OpenEggUi_17230.emptyIntList();
            this.eggs_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_OpenEggUi_17230.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
               this.getEggsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.fancyId_ = 0;
            this.bitField0_ &= -2;
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.seniorRewardsBuilder_.clear();
            }

            this.smashEggNum_ = 0;
            this.bitField0_ &= -5;
            this.takedLuck_ = SplendidCityMsg.S2C_OpenEggUi_17230.emptyIntList();
            this.bitField0_ &= -9;
            if (this.eggsBuilder_ == null) {
               this.eggs_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.eggsBuilder_.clear();
            }

            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_OpenEggUi_17230_descriptor;
         }

         public S2C_OpenEggUi_17230 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_OpenEggUi_17230.getDefaultInstance();
         }

         public S2C_OpenEggUi_17230 build() {
            S2C_OpenEggUi_17230 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenEggUi_17230 buildPartial() {
            S2C_OpenEggUi_17230 result = new S2C_OpenEggUi_17230(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fancyId_ = this.fancyId_;
               to_bitField0_ |= 1;
            }

            if (this.seniorRewardsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.seniorRewards_ = Collections.unmodifiableList(this.seniorRewards_);
                  this.bitField0_ &= -3;
               }

               result.seniorRewards_ = this.seniorRewards_;
            } else {
               result.seniorRewards_ = this.seniorRewardsBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.smashEggNum_ = this.smashEggNum_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.takedLuck_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.takedLuck_ = this.takedLuck_;
            if (this.eggsBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.eggs_ = Collections.unmodifiableList(this.eggs_);
                  this.bitField0_ &= -17;
               }

               result.eggs_ = this.eggs_;
            } else {
               result.eggs_ = this.eggsBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.fancyGroupDrawTimes_ = this.fancyGroupDrawTimes_;
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
            if (other instanceof S2C_OpenEggUi_17230) {
               return this.mergeFrom((S2C_OpenEggUi_17230)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenEggUi_17230 other) {
            if (other == SplendidCityMsg.S2C_OpenEggUi_17230.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFancyId()) {
                  this.setFancyId(other.getFancyId());
               }

               if (this.seniorRewardsBuilder_ == null) {
                  if (!other.seniorRewards_.isEmpty()) {
                     if (this.seniorRewards_.isEmpty()) {
                        this.seniorRewards_ = other.seniorRewards_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.seniorRewardsBuilder_ = SplendidCityMsg.S2C_OpenEggUi_17230.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
                  } else {
                     this.seniorRewardsBuilder_.addAllMessages(other.seniorRewards_);
                  }
               }

               if (other.hasSmashEggNum()) {
                  this.setSmashEggNum(other.getSmashEggNum());
               }

               if (!other.takedLuck_.isEmpty()) {
                  if (this.takedLuck_.isEmpty()) {
                     this.takedLuck_ = other.takedLuck_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureTakedLuckIsMutable();
                     this.takedLuck_.addAll(other.takedLuck_);
                  }

                  this.onChanged();
               }

               if (this.eggsBuilder_ == null) {
                  if (!other.eggs_.isEmpty()) {
                     if (this.eggs_.isEmpty()) {
                        this.eggs_ = other.eggs_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureEggsIsMutable();
                        this.eggs_.addAll(other.eggs_);
                     }

                     this.onChanged();
                  }
               } else if (!other.eggs_.isEmpty()) {
                  if (this.eggsBuilder_.isEmpty()) {
                     this.eggsBuilder_.dispose();
                     this.eggsBuilder_ = null;
                     this.eggs_ = other.eggs_;
                     this.bitField0_ &= -17;
                     this.eggsBuilder_ = SplendidCityMsg.S2C_OpenEggUi_17230.alwaysUseFieldBuilders ? this.getEggsFieldBuilder() : null;
                  } else {
                     this.eggsBuilder_.addAllMessages(other.eggs_);
                  }
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
            if (!this.hasFancyId()) {
               return false;
            } else if (!this.hasSmashEggNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getSeniorRewardsCount(); ++i) {
                  if (!this.getSeniorRewards(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getEggsCount(); ++i) {
                  if (!this.getEggs(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenEggUi_17230 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenEggUi_17230)SplendidCityMsg.S2C_OpenEggUi_17230.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenEggUi_17230)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFancyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFancyId() {
            return this.fancyId_;
         }

         public Builder setFancyId(int value) {
            this.bitField0_ |= 1;
            this.fancyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyId() {
            this.bitField0_ &= -2;
            this.fancyId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSeniorRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.seniorRewards_ = new ArrayList(this.seniorRewards_);
               this.bitField0_ |= 2;
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
               this.bitField0_ &= -3;
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
               this.seniorRewardsBuilder_ = new RepeatedFieldBuilderV3(this.seniorRewards_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.seniorRewards_ = null;
            }

            return this.seniorRewardsBuilder_;
         }

         public boolean hasSmashEggNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSmashEggNum() {
            return this.smashEggNum_;
         }

         public Builder setSmashEggNum(int value) {
            this.bitField0_ |= 4;
            this.smashEggNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSmashEggNum() {
            this.bitField0_ &= -5;
            this.smashEggNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTakedLuckIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.takedLuck_ = SplendidCityMsg.S2C_OpenEggUi_17230.mutableCopy(this.takedLuck_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getTakedLuckList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.takedLuck_) : this.takedLuck_);
         }

         public int getTakedLuckCount() {
            return this.takedLuck_.size();
         }

         public int getTakedLuck(int index) {
            return this.takedLuck_.getInt(index);
         }

         public Builder setTakedLuck(int index, int value) {
            this.ensureTakedLuckIsMutable();
            this.takedLuck_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedLuck(int value) {
            this.ensureTakedLuckIsMutable();
            this.takedLuck_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedLuck(Iterable<? extends Integer> values) {
            this.ensureTakedLuckIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedLuck_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedLuck() {
            this.takedLuck_ = SplendidCityMsg.S2C_OpenEggUi_17230.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureEggsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.eggs_ = new ArrayList(this.eggs_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.MapDataII> getEggsList() {
            return this.eggsBuilder_ == null ? Collections.unmodifiableList(this.eggs_) : this.eggsBuilder_.getMessageList();
         }

         public int getEggsCount() {
            return this.eggsBuilder_ == null ? this.eggs_.size() : this.eggsBuilder_.getCount();
         }

         public CommonMsg.MapDataII getEggs(int index) {
            return this.eggsBuilder_ == null ? (CommonMsg.MapDataII)this.eggs_.get(index) : (CommonMsg.MapDataII)this.eggsBuilder_.getMessage(index);
         }

         public Builder setEggs(int index, CommonMsg.MapDataII value) {
            if (this.eggsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEggsIsMutable();
               this.eggs_.set(index, value);
               this.onChanged();
            } else {
               this.eggsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEggs(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.eggsBuilder_ == null) {
               this.ensureEggsIsMutable();
               this.eggs_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.eggsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEggs(CommonMsg.MapDataII value) {
            if (this.eggsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEggsIsMutable();
               this.eggs_.add(value);
               this.onChanged();
            } else {
               this.eggsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEggs(int index, CommonMsg.MapDataII value) {
            if (this.eggsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEggsIsMutable();
               this.eggs_.add(index, value);
               this.onChanged();
            } else {
               this.eggsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEggs(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.eggsBuilder_ == null) {
               this.ensureEggsIsMutable();
               this.eggs_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.eggsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEggs(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.eggsBuilder_ == null) {
               this.ensureEggsIsMutable();
               this.eggs_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.eggsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEggs(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.eggsBuilder_ == null) {
               this.ensureEggsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.eggs_);
               this.onChanged();
            } else {
               this.eggsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEggs() {
            if (this.eggsBuilder_ == null) {
               this.eggs_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.eggsBuilder_.clear();
            }

            return this;
         }

         public Builder removeEggs(int index) {
            if (this.eggsBuilder_ == null) {
               this.ensureEggsIsMutable();
               this.eggs_.remove(index);
               this.onChanged();
            } else {
               this.eggsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getEggsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getEggsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getEggsOrBuilder(int index) {
            return this.eggsBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.eggs_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.eggsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getEggsOrBuilderList() {
            return this.eggsBuilder_ != null ? this.eggsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.eggs_);
         }

         public CommonMsg.MapDataII.Builder addEggsBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getEggsFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addEggsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getEggsFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getEggsBuilderList() {
            return this.getEggsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getEggsFieldBuilder() {
            if (this.eggsBuilder_ == null) {
               this.eggsBuilder_ = new RepeatedFieldBuilderV3(this.eggs_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.eggs_ = null;
            }

            return this.eggsBuilder_;
         }

         public boolean hasFancyGroupDrawTimes() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getFancyGroupDrawTimes() {
            return this.fancyGroupDrawTimes_;
         }

         public Builder setFancyGroupDrawTimes(int value) {
            this.bitField0_ |= 32;
            this.fancyGroupDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyGroupDrawTimes() {
            this.bitField0_ &= -33;
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

   public static final class C2S_AddUpTotalInfo_17253 extends GeneratedMessageV3 implements C2S_AddUpTotalInfo_17253OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_AddUpTotalInfo_17253 DEFAULT_INSTANCE = new C2S_AddUpTotalInfo_17253();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AddUpTotalInfo_17253> PARSER = new AbstractParser<C2S_AddUpTotalInfo_17253>() {
         public C2S_AddUpTotalInfo_17253 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AddUpTotalInfo_17253(input, extensionRegistry);
         }
      };

      private C2S_AddUpTotalInfo_17253(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AddUpTotalInfo_17253() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AddUpTotalInfo_17253();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AddUpTotalInfo_17253(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_AddUpTotalInfo_17253_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_AddUpTotalInfo_17253_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AddUpTotalInfo_17253.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AddUpTotalInfo_17253)) {
            return super.equals(obj);
         } else {
            C2S_AddUpTotalInfo_17253 other = (C2S_AddUpTotalInfo_17253)obj;
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

      public static C2S_AddUpTotalInfo_17253 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_17253)PARSER.parseFrom(data);
      }

      public static C2S_AddUpTotalInfo_17253 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_17253)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpTotalInfo_17253 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_17253)PARSER.parseFrom(data);
      }

      public static C2S_AddUpTotalInfo_17253 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_17253)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpTotalInfo_17253 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_17253)PARSER.parseFrom(data);
      }

      public static C2S_AddUpTotalInfo_17253 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_17253)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpTotalInfo_17253 parseFrom(InputStream input) throws IOException {
         return (C2S_AddUpTotalInfo_17253)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AddUpTotalInfo_17253 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpTotalInfo_17253)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AddUpTotalInfo_17253 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AddUpTotalInfo_17253)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AddUpTotalInfo_17253 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpTotalInfo_17253)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AddUpTotalInfo_17253 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AddUpTotalInfo_17253)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AddUpTotalInfo_17253 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpTotalInfo_17253)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AddUpTotalInfo_17253 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AddUpTotalInfo_17253 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AddUpTotalInfo_17253> parser() {
         return PARSER;
      }

      public Parser<C2S_AddUpTotalInfo_17253> getParserForType() {
         return PARSER;
      }

      public C2S_AddUpTotalInfo_17253 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AddUpTotalInfo_17253OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_AddUpTotalInfo_17253_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_AddUpTotalInfo_17253_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AddUpTotalInfo_17253.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_AddUpTotalInfo_17253.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_AddUpTotalInfo_17253_descriptor;
         }

         public C2S_AddUpTotalInfo_17253 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_AddUpTotalInfo_17253.getDefaultInstance();
         }

         public C2S_AddUpTotalInfo_17253 build() {
            C2S_AddUpTotalInfo_17253 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AddUpTotalInfo_17253 buildPartial() {
            C2S_AddUpTotalInfo_17253 result = new C2S_AddUpTotalInfo_17253(this);
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
            if (other instanceof C2S_AddUpTotalInfo_17253) {
               return this.mergeFrom((C2S_AddUpTotalInfo_17253)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AddUpTotalInfo_17253 other) {
            if (other == SplendidCityMsg.C2S_AddUpTotalInfo_17253.getDefaultInstance()) {
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
            C2S_AddUpTotalInfo_17253 parsedMessage = null;

            try {
               parsedMessage = (C2S_AddUpTotalInfo_17253)SplendidCityMsg.C2S_AddUpTotalInfo_17253.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AddUpTotalInfo_17253)e.getUnfinishedMessage();
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

   public static final class S2C_AddUpTotalInfo_17254 extends GeneratedMessageV3 implements S2C_AddUpTotalInfo_17254OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTREWARDS_FIELD_NUMBER = 1;
      private Internal.IntList gotRewards_;
      public static final int STAGERECHARGE_FIELD_NUMBER = 2;
      private int stageRecharge_;
      private byte memoizedIsInitialized;
      private static final S2C_AddUpTotalInfo_17254 DEFAULT_INSTANCE = new S2C_AddUpTotalInfo_17254();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AddUpTotalInfo_17254> PARSER = new AbstractParser<S2C_AddUpTotalInfo_17254>() {
         public S2C_AddUpTotalInfo_17254 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AddUpTotalInfo_17254(input, extensionRegistry);
         }
      };

      private S2C_AddUpTotalInfo_17254(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AddUpTotalInfo_17254() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AddUpTotalInfo_17254();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AddUpTotalInfo_17254(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.gotRewards_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.stageRecharge_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gotRewards_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.gotRewards_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_AddUpTotalInfo_17254_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_AddUpTotalInfo_17254_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddUpTotalInfo_17254.class, Builder.class);
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

      public boolean hasStageRecharge() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageRecharge() {
         return this.stageRecharge_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageRecharge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.gotRewards_.size(); ++i) {
            output.writeInt32(1, this.gotRewards_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.stageRecharge_);
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

            for(int i = 0; i < this.gotRewards_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotRewards_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRewardsList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stageRecharge_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AddUpTotalInfo_17254)) {
            return super.equals(obj);
         } else {
            S2C_AddUpTotalInfo_17254 other = (S2C_AddUpTotalInfo_17254)obj;
            if (!this.getGotRewardsList().equals(other.getGotRewardsList())) {
               return false;
            } else if (this.hasStageRecharge() != other.hasStageRecharge()) {
               return false;
            } else if (this.hasStageRecharge() && this.getStageRecharge() != other.getStageRecharge()) {
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
            if (this.getGotRewardsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotRewardsList().hashCode();
            }

            if (this.hasStageRecharge()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageRecharge();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AddUpTotalInfo_17254 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_17254)PARSER.parseFrom(data);
      }

      public static S2C_AddUpTotalInfo_17254 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_17254)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpTotalInfo_17254 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_17254)PARSER.parseFrom(data);
      }

      public static S2C_AddUpTotalInfo_17254 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_17254)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpTotalInfo_17254 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_17254)PARSER.parseFrom(data);
      }

      public static S2C_AddUpTotalInfo_17254 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_17254)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpTotalInfo_17254 parseFrom(InputStream input) throws IOException {
         return (S2C_AddUpTotalInfo_17254)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddUpTotalInfo_17254 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpTotalInfo_17254)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddUpTotalInfo_17254 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AddUpTotalInfo_17254)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AddUpTotalInfo_17254 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpTotalInfo_17254)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddUpTotalInfo_17254 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AddUpTotalInfo_17254)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddUpTotalInfo_17254 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpTotalInfo_17254)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AddUpTotalInfo_17254 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AddUpTotalInfo_17254 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AddUpTotalInfo_17254> parser() {
         return PARSER;
      }

      public Parser<S2C_AddUpTotalInfo_17254> getParserForType() {
         return PARSER;
      }

      public S2C_AddUpTotalInfo_17254 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AddUpTotalInfo_17254OrBuilder {
         private int bitField0_;
         private Internal.IntList gotRewards_;
         private int stageRecharge_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_AddUpTotalInfo_17254_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_AddUpTotalInfo_17254_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddUpTotalInfo_17254.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = SplendidCityMsg.S2C_AddUpTotalInfo_17254.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = SplendidCityMsg.S2C_AddUpTotalInfo_17254.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_AddUpTotalInfo_17254.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotRewards_ = SplendidCityMsg.S2C_AddUpTotalInfo_17254.emptyIntList();
            this.bitField0_ &= -2;
            this.stageRecharge_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_AddUpTotalInfo_17254_descriptor;
         }

         public S2C_AddUpTotalInfo_17254 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_AddUpTotalInfo_17254.getDefaultInstance();
         }

         public S2C_AddUpTotalInfo_17254 build() {
            S2C_AddUpTotalInfo_17254 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AddUpTotalInfo_17254 buildPartial() {
            S2C_AddUpTotalInfo_17254 result = new S2C_AddUpTotalInfo_17254(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.gotRewards_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.gotRewards_ = this.gotRewards_;
            if ((from_bitField0_ & 2) != 0) {
               result.stageRecharge_ = this.stageRecharge_;
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
            if (other instanceof S2C_AddUpTotalInfo_17254) {
               return this.mergeFrom((S2C_AddUpTotalInfo_17254)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AddUpTotalInfo_17254 other) {
            if (other == SplendidCityMsg.S2C_AddUpTotalInfo_17254.getDefaultInstance()) {
               return this;
            } else {
               if (!other.gotRewards_.isEmpty()) {
                  if (this.gotRewards_.isEmpty()) {
                     this.gotRewards_ = other.gotRewards_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureGotRewardsIsMutable();
                     this.gotRewards_.addAll(other.gotRewards_);
                  }

                  this.onChanged();
               }

               if (other.hasStageRecharge()) {
                  this.setStageRecharge(other.getStageRecharge());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStageRecharge();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AddUpTotalInfo_17254 parsedMessage = null;

            try {
               parsedMessage = (S2C_AddUpTotalInfo_17254)SplendidCityMsg.S2C_AddUpTotalInfo_17254.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AddUpTotalInfo_17254)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGotRewardsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.gotRewards_ = SplendidCityMsg.S2C_AddUpTotalInfo_17254.mutableCopy(this.gotRewards_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getGotRewardsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.gotRewards_) : this.gotRewards_);
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
            this.gotRewards_ = SplendidCityMsg.S2C_AddUpTotalInfo_17254.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasStageRecharge() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStageRecharge() {
            return this.stageRecharge_;
         }

         public Builder setStageRecharge(int value) {
            this.bitField0_ |= 2;
            this.stageRecharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageRecharge() {
            this.bitField0_ &= -3;
            this.stageRecharge_ = 0;
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

   public static final class C2S_ReceiveAddUpReward_17255 extends GeneratedMessageV3 implements C2S_ReceiveAddUpReward_17255OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveAddUpReward_17255 DEFAULT_INSTANCE = new C2S_ReceiveAddUpReward_17255();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveAddUpReward_17255> PARSER = new AbstractParser<C2S_ReceiveAddUpReward_17255>() {
         public C2S_ReceiveAddUpReward_17255 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveAddUpReward_17255(input, extensionRegistry);
         }
      };

      private C2S_ReceiveAddUpReward_17255(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveAddUpReward_17255() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveAddUpReward_17255();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveAddUpReward_17255(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardId_ = input.readInt32();
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveAddUpReward_17255_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveAddUpReward_17255_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveAddUpReward_17255.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveAddUpReward_17255)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveAddUpReward_17255 other = (C2S_ReceiveAddUpReward_17255)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
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
            if (this.hasRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveAddUpReward_17255 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_17255)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAddUpReward_17255 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_17255)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_17255 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_17255)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAddUpReward_17255 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_17255)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_17255 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_17255)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAddUpReward_17255 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_17255)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_17255 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveAddUpReward_17255)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAddUpReward_17255 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAddUpReward_17255)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_17255 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveAddUpReward_17255)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAddUpReward_17255 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAddUpReward_17255)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_17255 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveAddUpReward_17255)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAddUpReward_17255 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAddUpReward_17255)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveAddUpReward_17255 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveAddUpReward_17255 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveAddUpReward_17255> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveAddUpReward_17255> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveAddUpReward_17255 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveAddUpReward_17255OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveAddUpReward_17255_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveAddUpReward_17255_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveAddUpReward_17255.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_ReceiveAddUpReward_17255.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveAddUpReward_17255_descriptor;
         }

         public C2S_ReceiveAddUpReward_17255 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_ReceiveAddUpReward_17255.getDefaultInstance();
         }

         public C2S_ReceiveAddUpReward_17255 build() {
            C2S_ReceiveAddUpReward_17255 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveAddUpReward_17255 buildPartial() {
            C2S_ReceiveAddUpReward_17255 result = new C2S_ReceiveAddUpReward_17255(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_ReceiveAddUpReward_17255) {
               return this.mergeFrom((C2S_ReceiveAddUpReward_17255)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveAddUpReward_17255 other) {
            if (other == SplendidCityMsg.C2S_ReceiveAddUpReward_17255.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRewardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveAddUpReward_17255 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveAddUpReward_17255)SplendidCityMsg.C2S_ReceiveAddUpReward_17255.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveAddUpReward_17255)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 1;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
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

   public static final class C2S_SignTotalInfo_17256 extends GeneratedMessageV3 implements C2S_SignTotalInfo_17256OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SignTotalInfo_17256 DEFAULT_INSTANCE = new C2S_SignTotalInfo_17256();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SignTotalInfo_17256> PARSER = new AbstractParser<C2S_SignTotalInfo_17256>() {
         public C2S_SignTotalInfo_17256 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SignTotalInfo_17256(input, extensionRegistry);
         }
      };

      private C2S_SignTotalInfo_17256(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SignTotalInfo_17256() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SignTotalInfo_17256();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SignTotalInfo_17256(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_SignTotalInfo_17256_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_SignTotalInfo_17256_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_17256.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SignTotalInfo_17256)) {
            return super.equals(obj);
         } else {
            C2S_SignTotalInfo_17256 other = (C2S_SignTotalInfo_17256)obj;
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

      public static C2S_SignTotalInfo_17256 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_17256)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_17256 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_17256)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_17256 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_17256)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_17256 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_17256)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_17256 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_17256)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_17256 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_17256)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_17256 parseFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_17256)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_17256 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_17256)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_17256 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_17256)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_17256 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_17256)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_17256 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SignTotalInfo_17256)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_17256 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_17256)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SignTotalInfo_17256 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SignTotalInfo_17256 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SignTotalInfo_17256> parser() {
         return PARSER;
      }

      public Parser<C2S_SignTotalInfo_17256> getParserForType() {
         return PARSER;
      }

      public C2S_SignTotalInfo_17256 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SignTotalInfo_17256OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_SignTotalInfo_17256_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_SignTotalInfo_17256_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_17256.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_SignTotalInfo_17256.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_SignTotalInfo_17256_descriptor;
         }

         public C2S_SignTotalInfo_17256 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_SignTotalInfo_17256.getDefaultInstance();
         }

         public C2S_SignTotalInfo_17256 build() {
            C2S_SignTotalInfo_17256 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SignTotalInfo_17256 buildPartial() {
            C2S_SignTotalInfo_17256 result = new C2S_SignTotalInfo_17256(this);
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
            if (other instanceof C2S_SignTotalInfo_17256) {
               return this.mergeFrom((C2S_SignTotalInfo_17256)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SignTotalInfo_17256 other) {
            if (other == SplendidCityMsg.C2S_SignTotalInfo_17256.getDefaultInstance()) {
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
            C2S_SignTotalInfo_17256 parsedMessage = null;

            try {
               parsedMessage = (C2S_SignTotalInfo_17256)SplendidCityMsg.C2S_SignTotalInfo_17256.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SignTotalInfo_17256)e.getUnfinishedMessage();
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

   public static final class S2C_SignTotalInfo_17257 extends GeneratedMessageV3 implements S2C_SignTotalInfo_17257OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 1;
      private int activityDay_;
      public static final int SIGNGOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList signGotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_SignTotalInfo_17257 DEFAULT_INSTANCE = new S2C_SignTotalInfo_17257();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignTotalInfo_17257> PARSER = new AbstractParser<S2C_SignTotalInfo_17257>() {
         public S2C_SignTotalInfo_17257 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignTotalInfo_17257(input, extensionRegistry);
         }
      };

      private S2C_SignTotalInfo_17257(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignTotalInfo_17257() {
         this.memoizedIsInitialized = -1;
         this.signGotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignTotalInfo_17257();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignTotalInfo_17257(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_SignTotalInfo_17257_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_SignTotalInfo_17257_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_17257.class, Builder.class);
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
         } else if (!(obj instanceof S2C_SignTotalInfo_17257)) {
            return super.equals(obj);
         } else {
            S2C_SignTotalInfo_17257 other = (S2C_SignTotalInfo_17257)obj;
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

      public static S2C_SignTotalInfo_17257 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_17257)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_17257 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_17257)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_17257 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_17257)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_17257 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_17257)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_17257 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_17257)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_17257 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_17257)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_17257 parseFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_17257)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_17257 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_17257)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_17257 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_17257)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_17257 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_17257)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_17257 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignTotalInfo_17257)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_17257 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_17257)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignTotalInfo_17257 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignTotalInfo_17257 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignTotalInfo_17257> parser() {
         return PARSER;
      }

      public Parser<S2C_SignTotalInfo_17257> getParserForType() {
         return PARSER;
      }

      public S2C_SignTotalInfo_17257 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignTotalInfo_17257OrBuilder {
         private int bitField0_;
         private int activityDay_;
         private Internal.IntList signGotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_SignTotalInfo_17257_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_SignTotalInfo_17257_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_17257.class, Builder.class);
         }

         private Builder() {
            this.signGotRewards_ = SplendidCityMsg.S2C_SignTotalInfo_17257.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.signGotRewards_ = SplendidCityMsg.S2C_SignTotalInfo_17257.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_SignTotalInfo_17257.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityDay_ = 0;
            this.bitField0_ &= -2;
            this.signGotRewards_ = SplendidCityMsg.S2C_SignTotalInfo_17257.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_SignTotalInfo_17257_descriptor;
         }

         public S2C_SignTotalInfo_17257 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_SignTotalInfo_17257.getDefaultInstance();
         }

         public S2C_SignTotalInfo_17257 build() {
            S2C_SignTotalInfo_17257 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignTotalInfo_17257 buildPartial() {
            S2C_SignTotalInfo_17257 result = new S2C_SignTotalInfo_17257(this);
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
            if (other instanceof S2C_SignTotalInfo_17257) {
               return this.mergeFrom((S2C_SignTotalInfo_17257)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignTotalInfo_17257 other) {
            if (other == SplendidCityMsg.S2C_SignTotalInfo_17257.getDefaultInstance()) {
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
            S2C_SignTotalInfo_17257 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignTotalInfo_17257)SplendidCityMsg.S2C_SignTotalInfo_17257.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignTotalInfo_17257)e.getUnfinishedMessage();
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
               this.signGotRewards_ = SplendidCityMsg.S2C_SignTotalInfo_17257.mutableCopy(this.signGotRewards_);
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
            this.signGotRewards_ = SplendidCityMsg.S2C_SignTotalInfo_17257.emptyIntList();
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

   public static final class C2S_Sign_17258 extends GeneratedMessageV3 implements C2S_Sign_17258OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_Sign_17258 DEFAULT_INSTANCE = new C2S_Sign_17258();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Sign_17258> PARSER = new AbstractParser<C2S_Sign_17258>() {
         public C2S_Sign_17258 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Sign_17258(input, extensionRegistry);
         }
      };

      private C2S_Sign_17258(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Sign_17258() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Sign_17258();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Sign_17258(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_Sign_17258_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_Sign_17258_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_17258.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Sign_17258)) {
            return super.equals(obj);
         } else {
            C2S_Sign_17258 other = (C2S_Sign_17258)obj;
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

      public static C2S_Sign_17258 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Sign_17258)PARSER.parseFrom(data);
      }

      public static C2S_Sign_17258 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_17258)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_17258 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Sign_17258)PARSER.parseFrom(data);
      }

      public static C2S_Sign_17258 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_17258)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_17258 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Sign_17258)PARSER.parseFrom(data);
      }

      public static C2S_Sign_17258 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_17258)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_17258 parseFrom(InputStream input) throws IOException {
         return (C2S_Sign_17258)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_17258 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_17258)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_17258 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Sign_17258)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Sign_17258 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_17258)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_17258 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Sign_17258)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_17258 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_17258)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Sign_17258 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Sign_17258 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Sign_17258> parser() {
         return PARSER;
      }

      public Parser<C2S_Sign_17258> getParserForType() {
         return PARSER;
      }

      public C2S_Sign_17258 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Sign_17258OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_Sign_17258_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_Sign_17258_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_17258.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_Sign_17258.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_Sign_17258_descriptor;
         }

         public C2S_Sign_17258 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_Sign_17258.getDefaultInstance();
         }

         public C2S_Sign_17258 build() {
            C2S_Sign_17258 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Sign_17258 buildPartial() {
            C2S_Sign_17258 result = new C2S_Sign_17258(this);
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
            if (other instanceof C2S_Sign_17258) {
               return this.mergeFrom((C2S_Sign_17258)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Sign_17258 other) {
            if (other == SplendidCityMsg.C2S_Sign_17258.getDefaultInstance()) {
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
            C2S_Sign_17258 parsedMessage = null;

            try {
               parsedMessage = (C2S_Sign_17258)SplendidCityMsg.C2S_Sign_17258.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Sign_17258)e.getUnfinishedMessage();
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

   public static final class C2S_ShopAddUpInfo_17259 extends GeneratedMessageV3 implements C2S_ShopAddUpInfo_17259OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopAddUpInfo_17259 DEFAULT_INSTANCE = new C2S_ShopAddUpInfo_17259();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopAddUpInfo_17259> PARSER = new AbstractParser<C2S_ShopAddUpInfo_17259>() {
         public C2S_ShopAddUpInfo_17259 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopAddUpInfo_17259(input, extensionRegistry);
         }
      };

      private C2S_ShopAddUpInfo_17259(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopAddUpInfo_17259() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopAddUpInfo_17259();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopAddUpInfo_17259(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ShopAddUpInfo_17259_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ShopAddUpInfo_17259_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_17259.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopAddUpInfo_17259)) {
            return super.equals(obj);
         } else {
            C2S_ShopAddUpInfo_17259 other = (C2S_ShopAddUpInfo_17259)obj;
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

      public static C2S_ShopAddUpInfo_17259 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_17259)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_17259 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_17259)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_17259 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_17259)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_17259 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_17259)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_17259 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_17259)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_17259 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_17259)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_17259 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_17259)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_17259 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_17259)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_17259 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_17259)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_17259 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_17259)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_17259 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_17259)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_17259 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_17259)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopAddUpInfo_17259 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopAddUpInfo_17259 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopAddUpInfo_17259> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopAddUpInfo_17259> getParserForType() {
         return PARSER;
      }

      public C2S_ShopAddUpInfo_17259 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopAddUpInfo_17259OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ShopAddUpInfo_17259_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ShopAddUpInfo_17259_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_17259.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_ShopAddUpInfo_17259.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ShopAddUpInfo_17259_descriptor;
         }

         public C2S_ShopAddUpInfo_17259 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_ShopAddUpInfo_17259.getDefaultInstance();
         }

         public C2S_ShopAddUpInfo_17259 build() {
            C2S_ShopAddUpInfo_17259 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopAddUpInfo_17259 buildPartial() {
            C2S_ShopAddUpInfo_17259 result = new C2S_ShopAddUpInfo_17259(this);
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
            if (other instanceof C2S_ShopAddUpInfo_17259) {
               return this.mergeFrom((C2S_ShopAddUpInfo_17259)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopAddUpInfo_17259 other) {
            if (other == SplendidCityMsg.C2S_ShopAddUpInfo_17259.getDefaultInstance()) {
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
            C2S_ShopAddUpInfo_17259 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopAddUpInfo_17259)SplendidCityMsg.C2S_ShopAddUpInfo_17259.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopAddUpInfo_17259)e.getUnfinishedMessage();
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

   public static final class S2C_ShopAddUpInfo_17260 extends GeneratedMessageV3 implements S2C_ShopAddUpInfo_17260OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAILYRECHARGE_FIELD_NUMBER = 1;
      private int dailyRecharge_;
      public static final int GOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList gotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopAddUpInfo_17260 DEFAULT_INSTANCE = new S2C_ShopAddUpInfo_17260();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopAddUpInfo_17260> PARSER = new AbstractParser<S2C_ShopAddUpInfo_17260>() {
         public S2C_ShopAddUpInfo_17260 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopAddUpInfo_17260(input, extensionRegistry);
         }
      };

      private S2C_ShopAddUpInfo_17260(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopAddUpInfo_17260() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopAddUpInfo_17260();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopAddUpInfo_17260(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ShopAddUpInfo_17260_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ShopAddUpInfo_17260_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_17260.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ShopAddUpInfo_17260)) {
            return super.equals(obj);
         } else {
            S2C_ShopAddUpInfo_17260 other = (S2C_ShopAddUpInfo_17260)obj;
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

      public static S2C_ShopAddUpInfo_17260 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_17260)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_17260 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_17260)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_17260 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_17260)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_17260 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_17260)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_17260 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_17260)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_17260 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_17260)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_17260 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_17260)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_17260 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_17260)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_17260 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_17260)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_17260 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_17260)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_17260 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_17260)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_17260 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_17260)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopAddUpInfo_17260 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopAddUpInfo_17260 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopAddUpInfo_17260> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopAddUpInfo_17260> getParserForType() {
         return PARSER;
      }

      public S2C_ShopAddUpInfo_17260 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopAddUpInfo_17260OrBuilder {
         private int bitField0_;
         private int dailyRecharge_;
         private Internal.IntList gotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ShopAddUpInfo_17260_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ShopAddUpInfo_17260_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_17260.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = SplendidCityMsg.S2C_ShopAddUpInfo_17260.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = SplendidCityMsg.S2C_ShopAddUpInfo_17260.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_ShopAddUpInfo_17260.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dailyRecharge_ = 0;
            this.bitField0_ &= -2;
            this.gotRewards_ = SplendidCityMsg.S2C_ShopAddUpInfo_17260.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ShopAddUpInfo_17260_descriptor;
         }

         public S2C_ShopAddUpInfo_17260 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_ShopAddUpInfo_17260.getDefaultInstance();
         }

         public S2C_ShopAddUpInfo_17260 build() {
            S2C_ShopAddUpInfo_17260 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopAddUpInfo_17260 buildPartial() {
            S2C_ShopAddUpInfo_17260 result = new S2C_ShopAddUpInfo_17260(this);
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
            if (other instanceof S2C_ShopAddUpInfo_17260) {
               return this.mergeFrom((S2C_ShopAddUpInfo_17260)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopAddUpInfo_17260 other) {
            if (other == SplendidCityMsg.S2C_ShopAddUpInfo_17260.getDefaultInstance()) {
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
            S2C_ShopAddUpInfo_17260 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopAddUpInfo_17260)SplendidCityMsg.S2C_ShopAddUpInfo_17260.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopAddUpInfo_17260)e.getUnfinishedMessage();
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
               this.gotRewards_ = SplendidCityMsg.S2C_ShopAddUpInfo_17260.mutableCopy(this.gotRewards_);
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
            this.gotRewards_ = SplendidCityMsg.S2C_ShopAddUpInfo_17260.emptyIntList();
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

   public static final class C2S_ReceiveShopAddUpReward_17261 extends GeneratedMessageV3 implements C2S_ReceiveShopAddUpReward_17261OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveShopAddUpReward_17261 DEFAULT_INSTANCE = new C2S_ReceiveShopAddUpReward_17261();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveShopAddUpReward_17261> PARSER = new AbstractParser<C2S_ReceiveShopAddUpReward_17261>() {
         public C2S_ReceiveShopAddUpReward_17261 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveShopAddUpReward_17261(input, extensionRegistry);
         }
      };

      private C2S_ReceiveShopAddUpReward_17261(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveShopAddUpReward_17261() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveShopAddUpReward_17261();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveShopAddUpReward_17261(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_17261_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_17261_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_17261.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveShopAddUpReward_17261)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveShopAddUpReward_17261 other = (C2S_ReceiveShopAddUpReward_17261)obj;
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

      public static C2S_ReceiveShopAddUpReward_17261 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_17261)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_17261)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_17261)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_17261)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_17261)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_17261)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_17261)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_17261)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_17261)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_17261)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_17261)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_17261 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_17261)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveShopAddUpReward_17261 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveShopAddUpReward_17261 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveShopAddUpReward_17261> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveShopAddUpReward_17261> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveShopAddUpReward_17261 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveShopAddUpReward_17261OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_17261_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_17261_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_17261.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_ReceiveShopAddUpReward_17261.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_17261_descriptor;
         }

         public C2S_ReceiveShopAddUpReward_17261 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_ReceiveShopAddUpReward_17261.getDefaultInstance();
         }

         public C2S_ReceiveShopAddUpReward_17261 build() {
            C2S_ReceiveShopAddUpReward_17261 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveShopAddUpReward_17261 buildPartial() {
            C2S_ReceiveShopAddUpReward_17261 result = new C2S_ReceiveShopAddUpReward_17261(this);
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
            if (other instanceof C2S_ReceiveShopAddUpReward_17261) {
               return this.mergeFrom((C2S_ReceiveShopAddUpReward_17261)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveShopAddUpReward_17261 other) {
            if (other == SplendidCityMsg.C2S_ReceiveShopAddUpReward_17261.getDefaultInstance()) {
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
            C2S_ReceiveShopAddUpReward_17261 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveShopAddUpReward_17261)SplendidCityMsg.C2S_ReceiveShopAddUpReward_17261.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveShopAddUpReward_17261)e.getUnfinishedMessage();
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

   public static final class C2S_ActivityInfo_17270 extends GeneratedMessageV3 implements C2S_ActivityInfo_17270OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_17270 DEFAULT_INSTANCE = new C2S_ActivityInfo_17270();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_17270> PARSER = new AbstractParser<C2S_ActivityInfo_17270>() {
         public C2S_ActivityInfo_17270 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_17270(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_17270(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_17270() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_17270();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_17270(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ActivityInfo_17270_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ActivityInfo_17270_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_17270.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_17270)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_17270 other = (C2S_ActivityInfo_17270)obj;
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

      public static C2S_ActivityInfo_17270 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17270)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_17270 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17270)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_17270 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17270)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_17270 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17270)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_17270 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17270)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_17270 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17270)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_17270 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_17270)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_17270 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_17270)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_17270 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_17270)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_17270 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_17270)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_17270 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_17270)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_17270 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_17270)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_17270 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_17270 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_17270> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_17270> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_17270 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_17270OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ActivityInfo_17270_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ActivityInfo_17270_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_17270.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_ActivityInfo_17270.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ActivityInfo_17270_descriptor;
         }

         public C2S_ActivityInfo_17270 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_ActivityInfo_17270.getDefaultInstance();
         }

         public C2S_ActivityInfo_17270 build() {
            C2S_ActivityInfo_17270 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_17270 buildPartial() {
            C2S_ActivityInfo_17270 result = new C2S_ActivityInfo_17270(this);
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
            if (other instanceof C2S_ActivityInfo_17270) {
               return this.mergeFrom((C2S_ActivityInfo_17270)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_17270 other) {
            if (other == SplendidCityMsg.C2S_ActivityInfo_17270.getDefaultInstance()) {
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
            C2S_ActivityInfo_17270 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_17270)SplendidCityMsg.C2S_ActivityInfo_17270.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_17270)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_17271 extends GeneratedMessageV3 implements S2C_ActivityInfo_17271OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 2;
      private int activityDay_;
      public static final int SMASHEGGSTAGE_FIELD_NUMBER = 3;
      private int smashEggStage_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_17271 DEFAULT_INSTANCE = new S2C_ActivityInfo_17271();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_17271> PARSER = new AbstractParser<S2C_ActivityInfo_17271>() {
         public S2C_ActivityInfo_17271 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_17271(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_17271(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_17271() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_17271();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_17271(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 24:
                        this.bitField0_ |= 4;
                        this.smashEggStage_ = input.readInt32();
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ActivityInfo_17271_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ActivityInfo_17271_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_17271.class, Builder.class);
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

      public boolean hasSmashEggStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSmashEggStage() {
         return this.smashEggStage_;
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
         } else if (!this.hasSmashEggStage()) {
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

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.smashEggStage_);
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

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.smashEggStage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_17271)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_17271 other = (S2C_ActivityInfo_17271)obj;
            if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else if (this.hasActivityDay() != other.hasActivityDay()) {
               return false;
            } else if (this.hasActivityDay() && this.getActivityDay() != other.getActivityDay()) {
               return false;
            } else if (this.hasSmashEggStage() != other.hasSmashEggStage()) {
               return false;
            } else if (this.hasSmashEggStage() && this.getSmashEggStage() != other.getSmashEggStage()) {
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

            if (this.hasSmashEggStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSmashEggStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_17271 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17271)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_17271 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17271)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_17271 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17271)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_17271 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17271)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_17271 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17271)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_17271 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17271)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_17271 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_17271)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_17271 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_17271)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_17271 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_17271)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_17271 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_17271)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_17271 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_17271)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_17271 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_17271)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_17271 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_17271 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_17271> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_17271> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_17271 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_17271OrBuilder {
         private int bitField0_;
         private int openDay_;
         private int activityDay_;
         private int smashEggStage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ActivityInfo_17271_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ActivityInfo_17271_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_17271.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.S2C_ActivityInfo_17271.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.openDay_ = 0;
            this.bitField0_ &= -2;
            this.activityDay_ = 0;
            this.bitField0_ &= -3;
            this.smashEggStage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ActivityInfo_17271_descriptor;
         }

         public S2C_ActivityInfo_17271 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_ActivityInfo_17271.getDefaultInstance();
         }

         public S2C_ActivityInfo_17271 build() {
            S2C_ActivityInfo_17271 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_17271 buildPartial() {
            S2C_ActivityInfo_17271 result = new S2C_ActivityInfo_17271(this);
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

            if ((from_bitField0_ & 4) != 0) {
               result.smashEggStage_ = this.smashEggStage_;
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
            if (other instanceof S2C_ActivityInfo_17271) {
               return this.mergeFrom((S2C_ActivityInfo_17271)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_17271 other) {
            if (other == SplendidCityMsg.S2C_ActivityInfo_17271.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               if (other.hasActivityDay()) {
                  this.setActivityDay(other.getActivityDay());
               }

               if (other.hasSmashEggStage()) {
                  this.setSmashEggStage(other.getSmashEggStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOpenDay()) {
               return false;
            } else if (!this.hasActivityDay()) {
               return false;
            } else {
               return this.hasSmashEggStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_17271 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_17271)SplendidCityMsg.S2C_ActivityInfo_17271.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_17271)e.getUnfinishedMessage();
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

         public boolean hasSmashEggStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSmashEggStage() {
            return this.smashEggStage_;
         }

         public Builder setSmashEggStage(int value) {
            this.bitField0_ |= 4;
            this.smashEggStage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSmashEggStage() {
            this.bitField0_ &= -5;
            this.smashEggStage_ = 0;
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_MyDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            if (SplendidCityMsg.MyDrawRecord.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         public MyDrawRecord getDefaultInstanceForType() {
            return SplendidCityMsg.MyDrawRecord.getDefaultInstance();
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
            if (other == SplendidCityMsg.MyDrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = SplendidCityMsg.MyDrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
               parsedMessage = (MyDrawRecord)SplendidCityMsg.MyDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = SplendidCityMsg.MyDrawRecord.getDefaultInstance().getPlayerName();
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (SplendidCityMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return SplendidCityMsg.ServerDrawRecord.getDefaultInstance();
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
            if (other == SplendidCityMsg.ServerDrawRecord.getDefaultInstance()) {
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
               parsedMessage = (ServerDrawRecord)SplendidCityMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = SplendidCityMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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

   public static final class C2S_DrawRecord_17272 extends GeneratedMessageV3 implements C2S_DrawRecord_17272OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_17272 DEFAULT_INSTANCE = new C2S_DrawRecord_17272();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_17272> PARSER = new AbstractParser<C2S_DrawRecord_17272>() {
         public C2S_DrawRecord_17272 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_17272(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_17272(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_17272() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_17272();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_17272(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_DrawRecord_17272_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_DrawRecord_17272_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_17272.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_17272)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_17272 other = (C2S_DrawRecord_17272)obj;
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

      public static C2S_DrawRecord_17272 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17272)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_17272 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17272)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_17272 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17272)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_17272 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17272)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_17272 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17272)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_17272 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17272)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_17272 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_17272)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_17272 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_17272)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_17272 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_17272)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_17272 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_17272)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_17272 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_17272)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_17272 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_17272)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_17272 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_17272 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_17272> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_17272> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_17272 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_17272OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_DrawRecord_17272_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_DrawRecord_17272_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_17272.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_DrawRecord_17272.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_DrawRecord_17272_descriptor;
         }

         public C2S_DrawRecord_17272 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_DrawRecord_17272.getDefaultInstance();
         }

         public C2S_DrawRecord_17272 build() {
            C2S_DrawRecord_17272 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_17272 buildPartial() {
            C2S_DrawRecord_17272 result = new C2S_DrawRecord_17272(this);
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
            if (other instanceof C2S_DrawRecord_17272) {
               return this.mergeFrom((C2S_DrawRecord_17272)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_17272 other) {
            if (other == SplendidCityMsg.C2S_DrawRecord_17272.getDefaultInstance()) {
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
            C2S_DrawRecord_17272 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_17272)SplendidCityMsg.C2S_DrawRecord_17272.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_17272)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_17273 extends GeneratedMessageV3 implements S2C_DrawRecord_17273OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<MyDrawRecord> myRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_17273 DEFAULT_INSTANCE = new S2C_DrawRecord_17273();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_17273> PARSER = new AbstractParser<S2C_DrawRecord_17273>() {
         public S2C_DrawRecord_17273 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_17273(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_17273(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_17273() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_17273();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_17273(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(SplendidCityMsg.MyDrawRecord.PARSER, extensionRegistry));
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_DrawRecord_17273_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_DrawRecord_17273_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_17273.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawRecord_17273)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_17273 other = (S2C_DrawRecord_17273)obj;
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

      public static S2C_DrawRecord_17273 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17273)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_17273 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17273)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_17273 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17273)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_17273 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17273)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_17273 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17273)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_17273 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17273)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_17273 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_17273)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_17273 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_17273)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_17273 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_17273)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_17273 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_17273)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_17273 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_17273)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_17273 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_17273)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_17273 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_17273 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_17273> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_17273> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_17273 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_17273OrBuilder {
         private int bitField0_;
         private List<MyDrawRecord> myRecord_;
         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> myRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_DrawRecord_17273_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_DrawRecord_17273_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_17273.class, Builder.class);
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
            if (SplendidCityMsg.S2C_DrawRecord_17273.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_DrawRecord_17273_descriptor;
         }

         public S2C_DrawRecord_17273 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_DrawRecord_17273.getDefaultInstance();
         }

         public S2C_DrawRecord_17273 build() {
            S2C_DrawRecord_17273 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_17273 buildPartial() {
            S2C_DrawRecord_17273 result = new S2C_DrawRecord_17273(this);
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
            if (other instanceof S2C_DrawRecord_17273) {
               return this.mergeFrom((S2C_DrawRecord_17273)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_17273 other) {
            if (other == SplendidCityMsg.S2C_DrawRecord_17273.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = SplendidCityMsg.S2C_DrawRecord_17273.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
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
            S2C_DrawRecord_17273 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_17273)SplendidCityMsg.S2C_DrawRecord_17273.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_17273)e.getUnfinishedMessage();
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
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(SplendidCityMsg.MyDrawRecord.getDefaultInstance());
         }

         public MyDrawRecord.Builder addMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, SplendidCityMsg.MyDrawRecord.getDefaultInstance());
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

   public static final class C2S_ServerDrawRecord_17274 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_17274OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_17274 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_17274();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_17274> PARSER = new AbstractParser<C2S_ServerDrawRecord_17274>() {
         public C2S_ServerDrawRecord_17274 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_17274(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_17274(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_17274() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_17274();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_17274(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ServerDrawRecord_17274_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ServerDrawRecord_17274_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_17274.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_17274)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_17274 other = (C2S_ServerDrawRecord_17274)obj;
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

      public static C2S_ServerDrawRecord_17274 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17274)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_17274 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17274)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17274 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17274)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_17274 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17274)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17274 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17274)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_17274 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17274)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17274 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_17274)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_17274 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_17274)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17274 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_17274)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_17274 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_17274)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17274 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_17274)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_17274 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_17274)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_17274 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_17274 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_17274> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_17274> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_17274 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_17274OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ServerDrawRecord_17274_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ServerDrawRecord_17274_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_17274.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SplendidCityMsg.C2S_ServerDrawRecord_17274.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_C2S_ServerDrawRecord_17274_descriptor;
         }

         public C2S_ServerDrawRecord_17274 getDefaultInstanceForType() {
            return SplendidCityMsg.C2S_ServerDrawRecord_17274.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_17274 build() {
            C2S_ServerDrawRecord_17274 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_17274 buildPartial() {
            C2S_ServerDrawRecord_17274 result = new C2S_ServerDrawRecord_17274(this);
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
            if (other instanceof C2S_ServerDrawRecord_17274) {
               return this.mergeFrom((C2S_ServerDrawRecord_17274)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_17274 other) {
            if (other == SplendidCityMsg.C2S_ServerDrawRecord_17274.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_17274 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_17274)SplendidCityMsg.C2S_ServerDrawRecord_17274.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_17274)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_17275 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_17275OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_17275 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_17275();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_17275> PARSER = new AbstractParser<S2C_ServerDrawRecord_17275>() {
         public S2C_ServerDrawRecord_17275 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_17275(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_17275(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_17275() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_17275();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_17275(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.serverRecord_.add(input.readMessage(SplendidCityMsg.ServerDrawRecord.PARSER, extensionRegistry));
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
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ServerDrawRecord_17275_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ServerDrawRecord_17275_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_17275.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_17275)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_17275 other = (S2C_ServerDrawRecord_17275)obj;
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

      public static S2C_ServerDrawRecord_17275 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17275)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_17275 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17275)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17275 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17275)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_17275 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17275)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17275 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17275)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_17275 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17275)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17275 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_17275)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_17275 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_17275)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17275 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_17275)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_17275 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_17275)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17275 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_17275)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_17275 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_17275)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_17275 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_17275 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_17275> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_17275> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_17275 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_17275OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ServerDrawRecord_17275_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ServerDrawRecord_17275_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_17275.class, Builder.class);
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
            if (SplendidCityMsg.S2C_ServerDrawRecord_17275.alwaysUseFieldBuilders) {
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
            return SplendidCityMsg.internal_static_splendidCity_com_gzbz_protobuf_S2C_ServerDrawRecord_17275_descriptor;
         }

         public S2C_ServerDrawRecord_17275 getDefaultInstanceForType() {
            return SplendidCityMsg.S2C_ServerDrawRecord_17275.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_17275 build() {
            S2C_ServerDrawRecord_17275 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_17275 buildPartial() {
            S2C_ServerDrawRecord_17275 result = new S2C_ServerDrawRecord_17275(this);
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
            if (other instanceof S2C_ServerDrawRecord_17275) {
               return this.mergeFrom((S2C_ServerDrawRecord_17275)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_17275 other) {
            if (other == SplendidCityMsg.S2C_ServerDrawRecord_17275.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = SplendidCityMsg.S2C_ServerDrawRecord_17275.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_17275 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_17275)SplendidCityMsg.S2C_ServerDrawRecord_17275.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_17275)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(SplendidCityMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, SplendidCityMsg.ServerDrawRecord.getDefaultInstance());
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

   public interface C2S_ActivityInfo_17270OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_AddUpTotalInfo_17253OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawRecord_17272OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FancyReward_17221OrBuilder extends MessageOrBuilder {
      boolean hasItemIndex();

      int getItemIndex();
   }

   public interface C2S_GameAddRandomDice_17205OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GameBuildingReward_17217OrBuilder extends MessageOrBuilder {
      boolean hasBuildingId();

      int getBuildingId();

      boolean hasLv();

      int getLv();
   }

   public interface C2S_GameEvent_17209OrBuilder extends MessageOrBuilder {
      boolean hasEvent();

      GameEvent getEvent();

      GameEventOrBuilder getEventOrBuilder();
   }

   public interface C2S_GameGoldDiceBuy_17207OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GameMain_17201OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GameRollDice_17203OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_GameTaskCommit_17213OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_GameTask_17211OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenEggUi_17229OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ReceiveAddUpReward_17255OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_ReceiveShopAddUpReward_17261OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ServerDrawRecord_17274OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShopAddUpInfo_17259OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SignTotalInfo_17256OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Sign_17258OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface C2S_SmashEgg_17223OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();

      boolean hasIndex();

      int getIndex();
   }

   public interface C2S_TakeLuckReward_17227OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
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

   public interface S2C_ActivityInfo_17271OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      boolean hasActivityDay();

      int getActivityDay();

      boolean hasSmashEggStage();

      int getSmashEggStage();
   }

   public interface S2C_AddUpTotalInfo_17254OrBuilder extends MessageOrBuilder {
      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);

      boolean hasStageRecharge();

      int getStageRecharge();
   }

   public interface S2C_DrawRecord_17273OrBuilder extends MessageOrBuilder {
      List<MyDrawRecord> getMyRecordList();

      MyDrawRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList();

      MyDrawRecordOrBuilder getMyRecordOrBuilder(int index);
   }

   public interface S2C_FancyReward_17222OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasItemIndex();

      int getItemIndex();
   }

   public interface S2C_GameAddRandomDice_17206OrBuilder extends MessageOrBuilder {
      boolean hasDiceRecover();

      int getDiceRecover();
   }

   public interface S2C_GameBuildingReward_17218OrBuilder extends MessageOrBuilder {
      boolean hasBuildingId();

      int getBuildingId();

      boolean hasLv();

      int getLv();
   }

   public interface S2C_GameEvent_17210OrBuilder extends MessageOrBuilder {
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

   public interface S2C_GameGoldDiceBuy_17208OrBuilder extends MessageOrBuilder {
      boolean hasBuyGoldDiceNum();

      int getBuyGoldDiceNum();
   }

   public interface S2C_GameMain_17202OrBuilder extends MessageOrBuilder {
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

   public interface S2C_GameRollDice_17204OrBuilder extends MessageOrBuilder {
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

   public interface S2C_GameTaskCommit_17214OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_GameTaskNotify_17216OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_GameTask_17212OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_OpenEggUi_17230OrBuilder extends MessageOrBuilder {
      boolean hasFancyId();

      int getFancyId();

      List<CommonMsg.MapDataII> getSeniorRewardsList();

      CommonMsg.MapDataII getSeniorRewards(int index);

      int getSeniorRewardsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index);

      boolean hasSmashEggNum();

      int getSmashEggNum();

      List<Integer> getTakedLuckList();

      int getTakedLuckCount();

      int getTakedLuck(int index);

      List<CommonMsg.MapDataII> getEggsList();

      CommonMsg.MapDataII getEggs(int index);

      int getEggsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getEggsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getEggsOrBuilder(int index);

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_ServerDrawRecord_17275OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_ShopAddUpInfo_17260OrBuilder extends MessageOrBuilder {
      boolean hasDailyRecharge();

      int getDailyRecharge();

      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);
   }

   public interface S2C_SignTotalInfo_17257OrBuilder extends MessageOrBuilder {
      boolean hasActivityDay();

      int getActivityDay();

      List<Integer> getSignGotRewardsList();

      int getSignGotRewardsCount();

      int getSignGotRewards(int index);
   }

   public interface S2C_SmashEgg_17224OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasIndex();

      int getIndex();

      boolean hasIsReset();

      boolean getIsReset();

      List<CommonMsg.MapDataII> getIndexsList();

      CommonMsg.MapDataII getIndexs(int index);

      int getIndexsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getIndexsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getIndexsOrBuilder(int index);

      List<CommonMsg.MapDataII> getSeniorNumList();

      CommonMsg.MapDataII getSeniorNum(int index);

      int getSeniorNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index);

      boolean hasSmashEggNum();

      int getSmashEggNum();

      boolean hasIsHaveFancy();

      boolean getIsHaveFancy();

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_TakeLuckReward_17228OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<Integer> getTakedIdList();

      int getTakedIdCount();

      int getTakedId(int index);
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
