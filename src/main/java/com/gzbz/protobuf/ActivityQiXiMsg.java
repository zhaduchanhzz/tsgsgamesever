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

public final class ActivityQiXiMsg {
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_ActivityInfo_21001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_ActivityInfo_21001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_ActivityInfo_21002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_ActivityInfo_21002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_ShopAddUpInfo_21003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_ShopAddUpInfo_21003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_ShopAddUpInfo_21004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_ShopAddUpInfo_21004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_SignTotalInfo_21006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_SignTotalInfo_21006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_SignTotalInfo_21007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_SignTotalInfo_21007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_Sign_21008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_Sign_21008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_MusicData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_MusicData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrumInfo_21009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrumInfo_21009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrumInfo_21010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrumInfo_21010_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrum_21011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrum_21011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrum_21012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrum_21012_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_FancyReward_21013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_FancyReward_21013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_FancyReward_21014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_FancyReward_21014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_LuckDrawInfo_21015_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_LuckDrawInfo_21015_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_LuckDrawInfo_21016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_LuckDrawInfo_21016_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_Draw_21017_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_Draw_21017_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_Draw_21018_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_Draw_21018_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_OpenReward_21019_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_OpenReward_21019_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_OpenReward_21020_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_OpenReward_21020_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrawRecord_21021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrawRecord_21021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrawRecord_21022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrawRecord_21022_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_ServerDrawRecord_21023_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_ServerDrawRecord_21023_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_ServerDrawRecord_21024_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_ServerDrawRecord_21024_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_MyDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrumLevelReward_21025_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrumLevelReward_21025_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrumLevelReward_21026_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrumLevelReward_21026_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivityQiXiMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012ActivityQiXi.proto\u0012\u001eactivityQiXi.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0018\n\u0016C2S_ActivityInfo_21001\">\n\u0016S2C_ActivityInfo_21002\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\u0002 \u0002(\u0005\"\u0019\n\u0017C2S_ShopAddUpInfo_21003\"D\n\u0017S2C_ShopAddUpInfo_21004\u0012\u0015\n\rdailyRecharge\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRewards\u0018\u0002 \u0003(\u0005\".\n C2S_ReceiveShopAddUpReward_21005\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_SignTotalInfo_21006\"F\n\u0017S2C_SignTotalInfo_21007\u0012\u0013\n\u000bactivityDay\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esignGotRewards\u0018\u0002 \u0003(\u0005\"\u001d\n\u000eC2S_Sign_21008\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\"=\n\tMusicData\u0012\u000f\n\u0007musicId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btopScore\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005gotId\u0018\u0003 \u0003(\u0005\"\u0018\n\u0016C2S_BeatDrumInfo_21009\"\u008c\u0001\n\u0016S2C_BeatDrumInfo_21010\u0012\u0011\n\tbeatCount\u0018\u0001 \u0002(\u0005\u0012<\n\tmusicData\u0018\u0002 \u0003(\u000b2).activityQiXi.com.gzbz.protobuf.MusicData\u0012\u0012\n\ntotalScore\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005isRed\u0018\u0004 \u0002(\b\"4\n\u0012C2S_BeatDrum_21011\u0012\u000f\n\u0007musicId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0002 \u0002(\u0005\"l\n\u0012S2C_BeatDrum_21012\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007musicId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tbeatCount\u0018\u0003 \u0002(\u0005\u0012\u0010\n\btopScore\u0018\u0004 \u0001(\u0005\u0012\u0010\n\bgotScore\u0018\u0005 \u0003(\u0005\")\n\u0015C2S_FancyReward_21013\u0012\u0010\n\btargetId\u0018\u0001 \u0002(\u0005\"9\n\u0015S2C_FancyReward_21014\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_LuckDrawInfo_21015\"×\u0001\n\u0016S2C_LuckDrawInfo_21016\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bhadRewardId\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bstagEndTime\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0014\n\flotteryStage\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007fancyId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\u001e\n\u000eC2S_Draw_21017\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u00ad\u0001\n\u000eS2C_Draw_21018\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bisHaveFancy\u0018\u0006 \u0001(\b\u0012\u0010\n\btargetId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\"\n\u0014C2S_OpenReward_21019\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_OpenReward_21020\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_DrawRecord_21021\"V\n\u0014S2C_DrawRecord_21022\u0012>\n\bmyRecord\u0018\u0001 \u0003(\u000b2,.activityQiXi.com.gzbz.protobuf.MyDrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_21023\"d\n\u001aS2C_ServerDrawRecord_21024\u0012F\n\fserverRecord\u0018\u0001 \u0003(\u000b20.activityQiXi.com.gzbz.protobuf.ServerDrawRecord\"Z\n\fMyDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"r\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0005 \u0001(\u0005\"*\n\u0019C2S_DrumLevelReward_21025\u0012\r\n\u0005gotId\u0018\u0001 \u0002(\u0005\"*\n\u0019S2C_DrumLevelReward_21026\u0012\r\n\u0005gotId\u0018\u0001 \u0002(\u0005B&\n\u0011com.gzbz.protobufB\u000fActivityQiXiMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_ActivityInfo_21001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_ActivityInfo_21001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_ActivityInfo_21001_descriptor, new String[0]);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_ActivityInfo_21002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_ActivityInfo_21002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_ActivityInfo_21002_descriptor, new String[]{"OpenDay", "ActivityDay"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_ShopAddUpInfo_21003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_ShopAddUpInfo_21003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_ShopAddUpInfo_21003_descriptor, new String[0]);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_ShopAddUpInfo_21004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_ShopAddUpInfo_21004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_ShopAddUpInfo_21004_descriptor, new String[]{"DailyRecharge", "GotRewards"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21005_descriptor, new String[]{"Id"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_SignTotalInfo_21006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_SignTotalInfo_21006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_SignTotalInfo_21006_descriptor, new String[0]);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_SignTotalInfo_21007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_SignTotalInfo_21007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_SignTotalInfo_21007_descriptor, new String[]{"ActivityDay", "SignGotRewards"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_Sign_21008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_Sign_21008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_Sign_21008_descriptor, new String[]{"Day"});
      internal_static_activityQiXi_com_gzbz_protobuf_MusicData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_activityQiXi_com_gzbz_protobuf_MusicData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_MusicData_descriptor, new String[]{"MusicId", "TopScore", "GotId"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrumInfo_21009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrumInfo_21009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrumInfo_21009_descriptor, new String[0]);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrumInfo_21010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrumInfo_21010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrumInfo_21010_descriptor, new String[]{"BeatCount", "MusicData", "TotalScore", "IsRed"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrum_21011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrum_21011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrum_21011_descriptor, new String[]{"MusicId", "Score"});
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrum_21012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrum_21012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrum_21012_descriptor, new String[]{"Result", "MusicId", "BeatCount", "TopScore", "GotScore"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_FancyReward_21013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_FancyReward_21013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_FancyReward_21013_descriptor, new String[]{"TargetId"});
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_FancyReward_21014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_FancyReward_21014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_FancyReward_21014_descriptor, new String[]{"Result", "TargetId"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_LuckDrawInfo_21015_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_LuckDrawInfo_21015_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_LuckDrawInfo_21015_descriptor, new String[0]);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_LuckDrawInfo_21016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_LuckDrawInfo_21016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_LuckDrawInfo_21016_descriptor, new String[]{"DrawTimes", "HadRewardId", "StagEndTime", "RecruitNum", "SeniorRewards", "LotteryStage", "FancyId", "FancyGroupDrawTimes"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_Draw_21017_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_Draw_21017_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_Draw_21017_descriptor, new String[]{"Type"});
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_Draw_21018_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_Draw_21018_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_Draw_21018_descriptor, new String[]{"DrawTimes", "Id", "RecruitNum", "SeniorNum", "IsHaveFancy", "TargetId", "FancyGroupDrawTimes"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_OpenReward_21019_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_OpenReward_21019_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_OpenReward_21019_descriptor, new String[]{"Id"});
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_OpenReward_21020_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_OpenReward_21020_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_OpenReward_21020_descriptor, new String[]{"Id"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrawRecord_21021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrawRecord_21021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrawRecord_21021_descriptor, new String[0]);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrawRecord_21022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrawRecord_21022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrawRecord_21022_descriptor, new String[]{"MyRecord"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_ServerDrawRecord_21023_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_ServerDrawRecord_21023_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_ServerDrawRecord_21023_descriptor, new String[0]);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_ServerDrawRecord_21024_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_ServerDrawRecord_21024_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_ServerDrawRecord_21024_descriptor, new String[]{"ServerRecord"});
      internal_static_activityQiXi_com_gzbz_protobuf_MyDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_activityQiXi_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_MyDrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_activityQiXi_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_activityQiXi_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId", "Stage"});
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrumLevelReward_21025_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrumLevelReward_21025_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrumLevelReward_21025_descriptor, new String[]{"GotId"});
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrumLevelReward_21026_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrumLevelReward_21026_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrumLevelReward_21026_descriptor, new String[]{"GotId"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_21001 extends GeneratedMessageV3 implements C2S_ActivityInfo_21001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_21001 DEFAULT_INSTANCE = new C2S_ActivityInfo_21001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_21001> PARSER = new AbstractParser<C2S_ActivityInfo_21001>() {
         public C2S_ActivityInfo_21001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_21001(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_21001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_21001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_21001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_21001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ActivityInfo_21001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ActivityInfo_21001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_21001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_21001)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_21001 other = (C2S_ActivityInfo_21001)obj;
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

      public static C2S_ActivityInfo_21001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21001)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_21001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_21001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21001)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_21001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_21001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21001)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_21001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_21001 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_21001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_21001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_21001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_21001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_21001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_21001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_21001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_21001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_21001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_21001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_21001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_21001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_21001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_21001> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_21001> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_21001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_21001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ActivityInfo_21001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ActivityInfo_21001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_21001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_ActivityInfo_21001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ActivityInfo_21001_descriptor;
         }

         public C2S_ActivityInfo_21001 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_ActivityInfo_21001.getDefaultInstance();
         }

         public C2S_ActivityInfo_21001 build() {
            C2S_ActivityInfo_21001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_21001 buildPartial() {
            C2S_ActivityInfo_21001 result = new C2S_ActivityInfo_21001(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ActivityInfo_21001) {
               return this.mergeFrom((C2S_ActivityInfo_21001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_21001 other) {
            if (other == ActivityQiXiMsg.C2S_ActivityInfo_21001.getDefaultInstance()) {
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
            C2S_ActivityInfo_21001 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_21001)ActivityQiXiMsg.C2S_ActivityInfo_21001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_21001)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_21002 extends GeneratedMessageV3 implements S2C_ActivityInfo_21002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 2;
      private int activityDay_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_21002 DEFAULT_INSTANCE = new S2C_ActivityInfo_21002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_21002> PARSER = new AbstractParser<S2C_ActivityInfo_21002>() {
         public S2C_ActivityInfo_21002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_21002(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_21002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_21002() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_21002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_21002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ActivityInfo_21002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ActivityInfo_21002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_21002.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ActivityInfo_21002)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_21002 other = (S2C_ActivityInfo_21002)obj;
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

      public static S2C_ActivityInfo_21002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21002)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_21002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_21002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21002)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_21002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_21002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21002)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_21002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_21002 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_21002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_21002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_21002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_21002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_21002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_21002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_21002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_21002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_21002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_21002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_21002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_21002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_21002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_21002> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_21002> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_21002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_21002OrBuilder {
         private int bitField0_;
         private int openDay_;
         private int activityDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ActivityInfo_21002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ActivityInfo_21002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_21002.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.S2C_ActivityInfo_21002.alwaysUseFieldBuilders) {
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ActivityInfo_21002_descriptor;
         }

         public S2C_ActivityInfo_21002 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_ActivityInfo_21002.getDefaultInstance();
         }

         public S2C_ActivityInfo_21002 build() {
            S2C_ActivityInfo_21002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_21002 buildPartial() {
            S2C_ActivityInfo_21002 result = new S2C_ActivityInfo_21002(this);
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
            if (other instanceof S2C_ActivityInfo_21002) {
               return this.mergeFrom((S2C_ActivityInfo_21002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_21002 other) {
            if (other == ActivityQiXiMsg.S2C_ActivityInfo_21002.getDefaultInstance()) {
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
            S2C_ActivityInfo_21002 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_21002)ActivityQiXiMsg.S2C_ActivityInfo_21002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_21002)e.getUnfinishedMessage();
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

   public static final class C2S_ShopAddUpInfo_21003 extends GeneratedMessageV3 implements C2S_ShopAddUpInfo_21003OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopAddUpInfo_21003 DEFAULT_INSTANCE = new C2S_ShopAddUpInfo_21003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopAddUpInfo_21003> PARSER = new AbstractParser<C2S_ShopAddUpInfo_21003>() {
         public C2S_ShopAddUpInfo_21003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopAddUpInfo_21003(input, extensionRegistry);
         }
      };

      private C2S_ShopAddUpInfo_21003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopAddUpInfo_21003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopAddUpInfo_21003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopAddUpInfo_21003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ShopAddUpInfo_21003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ShopAddUpInfo_21003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_21003.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopAddUpInfo_21003)) {
            return super.equals(obj);
         } else {
            C2S_ShopAddUpInfo_21003 other = (C2S_ShopAddUpInfo_21003)obj;
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

      public static C2S_ShopAddUpInfo_21003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21003)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_21003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_21003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21003)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_21003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_21003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21003)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_21003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_21003 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_21003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_21003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_21003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_21003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_21003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_21003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_21003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_21003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_21003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_21003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_21003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopAddUpInfo_21003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopAddUpInfo_21003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopAddUpInfo_21003> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopAddUpInfo_21003> getParserForType() {
         return PARSER;
      }

      public C2S_ShopAddUpInfo_21003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopAddUpInfo_21003OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ShopAddUpInfo_21003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ShopAddUpInfo_21003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_21003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_ShopAddUpInfo_21003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ShopAddUpInfo_21003_descriptor;
         }

         public C2S_ShopAddUpInfo_21003 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_ShopAddUpInfo_21003.getDefaultInstance();
         }

         public C2S_ShopAddUpInfo_21003 build() {
            C2S_ShopAddUpInfo_21003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopAddUpInfo_21003 buildPartial() {
            C2S_ShopAddUpInfo_21003 result = new C2S_ShopAddUpInfo_21003(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ShopAddUpInfo_21003) {
               return this.mergeFrom((C2S_ShopAddUpInfo_21003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopAddUpInfo_21003 other) {
            if (other == ActivityQiXiMsg.C2S_ShopAddUpInfo_21003.getDefaultInstance()) {
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
            C2S_ShopAddUpInfo_21003 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopAddUpInfo_21003)ActivityQiXiMsg.C2S_ShopAddUpInfo_21003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopAddUpInfo_21003)e.getUnfinishedMessage();
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

   public static final class S2C_ShopAddUpInfo_21004 extends GeneratedMessageV3 implements S2C_ShopAddUpInfo_21004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAILYRECHARGE_FIELD_NUMBER = 1;
      private int dailyRecharge_;
      public static final int GOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList gotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopAddUpInfo_21004 DEFAULT_INSTANCE = new S2C_ShopAddUpInfo_21004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopAddUpInfo_21004> PARSER = new AbstractParser<S2C_ShopAddUpInfo_21004>() {
         public S2C_ShopAddUpInfo_21004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopAddUpInfo_21004(input, extensionRegistry);
         }
      };

      private S2C_ShopAddUpInfo_21004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopAddUpInfo_21004() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopAddUpInfo_21004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopAddUpInfo_21004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ShopAddUpInfo_21004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ShopAddUpInfo_21004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_21004.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ShopAddUpInfo_21004)) {
            return super.equals(obj);
         } else {
            S2C_ShopAddUpInfo_21004 other = (S2C_ShopAddUpInfo_21004)obj;
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

      public static S2C_ShopAddUpInfo_21004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21004)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_21004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_21004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21004)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_21004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_21004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21004)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_21004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_21004 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_21004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_21004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_21004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_21004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_21004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_21004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_21004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_21004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_21004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_21004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_21004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopAddUpInfo_21004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopAddUpInfo_21004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopAddUpInfo_21004> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopAddUpInfo_21004> getParserForType() {
         return PARSER;
      }

      public S2C_ShopAddUpInfo_21004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopAddUpInfo_21004OrBuilder {
         private int bitField0_;
         private int dailyRecharge_;
         private Internal.IntList gotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ShopAddUpInfo_21004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ShopAddUpInfo_21004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_21004.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dailyRecharge_ = 0;
            this.bitField0_ &= -2;
            this.gotRewards_ = ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ShopAddUpInfo_21004_descriptor;
         }

         public S2C_ShopAddUpInfo_21004 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.getDefaultInstance();
         }

         public S2C_ShopAddUpInfo_21004 build() {
            S2C_ShopAddUpInfo_21004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopAddUpInfo_21004 buildPartial() {
            S2C_ShopAddUpInfo_21004 result = new S2C_ShopAddUpInfo_21004(this);
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
            if (other instanceof S2C_ShopAddUpInfo_21004) {
               return this.mergeFrom((S2C_ShopAddUpInfo_21004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopAddUpInfo_21004 other) {
            if (other == ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.getDefaultInstance()) {
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
            S2C_ShopAddUpInfo_21004 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopAddUpInfo_21004)ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopAddUpInfo_21004)e.getUnfinishedMessage();
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
               this.gotRewards_ = ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.mutableCopy(this.gotRewards_);
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
            this.gotRewards_ = ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.emptyIntList();
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

   public static final class C2S_ReceiveShopAddUpReward_21005 extends GeneratedMessageV3 implements C2S_ReceiveShopAddUpReward_21005OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveShopAddUpReward_21005 DEFAULT_INSTANCE = new C2S_ReceiveShopAddUpReward_21005();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveShopAddUpReward_21005> PARSER = new AbstractParser<C2S_ReceiveShopAddUpReward_21005>() {
         public C2S_ReceiveShopAddUpReward_21005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveShopAddUpReward_21005(input, extensionRegistry);
         }
      };

      private C2S_ReceiveShopAddUpReward_21005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveShopAddUpReward_21005() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveShopAddUpReward_21005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveShopAddUpReward_21005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_21005.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveShopAddUpReward_21005)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveShopAddUpReward_21005 other = (C2S_ReceiveShopAddUpReward_21005)obj;
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

      public static C2S_ReceiveShopAddUpReward_21005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21005)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21005)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21005)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_21005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveShopAddUpReward_21005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveShopAddUpReward_21005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveShopAddUpReward_21005> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveShopAddUpReward_21005> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveShopAddUpReward_21005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveShopAddUpReward_21005OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_21005.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_ReceiveShopAddUpReward_21005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21005_descriptor;
         }

         public C2S_ReceiveShopAddUpReward_21005 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_ReceiveShopAddUpReward_21005.getDefaultInstance();
         }

         public C2S_ReceiveShopAddUpReward_21005 build() {
            C2S_ReceiveShopAddUpReward_21005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveShopAddUpReward_21005 buildPartial() {
            C2S_ReceiveShopAddUpReward_21005 result = new C2S_ReceiveShopAddUpReward_21005(this);
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
            if (other instanceof C2S_ReceiveShopAddUpReward_21005) {
               return this.mergeFrom((C2S_ReceiveShopAddUpReward_21005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveShopAddUpReward_21005 other) {
            if (other == ActivityQiXiMsg.C2S_ReceiveShopAddUpReward_21005.getDefaultInstance()) {
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
            C2S_ReceiveShopAddUpReward_21005 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveShopAddUpReward_21005)ActivityQiXiMsg.C2S_ReceiveShopAddUpReward_21005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveShopAddUpReward_21005)e.getUnfinishedMessage();
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

   public static final class C2S_SignTotalInfo_21006 extends GeneratedMessageV3 implements C2S_SignTotalInfo_21006OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SignTotalInfo_21006 DEFAULT_INSTANCE = new C2S_SignTotalInfo_21006();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SignTotalInfo_21006> PARSER = new AbstractParser<C2S_SignTotalInfo_21006>() {
         public C2S_SignTotalInfo_21006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SignTotalInfo_21006(input, extensionRegistry);
         }
      };

      private C2S_SignTotalInfo_21006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SignTotalInfo_21006() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SignTotalInfo_21006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SignTotalInfo_21006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_SignTotalInfo_21006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_SignTotalInfo_21006_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_21006.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SignTotalInfo_21006)) {
            return super.equals(obj);
         } else {
            C2S_SignTotalInfo_21006 other = (C2S_SignTotalInfo_21006)obj;
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

      public static C2S_SignTotalInfo_21006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21006)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_21006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_21006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21006)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_21006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_21006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21006)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_21006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_21006 parseFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_21006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_21006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_21006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_21006 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_21006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_21006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_21006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_21006 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SignTotalInfo_21006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_21006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_21006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SignTotalInfo_21006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SignTotalInfo_21006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SignTotalInfo_21006> parser() {
         return PARSER;
      }

      public Parser<C2S_SignTotalInfo_21006> getParserForType() {
         return PARSER;
      }

      public C2S_SignTotalInfo_21006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SignTotalInfo_21006OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_SignTotalInfo_21006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_SignTotalInfo_21006_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_21006.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_SignTotalInfo_21006.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_SignTotalInfo_21006_descriptor;
         }

         public C2S_SignTotalInfo_21006 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_SignTotalInfo_21006.getDefaultInstance();
         }

         public C2S_SignTotalInfo_21006 build() {
            C2S_SignTotalInfo_21006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SignTotalInfo_21006 buildPartial() {
            C2S_SignTotalInfo_21006 result = new C2S_SignTotalInfo_21006(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_SignTotalInfo_21006) {
               return this.mergeFrom((C2S_SignTotalInfo_21006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SignTotalInfo_21006 other) {
            if (other == ActivityQiXiMsg.C2S_SignTotalInfo_21006.getDefaultInstance()) {
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
            C2S_SignTotalInfo_21006 parsedMessage = null;

            try {
               parsedMessage = (C2S_SignTotalInfo_21006)ActivityQiXiMsg.C2S_SignTotalInfo_21006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SignTotalInfo_21006)e.getUnfinishedMessage();
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

   public static final class S2C_SignTotalInfo_21007 extends GeneratedMessageV3 implements S2C_SignTotalInfo_21007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 1;
      private int activityDay_;
      public static final int SIGNGOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList signGotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_SignTotalInfo_21007 DEFAULT_INSTANCE = new S2C_SignTotalInfo_21007();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignTotalInfo_21007> PARSER = new AbstractParser<S2C_SignTotalInfo_21007>() {
         public S2C_SignTotalInfo_21007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignTotalInfo_21007(input, extensionRegistry);
         }
      };

      private S2C_SignTotalInfo_21007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignTotalInfo_21007() {
         this.memoizedIsInitialized = -1;
         this.signGotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignTotalInfo_21007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignTotalInfo_21007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_SignTotalInfo_21007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_SignTotalInfo_21007_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_21007.class, Builder.class);
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
         } else if (!(obj instanceof S2C_SignTotalInfo_21007)) {
            return super.equals(obj);
         } else {
            S2C_SignTotalInfo_21007 other = (S2C_SignTotalInfo_21007)obj;
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

      public static S2C_SignTotalInfo_21007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21007)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_21007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_21007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21007)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_21007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_21007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21007)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_21007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_21007 parseFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_21007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_21007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_21007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_21007 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_21007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_21007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_21007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_21007 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignTotalInfo_21007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_21007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_21007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignTotalInfo_21007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignTotalInfo_21007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignTotalInfo_21007> parser() {
         return PARSER;
      }

      public Parser<S2C_SignTotalInfo_21007> getParserForType() {
         return PARSER;
      }

      public S2C_SignTotalInfo_21007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignTotalInfo_21007OrBuilder {
         private int bitField0_;
         private int activityDay_;
         private Internal.IntList signGotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_SignTotalInfo_21007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_SignTotalInfo_21007_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_21007.class, Builder.class);
         }

         private Builder() {
            this.signGotRewards_ = ActivityQiXiMsg.S2C_SignTotalInfo_21007.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.signGotRewards_ = ActivityQiXiMsg.S2C_SignTotalInfo_21007.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.S2C_SignTotalInfo_21007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityDay_ = 0;
            this.bitField0_ &= -2;
            this.signGotRewards_ = ActivityQiXiMsg.S2C_SignTotalInfo_21007.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_SignTotalInfo_21007_descriptor;
         }

         public S2C_SignTotalInfo_21007 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_SignTotalInfo_21007.getDefaultInstance();
         }

         public S2C_SignTotalInfo_21007 build() {
            S2C_SignTotalInfo_21007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignTotalInfo_21007 buildPartial() {
            S2C_SignTotalInfo_21007 result = new S2C_SignTotalInfo_21007(this);
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
            if (other instanceof S2C_SignTotalInfo_21007) {
               return this.mergeFrom((S2C_SignTotalInfo_21007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignTotalInfo_21007 other) {
            if (other == ActivityQiXiMsg.S2C_SignTotalInfo_21007.getDefaultInstance()) {
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
            S2C_SignTotalInfo_21007 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignTotalInfo_21007)ActivityQiXiMsg.S2C_SignTotalInfo_21007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignTotalInfo_21007)e.getUnfinishedMessage();
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
               this.signGotRewards_ = ActivityQiXiMsg.S2C_SignTotalInfo_21007.mutableCopy(this.signGotRewards_);
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
            this.signGotRewards_ = ActivityQiXiMsg.S2C_SignTotalInfo_21007.emptyIntList();
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

   public static final class C2S_Sign_21008 extends GeneratedMessageV3 implements C2S_Sign_21008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_Sign_21008 DEFAULT_INSTANCE = new C2S_Sign_21008();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Sign_21008> PARSER = new AbstractParser<C2S_Sign_21008>() {
         public C2S_Sign_21008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Sign_21008(input, extensionRegistry);
         }
      };

      private C2S_Sign_21008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Sign_21008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Sign_21008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Sign_21008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_Sign_21008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_Sign_21008_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_21008.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Sign_21008)) {
            return super.equals(obj);
         } else {
            C2S_Sign_21008 other = (C2S_Sign_21008)obj;
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

      public static C2S_Sign_21008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Sign_21008)PARSER.parseFrom(data);
      }

      public static C2S_Sign_21008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_21008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_21008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Sign_21008)PARSER.parseFrom(data);
      }

      public static C2S_Sign_21008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_21008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_21008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Sign_21008)PARSER.parseFrom(data);
      }

      public static C2S_Sign_21008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_21008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_21008 parseFrom(InputStream input) throws IOException {
         return (C2S_Sign_21008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_21008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_21008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_21008 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Sign_21008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Sign_21008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_21008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_21008 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Sign_21008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_21008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_21008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Sign_21008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Sign_21008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Sign_21008> parser() {
         return PARSER;
      }

      public Parser<C2S_Sign_21008> getParserForType() {
         return PARSER;
      }

      public C2S_Sign_21008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Sign_21008OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_Sign_21008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_Sign_21008_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_21008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_Sign_21008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_Sign_21008_descriptor;
         }

         public C2S_Sign_21008 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_Sign_21008.getDefaultInstance();
         }

         public C2S_Sign_21008 build() {
            C2S_Sign_21008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Sign_21008 buildPartial() {
            C2S_Sign_21008 result = new C2S_Sign_21008(this);
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
            if (other instanceof C2S_Sign_21008) {
               return this.mergeFrom((C2S_Sign_21008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Sign_21008 other) {
            if (other == ActivityQiXiMsg.C2S_Sign_21008.getDefaultInstance()) {
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
            C2S_Sign_21008 parsedMessage = null;

            try {
               parsedMessage = (C2S_Sign_21008)ActivityQiXiMsg.C2S_Sign_21008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Sign_21008)e.getUnfinishedMessage();
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

   public static final class MusicData extends GeneratedMessageV3 implements MusicDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MUSICID_FIELD_NUMBER = 1;
      private int musicId_;
      public static final int TOPSCORE_FIELD_NUMBER = 2;
      private int topScore_;
      public static final int GOTID_FIELD_NUMBER = 3;
      private Internal.IntList gotId_;
      private byte memoizedIsInitialized;
      private static final MusicData DEFAULT_INSTANCE = new MusicData();
      /** @deprecated */
      @Deprecated
      public static final Parser<MusicData> PARSER = new AbstractParser<MusicData>() {
         public MusicData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MusicData(input, extensionRegistry);
         }
      };

      private MusicData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MusicData() {
         this.memoizedIsInitialized = -1;
         this.gotId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new MusicData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MusicData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.musicId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.topScore_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gotId_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotId_.addInt(input.readInt32());
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
                  this.gotId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_MusicData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_MusicData_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicData.class, Builder.class);
      }

      public boolean hasMusicId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMusicId() {
         return this.musicId_;
      }

      public boolean hasTopScore() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTopScore() {
         return this.topScore_;
      }

      public List<Integer> getGotIdList() {
         return this.gotId_;
      }

      public int getGotIdCount() {
         return this.gotId_.size();
      }

      public int getGotId(int index) {
         return this.gotId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMusicId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTopScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.musicId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.topScore_);
         }

         for(int i = 0; i < this.gotId_.size(); ++i) {
            output.writeInt32(3, this.gotId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.musicId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.topScore_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MusicData)) {
            return super.equals(obj);
         } else {
            MusicData other = (MusicData)obj;
            if (this.hasMusicId() != other.hasMusicId()) {
               return false;
            } else if (this.hasMusicId() && this.getMusicId() != other.getMusicId()) {
               return false;
            } else if (this.hasTopScore() != other.hasTopScore()) {
               return false;
            } else if (this.hasTopScore() && this.getTopScore() != other.getTopScore()) {
               return false;
            } else if (!this.getGotIdList().equals(other.getGotIdList())) {
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
            if (this.hasMusicId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMusicId();
            }

            if (this.hasTopScore()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTopScore();
            }

            if (this.getGotIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MusicData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data);
      }

      public static MusicData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MusicData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data);
      }

      public static MusicData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MusicData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data);
      }

      public static MusicData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MusicData parseFrom(InputStream input) throws IOException {
         return (MusicData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MusicData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MusicData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MusicData parseDelimitedFrom(InputStream input) throws IOException {
         return (MusicData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MusicData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MusicData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MusicData parseFrom(CodedInputStream input) throws IOException {
         return (MusicData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MusicData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MusicData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(MusicData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static MusicData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MusicData> parser() {
         return PARSER;
      }

      public Parser<MusicData> getParserForType() {
         return PARSER;
      }

      public MusicData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicDataOrBuilder {
         private int bitField0_;
         private int musicId_;
         private int topScore_;
         private Internal.IntList gotId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_MusicData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_MusicData_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicData.class, Builder.class);
         }

         private Builder() {
            this.gotId_ = ActivityQiXiMsg.MusicData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotId_ = ActivityQiXiMsg.MusicData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.MusicData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.musicId_ = 0;
            this.bitField0_ &= -2;
            this.topScore_ = 0;
            this.bitField0_ &= -3;
            this.gotId_ = ActivityQiXiMsg.MusicData.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_MusicData_descriptor;
         }

         public MusicData getDefaultInstanceForType() {
            return ActivityQiXiMsg.MusicData.getDefaultInstance();
         }

         public MusicData build() {
            MusicData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MusicData buildPartial() {
            MusicData result = new MusicData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.musicId_ = this.musicId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.topScore_ = this.topScore_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotId_ = this.gotId_;
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
            if (other instanceof MusicData) {
               return this.mergeFrom((MusicData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(MusicData other) {
            if (other == ActivityQiXiMsg.MusicData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMusicId()) {
                  this.setMusicId(other.getMusicId());
               }

               if (other.hasTopScore()) {
                  this.setTopScore(other.getTopScore());
               }

               if (!other.gotId_.isEmpty()) {
                  if (this.gotId_.isEmpty()) {
                     this.gotId_ = other.gotId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGotIdIsMutable();
                     this.gotId_.addAll(other.gotId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMusicId()) {
               return false;
            } else {
               return this.hasTopScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MusicData parsedMessage = null;

            try {
               parsedMessage = (MusicData)ActivityQiXiMsg.MusicData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (MusicData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMusicId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMusicId() {
            return this.musicId_;
         }

         public Builder setMusicId(int value) {
            this.bitField0_ |= 1;
            this.musicId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMusicId() {
            this.bitField0_ &= -2;
            this.musicId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTopScore() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTopScore() {
            return this.topScore_;
         }

         public Builder setTopScore(int value) {
            this.bitField0_ |= 2;
            this.topScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTopScore() {
            this.bitField0_ &= -3;
            this.topScore_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotId_ = ActivityQiXiMsg.MusicData.mutableCopy(this.gotId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getGotIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.gotId_) : this.gotId_);
         }

         public int getGotIdCount() {
            return this.gotId_.size();
         }

         public int getGotId(int index) {
            return this.gotId_.getInt(index);
         }

         public Builder setGotId(int index, int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotId(int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotId(Iterable<? extends Integer> values) {
            this.ensureGotIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotId_);
            this.onChanged();
            return this;
         }

         public Builder clearGotId() {
            this.gotId_ = ActivityQiXiMsg.MusicData.emptyIntList();
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

   public static final class C2S_BeatDrumInfo_21009 extends GeneratedMessageV3 implements C2S_BeatDrumInfo_21009OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BeatDrumInfo_21009 DEFAULT_INSTANCE = new C2S_BeatDrumInfo_21009();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BeatDrumInfo_21009> PARSER = new AbstractParser<C2S_BeatDrumInfo_21009>() {
         public C2S_BeatDrumInfo_21009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BeatDrumInfo_21009(input, extensionRegistry);
         }
      };

      private C2S_BeatDrumInfo_21009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BeatDrumInfo_21009() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BeatDrumInfo_21009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BeatDrumInfo_21009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrumInfo_21009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrumInfo_21009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BeatDrumInfo_21009.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BeatDrumInfo_21009)) {
            return super.equals(obj);
         } else {
            C2S_BeatDrumInfo_21009 other = (C2S_BeatDrumInfo_21009)obj;
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

      public static C2S_BeatDrumInfo_21009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BeatDrumInfo_21009)PARSER.parseFrom(data);
      }

      public static C2S_BeatDrumInfo_21009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BeatDrumInfo_21009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BeatDrumInfo_21009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BeatDrumInfo_21009)PARSER.parseFrom(data);
      }

      public static C2S_BeatDrumInfo_21009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BeatDrumInfo_21009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BeatDrumInfo_21009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BeatDrumInfo_21009)PARSER.parseFrom(data);
      }

      public static C2S_BeatDrumInfo_21009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BeatDrumInfo_21009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BeatDrumInfo_21009 parseFrom(InputStream input) throws IOException {
         return (C2S_BeatDrumInfo_21009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BeatDrumInfo_21009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BeatDrumInfo_21009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BeatDrumInfo_21009 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BeatDrumInfo_21009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BeatDrumInfo_21009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BeatDrumInfo_21009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BeatDrumInfo_21009 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BeatDrumInfo_21009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BeatDrumInfo_21009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BeatDrumInfo_21009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BeatDrumInfo_21009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BeatDrumInfo_21009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BeatDrumInfo_21009> parser() {
         return PARSER;
      }

      public Parser<C2S_BeatDrumInfo_21009> getParserForType() {
         return PARSER;
      }

      public C2S_BeatDrumInfo_21009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BeatDrumInfo_21009OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrumInfo_21009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrumInfo_21009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BeatDrumInfo_21009.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_BeatDrumInfo_21009.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrumInfo_21009_descriptor;
         }

         public C2S_BeatDrumInfo_21009 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_BeatDrumInfo_21009.getDefaultInstance();
         }

         public C2S_BeatDrumInfo_21009 build() {
            C2S_BeatDrumInfo_21009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BeatDrumInfo_21009 buildPartial() {
            C2S_BeatDrumInfo_21009 result = new C2S_BeatDrumInfo_21009(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_BeatDrumInfo_21009) {
               return this.mergeFrom((C2S_BeatDrumInfo_21009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BeatDrumInfo_21009 other) {
            if (other == ActivityQiXiMsg.C2S_BeatDrumInfo_21009.getDefaultInstance()) {
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
            C2S_BeatDrumInfo_21009 parsedMessage = null;

            try {
               parsedMessage = (C2S_BeatDrumInfo_21009)ActivityQiXiMsg.C2S_BeatDrumInfo_21009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BeatDrumInfo_21009)e.getUnfinishedMessage();
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

   public static final class S2C_BeatDrumInfo_21010 extends GeneratedMessageV3 implements S2C_BeatDrumInfo_21010OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEATCOUNT_FIELD_NUMBER = 1;
      private int beatCount_;
      public static final int MUSICDATA_FIELD_NUMBER = 2;
      private List<MusicData> musicData_;
      public static final int TOTALSCORE_FIELD_NUMBER = 3;
      private int totalScore_;
      public static final int ISRED_FIELD_NUMBER = 4;
      private boolean isRed_;
      private byte memoizedIsInitialized;
      private static final S2C_BeatDrumInfo_21010 DEFAULT_INSTANCE = new S2C_BeatDrumInfo_21010();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BeatDrumInfo_21010> PARSER = new AbstractParser<S2C_BeatDrumInfo_21010>() {
         public S2C_BeatDrumInfo_21010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BeatDrumInfo_21010(input, extensionRegistry);
         }
      };

      private S2C_BeatDrumInfo_21010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BeatDrumInfo_21010() {
         this.memoizedIsInitialized = -1;
         this.musicData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BeatDrumInfo_21010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BeatDrumInfo_21010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beatCount_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.musicData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.musicData_.add(input.readMessage(ActivityQiXiMsg.MusicData.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.totalScore_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.isRed_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.musicData_ = Collections.unmodifiableList(this.musicData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrumInfo_21010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrumInfo_21010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BeatDrumInfo_21010.class, Builder.class);
      }

      public boolean hasBeatCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeatCount() {
         return this.beatCount_;
      }

      public List<MusicData> getMusicDataList() {
         return this.musicData_;
      }

      public List<? extends MusicDataOrBuilder> getMusicDataOrBuilderList() {
         return this.musicData_;
      }

      public int getMusicDataCount() {
         return this.musicData_.size();
      }

      public MusicData getMusicData(int index) {
         return (MusicData)this.musicData_.get(index);
      }

      public MusicDataOrBuilder getMusicDataOrBuilder(int index) {
         return (MusicDataOrBuilder)this.musicData_.get(index);
      }

      public boolean hasTotalScore() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTotalScore() {
         return this.totalScore_;
      }

      public boolean hasIsRed() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsRed() {
         return this.isRed_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeatCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsRed()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getMusicDataCount(); ++i) {
               if (!this.getMusicData(i).isInitialized()) {
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
            output.writeInt32(1, this.beatCount_);
         }

         for(int i = 0; i < this.musicData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.musicData_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.totalScore_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(4, this.isRed_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beatCount_);
            }

            for(int i = 0; i < this.musicData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.musicData_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.totalScore_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isRed_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BeatDrumInfo_21010)) {
            return super.equals(obj);
         } else {
            S2C_BeatDrumInfo_21010 other = (S2C_BeatDrumInfo_21010)obj;
            if (this.hasBeatCount() != other.hasBeatCount()) {
               return false;
            } else if (this.hasBeatCount() && this.getBeatCount() != other.getBeatCount()) {
               return false;
            } else if (!this.getMusicDataList().equals(other.getMusicDataList())) {
               return false;
            } else if (this.hasTotalScore() != other.hasTotalScore()) {
               return false;
            } else if (this.hasTotalScore() && this.getTotalScore() != other.getTotalScore()) {
               return false;
            } else if (this.hasIsRed() != other.hasIsRed()) {
               return false;
            } else if (this.hasIsRed() && this.getIsRed() != other.getIsRed()) {
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
            if (this.hasBeatCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeatCount();
            }

            if (this.getMusicDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMusicDataList().hashCode();
            }

            if (this.hasTotalScore()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTotalScore();
            }

            if (this.hasIsRed()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsRed());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BeatDrumInfo_21010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BeatDrumInfo_21010)PARSER.parseFrom(data);
      }

      public static S2C_BeatDrumInfo_21010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeatDrumInfo_21010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeatDrumInfo_21010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BeatDrumInfo_21010)PARSER.parseFrom(data);
      }

      public static S2C_BeatDrumInfo_21010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeatDrumInfo_21010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeatDrumInfo_21010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BeatDrumInfo_21010)PARSER.parseFrom(data);
      }

      public static S2C_BeatDrumInfo_21010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeatDrumInfo_21010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeatDrumInfo_21010 parseFrom(InputStream input) throws IOException {
         return (S2C_BeatDrumInfo_21010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BeatDrumInfo_21010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeatDrumInfo_21010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BeatDrumInfo_21010 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BeatDrumInfo_21010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BeatDrumInfo_21010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeatDrumInfo_21010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BeatDrumInfo_21010 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BeatDrumInfo_21010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BeatDrumInfo_21010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeatDrumInfo_21010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BeatDrumInfo_21010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BeatDrumInfo_21010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BeatDrumInfo_21010> parser() {
         return PARSER;
      }

      public Parser<S2C_BeatDrumInfo_21010> getParserForType() {
         return PARSER;
      }

      public S2C_BeatDrumInfo_21010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BeatDrumInfo_21010OrBuilder {
         private int bitField0_;
         private int beatCount_;
         private List<MusicData> musicData_;
         private RepeatedFieldBuilderV3<MusicData, MusicData.Builder, MusicDataOrBuilder> musicDataBuilder_;
         private int totalScore_;
         private boolean isRed_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrumInfo_21010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrumInfo_21010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BeatDrumInfo_21010.class, Builder.class);
         }

         private Builder() {
            this.musicData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.musicData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.S2C_BeatDrumInfo_21010.alwaysUseFieldBuilders) {
               this.getMusicDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.beatCount_ = 0;
            this.bitField0_ &= -2;
            if (this.musicDataBuilder_ == null) {
               this.musicData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.musicDataBuilder_.clear();
            }

            this.totalScore_ = 0;
            this.bitField0_ &= -5;
            this.isRed_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrumInfo_21010_descriptor;
         }

         public S2C_BeatDrumInfo_21010 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_BeatDrumInfo_21010.getDefaultInstance();
         }

         public S2C_BeatDrumInfo_21010 build() {
            S2C_BeatDrumInfo_21010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BeatDrumInfo_21010 buildPartial() {
            S2C_BeatDrumInfo_21010 result = new S2C_BeatDrumInfo_21010(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beatCount_ = this.beatCount_;
               to_bitField0_ |= 1;
            }

            if (this.musicDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.musicData_ = Collections.unmodifiableList(this.musicData_);
                  this.bitField0_ &= -3;
               }

               result.musicData_ = this.musicData_;
            } else {
               result.musicData_ = this.musicDataBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.totalScore_ = this.totalScore_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isRed_ = this.isRed_;
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
            if (other instanceof S2C_BeatDrumInfo_21010) {
               return this.mergeFrom((S2C_BeatDrumInfo_21010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BeatDrumInfo_21010 other) {
            if (other == ActivityQiXiMsg.S2C_BeatDrumInfo_21010.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeatCount()) {
                  this.setBeatCount(other.getBeatCount());
               }

               if (this.musicDataBuilder_ == null) {
                  if (!other.musicData_.isEmpty()) {
                     if (this.musicData_.isEmpty()) {
                        this.musicData_ = other.musicData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureMusicDataIsMutable();
                        this.musicData_.addAll(other.musicData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.musicData_.isEmpty()) {
                  if (this.musicDataBuilder_.isEmpty()) {
                     this.musicDataBuilder_.dispose();
                     this.musicDataBuilder_ = null;
                     this.musicData_ = other.musicData_;
                     this.bitField0_ &= -3;
                     this.musicDataBuilder_ = ActivityQiXiMsg.S2C_BeatDrumInfo_21010.alwaysUseFieldBuilders ? this.getMusicDataFieldBuilder() : null;
                  } else {
                     this.musicDataBuilder_.addAllMessages(other.musicData_);
                  }
               }

               if (other.hasTotalScore()) {
                  this.setTotalScore(other.getTotalScore());
               }

               if (other.hasIsRed()) {
                  this.setIsRed(other.getIsRed());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeatCount()) {
               return false;
            } else if (!this.hasTotalScore()) {
               return false;
            } else if (!this.hasIsRed()) {
               return false;
            } else {
               for(int i = 0; i < this.getMusicDataCount(); ++i) {
                  if (!this.getMusicData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BeatDrumInfo_21010 parsedMessage = null;

            try {
               parsedMessage = (S2C_BeatDrumInfo_21010)ActivityQiXiMsg.S2C_BeatDrumInfo_21010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BeatDrumInfo_21010)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeatCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeatCount() {
            return this.beatCount_;
         }

         public Builder setBeatCount(int value) {
            this.bitField0_ |= 1;
            this.beatCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeatCount() {
            this.bitField0_ &= -2;
            this.beatCount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureMusicDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.musicData_ = new ArrayList(this.musicData_);
               this.bitField0_ |= 2;
            }

         }

         public List<MusicData> getMusicDataList() {
            return this.musicDataBuilder_ == null ? Collections.unmodifiableList(this.musicData_) : this.musicDataBuilder_.getMessageList();
         }

         public int getMusicDataCount() {
            return this.musicDataBuilder_ == null ? this.musicData_.size() : this.musicDataBuilder_.getCount();
         }

         public MusicData getMusicData(int index) {
            return this.musicDataBuilder_ == null ? (MusicData)this.musicData_.get(index) : (MusicData)this.musicDataBuilder_.getMessage(index);
         }

         public Builder setMusicData(int index, MusicData value) {
            if (this.musicDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMusicDataIsMutable();
               this.musicData_.set(index, value);
               this.onChanged();
            } else {
               this.musicDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMusicData(int index, MusicData.Builder builderForValue) {
            if (this.musicDataBuilder_ == null) {
               this.ensureMusicDataIsMutable();
               this.musicData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.musicDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMusicData(MusicData value) {
            if (this.musicDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMusicDataIsMutable();
               this.musicData_.add(value);
               this.onChanged();
            } else {
               this.musicDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMusicData(int index, MusicData value) {
            if (this.musicDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMusicDataIsMutable();
               this.musicData_.add(index, value);
               this.onChanged();
            } else {
               this.musicDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMusicData(MusicData.Builder builderForValue) {
            if (this.musicDataBuilder_ == null) {
               this.ensureMusicDataIsMutable();
               this.musicData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.musicDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMusicData(int index, MusicData.Builder builderForValue) {
            if (this.musicDataBuilder_ == null) {
               this.ensureMusicDataIsMutable();
               this.musicData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.musicDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMusicData(Iterable<? extends MusicData> values) {
            if (this.musicDataBuilder_ == null) {
               this.ensureMusicDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.musicData_);
               this.onChanged();
            } else {
               this.musicDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMusicData() {
            if (this.musicDataBuilder_ == null) {
               this.musicData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.musicDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeMusicData(int index) {
            if (this.musicDataBuilder_ == null) {
               this.ensureMusicDataIsMutable();
               this.musicData_.remove(index);
               this.onChanged();
            } else {
               this.musicDataBuilder_.remove(index);
            }

            return this;
         }

         public MusicData.Builder getMusicDataBuilder(int index) {
            return (MusicData.Builder)this.getMusicDataFieldBuilder().getBuilder(index);
         }

         public MusicDataOrBuilder getMusicDataOrBuilder(int index) {
            return this.musicDataBuilder_ == null ? (MusicDataOrBuilder)this.musicData_.get(index) : (MusicDataOrBuilder)this.musicDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MusicDataOrBuilder> getMusicDataOrBuilderList() {
            return this.musicDataBuilder_ != null ? this.musicDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.musicData_);
         }

         public MusicData.Builder addMusicDataBuilder() {
            return (MusicData.Builder)this.getMusicDataFieldBuilder().addBuilder(ActivityQiXiMsg.MusicData.getDefaultInstance());
         }

         public MusicData.Builder addMusicDataBuilder(int index) {
            return (MusicData.Builder)this.getMusicDataFieldBuilder().addBuilder(index, ActivityQiXiMsg.MusicData.getDefaultInstance());
         }

         public List<MusicData.Builder> getMusicDataBuilderList() {
            return this.getMusicDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MusicData, MusicData.Builder, MusicDataOrBuilder> getMusicDataFieldBuilder() {
            if (this.musicDataBuilder_ == null) {
               this.musicDataBuilder_ = new RepeatedFieldBuilderV3(this.musicData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.musicData_ = null;
            }

            return this.musicDataBuilder_;
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

         public boolean hasIsRed() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsRed() {
            return this.isRed_;
         }

         public Builder setIsRed(boolean value) {
            this.bitField0_ |= 8;
            this.isRed_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsRed() {
            this.bitField0_ &= -9;
            this.isRed_ = false;
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

   public static final class C2S_BeatDrum_21011 extends GeneratedMessageV3 implements C2S_BeatDrum_21011OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MUSICID_FIELD_NUMBER = 1;
      private int musicId_;
      public static final int SCORE_FIELD_NUMBER = 2;
      private int score_;
      private byte memoizedIsInitialized;
      private static final C2S_BeatDrum_21011 DEFAULT_INSTANCE = new C2S_BeatDrum_21011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BeatDrum_21011> PARSER = new AbstractParser<C2S_BeatDrum_21011>() {
         public C2S_BeatDrum_21011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BeatDrum_21011(input, extensionRegistry);
         }
      };

      private C2S_BeatDrum_21011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BeatDrum_21011() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BeatDrum_21011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BeatDrum_21011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.musicId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.score_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrum_21011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrum_21011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BeatDrum_21011.class, Builder.class);
      }

      public boolean hasMusicId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMusicId() {
         return this.musicId_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMusicId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.musicId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.score_);
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
               size += CodedOutputStream.computeInt32Size(1, this.musicId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.score_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BeatDrum_21011)) {
            return super.equals(obj);
         } else {
            C2S_BeatDrum_21011 other = (C2S_BeatDrum_21011)obj;
            if (this.hasMusicId() != other.hasMusicId()) {
               return false;
            } else if (this.hasMusicId() && this.getMusicId() != other.getMusicId()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
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
            if (this.hasMusicId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMusicId();
            }

            if (this.hasScore()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getScore();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BeatDrum_21011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_21011)PARSER.parseFrom(data);
      }

      public static C2S_BeatDrum_21011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_21011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BeatDrum_21011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_21011)PARSER.parseFrom(data);
      }

      public static C2S_BeatDrum_21011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_21011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BeatDrum_21011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_21011)PARSER.parseFrom(data);
      }

      public static C2S_BeatDrum_21011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_21011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BeatDrum_21011 parseFrom(InputStream input) throws IOException {
         return (C2S_BeatDrum_21011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BeatDrum_21011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BeatDrum_21011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BeatDrum_21011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BeatDrum_21011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BeatDrum_21011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BeatDrum_21011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BeatDrum_21011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BeatDrum_21011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BeatDrum_21011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BeatDrum_21011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BeatDrum_21011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BeatDrum_21011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BeatDrum_21011> parser() {
         return PARSER;
      }

      public Parser<C2S_BeatDrum_21011> getParserForType() {
         return PARSER;
      }

      public C2S_BeatDrum_21011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BeatDrum_21011OrBuilder {
         private int bitField0_;
         private int musicId_;
         private int score_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrum_21011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrum_21011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BeatDrum_21011.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_BeatDrum_21011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.musicId_ = 0;
            this.bitField0_ &= -2;
            this.score_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_BeatDrum_21011_descriptor;
         }

         public C2S_BeatDrum_21011 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_BeatDrum_21011.getDefaultInstance();
         }

         public C2S_BeatDrum_21011 build() {
            C2S_BeatDrum_21011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BeatDrum_21011 buildPartial() {
            C2S_BeatDrum_21011 result = new C2S_BeatDrum_21011(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.musicId_ = this.musicId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.score_ = this.score_;
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
            if (other instanceof C2S_BeatDrum_21011) {
               return this.mergeFrom((C2S_BeatDrum_21011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BeatDrum_21011 other) {
            if (other == ActivityQiXiMsg.C2S_BeatDrum_21011.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMusicId()) {
                  this.setMusicId(other.getMusicId());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMusicId()) {
               return false;
            } else {
               return this.hasScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BeatDrum_21011 parsedMessage = null;

            try {
               parsedMessage = (C2S_BeatDrum_21011)ActivityQiXiMsg.C2S_BeatDrum_21011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BeatDrum_21011)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMusicId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMusicId() {
            return this.musicId_;
         }

         public Builder setMusicId(int value) {
            this.bitField0_ |= 1;
            this.musicId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMusicId() {
            this.bitField0_ &= -2;
            this.musicId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getScore() {
            return this.score_;
         }

         public Builder setScore(int value) {
            this.bitField0_ |= 2;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -3;
            this.score_ = 0;
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

   public static final class S2C_BeatDrum_21012 extends GeneratedMessageV3 implements S2C_BeatDrum_21012OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int MUSICID_FIELD_NUMBER = 2;
      private int musicId_;
      public static final int BEATCOUNT_FIELD_NUMBER = 3;
      private int beatCount_;
      public static final int TOPSCORE_FIELD_NUMBER = 4;
      private int topScore_;
      public static final int GOTSCORE_FIELD_NUMBER = 5;
      private Internal.IntList gotScore_;
      private byte memoizedIsInitialized;
      private static final S2C_BeatDrum_21012 DEFAULT_INSTANCE = new S2C_BeatDrum_21012();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BeatDrum_21012> PARSER = new AbstractParser<S2C_BeatDrum_21012>() {
         public S2C_BeatDrum_21012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BeatDrum_21012(input, extensionRegistry);
         }
      };

      private S2C_BeatDrum_21012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BeatDrum_21012() {
         this.memoizedIsInitialized = -1;
         this.gotScore_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BeatDrum_21012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BeatDrum_21012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.musicId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.beatCount_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.topScore_ = input.readInt32();
                        break;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.gotScore_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.gotScore_.addInt(input.readInt32());
                        break;
                     case 42:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotScore_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotScore_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 16) != 0) {
                  this.gotScore_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrum_21012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrum_21012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BeatDrum_21012.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasMusicId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMusicId() {
         return this.musicId_;
      }

      public boolean hasBeatCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBeatCount() {
         return this.beatCount_;
      }

      public boolean hasTopScore() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTopScore() {
         return this.topScore_;
      }

      public List<Integer> getGotScoreList() {
         return this.gotScore_;
      }

      public int getGotScoreCount() {
         return this.gotScore_.size();
      }

      public int getGotScore(int index) {
         return this.gotScore_.getInt(index);
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
         } else if (!this.hasMusicId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBeatCount()) {
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
            output.writeInt32(2, this.musicId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.beatCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.topScore_);
         }

         for(int i = 0; i < this.gotScore_.size(); ++i) {
            output.writeInt32(5, this.gotScore_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.musicId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.beatCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.topScore_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotScore_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotScore_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotScoreList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BeatDrum_21012)) {
            return super.equals(obj);
         } else {
            S2C_BeatDrum_21012 other = (S2C_BeatDrum_21012)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasMusicId() != other.hasMusicId()) {
               return false;
            } else if (this.hasMusicId() && this.getMusicId() != other.getMusicId()) {
               return false;
            } else if (this.hasBeatCount() != other.hasBeatCount()) {
               return false;
            } else if (this.hasBeatCount() && this.getBeatCount() != other.getBeatCount()) {
               return false;
            } else if (this.hasTopScore() != other.hasTopScore()) {
               return false;
            } else if (this.hasTopScore() && this.getTopScore() != other.getTopScore()) {
               return false;
            } else if (!this.getGotScoreList().equals(other.getGotScoreList())) {
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

            if (this.hasMusicId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMusicId();
            }

            if (this.hasBeatCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBeatCount();
            }

            if (this.hasTopScore()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTopScore();
            }

            if (this.getGotScoreCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getGotScoreList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BeatDrum_21012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_21012)PARSER.parseFrom(data);
      }

      public static S2C_BeatDrum_21012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_21012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeatDrum_21012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_21012)PARSER.parseFrom(data);
      }

      public static S2C_BeatDrum_21012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_21012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeatDrum_21012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_21012)PARSER.parseFrom(data);
      }

      public static S2C_BeatDrum_21012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_21012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeatDrum_21012 parseFrom(InputStream input) throws IOException {
         return (S2C_BeatDrum_21012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BeatDrum_21012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeatDrum_21012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BeatDrum_21012 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BeatDrum_21012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BeatDrum_21012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeatDrum_21012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BeatDrum_21012 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BeatDrum_21012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BeatDrum_21012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeatDrum_21012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BeatDrum_21012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BeatDrum_21012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BeatDrum_21012> parser() {
         return PARSER;
      }

      public Parser<S2C_BeatDrum_21012> getParserForType() {
         return PARSER;
      }

      public S2C_BeatDrum_21012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BeatDrum_21012OrBuilder {
         private int bitField0_;
         private int result_;
         private int musicId_;
         private int beatCount_;
         private int topScore_;
         private Internal.IntList gotScore_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrum_21012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrum_21012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BeatDrum_21012.class, Builder.class);
         }

         private Builder() {
            this.gotScore_ = ActivityQiXiMsg.S2C_BeatDrum_21012.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotScore_ = ActivityQiXiMsg.S2C_BeatDrum_21012.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.S2C_BeatDrum_21012.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.musicId_ = 0;
            this.bitField0_ &= -3;
            this.beatCount_ = 0;
            this.bitField0_ &= -5;
            this.topScore_ = 0;
            this.bitField0_ &= -9;
            this.gotScore_ = ActivityQiXiMsg.S2C_BeatDrum_21012.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_BeatDrum_21012_descriptor;
         }

         public S2C_BeatDrum_21012 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_BeatDrum_21012.getDefaultInstance();
         }

         public S2C_BeatDrum_21012 build() {
            S2C_BeatDrum_21012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BeatDrum_21012 buildPartial() {
            S2C_BeatDrum_21012 result = new S2C_BeatDrum_21012(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.musicId_ = this.musicId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.beatCount_ = this.beatCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.topScore_ = this.topScore_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.gotScore_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.gotScore_ = this.gotScore_;
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
            if (other instanceof S2C_BeatDrum_21012) {
               return this.mergeFrom((S2C_BeatDrum_21012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BeatDrum_21012 other) {
            if (other == ActivityQiXiMsg.S2C_BeatDrum_21012.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasMusicId()) {
                  this.setMusicId(other.getMusicId());
               }

               if (other.hasBeatCount()) {
                  this.setBeatCount(other.getBeatCount());
               }

               if (other.hasTopScore()) {
                  this.setTopScore(other.getTopScore());
               }

               if (!other.gotScore_.isEmpty()) {
                  if (this.gotScore_.isEmpty()) {
                     this.gotScore_ = other.gotScore_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureGotScoreIsMutable();
                     this.gotScore_.addAll(other.gotScore_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasMusicId()) {
               return false;
            } else {
               return this.hasBeatCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BeatDrum_21012 parsedMessage = null;

            try {
               parsedMessage = (S2C_BeatDrum_21012)ActivityQiXiMsg.S2C_BeatDrum_21012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BeatDrum_21012)e.getUnfinishedMessage();
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

         public boolean hasMusicId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMusicId() {
            return this.musicId_;
         }

         public Builder setMusicId(int value) {
            this.bitField0_ |= 2;
            this.musicId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMusicId() {
            this.bitField0_ &= -3;
            this.musicId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBeatCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBeatCount() {
            return this.beatCount_;
         }

         public Builder setBeatCount(int value) {
            this.bitField0_ |= 4;
            this.beatCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeatCount() {
            this.bitField0_ &= -5;
            this.beatCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTopScore() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTopScore() {
            return this.topScore_;
         }

         public Builder setTopScore(int value) {
            this.bitField0_ |= 8;
            this.topScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTopScore() {
            this.bitField0_ &= -9;
            this.topScore_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotScoreIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.gotScore_ = ActivityQiXiMsg.S2C_BeatDrum_21012.mutableCopy(this.gotScore_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getGotScoreList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.gotScore_) : this.gotScore_);
         }

         public int getGotScoreCount() {
            return this.gotScore_.size();
         }

         public int getGotScore(int index) {
            return this.gotScore_.getInt(index);
         }

         public Builder setGotScore(int index, int value) {
            this.ensureGotScoreIsMutable();
            this.gotScore_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotScore(int value) {
            this.ensureGotScoreIsMutable();
            this.gotScore_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotScore(Iterable<? extends Integer> values) {
            this.ensureGotScoreIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotScore_);
            this.onChanged();
            return this;
         }

         public Builder clearGotScore() {
            this.gotScore_ = ActivityQiXiMsg.S2C_BeatDrum_21012.emptyIntList();
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

   public static final class C2S_FancyReward_21013 extends GeneratedMessageV3 implements C2S_FancyReward_21013OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETID_FIELD_NUMBER = 1;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_21013 DEFAULT_INSTANCE = new C2S_FancyReward_21013();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_21013> PARSER = new AbstractParser<C2S_FancyReward_21013>() {
         public C2S_FancyReward_21013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_21013(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_21013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_21013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_21013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_21013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_FancyReward_21013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_FancyReward_21013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_21013.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FancyReward_21013)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_21013 other = (C2S_FancyReward_21013)obj;
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

      public static C2S_FancyReward_21013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21013)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_21013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_21013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21013)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_21013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_21013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21013)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_21013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_21013 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_21013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_21013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_21013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_21013 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_21013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_21013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_21013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_21013 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_21013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_21013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_21013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_21013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_21013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_21013> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_21013> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_21013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_21013OrBuilder {
         private int bitField0_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_FancyReward_21013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_FancyReward_21013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_21013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_FancyReward_21013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_FancyReward_21013_descriptor;
         }

         public C2S_FancyReward_21013 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_FancyReward_21013.getDefaultInstance();
         }

         public C2S_FancyReward_21013 build() {
            C2S_FancyReward_21013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_21013 buildPartial() {
            C2S_FancyReward_21013 result = new C2S_FancyReward_21013(this);
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
            if (other instanceof C2S_FancyReward_21013) {
               return this.mergeFrom((C2S_FancyReward_21013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_21013 other) {
            if (other == ActivityQiXiMsg.C2S_FancyReward_21013.getDefaultInstance()) {
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
            C2S_FancyReward_21013 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_21013)ActivityQiXiMsg.C2S_FancyReward_21013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_21013)e.getUnfinishedMessage();
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

   public static final class S2C_FancyReward_21014 extends GeneratedMessageV3 implements S2C_FancyReward_21014OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_21014 DEFAULT_INSTANCE = new S2C_FancyReward_21014();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_21014> PARSER = new AbstractParser<S2C_FancyReward_21014>() {
         public S2C_FancyReward_21014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_21014(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_21014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_21014() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_21014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_21014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_FancyReward_21014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_FancyReward_21014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_21014.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FancyReward_21014)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_21014 other = (S2C_FancyReward_21014)obj;
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

      public static S2C_FancyReward_21014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21014)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_21014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_21014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21014)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_21014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_21014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21014)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_21014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_21014 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_21014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_21014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_21014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_21014 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_21014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_21014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_21014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_21014 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_21014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_21014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_21014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_21014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_21014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_21014> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_21014> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_21014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_21014OrBuilder {
         private int bitField0_;
         private int result_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_FancyReward_21014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_FancyReward_21014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_21014.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.S2C_FancyReward_21014.alwaysUseFieldBuilders) {
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_FancyReward_21014_descriptor;
         }

         public S2C_FancyReward_21014 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_FancyReward_21014.getDefaultInstance();
         }

         public S2C_FancyReward_21014 build() {
            S2C_FancyReward_21014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_21014 buildPartial() {
            S2C_FancyReward_21014 result = new S2C_FancyReward_21014(this);
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
            if (other instanceof S2C_FancyReward_21014) {
               return this.mergeFrom((S2C_FancyReward_21014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_21014 other) {
            if (other == ActivityQiXiMsg.S2C_FancyReward_21014.getDefaultInstance()) {
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
            S2C_FancyReward_21014 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_21014)ActivityQiXiMsg.S2C_FancyReward_21014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_21014)e.getUnfinishedMessage();
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

   public static final class C2S_LuckDrawInfo_21015 extends GeneratedMessageV3 implements C2S_LuckDrawInfo_21015OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckDrawInfo_21015 DEFAULT_INSTANCE = new C2S_LuckDrawInfo_21015();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckDrawInfo_21015> PARSER = new AbstractParser<C2S_LuckDrawInfo_21015>() {
         public C2S_LuckDrawInfo_21015 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckDrawInfo_21015(input, extensionRegistry);
         }
      };

      private C2S_LuckDrawInfo_21015(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckDrawInfo_21015() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckDrawInfo_21015();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckDrawInfo_21015(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_LuckDrawInfo_21015_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_LuckDrawInfo_21015_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_21015.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckDrawInfo_21015)) {
            return super.equals(obj);
         } else {
            C2S_LuckDrawInfo_21015 other = (C2S_LuckDrawInfo_21015)obj;
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

      public static C2S_LuckDrawInfo_21015 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21015)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_21015 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_21015 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21015)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_21015 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_21015 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21015)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_21015 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_21015 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_21015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_21015 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_21015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_21015 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_21015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_21015 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_21015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_21015 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckDrawInfo_21015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_21015 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_21015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckDrawInfo_21015 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckDrawInfo_21015 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckDrawInfo_21015> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckDrawInfo_21015> getParserForType() {
         return PARSER;
      }

      public C2S_LuckDrawInfo_21015 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckDrawInfo_21015OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_LuckDrawInfo_21015_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_LuckDrawInfo_21015_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_21015.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_LuckDrawInfo_21015.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_LuckDrawInfo_21015_descriptor;
         }

         public C2S_LuckDrawInfo_21015 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_LuckDrawInfo_21015.getDefaultInstance();
         }

         public C2S_LuckDrawInfo_21015 build() {
            C2S_LuckDrawInfo_21015 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckDrawInfo_21015 buildPartial() {
            C2S_LuckDrawInfo_21015 result = new C2S_LuckDrawInfo_21015(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LuckDrawInfo_21015) {
               return this.mergeFrom((C2S_LuckDrawInfo_21015)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckDrawInfo_21015 other) {
            if (other == ActivityQiXiMsg.C2S_LuckDrawInfo_21015.getDefaultInstance()) {
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
            C2S_LuckDrawInfo_21015 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckDrawInfo_21015)ActivityQiXiMsg.C2S_LuckDrawInfo_21015.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckDrawInfo_21015)e.getUnfinishedMessage();
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

   public static final class S2C_LuckDrawInfo_21016 extends GeneratedMessageV3 implements S2C_LuckDrawInfo_21016OrBuilder {
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
      private static final S2C_LuckDrawInfo_21016 DEFAULT_INSTANCE = new S2C_LuckDrawInfo_21016();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckDrawInfo_21016> PARSER = new AbstractParser<S2C_LuckDrawInfo_21016>() {
         public S2C_LuckDrawInfo_21016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckDrawInfo_21016(input, extensionRegistry);
         }
      };

      private S2C_LuckDrawInfo_21016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckDrawInfo_21016() {
         this.memoizedIsInitialized = -1;
         this.hadRewardId_ = emptyIntList();
         this.seniorRewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckDrawInfo_21016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckDrawInfo_21016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_LuckDrawInfo_21016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_LuckDrawInfo_21016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_21016.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LuckDrawInfo_21016)) {
            return super.equals(obj);
         } else {
            S2C_LuckDrawInfo_21016 other = (S2C_LuckDrawInfo_21016)obj;
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

      public static S2C_LuckDrawInfo_21016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21016)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_21016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_21016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21016)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_21016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_21016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21016)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_21016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_21016 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_21016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_21016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_21016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_21016 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_21016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_21016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_21016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_21016 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckDrawInfo_21016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_21016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_21016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckDrawInfo_21016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckDrawInfo_21016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckDrawInfo_21016> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckDrawInfo_21016> getParserForType() {
         return PARSER;
      }

      public S2C_LuckDrawInfo_21016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckDrawInfo_21016OrBuilder {
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_LuckDrawInfo_21016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_LuckDrawInfo_21016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_21016.class, Builder.class);
         }

         private Builder() {
            this.hadRewardId_ = ActivityQiXiMsg.S2C_LuckDrawInfo_21016.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadRewardId_ = ActivityQiXiMsg.S2C_LuckDrawInfo_21016.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.S2C_LuckDrawInfo_21016.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.hadRewardId_ = ActivityQiXiMsg.S2C_LuckDrawInfo_21016.emptyIntList();
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_LuckDrawInfo_21016_descriptor;
         }

         public S2C_LuckDrawInfo_21016 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_LuckDrawInfo_21016.getDefaultInstance();
         }

         public S2C_LuckDrawInfo_21016 build() {
            S2C_LuckDrawInfo_21016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckDrawInfo_21016 buildPartial() {
            S2C_LuckDrawInfo_21016 result = new S2C_LuckDrawInfo_21016(this);
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
            if (other instanceof S2C_LuckDrawInfo_21016) {
               return this.mergeFrom((S2C_LuckDrawInfo_21016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckDrawInfo_21016 other) {
            if (other == ActivityQiXiMsg.S2C_LuckDrawInfo_21016.getDefaultInstance()) {
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
                     this.seniorRewardsBuilder_ = ActivityQiXiMsg.S2C_LuckDrawInfo_21016.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
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
            S2C_LuckDrawInfo_21016 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckDrawInfo_21016)ActivityQiXiMsg.S2C_LuckDrawInfo_21016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckDrawInfo_21016)e.getUnfinishedMessage();
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
               this.hadRewardId_ = ActivityQiXiMsg.S2C_LuckDrawInfo_21016.mutableCopy(this.hadRewardId_);
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
            this.hadRewardId_ = ActivityQiXiMsg.S2C_LuckDrawInfo_21016.emptyIntList();
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

   public static final class C2S_Draw_21017 extends GeneratedMessageV3 implements C2S_Draw_21017OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Draw_21017 DEFAULT_INSTANCE = new C2S_Draw_21017();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Draw_21017> PARSER = new AbstractParser<C2S_Draw_21017>() {
         public C2S_Draw_21017 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Draw_21017(input, extensionRegistry);
         }
      };

      private C2S_Draw_21017(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Draw_21017() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Draw_21017();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Draw_21017(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_Draw_21017_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_Draw_21017_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_21017.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Draw_21017)) {
            return super.equals(obj);
         } else {
            C2S_Draw_21017 other = (C2S_Draw_21017)obj;
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

      public static C2S_Draw_21017 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Draw_21017)PARSER.parseFrom(data);
      }

      public static C2S_Draw_21017 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_21017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_21017 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Draw_21017)PARSER.parseFrom(data);
      }

      public static C2S_Draw_21017 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_21017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_21017 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Draw_21017)PARSER.parseFrom(data);
      }

      public static C2S_Draw_21017 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_21017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_21017 parseFrom(InputStream input) throws IOException {
         return (C2S_Draw_21017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_21017 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_21017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_21017 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Draw_21017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Draw_21017 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_21017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_21017 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Draw_21017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_21017 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_21017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Draw_21017 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Draw_21017 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Draw_21017> parser() {
         return PARSER;
      }

      public Parser<C2S_Draw_21017> getParserForType() {
         return PARSER;
      }

      public C2S_Draw_21017 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Draw_21017OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_Draw_21017_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_Draw_21017_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_21017.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_Draw_21017.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_Draw_21017_descriptor;
         }

         public C2S_Draw_21017 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_Draw_21017.getDefaultInstance();
         }

         public C2S_Draw_21017 build() {
            C2S_Draw_21017 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Draw_21017 buildPartial() {
            C2S_Draw_21017 result = new C2S_Draw_21017(this);
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
            if (other instanceof C2S_Draw_21017) {
               return this.mergeFrom((C2S_Draw_21017)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Draw_21017 other) {
            if (other == ActivityQiXiMsg.C2S_Draw_21017.getDefaultInstance()) {
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
            C2S_Draw_21017 parsedMessage = null;

            try {
               parsedMessage = (C2S_Draw_21017)ActivityQiXiMsg.C2S_Draw_21017.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Draw_21017)e.getUnfinishedMessage();
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

   public static final class S2C_Draw_21018 extends GeneratedMessageV3 implements S2C_Draw_21018OrBuilder {
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
      private static final S2C_Draw_21018 DEFAULT_INSTANCE = new S2C_Draw_21018();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Draw_21018> PARSER = new AbstractParser<S2C_Draw_21018>() {
         public S2C_Draw_21018 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Draw_21018(input, extensionRegistry);
         }
      };

      private S2C_Draw_21018(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Draw_21018() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Draw_21018();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Draw_21018(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_Draw_21018_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_Draw_21018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_21018.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Draw_21018)) {
            return super.equals(obj);
         } else {
            S2C_Draw_21018 other = (S2C_Draw_21018)obj;
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

      public static S2C_Draw_21018 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Draw_21018)PARSER.parseFrom(data);
      }

      public static S2C_Draw_21018 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_21018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_21018 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Draw_21018)PARSER.parseFrom(data);
      }

      public static S2C_Draw_21018 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_21018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_21018 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Draw_21018)PARSER.parseFrom(data);
      }

      public static S2C_Draw_21018 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_21018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_21018 parseFrom(InputStream input) throws IOException {
         return (S2C_Draw_21018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_21018 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_21018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_21018 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Draw_21018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Draw_21018 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_21018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_21018 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Draw_21018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_21018 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_21018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Draw_21018 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Draw_21018 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Draw_21018> parser() {
         return PARSER;
      }

      public Parser<S2C_Draw_21018> getParserForType() {
         return PARSER;
      }

      public S2C_Draw_21018 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Draw_21018OrBuilder {
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_Draw_21018_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_Draw_21018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_21018.class, Builder.class);
         }

         private Builder() {
            this.id_ = ActivityQiXiMsg.S2C_Draw_21018.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = ActivityQiXiMsg.S2C_Draw_21018.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.S2C_Draw_21018.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.id_ = ActivityQiXiMsg.S2C_Draw_21018.emptyIntList();
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_Draw_21018_descriptor;
         }

         public S2C_Draw_21018 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_Draw_21018.getDefaultInstance();
         }

         public S2C_Draw_21018 build() {
            S2C_Draw_21018 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Draw_21018 buildPartial() {
            S2C_Draw_21018 result = new S2C_Draw_21018(this);
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
            if (other instanceof S2C_Draw_21018) {
               return this.mergeFrom((S2C_Draw_21018)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Draw_21018 other) {
            if (other == ActivityQiXiMsg.S2C_Draw_21018.getDefaultInstance()) {
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
                     this.seniorNumBuilder_ = ActivityQiXiMsg.S2C_Draw_21018.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
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
            S2C_Draw_21018 parsedMessage = null;

            try {
               parsedMessage = (S2C_Draw_21018)ActivityQiXiMsg.S2C_Draw_21018.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Draw_21018)e.getUnfinishedMessage();
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
               this.id_ = ActivityQiXiMsg.S2C_Draw_21018.mutableCopy(this.id_);
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
            this.id_ = ActivityQiXiMsg.S2C_Draw_21018.emptyIntList();
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

   public static final class C2S_OpenReward_21019 extends GeneratedMessageV3 implements C2S_OpenReward_21019OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenReward_21019 DEFAULT_INSTANCE = new C2S_OpenReward_21019();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenReward_21019> PARSER = new AbstractParser<C2S_OpenReward_21019>() {
         public C2S_OpenReward_21019 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenReward_21019(input, extensionRegistry);
         }
      };

      private C2S_OpenReward_21019(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenReward_21019() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenReward_21019();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenReward_21019(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_OpenReward_21019_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_OpenReward_21019_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_21019.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenReward_21019)) {
            return super.equals(obj);
         } else {
            C2S_OpenReward_21019 other = (C2S_OpenReward_21019)obj;
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

      public static C2S_OpenReward_21019 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21019)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_21019 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_21019 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21019)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_21019 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_21019 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21019)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_21019 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_21019 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_21019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_21019 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_21019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_21019 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_21019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_21019 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_21019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_21019 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenReward_21019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_21019 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_21019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenReward_21019 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenReward_21019 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenReward_21019> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenReward_21019> getParserForType() {
         return PARSER;
      }

      public C2S_OpenReward_21019 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenReward_21019OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_OpenReward_21019_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_OpenReward_21019_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_21019.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_OpenReward_21019.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_OpenReward_21019_descriptor;
         }

         public C2S_OpenReward_21019 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_OpenReward_21019.getDefaultInstance();
         }

         public C2S_OpenReward_21019 build() {
            C2S_OpenReward_21019 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenReward_21019 buildPartial() {
            C2S_OpenReward_21019 result = new C2S_OpenReward_21019(this);
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
            if (other instanceof C2S_OpenReward_21019) {
               return this.mergeFrom((C2S_OpenReward_21019)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenReward_21019 other) {
            if (other == ActivityQiXiMsg.C2S_OpenReward_21019.getDefaultInstance()) {
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
            C2S_OpenReward_21019 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenReward_21019)ActivityQiXiMsg.C2S_OpenReward_21019.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenReward_21019)e.getUnfinishedMessage();
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

   public static final class S2C_OpenReward_21020 extends GeneratedMessageV3 implements S2C_OpenReward_21020OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenReward_21020 DEFAULT_INSTANCE = new S2C_OpenReward_21020();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenReward_21020> PARSER = new AbstractParser<S2C_OpenReward_21020>() {
         public S2C_OpenReward_21020 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenReward_21020(input, extensionRegistry);
         }
      };

      private S2C_OpenReward_21020(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenReward_21020() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenReward_21020();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenReward_21020(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_OpenReward_21020_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_OpenReward_21020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_21020.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenReward_21020)) {
            return super.equals(obj);
         } else {
            S2C_OpenReward_21020 other = (S2C_OpenReward_21020)obj;
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

      public static S2C_OpenReward_21020 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21020)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_21020 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_21020 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21020)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_21020 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_21020 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21020)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_21020 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_21020 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_21020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_21020 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_21020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_21020 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_21020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_21020 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_21020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_21020 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenReward_21020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_21020 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_21020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenReward_21020 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenReward_21020 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenReward_21020> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenReward_21020> getParserForType() {
         return PARSER;
      }

      public S2C_OpenReward_21020 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenReward_21020OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_OpenReward_21020_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_OpenReward_21020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_21020.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.S2C_OpenReward_21020.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_OpenReward_21020_descriptor;
         }

         public S2C_OpenReward_21020 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_OpenReward_21020.getDefaultInstance();
         }

         public S2C_OpenReward_21020 build() {
            S2C_OpenReward_21020 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenReward_21020 buildPartial() {
            S2C_OpenReward_21020 result = new S2C_OpenReward_21020(this);
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
            if (other instanceof S2C_OpenReward_21020) {
               return this.mergeFrom((S2C_OpenReward_21020)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenReward_21020 other) {
            if (other == ActivityQiXiMsg.S2C_OpenReward_21020.getDefaultInstance()) {
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
            S2C_OpenReward_21020 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenReward_21020)ActivityQiXiMsg.S2C_OpenReward_21020.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenReward_21020)e.getUnfinishedMessage();
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

   public static final class C2S_DrawRecord_21021 extends GeneratedMessageV3 implements C2S_DrawRecord_21021OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_21021 DEFAULT_INSTANCE = new C2S_DrawRecord_21021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_21021> PARSER = new AbstractParser<C2S_DrawRecord_21021>() {
         public C2S_DrawRecord_21021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_21021(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_21021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_21021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_21021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_21021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrawRecord_21021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrawRecord_21021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_21021.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_21021)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_21021 other = (C2S_DrawRecord_21021)obj;
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

      public static C2S_DrawRecord_21021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21021)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_21021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_21021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21021)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_21021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_21021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21021)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_21021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_21021 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_21021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_21021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_21021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_21021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_21021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_21021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_21021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_21021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_21021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_21021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_21021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_21021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_21021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_21021> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_21021> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_21021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_21021OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrawRecord_21021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrawRecord_21021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_21021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_DrawRecord_21021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrawRecord_21021_descriptor;
         }

         public C2S_DrawRecord_21021 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_DrawRecord_21021.getDefaultInstance();
         }

         public C2S_DrawRecord_21021 build() {
            C2S_DrawRecord_21021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_21021 buildPartial() {
            C2S_DrawRecord_21021 result = new C2S_DrawRecord_21021(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_DrawRecord_21021) {
               return this.mergeFrom((C2S_DrawRecord_21021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_21021 other) {
            if (other == ActivityQiXiMsg.C2S_DrawRecord_21021.getDefaultInstance()) {
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
            C2S_DrawRecord_21021 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_21021)ActivityQiXiMsg.C2S_DrawRecord_21021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_21021)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_21022 extends GeneratedMessageV3 implements S2C_DrawRecord_21022OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<MyDrawRecord> myRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_21022 DEFAULT_INSTANCE = new S2C_DrawRecord_21022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_21022> PARSER = new AbstractParser<S2C_DrawRecord_21022>() {
         public S2C_DrawRecord_21022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_21022(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_21022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_21022() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_21022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_21022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(ActivityQiXiMsg.MyDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrawRecord_21022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrawRecord_21022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_21022.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawRecord_21022)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_21022 other = (S2C_DrawRecord_21022)obj;
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

      public static S2C_DrawRecord_21022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21022)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_21022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_21022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21022)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_21022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_21022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21022)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_21022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_21022 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_21022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_21022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_21022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_21022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_21022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_21022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_21022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_21022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_21022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_21022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_21022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_21022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_21022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_21022> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_21022> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_21022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_21022OrBuilder {
         private int bitField0_;
         private List<MyDrawRecord> myRecord_;
         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> myRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrawRecord_21022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrawRecord_21022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_21022.class, Builder.class);
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
            if (ActivityQiXiMsg.S2C_DrawRecord_21022.alwaysUseFieldBuilders) {
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrawRecord_21022_descriptor;
         }

         public S2C_DrawRecord_21022 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_DrawRecord_21022.getDefaultInstance();
         }

         public S2C_DrawRecord_21022 build() {
            S2C_DrawRecord_21022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_21022 buildPartial() {
            S2C_DrawRecord_21022 result = new S2C_DrawRecord_21022(this);
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
            if (other instanceof S2C_DrawRecord_21022) {
               return this.mergeFrom((S2C_DrawRecord_21022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_21022 other) {
            if (other == ActivityQiXiMsg.S2C_DrawRecord_21022.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = ActivityQiXiMsg.S2C_DrawRecord_21022.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
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
            S2C_DrawRecord_21022 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_21022)ActivityQiXiMsg.S2C_DrawRecord_21022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_21022)e.getUnfinishedMessage();
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
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(ActivityQiXiMsg.MyDrawRecord.getDefaultInstance());
         }

         public MyDrawRecord.Builder addMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, ActivityQiXiMsg.MyDrawRecord.getDefaultInstance());
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

   public static final class C2S_ServerDrawRecord_21023 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_21023OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_21023 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_21023();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_21023> PARSER = new AbstractParser<C2S_ServerDrawRecord_21023>() {
         public C2S_ServerDrawRecord_21023 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_21023(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_21023(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_21023() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_21023();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_21023(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ServerDrawRecord_21023_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ServerDrawRecord_21023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_21023.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_21023)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_21023 other = (C2S_ServerDrawRecord_21023)obj;
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

      public static C2S_ServerDrawRecord_21023 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21023)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_21023 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_21023 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21023)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_21023 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_21023 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21023)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_21023 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_21023 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_21023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_21023 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_21023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_21023 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_21023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_21023 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_21023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_21023 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_21023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_21023 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_21023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_21023 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_21023 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_21023> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_21023> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_21023 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_21023OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ServerDrawRecord_21023_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ServerDrawRecord_21023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_21023.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_ServerDrawRecord_21023.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_ServerDrawRecord_21023_descriptor;
         }

         public C2S_ServerDrawRecord_21023 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_ServerDrawRecord_21023.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_21023 build() {
            C2S_ServerDrawRecord_21023 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_21023 buildPartial() {
            C2S_ServerDrawRecord_21023 result = new C2S_ServerDrawRecord_21023(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ServerDrawRecord_21023) {
               return this.mergeFrom((C2S_ServerDrawRecord_21023)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_21023 other) {
            if (other == ActivityQiXiMsg.C2S_ServerDrawRecord_21023.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_21023 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_21023)ActivityQiXiMsg.C2S_ServerDrawRecord_21023.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_21023)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_21024 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_21024OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_21024 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_21024();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_21024> PARSER = new AbstractParser<S2C_ServerDrawRecord_21024>() {
         public S2C_ServerDrawRecord_21024 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_21024(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_21024(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_21024() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_21024();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_21024(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.serverRecord_.add(input.readMessage(ActivityQiXiMsg.ServerDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ServerDrawRecord_21024_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ServerDrawRecord_21024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_21024.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_21024)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_21024 other = (S2C_ServerDrawRecord_21024)obj;
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

      public static S2C_ServerDrawRecord_21024 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21024)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_21024 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_21024 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21024)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_21024 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_21024 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21024)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_21024 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_21024 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_21024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_21024 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_21024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_21024 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_21024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_21024 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_21024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_21024 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_21024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_21024 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_21024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_21024 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_21024 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_21024> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_21024> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_21024 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_21024OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ServerDrawRecord_21024_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ServerDrawRecord_21024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_21024.class, Builder.class);
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
            if (ActivityQiXiMsg.S2C_ServerDrawRecord_21024.alwaysUseFieldBuilders) {
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_ServerDrawRecord_21024_descriptor;
         }

         public S2C_ServerDrawRecord_21024 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_ServerDrawRecord_21024.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_21024 build() {
            S2C_ServerDrawRecord_21024 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_21024 buildPartial() {
            S2C_ServerDrawRecord_21024 result = new S2C_ServerDrawRecord_21024(this);
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
            if (other instanceof S2C_ServerDrawRecord_21024) {
               return this.mergeFrom((S2C_ServerDrawRecord_21024)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_21024 other) {
            if (other == ActivityQiXiMsg.S2C_ServerDrawRecord_21024.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = ActivityQiXiMsg.S2C_ServerDrawRecord_21024.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_21024 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_21024)ActivityQiXiMsg.S2C_ServerDrawRecord_21024.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_21024)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(ActivityQiXiMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, ActivityQiXiMsg.ServerDrawRecord.getDefaultInstance());
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_MyDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            if (ActivityQiXiMsg.MyDrawRecord.alwaysUseFieldBuilders) {
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         public MyDrawRecord getDefaultInstanceForType() {
            return ActivityQiXiMsg.MyDrawRecord.getDefaultInstance();
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
            if (other == ActivityQiXiMsg.MyDrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = ActivityQiXiMsg.MyDrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
               parsedMessage = (MyDrawRecord)ActivityQiXiMsg.MyDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = ActivityQiXiMsg.MyDrawRecord.getDefaultInstance().getPlayerName();
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (ActivityQiXiMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return ActivityQiXiMsg.ServerDrawRecord.getDefaultInstance();
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
            if (other == ActivityQiXiMsg.ServerDrawRecord.getDefaultInstance()) {
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
               parsedMessage = (ServerDrawRecord)ActivityQiXiMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = ActivityQiXiMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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

   public static final class C2S_DrumLevelReward_21025 extends GeneratedMessageV3 implements C2S_DrumLevelReward_21025OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTID_FIELD_NUMBER = 1;
      private int gotId_;
      private byte memoizedIsInitialized;
      private static final C2S_DrumLevelReward_21025 DEFAULT_INSTANCE = new C2S_DrumLevelReward_21025();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrumLevelReward_21025> PARSER = new AbstractParser<C2S_DrumLevelReward_21025>() {
         public C2S_DrumLevelReward_21025 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrumLevelReward_21025(input, extensionRegistry);
         }
      };

      private C2S_DrumLevelReward_21025(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrumLevelReward_21025() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrumLevelReward_21025();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrumLevelReward_21025(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gotId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrumLevelReward_21025_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrumLevelReward_21025_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrumLevelReward_21025.class, Builder.class);
      }

      public boolean hasGotId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGotId() {
         return this.gotId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGotId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.gotId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gotId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DrumLevelReward_21025)) {
            return super.equals(obj);
         } else {
            C2S_DrumLevelReward_21025 other = (C2S_DrumLevelReward_21025)obj;
            if (this.hasGotId() != other.hasGotId()) {
               return false;
            } else if (this.hasGotId() && this.getGotId() != other.getGotId()) {
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
            if (this.hasGotId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DrumLevelReward_21025 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_21025)PARSER.parseFrom(data);
      }

      public static C2S_DrumLevelReward_21025 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_21025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrumLevelReward_21025 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_21025)PARSER.parseFrom(data);
      }

      public static C2S_DrumLevelReward_21025 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_21025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrumLevelReward_21025 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_21025)PARSER.parseFrom(data);
      }

      public static C2S_DrumLevelReward_21025 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_21025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrumLevelReward_21025 parseFrom(InputStream input) throws IOException {
         return (C2S_DrumLevelReward_21025)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrumLevelReward_21025 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrumLevelReward_21025)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrumLevelReward_21025 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrumLevelReward_21025)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrumLevelReward_21025 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrumLevelReward_21025)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrumLevelReward_21025 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrumLevelReward_21025)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrumLevelReward_21025 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrumLevelReward_21025)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrumLevelReward_21025 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrumLevelReward_21025 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrumLevelReward_21025> parser() {
         return PARSER;
      }

      public Parser<C2S_DrumLevelReward_21025> getParserForType() {
         return PARSER;
      }

      public C2S_DrumLevelReward_21025 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrumLevelReward_21025OrBuilder {
         private int bitField0_;
         private int gotId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrumLevelReward_21025_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrumLevelReward_21025_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrumLevelReward_21025.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.C2S_DrumLevelReward_21025.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_C2S_DrumLevelReward_21025_descriptor;
         }

         public C2S_DrumLevelReward_21025 getDefaultInstanceForType() {
            return ActivityQiXiMsg.C2S_DrumLevelReward_21025.getDefaultInstance();
         }

         public C2S_DrumLevelReward_21025 build() {
            C2S_DrumLevelReward_21025 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrumLevelReward_21025 buildPartial() {
            C2S_DrumLevelReward_21025 result = new C2S_DrumLevelReward_21025(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gotId_ = this.gotId_;
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
            if (other instanceof C2S_DrumLevelReward_21025) {
               return this.mergeFrom((C2S_DrumLevelReward_21025)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrumLevelReward_21025 other) {
            if (other == ActivityQiXiMsg.C2S_DrumLevelReward_21025.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGotId()) {
                  this.setGotId(other.getGotId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGotId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_DrumLevelReward_21025 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrumLevelReward_21025)ActivityQiXiMsg.C2S_DrumLevelReward_21025.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrumLevelReward_21025)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGotId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGotId() {
            return this.gotId_;
         }

         public Builder setGotId(int value) {
            this.bitField0_ |= 1;
            this.gotId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotId() {
            this.bitField0_ &= -2;
            this.gotId_ = 0;
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

   public static final class S2C_DrumLevelReward_21026 extends GeneratedMessageV3 implements S2C_DrumLevelReward_21026OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTID_FIELD_NUMBER = 1;
      private int gotId_;
      private byte memoizedIsInitialized;
      private static final S2C_DrumLevelReward_21026 DEFAULT_INSTANCE = new S2C_DrumLevelReward_21026();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrumLevelReward_21026> PARSER = new AbstractParser<S2C_DrumLevelReward_21026>() {
         public S2C_DrumLevelReward_21026 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrumLevelReward_21026(input, extensionRegistry);
         }
      };

      private S2C_DrumLevelReward_21026(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrumLevelReward_21026() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrumLevelReward_21026();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrumLevelReward_21026(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gotId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrumLevelReward_21026_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrumLevelReward_21026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrumLevelReward_21026.class, Builder.class);
      }

      public boolean hasGotId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGotId() {
         return this.gotId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGotId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.gotId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gotId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DrumLevelReward_21026)) {
            return super.equals(obj);
         } else {
            S2C_DrumLevelReward_21026 other = (S2C_DrumLevelReward_21026)obj;
            if (this.hasGotId() != other.hasGotId()) {
               return false;
            } else if (this.hasGotId() && this.getGotId() != other.getGotId()) {
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
            if (this.hasGotId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DrumLevelReward_21026 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_21026)PARSER.parseFrom(data);
      }

      public static S2C_DrumLevelReward_21026 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_21026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrumLevelReward_21026 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_21026)PARSER.parseFrom(data);
      }

      public static S2C_DrumLevelReward_21026 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_21026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrumLevelReward_21026 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_21026)PARSER.parseFrom(data);
      }

      public static S2C_DrumLevelReward_21026 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_21026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrumLevelReward_21026 parseFrom(InputStream input) throws IOException {
         return (S2C_DrumLevelReward_21026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrumLevelReward_21026 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrumLevelReward_21026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrumLevelReward_21026 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrumLevelReward_21026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrumLevelReward_21026 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrumLevelReward_21026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrumLevelReward_21026 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrumLevelReward_21026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrumLevelReward_21026 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrumLevelReward_21026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrumLevelReward_21026 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrumLevelReward_21026 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrumLevelReward_21026> parser() {
         return PARSER;
      }

      public Parser<S2C_DrumLevelReward_21026> getParserForType() {
         return PARSER;
      }

      public S2C_DrumLevelReward_21026 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrumLevelReward_21026OrBuilder {
         private int bitField0_;
         private int gotId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrumLevelReward_21026_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrumLevelReward_21026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrumLevelReward_21026.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityQiXiMsg.S2C_DrumLevelReward_21026.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityQiXiMsg.internal_static_activityQiXi_com_gzbz_protobuf_S2C_DrumLevelReward_21026_descriptor;
         }

         public S2C_DrumLevelReward_21026 getDefaultInstanceForType() {
            return ActivityQiXiMsg.S2C_DrumLevelReward_21026.getDefaultInstance();
         }

         public S2C_DrumLevelReward_21026 build() {
            S2C_DrumLevelReward_21026 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrumLevelReward_21026 buildPartial() {
            S2C_DrumLevelReward_21026 result = new S2C_DrumLevelReward_21026(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gotId_ = this.gotId_;
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
            if (other instanceof S2C_DrumLevelReward_21026) {
               return this.mergeFrom((S2C_DrumLevelReward_21026)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrumLevelReward_21026 other) {
            if (other == ActivityQiXiMsg.S2C_DrumLevelReward_21026.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGotId()) {
                  this.setGotId(other.getGotId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGotId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DrumLevelReward_21026 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrumLevelReward_21026)ActivityQiXiMsg.S2C_DrumLevelReward_21026.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrumLevelReward_21026)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGotId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGotId() {
            return this.gotId_;
         }

         public Builder setGotId(int value) {
            this.bitField0_ |= 1;
            this.gotId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotId() {
            this.bitField0_ &= -2;
            this.gotId_ = 0;
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

   public interface C2S_ActivityInfo_21001OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BeatDrumInfo_21009OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BeatDrum_21011OrBuilder extends MessageOrBuilder {
      boolean hasMusicId();

      int getMusicId();

      boolean hasScore();

      int getScore();
   }

   public interface C2S_DrawRecord_21021OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Draw_21017OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_DrumLevelReward_21025OrBuilder extends MessageOrBuilder {
      boolean hasGotId();

      int getGotId();
   }

   public interface C2S_FancyReward_21013OrBuilder extends MessageOrBuilder {
      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_LuckDrawInfo_21015OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenReward_21019OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ReceiveShopAddUpReward_21005OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ServerDrawRecord_21023OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShopAddUpInfo_21003OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SignTotalInfo_21006OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Sign_21008OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface MusicDataOrBuilder extends MessageOrBuilder {
      boolean hasMusicId();

      int getMusicId();

      boolean hasTopScore();

      int getTopScore();

      List<Integer> getGotIdList();

      int getGotIdCount();

      int getGotId(int index);
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

   public interface S2C_ActivityInfo_21002OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      boolean hasActivityDay();

      int getActivityDay();
   }

   public interface S2C_BeatDrumInfo_21010OrBuilder extends MessageOrBuilder {
      boolean hasBeatCount();

      int getBeatCount();

      List<MusicData> getMusicDataList();

      MusicData getMusicData(int index);

      int getMusicDataCount();

      List<? extends MusicDataOrBuilder> getMusicDataOrBuilderList();

      MusicDataOrBuilder getMusicDataOrBuilder(int index);

      boolean hasTotalScore();

      int getTotalScore();

      boolean hasIsRed();

      boolean getIsRed();
   }

   public interface S2C_BeatDrum_21012OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasMusicId();

      int getMusicId();

      boolean hasBeatCount();

      int getBeatCount();

      boolean hasTopScore();

      int getTopScore();

      List<Integer> getGotScoreList();

      int getGotScoreCount();

      int getGotScore(int index);
   }

   public interface S2C_DrawRecord_21022OrBuilder extends MessageOrBuilder {
      List<MyDrawRecord> getMyRecordList();

      MyDrawRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList();

      MyDrawRecordOrBuilder getMyRecordOrBuilder(int index);
   }

   public interface S2C_Draw_21018OrBuilder extends MessageOrBuilder {
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

   public interface S2C_DrumLevelReward_21026OrBuilder extends MessageOrBuilder {
      boolean hasGotId();

      int getGotId();
   }

   public interface S2C_FancyReward_21014OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface S2C_LuckDrawInfo_21016OrBuilder extends MessageOrBuilder {
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

   public interface S2C_OpenReward_21020OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_ServerDrawRecord_21024OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_ShopAddUpInfo_21004OrBuilder extends MessageOrBuilder {
      boolean hasDailyRecharge();

      int getDailyRecharge();

      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);
   }

   public interface S2C_SignTotalInfo_21007OrBuilder extends MessageOrBuilder {
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
