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
import com.google.protobuf.ProtocolMessageEnum;
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

public final class SummerFestivalMsg {
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_ActivityInfo_28201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_ActivityInfo_28201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_ActivityInfo_28202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_ActivityInfo_28202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_ShopAddUpInfo_28203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_ShopAddUpInfo_28203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_ShopAddUpInfo_28204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_ShopAddUpInfo_28204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_28205_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_28205_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_SignTotalInfo_28206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_SignTotalInfo_28206_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_SignTotalInfo_28207_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_SignTotalInfo_28207_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_Sign_28208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_Sign_28208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_FancyReward_28209_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_FancyReward_28209_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_FancyReward_28210_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_FancyReward_28210_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_LuckDrawInfo_28211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_LuckDrawInfo_28211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_LuckDrawInfo_28212_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_LuckDrawInfo_28212_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_Draw_28213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_Draw_28213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_Draw_28214_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_Draw_28214_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_OpenReward_28215_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_OpenReward_28215_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_OpenReward_28216_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_OpenReward_28216_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_DrawRecord_28217_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_DrawRecord_28217_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_DrawRecord_28218_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_DrawRecord_28218_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_ServerDrawRecord_28219_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_ServerDrawRecord_28219_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_ServerDrawRecord_28220_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_ServerDrawRecord_28220_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_MyDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingGameInfo_28221_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingGameInfo_28221_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingGameInfo_28222_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingGameInfo_28222_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingBegin_28223_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingBegin_28223_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingBegin_28224_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingBegin_28224_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_BuyFishingTimes_28225_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_BuyFishingTimes_28225_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_BuyFishingTimes_28226_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_BuyFishingTimes_28226_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_FishInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_FishInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveFishBook_28227_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveFishBook_28227_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveFishBook_28228_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveFishBook_28228_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveActivationAward_28229_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveActivationAward_28229_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveActivationAward_28230_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveActivationAward_28230_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingEnd_28231_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingEnd_28231_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingEnd_28232_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingEnd_28232_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private SummerFestivalMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014SummerFestival.proto\u0012 summerFestival.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0018\n\u0016C2S_ActivityInfo_28201\">\n\u0016S2C_ActivityInfo_28202\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\u0002 \u0002(\u0005\"\u0019\n\u0017C2S_ShopAddUpInfo_28203\"D\n\u0017S2C_ShopAddUpInfo_28204\u0012\u0015\n\rdailyRecharge\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRewards\u0018\u0002 \u0003(\u0005\".\n C2S_ReceiveShopAddUpReward_28205\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_SignTotalInfo_28206\"F\n\u0017S2C_SignTotalInfo_28207\u0012\u0013\n\u000bactivityDay\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esignGotRewards\u0018\u0002 \u0003(\u0005\"\u001d\n\u000eC2S_Sign_28208\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\")\n\u0015C2S_FancyReward_28209\u0012\u0010\n\btargetId\u0018\u0001 \u0002(\u0005\"9\n\u0015S2C_FancyReward_28210\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_LuckDrawInfo_28211\"è\u0001\n\u0016S2C_LuckDrawInfo_28212\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bhadRewardId\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bstagEndTime\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0014\n\flotteryStage\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007fancyId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\u0012\u000f\n\u0007openDay\u0018\t \u0002(\u0005\"\u001e\n\u000eC2S_Draw_28213\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u00ad\u0001\n\u000eS2C_Draw_28214\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bisHaveFancy\u0018\u0006 \u0001(\b\u0012\u0010\n\btargetId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\"\n\u0014C2S_OpenReward_28215\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_OpenReward_28216\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_DrawRecord_28217\"X\n\u0014S2C_DrawRecord_28218\u0012@\n\bmyRecord\u0018\u0001 \u0003(\u000b2..summerFestival.com.gzbz.protobuf.MyDrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_28219\"f\n\u001aS2C_ServerDrawRecord_28220\u0012H\n\fserverRecord\u0018\u0001 \u0003(\u000b22.summerFestival.com.gzbz.protobuf.ServerDrawRecord\"Z\n\fMyDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"r\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0005 \u0001(\u0005\"\u001b\n\u0019C2S_FishingGameInfo_28221\"»\u0001\n\u0019S2C_FishingGameInfo_28222\u0012\u0017\n\u000fbuyFishingTimes\u0018\u0002 \u0002(\u0005\u0012<\n\bfishInfo\u0018\u0003 \u0003(\u000b2*.summerFestival.com.gzbz.protobuf.FishInfo\u0012\u0015\n\rreceivedAward\u0018\u0004 \u0003(\u0005\u0012\u0017\n\u000ffishingPointSum\u0018\u0005 \u0002(\u0005\u0012\u0017\n\u000factivationAward\u0018\u0006 \u0003(\u0005\"V\n\u0016C2S_FishingBegin_28223\u0012<\n\u0006length\u0018\u0001 \u0002(\u000e2,.summerFestival.com.gzbz.protobuf.FishLength\"(\n\u0016S2C_FishingBegin_28224\u0012\u000e\n\u0006fishId\u0018\u0001 \u0002(\u0005\"\u001b\n\u0019C2S_BuyFishingTimes_28225\"4\n\u0019S2C_BuyFishingTimes_28226\u0012\u0017\n\u000fbuyFishingTimes\u0018\u0002 \u0002(\u0005\"q\n\bFishInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tlengthMin\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tlengthMax\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bpointMin\u0018\u0004 \u0002(\u0005\u0012\u0010\n\bpointMax\u0018\u0005 \u0002(\u0005\u0012\u000f\n\u0007fishSum\u0018\u0006 \u0002(\u0005\"'\n\u0019C2S_ReceiveFishBook_28227\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"2\n\u0019S2C_ReceiveFishBook_28228\u0012\u0015\n\rreceivedAward\u0018\u0001 \u0003(\u0005\".\n C2S_ReceiveActivationAward_28229\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\";\n S2C_ReceiveActivationAward_28230\u0012\u0017\n\u000factivationAward\u0018\u0006 \u0003(\u0005\"+\n\u0014C2S_FishingEnd_28231\u0012\u0013\n\u000bareaSuccess\u0018\u0002 \u0002(\b\"À\u0001\n\u0014S2C_FishingEnd_28232\u0012\u000e\n\u0006fishId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006length\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005point\u0018\u0003 \u0002(\u0005\u0012\u0017\n\u000ffishingPointSum\u0018\u0004 \u0002(\u0005\u0012<\n\bfishInfo\u0018\u0005 \u0002(\u000b2*.summerFestival.com.gzbz.protobuf.FishInfo\u0012\"\n\bitemInfo\u0018\u0006 \u0003(\u000b2\u0010.common.ItemInfo*A\n\nFishLength\u0012\u0011\n\rLENGTH_NORMAL\u0010\u0001\u0012\u000f\n\u000bLENGTH_HIGH\u0010\u0002\u0012\u000f\n\u000bLENGTH_BEST\u0010\u0003B(\n\u0011com.gzbz.protobufB\u0011SummerFestivalMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ActivityInfo_28201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ActivityInfo_28201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_ActivityInfo_28201_descriptor, new String[0]);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_ActivityInfo_28202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_ActivityInfo_28202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_ActivityInfo_28202_descriptor, new String[]{"OpenDay", "ActivityDay"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ShopAddUpInfo_28203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ShopAddUpInfo_28203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_ShopAddUpInfo_28203_descriptor, new String[0]);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_ShopAddUpInfo_28204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_ShopAddUpInfo_28204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_ShopAddUpInfo_28204_descriptor, new String[]{"DailyRecharge", "GotRewards"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_28205_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_28205_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_28205_descriptor, new String[]{"Id"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_SignTotalInfo_28206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_SignTotalInfo_28206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_SignTotalInfo_28206_descriptor, new String[0]);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_SignTotalInfo_28207_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_SignTotalInfo_28207_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_SignTotalInfo_28207_descriptor, new String[]{"ActivityDay", "SignGotRewards"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_Sign_28208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_Sign_28208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_Sign_28208_descriptor, new String[]{"Day"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_FancyReward_28209_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_FancyReward_28209_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_FancyReward_28209_descriptor, new String[]{"TargetId"});
      internal_static_summerFestival_com_gzbz_protobuf_S2C_FancyReward_28210_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_FancyReward_28210_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_FancyReward_28210_descriptor, new String[]{"Result", "TargetId"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_LuckDrawInfo_28211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_LuckDrawInfo_28211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_LuckDrawInfo_28211_descriptor, new String[0]);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_LuckDrawInfo_28212_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_LuckDrawInfo_28212_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_LuckDrawInfo_28212_descriptor, new String[]{"DrawTimes", "HadRewardId", "StagEndTime", "RecruitNum", "SeniorRewards", "LotteryStage", "FancyId", "FancyGroupDrawTimes", "OpenDay"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_Draw_28213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_Draw_28213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_Draw_28213_descriptor, new String[]{"Type"});
      internal_static_summerFestival_com_gzbz_protobuf_S2C_Draw_28214_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_Draw_28214_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_Draw_28214_descriptor, new String[]{"DrawTimes", "Id", "RecruitNum", "SeniorNum", "IsHaveFancy", "TargetId", "FancyGroupDrawTimes"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_OpenReward_28215_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_OpenReward_28215_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_OpenReward_28215_descriptor, new String[]{"Id"});
      internal_static_summerFestival_com_gzbz_protobuf_S2C_OpenReward_28216_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_OpenReward_28216_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_OpenReward_28216_descriptor, new String[]{"Id"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_DrawRecord_28217_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_DrawRecord_28217_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_DrawRecord_28217_descriptor, new String[0]);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_DrawRecord_28218_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_DrawRecord_28218_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_DrawRecord_28218_descriptor, new String[]{"MyRecord"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ServerDrawRecord_28219_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ServerDrawRecord_28219_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_ServerDrawRecord_28219_descriptor, new String[0]);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_ServerDrawRecord_28220_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_ServerDrawRecord_28220_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_ServerDrawRecord_28220_descriptor, new String[]{"ServerRecord"});
      internal_static_summerFestival_com_gzbz_protobuf_MyDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_summerFestival_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_MyDrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_summerFestival_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_summerFestival_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId", "Stage"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingGameInfo_28221_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingGameInfo_28221_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingGameInfo_28221_descriptor, new String[0]);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingGameInfo_28222_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingGameInfo_28222_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingGameInfo_28222_descriptor, new String[]{"BuyFishingTimes", "FishInfo", "ReceivedAward", "FishingPointSum", "ActivationAward"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingBegin_28223_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingBegin_28223_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingBegin_28223_descriptor, new String[]{"Length"});
      internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingBegin_28224_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingBegin_28224_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingBegin_28224_descriptor, new String[]{"FishId"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_BuyFishingTimes_28225_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_BuyFishingTimes_28225_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_BuyFishingTimes_28225_descriptor, new String[0]);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_BuyFishingTimes_28226_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_BuyFishingTimes_28226_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_BuyFishingTimes_28226_descriptor, new String[]{"BuyFishingTimes"});
      internal_static_summerFestival_com_gzbz_protobuf_FishInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_summerFestival_com_gzbz_protobuf_FishInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_FishInfo_descriptor, new String[]{"Id", "LengthMin", "LengthMax", "PointMin", "PointMax", "FishSum"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveFishBook_28227_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveFishBook_28227_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveFishBook_28227_descriptor, new String[]{"Id"});
      internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveFishBook_28228_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveFishBook_28228_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveFishBook_28228_descriptor, new String[]{"ReceivedAward"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveActivationAward_28229_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveActivationAward_28229_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveActivationAward_28229_descriptor, new String[]{"Id"});
      internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveActivationAward_28230_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveActivationAward_28230_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveActivationAward_28230_descriptor, new String[]{"ActivationAward"});
      internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingEnd_28231_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingEnd_28231_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingEnd_28231_descriptor, new String[]{"AreaSuccess"});
      internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingEnd_28232_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingEnd_28232_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingEnd_28232_descriptor, new String[]{"FishId", "Length", "Point", "FishingPointSum", "FishInfo", "ItemInfo"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static enum FishLength implements ProtocolMessageEnum {
      LENGTH_NORMAL(1),
      LENGTH_HIGH(2),
      LENGTH_BEST(3);

      public static final int LENGTH_NORMAL_VALUE = 1;
      public static final int LENGTH_HIGH_VALUE = 2;
      public static final int LENGTH_BEST_VALUE = 3;
      private static final Internal.EnumLiteMap<FishLength> internalValueMap = new Internal.EnumLiteMap<FishLength>() {
         public FishLength findValueByNumber(int number) {
            return SummerFestivalMsg.FishLength.forNumber(number);
         }
      };
      private static final FishLength[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static FishLength valueOf(int value) {
         return forNumber(value);
      }

      public static FishLength forNumber(int value) {
         switch (value) {
            case 1:
               return LENGTH_NORMAL;
            case 2:
               return LENGTH_HIGH;
            case 3:
               return LENGTH_BEST;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<FishLength> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)SummerFestivalMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static FishLength valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private FishLength(int value) {
         this.value = value;
      }
   }

   public static final class C2S_ActivityInfo_28201 extends GeneratedMessageV3 implements C2S_ActivityInfo_28201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_28201 DEFAULT_INSTANCE = new C2S_ActivityInfo_28201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_28201> PARSER = new AbstractParser<C2S_ActivityInfo_28201>() {
         public C2S_ActivityInfo_28201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_28201(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_28201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_28201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_28201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_28201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ActivityInfo_28201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ActivityInfo_28201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_28201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_28201)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_28201 other = (C2S_ActivityInfo_28201)obj;
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

      public static C2S_ActivityInfo_28201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_28201)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_28201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_28201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_28201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_28201)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_28201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_28201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_28201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_28201)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_28201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_28201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_28201 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_28201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_28201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_28201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_28201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_28201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_28201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_28201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_28201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_28201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_28201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_28201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_28201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_28201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_28201> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_28201> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_28201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_28201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ActivityInfo_28201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ActivityInfo_28201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_28201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_ActivityInfo_28201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ActivityInfo_28201_descriptor;
         }

         public C2S_ActivityInfo_28201 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_ActivityInfo_28201.getDefaultInstance();
         }

         public C2S_ActivityInfo_28201 build() {
            C2S_ActivityInfo_28201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_28201 buildPartial() {
            C2S_ActivityInfo_28201 result = new C2S_ActivityInfo_28201(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ActivityInfo_28201) {
               return this.mergeFrom((C2S_ActivityInfo_28201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_28201 other) {
            if (other == SummerFestivalMsg.C2S_ActivityInfo_28201.getDefaultInstance()) {
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
            C2S_ActivityInfo_28201 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_28201)SummerFestivalMsg.C2S_ActivityInfo_28201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_28201)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_28202 extends GeneratedMessageV3 implements S2C_ActivityInfo_28202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 2;
      private int activityDay_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_28202 DEFAULT_INSTANCE = new S2C_ActivityInfo_28202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_28202> PARSER = new AbstractParser<S2C_ActivityInfo_28202>() {
         public S2C_ActivityInfo_28202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_28202(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_28202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_28202() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_28202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_28202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ActivityInfo_28202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ActivityInfo_28202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_28202.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ActivityInfo_28202)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_28202 other = (S2C_ActivityInfo_28202)obj;
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

      public static S2C_ActivityInfo_28202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_28202)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_28202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_28202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_28202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_28202)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_28202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_28202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_28202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_28202)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_28202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_28202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_28202 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_28202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_28202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_28202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_28202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_28202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_28202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_28202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_28202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_28202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_28202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_28202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_28202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_28202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_28202> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_28202> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_28202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_28202OrBuilder {
         private int bitField0_;
         private int openDay_;
         private int activityDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ActivityInfo_28202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ActivityInfo_28202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_28202.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_ActivityInfo_28202.alwaysUseFieldBuilders) {
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
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ActivityInfo_28202_descriptor;
         }

         public S2C_ActivityInfo_28202 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_ActivityInfo_28202.getDefaultInstance();
         }

         public S2C_ActivityInfo_28202 build() {
            S2C_ActivityInfo_28202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_28202 buildPartial() {
            S2C_ActivityInfo_28202 result = new S2C_ActivityInfo_28202(this);
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
            if (other instanceof S2C_ActivityInfo_28202) {
               return this.mergeFrom((S2C_ActivityInfo_28202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_28202 other) {
            if (other == SummerFestivalMsg.S2C_ActivityInfo_28202.getDefaultInstance()) {
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
            S2C_ActivityInfo_28202 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_28202)SummerFestivalMsg.S2C_ActivityInfo_28202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_28202)e.getUnfinishedMessage();
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

   public static final class C2S_ShopAddUpInfo_28203 extends GeneratedMessageV3 implements C2S_ShopAddUpInfo_28203OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopAddUpInfo_28203 DEFAULT_INSTANCE = new C2S_ShopAddUpInfo_28203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopAddUpInfo_28203> PARSER = new AbstractParser<C2S_ShopAddUpInfo_28203>() {
         public C2S_ShopAddUpInfo_28203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopAddUpInfo_28203(input, extensionRegistry);
         }
      };

      private C2S_ShopAddUpInfo_28203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopAddUpInfo_28203() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopAddUpInfo_28203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopAddUpInfo_28203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ShopAddUpInfo_28203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ShopAddUpInfo_28203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_28203.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopAddUpInfo_28203)) {
            return super.equals(obj);
         } else {
            C2S_ShopAddUpInfo_28203 other = (C2S_ShopAddUpInfo_28203)obj;
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

      public static C2S_ShopAddUpInfo_28203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_28203)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_28203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_28203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_28203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_28203)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_28203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_28203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_28203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_28203)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_28203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_28203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_28203 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_28203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_28203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_28203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_28203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_28203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_28203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_28203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_28203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_28203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_28203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_28203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopAddUpInfo_28203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopAddUpInfo_28203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopAddUpInfo_28203> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopAddUpInfo_28203> getParserForType() {
         return PARSER;
      }

      public C2S_ShopAddUpInfo_28203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopAddUpInfo_28203OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ShopAddUpInfo_28203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ShopAddUpInfo_28203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_28203.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_ShopAddUpInfo_28203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ShopAddUpInfo_28203_descriptor;
         }

         public C2S_ShopAddUpInfo_28203 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_ShopAddUpInfo_28203.getDefaultInstance();
         }

         public C2S_ShopAddUpInfo_28203 build() {
            C2S_ShopAddUpInfo_28203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopAddUpInfo_28203 buildPartial() {
            C2S_ShopAddUpInfo_28203 result = new C2S_ShopAddUpInfo_28203(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ShopAddUpInfo_28203) {
               return this.mergeFrom((C2S_ShopAddUpInfo_28203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopAddUpInfo_28203 other) {
            if (other == SummerFestivalMsg.C2S_ShopAddUpInfo_28203.getDefaultInstance()) {
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
            C2S_ShopAddUpInfo_28203 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopAddUpInfo_28203)SummerFestivalMsg.C2S_ShopAddUpInfo_28203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopAddUpInfo_28203)e.getUnfinishedMessage();
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

   public static final class S2C_ShopAddUpInfo_28204 extends GeneratedMessageV3 implements S2C_ShopAddUpInfo_28204OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAILYRECHARGE_FIELD_NUMBER = 1;
      private int dailyRecharge_;
      public static final int GOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList gotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopAddUpInfo_28204 DEFAULT_INSTANCE = new S2C_ShopAddUpInfo_28204();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopAddUpInfo_28204> PARSER = new AbstractParser<S2C_ShopAddUpInfo_28204>() {
         public S2C_ShopAddUpInfo_28204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopAddUpInfo_28204(input, extensionRegistry);
         }
      };

      private S2C_ShopAddUpInfo_28204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopAddUpInfo_28204() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopAddUpInfo_28204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopAddUpInfo_28204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ShopAddUpInfo_28204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ShopAddUpInfo_28204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_28204.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ShopAddUpInfo_28204)) {
            return super.equals(obj);
         } else {
            S2C_ShopAddUpInfo_28204 other = (S2C_ShopAddUpInfo_28204)obj;
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

      public static S2C_ShopAddUpInfo_28204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_28204)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_28204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_28204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_28204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_28204)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_28204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_28204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_28204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_28204)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_28204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_28204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_28204 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_28204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_28204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_28204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_28204 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_28204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_28204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_28204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_28204 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_28204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_28204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_28204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopAddUpInfo_28204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopAddUpInfo_28204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopAddUpInfo_28204> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopAddUpInfo_28204> getParserForType() {
         return PARSER;
      }

      public S2C_ShopAddUpInfo_28204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopAddUpInfo_28204OrBuilder {
         private int bitField0_;
         private int dailyRecharge_;
         private Internal.IntList gotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ShopAddUpInfo_28204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ShopAddUpInfo_28204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_28204.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = SummerFestivalMsg.S2C_ShopAddUpInfo_28204.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = SummerFestivalMsg.S2C_ShopAddUpInfo_28204.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_ShopAddUpInfo_28204.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dailyRecharge_ = 0;
            this.bitField0_ &= -2;
            this.gotRewards_ = SummerFestivalMsg.S2C_ShopAddUpInfo_28204.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ShopAddUpInfo_28204_descriptor;
         }

         public S2C_ShopAddUpInfo_28204 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_ShopAddUpInfo_28204.getDefaultInstance();
         }

         public S2C_ShopAddUpInfo_28204 build() {
            S2C_ShopAddUpInfo_28204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopAddUpInfo_28204 buildPartial() {
            S2C_ShopAddUpInfo_28204 result = new S2C_ShopAddUpInfo_28204(this);
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
            if (other instanceof S2C_ShopAddUpInfo_28204) {
               return this.mergeFrom((S2C_ShopAddUpInfo_28204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopAddUpInfo_28204 other) {
            if (other == SummerFestivalMsg.S2C_ShopAddUpInfo_28204.getDefaultInstance()) {
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
            S2C_ShopAddUpInfo_28204 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopAddUpInfo_28204)SummerFestivalMsg.S2C_ShopAddUpInfo_28204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopAddUpInfo_28204)e.getUnfinishedMessage();
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
               this.gotRewards_ = SummerFestivalMsg.S2C_ShopAddUpInfo_28204.mutableCopy(this.gotRewards_);
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
            this.gotRewards_ = SummerFestivalMsg.S2C_ShopAddUpInfo_28204.emptyIntList();
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

   public static final class C2S_ReceiveShopAddUpReward_28205 extends GeneratedMessageV3 implements C2S_ReceiveShopAddUpReward_28205OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveShopAddUpReward_28205 DEFAULT_INSTANCE = new C2S_ReceiveShopAddUpReward_28205();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveShopAddUpReward_28205> PARSER = new AbstractParser<C2S_ReceiveShopAddUpReward_28205>() {
         public C2S_ReceiveShopAddUpReward_28205 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveShopAddUpReward_28205(input, extensionRegistry);
         }
      };

      private C2S_ReceiveShopAddUpReward_28205(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveShopAddUpReward_28205() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveShopAddUpReward_28205();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveShopAddUpReward_28205(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_28205_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_28205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_28205.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveShopAddUpReward_28205)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveShopAddUpReward_28205 other = (C2S_ReceiveShopAddUpReward_28205)obj;
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

      public static C2S_ReceiveShopAddUpReward_28205 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_28205)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_28205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_28205)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_28205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_28205)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_28205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_28205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_28205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_28205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_28205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_28205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_28205 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_28205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveShopAddUpReward_28205 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveShopAddUpReward_28205 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveShopAddUpReward_28205> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveShopAddUpReward_28205> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveShopAddUpReward_28205 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveShopAddUpReward_28205OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_28205_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_28205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_28205.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_ReceiveShopAddUpReward_28205.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_28205_descriptor;
         }

         public C2S_ReceiveShopAddUpReward_28205 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_ReceiveShopAddUpReward_28205.getDefaultInstance();
         }

         public C2S_ReceiveShopAddUpReward_28205 build() {
            C2S_ReceiveShopAddUpReward_28205 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveShopAddUpReward_28205 buildPartial() {
            C2S_ReceiveShopAddUpReward_28205 result = new C2S_ReceiveShopAddUpReward_28205(this);
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
            if (other instanceof C2S_ReceiveShopAddUpReward_28205) {
               return this.mergeFrom((C2S_ReceiveShopAddUpReward_28205)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveShopAddUpReward_28205 other) {
            if (other == SummerFestivalMsg.C2S_ReceiveShopAddUpReward_28205.getDefaultInstance()) {
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
            C2S_ReceiveShopAddUpReward_28205 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveShopAddUpReward_28205)SummerFestivalMsg.C2S_ReceiveShopAddUpReward_28205.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveShopAddUpReward_28205)e.getUnfinishedMessage();
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

   public static final class C2S_SignTotalInfo_28206 extends GeneratedMessageV3 implements C2S_SignTotalInfo_28206OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SignTotalInfo_28206 DEFAULT_INSTANCE = new C2S_SignTotalInfo_28206();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SignTotalInfo_28206> PARSER = new AbstractParser<C2S_SignTotalInfo_28206>() {
         public C2S_SignTotalInfo_28206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SignTotalInfo_28206(input, extensionRegistry);
         }
      };

      private C2S_SignTotalInfo_28206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SignTotalInfo_28206() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SignTotalInfo_28206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SignTotalInfo_28206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_SignTotalInfo_28206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_SignTotalInfo_28206_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_28206.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SignTotalInfo_28206)) {
            return super.equals(obj);
         } else {
            C2S_SignTotalInfo_28206 other = (C2S_SignTotalInfo_28206)obj;
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

      public static C2S_SignTotalInfo_28206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_28206)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_28206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_28206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_28206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_28206)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_28206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_28206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_28206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_28206)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_28206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_28206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_28206 parseFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_28206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_28206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_28206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_28206 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_28206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_28206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_28206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_28206 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SignTotalInfo_28206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_28206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_28206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SignTotalInfo_28206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SignTotalInfo_28206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SignTotalInfo_28206> parser() {
         return PARSER;
      }

      public Parser<C2S_SignTotalInfo_28206> getParserForType() {
         return PARSER;
      }

      public C2S_SignTotalInfo_28206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SignTotalInfo_28206OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_SignTotalInfo_28206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_SignTotalInfo_28206_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_28206.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_SignTotalInfo_28206.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_SignTotalInfo_28206_descriptor;
         }

         public C2S_SignTotalInfo_28206 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_SignTotalInfo_28206.getDefaultInstance();
         }

         public C2S_SignTotalInfo_28206 build() {
            C2S_SignTotalInfo_28206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SignTotalInfo_28206 buildPartial() {
            C2S_SignTotalInfo_28206 result = new C2S_SignTotalInfo_28206(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_SignTotalInfo_28206) {
               return this.mergeFrom((C2S_SignTotalInfo_28206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SignTotalInfo_28206 other) {
            if (other == SummerFestivalMsg.C2S_SignTotalInfo_28206.getDefaultInstance()) {
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
            C2S_SignTotalInfo_28206 parsedMessage = null;

            try {
               parsedMessage = (C2S_SignTotalInfo_28206)SummerFestivalMsg.C2S_SignTotalInfo_28206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SignTotalInfo_28206)e.getUnfinishedMessage();
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

   public static final class S2C_SignTotalInfo_28207 extends GeneratedMessageV3 implements S2C_SignTotalInfo_28207OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 1;
      private int activityDay_;
      public static final int SIGNGOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList signGotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_SignTotalInfo_28207 DEFAULT_INSTANCE = new S2C_SignTotalInfo_28207();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignTotalInfo_28207> PARSER = new AbstractParser<S2C_SignTotalInfo_28207>() {
         public S2C_SignTotalInfo_28207 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignTotalInfo_28207(input, extensionRegistry);
         }
      };

      private S2C_SignTotalInfo_28207(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignTotalInfo_28207() {
         this.memoizedIsInitialized = -1;
         this.signGotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignTotalInfo_28207();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignTotalInfo_28207(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_SignTotalInfo_28207_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_SignTotalInfo_28207_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_28207.class, Builder.class);
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
         } else if (!(obj instanceof S2C_SignTotalInfo_28207)) {
            return super.equals(obj);
         } else {
            S2C_SignTotalInfo_28207 other = (S2C_SignTotalInfo_28207)obj;
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

      public static S2C_SignTotalInfo_28207 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_28207)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_28207 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_28207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_28207 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_28207)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_28207 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_28207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_28207 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_28207)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_28207 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_28207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_28207 parseFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_28207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_28207 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_28207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_28207 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_28207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_28207 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_28207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_28207 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignTotalInfo_28207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_28207 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_28207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignTotalInfo_28207 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignTotalInfo_28207 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignTotalInfo_28207> parser() {
         return PARSER;
      }

      public Parser<S2C_SignTotalInfo_28207> getParserForType() {
         return PARSER;
      }

      public S2C_SignTotalInfo_28207 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignTotalInfo_28207OrBuilder {
         private int bitField0_;
         private int activityDay_;
         private Internal.IntList signGotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_SignTotalInfo_28207_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_SignTotalInfo_28207_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_28207.class, Builder.class);
         }

         private Builder() {
            this.signGotRewards_ = SummerFestivalMsg.S2C_SignTotalInfo_28207.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.signGotRewards_ = SummerFestivalMsg.S2C_SignTotalInfo_28207.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_SignTotalInfo_28207.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityDay_ = 0;
            this.bitField0_ &= -2;
            this.signGotRewards_ = SummerFestivalMsg.S2C_SignTotalInfo_28207.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_SignTotalInfo_28207_descriptor;
         }

         public S2C_SignTotalInfo_28207 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_SignTotalInfo_28207.getDefaultInstance();
         }

         public S2C_SignTotalInfo_28207 build() {
            S2C_SignTotalInfo_28207 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignTotalInfo_28207 buildPartial() {
            S2C_SignTotalInfo_28207 result = new S2C_SignTotalInfo_28207(this);
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
            if (other instanceof S2C_SignTotalInfo_28207) {
               return this.mergeFrom((S2C_SignTotalInfo_28207)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignTotalInfo_28207 other) {
            if (other == SummerFestivalMsg.S2C_SignTotalInfo_28207.getDefaultInstance()) {
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
            S2C_SignTotalInfo_28207 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignTotalInfo_28207)SummerFestivalMsg.S2C_SignTotalInfo_28207.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignTotalInfo_28207)e.getUnfinishedMessage();
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
               this.signGotRewards_ = SummerFestivalMsg.S2C_SignTotalInfo_28207.mutableCopy(this.signGotRewards_);
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
            this.signGotRewards_ = SummerFestivalMsg.S2C_SignTotalInfo_28207.emptyIntList();
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

   public static final class C2S_Sign_28208 extends GeneratedMessageV3 implements C2S_Sign_28208OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_Sign_28208 DEFAULT_INSTANCE = new C2S_Sign_28208();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Sign_28208> PARSER = new AbstractParser<C2S_Sign_28208>() {
         public C2S_Sign_28208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Sign_28208(input, extensionRegistry);
         }
      };

      private C2S_Sign_28208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Sign_28208() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Sign_28208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Sign_28208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_Sign_28208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_Sign_28208_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_28208.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Sign_28208)) {
            return super.equals(obj);
         } else {
            C2S_Sign_28208 other = (C2S_Sign_28208)obj;
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

      public static C2S_Sign_28208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Sign_28208)PARSER.parseFrom(data);
      }

      public static C2S_Sign_28208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_28208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_28208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Sign_28208)PARSER.parseFrom(data);
      }

      public static C2S_Sign_28208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_28208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_28208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Sign_28208)PARSER.parseFrom(data);
      }

      public static C2S_Sign_28208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_28208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_28208 parseFrom(InputStream input) throws IOException {
         return (C2S_Sign_28208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_28208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_28208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_28208 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Sign_28208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Sign_28208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_28208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_28208 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Sign_28208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_28208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_28208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Sign_28208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Sign_28208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Sign_28208> parser() {
         return PARSER;
      }

      public Parser<C2S_Sign_28208> getParserForType() {
         return PARSER;
      }

      public C2S_Sign_28208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Sign_28208OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_Sign_28208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_Sign_28208_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_28208.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_Sign_28208.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_Sign_28208_descriptor;
         }

         public C2S_Sign_28208 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_Sign_28208.getDefaultInstance();
         }

         public C2S_Sign_28208 build() {
            C2S_Sign_28208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Sign_28208 buildPartial() {
            C2S_Sign_28208 result = new C2S_Sign_28208(this);
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
            if (other instanceof C2S_Sign_28208) {
               return this.mergeFrom((C2S_Sign_28208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Sign_28208 other) {
            if (other == SummerFestivalMsg.C2S_Sign_28208.getDefaultInstance()) {
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
            C2S_Sign_28208 parsedMessage = null;

            try {
               parsedMessage = (C2S_Sign_28208)SummerFestivalMsg.C2S_Sign_28208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Sign_28208)e.getUnfinishedMessage();
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

   public static final class C2S_FancyReward_28209 extends GeneratedMessageV3 implements C2S_FancyReward_28209OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETID_FIELD_NUMBER = 1;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_28209 DEFAULT_INSTANCE = new C2S_FancyReward_28209();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_28209> PARSER = new AbstractParser<C2S_FancyReward_28209>() {
         public C2S_FancyReward_28209 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_28209(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_28209(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_28209() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_28209();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_28209(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FancyReward_28209_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FancyReward_28209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_28209.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FancyReward_28209)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_28209 other = (C2S_FancyReward_28209)obj;
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

      public static C2S_FancyReward_28209 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_28209)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_28209 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_28209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_28209 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_28209)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_28209 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_28209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_28209 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_28209)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_28209 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_28209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_28209 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_28209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_28209 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_28209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_28209 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_28209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_28209 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_28209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_28209 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_28209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_28209 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_28209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_28209 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_28209 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_28209> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_28209> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_28209 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_28209OrBuilder {
         private int bitField0_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FancyReward_28209_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FancyReward_28209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_28209.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_FancyReward_28209.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FancyReward_28209_descriptor;
         }

         public C2S_FancyReward_28209 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_FancyReward_28209.getDefaultInstance();
         }

         public C2S_FancyReward_28209 build() {
            C2S_FancyReward_28209 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_28209 buildPartial() {
            C2S_FancyReward_28209 result = new C2S_FancyReward_28209(this);
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
            if (other instanceof C2S_FancyReward_28209) {
               return this.mergeFrom((C2S_FancyReward_28209)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_28209 other) {
            if (other == SummerFestivalMsg.C2S_FancyReward_28209.getDefaultInstance()) {
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
            C2S_FancyReward_28209 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_28209)SummerFestivalMsg.C2S_FancyReward_28209.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_28209)e.getUnfinishedMessage();
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

   public static final class S2C_FancyReward_28210 extends GeneratedMessageV3 implements S2C_FancyReward_28210OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_28210 DEFAULT_INSTANCE = new S2C_FancyReward_28210();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_28210> PARSER = new AbstractParser<S2C_FancyReward_28210>() {
         public S2C_FancyReward_28210 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_28210(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_28210(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_28210() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_28210();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_28210(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FancyReward_28210_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FancyReward_28210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_28210.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FancyReward_28210)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_28210 other = (S2C_FancyReward_28210)obj;
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

      public static S2C_FancyReward_28210 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_28210)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_28210 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_28210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_28210 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_28210)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_28210 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_28210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_28210 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_28210)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_28210 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_28210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_28210 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_28210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_28210 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_28210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_28210 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_28210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_28210 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_28210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_28210 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_28210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_28210 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_28210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_28210 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_28210 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_28210> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_28210> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_28210 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_28210OrBuilder {
         private int bitField0_;
         private int result_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FancyReward_28210_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FancyReward_28210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_28210.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_FancyReward_28210.alwaysUseFieldBuilders) {
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
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FancyReward_28210_descriptor;
         }

         public S2C_FancyReward_28210 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_FancyReward_28210.getDefaultInstance();
         }

         public S2C_FancyReward_28210 build() {
            S2C_FancyReward_28210 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_28210 buildPartial() {
            S2C_FancyReward_28210 result = new S2C_FancyReward_28210(this);
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
            if (other instanceof S2C_FancyReward_28210) {
               return this.mergeFrom((S2C_FancyReward_28210)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_28210 other) {
            if (other == SummerFestivalMsg.S2C_FancyReward_28210.getDefaultInstance()) {
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
            S2C_FancyReward_28210 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_28210)SummerFestivalMsg.S2C_FancyReward_28210.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_28210)e.getUnfinishedMessage();
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

   public static final class C2S_LuckDrawInfo_28211 extends GeneratedMessageV3 implements C2S_LuckDrawInfo_28211OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckDrawInfo_28211 DEFAULT_INSTANCE = new C2S_LuckDrawInfo_28211();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckDrawInfo_28211> PARSER = new AbstractParser<C2S_LuckDrawInfo_28211>() {
         public C2S_LuckDrawInfo_28211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckDrawInfo_28211(input, extensionRegistry);
         }
      };

      private C2S_LuckDrawInfo_28211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckDrawInfo_28211() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckDrawInfo_28211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckDrawInfo_28211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_LuckDrawInfo_28211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_LuckDrawInfo_28211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_28211.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckDrawInfo_28211)) {
            return super.equals(obj);
         } else {
            C2S_LuckDrawInfo_28211 other = (C2S_LuckDrawInfo_28211)obj;
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

      public static C2S_LuckDrawInfo_28211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_28211)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_28211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_28211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_28211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_28211)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_28211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_28211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_28211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_28211)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_28211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_28211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_28211 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_28211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_28211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_28211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_28211 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_28211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_28211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_28211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_28211 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckDrawInfo_28211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_28211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_28211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckDrawInfo_28211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckDrawInfo_28211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckDrawInfo_28211> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckDrawInfo_28211> getParserForType() {
         return PARSER;
      }

      public C2S_LuckDrawInfo_28211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckDrawInfo_28211OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_LuckDrawInfo_28211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_LuckDrawInfo_28211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_28211.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_LuckDrawInfo_28211.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_LuckDrawInfo_28211_descriptor;
         }

         public C2S_LuckDrawInfo_28211 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_LuckDrawInfo_28211.getDefaultInstance();
         }

         public C2S_LuckDrawInfo_28211 build() {
            C2S_LuckDrawInfo_28211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckDrawInfo_28211 buildPartial() {
            C2S_LuckDrawInfo_28211 result = new C2S_LuckDrawInfo_28211(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LuckDrawInfo_28211) {
               return this.mergeFrom((C2S_LuckDrawInfo_28211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckDrawInfo_28211 other) {
            if (other == SummerFestivalMsg.C2S_LuckDrawInfo_28211.getDefaultInstance()) {
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
            C2S_LuckDrawInfo_28211 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckDrawInfo_28211)SummerFestivalMsg.C2S_LuckDrawInfo_28211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckDrawInfo_28211)e.getUnfinishedMessage();
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

   public static final class S2C_LuckDrawInfo_28212 extends GeneratedMessageV3 implements S2C_LuckDrawInfo_28212OrBuilder {
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
      public static final int OPENDAY_FIELD_NUMBER = 9;
      private int openDay_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckDrawInfo_28212 DEFAULT_INSTANCE = new S2C_LuckDrawInfo_28212();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckDrawInfo_28212> PARSER = new AbstractParser<S2C_LuckDrawInfo_28212>() {
         public S2C_LuckDrawInfo_28212 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckDrawInfo_28212(input, extensionRegistry);
         }
      };

      private S2C_LuckDrawInfo_28212(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckDrawInfo_28212() {
         this.memoizedIsInitialized = -1;
         this.hadRewardId_ = emptyIntList();
         this.seniorRewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckDrawInfo_28212();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckDrawInfo_28212(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 72:
                        this.bitField0_ |= 64;
                        this.openDay_ = input.readInt32();
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_LuckDrawInfo_28212_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_LuckDrawInfo_28212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_28212.class, Builder.class);
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

      public boolean hasOpenDay() {
         return (this.bitField0_ & 64) != 0;
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
         } else if (!this.hasOpenDay()) {
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

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(9, this.openDay_);
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

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.openDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LuckDrawInfo_28212)) {
            return super.equals(obj);
         } else {
            S2C_LuckDrawInfo_28212 other = (S2C_LuckDrawInfo_28212)obj;
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
            } else if (this.hasOpenDay() != other.hasOpenDay()) {
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

            if (this.hasOpenDay()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getOpenDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LuckDrawInfo_28212 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_28212)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_28212 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_28212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_28212 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_28212)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_28212 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_28212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_28212 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_28212)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_28212 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_28212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_28212 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_28212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_28212 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_28212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_28212 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_28212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_28212 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_28212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_28212 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckDrawInfo_28212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_28212 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_28212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckDrawInfo_28212 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckDrawInfo_28212 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckDrawInfo_28212> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckDrawInfo_28212> getParserForType() {
         return PARSER;
      }

      public S2C_LuckDrawInfo_28212 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckDrawInfo_28212OrBuilder {
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
         private int openDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_LuckDrawInfo_28212_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_LuckDrawInfo_28212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_28212.class, Builder.class);
         }

         private Builder() {
            this.hadRewardId_ = SummerFestivalMsg.S2C_LuckDrawInfo_28212.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadRewardId_ = SummerFestivalMsg.S2C_LuckDrawInfo_28212.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_LuckDrawInfo_28212.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.hadRewardId_ = SummerFestivalMsg.S2C_LuckDrawInfo_28212.emptyIntList();
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
            this.openDay_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_LuckDrawInfo_28212_descriptor;
         }

         public S2C_LuckDrawInfo_28212 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_LuckDrawInfo_28212.getDefaultInstance();
         }

         public S2C_LuckDrawInfo_28212 build() {
            S2C_LuckDrawInfo_28212 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckDrawInfo_28212 buildPartial() {
            S2C_LuckDrawInfo_28212 result = new S2C_LuckDrawInfo_28212(this);
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

            if ((from_bitField0_ & 256) != 0) {
               result.openDay_ = this.openDay_;
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
            if (other instanceof S2C_LuckDrawInfo_28212) {
               return this.mergeFrom((S2C_LuckDrawInfo_28212)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckDrawInfo_28212 other) {
            if (other == SummerFestivalMsg.S2C_LuckDrawInfo_28212.getDefaultInstance()) {
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
                     this.seniorRewardsBuilder_ = SummerFestivalMsg.S2C_LuckDrawInfo_28212.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
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

               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
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
            } else if (!this.hasOpenDay()) {
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
            S2C_LuckDrawInfo_28212 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckDrawInfo_28212)SummerFestivalMsg.S2C_LuckDrawInfo_28212.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckDrawInfo_28212)e.getUnfinishedMessage();
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
               this.hadRewardId_ = SummerFestivalMsg.S2C_LuckDrawInfo_28212.mutableCopy(this.hadRewardId_);
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
            this.hadRewardId_ = SummerFestivalMsg.S2C_LuckDrawInfo_28212.emptyIntList();
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

         public boolean hasOpenDay() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 256;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -257;
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

   public static final class C2S_Draw_28213 extends GeneratedMessageV3 implements C2S_Draw_28213OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Draw_28213 DEFAULT_INSTANCE = new C2S_Draw_28213();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Draw_28213> PARSER = new AbstractParser<C2S_Draw_28213>() {
         public C2S_Draw_28213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Draw_28213(input, extensionRegistry);
         }
      };

      private C2S_Draw_28213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Draw_28213() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Draw_28213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Draw_28213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_Draw_28213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_Draw_28213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_28213.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Draw_28213)) {
            return super.equals(obj);
         } else {
            C2S_Draw_28213 other = (C2S_Draw_28213)obj;
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

      public static C2S_Draw_28213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Draw_28213)PARSER.parseFrom(data);
      }

      public static C2S_Draw_28213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_28213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_28213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Draw_28213)PARSER.parseFrom(data);
      }

      public static C2S_Draw_28213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_28213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_28213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Draw_28213)PARSER.parseFrom(data);
      }

      public static C2S_Draw_28213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_28213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_28213 parseFrom(InputStream input) throws IOException {
         return (C2S_Draw_28213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_28213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_28213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_28213 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Draw_28213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Draw_28213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_28213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_28213 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Draw_28213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_28213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_28213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Draw_28213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Draw_28213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Draw_28213> parser() {
         return PARSER;
      }

      public Parser<C2S_Draw_28213> getParserForType() {
         return PARSER;
      }

      public C2S_Draw_28213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Draw_28213OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_Draw_28213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_Draw_28213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_28213.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_Draw_28213.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_Draw_28213_descriptor;
         }

         public C2S_Draw_28213 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_Draw_28213.getDefaultInstance();
         }

         public C2S_Draw_28213 build() {
            C2S_Draw_28213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Draw_28213 buildPartial() {
            C2S_Draw_28213 result = new C2S_Draw_28213(this);
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
            if (other instanceof C2S_Draw_28213) {
               return this.mergeFrom((C2S_Draw_28213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Draw_28213 other) {
            if (other == SummerFestivalMsg.C2S_Draw_28213.getDefaultInstance()) {
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
            C2S_Draw_28213 parsedMessage = null;

            try {
               parsedMessage = (C2S_Draw_28213)SummerFestivalMsg.C2S_Draw_28213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Draw_28213)e.getUnfinishedMessage();
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

   public static final class S2C_Draw_28214 extends GeneratedMessageV3 implements S2C_Draw_28214OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAWTIMES_FIELD_NUMBER = 1;
      private int drawTimes_;
      public static final int ID_FIELD_NUMBER = 2;
      private Internal.IntList id_;
      public static final int RECRUITNUM_FIELD_NUMBER = 4;
      private int recruitNum_;
      public static final int SENIORNUM_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> seniorNum_;
      public static final int ISHAVEFANCY_FIELD_NUMBER = 6;
      private boolean isHaveFancy_;
      public static final int TARGETID_FIELD_NUMBER = 7;
      private int targetId_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 8;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_Draw_28214 DEFAULT_INSTANCE = new S2C_Draw_28214();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Draw_28214> PARSER = new AbstractParser<S2C_Draw_28214>() {
         public S2C_Draw_28214 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Draw_28214(input, extensionRegistry);
         }
      };

      private S2C_Draw_28214(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Draw_28214() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Draw_28214();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Draw_28214(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 32:
                        this.bitField0_ |= 2;
                        this.recruitNum_ = input.readInt32();
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.seniorNum_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.seniorNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 48:
                        this.bitField0_ |= 4;
                        this.isHaveFancy_ = input.readBool();
                        continue;
                     case 56:
                        this.bitField0_ |= 8;
                        this.targetId_ = input.readInt32();
                        continue;
                     case 64:
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_Draw_28214_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_Draw_28214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_28214.class, Builder.class);
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
            output.writeInt32(4, this.recruitNum_);
         }

         for(int i = 0; i < this.seniorNum_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.seniorNum_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(6, this.isHaveFancy_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(7, this.targetId_);
         }

         if ((this.bitField0_ & 16) != 0) {
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

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.recruitNum_);
            }

            for(int i = 0; i < this.seniorNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.seniorNum_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.isHaveFancy_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.targetId_);
            }

            if ((this.bitField0_ & 16) != 0) {
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
         } else if (!(obj instanceof S2C_Draw_28214)) {
            return super.equals(obj);
         } else {
            S2C_Draw_28214 other = (S2C_Draw_28214)obj;
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
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRecruitNum();
            }

            if (this.getSeniorNumCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSeniorNumList().hashCode();
            }

            if (this.hasIsHaveFancy()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHaveFancy());
            }

            if (this.hasTargetId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getTargetId();
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

      public static S2C_Draw_28214 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Draw_28214)PARSER.parseFrom(data);
      }

      public static S2C_Draw_28214 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_28214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_28214 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Draw_28214)PARSER.parseFrom(data);
      }

      public static S2C_Draw_28214 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_28214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_28214 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Draw_28214)PARSER.parseFrom(data);
      }

      public static S2C_Draw_28214 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_28214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_28214 parseFrom(InputStream input) throws IOException {
         return (S2C_Draw_28214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_28214 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_28214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_28214 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Draw_28214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Draw_28214 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_28214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_28214 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Draw_28214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_28214 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_28214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Draw_28214 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Draw_28214 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Draw_28214> parser() {
         return PARSER;
      }

      public Parser<S2C_Draw_28214> getParserForType() {
         return PARSER;
      }

      public S2C_Draw_28214 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Draw_28214OrBuilder {
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
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_Draw_28214_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_Draw_28214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_28214.class, Builder.class);
         }

         private Builder() {
            this.id_ = SummerFestivalMsg.S2C_Draw_28214.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = SummerFestivalMsg.S2C_Draw_28214.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_Draw_28214.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.id_ = SummerFestivalMsg.S2C_Draw_28214.emptyIntList();
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
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_Draw_28214_descriptor;
         }

         public S2C_Draw_28214 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_Draw_28214.getDefaultInstance();
         }

         public S2C_Draw_28214 build() {
            S2C_Draw_28214 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Draw_28214 buildPartial() {
            S2C_Draw_28214 result = new S2C_Draw_28214(this);
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
            if (other instanceof S2C_Draw_28214) {
               return this.mergeFrom((S2C_Draw_28214)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Draw_28214 other) {
            if (other == SummerFestivalMsg.S2C_Draw_28214.getDefaultInstance()) {
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
                     this.seniorNumBuilder_ = SummerFestivalMsg.S2C_Draw_28214.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
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
            S2C_Draw_28214 parsedMessage = null;

            try {
               parsedMessage = (S2C_Draw_28214)SummerFestivalMsg.S2C_Draw_28214.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Draw_28214)e.getUnfinishedMessage();
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
               this.id_ = SummerFestivalMsg.S2C_Draw_28214.mutableCopy(this.id_);
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
            this.id_ = SummerFestivalMsg.S2C_Draw_28214.emptyIntList();
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

   public static final class C2S_OpenReward_28215 extends GeneratedMessageV3 implements C2S_OpenReward_28215OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenReward_28215 DEFAULT_INSTANCE = new C2S_OpenReward_28215();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenReward_28215> PARSER = new AbstractParser<C2S_OpenReward_28215>() {
         public C2S_OpenReward_28215 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenReward_28215(input, extensionRegistry);
         }
      };

      private C2S_OpenReward_28215(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenReward_28215() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenReward_28215();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenReward_28215(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_OpenReward_28215_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_OpenReward_28215_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_28215.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenReward_28215)) {
            return super.equals(obj);
         } else {
            C2S_OpenReward_28215 other = (C2S_OpenReward_28215)obj;
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

      public static C2S_OpenReward_28215 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_28215)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_28215 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_28215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_28215 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_28215)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_28215 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_28215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_28215 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_28215)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_28215 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_28215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_28215 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_28215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_28215 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_28215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_28215 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_28215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_28215 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_28215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_28215 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenReward_28215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_28215 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_28215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenReward_28215 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenReward_28215 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenReward_28215> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenReward_28215> getParserForType() {
         return PARSER;
      }

      public C2S_OpenReward_28215 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenReward_28215OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_OpenReward_28215_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_OpenReward_28215_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_28215.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_OpenReward_28215.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_OpenReward_28215_descriptor;
         }

         public C2S_OpenReward_28215 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_OpenReward_28215.getDefaultInstance();
         }

         public C2S_OpenReward_28215 build() {
            C2S_OpenReward_28215 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenReward_28215 buildPartial() {
            C2S_OpenReward_28215 result = new C2S_OpenReward_28215(this);
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
            if (other instanceof C2S_OpenReward_28215) {
               return this.mergeFrom((C2S_OpenReward_28215)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenReward_28215 other) {
            if (other == SummerFestivalMsg.C2S_OpenReward_28215.getDefaultInstance()) {
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
            C2S_OpenReward_28215 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenReward_28215)SummerFestivalMsg.C2S_OpenReward_28215.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenReward_28215)e.getUnfinishedMessage();
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

   public static final class S2C_OpenReward_28216 extends GeneratedMessageV3 implements S2C_OpenReward_28216OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenReward_28216 DEFAULT_INSTANCE = new S2C_OpenReward_28216();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenReward_28216> PARSER = new AbstractParser<S2C_OpenReward_28216>() {
         public S2C_OpenReward_28216 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenReward_28216(input, extensionRegistry);
         }
      };

      private S2C_OpenReward_28216(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenReward_28216() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenReward_28216();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenReward_28216(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_OpenReward_28216_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_OpenReward_28216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_28216.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenReward_28216)) {
            return super.equals(obj);
         } else {
            S2C_OpenReward_28216 other = (S2C_OpenReward_28216)obj;
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

      public static S2C_OpenReward_28216 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_28216)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_28216 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_28216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_28216 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_28216)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_28216 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_28216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_28216 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_28216)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_28216 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_28216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_28216 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_28216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_28216 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_28216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_28216 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_28216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_28216 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_28216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_28216 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenReward_28216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_28216 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_28216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenReward_28216 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenReward_28216 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenReward_28216> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenReward_28216> getParserForType() {
         return PARSER;
      }

      public S2C_OpenReward_28216 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenReward_28216OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_OpenReward_28216_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_OpenReward_28216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_28216.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_OpenReward_28216.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_OpenReward_28216_descriptor;
         }

         public S2C_OpenReward_28216 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_OpenReward_28216.getDefaultInstance();
         }

         public S2C_OpenReward_28216 build() {
            S2C_OpenReward_28216 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenReward_28216 buildPartial() {
            S2C_OpenReward_28216 result = new S2C_OpenReward_28216(this);
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
            if (other instanceof S2C_OpenReward_28216) {
               return this.mergeFrom((S2C_OpenReward_28216)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenReward_28216 other) {
            if (other == SummerFestivalMsg.S2C_OpenReward_28216.getDefaultInstance()) {
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
            S2C_OpenReward_28216 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenReward_28216)SummerFestivalMsg.S2C_OpenReward_28216.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenReward_28216)e.getUnfinishedMessage();
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

   public static final class C2S_DrawRecord_28217 extends GeneratedMessageV3 implements C2S_DrawRecord_28217OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_28217 DEFAULT_INSTANCE = new C2S_DrawRecord_28217();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_28217> PARSER = new AbstractParser<C2S_DrawRecord_28217>() {
         public C2S_DrawRecord_28217 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_28217(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_28217(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_28217() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_28217();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_28217(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_DrawRecord_28217_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_DrawRecord_28217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_28217.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_28217)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_28217 other = (C2S_DrawRecord_28217)obj;
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

      public static C2S_DrawRecord_28217 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_28217)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_28217 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_28217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_28217 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_28217)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_28217 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_28217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_28217 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_28217)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_28217 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_28217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_28217 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_28217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_28217 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_28217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_28217 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_28217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_28217 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_28217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_28217 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_28217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_28217 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_28217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_28217 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_28217 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_28217> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_28217> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_28217 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_28217OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_DrawRecord_28217_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_DrawRecord_28217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_28217.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_DrawRecord_28217.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_DrawRecord_28217_descriptor;
         }

         public C2S_DrawRecord_28217 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_DrawRecord_28217.getDefaultInstance();
         }

         public C2S_DrawRecord_28217 build() {
            C2S_DrawRecord_28217 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_28217 buildPartial() {
            C2S_DrawRecord_28217 result = new C2S_DrawRecord_28217(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_DrawRecord_28217) {
               return this.mergeFrom((C2S_DrawRecord_28217)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_28217 other) {
            if (other == SummerFestivalMsg.C2S_DrawRecord_28217.getDefaultInstance()) {
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
            C2S_DrawRecord_28217 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_28217)SummerFestivalMsg.C2S_DrawRecord_28217.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_28217)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_28218 extends GeneratedMessageV3 implements S2C_DrawRecord_28218OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<MyDrawRecord> myRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_28218 DEFAULT_INSTANCE = new S2C_DrawRecord_28218();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_28218> PARSER = new AbstractParser<S2C_DrawRecord_28218>() {
         public S2C_DrawRecord_28218 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_28218(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_28218(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_28218() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_28218();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_28218(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(SummerFestivalMsg.MyDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_DrawRecord_28218_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_DrawRecord_28218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_28218.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawRecord_28218)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_28218 other = (S2C_DrawRecord_28218)obj;
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

      public static S2C_DrawRecord_28218 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_28218)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_28218 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_28218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_28218 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_28218)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_28218 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_28218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_28218 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_28218)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_28218 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_28218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_28218 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_28218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_28218 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_28218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_28218 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_28218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_28218 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_28218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_28218 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_28218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_28218 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_28218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_28218 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_28218 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_28218> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_28218> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_28218 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_28218OrBuilder {
         private int bitField0_;
         private List<MyDrawRecord> myRecord_;
         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> myRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_DrawRecord_28218_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_DrawRecord_28218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_28218.class, Builder.class);
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
            if (SummerFestivalMsg.S2C_DrawRecord_28218.alwaysUseFieldBuilders) {
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
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_DrawRecord_28218_descriptor;
         }

         public S2C_DrawRecord_28218 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_DrawRecord_28218.getDefaultInstance();
         }

         public S2C_DrawRecord_28218 build() {
            S2C_DrawRecord_28218 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_28218 buildPartial() {
            S2C_DrawRecord_28218 result = new S2C_DrawRecord_28218(this);
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
            if (other instanceof S2C_DrawRecord_28218) {
               return this.mergeFrom((S2C_DrawRecord_28218)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_28218 other) {
            if (other == SummerFestivalMsg.S2C_DrawRecord_28218.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = SummerFestivalMsg.S2C_DrawRecord_28218.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
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
            S2C_DrawRecord_28218 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_28218)SummerFestivalMsg.S2C_DrawRecord_28218.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_28218)e.getUnfinishedMessage();
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
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(SummerFestivalMsg.MyDrawRecord.getDefaultInstance());
         }

         public MyDrawRecord.Builder addMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, SummerFestivalMsg.MyDrawRecord.getDefaultInstance());
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

   public static final class C2S_ServerDrawRecord_28219 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_28219OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_28219 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_28219();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_28219> PARSER = new AbstractParser<C2S_ServerDrawRecord_28219>() {
         public C2S_ServerDrawRecord_28219 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_28219(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_28219(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_28219() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_28219();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_28219(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ServerDrawRecord_28219_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ServerDrawRecord_28219_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_28219.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_28219)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_28219 other = (C2S_ServerDrawRecord_28219)obj;
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

      public static C2S_ServerDrawRecord_28219 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_28219)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_28219 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_28219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_28219 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_28219)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_28219 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_28219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_28219 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_28219)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_28219 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_28219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_28219 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_28219)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_28219 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_28219)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_28219 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_28219)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_28219 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_28219)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_28219 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_28219)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_28219 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_28219)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_28219 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_28219 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_28219> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_28219> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_28219 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_28219OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ServerDrawRecord_28219_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ServerDrawRecord_28219_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_28219.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_ServerDrawRecord_28219.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ServerDrawRecord_28219_descriptor;
         }

         public C2S_ServerDrawRecord_28219 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_ServerDrawRecord_28219.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_28219 build() {
            C2S_ServerDrawRecord_28219 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_28219 buildPartial() {
            C2S_ServerDrawRecord_28219 result = new C2S_ServerDrawRecord_28219(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ServerDrawRecord_28219) {
               return this.mergeFrom((C2S_ServerDrawRecord_28219)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_28219 other) {
            if (other == SummerFestivalMsg.C2S_ServerDrawRecord_28219.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_28219 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_28219)SummerFestivalMsg.C2S_ServerDrawRecord_28219.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_28219)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_28220 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_28220OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_28220 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_28220();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_28220> PARSER = new AbstractParser<S2C_ServerDrawRecord_28220>() {
         public S2C_ServerDrawRecord_28220 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_28220(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_28220(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_28220() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_28220();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_28220(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.serverRecord_.add(input.readMessage(SummerFestivalMsg.ServerDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ServerDrawRecord_28220_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ServerDrawRecord_28220_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_28220.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_28220)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_28220 other = (S2C_ServerDrawRecord_28220)obj;
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

      public static S2C_ServerDrawRecord_28220 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_28220)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_28220 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_28220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_28220 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_28220)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_28220 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_28220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_28220 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_28220)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_28220 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_28220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_28220 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_28220)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_28220 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_28220)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_28220 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_28220)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_28220 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_28220)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_28220 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_28220)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_28220 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_28220)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_28220 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_28220 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_28220> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_28220> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_28220 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_28220OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ServerDrawRecord_28220_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ServerDrawRecord_28220_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_28220.class, Builder.class);
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
            if (SummerFestivalMsg.S2C_ServerDrawRecord_28220.alwaysUseFieldBuilders) {
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
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ServerDrawRecord_28220_descriptor;
         }

         public S2C_ServerDrawRecord_28220 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_ServerDrawRecord_28220.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_28220 build() {
            S2C_ServerDrawRecord_28220 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_28220 buildPartial() {
            S2C_ServerDrawRecord_28220 result = new S2C_ServerDrawRecord_28220(this);
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
            if (other instanceof S2C_ServerDrawRecord_28220) {
               return this.mergeFrom((S2C_ServerDrawRecord_28220)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_28220 other) {
            if (other == SummerFestivalMsg.S2C_ServerDrawRecord_28220.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = SummerFestivalMsg.S2C_ServerDrawRecord_28220.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_28220 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_28220)SummerFestivalMsg.S2C_ServerDrawRecord_28220.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_28220)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(SummerFestivalMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, SummerFestivalMsg.ServerDrawRecord.getDefaultInstance());
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_MyDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            if (SummerFestivalMsg.MyDrawRecord.alwaysUseFieldBuilders) {
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
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         public MyDrawRecord getDefaultInstanceForType() {
            return SummerFestivalMsg.MyDrawRecord.getDefaultInstance();
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
            if (other == SummerFestivalMsg.MyDrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = SummerFestivalMsg.MyDrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
               parsedMessage = (MyDrawRecord)SummerFestivalMsg.MyDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = SummerFestivalMsg.MyDrawRecord.getDefaultInstance().getPlayerName();
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (SummerFestivalMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return SummerFestivalMsg.ServerDrawRecord.getDefaultInstance();
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
            if (other == SummerFestivalMsg.ServerDrawRecord.getDefaultInstance()) {
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
               parsedMessage = (ServerDrawRecord)SummerFestivalMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = SummerFestivalMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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

   public static final class C2S_FishingGameInfo_28221 extends GeneratedMessageV3 implements C2S_FishingGameInfo_28221OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FishingGameInfo_28221 DEFAULT_INSTANCE = new C2S_FishingGameInfo_28221();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FishingGameInfo_28221> PARSER = new AbstractParser<C2S_FishingGameInfo_28221>() {
         public C2S_FishingGameInfo_28221 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FishingGameInfo_28221(input, extensionRegistry);
         }
      };

      private C2S_FishingGameInfo_28221(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FishingGameInfo_28221() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FishingGameInfo_28221();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FishingGameInfo_28221(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingGameInfo_28221_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingGameInfo_28221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FishingGameInfo_28221.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FishingGameInfo_28221)) {
            return super.equals(obj);
         } else {
            C2S_FishingGameInfo_28221 other = (C2S_FishingGameInfo_28221)obj;
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

      public static C2S_FishingGameInfo_28221 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FishingGameInfo_28221)PARSER.parseFrom(data);
      }

      public static C2S_FishingGameInfo_28221 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FishingGameInfo_28221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FishingGameInfo_28221 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FishingGameInfo_28221)PARSER.parseFrom(data);
      }

      public static C2S_FishingGameInfo_28221 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FishingGameInfo_28221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FishingGameInfo_28221 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FishingGameInfo_28221)PARSER.parseFrom(data);
      }

      public static C2S_FishingGameInfo_28221 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FishingGameInfo_28221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FishingGameInfo_28221 parseFrom(InputStream input) throws IOException {
         return (C2S_FishingGameInfo_28221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FishingGameInfo_28221 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FishingGameInfo_28221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FishingGameInfo_28221 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FishingGameInfo_28221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FishingGameInfo_28221 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FishingGameInfo_28221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FishingGameInfo_28221 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FishingGameInfo_28221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FishingGameInfo_28221 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FishingGameInfo_28221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FishingGameInfo_28221 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FishingGameInfo_28221 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FishingGameInfo_28221> parser() {
         return PARSER;
      }

      public Parser<C2S_FishingGameInfo_28221> getParserForType() {
         return PARSER;
      }

      public C2S_FishingGameInfo_28221 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FishingGameInfo_28221OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingGameInfo_28221_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingGameInfo_28221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FishingGameInfo_28221.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_FishingGameInfo_28221.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingGameInfo_28221_descriptor;
         }

         public C2S_FishingGameInfo_28221 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_FishingGameInfo_28221.getDefaultInstance();
         }

         public C2S_FishingGameInfo_28221 build() {
            C2S_FishingGameInfo_28221 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FishingGameInfo_28221 buildPartial() {
            C2S_FishingGameInfo_28221 result = new C2S_FishingGameInfo_28221(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_FishingGameInfo_28221) {
               return this.mergeFrom((C2S_FishingGameInfo_28221)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FishingGameInfo_28221 other) {
            if (other == SummerFestivalMsg.C2S_FishingGameInfo_28221.getDefaultInstance()) {
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
            C2S_FishingGameInfo_28221 parsedMessage = null;

            try {
               parsedMessage = (C2S_FishingGameInfo_28221)SummerFestivalMsg.C2S_FishingGameInfo_28221.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FishingGameInfo_28221)e.getUnfinishedMessage();
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

   public static final class S2C_FishingGameInfo_28222 extends GeneratedMessageV3 implements S2C_FishingGameInfo_28222OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYFISHINGTIMES_FIELD_NUMBER = 2;
      private int buyFishingTimes_;
      public static final int FISHINFO_FIELD_NUMBER = 3;
      private List<FishInfo> fishInfo_;
      public static final int RECEIVEDAWARD_FIELD_NUMBER = 4;
      private Internal.IntList receivedAward_;
      public static final int FISHINGPOINTSUM_FIELD_NUMBER = 5;
      private int fishingPointSum_;
      public static final int ACTIVATIONAWARD_FIELD_NUMBER = 6;
      private Internal.IntList activationAward_;
      private byte memoizedIsInitialized;
      private static final S2C_FishingGameInfo_28222 DEFAULT_INSTANCE = new S2C_FishingGameInfo_28222();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FishingGameInfo_28222> PARSER = new AbstractParser<S2C_FishingGameInfo_28222>() {
         public S2C_FishingGameInfo_28222 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FishingGameInfo_28222(input, extensionRegistry);
         }
      };

      private S2C_FishingGameInfo_28222(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FishingGameInfo_28222() {
         this.memoizedIsInitialized = -1;
         this.fishInfo_ = Collections.emptyList();
         this.receivedAward_ = emptyIntList();
         this.activationAward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FishingGameInfo_28222();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FishingGameInfo_28222(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 1;
                        this.buyFishingTimes_ = input.readInt32();
                        continue;
                     case 26:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.fishInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.fishInfo_.add(input.readMessage(SummerFestivalMsg.FishInfo.PARSER, extensionRegistry));
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.receivedAward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.receivedAward_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receivedAward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 2;
                        this.fishingPointSum_ = input.readInt32();
                        continue;
                     case 48:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.activationAward_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.activationAward_.addInt(input.readInt32());
                        continue;
                     case 50:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.activationAward_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.activationAward_.addInt(input.readInt32());
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
                     this.receivedAward_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.fishInfo_ = Collections.unmodifiableList(this.fishInfo_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.receivedAward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.activationAward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingGameInfo_28222_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingGameInfo_28222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FishingGameInfo_28222.class, Builder.class);
      }

      public boolean hasBuyFishingTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyFishingTimes() {
         return this.buyFishingTimes_;
      }

      public List<FishInfo> getFishInfoList() {
         return this.fishInfo_;
      }

      public List<? extends FishInfoOrBuilder> getFishInfoOrBuilderList() {
         return this.fishInfo_;
      }

      public int getFishInfoCount() {
         return this.fishInfo_.size();
      }

      public FishInfo getFishInfo(int index) {
         return (FishInfo)this.fishInfo_.get(index);
      }

      public FishInfoOrBuilder getFishInfoOrBuilder(int index) {
         return (FishInfoOrBuilder)this.fishInfo_.get(index);
      }

      public List<Integer> getReceivedAwardList() {
         return this.receivedAward_;
      }

      public int getReceivedAwardCount() {
         return this.receivedAward_.size();
      }

      public int getReceivedAward(int index) {
         return this.receivedAward_.getInt(index);
      }

      public boolean hasFishingPointSum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFishingPointSum() {
         return this.fishingPointSum_;
      }

      public List<Integer> getActivationAwardList() {
         return this.activationAward_;
      }

      public int getActivationAwardCount() {
         return this.activationAward_.size();
      }

      public int getActivationAward(int index) {
         return this.activationAward_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyFishingTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFishingPointSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getFishInfoCount(); ++i) {
               if (!this.getFishInfo(i).isInitialized()) {
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
            output.writeInt32(2, this.buyFishingTimes_);
         }

         for(int i = 0; i < this.fishInfo_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.fishInfo_.get(i));
         }

         for(int i = 0; i < this.receivedAward_.size(); ++i) {
            output.writeInt32(4, this.receivedAward_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(5, this.fishingPointSum_);
         }

         for(int i = 0; i < this.activationAward_.size(); ++i) {
            output.writeInt32(6, this.activationAward_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.buyFishingTimes_);
            }

            for(int i = 0; i < this.fishInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.fishInfo_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.receivedAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receivedAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceivedAwardList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.fishingPointSum_);
            }

            dataSize = 0;

            for(int i = 0; i < this.activationAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.activationAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getActivationAwardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FishingGameInfo_28222)) {
            return super.equals(obj);
         } else {
            S2C_FishingGameInfo_28222 other = (S2C_FishingGameInfo_28222)obj;
            if (this.hasBuyFishingTimes() != other.hasBuyFishingTimes()) {
               return false;
            } else if (this.hasBuyFishingTimes() && this.getBuyFishingTimes() != other.getBuyFishingTimes()) {
               return false;
            } else if (!this.getFishInfoList().equals(other.getFishInfoList())) {
               return false;
            } else if (!this.getReceivedAwardList().equals(other.getReceivedAwardList())) {
               return false;
            } else if (this.hasFishingPointSum() != other.hasFishingPointSum()) {
               return false;
            } else if (this.hasFishingPointSum() && this.getFishingPointSum() != other.getFishingPointSum()) {
               return false;
            } else if (!this.getActivationAwardList().equals(other.getActivationAwardList())) {
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
            if (this.hasBuyFishingTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyFishingTimes();
            }

            if (this.getFishInfoCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFishInfoList().hashCode();
            }

            if (this.getReceivedAwardCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getReceivedAwardList().hashCode();
            }

            if (this.hasFishingPointSum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getFishingPointSum();
            }

            if (this.getActivationAwardCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getActivationAwardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FishingGameInfo_28222 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FishingGameInfo_28222)PARSER.parseFrom(data);
      }

      public static S2C_FishingGameInfo_28222 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FishingGameInfo_28222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FishingGameInfo_28222 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FishingGameInfo_28222)PARSER.parseFrom(data);
      }

      public static S2C_FishingGameInfo_28222 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FishingGameInfo_28222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FishingGameInfo_28222 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FishingGameInfo_28222)PARSER.parseFrom(data);
      }

      public static S2C_FishingGameInfo_28222 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FishingGameInfo_28222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FishingGameInfo_28222 parseFrom(InputStream input) throws IOException {
         return (S2C_FishingGameInfo_28222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FishingGameInfo_28222 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FishingGameInfo_28222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FishingGameInfo_28222 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FishingGameInfo_28222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FishingGameInfo_28222 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FishingGameInfo_28222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FishingGameInfo_28222 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FishingGameInfo_28222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FishingGameInfo_28222 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FishingGameInfo_28222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FishingGameInfo_28222 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FishingGameInfo_28222 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FishingGameInfo_28222> parser() {
         return PARSER;
      }

      public Parser<S2C_FishingGameInfo_28222> getParserForType() {
         return PARSER;
      }

      public S2C_FishingGameInfo_28222 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FishingGameInfo_28222OrBuilder {
         private int bitField0_;
         private int buyFishingTimes_;
         private List<FishInfo> fishInfo_;
         private RepeatedFieldBuilderV3<FishInfo, FishInfo.Builder, FishInfoOrBuilder> fishInfoBuilder_;
         private Internal.IntList receivedAward_;
         private int fishingPointSum_;
         private Internal.IntList activationAward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingGameInfo_28222_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingGameInfo_28222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FishingGameInfo_28222.class, Builder.class);
         }

         private Builder() {
            this.fishInfo_ = Collections.emptyList();
            this.receivedAward_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.emptyIntList();
            this.activationAward_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.fishInfo_ = Collections.emptyList();
            this.receivedAward_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.emptyIntList();
            this.activationAward_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_FishingGameInfo_28222.alwaysUseFieldBuilders) {
               this.getFishInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.buyFishingTimes_ = 0;
            this.bitField0_ &= -2;
            if (this.fishInfoBuilder_ == null) {
               this.fishInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.fishInfoBuilder_.clear();
            }

            this.receivedAward_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.emptyIntList();
            this.bitField0_ &= -5;
            this.fishingPointSum_ = 0;
            this.bitField0_ &= -9;
            this.activationAward_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingGameInfo_28222_descriptor;
         }

         public S2C_FishingGameInfo_28222 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_FishingGameInfo_28222.getDefaultInstance();
         }

         public S2C_FishingGameInfo_28222 build() {
            S2C_FishingGameInfo_28222 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FishingGameInfo_28222 buildPartial() {
            S2C_FishingGameInfo_28222 result = new S2C_FishingGameInfo_28222(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyFishingTimes_ = this.buyFishingTimes_;
               to_bitField0_ |= 1;
            }

            if (this.fishInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.fishInfo_ = Collections.unmodifiableList(this.fishInfo_);
                  this.bitField0_ &= -3;
               }

               result.fishInfo_ = this.fishInfo_;
            } else {
               result.fishInfo_ = this.fishInfoBuilder_.build();
            }

            if ((this.bitField0_ & 4) != 0) {
               this.receivedAward_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.receivedAward_ = this.receivedAward_;
            if ((from_bitField0_ & 8) != 0) {
               result.fishingPointSum_ = this.fishingPointSum_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.activationAward_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.activationAward_ = this.activationAward_;
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
            if (other instanceof S2C_FishingGameInfo_28222) {
               return this.mergeFrom((S2C_FishingGameInfo_28222)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FishingGameInfo_28222 other) {
            if (other == SummerFestivalMsg.S2C_FishingGameInfo_28222.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyFishingTimes()) {
                  this.setBuyFishingTimes(other.getBuyFishingTimes());
               }

               if (this.fishInfoBuilder_ == null) {
                  if (!other.fishInfo_.isEmpty()) {
                     if (this.fishInfo_.isEmpty()) {
                        this.fishInfo_ = other.fishInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureFishInfoIsMutable();
                        this.fishInfo_.addAll(other.fishInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.fishInfo_.isEmpty()) {
                  if (this.fishInfoBuilder_.isEmpty()) {
                     this.fishInfoBuilder_.dispose();
                     this.fishInfoBuilder_ = null;
                     this.fishInfo_ = other.fishInfo_;
                     this.bitField0_ &= -3;
                     this.fishInfoBuilder_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.alwaysUseFieldBuilders ? this.getFishInfoFieldBuilder() : null;
                  } else {
                     this.fishInfoBuilder_.addAllMessages(other.fishInfo_);
                  }
               }

               if (!other.receivedAward_.isEmpty()) {
                  if (this.receivedAward_.isEmpty()) {
                     this.receivedAward_ = other.receivedAward_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureReceivedAwardIsMutable();
                     this.receivedAward_.addAll(other.receivedAward_);
                  }

                  this.onChanged();
               }

               if (other.hasFishingPointSum()) {
                  this.setFishingPointSum(other.getFishingPointSum());
               }

               if (!other.activationAward_.isEmpty()) {
                  if (this.activationAward_.isEmpty()) {
                     this.activationAward_ = other.activationAward_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureActivationAwardIsMutable();
                     this.activationAward_.addAll(other.activationAward_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBuyFishingTimes()) {
               return false;
            } else if (!this.hasFishingPointSum()) {
               return false;
            } else {
               for(int i = 0; i < this.getFishInfoCount(); ++i) {
                  if (!this.getFishInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FishingGameInfo_28222 parsedMessage = null;

            try {
               parsedMessage = (S2C_FishingGameInfo_28222)SummerFestivalMsg.S2C_FishingGameInfo_28222.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FishingGameInfo_28222)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyFishingTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyFishingTimes() {
            return this.buyFishingTimes_;
         }

         public Builder setBuyFishingTimes(int value) {
            this.bitField0_ |= 1;
            this.buyFishingTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyFishingTimes() {
            this.bitField0_ &= -2;
            this.buyFishingTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureFishInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.fishInfo_ = new ArrayList(this.fishInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<FishInfo> getFishInfoList() {
            return this.fishInfoBuilder_ == null ? Collections.unmodifiableList(this.fishInfo_) : this.fishInfoBuilder_.getMessageList();
         }

         public int getFishInfoCount() {
            return this.fishInfoBuilder_ == null ? this.fishInfo_.size() : this.fishInfoBuilder_.getCount();
         }

         public FishInfo getFishInfo(int index) {
            return this.fishInfoBuilder_ == null ? (FishInfo)this.fishInfo_.get(index) : (FishInfo)this.fishInfoBuilder_.getMessage(index);
         }

         public Builder setFishInfo(int index, FishInfo value) {
            if (this.fishInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFishInfoIsMutable();
               this.fishInfo_.set(index, value);
               this.onChanged();
            } else {
               this.fishInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFishInfo(int index, FishInfo.Builder builderForValue) {
            if (this.fishInfoBuilder_ == null) {
               this.ensureFishInfoIsMutable();
               this.fishInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fishInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFishInfo(FishInfo value) {
            if (this.fishInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFishInfoIsMutable();
               this.fishInfo_.add(value);
               this.onChanged();
            } else {
               this.fishInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addFishInfo(int index, FishInfo value) {
            if (this.fishInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFishInfoIsMutable();
               this.fishInfo_.add(index, value);
               this.onChanged();
            } else {
               this.fishInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFishInfo(FishInfo.Builder builderForValue) {
            if (this.fishInfoBuilder_ == null) {
               this.ensureFishInfoIsMutable();
               this.fishInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.fishInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFishInfo(int index, FishInfo.Builder builderForValue) {
            if (this.fishInfoBuilder_ == null) {
               this.ensureFishInfoIsMutable();
               this.fishInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fishInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFishInfo(Iterable<? extends FishInfo> values) {
            if (this.fishInfoBuilder_ == null) {
               this.ensureFishInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.fishInfo_);
               this.onChanged();
            } else {
               this.fishInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFishInfo() {
            if (this.fishInfoBuilder_ == null) {
               this.fishInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.fishInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeFishInfo(int index) {
            if (this.fishInfoBuilder_ == null) {
               this.ensureFishInfoIsMutable();
               this.fishInfo_.remove(index);
               this.onChanged();
            } else {
               this.fishInfoBuilder_.remove(index);
            }

            return this;
         }

         public FishInfo.Builder getFishInfoBuilder(int index) {
            return (FishInfo.Builder)this.getFishInfoFieldBuilder().getBuilder(index);
         }

         public FishInfoOrBuilder getFishInfoOrBuilder(int index) {
            return this.fishInfoBuilder_ == null ? (FishInfoOrBuilder)this.fishInfo_.get(index) : (FishInfoOrBuilder)this.fishInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends FishInfoOrBuilder> getFishInfoOrBuilderList() {
            return this.fishInfoBuilder_ != null ? this.fishInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.fishInfo_);
         }

         public FishInfo.Builder addFishInfoBuilder() {
            return (FishInfo.Builder)this.getFishInfoFieldBuilder().addBuilder(SummerFestivalMsg.FishInfo.getDefaultInstance());
         }

         public FishInfo.Builder addFishInfoBuilder(int index) {
            return (FishInfo.Builder)this.getFishInfoFieldBuilder().addBuilder(index, SummerFestivalMsg.FishInfo.getDefaultInstance());
         }

         public List<FishInfo.Builder> getFishInfoBuilderList() {
            return this.getFishInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<FishInfo, FishInfo.Builder, FishInfoOrBuilder> getFishInfoFieldBuilder() {
            if (this.fishInfoBuilder_ == null) {
               this.fishInfoBuilder_ = new RepeatedFieldBuilderV3(this.fishInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.fishInfo_ = null;
            }

            return this.fishInfoBuilder_;
         }

         private void ensureReceivedAwardIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.receivedAward_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.mutableCopy(this.receivedAward_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getReceivedAwardList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.receivedAward_) : this.receivedAward_);
         }

         public int getReceivedAwardCount() {
            return this.receivedAward_.size();
         }

         public int getReceivedAward(int index) {
            return this.receivedAward_.getInt(index);
         }

         public Builder setReceivedAward(int index, int value) {
            this.ensureReceivedAwardIsMutable();
            this.receivedAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceivedAward(int value) {
            this.ensureReceivedAwardIsMutable();
            this.receivedAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceivedAward(Iterable<? extends Integer> values) {
            this.ensureReceivedAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receivedAward_);
            this.onChanged();
            return this;
         }

         public Builder clearReceivedAward() {
            this.receivedAward_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasFishingPointSum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getFishingPointSum() {
            return this.fishingPointSum_;
         }

         public Builder setFishingPointSum(int value) {
            this.bitField0_ |= 8;
            this.fishingPointSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFishingPointSum() {
            this.bitField0_ &= -9;
            this.fishingPointSum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureActivationAwardIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.activationAward_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.mutableCopy(this.activationAward_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getActivationAwardList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.activationAward_) : this.activationAward_);
         }

         public int getActivationAwardCount() {
            return this.activationAward_.size();
         }

         public int getActivationAward(int index) {
            return this.activationAward_.getInt(index);
         }

         public Builder setActivationAward(int index, int value) {
            this.ensureActivationAwardIsMutable();
            this.activationAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addActivationAward(int value) {
            this.ensureActivationAwardIsMutable();
            this.activationAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllActivationAward(Iterable<? extends Integer> values) {
            this.ensureActivationAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.activationAward_);
            this.onChanged();
            return this;
         }

         public Builder clearActivationAward() {
            this.activationAward_ = SummerFestivalMsg.S2C_FishingGameInfo_28222.emptyIntList();
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

   public static final class C2S_FishingBegin_28223 extends GeneratedMessageV3 implements C2S_FishingBegin_28223OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LENGTH_FIELD_NUMBER = 1;
      private int length_;
      private byte memoizedIsInitialized;
      private static final C2S_FishingBegin_28223 DEFAULT_INSTANCE = new C2S_FishingBegin_28223();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FishingBegin_28223> PARSER = new AbstractParser<C2S_FishingBegin_28223>() {
         public C2S_FishingBegin_28223 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FishingBegin_28223(input, extensionRegistry);
         }
      };

      private C2S_FishingBegin_28223(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FishingBegin_28223() {
         this.memoizedIsInitialized = -1;
         this.length_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FishingBegin_28223();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FishingBegin_28223(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        FishLength value = SummerFestivalMsg.FishLength.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.length_ = rawValue;
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingBegin_28223_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingBegin_28223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FishingBegin_28223.class, Builder.class);
      }

      public boolean hasLength() {
         return (this.bitField0_ & 1) != 0;
      }

      public FishLength getLength() {
         FishLength result = SummerFestivalMsg.FishLength.valueOf(this.length_);
         return result == null ? SummerFestivalMsg.FishLength.LENGTH_NORMAL : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLength()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.length_);
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
               size += CodedOutputStream.computeEnumSize(1, this.length_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FishingBegin_28223)) {
            return super.equals(obj);
         } else {
            C2S_FishingBegin_28223 other = (C2S_FishingBegin_28223)obj;
            if (this.hasLength() != other.hasLength()) {
               return false;
            } else if (this.hasLength() && this.length_ != other.length_) {
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
            if (this.hasLength()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.length_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FishingBegin_28223 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FishingBegin_28223)PARSER.parseFrom(data);
      }

      public static C2S_FishingBegin_28223 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FishingBegin_28223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FishingBegin_28223 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FishingBegin_28223)PARSER.parseFrom(data);
      }

      public static C2S_FishingBegin_28223 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FishingBegin_28223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FishingBegin_28223 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FishingBegin_28223)PARSER.parseFrom(data);
      }

      public static C2S_FishingBegin_28223 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FishingBegin_28223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FishingBegin_28223 parseFrom(InputStream input) throws IOException {
         return (C2S_FishingBegin_28223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FishingBegin_28223 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FishingBegin_28223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FishingBegin_28223 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FishingBegin_28223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FishingBegin_28223 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FishingBegin_28223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FishingBegin_28223 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FishingBegin_28223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FishingBegin_28223 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FishingBegin_28223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FishingBegin_28223 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FishingBegin_28223 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FishingBegin_28223> parser() {
         return PARSER;
      }

      public Parser<C2S_FishingBegin_28223> getParserForType() {
         return PARSER;
      }

      public C2S_FishingBegin_28223 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FishingBegin_28223OrBuilder {
         private int bitField0_;
         private int length_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingBegin_28223_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingBegin_28223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FishingBegin_28223.class, Builder.class);
         }

         private Builder() {
            this.length_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.length_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_FishingBegin_28223.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.length_ = 1;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingBegin_28223_descriptor;
         }

         public C2S_FishingBegin_28223 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_FishingBegin_28223.getDefaultInstance();
         }

         public C2S_FishingBegin_28223 build() {
            C2S_FishingBegin_28223 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FishingBegin_28223 buildPartial() {
            C2S_FishingBegin_28223 result = new C2S_FishingBegin_28223(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.length_ = this.length_;
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
            if (other instanceof C2S_FishingBegin_28223) {
               return this.mergeFrom((C2S_FishingBegin_28223)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FishingBegin_28223 other) {
            if (other == SummerFestivalMsg.C2S_FishingBegin_28223.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLength()) {
                  this.setLength(other.getLength());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasLength();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FishingBegin_28223 parsedMessage = null;

            try {
               parsedMessage = (C2S_FishingBegin_28223)SummerFestivalMsg.C2S_FishingBegin_28223.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FishingBegin_28223)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLength() {
            return (this.bitField0_ & 1) != 0;
         }

         public FishLength getLength() {
            FishLength result = SummerFestivalMsg.FishLength.valueOf(this.length_);
            return result == null ? SummerFestivalMsg.FishLength.LENGTH_NORMAL : result;
         }

         public Builder setLength(FishLength value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.length_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearLength() {
            this.bitField0_ &= -2;
            this.length_ = 1;
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

   public static final class S2C_FishingBegin_28224 extends GeneratedMessageV3 implements S2C_FishingBegin_28224OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FISHID_FIELD_NUMBER = 1;
      private int fishId_;
      private byte memoizedIsInitialized;
      private static final S2C_FishingBegin_28224 DEFAULT_INSTANCE = new S2C_FishingBegin_28224();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FishingBegin_28224> PARSER = new AbstractParser<S2C_FishingBegin_28224>() {
         public S2C_FishingBegin_28224 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FishingBegin_28224(input, extensionRegistry);
         }
      };

      private S2C_FishingBegin_28224(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FishingBegin_28224() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FishingBegin_28224();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FishingBegin_28224(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fishId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingBegin_28224_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingBegin_28224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FishingBegin_28224.class, Builder.class);
      }

      public boolean hasFishId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFishId() {
         return this.fishId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFishId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.fishId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fishId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FishingBegin_28224)) {
            return super.equals(obj);
         } else {
            S2C_FishingBegin_28224 other = (S2C_FishingBegin_28224)obj;
            if (this.hasFishId() != other.hasFishId()) {
               return false;
            } else if (this.hasFishId() && this.getFishId() != other.getFishId()) {
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
            if (this.hasFishId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFishId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FishingBegin_28224 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FishingBegin_28224)PARSER.parseFrom(data);
      }

      public static S2C_FishingBegin_28224 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FishingBegin_28224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FishingBegin_28224 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FishingBegin_28224)PARSER.parseFrom(data);
      }

      public static S2C_FishingBegin_28224 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FishingBegin_28224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FishingBegin_28224 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FishingBegin_28224)PARSER.parseFrom(data);
      }

      public static S2C_FishingBegin_28224 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FishingBegin_28224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FishingBegin_28224 parseFrom(InputStream input) throws IOException {
         return (S2C_FishingBegin_28224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FishingBegin_28224 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FishingBegin_28224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FishingBegin_28224 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FishingBegin_28224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FishingBegin_28224 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FishingBegin_28224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FishingBegin_28224 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FishingBegin_28224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FishingBegin_28224 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FishingBegin_28224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FishingBegin_28224 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FishingBegin_28224 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FishingBegin_28224> parser() {
         return PARSER;
      }

      public Parser<S2C_FishingBegin_28224> getParserForType() {
         return PARSER;
      }

      public S2C_FishingBegin_28224 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FishingBegin_28224OrBuilder {
         private int bitField0_;
         private int fishId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingBegin_28224_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingBegin_28224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FishingBegin_28224.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_FishingBegin_28224.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fishId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingBegin_28224_descriptor;
         }

         public S2C_FishingBegin_28224 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_FishingBegin_28224.getDefaultInstance();
         }

         public S2C_FishingBegin_28224 build() {
            S2C_FishingBegin_28224 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FishingBegin_28224 buildPartial() {
            S2C_FishingBegin_28224 result = new S2C_FishingBegin_28224(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fishId_ = this.fishId_;
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
            if (other instanceof S2C_FishingBegin_28224) {
               return this.mergeFrom((S2C_FishingBegin_28224)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FishingBegin_28224 other) {
            if (other == SummerFestivalMsg.S2C_FishingBegin_28224.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFishId()) {
                  this.setFishId(other.getFishId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasFishId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FishingBegin_28224 parsedMessage = null;

            try {
               parsedMessage = (S2C_FishingBegin_28224)SummerFestivalMsg.S2C_FishingBegin_28224.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FishingBegin_28224)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFishId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFishId() {
            return this.fishId_;
         }

         public Builder setFishId(int value) {
            this.bitField0_ |= 1;
            this.fishId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFishId() {
            this.bitField0_ &= -2;
            this.fishId_ = 0;
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

   public static final class C2S_BuyFishingTimes_28225 extends GeneratedMessageV3 implements C2S_BuyFishingTimes_28225OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BuyFishingTimes_28225 DEFAULT_INSTANCE = new C2S_BuyFishingTimes_28225();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyFishingTimes_28225> PARSER = new AbstractParser<C2S_BuyFishingTimes_28225>() {
         public C2S_BuyFishingTimes_28225 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyFishingTimes_28225(input, extensionRegistry);
         }
      };

      private C2S_BuyFishingTimes_28225(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyFishingTimes_28225() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyFishingTimes_28225();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyFishingTimes_28225(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_BuyFishingTimes_28225_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_BuyFishingTimes_28225_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyFishingTimes_28225.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BuyFishingTimes_28225)) {
            return super.equals(obj);
         } else {
            C2S_BuyFishingTimes_28225 other = (C2S_BuyFishingTimes_28225)obj;
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

      public static C2S_BuyFishingTimes_28225 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyFishingTimes_28225)PARSER.parseFrom(data);
      }

      public static C2S_BuyFishingTimes_28225 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyFishingTimes_28225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyFishingTimes_28225 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyFishingTimes_28225)PARSER.parseFrom(data);
      }

      public static C2S_BuyFishingTimes_28225 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyFishingTimes_28225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyFishingTimes_28225 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyFishingTimes_28225)PARSER.parseFrom(data);
      }

      public static C2S_BuyFishingTimes_28225 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyFishingTimes_28225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyFishingTimes_28225 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyFishingTimes_28225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyFishingTimes_28225 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyFishingTimes_28225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyFishingTimes_28225 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyFishingTimes_28225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyFishingTimes_28225 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyFishingTimes_28225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyFishingTimes_28225 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyFishingTimes_28225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyFishingTimes_28225 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyFishingTimes_28225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyFishingTimes_28225 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyFishingTimes_28225 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyFishingTimes_28225> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyFishingTimes_28225> getParserForType() {
         return PARSER;
      }

      public C2S_BuyFishingTimes_28225 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyFishingTimes_28225OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_BuyFishingTimes_28225_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_BuyFishingTimes_28225_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyFishingTimes_28225.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_BuyFishingTimes_28225.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_BuyFishingTimes_28225_descriptor;
         }

         public C2S_BuyFishingTimes_28225 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_BuyFishingTimes_28225.getDefaultInstance();
         }

         public C2S_BuyFishingTimes_28225 build() {
            C2S_BuyFishingTimes_28225 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyFishingTimes_28225 buildPartial() {
            C2S_BuyFishingTimes_28225 result = new C2S_BuyFishingTimes_28225(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_BuyFishingTimes_28225) {
               return this.mergeFrom((C2S_BuyFishingTimes_28225)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyFishingTimes_28225 other) {
            if (other == SummerFestivalMsg.C2S_BuyFishingTimes_28225.getDefaultInstance()) {
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
            C2S_BuyFishingTimes_28225 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyFishingTimes_28225)SummerFestivalMsg.C2S_BuyFishingTimes_28225.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyFishingTimes_28225)e.getUnfinishedMessage();
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

   public static final class S2C_BuyFishingTimes_28226 extends GeneratedMessageV3 implements S2C_BuyFishingTimes_28226OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYFISHINGTIMES_FIELD_NUMBER = 2;
      private int buyFishingTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyFishingTimes_28226 DEFAULT_INSTANCE = new S2C_BuyFishingTimes_28226();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyFishingTimes_28226> PARSER = new AbstractParser<S2C_BuyFishingTimes_28226>() {
         public S2C_BuyFishingTimes_28226 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyFishingTimes_28226(input, extensionRegistry);
         }
      };

      private S2C_BuyFishingTimes_28226(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyFishingTimes_28226() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyFishingTimes_28226();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyFishingTimes_28226(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyFishingTimes_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_BuyFishingTimes_28226_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_BuyFishingTimes_28226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyFishingTimes_28226.class, Builder.class);
      }

      public boolean hasBuyFishingTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyFishingTimes() {
         return this.buyFishingTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyFishingTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.buyFishingTimes_);
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
               size += CodedOutputStream.computeInt32Size(2, this.buyFishingTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyFishingTimes_28226)) {
            return super.equals(obj);
         } else {
            S2C_BuyFishingTimes_28226 other = (S2C_BuyFishingTimes_28226)obj;
            if (this.hasBuyFishingTimes() != other.hasBuyFishingTimes()) {
               return false;
            } else if (this.hasBuyFishingTimes() && this.getBuyFishingTimes() != other.getBuyFishingTimes()) {
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
            if (this.hasBuyFishingTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyFishingTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyFishingTimes_28226 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyFishingTimes_28226)PARSER.parseFrom(data);
      }

      public static S2C_BuyFishingTimes_28226 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyFishingTimes_28226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyFishingTimes_28226 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyFishingTimes_28226)PARSER.parseFrom(data);
      }

      public static S2C_BuyFishingTimes_28226 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyFishingTimes_28226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyFishingTimes_28226 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyFishingTimes_28226)PARSER.parseFrom(data);
      }

      public static S2C_BuyFishingTimes_28226 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyFishingTimes_28226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyFishingTimes_28226 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyFishingTimes_28226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyFishingTimes_28226 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyFishingTimes_28226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyFishingTimes_28226 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyFishingTimes_28226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyFishingTimes_28226 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyFishingTimes_28226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyFishingTimes_28226 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyFishingTimes_28226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyFishingTimes_28226 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyFishingTimes_28226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyFishingTimes_28226 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyFishingTimes_28226 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyFishingTimes_28226> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyFishingTimes_28226> getParserForType() {
         return PARSER;
      }

      public S2C_BuyFishingTimes_28226 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyFishingTimes_28226OrBuilder {
         private int bitField0_;
         private int buyFishingTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_BuyFishingTimes_28226_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_BuyFishingTimes_28226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyFishingTimes_28226.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_BuyFishingTimes_28226.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyFishingTimes_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_BuyFishingTimes_28226_descriptor;
         }

         public S2C_BuyFishingTimes_28226 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_BuyFishingTimes_28226.getDefaultInstance();
         }

         public S2C_BuyFishingTimes_28226 build() {
            S2C_BuyFishingTimes_28226 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyFishingTimes_28226 buildPartial() {
            S2C_BuyFishingTimes_28226 result = new S2C_BuyFishingTimes_28226(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyFishingTimes_ = this.buyFishingTimes_;
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
            if (other instanceof S2C_BuyFishingTimes_28226) {
               return this.mergeFrom((S2C_BuyFishingTimes_28226)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyFishingTimes_28226 other) {
            if (other == SummerFestivalMsg.S2C_BuyFishingTimes_28226.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyFishingTimes()) {
                  this.setBuyFishingTimes(other.getBuyFishingTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyFishingTimes();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BuyFishingTimes_28226 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyFishingTimes_28226)SummerFestivalMsg.S2C_BuyFishingTimes_28226.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyFishingTimes_28226)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyFishingTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyFishingTimes() {
            return this.buyFishingTimes_;
         }

         public Builder setBuyFishingTimes(int value) {
            this.bitField0_ |= 1;
            this.buyFishingTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyFishingTimes() {
            this.bitField0_ &= -2;
            this.buyFishingTimes_ = 0;
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

   public static final class FishInfo extends GeneratedMessageV3 implements FishInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int LENGTHMIN_FIELD_NUMBER = 2;
      private int lengthMin_;
      public static final int LENGTHMAX_FIELD_NUMBER = 3;
      private int lengthMax_;
      public static final int POINTMIN_FIELD_NUMBER = 4;
      private int pointMin_;
      public static final int POINTMAX_FIELD_NUMBER = 5;
      private int pointMax_;
      public static final int FISHSUM_FIELD_NUMBER = 6;
      private int fishSum_;
      private byte memoizedIsInitialized;
      private static final FishInfo DEFAULT_INSTANCE = new FishInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<FishInfo> PARSER = new AbstractParser<FishInfo>() {
         public FishInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new FishInfo(input, extensionRegistry);
         }
      };

      private FishInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private FishInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new FishInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private FishInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.lengthMin_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lengthMax_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.pointMin_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.pointMax_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.fishSum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_FishInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_FishInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FishInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasLengthMin() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLengthMin() {
         return this.lengthMin_;
      }

      public boolean hasLengthMax() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLengthMax() {
         return this.lengthMax_;
      }

      public boolean hasPointMin() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPointMin() {
         return this.pointMin_;
      }

      public boolean hasPointMax() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getPointMax() {
         return this.pointMax_;
      }

      public boolean hasFishSum() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getFishSum() {
         return this.fishSum_;
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
         } else if (!this.hasLengthMin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLengthMax()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPointMin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPointMax()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFishSum()) {
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
            output.writeInt32(2, this.lengthMin_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lengthMax_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.pointMin_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.pointMax_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.fishSum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.lengthMin_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lengthMax_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.pointMin_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.pointMax_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.fishSum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof FishInfo)) {
            return super.equals(obj);
         } else {
            FishInfo other = (FishInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasLengthMin() != other.hasLengthMin()) {
               return false;
            } else if (this.hasLengthMin() && this.getLengthMin() != other.getLengthMin()) {
               return false;
            } else if (this.hasLengthMax() != other.hasLengthMax()) {
               return false;
            } else if (this.hasLengthMax() && this.getLengthMax() != other.getLengthMax()) {
               return false;
            } else if (this.hasPointMin() != other.hasPointMin()) {
               return false;
            } else if (this.hasPointMin() && this.getPointMin() != other.getPointMin()) {
               return false;
            } else if (this.hasPointMax() != other.hasPointMax()) {
               return false;
            } else if (this.hasPointMax() && this.getPointMax() != other.getPointMax()) {
               return false;
            } else if (this.hasFishSum() != other.hasFishSum()) {
               return false;
            } else if (this.hasFishSum() && this.getFishSum() != other.getFishSum()) {
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

            if (this.hasLengthMin()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLengthMin();
            }

            if (this.hasLengthMax()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLengthMax();
            }

            if (this.hasPointMin()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPointMin();
            }

            if (this.hasPointMax()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPointMax();
            }

            if (this.hasFishSum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getFishSum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static FishInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (FishInfo)PARSER.parseFrom(data);
      }

      public static FishInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FishInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FishInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (FishInfo)PARSER.parseFrom(data);
      }

      public static FishInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FishInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FishInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (FishInfo)PARSER.parseFrom(data);
      }

      public static FishInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FishInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FishInfo parseFrom(InputStream input) throws IOException {
         return (FishInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FishInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FishInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static FishInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (FishInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static FishInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FishInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static FishInfo parseFrom(CodedInputStream input) throws IOException {
         return (FishInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FishInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FishInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(FishInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static FishInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<FishInfo> parser() {
         return PARSER;
      }

      public Parser<FishInfo> getParserForType() {
         return PARSER;
      }

      public FishInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FishInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int lengthMin_;
         private int lengthMax_;
         private int pointMin_;
         private int pointMax_;
         private int fishSum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_FishInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_FishInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FishInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.FishInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.lengthMin_ = 0;
            this.bitField0_ &= -3;
            this.lengthMax_ = 0;
            this.bitField0_ &= -5;
            this.pointMin_ = 0;
            this.bitField0_ &= -9;
            this.pointMax_ = 0;
            this.bitField0_ &= -17;
            this.fishSum_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_FishInfo_descriptor;
         }

         public FishInfo getDefaultInstanceForType() {
            return SummerFestivalMsg.FishInfo.getDefaultInstance();
         }

         public FishInfo build() {
            FishInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public FishInfo buildPartial() {
            FishInfo result = new FishInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.lengthMin_ = this.lengthMin_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lengthMax_ = this.lengthMax_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.pointMin_ = this.pointMin_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.pointMax_ = this.pointMax_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.fishSum_ = this.fishSum_;
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
            if (other instanceof FishInfo) {
               return this.mergeFrom((FishInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(FishInfo other) {
            if (other == SummerFestivalMsg.FishInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasLengthMin()) {
                  this.setLengthMin(other.getLengthMin());
               }

               if (other.hasLengthMax()) {
                  this.setLengthMax(other.getLengthMax());
               }

               if (other.hasPointMin()) {
                  this.setPointMin(other.getPointMin());
               }

               if (other.hasPointMax()) {
                  this.setPointMax(other.getPointMax());
               }

               if (other.hasFishSum()) {
                  this.setFishSum(other.getFishSum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasLengthMin()) {
               return false;
            } else if (!this.hasLengthMax()) {
               return false;
            } else if (!this.hasPointMin()) {
               return false;
            } else if (!this.hasPointMax()) {
               return false;
            } else {
               return this.hasFishSum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            FishInfo parsedMessage = null;

            try {
               parsedMessage = (FishInfo)SummerFestivalMsg.FishInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (FishInfo)e.getUnfinishedMessage();
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

         public boolean hasLengthMin() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLengthMin() {
            return this.lengthMin_;
         }

         public Builder setLengthMin(int value) {
            this.bitField0_ |= 2;
            this.lengthMin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLengthMin() {
            this.bitField0_ &= -3;
            this.lengthMin_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLengthMax() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLengthMax() {
            return this.lengthMax_;
         }

         public Builder setLengthMax(int value) {
            this.bitField0_ |= 4;
            this.lengthMax_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLengthMax() {
            this.bitField0_ &= -5;
            this.lengthMax_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPointMin() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPointMin() {
            return this.pointMin_;
         }

         public Builder setPointMin(int value) {
            this.bitField0_ |= 8;
            this.pointMin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPointMin() {
            this.bitField0_ &= -9;
            this.pointMin_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPointMax() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getPointMax() {
            return this.pointMax_;
         }

         public Builder setPointMax(int value) {
            this.bitField0_ |= 16;
            this.pointMax_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPointMax() {
            this.bitField0_ &= -17;
            this.pointMax_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFishSum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getFishSum() {
            return this.fishSum_;
         }

         public Builder setFishSum(int value) {
            this.bitField0_ |= 32;
            this.fishSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFishSum() {
            this.bitField0_ &= -33;
            this.fishSum_ = 0;
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

   public static final class C2S_ReceiveFishBook_28227 extends GeneratedMessageV3 implements C2S_ReceiveFishBook_28227OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveFishBook_28227 DEFAULT_INSTANCE = new C2S_ReceiveFishBook_28227();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveFishBook_28227> PARSER = new AbstractParser<C2S_ReceiveFishBook_28227>() {
         public C2S_ReceiveFishBook_28227 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveFishBook_28227(input, extensionRegistry);
         }
      };

      private C2S_ReceiveFishBook_28227(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveFishBook_28227() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveFishBook_28227();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveFishBook_28227(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveFishBook_28227_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveFishBook_28227_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveFishBook_28227.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveFishBook_28227)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveFishBook_28227 other = (C2S_ReceiveFishBook_28227)obj;
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

      public static C2S_ReceiveFishBook_28227 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFishBook_28227)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveFishBook_28227 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFishBook_28227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveFishBook_28227 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFishBook_28227)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveFishBook_28227 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFishBook_28227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveFishBook_28227 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFishBook_28227)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveFishBook_28227 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFishBook_28227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveFishBook_28227 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveFishBook_28227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveFishBook_28227 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveFishBook_28227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveFishBook_28227 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveFishBook_28227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveFishBook_28227 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveFishBook_28227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveFishBook_28227 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveFishBook_28227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveFishBook_28227 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveFishBook_28227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveFishBook_28227 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveFishBook_28227 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveFishBook_28227> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveFishBook_28227> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveFishBook_28227 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveFishBook_28227OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveFishBook_28227_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveFishBook_28227_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveFishBook_28227.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_ReceiveFishBook_28227.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveFishBook_28227_descriptor;
         }

         public C2S_ReceiveFishBook_28227 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_ReceiveFishBook_28227.getDefaultInstance();
         }

         public C2S_ReceiveFishBook_28227 build() {
            C2S_ReceiveFishBook_28227 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveFishBook_28227 buildPartial() {
            C2S_ReceiveFishBook_28227 result = new C2S_ReceiveFishBook_28227(this);
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
            if (other instanceof C2S_ReceiveFishBook_28227) {
               return this.mergeFrom((C2S_ReceiveFishBook_28227)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveFishBook_28227 other) {
            if (other == SummerFestivalMsg.C2S_ReceiveFishBook_28227.getDefaultInstance()) {
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
            C2S_ReceiveFishBook_28227 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveFishBook_28227)SummerFestivalMsg.C2S_ReceiveFishBook_28227.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveFishBook_28227)e.getUnfinishedMessage();
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

   public static final class S2C_ReceiveFishBook_28228 extends GeneratedMessageV3 implements S2C_ReceiveFishBook_28228OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECEIVEDAWARD_FIELD_NUMBER = 1;
      private Internal.IntList receivedAward_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveFishBook_28228 DEFAULT_INSTANCE = new S2C_ReceiveFishBook_28228();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveFishBook_28228> PARSER = new AbstractParser<S2C_ReceiveFishBook_28228>() {
         public S2C_ReceiveFishBook_28228 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveFishBook_28228(input, extensionRegistry);
         }
      };

      private S2C_ReceiveFishBook_28228(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveFishBook_28228() {
         this.memoizedIsInitialized = -1;
         this.receivedAward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveFishBook_28228();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveFishBook_28228(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.receivedAward_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.receivedAward_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receivedAward_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.receivedAward_.addInt(input.readInt32());
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
                  this.receivedAward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveFishBook_28228_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveFishBook_28228_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveFishBook_28228.class, Builder.class);
      }

      public List<Integer> getReceivedAwardList() {
         return this.receivedAward_;
      }

      public int getReceivedAwardCount() {
         return this.receivedAward_.size();
      }

      public int getReceivedAward(int index) {
         return this.receivedAward_.getInt(index);
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
         for(int i = 0; i < this.receivedAward_.size(); ++i) {
            output.writeInt32(1, this.receivedAward_.getInt(i));
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

            for(int i = 0; i < this.receivedAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receivedAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceivedAwardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveFishBook_28228)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveFishBook_28228 other = (S2C_ReceiveFishBook_28228)obj;
            if (!this.getReceivedAwardList().equals(other.getReceivedAwardList())) {
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
            if (this.getReceivedAwardCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReceivedAwardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveFishBook_28228 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveFishBook_28228)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveFishBook_28228 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveFishBook_28228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveFishBook_28228 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveFishBook_28228)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveFishBook_28228 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveFishBook_28228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveFishBook_28228 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveFishBook_28228)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveFishBook_28228 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveFishBook_28228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveFishBook_28228 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveFishBook_28228)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveFishBook_28228 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveFishBook_28228)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveFishBook_28228 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveFishBook_28228)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveFishBook_28228 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveFishBook_28228)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveFishBook_28228 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveFishBook_28228)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveFishBook_28228 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveFishBook_28228)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveFishBook_28228 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveFishBook_28228 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveFishBook_28228> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveFishBook_28228> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveFishBook_28228 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveFishBook_28228OrBuilder {
         private int bitField0_;
         private Internal.IntList receivedAward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveFishBook_28228_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveFishBook_28228_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveFishBook_28228.class, Builder.class);
         }

         private Builder() {
            this.receivedAward_ = SummerFestivalMsg.S2C_ReceiveFishBook_28228.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receivedAward_ = SummerFestivalMsg.S2C_ReceiveFishBook_28228.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_ReceiveFishBook_28228.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.receivedAward_ = SummerFestivalMsg.S2C_ReceiveFishBook_28228.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveFishBook_28228_descriptor;
         }

         public S2C_ReceiveFishBook_28228 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_ReceiveFishBook_28228.getDefaultInstance();
         }

         public S2C_ReceiveFishBook_28228 build() {
            S2C_ReceiveFishBook_28228 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveFishBook_28228 buildPartial() {
            S2C_ReceiveFishBook_28228 result = new S2C_ReceiveFishBook_28228(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.receivedAward_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.receivedAward_ = this.receivedAward_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_ReceiveFishBook_28228) {
               return this.mergeFrom((S2C_ReceiveFishBook_28228)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveFishBook_28228 other) {
            if (other == SummerFestivalMsg.S2C_ReceiveFishBook_28228.getDefaultInstance()) {
               return this;
            } else {
               if (!other.receivedAward_.isEmpty()) {
                  if (this.receivedAward_.isEmpty()) {
                     this.receivedAward_ = other.receivedAward_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureReceivedAwardIsMutable();
                     this.receivedAward_.addAll(other.receivedAward_);
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
            S2C_ReceiveFishBook_28228 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveFishBook_28228)SummerFestivalMsg.S2C_ReceiveFishBook_28228.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveFishBook_28228)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureReceivedAwardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.receivedAward_ = SummerFestivalMsg.S2C_ReceiveFishBook_28228.mutableCopy(this.receivedAward_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getReceivedAwardList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.receivedAward_) : this.receivedAward_);
         }

         public int getReceivedAwardCount() {
            return this.receivedAward_.size();
         }

         public int getReceivedAward(int index) {
            return this.receivedAward_.getInt(index);
         }

         public Builder setReceivedAward(int index, int value) {
            this.ensureReceivedAwardIsMutable();
            this.receivedAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceivedAward(int value) {
            this.ensureReceivedAwardIsMutable();
            this.receivedAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceivedAward(Iterable<? extends Integer> values) {
            this.ensureReceivedAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receivedAward_);
            this.onChanged();
            return this;
         }

         public Builder clearReceivedAward() {
            this.receivedAward_ = SummerFestivalMsg.S2C_ReceiveFishBook_28228.emptyIntList();
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

   public static final class C2S_ReceiveActivationAward_28229 extends GeneratedMessageV3 implements C2S_ReceiveActivationAward_28229OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveActivationAward_28229 DEFAULT_INSTANCE = new C2S_ReceiveActivationAward_28229();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveActivationAward_28229> PARSER = new AbstractParser<C2S_ReceiveActivationAward_28229>() {
         public C2S_ReceiveActivationAward_28229 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveActivationAward_28229(input, extensionRegistry);
         }
      };

      private C2S_ReceiveActivationAward_28229(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveActivationAward_28229() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveActivationAward_28229();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveActivationAward_28229(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveActivationAward_28229_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveActivationAward_28229_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveActivationAward_28229.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveActivationAward_28229)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveActivationAward_28229 other = (C2S_ReceiveActivationAward_28229)obj;
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

      public static C2S_ReceiveActivationAward_28229 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveActivationAward_28229)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveActivationAward_28229 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveActivationAward_28229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveActivationAward_28229 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveActivationAward_28229)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveActivationAward_28229 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveActivationAward_28229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveActivationAward_28229 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveActivationAward_28229)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveActivationAward_28229 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveActivationAward_28229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveActivationAward_28229 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveActivationAward_28229)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveActivationAward_28229 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveActivationAward_28229)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveActivationAward_28229 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveActivationAward_28229)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveActivationAward_28229 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveActivationAward_28229)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveActivationAward_28229 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveActivationAward_28229)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveActivationAward_28229 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveActivationAward_28229)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveActivationAward_28229 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveActivationAward_28229 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveActivationAward_28229> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveActivationAward_28229> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveActivationAward_28229 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveActivationAward_28229OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveActivationAward_28229_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveActivationAward_28229_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveActivationAward_28229.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_ReceiveActivationAward_28229.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_ReceiveActivationAward_28229_descriptor;
         }

         public C2S_ReceiveActivationAward_28229 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_ReceiveActivationAward_28229.getDefaultInstance();
         }

         public C2S_ReceiveActivationAward_28229 build() {
            C2S_ReceiveActivationAward_28229 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveActivationAward_28229 buildPartial() {
            C2S_ReceiveActivationAward_28229 result = new C2S_ReceiveActivationAward_28229(this);
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
            if (other instanceof C2S_ReceiveActivationAward_28229) {
               return this.mergeFrom((C2S_ReceiveActivationAward_28229)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveActivationAward_28229 other) {
            if (other == SummerFestivalMsg.C2S_ReceiveActivationAward_28229.getDefaultInstance()) {
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
            C2S_ReceiveActivationAward_28229 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveActivationAward_28229)SummerFestivalMsg.C2S_ReceiveActivationAward_28229.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveActivationAward_28229)e.getUnfinishedMessage();
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

   public static final class S2C_ReceiveActivationAward_28230 extends GeneratedMessageV3 implements S2C_ReceiveActivationAward_28230OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ACTIVATIONAWARD_FIELD_NUMBER = 6;
      private Internal.IntList activationAward_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveActivationAward_28230 DEFAULT_INSTANCE = new S2C_ReceiveActivationAward_28230();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveActivationAward_28230> PARSER = new AbstractParser<S2C_ReceiveActivationAward_28230>() {
         public S2C_ReceiveActivationAward_28230 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveActivationAward_28230(input, extensionRegistry);
         }
      };

      private S2C_ReceiveActivationAward_28230(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveActivationAward_28230() {
         this.memoizedIsInitialized = -1;
         this.activationAward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveActivationAward_28230();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveActivationAward_28230(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 48:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.activationAward_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.activationAward_.addInt(input.readInt32());
                        break;
                     case 50:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.activationAward_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.activationAward_.addInt(input.readInt32());
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
                  this.activationAward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveActivationAward_28230_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveActivationAward_28230_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveActivationAward_28230.class, Builder.class);
      }

      public List<Integer> getActivationAwardList() {
         return this.activationAward_;
      }

      public int getActivationAwardCount() {
         return this.activationAward_.size();
      }

      public int getActivationAward(int index) {
         return this.activationAward_.getInt(index);
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
         for(int i = 0; i < this.activationAward_.size(); ++i) {
            output.writeInt32(6, this.activationAward_.getInt(i));
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

            for(int i = 0; i < this.activationAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.activationAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getActivationAwardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveActivationAward_28230)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveActivationAward_28230 other = (S2C_ReceiveActivationAward_28230)obj;
            if (!this.getActivationAwardList().equals(other.getActivationAwardList())) {
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
            if (this.getActivationAwardCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getActivationAwardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveActivationAward_28230 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveActivationAward_28230)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveActivationAward_28230 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveActivationAward_28230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveActivationAward_28230 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveActivationAward_28230)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveActivationAward_28230 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveActivationAward_28230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveActivationAward_28230 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveActivationAward_28230)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveActivationAward_28230 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveActivationAward_28230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveActivationAward_28230 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveActivationAward_28230)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveActivationAward_28230 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveActivationAward_28230)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveActivationAward_28230 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveActivationAward_28230)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveActivationAward_28230 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveActivationAward_28230)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveActivationAward_28230 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveActivationAward_28230)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveActivationAward_28230 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveActivationAward_28230)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveActivationAward_28230 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveActivationAward_28230 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveActivationAward_28230> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveActivationAward_28230> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveActivationAward_28230 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveActivationAward_28230OrBuilder {
         private int bitField0_;
         private Internal.IntList activationAward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveActivationAward_28230_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveActivationAward_28230_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveActivationAward_28230.class, Builder.class);
         }

         private Builder() {
            this.activationAward_ = SummerFestivalMsg.S2C_ReceiveActivationAward_28230.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.activationAward_ = SummerFestivalMsg.S2C_ReceiveActivationAward_28230.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_ReceiveActivationAward_28230.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activationAward_ = SummerFestivalMsg.S2C_ReceiveActivationAward_28230.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_ReceiveActivationAward_28230_descriptor;
         }

         public S2C_ReceiveActivationAward_28230 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_ReceiveActivationAward_28230.getDefaultInstance();
         }

         public S2C_ReceiveActivationAward_28230 build() {
            S2C_ReceiveActivationAward_28230 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveActivationAward_28230 buildPartial() {
            S2C_ReceiveActivationAward_28230 result = new S2C_ReceiveActivationAward_28230(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.activationAward_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.activationAward_ = this.activationAward_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_ReceiveActivationAward_28230) {
               return this.mergeFrom((S2C_ReceiveActivationAward_28230)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveActivationAward_28230 other) {
            if (other == SummerFestivalMsg.S2C_ReceiveActivationAward_28230.getDefaultInstance()) {
               return this;
            } else {
               if (!other.activationAward_.isEmpty()) {
                  if (this.activationAward_.isEmpty()) {
                     this.activationAward_ = other.activationAward_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureActivationAwardIsMutable();
                     this.activationAward_.addAll(other.activationAward_);
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
            S2C_ReceiveActivationAward_28230 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveActivationAward_28230)SummerFestivalMsg.S2C_ReceiveActivationAward_28230.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveActivationAward_28230)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureActivationAwardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.activationAward_ = SummerFestivalMsg.S2C_ReceiveActivationAward_28230.mutableCopy(this.activationAward_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getActivationAwardList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.activationAward_) : this.activationAward_);
         }

         public int getActivationAwardCount() {
            return this.activationAward_.size();
         }

         public int getActivationAward(int index) {
            return this.activationAward_.getInt(index);
         }

         public Builder setActivationAward(int index, int value) {
            this.ensureActivationAwardIsMutable();
            this.activationAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addActivationAward(int value) {
            this.ensureActivationAwardIsMutable();
            this.activationAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllActivationAward(Iterable<? extends Integer> values) {
            this.ensureActivationAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.activationAward_);
            this.onChanged();
            return this;
         }

         public Builder clearActivationAward() {
            this.activationAward_ = SummerFestivalMsg.S2C_ReceiveActivationAward_28230.emptyIntList();
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

   public static final class C2S_FishingEnd_28231 extends GeneratedMessageV3 implements C2S_FishingEnd_28231OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int AREASUCCESS_FIELD_NUMBER = 2;
      private boolean areaSuccess_;
      private byte memoizedIsInitialized;
      private static final C2S_FishingEnd_28231 DEFAULT_INSTANCE = new C2S_FishingEnd_28231();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FishingEnd_28231> PARSER = new AbstractParser<C2S_FishingEnd_28231>() {
         public C2S_FishingEnd_28231 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FishingEnd_28231(input, extensionRegistry);
         }
      };

      private C2S_FishingEnd_28231(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FishingEnd_28231() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FishingEnd_28231();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FishingEnd_28231(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.areaSuccess_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingEnd_28231_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingEnd_28231_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FishingEnd_28231.class, Builder.class);
      }

      public boolean hasAreaSuccess() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getAreaSuccess() {
         return this.areaSuccess_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAreaSuccess()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(2, this.areaSuccess_);
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
               size += CodedOutputStream.computeBoolSize(2, this.areaSuccess_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FishingEnd_28231)) {
            return super.equals(obj);
         } else {
            C2S_FishingEnd_28231 other = (C2S_FishingEnd_28231)obj;
            if (this.hasAreaSuccess() != other.hasAreaSuccess()) {
               return false;
            } else if (this.hasAreaSuccess() && this.getAreaSuccess() != other.getAreaSuccess()) {
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
            if (this.hasAreaSuccess()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getAreaSuccess());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FishingEnd_28231 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FishingEnd_28231)PARSER.parseFrom(data);
      }

      public static C2S_FishingEnd_28231 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FishingEnd_28231)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FishingEnd_28231 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FishingEnd_28231)PARSER.parseFrom(data);
      }

      public static C2S_FishingEnd_28231 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FishingEnd_28231)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FishingEnd_28231 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FishingEnd_28231)PARSER.parseFrom(data);
      }

      public static C2S_FishingEnd_28231 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FishingEnd_28231)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FishingEnd_28231 parseFrom(InputStream input) throws IOException {
         return (C2S_FishingEnd_28231)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FishingEnd_28231 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FishingEnd_28231)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FishingEnd_28231 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FishingEnd_28231)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FishingEnd_28231 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FishingEnd_28231)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FishingEnd_28231 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FishingEnd_28231)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FishingEnd_28231 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FishingEnd_28231)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FishingEnd_28231 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FishingEnd_28231 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FishingEnd_28231> parser() {
         return PARSER;
      }

      public Parser<C2S_FishingEnd_28231> getParserForType() {
         return PARSER;
      }

      public C2S_FishingEnd_28231 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FishingEnd_28231OrBuilder {
         private int bitField0_;
         private boolean areaSuccess_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingEnd_28231_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingEnd_28231_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FishingEnd_28231.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.C2S_FishingEnd_28231.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.areaSuccess_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_C2S_FishingEnd_28231_descriptor;
         }

         public C2S_FishingEnd_28231 getDefaultInstanceForType() {
            return SummerFestivalMsg.C2S_FishingEnd_28231.getDefaultInstance();
         }

         public C2S_FishingEnd_28231 build() {
            C2S_FishingEnd_28231 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FishingEnd_28231 buildPartial() {
            C2S_FishingEnd_28231 result = new C2S_FishingEnd_28231(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.areaSuccess_ = this.areaSuccess_;
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
            if (other instanceof C2S_FishingEnd_28231) {
               return this.mergeFrom((C2S_FishingEnd_28231)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FishingEnd_28231 other) {
            if (other == SummerFestivalMsg.C2S_FishingEnd_28231.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAreaSuccess()) {
                  this.setAreaSuccess(other.getAreaSuccess());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasAreaSuccess();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FishingEnd_28231 parsedMessage = null;

            try {
               parsedMessage = (C2S_FishingEnd_28231)SummerFestivalMsg.C2S_FishingEnd_28231.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FishingEnd_28231)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAreaSuccess() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getAreaSuccess() {
            return this.areaSuccess_;
         }

         public Builder setAreaSuccess(boolean value) {
            this.bitField0_ |= 1;
            this.areaSuccess_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAreaSuccess() {
            this.bitField0_ &= -2;
            this.areaSuccess_ = false;
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

   public static final class S2C_FishingEnd_28232 extends GeneratedMessageV3 implements S2C_FishingEnd_28232OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FISHID_FIELD_NUMBER = 1;
      private int fishId_;
      public static final int LENGTH_FIELD_NUMBER = 2;
      private int length_;
      public static final int POINT_FIELD_NUMBER = 3;
      private int point_;
      public static final int FISHINGPOINTSUM_FIELD_NUMBER = 4;
      private int fishingPointSum_;
      public static final int FISHINFO_FIELD_NUMBER = 5;
      private FishInfo fishInfo_;
      public static final int ITEMINFO_FIELD_NUMBER = 6;
      private List<CommonMsg.ItemInfo> itemInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_FishingEnd_28232 DEFAULT_INSTANCE = new S2C_FishingEnd_28232();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FishingEnd_28232> PARSER = new AbstractParser<S2C_FishingEnd_28232>() {
         public S2C_FishingEnd_28232 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FishingEnd_28232(input, extensionRegistry);
         }
      };

      private S2C_FishingEnd_28232(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FishingEnd_28232() {
         this.memoizedIsInitialized = -1;
         this.itemInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FishingEnd_28232();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FishingEnd_28232(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fishId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.length_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.point_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.fishingPointSum_ = input.readInt32();
                        break;
                     case 42:
                        FishInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 16) != 0) {
                           subBuilder = this.fishInfo_.toBuilder();
                        }

                        this.fishInfo_ = (FishInfo)input.readMessage(SummerFestivalMsg.FishInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.fishInfo_);
                           this.fishInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 16;
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.itemInfo_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.itemInfo_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 32) != 0) {
                  this.itemInfo_ = Collections.unmodifiableList(this.itemInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingEnd_28232_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingEnd_28232_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FishingEnd_28232.class, Builder.class);
      }

      public boolean hasFishId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFishId() {
         return this.fishId_;
      }

      public boolean hasLength() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLength() {
         return this.length_;
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public boolean hasFishingPointSum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFishingPointSum() {
         return this.fishingPointSum_;
      }

      public boolean hasFishInfo() {
         return (this.bitField0_ & 16) != 0;
      }

      public FishInfo getFishInfo() {
         return this.fishInfo_ == null ? SummerFestivalMsg.FishInfo.getDefaultInstance() : this.fishInfo_;
      }

      public FishInfoOrBuilder getFishInfoOrBuilder() {
         return this.fishInfo_ == null ? SummerFestivalMsg.FishInfo.getDefaultInstance() : this.fishInfo_;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFishId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLength()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFishingPointSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFishInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getFishInfo().isInitialized()) {
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
            output.writeInt32(1, this.fishId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.length_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.point_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.fishingPointSum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeMessage(5, this.getFishInfo());
         }

         for(int i = 0; i < this.itemInfo_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.itemInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.fishId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.length_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.point_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.fishingPointSum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeMessageSize(5, this.getFishInfo());
            }

            for(int i = 0; i < this.itemInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.itemInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FishingEnd_28232)) {
            return super.equals(obj);
         } else {
            S2C_FishingEnd_28232 other = (S2C_FishingEnd_28232)obj;
            if (this.hasFishId() != other.hasFishId()) {
               return false;
            } else if (this.hasFishId() && this.getFishId() != other.getFishId()) {
               return false;
            } else if (this.hasLength() != other.hasLength()) {
               return false;
            } else if (this.hasLength() && this.getLength() != other.getLength()) {
               return false;
            } else if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
               return false;
            } else if (this.hasFishingPointSum() != other.hasFishingPointSum()) {
               return false;
            } else if (this.hasFishingPointSum() && this.getFishingPointSum() != other.getFishingPointSum()) {
               return false;
            } else if (this.hasFishInfo() != other.hasFishInfo()) {
               return false;
            } else if (this.hasFishInfo() && !this.getFishInfo().equals(other.getFishInfo())) {
               return false;
            } else if (!this.getItemInfoList().equals(other.getItemInfoList())) {
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
            if (this.hasFishId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFishId();
            }

            if (this.hasLength()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLength();
            }

            if (this.hasPoint()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPoint();
            }

            if (this.hasFishingPointSum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getFishingPointSum();
            }

            if (this.hasFishInfo()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getFishInfo().hashCode();
            }

            if (this.getItemInfoCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getItemInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FishingEnd_28232 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FishingEnd_28232)PARSER.parseFrom(data);
      }

      public static S2C_FishingEnd_28232 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FishingEnd_28232)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FishingEnd_28232 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FishingEnd_28232)PARSER.parseFrom(data);
      }

      public static S2C_FishingEnd_28232 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FishingEnd_28232)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FishingEnd_28232 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FishingEnd_28232)PARSER.parseFrom(data);
      }

      public static S2C_FishingEnd_28232 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FishingEnd_28232)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FishingEnd_28232 parseFrom(InputStream input) throws IOException {
         return (S2C_FishingEnd_28232)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FishingEnd_28232 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FishingEnd_28232)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FishingEnd_28232 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FishingEnd_28232)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FishingEnd_28232 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FishingEnd_28232)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FishingEnd_28232 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FishingEnd_28232)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FishingEnd_28232 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FishingEnd_28232)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FishingEnd_28232 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FishingEnd_28232 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FishingEnd_28232> parser() {
         return PARSER;
      }

      public Parser<S2C_FishingEnd_28232> getParserForType() {
         return PARSER;
      }

      public S2C_FishingEnd_28232 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FishingEnd_28232OrBuilder {
         private int bitField0_;
         private int fishId_;
         private int length_;
         private int point_;
         private int fishingPointSum_;
         private FishInfo fishInfo_;
         private SingleFieldBuilderV3<FishInfo, FishInfo.Builder, FishInfoOrBuilder> fishInfoBuilder_;
         private List<CommonMsg.ItemInfo> itemInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingEnd_28232_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingEnd_28232_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FishingEnd_28232.class, Builder.class);
         }

         private Builder() {
            this.itemInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SummerFestivalMsg.S2C_FishingEnd_28232.alwaysUseFieldBuilders) {
               this.getFishInfoFieldBuilder();
               this.getItemInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.fishId_ = 0;
            this.bitField0_ &= -2;
            this.length_ = 0;
            this.bitField0_ &= -3;
            this.point_ = 0;
            this.bitField0_ &= -5;
            this.fishingPointSum_ = 0;
            this.bitField0_ &= -9;
            if (this.fishInfoBuilder_ == null) {
               this.fishInfo_ = null;
            } else {
               this.fishInfoBuilder_.clear();
            }

            this.bitField0_ &= -17;
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.itemInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SummerFestivalMsg.internal_static_summerFestival_com_gzbz_protobuf_S2C_FishingEnd_28232_descriptor;
         }

         public S2C_FishingEnd_28232 getDefaultInstanceForType() {
            return SummerFestivalMsg.S2C_FishingEnd_28232.getDefaultInstance();
         }

         public S2C_FishingEnd_28232 build() {
            S2C_FishingEnd_28232 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FishingEnd_28232 buildPartial() {
            S2C_FishingEnd_28232 result = new S2C_FishingEnd_28232(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fishId_ = this.fishId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.length_ = this.length_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.point_ = this.point_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.fishingPointSum_ = this.fishingPointSum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               if (this.fishInfoBuilder_ == null) {
                  result.fishInfo_ = this.fishInfo_;
               } else {
                  result.fishInfo_ = (FishInfo)this.fishInfoBuilder_.build();
               }

               to_bitField0_ |= 16;
            }

            if (this.itemInfoBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.itemInfo_ = Collections.unmodifiableList(this.itemInfo_);
                  this.bitField0_ &= -33;
               }

               result.itemInfo_ = this.itemInfo_;
            } else {
               result.itemInfo_ = this.itemInfoBuilder_.build();
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
            if (other instanceof S2C_FishingEnd_28232) {
               return this.mergeFrom((S2C_FishingEnd_28232)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FishingEnd_28232 other) {
            if (other == SummerFestivalMsg.S2C_FishingEnd_28232.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFishId()) {
                  this.setFishId(other.getFishId());
               }

               if (other.hasLength()) {
                  this.setLength(other.getLength());
               }

               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
               }

               if (other.hasFishingPointSum()) {
                  this.setFishingPointSum(other.getFishingPointSum());
               }

               if (other.hasFishInfo()) {
                  this.mergeFishInfo(other.getFishInfo());
               }

               if (this.itemInfoBuilder_ == null) {
                  if (!other.itemInfo_.isEmpty()) {
                     if (this.itemInfo_.isEmpty()) {
                        this.itemInfo_ = other.itemInfo_;
                        this.bitField0_ &= -33;
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
                     this.bitField0_ &= -33;
                     this.itemInfoBuilder_ = SummerFestivalMsg.S2C_FishingEnd_28232.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
                  } else {
                     this.itemInfoBuilder_.addAllMessages(other.itemInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFishId()) {
               return false;
            } else if (!this.hasLength()) {
               return false;
            } else if (!this.hasPoint()) {
               return false;
            } else if (!this.hasFishingPointSum()) {
               return false;
            } else if (!this.hasFishInfo()) {
               return false;
            } else if (!this.getFishInfo().isInitialized()) {
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
            S2C_FishingEnd_28232 parsedMessage = null;

            try {
               parsedMessage = (S2C_FishingEnd_28232)SummerFestivalMsg.S2C_FishingEnd_28232.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FishingEnd_28232)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFishId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFishId() {
            return this.fishId_;
         }

         public Builder setFishId(int value) {
            this.bitField0_ |= 1;
            this.fishId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFishId() {
            this.bitField0_ &= -2;
            this.fishId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLength() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLength() {
            return this.length_;
         }

         public Builder setLength(int value) {
            this.bitField0_ |= 2;
            this.length_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLength() {
            this.bitField0_ &= -3;
            this.length_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPoint() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPoint() {
            return this.point_;
         }

         public Builder setPoint(int value) {
            this.bitField0_ |= 4;
            this.point_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoint() {
            this.bitField0_ &= -5;
            this.point_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFishingPointSum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getFishingPointSum() {
            return this.fishingPointSum_;
         }

         public Builder setFishingPointSum(int value) {
            this.bitField0_ |= 8;
            this.fishingPointSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFishingPointSum() {
            this.bitField0_ &= -9;
            this.fishingPointSum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFishInfo() {
            return (this.bitField0_ & 16) != 0;
         }

         public FishInfo getFishInfo() {
            if (this.fishInfoBuilder_ == null) {
               return this.fishInfo_ == null ? SummerFestivalMsg.FishInfo.getDefaultInstance() : this.fishInfo_;
            } else {
               return (FishInfo)this.fishInfoBuilder_.getMessage();
            }
         }

         public Builder setFishInfo(FishInfo value) {
            if (this.fishInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.fishInfo_ = value;
               this.onChanged();
            } else {
               this.fishInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder setFishInfo(FishInfo.Builder builderForValue) {
            if (this.fishInfoBuilder_ == null) {
               this.fishInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.fishInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder mergeFishInfo(FishInfo value) {
            if (this.fishInfoBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.fishInfo_ != null && this.fishInfo_ != SummerFestivalMsg.FishInfo.getDefaultInstance()) {
                  this.fishInfo_ = SummerFestivalMsg.FishInfo.newBuilder(this.fishInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.fishInfo_ = value;
               }

               this.onChanged();
            } else {
               this.fishInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder clearFishInfo() {
            if (this.fishInfoBuilder_ == null) {
               this.fishInfo_ = null;
               this.onChanged();
            } else {
               this.fishInfoBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public FishInfo.Builder getFishInfoBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return (FishInfo.Builder)this.getFishInfoFieldBuilder().getBuilder();
         }

         public FishInfoOrBuilder getFishInfoOrBuilder() {
            if (this.fishInfoBuilder_ != null) {
               return (FishInfoOrBuilder)this.fishInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.fishInfo_ == null ? SummerFestivalMsg.FishInfo.getDefaultInstance() : this.fishInfo_;
            }
         }

         private SingleFieldBuilderV3<FishInfo, FishInfo.Builder, FishInfoOrBuilder> getFishInfoFieldBuilder() {
            if (this.fishInfoBuilder_ == null) {
               this.fishInfoBuilder_ = new SingleFieldBuilderV3(this.getFishInfo(), this.getParentForChildren(), this.isClean());
               this.fishInfo_ = null;
            }

            return this.fishInfoBuilder_;
         }

         private void ensureItemInfoIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.itemInfo_ = new ArrayList(this.itemInfo_);
               this.bitField0_ |= 32;
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
               this.bitField0_ &= -33;
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
               this.itemInfoBuilder_ = new RepeatedFieldBuilderV3(this.itemInfo_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.itemInfo_ = null;
            }

            return this.itemInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_ActivityInfo_28201OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BuyFishingTimes_28225OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawRecord_28217OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Draw_28213OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_FancyReward_28209OrBuilder extends MessageOrBuilder {
      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_FishingBegin_28223OrBuilder extends MessageOrBuilder {
      boolean hasLength();

      FishLength getLength();
   }

   public interface C2S_FishingEnd_28231OrBuilder extends MessageOrBuilder {
      boolean hasAreaSuccess();

      boolean getAreaSuccess();
   }

   public interface C2S_FishingGameInfo_28221OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LuckDrawInfo_28211OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenReward_28215OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ReceiveActivationAward_28229OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ReceiveFishBook_28227OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ReceiveShopAddUpReward_28205OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ServerDrawRecord_28219OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShopAddUpInfo_28203OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SignTotalInfo_28206OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Sign_28208OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface FishInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasLengthMin();

      int getLengthMin();

      boolean hasLengthMax();

      int getLengthMax();

      boolean hasPointMin();

      int getPointMin();

      boolean hasPointMax();

      int getPointMax();

      boolean hasFishSum();

      int getFishSum();
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

   public interface S2C_ActivityInfo_28202OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      boolean hasActivityDay();

      int getActivityDay();
   }

   public interface S2C_BuyFishingTimes_28226OrBuilder extends MessageOrBuilder {
      boolean hasBuyFishingTimes();

      int getBuyFishingTimes();
   }

   public interface S2C_DrawRecord_28218OrBuilder extends MessageOrBuilder {
      List<MyDrawRecord> getMyRecordList();

      MyDrawRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList();

      MyDrawRecordOrBuilder getMyRecordOrBuilder(int index);
   }

   public interface S2C_Draw_28214OrBuilder extends MessageOrBuilder {
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

   public interface S2C_FancyReward_28210OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface S2C_FishingBegin_28224OrBuilder extends MessageOrBuilder {
      boolean hasFishId();

      int getFishId();
   }

   public interface S2C_FishingEnd_28232OrBuilder extends MessageOrBuilder {
      boolean hasFishId();

      int getFishId();

      boolean hasLength();

      int getLength();

      boolean hasPoint();

      int getPoint();

      boolean hasFishingPointSum();

      int getFishingPointSum();

      boolean hasFishInfo();

      FishInfo getFishInfo();

      FishInfoOrBuilder getFishInfoOrBuilder();

      List<CommonMsg.ItemInfo> getItemInfoList();

      CommonMsg.ItemInfo getItemInfo(int index);

      int getItemInfoCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfoOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemInfoOrBuilder(int index);
   }

   public interface S2C_FishingGameInfo_28222OrBuilder extends MessageOrBuilder {
      boolean hasBuyFishingTimes();

      int getBuyFishingTimes();

      List<FishInfo> getFishInfoList();

      FishInfo getFishInfo(int index);

      int getFishInfoCount();

      List<? extends FishInfoOrBuilder> getFishInfoOrBuilderList();

      FishInfoOrBuilder getFishInfoOrBuilder(int index);

      List<Integer> getReceivedAwardList();

      int getReceivedAwardCount();

      int getReceivedAward(int index);

      boolean hasFishingPointSum();

      int getFishingPointSum();

      List<Integer> getActivationAwardList();

      int getActivationAwardCount();

      int getActivationAward(int index);
   }

   public interface S2C_LuckDrawInfo_28212OrBuilder extends MessageOrBuilder {
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

      boolean hasOpenDay();

      int getOpenDay();
   }

   public interface S2C_OpenReward_28216OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_ReceiveActivationAward_28230OrBuilder extends MessageOrBuilder {
      List<Integer> getActivationAwardList();

      int getActivationAwardCount();

      int getActivationAward(int index);
   }

   public interface S2C_ReceiveFishBook_28228OrBuilder extends MessageOrBuilder {
      List<Integer> getReceivedAwardList();

      int getReceivedAwardCount();

      int getReceivedAward(int index);
   }

   public interface S2C_ServerDrawRecord_28220OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_ShopAddUpInfo_28204OrBuilder extends MessageOrBuilder {
      boolean hasDailyRecharge();

      int getDailyRecharge();

      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);
   }

   public interface S2C_SignTotalInfo_28207OrBuilder extends MessageOrBuilder {
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
