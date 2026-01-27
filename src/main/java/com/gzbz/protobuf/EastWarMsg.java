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

public final class EastWarMsg {
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_OpenUi_15601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_OpenUi_15601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_OpenUiResult_15602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_OpenUiResult_15602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGift_15611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGift_15611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGift_15612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGift_15612_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGiftChoice_15613_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGiftChoice_15613_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftChoice_15614_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftChoice_15614_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftBuy_15616_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftBuy_15616_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_Appointment_15621_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_Appointment_15621_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_Appointment_15622_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_Appointment_15622_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_DrawKey_15623_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_DrawKey_15623_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_DrawKey_15624_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_DrawKey_15624_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_Coincidence_15625_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_Coincidence_15625_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_Coincidence_15626_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_Coincidence_15626_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_CoincidenceBox_15627_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_CoincidenceBox_15627_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_CoincidenceBox_15628_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_CoincidenceBox_15628_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_CumulativeId_15629_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_CumulativeId_15629_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_CumulativeId_15630_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_CumulativeId_15630_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_MakeWine_15641_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_MakeWine_15641_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_MakeWine_15642_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_MakeWine_15642_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_TakePlumReward_15643_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_TakePlumReward_15643_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_TakePlumReward_15644_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_TakePlumReward_15644_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_Drink_15645_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_Drink_15645_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_Drink_15646_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_Drink_15646_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_FreeDrinkNum_15647_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_FreeDrinkNum_15647_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_FreeDrinkNum_15648_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_FreeDrinkNum_15648_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_CommitTask_15651_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_CommitTask_15651_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_CommitTask_15652_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_CommitTask_15652_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_EastWarTasks_15653_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_EastWarTasks_15653_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_EastWarTasks_15654_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_EastWarTasks_15654_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_UpdateTasks_15656_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_UpdateTasks_15656_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_LaborOpenServerRank_15657_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_LaborOpenServerRank_15657_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_LaborOpenServerRank_15658_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_LaborOpenServerRank_15658_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_C2S_OpenServerRank_15659_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_C2S_OpenServerRank_15659_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWar_com_gzbz_protobuf_S2C_OpenServerRank_15660_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWar_com_gzbz_protobuf_S2C_OpenServerRank_15660_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private EastWarMsg() {
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
      String[] descriptorData = new String[]{"\n\rEastWar.proto\u0012\u0019eastWar.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"\u0012\n\u0010C2S_OpenUi_15601\"<\n\u0016S2C_OpenUiResult_15602\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_OptionalGift_15611\"V\n\u0016S2C_OptionalGift_15612\u0012<\n\bgiftList\u0018\u0001 \u0003(\u000b2*.activity.com.gzbz.protobuf.CustomGiftData\"t\n\u001cC2S_OptionalGiftChoice_15613\u0012\u0010\n\bcustomId\u0018\u0001 \u0002(\u0005\u0012B\n\u0007buyData\u0018\u0002 \u0003(\u000b21.activity.com.gzbz.protobuf.CustomGiftBuyItemData\"\\\n\u001cS2C_OptionalGiftChoice_15614\u0012<\n\bgiftData\u0018\u0001 \u0002(\u000b2*.activity.com.gzbz.protobuf.CustomGiftData\"Y\n\u0019S2C_OptionalGiftBuy_15616\u0012<\n\bgiftData\u0018\u0001 \u0002(\u000b2*.activity.com.gzbz.protobuf.CustomGiftData\"\u0017\n\u0015C2S_Appointment_15621\"k\n\u0015S2C_Appointment_15622\u0012\u0011\n\thadGetKey\u0018\u0001 \u0003(\u0005\u0012\u000f\n\u0007totalId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bhadGetId\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004boxs\u0018\u0004 \u0003(\u0005\u0012\u000e\n\u0006curDay\u0018\u0005 \u0002(\u0005\"\u001f\n\u0011C2S_DrawKey_15623\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u001f\n\u0011S2C_DrawKey_15624\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0017\n\u0015C2S_Coincidence_15625\")\n\u0015S2C_Coincidence_15626\u0012\u0010\n\bhadGetId\u0018\u0001 \u0002(\u0005\"&\n\u0018C2S_CoincidenceBox_15627\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"&\n\u0018S2C_CoincidenceBox_15628\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_CumulativeId_15629\")\n\u0016S2C_CumulativeId_15630\u0012\u000f\n\u0007totalId\u0018\u0001 \u0002(\u0005\"!\n\u0012C2S_MakeWine_15641\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\":\n\u0012S2C_MakeWine_15642\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0014\n\ftotalWineNum\u0018\u0002 \u0002(\u0005\"\u001a\n\u0018C2S_TakePlumReward_15643\"*\n\u0018S2C_TakePlumReward_15644\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u0011\n\u000fC2S_Drink_15645\"2\n\u000fS2C_Drink_15646\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007freeNum\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_FreeDrinkNum_15647\"P\n\u0016S2C_FreeDrinkNum_15648\u0012\u000f\n\u0007freeNum\u0018\u0001 \u0002(\u0005\u0012\u0014\n\ftotalWineNum\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007isTaked\u0018\u0003 \u0002(\b\"&\n\u0014C2S_CommitTask_15651\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_CommitTask_15652\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_EastWarTasks_15653\"4\n\u0016S2C_EastWarTasks_15654\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"3\n\u0015S2C_UpdateTasks_15656\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"\u001f\n\u001dC2S_LaborOpenServerRank_15657\";\n\u001dS2C_LaborOpenServerRank_15658\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004time\u0018\u0003 \u0001(\u0005\"\u001a\n\u0018C2S_OpenServerRank_15659\"6\n\u0018S2C_OpenServerRank_15660\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004time\u0018\u0003 \u0001(\u0005B!\n\u0011com.gzbz.protobufB\nEastWarMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_eastWar_com_gzbz_protobuf_C2S_OpenUi_15601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_eastWar_com_gzbz_protobuf_C2S_OpenUi_15601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_OpenUi_15601_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_OpenUiResult_15602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_eastWar_com_gzbz_protobuf_S2C_OpenUiResult_15602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_OpenUiResult_15602_descriptor, new String[]{"StartTime", "EndTime"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGift_15611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGift_15611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGift_15611_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGift_15612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGift_15612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGift_15612_descriptor, new String[]{"GiftList"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGiftChoice_15613_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGiftChoice_15613_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGiftChoice_15613_descriptor, new String[]{"CustomId", "BuyData"});
      internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftChoice_15614_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftChoice_15614_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftChoice_15614_descriptor, new String[]{"GiftData"});
      internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftBuy_15616_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftBuy_15616_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftBuy_15616_descriptor, new String[]{"GiftData"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_Appointment_15621_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_eastWar_com_gzbz_protobuf_C2S_Appointment_15621_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_Appointment_15621_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_Appointment_15622_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_eastWar_com_gzbz_protobuf_S2C_Appointment_15622_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_Appointment_15622_descriptor, new String[]{"HadGetKey", "TotalId", "HadGetId", "Boxs", "CurDay"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_DrawKey_15623_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_eastWar_com_gzbz_protobuf_C2S_DrawKey_15623_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_DrawKey_15623_descriptor, new String[]{"Id"});
      internal_static_eastWar_com_gzbz_protobuf_S2C_DrawKey_15624_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_eastWar_com_gzbz_protobuf_S2C_DrawKey_15624_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_DrawKey_15624_descriptor, new String[]{"Id"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_Coincidence_15625_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_eastWar_com_gzbz_protobuf_C2S_Coincidence_15625_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_Coincidence_15625_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_Coincidence_15626_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_eastWar_com_gzbz_protobuf_S2C_Coincidence_15626_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_Coincidence_15626_descriptor, new String[]{"HadGetId"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_CoincidenceBox_15627_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_eastWar_com_gzbz_protobuf_C2S_CoincidenceBox_15627_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_CoincidenceBox_15627_descriptor, new String[]{"Id"});
      internal_static_eastWar_com_gzbz_protobuf_S2C_CoincidenceBox_15628_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_eastWar_com_gzbz_protobuf_S2C_CoincidenceBox_15628_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_CoincidenceBox_15628_descriptor, new String[]{"Id"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_CumulativeId_15629_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_eastWar_com_gzbz_protobuf_C2S_CumulativeId_15629_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_CumulativeId_15629_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_CumulativeId_15630_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_eastWar_com_gzbz_protobuf_S2C_CumulativeId_15630_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_CumulativeId_15630_descriptor, new String[]{"TotalId"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_MakeWine_15641_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_eastWar_com_gzbz_protobuf_C2S_MakeWine_15641_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_MakeWine_15641_descriptor, new String[]{"Num"});
      internal_static_eastWar_com_gzbz_protobuf_S2C_MakeWine_15642_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_eastWar_com_gzbz_protobuf_S2C_MakeWine_15642_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_MakeWine_15642_descriptor, new String[]{"Result", "TotalWineNum"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_TakePlumReward_15643_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_eastWar_com_gzbz_protobuf_C2S_TakePlumReward_15643_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_TakePlumReward_15643_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_TakePlumReward_15644_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_eastWar_com_gzbz_protobuf_S2C_TakePlumReward_15644_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_TakePlumReward_15644_descriptor, new String[]{"Result"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_Drink_15645_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_eastWar_com_gzbz_protobuf_C2S_Drink_15645_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_Drink_15645_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_Drink_15646_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_eastWar_com_gzbz_protobuf_S2C_Drink_15646_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_Drink_15646_descriptor, new String[]{"Result", "FreeNum"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_FreeDrinkNum_15647_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_eastWar_com_gzbz_protobuf_C2S_FreeDrinkNum_15647_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_FreeDrinkNum_15647_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_FreeDrinkNum_15648_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_eastWar_com_gzbz_protobuf_S2C_FreeDrinkNum_15648_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_FreeDrinkNum_15648_descriptor, new String[]{"FreeNum", "TotalWineNum", "IsTaked"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_CommitTask_15651_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_eastWar_com_gzbz_protobuf_C2S_CommitTask_15651_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_CommitTask_15651_descriptor, new String[]{"TaskId"});
      internal_static_eastWar_com_gzbz_protobuf_S2C_CommitTask_15652_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_eastWar_com_gzbz_protobuf_S2C_CommitTask_15652_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_CommitTask_15652_descriptor, new String[]{"TaskId"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_EastWarTasks_15653_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_eastWar_com_gzbz_protobuf_C2S_EastWarTasks_15653_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_EastWarTasks_15653_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_EastWarTasks_15654_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_eastWar_com_gzbz_protobuf_S2C_EastWarTasks_15654_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_EastWarTasks_15654_descriptor, new String[]{"Task"});
      internal_static_eastWar_com_gzbz_protobuf_S2C_UpdateTasks_15656_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_eastWar_com_gzbz_protobuf_S2C_UpdateTasks_15656_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_UpdateTasks_15656_descriptor, new String[]{"Task"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_LaborOpenServerRank_15657_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_eastWar_com_gzbz_protobuf_C2S_LaborOpenServerRank_15657_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_LaborOpenServerRank_15657_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_LaborOpenServerRank_15658_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_eastWar_com_gzbz_protobuf_S2C_LaborOpenServerRank_15658_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_LaborOpenServerRank_15658_descriptor, new String[]{"Type", "Time"});
      internal_static_eastWar_com_gzbz_protobuf_C2S_OpenServerRank_15659_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_eastWar_com_gzbz_protobuf_C2S_OpenServerRank_15659_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_C2S_OpenServerRank_15659_descriptor, new String[0]);
      internal_static_eastWar_com_gzbz_protobuf_S2C_OpenServerRank_15660_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_eastWar_com_gzbz_protobuf_S2C_OpenServerRank_15660_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWar_com_gzbz_protobuf_S2C_OpenServerRank_15660_descriptor, new String[]{"Type", "Time"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_OpenUi_15601 extends GeneratedMessageV3 implements C2S_OpenUi_15601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenUi_15601 DEFAULT_INSTANCE = new C2S_OpenUi_15601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenUi_15601> PARSER = new AbstractParser<C2S_OpenUi_15601>() {
         public C2S_OpenUi_15601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenUi_15601(input, extensionRegistry);
         }
      };

      private C2S_OpenUi_15601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenUi_15601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenUi_15601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenUi_15601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OpenUi_15601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OpenUi_15601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_15601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenUi_15601)) {
            return super.equals(obj);
         } else {
            C2S_OpenUi_15601 other = (C2S_OpenUi_15601)obj;
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

      public static C2S_OpenUi_15601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15601)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_15601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_15601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15601)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_15601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_15601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15601)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_15601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_15601 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_15601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_15601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_15601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_15601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_15601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_15601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_15601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_15601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenUi_15601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_15601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_15601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenUi_15601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenUi_15601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenUi_15601> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenUi_15601> getParserForType() {
         return PARSER;
      }

      public C2S_OpenUi_15601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenUi_15601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OpenUi_15601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OpenUi_15601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_15601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_OpenUi_15601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OpenUi_15601_descriptor;
         }

         public C2S_OpenUi_15601 getDefaultInstanceForType() {
            return EastWarMsg.C2S_OpenUi_15601.getDefaultInstance();
         }

         public C2S_OpenUi_15601 build() {
            C2S_OpenUi_15601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenUi_15601 buildPartial() {
            C2S_OpenUi_15601 result = new C2S_OpenUi_15601(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenUi_15601) {
               return this.mergeFrom((C2S_OpenUi_15601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenUi_15601 other) {
            if (other == EastWarMsg.C2S_OpenUi_15601.getDefaultInstance()) {
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
            C2S_OpenUi_15601 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenUi_15601)EastWarMsg.C2S_OpenUi_15601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenUi_15601)e.getUnfinishedMessage();
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

   public static final class S2C_OpenUiResult_15602 extends GeneratedMessageV3 implements S2C_OpenUiResult_15602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenUiResult_15602 DEFAULT_INSTANCE = new S2C_OpenUiResult_15602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenUiResult_15602> PARSER = new AbstractParser<S2C_OpenUiResult_15602>() {
         public S2C_OpenUiResult_15602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenUiResult_15602(input, extensionRegistry);
         }
      };

      private S2C_OpenUiResult_15602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenUiResult_15602() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenUiResult_15602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenUiResult_15602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.startTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.endTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OpenUiResult_15602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OpenUiResult_15602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_15602.class, Builder.class);
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.startTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.endTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.startTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenUiResult_15602)) {
            return super.equals(obj);
         } else {
            S2C_OpenUiResult_15602 other = (S2C_OpenUiResult_15602)obj;
            if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
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
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEndTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenUiResult_15602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_15602)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_15602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_15602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_15602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_15602)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_15602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_15602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_15602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_15602)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_15602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_15602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_15602 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_15602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_15602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_15602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_15602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_15602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_15602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_15602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_15602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenUiResult_15602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_15602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_15602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenUiResult_15602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenUiResult_15602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenUiResult_15602> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenUiResult_15602> getParserForType() {
         return PARSER;
      }

      public S2C_OpenUiResult_15602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenUiResult_15602OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OpenUiResult_15602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OpenUiResult_15602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_15602.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_OpenUiResult_15602.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.startTime_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OpenUiResult_15602_descriptor;
         }

         public S2C_OpenUiResult_15602 getDefaultInstanceForType() {
            return EastWarMsg.S2C_OpenUiResult_15602.getDefaultInstance();
         }

         public S2C_OpenUiResult_15602 build() {
            S2C_OpenUiResult_15602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenUiResult_15602 buildPartial() {
            S2C_OpenUiResult_15602 result = new S2C_OpenUiResult_15602(this);
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
            if (other instanceof S2C_OpenUiResult_15602) {
               return this.mergeFrom((S2C_OpenUiResult_15602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenUiResult_15602 other) {
            if (other == EastWarMsg.S2C_OpenUiResult_15602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStartTime()) {
               return false;
            } else {
               return this.hasEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenUiResult_15602 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenUiResult_15602)EastWarMsg.S2C_OpenUiResult_15602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenUiResult_15602)e.getUnfinishedMessage();
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

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 1;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -2;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 2;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -3;
            this.endTime_ = 0;
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

   public static final class C2S_OptionalGift_15611 extends GeneratedMessageV3 implements C2S_OptionalGift_15611OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OptionalGift_15611 DEFAULT_INSTANCE = new C2S_OptionalGift_15611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OptionalGift_15611> PARSER = new AbstractParser<C2S_OptionalGift_15611>() {
         public C2S_OptionalGift_15611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OptionalGift_15611(input, extensionRegistry);
         }
      };

      private C2S_OptionalGift_15611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OptionalGift_15611() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OptionalGift_15611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OptionalGift_15611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGift_15611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGift_15611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGift_15611.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OptionalGift_15611)) {
            return super.equals(obj);
         } else {
            C2S_OptionalGift_15611 other = (C2S_OptionalGift_15611)obj;
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

      public static C2S_OptionalGift_15611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_15611)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGift_15611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_15611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGift_15611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_15611)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGift_15611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_15611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGift_15611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_15611)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGift_15611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_15611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGift_15611 parseFrom(InputStream input) throws IOException {
         return (C2S_OptionalGift_15611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGift_15611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGift_15611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGift_15611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OptionalGift_15611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OptionalGift_15611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGift_15611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGift_15611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OptionalGift_15611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGift_15611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGift_15611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OptionalGift_15611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OptionalGift_15611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OptionalGift_15611> parser() {
         return PARSER;
      }

      public Parser<C2S_OptionalGift_15611> getParserForType() {
         return PARSER;
      }

      public C2S_OptionalGift_15611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OptionalGift_15611OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGift_15611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGift_15611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGift_15611.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_OptionalGift_15611.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGift_15611_descriptor;
         }

         public C2S_OptionalGift_15611 getDefaultInstanceForType() {
            return EastWarMsg.C2S_OptionalGift_15611.getDefaultInstance();
         }

         public C2S_OptionalGift_15611 build() {
            C2S_OptionalGift_15611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OptionalGift_15611 buildPartial() {
            C2S_OptionalGift_15611 result = new C2S_OptionalGift_15611(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OptionalGift_15611) {
               return this.mergeFrom((C2S_OptionalGift_15611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OptionalGift_15611 other) {
            if (other == EastWarMsg.C2S_OptionalGift_15611.getDefaultInstance()) {
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
            C2S_OptionalGift_15611 parsedMessage = null;

            try {
               parsedMessage = (C2S_OptionalGift_15611)EastWarMsg.C2S_OptionalGift_15611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OptionalGift_15611)e.getUnfinishedMessage();
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

   public static final class S2C_OptionalGift_15612 extends GeneratedMessageV3 implements S2C_OptionalGift_15612OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GIFTLIST_FIELD_NUMBER = 1;
      private List<ActivityMsg.CustomGiftData> giftList_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionalGift_15612 DEFAULT_INSTANCE = new S2C_OptionalGift_15612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionalGift_15612> PARSER = new AbstractParser<S2C_OptionalGift_15612>() {
         public S2C_OptionalGift_15612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionalGift_15612(input, extensionRegistry);
         }
      };

      private S2C_OptionalGift_15612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionalGift_15612() {
         this.memoizedIsInitialized = -1;
         this.giftList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionalGift_15612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionalGift_15612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.giftList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.giftList_.add(input.readMessage(ActivityMsg.CustomGiftData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.giftList_ = Collections.unmodifiableList(this.giftList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGift_15612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGift_15612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGift_15612.class, Builder.class);
      }

      public List<ActivityMsg.CustomGiftData> getGiftListList() {
         return this.giftList_;
      }

      public List<? extends ActivityMsg.CustomGiftDataOrBuilder> getGiftListOrBuilderList() {
         return this.giftList_;
      }

      public int getGiftListCount() {
         return this.giftList_.size();
      }

      public ActivityMsg.CustomGiftData getGiftList(int index) {
         return (ActivityMsg.CustomGiftData)this.giftList_.get(index);
      }

      public ActivityMsg.CustomGiftDataOrBuilder getGiftListOrBuilder(int index) {
         return (ActivityMsg.CustomGiftDataOrBuilder)this.giftList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGiftListCount(); ++i) {
               if (!this.getGiftList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.giftList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.giftList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.giftList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.giftList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OptionalGift_15612)) {
            return super.equals(obj);
         } else {
            S2C_OptionalGift_15612 other = (S2C_OptionalGift_15612)obj;
            if (!this.getGiftListList().equals(other.getGiftListList())) {
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
            if (this.getGiftListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OptionalGift_15612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_15612)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGift_15612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_15612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGift_15612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_15612)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGift_15612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_15612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGift_15612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_15612)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGift_15612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_15612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGift_15612 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionalGift_15612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGift_15612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGift_15612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGift_15612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionalGift_15612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionalGift_15612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGift_15612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGift_15612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionalGift_15612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGift_15612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGift_15612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionalGift_15612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionalGift_15612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionalGift_15612> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionalGift_15612> getParserForType() {
         return PARSER;
      }

      public S2C_OptionalGift_15612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionalGift_15612OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.CustomGiftData> giftList_;
         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> giftListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGift_15612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGift_15612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGift_15612.class, Builder.class);
         }

         private Builder() {
            this.giftList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.giftList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_OptionalGift_15612.alwaysUseFieldBuilders) {
               this.getGiftListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.giftListBuilder_ == null) {
               this.giftList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.giftListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGift_15612_descriptor;
         }

         public S2C_OptionalGift_15612 getDefaultInstanceForType() {
            return EastWarMsg.S2C_OptionalGift_15612.getDefaultInstance();
         }

         public S2C_OptionalGift_15612 build() {
            S2C_OptionalGift_15612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionalGift_15612 buildPartial() {
            S2C_OptionalGift_15612 result = new S2C_OptionalGift_15612(this);
            int from_bitField0_ = this.bitField0_;
            if (this.giftListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.giftList_ = Collections.unmodifiableList(this.giftList_);
                  this.bitField0_ &= -2;
               }

               result.giftList_ = this.giftList_;
            } else {
               result.giftList_ = this.giftListBuilder_.build();
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
            if (other instanceof S2C_OptionalGift_15612) {
               return this.mergeFrom((S2C_OptionalGift_15612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionalGift_15612 other) {
            if (other == EastWarMsg.S2C_OptionalGift_15612.getDefaultInstance()) {
               return this;
            } else {
               if (this.giftListBuilder_ == null) {
                  if (!other.giftList_.isEmpty()) {
                     if (this.giftList_.isEmpty()) {
                        this.giftList_ = other.giftList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGiftListIsMutable();
                        this.giftList_.addAll(other.giftList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.giftList_.isEmpty()) {
                  if (this.giftListBuilder_.isEmpty()) {
                     this.giftListBuilder_.dispose();
                     this.giftListBuilder_ = null;
                     this.giftList_ = other.giftList_;
                     this.bitField0_ &= -2;
                     this.giftListBuilder_ = EastWarMsg.S2C_OptionalGift_15612.alwaysUseFieldBuilders ? this.getGiftListFieldBuilder() : null;
                  } else {
                     this.giftListBuilder_.addAllMessages(other.giftList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGiftListCount(); ++i) {
               if (!this.getGiftList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OptionalGift_15612 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionalGift_15612)EastWarMsg.S2C_OptionalGift_15612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionalGift_15612)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGiftListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.giftList_ = new ArrayList(this.giftList_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityMsg.CustomGiftData> getGiftListList() {
            return this.giftListBuilder_ == null ? Collections.unmodifiableList(this.giftList_) : this.giftListBuilder_.getMessageList();
         }

         public int getGiftListCount() {
            return this.giftListBuilder_ == null ? this.giftList_.size() : this.giftListBuilder_.getCount();
         }

         public ActivityMsg.CustomGiftData getGiftList(int index) {
            return this.giftListBuilder_ == null ? (ActivityMsg.CustomGiftData)this.giftList_.get(index) : (ActivityMsg.CustomGiftData)this.giftListBuilder_.getMessage(index);
         }

         public Builder setGiftList(int index, ActivityMsg.CustomGiftData value) {
            if (this.giftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftListIsMutable();
               this.giftList_.set(index, value);
               this.onChanged();
            } else {
               this.giftListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGiftList(int index, ActivityMsg.CustomGiftData.Builder builderForValue) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGiftList(ActivityMsg.CustomGiftData value) {
            if (this.giftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftListIsMutable();
               this.giftList_.add(value);
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGiftList(int index, ActivityMsg.CustomGiftData value) {
            if (this.giftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftListIsMutable();
               this.giftList_.add(index, value);
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGiftList(ActivityMsg.CustomGiftData.Builder builderForValue) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGiftList(int index, ActivityMsg.CustomGiftData.Builder builderForValue) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGiftList(Iterable<? extends ActivityMsg.CustomGiftData> values) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.giftList_);
               this.onChanged();
            } else {
               this.giftListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGiftList() {
            if (this.giftListBuilder_ == null) {
               this.giftList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.giftListBuilder_.clear();
            }

            return this;
         }

         public Builder removeGiftList(int index) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.remove(index);
               this.onChanged();
            } else {
               this.giftListBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.CustomGiftData.Builder getGiftListBuilder(int index) {
            return (ActivityMsg.CustomGiftData.Builder)this.getGiftListFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.CustomGiftDataOrBuilder getGiftListOrBuilder(int index) {
            return this.giftListBuilder_ == null ? (ActivityMsg.CustomGiftDataOrBuilder)this.giftList_.get(index) : (ActivityMsg.CustomGiftDataOrBuilder)this.giftListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.CustomGiftDataOrBuilder> getGiftListOrBuilderList() {
            return this.giftListBuilder_ != null ? this.giftListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.giftList_);
         }

         public ActivityMsg.CustomGiftData.Builder addGiftListBuilder() {
            return (ActivityMsg.CustomGiftData.Builder)this.getGiftListFieldBuilder().addBuilder(ActivityMsg.CustomGiftData.getDefaultInstance());
         }

         public ActivityMsg.CustomGiftData.Builder addGiftListBuilder(int index) {
            return (ActivityMsg.CustomGiftData.Builder)this.getGiftListFieldBuilder().addBuilder(index, ActivityMsg.CustomGiftData.getDefaultInstance());
         }

         public List<ActivityMsg.CustomGiftData.Builder> getGiftListBuilderList() {
            return this.getGiftListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> getGiftListFieldBuilder() {
            if (this.giftListBuilder_ == null) {
               this.giftListBuilder_ = new RepeatedFieldBuilderV3(this.giftList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.giftList_ = null;
            }

            return this.giftListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OptionalGiftChoice_15613 extends GeneratedMessageV3 implements C2S_OptionalGiftChoice_15613OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CUSTOMID_FIELD_NUMBER = 1;
      private int customId_;
      public static final int BUYDATA_FIELD_NUMBER = 2;
      private List<ActivityMsg.CustomGiftBuyItemData> buyData_;
      private byte memoizedIsInitialized;
      private static final C2S_OptionalGiftChoice_15613 DEFAULT_INSTANCE = new C2S_OptionalGiftChoice_15613();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OptionalGiftChoice_15613> PARSER = new AbstractParser<C2S_OptionalGiftChoice_15613>() {
         public C2S_OptionalGiftChoice_15613 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OptionalGiftChoice_15613(input, extensionRegistry);
         }
      };

      private C2S_OptionalGiftChoice_15613(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OptionalGiftChoice_15613() {
         this.memoizedIsInitialized = -1;
         this.buyData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OptionalGiftChoice_15613();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OptionalGiftChoice_15613(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.customId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.buyData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.buyData_.add(input.readMessage(ActivityMsg.CustomGiftBuyItemData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.buyData_ = Collections.unmodifiableList(this.buyData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGiftChoice_15613_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGiftChoice_15613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGiftChoice_15613.class, Builder.class);
      }

      public boolean hasCustomId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCustomId() {
         return this.customId_;
      }

      public List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList() {
         return this.buyData_;
      }

      public List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList() {
         return this.buyData_;
      }

      public int getBuyDataCount() {
         return this.buyData_.size();
      }

      public ActivityMsg.CustomGiftBuyItemData getBuyData(int index) {
         return (ActivityMsg.CustomGiftBuyItemData)this.buyData_.get(index);
      }

      public ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index) {
         return (ActivityMsg.CustomGiftBuyItemDataOrBuilder)this.buyData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCustomId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getBuyDataCount(); ++i) {
               if (!this.getBuyData(i).isInitialized()) {
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
            output.writeInt32(1, this.customId_);
         }

         for(int i = 0; i < this.buyData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.buyData_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.customId_);
            }

            for(int i = 0; i < this.buyData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.buyData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OptionalGiftChoice_15613)) {
            return super.equals(obj);
         } else {
            C2S_OptionalGiftChoice_15613 other = (C2S_OptionalGiftChoice_15613)obj;
            if (this.hasCustomId() != other.hasCustomId()) {
               return false;
            } else if (this.hasCustomId() && this.getCustomId() != other.getCustomId()) {
               return false;
            } else if (!this.getBuyDataList().equals(other.getBuyDataList())) {
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
            if (this.hasCustomId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCustomId();
            }

            if (this.getBuyDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OptionalGiftChoice_15613 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_15613)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftChoice_15613 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_15613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_15613 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_15613)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftChoice_15613 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_15613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_15613 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_15613)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftChoice_15613 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_15613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_15613 parseFrom(InputStream input) throws IOException {
         return (C2S_OptionalGiftChoice_15613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftChoice_15613 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftChoice_15613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_15613 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OptionalGiftChoice_15613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftChoice_15613 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftChoice_15613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_15613 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OptionalGiftChoice_15613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftChoice_15613 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftChoice_15613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OptionalGiftChoice_15613 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OptionalGiftChoice_15613 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OptionalGiftChoice_15613> parser() {
         return PARSER;
      }

      public Parser<C2S_OptionalGiftChoice_15613> getParserForType() {
         return PARSER;
      }

      public C2S_OptionalGiftChoice_15613 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OptionalGiftChoice_15613OrBuilder {
         private int bitField0_;
         private int customId_;
         private List<ActivityMsg.CustomGiftBuyItemData> buyData_;
         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftBuyItemData, ActivityMsg.CustomGiftBuyItemData.Builder, ActivityMsg.CustomGiftBuyItemDataOrBuilder> buyDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGiftChoice_15613_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGiftChoice_15613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGiftChoice_15613.class, Builder.class);
         }

         private Builder() {
            this.buyData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buyData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_OptionalGiftChoice_15613.alwaysUseFieldBuilders) {
               this.getBuyDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.customId_ = 0;
            this.bitField0_ &= -2;
            if (this.buyDataBuilder_ == null) {
               this.buyData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.buyDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OptionalGiftChoice_15613_descriptor;
         }

         public C2S_OptionalGiftChoice_15613 getDefaultInstanceForType() {
            return EastWarMsg.C2S_OptionalGiftChoice_15613.getDefaultInstance();
         }

         public C2S_OptionalGiftChoice_15613 build() {
            C2S_OptionalGiftChoice_15613 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OptionalGiftChoice_15613 buildPartial() {
            C2S_OptionalGiftChoice_15613 result = new C2S_OptionalGiftChoice_15613(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.customId_ = this.customId_;
               to_bitField0_ |= 1;
            }

            if (this.buyDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.buyData_ = Collections.unmodifiableList(this.buyData_);
                  this.bitField0_ &= -3;
               }

               result.buyData_ = this.buyData_;
            } else {
               result.buyData_ = this.buyDataBuilder_.build();
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
            if (other instanceof C2S_OptionalGiftChoice_15613) {
               return this.mergeFrom((C2S_OptionalGiftChoice_15613)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OptionalGiftChoice_15613 other) {
            if (other == EastWarMsg.C2S_OptionalGiftChoice_15613.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCustomId()) {
                  this.setCustomId(other.getCustomId());
               }

               if (this.buyDataBuilder_ == null) {
                  if (!other.buyData_.isEmpty()) {
                     if (this.buyData_.isEmpty()) {
                        this.buyData_ = other.buyData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureBuyDataIsMutable();
                        this.buyData_.addAll(other.buyData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.buyData_.isEmpty()) {
                  if (this.buyDataBuilder_.isEmpty()) {
                     this.buyDataBuilder_.dispose();
                     this.buyDataBuilder_ = null;
                     this.buyData_ = other.buyData_;
                     this.bitField0_ &= -3;
                     this.buyDataBuilder_ = EastWarMsg.C2S_OptionalGiftChoice_15613.alwaysUseFieldBuilders ? this.getBuyDataFieldBuilder() : null;
                  } else {
                     this.buyDataBuilder_.addAllMessages(other.buyData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCustomId()) {
               return false;
            } else {
               for(int i = 0; i < this.getBuyDataCount(); ++i) {
                  if (!this.getBuyData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OptionalGiftChoice_15613 parsedMessage = null;

            try {
               parsedMessage = (C2S_OptionalGiftChoice_15613)EastWarMsg.C2S_OptionalGiftChoice_15613.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OptionalGiftChoice_15613)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCustomId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCustomId() {
            return this.customId_;
         }

         public Builder setCustomId(int value) {
            this.bitField0_ |= 1;
            this.customId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCustomId() {
            this.bitField0_ &= -2;
            this.customId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBuyDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.buyData_ = new ArrayList(this.buyData_);
               this.bitField0_ |= 2;
            }

         }

         public List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList() {
            return this.buyDataBuilder_ == null ? Collections.unmodifiableList(this.buyData_) : this.buyDataBuilder_.getMessageList();
         }

         public int getBuyDataCount() {
            return this.buyDataBuilder_ == null ? this.buyData_.size() : this.buyDataBuilder_.getCount();
         }

         public ActivityMsg.CustomGiftBuyItemData getBuyData(int index) {
            return this.buyDataBuilder_ == null ? (ActivityMsg.CustomGiftBuyItemData)this.buyData_.get(index) : (ActivityMsg.CustomGiftBuyItemData)this.buyDataBuilder_.getMessage(index);
         }

         public Builder setBuyData(int index, ActivityMsg.CustomGiftBuyItemData value) {
            if (this.buyDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyDataIsMutable();
               this.buyData_.set(index, value);
               this.onChanged();
            } else {
               this.buyDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBuyData(int index, ActivityMsg.CustomGiftBuyItemData.Builder builderForValue) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buyDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBuyData(ActivityMsg.CustomGiftBuyItemData value) {
            if (this.buyDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyDataIsMutable();
               this.buyData_.add(value);
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBuyData(int index, ActivityMsg.CustomGiftBuyItemData value) {
            if (this.buyDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyDataIsMutable();
               this.buyData_.add(index, value);
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBuyData(ActivityMsg.CustomGiftBuyItemData.Builder builderForValue) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBuyData(int index, ActivityMsg.CustomGiftBuyItemData.Builder builderForValue) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBuyData(Iterable<? extends ActivityMsg.CustomGiftBuyItemData> values) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buyData_);
               this.onChanged();
            } else {
               this.buyDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBuyData() {
            if (this.buyDataBuilder_ == null) {
               this.buyData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.buyDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeBuyData(int index) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.remove(index);
               this.onChanged();
            } else {
               this.buyDataBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.CustomGiftBuyItemData.Builder getBuyDataBuilder(int index) {
            return (ActivityMsg.CustomGiftBuyItemData.Builder)this.getBuyDataFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index) {
            return this.buyDataBuilder_ == null ? (ActivityMsg.CustomGiftBuyItemDataOrBuilder)this.buyData_.get(index) : (ActivityMsg.CustomGiftBuyItemDataOrBuilder)this.buyDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList() {
            return this.buyDataBuilder_ != null ? this.buyDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.buyData_);
         }

         public ActivityMsg.CustomGiftBuyItemData.Builder addBuyDataBuilder() {
            return (ActivityMsg.CustomGiftBuyItemData.Builder)this.getBuyDataFieldBuilder().addBuilder(ActivityMsg.CustomGiftBuyItemData.getDefaultInstance());
         }

         public ActivityMsg.CustomGiftBuyItemData.Builder addBuyDataBuilder(int index) {
            return (ActivityMsg.CustomGiftBuyItemData.Builder)this.getBuyDataFieldBuilder().addBuilder(index, ActivityMsg.CustomGiftBuyItemData.getDefaultInstance());
         }

         public List<ActivityMsg.CustomGiftBuyItemData.Builder> getBuyDataBuilderList() {
            return this.getBuyDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftBuyItemData, ActivityMsg.CustomGiftBuyItemData.Builder, ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataFieldBuilder() {
            if (this.buyDataBuilder_ == null) {
               this.buyDataBuilder_ = new RepeatedFieldBuilderV3(this.buyData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.buyData_ = null;
            }

            return this.buyDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_OptionalGiftChoice_15614 extends GeneratedMessageV3 implements S2C_OptionalGiftChoice_15614OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTDATA_FIELD_NUMBER = 1;
      private ActivityMsg.CustomGiftData giftData_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionalGiftChoice_15614 DEFAULT_INSTANCE = new S2C_OptionalGiftChoice_15614();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionalGiftChoice_15614> PARSER = new AbstractParser<S2C_OptionalGiftChoice_15614>() {
         public S2C_OptionalGiftChoice_15614 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionalGiftChoice_15614(input, extensionRegistry);
         }
      };

      private S2C_OptionalGiftChoice_15614(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionalGiftChoice_15614() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionalGiftChoice_15614();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionalGiftChoice_15614(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ActivityMsg.CustomGiftData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.giftData_.toBuilder();
                        }

                        this.giftData_ = (ActivityMsg.CustomGiftData)input.readMessage(ActivityMsg.CustomGiftData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.giftData_);
                           this.giftData_ = subBuilder.buildPartial();
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftChoice_15614_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftChoice_15614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftChoice_15614.class, Builder.class);
      }

      public boolean hasGiftData() {
         return (this.bitField0_ & 1) != 0;
      }

      public ActivityMsg.CustomGiftData getGiftData() {
         return this.giftData_ == null ? ActivityMsg.CustomGiftData.getDefaultInstance() : this.giftData_;
      }

      public ActivityMsg.CustomGiftDataOrBuilder getGiftDataOrBuilder() {
         return this.giftData_ == null ? ActivityMsg.CustomGiftData.getDefaultInstance() : this.giftData_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGiftData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGiftData().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGiftData());
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
               size += CodedOutputStream.computeMessageSize(1, this.getGiftData());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OptionalGiftChoice_15614)) {
            return super.equals(obj);
         } else {
            S2C_OptionalGiftChoice_15614 other = (S2C_OptionalGiftChoice_15614)obj;
            if (this.hasGiftData() != other.hasGiftData()) {
               return false;
            } else if (this.hasGiftData() && !this.getGiftData().equals(other.getGiftData())) {
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
            if (this.hasGiftData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OptionalGiftChoice_15614 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_15614)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftChoice_15614 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_15614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_15614 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_15614)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftChoice_15614 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_15614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_15614 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_15614)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftChoice_15614 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_15614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_15614 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftChoice_15614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftChoice_15614 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftChoice_15614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_15614 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftChoice_15614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftChoice_15614 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftChoice_15614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_15614 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionalGiftChoice_15614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftChoice_15614 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftChoice_15614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionalGiftChoice_15614 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionalGiftChoice_15614 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionalGiftChoice_15614> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionalGiftChoice_15614> getParserForType() {
         return PARSER;
      }

      public S2C_OptionalGiftChoice_15614 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionalGiftChoice_15614OrBuilder {
         private int bitField0_;
         private ActivityMsg.CustomGiftData giftData_;
         private SingleFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> giftDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftChoice_15614_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftChoice_15614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftChoice_15614.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_OptionalGiftChoice_15614.alwaysUseFieldBuilders) {
               this.getGiftDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.giftDataBuilder_ == null) {
               this.giftData_ = null;
            } else {
               this.giftDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftChoice_15614_descriptor;
         }

         public S2C_OptionalGiftChoice_15614 getDefaultInstanceForType() {
            return EastWarMsg.S2C_OptionalGiftChoice_15614.getDefaultInstance();
         }

         public S2C_OptionalGiftChoice_15614 build() {
            S2C_OptionalGiftChoice_15614 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionalGiftChoice_15614 buildPartial() {
            S2C_OptionalGiftChoice_15614 result = new S2C_OptionalGiftChoice_15614(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.giftDataBuilder_ == null) {
                  result.giftData_ = this.giftData_;
               } else {
                  result.giftData_ = (ActivityMsg.CustomGiftData)this.giftDataBuilder_.build();
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
            if (other instanceof S2C_OptionalGiftChoice_15614) {
               return this.mergeFrom((S2C_OptionalGiftChoice_15614)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionalGiftChoice_15614 other) {
            if (other == EastWarMsg.S2C_OptionalGiftChoice_15614.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGiftData()) {
                  this.mergeGiftData(other.getGiftData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGiftData()) {
               return false;
            } else {
               return this.getGiftData().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OptionalGiftChoice_15614 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionalGiftChoice_15614)EastWarMsg.S2C_OptionalGiftChoice_15614.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionalGiftChoice_15614)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGiftData() {
            return (this.bitField0_ & 1) != 0;
         }

         public ActivityMsg.CustomGiftData getGiftData() {
            if (this.giftDataBuilder_ == null) {
               return this.giftData_ == null ? ActivityMsg.CustomGiftData.getDefaultInstance() : this.giftData_;
            } else {
               return (ActivityMsg.CustomGiftData)this.giftDataBuilder_.getMessage();
            }
         }

         public Builder setGiftData(ActivityMsg.CustomGiftData value) {
            if (this.giftDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.giftData_ = value;
               this.onChanged();
            } else {
               this.giftDataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGiftData(ActivityMsg.CustomGiftData.Builder builderForValue) {
            if (this.giftDataBuilder_ == null) {
               this.giftData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.giftDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGiftData(ActivityMsg.CustomGiftData value) {
            if (this.giftDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.giftData_ != null && this.giftData_ != ActivityMsg.CustomGiftData.getDefaultInstance()) {
                  this.giftData_ = ActivityMsg.CustomGiftData.newBuilder(this.giftData_).mergeFrom(value).buildPartial();
               } else {
                  this.giftData_ = value;
               }

               this.onChanged();
            } else {
               this.giftDataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGiftData() {
            if (this.giftDataBuilder_ == null) {
               this.giftData_ = null;
               this.onChanged();
            } else {
               this.giftDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ActivityMsg.CustomGiftData.Builder getGiftDataBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ActivityMsg.CustomGiftData.Builder)this.getGiftDataFieldBuilder().getBuilder();
         }

         public ActivityMsg.CustomGiftDataOrBuilder getGiftDataOrBuilder() {
            if (this.giftDataBuilder_ != null) {
               return (ActivityMsg.CustomGiftDataOrBuilder)this.giftDataBuilder_.getMessageOrBuilder();
            } else {
               return this.giftData_ == null ? ActivityMsg.CustomGiftData.getDefaultInstance() : this.giftData_;
            }
         }

         private SingleFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> getGiftDataFieldBuilder() {
            if (this.giftDataBuilder_ == null) {
               this.giftDataBuilder_ = new SingleFieldBuilderV3(this.getGiftData(), this.getParentForChildren(), this.isClean());
               this.giftData_ = null;
            }

            return this.giftDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_OptionalGiftBuy_15616 extends GeneratedMessageV3 implements S2C_OptionalGiftBuy_15616OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTDATA_FIELD_NUMBER = 1;
      private ActivityMsg.CustomGiftData giftData_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionalGiftBuy_15616 DEFAULT_INSTANCE = new S2C_OptionalGiftBuy_15616();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionalGiftBuy_15616> PARSER = new AbstractParser<S2C_OptionalGiftBuy_15616>() {
         public S2C_OptionalGiftBuy_15616 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionalGiftBuy_15616(input, extensionRegistry);
         }
      };

      private S2C_OptionalGiftBuy_15616(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionalGiftBuy_15616() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionalGiftBuy_15616();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionalGiftBuy_15616(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ActivityMsg.CustomGiftData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.giftData_.toBuilder();
                        }

                        this.giftData_ = (ActivityMsg.CustomGiftData)input.readMessage(ActivityMsg.CustomGiftData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.giftData_);
                           this.giftData_ = subBuilder.buildPartial();
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftBuy_15616_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftBuy_15616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftBuy_15616.class, Builder.class);
      }

      public boolean hasGiftData() {
         return (this.bitField0_ & 1) != 0;
      }

      public ActivityMsg.CustomGiftData getGiftData() {
         return this.giftData_ == null ? ActivityMsg.CustomGiftData.getDefaultInstance() : this.giftData_;
      }

      public ActivityMsg.CustomGiftDataOrBuilder getGiftDataOrBuilder() {
         return this.giftData_ == null ? ActivityMsg.CustomGiftData.getDefaultInstance() : this.giftData_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGiftData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGiftData().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGiftData());
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
               size += CodedOutputStream.computeMessageSize(1, this.getGiftData());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OptionalGiftBuy_15616)) {
            return super.equals(obj);
         } else {
            S2C_OptionalGiftBuy_15616 other = (S2C_OptionalGiftBuy_15616)obj;
            if (this.hasGiftData() != other.hasGiftData()) {
               return false;
            } else if (this.hasGiftData() && !this.getGiftData().equals(other.getGiftData())) {
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
            if (this.hasGiftData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OptionalGiftBuy_15616 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_15616)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_15616 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_15616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_15616 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_15616)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_15616 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_15616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_15616 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_15616)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_15616 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_15616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_15616 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_15616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_15616 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_15616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_15616 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_15616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_15616 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_15616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_15616 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_15616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_15616 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_15616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionalGiftBuy_15616 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionalGiftBuy_15616 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionalGiftBuy_15616> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionalGiftBuy_15616> getParserForType() {
         return PARSER;
      }

      public S2C_OptionalGiftBuy_15616 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionalGiftBuy_15616OrBuilder {
         private int bitField0_;
         private ActivityMsg.CustomGiftData giftData_;
         private SingleFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> giftDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftBuy_15616_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftBuy_15616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftBuy_15616.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_OptionalGiftBuy_15616.alwaysUseFieldBuilders) {
               this.getGiftDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.giftDataBuilder_ == null) {
               this.giftData_ = null;
            } else {
               this.giftDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OptionalGiftBuy_15616_descriptor;
         }

         public S2C_OptionalGiftBuy_15616 getDefaultInstanceForType() {
            return EastWarMsg.S2C_OptionalGiftBuy_15616.getDefaultInstance();
         }

         public S2C_OptionalGiftBuy_15616 build() {
            S2C_OptionalGiftBuy_15616 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionalGiftBuy_15616 buildPartial() {
            S2C_OptionalGiftBuy_15616 result = new S2C_OptionalGiftBuy_15616(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.giftDataBuilder_ == null) {
                  result.giftData_ = this.giftData_;
               } else {
                  result.giftData_ = (ActivityMsg.CustomGiftData)this.giftDataBuilder_.build();
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
            if (other instanceof S2C_OptionalGiftBuy_15616) {
               return this.mergeFrom((S2C_OptionalGiftBuy_15616)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionalGiftBuy_15616 other) {
            if (other == EastWarMsg.S2C_OptionalGiftBuy_15616.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGiftData()) {
                  this.mergeGiftData(other.getGiftData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGiftData()) {
               return false;
            } else {
               return this.getGiftData().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OptionalGiftBuy_15616 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionalGiftBuy_15616)EastWarMsg.S2C_OptionalGiftBuy_15616.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionalGiftBuy_15616)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGiftData() {
            return (this.bitField0_ & 1) != 0;
         }

         public ActivityMsg.CustomGiftData getGiftData() {
            if (this.giftDataBuilder_ == null) {
               return this.giftData_ == null ? ActivityMsg.CustomGiftData.getDefaultInstance() : this.giftData_;
            } else {
               return (ActivityMsg.CustomGiftData)this.giftDataBuilder_.getMessage();
            }
         }

         public Builder setGiftData(ActivityMsg.CustomGiftData value) {
            if (this.giftDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.giftData_ = value;
               this.onChanged();
            } else {
               this.giftDataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGiftData(ActivityMsg.CustomGiftData.Builder builderForValue) {
            if (this.giftDataBuilder_ == null) {
               this.giftData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.giftDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGiftData(ActivityMsg.CustomGiftData value) {
            if (this.giftDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.giftData_ != null && this.giftData_ != ActivityMsg.CustomGiftData.getDefaultInstance()) {
                  this.giftData_ = ActivityMsg.CustomGiftData.newBuilder(this.giftData_).mergeFrom(value).buildPartial();
               } else {
                  this.giftData_ = value;
               }

               this.onChanged();
            } else {
               this.giftDataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGiftData() {
            if (this.giftDataBuilder_ == null) {
               this.giftData_ = null;
               this.onChanged();
            } else {
               this.giftDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ActivityMsg.CustomGiftData.Builder getGiftDataBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ActivityMsg.CustomGiftData.Builder)this.getGiftDataFieldBuilder().getBuilder();
         }

         public ActivityMsg.CustomGiftDataOrBuilder getGiftDataOrBuilder() {
            if (this.giftDataBuilder_ != null) {
               return (ActivityMsg.CustomGiftDataOrBuilder)this.giftDataBuilder_.getMessageOrBuilder();
            } else {
               return this.giftData_ == null ? ActivityMsg.CustomGiftData.getDefaultInstance() : this.giftData_;
            }
         }

         private SingleFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> getGiftDataFieldBuilder() {
            if (this.giftDataBuilder_ == null) {
               this.giftDataBuilder_ = new SingleFieldBuilderV3(this.getGiftData(), this.getParentForChildren(), this.isClean());
               this.giftData_ = null;
            }

            return this.giftDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Appointment_15621 extends GeneratedMessageV3 implements C2S_Appointment_15621OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Appointment_15621 DEFAULT_INSTANCE = new C2S_Appointment_15621();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Appointment_15621> PARSER = new AbstractParser<C2S_Appointment_15621>() {
         public C2S_Appointment_15621 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Appointment_15621(input, extensionRegistry);
         }
      };

      private C2S_Appointment_15621(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Appointment_15621() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Appointment_15621();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Appointment_15621(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Appointment_15621_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Appointment_15621_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Appointment_15621.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Appointment_15621)) {
            return super.equals(obj);
         } else {
            C2S_Appointment_15621 other = (C2S_Appointment_15621)obj;
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

      public static C2S_Appointment_15621 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Appointment_15621)PARSER.parseFrom(data);
      }

      public static C2S_Appointment_15621 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Appointment_15621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Appointment_15621 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Appointment_15621)PARSER.parseFrom(data);
      }

      public static C2S_Appointment_15621 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Appointment_15621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Appointment_15621 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Appointment_15621)PARSER.parseFrom(data);
      }

      public static C2S_Appointment_15621 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Appointment_15621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Appointment_15621 parseFrom(InputStream input) throws IOException {
         return (C2S_Appointment_15621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Appointment_15621 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Appointment_15621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Appointment_15621 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Appointment_15621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Appointment_15621 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Appointment_15621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Appointment_15621 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Appointment_15621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Appointment_15621 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Appointment_15621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Appointment_15621 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Appointment_15621 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Appointment_15621> parser() {
         return PARSER;
      }

      public Parser<C2S_Appointment_15621> getParserForType() {
         return PARSER;
      }

      public C2S_Appointment_15621 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Appointment_15621OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Appointment_15621_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Appointment_15621_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Appointment_15621.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_Appointment_15621.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Appointment_15621_descriptor;
         }

         public C2S_Appointment_15621 getDefaultInstanceForType() {
            return EastWarMsg.C2S_Appointment_15621.getDefaultInstance();
         }

         public C2S_Appointment_15621 build() {
            C2S_Appointment_15621 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Appointment_15621 buildPartial() {
            C2S_Appointment_15621 result = new C2S_Appointment_15621(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Appointment_15621) {
               return this.mergeFrom((C2S_Appointment_15621)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Appointment_15621 other) {
            if (other == EastWarMsg.C2S_Appointment_15621.getDefaultInstance()) {
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
            C2S_Appointment_15621 parsedMessage = null;

            try {
               parsedMessage = (C2S_Appointment_15621)EastWarMsg.C2S_Appointment_15621.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Appointment_15621)e.getUnfinishedMessage();
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

   public static final class S2C_Appointment_15622 extends GeneratedMessageV3 implements S2C_Appointment_15622OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HADGETKEY_FIELD_NUMBER = 1;
      private Internal.IntList hadGetKey_;
      public static final int TOTALID_FIELD_NUMBER = 2;
      private int totalId_;
      public static final int HADGETID_FIELD_NUMBER = 3;
      private int hadGetId_;
      public static final int BOXS_FIELD_NUMBER = 4;
      private Internal.IntList boxs_;
      public static final int CURDAY_FIELD_NUMBER = 5;
      private int curDay_;
      private byte memoizedIsInitialized;
      private static final S2C_Appointment_15622 DEFAULT_INSTANCE = new S2C_Appointment_15622();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Appointment_15622> PARSER = new AbstractParser<S2C_Appointment_15622>() {
         public S2C_Appointment_15622 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Appointment_15622(input, extensionRegistry);
         }
      };

      private S2C_Appointment_15622(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Appointment_15622() {
         this.memoizedIsInitialized = -1;
         this.hadGetKey_ = emptyIntList();
         this.boxs_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Appointment_15622();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Appointment_15622(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.hadGetKey_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.hadGetKey_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.hadGetKey_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.totalId_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 2;
                        this.hadGetId_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.boxs_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.boxs_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.boxs_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.boxs_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 40:
                        this.bitField0_ |= 4;
                        this.curDay_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.hadGetKey_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.hadGetKey_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.boxs_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Appointment_15622_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Appointment_15622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Appointment_15622.class, Builder.class);
      }

      public List<Integer> getHadGetKeyList() {
         return this.hadGetKey_;
      }

      public int getHadGetKeyCount() {
         return this.hadGetKey_.size();
      }

      public int getHadGetKey(int index) {
         return this.hadGetKey_.getInt(index);
      }

      public boolean hasTotalId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTotalId() {
         return this.totalId_;
      }

      public boolean hasHadGetId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHadGetId() {
         return this.hadGetId_;
      }

      public List<Integer> getBoxsList() {
         return this.boxs_;
      }

      public int getBoxsCount() {
         return this.boxs_.size();
      }

      public int getBoxs(int index) {
         return this.boxs_.getInt(index);
      }

      public boolean hasCurDay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCurDay() {
         return this.curDay_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTotalId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHadGetId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.hadGetKey_.size(); ++i) {
            output.writeInt32(1, this.hadGetKey_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.totalId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.hadGetId_);
         }

         for(int i = 0; i < this.boxs_.size(); ++i) {
            output.writeInt32(4, this.boxs_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.curDay_);
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

            for(int i = 0; i < this.hadGetKey_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.hadGetKey_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHadGetKeyList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.totalId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.hadGetId_);
            }

            dataSize = 0;

            for(int i = 0; i < this.boxs_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.boxs_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBoxsList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.curDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Appointment_15622)) {
            return super.equals(obj);
         } else {
            S2C_Appointment_15622 other = (S2C_Appointment_15622)obj;
            if (!this.getHadGetKeyList().equals(other.getHadGetKeyList())) {
               return false;
            } else if (this.hasTotalId() != other.hasTotalId()) {
               return false;
            } else if (this.hasTotalId() && this.getTotalId() != other.getTotalId()) {
               return false;
            } else if (this.hasHadGetId() != other.hasHadGetId()) {
               return false;
            } else if (this.hasHadGetId() && this.getHadGetId() != other.getHadGetId()) {
               return false;
            } else if (!this.getBoxsList().equals(other.getBoxsList())) {
               return false;
            } else if (this.hasCurDay() != other.hasCurDay()) {
               return false;
            } else if (this.hasCurDay() && this.getCurDay() != other.getCurDay()) {
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
            if (this.getHadGetKeyCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHadGetKeyList().hashCode();
            }

            if (this.hasTotalId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalId();
            }

            if (this.hasHadGetId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHadGetId();
            }

            if (this.getBoxsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBoxsList().hashCode();
            }

            if (this.hasCurDay()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCurDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Appointment_15622 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Appointment_15622)PARSER.parseFrom(data);
      }

      public static S2C_Appointment_15622 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Appointment_15622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Appointment_15622 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Appointment_15622)PARSER.parseFrom(data);
      }

      public static S2C_Appointment_15622 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Appointment_15622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Appointment_15622 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Appointment_15622)PARSER.parseFrom(data);
      }

      public static S2C_Appointment_15622 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Appointment_15622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Appointment_15622 parseFrom(InputStream input) throws IOException {
         return (S2C_Appointment_15622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Appointment_15622 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Appointment_15622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Appointment_15622 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Appointment_15622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Appointment_15622 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Appointment_15622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Appointment_15622 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Appointment_15622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Appointment_15622 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Appointment_15622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Appointment_15622 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Appointment_15622 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Appointment_15622> parser() {
         return PARSER;
      }

      public Parser<S2C_Appointment_15622> getParserForType() {
         return PARSER;
      }

      public S2C_Appointment_15622 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Appointment_15622OrBuilder {
         private int bitField0_;
         private Internal.IntList hadGetKey_;
         private int totalId_;
         private int hadGetId_;
         private Internal.IntList boxs_;
         private int curDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Appointment_15622_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Appointment_15622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Appointment_15622.class, Builder.class);
         }

         private Builder() {
            this.hadGetKey_ = EastWarMsg.S2C_Appointment_15622.emptyIntList();
            this.boxs_ = EastWarMsg.S2C_Appointment_15622.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadGetKey_ = EastWarMsg.S2C_Appointment_15622.emptyIntList();
            this.boxs_ = EastWarMsg.S2C_Appointment_15622.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_Appointment_15622.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hadGetKey_ = EastWarMsg.S2C_Appointment_15622.emptyIntList();
            this.bitField0_ &= -2;
            this.totalId_ = 0;
            this.bitField0_ &= -3;
            this.hadGetId_ = 0;
            this.bitField0_ &= -5;
            this.boxs_ = EastWarMsg.S2C_Appointment_15622.emptyIntList();
            this.bitField0_ &= -9;
            this.curDay_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Appointment_15622_descriptor;
         }

         public S2C_Appointment_15622 getDefaultInstanceForType() {
            return EastWarMsg.S2C_Appointment_15622.getDefaultInstance();
         }

         public S2C_Appointment_15622 build() {
            S2C_Appointment_15622 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Appointment_15622 buildPartial() {
            S2C_Appointment_15622 result = new S2C_Appointment_15622(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.hadGetKey_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.hadGetKey_ = this.hadGetKey_;
            if ((from_bitField0_ & 2) != 0) {
               result.totalId_ = this.totalId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.hadGetId_ = this.hadGetId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.boxs_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.boxs_ = this.boxs_;
            if ((from_bitField0_ & 16) != 0) {
               result.curDay_ = this.curDay_;
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
            if (other instanceof S2C_Appointment_15622) {
               return this.mergeFrom((S2C_Appointment_15622)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Appointment_15622 other) {
            if (other == EastWarMsg.S2C_Appointment_15622.getDefaultInstance()) {
               return this;
            } else {
               if (!other.hadGetKey_.isEmpty()) {
                  if (this.hadGetKey_.isEmpty()) {
                     this.hadGetKey_ = other.hadGetKey_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureHadGetKeyIsMutable();
                     this.hadGetKey_.addAll(other.hadGetKey_);
                  }

                  this.onChanged();
               }

               if (other.hasTotalId()) {
                  this.setTotalId(other.getTotalId());
               }

               if (other.hasHadGetId()) {
                  this.setHadGetId(other.getHadGetId());
               }

               if (!other.boxs_.isEmpty()) {
                  if (this.boxs_.isEmpty()) {
                     this.boxs_ = other.boxs_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureBoxsIsMutable();
                     this.boxs_.addAll(other.boxs_);
                  }

                  this.onChanged();
               }

               if (other.hasCurDay()) {
                  this.setCurDay(other.getCurDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTotalId()) {
               return false;
            } else if (!this.hasHadGetId()) {
               return false;
            } else {
               return this.hasCurDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Appointment_15622 parsedMessage = null;

            try {
               parsedMessage = (S2C_Appointment_15622)EastWarMsg.S2C_Appointment_15622.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Appointment_15622)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHadGetKeyIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.hadGetKey_ = EastWarMsg.S2C_Appointment_15622.mutableCopy(this.hadGetKey_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getHadGetKeyList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.hadGetKey_) : this.hadGetKey_);
         }

         public int getHadGetKeyCount() {
            return this.hadGetKey_.size();
         }

         public int getHadGetKey(int index) {
            return this.hadGetKey_.getInt(index);
         }

         public Builder setHadGetKey(int index, int value) {
            this.ensureHadGetKeyIsMutable();
            this.hadGetKey_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHadGetKey(int value) {
            this.ensureHadGetKeyIsMutable();
            this.hadGetKey_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHadGetKey(Iterable<? extends Integer> values) {
            this.ensureHadGetKeyIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hadGetKey_);
            this.onChanged();
            return this;
         }

         public Builder clearHadGetKey() {
            this.hadGetKey_ = EastWarMsg.S2C_Appointment_15622.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasTotalId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTotalId() {
            return this.totalId_;
         }

         public Builder setTotalId(int value) {
            this.bitField0_ |= 2;
            this.totalId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalId() {
            this.bitField0_ &= -3;
            this.totalId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHadGetId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHadGetId() {
            return this.hadGetId_;
         }

         public Builder setHadGetId(int value) {
            this.bitField0_ |= 4;
            this.hadGetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHadGetId() {
            this.bitField0_ &= -5;
            this.hadGetId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBoxsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.boxs_ = EastWarMsg.S2C_Appointment_15622.mutableCopy(this.boxs_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getBoxsList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.boxs_) : this.boxs_);
         }

         public int getBoxsCount() {
            return this.boxs_.size();
         }

         public int getBoxs(int index) {
            return this.boxs_.getInt(index);
         }

         public Builder setBoxs(int index, int value) {
            this.ensureBoxsIsMutable();
            this.boxs_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBoxs(int value) {
            this.ensureBoxsIsMutable();
            this.boxs_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBoxs(Iterable<? extends Integer> values) {
            this.ensureBoxsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.boxs_);
            this.onChanged();
            return this;
         }

         public Builder clearBoxs() {
            this.boxs_ = EastWarMsg.S2C_Appointment_15622.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasCurDay() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCurDay() {
            return this.curDay_;
         }

         public Builder setCurDay(int value) {
            this.bitField0_ |= 16;
            this.curDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurDay() {
            this.bitField0_ &= -17;
            this.curDay_ = 0;
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

   public static final class C2S_DrawKey_15623 extends GeneratedMessageV3 implements C2S_DrawKey_15623OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_DrawKey_15623 DEFAULT_INSTANCE = new C2S_DrawKey_15623();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawKey_15623> PARSER = new AbstractParser<C2S_DrawKey_15623>() {
         public C2S_DrawKey_15623 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawKey_15623(input, extensionRegistry);
         }
      };

      private C2S_DrawKey_15623(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawKey_15623() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawKey_15623();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawKey_15623(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_DrawKey_15623_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_DrawKey_15623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawKey_15623.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawKey_15623)) {
            return super.equals(obj);
         } else {
            C2S_DrawKey_15623 other = (C2S_DrawKey_15623)obj;
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

      public static C2S_DrawKey_15623 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_15623)PARSER.parseFrom(data);
      }

      public static C2S_DrawKey_15623 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_15623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawKey_15623 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_15623)PARSER.parseFrom(data);
      }

      public static C2S_DrawKey_15623 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_15623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawKey_15623 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_15623)PARSER.parseFrom(data);
      }

      public static C2S_DrawKey_15623 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_15623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawKey_15623 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawKey_15623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawKey_15623 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawKey_15623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawKey_15623 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawKey_15623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawKey_15623 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawKey_15623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawKey_15623 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawKey_15623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawKey_15623 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawKey_15623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawKey_15623 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawKey_15623 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawKey_15623> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawKey_15623> getParserForType() {
         return PARSER;
      }

      public C2S_DrawKey_15623 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawKey_15623OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_DrawKey_15623_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_DrawKey_15623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawKey_15623.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_DrawKey_15623.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_DrawKey_15623_descriptor;
         }

         public C2S_DrawKey_15623 getDefaultInstanceForType() {
            return EastWarMsg.C2S_DrawKey_15623.getDefaultInstance();
         }

         public C2S_DrawKey_15623 build() {
            C2S_DrawKey_15623 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawKey_15623 buildPartial() {
            C2S_DrawKey_15623 result = new C2S_DrawKey_15623(this);
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
            if (other instanceof C2S_DrawKey_15623) {
               return this.mergeFrom((C2S_DrawKey_15623)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawKey_15623 other) {
            if (other == EastWarMsg.C2S_DrawKey_15623.getDefaultInstance()) {
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
            C2S_DrawKey_15623 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawKey_15623)EastWarMsg.C2S_DrawKey_15623.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawKey_15623)e.getUnfinishedMessage();
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

   public static final class S2C_DrawKey_15624 extends GeneratedMessageV3 implements S2C_DrawKey_15624OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawKey_15624 DEFAULT_INSTANCE = new S2C_DrawKey_15624();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawKey_15624> PARSER = new AbstractParser<S2C_DrawKey_15624>() {
         public S2C_DrawKey_15624 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawKey_15624(input, extensionRegistry);
         }
      };

      private S2C_DrawKey_15624(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawKey_15624() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawKey_15624();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawKey_15624(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_DrawKey_15624_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_DrawKey_15624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawKey_15624.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawKey_15624)) {
            return super.equals(obj);
         } else {
            S2C_DrawKey_15624 other = (S2C_DrawKey_15624)obj;
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

      public static S2C_DrawKey_15624 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_15624)PARSER.parseFrom(data);
      }

      public static S2C_DrawKey_15624 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_15624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawKey_15624 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_15624)PARSER.parseFrom(data);
      }

      public static S2C_DrawKey_15624 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_15624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawKey_15624 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_15624)PARSER.parseFrom(data);
      }

      public static S2C_DrawKey_15624 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_15624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawKey_15624 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawKey_15624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawKey_15624 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawKey_15624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawKey_15624 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawKey_15624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawKey_15624 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawKey_15624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawKey_15624 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawKey_15624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawKey_15624 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawKey_15624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawKey_15624 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawKey_15624 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawKey_15624> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawKey_15624> getParserForType() {
         return PARSER;
      }

      public S2C_DrawKey_15624 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawKey_15624OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_DrawKey_15624_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_DrawKey_15624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawKey_15624.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_DrawKey_15624.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_DrawKey_15624_descriptor;
         }

         public S2C_DrawKey_15624 getDefaultInstanceForType() {
            return EastWarMsg.S2C_DrawKey_15624.getDefaultInstance();
         }

         public S2C_DrawKey_15624 build() {
            S2C_DrawKey_15624 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawKey_15624 buildPartial() {
            S2C_DrawKey_15624 result = new S2C_DrawKey_15624(this);
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
            if (other instanceof S2C_DrawKey_15624) {
               return this.mergeFrom((S2C_DrawKey_15624)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawKey_15624 other) {
            if (other == EastWarMsg.S2C_DrawKey_15624.getDefaultInstance()) {
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
            S2C_DrawKey_15624 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawKey_15624)EastWarMsg.S2C_DrawKey_15624.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawKey_15624)e.getUnfinishedMessage();
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

   public static final class C2S_Coincidence_15625 extends GeneratedMessageV3 implements C2S_Coincidence_15625OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Coincidence_15625 DEFAULT_INSTANCE = new C2S_Coincidence_15625();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Coincidence_15625> PARSER = new AbstractParser<C2S_Coincidence_15625>() {
         public C2S_Coincidence_15625 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Coincidence_15625(input, extensionRegistry);
         }
      };

      private C2S_Coincidence_15625(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Coincidence_15625() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Coincidence_15625();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Coincidence_15625(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Coincidence_15625_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Coincidence_15625_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Coincidence_15625.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Coincidence_15625)) {
            return super.equals(obj);
         } else {
            C2S_Coincidence_15625 other = (C2S_Coincidence_15625)obj;
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

      public static C2S_Coincidence_15625 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_15625)PARSER.parseFrom(data);
      }

      public static C2S_Coincidence_15625 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_15625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Coincidence_15625 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_15625)PARSER.parseFrom(data);
      }

      public static C2S_Coincidence_15625 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_15625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Coincidence_15625 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_15625)PARSER.parseFrom(data);
      }

      public static C2S_Coincidence_15625 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_15625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Coincidence_15625 parseFrom(InputStream input) throws IOException {
         return (C2S_Coincidence_15625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Coincidence_15625 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Coincidence_15625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Coincidence_15625 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Coincidence_15625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Coincidence_15625 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Coincidence_15625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Coincidence_15625 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Coincidence_15625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Coincidence_15625 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Coincidence_15625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Coincidence_15625 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Coincidence_15625 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Coincidence_15625> parser() {
         return PARSER;
      }

      public Parser<C2S_Coincidence_15625> getParserForType() {
         return PARSER;
      }

      public C2S_Coincidence_15625 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Coincidence_15625OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Coincidence_15625_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Coincidence_15625_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Coincidence_15625.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_Coincidence_15625.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Coincidence_15625_descriptor;
         }

         public C2S_Coincidence_15625 getDefaultInstanceForType() {
            return EastWarMsg.C2S_Coincidence_15625.getDefaultInstance();
         }

         public C2S_Coincidence_15625 build() {
            C2S_Coincidence_15625 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Coincidence_15625 buildPartial() {
            C2S_Coincidence_15625 result = new C2S_Coincidence_15625(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Coincidence_15625) {
               return this.mergeFrom((C2S_Coincidence_15625)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Coincidence_15625 other) {
            if (other == EastWarMsg.C2S_Coincidence_15625.getDefaultInstance()) {
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
            C2S_Coincidence_15625 parsedMessage = null;

            try {
               parsedMessage = (C2S_Coincidence_15625)EastWarMsg.C2S_Coincidence_15625.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Coincidence_15625)e.getUnfinishedMessage();
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

   public static final class S2C_Coincidence_15626 extends GeneratedMessageV3 implements S2C_Coincidence_15626OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HADGETID_FIELD_NUMBER = 1;
      private int hadGetId_;
      private byte memoizedIsInitialized;
      private static final S2C_Coincidence_15626 DEFAULT_INSTANCE = new S2C_Coincidence_15626();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Coincidence_15626> PARSER = new AbstractParser<S2C_Coincidence_15626>() {
         public S2C_Coincidence_15626 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Coincidence_15626(input, extensionRegistry);
         }
      };

      private S2C_Coincidence_15626(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Coincidence_15626() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Coincidence_15626();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Coincidence_15626(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hadGetId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Coincidence_15626_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Coincidence_15626_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Coincidence_15626.class, Builder.class);
      }

      public boolean hasHadGetId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHadGetId() {
         return this.hadGetId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHadGetId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hadGetId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hadGetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Coincidence_15626)) {
            return super.equals(obj);
         } else {
            S2C_Coincidence_15626 other = (S2C_Coincidence_15626)obj;
            if (this.hasHadGetId() != other.hasHadGetId()) {
               return false;
            } else if (this.hasHadGetId() && this.getHadGetId() != other.getHadGetId()) {
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
            if (this.hasHadGetId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHadGetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Coincidence_15626 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_15626)PARSER.parseFrom(data);
      }

      public static S2C_Coincidence_15626 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_15626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Coincidence_15626 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_15626)PARSER.parseFrom(data);
      }

      public static S2C_Coincidence_15626 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_15626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Coincidence_15626 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_15626)PARSER.parseFrom(data);
      }

      public static S2C_Coincidence_15626 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_15626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Coincidence_15626 parseFrom(InputStream input) throws IOException {
         return (S2C_Coincidence_15626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Coincidence_15626 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Coincidence_15626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Coincidence_15626 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Coincidence_15626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Coincidence_15626 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Coincidence_15626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Coincidence_15626 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Coincidence_15626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Coincidence_15626 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Coincidence_15626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Coincidence_15626 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Coincidence_15626 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Coincidence_15626> parser() {
         return PARSER;
      }

      public Parser<S2C_Coincidence_15626> getParserForType() {
         return PARSER;
      }

      public S2C_Coincidence_15626 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Coincidence_15626OrBuilder {
         private int bitField0_;
         private int hadGetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Coincidence_15626_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Coincidence_15626_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Coincidence_15626.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_Coincidence_15626.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hadGetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Coincidence_15626_descriptor;
         }

         public S2C_Coincidence_15626 getDefaultInstanceForType() {
            return EastWarMsg.S2C_Coincidence_15626.getDefaultInstance();
         }

         public S2C_Coincidence_15626 build() {
            S2C_Coincidence_15626 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Coincidence_15626 buildPartial() {
            S2C_Coincidence_15626 result = new S2C_Coincidence_15626(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hadGetId_ = this.hadGetId_;
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
            if (other instanceof S2C_Coincidence_15626) {
               return this.mergeFrom((S2C_Coincidence_15626)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Coincidence_15626 other) {
            if (other == EastWarMsg.S2C_Coincidence_15626.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHadGetId()) {
                  this.setHadGetId(other.getHadGetId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHadGetId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Coincidence_15626 parsedMessage = null;

            try {
               parsedMessage = (S2C_Coincidence_15626)EastWarMsg.S2C_Coincidence_15626.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Coincidence_15626)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHadGetId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHadGetId() {
            return this.hadGetId_;
         }

         public Builder setHadGetId(int value) {
            this.bitField0_ |= 1;
            this.hadGetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHadGetId() {
            this.bitField0_ &= -2;
            this.hadGetId_ = 0;
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

   public static final class C2S_CoincidenceBox_15627 extends GeneratedMessageV3 implements C2S_CoincidenceBox_15627OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_CoincidenceBox_15627 DEFAULT_INSTANCE = new C2S_CoincidenceBox_15627();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CoincidenceBox_15627> PARSER = new AbstractParser<C2S_CoincidenceBox_15627>() {
         public C2S_CoincidenceBox_15627 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CoincidenceBox_15627(input, extensionRegistry);
         }
      };

      private C2S_CoincidenceBox_15627(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CoincidenceBox_15627() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CoincidenceBox_15627();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CoincidenceBox_15627(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CoincidenceBox_15627_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CoincidenceBox_15627_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CoincidenceBox_15627.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CoincidenceBox_15627)) {
            return super.equals(obj);
         } else {
            C2S_CoincidenceBox_15627 other = (C2S_CoincidenceBox_15627)obj;
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

      public static C2S_CoincidenceBox_15627 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_15627)PARSER.parseFrom(data);
      }

      public static C2S_CoincidenceBox_15627 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_15627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CoincidenceBox_15627 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_15627)PARSER.parseFrom(data);
      }

      public static C2S_CoincidenceBox_15627 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_15627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CoincidenceBox_15627 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_15627)PARSER.parseFrom(data);
      }

      public static C2S_CoincidenceBox_15627 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_15627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CoincidenceBox_15627 parseFrom(InputStream input) throws IOException {
         return (C2S_CoincidenceBox_15627)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CoincidenceBox_15627 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CoincidenceBox_15627)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CoincidenceBox_15627 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CoincidenceBox_15627)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CoincidenceBox_15627 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CoincidenceBox_15627)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CoincidenceBox_15627 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CoincidenceBox_15627)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CoincidenceBox_15627 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CoincidenceBox_15627)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CoincidenceBox_15627 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CoincidenceBox_15627 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CoincidenceBox_15627> parser() {
         return PARSER;
      }

      public Parser<C2S_CoincidenceBox_15627> getParserForType() {
         return PARSER;
      }

      public C2S_CoincidenceBox_15627 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CoincidenceBox_15627OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CoincidenceBox_15627_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CoincidenceBox_15627_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CoincidenceBox_15627.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_CoincidenceBox_15627.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CoincidenceBox_15627_descriptor;
         }

         public C2S_CoincidenceBox_15627 getDefaultInstanceForType() {
            return EastWarMsg.C2S_CoincidenceBox_15627.getDefaultInstance();
         }

         public C2S_CoincidenceBox_15627 build() {
            C2S_CoincidenceBox_15627 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CoincidenceBox_15627 buildPartial() {
            C2S_CoincidenceBox_15627 result = new C2S_CoincidenceBox_15627(this);
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
            if (other instanceof C2S_CoincidenceBox_15627) {
               return this.mergeFrom((C2S_CoincidenceBox_15627)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CoincidenceBox_15627 other) {
            if (other == EastWarMsg.C2S_CoincidenceBox_15627.getDefaultInstance()) {
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
            C2S_CoincidenceBox_15627 parsedMessage = null;

            try {
               parsedMessage = (C2S_CoincidenceBox_15627)EastWarMsg.C2S_CoincidenceBox_15627.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CoincidenceBox_15627)e.getUnfinishedMessage();
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

   public static final class S2C_CoincidenceBox_15628 extends GeneratedMessageV3 implements S2C_CoincidenceBox_15628OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_CoincidenceBox_15628 DEFAULT_INSTANCE = new S2C_CoincidenceBox_15628();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CoincidenceBox_15628> PARSER = new AbstractParser<S2C_CoincidenceBox_15628>() {
         public S2C_CoincidenceBox_15628 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CoincidenceBox_15628(input, extensionRegistry);
         }
      };

      private S2C_CoincidenceBox_15628(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CoincidenceBox_15628() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CoincidenceBox_15628();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CoincidenceBox_15628(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CoincidenceBox_15628_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CoincidenceBox_15628_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CoincidenceBox_15628.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CoincidenceBox_15628)) {
            return super.equals(obj);
         } else {
            S2C_CoincidenceBox_15628 other = (S2C_CoincidenceBox_15628)obj;
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

      public static S2C_CoincidenceBox_15628 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_15628)PARSER.parseFrom(data);
      }

      public static S2C_CoincidenceBox_15628 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_15628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CoincidenceBox_15628 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_15628)PARSER.parseFrom(data);
      }

      public static S2C_CoincidenceBox_15628 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_15628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CoincidenceBox_15628 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_15628)PARSER.parseFrom(data);
      }

      public static S2C_CoincidenceBox_15628 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_15628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CoincidenceBox_15628 parseFrom(InputStream input) throws IOException {
         return (S2C_CoincidenceBox_15628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CoincidenceBox_15628 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CoincidenceBox_15628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CoincidenceBox_15628 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CoincidenceBox_15628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CoincidenceBox_15628 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CoincidenceBox_15628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CoincidenceBox_15628 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CoincidenceBox_15628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CoincidenceBox_15628 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CoincidenceBox_15628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CoincidenceBox_15628 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CoincidenceBox_15628 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CoincidenceBox_15628> parser() {
         return PARSER;
      }

      public Parser<S2C_CoincidenceBox_15628> getParserForType() {
         return PARSER;
      }

      public S2C_CoincidenceBox_15628 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CoincidenceBox_15628OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CoincidenceBox_15628_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CoincidenceBox_15628_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CoincidenceBox_15628.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_CoincidenceBox_15628.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CoincidenceBox_15628_descriptor;
         }

         public S2C_CoincidenceBox_15628 getDefaultInstanceForType() {
            return EastWarMsg.S2C_CoincidenceBox_15628.getDefaultInstance();
         }

         public S2C_CoincidenceBox_15628 build() {
            S2C_CoincidenceBox_15628 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CoincidenceBox_15628 buildPartial() {
            S2C_CoincidenceBox_15628 result = new S2C_CoincidenceBox_15628(this);
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
            if (other instanceof S2C_CoincidenceBox_15628) {
               return this.mergeFrom((S2C_CoincidenceBox_15628)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CoincidenceBox_15628 other) {
            if (other == EastWarMsg.S2C_CoincidenceBox_15628.getDefaultInstance()) {
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
            S2C_CoincidenceBox_15628 parsedMessage = null;

            try {
               parsedMessage = (S2C_CoincidenceBox_15628)EastWarMsg.S2C_CoincidenceBox_15628.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CoincidenceBox_15628)e.getUnfinishedMessage();
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

   public static final class C2S_CumulativeId_15629 extends GeneratedMessageV3 implements C2S_CumulativeId_15629OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CumulativeId_15629 DEFAULT_INSTANCE = new C2S_CumulativeId_15629();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CumulativeId_15629> PARSER = new AbstractParser<C2S_CumulativeId_15629>() {
         public C2S_CumulativeId_15629 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CumulativeId_15629(input, extensionRegistry);
         }
      };

      private C2S_CumulativeId_15629(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CumulativeId_15629() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CumulativeId_15629();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CumulativeId_15629(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CumulativeId_15629_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CumulativeId_15629_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CumulativeId_15629.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CumulativeId_15629)) {
            return super.equals(obj);
         } else {
            C2S_CumulativeId_15629 other = (C2S_CumulativeId_15629)obj;
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

      public static C2S_CumulativeId_15629 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_15629)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeId_15629 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_15629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeId_15629 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_15629)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeId_15629 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_15629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeId_15629 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_15629)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeId_15629 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_15629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeId_15629 parseFrom(InputStream input) throws IOException {
         return (C2S_CumulativeId_15629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CumulativeId_15629 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeId_15629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CumulativeId_15629 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CumulativeId_15629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CumulativeId_15629 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeId_15629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CumulativeId_15629 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CumulativeId_15629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CumulativeId_15629 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeId_15629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CumulativeId_15629 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CumulativeId_15629 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CumulativeId_15629> parser() {
         return PARSER;
      }

      public Parser<C2S_CumulativeId_15629> getParserForType() {
         return PARSER;
      }

      public C2S_CumulativeId_15629 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CumulativeId_15629OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CumulativeId_15629_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CumulativeId_15629_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CumulativeId_15629.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_CumulativeId_15629.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CumulativeId_15629_descriptor;
         }

         public C2S_CumulativeId_15629 getDefaultInstanceForType() {
            return EastWarMsg.C2S_CumulativeId_15629.getDefaultInstance();
         }

         public C2S_CumulativeId_15629 build() {
            C2S_CumulativeId_15629 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CumulativeId_15629 buildPartial() {
            C2S_CumulativeId_15629 result = new C2S_CumulativeId_15629(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_CumulativeId_15629) {
               return this.mergeFrom((C2S_CumulativeId_15629)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CumulativeId_15629 other) {
            if (other == EastWarMsg.C2S_CumulativeId_15629.getDefaultInstance()) {
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
            C2S_CumulativeId_15629 parsedMessage = null;

            try {
               parsedMessage = (C2S_CumulativeId_15629)EastWarMsg.C2S_CumulativeId_15629.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CumulativeId_15629)e.getUnfinishedMessage();
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

   public static final class S2C_CumulativeId_15630 extends GeneratedMessageV3 implements S2C_CumulativeId_15630OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOTALID_FIELD_NUMBER = 1;
      private int totalId_;
      private byte memoizedIsInitialized;
      private static final S2C_CumulativeId_15630 DEFAULT_INSTANCE = new S2C_CumulativeId_15630();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CumulativeId_15630> PARSER = new AbstractParser<S2C_CumulativeId_15630>() {
         public S2C_CumulativeId_15630 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CumulativeId_15630(input, extensionRegistry);
         }
      };

      private S2C_CumulativeId_15630(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CumulativeId_15630() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CumulativeId_15630();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CumulativeId_15630(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.totalId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CumulativeId_15630_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CumulativeId_15630_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CumulativeId_15630.class, Builder.class);
      }

      public boolean hasTotalId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTotalId() {
         return this.totalId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTotalId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.totalId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.totalId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CumulativeId_15630)) {
            return super.equals(obj);
         } else {
            S2C_CumulativeId_15630 other = (S2C_CumulativeId_15630)obj;
            if (this.hasTotalId() != other.hasTotalId()) {
               return false;
            } else if (this.hasTotalId() && this.getTotalId() != other.getTotalId()) {
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
            if (this.hasTotalId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTotalId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CumulativeId_15630 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_15630)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeId_15630 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_15630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeId_15630 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_15630)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeId_15630 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_15630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeId_15630 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_15630)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeId_15630 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_15630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeId_15630 parseFrom(InputStream input) throws IOException {
         return (S2C_CumulativeId_15630)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CumulativeId_15630 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeId_15630)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CumulativeId_15630 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CumulativeId_15630)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CumulativeId_15630 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeId_15630)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CumulativeId_15630 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CumulativeId_15630)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CumulativeId_15630 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeId_15630)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CumulativeId_15630 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CumulativeId_15630 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CumulativeId_15630> parser() {
         return PARSER;
      }

      public Parser<S2C_CumulativeId_15630> getParserForType() {
         return PARSER;
      }

      public S2C_CumulativeId_15630 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CumulativeId_15630OrBuilder {
         private int bitField0_;
         private int totalId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CumulativeId_15630_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CumulativeId_15630_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CumulativeId_15630.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_CumulativeId_15630.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.totalId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CumulativeId_15630_descriptor;
         }

         public S2C_CumulativeId_15630 getDefaultInstanceForType() {
            return EastWarMsg.S2C_CumulativeId_15630.getDefaultInstance();
         }

         public S2C_CumulativeId_15630 build() {
            S2C_CumulativeId_15630 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CumulativeId_15630 buildPartial() {
            S2C_CumulativeId_15630 result = new S2C_CumulativeId_15630(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.totalId_ = this.totalId_;
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
            if (other instanceof S2C_CumulativeId_15630) {
               return this.mergeFrom((S2C_CumulativeId_15630)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CumulativeId_15630 other) {
            if (other == EastWarMsg.S2C_CumulativeId_15630.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTotalId()) {
                  this.setTotalId(other.getTotalId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTotalId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CumulativeId_15630 parsedMessage = null;

            try {
               parsedMessage = (S2C_CumulativeId_15630)EastWarMsg.S2C_CumulativeId_15630.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CumulativeId_15630)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTotalId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTotalId() {
            return this.totalId_;
         }

         public Builder setTotalId(int value) {
            this.bitField0_ |= 1;
            this.totalId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalId() {
            this.bitField0_ &= -2;
            this.totalId_ = 0;
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

   public static final class C2S_MakeWine_15641 extends GeneratedMessageV3 implements C2S_MakeWine_15641OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_MakeWine_15641 DEFAULT_INSTANCE = new C2S_MakeWine_15641();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MakeWine_15641> PARSER = new AbstractParser<C2S_MakeWine_15641>() {
         public C2S_MakeWine_15641 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MakeWine_15641(input, extensionRegistry);
         }
      };

      private C2S_MakeWine_15641(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MakeWine_15641() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MakeWine_15641();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MakeWine_15641(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_MakeWine_15641_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_MakeWine_15641_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MakeWine_15641.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
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
         } else if (!this.hasNum()) {
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MakeWine_15641)) {
            return super.equals(obj);
         } else {
            C2S_MakeWine_15641 other = (C2S_MakeWine_15641)obj;
            if (this.hasNum() != other.hasNum()) {
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
            if (this.hasNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MakeWine_15641 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_15641)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_15641 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_15641)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_15641 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_15641)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_15641 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_15641)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_15641 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_15641)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_15641 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_15641)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_15641 parseFrom(InputStream input) throws IOException {
         return (C2S_MakeWine_15641)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_15641 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_15641)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MakeWine_15641 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MakeWine_15641)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_15641 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_15641)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MakeWine_15641 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MakeWine_15641)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_15641 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_15641)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MakeWine_15641 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MakeWine_15641 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MakeWine_15641> parser() {
         return PARSER;
      }

      public Parser<C2S_MakeWine_15641> getParserForType() {
         return PARSER;
      }

      public C2S_MakeWine_15641 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MakeWine_15641OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_MakeWine_15641_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_MakeWine_15641_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MakeWine_15641.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_MakeWine_15641.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_MakeWine_15641_descriptor;
         }

         public C2S_MakeWine_15641 getDefaultInstanceForType() {
            return EastWarMsg.C2S_MakeWine_15641.getDefaultInstance();
         }

         public C2S_MakeWine_15641 build() {
            C2S_MakeWine_15641 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MakeWine_15641 buildPartial() {
            C2S_MakeWine_15641 result = new C2S_MakeWine_15641(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_MakeWine_15641) {
               return this.mergeFrom((C2S_MakeWine_15641)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MakeWine_15641 other) {
            if (other == EastWarMsg.C2S_MakeWine_15641.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MakeWine_15641 parsedMessage = null;

            try {
               parsedMessage = (C2S_MakeWine_15641)EastWarMsg.C2S_MakeWine_15641.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MakeWine_15641)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_MakeWine_15642 extends GeneratedMessageV3 implements S2C_MakeWine_15642OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TOTALWINENUM_FIELD_NUMBER = 2;
      private int totalWineNum_;
      private byte memoizedIsInitialized;
      private static final S2C_MakeWine_15642 DEFAULT_INSTANCE = new S2C_MakeWine_15642();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MakeWine_15642> PARSER = new AbstractParser<S2C_MakeWine_15642>() {
         public S2C_MakeWine_15642 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MakeWine_15642(input, extensionRegistry);
         }
      };

      private S2C_MakeWine_15642(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MakeWine_15642() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MakeWine_15642();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MakeWine_15642(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.totalWineNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_MakeWine_15642_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_MakeWine_15642_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MakeWine_15642.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTotalWineNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTotalWineNum() {
         return this.totalWineNum_;
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
         } else if (!this.hasTotalWineNum()) {
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
            output.writeInt32(2, this.totalWineNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.totalWineNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MakeWine_15642)) {
            return super.equals(obj);
         } else {
            S2C_MakeWine_15642 other = (S2C_MakeWine_15642)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTotalWineNum() != other.hasTotalWineNum()) {
               return false;
            } else if (this.hasTotalWineNum() && this.getTotalWineNum() != other.getTotalWineNum()) {
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

            if (this.hasTotalWineNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalWineNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MakeWine_15642 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_15642)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_15642 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_15642)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_15642 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_15642)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_15642 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_15642)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_15642 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_15642)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_15642 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_15642)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_15642 parseFrom(InputStream input) throws IOException {
         return (S2C_MakeWine_15642)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_15642 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_15642)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MakeWine_15642 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MakeWine_15642)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_15642 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_15642)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MakeWine_15642 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MakeWine_15642)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_15642 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_15642)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MakeWine_15642 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MakeWine_15642 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MakeWine_15642> parser() {
         return PARSER;
      }

      public Parser<S2C_MakeWine_15642> getParserForType() {
         return PARSER;
      }

      public S2C_MakeWine_15642 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MakeWine_15642OrBuilder {
         private int bitField0_;
         private int result_;
         private int totalWineNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_MakeWine_15642_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_MakeWine_15642_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MakeWine_15642.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_MakeWine_15642.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.totalWineNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_MakeWine_15642_descriptor;
         }

         public S2C_MakeWine_15642 getDefaultInstanceForType() {
            return EastWarMsg.S2C_MakeWine_15642.getDefaultInstance();
         }

         public S2C_MakeWine_15642 build() {
            S2C_MakeWine_15642 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MakeWine_15642 buildPartial() {
            S2C_MakeWine_15642 result = new S2C_MakeWine_15642(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalWineNum_ = this.totalWineNum_;
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
            if (other instanceof S2C_MakeWine_15642) {
               return this.mergeFrom((S2C_MakeWine_15642)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MakeWine_15642 other) {
            if (other == EastWarMsg.S2C_MakeWine_15642.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTotalWineNum()) {
                  this.setTotalWineNum(other.getTotalWineNum());
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
               return this.hasTotalWineNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MakeWine_15642 parsedMessage = null;

            try {
               parsedMessage = (S2C_MakeWine_15642)EastWarMsg.S2C_MakeWine_15642.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MakeWine_15642)e.getUnfinishedMessage();
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

         public boolean hasTotalWineNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTotalWineNum() {
            return this.totalWineNum_;
         }

         public Builder setTotalWineNum(int value) {
            this.bitField0_ |= 2;
            this.totalWineNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalWineNum() {
            this.bitField0_ &= -3;
            this.totalWineNum_ = 0;
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

   public static final class C2S_TakePlumReward_15643 extends GeneratedMessageV3 implements C2S_TakePlumReward_15643OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TakePlumReward_15643 DEFAULT_INSTANCE = new C2S_TakePlumReward_15643();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakePlumReward_15643> PARSER = new AbstractParser<C2S_TakePlumReward_15643>() {
         public C2S_TakePlumReward_15643 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakePlumReward_15643(input, extensionRegistry);
         }
      };

      private C2S_TakePlumReward_15643(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakePlumReward_15643() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakePlumReward_15643();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakePlumReward_15643(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_TakePlumReward_15643_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_TakePlumReward_15643_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakePlumReward_15643.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakePlumReward_15643)) {
            return super.equals(obj);
         } else {
            C2S_TakePlumReward_15643 other = (C2S_TakePlumReward_15643)obj;
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

      public static C2S_TakePlumReward_15643 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_15643)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_15643 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_15643)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_15643 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_15643)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_15643 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_15643)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_15643 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_15643)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_15643 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_15643)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_15643 parseFrom(InputStream input) throws IOException {
         return (C2S_TakePlumReward_15643)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_15643 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_15643)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakePlumReward_15643 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakePlumReward_15643)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_15643 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_15643)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakePlumReward_15643 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakePlumReward_15643)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_15643 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_15643)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakePlumReward_15643 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakePlumReward_15643 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakePlumReward_15643> parser() {
         return PARSER;
      }

      public Parser<C2S_TakePlumReward_15643> getParserForType() {
         return PARSER;
      }

      public C2S_TakePlumReward_15643 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakePlumReward_15643OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_TakePlumReward_15643_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_TakePlumReward_15643_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakePlumReward_15643.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_TakePlumReward_15643.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_TakePlumReward_15643_descriptor;
         }

         public C2S_TakePlumReward_15643 getDefaultInstanceForType() {
            return EastWarMsg.C2S_TakePlumReward_15643.getDefaultInstance();
         }

         public C2S_TakePlumReward_15643 build() {
            C2S_TakePlumReward_15643 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakePlumReward_15643 buildPartial() {
            C2S_TakePlumReward_15643 result = new C2S_TakePlumReward_15643(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TakePlumReward_15643) {
               return this.mergeFrom((C2S_TakePlumReward_15643)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakePlumReward_15643 other) {
            if (other == EastWarMsg.C2S_TakePlumReward_15643.getDefaultInstance()) {
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
            C2S_TakePlumReward_15643 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakePlumReward_15643)EastWarMsg.C2S_TakePlumReward_15643.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakePlumReward_15643)e.getUnfinishedMessage();
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

   public static final class S2C_TakePlumReward_15644 extends GeneratedMessageV3 implements S2C_TakePlumReward_15644OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_TakePlumReward_15644 DEFAULT_INSTANCE = new S2C_TakePlumReward_15644();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakePlumReward_15644> PARSER = new AbstractParser<S2C_TakePlumReward_15644>() {
         public S2C_TakePlumReward_15644 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakePlumReward_15644(input, extensionRegistry);
         }
      };

      private S2C_TakePlumReward_15644(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakePlumReward_15644() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakePlumReward_15644();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakePlumReward_15644(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_TakePlumReward_15644_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_TakePlumReward_15644_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakePlumReward_15644.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakePlumReward_15644)) {
            return super.equals(obj);
         } else {
            S2C_TakePlumReward_15644 other = (S2C_TakePlumReward_15644)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakePlumReward_15644 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_15644)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_15644 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_15644)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_15644 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_15644)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_15644 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_15644)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_15644 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_15644)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_15644 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_15644)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_15644 parseFrom(InputStream input) throws IOException {
         return (S2C_TakePlumReward_15644)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_15644 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_15644)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakePlumReward_15644 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakePlumReward_15644)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_15644 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_15644)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakePlumReward_15644 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakePlumReward_15644)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_15644 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_15644)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakePlumReward_15644 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakePlumReward_15644 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakePlumReward_15644> parser() {
         return PARSER;
      }

      public Parser<S2C_TakePlumReward_15644> getParserForType() {
         return PARSER;
      }

      public S2C_TakePlumReward_15644 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakePlumReward_15644OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_TakePlumReward_15644_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_TakePlumReward_15644_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakePlumReward_15644.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_TakePlumReward_15644.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_TakePlumReward_15644_descriptor;
         }

         public S2C_TakePlumReward_15644 getDefaultInstanceForType() {
            return EastWarMsg.S2C_TakePlumReward_15644.getDefaultInstance();
         }

         public S2C_TakePlumReward_15644 build() {
            S2C_TakePlumReward_15644 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakePlumReward_15644 buildPartial() {
            S2C_TakePlumReward_15644 result = new S2C_TakePlumReward_15644(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_TakePlumReward_15644) {
               return this.mergeFrom((S2C_TakePlumReward_15644)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakePlumReward_15644 other) {
            if (other == EastWarMsg.S2C_TakePlumReward_15644.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            S2C_TakePlumReward_15644 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakePlumReward_15644)EastWarMsg.S2C_TakePlumReward_15644.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakePlumReward_15644)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Drink_15645 extends GeneratedMessageV3 implements C2S_Drink_15645OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Drink_15645 DEFAULT_INSTANCE = new C2S_Drink_15645();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Drink_15645> PARSER = new AbstractParser<C2S_Drink_15645>() {
         public C2S_Drink_15645 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Drink_15645(input, extensionRegistry);
         }
      };

      private C2S_Drink_15645(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Drink_15645() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Drink_15645();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Drink_15645(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Drink_15645_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Drink_15645_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Drink_15645.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Drink_15645)) {
            return super.equals(obj);
         } else {
            C2S_Drink_15645 other = (C2S_Drink_15645)obj;
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

      public static C2S_Drink_15645 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Drink_15645)PARSER.parseFrom(data);
      }

      public static C2S_Drink_15645 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_15645)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_15645 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Drink_15645)PARSER.parseFrom(data);
      }

      public static C2S_Drink_15645 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_15645)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_15645 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Drink_15645)PARSER.parseFrom(data);
      }

      public static C2S_Drink_15645 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_15645)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_15645 parseFrom(InputStream input) throws IOException {
         return (C2S_Drink_15645)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Drink_15645 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_15645)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Drink_15645 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Drink_15645)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Drink_15645 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_15645)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Drink_15645 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Drink_15645)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Drink_15645 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_15645)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Drink_15645 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Drink_15645 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Drink_15645> parser() {
         return PARSER;
      }

      public Parser<C2S_Drink_15645> getParserForType() {
         return PARSER;
      }

      public C2S_Drink_15645 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Drink_15645OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Drink_15645_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Drink_15645_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Drink_15645.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_Drink_15645.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_Drink_15645_descriptor;
         }

         public C2S_Drink_15645 getDefaultInstanceForType() {
            return EastWarMsg.C2S_Drink_15645.getDefaultInstance();
         }

         public C2S_Drink_15645 build() {
            C2S_Drink_15645 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Drink_15645 buildPartial() {
            C2S_Drink_15645 result = new C2S_Drink_15645(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Drink_15645) {
               return this.mergeFrom((C2S_Drink_15645)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Drink_15645 other) {
            if (other == EastWarMsg.C2S_Drink_15645.getDefaultInstance()) {
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
            C2S_Drink_15645 parsedMessage = null;

            try {
               parsedMessage = (C2S_Drink_15645)EastWarMsg.C2S_Drink_15645.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Drink_15645)e.getUnfinishedMessage();
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

   public static final class S2C_Drink_15646 extends GeneratedMessageV3 implements S2C_Drink_15646OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int FREENUM_FIELD_NUMBER = 2;
      private int freeNum_;
      private byte memoizedIsInitialized;
      private static final S2C_Drink_15646 DEFAULT_INSTANCE = new S2C_Drink_15646();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Drink_15646> PARSER = new AbstractParser<S2C_Drink_15646>() {
         public S2C_Drink_15646 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Drink_15646(input, extensionRegistry);
         }
      };

      private S2C_Drink_15646(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Drink_15646() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Drink_15646();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Drink_15646(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.freeNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Drink_15646_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Drink_15646_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Drink_15646.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasFreeNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFreeNum() {
         return this.freeNum_;
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
         } else if (!this.hasFreeNum()) {
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
            output.writeInt32(2, this.freeNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.freeNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Drink_15646)) {
            return super.equals(obj);
         } else {
            S2C_Drink_15646 other = (S2C_Drink_15646)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasFreeNum() != other.hasFreeNum()) {
               return false;
            } else if (this.hasFreeNum() && this.getFreeNum() != other.getFreeNum()) {
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

            if (this.hasFreeNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFreeNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Drink_15646 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Drink_15646)PARSER.parseFrom(data);
      }

      public static S2C_Drink_15646 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_15646)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_15646 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Drink_15646)PARSER.parseFrom(data);
      }

      public static S2C_Drink_15646 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_15646)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_15646 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Drink_15646)PARSER.parseFrom(data);
      }

      public static S2C_Drink_15646 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_15646)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_15646 parseFrom(InputStream input) throws IOException {
         return (S2C_Drink_15646)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Drink_15646 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_15646)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Drink_15646 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Drink_15646)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Drink_15646 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_15646)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Drink_15646 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Drink_15646)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Drink_15646 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_15646)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Drink_15646 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Drink_15646 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Drink_15646> parser() {
         return PARSER;
      }

      public Parser<S2C_Drink_15646> getParserForType() {
         return PARSER;
      }

      public S2C_Drink_15646 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Drink_15646OrBuilder {
         private int bitField0_;
         private int result_;
         private int freeNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Drink_15646_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Drink_15646_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Drink_15646.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_Drink_15646.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.freeNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_Drink_15646_descriptor;
         }

         public S2C_Drink_15646 getDefaultInstanceForType() {
            return EastWarMsg.S2C_Drink_15646.getDefaultInstance();
         }

         public S2C_Drink_15646 build() {
            S2C_Drink_15646 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Drink_15646 buildPartial() {
            S2C_Drink_15646 result = new S2C_Drink_15646(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.freeNum_ = this.freeNum_;
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
            if (other instanceof S2C_Drink_15646) {
               return this.mergeFrom((S2C_Drink_15646)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Drink_15646 other) {
            if (other == EastWarMsg.S2C_Drink_15646.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasFreeNum()) {
                  this.setFreeNum(other.getFreeNum());
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
               return this.hasFreeNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Drink_15646 parsedMessage = null;

            try {
               parsedMessage = (S2C_Drink_15646)EastWarMsg.S2C_Drink_15646.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Drink_15646)e.getUnfinishedMessage();
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

         public boolean hasFreeNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFreeNum() {
            return this.freeNum_;
         }

         public Builder setFreeNum(int value) {
            this.bitField0_ |= 2;
            this.freeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeNum() {
            this.bitField0_ &= -3;
            this.freeNum_ = 0;
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

   public static final class C2S_FreeDrinkNum_15647 extends GeneratedMessageV3 implements C2S_FreeDrinkNum_15647OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FreeDrinkNum_15647 DEFAULT_INSTANCE = new C2S_FreeDrinkNum_15647();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FreeDrinkNum_15647> PARSER = new AbstractParser<C2S_FreeDrinkNum_15647>() {
         public C2S_FreeDrinkNum_15647 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FreeDrinkNum_15647(input, extensionRegistry);
         }
      };

      private C2S_FreeDrinkNum_15647(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FreeDrinkNum_15647() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FreeDrinkNum_15647();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FreeDrinkNum_15647(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_FreeDrinkNum_15647_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_FreeDrinkNum_15647_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeDrinkNum_15647.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FreeDrinkNum_15647)) {
            return super.equals(obj);
         } else {
            C2S_FreeDrinkNum_15647 other = (C2S_FreeDrinkNum_15647)obj;
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

      public static C2S_FreeDrinkNum_15647 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_15647)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_15647 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_15647)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_15647 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_15647)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_15647 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_15647)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_15647 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_15647)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_15647 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_15647)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_15647 parseFrom(InputStream input) throws IOException {
         return (C2S_FreeDrinkNum_15647)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_15647 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_15647)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_15647 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FreeDrinkNum_15647)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_15647 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_15647)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_15647 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FreeDrinkNum_15647)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_15647 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_15647)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FreeDrinkNum_15647 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FreeDrinkNum_15647 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FreeDrinkNum_15647> parser() {
         return PARSER;
      }

      public Parser<C2S_FreeDrinkNum_15647> getParserForType() {
         return PARSER;
      }

      public C2S_FreeDrinkNum_15647 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FreeDrinkNum_15647OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_FreeDrinkNum_15647_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_FreeDrinkNum_15647_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeDrinkNum_15647.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_FreeDrinkNum_15647.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_FreeDrinkNum_15647_descriptor;
         }

         public C2S_FreeDrinkNum_15647 getDefaultInstanceForType() {
            return EastWarMsg.C2S_FreeDrinkNum_15647.getDefaultInstance();
         }

         public C2S_FreeDrinkNum_15647 build() {
            C2S_FreeDrinkNum_15647 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FreeDrinkNum_15647 buildPartial() {
            C2S_FreeDrinkNum_15647 result = new C2S_FreeDrinkNum_15647(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_FreeDrinkNum_15647) {
               return this.mergeFrom((C2S_FreeDrinkNum_15647)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FreeDrinkNum_15647 other) {
            if (other == EastWarMsg.C2S_FreeDrinkNum_15647.getDefaultInstance()) {
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
            C2S_FreeDrinkNum_15647 parsedMessage = null;

            try {
               parsedMessage = (C2S_FreeDrinkNum_15647)EastWarMsg.C2S_FreeDrinkNum_15647.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FreeDrinkNum_15647)e.getUnfinishedMessage();
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

   public static final class S2C_FreeDrinkNum_15648 extends GeneratedMessageV3 implements S2C_FreeDrinkNum_15648OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FREENUM_FIELD_NUMBER = 1;
      private int freeNum_;
      public static final int TOTALWINENUM_FIELD_NUMBER = 2;
      private int totalWineNum_;
      public static final int ISTAKED_FIELD_NUMBER = 3;
      private boolean isTaked_;
      private byte memoizedIsInitialized;
      private static final S2C_FreeDrinkNum_15648 DEFAULT_INSTANCE = new S2C_FreeDrinkNum_15648();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FreeDrinkNum_15648> PARSER = new AbstractParser<S2C_FreeDrinkNum_15648>() {
         public S2C_FreeDrinkNum_15648 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FreeDrinkNum_15648(input, extensionRegistry);
         }
      };

      private S2C_FreeDrinkNum_15648(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FreeDrinkNum_15648() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FreeDrinkNum_15648();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FreeDrinkNum_15648(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.freeNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.totalWineNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isTaked_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_FreeDrinkNum_15648_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_FreeDrinkNum_15648_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeDrinkNum_15648.class, Builder.class);
      }

      public boolean hasFreeNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFreeNum() {
         return this.freeNum_;
      }

      public boolean hasTotalWineNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTotalWineNum() {
         return this.totalWineNum_;
      }

      public boolean hasIsTaked() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsTaked() {
         return this.isTaked_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFreeNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalWineNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsTaked()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.freeNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.totalWineNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isTaked_);
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
               size += CodedOutputStream.computeInt32Size(1, this.freeNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.totalWineNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isTaked_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FreeDrinkNum_15648)) {
            return super.equals(obj);
         } else {
            S2C_FreeDrinkNum_15648 other = (S2C_FreeDrinkNum_15648)obj;
            if (this.hasFreeNum() != other.hasFreeNum()) {
               return false;
            } else if (this.hasFreeNum() && this.getFreeNum() != other.getFreeNum()) {
               return false;
            } else if (this.hasTotalWineNum() != other.hasTotalWineNum()) {
               return false;
            } else if (this.hasTotalWineNum() && this.getTotalWineNum() != other.getTotalWineNum()) {
               return false;
            } else if (this.hasIsTaked() != other.hasIsTaked()) {
               return false;
            } else if (this.hasIsTaked() && this.getIsTaked() != other.getIsTaked()) {
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
            if (this.hasFreeNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFreeNum();
            }

            if (this.hasTotalWineNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalWineNum();
            }

            if (this.hasIsTaked()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsTaked());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FreeDrinkNum_15648 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_15648)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_15648 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_15648)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_15648 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_15648)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_15648 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_15648)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_15648 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_15648)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_15648 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_15648)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_15648 parseFrom(InputStream input) throws IOException {
         return (S2C_FreeDrinkNum_15648)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_15648 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_15648)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_15648 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FreeDrinkNum_15648)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_15648 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_15648)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_15648 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FreeDrinkNum_15648)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_15648 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_15648)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FreeDrinkNum_15648 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FreeDrinkNum_15648 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FreeDrinkNum_15648> parser() {
         return PARSER;
      }

      public Parser<S2C_FreeDrinkNum_15648> getParserForType() {
         return PARSER;
      }

      public S2C_FreeDrinkNum_15648 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FreeDrinkNum_15648OrBuilder {
         private int bitField0_;
         private int freeNum_;
         private int totalWineNum_;
         private boolean isTaked_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_FreeDrinkNum_15648_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_FreeDrinkNum_15648_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeDrinkNum_15648.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_FreeDrinkNum_15648.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.freeNum_ = 0;
            this.bitField0_ &= -2;
            this.totalWineNum_ = 0;
            this.bitField0_ &= -3;
            this.isTaked_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_FreeDrinkNum_15648_descriptor;
         }

         public S2C_FreeDrinkNum_15648 getDefaultInstanceForType() {
            return EastWarMsg.S2C_FreeDrinkNum_15648.getDefaultInstance();
         }

         public S2C_FreeDrinkNum_15648 build() {
            S2C_FreeDrinkNum_15648 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FreeDrinkNum_15648 buildPartial() {
            S2C_FreeDrinkNum_15648 result = new S2C_FreeDrinkNum_15648(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.freeNum_ = this.freeNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalWineNum_ = this.totalWineNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isTaked_ = this.isTaked_;
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
            if (other instanceof S2C_FreeDrinkNum_15648) {
               return this.mergeFrom((S2C_FreeDrinkNum_15648)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FreeDrinkNum_15648 other) {
            if (other == EastWarMsg.S2C_FreeDrinkNum_15648.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFreeNum()) {
                  this.setFreeNum(other.getFreeNum());
               }

               if (other.hasTotalWineNum()) {
                  this.setTotalWineNum(other.getTotalWineNum());
               }

               if (other.hasIsTaked()) {
                  this.setIsTaked(other.getIsTaked());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFreeNum()) {
               return false;
            } else if (!this.hasTotalWineNum()) {
               return false;
            } else {
               return this.hasIsTaked();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FreeDrinkNum_15648 parsedMessage = null;

            try {
               parsedMessage = (S2C_FreeDrinkNum_15648)EastWarMsg.S2C_FreeDrinkNum_15648.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FreeDrinkNum_15648)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFreeNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFreeNum() {
            return this.freeNum_;
         }

         public Builder setFreeNum(int value) {
            this.bitField0_ |= 1;
            this.freeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeNum() {
            this.bitField0_ &= -2;
            this.freeNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalWineNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTotalWineNum() {
            return this.totalWineNum_;
         }

         public Builder setTotalWineNum(int value) {
            this.bitField0_ |= 2;
            this.totalWineNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalWineNum() {
            this.bitField0_ &= -3;
            this.totalWineNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsTaked() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsTaked() {
            return this.isTaked_;
         }

         public Builder setIsTaked(boolean value) {
            this.bitField0_ |= 4;
            this.isTaked_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsTaked() {
            this.bitField0_ &= -5;
            this.isTaked_ = false;
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

   public static final class C2S_CommitTask_15651 extends GeneratedMessageV3 implements C2S_CommitTask_15651OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_15651 DEFAULT_INSTANCE = new C2S_CommitTask_15651();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_15651> PARSER = new AbstractParser<C2S_CommitTask_15651>() {
         public C2S_CommitTask_15651 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_15651(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_15651(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_15651() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_15651();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_15651(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CommitTask_15651_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CommitTask_15651_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_15651.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CommitTask_15651)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_15651 other = (C2S_CommitTask_15651)obj;
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

      public static C2S_CommitTask_15651 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_15651)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_15651 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_15651)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_15651 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_15651)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_15651 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_15651)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_15651 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_15651)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_15651 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_15651)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_15651 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_15651)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_15651 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_15651)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_15651 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_15651)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_15651 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_15651)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_15651 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_15651)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_15651 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_15651)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_15651 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_15651 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_15651> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_15651> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_15651 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_15651OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CommitTask_15651_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CommitTask_15651_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_15651.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_CommitTask_15651.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_CommitTask_15651_descriptor;
         }

         public C2S_CommitTask_15651 getDefaultInstanceForType() {
            return EastWarMsg.C2S_CommitTask_15651.getDefaultInstance();
         }

         public C2S_CommitTask_15651 build() {
            C2S_CommitTask_15651 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_15651 buildPartial() {
            C2S_CommitTask_15651 result = new C2S_CommitTask_15651(this);
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
            if (other instanceof C2S_CommitTask_15651) {
               return this.mergeFrom((C2S_CommitTask_15651)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_15651 other) {
            if (other == EastWarMsg.C2S_CommitTask_15651.getDefaultInstance()) {
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
            C2S_CommitTask_15651 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_15651)EastWarMsg.C2S_CommitTask_15651.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_15651)e.getUnfinishedMessage();
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

   public static final class S2C_CommitTask_15652 extends GeneratedMessageV3 implements S2C_CommitTask_15652OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_15652 DEFAULT_INSTANCE = new S2C_CommitTask_15652();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_15652> PARSER = new AbstractParser<S2C_CommitTask_15652>() {
         public S2C_CommitTask_15652 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_15652(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_15652(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_15652() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_15652();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_15652(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CommitTask_15652_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CommitTask_15652_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_15652.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CommitTask_15652)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_15652 other = (S2C_CommitTask_15652)obj;
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

      public static S2C_CommitTask_15652 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_15652)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_15652 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_15652)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_15652 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_15652)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_15652 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_15652)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_15652 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_15652)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_15652 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_15652)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_15652 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_15652)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_15652 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_15652)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_15652 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_15652)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_15652 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_15652)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_15652 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_15652)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_15652 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_15652)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_15652 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_15652 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_15652> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_15652> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_15652 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_15652OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CommitTask_15652_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CommitTask_15652_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_15652.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_CommitTask_15652.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_CommitTask_15652_descriptor;
         }

         public S2C_CommitTask_15652 getDefaultInstanceForType() {
            return EastWarMsg.S2C_CommitTask_15652.getDefaultInstance();
         }

         public S2C_CommitTask_15652 build() {
            S2C_CommitTask_15652 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_15652 buildPartial() {
            S2C_CommitTask_15652 result = new S2C_CommitTask_15652(this);
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
            if (other instanceof S2C_CommitTask_15652) {
               return this.mergeFrom((S2C_CommitTask_15652)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_15652 other) {
            if (other == EastWarMsg.S2C_CommitTask_15652.getDefaultInstance()) {
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
            S2C_CommitTask_15652 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_15652)EastWarMsg.S2C_CommitTask_15652.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_15652)e.getUnfinishedMessage();
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

   public static final class C2S_EastWarTasks_15653 extends GeneratedMessageV3 implements C2S_EastWarTasks_15653OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_EastWarTasks_15653 DEFAULT_INSTANCE = new C2S_EastWarTasks_15653();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EastWarTasks_15653> PARSER = new AbstractParser<C2S_EastWarTasks_15653>() {
         public C2S_EastWarTasks_15653 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EastWarTasks_15653(input, extensionRegistry);
         }
      };

      private C2S_EastWarTasks_15653(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EastWarTasks_15653() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EastWarTasks_15653();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EastWarTasks_15653(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_EastWarTasks_15653_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_EastWarTasks_15653_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EastWarTasks_15653.class, Builder.class);
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
         } else if (!(obj instanceof C2S_EastWarTasks_15653)) {
            return super.equals(obj);
         } else {
            C2S_EastWarTasks_15653 other = (C2S_EastWarTasks_15653)obj;
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

      public static C2S_EastWarTasks_15653 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_15653)PARSER.parseFrom(data);
      }

      public static C2S_EastWarTasks_15653 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_15653)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EastWarTasks_15653 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_15653)PARSER.parseFrom(data);
      }

      public static C2S_EastWarTasks_15653 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_15653)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EastWarTasks_15653 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_15653)PARSER.parseFrom(data);
      }

      public static C2S_EastWarTasks_15653 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_15653)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EastWarTasks_15653 parseFrom(InputStream input) throws IOException {
         return (C2S_EastWarTasks_15653)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EastWarTasks_15653 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EastWarTasks_15653)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EastWarTasks_15653 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EastWarTasks_15653)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EastWarTasks_15653 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EastWarTasks_15653)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EastWarTasks_15653 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EastWarTasks_15653)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EastWarTasks_15653 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EastWarTasks_15653)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EastWarTasks_15653 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EastWarTasks_15653 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EastWarTasks_15653> parser() {
         return PARSER;
      }

      public Parser<C2S_EastWarTasks_15653> getParserForType() {
         return PARSER;
      }

      public C2S_EastWarTasks_15653 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EastWarTasks_15653OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_EastWarTasks_15653_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_EastWarTasks_15653_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EastWarTasks_15653.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_EastWarTasks_15653.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_EastWarTasks_15653_descriptor;
         }

         public C2S_EastWarTasks_15653 getDefaultInstanceForType() {
            return EastWarMsg.C2S_EastWarTasks_15653.getDefaultInstance();
         }

         public C2S_EastWarTasks_15653 build() {
            C2S_EastWarTasks_15653 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EastWarTasks_15653 buildPartial() {
            C2S_EastWarTasks_15653 result = new C2S_EastWarTasks_15653(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_EastWarTasks_15653) {
               return this.mergeFrom((C2S_EastWarTasks_15653)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EastWarTasks_15653 other) {
            if (other == EastWarMsg.C2S_EastWarTasks_15653.getDefaultInstance()) {
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
            C2S_EastWarTasks_15653 parsedMessage = null;

            try {
               parsedMessage = (C2S_EastWarTasks_15653)EastWarMsg.C2S_EastWarTasks_15653.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EastWarTasks_15653)e.getUnfinishedMessage();
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

   public static final class S2C_EastWarTasks_15654 extends GeneratedMessageV3 implements S2C_EastWarTasks_15654OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_EastWarTasks_15654 DEFAULT_INSTANCE = new S2C_EastWarTasks_15654();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EastWarTasks_15654> PARSER = new AbstractParser<S2C_EastWarTasks_15654>() {
         public S2C_EastWarTasks_15654 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EastWarTasks_15654(input, extensionRegistry);
         }
      };

      private S2C_EastWarTasks_15654(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EastWarTasks_15654() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EastWarTasks_15654();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EastWarTasks_15654(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_EastWarTasks_15654_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_EastWarTasks_15654_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EastWarTasks_15654.class, Builder.class);
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
         } else if (!(obj instanceof S2C_EastWarTasks_15654)) {
            return super.equals(obj);
         } else {
            S2C_EastWarTasks_15654 other = (S2C_EastWarTasks_15654)obj;
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

      public static S2C_EastWarTasks_15654 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_15654)PARSER.parseFrom(data);
      }

      public static S2C_EastWarTasks_15654 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_15654)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EastWarTasks_15654 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_15654)PARSER.parseFrom(data);
      }

      public static S2C_EastWarTasks_15654 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_15654)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EastWarTasks_15654 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_15654)PARSER.parseFrom(data);
      }

      public static S2C_EastWarTasks_15654 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_15654)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EastWarTasks_15654 parseFrom(InputStream input) throws IOException {
         return (S2C_EastWarTasks_15654)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EastWarTasks_15654 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EastWarTasks_15654)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EastWarTasks_15654 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EastWarTasks_15654)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EastWarTasks_15654 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EastWarTasks_15654)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EastWarTasks_15654 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EastWarTasks_15654)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EastWarTasks_15654 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EastWarTasks_15654)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EastWarTasks_15654 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EastWarTasks_15654 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EastWarTasks_15654> parser() {
         return PARSER;
      }

      public Parser<S2C_EastWarTasks_15654> getParserForType() {
         return PARSER;
      }

      public S2C_EastWarTasks_15654 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EastWarTasks_15654OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_EastWarTasks_15654_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_EastWarTasks_15654_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EastWarTasks_15654.class, Builder.class);
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
            if (EastWarMsg.S2C_EastWarTasks_15654.alwaysUseFieldBuilders) {
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
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_EastWarTasks_15654_descriptor;
         }

         public S2C_EastWarTasks_15654 getDefaultInstanceForType() {
            return EastWarMsg.S2C_EastWarTasks_15654.getDefaultInstance();
         }

         public S2C_EastWarTasks_15654 build() {
            S2C_EastWarTasks_15654 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EastWarTasks_15654 buildPartial() {
            S2C_EastWarTasks_15654 result = new S2C_EastWarTasks_15654(this);
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
            if (other instanceof S2C_EastWarTasks_15654) {
               return this.mergeFrom((S2C_EastWarTasks_15654)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EastWarTasks_15654 other) {
            if (other == EastWarMsg.S2C_EastWarTasks_15654.getDefaultInstance()) {
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
                     this.taskBuilder_ = EastWarMsg.S2C_EastWarTasks_15654.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_EastWarTasks_15654 parsedMessage = null;

            try {
               parsedMessage = (S2C_EastWarTasks_15654)EastWarMsg.S2C_EastWarTasks_15654.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EastWarTasks_15654)e.getUnfinishedMessage();
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

   public static final class S2C_UpdateTasks_15656 extends GeneratedMessageV3 implements S2C_UpdateTasks_15656OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateTasks_15656 DEFAULT_INSTANCE = new S2C_UpdateTasks_15656();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateTasks_15656> PARSER = new AbstractParser<S2C_UpdateTasks_15656>() {
         public S2C_UpdateTasks_15656 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateTasks_15656(input, extensionRegistry);
         }
      };

      private S2C_UpdateTasks_15656(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateTasks_15656() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateTasks_15656();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateTasks_15656(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_UpdateTasks_15656_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_UpdateTasks_15656_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTasks_15656.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UpdateTasks_15656)) {
            return super.equals(obj);
         } else {
            S2C_UpdateTasks_15656 other = (S2C_UpdateTasks_15656)obj;
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

      public static S2C_UpdateTasks_15656 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_15656)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_15656 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_15656)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_15656 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_15656)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_15656 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_15656)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_15656 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_15656)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_15656 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_15656)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_15656 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateTasks_15656)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_15656 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_15656)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTasks_15656 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateTasks_15656)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_15656 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_15656)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTasks_15656 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateTasks_15656)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_15656 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_15656)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateTasks_15656 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateTasks_15656 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateTasks_15656> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateTasks_15656> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateTasks_15656 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateTasks_15656OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_UpdateTasks_15656_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_UpdateTasks_15656_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTasks_15656.class, Builder.class);
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
            if (EastWarMsg.S2C_UpdateTasks_15656.alwaysUseFieldBuilders) {
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
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_UpdateTasks_15656_descriptor;
         }

         public S2C_UpdateTasks_15656 getDefaultInstanceForType() {
            return EastWarMsg.S2C_UpdateTasks_15656.getDefaultInstance();
         }

         public S2C_UpdateTasks_15656 build() {
            S2C_UpdateTasks_15656 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateTasks_15656 buildPartial() {
            S2C_UpdateTasks_15656 result = new S2C_UpdateTasks_15656(this);
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
            if (other instanceof S2C_UpdateTasks_15656) {
               return this.mergeFrom((S2C_UpdateTasks_15656)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateTasks_15656 other) {
            if (other == EastWarMsg.S2C_UpdateTasks_15656.getDefaultInstance()) {
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
                     this.taskBuilder_ = EastWarMsg.S2C_UpdateTasks_15656.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_UpdateTasks_15656 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateTasks_15656)EastWarMsg.S2C_UpdateTasks_15656.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateTasks_15656)e.getUnfinishedMessage();
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

   public static final class C2S_LaborOpenServerRank_15657 extends GeneratedMessageV3 implements C2S_LaborOpenServerRank_15657OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LaborOpenServerRank_15657 DEFAULT_INSTANCE = new C2S_LaborOpenServerRank_15657();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LaborOpenServerRank_15657> PARSER = new AbstractParser<C2S_LaborOpenServerRank_15657>() {
         public C2S_LaborOpenServerRank_15657 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LaborOpenServerRank_15657(input, extensionRegistry);
         }
      };

      private C2S_LaborOpenServerRank_15657(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LaborOpenServerRank_15657() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LaborOpenServerRank_15657();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LaborOpenServerRank_15657(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_LaborOpenServerRank_15657_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_LaborOpenServerRank_15657_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LaborOpenServerRank_15657.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LaborOpenServerRank_15657)) {
            return super.equals(obj);
         } else {
            C2S_LaborOpenServerRank_15657 other = (C2S_LaborOpenServerRank_15657)obj;
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

      public static C2S_LaborOpenServerRank_15657 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_15657)PARSER.parseFrom(data);
      }

      public static C2S_LaborOpenServerRank_15657 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_15657)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_15657 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_15657)PARSER.parseFrom(data);
      }

      public static C2S_LaborOpenServerRank_15657 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_15657)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_15657 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_15657)PARSER.parseFrom(data);
      }

      public static C2S_LaborOpenServerRank_15657 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_15657)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_15657 parseFrom(InputStream input) throws IOException {
         return (C2S_LaborOpenServerRank_15657)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LaborOpenServerRank_15657 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LaborOpenServerRank_15657)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_15657 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LaborOpenServerRank_15657)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LaborOpenServerRank_15657 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LaborOpenServerRank_15657)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_15657 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LaborOpenServerRank_15657)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LaborOpenServerRank_15657 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LaborOpenServerRank_15657)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LaborOpenServerRank_15657 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LaborOpenServerRank_15657 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LaborOpenServerRank_15657> parser() {
         return PARSER;
      }

      public Parser<C2S_LaborOpenServerRank_15657> getParserForType() {
         return PARSER;
      }

      public C2S_LaborOpenServerRank_15657 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LaborOpenServerRank_15657OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_LaborOpenServerRank_15657_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_LaborOpenServerRank_15657_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LaborOpenServerRank_15657.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_LaborOpenServerRank_15657.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_LaborOpenServerRank_15657_descriptor;
         }

         public C2S_LaborOpenServerRank_15657 getDefaultInstanceForType() {
            return EastWarMsg.C2S_LaborOpenServerRank_15657.getDefaultInstance();
         }

         public C2S_LaborOpenServerRank_15657 build() {
            C2S_LaborOpenServerRank_15657 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LaborOpenServerRank_15657 buildPartial() {
            C2S_LaborOpenServerRank_15657 result = new C2S_LaborOpenServerRank_15657(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LaborOpenServerRank_15657) {
               return this.mergeFrom((C2S_LaborOpenServerRank_15657)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LaborOpenServerRank_15657 other) {
            if (other == EastWarMsg.C2S_LaborOpenServerRank_15657.getDefaultInstance()) {
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
            C2S_LaborOpenServerRank_15657 parsedMessage = null;

            try {
               parsedMessage = (C2S_LaborOpenServerRank_15657)EastWarMsg.C2S_LaborOpenServerRank_15657.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LaborOpenServerRank_15657)e.getUnfinishedMessage();
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

   public static final class S2C_LaborOpenServerRank_15658 extends GeneratedMessageV3 implements S2C_LaborOpenServerRank_15658OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int TIME_FIELD_NUMBER = 3;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2C_LaborOpenServerRank_15658 DEFAULT_INSTANCE = new S2C_LaborOpenServerRank_15658();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LaborOpenServerRank_15658> PARSER = new AbstractParser<S2C_LaborOpenServerRank_15658>() {
         public S2C_LaborOpenServerRank_15658 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LaborOpenServerRank_15658(input, extensionRegistry);
         }
      };

      private S2C_LaborOpenServerRank_15658(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LaborOpenServerRank_15658() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LaborOpenServerRank_15658();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LaborOpenServerRank_15658(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 24:
                        this.bitField0_ |= 2;
                        this.time_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_LaborOpenServerRank_15658_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_LaborOpenServerRank_15658_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LaborOpenServerRank_15658.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTime() {
         return this.time_;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.time_);
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
               size += CodedOutputStream.computeInt32Size(3, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LaborOpenServerRank_15658)) {
            return super.equals(obj);
         } else {
            S2C_LaborOpenServerRank_15658 other = (S2C_LaborOpenServerRank_15658)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
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

            if (this.hasTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LaborOpenServerRank_15658 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_15658)PARSER.parseFrom(data);
      }

      public static S2C_LaborOpenServerRank_15658 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_15658)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_15658 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_15658)PARSER.parseFrom(data);
      }

      public static S2C_LaborOpenServerRank_15658 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_15658)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_15658 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_15658)PARSER.parseFrom(data);
      }

      public static S2C_LaborOpenServerRank_15658 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_15658)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_15658 parseFrom(InputStream input) throws IOException {
         return (S2C_LaborOpenServerRank_15658)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LaborOpenServerRank_15658 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LaborOpenServerRank_15658)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_15658 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LaborOpenServerRank_15658)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LaborOpenServerRank_15658 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LaborOpenServerRank_15658)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_15658 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LaborOpenServerRank_15658)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LaborOpenServerRank_15658 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LaborOpenServerRank_15658)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LaborOpenServerRank_15658 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LaborOpenServerRank_15658 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LaborOpenServerRank_15658> parser() {
         return PARSER;
      }

      public Parser<S2C_LaborOpenServerRank_15658> getParserForType() {
         return PARSER;
      }

      public S2C_LaborOpenServerRank_15658 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LaborOpenServerRank_15658OrBuilder {
         private int bitField0_;
         private int type_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_LaborOpenServerRank_15658_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_LaborOpenServerRank_15658_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LaborOpenServerRank_15658.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_LaborOpenServerRank_15658.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.time_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_LaborOpenServerRank_15658_descriptor;
         }

         public S2C_LaborOpenServerRank_15658 getDefaultInstanceForType() {
            return EastWarMsg.S2C_LaborOpenServerRank_15658.getDefaultInstance();
         }

         public S2C_LaborOpenServerRank_15658 build() {
            S2C_LaborOpenServerRank_15658 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LaborOpenServerRank_15658 buildPartial() {
            S2C_LaborOpenServerRank_15658 result = new S2C_LaborOpenServerRank_15658(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof S2C_LaborOpenServerRank_15658) {
               return this.mergeFrom((S2C_LaborOpenServerRank_15658)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LaborOpenServerRank_15658 other) {
            if (other == EastWarMsg.S2C_LaborOpenServerRank_15658.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
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
            S2C_LaborOpenServerRank_15658 parsedMessage = null;

            try {
               parsedMessage = (S2C_LaborOpenServerRank_15658)EastWarMsg.S2C_LaborOpenServerRank_15658.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LaborOpenServerRank_15658)e.getUnfinishedMessage();
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

         public boolean hasTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 2;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -3;
            this.time_ = 0;
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

   public static final class C2S_OpenServerRank_15659 extends GeneratedMessageV3 implements C2S_OpenServerRank_15659OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenServerRank_15659 DEFAULT_INSTANCE = new C2S_OpenServerRank_15659();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenServerRank_15659> PARSER = new AbstractParser<C2S_OpenServerRank_15659>() {
         public C2S_OpenServerRank_15659 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenServerRank_15659(input, extensionRegistry);
         }
      };

      private C2S_OpenServerRank_15659(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenServerRank_15659() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenServerRank_15659();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenServerRank_15659(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OpenServerRank_15659_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OpenServerRank_15659_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenServerRank_15659.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenServerRank_15659)) {
            return super.equals(obj);
         } else {
            C2S_OpenServerRank_15659 other = (C2S_OpenServerRank_15659)obj;
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

      public static C2S_OpenServerRank_15659 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_15659)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_15659 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_15659)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_15659 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_15659)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_15659 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_15659)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_15659 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_15659)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_15659 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_15659)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_15659 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenServerRank_15659)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_15659 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_15659)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenServerRank_15659 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenServerRank_15659)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_15659 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_15659)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenServerRank_15659 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenServerRank_15659)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_15659 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_15659)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenServerRank_15659 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenServerRank_15659 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenServerRank_15659> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenServerRank_15659> getParserForType() {
         return PARSER;
      }

      public C2S_OpenServerRank_15659 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenServerRank_15659OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OpenServerRank_15659_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OpenServerRank_15659_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenServerRank_15659.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.C2S_OpenServerRank_15659.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_C2S_OpenServerRank_15659_descriptor;
         }

         public C2S_OpenServerRank_15659 getDefaultInstanceForType() {
            return EastWarMsg.C2S_OpenServerRank_15659.getDefaultInstance();
         }

         public C2S_OpenServerRank_15659 build() {
            C2S_OpenServerRank_15659 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenServerRank_15659 buildPartial() {
            C2S_OpenServerRank_15659 result = new C2S_OpenServerRank_15659(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenServerRank_15659) {
               return this.mergeFrom((C2S_OpenServerRank_15659)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenServerRank_15659 other) {
            if (other == EastWarMsg.C2S_OpenServerRank_15659.getDefaultInstance()) {
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
            C2S_OpenServerRank_15659 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenServerRank_15659)EastWarMsg.C2S_OpenServerRank_15659.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenServerRank_15659)e.getUnfinishedMessage();
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

   public static final class S2C_OpenServerRank_15660 extends GeneratedMessageV3 implements S2C_OpenServerRank_15660OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int TIME_FIELD_NUMBER = 3;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenServerRank_15660 DEFAULT_INSTANCE = new S2C_OpenServerRank_15660();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenServerRank_15660> PARSER = new AbstractParser<S2C_OpenServerRank_15660>() {
         public S2C_OpenServerRank_15660 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenServerRank_15660(input, extensionRegistry);
         }
      };

      private S2C_OpenServerRank_15660(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenServerRank_15660() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenServerRank_15660();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenServerRank_15660(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 24:
                        this.bitField0_ |= 2;
                        this.time_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OpenServerRank_15660_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OpenServerRank_15660_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenServerRank_15660.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTime() {
         return this.time_;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.time_);
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
               size += CodedOutputStream.computeInt32Size(3, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenServerRank_15660)) {
            return super.equals(obj);
         } else {
            S2C_OpenServerRank_15660 other = (S2C_OpenServerRank_15660)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
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

            if (this.hasTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenServerRank_15660 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_15660)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_15660 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_15660)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_15660 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_15660)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_15660 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_15660)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_15660 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_15660)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_15660 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_15660)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_15660 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenServerRank_15660)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_15660 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_15660)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenServerRank_15660 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenServerRank_15660)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_15660 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_15660)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenServerRank_15660 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenServerRank_15660)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_15660 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_15660)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenServerRank_15660 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenServerRank_15660 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenServerRank_15660> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenServerRank_15660> getParserForType() {
         return PARSER;
      }

      public S2C_OpenServerRank_15660 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenServerRank_15660OrBuilder {
         private int bitField0_;
         private int type_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OpenServerRank_15660_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OpenServerRank_15660_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenServerRank_15660.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarMsg.S2C_OpenServerRank_15660.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.time_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarMsg.internal_static_eastWar_com_gzbz_protobuf_S2C_OpenServerRank_15660_descriptor;
         }

         public S2C_OpenServerRank_15660 getDefaultInstanceForType() {
            return EastWarMsg.S2C_OpenServerRank_15660.getDefaultInstance();
         }

         public S2C_OpenServerRank_15660 build() {
            S2C_OpenServerRank_15660 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenServerRank_15660 buildPartial() {
            S2C_OpenServerRank_15660 result = new S2C_OpenServerRank_15660(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof S2C_OpenServerRank_15660) {
               return this.mergeFrom((S2C_OpenServerRank_15660)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenServerRank_15660 other) {
            if (other == EastWarMsg.S2C_OpenServerRank_15660.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
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
            S2C_OpenServerRank_15660 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenServerRank_15660)EastWarMsg.S2C_OpenServerRank_15660.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenServerRank_15660)e.getUnfinishedMessage();
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

         public boolean hasTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 2;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -3;
            this.time_ = 0;
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

   public interface C2S_Appointment_15621OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CoincidenceBox_15627OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Coincidence_15625OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CommitTask_15651OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_CumulativeId_15629OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawKey_15623OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Drink_15645OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_EastWarTasks_15653OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FreeDrinkNum_15647OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LaborOpenServerRank_15657OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_MakeWine_15641OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_OpenServerRank_15659OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenUi_15601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OptionalGiftChoice_15613OrBuilder extends MessageOrBuilder {
      boolean hasCustomId();

      int getCustomId();

      List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList();

      ActivityMsg.CustomGiftBuyItemData getBuyData(int index);

      int getBuyDataCount();

      List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList();

      ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index);
   }

   public interface C2S_OptionalGift_15611OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TakePlumReward_15643OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Appointment_15622OrBuilder extends MessageOrBuilder {
      List<Integer> getHadGetKeyList();

      int getHadGetKeyCount();

      int getHadGetKey(int index);

      boolean hasTotalId();

      int getTotalId();

      boolean hasHadGetId();

      int getHadGetId();

      List<Integer> getBoxsList();

      int getBoxsCount();

      int getBoxs(int index);

      boolean hasCurDay();

      int getCurDay();
   }

   public interface S2C_CoincidenceBox_15628OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_Coincidence_15626OrBuilder extends MessageOrBuilder {
      boolean hasHadGetId();

      int getHadGetId();
   }

   public interface S2C_CommitTask_15652OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_CumulativeId_15630OrBuilder extends MessageOrBuilder {
      boolean hasTotalId();

      int getTotalId();
   }

   public interface S2C_DrawKey_15624OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_Drink_15646OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasFreeNum();

      int getFreeNum();
   }

   public interface S2C_EastWarTasks_15654OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_FreeDrinkNum_15648OrBuilder extends MessageOrBuilder {
      boolean hasFreeNum();

      int getFreeNum();

      boolean hasTotalWineNum();

      int getTotalWineNum();

      boolean hasIsTaked();

      boolean getIsTaked();
   }

   public interface S2C_LaborOpenServerRank_15658OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_MakeWine_15642OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTotalWineNum();

      int getTotalWineNum();
   }

   public interface S2C_OpenServerRank_15660OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_OpenUiResult_15602OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();
   }

   public interface S2C_OptionalGiftBuy_15616OrBuilder extends MessageOrBuilder {
      boolean hasGiftData();

      ActivityMsg.CustomGiftData getGiftData();

      ActivityMsg.CustomGiftDataOrBuilder getGiftDataOrBuilder();
   }

   public interface S2C_OptionalGiftChoice_15614OrBuilder extends MessageOrBuilder {
      boolean hasGiftData();

      ActivityMsg.CustomGiftData getGiftData();

      ActivityMsg.CustomGiftDataOrBuilder getGiftDataOrBuilder();
   }

   public interface S2C_OptionalGift_15612OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.CustomGiftData> getGiftListList();

      ActivityMsg.CustomGiftData getGiftList(int index);

      int getGiftListCount();

      List<? extends ActivityMsg.CustomGiftDataOrBuilder> getGiftListOrBuilderList();

      ActivityMsg.CustomGiftDataOrBuilder getGiftListOrBuilder(int index);
   }

   public interface S2C_TakePlumReward_15644OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_UpdateTasks_15656OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }
}
