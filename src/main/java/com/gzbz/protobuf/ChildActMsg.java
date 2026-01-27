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

public final class ChildActMsg {
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_ActivityInfo_24901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_ActivityInfo_24901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_ActivityInfo_24902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_ActivityInfo_24902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_ShopAddUpInfo_24903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_ShopAddUpInfo_24903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_ShopAddUpInfo_24904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_ShopAddUpInfo_24904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24905_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_SignTotalInfo_24906_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_SignTotalInfo_24906_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_SignTotalInfo_24907_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_SignTotalInfo_24907_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_Sign_24908_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_Sign_24908_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_PickUpInfo_24909_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_PickUpInfo_24909_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_PickUpGameObjInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_PickUpGameObjInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_PickUpInfo_24910_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_PickUpInfo_24910_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_PickUpShoot_24911_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_PickUpShoot_24911_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_PickUpShoot_24912_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_PickUpShoot_24912_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_BuyTicket_24925_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_BuyTicket_24925_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_PickUpGameControl_24926_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_PickUpGameControl_24926_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_FancyReward_24913_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_FancyReward_24913_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_FancyReward_24914_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_FancyReward_24914_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_OpenEggUi_24915_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_OpenEggUi_24915_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_OpenEggUi_24916_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_OpenEggUi_24916_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_SmashEgg_24917_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_SmashEgg_24917_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_SmashEgg_24918_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_SmashEgg_24918_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_TakeLuckReward_24919_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_TakeLuckReward_24919_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_TakeLuckReward_24920_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_TakeLuckReward_24920_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_DrawRecord_24921_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_DrawRecord_24921_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_DrawRecord_24922_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_DrawRecord_24922_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_C2S_ServerDrawRecord_24923_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_C2S_ServerDrawRecord_24923_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_S2C_ServerDrawRecord_24924_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_S2C_ServerDrawRecord_24924_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_MyDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_childAct_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_childAct_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ChildActMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eChildAct.proto\u0012\u001achildAct.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0018\n\u0016C2S_ActivityInfo_24901\"U\n\u0016S2C_ActivityInfo_24902\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rsmashEggStage\u0018\u0003 \u0002(\u0005\"\u0019\n\u0017C2S_ShopAddUpInfo_24903\"D\n\u0017S2C_ShopAddUpInfo_24904\u0012\u0015\n\rdailyRecharge\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRewards\u0018\u0002 \u0003(\u0005\".\n C2S_ReceiveShopAddUpReward_24905\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_SignTotalInfo_24906\"F\n\u0017S2C_SignTotalInfo_24907\u0012\u0013\n\u000bactivityDay\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esignGotRewards\u0018\u0002 \u0003(\u0005\"\u001d\n\u000eC2S_Sign_24908\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_PickUpInfo_24909\"4\n\u0011PickUpGameObjInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000blineAndType\u0018\u0002 \u0002(\u0005\"³\u0001\n\u0014S2C_PickUpInfo_24910\u0012\r\n\u0005point\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eticketBuyTimes\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rticketBuyCost\u0018\u0003 \u0002(\u0005\u0012\u0015\n\rgameStartTime\u0018\u0004 \u0002(\u0005\u0012F\n\u000fgameObjLineInfo\u0018\u0005 \u0003(\u000b2-.childAct.com.gzbz.protobuf.PickUpGameObjInfo\"(\n\u0015C2S_PickUpShoot_24911\u0012\u000f\n\u0007shootId\u0018\u0001 \u0002(\u0005\"H\n\u0015S2C_PickUpShoot_24912\u0012\u0010\n\bcurPoint\u0018\u0001 \u0002(\u0005\u0012\u001d\n\u0015pickUpObjectTypeCount\u0018\u0002 \u0003(\u0005\"\u0015\n\u0013C2S_BuyTicket_24925\"/\n\u001bC2S_PickUpGameControl_24926\u0012\u0010\n\bswitchOn\u0018\u0001 \u0002(\u0005\"*\n\u0015C2S_FancyReward_24913\u0012\u0011\n\titemIndex\u0018\u0001 \u0002(\u0005\":\n\u0015S2C_FancyReward_24914\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0011\n\titemIndex\u0018\u0002 \u0002(\u0005\"\u0015\n\u0013C2S_OpenEggUi_24915\"Ê\u0001\n\u0013S2C_OpenEggUi_24916\u0012\u000f\n\u0007fancyId\u0018\u0001 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bsmashEggNum\u0018\u0003 \u0002(\u0005\u0012\u0011\n\ttakedLuck\u0018\u0004 \u0003(\u0005\u0012\u001f\n\u0004eggs\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\u0006 \u0001(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0007 \u0002(\u0005\"0\n\u0012C2S_SmashEgg_24917\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005index\u0018\u0002 \u0002(\u0005\"è\u0001\n\u0012S2C_SmashEgg_24918\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005index\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007isReset\u0018\u0003 \u0002(\b\u0012!\n\u0006indexs\u0018\u0004 \u0003(\u000b2\u0011.common.MapDataII\u0012$\n\tseniorNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bsmashEggNum\u0018\u0006 \u0002(\u0005\u0012\u0013\n\u000bisHaveFancy\u0018\u0007 \u0001(\b\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0001(\u0005\u0012\u0012\n\nrecruitNum\u0018\t \u0002(\u0005\",\n\u0018C2S_TakeLuckReward_24919\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\";\n\u0018S2C_TakeLuckReward_24920\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007takedId\u0018\u0002 \u0003(\u0005\"\u0016\n\u0014C2S_DrawRecord_24921\"R\n\u0014S2C_DrawRecord_24922\u0012:\n\bmyRecord\u0018\u0001 \u0003(\u000b2(.childAct.com.gzbz.protobuf.MyDrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_24923\"`\n\u001aS2C_ServerDrawRecord_24924\u0012B\n\fserverRecord\u0018\u0001 \u0003(\u000b2,.childAct.com.gzbz.protobuf.ServerDrawRecord\"Z\n\fMyDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"r\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0005 \u0001(\u0005B\"\n\u0011com.gzbz.protobufB\u000bChildActMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_childAct_com_gzbz_protobuf_C2S_ActivityInfo_24901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_childAct_com_gzbz_protobuf_C2S_ActivityInfo_24901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_ActivityInfo_24901_descriptor, new String[0]);
      internal_static_childAct_com_gzbz_protobuf_S2C_ActivityInfo_24902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_childAct_com_gzbz_protobuf_S2C_ActivityInfo_24902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_ActivityInfo_24902_descriptor, new String[]{"OpenDay", "ActivityDay", "SmashEggStage"});
      internal_static_childAct_com_gzbz_protobuf_C2S_ShopAddUpInfo_24903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_childAct_com_gzbz_protobuf_C2S_ShopAddUpInfo_24903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_ShopAddUpInfo_24903_descriptor, new String[0]);
      internal_static_childAct_com_gzbz_protobuf_S2C_ShopAddUpInfo_24904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_childAct_com_gzbz_protobuf_S2C_ShopAddUpInfo_24904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_ShopAddUpInfo_24904_descriptor, new String[]{"DailyRecharge", "GotRewards"});
      internal_static_childAct_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_childAct_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24905_descriptor, new String[]{"Id"});
      internal_static_childAct_com_gzbz_protobuf_C2S_SignTotalInfo_24906_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_childAct_com_gzbz_protobuf_C2S_SignTotalInfo_24906_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_SignTotalInfo_24906_descriptor, new String[0]);
      internal_static_childAct_com_gzbz_protobuf_S2C_SignTotalInfo_24907_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_childAct_com_gzbz_protobuf_S2C_SignTotalInfo_24907_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_SignTotalInfo_24907_descriptor, new String[]{"ActivityDay", "SignGotRewards"});
      internal_static_childAct_com_gzbz_protobuf_C2S_Sign_24908_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_childAct_com_gzbz_protobuf_C2S_Sign_24908_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_Sign_24908_descriptor, new String[]{"Day"});
      internal_static_childAct_com_gzbz_protobuf_C2S_PickUpInfo_24909_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_childAct_com_gzbz_protobuf_C2S_PickUpInfo_24909_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_PickUpInfo_24909_descriptor, new String[0]);
      internal_static_childAct_com_gzbz_protobuf_PickUpGameObjInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_childAct_com_gzbz_protobuf_PickUpGameObjInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_PickUpGameObjInfo_descriptor, new String[]{"Id", "LineAndType"});
      internal_static_childAct_com_gzbz_protobuf_S2C_PickUpInfo_24910_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_childAct_com_gzbz_protobuf_S2C_PickUpInfo_24910_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_PickUpInfo_24910_descriptor, new String[]{"Point", "TicketBuyTimes", "TicketBuyCost", "GameStartTime", "GameObjLineInfo"});
      internal_static_childAct_com_gzbz_protobuf_C2S_PickUpShoot_24911_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_childAct_com_gzbz_protobuf_C2S_PickUpShoot_24911_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_PickUpShoot_24911_descriptor, new String[]{"ShootId"});
      internal_static_childAct_com_gzbz_protobuf_S2C_PickUpShoot_24912_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_childAct_com_gzbz_protobuf_S2C_PickUpShoot_24912_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_PickUpShoot_24912_descriptor, new String[]{"CurPoint", "PickUpObjectTypeCount"});
      internal_static_childAct_com_gzbz_protobuf_C2S_BuyTicket_24925_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_childAct_com_gzbz_protobuf_C2S_BuyTicket_24925_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_BuyTicket_24925_descriptor, new String[0]);
      internal_static_childAct_com_gzbz_protobuf_C2S_PickUpGameControl_24926_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_childAct_com_gzbz_protobuf_C2S_PickUpGameControl_24926_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_PickUpGameControl_24926_descriptor, new String[]{"SwitchOn"});
      internal_static_childAct_com_gzbz_protobuf_C2S_FancyReward_24913_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_childAct_com_gzbz_protobuf_C2S_FancyReward_24913_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_FancyReward_24913_descriptor, new String[]{"ItemIndex"});
      internal_static_childAct_com_gzbz_protobuf_S2C_FancyReward_24914_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_childAct_com_gzbz_protobuf_S2C_FancyReward_24914_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_FancyReward_24914_descriptor, new String[]{"Result", "ItemIndex"});
      internal_static_childAct_com_gzbz_protobuf_C2S_OpenEggUi_24915_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_childAct_com_gzbz_protobuf_C2S_OpenEggUi_24915_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_OpenEggUi_24915_descriptor, new String[0]);
      internal_static_childAct_com_gzbz_protobuf_S2C_OpenEggUi_24916_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_childAct_com_gzbz_protobuf_S2C_OpenEggUi_24916_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_OpenEggUi_24916_descriptor, new String[]{"FancyId", "SeniorRewards", "SmashEggNum", "TakedLuck", "Eggs", "FancyGroupDrawTimes", "RecruitNum"});
      internal_static_childAct_com_gzbz_protobuf_C2S_SmashEgg_24917_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_childAct_com_gzbz_protobuf_C2S_SmashEgg_24917_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_SmashEgg_24917_descriptor, new String[]{"Num", "Index"});
      internal_static_childAct_com_gzbz_protobuf_S2C_SmashEgg_24918_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_childAct_com_gzbz_protobuf_S2C_SmashEgg_24918_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_SmashEgg_24918_descriptor, new String[]{"Result", "Index", "IsReset", "Indexs", "SeniorNum", "SmashEggNum", "IsHaveFancy", "FancyGroupDrawTimes", "RecruitNum"});
      internal_static_childAct_com_gzbz_protobuf_C2S_TakeLuckReward_24919_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_childAct_com_gzbz_protobuf_C2S_TakeLuckReward_24919_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_TakeLuckReward_24919_descriptor, new String[]{"RewardId"});
      internal_static_childAct_com_gzbz_protobuf_S2C_TakeLuckReward_24920_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_childAct_com_gzbz_protobuf_S2C_TakeLuckReward_24920_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_TakeLuckReward_24920_descriptor, new String[]{"Result", "TakedId"});
      internal_static_childAct_com_gzbz_protobuf_C2S_DrawRecord_24921_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_childAct_com_gzbz_protobuf_C2S_DrawRecord_24921_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_DrawRecord_24921_descriptor, new String[0]);
      internal_static_childAct_com_gzbz_protobuf_S2C_DrawRecord_24922_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_childAct_com_gzbz_protobuf_S2C_DrawRecord_24922_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_DrawRecord_24922_descriptor, new String[]{"MyRecord"});
      internal_static_childAct_com_gzbz_protobuf_C2S_ServerDrawRecord_24923_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_childAct_com_gzbz_protobuf_C2S_ServerDrawRecord_24923_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_C2S_ServerDrawRecord_24923_descriptor, new String[0]);
      internal_static_childAct_com_gzbz_protobuf_S2C_ServerDrawRecord_24924_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_childAct_com_gzbz_protobuf_S2C_ServerDrawRecord_24924_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_S2C_ServerDrawRecord_24924_descriptor, new String[]{"ServerRecord"});
      internal_static_childAct_com_gzbz_protobuf_MyDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_childAct_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_MyDrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_childAct_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_childAct_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_childAct_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId", "Stage"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_24901 extends GeneratedMessageV3 implements C2S_ActivityInfo_24901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_24901 DEFAULT_INSTANCE = new C2S_ActivityInfo_24901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_24901> PARSER = new AbstractParser<C2S_ActivityInfo_24901>() {
         public C2S_ActivityInfo_24901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_24901(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_24901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_24901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_24901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_24901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ActivityInfo_24901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ActivityInfo_24901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_24901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_24901)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_24901 other = (C2S_ActivityInfo_24901)obj;
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

      public static C2S_ActivityInfo_24901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24901)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24901)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24901)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24901 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_24901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_24901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_24901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_24901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_24901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_24901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_24901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_24901> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_24901> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_24901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_24901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ActivityInfo_24901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ActivityInfo_24901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_24901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_ActivityInfo_24901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ActivityInfo_24901_descriptor;
         }

         public C2S_ActivityInfo_24901 getDefaultInstanceForType() {
            return ChildActMsg.C2S_ActivityInfo_24901.getDefaultInstance();
         }

         public C2S_ActivityInfo_24901 build() {
            C2S_ActivityInfo_24901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_24901 buildPartial() {
            C2S_ActivityInfo_24901 result = new C2S_ActivityInfo_24901(this);
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
            if (other instanceof C2S_ActivityInfo_24901) {
               return this.mergeFrom((C2S_ActivityInfo_24901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_24901 other) {
            if (other == ChildActMsg.C2S_ActivityInfo_24901.getDefaultInstance()) {
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
            C2S_ActivityInfo_24901 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_24901)ChildActMsg.C2S_ActivityInfo_24901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_24901)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_24902 extends GeneratedMessageV3 implements S2C_ActivityInfo_24902OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 2;
      private int activityDay_;
      public static final int SMASHEGGSTAGE_FIELD_NUMBER = 3;
      private int smashEggStage_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_24902 DEFAULT_INSTANCE = new S2C_ActivityInfo_24902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_24902> PARSER = new AbstractParser<S2C_ActivityInfo_24902>() {
         public S2C_ActivityInfo_24902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_24902(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_24902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_24902() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_24902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_24902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ActivityInfo_24902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ActivityInfo_24902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_24902.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ActivityInfo_24902)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_24902 other = (S2C_ActivityInfo_24902)obj;
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

      public static S2C_ActivityInfo_24902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24902)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24902)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24902)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24902 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_24902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_24902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_24902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_24902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_24902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_24902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_24902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_24902> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_24902> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_24902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_24902OrBuilder {
         private int bitField0_;
         private int openDay_;
         private int activityDay_;
         private int smashEggStage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ActivityInfo_24902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ActivityInfo_24902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_24902.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.S2C_ActivityInfo_24902.alwaysUseFieldBuilders) {
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
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ActivityInfo_24902_descriptor;
         }

         public S2C_ActivityInfo_24902 getDefaultInstanceForType() {
            return ChildActMsg.S2C_ActivityInfo_24902.getDefaultInstance();
         }

         public S2C_ActivityInfo_24902 build() {
            S2C_ActivityInfo_24902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_24902 buildPartial() {
            S2C_ActivityInfo_24902 result = new S2C_ActivityInfo_24902(this);
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
            if (other instanceof S2C_ActivityInfo_24902) {
               return this.mergeFrom((S2C_ActivityInfo_24902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_24902 other) {
            if (other == ChildActMsg.S2C_ActivityInfo_24902.getDefaultInstance()) {
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
            S2C_ActivityInfo_24902 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_24902)ChildActMsg.S2C_ActivityInfo_24902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_24902)e.getUnfinishedMessage();
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

   public static final class C2S_ShopAddUpInfo_24903 extends GeneratedMessageV3 implements C2S_ShopAddUpInfo_24903OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopAddUpInfo_24903 DEFAULT_INSTANCE = new C2S_ShopAddUpInfo_24903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopAddUpInfo_24903> PARSER = new AbstractParser<C2S_ShopAddUpInfo_24903>() {
         public C2S_ShopAddUpInfo_24903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopAddUpInfo_24903(input, extensionRegistry);
         }
      };

      private C2S_ShopAddUpInfo_24903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopAddUpInfo_24903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopAddUpInfo_24903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopAddUpInfo_24903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ShopAddUpInfo_24903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ShopAddUpInfo_24903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_24903.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopAddUpInfo_24903)) {
            return super.equals(obj);
         } else {
            C2S_ShopAddUpInfo_24903 other = (C2S_ShopAddUpInfo_24903)obj;
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

      public static C2S_ShopAddUpInfo_24903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24903)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_24903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_24903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24903)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_24903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_24903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24903)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_24903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_24903 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_24903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_24903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_24903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_24903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_24903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_24903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_24903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_24903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_24903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_24903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_24903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopAddUpInfo_24903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopAddUpInfo_24903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopAddUpInfo_24903> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopAddUpInfo_24903> getParserForType() {
         return PARSER;
      }

      public C2S_ShopAddUpInfo_24903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopAddUpInfo_24903OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ShopAddUpInfo_24903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ShopAddUpInfo_24903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_24903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_ShopAddUpInfo_24903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ShopAddUpInfo_24903_descriptor;
         }

         public C2S_ShopAddUpInfo_24903 getDefaultInstanceForType() {
            return ChildActMsg.C2S_ShopAddUpInfo_24903.getDefaultInstance();
         }

         public C2S_ShopAddUpInfo_24903 build() {
            C2S_ShopAddUpInfo_24903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopAddUpInfo_24903 buildPartial() {
            C2S_ShopAddUpInfo_24903 result = new C2S_ShopAddUpInfo_24903(this);
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
            if (other instanceof C2S_ShopAddUpInfo_24903) {
               return this.mergeFrom((C2S_ShopAddUpInfo_24903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopAddUpInfo_24903 other) {
            if (other == ChildActMsg.C2S_ShopAddUpInfo_24903.getDefaultInstance()) {
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
            C2S_ShopAddUpInfo_24903 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopAddUpInfo_24903)ChildActMsg.C2S_ShopAddUpInfo_24903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopAddUpInfo_24903)e.getUnfinishedMessage();
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

   public static final class S2C_ShopAddUpInfo_24904 extends GeneratedMessageV3 implements S2C_ShopAddUpInfo_24904OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAILYRECHARGE_FIELD_NUMBER = 1;
      private int dailyRecharge_;
      public static final int GOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList gotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopAddUpInfo_24904 DEFAULT_INSTANCE = new S2C_ShopAddUpInfo_24904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopAddUpInfo_24904> PARSER = new AbstractParser<S2C_ShopAddUpInfo_24904>() {
         public S2C_ShopAddUpInfo_24904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopAddUpInfo_24904(input, extensionRegistry);
         }
      };

      private S2C_ShopAddUpInfo_24904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopAddUpInfo_24904() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopAddUpInfo_24904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopAddUpInfo_24904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ShopAddUpInfo_24904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ShopAddUpInfo_24904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_24904.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ShopAddUpInfo_24904)) {
            return super.equals(obj);
         } else {
            S2C_ShopAddUpInfo_24904 other = (S2C_ShopAddUpInfo_24904)obj;
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

      public static S2C_ShopAddUpInfo_24904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24904)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_24904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_24904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24904)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_24904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_24904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24904)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_24904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_24904 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_24904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_24904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_24904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_24904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_24904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_24904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_24904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_24904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_24904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_24904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_24904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopAddUpInfo_24904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopAddUpInfo_24904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopAddUpInfo_24904> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopAddUpInfo_24904> getParserForType() {
         return PARSER;
      }

      public S2C_ShopAddUpInfo_24904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopAddUpInfo_24904OrBuilder {
         private int bitField0_;
         private int dailyRecharge_;
         private Internal.IntList gotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ShopAddUpInfo_24904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ShopAddUpInfo_24904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_24904.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = ChildActMsg.S2C_ShopAddUpInfo_24904.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = ChildActMsg.S2C_ShopAddUpInfo_24904.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.S2C_ShopAddUpInfo_24904.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dailyRecharge_ = 0;
            this.bitField0_ &= -2;
            this.gotRewards_ = ChildActMsg.S2C_ShopAddUpInfo_24904.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ShopAddUpInfo_24904_descriptor;
         }

         public S2C_ShopAddUpInfo_24904 getDefaultInstanceForType() {
            return ChildActMsg.S2C_ShopAddUpInfo_24904.getDefaultInstance();
         }

         public S2C_ShopAddUpInfo_24904 build() {
            S2C_ShopAddUpInfo_24904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopAddUpInfo_24904 buildPartial() {
            S2C_ShopAddUpInfo_24904 result = new S2C_ShopAddUpInfo_24904(this);
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
            if (other instanceof S2C_ShopAddUpInfo_24904) {
               return this.mergeFrom((S2C_ShopAddUpInfo_24904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopAddUpInfo_24904 other) {
            if (other == ChildActMsg.S2C_ShopAddUpInfo_24904.getDefaultInstance()) {
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
            S2C_ShopAddUpInfo_24904 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopAddUpInfo_24904)ChildActMsg.S2C_ShopAddUpInfo_24904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopAddUpInfo_24904)e.getUnfinishedMessage();
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
               this.gotRewards_ = ChildActMsg.S2C_ShopAddUpInfo_24904.mutableCopy(this.gotRewards_);
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
            this.gotRewards_ = ChildActMsg.S2C_ShopAddUpInfo_24904.emptyIntList();
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

   public static final class C2S_ReceiveShopAddUpReward_24905 extends GeneratedMessageV3 implements C2S_ReceiveShopAddUpReward_24905OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveShopAddUpReward_24905 DEFAULT_INSTANCE = new C2S_ReceiveShopAddUpReward_24905();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveShopAddUpReward_24905> PARSER = new AbstractParser<C2S_ReceiveShopAddUpReward_24905>() {
         public C2S_ReceiveShopAddUpReward_24905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveShopAddUpReward_24905(input, extensionRegistry);
         }
      };

      private C2S_ReceiveShopAddUpReward_24905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveShopAddUpReward_24905() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveShopAddUpReward_24905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveShopAddUpReward_24905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_24905.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveShopAddUpReward_24905)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveShopAddUpReward_24905 other = (C2S_ReceiveShopAddUpReward_24905)obj;
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

      public static C2S_ReceiveShopAddUpReward_24905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24905)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24905)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24905)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_24905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveShopAddUpReward_24905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveShopAddUpReward_24905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveShopAddUpReward_24905> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveShopAddUpReward_24905> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveShopAddUpReward_24905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveShopAddUpReward_24905OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_24905.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_ReceiveShopAddUpReward_24905.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24905_descriptor;
         }

         public C2S_ReceiveShopAddUpReward_24905 getDefaultInstanceForType() {
            return ChildActMsg.C2S_ReceiveShopAddUpReward_24905.getDefaultInstance();
         }

         public C2S_ReceiveShopAddUpReward_24905 build() {
            C2S_ReceiveShopAddUpReward_24905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveShopAddUpReward_24905 buildPartial() {
            C2S_ReceiveShopAddUpReward_24905 result = new C2S_ReceiveShopAddUpReward_24905(this);
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
            if (other instanceof C2S_ReceiveShopAddUpReward_24905) {
               return this.mergeFrom((C2S_ReceiveShopAddUpReward_24905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveShopAddUpReward_24905 other) {
            if (other == ChildActMsg.C2S_ReceiveShopAddUpReward_24905.getDefaultInstance()) {
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
            C2S_ReceiveShopAddUpReward_24905 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveShopAddUpReward_24905)ChildActMsg.C2S_ReceiveShopAddUpReward_24905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveShopAddUpReward_24905)e.getUnfinishedMessage();
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

   public static final class C2S_SignTotalInfo_24906 extends GeneratedMessageV3 implements C2S_SignTotalInfo_24906OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SignTotalInfo_24906 DEFAULT_INSTANCE = new C2S_SignTotalInfo_24906();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SignTotalInfo_24906> PARSER = new AbstractParser<C2S_SignTotalInfo_24906>() {
         public C2S_SignTotalInfo_24906 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SignTotalInfo_24906(input, extensionRegistry);
         }
      };

      private C2S_SignTotalInfo_24906(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SignTotalInfo_24906() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SignTotalInfo_24906();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SignTotalInfo_24906(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_SignTotalInfo_24906_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_SignTotalInfo_24906_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_24906.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SignTotalInfo_24906)) {
            return super.equals(obj);
         } else {
            C2S_SignTotalInfo_24906 other = (C2S_SignTotalInfo_24906)obj;
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

      public static C2S_SignTotalInfo_24906 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24906)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_24906 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_24906 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24906)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_24906 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_24906 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24906)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_24906 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_24906 parseFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_24906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_24906 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_24906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_24906 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_24906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_24906 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_24906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_24906 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SignTotalInfo_24906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_24906 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_24906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SignTotalInfo_24906 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SignTotalInfo_24906 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SignTotalInfo_24906> parser() {
         return PARSER;
      }

      public Parser<C2S_SignTotalInfo_24906> getParserForType() {
         return PARSER;
      }

      public C2S_SignTotalInfo_24906 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SignTotalInfo_24906OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_SignTotalInfo_24906_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_SignTotalInfo_24906_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_24906.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_SignTotalInfo_24906.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_SignTotalInfo_24906_descriptor;
         }

         public C2S_SignTotalInfo_24906 getDefaultInstanceForType() {
            return ChildActMsg.C2S_SignTotalInfo_24906.getDefaultInstance();
         }

         public C2S_SignTotalInfo_24906 build() {
            C2S_SignTotalInfo_24906 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SignTotalInfo_24906 buildPartial() {
            C2S_SignTotalInfo_24906 result = new C2S_SignTotalInfo_24906(this);
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
            if (other instanceof C2S_SignTotalInfo_24906) {
               return this.mergeFrom((C2S_SignTotalInfo_24906)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SignTotalInfo_24906 other) {
            if (other == ChildActMsg.C2S_SignTotalInfo_24906.getDefaultInstance()) {
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
            C2S_SignTotalInfo_24906 parsedMessage = null;

            try {
               parsedMessage = (C2S_SignTotalInfo_24906)ChildActMsg.C2S_SignTotalInfo_24906.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SignTotalInfo_24906)e.getUnfinishedMessage();
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

   public static final class S2C_SignTotalInfo_24907 extends GeneratedMessageV3 implements S2C_SignTotalInfo_24907OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 1;
      private int activityDay_;
      public static final int SIGNGOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList signGotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_SignTotalInfo_24907 DEFAULT_INSTANCE = new S2C_SignTotalInfo_24907();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignTotalInfo_24907> PARSER = new AbstractParser<S2C_SignTotalInfo_24907>() {
         public S2C_SignTotalInfo_24907 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignTotalInfo_24907(input, extensionRegistry);
         }
      };

      private S2C_SignTotalInfo_24907(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignTotalInfo_24907() {
         this.memoizedIsInitialized = -1;
         this.signGotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignTotalInfo_24907();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignTotalInfo_24907(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_SignTotalInfo_24907_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_SignTotalInfo_24907_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_24907.class, Builder.class);
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
         } else if (!(obj instanceof S2C_SignTotalInfo_24907)) {
            return super.equals(obj);
         } else {
            S2C_SignTotalInfo_24907 other = (S2C_SignTotalInfo_24907)obj;
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

      public static S2C_SignTotalInfo_24907 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24907)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_24907 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_24907 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24907)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_24907 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_24907 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24907)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_24907 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_24907 parseFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_24907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_24907 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_24907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_24907 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_24907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_24907 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_24907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_24907 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignTotalInfo_24907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_24907 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_24907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignTotalInfo_24907 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignTotalInfo_24907 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignTotalInfo_24907> parser() {
         return PARSER;
      }

      public Parser<S2C_SignTotalInfo_24907> getParserForType() {
         return PARSER;
      }

      public S2C_SignTotalInfo_24907 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignTotalInfo_24907OrBuilder {
         private int bitField0_;
         private int activityDay_;
         private Internal.IntList signGotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_SignTotalInfo_24907_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_SignTotalInfo_24907_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_24907.class, Builder.class);
         }

         private Builder() {
            this.signGotRewards_ = ChildActMsg.S2C_SignTotalInfo_24907.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.signGotRewards_ = ChildActMsg.S2C_SignTotalInfo_24907.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.S2C_SignTotalInfo_24907.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityDay_ = 0;
            this.bitField0_ &= -2;
            this.signGotRewards_ = ChildActMsg.S2C_SignTotalInfo_24907.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_SignTotalInfo_24907_descriptor;
         }

         public S2C_SignTotalInfo_24907 getDefaultInstanceForType() {
            return ChildActMsg.S2C_SignTotalInfo_24907.getDefaultInstance();
         }

         public S2C_SignTotalInfo_24907 build() {
            S2C_SignTotalInfo_24907 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignTotalInfo_24907 buildPartial() {
            S2C_SignTotalInfo_24907 result = new S2C_SignTotalInfo_24907(this);
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
            if (other instanceof S2C_SignTotalInfo_24907) {
               return this.mergeFrom((S2C_SignTotalInfo_24907)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignTotalInfo_24907 other) {
            if (other == ChildActMsg.S2C_SignTotalInfo_24907.getDefaultInstance()) {
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
            S2C_SignTotalInfo_24907 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignTotalInfo_24907)ChildActMsg.S2C_SignTotalInfo_24907.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignTotalInfo_24907)e.getUnfinishedMessage();
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
               this.signGotRewards_ = ChildActMsg.S2C_SignTotalInfo_24907.mutableCopy(this.signGotRewards_);
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
            this.signGotRewards_ = ChildActMsg.S2C_SignTotalInfo_24907.emptyIntList();
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

   public static final class C2S_Sign_24908 extends GeneratedMessageV3 implements C2S_Sign_24908OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_Sign_24908 DEFAULT_INSTANCE = new C2S_Sign_24908();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Sign_24908> PARSER = new AbstractParser<C2S_Sign_24908>() {
         public C2S_Sign_24908 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Sign_24908(input, extensionRegistry);
         }
      };

      private C2S_Sign_24908(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Sign_24908() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Sign_24908();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Sign_24908(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_Sign_24908_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_Sign_24908_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_24908.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Sign_24908)) {
            return super.equals(obj);
         } else {
            C2S_Sign_24908 other = (C2S_Sign_24908)obj;
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

      public static C2S_Sign_24908 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Sign_24908)PARSER.parseFrom(data);
      }

      public static C2S_Sign_24908 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_24908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_24908 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Sign_24908)PARSER.parseFrom(data);
      }

      public static C2S_Sign_24908 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_24908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_24908 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Sign_24908)PARSER.parseFrom(data);
      }

      public static C2S_Sign_24908 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_24908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_24908 parseFrom(InputStream input) throws IOException {
         return (C2S_Sign_24908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_24908 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_24908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_24908 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Sign_24908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Sign_24908 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_24908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_24908 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Sign_24908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_24908 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_24908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Sign_24908 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Sign_24908 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Sign_24908> parser() {
         return PARSER;
      }

      public Parser<C2S_Sign_24908> getParserForType() {
         return PARSER;
      }

      public C2S_Sign_24908 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Sign_24908OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_Sign_24908_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_Sign_24908_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_24908.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_Sign_24908.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_Sign_24908_descriptor;
         }

         public C2S_Sign_24908 getDefaultInstanceForType() {
            return ChildActMsg.C2S_Sign_24908.getDefaultInstance();
         }

         public C2S_Sign_24908 build() {
            C2S_Sign_24908 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Sign_24908 buildPartial() {
            C2S_Sign_24908 result = new C2S_Sign_24908(this);
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
            if (other instanceof C2S_Sign_24908) {
               return this.mergeFrom((C2S_Sign_24908)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Sign_24908 other) {
            if (other == ChildActMsg.C2S_Sign_24908.getDefaultInstance()) {
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
            C2S_Sign_24908 parsedMessage = null;

            try {
               parsedMessage = (C2S_Sign_24908)ChildActMsg.C2S_Sign_24908.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Sign_24908)e.getUnfinishedMessage();
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

   public static final class C2S_PickUpInfo_24909 extends GeneratedMessageV3 implements C2S_PickUpInfo_24909OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PickUpInfo_24909 DEFAULT_INSTANCE = new C2S_PickUpInfo_24909();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PickUpInfo_24909> PARSER = new AbstractParser<C2S_PickUpInfo_24909>() {
         public C2S_PickUpInfo_24909 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PickUpInfo_24909(input, extensionRegistry);
         }
      };

      private C2S_PickUpInfo_24909(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PickUpInfo_24909() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PickUpInfo_24909();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PickUpInfo_24909(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpInfo_24909_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpInfo_24909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PickUpInfo_24909.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PickUpInfo_24909)) {
            return super.equals(obj);
         } else {
            C2S_PickUpInfo_24909 other = (C2S_PickUpInfo_24909)obj;
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

      public static C2S_PickUpInfo_24909 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PickUpInfo_24909)PARSER.parseFrom(data);
      }

      public static C2S_PickUpInfo_24909 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PickUpInfo_24909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PickUpInfo_24909 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PickUpInfo_24909)PARSER.parseFrom(data);
      }

      public static C2S_PickUpInfo_24909 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PickUpInfo_24909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PickUpInfo_24909 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PickUpInfo_24909)PARSER.parseFrom(data);
      }

      public static C2S_PickUpInfo_24909 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PickUpInfo_24909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PickUpInfo_24909 parseFrom(InputStream input) throws IOException {
         return (C2S_PickUpInfo_24909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PickUpInfo_24909 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PickUpInfo_24909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PickUpInfo_24909 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PickUpInfo_24909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PickUpInfo_24909 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PickUpInfo_24909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PickUpInfo_24909 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PickUpInfo_24909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PickUpInfo_24909 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PickUpInfo_24909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PickUpInfo_24909 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PickUpInfo_24909 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PickUpInfo_24909> parser() {
         return PARSER;
      }

      public Parser<C2S_PickUpInfo_24909> getParserForType() {
         return PARSER;
      }

      public C2S_PickUpInfo_24909 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PickUpInfo_24909OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpInfo_24909_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpInfo_24909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PickUpInfo_24909.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_PickUpInfo_24909.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpInfo_24909_descriptor;
         }

         public C2S_PickUpInfo_24909 getDefaultInstanceForType() {
            return ChildActMsg.C2S_PickUpInfo_24909.getDefaultInstance();
         }

         public C2S_PickUpInfo_24909 build() {
            C2S_PickUpInfo_24909 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PickUpInfo_24909 buildPartial() {
            C2S_PickUpInfo_24909 result = new C2S_PickUpInfo_24909(this);
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
            if (other instanceof C2S_PickUpInfo_24909) {
               return this.mergeFrom((C2S_PickUpInfo_24909)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PickUpInfo_24909 other) {
            if (other == ChildActMsg.C2S_PickUpInfo_24909.getDefaultInstance()) {
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
            C2S_PickUpInfo_24909 parsedMessage = null;

            try {
               parsedMessage = (C2S_PickUpInfo_24909)ChildActMsg.C2S_PickUpInfo_24909.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PickUpInfo_24909)e.getUnfinishedMessage();
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

   public static final class PickUpGameObjInfo extends GeneratedMessageV3 implements PickUpGameObjInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int LINEANDTYPE_FIELD_NUMBER = 2;
      private int lineAndType_;
      private byte memoizedIsInitialized;
      private static final PickUpGameObjInfo DEFAULT_INSTANCE = new PickUpGameObjInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<PickUpGameObjInfo> PARSER = new AbstractParser<PickUpGameObjInfo>() {
         public PickUpGameObjInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PickUpGameObjInfo(input, extensionRegistry);
         }
      };

      private PickUpGameObjInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PickUpGameObjInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PickUpGameObjInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PickUpGameObjInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.lineAndType_ = input.readInt32();
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_PickUpGameObjInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_PickUpGameObjInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PickUpGameObjInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasLineAndType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLineAndType() {
         return this.lineAndType_;
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
         } else if (!this.hasLineAndType()) {
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
            output.writeInt32(2, this.lineAndType_);
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
               size += CodedOutputStream.computeInt32Size(2, this.lineAndType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PickUpGameObjInfo)) {
            return super.equals(obj);
         } else {
            PickUpGameObjInfo other = (PickUpGameObjInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasLineAndType() != other.hasLineAndType()) {
               return false;
            } else if (this.hasLineAndType() && this.getLineAndType() != other.getLineAndType()) {
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

            if (this.hasLineAndType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLineAndType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PickUpGameObjInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PickUpGameObjInfo)PARSER.parseFrom(data);
      }

      public static PickUpGameObjInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PickUpGameObjInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PickUpGameObjInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PickUpGameObjInfo)PARSER.parseFrom(data);
      }

      public static PickUpGameObjInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PickUpGameObjInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PickUpGameObjInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PickUpGameObjInfo)PARSER.parseFrom(data);
      }

      public static PickUpGameObjInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PickUpGameObjInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PickUpGameObjInfo parseFrom(InputStream input) throws IOException {
         return (PickUpGameObjInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PickUpGameObjInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PickUpGameObjInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PickUpGameObjInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (PickUpGameObjInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PickUpGameObjInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PickUpGameObjInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PickUpGameObjInfo parseFrom(CodedInputStream input) throws IOException {
         return (PickUpGameObjInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PickUpGameObjInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PickUpGameObjInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PickUpGameObjInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PickUpGameObjInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PickUpGameObjInfo> parser() {
         return PARSER;
      }

      public Parser<PickUpGameObjInfo> getParserForType() {
         return PARSER;
      }

      public PickUpGameObjInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PickUpGameObjInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int lineAndType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_PickUpGameObjInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_PickUpGameObjInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PickUpGameObjInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.PickUpGameObjInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.lineAndType_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_PickUpGameObjInfo_descriptor;
         }

         public PickUpGameObjInfo getDefaultInstanceForType() {
            return ChildActMsg.PickUpGameObjInfo.getDefaultInstance();
         }

         public PickUpGameObjInfo build() {
            PickUpGameObjInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PickUpGameObjInfo buildPartial() {
            PickUpGameObjInfo result = new PickUpGameObjInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.lineAndType_ = this.lineAndType_;
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
            if (other instanceof PickUpGameObjInfo) {
               return this.mergeFrom((PickUpGameObjInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PickUpGameObjInfo other) {
            if (other == ChildActMsg.PickUpGameObjInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasLineAndType()) {
                  this.setLineAndType(other.getLineAndType());
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
               return this.hasLineAndType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PickUpGameObjInfo parsedMessage = null;

            try {
               parsedMessage = (PickUpGameObjInfo)ChildActMsg.PickUpGameObjInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PickUpGameObjInfo)e.getUnfinishedMessage();
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

         public boolean hasLineAndType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLineAndType() {
            return this.lineAndType_;
         }

         public Builder setLineAndType(int value) {
            this.bitField0_ |= 2;
            this.lineAndType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLineAndType() {
            this.bitField0_ &= -3;
            this.lineAndType_ = 0;
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

   public static final class S2C_PickUpInfo_24910 extends GeneratedMessageV3 implements S2C_PickUpInfo_24910OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POINT_FIELD_NUMBER = 1;
      private int point_;
      public static final int TICKETBUYTIMES_FIELD_NUMBER = 2;
      private int ticketBuyTimes_;
      public static final int TICKETBUYCOST_FIELD_NUMBER = 3;
      private int ticketBuyCost_;
      public static final int GAMESTARTTIME_FIELD_NUMBER = 4;
      private int gameStartTime_;
      public static final int GAMEOBJLINEINFO_FIELD_NUMBER = 5;
      private List<PickUpGameObjInfo> gameObjLineInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_PickUpInfo_24910 DEFAULT_INSTANCE = new S2C_PickUpInfo_24910();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PickUpInfo_24910> PARSER = new AbstractParser<S2C_PickUpInfo_24910>() {
         public S2C_PickUpInfo_24910 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PickUpInfo_24910(input, extensionRegistry);
         }
      };

      private S2C_PickUpInfo_24910(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PickUpInfo_24910() {
         this.memoizedIsInitialized = -1;
         this.gameObjLineInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PickUpInfo_24910();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PickUpInfo_24910(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.point_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.ticketBuyTimes_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.ticketBuyCost_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.gameStartTime_ = input.readInt32();
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.gameObjLineInfo_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.gameObjLineInfo_.add(input.readMessage(ChildActMsg.PickUpGameObjInfo.PARSER, extensionRegistry));
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
                  this.gameObjLineInfo_ = Collections.unmodifiableList(this.gameObjLineInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_PickUpInfo_24910_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_PickUpInfo_24910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PickUpInfo_24910.class, Builder.class);
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public boolean hasTicketBuyTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTicketBuyTimes() {
         return this.ticketBuyTimes_;
      }

      public boolean hasTicketBuyCost() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTicketBuyCost() {
         return this.ticketBuyCost_;
      }

      public boolean hasGameStartTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGameStartTime() {
         return this.gameStartTime_;
      }

      public List<PickUpGameObjInfo> getGameObjLineInfoList() {
         return this.gameObjLineInfo_;
      }

      public List<? extends PickUpGameObjInfoOrBuilder> getGameObjLineInfoOrBuilderList() {
         return this.gameObjLineInfo_;
      }

      public int getGameObjLineInfoCount() {
         return this.gameObjLineInfo_.size();
      }

      public PickUpGameObjInfo getGameObjLineInfo(int index) {
         return (PickUpGameObjInfo)this.gameObjLineInfo_.get(index);
      }

      public PickUpGameObjInfoOrBuilder getGameObjLineInfoOrBuilder(int index) {
         return (PickUpGameObjInfoOrBuilder)this.gameObjLineInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTicketBuyTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTicketBuyCost()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGameStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getGameObjLineInfoCount(); ++i) {
               if (!this.getGameObjLineInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.point_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.ticketBuyTimes_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.ticketBuyCost_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.gameStartTime_);
         }

         for(int i = 0; i < this.gameObjLineInfo_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.gameObjLineInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.point_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.ticketBuyTimes_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.ticketBuyCost_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.gameStartTime_);
            }

            for(int i = 0; i < this.gameObjLineInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.gameObjLineInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PickUpInfo_24910)) {
            return super.equals(obj);
         } else {
            S2C_PickUpInfo_24910 other = (S2C_PickUpInfo_24910)obj;
            if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
               return false;
            } else if (this.hasTicketBuyTimes() != other.hasTicketBuyTimes()) {
               return false;
            } else if (this.hasTicketBuyTimes() && this.getTicketBuyTimes() != other.getTicketBuyTimes()) {
               return false;
            } else if (this.hasTicketBuyCost() != other.hasTicketBuyCost()) {
               return false;
            } else if (this.hasTicketBuyCost() && this.getTicketBuyCost() != other.getTicketBuyCost()) {
               return false;
            } else if (this.hasGameStartTime() != other.hasGameStartTime()) {
               return false;
            } else if (this.hasGameStartTime() && this.getGameStartTime() != other.getGameStartTime()) {
               return false;
            } else if (!this.getGameObjLineInfoList().equals(other.getGameObjLineInfoList())) {
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
            if (this.hasPoint()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPoint();
            }

            if (this.hasTicketBuyTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTicketBuyTimes();
            }

            if (this.hasTicketBuyCost()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTicketBuyCost();
            }

            if (this.hasGameStartTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGameStartTime();
            }

            if (this.getGameObjLineInfoCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getGameObjLineInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PickUpInfo_24910 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PickUpInfo_24910)PARSER.parseFrom(data);
      }

      public static S2C_PickUpInfo_24910 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PickUpInfo_24910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PickUpInfo_24910 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PickUpInfo_24910)PARSER.parseFrom(data);
      }

      public static S2C_PickUpInfo_24910 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PickUpInfo_24910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PickUpInfo_24910 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PickUpInfo_24910)PARSER.parseFrom(data);
      }

      public static S2C_PickUpInfo_24910 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PickUpInfo_24910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PickUpInfo_24910 parseFrom(InputStream input) throws IOException {
         return (S2C_PickUpInfo_24910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PickUpInfo_24910 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PickUpInfo_24910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PickUpInfo_24910 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PickUpInfo_24910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PickUpInfo_24910 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PickUpInfo_24910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PickUpInfo_24910 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PickUpInfo_24910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PickUpInfo_24910 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PickUpInfo_24910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PickUpInfo_24910 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PickUpInfo_24910 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PickUpInfo_24910> parser() {
         return PARSER;
      }

      public Parser<S2C_PickUpInfo_24910> getParserForType() {
         return PARSER;
      }

      public S2C_PickUpInfo_24910 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PickUpInfo_24910OrBuilder {
         private int bitField0_;
         private int point_;
         private int ticketBuyTimes_;
         private int ticketBuyCost_;
         private int gameStartTime_;
         private List<PickUpGameObjInfo> gameObjLineInfo_;
         private RepeatedFieldBuilderV3<PickUpGameObjInfo, PickUpGameObjInfo.Builder, PickUpGameObjInfoOrBuilder> gameObjLineInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_PickUpInfo_24910_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_PickUpInfo_24910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PickUpInfo_24910.class, Builder.class);
         }

         private Builder() {
            this.gameObjLineInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gameObjLineInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.S2C_PickUpInfo_24910.alwaysUseFieldBuilders) {
               this.getGameObjLineInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.point_ = 0;
            this.bitField0_ &= -2;
            this.ticketBuyTimes_ = 0;
            this.bitField0_ &= -3;
            this.ticketBuyCost_ = 0;
            this.bitField0_ &= -5;
            this.gameStartTime_ = 0;
            this.bitField0_ &= -9;
            if (this.gameObjLineInfoBuilder_ == null) {
               this.gameObjLineInfo_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.gameObjLineInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_PickUpInfo_24910_descriptor;
         }

         public S2C_PickUpInfo_24910 getDefaultInstanceForType() {
            return ChildActMsg.S2C_PickUpInfo_24910.getDefaultInstance();
         }

         public S2C_PickUpInfo_24910 build() {
            S2C_PickUpInfo_24910 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PickUpInfo_24910 buildPartial() {
            S2C_PickUpInfo_24910 result = new S2C_PickUpInfo_24910(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.point_ = this.point_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.ticketBuyTimes_ = this.ticketBuyTimes_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.ticketBuyCost_ = this.ticketBuyCost_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.gameStartTime_ = this.gameStartTime_;
               to_bitField0_ |= 8;
            }

            if (this.gameObjLineInfoBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.gameObjLineInfo_ = Collections.unmodifiableList(this.gameObjLineInfo_);
                  this.bitField0_ &= -17;
               }

               result.gameObjLineInfo_ = this.gameObjLineInfo_;
            } else {
               result.gameObjLineInfo_ = this.gameObjLineInfoBuilder_.build();
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
            if (other instanceof S2C_PickUpInfo_24910) {
               return this.mergeFrom((S2C_PickUpInfo_24910)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PickUpInfo_24910 other) {
            if (other == ChildActMsg.S2C_PickUpInfo_24910.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
               }

               if (other.hasTicketBuyTimes()) {
                  this.setTicketBuyTimes(other.getTicketBuyTimes());
               }

               if (other.hasTicketBuyCost()) {
                  this.setTicketBuyCost(other.getTicketBuyCost());
               }

               if (other.hasGameStartTime()) {
                  this.setGameStartTime(other.getGameStartTime());
               }

               if (this.gameObjLineInfoBuilder_ == null) {
                  if (!other.gameObjLineInfo_.isEmpty()) {
                     if (this.gameObjLineInfo_.isEmpty()) {
                        this.gameObjLineInfo_ = other.gameObjLineInfo_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureGameObjLineInfoIsMutable();
                        this.gameObjLineInfo_.addAll(other.gameObjLineInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.gameObjLineInfo_.isEmpty()) {
                  if (this.gameObjLineInfoBuilder_.isEmpty()) {
                     this.gameObjLineInfoBuilder_.dispose();
                     this.gameObjLineInfoBuilder_ = null;
                     this.gameObjLineInfo_ = other.gameObjLineInfo_;
                     this.bitField0_ &= -17;
                     this.gameObjLineInfoBuilder_ = ChildActMsg.S2C_PickUpInfo_24910.alwaysUseFieldBuilders ? this.getGameObjLineInfoFieldBuilder() : null;
                  } else {
                     this.gameObjLineInfoBuilder_.addAllMessages(other.gameObjLineInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPoint()) {
               return false;
            } else if (!this.hasTicketBuyTimes()) {
               return false;
            } else if (!this.hasTicketBuyCost()) {
               return false;
            } else if (!this.hasGameStartTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getGameObjLineInfoCount(); ++i) {
                  if (!this.getGameObjLineInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PickUpInfo_24910 parsedMessage = null;

            try {
               parsedMessage = (S2C_PickUpInfo_24910)ChildActMsg.S2C_PickUpInfo_24910.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PickUpInfo_24910)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPoint() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPoint() {
            return this.point_;
         }

         public Builder setPoint(int value) {
            this.bitField0_ |= 1;
            this.point_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoint() {
            this.bitField0_ &= -2;
            this.point_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTicketBuyTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTicketBuyTimes() {
            return this.ticketBuyTimes_;
         }

         public Builder setTicketBuyTimes(int value) {
            this.bitField0_ |= 2;
            this.ticketBuyTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTicketBuyTimes() {
            this.bitField0_ &= -3;
            this.ticketBuyTimes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTicketBuyCost() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTicketBuyCost() {
            return this.ticketBuyCost_;
         }

         public Builder setTicketBuyCost(int value) {
            this.bitField0_ |= 4;
            this.ticketBuyCost_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTicketBuyCost() {
            this.bitField0_ &= -5;
            this.ticketBuyCost_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGameStartTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGameStartTime() {
            return this.gameStartTime_;
         }

         public Builder setGameStartTime(int value) {
            this.bitField0_ |= 8;
            this.gameStartTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGameStartTime() {
            this.bitField0_ &= -9;
            this.gameStartTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGameObjLineInfoIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.gameObjLineInfo_ = new ArrayList(this.gameObjLineInfo_);
               this.bitField0_ |= 16;
            }

         }

         public List<PickUpGameObjInfo> getGameObjLineInfoList() {
            return this.gameObjLineInfoBuilder_ == null ? Collections.unmodifiableList(this.gameObjLineInfo_) : this.gameObjLineInfoBuilder_.getMessageList();
         }

         public int getGameObjLineInfoCount() {
            return this.gameObjLineInfoBuilder_ == null ? this.gameObjLineInfo_.size() : this.gameObjLineInfoBuilder_.getCount();
         }

         public PickUpGameObjInfo getGameObjLineInfo(int index) {
            return this.gameObjLineInfoBuilder_ == null ? (PickUpGameObjInfo)this.gameObjLineInfo_.get(index) : (PickUpGameObjInfo)this.gameObjLineInfoBuilder_.getMessage(index);
         }

         public Builder setGameObjLineInfo(int index, PickUpGameObjInfo value) {
            if (this.gameObjLineInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGameObjLineInfoIsMutable();
               this.gameObjLineInfo_.set(index, value);
               this.onChanged();
            } else {
               this.gameObjLineInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGameObjLineInfo(int index, PickUpGameObjInfo.Builder builderForValue) {
            if (this.gameObjLineInfoBuilder_ == null) {
               this.ensureGameObjLineInfoIsMutable();
               this.gameObjLineInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gameObjLineInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGameObjLineInfo(PickUpGameObjInfo value) {
            if (this.gameObjLineInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGameObjLineInfoIsMutable();
               this.gameObjLineInfo_.add(value);
               this.onChanged();
            } else {
               this.gameObjLineInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGameObjLineInfo(int index, PickUpGameObjInfo value) {
            if (this.gameObjLineInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGameObjLineInfoIsMutable();
               this.gameObjLineInfo_.add(index, value);
               this.onChanged();
            } else {
               this.gameObjLineInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGameObjLineInfo(PickUpGameObjInfo.Builder builderForValue) {
            if (this.gameObjLineInfoBuilder_ == null) {
               this.ensureGameObjLineInfoIsMutable();
               this.gameObjLineInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.gameObjLineInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGameObjLineInfo(int index, PickUpGameObjInfo.Builder builderForValue) {
            if (this.gameObjLineInfoBuilder_ == null) {
               this.ensureGameObjLineInfoIsMutable();
               this.gameObjLineInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gameObjLineInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGameObjLineInfo(Iterable<? extends PickUpGameObjInfo> values) {
            if (this.gameObjLineInfoBuilder_ == null) {
               this.ensureGameObjLineInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gameObjLineInfo_);
               this.onChanged();
            } else {
               this.gameObjLineInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGameObjLineInfo() {
            if (this.gameObjLineInfoBuilder_ == null) {
               this.gameObjLineInfo_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.gameObjLineInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeGameObjLineInfo(int index) {
            if (this.gameObjLineInfoBuilder_ == null) {
               this.ensureGameObjLineInfoIsMutable();
               this.gameObjLineInfo_.remove(index);
               this.onChanged();
            } else {
               this.gameObjLineInfoBuilder_.remove(index);
            }

            return this;
         }

         public PickUpGameObjInfo.Builder getGameObjLineInfoBuilder(int index) {
            return (PickUpGameObjInfo.Builder)this.getGameObjLineInfoFieldBuilder().getBuilder(index);
         }

         public PickUpGameObjInfoOrBuilder getGameObjLineInfoOrBuilder(int index) {
            return this.gameObjLineInfoBuilder_ == null ? (PickUpGameObjInfoOrBuilder)this.gameObjLineInfo_.get(index) : (PickUpGameObjInfoOrBuilder)this.gameObjLineInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PickUpGameObjInfoOrBuilder> getGameObjLineInfoOrBuilderList() {
            return this.gameObjLineInfoBuilder_ != null ? this.gameObjLineInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.gameObjLineInfo_);
         }

         public PickUpGameObjInfo.Builder addGameObjLineInfoBuilder() {
            return (PickUpGameObjInfo.Builder)this.getGameObjLineInfoFieldBuilder().addBuilder(ChildActMsg.PickUpGameObjInfo.getDefaultInstance());
         }

         public PickUpGameObjInfo.Builder addGameObjLineInfoBuilder(int index) {
            return (PickUpGameObjInfo.Builder)this.getGameObjLineInfoFieldBuilder().addBuilder(index, ChildActMsg.PickUpGameObjInfo.getDefaultInstance());
         }

         public List<PickUpGameObjInfo.Builder> getGameObjLineInfoBuilderList() {
            return this.getGameObjLineInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PickUpGameObjInfo, PickUpGameObjInfo.Builder, PickUpGameObjInfoOrBuilder> getGameObjLineInfoFieldBuilder() {
            if (this.gameObjLineInfoBuilder_ == null) {
               this.gameObjLineInfoBuilder_ = new RepeatedFieldBuilderV3(this.gameObjLineInfo_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.gameObjLineInfo_ = null;
            }

            return this.gameObjLineInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_PickUpShoot_24911 extends GeneratedMessageV3 implements C2S_PickUpShoot_24911OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOOTID_FIELD_NUMBER = 1;
      private int shootId_;
      private byte memoizedIsInitialized;
      private static final C2S_PickUpShoot_24911 DEFAULT_INSTANCE = new C2S_PickUpShoot_24911();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PickUpShoot_24911> PARSER = new AbstractParser<C2S_PickUpShoot_24911>() {
         public C2S_PickUpShoot_24911 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PickUpShoot_24911(input, extensionRegistry);
         }
      };

      private C2S_PickUpShoot_24911(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PickUpShoot_24911() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PickUpShoot_24911();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PickUpShoot_24911(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shootId_ = input.readInt32();
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpShoot_24911_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpShoot_24911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PickUpShoot_24911.class, Builder.class);
      }

      public boolean hasShootId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShootId() {
         return this.shootId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShootId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shootId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shootId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PickUpShoot_24911)) {
            return super.equals(obj);
         } else {
            C2S_PickUpShoot_24911 other = (C2S_PickUpShoot_24911)obj;
            if (this.hasShootId() != other.hasShootId()) {
               return false;
            } else if (this.hasShootId() && this.getShootId() != other.getShootId()) {
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
            if (this.hasShootId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShootId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PickUpShoot_24911 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PickUpShoot_24911)PARSER.parseFrom(data);
      }

      public static C2S_PickUpShoot_24911 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PickUpShoot_24911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PickUpShoot_24911 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PickUpShoot_24911)PARSER.parseFrom(data);
      }

      public static C2S_PickUpShoot_24911 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PickUpShoot_24911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PickUpShoot_24911 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PickUpShoot_24911)PARSER.parseFrom(data);
      }

      public static C2S_PickUpShoot_24911 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PickUpShoot_24911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PickUpShoot_24911 parseFrom(InputStream input) throws IOException {
         return (C2S_PickUpShoot_24911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PickUpShoot_24911 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PickUpShoot_24911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PickUpShoot_24911 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PickUpShoot_24911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PickUpShoot_24911 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PickUpShoot_24911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PickUpShoot_24911 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PickUpShoot_24911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PickUpShoot_24911 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PickUpShoot_24911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PickUpShoot_24911 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PickUpShoot_24911 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PickUpShoot_24911> parser() {
         return PARSER;
      }

      public Parser<C2S_PickUpShoot_24911> getParserForType() {
         return PARSER;
      }

      public C2S_PickUpShoot_24911 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PickUpShoot_24911OrBuilder {
         private int bitField0_;
         private int shootId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpShoot_24911_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpShoot_24911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PickUpShoot_24911.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_PickUpShoot_24911.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shootId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpShoot_24911_descriptor;
         }

         public C2S_PickUpShoot_24911 getDefaultInstanceForType() {
            return ChildActMsg.C2S_PickUpShoot_24911.getDefaultInstance();
         }

         public C2S_PickUpShoot_24911 build() {
            C2S_PickUpShoot_24911 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PickUpShoot_24911 buildPartial() {
            C2S_PickUpShoot_24911 result = new C2S_PickUpShoot_24911(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shootId_ = this.shootId_;
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
            if (other instanceof C2S_PickUpShoot_24911) {
               return this.mergeFrom((C2S_PickUpShoot_24911)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PickUpShoot_24911 other) {
            if (other == ChildActMsg.C2S_PickUpShoot_24911.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShootId()) {
                  this.setShootId(other.getShootId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasShootId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PickUpShoot_24911 parsedMessage = null;

            try {
               parsedMessage = (C2S_PickUpShoot_24911)ChildActMsg.C2S_PickUpShoot_24911.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PickUpShoot_24911)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShootId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShootId() {
            return this.shootId_;
         }

         public Builder setShootId(int value) {
            this.bitField0_ |= 1;
            this.shootId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShootId() {
            this.bitField0_ &= -2;
            this.shootId_ = 0;
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

   public static final class S2C_PickUpShoot_24912 extends GeneratedMessageV3 implements S2C_PickUpShoot_24912OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CURPOINT_FIELD_NUMBER = 1;
      private int curPoint_;
      public static final int PICKUPOBJECTTYPECOUNT_FIELD_NUMBER = 2;
      private Internal.IntList pickUpObjectTypeCount_;
      private byte memoizedIsInitialized;
      private static final S2C_PickUpShoot_24912 DEFAULT_INSTANCE = new S2C_PickUpShoot_24912();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PickUpShoot_24912> PARSER = new AbstractParser<S2C_PickUpShoot_24912>() {
         public S2C_PickUpShoot_24912 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PickUpShoot_24912(input, extensionRegistry);
         }
      };

      private S2C_PickUpShoot_24912(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PickUpShoot_24912() {
         this.memoizedIsInitialized = -1;
         this.pickUpObjectTypeCount_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PickUpShoot_24912();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PickUpShoot_24912(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.curPoint_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.pickUpObjectTypeCount_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.pickUpObjectTypeCount_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.pickUpObjectTypeCount_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.pickUpObjectTypeCount_.addInt(input.readInt32());
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
                  this.pickUpObjectTypeCount_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_PickUpShoot_24912_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_PickUpShoot_24912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PickUpShoot_24912.class, Builder.class);
      }

      public boolean hasCurPoint() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurPoint() {
         return this.curPoint_;
      }

      public List<Integer> getPickUpObjectTypeCountList() {
         return this.pickUpObjectTypeCount_;
      }

      public int getPickUpObjectTypeCountCount() {
         return this.pickUpObjectTypeCount_.size();
      }

      public int getPickUpObjectTypeCount(int index) {
         return this.pickUpObjectTypeCount_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCurPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.curPoint_);
         }

         for(int i = 0; i < this.pickUpObjectTypeCount_.size(); ++i) {
            output.writeInt32(2, this.pickUpObjectTypeCount_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.curPoint_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.pickUpObjectTypeCount_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.pickUpObjectTypeCount_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPickUpObjectTypeCountList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PickUpShoot_24912)) {
            return super.equals(obj);
         } else {
            S2C_PickUpShoot_24912 other = (S2C_PickUpShoot_24912)obj;
            if (this.hasCurPoint() != other.hasCurPoint()) {
               return false;
            } else if (this.hasCurPoint() && this.getCurPoint() != other.getCurPoint()) {
               return false;
            } else if (!this.getPickUpObjectTypeCountList().equals(other.getPickUpObjectTypeCountList())) {
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
            if (this.hasCurPoint()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCurPoint();
            }

            if (this.getPickUpObjectTypeCountCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPickUpObjectTypeCountList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PickUpShoot_24912 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PickUpShoot_24912)PARSER.parseFrom(data);
      }

      public static S2C_PickUpShoot_24912 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PickUpShoot_24912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PickUpShoot_24912 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PickUpShoot_24912)PARSER.parseFrom(data);
      }

      public static S2C_PickUpShoot_24912 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PickUpShoot_24912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PickUpShoot_24912 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PickUpShoot_24912)PARSER.parseFrom(data);
      }

      public static S2C_PickUpShoot_24912 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PickUpShoot_24912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PickUpShoot_24912 parseFrom(InputStream input) throws IOException {
         return (S2C_PickUpShoot_24912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PickUpShoot_24912 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PickUpShoot_24912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PickUpShoot_24912 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PickUpShoot_24912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PickUpShoot_24912 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PickUpShoot_24912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PickUpShoot_24912 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PickUpShoot_24912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PickUpShoot_24912 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PickUpShoot_24912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PickUpShoot_24912 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PickUpShoot_24912 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PickUpShoot_24912> parser() {
         return PARSER;
      }

      public Parser<S2C_PickUpShoot_24912> getParserForType() {
         return PARSER;
      }

      public S2C_PickUpShoot_24912 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PickUpShoot_24912OrBuilder {
         private int bitField0_;
         private int curPoint_;
         private Internal.IntList pickUpObjectTypeCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_PickUpShoot_24912_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_PickUpShoot_24912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PickUpShoot_24912.class, Builder.class);
         }

         private Builder() {
            this.pickUpObjectTypeCount_ = ChildActMsg.S2C_PickUpShoot_24912.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.pickUpObjectTypeCount_ = ChildActMsg.S2C_PickUpShoot_24912.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.S2C_PickUpShoot_24912.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.curPoint_ = 0;
            this.bitField0_ &= -2;
            this.pickUpObjectTypeCount_ = ChildActMsg.S2C_PickUpShoot_24912.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_PickUpShoot_24912_descriptor;
         }

         public S2C_PickUpShoot_24912 getDefaultInstanceForType() {
            return ChildActMsg.S2C_PickUpShoot_24912.getDefaultInstance();
         }

         public S2C_PickUpShoot_24912 build() {
            S2C_PickUpShoot_24912 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PickUpShoot_24912 buildPartial() {
            S2C_PickUpShoot_24912 result = new S2C_PickUpShoot_24912(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.curPoint_ = this.curPoint_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.pickUpObjectTypeCount_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.pickUpObjectTypeCount_ = this.pickUpObjectTypeCount_;
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
            if (other instanceof S2C_PickUpShoot_24912) {
               return this.mergeFrom((S2C_PickUpShoot_24912)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PickUpShoot_24912 other) {
            if (other == ChildActMsg.S2C_PickUpShoot_24912.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCurPoint()) {
                  this.setCurPoint(other.getCurPoint());
               }

               if (!other.pickUpObjectTypeCount_.isEmpty()) {
                  if (this.pickUpObjectTypeCount_.isEmpty()) {
                     this.pickUpObjectTypeCount_ = other.pickUpObjectTypeCount_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensurePickUpObjectTypeCountIsMutable();
                     this.pickUpObjectTypeCount_.addAll(other.pickUpObjectTypeCount_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCurPoint();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PickUpShoot_24912 parsedMessage = null;

            try {
               parsedMessage = (S2C_PickUpShoot_24912)ChildActMsg.S2C_PickUpShoot_24912.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PickUpShoot_24912)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCurPoint() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCurPoint() {
            return this.curPoint_;
         }

         public Builder setCurPoint(int value) {
            this.bitField0_ |= 1;
            this.curPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurPoint() {
            this.bitField0_ &= -2;
            this.curPoint_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePickUpObjectTypeCountIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.pickUpObjectTypeCount_ = ChildActMsg.S2C_PickUpShoot_24912.mutableCopy(this.pickUpObjectTypeCount_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getPickUpObjectTypeCountList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.pickUpObjectTypeCount_) : this.pickUpObjectTypeCount_);
         }

         public int getPickUpObjectTypeCountCount() {
            return this.pickUpObjectTypeCount_.size();
         }

         public int getPickUpObjectTypeCount(int index) {
            return this.pickUpObjectTypeCount_.getInt(index);
         }

         public Builder setPickUpObjectTypeCount(int index, int value) {
            this.ensurePickUpObjectTypeCountIsMutable();
            this.pickUpObjectTypeCount_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPickUpObjectTypeCount(int value) {
            this.ensurePickUpObjectTypeCountIsMutable();
            this.pickUpObjectTypeCount_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPickUpObjectTypeCount(Iterable<? extends Integer> values) {
            this.ensurePickUpObjectTypeCountIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.pickUpObjectTypeCount_);
            this.onChanged();
            return this;
         }

         public Builder clearPickUpObjectTypeCount() {
            this.pickUpObjectTypeCount_ = ChildActMsg.S2C_PickUpShoot_24912.emptyIntList();
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

   public static final class C2S_BuyTicket_24925 extends GeneratedMessageV3 implements C2S_BuyTicket_24925OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BuyTicket_24925 DEFAULT_INSTANCE = new C2S_BuyTicket_24925();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyTicket_24925> PARSER = new AbstractParser<C2S_BuyTicket_24925>() {
         public C2S_BuyTicket_24925 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyTicket_24925(input, extensionRegistry);
         }
      };

      private C2S_BuyTicket_24925(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyTicket_24925() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyTicket_24925();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyTicket_24925(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_BuyTicket_24925_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_BuyTicket_24925_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyTicket_24925.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BuyTicket_24925)) {
            return super.equals(obj);
         } else {
            C2S_BuyTicket_24925 other = (C2S_BuyTicket_24925)obj;
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

      public static C2S_BuyTicket_24925 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyTicket_24925)PARSER.parseFrom(data);
      }

      public static C2S_BuyTicket_24925 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyTicket_24925)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyTicket_24925 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyTicket_24925)PARSER.parseFrom(data);
      }

      public static C2S_BuyTicket_24925 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyTicket_24925)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyTicket_24925 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyTicket_24925)PARSER.parseFrom(data);
      }

      public static C2S_BuyTicket_24925 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyTicket_24925)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyTicket_24925 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyTicket_24925)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyTicket_24925 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyTicket_24925)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyTicket_24925 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyTicket_24925)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyTicket_24925 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyTicket_24925)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyTicket_24925 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyTicket_24925)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyTicket_24925 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyTicket_24925)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyTicket_24925 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyTicket_24925 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyTicket_24925> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyTicket_24925> getParserForType() {
         return PARSER;
      }

      public C2S_BuyTicket_24925 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyTicket_24925OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_BuyTicket_24925_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_BuyTicket_24925_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyTicket_24925.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_BuyTicket_24925.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_BuyTicket_24925_descriptor;
         }

         public C2S_BuyTicket_24925 getDefaultInstanceForType() {
            return ChildActMsg.C2S_BuyTicket_24925.getDefaultInstance();
         }

         public C2S_BuyTicket_24925 build() {
            C2S_BuyTicket_24925 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyTicket_24925 buildPartial() {
            C2S_BuyTicket_24925 result = new C2S_BuyTicket_24925(this);
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
            if (other instanceof C2S_BuyTicket_24925) {
               return this.mergeFrom((C2S_BuyTicket_24925)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyTicket_24925 other) {
            if (other == ChildActMsg.C2S_BuyTicket_24925.getDefaultInstance()) {
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
            C2S_BuyTicket_24925 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyTicket_24925)ChildActMsg.C2S_BuyTicket_24925.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyTicket_24925)e.getUnfinishedMessage();
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

   public static final class C2S_PickUpGameControl_24926 extends GeneratedMessageV3 implements C2S_PickUpGameControl_24926OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SWITCHON_FIELD_NUMBER = 1;
      private int switchOn_;
      private byte memoizedIsInitialized;
      private static final C2S_PickUpGameControl_24926 DEFAULT_INSTANCE = new C2S_PickUpGameControl_24926();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PickUpGameControl_24926> PARSER = new AbstractParser<C2S_PickUpGameControl_24926>() {
         public C2S_PickUpGameControl_24926 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PickUpGameControl_24926(input, extensionRegistry);
         }
      };

      private C2S_PickUpGameControl_24926(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PickUpGameControl_24926() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PickUpGameControl_24926();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PickUpGameControl_24926(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.switchOn_ = input.readInt32();
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpGameControl_24926_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpGameControl_24926_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PickUpGameControl_24926.class, Builder.class);
      }

      public boolean hasSwitchOn() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSwitchOn() {
         return this.switchOn_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSwitchOn()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.switchOn_);
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
               size += CodedOutputStream.computeInt32Size(1, this.switchOn_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PickUpGameControl_24926)) {
            return super.equals(obj);
         } else {
            C2S_PickUpGameControl_24926 other = (C2S_PickUpGameControl_24926)obj;
            if (this.hasSwitchOn() != other.hasSwitchOn()) {
               return false;
            } else if (this.hasSwitchOn() && this.getSwitchOn() != other.getSwitchOn()) {
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
            if (this.hasSwitchOn()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSwitchOn();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PickUpGameControl_24926 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PickUpGameControl_24926)PARSER.parseFrom(data);
      }

      public static C2S_PickUpGameControl_24926 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PickUpGameControl_24926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PickUpGameControl_24926 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PickUpGameControl_24926)PARSER.parseFrom(data);
      }

      public static C2S_PickUpGameControl_24926 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PickUpGameControl_24926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PickUpGameControl_24926 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PickUpGameControl_24926)PARSER.parseFrom(data);
      }

      public static C2S_PickUpGameControl_24926 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PickUpGameControl_24926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PickUpGameControl_24926 parseFrom(InputStream input) throws IOException {
         return (C2S_PickUpGameControl_24926)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PickUpGameControl_24926 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PickUpGameControl_24926)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PickUpGameControl_24926 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PickUpGameControl_24926)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PickUpGameControl_24926 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PickUpGameControl_24926)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PickUpGameControl_24926 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PickUpGameControl_24926)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PickUpGameControl_24926 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PickUpGameControl_24926)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PickUpGameControl_24926 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PickUpGameControl_24926 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PickUpGameControl_24926> parser() {
         return PARSER;
      }

      public Parser<C2S_PickUpGameControl_24926> getParserForType() {
         return PARSER;
      }

      public C2S_PickUpGameControl_24926 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PickUpGameControl_24926OrBuilder {
         private int bitField0_;
         private int switchOn_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpGameControl_24926_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpGameControl_24926_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PickUpGameControl_24926.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_PickUpGameControl_24926.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.switchOn_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_PickUpGameControl_24926_descriptor;
         }

         public C2S_PickUpGameControl_24926 getDefaultInstanceForType() {
            return ChildActMsg.C2S_PickUpGameControl_24926.getDefaultInstance();
         }

         public C2S_PickUpGameControl_24926 build() {
            C2S_PickUpGameControl_24926 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PickUpGameControl_24926 buildPartial() {
            C2S_PickUpGameControl_24926 result = new C2S_PickUpGameControl_24926(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.switchOn_ = this.switchOn_;
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
            if (other instanceof C2S_PickUpGameControl_24926) {
               return this.mergeFrom((C2S_PickUpGameControl_24926)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PickUpGameControl_24926 other) {
            if (other == ChildActMsg.C2S_PickUpGameControl_24926.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSwitchOn()) {
                  this.setSwitchOn(other.getSwitchOn());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSwitchOn();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PickUpGameControl_24926 parsedMessage = null;

            try {
               parsedMessage = (C2S_PickUpGameControl_24926)ChildActMsg.C2S_PickUpGameControl_24926.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PickUpGameControl_24926)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSwitchOn() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSwitchOn() {
            return this.switchOn_;
         }

         public Builder setSwitchOn(int value) {
            this.bitField0_ |= 1;
            this.switchOn_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSwitchOn() {
            this.bitField0_ &= -2;
            this.switchOn_ = 0;
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

   public static final class C2S_FancyReward_24913 extends GeneratedMessageV3 implements C2S_FancyReward_24913OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMINDEX_FIELD_NUMBER = 1;
      private int itemIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_24913 DEFAULT_INSTANCE = new C2S_FancyReward_24913();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_24913> PARSER = new AbstractParser<C2S_FancyReward_24913>() {
         public C2S_FancyReward_24913 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_24913(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_24913(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_24913() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_24913();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_24913(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_FancyReward_24913_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_FancyReward_24913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_24913.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FancyReward_24913)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_24913 other = (C2S_FancyReward_24913)obj;
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

      public static C2S_FancyReward_24913 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24913)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_24913 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_24913 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24913)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_24913 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_24913 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24913)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_24913 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_24913 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_24913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_24913 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_24913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_24913 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_24913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_24913 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_24913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_24913 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_24913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_24913 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_24913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_24913 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_24913 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_24913> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_24913> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_24913 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_24913OrBuilder {
         private int bitField0_;
         private int itemIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_FancyReward_24913_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_FancyReward_24913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_24913.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_FancyReward_24913.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemIndex_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_FancyReward_24913_descriptor;
         }

         public C2S_FancyReward_24913 getDefaultInstanceForType() {
            return ChildActMsg.C2S_FancyReward_24913.getDefaultInstance();
         }

         public C2S_FancyReward_24913 build() {
            C2S_FancyReward_24913 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_24913 buildPartial() {
            C2S_FancyReward_24913 result = new C2S_FancyReward_24913(this);
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
            if (other instanceof C2S_FancyReward_24913) {
               return this.mergeFrom((C2S_FancyReward_24913)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_24913 other) {
            if (other == ChildActMsg.C2S_FancyReward_24913.getDefaultInstance()) {
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
            C2S_FancyReward_24913 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_24913)ChildActMsg.C2S_FancyReward_24913.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_24913)e.getUnfinishedMessage();
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

   public static final class S2C_FancyReward_24914 extends GeneratedMessageV3 implements S2C_FancyReward_24914OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ITEMINDEX_FIELD_NUMBER = 2;
      private int itemIndex_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_24914 DEFAULT_INSTANCE = new S2C_FancyReward_24914();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_24914> PARSER = new AbstractParser<S2C_FancyReward_24914>() {
         public S2C_FancyReward_24914 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_24914(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_24914(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_24914() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_24914();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_24914(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_FancyReward_24914_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_FancyReward_24914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_24914.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FancyReward_24914)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_24914 other = (S2C_FancyReward_24914)obj;
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

      public static S2C_FancyReward_24914 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24914)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_24914 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_24914 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24914)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_24914 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_24914 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24914)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_24914 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_24914 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_24914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_24914 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_24914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_24914 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_24914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_24914 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_24914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_24914 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_24914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_24914 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_24914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_24914 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_24914 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_24914> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_24914> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_24914 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_24914OrBuilder {
         private int bitField0_;
         private int result_;
         private int itemIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_FancyReward_24914_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_FancyReward_24914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_24914.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.S2C_FancyReward_24914.alwaysUseFieldBuilders) {
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
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_FancyReward_24914_descriptor;
         }

         public S2C_FancyReward_24914 getDefaultInstanceForType() {
            return ChildActMsg.S2C_FancyReward_24914.getDefaultInstance();
         }

         public S2C_FancyReward_24914 build() {
            S2C_FancyReward_24914 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_24914 buildPartial() {
            S2C_FancyReward_24914 result = new S2C_FancyReward_24914(this);
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
            if (other instanceof S2C_FancyReward_24914) {
               return this.mergeFrom((S2C_FancyReward_24914)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_24914 other) {
            if (other == ChildActMsg.S2C_FancyReward_24914.getDefaultInstance()) {
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
            S2C_FancyReward_24914 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_24914)ChildActMsg.S2C_FancyReward_24914.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_24914)e.getUnfinishedMessage();
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

   public static final class C2S_OpenEggUi_24915 extends GeneratedMessageV3 implements C2S_OpenEggUi_24915OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenEggUi_24915 DEFAULT_INSTANCE = new C2S_OpenEggUi_24915();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenEggUi_24915> PARSER = new AbstractParser<C2S_OpenEggUi_24915>() {
         public C2S_OpenEggUi_24915 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenEggUi_24915(input, extensionRegistry);
         }
      };

      private C2S_OpenEggUi_24915(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenEggUi_24915() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenEggUi_24915();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenEggUi_24915(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_OpenEggUi_24915_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_OpenEggUi_24915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenEggUi_24915.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenEggUi_24915)) {
            return super.equals(obj);
         } else {
            C2S_OpenEggUi_24915 other = (C2S_OpenEggUi_24915)obj;
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

      public static C2S_OpenEggUi_24915 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_24915)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_24915 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_24915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_24915 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_24915)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_24915 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_24915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_24915 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_24915)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_24915 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_24915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_24915 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenEggUi_24915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_24915 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_24915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenEggUi_24915 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenEggUi_24915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_24915 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_24915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenEggUi_24915 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenEggUi_24915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_24915 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_24915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenEggUi_24915 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenEggUi_24915 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenEggUi_24915> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenEggUi_24915> getParserForType() {
         return PARSER;
      }

      public C2S_OpenEggUi_24915 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenEggUi_24915OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_OpenEggUi_24915_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_OpenEggUi_24915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenEggUi_24915.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_OpenEggUi_24915.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_OpenEggUi_24915_descriptor;
         }

         public C2S_OpenEggUi_24915 getDefaultInstanceForType() {
            return ChildActMsg.C2S_OpenEggUi_24915.getDefaultInstance();
         }

         public C2S_OpenEggUi_24915 build() {
            C2S_OpenEggUi_24915 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenEggUi_24915 buildPartial() {
            C2S_OpenEggUi_24915 result = new C2S_OpenEggUi_24915(this);
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
            if (other instanceof C2S_OpenEggUi_24915) {
               return this.mergeFrom((C2S_OpenEggUi_24915)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenEggUi_24915 other) {
            if (other == ChildActMsg.C2S_OpenEggUi_24915.getDefaultInstance()) {
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
            C2S_OpenEggUi_24915 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenEggUi_24915)ChildActMsg.C2S_OpenEggUi_24915.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenEggUi_24915)e.getUnfinishedMessage();
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

   public static final class S2C_OpenEggUi_24916 extends GeneratedMessageV3 implements S2C_OpenEggUi_24916OrBuilder {
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
      public static final int RECRUITNUM_FIELD_NUMBER = 7;
      private int recruitNum_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenEggUi_24916 DEFAULT_INSTANCE = new S2C_OpenEggUi_24916();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenEggUi_24916> PARSER = new AbstractParser<S2C_OpenEggUi_24916>() {
         public S2C_OpenEggUi_24916 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenEggUi_24916(input, extensionRegistry);
         }
      };

      private S2C_OpenEggUi_24916(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenEggUi_24916() {
         this.memoizedIsInitialized = -1;
         this.seniorRewards_ = Collections.emptyList();
         this.takedLuck_ = emptyIntList();
         this.eggs_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenEggUi_24916();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenEggUi_24916(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 56:
                        this.bitField0_ |= 8;
                        this.recruitNum_ = input.readInt32();
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_OpenEggUi_24916_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_OpenEggUi_24916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenEggUi_24916.class, Builder.class);
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

      public boolean hasRecruitNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getRecruitNum() {
         return this.recruitNum_;
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
         } else if (!this.hasRecruitNum()) {
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

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(7, this.recruitNum_);
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

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.recruitNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenEggUi_24916)) {
            return super.equals(obj);
         } else {
            S2C_OpenEggUi_24916 other = (S2C_OpenEggUi_24916)obj;
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
            } else if (this.hasRecruitNum() != other.hasRecruitNum()) {
               return false;
            } else if (this.hasRecruitNum() && this.getRecruitNum() != other.getRecruitNum()) {
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

            if (this.hasRecruitNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRecruitNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenEggUi_24916 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_24916)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_24916 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_24916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_24916 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_24916)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_24916 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_24916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_24916 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_24916)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_24916 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_24916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_24916 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenEggUi_24916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_24916 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_24916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenEggUi_24916 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenEggUi_24916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_24916 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_24916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenEggUi_24916 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenEggUi_24916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_24916 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_24916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenEggUi_24916 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenEggUi_24916 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenEggUi_24916> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenEggUi_24916> getParserForType() {
         return PARSER;
      }

      public S2C_OpenEggUi_24916 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenEggUi_24916OrBuilder {
         private int bitField0_;
         private int fancyId_;
         private List<CommonMsg.MapDataII> seniorRewards_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorRewardsBuilder_;
         private int smashEggNum_;
         private Internal.IntList takedLuck_;
         private List<CommonMsg.MapDataII> eggs_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> eggsBuilder_;
         private int fancyGroupDrawTimes_;
         private int recruitNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_OpenEggUi_24916_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_OpenEggUi_24916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenEggUi_24916.class, Builder.class);
         }

         private Builder() {
            this.seniorRewards_ = Collections.emptyList();
            this.takedLuck_ = ChildActMsg.S2C_OpenEggUi_24916.emptyIntList();
            this.eggs_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.seniorRewards_ = Collections.emptyList();
            this.takedLuck_ = ChildActMsg.S2C_OpenEggUi_24916.emptyIntList();
            this.eggs_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.S2C_OpenEggUi_24916.alwaysUseFieldBuilders) {
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
            this.takedLuck_ = ChildActMsg.S2C_OpenEggUi_24916.emptyIntList();
            this.bitField0_ &= -9;
            if (this.eggsBuilder_ == null) {
               this.eggs_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.eggsBuilder_.clear();
            }

            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -33;
            this.recruitNum_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_OpenEggUi_24916_descriptor;
         }

         public S2C_OpenEggUi_24916 getDefaultInstanceForType() {
            return ChildActMsg.S2C_OpenEggUi_24916.getDefaultInstance();
         }

         public S2C_OpenEggUi_24916 build() {
            S2C_OpenEggUi_24916 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenEggUi_24916 buildPartial() {
            S2C_OpenEggUi_24916 result = new S2C_OpenEggUi_24916(this);
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

            if ((from_bitField0_ & 64) != 0) {
               result.recruitNum_ = this.recruitNum_;
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
            if (other instanceof S2C_OpenEggUi_24916) {
               return this.mergeFrom((S2C_OpenEggUi_24916)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenEggUi_24916 other) {
            if (other == ChildActMsg.S2C_OpenEggUi_24916.getDefaultInstance()) {
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
                     this.seniorRewardsBuilder_ = ChildActMsg.S2C_OpenEggUi_24916.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
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
                     this.eggsBuilder_ = ChildActMsg.S2C_OpenEggUi_24916.alwaysUseFieldBuilders ? this.getEggsFieldBuilder() : null;
                  } else {
                     this.eggsBuilder_.addAllMessages(other.eggs_);
                  }
               }

               if (other.hasFancyGroupDrawTimes()) {
                  this.setFancyGroupDrawTimes(other.getFancyGroupDrawTimes());
               }

               if (other.hasRecruitNum()) {
                  this.setRecruitNum(other.getRecruitNum());
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
            } else if (!this.hasRecruitNum()) {
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
            S2C_OpenEggUi_24916 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenEggUi_24916)ChildActMsg.S2C_OpenEggUi_24916.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenEggUi_24916)e.getUnfinishedMessage();
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
               this.takedLuck_ = ChildActMsg.S2C_OpenEggUi_24916.mutableCopy(this.takedLuck_);
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
            this.takedLuck_ = ChildActMsg.S2C_OpenEggUi_24916.emptyIntList();
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

         public boolean hasRecruitNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getRecruitNum() {
            return this.recruitNum_;
         }

         public Builder setRecruitNum(int value) {
            this.bitField0_ |= 64;
            this.recruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitNum() {
            this.bitField0_ &= -65;
            this.recruitNum_ = 0;
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

   public static final class C2S_SmashEgg_24917 extends GeneratedMessageV3 implements C2S_SmashEgg_24917OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      public static final int INDEX_FIELD_NUMBER = 2;
      private int index_;
      private byte memoizedIsInitialized;
      private static final C2S_SmashEgg_24917 DEFAULT_INSTANCE = new C2S_SmashEgg_24917();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SmashEgg_24917> PARSER = new AbstractParser<C2S_SmashEgg_24917>() {
         public C2S_SmashEgg_24917 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SmashEgg_24917(input, extensionRegistry);
         }
      };

      private C2S_SmashEgg_24917(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SmashEgg_24917() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SmashEgg_24917();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SmashEgg_24917(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_SmashEgg_24917_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_SmashEgg_24917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SmashEgg_24917.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SmashEgg_24917)) {
            return super.equals(obj);
         } else {
            C2S_SmashEgg_24917 other = (C2S_SmashEgg_24917)obj;
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

      public static C2S_SmashEgg_24917 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_24917)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_24917 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_24917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_24917 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_24917)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_24917 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_24917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_24917 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_24917)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_24917 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_24917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_24917 parseFrom(InputStream input) throws IOException {
         return (C2S_SmashEgg_24917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_24917 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_24917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SmashEgg_24917 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SmashEgg_24917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_24917 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_24917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SmashEgg_24917 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SmashEgg_24917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_24917 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_24917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SmashEgg_24917 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SmashEgg_24917 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SmashEgg_24917> parser() {
         return PARSER;
      }

      public Parser<C2S_SmashEgg_24917> getParserForType() {
         return PARSER;
      }

      public C2S_SmashEgg_24917 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SmashEgg_24917OrBuilder {
         private int bitField0_;
         private int num_;
         private int index_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_SmashEgg_24917_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_SmashEgg_24917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SmashEgg_24917.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_SmashEgg_24917.alwaysUseFieldBuilders) {
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
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_SmashEgg_24917_descriptor;
         }

         public C2S_SmashEgg_24917 getDefaultInstanceForType() {
            return ChildActMsg.C2S_SmashEgg_24917.getDefaultInstance();
         }

         public C2S_SmashEgg_24917 build() {
            C2S_SmashEgg_24917 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SmashEgg_24917 buildPartial() {
            C2S_SmashEgg_24917 result = new C2S_SmashEgg_24917(this);
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
            if (other instanceof C2S_SmashEgg_24917) {
               return this.mergeFrom((C2S_SmashEgg_24917)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SmashEgg_24917 other) {
            if (other == ChildActMsg.C2S_SmashEgg_24917.getDefaultInstance()) {
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
            C2S_SmashEgg_24917 parsedMessage = null;

            try {
               parsedMessage = (C2S_SmashEgg_24917)ChildActMsg.C2S_SmashEgg_24917.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SmashEgg_24917)e.getUnfinishedMessage();
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

   public static final class S2C_SmashEgg_24918 extends GeneratedMessageV3 implements S2C_SmashEgg_24918OrBuilder {
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
      public static final int RECRUITNUM_FIELD_NUMBER = 9;
      private int recruitNum_;
      private byte memoizedIsInitialized;
      private static final S2C_SmashEgg_24918 DEFAULT_INSTANCE = new S2C_SmashEgg_24918();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SmashEgg_24918> PARSER = new AbstractParser<S2C_SmashEgg_24918>() {
         public S2C_SmashEgg_24918 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SmashEgg_24918(input, extensionRegistry);
         }
      };

      private S2C_SmashEgg_24918(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SmashEgg_24918() {
         this.memoizedIsInitialized = -1;
         this.indexs_ = Collections.emptyList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SmashEgg_24918();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SmashEgg_24918(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 72:
                        this.bitField0_ |= 64;
                        this.recruitNum_ = input.readInt32();
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_SmashEgg_24918_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_SmashEgg_24918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SmashEgg_24918.class, Builder.class);
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

      public boolean hasRecruitNum() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getRecruitNum() {
         return this.recruitNum_;
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
         } else if (!this.hasRecruitNum()) {
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

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(9, this.recruitNum_);
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

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.recruitNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SmashEgg_24918)) {
            return super.equals(obj);
         } else {
            S2C_SmashEgg_24918 other = (S2C_SmashEgg_24918)obj;
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
            } else if (this.hasRecruitNum() != other.hasRecruitNum()) {
               return false;
            } else if (this.hasRecruitNum() && this.getRecruitNum() != other.getRecruitNum()) {
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

            if (this.hasRecruitNum()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getRecruitNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SmashEgg_24918 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_24918)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_24918 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_24918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_24918 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_24918)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_24918 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_24918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_24918 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_24918)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_24918 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_24918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_24918 parseFrom(InputStream input) throws IOException {
         return (S2C_SmashEgg_24918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_24918 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_24918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SmashEgg_24918 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SmashEgg_24918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_24918 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_24918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SmashEgg_24918 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SmashEgg_24918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_24918 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_24918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SmashEgg_24918 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SmashEgg_24918 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SmashEgg_24918> parser() {
         return PARSER;
      }

      public Parser<S2C_SmashEgg_24918> getParserForType() {
         return PARSER;
      }

      public S2C_SmashEgg_24918 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SmashEgg_24918OrBuilder {
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
         private int recruitNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_SmashEgg_24918_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_SmashEgg_24918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SmashEgg_24918.class, Builder.class);
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
            if (ChildActMsg.S2C_SmashEgg_24918.alwaysUseFieldBuilders) {
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
            this.recruitNum_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_SmashEgg_24918_descriptor;
         }

         public S2C_SmashEgg_24918 getDefaultInstanceForType() {
            return ChildActMsg.S2C_SmashEgg_24918.getDefaultInstance();
         }

         public S2C_SmashEgg_24918 build() {
            S2C_SmashEgg_24918 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SmashEgg_24918 buildPartial() {
            S2C_SmashEgg_24918 result = new S2C_SmashEgg_24918(this);
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

            if ((from_bitField0_ & 256) != 0) {
               result.recruitNum_ = this.recruitNum_;
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
            if (other instanceof S2C_SmashEgg_24918) {
               return this.mergeFrom((S2C_SmashEgg_24918)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SmashEgg_24918 other) {
            if (other == ChildActMsg.S2C_SmashEgg_24918.getDefaultInstance()) {
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
                     this.indexsBuilder_ = ChildActMsg.S2C_SmashEgg_24918.alwaysUseFieldBuilders ? this.getIndexsFieldBuilder() : null;
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
                     this.seniorNumBuilder_ = ChildActMsg.S2C_SmashEgg_24918.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
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

               if (other.hasRecruitNum()) {
                  this.setRecruitNum(other.getRecruitNum());
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
            } else if (!this.hasRecruitNum()) {
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
            S2C_SmashEgg_24918 parsedMessage = null;

            try {
               parsedMessage = (S2C_SmashEgg_24918)ChildActMsg.S2C_SmashEgg_24918.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SmashEgg_24918)e.getUnfinishedMessage();
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

         public boolean hasRecruitNum() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getRecruitNum() {
            return this.recruitNum_;
         }

         public Builder setRecruitNum(int value) {
            this.bitField0_ |= 256;
            this.recruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitNum() {
            this.bitField0_ &= -257;
            this.recruitNum_ = 0;
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

   public static final class C2S_TakeLuckReward_24919 extends GeneratedMessageV3 implements C2S_TakeLuckReward_24919OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeLuckReward_24919 DEFAULT_INSTANCE = new C2S_TakeLuckReward_24919();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeLuckReward_24919> PARSER = new AbstractParser<C2S_TakeLuckReward_24919>() {
         public C2S_TakeLuckReward_24919 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeLuckReward_24919(input, extensionRegistry);
         }
      };

      private C2S_TakeLuckReward_24919(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeLuckReward_24919() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeLuckReward_24919();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeLuckReward_24919(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_TakeLuckReward_24919_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_TakeLuckReward_24919_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeLuckReward_24919.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakeLuckReward_24919)) {
            return super.equals(obj);
         } else {
            C2S_TakeLuckReward_24919 other = (C2S_TakeLuckReward_24919)obj;
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

      public static C2S_TakeLuckReward_24919 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_24919)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_24919 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_24919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_24919 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_24919)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_24919 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_24919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_24919 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_24919)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_24919 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_24919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_24919 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeLuckReward_24919)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_24919 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_24919)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeLuckReward_24919 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeLuckReward_24919)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_24919 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_24919)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeLuckReward_24919 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeLuckReward_24919)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_24919 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_24919)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeLuckReward_24919 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeLuckReward_24919 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeLuckReward_24919> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeLuckReward_24919> getParserForType() {
         return PARSER;
      }

      public C2S_TakeLuckReward_24919 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeLuckReward_24919OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_TakeLuckReward_24919_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_TakeLuckReward_24919_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeLuckReward_24919.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_TakeLuckReward_24919.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_TakeLuckReward_24919_descriptor;
         }

         public C2S_TakeLuckReward_24919 getDefaultInstanceForType() {
            return ChildActMsg.C2S_TakeLuckReward_24919.getDefaultInstance();
         }

         public C2S_TakeLuckReward_24919 build() {
            C2S_TakeLuckReward_24919 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeLuckReward_24919 buildPartial() {
            C2S_TakeLuckReward_24919 result = new C2S_TakeLuckReward_24919(this);
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
            if (other instanceof C2S_TakeLuckReward_24919) {
               return this.mergeFrom((C2S_TakeLuckReward_24919)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeLuckReward_24919 other) {
            if (other == ChildActMsg.C2S_TakeLuckReward_24919.getDefaultInstance()) {
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
            C2S_TakeLuckReward_24919 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeLuckReward_24919)ChildActMsg.C2S_TakeLuckReward_24919.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeLuckReward_24919)e.getUnfinishedMessage();
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

   public static final class S2C_TakeLuckReward_24920 extends GeneratedMessageV3 implements S2C_TakeLuckReward_24920OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TAKEDID_FIELD_NUMBER = 2;
      private Internal.IntList takedId_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeLuckReward_24920 DEFAULT_INSTANCE = new S2C_TakeLuckReward_24920();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeLuckReward_24920> PARSER = new AbstractParser<S2C_TakeLuckReward_24920>() {
         public S2C_TakeLuckReward_24920 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeLuckReward_24920(input, extensionRegistry);
         }
      };

      private S2C_TakeLuckReward_24920(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeLuckReward_24920() {
         this.memoizedIsInitialized = -1;
         this.takedId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeLuckReward_24920();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeLuckReward_24920(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_TakeLuckReward_24920_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_TakeLuckReward_24920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeLuckReward_24920.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TakeLuckReward_24920)) {
            return super.equals(obj);
         } else {
            S2C_TakeLuckReward_24920 other = (S2C_TakeLuckReward_24920)obj;
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

      public static S2C_TakeLuckReward_24920 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_24920)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_24920 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_24920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_24920 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_24920)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_24920 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_24920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_24920 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_24920)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_24920 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_24920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_24920 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeLuckReward_24920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_24920 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_24920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeLuckReward_24920 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeLuckReward_24920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_24920 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_24920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeLuckReward_24920 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeLuckReward_24920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_24920 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_24920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeLuckReward_24920 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeLuckReward_24920 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeLuckReward_24920> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeLuckReward_24920> getParserForType() {
         return PARSER;
      }

      public S2C_TakeLuckReward_24920 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeLuckReward_24920OrBuilder {
         private int bitField0_;
         private int result_;
         private Internal.IntList takedId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_TakeLuckReward_24920_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_TakeLuckReward_24920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeLuckReward_24920.class, Builder.class);
         }

         private Builder() {
            this.takedId_ = ChildActMsg.S2C_TakeLuckReward_24920.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.takedId_ = ChildActMsg.S2C_TakeLuckReward_24920.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.S2C_TakeLuckReward_24920.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.takedId_ = ChildActMsg.S2C_TakeLuckReward_24920.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_TakeLuckReward_24920_descriptor;
         }

         public S2C_TakeLuckReward_24920 getDefaultInstanceForType() {
            return ChildActMsg.S2C_TakeLuckReward_24920.getDefaultInstance();
         }

         public S2C_TakeLuckReward_24920 build() {
            S2C_TakeLuckReward_24920 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeLuckReward_24920 buildPartial() {
            S2C_TakeLuckReward_24920 result = new S2C_TakeLuckReward_24920(this);
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
            if (other instanceof S2C_TakeLuckReward_24920) {
               return this.mergeFrom((S2C_TakeLuckReward_24920)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeLuckReward_24920 other) {
            if (other == ChildActMsg.S2C_TakeLuckReward_24920.getDefaultInstance()) {
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
            S2C_TakeLuckReward_24920 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeLuckReward_24920)ChildActMsg.S2C_TakeLuckReward_24920.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeLuckReward_24920)e.getUnfinishedMessage();
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
               this.takedId_ = ChildActMsg.S2C_TakeLuckReward_24920.mutableCopy(this.takedId_);
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
            this.takedId_ = ChildActMsg.S2C_TakeLuckReward_24920.emptyIntList();
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

   public static final class C2S_DrawRecord_24921 extends GeneratedMessageV3 implements C2S_DrawRecord_24921OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_24921 DEFAULT_INSTANCE = new C2S_DrawRecord_24921();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_24921> PARSER = new AbstractParser<C2S_DrawRecord_24921>() {
         public C2S_DrawRecord_24921 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_24921(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_24921(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_24921() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_24921();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_24921(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_DrawRecord_24921_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_DrawRecord_24921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_24921.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_24921)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_24921 other = (C2S_DrawRecord_24921)obj;
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

      public static C2S_DrawRecord_24921 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24921)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_24921 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_24921 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24921)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_24921 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_24921 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24921)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_24921 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_24921 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_24921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_24921 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_24921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_24921 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_24921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_24921 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_24921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_24921 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_24921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_24921 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_24921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_24921 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_24921 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_24921> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_24921> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_24921 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_24921OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_DrawRecord_24921_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_DrawRecord_24921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_24921.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_DrawRecord_24921.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_DrawRecord_24921_descriptor;
         }

         public C2S_DrawRecord_24921 getDefaultInstanceForType() {
            return ChildActMsg.C2S_DrawRecord_24921.getDefaultInstance();
         }

         public C2S_DrawRecord_24921 build() {
            C2S_DrawRecord_24921 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_24921 buildPartial() {
            C2S_DrawRecord_24921 result = new C2S_DrawRecord_24921(this);
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
            if (other instanceof C2S_DrawRecord_24921) {
               return this.mergeFrom((C2S_DrawRecord_24921)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_24921 other) {
            if (other == ChildActMsg.C2S_DrawRecord_24921.getDefaultInstance()) {
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
            C2S_DrawRecord_24921 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_24921)ChildActMsg.C2S_DrawRecord_24921.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_24921)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_24922 extends GeneratedMessageV3 implements S2C_DrawRecord_24922OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<MyDrawRecord> myRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_24922 DEFAULT_INSTANCE = new S2C_DrawRecord_24922();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_24922> PARSER = new AbstractParser<S2C_DrawRecord_24922>() {
         public S2C_DrawRecord_24922 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_24922(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_24922(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_24922() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_24922();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_24922(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(ChildActMsg.MyDrawRecord.PARSER, extensionRegistry));
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_DrawRecord_24922_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_DrawRecord_24922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_24922.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawRecord_24922)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_24922 other = (S2C_DrawRecord_24922)obj;
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

      public static S2C_DrawRecord_24922 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24922)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_24922 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_24922 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24922)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_24922 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_24922 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24922)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_24922 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_24922 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_24922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_24922 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_24922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_24922 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_24922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_24922 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_24922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_24922 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_24922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_24922 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_24922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_24922 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_24922 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_24922> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_24922> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_24922 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_24922OrBuilder {
         private int bitField0_;
         private List<MyDrawRecord> myRecord_;
         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> myRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_DrawRecord_24922_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_DrawRecord_24922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_24922.class, Builder.class);
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
            if (ChildActMsg.S2C_DrawRecord_24922.alwaysUseFieldBuilders) {
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
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_DrawRecord_24922_descriptor;
         }

         public S2C_DrawRecord_24922 getDefaultInstanceForType() {
            return ChildActMsg.S2C_DrawRecord_24922.getDefaultInstance();
         }

         public S2C_DrawRecord_24922 build() {
            S2C_DrawRecord_24922 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_24922 buildPartial() {
            S2C_DrawRecord_24922 result = new S2C_DrawRecord_24922(this);
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
            if (other instanceof S2C_DrawRecord_24922) {
               return this.mergeFrom((S2C_DrawRecord_24922)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_24922 other) {
            if (other == ChildActMsg.S2C_DrawRecord_24922.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = ChildActMsg.S2C_DrawRecord_24922.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
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
            S2C_DrawRecord_24922 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_24922)ChildActMsg.S2C_DrawRecord_24922.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_24922)e.getUnfinishedMessage();
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
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(ChildActMsg.MyDrawRecord.getDefaultInstance());
         }

         public MyDrawRecord.Builder addMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, ChildActMsg.MyDrawRecord.getDefaultInstance());
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

   public static final class C2S_ServerDrawRecord_24923 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_24923OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_24923 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_24923();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_24923> PARSER = new AbstractParser<C2S_ServerDrawRecord_24923>() {
         public C2S_ServerDrawRecord_24923 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_24923(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_24923(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_24923() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_24923();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_24923(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ServerDrawRecord_24923_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ServerDrawRecord_24923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_24923.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_24923)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_24923 other = (C2S_ServerDrawRecord_24923)obj;
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

      public static C2S_ServerDrawRecord_24923 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24923)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_24923 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_24923 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24923)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_24923 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_24923 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24923)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_24923 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_24923 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_24923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_24923 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_24923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_24923 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_24923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_24923 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_24923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_24923 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_24923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_24923 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_24923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_24923 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_24923 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_24923> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_24923> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_24923 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_24923OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ServerDrawRecord_24923_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ServerDrawRecord_24923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_24923.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChildActMsg.C2S_ServerDrawRecord_24923.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_C2S_ServerDrawRecord_24923_descriptor;
         }

         public C2S_ServerDrawRecord_24923 getDefaultInstanceForType() {
            return ChildActMsg.C2S_ServerDrawRecord_24923.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_24923 build() {
            C2S_ServerDrawRecord_24923 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_24923 buildPartial() {
            C2S_ServerDrawRecord_24923 result = new C2S_ServerDrawRecord_24923(this);
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
            if (other instanceof C2S_ServerDrawRecord_24923) {
               return this.mergeFrom((C2S_ServerDrawRecord_24923)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_24923 other) {
            if (other == ChildActMsg.C2S_ServerDrawRecord_24923.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_24923 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_24923)ChildActMsg.C2S_ServerDrawRecord_24923.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_24923)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_24924 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_24924OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_24924 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_24924();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_24924> PARSER = new AbstractParser<S2C_ServerDrawRecord_24924>() {
         public S2C_ServerDrawRecord_24924 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_24924(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_24924(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_24924() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_24924();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_24924(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.serverRecord_.add(input.readMessage(ChildActMsg.ServerDrawRecord.PARSER, extensionRegistry));
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ServerDrawRecord_24924_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ServerDrawRecord_24924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_24924.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_24924)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_24924 other = (S2C_ServerDrawRecord_24924)obj;
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

      public static S2C_ServerDrawRecord_24924 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24924)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_24924 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_24924 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24924)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_24924 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_24924 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24924)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_24924 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_24924 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_24924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_24924 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_24924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_24924 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_24924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_24924 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_24924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_24924 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_24924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_24924 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_24924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_24924 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_24924 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_24924> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_24924> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_24924 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_24924OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ServerDrawRecord_24924_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ServerDrawRecord_24924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_24924.class, Builder.class);
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
            if (ChildActMsg.S2C_ServerDrawRecord_24924.alwaysUseFieldBuilders) {
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
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_S2C_ServerDrawRecord_24924_descriptor;
         }

         public S2C_ServerDrawRecord_24924 getDefaultInstanceForType() {
            return ChildActMsg.S2C_ServerDrawRecord_24924.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_24924 build() {
            S2C_ServerDrawRecord_24924 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_24924 buildPartial() {
            S2C_ServerDrawRecord_24924 result = new S2C_ServerDrawRecord_24924(this);
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
            if (other instanceof S2C_ServerDrawRecord_24924) {
               return this.mergeFrom((S2C_ServerDrawRecord_24924)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_24924 other) {
            if (other == ChildActMsg.S2C_ServerDrawRecord_24924.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = ChildActMsg.S2C_ServerDrawRecord_24924.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_24924 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_24924)ChildActMsg.S2C_ServerDrawRecord_24924.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_24924)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(ChildActMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, ChildActMsg.ServerDrawRecord.getDefaultInstance());
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_MyDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            if (ChildActMsg.MyDrawRecord.alwaysUseFieldBuilders) {
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
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         public MyDrawRecord getDefaultInstanceForType() {
            return ChildActMsg.MyDrawRecord.getDefaultInstance();
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
            if (other == ChildActMsg.MyDrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = ChildActMsg.MyDrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
               parsedMessage = (MyDrawRecord)ChildActMsg.MyDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = ChildActMsg.MyDrawRecord.getDefaultInstance().getPlayerName();
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
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (ChildActMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            return ChildActMsg.internal_static_childAct_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return ChildActMsg.ServerDrawRecord.getDefaultInstance();
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
            if (other == ChildActMsg.ServerDrawRecord.getDefaultInstance()) {
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
               parsedMessage = (ServerDrawRecord)ChildActMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = ChildActMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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

   public interface C2S_ActivityInfo_24901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BuyTicket_24925OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawRecord_24921OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FancyReward_24913OrBuilder extends MessageOrBuilder {
      boolean hasItemIndex();

      int getItemIndex();
   }

   public interface C2S_OpenEggUi_24915OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PickUpGameControl_24926OrBuilder extends MessageOrBuilder {
      boolean hasSwitchOn();

      int getSwitchOn();
   }

   public interface C2S_PickUpInfo_24909OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PickUpShoot_24911OrBuilder extends MessageOrBuilder {
      boolean hasShootId();

      int getShootId();
   }

   public interface C2S_ReceiveShopAddUpReward_24905OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ServerDrawRecord_24923OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShopAddUpInfo_24903OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SignTotalInfo_24906OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Sign_24908OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface C2S_SmashEgg_24917OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();

      boolean hasIndex();

      int getIndex();
   }

   public interface C2S_TakeLuckReward_24919OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
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

   public interface PickUpGameObjInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasLineAndType();

      int getLineAndType();
   }

   public interface S2C_ActivityInfo_24902OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      boolean hasActivityDay();

      int getActivityDay();

      boolean hasSmashEggStage();

      int getSmashEggStage();
   }

   public interface S2C_DrawRecord_24922OrBuilder extends MessageOrBuilder {
      List<MyDrawRecord> getMyRecordList();

      MyDrawRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList();

      MyDrawRecordOrBuilder getMyRecordOrBuilder(int index);
   }

   public interface S2C_FancyReward_24914OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasItemIndex();

      int getItemIndex();
   }

   public interface S2C_OpenEggUi_24916OrBuilder extends MessageOrBuilder {
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

      boolean hasRecruitNum();

      int getRecruitNum();
   }

   public interface S2C_PickUpInfo_24910OrBuilder extends MessageOrBuilder {
      boolean hasPoint();

      int getPoint();

      boolean hasTicketBuyTimes();

      int getTicketBuyTimes();

      boolean hasTicketBuyCost();

      int getTicketBuyCost();

      boolean hasGameStartTime();

      int getGameStartTime();

      List<PickUpGameObjInfo> getGameObjLineInfoList();

      PickUpGameObjInfo getGameObjLineInfo(int index);

      int getGameObjLineInfoCount();

      List<? extends PickUpGameObjInfoOrBuilder> getGameObjLineInfoOrBuilderList();

      PickUpGameObjInfoOrBuilder getGameObjLineInfoOrBuilder(int index);
   }

   public interface S2C_PickUpShoot_24912OrBuilder extends MessageOrBuilder {
      boolean hasCurPoint();

      int getCurPoint();

      List<Integer> getPickUpObjectTypeCountList();

      int getPickUpObjectTypeCountCount();

      int getPickUpObjectTypeCount(int index);
   }

   public interface S2C_ServerDrawRecord_24924OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_ShopAddUpInfo_24904OrBuilder extends MessageOrBuilder {
      boolean hasDailyRecharge();

      int getDailyRecharge();

      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);
   }

   public interface S2C_SignTotalInfo_24907OrBuilder extends MessageOrBuilder {
      boolean hasActivityDay();

      int getActivityDay();

      List<Integer> getSignGotRewardsList();

      int getSignGotRewardsCount();

      int getSignGotRewards(int index);
   }

   public interface S2C_SmashEgg_24918OrBuilder extends MessageOrBuilder {
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

      boolean hasRecruitNum();

      int getRecruitNum();
   }

   public interface S2C_TakeLuckReward_24920OrBuilder extends MessageOrBuilder {
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
