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

public final class EastWarRotateMsg {
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenUi_16201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenUi_16201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenUiResult_16202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenUiResult_16202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGift_16211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGift_16211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGift_16212_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGift_16212_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGiftChoice_16213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGiftChoice_16213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftChoice_16214_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftChoice_16214_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftBuy_16216_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftBuy_16216_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Appointment_16221_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Appointment_16221_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Appointment_16222_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Appointment_16222_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_DrawKey_16223_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_DrawKey_16223_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_DrawKey_16224_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_DrawKey_16224_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Coincidence_16225_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Coincidence_16225_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Coincidence_16226_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Coincidence_16226_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CoincidenceBox_16227_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CoincidenceBox_16227_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CoincidenceBox_16228_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CoincidenceBox_16228_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CumulativeId_16229_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CumulativeId_16229_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CumulativeId_16230_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CumulativeId_16230_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_MakeWine_16241_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_MakeWine_16241_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_MakeWine_16242_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_MakeWine_16242_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_TakePlumReward_16243_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_TakePlumReward_16243_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_TakePlumReward_16244_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_TakePlumReward_16244_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Drink_16245_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Drink_16245_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Drink_16246_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Drink_16246_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_FreeDrinkNum_16247_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_FreeDrinkNum_16247_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_FreeDrinkNum_16248_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_FreeDrinkNum_16248_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CommitTask_16251_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CommitTask_16251_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CommitTask_16252_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CommitTask_16252_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_EastWarTasks_16253_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_EastWarTasks_16253_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_EastWarTasks_16254_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_EastWarTasks_16254_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_UpdateTasks_16256_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_UpdateTasks_16256_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_LaborOpenServerRank_16257_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_LaborOpenServerRank_16257_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_LaborOpenServerRank_16258_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_LaborOpenServerRank_16258_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenServerRank_16259_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenServerRank_16259_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenServerRank_16260_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenServerRank_16260_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private EastWarRotateMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013EastWarRotate.proto\u0012\u001feastWarRotate.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"\u0012\n\u0010C2S_OpenUi_16201\"<\n\u0016S2C_OpenUiResult_16202\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_OptionalGift_16211\"V\n\u0016S2C_OptionalGift_16212\u0012<\n\bgiftList\u0018\u0001 \u0003(\u000b2*.activity.com.gzbz.protobuf.CustomGiftData\"t\n\u001cC2S_OptionalGiftChoice_16213\u0012\u0010\n\bcustomId\u0018\u0001 \u0002(\u0005\u0012B\n\u0007buyData\u0018\u0002 \u0003(\u000b21.activity.com.gzbz.protobuf.CustomGiftBuyItemData\"\\\n\u001cS2C_OptionalGiftChoice_16214\u0012<\n\bgiftData\u0018\u0001 \u0002(\u000b2*.activity.com.gzbz.protobuf.CustomGiftData\"Y\n\u0019S2C_OptionalGiftBuy_16216\u0012<\n\bgiftData\u0018\u0001 \u0002(\u000b2*.activity.com.gzbz.protobuf.CustomGiftData\"\u0017\n\u0015C2S_Appointment_16221\"k\n\u0015S2C_Appointment_16222\u0012\u0011\n\thadGetKey\u0018\u0001 \u0003(\u0005\u0012\u000f\n\u0007totalId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bhadGetId\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004boxs\u0018\u0004 \u0003(\u0005\u0012\u000e\n\u0006curDay\u0018\u0005 \u0002(\u0005\"\u001f\n\u0011C2S_DrawKey_16223\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u001f\n\u0011S2C_DrawKey_16224\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0017\n\u0015C2S_Coincidence_16225\")\n\u0015S2C_Coincidence_16226\u0012\u0010\n\bhadGetId\u0018\u0001 \u0002(\u0005\"&\n\u0018C2S_CoincidenceBox_16227\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"&\n\u0018S2C_CoincidenceBox_16228\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_CumulativeId_16229\")\n\u0016S2C_CumulativeId_16230\u0012\u000f\n\u0007totalId\u0018\u0001 \u0002(\u0005\"!\n\u0012C2S_MakeWine_16241\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\":\n\u0012S2C_MakeWine_16242\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0014\n\ftotalWineNum\u0018\u0002 \u0002(\u0005\"\u001a\n\u0018C2S_TakePlumReward_16243\"*\n\u0018S2C_TakePlumReward_16244\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u0011\n\u000fC2S_Drink_16245\"2\n\u000fS2C_Drink_16246\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007freeNum\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_FreeDrinkNum_16247\"P\n\u0016S2C_FreeDrinkNum_16248\u0012\u000f\n\u0007freeNum\u0018\u0001 \u0002(\u0005\u0012\u0014\n\ftotalWineNum\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007isTaked\u0018\u0003 \u0002(\b\"&\n\u0014C2S_CommitTask_16251\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_CommitTask_16252\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_EastWarTasks_16253\"4\n\u0016S2C_EastWarTasks_16254\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"3\n\u0015S2C_UpdateTasks_16256\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"\u001f\n\u001dC2S_LaborOpenServerRank_16257\";\n\u001dS2C_LaborOpenServerRank_16258\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004time\u0018\u0003 \u0001(\u0005\"\u001a\n\u0018C2S_OpenServerRank_16259\"6\n\u0018S2C_OpenServerRank_16260\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004time\u0018\u0003 \u0001(\u0005B'\n\u0011com.gzbz.protobufB\u0010EastWarRotateMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenUi_16201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenUi_16201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenUi_16201_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenUiResult_16202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenUiResult_16202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenUiResult_16202_descriptor, new String[]{"StartTime", "EndTime"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGift_16211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGift_16211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGift_16211_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGift_16212_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGift_16212_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGift_16212_descriptor, new String[]{"GiftList"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGiftChoice_16213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGiftChoice_16213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGiftChoice_16213_descriptor, new String[]{"CustomId", "BuyData"});
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftChoice_16214_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftChoice_16214_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftChoice_16214_descriptor, new String[]{"GiftData"});
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftBuy_16216_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftBuy_16216_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftBuy_16216_descriptor, new String[]{"GiftData"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Appointment_16221_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Appointment_16221_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Appointment_16221_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Appointment_16222_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Appointment_16222_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Appointment_16222_descriptor, new String[]{"HadGetKey", "TotalId", "HadGetId", "Boxs", "CurDay"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_DrawKey_16223_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_DrawKey_16223_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_DrawKey_16223_descriptor, new String[]{"Id"});
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_DrawKey_16224_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_DrawKey_16224_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_DrawKey_16224_descriptor, new String[]{"Id"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Coincidence_16225_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Coincidence_16225_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Coincidence_16225_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Coincidence_16226_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Coincidence_16226_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Coincidence_16226_descriptor, new String[]{"HadGetId"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CoincidenceBox_16227_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CoincidenceBox_16227_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CoincidenceBox_16227_descriptor, new String[]{"Id"});
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CoincidenceBox_16228_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CoincidenceBox_16228_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CoincidenceBox_16228_descriptor, new String[]{"Id"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CumulativeId_16229_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CumulativeId_16229_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CumulativeId_16229_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CumulativeId_16230_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CumulativeId_16230_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CumulativeId_16230_descriptor, new String[]{"TotalId"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_MakeWine_16241_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_MakeWine_16241_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_MakeWine_16241_descriptor, new String[]{"Num"});
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_MakeWine_16242_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_MakeWine_16242_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_MakeWine_16242_descriptor, new String[]{"Result", "TotalWineNum"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_TakePlumReward_16243_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_TakePlumReward_16243_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_TakePlumReward_16243_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_TakePlumReward_16244_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_TakePlumReward_16244_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_TakePlumReward_16244_descriptor, new String[]{"Result"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Drink_16245_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Drink_16245_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Drink_16245_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Drink_16246_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Drink_16246_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Drink_16246_descriptor, new String[]{"Result", "FreeNum"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_FreeDrinkNum_16247_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_FreeDrinkNum_16247_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_FreeDrinkNum_16247_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_FreeDrinkNum_16248_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_FreeDrinkNum_16248_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_FreeDrinkNum_16248_descriptor, new String[]{"FreeNum", "TotalWineNum", "IsTaked"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CommitTask_16251_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CommitTask_16251_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CommitTask_16251_descriptor, new String[]{"TaskId"});
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CommitTask_16252_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CommitTask_16252_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CommitTask_16252_descriptor, new String[]{"TaskId"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_EastWarTasks_16253_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_EastWarTasks_16253_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_EastWarTasks_16253_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_EastWarTasks_16254_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_EastWarTasks_16254_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_EastWarTasks_16254_descriptor, new String[]{"Task"});
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_UpdateTasks_16256_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_UpdateTasks_16256_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_UpdateTasks_16256_descriptor, new String[]{"Task"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_LaborOpenServerRank_16257_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_LaborOpenServerRank_16257_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_LaborOpenServerRank_16257_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_LaborOpenServerRank_16258_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_LaborOpenServerRank_16258_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_LaborOpenServerRank_16258_descriptor, new String[]{"Type", "Time"});
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenServerRank_16259_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenServerRank_16259_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenServerRank_16259_descriptor, new String[0]);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenServerRank_16260_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenServerRank_16260_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenServerRank_16260_descriptor, new String[]{"Type", "Time"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_OpenUi_16201 extends GeneratedMessageV3 implements C2S_OpenUi_16201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenUi_16201 DEFAULT_INSTANCE = new C2S_OpenUi_16201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenUi_16201> PARSER = new AbstractParser<C2S_OpenUi_16201>() {
         public C2S_OpenUi_16201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenUi_16201(input, extensionRegistry);
         }
      };

      private C2S_OpenUi_16201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenUi_16201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenUi_16201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenUi_16201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenUi_16201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenUi_16201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_16201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenUi_16201)) {
            return super.equals(obj);
         } else {
            C2S_OpenUi_16201 other = (C2S_OpenUi_16201)obj;
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

      public static C2S_OpenUi_16201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_16201)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_16201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_16201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_16201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_16201)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_16201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_16201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_16201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_16201)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_16201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_16201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_16201 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_16201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_16201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_16201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_16201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_16201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_16201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_16201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_16201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenUi_16201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_16201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_16201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenUi_16201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenUi_16201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenUi_16201> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenUi_16201> getParserForType() {
         return PARSER;
      }

      public C2S_OpenUi_16201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenUi_16201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenUi_16201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenUi_16201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_16201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_OpenUi_16201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenUi_16201_descriptor;
         }

         public C2S_OpenUi_16201 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_OpenUi_16201.getDefaultInstance();
         }

         public C2S_OpenUi_16201 build() {
            C2S_OpenUi_16201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenUi_16201 buildPartial() {
            C2S_OpenUi_16201 result = new C2S_OpenUi_16201(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenUi_16201) {
               return this.mergeFrom((C2S_OpenUi_16201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenUi_16201 other) {
            if (other == EastWarRotateMsg.C2S_OpenUi_16201.getDefaultInstance()) {
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
            C2S_OpenUi_16201 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenUi_16201)EastWarRotateMsg.C2S_OpenUi_16201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenUi_16201)e.getUnfinishedMessage();
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

   public static final class S2C_OpenUiResult_16202 extends GeneratedMessageV3 implements S2C_OpenUiResult_16202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenUiResult_16202 DEFAULT_INSTANCE = new S2C_OpenUiResult_16202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenUiResult_16202> PARSER = new AbstractParser<S2C_OpenUiResult_16202>() {
         public S2C_OpenUiResult_16202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenUiResult_16202(input, extensionRegistry);
         }
      };

      private S2C_OpenUiResult_16202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenUiResult_16202() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenUiResult_16202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenUiResult_16202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenUiResult_16202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenUiResult_16202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_16202.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenUiResult_16202)) {
            return super.equals(obj);
         } else {
            S2C_OpenUiResult_16202 other = (S2C_OpenUiResult_16202)obj;
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

      public static S2C_OpenUiResult_16202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_16202)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_16202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_16202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_16202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_16202)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_16202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_16202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_16202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_16202)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_16202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_16202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_16202 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_16202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_16202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_16202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_16202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_16202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_16202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_16202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_16202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenUiResult_16202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_16202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_16202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenUiResult_16202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenUiResult_16202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenUiResult_16202> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenUiResult_16202> getParserForType() {
         return PARSER;
      }

      public S2C_OpenUiResult_16202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenUiResult_16202OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenUiResult_16202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenUiResult_16202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_16202.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_OpenUiResult_16202.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenUiResult_16202_descriptor;
         }

         public S2C_OpenUiResult_16202 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_OpenUiResult_16202.getDefaultInstance();
         }

         public S2C_OpenUiResult_16202 build() {
            S2C_OpenUiResult_16202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenUiResult_16202 buildPartial() {
            S2C_OpenUiResult_16202 result = new S2C_OpenUiResult_16202(this);
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
            if (other instanceof S2C_OpenUiResult_16202) {
               return this.mergeFrom((S2C_OpenUiResult_16202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenUiResult_16202 other) {
            if (other == EastWarRotateMsg.S2C_OpenUiResult_16202.getDefaultInstance()) {
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
            S2C_OpenUiResult_16202 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenUiResult_16202)EastWarRotateMsg.S2C_OpenUiResult_16202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenUiResult_16202)e.getUnfinishedMessage();
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

   public static final class C2S_OptionalGift_16211 extends GeneratedMessageV3 implements C2S_OptionalGift_16211OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OptionalGift_16211 DEFAULT_INSTANCE = new C2S_OptionalGift_16211();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OptionalGift_16211> PARSER = new AbstractParser<C2S_OptionalGift_16211>() {
         public C2S_OptionalGift_16211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OptionalGift_16211(input, extensionRegistry);
         }
      };

      private C2S_OptionalGift_16211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OptionalGift_16211() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OptionalGift_16211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OptionalGift_16211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGift_16211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGift_16211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGift_16211.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OptionalGift_16211)) {
            return super.equals(obj);
         } else {
            C2S_OptionalGift_16211 other = (C2S_OptionalGift_16211)obj;
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

      public static C2S_OptionalGift_16211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_16211)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGift_16211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_16211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGift_16211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_16211)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGift_16211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_16211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGift_16211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_16211)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGift_16211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_16211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGift_16211 parseFrom(InputStream input) throws IOException {
         return (C2S_OptionalGift_16211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGift_16211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGift_16211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGift_16211 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OptionalGift_16211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OptionalGift_16211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGift_16211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGift_16211 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OptionalGift_16211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGift_16211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGift_16211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OptionalGift_16211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OptionalGift_16211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OptionalGift_16211> parser() {
         return PARSER;
      }

      public Parser<C2S_OptionalGift_16211> getParserForType() {
         return PARSER;
      }

      public C2S_OptionalGift_16211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OptionalGift_16211OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGift_16211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGift_16211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGift_16211.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_OptionalGift_16211.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGift_16211_descriptor;
         }

         public C2S_OptionalGift_16211 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_OptionalGift_16211.getDefaultInstance();
         }

         public C2S_OptionalGift_16211 build() {
            C2S_OptionalGift_16211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OptionalGift_16211 buildPartial() {
            C2S_OptionalGift_16211 result = new C2S_OptionalGift_16211(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OptionalGift_16211) {
               return this.mergeFrom((C2S_OptionalGift_16211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OptionalGift_16211 other) {
            if (other == EastWarRotateMsg.C2S_OptionalGift_16211.getDefaultInstance()) {
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
            C2S_OptionalGift_16211 parsedMessage = null;

            try {
               parsedMessage = (C2S_OptionalGift_16211)EastWarRotateMsg.C2S_OptionalGift_16211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OptionalGift_16211)e.getUnfinishedMessage();
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

   public static final class S2C_OptionalGift_16212 extends GeneratedMessageV3 implements S2C_OptionalGift_16212OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GIFTLIST_FIELD_NUMBER = 1;
      private List<ActivityMsg.CustomGiftData> giftList_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionalGift_16212 DEFAULT_INSTANCE = new S2C_OptionalGift_16212();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionalGift_16212> PARSER = new AbstractParser<S2C_OptionalGift_16212>() {
         public S2C_OptionalGift_16212 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionalGift_16212(input, extensionRegistry);
         }
      };

      private S2C_OptionalGift_16212(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionalGift_16212() {
         this.memoizedIsInitialized = -1;
         this.giftList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionalGift_16212();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionalGift_16212(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGift_16212_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGift_16212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGift_16212.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OptionalGift_16212)) {
            return super.equals(obj);
         } else {
            S2C_OptionalGift_16212 other = (S2C_OptionalGift_16212)obj;
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

      public static S2C_OptionalGift_16212 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_16212)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGift_16212 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_16212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGift_16212 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_16212)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGift_16212 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_16212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGift_16212 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_16212)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGift_16212 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_16212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGift_16212 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionalGift_16212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGift_16212 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGift_16212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGift_16212 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionalGift_16212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionalGift_16212 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGift_16212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGift_16212 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionalGift_16212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGift_16212 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGift_16212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionalGift_16212 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionalGift_16212 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionalGift_16212> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionalGift_16212> getParserForType() {
         return PARSER;
      }

      public S2C_OptionalGift_16212 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionalGift_16212OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.CustomGiftData> giftList_;
         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> giftListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGift_16212_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGift_16212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGift_16212.class, Builder.class);
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
            if (EastWarRotateMsg.S2C_OptionalGift_16212.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGift_16212_descriptor;
         }

         public S2C_OptionalGift_16212 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_OptionalGift_16212.getDefaultInstance();
         }

         public S2C_OptionalGift_16212 build() {
            S2C_OptionalGift_16212 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionalGift_16212 buildPartial() {
            S2C_OptionalGift_16212 result = new S2C_OptionalGift_16212(this);
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
            if (other instanceof S2C_OptionalGift_16212) {
               return this.mergeFrom((S2C_OptionalGift_16212)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionalGift_16212 other) {
            if (other == EastWarRotateMsg.S2C_OptionalGift_16212.getDefaultInstance()) {
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
                     this.giftListBuilder_ = EastWarRotateMsg.S2C_OptionalGift_16212.alwaysUseFieldBuilders ? this.getGiftListFieldBuilder() : null;
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
            S2C_OptionalGift_16212 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionalGift_16212)EastWarRotateMsg.S2C_OptionalGift_16212.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionalGift_16212)e.getUnfinishedMessage();
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

   public static final class C2S_OptionalGiftChoice_16213 extends GeneratedMessageV3 implements C2S_OptionalGiftChoice_16213OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CUSTOMID_FIELD_NUMBER = 1;
      private int customId_;
      public static final int BUYDATA_FIELD_NUMBER = 2;
      private List<ActivityMsg.CustomGiftBuyItemData> buyData_;
      private byte memoizedIsInitialized;
      private static final C2S_OptionalGiftChoice_16213 DEFAULT_INSTANCE = new C2S_OptionalGiftChoice_16213();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OptionalGiftChoice_16213> PARSER = new AbstractParser<C2S_OptionalGiftChoice_16213>() {
         public C2S_OptionalGiftChoice_16213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OptionalGiftChoice_16213(input, extensionRegistry);
         }
      };

      private C2S_OptionalGiftChoice_16213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OptionalGiftChoice_16213() {
         this.memoizedIsInitialized = -1;
         this.buyData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OptionalGiftChoice_16213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OptionalGiftChoice_16213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGiftChoice_16213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGiftChoice_16213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGiftChoice_16213.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OptionalGiftChoice_16213)) {
            return super.equals(obj);
         } else {
            C2S_OptionalGiftChoice_16213 other = (C2S_OptionalGiftChoice_16213)obj;
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

      public static C2S_OptionalGiftChoice_16213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_16213)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftChoice_16213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_16213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_16213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_16213)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftChoice_16213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_16213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_16213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_16213)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftChoice_16213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_16213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_16213 parseFrom(InputStream input) throws IOException {
         return (C2S_OptionalGiftChoice_16213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftChoice_16213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftChoice_16213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_16213 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OptionalGiftChoice_16213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftChoice_16213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftChoice_16213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_16213 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OptionalGiftChoice_16213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftChoice_16213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftChoice_16213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OptionalGiftChoice_16213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OptionalGiftChoice_16213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OptionalGiftChoice_16213> parser() {
         return PARSER;
      }

      public Parser<C2S_OptionalGiftChoice_16213> getParserForType() {
         return PARSER;
      }

      public C2S_OptionalGiftChoice_16213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OptionalGiftChoice_16213OrBuilder {
         private int bitField0_;
         private int customId_;
         private List<ActivityMsg.CustomGiftBuyItemData> buyData_;
         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftBuyItemData, ActivityMsg.CustomGiftBuyItemData.Builder, ActivityMsg.CustomGiftBuyItemDataOrBuilder> buyDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGiftChoice_16213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGiftChoice_16213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGiftChoice_16213.class, Builder.class);
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
            if (EastWarRotateMsg.C2S_OptionalGiftChoice_16213.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OptionalGiftChoice_16213_descriptor;
         }

         public C2S_OptionalGiftChoice_16213 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_OptionalGiftChoice_16213.getDefaultInstance();
         }

         public C2S_OptionalGiftChoice_16213 build() {
            C2S_OptionalGiftChoice_16213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OptionalGiftChoice_16213 buildPartial() {
            C2S_OptionalGiftChoice_16213 result = new C2S_OptionalGiftChoice_16213(this);
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
            if (other instanceof C2S_OptionalGiftChoice_16213) {
               return this.mergeFrom((C2S_OptionalGiftChoice_16213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OptionalGiftChoice_16213 other) {
            if (other == EastWarRotateMsg.C2S_OptionalGiftChoice_16213.getDefaultInstance()) {
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
                     this.buyDataBuilder_ = EastWarRotateMsg.C2S_OptionalGiftChoice_16213.alwaysUseFieldBuilders ? this.getBuyDataFieldBuilder() : null;
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
            C2S_OptionalGiftChoice_16213 parsedMessage = null;

            try {
               parsedMessage = (C2S_OptionalGiftChoice_16213)EastWarRotateMsg.C2S_OptionalGiftChoice_16213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OptionalGiftChoice_16213)e.getUnfinishedMessage();
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

   public static final class S2C_OptionalGiftChoice_16214 extends GeneratedMessageV3 implements S2C_OptionalGiftChoice_16214OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTDATA_FIELD_NUMBER = 1;
      private ActivityMsg.CustomGiftData giftData_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionalGiftChoice_16214 DEFAULT_INSTANCE = new S2C_OptionalGiftChoice_16214();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionalGiftChoice_16214> PARSER = new AbstractParser<S2C_OptionalGiftChoice_16214>() {
         public S2C_OptionalGiftChoice_16214 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionalGiftChoice_16214(input, extensionRegistry);
         }
      };

      private S2C_OptionalGiftChoice_16214(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionalGiftChoice_16214() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionalGiftChoice_16214();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionalGiftChoice_16214(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftChoice_16214_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftChoice_16214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftChoice_16214.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OptionalGiftChoice_16214)) {
            return super.equals(obj);
         } else {
            S2C_OptionalGiftChoice_16214 other = (S2C_OptionalGiftChoice_16214)obj;
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

      public static S2C_OptionalGiftChoice_16214 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_16214)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftChoice_16214 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_16214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_16214 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_16214)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftChoice_16214 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_16214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_16214 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_16214)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftChoice_16214 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_16214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_16214 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftChoice_16214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftChoice_16214 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftChoice_16214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_16214 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftChoice_16214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftChoice_16214 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftChoice_16214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_16214 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionalGiftChoice_16214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftChoice_16214 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftChoice_16214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionalGiftChoice_16214 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionalGiftChoice_16214 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionalGiftChoice_16214> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionalGiftChoice_16214> getParserForType() {
         return PARSER;
      }

      public S2C_OptionalGiftChoice_16214 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionalGiftChoice_16214OrBuilder {
         private int bitField0_;
         private ActivityMsg.CustomGiftData giftData_;
         private SingleFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> giftDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftChoice_16214_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftChoice_16214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftChoice_16214.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_OptionalGiftChoice_16214.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftChoice_16214_descriptor;
         }

         public S2C_OptionalGiftChoice_16214 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_OptionalGiftChoice_16214.getDefaultInstance();
         }

         public S2C_OptionalGiftChoice_16214 build() {
            S2C_OptionalGiftChoice_16214 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionalGiftChoice_16214 buildPartial() {
            S2C_OptionalGiftChoice_16214 result = new S2C_OptionalGiftChoice_16214(this);
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
            if (other instanceof S2C_OptionalGiftChoice_16214) {
               return this.mergeFrom((S2C_OptionalGiftChoice_16214)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionalGiftChoice_16214 other) {
            if (other == EastWarRotateMsg.S2C_OptionalGiftChoice_16214.getDefaultInstance()) {
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
            S2C_OptionalGiftChoice_16214 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionalGiftChoice_16214)EastWarRotateMsg.S2C_OptionalGiftChoice_16214.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionalGiftChoice_16214)e.getUnfinishedMessage();
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

   public static final class S2C_OptionalGiftBuy_16216 extends GeneratedMessageV3 implements S2C_OptionalGiftBuy_16216OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTDATA_FIELD_NUMBER = 1;
      private ActivityMsg.CustomGiftData giftData_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionalGiftBuy_16216 DEFAULT_INSTANCE = new S2C_OptionalGiftBuy_16216();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionalGiftBuy_16216> PARSER = new AbstractParser<S2C_OptionalGiftBuy_16216>() {
         public S2C_OptionalGiftBuy_16216 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionalGiftBuy_16216(input, extensionRegistry);
         }
      };

      private S2C_OptionalGiftBuy_16216(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionalGiftBuy_16216() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionalGiftBuy_16216();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionalGiftBuy_16216(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftBuy_16216_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftBuy_16216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftBuy_16216.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OptionalGiftBuy_16216)) {
            return super.equals(obj);
         } else {
            S2C_OptionalGiftBuy_16216 other = (S2C_OptionalGiftBuy_16216)obj;
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

      public static S2C_OptionalGiftBuy_16216 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_16216)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_16216 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_16216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_16216 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_16216)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_16216 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_16216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_16216 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_16216)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_16216 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_16216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_16216 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_16216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_16216 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_16216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_16216 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_16216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_16216 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_16216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_16216 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_16216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_16216 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_16216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionalGiftBuy_16216 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionalGiftBuy_16216 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionalGiftBuy_16216> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionalGiftBuy_16216> getParserForType() {
         return PARSER;
      }

      public S2C_OptionalGiftBuy_16216 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionalGiftBuy_16216OrBuilder {
         private int bitField0_;
         private ActivityMsg.CustomGiftData giftData_;
         private SingleFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> giftDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftBuy_16216_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftBuy_16216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftBuy_16216.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_OptionalGiftBuy_16216.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OptionalGiftBuy_16216_descriptor;
         }

         public S2C_OptionalGiftBuy_16216 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_OptionalGiftBuy_16216.getDefaultInstance();
         }

         public S2C_OptionalGiftBuy_16216 build() {
            S2C_OptionalGiftBuy_16216 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionalGiftBuy_16216 buildPartial() {
            S2C_OptionalGiftBuy_16216 result = new S2C_OptionalGiftBuy_16216(this);
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
            if (other instanceof S2C_OptionalGiftBuy_16216) {
               return this.mergeFrom((S2C_OptionalGiftBuy_16216)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionalGiftBuy_16216 other) {
            if (other == EastWarRotateMsg.S2C_OptionalGiftBuy_16216.getDefaultInstance()) {
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
            S2C_OptionalGiftBuy_16216 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionalGiftBuy_16216)EastWarRotateMsg.S2C_OptionalGiftBuy_16216.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionalGiftBuy_16216)e.getUnfinishedMessage();
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

   public static final class C2S_Appointment_16221 extends GeneratedMessageV3 implements C2S_Appointment_16221OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Appointment_16221 DEFAULT_INSTANCE = new C2S_Appointment_16221();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Appointment_16221> PARSER = new AbstractParser<C2S_Appointment_16221>() {
         public C2S_Appointment_16221 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Appointment_16221(input, extensionRegistry);
         }
      };

      private C2S_Appointment_16221(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Appointment_16221() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Appointment_16221();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Appointment_16221(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Appointment_16221_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Appointment_16221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Appointment_16221.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Appointment_16221)) {
            return super.equals(obj);
         } else {
            C2S_Appointment_16221 other = (C2S_Appointment_16221)obj;
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

      public static C2S_Appointment_16221 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Appointment_16221)PARSER.parseFrom(data);
      }

      public static C2S_Appointment_16221 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Appointment_16221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Appointment_16221 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Appointment_16221)PARSER.parseFrom(data);
      }

      public static C2S_Appointment_16221 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Appointment_16221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Appointment_16221 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Appointment_16221)PARSER.parseFrom(data);
      }

      public static C2S_Appointment_16221 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Appointment_16221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Appointment_16221 parseFrom(InputStream input) throws IOException {
         return (C2S_Appointment_16221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Appointment_16221 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Appointment_16221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Appointment_16221 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Appointment_16221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Appointment_16221 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Appointment_16221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Appointment_16221 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Appointment_16221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Appointment_16221 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Appointment_16221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Appointment_16221 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Appointment_16221 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Appointment_16221> parser() {
         return PARSER;
      }

      public Parser<C2S_Appointment_16221> getParserForType() {
         return PARSER;
      }

      public C2S_Appointment_16221 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Appointment_16221OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Appointment_16221_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Appointment_16221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Appointment_16221.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_Appointment_16221.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Appointment_16221_descriptor;
         }

         public C2S_Appointment_16221 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_Appointment_16221.getDefaultInstance();
         }

         public C2S_Appointment_16221 build() {
            C2S_Appointment_16221 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Appointment_16221 buildPartial() {
            C2S_Appointment_16221 result = new C2S_Appointment_16221(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Appointment_16221) {
               return this.mergeFrom((C2S_Appointment_16221)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Appointment_16221 other) {
            if (other == EastWarRotateMsg.C2S_Appointment_16221.getDefaultInstance()) {
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
            C2S_Appointment_16221 parsedMessage = null;

            try {
               parsedMessage = (C2S_Appointment_16221)EastWarRotateMsg.C2S_Appointment_16221.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Appointment_16221)e.getUnfinishedMessage();
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

   public static final class S2C_Appointment_16222 extends GeneratedMessageV3 implements S2C_Appointment_16222OrBuilder {
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
      private static final S2C_Appointment_16222 DEFAULT_INSTANCE = new S2C_Appointment_16222();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Appointment_16222> PARSER = new AbstractParser<S2C_Appointment_16222>() {
         public S2C_Appointment_16222 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Appointment_16222(input, extensionRegistry);
         }
      };

      private S2C_Appointment_16222(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Appointment_16222() {
         this.memoizedIsInitialized = -1;
         this.hadGetKey_ = emptyIntList();
         this.boxs_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Appointment_16222();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Appointment_16222(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Appointment_16222_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Appointment_16222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Appointment_16222.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Appointment_16222)) {
            return super.equals(obj);
         } else {
            S2C_Appointment_16222 other = (S2C_Appointment_16222)obj;
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

      public static S2C_Appointment_16222 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Appointment_16222)PARSER.parseFrom(data);
      }

      public static S2C_Appointment_16222 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Appointment_16222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Appointment_16222 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Appointment_16222)PARSER.parseFrom(data);
      }

      public static S2C_Appointment_16222 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Appointment_16222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Appointment_16222 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Appointment_16222)PARSER.parseFrom(data);
      }

      public static S2C_Appointment_16222 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Appointment_16222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Appointment_16222 parseFrom(InputStream input) throws IOException {
         return (S2C_Appointment_16222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Appointment_16222 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Appointment_16222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Appointment_16222 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Appointment_16222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Appointment_16222 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Appointment_16222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Appointment_16222 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Appointment_16222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Appointment_16222 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Appointment_16222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Appointment_16222 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Appointment_16222 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Appointment_16222> parser() {
         return PARSER;
      }

      public Parser<S2C_Appointment_16222> getParserForType() {
         return PARSER;
      }

      public S2C_Appointment_16222 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Appointment_16222OrBuilder {
         private int bitField0_;
         private Internal.IntList hadGetKey_;
         private int totalId_;
         private int hadGetId_;
         private Internal.IntList boxs_;
         private int curDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Appointment_16222_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Appointment_16222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Appointment_16222.class, Builder.class);
         }

         private Builder() {
            this.hadGetKey_ = EastWarRotateMsg.S2C_Appointment_16222.emptyIntList();
            this.boxs_ = EastWarRotateMsg.S2C_Appointment_16222.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadGetKey_ = EastWarRotateMsg.S2C_Appointment_16222.emptyIntList();
            this.boxs_ = EastWarRotateMsg.S2C_Appointment_16222.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_Appointment_16222.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hadGetKey_ = EastWarRotateMsg.S2C_Appointment_16222.emptyIntList();
            this.bitField0_ &= -2;
            this.totalId_ = 0;
            this.bitField0_ &= -3;
            this.hadGetId_ = 0;
            this.bitField0_ &= -5;
            this.boxs_ = EastWarRotateMsg.S2C_Appointment_16222.emptyIntList();
            this.bitField0_ &= -9;
            this.curDay_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Appointment_16222_descriptor;
         }

         public S2C_Appointment_16222 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_Appointment_16222.getDefaultInstance();
         }

         public S2C_Appointment_16222 build() {
            S2C_Appointment_16222 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Appointment_16222 buildPartial() {
            S2C_Appointment_16222 result = new S2C_Appointment_16222(this);
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
            if (other instanceof S2C_Appointment_16222) {
               return this.mergeFrom((S2C_Appointment_16222)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Appointment_16222 other) {
            if (other == EastWarRotateMsg.S2C_Appointment_16222.getDefaultInstance()) {
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
            S2C_Appointment_16222 parsedMessage = null;

            try {
               parsedMessage = (S2C_Appointment_16222)EastWarRotateMsg.S2C_Appointment_16222.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Appointment_16222)e.getUnfinishedMessage();
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
               this.hadGetKey_ = EastWarRotateMsg.S2C_Appointment_16222.mutableCopy(this.hadGetKey_);
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
            this.hadGetKey_ = EastWarRotateMsg.S2C_Appointment_16222.emptyIntList();
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
               this.boxs_ = EastWarRotateMsg.S2C_Appointment_16222.mutableCopy(this.boxs_);
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
            this.boxs_ = EastWarRotateMsg.S2C_Appointment_16222.emptyIntList();
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

   public static final class C2S_DrawKey_16223 extends GeneratedMessageV3 implements C2S_DrawKey_16223OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_DrawKey_16223 DEFAULT_INSTANCE = new C2S_DrawKey_16223();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawKey_16223> PARSER = new AbstractParser<C2S_DrawKey_16223>() {
         public C2S_DrawKey_16223 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawKey_16223(input, extensionRegistry);
         }
      };

      private C2S_DrawKey_16223(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawKey_16223() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawKey_16223();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawKey_16223(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_DrawKey_16223_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_DrawKey_16223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawKey_16223.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawKey_16223)) {
            return super.equals(obj);
         } else {
            C2S_DrawKey_16223 other = (C2S_DrawKey_16223)obj;
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

      public static C2S_DrawKey_16223 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_16223)PARSER.parseFrom(data);
      }

      public static C2S_DrawKey_16223 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_16223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawKey_16223 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_16223)PARSER.parseFrom(data);
      }

      public static C2S_DrawKey_16223 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_16223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawKey_16223 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_16223)PARSER.parseFrom(data);
      }

      public static C2S_DrawKey_16223 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_16223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawKey_16223 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawKey_16223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawKey_16223 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawKey_16223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawKey_16223 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawKey_16223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawKey_16223 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawKey_16223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawKey_16223 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawKey_16223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawKey_16223 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawKey_16223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawKey_16223 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawKey_16223 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawKey_16223> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawKey_16223> getParserForType() {
         return PARSER;
      }

      public C2S_DrawKey_16223 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawKey_16223OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_DrawKey_16223_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_DrawKey_16223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawKey_16223.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_DrawKey_16223.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_DrawKey_16223_descriptor;
         }

         public C2S_DrawKey_16223 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_DrawKey_16223.getDefaultInstance();
         }

         public C2S_DrawKey_16223 build() {
            C2S_DrawKey_16223 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawKey_16223 buildPartial() {
            C2S_DrawKey_16223 result = new C2S_DrawKey_16223(this);
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
            if (other instanceof C2S_DrawKey_16223) {
               return this.mergeFrom((C2S_DrawKey_16223)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawKey_16223 other) {
            if (other == EastWarRotateMsg.C2S_DrawKey_16223.getDefaultInstance()) {
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
            C2S_DrawKey_16223 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawKey_16223)EastWarRotateMsg.C2S_DrawKey_16223.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawKey_16223)e.getUnfinishedMessage();
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

   public static final class S2C_DrawKey_16224 extends GeneratedMessageV3 implements S2C_DrawKey_16224OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawKey_16224 DEFAULT_INSTANCE = new S2C_DrawKey_16224();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawKey_16224> PARSER = new AbstractParser<S2C_DrawKey_16224>() {
         public S2C_DrawKey_16224 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawKey_16224(input, extensionRegistry);
         }
      };

      private S2C_DrawKey_16224(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawKey_16224() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawKey_16224();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawKey_16224(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_DrawKey_16224_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_DrawKey_16224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawKey_16224.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawKey_16224)) {
            return super.equals(obj);
         } else {
            S2C_DrawKey_16224 other = (S2C_DrawKey_16224)obj;
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

      public static S2C_DrawKey_16224 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_16224)PARSER.parseFrom(data);
      }

      public static S2C_DrawKey_16224 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_16224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawKey_16224 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_16224)PARSER.parseFrom(data);
      }

      public static S2C_DrawKey_16224 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_16224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawKey_16224 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_16224)PARSER.parseFrom(data);
      }

      public static S2C_DrawKey_16224 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_16224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawKey_16224 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawKey_16224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawKey_16224 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawKey_16224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawKey_16224 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawKey_16224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawKey_16224 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawKey_16224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawKey_16224 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawKey_16224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawKey_16224 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawKey_16224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawKey_16224 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawKey_16224 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawKey_16224> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawKey_16224> getParserForType() {
         return PARSER;
      }

      public S2C_DrawKey_16224 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawKey_16224OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_DrawKey_16224_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_DrawKey_16224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawKey_16224.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_DrawKey_16224.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_DrawKey_16224_descriptor;
         }

         public S2C_DrawKey_16224 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_DrawKey_16224.getDefaultInstance();
         }

         public S2C_DrawKey_16224 build() {
            S2C_DrawKey_16224 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawKey_16224 buildPartial() {
            S2C_DrawKey_16224 result = new S2C_DrawKey_16224(this);
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
            if (other instanceof S2C_DrawKey_16224) {
               return this.mergeFrom((S2C_DrawKey_16224)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawKey_16224 other) {
            if (other == EastWarRotateMsg.S2C_DrawKey_16224.getDefaultInstance()) {
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
            S2C_DrawKey_16224 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawKey_16224)EastWarRotateMsg.S2C_DrawKey_16224.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawKey_16224)e.getUnfinishedMessage();
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

   public static final class C2S_Coincidence_16225 extends GeneratedMessageV3 implements C2S_Coincidence_16225OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Coincidence_16225 DEFAULT_INSTANCE = new C2S_Coincidence_16225();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Coincidence_16225> PARSER = new AbstractParser<C2S_Coincidence_16225>() {
         public C2S_Coincidence_16225 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Coincidence_16225(input, extensionRegistry);
         }
      };

      private C2S_Coincidence_16225(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Coincidence_16225() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Coincidence_16225();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Coincidence_16225(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Coincidence_16225_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Coincidence_16225_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Coincidence_16225.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Coincidence_16225)) {
            return super.equals(obj);
         } else {
            C2S_Coincidence_16225 other = (C2S_Coincidence_16225)obj;
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

      public static C2S_Coincidence_16225 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_16225)PARSER.parseFrom(data);
      }

      public static C2S_Coincidence_16225 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_16225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Coincidence_16225 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_16225)PARSER.parseFrom(data);
      }

      public static C2S_Coincidence_16225 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_16225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Coincidence_16225 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_16225)PARSER.parseFrom(data);
      }

      public static C2S_Coincidence_16225 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_16225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Coincidence_16225 parseFrom(InputStream input) throws IOException {
         return (C2S_Coincidence_16225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Coincidence_16225 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Coincidence_16225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Coincidence_16225 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Coincidence_16225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Coincidence_16225 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Coincidence_16225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Coincidence_16225 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Coincidence_16225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Coincidence_16225 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Coincidence_16225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Coincidence_16225 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Coincidence_16225 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Coincidence_16225> parser() {
         return PARSER;
      }

      public Parser<C2S_Coincidence_16225> getParserForType() {
         return PARSER;
      }

      public C2S_Coincidence_16225 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Coincidence_16225OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Coincidence_16225_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Coincidence_16225_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Coincidence_16225.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_Coincidence_16225.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Coincidence_16225_descriptor;
         }

         public C2S_Coincidence_16225 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_Coincidence_16225.getDefaultInstance();
         }

         public C2S_Coincidence_16225 build() {
            C2S_Coincidence_16225 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Coincidence_16225 buildPartial() {
            C2S_Coincidence_16225 result = new C2S_Coincidence_16225(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Coincidence_16225) {
               return this.mergeFrom((C2S_Coincidence_16225)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Coincidence_16225 other) {
            if (other == EastWarRotateMsg.C2S_Coincidence_16225.getDefaultInstance()) {
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
            C2S_Coincidence_16225 parsedMessage = null;

            try {
               parsedMessage = (C2S_Coincidence_16225)EastWarRotateMsg.C2S_Coincidence_16225.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Coincidence_16225)e.getUnfinishedMessage();
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

   public static final class S2C_Coincidence_16226 extends GeneratedMessageV3 implements S2C_Coincidence_16226OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HADGETID_FIELD_NUMBER = 1;
      private int hadGetId_;
      private byte memoizedIsInitialized;
      private static final S2C_Coincidence_16226 DEFAULT_INSTANCE = new S2C_Coincidence_16226();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Coincidence_16226> PARSER = new AbstractParser<S2C_Coincidence_16226>() {
         public S2C_Coincidence_16226 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Coincidence_16226(input, extensionRegistry);
         }
      };

      private S2C_Coincidence_16226(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Coincidence_16226() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Coincidence_16226();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Coincidence_16226(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Coincidence_16226_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Coincidence_16226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Coincidence_16226.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Coincidence_16226)) {
            return super.equals(obj);
         } else {
            S2C_Coincidence_16226 other = (S2C_Coincidence_16226)obj;
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

      public static S2C_Coincidence_16226 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_16226)PARSER.parseFrom(data);
      }

      public static S2C_Coincidence_16226 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_16226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Coincidence_16226 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_16226)PARSER.parseFrom(data);
      }

      public static S2C_Coincidence_16226 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_16226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Coincidence_16226 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_16226)PARSER.parseFrom(data);
      }

      public static S2C_Coincidence_16226 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_16226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Coincidence_16226 parseFrom(InputStream input) throws IOException {
         return (S2C_Coincidence_16226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Coincidence_16226 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Coincidence_16226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Coincidence_16226 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Coincidence_16226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Coincidence_16226 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Coincidence_16226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Coincidence_16226 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Coincidence_16226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Coincidence_16226 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Coincidence_16226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Coincidence_16226 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Coincidence_16226 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Coincidence_16226> parser() {
         return PARSER;
      }

      public Parser<S2C_Coincidence_16226> getParserForType() {
         return PARSER;
      }

      public S2C_Coincidence_16226 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Coincidence_16226OrBuilder {
         private int bitField0_;
         private int hadGetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Coincidence_16226_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Coincidence_16226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Coincidence_16226.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_Coincidence_16226.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hadGetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Coincidence_16226_descriptor;
         }

         public S2C_Coincidence_16226 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_Coincidence_16226.getDefaultInstance();
         }

         public S2C_Coincidence_16226 build() {
            S2C_Coincidence_16226 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Coincidence_16226 buildPartial() {
            S2C_Coincidence_16226 result = new S2C_Coincidence_16226(this);
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
            if (other instanceof S2C_Coincidence_16226) {
               return this.mergeFrom((S2C_Coincidence_16226)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Coincidence_16226 other) {
            if (other == EastWarRotateMsg.S2C_Coincidence_16226.getDefaultInstance()) {
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
            S2C_Coincidence_16226 parsedMessage = null;

            try {
               parsedMessage = (S2C_Coincidence_16226)EastWarRotateMsg.S2C_Coincidence_16226.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Coincidence_16226)e.getUnfinishedMessage();
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

   public static final class C2S_CoincidenceBox_16227 extends GeneratedMessageV3 implements C2S_CoincidenceBox_16227OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_CoincidenceBox_16227 DEFAULT_INSTANCE = new C2S_CoincidenceBox_16227();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CoincidenceBox_16227> PARSER = new AbstractParser<C2S_CoincidenceBox_16227>() {
         public C2S_CoincidenceBox_16227 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CoincidenceBox_16227(input, extensionRegistry);
         }
      };

      private C2S_CoincidenceBox_16227(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CoincidenceBox_16227() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CoincidenceBox_16227();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CoincidenceBox_16227(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CoincidenceBox_16227_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CoincidenceBox_16227_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CoincidenceBox_16227.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CoincidenceBox_16227)) {
            return super.equals(obj);
         } else {
            C2S_CoincidenceBox_16227 other = (C2S_CoincidenceBox_16227)obj;
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

      public static C2S_CoincidenceBox_16227 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_16227)PARSER.parseFrom(data);
      }

      public static C2S_CoincidenceBox_16227 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_16227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CoincidenceBox_16227 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_16227)PARSER.parseFrom(data);
      }

      public static C2S_CoincidenceBox_16227 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_16227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CoincidenceBox_16227 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_16227)PARSER.parseFrom(data);
      }

      public static C2S_CoincidenceBox_16227 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_16227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CoincidenceBox_16227 parseFrom(InputStream input) throws IOException {
         return (C2S_CoincidenceBox_16227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CoincidenceBox_16227 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CoincidenceBox_16227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CoincidenceBox_16227 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CoincidenceBox_16227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CoincidenceBox_16227 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CoincidenceBox_16227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CoincidenceBox_16227 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CoincidenceBox_16227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CoincidenceBox_16227 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CoincidenceBox_16227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CoincidenceBox_16227 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CoincidenceBox_16227 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CoincidenceBox_16227> parser() {
         return PARSER;
      }

      public Parser<C2S_CoincidenceBox_16227> getParserForType() {
         return PARSER;
      }

      public C2S_CoincidenceBox_16227 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CoincidenceBox_16227OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CoincidenceBox_16227_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CoincidenceBox_16227_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CoincidenceBox_16227.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_CoincidenceBox_16227.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CoincidenceBox_16227_descriptor;
         }

         public C2S_CoincidenceBox_16227 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_CoincidenceBox_16227.getDefaultInstance();
         }

         public C2S_CoincidenceBox_16227 build() {
            C2S_CoincidenceBox_16227 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CoincidenceBox_16227 buildPartial() {
            C2S_CoincidenceBox_16227 result = new C2S_CoincidenceBox_16227(this);
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
            if (other instanceof C2S_CoincidenceBox_16227) {
               return this.mergeFrom((C2S_CoincidenceBox_16227)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CoincidenceBox_16227 other) {
            if (other == EastWarRotateMsg.C2S_CoincidenceBox_16227.getDefaultInstance()) {
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
            C2S_CoincidenceBox_16227 parsedMessage = null;

            try {
               parsedMessage = (C2S_CoincidenceBox_16227)EastWarRotateMsg.C2S_CoincidenceBox_16227.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CoincidenceBox_16227)e.getUnfinishedMessage();
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

   public static final class S2C_CoincidenceBox_16228 extends GeneratedMessageV3 implements S2C_CoincidenceBox_16228OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_CoincidenceBox_16228 DEFAULT_INSTANCE = new S2C_CoincidenceBox_16228();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CoincidenceBox_16228> PARSER = new AbstractParser<S2C_CoincidenceBox_16228>() {
         public S2C_CoincidenceBox_16228 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CoincidenceBox_16228(input, extensionRegistry);
         }
      };

      private S2C_CoincidenceBox_16228(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CoincidenceBox_16228() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CoincidenceBox_16228();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CoincidenceBox_16228(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CoincidenceBox_16228_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CoincidenceBox_16228_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CoincidenceBox_16228.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CoincidenceBox_16228)) {
            return super.equals(obj);
         } else {
            S2C_CoincidenceBox_16228 other = (S2C_CoincidenceBox_16228)obj;
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

      public static S2C_CoincidenceBox_16228 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_16228)PARSER.parseFrom(data);
      }

      public static S2C_CoincidenceBox_16228 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_16228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CoincidenceBox_16228 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_16228)PARSER.parseFrom(data);
      }

      public static S2C_CoincidenceBox_16228 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_16228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CoincidenceBox_16228 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_16228)PARSER.parseFrom(data);
      }

      public static S2C_CoincidenceBox_16228 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_16228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CoincidenceBox_16228 parseFrom(InputStream input) throws IOException {
         return (S2C_CoincidenceBox_16228)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CoincidenceBox_16228 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CoincidenceBox_16228)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CoincidenceBox_16228 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CoincidenceBox_16228)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CoincidenceBox_16228 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CoincidenceBox_16228)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CoincidenceBox_16228 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CoincidenceBox_16228)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CoincidenceBox_16228 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CoincidenceBox_16228)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CoincidenceBox_16228 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CoincidenceBox_16228 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CoincidenceBox_16228> parser() {
         return PARSER;
      }

      public Parser<S2C_CoincidenceBox_16228> getParserForType() {
         return PARSER;
      }

      public S2C_CoincidenceBox_16228 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CoincidenceBox_16228OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CoincidenceBox_16228_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CoincidenceBox_16228_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CoincidenceBox_16228.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_CoincidenceBox_16228.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CoincidenceBox_16228_descriptor;
         }

         public S2C_CoincidenceBox_16228 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_CoincidenceBox_16228.getDefaultInstance();
         }

         public S2C_CoincidenceBox_16228 build() {
            S2C_CoincidenceBox_16228 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CoincidenceBox_16228 buildPartial() {
            S2C_CoincidenceBox_16228 result = new S2C_CoincidenceBox_16228(this);
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
            if (other instanceof S2C_CoincidenceBox_16228) {
               return this.mergeFrom((S2C_CoincidenceBox_16228)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CoincidenceBox_16228 other) {
            if (other == EastWarRotateMsg.S2C_CoincidenceBox_16228.getDefaultInstance()) {
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
            S2C_CoincidenceBox_16228 parsedMessage = null;

            try {
               parsedMessage = (S2C_CoincidenceBox_16228)EastWarRotateMsg.S2C_CoincidenceBox_16228.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CoincidenceBox_16228)e.getUnfinishedMessage();
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

   public static final class C2S_CumulativeId_16229 extends GeneratedMessageV3 implements C2S_CumulativeId_16229OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CumulativeId_16229 DEFAULT_INSTANCE = new C2S_CumulativeId_16229();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CumulativeId_16229> PARSER = new AbstractParser<C2S_CumulativeId_16229>() {
         public C2S_CumulativeId_16229 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CumulativeId_16229(input, extensionRegistry);
         }
      };

      private C2S_CumulativeId_16229(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CumulativeId_16229() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CumulativeId_16229();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CumulativeId_16229(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CumulativeId_16229_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CumulativeId_16229_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CumulativeId_16229.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CumulativeId_16229)) {
            return super.equals(obj);
         } else {
            C2S_CumulativeId_16229 other = (C2S_CumulativeId_16229)obj;
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

      public static C2S_CumulativeId_16229 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_16229)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeId_16229 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_16229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeId_16229 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_16229)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeId_16229 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_16229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeId_16229 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_16229)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeId_16229 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_16229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeId_16229 parseFrom(InputStream input) throws IOException {
         return (C2S_CumulativeId_16229)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CumulativeId_16229 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeId_16229)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CumulativeId_16229 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CumulativeId_16229)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CumulativeId_16229 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeId_16229)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CumulativeId_16229 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CumulativeId_16229)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CumulativeId_16229 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeId_16229)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CumulativeId_16229 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CumulativeId_16229 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CumulativeId_16229> parser() {
         return PARSER;
      }

      public Parser<C2S_CumulativeId_16229> getParserForType() {
         return PARSER;
      }

      public C2S_CumulativeId_16229 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CumulativeId_16229OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CumulativeId_16229_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CumulativeId_16229_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CumulativeId_16229.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_CumulativeId_16229.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CumulativeId_16229_descriptor;
         }

         public C2S_CumulativeId_16229 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_CumulativeId_16229.getDefaultInstance();
         }

         public C2S_CumulativeId_16229 build() {
            C2S_CumulativeId_16229 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CumulativeId_16229 buildPartial() {
            C2S_CumulativeId_16229 result = new C2S_CumulativeId_16229(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_CumulativeId_16229) {
               return this.mergeFrom((C2S_CumulativeId_16229)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CumulativeId_16229 other) {
            if (other == EastWarRotateMsg.C2S_CumulativeId_16229.getDefaultInstance()) {
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
            C2S_CumulativeId_16229 parsedMessage = null;

            try {
               parsedMessage = (C2S_CumulativeId_16229)EastWarRotateMsg.C2S_CumulativeId_16229.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CumulativeId_16229)e.getUnfinishedMessage();
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

   public static final class S2C_CumulativeId_16230 extends GeneratedMessageV3 implements S2C_CumulativeId_16230OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOTALID_FIELD_NUMBER = 1;
      private int totalId_;
      private byte memoizedIsInitialized;
      private static final S2C_CumulativeId_16230 DEFAULT_INSTANCE = new S2C_CumulativeId_16230();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CumulativeId_16230> PARSER = new AbstractParser<S2C_CumulativeId_16230>() {
         public S2C_CumulativeId_16230 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CumulativeId_16230(input, extensionRegistry);
         }
      };

      private S2C_CumulativeId_16230(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CumulativeId_16230() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CumulativeId_16230();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CumulativeId_16230(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CumulativeId_16230_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CumulativeId_16230_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CumulativeId_16230.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CumulativeId_16230)) {
            return super.equals(obj);
         } else {
            S2C_CumulativeId_16230 other = (S2C_CumulativeId_16230)obj;
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

      public static S2C_CumulativeId_16230 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_16230)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeId_16230 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_16230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeId_16230 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_16230)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeId_16230 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_16230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeId_16230 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_16230)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeId_16230 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_16230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeId_16230 parseFrom(InputStream input) throws IOException {
         return (S2C_CumulativeId_16230)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CumulativeId_16230 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeId_16230)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CumulativeId_16230 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CumulativeId_16230)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CumulativeId_16230 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeId_16230)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CumulativeId_16230 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CumulativeId_16230)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CumulativeId_16230 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeId_16230)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CumulativeId_16230 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CumulativeId_16230 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CumulativeId_16230> parser() {
         return PARSER;
      }

      public Parser<S2C_CumulativeId_16230> getParserForType() {
         return PARSER;
      }

      public S2C_CumulativeId_16230 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CumulativeId_16230OrBuilder {
         private int bitField0_;
         private int totalId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CumulativeId_16230_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CumulativeId_16230_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CumulativeId_16230.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_CumulativeId_16230.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.totalId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CumulativeId_16230_descriptor;
         }

         public S2C_CumulativeId_16230 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_CumulativeId_16230.getDefaultInstance();
         }

         public S2C_CumulativeId_16230 build() {
            S2C_CumulativeId_16230 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CumulativeId_16230 buildPartial() {
            S2C_CumulativeId_16230 result = new S2C_CumulativeId_16230(this);
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
            if (other instanceof S2C_CumulativeId_16230) {
               return this.mergeFrom((S2C_CumulativeId_16230)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CumulativeId_16230 other) {
            if (other == EastWarRotateMsg.S2C_CumulativeId_16230.getDefaultInstance()) {
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
            S2C_CumulativeId_16230 parsedMessage = null;

            try {
               parsedMessage = (S2C_CumulativeId_16230)EastWarRotateMsg.S2C_CumulativeId_16230.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CumulativeId_16230)e.getUnfinishedMessage();
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

   public static final class C2S_MakeWine_16241 extends GeneratedMessageV3 implements C2S_MakeWine_16241OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_MakeWine_16241 DEFAULT_INSTANCE = new C2S_MakeWine_16241();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MakeWine_16241> PARSER = new AbstractParser<C2S_MakeWine_16241>() {
         public C2S_MakeWine_16241 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MakeWine_16241(input, extensionRegistry);
         }
      };

      private C2S_MakeWine_16241(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MakeWine_16241() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MakeWine_16241();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MakeWine_16241(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_MakeWine_16241_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_MakeWine_16241_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MakeWine_16241.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MakeWine_16241)) {
            return super.equals(obj);
         } else {
            C2S_MakeWine_16241 other = (C2S_MakeWine_16241)obj;
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

      public static C2S_MakeWine_16241 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_16241)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_16241 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_16241)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_16241 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_16241)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_16241 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_16241)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_16241 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_16241)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_16241 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_16241)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_16241 parseFrom(InputStream input) throws IOException {
         return (C2S_MakeWine_16241)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_16241 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_16241)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MakeWine_16241 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MakeWine_16241)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_16241 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_16241)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MakeWine_16241 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MakeWine_16241)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_16241 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_16241)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MakeWine_16241 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MakeWine_16241 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MakeWine_16241> parser() {
         return PARSER;
      }

      public Parser<C2S_MakeWine_16241> getParserForType() {
         return PARSER;
      }

      public C2S_MakeWine_16241 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MakeWine_16241OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_MakeWine_16241_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_MakeWine_16241_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MakeWine_16241.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_MakeWine_16241.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_MakeWine_16241_descriptor;
         }

         public C2S_MakeWine_16241 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_MakeWine_16241.getDefaultInstance();
         }

         public C2S_MakeWine_16241 build() {
            C2S_MakeWine_16241 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MakeWine_16241 buildPartial() {
            C2S_MakeWine_16241 result = new C2S_MakeWine_16241(this);
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
            if (other instanceof C2S_MakeWine_16241) {
               return this.mergeFrom((C2S_MakeWine_16241)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MakeWine_16241 other) {
            if (other == EastWarRotateMsg.C2S_MakeWine_16241.getDefaultInstance()) {
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
            C2S_MakeWine_16241 parsedMessage = null;

            try {
               parsedMessage = (C2S_MakeWine_16241)EastWarRotateMsg.C2S_MakeWine_16241.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MakeWine_16241)e.getUnfinishedMessage();
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

   public static final class S2C_MakeWine_16242 extends GeneratedMessageV3 implements S2C_MakeWine_16242OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TOTALWINENUM_FIELD_NUMBER = 2;
      private int totalWineNum_;
      private byte memoizedIsInitialized;
      private static final S2C_MakeWine_16242 DEFAULT_INSTANCE = new S2C_MakeWine_16242();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MakeWine_16242> PARSER = new AbstractParser<S2C_MakeWine_16242>() {
         public S2C_MakeWine_16242 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MakeWine_16242(input, extensionRegistry);
         }
      };

      private S2C_MakeWine_16242(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MakeWine_16242() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MakeWine_16242();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MakeWine_16242(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_MakeWine_16242_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_MakeWine_16242_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MakeWine_16242.class, Builder.class);
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
         } else if (!(obj instanceof S2C_MakeWine_16242)) {
            return super.equals(obj);
         } else {
            S2C_MakeWine_16242 other = (S2C_MakeWine_16242)obj;
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

      public static S2C_MakeWine_16242 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_16242)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_16242 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_16242)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_16242 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_16242)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_16242 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_16242)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_16242 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_16242)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_16242 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_16242)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_16242 parseFrom(InputStream input) throws IOException {
         return (S2C_MakeWine_16242)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_16242 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_16242)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MakeWine_16242 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MakeWine_16242)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_16242 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_16242)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MakeWine_16242 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MakeWine_16242)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_16242 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_16242)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MakeWine_16242 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MakeWine_16242 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MakeWine_16242> parser() {
         return PARSER;
      }

      public Parser<S2C_MakeWine_16242> getParserForType() {
         return PARSER;
      }

      public S2C_MakeWine_16242 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MakeWine_16242OrBuilder {
         private int bitField0_;
         private int result_;
         private int totalWineNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_MakeWine_16242_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_MakeWine_16242_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MakeWine_16242.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_MakeWine_16242.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_MakeWine_16242_descriptor;
         }

         public S2C_MakeWine_16242 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_MakeWine_16242.getDefaultInstance();
         }

         public S2C_MakeWine_16242 build() {
            S2C_MakeWine_16242 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MakeWine_16242 buildPartial() {
            S2C_MakeWine_16242 result = new S2C_MakeWine_16242(this);
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
            if (other instanceof S2C_MakeWine_16242) {
               return this.mergeFrom((S2C_MakeWine_16242)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MakeWine_16242 other) {
            if (other == EastWarRotateMsg.S2C_MakeWine_16242.getDefaultInstance()) {
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
            S2C_MakeWine_16242 parsedMessage = null;

            try {
               parsedMessage = (S2C_MakeWine_16242)EastWarRotateMsg.S2C_MakeWine_16242.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MakeWine_16242)e.getUnfinishedMessage();
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

   public static final class C2S_TakePlumReward_16243 extends GeneratedMessageV3 implements C2S_TakePlumReward_16243OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TakePlumReward_16243 DEFAULT_INSTANCE = new C2S_TakePlumReward_16243();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakePlumReward_16243> PARSER = new AbstractParser<C2S_TakePlumReward_16243>() {
         public C2S_TakePlumReward_16243 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakePlumReward_16243(input, extensionRegistry);
         }
      };

      private C2S_TakePlumReward_16243(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakePlumReward_16243() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakePlumReward_16243();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakePlumReward_16243(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_TakePlumReward_16243_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_TakePlumReward_16243_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakePlumReward_16243.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakePlumReward_16243)) {
            return super.equals(obj);
         } else {
            C2S_TakePlumReward_16243 other = (C2S_TakePlumReward_16243)obj;
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

      public static C2S_TakePlumReward_16243 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_16243)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_16243 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_16243)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_16243 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_16243)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_16243 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_16243)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_16243 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_16243)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_16243 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_16243)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_16243 parseFrom(InputStream input) throws IOException {
         return (C2S_TakePlumReward_16243)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_16243 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_16243)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakePlumReward_16243 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakePlumReward_16243)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_16243 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_16243)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakePlumReward_16243 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakePlumReward_16243)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_16243 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_16243)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakePlumReward_16243 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakePlumReward_16243 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakePlumReward_16243> parser() {
         return PARSER;
      }

      public Parser<C2S_TakePlumReward_16243> getParserForType() {
         return PARSER;
      }

      public C2S_TakePlumReward_16243 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakePlumReward_16243OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_TakePlumReward_16243_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_TakePlumReward_16243_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakePlumReward_16243.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_TakePlumReward_16243.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_TakePlumReward_16243_descriptor;
         }

         public C2S_TakePlumReward_16243 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_TakePlumReward_16243.getDefaultInstance();
         }

         public C2S_TakePlumReward_16243 build() {
            C2S_TakePlumReward_16243 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakePlumReward_16243 buildPartial() {
            C2S_TakePlumReward_16243 result = new C2S_TakePlumReward_16243(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TakePlumReward_16243) {
               return this.mergeFrom((C2S_TakePlumReward_16243)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakePlumReward_16243 other) {
            if (other == EastWarRotateMsg.C2S_TakePlumReward_16243.getDefaultInstance()) {
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
            C2S_TakePlumReward_16243 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakePlumReward_16243)EastWarRotateMsg.C2S_TakePlumReward_16243.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakePlumReward_16243)e.getUnfinishedMessage();
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

   public static final class S2C_TakePlumReward_16244 extends GeneratedMessageV3 implements S2C_TakePlumReward_16244OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_TakePlumReward_16244 DEFAULT_INSTANCE = new S2C_TakePlumReward_16244();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakePlumReward_16244> PARSER = new AbstractParser<S2C_TakePlumReward_16244>() {
         public S2C_TakePlumReward_16244 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakePlumReward_16244(input, extensionRegistry);
         }
      };

      private S2C_TakePlumReward_16244(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakePlumReward_16244() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakePlumReward_16244();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakePlumReward_16244(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_TakePlumReward_16244_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_TakePlumReward_16244_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakePlumReward_16244.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TakePlumReward_16244)) {
            return super.equals(obj);
         } else {
            S2C_TakePlumReward_16244 other = (S2C_TakePlumReward_16244)obj;
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

      public static S2C_TakePlumReward_16244 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_16244)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_16244 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_16244)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_16244 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_16244)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_16244 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_16244)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_16244 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_16244)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_16244 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_16244)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_16244 parseFrom(InputStream input) throws IOException {
         return (S2C_TakePlumReward_16244)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_16244 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_16244)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakePlumReward_16244 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakePlumReward_16244)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_16244 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_16244)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakePlumReward_16244 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakePlumReward_16244)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_16244 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_16244)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakePlumReward_16244 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakePlumReward_16244 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakePlumReward_16244> parser() {
         return PARSER;
      }

      public Parser<S2C_TakePlumReward_16244> getParserForType() {
         return PARSER;
      }

      public S2C_TakePlumReward_16244 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakePlumReward_16244OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_TakePlumReward_16244_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_TakePlumReward_16244_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakePlumReward_16244.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_TakePlumReward_16244.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_TakePlumReward_16244_descriptor;
         }

         public S2C_TakePlumReward_16244 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_TakePlumReward_16244.getDefaultInstance();
         }

         public S2C_TakePlumReward_16244 build() {
            S2C_TakePlumReward_16244 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakePlumReward_16244 buildPartial() {
            S2C_TakePlumReward_16244 result = new S2C_TakePlumReward_16244(this);
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
            if (other instanceof S2C_TakePlumReward_16244) {
               return this.mergeFrom((S2C_TakePlumReward_16244)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakePlumReward_16244 other) {
            if (other == EastWarRotateMsg.S2C_TakePlumReward_16244.getDefaultInstance()) {
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
            S2C_TakePlumReward_16244 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakePlumReward_16244)EastWarRotateMsg.S2C_TakePlumReward_16244.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakePlumReward_16244)e.getUnfinishedMessage();
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

   public static final class C2S_Drink_16245 extends GeneratedMessageV3 implements C2S_Drink_16245OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Drink_16245 DEFAULT_INSTANCE = new C2S_Drink_16245();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Drink_16245> PARSER = new AbstractParser<C2S_Drink_16245>() {
         public C2S_Drink_16245 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Drink_16245(input, extensionRegistry);
         }
      };

      private C2S_Drink_16245(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Drink_16245() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Drink_16245();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Drink_16245(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Drink_16245_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Drink_16245_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Drink_16245.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Drink_16245)) {
            return super.equals(obj);
         } else {
            C2S_Drink_16245 other = (C2S_Drink_16245)obj;
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

      public static C2S_Drink_16245 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Drink_16245)PARSER.parseFrom(data);
      }

      public static C2S_Drink_16245 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_16245)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_16245 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Drink_16245)PARSER.parseFrom(data);
      }

      public static C2S_Drink_16245 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_16245)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_16245 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Drink_16245)PARSER.parseFrom(data);
      }

      public static C2S_Drink_16245 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_16245)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_16245 parseFrom(InputStream input) throws IOException {
         return (C2S_Drink_16245)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Drink_16245 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_16245)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Drink_16245 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Drink_16245)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Drink_16245 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_16245)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Drink_16245 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Drink_16245)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Drink_16245 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_16245)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Drink_16245 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Drink_16245 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Drink_16245> parser() {
         return PARSER;
      }

      public Parser<C2S_Drink_16245> getParserForType() {
         return PARSER;
      }

      public C2S_Drink_16245 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Drink_16245OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Drink_16245_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Drink_16245_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Drink_16245.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_Drink_16245.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_Drink_16245_descriptor;
         }

         public C2S_Drink_16245 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_Drink_16245.getDefaultInstance();
         }

         public C2S_Drink_16245 build() {
            C2S_Drink_16245 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Drink_16245 buildPartial() {
            C2S_Drink_16245 result = new C2S_Drink_16245(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Drink_16245) {
               return this.mergeFrom((C2S_Drink_16245)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Drink_16245 other) {
            if (other == EastWarRotateMsg.C2S_Drink_16245.getDefaultInstance()) {
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
            C2S_Drink_16245 parsedMessage = null;

            try {
               parsedMessage = (C2S_Drink_16245)EastWarRotateMsg.C2S_Drink_16245.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Drink_16245)e.getUnfinishedMessage();
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

   public static final class S2C_Drink_16246 extends GeneratedMessageV3 implements S2C_Drink_16246OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int FREENUM_FIELD_NUMBER = 2;
      private int freeNum_;
      private byte memoizedIsInitialized;
      private static final S2C_Drink_16246 DEFAULT_INSTANCE = new S2C_Drink_16246();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Drink_16246> PARSER = new AbstractParser<S2C_Drink_16246>() {
         public S2C_Drink_16246 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Drink_16246(input, extensionRegistry);
         }
      };

      private S2C_Drink_16246(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Drink_16246() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Drink_16246();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Drink_16246(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Drink_16246_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Drink_16246_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Drink_16246.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Drink_16246)) {
            return super.equals(obj);
         } else {
            S2C_Drink_16246 other = (S2C_Drink_16246)obj;
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

      public static S2C_Drink_16246 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Drink_16246)PARSER.parseFrom(data);
      }

      public static S2C_Drink_16246 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_16246)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_16246 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Drink_16246)PARSER.parseFrom(data);
      }

      public static S2C_Drink_16246 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_16246)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_16246 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Drink_16246)PARSER.parseFrom(data);
      }

      public static S2C_Drink_16246 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_16246)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_16246 parseFrom(InputStream input) throws IOException {
         return (S2C_Drink_16246)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Drink_16246 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_16246)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Drink_16246 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Drink_16246)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Drink_16246 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_16246)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Drink_16246 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Drink_16246)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Drink_16246 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_16246)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Drink_16246 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Drink_16246 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Drink_16246> parser() {
         return PARSER;
      }

      public Parser<S2C_Drink_16246> getParserForType() {
         return PARSER;
      }

      public S2C_Drink_16246 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Drink_16246OrBuilder {
         private int bitField0_;
         private int result_;
         private int freeNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Drink_16246_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Drink_16246_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Drink_16246.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_Drink_16246.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_Drink_16246_descriptor;
         }

         public S2C_Drink_16246 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_Drink_16246.getDefaultInstance();
         }

         public S2C_Drink_16246 build() {
            S2C_Drink_16246 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Drink_16246 buildPartial() {
            S2C_Drink_16246 result = new S2C_Drink_16246(this);
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
            if (other instanceof S2C_Drink_16246) {
               return this.mergeFrom((S2C_Drink_16246)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Drink_16246 other) {
            if (other == EastWarRotateMsg.S2C_Drink_16246.getDefaultInstance()) {
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
            S2C_Drink_16246 parsedMessage = null;

            try {
               parsedMessage = (S2C_Drink_16246)EastWarRotateMsg.S2C_Drink_16246.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Drink_16246)e.getUnfinishedMessage();
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

   public static final class C2S_FreeDrinkNum_16247 extends GeneratedMessageV3 implements C2S_FreeDrinkNum_16247OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FreeDrinkNum_16247 DEFAULT_INSTANCE = new C2S_FreeDrinkNum_16247();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FreeDrinkNum_16247> PARSER = new AbstractParser<C2S_FreeDrinkNum_16247>() {
         public C2S_FreeDrinkNum_16247 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FreeDrinkNum_16247(input, extensionRegistry);
         }
      };

      private C2S_FreeDrinkNum_16247(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FreeDrinkNum_16247() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FreeDrinkNum_16247();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FreeDrinkNum_16247(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_FreeDrinkNum_16247_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_FreeDrinkNum_16247_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeDrinkNum_16247.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FreeDrinkNum_16247)) {
            return super.equals(obj);
         } else {
            C2S_FreeDrinkNum_16247 other = (C2S_FreeDrinkNum_16247)obj;
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

      public static C2S_FreeDrinkNum_16247 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_16247)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_16247 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_16247)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_16247 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_16247)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_16247 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_16247)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_16247 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_16247)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_16247 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_16247)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_16247 parseFrom(InputStream input) throws IOException {
         return (C2S_FreeDrinkNum_16247)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_16247 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_16247)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_16247 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FreeDrinkNum_16247)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_16247 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_16247)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_16247 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FreeDrinkNum_16247)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_16247 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_16247)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FreeDrinkNum_16247 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FreeDrinkNum_16247 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FreeDrinkNum_16247> parser() {
         return PARSER;
      }

      public Parser<C2S_FreeDrinkNum_16247> getParserForType() {
         return PARSER;
      }

      public C2S_FreeDrinkNum_16247 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FreeDrinkNum_16247OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_FreeDrinkNum_16247_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_FreeDrinkNum_16247_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeDrinkNum_16247.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_FreeDrinkNum_16247.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_FreeDrinkNum_16247_descriptor;
         }

         public C2S_FreeDrinkNum_16247 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_FreeDrinkNum_16247.getDefaultInstance();
         }

         public C2S_FreeDrinkNum_16247 build() {
            C2S_FreeDrinkNum_16247 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FreeDrinkNum_16247 buildPartial() {
            C2S_FreeDrinkNum_16247 result = new C2S_FreeDrinkNum_16247(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_FreeDrinkNum_16247) {
               return this.mergeFrom((C2S_FreeDrinkNum_16247)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FreeDrinkNum_16247 other) {
            if (other == EastWarRotateMsg.C2S_FreeDrinkNum_16247.getDefaultInstance()) {
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
            C2S_FreeDrinkNum_16247 parsedMessage = null;

            try {
               parsedMessage = (C2S_FreeDrinkNum_16247)EastWarRotateMsg.C2S_FreeDrinkNum_16247.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FreeDrinkNum_16247)e.getUnfinishedMessage();
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

   public static final class S2C_FreeDrinkNum_16248 extends GeneratedMessageV3 implements S2C_FreeDrinkNum_16248OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FREENUM_FIELD_NUMBER = 1;
      private int freeNum_;
      public static final int TOTALWINENUM_FIELD_NUMBER = 2;
      private int totalWineNum_;
      public static final int ISTAKED_FIELD_NUMBER = 3;
      private boolean isTaked_;
      private byte memoizedIsInitialized;
      private static final S2C_FreeDrinkNum_16248 DEFAULT_INSTANCE = new S2C_FreeDrinkNum_16248();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FreeDrinkNum_16248> PARSER = new AbstractParser<S2C_FreeDrinkNum_16248>() {
         public S2C_FreeDrinkNum_16248 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FreeDrinkNum_16248(input, extensionRegistry);
         }
      };

      private S2C_FreeDrinkNum_16248(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FreeDrinkNum_16248() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FreeDrinkNum_16248();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FreeDrinkNum_16248(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_FreeDrinkNum_16248_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_FreeDrinkNum_16248_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeDrinkNum_16248.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FreeDrinkNum_16248)) {
            return super.equals(obj);
         } else {
            S2C_FreeDrinkNum_16248 other = (S2C_FreeDrinkNum_16248)obj;
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

      public static S2C_FreeDrinkNum_16248 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_16248)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_16248 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_16248)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_16248 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_16248)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_16248 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_16248)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_16248 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_16248)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_16248 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_16248)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_16248 parseFrom(InputStream input) throws IOException {
         return (S2C_FreeDrinkNum_16248)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_16248 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_16248)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_16248 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FreeDrinkNum_16248)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_16248 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_16248)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_16248 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FreeDrinkNum_16248)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_16248 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_16248)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FreeDrinkNum_16248 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FreeDrinkNum_16248 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FreeDrinkNum_16248> parser() {
         return PARSER;
      }

      public Parser<S2C_FreeDrinkNum_16248> getParserForType() {
         return PARSER;
      }

      public S2C_FreeDrinkNum_16248 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FreeDrinkNum_16248OrBuilder {
         private int bitField0_;
         private int freeNum_;
         private int totalWineNum_;
         private boolean isTaked_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_FreeDrinkNum_16248_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_FreeDrinkNum_16248_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeDrinkNum_16248.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_FreeDrinkNum_16248.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_FreeDrinkNum_16248_descriptor;
         }

         public S2C_FreeDrinkNum_16248 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_FreeDrinkNum_16248.getDefaultInstance();
         }

         public S2C_FreeDrinkNum_16248 build() {
            S2C_FreeDrinkNum_16248 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FreeDrinkNum_16248 buildPartial() {
            S2C_FreeDrinkNum_16248 result = new S2C_FreeDrinkNum_16248(this);
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
            if (other instanceof S2C_FreeDrinkNum_16248) {
               return this.mergeFrom((S2C_FreeDrinkNum_16248)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FreeDrinkNum_16248 other) {
            if (other == EastWarRotateMsg.S2C_FreeDrinkNum_16248.getDefaultInstance()) {
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
            S2C_FreeDrinkNum_16248 parsedMessage = null;

            try {
               parsedMessage = (S2C_FreeDrinkNum_16248)EastWarRotateMsg.S2C_FreeDrinkNum_16248.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FreeDrinkNum_16248)e.getUnfinishedMessage();
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

   public static final class C2S_CommitTask_16251 extends GeneratedMessageV3 implements C2S_CommitTask_16251OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_16251 DEFAULT_INSTANCE = new C2S_CommitTask_16251();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_16251> PARSER = new AbstractParser<C2S_CommitTask_16251>() {
         public C2S_CommitTask_16251 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_16251(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_16251(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_16251() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_16251();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_16251(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CommitTask_16251_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CommitTask_16251_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_16251.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CommitTask_16251)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_16251 other = (C2S_CommitTask_16251)obj;
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

      public static C2S_CommitTask_16251 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_16251)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_16251 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_16251)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_16251 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_16251)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_16251 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_16251)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_16251 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_16251)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_16251 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_16251)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_16251 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_16251)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_16251 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_16251)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_16251 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_16251)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_16251 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_16251)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_16251 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_16251)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_16251 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_16251)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_16251 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_16251 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_16251> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_16251> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_16251 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_16251OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CommitTask_16251_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CommitTask_16251_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_16251.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_CommitTask_16251.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_CommitTask_16251_descriptor;
         }

         public C2S_CommitTask_16251 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_CommitTask_16251.getDefaultInstance();
         }

         public C2S_CommitTask_16251 build() {
            C2S_CommitTask_16251 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_16251 buildPartial() {
            C2S_CommitTask_16251 result = new C2S_CommitTask_16251(this);
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
            if (other instanceof C2S_CommitTask_16251) {
               return this.mergeFrom((C2S_CommitTask_16251)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_16251 other) {
            if (other == EastWarRotateMsg.C2S_CommitTask_16251.getDefaultInstance()) {
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
            C2S_CommitTask_16251 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_16251)EastWarRotateMsg.C2S_CommitTask_16251.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_16251)e.getUnfinishedMessage();
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

   public static final class S2C_CommitTask_16252 extends GeneratedMessageV3 implements S2C_CommitTask_16252OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_16252 DEFAULT_INSTANCE = new S2C_CommitTask_16252();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_16252> PARSER = new AbstractParser<S2C_CommitTask_16252>() {
         public S2C_CommitTask_16252 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_16252(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_16252(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_16252() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_16252();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_16252(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CommitTask_16252_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CommitTask_16252_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_16252.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CommitTask_16252)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_16252 other = (S2C_CommitTask_16252)obj;
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

      public static S2C_CommitTask_16252 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_16252)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_16252 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_16252)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_16252 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_16252)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_16252 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_16252)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_16252 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_16252)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_16252 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_16252)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_16252 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_16252)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_16252 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_16252)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_16252 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_16252)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_16252 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_16252)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_16252 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_16252)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_16252 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_16252)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_16252 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_16252 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_16252> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_16252> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_16252 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_16252OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CommitTask_16252_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CommitTask_16252_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_16252.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_CommitTask_16252.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_CommitTask_16252_descriptor;
         }

         public S2C_CommitTask_16252 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_CommitTask_16252.getDefaultInstance();
         }

         public S2C_CommitTask_16252 build() {
            S2C_CommitTask_16252 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_16252 buildPartial() {
            S2C_CommitTask_16252 result = new S2C_CommitTask_16252(this);
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
            if (other instanceof S2C_CommitTask_16252) {
               return this.mergeFrom((S2C_CommitTask_16252)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_16252 other) {
            if (other == EastWarRotateMsg.S2C_CommitTask_16252.getDefaultInstance()) {
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
            S2C_CommitTask_16252 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_16252)EastWarRotateMsg.S2C_CommitTask_16252.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_16252)e.getUnfinishedMessage();
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

   public static final class C2S_EastWarTasks_16253 extends GeneratedMessageV3 implements C2S_EastWarTasks_16253OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_EastWarTasks_16253 DEFAULT_INSTANCE = new C2S_EastWarTasks_16253();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EastWarTasks_16253> PARSER = new AbstractParser<C2S_EastWarTasks_16253>() {
         public C2S_EastWarTasks_16253 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EastWarTasks_16253(input, extensionRegistry);
         }
      };

      private C2S_EastWarTasks_16253(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EastWarTasks_16253() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EastWarTasks_16253();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EastWarTasks_16253(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_EastWarTasks_16253_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_EastWarTasks_16253_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EastWarTasks_16253.class, Builder.class);
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
         } else if (!(obj instanceof C2S_EastWarTasks_16253)) {
            return super.equals(obj);
         } else {
            C2S_EastWarTasks_16253 other = (C2S_EastWarTasks_16253)obj;
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

      public static C2S_EastWarTasks_16253 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_16253)PARSER.parseFrom(data);
      }

      public static C2S_EastWarTasks_16253 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_16253)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EastWarTasks_16253 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_16253)PARSER.parseFrom(data);
      }

      public static C2S_EastWarTasks_16253 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_16253)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EastWarTasks_16253 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_16253)PARSER.parseFrom(data);
      }

      public static C2S_EastWarTasks_16253 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EastWarTasks_16253)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EastWarTasks_16253 parseFrom(InputStream input) throws IOException {
         return (C2S_EastWarTasks_16253)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EastWarTasks_16253 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EastWarTasks_16253)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EastWarTasks_16253 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EastWarTasks_16253)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EastWarTasks_16253 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EastWarTasks_16253)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EastWarTasks_16253 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EastWarTasks_16253)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EastWarTasks_16253 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EastWarTasks_16253)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EastWarTasks_16253 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EastWarTasks_16253 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EastWarTasks_16253> parser() {
         return PARSER;
      }

      public Parser<C2S_EastWarTasks_16253> getParserForType() {
         return PARSER;
      }

      public C2S_EastWarTasks_16253 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EastWarTasks_16253OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_EastWarTasks_16253_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_EastWarTasks_16253_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EastWarTasks_16253.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_EastWarTasks_16253.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_EastWarTasks_16253_descriptor;
         }

         public C2S_EastWarTasks_16253 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_EastWarTasks_16253.getDefaultInstance();
         }

         public C2S_EastWarTasks_16253 build() {
            C2S_EastWarTasks_16253 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EastWarTasks_16253 buildPartial() {
            C2S_EastWarTasks_16253 result = new C2S_EastWarTasks_16253(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_EastWarTasks_16253) {
               return this.mergeFrom((C2S_EastWarTasks_16253)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EastWarTasks_16253 other) {
            if (other == EastWarRotateMsg.C2S_EastWarTasks_16253.getDefaultInstance()) {
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
            C2S_EastWarTasks_16253 parsedMessage = null;

            try {
               parsedMessage = (C2S_EastWarTasks_16253)EastWarRotateMsg.C2S_EastWarTasks_16253.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EastWarTasks_16253)e.getUnfinishedMessage();
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

   public static final class S2C_EastWarTasks_16254 extends GeneratedMessageV3 implements S2C_EastWarTasks_16254OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_EastWarTasks_16254 DEFAULT_INSTANCE = new S2C_EastWarTasks_16254();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EastWarTasks_16254> PARSER = new AbstractParser<S2C_EastWarTasks_16254>() {
         public S2C_EastWarTasks_16254 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EastWarTasks_16254(input, extensionRegistry);
         }
      };

      private S2C_EastWarTasks_16254(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EastWarTasks_16254() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EastWarTasks_16254();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EastWarTasks_16254(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_EastWarTasks_16254_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_EastWarTasks_16254_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EastWarTasks_16254.class, Builder.class);
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
         } else if (!(obj instanceof S2C_EastWarTasks_16254)) {
            return super.equals(obj);
         } else {
            S2C_EastWarTasks_16254 other = (S2C_EastWarTasks_16254)obj;
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

      public static S2C_EastWarTasks_16254 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_16254)PARSER.parseFrom(data);
      }

      public static S2C_EastWarTasks_16254 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_16254)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EastWarTasks_16254 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_16254)PARSER.parseFrom(data);
      }

      public static S2C_EastWarTasks_16254 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_16254)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EastWarTasks_16254 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_16254)PARSER.parseFrom(data);
      }

      public static S2C_EastWarTasks_16254 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EastWarTasks_16254)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EastWarTasks_16254 parseFrom(InputStream input) throws IOException {
         return (S2C_EastWarTasks_16254)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EastWarTasks_16254 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EastWarTasks_16254)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EastWarTasks_16254 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EastWarTasks_16254)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EastWarTasks_16254 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EastWarTasks_16254)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EastWarTasks_16254 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EastWarTasks_16254)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EastWarTasks_16254 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EastWarTasks_16254)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EastWarTasks_16254 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EastWarTasks_16254 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EastWarTasks_16254> parser() {
         return PARSER;
      }

      public Parser<S2C_EastWarTasks_16254> getParserForType() {
         return PARSER;
      }

      public S2C_EastWarTasks_16254 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EastWarTasks_16254OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_EastWarTasks_16254_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_EastWarTasks_16254_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EastWarTasks_16254.class, Builder.class);
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
            if (EastWarRotateMsg.S2C_EastWarTasks_16254.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_EastWarTasks_16254_descriptor;
         }

         public S2C_EastWarTasks_16254 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_EastWarTasks_16254.getDefaultInstance();
         }

         public S2C_EastWarTasks_16254 build() {
            S2C_EastWarTasks_16254 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EastWarTasks_16254 buildPartial() {
            S2C_EastWarTasks_16254 result = new S2C_EastWarTasks_16254(this);
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
            if (other instanceof S2C_EastWarTasks_16254) {
               return this.mergeFrom((S2C_EastWarTasks_16254)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EastWarTasks_16254 other) {
            if (other == EastWarRotateMsg.S2C_EastWarTasks_16254.getDefaultInstance()) {
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
                     this.taskBuilder_ = EastWarRotateMsg.S2C_EastWarTasks_16254.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_EastWarTasks_16254 parsedMessage = null;

            try {
               parsedMessage = (S2C_EastWarTasks_16254)EastWarRotateMsg.S2C_EastWarTasks_16254.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EastWarTasks_16254)e.getUnfinishedMessage();
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

   public static final class S2C_UpdateTasks_16256 extends GeneratedMessageV3 implements S2C_UpdateTasks_16256OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateTasks_16256 DEFAULT_INSTANCE = new S2C_UpdateTasks_16256();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateTasks_16256> PARSER = new AbstractParser<S2C_UpdateTasks_16256>() {
         public S2C_UpdateTasks_16256 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateTasks_16256(input, extensionRegistry);
         }
      };

      private S2C_UpdateTasks_16256(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateTasks_16256() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateTasks_16256();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateTasks_16256(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_UpdateTasks_16256_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_UpdateTasks_16256_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTasks_16256.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UpdateTasks_16256)) {
            return super.equals(obj);
         } else {
            S2C_UpdateTasks_16256 other = (S2C_UpdateTasks_16256)obj;
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

      public static S2C_UpdateTasks_16256 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_16256)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_16256 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_16256)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_16256 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_16256)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_16256 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_16256)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_16256 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_16256)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_16256 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_16256)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_16256 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateTasks_16256)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_16256 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_16256)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTasks_16256 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateTasks_16256)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_16256 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_16256)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTasks_16256 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateTasks_16256)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_16256 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_16256)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateTasks_16256 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateTasks_16256 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateTasks_16256> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateTasks_16256> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateTasks_16256 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateTasks_16256OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_UpdateTasks_16256_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_UpdateTasks_16256_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTasks_16256.class, Builder.class);
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
            if (EastWarRotateMsg.S2C_UpdateTasks_16256.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_UpdateTasks_16256_descriptor;
         }

         public S2C_UpdateTasks_16256 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_UpdateTasks_16256.getDefaultInstance();
         }

         public S2C_UpdateTasks_16256 build() {
            S2C_UpdateTasks_16256 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateTasks_16256 buildPartial() {
            S2C_UpdateTasks_16256 result = new S2C_UpdateTasks_16256(this);
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
            if (other instanceof S2C_UpdateTasks_16256) {
               return this.mergeFrom((S2C_UpdateTasks_16256)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateTasks_16256 other) {
            if (other == EastWarRotateMsg.S2C_UpdateTasks_16256.getDefaultInstance()) {
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
                     this.taskBuilder_ = EastWarRotateMsg.S2C_UpdateTasks_16256.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_UpdateTasks_16256 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateTasks_16256)EastWarRotateMsg.S2C_UpdateTasks_16256.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateTasks_16256)e.getUnfinishedMessage();
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

   public static final class C2S_LaborOpenServerRank_16257 extends GeneratedMessageV3 implements C2S_LaborOpenServerRank_16257OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LaborOpenServerRank_16257 DEFAULT_INSTANCE = new C2S_LaborOpenServerRank_16257();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LaborOpenServerRank_16257> PARSER = new AbstractParser<C2S_LaborOpenServerRank_16257>() {
         public C2S_LaborOpenServerRank_16257 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LaborOpenServerRank_16257(input, extensionRegistry);
         }
      };

      private C2S_LaborOpenServerRank_16257(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LaborOpenServerRank_16257() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LaborOpenServerRank_16257();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LaborOpenServerRank_16257(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_LaborOpenServerRank_16257_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_LaborOpenServerRank_16257_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LaborOpenServerRank_16257.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LaborOpenServerRank_16257)) {
            return super.equals(obj);
         } else {
            C2S_LaborOpenServerRank_16257 other = (C2S_LaborOpenServerRank_16257)obj;
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

      public static C2S_LaborOpenServerRank_16257 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_16257)PARSER.parseFrom(data);
      }

      public static C2S_LaborOpenServerRank_16257 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_16257)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_16257 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_16257)PARSER.parseFrom(data);
      }

      public static C2S_LaborOpenServerRank_16257 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_16257)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_16257 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_16257)PARSER.parseFrom(data);
      }

      public static C2S_LaborOpenServerRank_16257 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_16257)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_16257 parseFrom(InputStream input) throws IOException {
         return (C2S_LaborOpenServerRank_16257)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LaborOpenServerRank_16257 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LaborOpenServerRank_16257)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_16257 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LaborOpenServerRank_16257)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LaborOpenServerRank_16257 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LaborOpenServerRank_16257)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_16257 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LaborOpenServerRank_16257)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LaborOpenServerRank_16257 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LaborOpenServerRank_16257)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LaborOpenServerRank_16257 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LaborOpenServerRank_16257 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LaborOpenServerRank_16257> parser() {
         return PARSER;
      }

      public Parser<C2S_LaborOpenServerRank_16257> getParserForType() {
         return PARSER;
      }

      public C2S_LaborOpenServerRank_16257 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LaborOpenServerRank_16257OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_LaborOpenServerRank_16257_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_LaborOpenServerRank_16257_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LaborOpenServerRank_16257.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_LaborOpenServerRank_16257.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_LaborOpenServerRank_16257_descriptor;
         }

         public C2S_LaborOpenServerRank_16257 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_LaborOpenServerRank_16257.getDefaultInstance();
         }

         public C2S_LaborOpenServerRank_16257 build() {
            C2S_LaborOpenServerRank_16257 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LaborOpenServerRank_16257 buildPartial() {
            C2S_LaborOpenServerRank_16257 result = new C2S_LaborOpenServerRank_16257(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LaborOpenServerRank_16257) {
               return this.mergeFrom((C2S_LaborOpenServerRank_16257)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LaborOpenServerRank_16257 other) {
            if (other == EastWarRotateMsg.C2S_LaborOpenServerRank_16257.getDefaultInstance()) {
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
            C2S_LaborOpenServerRank_16257 parsedMessage = null;

            try {
               parsedMessage = (C2S_LaborOpenServerRank_16257)EastWarRotateMsg.C2S_LaborOpenServerRank_16257.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LaborOpenServerRank_16257)e.getUnfinishedMessage();
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

   public static final class S2C_LaborOpenServerRank_16258 extends GeneratedMessageV3 implements S2C_LaborOpenServerRank_16258OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int TIME_FIELD_NUMBER = 3;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2C_LaborOpenServerRank_16258 DEFAULT_INSTANCE = new S2C_LaborOpenServerRank_16258();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LaborOpenServerRank_16258> PARSER = new AbstractParser<S2C_LaborOpenServerRank_16258>() {
         public S2C_LaborOpenServerRank_16258 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LaborOpenServerRank_16258(input, extensionRegistry);
         }
      };

      private S2C_LaborOpenServerRank_16258(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LaborOpenServerRank_16258() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LaborOpenServerRank_16258();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LaborOpenServerRank_16258(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_LaborOpenServerRank_16258_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_LaborOpenServerRank_16258_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LaborOpenServerRank_16258.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LaborOpenServerRank_16258)) {
            return super.equals(obj);
         } else {
            S2C_LaborOpenServerRank_16258 other = (S2C_LaborOpenServerRank_16258)obj;
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

      public static S2C_LaborOpenServerRank_16258 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_16258)PARSER.parseFrom(data);
      }

      public static S2C_LaborOpenServerRank_16258 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_16258)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_16258 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_16258)PARSER.parseFrom(data);
      }

      public static S2C_LaborOpenServerRank_16258 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_16258)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_16258 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_16258)PARSER.parseFrom(data);
      }

      public static S2C_LaborOpenServerRank_16258 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_16258)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_16258 parseFrom(InputStream input) throws IOException {
         return (S2C_LaborOpenServerRank_16258)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LaborOpenServerRank_16258 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LaborOpenServerRank_16258)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_16258 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LaborOpenServerRank_16258)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LaborOpenServerRank_16258 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LaborOpenServerRank_16258)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_16258 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LaborOpenServerRank_16258)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LaborOpenServerRank_16258 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LaborOpenServerRank_16258)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LaborOpenServerRank_16258 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LaborOpenServerRank_16258 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LaborOpenServerRank_16258> parser() {
         return PARSER;
      }

      public Parser<S2C_LaborOpenServerRank_16258> getParserForType() {
         return PARSER;
      }

      public S2C_LaborOpenServerRank_16258 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LaborOpenServerRank_16258OrBuilder {
         private int bitField0_;
         private int type_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_LaborOpenServerRank_16258_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_LaborOpenServerRank_16258_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LaborOpenServerRank_16258.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_LaborOpenServerRank_16258.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_LaborOpenServerRank_16258_descriptor;
         }

         public S2C_LaborOpenServerRank_16258 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_LaborOpenServerRank_16258.getDefaultInstance();
         }

         public S2C_LaborOpenServerRank_16258 build() {
            S2C_LaborOpenServerRank_16258 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LaborOpenServerRank_16258 buildPartial() {
            S2C_LaborOpenServerRank_16258 result = new S2C_LaborOpenServerRank_16258(this);
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
            if (other instanceof S2C_LaborOpenServerRank_16258) {
               return this.mergeFrom((S2C_LaborOpenServerRank_16258)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LaborOpenServerRank_16258 other) {
            if (other == EastWarRotateMsg.S2C_LaborOpenServerRank_16258.getDefaultInstance()) {
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
            S2C_LaborOpenServerRank_16258 parsedMessage = null;

            try {
               parsedMessage = (S2C_LaborOpenServerRank_16258)EastWarRotateMsg.S2C_LaborOpenServerRank_16258.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LaborOpenServerRank_16258)e.getUnfinishedMessage();
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

   public static final class C2S_OpenServerRank_16259 extends GeneratedMessageV3 implements C2S_OpenServerRank_16259OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenServerRank_16259 DEFAULT_INSTANCE = new C2S_OpenServerRank_16259();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenServerRank_16259> PARSER = new AbstractParser<C2S_OpenServerRank_16259>() {
         public C2S_OpenServerRank_16259 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenServerRank_16259(input, extensionRegistry);
         }
      };

      private C2S_OpenServerRank_16259(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenServerRank_16259() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenServerRank_16259();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenServerRank_16259(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenServerRank_16259_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenServerRank_16259_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenServerRank_16259.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenServerRank_16259)) {
            return super.equals(obj);
         } else {
            C2S_OpenServerRank_16259 other = (C2S_OpenServerRank_16259)obj;
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

      public static C2S_OpenServerRank_16259 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_16259)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_16259 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_16259)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_16259 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_16259)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_16259 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_16259)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_16259 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_16259)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_16259 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_16259)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_16259 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenServerRank_16259)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_16259 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_16259)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenServerRank_16259 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenServerRank_16259)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_16259 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_16259)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenServerRank_16259 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenServerRank_16259)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_16259 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_16259)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenServerRank_16259 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenServerRank_16259 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenServerRank_16259> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenServerRank_16259> getParserForType() {
         return PARSER;
      }

      public C2S_OpenServerRank_16259 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenServerRank_16259OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenServerRank_16259_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenServerRank_16259_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenServerRank_16259.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.C2S_OpenServerRank_16259.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_C2S_OpenServerRank_16259_descriptor;
         }

         public C2S_OpenServerRank_16259 getDefaultInstanceForType() {
            return EastWarRotateMsg.C2S_OpenServerRank_16259.getDefaultInstance();
         }

         public C2S_OpenServerRank_16259 build() {
            C2S_OpenServerRank_16259 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenServerRank_16259 buildPartial() {
            C2S_OpenServerRank_16259 result = new C2S_OpenServerRank_16259(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenServerRank_16259) {
               return this.mergeFrom((C2S_OpenServerRank_16259)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenServerRank_16259 other) {
            if (other == EastWarRotateMsg.C2S_OpenServerRank_16259.getDefaultInstance()) {
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
            C2S_OpenServerRank_16259 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenServerRank_16259)EastWarRotateMsg.C2S_OpenServerRank_16259.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenServerRank_16259)e.getUnfinishedMessage();
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

   public static final class S2C_OpenServerRank_16260 extends GeneratedMessageV3 implements S2C_OpenServerRank_16260OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int TIME_FIELD_NUMBER = 3;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenServerRank_16260 DEFAULT_INSTANCE = new S2C_OpenServerRank_16260();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenServerRank_16260> PARSER = new AbstractParser<S2C_OpenServerRank_16260>() {
         public S2C_OpenServerRank_16260 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenServerRank_16260(input, extensionRegistry);
         }
      };

      private S2C_OpenServerRank_16260(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenServerRank_16260() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenServerRank_16260();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenServerRank_16260(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenServerRank_16260_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenServerRank_16260_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenServerRank_16260.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenServerRank_16260)) {
            return super.equals(obj);
         } else {
            S2C_OpenServerRank_16260 other = (S2C_OpenServerRank_16260)obj;
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

      public static S2C_OpenServerRank_16260 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_16260)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_16260 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_16260)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_16260 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_16260)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_16260 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_16260)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_16260 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_16260)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_16260 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_16260)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_16260 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenServerRank_16260)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_16260 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_16260)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenServerRank_16260 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenServerRank_16260)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_16260 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_16260)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenServerRank_16260 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenServerRank_16260)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_16260 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_16260)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenServerRank_16260 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenServerRank_16260 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenServerRank_16260> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenServerRank_16260> getParserForType() {
         return PARSER;
      }

      public S2C_OpenServerRank_16260 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenServerRank_16260OrBuilder {
         private int bitField0_;
         private int type_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenServerRank_16260_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenServerRank_16260_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenServerRank_16260.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EastWarRotateMsg.S2C_OpenServerRank_16260.alwaysUseFieldBuilders) {
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
            return EastWarRotateMsg.internal_static_eastWarRotate_com_gzbz_protobuf_S2C_OpenServerRank_16260_descriptor;
         }

         public S2C_OpenServerRank_16260 getDefaultInstanceForType() {
            return EastWarRotateMsg.S2C_OpenServerRank_16260.getDefaultInstance();
         }

         public S2C_OpenServerRank_16260 build() {
            S2C_OpenServerRank_16260 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenServerRank_16260 buildPartial() {
            S2C_OpenServerRank_16260 result = new S2C_OpenServerRank_16260(this);
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
            if (other instanceof S2C_OpenServerRank_16260) {
               return this.mergeFrom((S2C_OpenServerRank_16260)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenServerRank_16260 other) {
            if (other == EastWarRotateMsg.S2C_OpenServerRank_16260.getDefaultInstance()) {
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
            S2C_OpenServerRank_16260 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenServerRank_16260)EastWarRotateMsg.S2C_OpenServerRank_16260.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenServerRank_16260)e.getUnfinishedMessage();
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

   public interface C2S_Appointment_16221OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CoincidenceBox_16227OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Coincidence_16225OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CommitTask_16251OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_CumulativeId_16229OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawKey_16223OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Drink_16245OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_EastWarTasks_16253OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FreeDrinkNum_16247OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LaborOpenServerRank_16257OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_MakeWine_16241OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_OpenServerRank_16259OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenUi_16201OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OptionalGiftChoice_16213OrBuilder extends MessageOrBuilder {
      boolean hasCustomId();

      int getCustomId();

      List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList();

      ActivityMsg.CustomGiftBuyItemData getBuyData(int index);

      int getBuyDataCount();

      List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList();

      ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index);
   }

   public interface C2S_OptionalGift_16211OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TakePlumReward_16243OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Appointment_16222OrBuilder extends MessageOrBuilder {
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

   public interface S2C_CoincidenceBox_16228OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_Coincidence_16226OrBuilder extends MessageOrBuilder {
      boolean hasHadGetId();

      int getHadGetId();
   }

   public interface S2C_CommitTask_16252OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_CumulativeId_16230OrBuilder extends MessageOrBuilder {
      boolean hasTotalId();

      int getTotalId();
   }

   public interface S2C_DrawKey_16224OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_Drink_16246OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasFreeNum();

      int getFreeNum();
   }

   public interface S2C_EastWarTasks_16254OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_FreeDrinkNum_16248OrBuilder extends MessageOrBuilder {
      boolean hasFreeNum();

      int getFreeNum();

      boolean hasTotalWineNum();

      int getTotalWineNum();

      boolean hasIsTaked();

      boolean getIsTaked();
   }

   public interface S2C_LaborOpenServerRank_16258OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_MakeWine_16242OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTotalWineNum();

      int getTotalWineNum();
   }

   public interface S2C_OpenServerRank_16260OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_OpenUiResult_16202OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();
   }

   public interface S2C_OptionalGiftBuy_16216OrBuilder extends MessageOrBuilder {
      boolean hasGiftData();

      ActivityMsg.CustomGiftData getGiftData();

      ActivityMsg.CustomGiftDataOrBuilder getGiftDataOrBuilder();
   }

   public interface S2C_OptionalGiftChoice_16214OrBuilder extends MessageOrBuilder {
      boolean hasGiftData();

      ActivityMsg.CustomGiftData getGiftData();

      ActivityMsg.CustomGiftDataOrBuilder getGiftDataOrBuilder();
   }

   public interface S2C_OptionalGift_16212OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.CustomGiftData> getGiftListList();

      ActivityMsg.CustomGiftData getGiftList(int index);

      int getGiftListCount();

      List<? extends ActivityMsg.CustomGiftDataOrBuilder> getGiftListOrBuilderList();

      ActivityMsg.CustomGiftDataOrBuilder getGiftListOrBuilder(int index);
   }

   public interface S2C_TakePlumReward_16244OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_UpdateTasks_16256OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }
}
