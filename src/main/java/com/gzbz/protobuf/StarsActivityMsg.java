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

public final class StarsActivityMsg {
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_ActivityInfo_16401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_ActivityInfo_16401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_ActivityInfo_16402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_ActivityInfo_16402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_DrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_Draw_16405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_Draw_16405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_Draw_16406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_Draw_16406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_OpenReward_16407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_OpenReward_16407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_OpenReward_16408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_OpenReward_16408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_DrawRecord_16409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_DrawRecord_16409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_DrawRecord_16410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_DrawRecord_16410_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16411_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16411_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16412_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16412_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_MyDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_FancyReward_16413_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_FancyReward_16413_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_FancyReward_16414_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_FancyReward_16414_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_Pray_16421_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_Pray_16421_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_Pray_16422_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_Pray_16422_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16424_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16424_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayInfo_16426_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayInfo_16426_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskList_16428_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskList_16428_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_SkyLampRechargeTotalInfo_16451_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_SkyLampRechargeTotalInfo_16451_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_SkyLampRechargeTotalInfo_16452_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_SkyLampRechargeTotalInfo_16452_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveKmtdReward_16453_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveKmtdReward_16453_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveKmtdReward_16454_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveKmtdReward_16454_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_WishStarBlessingTotalInfo_16455_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_WishStarBlessingTotalInfo_16455_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_WishStarBlessingTotalInfo_16456_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_WishStarBlessingTotalInfo_16456_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveWishStarBlessingReward_16457_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveWishStarBlessingReward_16457_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveWishStarBlessingReward_16458_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveWishStarBlessingReward_16458_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private StarsActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013StarsActivity.proto\u0012\u001fstarsActivity.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0018\n\u0016C2S_ActivityInfo_16401\"K\n\u0016S2C_ActivityInfo_16402\u0012\u0017\n\u000factivityOpenDay\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010severActivityDay\u0018\u0002 \u0002(\u0005\"X\n\nDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"\u0018\n\u0016C2S_LuckDrawInfo_16403\"×\u0001\n\u0016S2C_LuckDrawInfo_16404\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bhadRewardId\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bstagEndTime\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0014\n\flotteryStage\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007fancyId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\u001e\n\u000eC2S_Draw_16405\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u00ad\u0001\n\u000eS2C_Draw_16406\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bisHaveFancy\u0018\u0006 \u0001(\b\u0012\u0010\n\btargetId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\"\n\u0014C2S_OpenReward_16407\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_OpenReward_16408\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_DrawRecord_16409\"W\n\u0014S2C_DrawRecord_16410\u0012?\n\bmyRecord\u0018\u0001 \u0003(\u000b2-.starsActivity.com.gzbz.protobuf.MyDrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_16411\"e\n\u001aS2C_ServerDrawRecord_16412\u0012G\n\fserverRecord\u0018\u0001 \u0003(\u000b21.starsActivity.com.gzbz.protobuf.ServerDrawRecord\"Z\n\fMyDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"c\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\")\n\u0015C2S_FancyReward_16413\u0012\u0010\n\btargetId\u0018\u0001 \u0002(\u0005\"9\n\u0015S2C_FancyReward_16414\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"\u0010\n\u000eC2S_Pray_16421\"!\n\u000eS2C_Pray_16422\u0012\u000f\n\u0007prayNum\u0018\u0001 \u0002(\u0005\"N\n\u0018S2C_PrayTaskNotify_16424\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"%\n\u0012S2C_PrayInfo_16426\u0012\u000f\n\u0007prayNum\u0018\u0001 \u0002(\u0005\"L\n\u0016S2C_PrayTaskList_16428\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"$\n\"C2S_SkyLampRechargeTotalInfo_16451\"e\n\"S2C_SkyLampRechargeTotalInfo_16452\u0012\u0012\n\ngotRewards\u0018\u0001 \u0003(\u0005\u0012\u0015\n\rstageRecharge\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fstageEndTime\u0018\u0003 \u0002(\u0003\"/\n\u001bC2S_ReceiveKmtdReward_16453\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\"\u001d\n\u001bS2C_ReceiveKmtdReward_16454\"%\n#C2S_WishStarBlessingTotalInfo_16455\"Ò\u0001\n#S2C_WishStarBlessingTotalInfo_16456\u0012\u0016\n\u000eunlockStageNum\u0018\u0001 \u0002(\u0005\u0012\u001b\n\u0013canReceiveRewardIds\u0018\u0002 \u0003(\u0005\u0012\u001b\n\u0013hasReceiveRewardIds\u0018\u0003 \u0003(\u0005\u0012Y\n\u0017nextUnlockReceiveReward\u0018\u0004 \u0003(\u000b28.starsActivity.com.gzbz.protobuf.NextUnlockReceiveReward\"=\n\u0017NextUnlockReceiveReward\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bprogress\u0018\u0002 \u0002(\u0001\";\n'C2S_ReceiveWishStarBlessingReward_16457\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\")\n'S2C_ReceiveWishStarBlessingReward_16458B'\n\u0011com.gzbz.protobufB\u0010StarsActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_ActivityInfo_16401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_ActivityInfo_16401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_ActivityInfo_16401_descriptor, new String[0]);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_ActivityInfo_16402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_ActivityInfo_16402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_ActivityInfo_16402_descriptor, new String[]{"ActivityOpenDay", "SeverActivityDay"});
      internal_static_starsActivity_com_gzbz_protobuf_DrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_starsActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_DrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16403_descriptor, new String[0]);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16404_descriptor, new String[]{"DrawTimes", "HadRewardId", "StagEndTime", "RecruitNum", "SeniorRewards", "LotteryStage", "FancyId", "FancyGroupDrawTimes"});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_Draw_16405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_Draw_16405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_Draw_16405_descriptor, new String[]{"Type"});
      internal_static_starsActivity_com_gzbz_protobuf_S2C_Draw_16406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_Draw_16406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_Draw_16406_descriptor, new String[]{"DrawTimes", "Id", "RecruitNum", "SeniorNum", "IsHaveFancy", "TargetId", "FancyGroupDrawTimes"});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_OpenReward_16407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_OpenReward_16407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_OpenReward_16407_descriptor, new String[]{"Id"});
      internal_static_starsActivity_com_gzbz_protobuf_S2C_OpenReward_16408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_OpenReward_16408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_OpenReward_16408_descriptor, new String[]{"Id"});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_DrawRecord_16409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_DrawRecord_16409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_DrawRecord_16409_descriptor, new String[0]);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_DrawRecord_16410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_DrawRecord_16410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_DrawRecord_16410_descriptor, new String[]{"MyRecord"});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16411_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16411_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16411_descriptor, new String[0]);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16412_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16412_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16412_descriptor, new String[]{"ServerRecord"});
      internal_static_starsActivity_com_gzbz_protobuf_MyDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_starsActivity_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_MyDrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_starsActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_starsActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId"});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_FancyReward_16413_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_FancyReward_16413_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_FancyReward_16413_descriptor, new String[]{"TargetId"});
      internal_static_starsActivity_com_gzbz_protobuf_S2C_FancyReward_16414_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_FancyReward_16414_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_FancyReward_16414_descriptor, new String[]{"Result", "TargetId"});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_Pray_16421_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_Pray_16421_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_Pray_16421_descriptor, new String[0]);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_Pray_16422_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_Pray_16422_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_Pray_16422_descriptor, new String[]{"PrayNum"});
      internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16424_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16424_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16424_descriptor, new String[]{"Task"});
      internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayInfo_16426_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayInfo_16426_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayInfo_16426_descriptor, new String[]{"PrayNum"});
      internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskList_16428_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskList_16428_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskList_16428_descriptor, new String[]{"Task"});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_SkyLampRechargeTotalInfo_16451_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_SkyLampRechargeTotalInfo_16451_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_SkyLampRechargeTotalInfo_16451_descriptor, new String[0]);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_SkyLampRechargeTotalInfo_16452_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_SkyLampRechargeTotalInfo_16452_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_SkyLampRechargeTotalInfo_16452_descriptor, new String[]{"GotRewards", "StageRecharge", "StageEndTime"});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveKmtdReward_16453_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveKmtdReward_16453_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveKmtdReward_16453_descriptor, new String[]{"RewardId"});
      internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveKmtdReward_16454_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveKmtdReward_16454_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveKmtdReward_16454_descriptor, new String[0]);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_WishStarBlessingTotalInfo_16455_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_WishStarBlessingTotalInfo_16455_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_WishStarBlessingTotalInfo_16455_descriptor, new String[0]);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_WishStarBlessingTotalInfo_16456_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_WishStarBlessingTotalInfo_16456_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_WishStarBlessingTotalInfo_16456_descriptor, new String[]{"UnlockStageNum", "CanReceiveRewardIds", "HasReceiveRewardIds", "NextUnlockReceiveReward"});
      internal_static_starsActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_starsActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor, new String[]{"RewardId", "Progress"});
      internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveWishStarBlessingReward_16457_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveWishStarBlessingReward_16457_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveWishStarBlessingReward_16457_descriptor, new String[]{"RewardId"});
      internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveWishStarBlessingReward_16458_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveWishStarBlessingReward_16458_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveWishStarBlessingReward_16458_descriptor, new String[0]);
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_16401 extends GeneratedMessageV3 implements C2S_ActivityInfo_16401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_16401 DEFAULT_INSTANCE = new C2S_ActivityInfo_16401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_16401> PARSER = new AbstractParser<C2S_ActivityInfo_16401>() {
         public C2S_ActivityInfo_16401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_16401(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_16401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_16401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_16401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_16401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ActivityInfo_16401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ActivityInfo_16401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_16401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_16401)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_16401 other = (C2S_ActivityInfo_16401)obj;
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

      public static C2S_ActivityInfo_16401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16401)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_16401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_16401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16401)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_16401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_16401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16401)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_16401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_16401 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_16401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_16401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_16401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_16401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_16401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_16401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_16401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_16401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_16401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_16401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_16401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_16401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_16401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_16401> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_16401> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_16401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_16401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ActivityInfo_16401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ActivityInfo_16401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_16401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_ActivityInfo_16401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ActivityInfo_16401_descriptor;
         }

         public C2S_ActivityInfo_16401 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_ActivityInfo_16401.getDefaultInstance();
         }

         public C2S_ActivityInfo_16401 build() {
            C2S_ActivityInfo_16401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_16401 buildPartial() {
            C2S_ActivityInfo_16401 result = new C2S_ActivityInfo_16401(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ActivityInfo_16401) {
               return this.mergeFrom((C2S_ActivityInfo_16401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_16401 other) {
            if (other == StarsActivityMsg.C2S_ActivityInfo_16401.getDefaultInstance()) {
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
            C2S_ActivityInfo_16401 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_16401)StarsActivityMsg.C2S_ActivityInfo_16401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_16401)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_16402 extends GeneratedMessageV3 implements S2C_ActivityInfo_16402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYOPENDAY_FIELD_NUMBER = 1;
      private int activityOpenDay_;
      public static final int SEVERACTIVITYDAY_FIELD_NUMBER = 2;
      private int severActivityDay_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_16402 DEFAULT_INSTANCE = new S2C_ActivityInfo_16402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_16402> PARSER = new AbstractParser<S2C_ActivityInfo_16402>() {
         public S2C_ActivityInfo_16402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_16402(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_16402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_16402() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_16402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_16402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityOpenDay_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.severActivityDay_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ActivityInfo_16402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ActivityInfo_16402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_16402.class, Builder.class);
      }

      public boolean hasActivityOpenDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityOpenDay() {
         return this.activityOpenDay_;
      }

      public boolean hasSeverActivityDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSeverActivityDay() {
         return this.severActivityDay_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSeverActivityDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityOpenDay_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.severActivityDay_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityOpenDay_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.severActivityDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_16402)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_16402 other = (S2C_ActivityInfo_16402)obj;
            if (this.hasActivityOpenDay() != other.hasActivityOpenDay()) {
               return false;
            } else if (this.hasActivityOpenDay() && this.getActivityOpenDay() != other.getActivityOpenDay()) {
               return false;
            } else if (this.hasSeverActivityDay() != other.hasSeverActivityDay()) {
               return false;
            } else if (this.hasSeverActivityDay() && this.getSeverActivityDay() != other.getSeverActivityDay()) {
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
            if (this.hasActivityOpenDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityOpenDay();
            }

            if (this.hasSeverActivityDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSeverActivityDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_16402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16402)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_16402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_16402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16402)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_16402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_16402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16402)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_16402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_16402 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_16402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_16402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_16402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_16402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_16402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_16402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_16402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_16402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_16402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_16402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_16402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_16402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_16402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_16402> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_16402> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_16402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_16402OrBuilder {
         private int bitField0_;
         private int activityOpenDay_;
         private int severActivityDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ActivityInfo_16402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ActivityInfo_16402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_16402.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_ActivityInfo_16402.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityOpenDay_ = 0;
            this.bitField0_ &= -2;
            this.severActivityDay_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ActivityInfo_16402_descriptor;
         }

         public S2C_ActivityInfo_16402 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_ActivityInfo_16402.getDefaultInstance();
         }

         public S2C_ActivityInfo_16402 build() {
            S2C_ActivityInfo_16402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_16402 buildPartial() {
            S2C_ActivityInfo_16402 result = new S2C_ActivityInfo_16402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityOpenDay_ = this.activityOpenDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.severActivityDay_ = this.severActivityDay_;
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
            if (other instanceof S2C_ActivityInfo_16402) {
               return this.mergeFrom((S2C_ActivityInfo_16402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_16402 other) {
            if (other == StarsActivityMsg.S2C_ActivityInfo_16402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityOpenDay()) {
                  this.setActivityOpenDay(other.getActivityOpenDay());
               }

               if (other.hasSeverActivityDay()) {
                  this.setSeverActivityDay(other.getSeverActivityDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityOpenDay()) {
               return false;
            } else {
               return this.hasSeverActivityDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_16402 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_16402)StarsActivityMsg.S2C_ActivityInfo_16402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_16402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityOpenDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityOpenDay() {
            return this.activityOpenDay_;
         }

         public Builder setActivityOpenDay(int value) {
            this.bitField0_ |= 1;
            this.activityOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityOpenDay() {
            this.bitField0_ &= -2;
            this.activityOpenDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSeverActivityDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSeverActivityDay() {
            return this.severActivityDay_;
         }

         public Builder setSeverActivityDay(int value) {
            this.bitField0_ |= 2;
            this.severActivityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSeverActivityDay() {
            this.bitField0_ &= -3;
            this.severActivityDay_ = 0;
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

   public static final class DrawRecord extends GeneratedMessageV3 implements DrawRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CREATETIME_FIELD_NUMBER = 1;
      private int createTime_;
      public static final int ITEMINFO_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> itemInfo_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final DrawRecord DEFAULT_INSTANCE = new DrawRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<DrawRecord> PARSER = new AbstractParser<DrawRecord>() {
         public DrawRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DrawRecord(input, extensionRegistry);
         }
      };

      private DrawRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DrawRecord() {
         this.memoizedIsInitialized = -1;
         this.itemInfo_ = Collections.emptyList();
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DrawRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DrawRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_DrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawRecord.class, Builder.class);
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
         } else if (!(obj instanceof DrawRecord)) {
            return super.equals(obj);
         } else {
            DrawRecord other = (DrawRecord)obj;
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

      public static DrawRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data);
      }

      public static DrawRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data);
      }

      public static DrawRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data);
      }

      public static DrawRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawRecord parseFrom(InputStream input) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DrawRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DrawRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DrawRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DrawRecord parseFrom(CodedInputStream input) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DrawRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DrawRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DrawRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DrawRecord> parser() {
         return PARSER;
      }

      public Parser<DrawRecord> getParserForType() {
         return PARSER;
      }

      public DrawRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DrawRecordOrBuilder {
         private int bitField0_;
         private int createTime_;
         private List<CommonMsg.ItemInfo> itemInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemInfoBuilder_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_DrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawRecord.class, Builder.class);
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
            if (StarsActivityMsg.DrawRecord.alwaysUseFieldBuilders) {
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_DrawRecord_descriptor;
         }

         public DrawRecord getDefaultInstanceForType() {
            return StarsActivityMsg.DrawRecord.getDefaultInstance();
         }

         public DrawRecord build() {
            DrawRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DrawRecord buildPartial() {
            DrawRecord result = new DrawRecord(this);
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
            if (other instanceof DrawRecord) {
               return this.mergeFrom((DrawRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DrawRecord other) {
            if (other == StarsActivityMsg.DrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = StarsActivityMsg.DrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
            DrawRecord parsedMessage = null;

            try {
               parsedMessage = (DrawRecord)StarsActivityMsg.DrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DrawRecord)e.getUnfinishedMessage();
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
            this.playerName_ = StarsActivityMsg.DrawRecord.getDefaultInstance().getPlayerName();
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

   public static final class C2S_LuckDrawInfo_16403 extends GeneratedMessageV3 implements C2S_LuckDrawInfo_16403OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckDrawInfo_16403 DEFAULT_INSTANCE = new C2S_LuckDrawInfo_16403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckDrawInfo_16403> PARSER = new AbstractParser<C2S_LuckDrawInfo_16403>() {
         public C2S_LuckDrawInfo_16403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckDrawInfo_16403(input, extensionRegistry);
         }
      };

      private C2S_LuckDrawInfo_16403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckDrawInfo_16403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckDrawInfo_16403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckDrawInfo_16403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_16403.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckDrawInfo_16403)) {
            return super.equals(obj);
         } else {
            C2S_LuckDrawInfo_16403 other = (C2S_LuckDrawInfo_16403)obj;
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

      public static C2S_LuckDrawInfo_16403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16403)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_16403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_16403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16403)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_16403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_16403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16403)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_16403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_16403 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_16403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_16403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_16403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_16403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_16403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_16403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_16403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_16403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckDrawInfo_16403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_16403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_16403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckDrawInfo_16403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckDrawInfo_16403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckDrawInfo_16403> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckDrawInfo_16403> getParserForType() {
         return PARSER;
      }

      public C2S_LuckDrawInfo_16403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckDrawInfo_16403OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_16403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_LuckDrawInfo_16403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16403_descriptor;
         }

         public C2S_LuckDrawInfo_16403 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_LuckDrawInfo_16403.getDefaultInstance();
         }

         public C2S_LuckDrawInfo_16403 build() {
            C2S_LuckDrawInfo_16403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckDrawInfo_16403 buildPartial() {
            C2S_LuckDrawInfo_16403 result = new C2S_LuckDrawInfo_16403(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LuckDrawInfo_16403) {
               return this.mergeFrom((C2S_LuckDrawInfo_16403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckDrawInfo_16403 other) {
            if (other == StarsActivityMsg.C2S_LuckDrawInfo_16403.getDefaultInstance()) {
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
            C2S_LuckDrawInfo_16403 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckDrawInfo_16403)StarsActivityMsg.C2S_LuckDrawInfo_16403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckDrawInfo_16403)e.getUnfinishedMessage();
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

   public static final class S2C_LuckDrawInfo_16404 extends GeneratedMessageV3 implements S2C_LuckDrawInfo_16404OrBuilder {
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
      private static final S2C_LuckDrawInfo_16404 DEFAULT_INSTANCE = new S2C_LuckDrawInfo_16404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckDrawInfo_16404> PARSER = new AbstractParser<S2C_LuckDrawInfo_16404>() {
         public S2C_LuckDrawInfo_16404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckDrawInfo_16404(input, extensionRegistry);
         }
      };

      private S2C_LuckDrawInfo_16404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckDrawInfo_16404() {
         this.memoizedIsInitialized = -1;
         this.hadRewardId_ = emptyIntList();
         this.seniorRewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckDrawInfo_16404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckDrawInfo_16404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_16404.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LuckDrawInfo_16404)) {
            return super.equals(obj);
         } else {
            S2C_LuckDrawInfo_16404 other = (S2C_LuckDrawInfo_16404)obj;
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

      public static S2C_LuckDrawInfo_16404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16404)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_16404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_16404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16404)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_16404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_16404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16404)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_16404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_16404 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_16404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_16404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_16404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_16404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_16404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_16404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_16404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_16404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckDrawInfo_16404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_16404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_16404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckDrawInfo_16404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckDrawInfo_16404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckDrawInfo_16404> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckDrawInfo_16404> getParserForType() {
         return PARSER;
      }

      public S2C_LuckDrawInfo_16404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckDrawInfo_16404OrBuilder {
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_16404.class, Builder.class);
         }

         private Builder() {
            this.hadRewardId_ = StarsActivityMsg.S2C_LuckDrawInfo_16404.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadRewardId_ = StarsActivityMsg.S2C_LuckDrawInfo_16404.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_LuckDrawInfo_16404.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.hadRewardId_ = StarsActivityMsg.S2C_LuckDrawInfo_16404.emptyIntList();
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16404_descriptor;
         }

         public S2C_LuckDrawInfo_16404 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_LuckDrawInfo_16404.getDefaultInstance();
         }

         public S2C_LuckDrawInfo_16404 build() {
            S2C_LuckDrawInfo_16404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckDrawInfo_16404 buildPartial() {
            S2C_LuckDrawInfo_16404 result = new S2C_LuckDrawInfo_16404(this);
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
            if (other instanceof S2C_LuckDrawInfo_16404) {
               return this.mergeFrom((S2C_LuckDrawInfo_16404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckDrawInfo_16404 other) {
            if (other == StarsActivityMsg.S2C_LuckDrawInfo_16404.getDefaultInstance()) {
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
                     this.seniorRewardsBuilder_ = StarsActivityMsg.S2C_LuckDrawInfo_16404.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
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
            S2C_LuckDrawInfo_16404 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckDrawInfo_16404)StarsActivityMsg.S2C_LuckDrawInfo_16404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckDrawInfo_16404)e.getUnfinishedMessage();
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
               this.hadRewardId_ = StarsActivityMsg.S2C_LuckDrawInfo_16404.mutableCopy(this.hadRewardId_);
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
            this.hadRewardId_ = StarsActivityMsg.S2C_LuckDrawInfo_16404.emptyIntList();
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

   public static final class C2S_Draw_16405 extends GeneratedMessageV3 implements C2S_Draw_16405OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Draw_16405 DEFAULT_INSTANCE = new C2S_Draw_16405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Draw_16405> PARSER = new AbstractParser<C2S_Draw_16405>() {
         public C2S_Draw_16405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Draw_16405(input, extensionRegistry);
         }
      };

      private C2S_Draw_16405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Draw_16405() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Draw_16405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Draw_16405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_Draw_16405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_Draw_16405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_16405.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Draw_16405)) {
            return super.equals(obj);
         } else {
            C2S_Draw_16405 other = (C2S_Draw_16405)obj;
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

      public static C2S_Draw_16405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Draw_16405)PARSER.parseFrom(data);
      }

      public static C2S_Draw_16405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_16405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_16405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Draw_16405)PARSER.parseFrom(data);
      }

      public static C2S_Draw_16405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_16405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_16405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Draw_16405)PARSER.parseFrom(data);
      }

      public static C2S_Draw_16405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_16405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_16405 parseFrom(InputStream input) throws IOException {
         return (C2S_Draw_16405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_16405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_16405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_16405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Draw_16405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Draw_16405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_16405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_16405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Draw_16405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_16405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_16405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Draw_16405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Draw_16405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Draw_16405> parser() {
         return PARSER;
      }

      public Parser<C2S_Draw_16405> getParserForType() {
         return PARSER;
      }

      public C2S_Draw_16405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Draw_16405OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_Draw_16405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_Draw_16405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_16405.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_Draw_16405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_Draw_16405_descriptor;
         }

         public C2S_Draw_16405 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_Draw_16405.getDefaultInstance();
         }

         public C2S_Draw_16405 build() {
            C2S_Draw_16405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Draw_16405 buildPartial() {
            C2S_Draw_16405 result = new C2S_Draw_16405(this);
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
            if (other instanceof C2S_Draw_16405) {
               return this.mergeFrom((C2S_Draw_16405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Draw_16405 other) {
            if (other == StarsActivityMsg.C2S_Draw_16405.getDefaultInstance()) {
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
            C2S_Draw_16405 parsedMessage = null;

            try {
               parsedMessage = (C2S_Draw_16405)StarsActivityMsg.C2S_Draw_16405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Draw_16405)e.getUnfinishedMessage();
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

   public static final class S2C_Draw_16406 extends GeneratedMessageV3 implements S2C_Draw_16406OrBuilder {
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
      private static final S2C_Draw_16406 DEFAULT_INSTANCE = new S2C_Draw_16406();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Draw_16406> PARSER = new AbstractParser<S2C_Draw_16406>() {
         public S2C_Draw_16406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Draw_16406(input, extensionRegistry);
         }
      };

      private S2C_Draw_16406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Draw_16406() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Draw_16406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Draw_16406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_Draw_16406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_Draw_16406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_16406.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Draw_16406)) {
            return super.equals(obj);
         } else {
            S2C_Draw_16406 other = (S2C_Draw_16406)obj;
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

      public static S2C_Draw_16406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Draw_16406)PARSER.parseFrom(data);
      }

      public static S2C_Draw_16406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_16406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_16406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Draw_16406)PARSER.parseFrom(data);
      }

      public static S2C_Draw_16406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_16406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_16406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Draw_16406)PARSER.parseFrom(data);
      }

      public static S2C_Draw_16406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_16406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_16406 parseFrom(InputStream input) throws IOException {
         return (S2C_Draw_16406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_16406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_16406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_16406 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Draw_16406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Draw_16406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_16406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_16406 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Draw_16406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_16406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_16406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Draw_16406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Draw_16406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Draw_16406> parser() {
         return PARSER;
      }

      public Parser<S2C_Draw_16406> getParserForType() {
         return PARSER;
      }

      public S2C_Draw_16406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Draw_16406OrBuilder {
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_Draw_16406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_Draw_16406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_16406.class, Builder.class);
         }

         private Builder() {
            this.id_ = StarsActivityMsg.S2C_Draw_16406.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = StarsActivityMsg.S2C_Draw_16406.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_Draw_16406.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.id_ = StarsActivityMsg.S2C_Draw_16406.emptyIntList();
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_Draw_16406_descriptor;
         }

         public S2C_Draw_16406 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_Draw_16406.getDefaultInstance();
         }

         public S2C_Draw_16406 build() {
            S2C_Draw_16406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Draw_16406 buildPartial() {
            S2C_Draw_16406 result = new S2C_Draw_16406(this);
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
            if (other instanceof S2C_Draw_16406) {
               return this.mergeFrom((S2C_Draw_16406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Draw_16406 other) {
            if (other == StarsActivityMsg.S2C_Draw_16406.getDefaultInstance()) {
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
                     this.seniorNumBuilder_ = StarsActivityMsg.S2C_Draw_16406.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
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
            S2C_Draw_16406 parsedMessage = null;

            try {
               parsedMessage = (S2C_Draw_16406)StarsActivityMsg.S2C_Draw_16406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Draw_16406)e.getUnfinishedMessage();
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
               this.id_ = StarsActivityMsg.S2C_Draw_16406.mutableCopy(this.id_);
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
            this.id_ = StarsActivityMsg.S2C_Draw_16406.emptyIntList();
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

   public static final class C2S_OpenReward_16407 extends GeneratedMessageV3 implements C2S_OpenReward_16407OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenReward_16407 DEFAULT_INSTANCE = new C2S_OpenReward_16407();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenReward_16407> PARSER = new AbstractParser<C2S_OpenReward_16407>() {
         public C2S_OpenReward_16407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenReward_16407(input, extensionRegistry);
         }
      };

      private C2S_OpenReward_16407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenReward_16407() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenReward_16407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenReward_16407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_OpenReward_16407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_OpenReward_16407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_16407.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenReward_16407)) {
            return super.equals(obj);
         } else {
            C2S_OpenReward_16407 other = (C2S_OpenReward_16407)obj;
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

      public static C2S_OpenReward_16407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16407)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_16407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_16407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16407)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_16407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_16407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16407)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_16407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_16407 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_16407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_16407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_16407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_16407 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_16407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_16407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_16407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_16407 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenReward_16407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_16407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_16407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenReward_16407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenReward_16407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenReward_16407> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenReward_16407> getParserForType() {
         return PARSER;
      }

      public C2S_OpenReward_16407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenReward_16407OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_OpenReward_16407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_OpenReward_16407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_16407.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_OpenReward_16407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_OpenReward_16407_descriptor;
         }

         public C2S_OpenReward_16407 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_OpenReward_16407.getDefaultInstance();
         }

         public C2S_OpenReward_16407 build() {
            C2S_OpenReward_16407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenReward_16407 buildPartial() {
            C2S_OpenReward_16407 result = new C2S_OpenReward_16407(this);
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
            if (other instanceof C2S_OpenReward_16407) {
               return this.mergeFrom((C2S_OpenReward_16407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenReward_16407 other) {
            if (other == StarsActivityMsg.C2S_OpenReward_16407.getDefaultInstance()) {
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
            C2S_OpenReward_16407 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenReward_16407)StarsActivityMsg.C2S_OpenReward_16407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenReward_16407)e.getUnfinishedMessage();
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

   public static final class S2C_OpenReward_16408 extends GeneratedMessageV3 implements S2C_OpenReward_16408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenReward_16408 DEFAULT_INSTANCE = new S2C_OpenReward_16408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenReward_16408> PARSER = new AbstractParser<S2C_OpenReward_16408>() {
         public S2C_OpenReward_16408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenReward_16408(input, extensionRegistry);
         }
      };

      private S2C_OpenReward_16408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenReward_16408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenReward_16408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenReward_16408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_OpenReward_16408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_OpenReward_16408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_16408.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenReward_16408)) {
            return super.equals(obj);
         } else {
            S2C_OpenReward_16408 other = (S2C_OpenReward_16408)obj;
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

      public static S2C_OpenReward_16408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16408)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_16408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_16408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16408)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_16408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_16408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16408)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_16408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_16408 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_16408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_16408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_16408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_16408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_16408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_16408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_16408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_16408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenReward_16408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_16408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_16408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenReward_16408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenReward_16408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenReward_16408> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenReward_16408> getParserForType() {
         return PARSER;
      }

      public S2C_OpenReward_16408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenReward_16408OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_OpenReward_16408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_OpenReward_16408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_16408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_OpenReward_16408.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_OpenReward_16408_descriptor;
         }

         public S2C_OpenReward_16408 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_OpenReward_16408.getDefaultInstance();
         }

         public S2C_OpenReward_16408 build() {
            S2C_OpenReward_16408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenReward_16408 buildPartial() {
            S2C_OpenReward_16408 result = new S2C_OpenReward_16408(this);
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
            if (other instanceof S2C_OpenReward_16408) {
               return this.mergeFrom((S2C_OpenReward_16408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenReward_16408 other) {
            if (other == StarsActivityMsg.S2C_OpenReward_16408.getDefaultInstance()) {
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
            S2C_OpenReward_16408 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenReward_16408)StarsActivityMsg.S2C_OpenReward_16408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenReward_16408)e.getUnfinishedMessage();
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

   public static final class C2S_DrawRecord_16409 extends GeneratedMessageV3 implements C2S_DrawRecord_16409OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_16409 DEFAULT_INSTANCE = new C2S_DrawRecord_16409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_16409> PARSER = new AbstractParser<C2S_DrawRecord_16409>() {
         public C2S_DrawRecord_16409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_16409(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_16409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_16409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_16409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_16409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_DrawRecord_16409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_DrawRecord_16409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_16409.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_16409)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_16409 other = (C2S_DrawRecord_16409)obj;
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

      public static C2S_DrawRecord_16409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16409)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_16409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_16409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16409)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_16409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_16409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16409)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_16409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_16409 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_16409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_16409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_16409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_16409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_16409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_16409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_16409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_16409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_16409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_16409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_16409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_16409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_16409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_16409> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_16409> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_16409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_16409OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_DrawRecord_16409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_DrawRecord_16409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_16409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_DrawRecord_16409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_DrawRecord_16409_descriptor;
         }

         public C2S_DrawRecord_16409 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_DrawRecord_16409.getDefaultInstance();
         }

         public C2S_DrawRecord_16409 build() {
            C2S_DrawRecord_16409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_16409 buildPartial() {
            C2S_DrawRecord_16409 result = new C2S_DrawRecord_16409(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_DrawRecord_16409) {
               return this.mergeFrom((C2S_DrawRecord_16409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_16409 other) {
            if (other == StarsActivityMsg.C2S_DrawRecord_16409.getDefaultInstance()) {
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
            C2S_DrawRecord_16409 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_16409)StarsActivityMsg.C2S_DrawRecord_16409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_16409)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_16410 extends GeneratedMessageV3 implements S2C_DrawRecord_16410OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<MyDrawRecord> myRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_16410 DEFAULT_INSTANCE = new S2C_DrawRecord_16410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_16410> PARSER = new AbstractParser<S2C_DrawRecord_16410>() {
         public S2C_DrawRecord_16410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_16410(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_16410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_16410() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_16410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_16410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(StarsActivityMsg.MyDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_DrawRecord_16410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_DrawRecord_16410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_16410.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawRecord_16410)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_16410 other = (S2C_DrawRecord_16410)obj;
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

      public static S2C_DrawRecord_16410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16410)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_16410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_16410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16410)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_16410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_16410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16410)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_16410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_16410 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_16410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_16410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_16410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_16410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_16410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_16410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_16410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_16410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_16410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_16410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_16410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_16410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_16410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_16410> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_16410> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_16410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_16410OrBuilder {
         private int bitField0_;
         private List<MyDrawRecord> myRecord_;
         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> myRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_DrawRecord_16410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_DrawRecord_16410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_16410.class, Builder.class);
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
            if (StarsActivityMsg.S2C_DrawRecord_16410.alwaysUseFieldBuilders) {
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_DrawRecord_16410_descriptor;
         }

         public S2C_DrawRecord_16410 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_DrawRecord_16410.getDefaultInstance();
         }

         public S2C_DrawRecord_16410 build() {
            S2C_DrawRecord_16410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_16410 buildPartial() {
            S2C_DrawRecord_16410 result = new S2C_DrawRecord_16410(this);
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
            if (other instanceof S2C_DrawRecord_16410) {
               return this.mergeFrom((S2C_DrawRecord_16410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_16410 other) {
            if (other == StarsActivityMsg.S2C_DrawRecord_16410.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = StarsActivityMsg.S2C_DrawRecord_16410.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
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
            S2C_DrawRecord_16410 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_16410)StarsActivityMsg.S2C_DrawRecord_16410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_16410)e.getUnfinishedMessage();
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
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(StarsActivityMsg.MyDrawRecord.getDefaultInstance());
         }

         public MyDrawRecord.Builder addMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, StarsActivityMsg.MyDrawRecord.getDefaultInstance());
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

   public static final class C2S_ServerDrawRecord_16411 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_16411OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_16411 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_16411();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_16411> PARSER = new AbstractParser<C2S_ServerDrawRecord_16411>() {
         public C2S_ServerDrawRecord_16411 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_16411(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_16411(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_16411() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_16411();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_16411(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16411_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_16411.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_16411)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_16411 other = (C2S_ServerDrawRecord_16411)obj;
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

      public static C2S_ServerDrawRecord_16411 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16411)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_16411 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_16411 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16411)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_16411 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_16411 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16411)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_16411 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_16411 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_16411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_16411 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_16411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_16411 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_16411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_16411 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_16411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_16411 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_16411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_16411 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_16411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_16411 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_16411 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_16411> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_16411> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_16411 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_16411OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16411_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_16411.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_ServerDrawRecord_16411.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16411_descriptor;
         }

         public C2S_ServerDrawRecord_16411 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_ServerDrawRecord_16411.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_16411 build() {
            C2S_ServerDrawRecord_16411 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_16411 buildPartial() {
            C2S_ServerDrawRecord_16411 result = new C2S_ServerDrawRecord_16411(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ServerDrawRecord_16411) {
               return this.mergeFrom((C2S_ServerDrawRecord_16411)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_16411 other) {
            if (other == StarsActivityMsg.C2S_ServerDrawRecord_16411.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_16411 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_16411)StarsActivityMsg.C2S_ServerDrawRecord_16411.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_16411)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_16412 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_16412OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_16412 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_16412();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_16412> PARSER = new AbstractParser<S2C_ServerDrawRecord_16412>() {
         public S2C_ServerDrawRecord_16412 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_16412(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_16412(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_16412() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_16412();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_16412(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.serverRecord_.add(input.readMessage(StarsActivityMsg.ServerDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16412_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_16412.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_16412)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_16412 other = (S2C_ServerDrawRecord_16412)obj;
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

      public static S2C_ServerDrawRecord_16412 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16412)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_16412 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_16412 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16412)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_16412 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_16412 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16412)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_16412 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_16412 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_16412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_16412 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_16412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_16412 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_16412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_16412 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_16412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_16412 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_16412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_16412 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_16412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_16412 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_16412 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_16412> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_16412> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_16412 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_16412OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16412_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_16412.class, Builder.class);
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
            if (StarsActivityMsg.S2C_ServerDrawRecord_16412.alwaysUseFieldBuilders) {
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16412_descriptor;
         }

         public S2C_ServerDrawRecord_16412 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_ServerDrawRecord_16412.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_16412 build() {
            S2C_ServerDrawRecord_16412 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_16412 buildPartial() {
            S2C_ServerDrawRecord_16412 result = new S2C_ServerDrawRecord_16412(this);
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
            if (other instanceof S2C_ServerDrawRecord_16412) {
               return this.mergeFrom((S2C_ServerDrawRecord_16412)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_16412 other) {
            if (other == StarsActivityMsg.S2C_ServerDrawRecord_16412.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = StarsActivityMsg.S2C_ServerDrawRecord_16412.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_16412 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_16412)StarsActivityMsg.S2C_ServerDrawRecord_16412.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_16412)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(StarsActivityMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, StarsActivityMsg.ServerDrawRecord.getDefaultInstance());
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_MyDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            if (StarsActivityMsg.MyDrawRecord.alwaysUseFieldBuilders) {
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         public MyDrawRecord getDefaultInstanceForType() {
            return StarsActivityMsg.MyDrawRecord.getDefaultInstance();
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
            if (other == StarsActivityMsg.MyDrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = StarsActivityMsg.MyDrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
               parsedMessage = (MyDrawRecord)StarsActivityMsg.MyDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = StarsActivityMsg.MyDrawRecord.getDefaultInstance().getPlayerName();
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (StarsActivityMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return StarsActivityMsg.ServerDrawRecord.getDefaultInstance();
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
            if (other == StarsActivityMsg.ServerDrawRecord.getDefaultInstance()) {
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
               parsedMessage = (ServerDrawRecord)StarsActivityMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = StarsActivityMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FancyReward_16413 extends GeneratedMessageV3 implements C2S_FancyReward_16413OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETID_FIELD_NUMBER = 1;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_16413 DEFAULT_INSTANCE = new C2S_FancyReward_16413();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_16413> PARSER = new AbstractParser<C2S_FancyReward_16413>() {
         public C2S_FancyReward_16413 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_16413(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_16413(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_16413() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_16413();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_16413(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_FancyReward_16413_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_FancyReward_16413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_16413.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FancyReward_16413)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_16413 other = (C2S_FancyReward_16413)obj;
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

      public static C2S_FancyReward_16413 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16413)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_16413 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_16413 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16413)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_16413 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_16413 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16413)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_16413 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_16413 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_16413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_16413 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_16413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_16413 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_16413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_16413 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_16413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_16413 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_16413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_16413 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_16413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_16413 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_16413 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_16413> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_16413> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_16413 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_16413OrBuilder {
         private int bitField0_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_FancyReward_16413_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_FancyReward_16413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_16413.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_FancyReward_16413.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_FancyReward_16413_descriptor;
         }

         public C2S_FancyReward_16413 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_FancyReward_16413.getDefaultInstance();
         }

         public C2S_FancyReward_16413 build() {
            C2S_FancyReward_16413 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_16413 buildPartial() {
            C2S_FancyReward_16413 result = new C2S_FancyReward_16413(this);
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
            if (other instanceof C2S_FancyReward_16413) {
               return this.mergeFrom((C2S_FancyReward_16413)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_16413 other) {
            if (other == StarsActivityMsg.C2S_FancyReward_16413.getDefaultInstance()) {
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
            C2S_FancyReward_16413 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_16413)StarsActivityMsg.C2S_FancyReward_16413.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_16413)e.getUnfinishedMessage();
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

   public static final class S2C_FancyReward_16414 extends GeneratedMessageV3 implements S2C_FancyReward_16414OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_16414 DEFAULT_INSTANCE = new S2C_FancyReward_16414();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_16414> PARSER = new AbstractParser<S2C_FancyReward_16414>() {
         public S2C_FancyReward_16414 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_16414(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_16414(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_16414() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_16414();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_16414(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_FancyReward_16414_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_FancyReward_16414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_16414.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FancyReward_16414)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_16414 other = (S2C_FancyReward_16414)obj;
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

      public static S2C_FancyReward_16414 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16414)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_16414 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_16414 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16414)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_16414 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_16414 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16414)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_16414 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_16414 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_16414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_16414 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_16414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_16414 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_16414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_16414 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_16414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_16414 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_16414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_16414 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_16414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_16414 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_16414 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_16414> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_16414> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_16414 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_16414OrBuilder {
         private int bitField0_;
         private int result_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_FancyReward_16414_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_FancyReward_16414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_16414.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_FancyReward_16414.alwaysUseFieldBuilders) {
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_FancyReward_16414_descriptor;
         }

         public S2C_FancyReward_16414 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_FancyReward_16414.getDefaultInstance();
         }

         public S2C_FancyReward_16414 build() {
            S2C_FancyReward_16414 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_16414 buildPartial() {
            S2C_FancyReward_16414 result = new S2C_FancyReward_16414(this);
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
            if (other instanceof S2C_FancyReward_16414) {
               return this.mergeFrom((S2C_FancyReward_16414)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_16414 other) {
            if (other == StarsActivityMsg.S2C_FancyReward_16414.getDefaultInstance()) {
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
            S2C_FancyReward_16414 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_16414)StarsActivityMsg.S2C_FancyReward_16414.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_16414)e.getUnfinishedMessage();
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

   public static final class C2S_Pray_16421 extends GeneratedMessageV3 implements C2S_Pray_16421OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Pray_16421 DEFAULT_INSTANCE = new C2S_Pray_16421();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Pray_16421> PARSER = new AbstractParser<C2S_Pray_16421>() {
         public C2S_Pray_16421 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Pray_16421(input, extensionRegistry);
         }
      };

      private C2S_Pray_16421(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Pray_16421() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Pray_16421();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Pray_16421(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_Pray_16421_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_Pray_16421_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_16421.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Pray_16421)) {
            return super.equals(obj);
         } else {
            C2S_Pray_16421 other = (C2S_Pray_16421)obj;
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

      public static C2S_Pray_16421 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Pray_16421)PARSER.parseFrom(data);
      }

      public static C2S_Pray_16421 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_16421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_16421 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Pray_16421)PARSER.parseFrom(data);
      }

      public static C2S_Pray_16421 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_16421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_16421 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Pray_16421)PARSER.parseFrom(data);
      }

      public static C2S_Pray_16421 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_16421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_16421 parseFrom(InputStream input) throws IOException {
         return (C2S_Pray_16421)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_16421 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_16421)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_16421 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Pray_16421)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Pray_16421 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_16421)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_16421 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Pray_16421)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_16421 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_16421)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Pray_16421 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Pray_16421 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Pray_16421> parser() {
         return PARSER;
      }

      public Parser<C2S_Pray_16421> getParserForType() {
         return PARSER;
      }

      public C2S_Pray_16421 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Pray_16421OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_Pray_16421_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_Pray_16421_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_16421.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_Pray_16421.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_Pray_16421_descriptor;
         }

         public C2S_Pray_16421 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_Pray_16421.getDefaultInstance();
         }

         public C2S_Pray_16421 build() {
            C2S_Pray_16421 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Pray_16421 buildPartial() {
            C2S_Pray_16421 result = new C2S_Pray_16421(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Pray_16421) {
               return this.mergeFrom((C2S_Pray_16421)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Pray_16421 other) {
            if (other == StarsActivityMsg.C2S_Pray_16421.getDefaultInstance()) {
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
            C2S_Pray_16421 parsedMessage = null;

            try {
               parsedMessage = (C2S_Pray_16421)StarsActivityMsg.C2S_Pray_16421.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Pray_16421)e.getUnfinishedMessage();
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

   public static final class S2C_Pray_16422 extends GeneratedMessageV3 implements S2C_Pray_16422OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYNUM_FIELD_NUMBER = 1;
      private int prayNum_;
      private byte memoizedIsInitialized;
      private static final S2C_Pray_16422 DEFAULT_INSTANCE = new S2C_Pray_16422();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Pray_16422> PARSER = new AbstractParser<S2C_Pray_16422>() {
         public S2C_Pray_16422 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Pray_16422(input, extensionRegistry);
         }
      };

      private S2C_Pray_16422(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Pray_16422() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Pray_16422();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Pray_16422(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_Pray_16422_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_Pray_16422_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_16422.class, Builder.class);
      }

      public boolean hasPrayNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayNum() {
         return this.prayNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.prayNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.prayNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Pray_16422)) {
            return super.equals(obj);
         } else {
            S2C_Pray_16422 other = (S2C_Pray_16422)obj;
            if (this.hasPrayNum() != other.hasPrayNum()) {
               return false;
            } else if (this.hasPrayNum() && this.getPrayNum() != other.getPrayNum()) {
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
            if (this.hasPrayNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Pray_16422 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Pray_16422)PARSER.parseFrom(data);
      }

      public static S2C_Pray_16422 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_16422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_16422 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Pray_16422)PARSER.parseFrom(data);
      }

      public static S2C_Pray_16422 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_16422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_16422 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Pray_16422)PARSER.parseFrom(data);
      }

      public static S2C_Pray_16422 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_16422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_16422 parseFrom(InputStream input) throws IOException {
         return (S2C_Pray_16422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_16422 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_16422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_16422 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Pray_16422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Pray_16422 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_16422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_16422 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Pray_16422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_16422 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_16422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Pray_16422 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Pray_16422 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Pray_16422> parser() {
         return PARSER;
      }

      public Parser<S2C_Pray_16422> getParserForType() {
         return PARSER;
      }

      public S2C_Pray_16422 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Pray_16422OrBuilder {
         private int bitField0_;
         private int prayNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_Pray_16422_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_Pray_16422_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_16422.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_Pray_16422.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_Pray_16422_descriptor;
         }

         public S2C_Pray_16422 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_Pray_16422.getDefaultInstance();
         }

         public S2C_Pray_16422 build() {
            S2C_Pray_16422 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Pray_16422 buildPartial() {
            S2C_Pray_16422 result = new S2C_Pray_16422(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayNum_ = this.prayNum_;
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
            if (other instanceof S2C_Pray_16422) {
               return this.mergeFrom((S2C_Pray_16422)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Pray_16422 other) {
            if (other == StarsActivityMsg.S2C_Pray_16422.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayNum()) {
                  this.setPrayNum(other.getPrayNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPrayNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Pray_16422 parsedMessage = null;

            try {
               parsedMessage = (S2C_Pray_16422)StarsActivityMsg.S2C_Pray_16422.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Pray_16422)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayNum() {
            return this.prayNum_;
         }

         public Builder setPrayNum(int value) {
            this.bitField0_ |= 1;
            this.prayNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayNum() {
            this.bitField0_ &= -2;
            this.prayNum_ = 0;
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

   public static final class S2C_PrayTaskNotify_16424 extends GeneratedMessageV3 implements S2C_PrayTaskNotify_16424OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayTaskNotify_16424 DEFAULT_INSTANCE = new S2C_PrayTaskNotify_16424();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayTaskNotify_16424> PARSER = new AbstractParser<S2C_PrayTaskNotify_16424>() {
         public S2C_PrayTaskNotify_16424 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayTaskNotify_16424(input, extensionRegistry);
         }
      };

      private S2C_PrayTaskNotify_16424(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayTaskNotify_16424() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayTaskNotify_16424();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayTaskNotify_16424(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16424_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16424_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskNotify_16424.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskList() {
         return this.task_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public ActivityMsg.TaskData getTask(int index) {
         return (ActivityMsg.TaskData)this.task_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.task_.get(index);
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
         } else if (!(obj instanceof S2C_PrayTaskNotify_16424)) {
            return super.equals(obj);
         } else {
            S2C_PrayTaskNotify_16424 other = (S2C_PrayTaskNotify_16424)obj;
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

      public static S2C_PrayTaskNotify_16424 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16424)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_16424 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_16424 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16424)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_16424 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_16424 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16424)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_16424 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_16424 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskNotify_16424)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_16424 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_16424)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_16424 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskNotify_16424)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_16424 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_16424)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_16424 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayTaskNotify_16424)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_16424 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_16424)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayTaskNotify_16424 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayTaskNotify_16424 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayTaskNotify_16424> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayTaskNotify_16424> getParserForType() {
         return PARSER;
      }

      public S2C_PrayTaskNotify_16424 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayTaskNotify_16424OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16424_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16424_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskNotify_16424.class, Builder.class);
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
            if (StarsActivityMsg.S2C_PrayTaskNotify_16424.alwaysUseFieldBuilders) {
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16424_descriptor;
         }

         public S2C_PrayTaskNotify_16424 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_PrayTaskNotify_16424.getDefaultInstance();
         }

         public S2C_PrayTaskNotify_16424 build() {
            S2C_PrayTaskNotify_16424 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayTaskNotify_16424 buildPartial() {
            S2C_PrayTaskNotify_16424 result = new S2C_PrayTaskNotify_16424(this);
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
            if (other instanceof S2C_PrayTaskNotify_16424) {
               return this.mergeFrom((S2C_PrayTaskNotify_16424)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayTaskNotify_16424 other) {
            if (other == StarsActivityMsg.S2C_PrayTaskNotify_16424.getDefaultInstance()) {
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
                     this.taskBuilder_ = StarsActivityMsg.S2C_PrayTaskNotify_16424.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_PrayTaskNotify_16424 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayTaskNotify_16424)StarsActivityMsg.S2C_PrayTaskNotify_16424.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayTaskNotify_16424)e.getUnfinishedMessage();
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

         public List<ActivityMsg.TaskData> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTask(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskData)this.task_.get(index) : (ActivityMsg.TaskData)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, ActivityMsg.TaskData value) {
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

         public Builder setTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData value) {
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

         public Builder addTask(int index, ActivityMsg.TaskData value) {
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

         public Builder addTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends ActivityMsg.TaskData> values) {
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

         public ActivityMsg.TaskData.Builder getTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.task_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskFieldBuilder() {
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

   public static final class S2C_PrayInfo_16426 extends GeneratedMessageV3 implements S2C_PrayInfo_16426OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYNUM_FIELD_NUMBER = 1;
      private int prayNum_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayInfo_16426 DEFAULT_INSTANCE = new S2C_PrayInfo_16426();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayInfo_16426> PARSER = new AbstractParser<S2C_PrayInfo_16426>() {
         public S2C_PrayInfo_16426 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayInfo_16426(input, extensionRegistry);
         }
      };

      private S2C_PrayInfo_16426(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayInfo_16426() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayInfo_16426();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayInfo_16426(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayInfo_16426_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayInfo_16426_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayInfo_16426.class, Builder.class);
      }

      public boolean hasPrayNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayNum() {
         return this.prayNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.prayNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.prayNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrayInfo_16426)) {
            return super.equals(obj);
         } else {
            S2C_PrayInfo_16426 other = (S2C_PrayInfo_16426)obj;
            if (this.hasPrayNum() != other.hasPrayNum()) {
               return false;
            } else if (this.hasPrayNum() && this.getPrayNum() != other.getPrayNum()) {
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
            if (this.hasPrayNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrayInfo_16426 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16426)PARSER.parseFrom(data);
      }

      public static S2C_PrayInfo_16426 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayInfo_16426 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16426)PARSER.parseFrom(data);
      }

      public static S2C_PrayInfo_16426 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayInfo_16426 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16426)PARSER.parseFrom(data);
      }

      public static S2C_PrayInfo_16426 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayInfo_16426 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayInfo_16426)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayInfo_16426 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayInfo_16426)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayInfo_16426 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayInfo_16426)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayInfo_16426 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayInfo_16426)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayInfo_16426 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayInfo_16426)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayInfo_16426 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayInfo_16426)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayInfo_16426 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayInfo_16426 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayInfo_16426> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayInfo_16426> getParserForType() {
         return PARSER;
      }

      public S2C_PrayInfo_16426 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayInfo_16426OrBuilder {
         private int bitField0_;
         private int prayNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayInfo_16426_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayInfo_16426_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayInfo_16426.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_PrayInfo_16426.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayInfo_16426_descriptor;
         }

         public S2C_PrayInfo_16426 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_PrayInfo_16426.getDefaultInstance();
         }

         public S2C_PrayInfo_16426 build() {
            S2C_PrayInfo_16426 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayInfo_16426 buildPartial() {
            S2C_PrayInfo_16426 result = new S2C_PrayInfo_16426(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayNum_ = this.prayNum_;
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
            if (other instanceof S2C_PrayInfo_16426) {
               return this.mergeFrom((S2C_PrayInfo_16426)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayInfo_16426 other) {
            if (other == StarsActivityMsg.S2C_PrayInfo_16426.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayNum()) {
                  this.setPrayNum(other.getPrayNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPrayNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrayInfo_16426 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayInfo_16426)StarsActivityMsg.S2C_PrayInfo_16426.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayInfo_16426)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayNum() {
            return this.prayNum_;
         }

         public Builder setPrayNum(int value) {
            this.bitField0_ |= 1;
            this.prayNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayNum() {
            this.bitField0_ &= -2;
            this.prayNum_ = 0;
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

   public static final class S2C_PrayTaskList_16428 extends GeneratedMessageV3 implements S2C_PrayTaskList_16428OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayTaskList_16428 DEFAULT_INSTANCE = new S2C_PrayTaskList_16428();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayTaskList_16428> PARSER = new AbstractParser<S2C_PrayTaskList_16428>() {
         public S2C_PrayTaskList_16428 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayTaskList_16428(input, extensionRegistry);
         }
      };

      private S2C_PrayTaskList_16428(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayTaskList_16428() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayTaskList_16428();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayTaskList_16428(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskList_16428_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskList_16428_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskList_16428.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskList() {
         return this.task_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public ActivityMsg.TaskData getTask(int index) {
         return (ActivityMsg.TaskData)this.task_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.task_.get(index);
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
         } else if (!(obj instanceof S2C_PrayTaskList_16428)) {
            return super.equals(obj);
         } else {
            S2C_PrayTaskList_16428 other = (S2C_PrayTaskList_16428)obj;
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

      public static S2C_PrayTaskList_16428 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16428)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_16428 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16428)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_16428 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16428)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_16428 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16428)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_16428 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16428)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_16428 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16428)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_16428 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskList_16428)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_16428 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_16428)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskList_16428 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskList_16428)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_16428 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_16428)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskList_16428 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayTaskList_16428)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_16428 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_16428)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayTaskList_16428 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayTaskList_16428 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayTaskList_16428> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayTaskList_16428> getParserForType() {
         return PARSER;
      }

      public S2C_PrayTaskList_16428 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayTaskList_16428OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskList_16428_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskList_16428_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskList_16428.class, Builder.class);
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
            if (StarsActivityMsg.S2C_PrayTaskList_16428.alwaysUseFieldBuilders) {
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
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_PrayTaskList_16428_descriptor;
         }

         public S2C_PrayTaskList_16428 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_PrayTaskList_16428.getDefaultInstance();
         }

         public S2C_PrayTaskList_16428 build() {
            S2C_PrayTaskList_16428 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayTaskList_16428 buildPartial() {
            S2C_PrayTaskList_16428 result = new S2C_PrayTaskList_16428(this);
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
            if (other instanceof S2C_PrayTaskList_16428) {
               return this.mergeFrom((S2C_PrayTaskList_16428)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayTaskList_16428 other) {
            if (other == StarsActivityMsg.S2C_PrayTaskList_16428.getDefaultInstance()) {
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
                     this.taskBuilder_ = StarsActivityMsg.S2C_PrayTaskList_16428.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_PrayTaskList_16428 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayTaskList_16428)StarsActivityMsg.S2C_PrayTaskList_16428.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayTaskList_16428)e.getUnfinishedMessage();
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

         public List<ActivityMsg.TaskData> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTask(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskData)this.task_.get(index) : (ActivityMsg.TaskData)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, ActivityMsg.TaskData value) {
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

         public Builder setTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData value) {
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

         public Builder addTask(int index, ActivityMsg.TaskData value) {
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

         public Builder addTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends ActivityMsg.TaskData> values) {
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

         public ActivityMsg.TaskData.Builder getTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.task_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskFieldBuilder() {
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

   public static final class C2S_SkyLampRechargeTotalInfo_16451 extends GeneratedMessageV3 implements C2S_SkyLampRechargeTotalInfo_16451OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SkyLampRechargeTotalInfo_16451 DEFAULT_INSTANCE = new C2S_SkyLampRechargeTotalInfo_16451();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SkyLampRechargeTotalInfo_16451> PARSER = new AbstractParser<C2S_SkyLampRechargeTotalInfo_16451>() {
         public C2S_SkyLampRechargeTotalInfo_16451 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SkyLampRechargeTotalInfo_16451(input, extensionRegistry);
         }
      };

      private C2S_SkyLampRechargeTotalInfo_16451(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SkyLampRechargeTotalInfo_16451() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SkyLampRechargeTotalInfo_16451();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SkyLampRechargeTotalInfo_16451(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_SkyLampRechargeTotalInfo_16451_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_SkyLampRechargeTotalInfo_16451_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkyLampRechargeTotalInfo_16451.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SkyLampRechargeTotalInfo_16451)) {
            return super.equals(obj);
         } else {
            C2S_SkyLampRechargeTotalInfo_16451 other = (C2S_SkyLampRechargeTotalInfo_16451)obj;
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

      public static C2S_SkyLampRechargeTotalInfo_16451 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SkyLampRechargeTotalInfo_16451)PARSER.parseFrom(data);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkyLampRechargeTotalInfo_16451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SkyLampRechargeTotalInfo_16451)PARSER.parseFrom(data);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkyLampRechargeTotalInfo_16451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SkyLampRechargeTotalInfo_16451)PARSER.parseFrom(data);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkyLampRechargeTotalInfo_16451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseFrom(InputStream input) throws IOException {
         return (C2S_SkyLampRechargeTotalInfo_16451)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkyLampRechargeTotalInfo_16451)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SkyLampRechargeTotalInfo_16451)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkyLampRechargeTotalInfo_16451)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SkyLampRechargeTotalInfo_16451)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkyLampRechargeTotalInfo_16451)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SkyLampRechargeTotalInfo_16451 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SkyLampRechargeTotalInfo_16451 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SkyLampRechargeTotalInfo_16451> parser() {
         return PARSER;
      }

      public Parser<C2S_SkyLampRechargeTotalInfo_16451> getParserForType() {
         return PARSER;
      }

      public C2S_SkyLampRechargeTotalInfo_16451 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SkyLampRechargeTotalInfo_16451OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_SkyLampRechargeTotalInfo_16451_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_SkyLampRechargeTotalInfo_16451_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkyLampRechargeTotalInfo_16451.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_SkyLampRechargeTotalInfo_16451.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_SkyLampRechargeTotalInfo_16451_descriptor;
         }

         public C2S_SkyLampRechargeTotalInfo_16451 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_SkyLampRechargeTotalInfo_16451.getDefaultInstance();
         }

         public C2S_SkyLampRechargeTotalInfo_16451 build() {
            C2S_SkyLampRechargeTotalInfo_16451 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SkyLampRechargeTotalInfo_16451 buildPartial() {
            C2S_SkyLampRechargeTotalInfo_16451 result = new C2S_SkyLampRechargeTotalInfo_16451(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_SkyLampRechargeTotalInfo_16451) {
               return this.mergeFrom((C2S_SkyLampRechargeTotalInfo_16451)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SkyLampRechargeTotalInfo_16451 other) {
            if (other == StarsActivityMsg.C2S_SkyLampRechargeTotalInfo_16451.getDefaultInstance()) {
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
            C2S_SkyLampRechargeTotalInfo_16451 parsedMessage = null;

            try {
               parsedMessage = (C2S_SkyLampRechargeTotalInfo_16451)StarsActivityMsg.C2S_SkyLampRechargeTotalInfo_16451.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SkyLampRechargeTotalInfo_16451)e.getUnfinishedMessage();
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

   public static final class S2C_SkyLampRechargeTotalInfo_16452 extends GeneratedMessageV3 implements S2C_SkyLampRechargeTotalInfo_16452OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTREWARDS_FIELD_NUMBER = 1;
      private Internal.IntList gotRewards_;
      public static final int STAGERECHARGE_FIELD_NUMBER = 2;
      private int stageRecharge_;
      public static final int STAGEENDTIME_FIELD_NUMBER = 3;
      private long stageEndTime_;
      private byte memoizedIsInitialized;
      private static final S2C_SkyLampRechargeTotalInfo_16452 DEFAULT_INSTANCE = new S2C_SkyLampRechargeTotalInfo_16452();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SkyLampRechargeTotalInfo_16452> PARSER = new AbstractParser<S2C_SkyLampRechargeTotalInfo_16452>() {
         public S2C_SkyLampRechargeTotalInfo_16452 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SkyLampRechargeTotalInfo_16452(input, extensionRegistry);
         }
      };

      private S2C_SkyLampRechargeTotalInfo_16452(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SkyLampRechargeTotalInfo_16452() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SkyLampRechargeTotalInfo_16452();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SkyLampRechargeTotalInfo_16452(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 24:
                        this.bitField0_ |= 2;
                        this.stageEndTime_ = input.readInt64();
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_SkyLampRechargeTotalInfo_16452_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_SkyLampRechargeTotalInfo_16452_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkyLampRechargeTotalInfo_16452.class, Builder.class);
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

      public boolean hasStageEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getStageEndTime() {
         return this.stageEndTime_;
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
         } else if (!this.hasStageEndTime()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(3, this.stageEndTime_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.stageEndTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SkyLampRechargeTotalInfo_16452)) {
            return super.equals(obj);
         } else {
            S2C_SkyLampRechargeTotalInfo_16452 other = (S2C_SkyLampRechargeTotalInfo_16452)obj;
            if (!this.getGotRewardsList().equals(other.getGotRewardsList())) {
               return false;
            } else if (this.hasStageRecharge() != other.hasStageRecharge()) {
               return false;
            } else if (this.hasStageRecharge() && this.getStageRecharge() != other.getStageRecharge()) {
               return false;
            } else if (this.hasStageEndTime() != other.hasStageEndTime()) {
               return false;
            } else if (this.hasStageEndTime() && this.getStageEndTime() != other.getStageEndTime()) {
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

            if (this.hasStageEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getStageEndTime());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SkyLampRechargeTotalInfo_16452)PARSER.parseFrom(data);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkyLampRechargeTotalInfo_16452)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SkyLampRechargeTotalInfo_16452)PARSER.parseFrom(data);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkyLampRechargeTotalInfo_16452)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SkyLampRechargeTotalInfo_16452)PARSER.parseFrom(data);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkyLampRechargeTotalInfo_16452)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseFrom(InputStream input) throws IOException {
         return (S2C_SkyLampRechargeTotalInfo_16452)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkyLampRechargeTotalInfo_16452)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SkyLampRechargeTotalInfo_16452)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkyLampRechargeTotalInfo_16452)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SkyLampRechargeTotalInfo_16452)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkyLampRechargeTotalInfo_16452)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SkyLampRechargeTotalInfo_16452 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SkyLampRechargeTotalInfo_16452 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SkyLampRechargeTotalInfo_16452> parser() {
         return PARSER;
      }

      public Parser<S2C_SkyLampRechargeTotalInfo_16452> getParserForType() {
         return PARSER;
      }

      public S2C_SkyLampRechargeTotalInfo_16452 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SkyLampRechargeTotalInfo_16452OrBuilder {
         private int bitField0_;
         private Internal.IntList gotRewards_;
         private int stageRecharge_;
         private long stageEndTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_SkyLampRechargeTotalInfo_16452_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_SkyLampRechargeTotalInfo_16452_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkyLampRechargeTotalInfo_16452.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotRewards_ = StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.emptyIntList();
            this.bitField0_ &= -2;
            this.stageRecharge_ = 0;
            this.bitField0_ &= -3;
            this.stageEndTime_ = 0L;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_SkyLampRechargeTotalInfo_16452_descriptor;
         }

         public S2C_SkyLampRechargeTotalInfo_16452 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.getDefaultInstance();
         }

         public S2C_SkyLampRechargeTotalInfo_16452 build() {
            S2C_SkyLampRechargeTotalInfo_16452 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SkyLampRechargeTotalInfo_16452 buildPartial() {
            S2C_SkyLampRechargeTotalInfo_16452 result = new S2C_SkyLampRechargeTotalInfo_16452(this);
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

            if ((from_bitField0_ & 4) != 0) {
               result.stageEndTime_ = this.stageEndTime_;
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
            if (other instanceof S2C_SkyLampRechargeTotalInfo_16452) {
               return this.mergeFrom((S2C_SkyLampRechargeTotalInfo_16452)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SkyLampRechargeTotalInfo_16452 other) {
            if (other == StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.getDefaultInstance()) {
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

               if (other.hasStageEndTime()) {
                  this.setStageEndTime(other.getStageEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageRecharge()) {
               return false;
            } else {
               return this.hasStageEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SkyLampRechargeTotalInfo_16452 parsedMessage = null;

            try {
               parsedMessage = (S2C_SkyLampRechargeTotalInfo_16452)StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SkyLampRechargeTotalInfo_16452)e.getUnfinishedMessage();
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
               this.gotRewards_ = StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.mutableCopy(this.gotRewards_);
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
            this.gotRewards_ = StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.emptyIntList();
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

         public boolean hasStageEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getStageEndTime() {
            return this.stageEndTime_;
         }

         public Builder setStageEndTime(long value) {
            this.bitField0_ |= 4;
            this.stageEndTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageEndTime() {
            this.bitField0_ &= -5;
            this.stageEndTime_ = 0L;
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

   public static final class C2S_ReceiveKmtdReward_16453 extends GeneratedMessageV3 implements C2S_ReceiveKmtdReward_16453OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveKmtdReward_16453 DEFAULT_INSTANCE = new C2S_ReceiveKmtdReward_16453();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveKmtdReward_16453> PARSER = new AbstractParser<C2S_ReceiveKmtdReward_16453>() {
         public C2S_ReceiveKmtdReward_16453 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveKmtdReward_16453(input, extensionRegistry);
         }
      };

      private C2S_ReceiveKmtdReward_16453(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveKmtdReward_16453() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveKmtdReward_16453();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveKmtdReward_16453(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveKmtdReward_16453_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveKmtdReward_16453_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveKmtdReward_16453.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveKmtdReward_16453)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveKmtdReward_16453 other = (C2S_ReceiveKmtdReward_16453)obj;
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

      public static C2S_ReceiveKmtdReward_16453 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveKmtdReward_16453)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveKmtdReward_16453 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveKmtdReward_16453)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveKmtdReward_16453 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveKmtdReward_16453)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveKmtdReward_16453 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveKmtdReward_16453)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveKmtdReward_16453 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveKmtdReward_16453)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveKmtdReward_16453 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveKmtdReward_16453)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveKmtdReward_16453 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveKmtdReward_16453)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveKmtdReward_16453 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveKmtdReward_16453)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveKmtdReward_16453 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveKmtdReward_16453)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveKmtdReward_16453 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveKmtdReward_16453)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveKmtdReward_16453 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveKmtdReward_16453)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveKmtdReward_16453 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveKmtdReward_16453)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveKmtdReward_16453 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveKmtdReward_16453 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveKmtdReward_16453> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveKmtdReward_16453> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveKmtdReward_16453 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveKmtdReward_16453OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveKmtdReward_16453_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveKmtdReward_16453_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveKmtdReward_16453.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_ReceiveKmtdReward_16453.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveKmtdReward_16453_descriptor;
         }

         public C2S_ReceiveKmtdReward_16453 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_ReceiveKmtdReward_16453.getDefaultInstance();
         }

         public C2S_ReceiveKmtdReward_16453 build() {
            C2S_ReceiveKmtdReward_16453 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveKmtdReward_16453 buildPartial() {
            C2S_ReceiveKmtdReward_16453 result = new C2S_ReceiveKmtdReward_16453(this);
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
            if (other instanceof C2S_ReceiveKmtdReward_16453) {
               return this.mergeFrom((C2S_ReceiveKmtdReward_16453)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveKmtdReward_16453 other) {
            if (other == StarsActivityMsg.C2S_ReceiveKmtdReward_16453.getDefaultInstance()) {
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
            C2S_ReceiveKmtdReward_16453 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveKmtdReward_16453)StarsActivityMsg.C2S_ReceiveKmtdReward_16453.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveKmtdReward_16453)e.getUnfinishedMessage();
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

   public static final class S2C_ReceiveKmtdReward_16454 extends GeneratedMessageV3 implements S2C_ReceiveKmtdReward_16454OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveKmtdReward_16454 DEFAULT_INSTANCE = new S2C_ReceiveKmtdReward_16454();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveKmtdReward_16454> PARSER = new AbstractParser<S2C_ReceiveKmtdReward_16454>() {
         public S2C_ReceiveKmtdReward_16454 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveKmtdReward_16454(input, extensionRegistry);
         }
      };

      private S2C_ReceiveKmtdReward_16454(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveKmtdReward_16454() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveKmtdReward_16454();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveKmtdReward_16454(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveKmtdReward_16454_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveKmtdReward_16454_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveKmtdReward_16454.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ReceiveKmtdReward_16454)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveKmtdReward_16454 other = (S2C_ReceiveKmtdReward_16454)obj;
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

      public static S2C_ReceiveKmtdReward_16454 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveKmtdReward_16454)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveKmtdReward_16454 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveKmtdReward_16454)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveKmtdReward_16454 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveKmtdReward_16454)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveKmtdReward_16454 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveKmtdReward_16454)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveKmtdReward_16454 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveKmtdReward_16454)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveKmtdReward_16454 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveKmtdReward_16454)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveKmtdReward_16454 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveKmtdReward_16454)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveKmtdReward_16454 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveKmtdReward_16454)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveKmtdReward_16454 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveKmtdReward_16454)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveKmtdReward_16454 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveKmtdReward_16454)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveKmtdReward_16454 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveKmtdReward_16454)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveKmtdReward_16454 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveKmtdReward_16454)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveKmtdReward_16454 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveKmtdReward_16454 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveKmtdReward_16454> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveKmtdReward_16454> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveKmtdReward_16454 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveKmtdReward_16454OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveKmtdReward_16454_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveKmtdReward_16454_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveKmtdReward_16454.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_ReceiveKmtdReward_16454.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveKmtdReward_16454_descriptor;
         }

         public S2C_ReceiveKmtdReward_16454 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_ReceiveKmtdReward_16454.getDefaultInstance();
         }

         public S2C_ReceiveKmtdReward_16454 build() {
            S2C_ReceiveKmtdReward_16454 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveKmtdReward_16454 buildPartial() {
            S2C_ReceiveKmtdReward_16454 result = new S2C_ReceiveKmtdReward_16454(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_ReceiveKmtdReward_16454) {
               return this.mergeFrom((S2C_ReceiveKmtdReward_16454)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveKmtdReward_16454 other) {
            if (other == StarsActivityMsg.S2C_ReceiveKmtdReward_16454.getDefaultInstance()) {
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
            S2C_ReceiveKmtdReward_16454 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveKmtdReward_16454)StarsActivityMsg.S2C_ReceiveKmtdReward_16454.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveKmtdReward_16454)e.getUnfinishedMessage();
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

   public static final class C2S_WishStarBlessingTotalInfo_16455 extends GeneratedMessageV3 implements C2S_WishStarBlessingTotalInfo_16455OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WishStarBlessingTotalInfo_16455 DEFAULT_INSTANCE = new C2S_WishStarBlessingTotalInfo_16455();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WishStarBlessingTotalInfo_16455> PARSER = new AbstractParser<C2S_WishStarBlessingTotalInfo_16455>() {
         public C2S_WishStarBlessingTotalInfo_16455 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WishStarBlessingTotalInfo_16455(input, extensionRegistry);
         }
      };

      private C2S_WishStarBlessingTotalInfo_16455(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WishStarBlessingTotalInfo_16455() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WishStarBlessingTotalInfo_16455();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WishStarBlessingTotalInfo_16455(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_WishStarBlessingTotalInfo_16455_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_WishStarBlessingTotalInfo_16455_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WishStarBlessingTotalInfo_16455.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WishStarBlessingTotalInfo_16455)) {
            return super.equals(obj);
         } else {
            C2S_WishStarBlessingTotalInfo_16455 other = (C2S_WishStarBlessingTotalInfo_16455)obj;
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

      public static C2S_WishStarBlessingTotalInfo_16455 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WishStarBlessingTotalInfo_16455)PARSER.parseFrom(data);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WishStarBlessingTotalInfo_16455)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WishStarBlessingTotalInfo_16455)PARSER.parseFrom(data);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WishStarBlessingTotalInfo_16455)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WishStarBlessingTotalInfo_16455)PARSER.parseFrom(data);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WishStarBlessingTotalInfo_16455)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseFrom(InputStream input) throws IOException {
         return (C2S_WishStarBlessingTotalInfo_16455)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WishStarBlessingTotalInfo_16455)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WishStarBlessingTotalInfo_16455)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WishStarBlessingTotalInfo_16455)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WishStarBlessingTotalInfo_16455)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WishStarBlessingTotalInfo_16455 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WishStarBlessingTotalInfo_16455)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WishStarBlessingTotalInfo_16455 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WishStarBlessingTotalInfo_16455 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WishStarBlessingTotalInfo_16455> parser() {
         return PARSER;
      }

      public Parser<C2S_WishStarBlessingTotalInfo_16455> getParserForType() {
         return PARSER;
      }

      public C2S_WishStarBlessingTotalInfo_16455 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WishStarBlessingTotalInfo_16455OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_WishStarBlessingTotalInfo_16455_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_WishStarBlessingTotalInfo_16455_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WishStarBlessingTotalInfo_16455.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_WishStarBlessingTotalInfo_16455.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_WishStarBlessingTotalInfo_16455_descriptor;
         }

         public C2S_WishStarBlessingTotalInfo_16455 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_WishStarBlessingTotalInfo_16455.getDefaultInstance();
         }

         public C2S_WishStarBlessingTotalInfo_16455 build() {
            C2S_WishStarBlessingTotalInfo_16455 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WishStarBlessingTotalInfo_16455 buildPartial() {
            C2S_WishStarBlessingTotalInfo_16455 result = new C2S_WishStarBlessingTotalInfo_16455(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WishStarBlessingTotalInfo_16455) {
               return this.mergeFrom((C2S_WishStarBlessingTotalInfo_16455)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WishStarBlessingTotalInfo_16455 other) {
            if (other == StarsActivityMsg.C2S_WishStarBlessingTotalInfo_16455.getDefaultInstance()) {
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
            C2S_WishStarBlessingTotalInfo_16455 parsedMessage = null;

            try {
               parsedMessage = (C2S_WishStarBlessingTotalInfo_16455)StarsActivityMsg.C2S_WishStarBlessingTotalInfo_16455.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WishStarBlessingTotalInfo_16455)e.getUnfinishedMessage();
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

   public static final class S2C_WishStarBlessingTotalInfo_16456 extends GeneratedMessageV3 implements S2C_WishStarBlessingTotalInfo_16456OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNLOCKSTAGENUM_FIELD_NUMBER = 1;
      private int unlockStageNum_;
      public static final int CANRECEIVEREWARDIDS_FIELD_NUMBER = 2;
      private Internal.IntList canReceiveRewardIds_;
      public static final int HASRECEIVEREWARDIDS_FIELD_NUMBER = 3;
      private Internal.IntList hasReceiveRewardIds_;
      public static final int NEXTUNLOCKRECEIVEREWARD_FIELD_NUMBER = 4;
      private List<NextUnlockReceiveReward> nextUnlockReceiveReward_;
      private byte memoizedIsInitialized;
      private static final S2C_WishStarBlessingTotalInfo_16456 DEFAULT_INSTANCE = new S2C_WishStarBlessingTotalInfo_16456();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WishStarBlessingTotalInfo_16456> PARSER = new AbstractParser<S2C_WishStarBlessingTotalInfo_16456>() {
         public S2C_WishStarBlessingTotalInfo_16456 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WishStarBlessingTotalInfo_16456(input, extensionRegistry);
         }
      };

      private S2C_WishStarBlessingTotalInfo_16456(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WishStarBlessingTotalInfo_16456() {
         this.memoizedIsInitialized = -1;
         this.canReceiveRewardIds_ = emptyIntList();
         this.hasReceiveRewardIds_ = emptyIntList();
         this.nextUnlockReceiveReward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WishStarBlessingTotalInfo_16456();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WishStarBlessingTotalInfo_16456(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unlockStageNum_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.canReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.canReceiveRewardIds_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.canReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.hasReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.hasReceiveRewardIds_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.hasReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.hasReceiveRewardIds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.nextUnlockReceiveReward_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.nextUnlockReceiveReward_.add(input.readMessage(StarsActivityMsg.NextUnlockReceiveReward.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.canReceiveRewardIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.canReceiveRewardIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.hasReceiveRewardIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.nextUnlockReceiveReward_ = Collections.unmodifiableList(this.nextUnlockReceiveReward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_WishStarBlessingTotalInfo_16456_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_WishStarBlessingTotalInfo_16456_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WishStarBlessingTotalInfo_16456.class, Builder.class);
      }

      public boolean hasUnlockStageNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnlockStageNum() {
         return this.unlockStageNum_;
      }

      public List<Integer> getCanReceiveRewardIdsList() {
         return this.canReceiveRewardIds_;
      }

      public int getCanReceiveRewardIdsCount() {
         return this.canReceiveRewardIds_.size();
      }

      public int getCanReceiveRewardIds(int index) {
         return this.canReceiveRewardIds_.getInt(index);
      }

      public List<Integer> getHasReceiveRewardIdsList() {
         return this.hasReceiveRewardIds_;
      }

      public int getHasReceiveRewardIdsCount() {
         return this.hasReceiveRewardIds_.size();
      }

      public int getHasReceiveRewardIds(int index) {
         return this.hasReceiveRewardIds_.getInt(index);
      }

      public List<NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
         return this.nextUnlockReceiveReward_;
      }

      public List<? extends NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardOrBuilderList() {
         return this.nextUnlockReceiveReward_;
      }

      public int getNextUnlockReceiveRewardCount() {
         return this.nextUnlockReceiveReward_.size();
      }

      public NextUnlockReceiveReward getNextUnlockReceiveReward(int index) {
         return (NextUnlockReceiveReward)this.nextUnlockReceiveReward_.get(index);
      }

      public NextUnlockReceiveRewardOrBuilder getNextUnlockReceiveRewardOrBuilder(int index) {
         return (NextUnlockReceiveRewardOrBuilder)this.nextUnlockReceiveReward_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnlockStageNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getNextUnlockReceiveRewardCount(); ++i) {
               if (!this.getNextUnlockReceiveReward(i).isInitialized()) {
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
            output.writeInt32(1, this.unlockStageNum_);
         }

         for(int i = 0; i < this.canReceiveRewardIds_.size(); ++i) {
            output.writeInt32(2, this.canReceiveRewardIds_.getInt(i));
         }

         for(int i = 0; i < this.hasReceiveRewardIds_.size(); ++i) {
            output.writeInt32(3, this.hasReceiveRewardIds_.getInt(i));
         }

         for(int i = 0; i < this.nextUnlockReceiveReward_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.nextUnlockReceiveReward_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.unlockStageNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.canReceiveRewardIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.canReceiveRewardIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCanReceiveRewardIdsList().size();
            dataSize = 0;

            for(int i = 0; i < this.hasReceiveRewardIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.hasReceiveRewardIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHasReceiveRewardIdsList().size();

            for(int i = 0; i < this.nextUnlockReceiveReward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.nextUnlockReceiveReward_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WishStarBlessingTotalInfo_16456)) {
            return super.equals(obj);
         } else {
            S2C_WishStarBlessingTotalInfo_16456 other = (S2C_WishStarBlessingTotalInfo_16456)obj;
            if (this.hasUnlockStageNum() != other.hasUnlockStageNum()) {
               return false;
            } else if (this.hasUnlockStageNum() && this.getUnlockStageNum() != other.getUnlockStageNum()) {
               return false;
            } else if (!this.getCanReceiveRewardIdsList().equals(other.getCanReceiveRewardIdsList())) {
               return false;
            } else if (!this.getHasReceiveRewardIdsList().equals(other.getHasReceiveRewardIdsList())) {
               return false;
            } else if (!this.getNextUnlockReceiveRewardList().equals(other.getNextUnlockReceiveRewardList())) {
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
            if (this.hasUnlockStageNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnlockStageNum();
            }

            if (this.getCanReceiveRewardIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCanReceiveRewardIdsList().hashCode();
            }

            if (this.getHasReceiveRewardIdsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHasReceiveRewardIdsList().hashCode();
            }

            if (this.getNextUnlockReceiveRewardCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getNextUnlockReceiveRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WishStarBlessingTotalInfo_16456)PARSER.parseFrom(data);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WishStarBlessingTotalInfo_16456)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WishStarBlessingTotalInfo_16456)PARSER.parseFrom(data);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WishStarBlessingTotalInfo_16456)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WishStarBlessingTotalInfo_16456)PARSER.parseFrom(data);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WishStarBlessingTotalInfo_16456)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseFrom(InputStream input) throws IOException {
         return (S2C_WishStarBlessingTotalInfo_16456)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WishStarBlessingTotalInfo_16456)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WishStarBlessingTotalInfo_16456)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WishStarBlessingTotalInfo_16456)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WishStarBlessingTotalInfo_16456)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WishStarBlessingTotalInfo_16456 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WishStarBlessingTotalInfo_16456)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WishStarBlessingTotalInfo_16456 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WishStarBlessingTotalInfo_16456 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WishStarBlessingTotalInfo_16456> parser() {
         return PARSER;
      }

      public Parser<S2C_WishStarBlessingTotalInfo_16456> getParserForType() {
         return PARSER;
      }

      public S2C_WishStarBlessingTotalInfo_16456 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WishStarBlessingTotalInfo_16456OrBuilder {
         private int bitField0_;
         private int unlockStageNum_;
         private Internal.IntList canReceiveRewardIds_;
         private Internal.IntList hasReceiveRewardIds_;
         private List<NextUnlockReceiveReward> nextUnlockReceiveReward_;
         private RepeatedFieldBuilderV3<NextUnlockReceiveReward, NextUnlockReceiveReward.Builder, NextUnlockReceiveRewardOrBuilder> nextUnlockReceiveRewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_WishStarBlessingTotalInfo_16456_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_WishStarBlessingTotalInfo_16456_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WishStarBlessingTotalInfo_16456.class, Builder.class);
         }

         private Builder() {
            this.canReceiveRewardIds_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.emptyIntList();
            this.hasReceiveRewardIds_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.canReceiveRewardIds_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.emptyIntList();
            this.hasReceiveRewardIds_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.alwaysUseFieldBuilders) {
               this.getNextUnlockReceiveRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.unlockStageNum_ = 0;
            this.bitField0_ &= -2;
            this.canReceiveRewardIds_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.emptyIntList();
            this.bitField0_ &= -3;
            this.hasReceiveRewardIds_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.emptyIntList();
            this.bitField0_ &= -5;
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.nextUnlockReceiveReward_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.nextUnlockReceiveRewardBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_WishStarBlessingTotalInfo_16456_descriptor;
         }

         public S2C_WishStarBlessingTotalInfo_16456 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.getDefaultInstance();
         }

         public S2C_WishStarBlessingTotalInfo_16456 build() {
            S2C_WishStarBlessingTotalInfo_16456 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WishStarBlessingTotalInfo_16456 buildPartial() {
            S2C_WishStarBlessingTotalInfo_16456 result = new S2C_WishStarBlessingTotalInfo_16456(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unlockStageNum_ = this.unlockStageNum_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.canReceiveRewardIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.canReceiveRewardIds_ = this.canReceiveRewardIds_;
            if ((this.bitField0_ & 4) != 0) {
               this.hasReceiveRewardIds_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.hasReceiveRewardIds_ = this.hasReceiveRewardIds_;
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.nextUnlockReceiveReward_ = Collections.unmodifiableList(this.nextUnlockReceiveReward_);
                  this.bitField0_ &= -9;
               }

               result.nextUnlockReceiveReward_ = this.nextUnlockReceiveReward_;
            } else {
               result.nextUnlockReceiveReward_ = this.nextUnlockReceiveRewardBuilder_.build();
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
            if (other instanceof S2C_WishStarBlessingTotalInfo_16456) {
               return this.mergeFrom((S2C_WishStarBlessingTotalInfo_16456)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WishStarBlessingTotalInfo_16456 other) {
            if (other == StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnlockStageNum()) {
                  this.setUnlockStageNum(other.getUnlockStageNum());
               }

               if (!other.canReceiveRewardIds_.isEmpty()) {
                  if (this.canReceiveRewardIds_.isEmpty()) {
                     this.canReceiveRewardIds_ = other.canReceiveRewardIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureCanReceiveRewardIdsIsMutable();
                     this.canReceiveRewardIds_.addAll(other.canReceiveRewardIds_);
                  }

                  this.onChanged();
               }

               if (!other.hasReceiveRewardIds_.isEmpty()) {
                  if (this.hasReceiveRewardIds_.isEmpty()) {
                     this.hasReceiveRewardIds_ = other.hasReceiveRewardIds_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureHasReceiveRewardIdsIsMutable();
                     this.hasReceiveRewardIds_.addAll(other.hasReceiveRewardIds_);
                  }

                  this.onChanged();
               }

               if (this.nextUnlockReceiveRewardBuilder_ == null) {
                  if (!other.nextUnlockReceiveReward_.isEmpty()) {
                     if (this.nextUnlockReceiveReward_.isEmpty()) {
                        this.nextUnlockReceiveReward_ = other.nextUnlockReceiveReward_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureNextUnlockReceiveRewardIsMutable();
                        this.nextUnlockReceiveReward_.addAll(other.nextUnlockReceiveReward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.nextUnlockReceiveReward_.isEmpty()) {
                  if (this.nextUnlockReceiveRewardBuilder_.isEmpty()) {
                     this.nextUnlockReceiveRewardBuilder_.dispose();
                     this.nextUnlockReceiveRewardBuilder_ = null;
                     this.nextUnlockReceiveReward_ = other.nextUnlockReceiveReward_;
                     this.bitField0_ &= -9;
                     this.nextUnlockReceiveRewardBuilder_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.alwaysUseFieldBuilders ? this.getNextUnlockReceiveRewardFieldBuilder() : null;
                  } else {
                     this.nextUnlockReceiveRewardBuilder_.addAllMessages(other.nextUnlockReceiveReward_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUnlockStageNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getNextUnlockReceiveRewardCount(); ++i) {
                  if (!this.getNextUnlockReceiveReward(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WishStarBlessingTotalInfo_16456 parsedMessage = null;

            try {
               parsedMessage = (S2C_WishStarBlessingTotalInfo_16456)StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WishStarBlessingTotalInfo_16456)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnlockStageNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnlockStageNum() {
            return this.unlockStageNum_;
         }

         public Builder setUnlockStageNum(int value) {
            this.bitField0_ |= 1;
            this.unlockStageNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnlockStageNum() {
            this.bitField0_ &= -2;
            this.unlockStageNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureCanReceiveRewardIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.canReceiveRewardIds_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.mutableCopy(this.canReceiveRewardIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getCanReceiveRewardIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.canReceiveRewardIds_) : this.canReceiveRewardIds_);
         }

         public int getCanReceiveRewardIdsCount() {
            return this.canReceiveRewardIds_.size();
         }

         public int getCanReceiveRewardIds(int index) {
            return this.canReceiveRewardIds_.getInt(index);
         }

         public Builder setCanReceiveRewardIds(int index, int value) {
            this.ensureCanReceiveRewardIdsIsMutable();
            this.canReceiveRewardIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCanReceiveRewardIds(int value) {
            this.ensureCanReceiveRewardIdsIsMutable();
            this.canReceiveRewardIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCanReceiveRewardIds(Iterable<? extends Integer> values) {
            this.ensureCanReceiveRewardIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.canReceiveRewardIds_);
            this.onChanged();
            return this;
         }

         public Builder clearCanReceiveRewardIds() {
            this.canReceiveRewardIds_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureHasReceiveRewardIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.hasReceiveRewardIds_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.mutableCopy(this.hasReceiveRewardIds_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getHasReceiveRewardIdsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.hasReceiveRewardIds_) : this.hasReceiveRewardIds_);
         }

         public int getHasReceiveRewardIdsCount() {
            return this.hasReceiveRewardIds_.size();
         }

         public int getHasReceiveRewardIds(int index) {
            return this.hasReceiveRewardIds_.getInt(index);
         }

         public Builder setHasReceiveRewardIds(int index, int value) {
            this.ensureHasReceiveRewardIdsIsMutable();
            this.hasReceiveRewardIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHasReceiveRewardIds(int value) {
            this.ensureHasReceiveRewardIdsIsMutable();
            this.hasReceiveRewardIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHasReceiveRewardIds(Iterable<? extends Integer> values) {
            this.ensureHasReceiveRewardIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hasReceiveRewardIds_);
            this.onChanged();
            return this;
         }

         public Builder clearHasReceiveRewardIds() {
            this.hasReceiveRewardIds_ = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureNextUnlockReceiveRewardIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.nextUnlockReceiveReward_ = new ArrayList(this.nextUnlockReceiveReward_);
               this.bitField0_ |= 8;
            }

         }

         public List<NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
            return this.nextUnlockReceiveRewardBuilder_ == null ? Collections.unmodifiableList(this.nextUnlockReceiveReward_) : this.nextUnlockReceiveRewardBuilder_.getMessageList();
         }

         public int getNextUnlockReceiveRewardCount() {
            return this.nextUnlockReceiveRewardBuilder_ == null ? this.nextUnlockReceiveReward_.size() : this.nextUnlockReceiveRewardBuilder_.getCount();
         }

         public NextUnlockReceiveReward getNextUnlockReceiveReward(int index) {
            return this.nextUnlockReceiveRewardBuilder_ == null ? (NextUnlockReceiveReward)this.nextUnlockReceiveReward_.get(index) : (NextUnlockReceiveReward)this.nextUnlockReceiveRewardBuilder_.getMessage(index);
         }

         public Builder setNextUnlockReceiveReward(int index, NextUnlockReceiveReward value) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.set(index, value);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setNextUnlockReceiveReward(int index, NextUnlockReceiveReward.Builder builderForValue) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(NextUnlockReceiveReward value) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(value);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(int index, NextUnlockReceiveReward value) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(index, value);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(NextUnlockReceiveReward.Builder builderForValue) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(int index, NextUnlockReceiveReward.Builder builderForValue) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllNextUnlockReceiveReward(Iterable<? extends NextUnlockReceiveReward> values) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.nextUnlockReceiveReward_);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearNextUnlockReceiveReward() {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.nextUnlockReceiveReward_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeNextUnlockReceiveReward(int index) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.remove(index);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.remove(index);
            }

            return this;
         }

         public NextUnlockReceiveReward.Builder getNextUnlockReceiveRewardBuilder(int index) {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().getBuilder(index);
         }

         public NextUnlockReceiveRewardOrBuilder getNextUnlockReceiveRewardOrBuilder(int index) {
            return this.nextUnlockReceiveRewardBuilder_ == null ? (NextUnlockReceiveRewardOrBuilder)this.nextUnlockReceiveReward_.get(index) : (NextUnlockReceiveRewardOrBuilder)this.nextUnlockReceiveRewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardOrBuilderList() {
            return this.nextUnlockReceiveRewardBuilder_ != null ? this.nextUnlockReceiveRewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.nextUnlockReceiveReward_);
         }

         public NextUnlockReceiveReward.Builder addNextUnlockReceiveRewardBuilder() {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(StarsActivityMsg.NextUnlockReceiveReward.getDefaultInstance());
         }

         public NextUnlockReceiveReward.Builder addNextUnlockReceiveRewardBuilder(int index) {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(index, StarsActivityMsg.NextUnlockReceiveReward.getDefaultInstance());
         }

         public List<NextUnlockReceiveReward.Builder> getNextUnlockReceiveRewardBuilderList() {
            return this.getNextUnlockReceiveRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<NextUnlockReceiveReward, NextUnlockReceiveReward.Builder, NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardFieldBuilder() {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.nextUnlockReceiveRewardBuilder_ = new RepeatedFieldBuilderV3(this.nextUnlockReceiveReward_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.nextUnlockReceiveReward_ = null;
            }

            return this.nextUnlockReceiveRewardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class NextUnlockReceiveReward extends GeneratedMessageV3 implements NextUnlockReceiveRewardOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      public static final int PROGRESS_FIELD_NUMBER = 2;
      private double progress_;
      private byte memoizedIsInitialized;
      private static final NextUnlockReceiveReward DEFAULT_INSTANCE = new NextUnlockReceiveReward();
      /** @deprecated */
      @Deprecated
      public static final Parser<NextUnlockReceiveReward> PARSER = new AbstractParser<NextUnlockReceiveReward>() {
         public NextUnlockReceiveReward parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new NextUnlockReceiveReward(input, extensionRegistry);
         }
      };

      private NextUnlockReceiveReward(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private NextUnlockReceiveReward() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new NextUnlockReceiveReward();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private NextUnlockReceiveReward(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 17:
                        this.bitField0_ |= 2;
                        this.progress_ = input.readDouble();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public boolean hasProgress() {
         return (this.bitField0_ & 2) != 0;
      }

      public double getProgress() {
         return this.progress_;
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
         } else if (!this.hasProgress()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeDouble(2, this.progress_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeDoubleSize(2, this.progress_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof NextUnlockReceiveReward)) {
            return super.equals(obj);
         } else {
            NextUnlockReceiveReward other = (NextUnlockReceiveReward)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
               return false;
            } else if (this.hasProgress() != other.hasProgress()) {
               return false;
            } else if (this.hasProgress() && Double.doubleToLongBits(this.getProgress()) != Double.doubleToLongBits(other.getProgress())) {
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

            if (this.hasProgress()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getProgress()));
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static NextUnlockReceiveReward parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data);
      }

      public static NextUnlockReceiveReward parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data);
      }

      public static NextUnlockReceiveReward parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data);
      }

      public static NextUnlockReceiveReward parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(InputStream input) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NextUnlockReceiveReward parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseDelimitedFrom(InputStream input) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static NextUnlockReceiveReward parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(CodedInputStream input) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NextUnlockReceiveReward parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(NextUnlockReceiveReward prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static NextUnlockReceiveReward getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<NextUnlockReceiveReward> parser() {
         return PARSER;
      }

      public Parser<NextUnlockReceiveReward> getParserForType() {
         return PARSER;
      }

      public NextUnlockReceiveReward getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NextUnlockReceiveRewardOrBuilder {
         private int bitField0_;
         private int rewardId_;
         private double progress_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.NextUnlockReceiveReward.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            this.progress_ = (double)0.0F;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         public NextUnlockReceiveReward getDefaultInstanceForType() {
            return StarsActivityMsg.NextUnlockReceiveReward.getDefaultInstance();
         }

         public NextUnlockReceiveReward build() {
            NextUnlockReceiveReward result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public NextUnlockReceiveReward buildPartial() {
            NextUnlockReceiveReward result = new NextUnlockReceiveReward(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.progress_ = this.progress_;
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
            if (other instanceof NextUnlockReceiveReward) {
               return this.mergeFrom((NextUnlockReceiveReward)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(NextUnlockReceiveReward other) {
            if (other == StarsActivityMsg.NextUnlockReceiveReward.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               if (other.hasProgress()) {
                  this.setProgress(other.getProgress());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRewardId()) {
               return false;
            } else {
               return this.hasProgress();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            NextUnlockReceiveReward parsedMessage = null;

            try {
               parsedMessage = (NextUnlockReceiveReward)StarsActivityMsg.NextUnlockReceiveReward.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (NextUnlockReceiveReward)e.getUnfinishedMessage();
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

         public boolean hasProgress() {
            return (this.bitField0_ & 2) != 0;
         }

         public double getProgress() {
            return this.progress_;
         }

         public Builder setProgress(double value) {
            this.bitField0_ |= 2;
            this.progress_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProgress() {
            this.bitField0_ &= -3;
            this.progress_ = (double)0.0F;
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

   public static final class C2S_ReceiveWishStarBlessingReward_16457 extends GeneratedMessageV3 implements C2S_ReceiveWishStarBlessingReward_16457OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveWishStarBlessingReward_16457 DEFAULT_INSTANCE = new C2S_ReceiveWishStarBlessingReward_16457();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveWishStarBlessingReward_16457> PARSER = new AbstractParser<C2S_ReceiveWishStarBlessingReward_16457>() {
         public C2S_ReceiveWishStarBlessingReward_16457 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveWishStarBlessingReward_16457(input, extensionRegistry);
         }
      };

      private C2S_ReceiveWishStarBlessingReward_16457(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveWishStarBlessingReward_16457() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveWishStarBlessingReward_16457();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveWishStarBlessingReward_16457(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveWishStarBlessingReward_16457_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveWishStarBlessingReward_16457_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveWishStarBlessingReward_16457.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveWishStarBlessingReward_16457)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveWishStarBlessingReward_16457 other = (C2S_ReceiveWishStarBlessingReward_16457)obj;
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

      public static C2S_ReceiveWishStarBlessingReward_16457 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWishStarBlessingReward_16457)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWishStarBlessingReward_16457)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWishStarBlessingReward_16457)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWishStarBlessingReward_16457)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWishStarBlessingReward_16457)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWishStarBlessingReward_16457)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveWishStarBlessingReward_16457)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWishStarBlessingReward_16457)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveWishStarBlessingReward_16457)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWishStarBlessingReward_16457)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveWishStarBlessingReward_16457)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWishStarBlessingReward_16457)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveWishStarBlessingReward_16457 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveWishStarBlessingReward_16457 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveWishStarBlessingReward_16457> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveWishStarBlessingReward_16457> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveWishStarBlessingReward_16457 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveWishStarBlessingReward_16457OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveWishStarBlessingReward_16457_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveWishStarBlessingReward_16457_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveWishStarBlessingReward_16457.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.C2S_ReceiveWishStarBlessingReward_16457.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_C2S_ReceiveWishStarBlessingReward_16457_descriptor;
         }

         public C2S_ReceiveWishStarBlessingReward_16457 getDefaultInstanceForType() {
            return StarsActivityMsg.C2S_ReceiveWishStarBlessingReward_16457.getDefaultInstance();
         }

         public C2S_ReceiveWishStarBlessingReward_16457 build() {
            C2S_ReceiveWishStarBlessingReward_16457 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveWishStarBlessingReward_16457 buildPartial() {
            C2S_ReceiveWishStarBlessingReward_16457 result = new C2S_ReceiveWishStarBlessingReward_16457(this);
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
            if (other instanceof C2S_ReceiveWishStarBlessingReward_16457) {
               return this.mergeFrom((C2S_ReceiveWishStarBlessingReward_16457)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveWishStarBlessingReward_16457 other) {
            if (other == StarsActivityMsg.C2S_ReceiveWishStarBlessingReward_16457.getDefaultInstance()) {
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
            C2S_ReceiveWishStarBlessingReward_16457 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveWishStarBlessingReward_16457)StarsActivityMsg.C2S_ReceiveWishStarBlessingReward_16457.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveWishStarBlessingReward_16457)e.getUnfinishedMessage();
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

   public static final class S2C_ReceiveWishStarBlessingReward_16458 extends GeneratedMessageV3 implements S2C_ReceiveWishStarBlessingReward_16458OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveWishStarBlessingReward_16458 DEFAULT_INSTANCE = new S2C_ReceiveWishStarBlessingReward_16458();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveWishStarBlessingReward_16458> PARSER = new AbstractParser<S2C_ReceiveWishStarBlessingReward_16458>() {
         public S2C_ReceiveWishStarBlessingReward_16458 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveWishStarBlessingReward_16458(input, extensionRegistry);
         }
      };

      private S2C_ReceiveWishStarBlessingReward_16458(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveWishStarBlessingReward_16458() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveWishStarBlessingReward_16458();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveWishStarBlessingReward_16458(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveWishStarBlessingReward_16458_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveWishStarBlessingReward_16458_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveWishStarBlessingReward_16458.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ReceiveWishStarBlessingReward_16458)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveWishStarBlessingReward_16458 other = (S2C_ReceiveWishStarBlessingReward_16458)obj;
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

      public static S2C_ReceiveWishStarBlessingReward_16458 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveWishStarBlessingReward_16458)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveWishStarBlessingReward_16458)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveWishStarBlessingReward_16458)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveWishStarBlessingReward_16458)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveWishStarBlessingReward_16458)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveWishStarBlessingReward_16458)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveWishStarBlessingReward_16458)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveWishStarBlessingReward_16458)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveWishStarBlessingReward_16458)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveWishStarBlessingReward_16458)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveWishStarBlessingReward_16458)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveWishStarBlessingReward_16458)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveWishStarBlessingReward_16458 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveWishStarBlessingReward_16458 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveWishStarBlessingReward_16458> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveWishStarBlessingReward_16458> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveWishStarBlessingReward_16458 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveWishStarBlessingReward_16458OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveWishStarBlessingReward_16458_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveWishStarBlessingReward_16458_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveWishStarBlessingReward_16458.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StarsActivityMsg.S2C_ReceiveWishStarBlessingReward_16458.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StarsActivityMsg.internal_static_starsActivity_com_gzbz_protobuf_S2C_ReceiveWishStarBlessingReward_16458_descriptor;
         }

         public S2C_ReceiveWishStarBlessingReward_16458 getDefaultInstanceForType() {
            return StarsActivityMsg.S2C_ReceiveWishStarBlessingReward_16458.getDefaultInstance();
         }

         public S2C_ReceiveWishStarBlessingReward_16458 build() {
            S2C_ReceiveWishStarBlessingReward_16458 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveWishStarBlessingReward_16458 buildPartial() {
            S2C_ReceiveWishStarBlessingReward_16458 result = new S2C_ReceiveWishStarBlessingReward_16458(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_ReceiveWishStarBlessingReward_16458) {
               return this.mergeFrom((S2C_ReceiveWishStarBlessingReward_16458)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveWishStarBlessingReward_16458 other) {
            if (other == StarsActivityMsg.S2C_ReceiveWishStarBlessingReward_16458.getDefaultInstance()) {
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
            S2C_ReceiveWishStarBlessingReward_16458 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveWishStarBlessingReward_16458)StarsActivityMsg.S2C_ReceiveWishStarBlessingReward_16458.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveWishStarBlessingReward_16458)e.getUnfinishedMessage();
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

   public interface C2S_ActivityInfo_16401OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawRecord_16409OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Draw_16405OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_FancyReward_16413OrBuilder extends MessageOrBuilder {
      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_LuckDrawInfo_16403OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenReward_16407OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Pray_16421OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ReceiveKmtdReward_16453OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_ReceiveWishStarBlessingReward_16457OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_ServerDrawRecord_16411OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SkyLampRechargeTotalInfo_16451OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WishStarBlessingTotalInfo_16455OrBuilder extends MessageOrBuilder {
   }

   public interface DrawRecordOrBuilder extends MessageOrBuilder {
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

   public interface NextUnlockReceiveRewardOrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();

      boolean hasProgress();

      double getProgress();
   }

   public interface S2C_ActivityInfo_16402OrBuilder extends MessageOrBuilder {
      boolean hasActivityOpenDay();

      int getActivityOpenDay();

      boolean hasSeverActivityDay();

      int getSeverActivityDay();
   }

   public interface S2C_DrawRecord_16410OrBuilder extends MessageOrBuilder {
      List<MyDrawRecord> getMyRecordList();

      MyDrawRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList();

      MyDrawRecordOrBuilder getMyRecordOrBuilder(int index);
   }

   public interface S2C_Draw_16406OrBuilder extends MessageOrBuilder {
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

   public interface S2C_FancyReward_16414OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface S2C_LuckDrawInfo_16404OrBuilder extends MessageOrBuilder {
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

   public interface S2C_OpenReward_16408OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_PrayInfo_16426OrBuilder extends MessageOrBuilder {
      boolean hasPrayNum();

      int getPrayNum();
   }

   public interface S2C_PrayTaskList_16428OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_PrayTaskNotify_16424OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_Pray_16422OrBuilder extends MessageOrBuilder {
      boolean hasPrayNum();

      int getPrayNum();
   }

   public interface S2C_ReceiveKmtdReward_16454OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ReceiveWishStarBlessingReward_16458OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ServerDrawRecord_16412OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_SkyLampRechargeTotalInfo_16452OrBuilder extends MessageOrBuilder {
      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);

      boolean hasStageRecharge();

      int getStageRecharge();

      boolean hasStageEndTime();

      long getStageEndTime();
   }

   public interface S2C_WishStarBlessingTotalInfo_16456OrBuilder extends MessageOrBuilder {
      boolean hasUnlockStageNum();

      int getUnlockStageNum();

      List<Integer> getCanReceiveRewardIdsList();

      int getCanReceiveRewardIdsCount();

      int getCanReceiveRewardIds(int index);

      List<Integer> getHasReceiveRewardIdsList();

      int getHasReceiveRewardIdsCount();

      int getHasReceiveRewardIds(int index);

      List<NextUnlockReceiveReward> getNextUnlockReceiveRewardList();

      NextUnlockReceiveReward getNextUnlockReceiveReward(int index);

      int getNextUnlockReceiveRewardCount();

      List<? extends NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardOrBuilderList();

      NextUnlockReceiveRewardOrBuilder getNextUnlockReceiveRewardOrBuilder(int index);
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
   }
}
