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

public final class GreenPlumMsg {
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenUi_13501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenUi_13501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenUiResult_13502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenUiResult_13502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGift_13511_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGift_13511_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGift_13512_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGift_13512_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGiftChoice_13513_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGiftChoice_13513_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftChoice_13514_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftChoice_13514_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftBuy_13516_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftBuy_13516_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_Appointment_13521_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_Appointment_13521_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_Appointment_13522_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_Appointment_13522_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_DrawKey_13523_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_DrawKey_13523_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_DrawKey_13524_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_DrawKey_13524_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_Coincidence_13525_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_Coincidence_13525_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_Coincidence_13526_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_Coincidence_13526_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_CoincidenceBox_13527_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_CoincidenceBox_13527_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_CoincidenceBox_13528_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_CoincidenceBox_13528_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_CumulativeId_13529_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_CumulativeId_13529_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_CumulativeId_13530_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_CumulativeId_13530_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_MakeWine_13541_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_MakeWine_13541_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_MakeWine_13542_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_MakeWine_13542_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_TakePlumReward_13543_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_TakePlumReward_13543_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_TakePlumReward_13544_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_TakePlumReward_13544_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_Drink_13545_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_Drink_13545_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_Drink_13546_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_Drink_13546_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_FreeDrinkNum_13547_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_FreeDrinkNum_13547_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_FreeDrinkNum_13548_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_FreeDrinkNum_13548_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_CommitTask_13551_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_CommitTask_13551_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_CommitTask_13552_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_CommitTask_13552_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_GreenPlumTasks_13553_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_GreenPlumTasks_13553_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_GreenPlumTasks_13554_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_GreenPlumTasks_13554_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_UpdateTasks_13556_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_UpdateTasks_13556_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_LaborOpenServerRank_13557_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_LaborOpenServerRank_13557_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_LaborOpenServerRank_13558_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_LaborOpenServerRank_13558_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenServerRank_13559_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenServerRank_13559_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenServerRank_13560_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenServerRank_13560_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private GreenPlumMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fGreenPlum.proto\u0012\u001bgreenPlum.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"\u0012\n\u0010C2S_OpenUi_13501\"<\n\u0016S2C_OpenUiResult_13502\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_OptionalGift_13511\"V\n\u0016S2C_OptionalGift_13512\u0012<\n\bgiftList\u0018\u0001 \u0003(\u000b2*.activity.com.gzbz.protobuf.CustomGiftData\"t\n\u001cC2S_OptionalGiftChoice_13513\u0012\u0010\n\bcustomId\u0018\u0001 \u0002(\u0005\u0012B\n\u0007buyData\u0018\u0002 \u0003(\u000b21.activity.com.gzbz.protobuf.CustomGiftBuyItemData\"\\\n\u001cS2C_OptionalGiftChoice_13514\u0012<\n\bgiftData\u0018\u0001 \u0002(\u000b2*.activity.com.gzbz.protobuf.CustomGiftData\"Y\n\u0019S2C_OptionalGiftBuy_13516\u0012<\n\bgiftData\u0018\u0001 \u0002(\u000b2*.activity.com.gzbz.protobuf.CustomGiftData\"\u0017\n\u0015C2S_Appointment_13521\"k\n\u0015S2C_Appointment_13522\u0012\u0011\n\thadGetKey\u0018\u0001 \u0003(\u0005\u0012\u000f\n\u0007totalId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bhadGetId\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004boxs\u0018\u0004 \u0003(\u0005\u0012\u000e\n\u0006curDay\u0018\u0005 \u0002(\u0005\"\u001f\n\u0011C2S_DrawKey_13523\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u001f\n\u0011S2C_DrawKey_13524\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0017\n\u0015C2S_Coincidence_13525\")\n\u0015S2C_Coincidence_13526\u0012\u0010\n\bhadGetId\u0018\u0001 \u0002(\u0005\"&\n\u0018C2S_CoincidenceBox_13527\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"&\n\u0018S2C_CoincidenceBox_13528\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_CumulativeId_13529\")\n\u0016S2C_CumulativeId_13530\u0012\u000f\n\u0007totalId\u0018\u0001 \u0002(\u0005\"!\n\u0012C2S_MakeWine_13541\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\":\n\u0012S2C_MakeWine_13542\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0014\n\ftotalWineNum\u0018\u0002 \u0002(\u0005\"\u001a\n\u0018C2S_TakePlumReward_13543\"*\n\u0018S2C_TakePlumReward_13544\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u0011\n\u000fC2S_Drink_13545\"2\n\u000fS2C_Drink_13546\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007freeNum\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_FreeDrinkNum_13547\"P\n\u0016S2C_FreeDrinkNum_13548\u0012\u000f\n\u0007freeNum\u0018\u0001 \u0002(\u0005\u0012\u0014\n\ftotalWineNum\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007isTaked\u0018\u0003 \u0002(\b\"&\n\u0014C2S_CommitTask_13551\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_CommitTask_13552\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"\u001a\n\u0018C2S_GreenPlumTasks_13553\"6\n\u0018S2C_GreenPlumTasks_13554\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"3\n\u0015S2C_UpdateTasks_13556\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"\u001f\n\u001dC2S_LaborOpenServerRank_13557\";\n\u001dS2C_LaborOpenServerRank_13558\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004time\u0018\u0003 \u0001(\u0005\"\u001a\n\u0018C2S_OpenServerRank_13559\"6\n\u0018S2C_OpenServerRank_13560\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004time\u0018\u0003 \u0001(\u0005B#\n\u0011com.gzbz.protobufB\fGreenPlumMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenUi_13501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenUi_13501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenUi_13501_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenUiResult_13502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenUiResult_13502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenUiResult_13502_descriptor, new String[]{"StartTime", "EndTime"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGift_13511_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGift_13511_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGift_13511_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGift_13512_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGift_13512_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGift_13512_descriptor, new String[]{"GiftList"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGiftChoice_13513_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGiftChoice_13513_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGiftChoice_13513_descriptor, new String[]{"CustomId", "BuyData"});
      internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftChoice_13514_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftChoice_13514_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftChoice_13514_descriptor, new String[]{"GiftData"});
      internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftBuy_13516_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftBuy_13516_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftBuy_13516_descriptor, new String[]{"GiftData"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_Appointment_13521_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_Appointment_13521_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_Appointment_13521_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_Appointment_13522_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_Appointment_13522_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_Appointment_13522_descriptor, new String[]{"HadGetKey", "TotalId", "HadGetId", "Boxs", "CurDay"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_DrawKey_13523_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_DrawKey_13523_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_DrawKey_13523_descriptor, new String[]{"Id"});
      internal_static_greenPlum_com_gzbz_protobuf_S2C_DrawKey_13524_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_DrawKey_13524_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_DrawKey_13524_descriptor, new String[]{"Id"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_Coincidence_13525_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_Coincidence_13525_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_Coincidence_13525_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_Coincidence_13526_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_Coincidence_13526_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_Coincidence_13526_descriptor, new String[]{"HadGetId"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_CoincidenceBox_13527_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_CoincidenceBox_13527_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_CoincidenceBox_13527_descriptor, new String[]{"Id"});
      internal_static_greenPlum_com_gzbz_protobuf_S2C_CoincidenceBox_13528_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_CoincidenceBox_13528_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_CoincidenceBox_13528_descriptor, new String[]{"Id"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_CumulativeId_13529_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_CumulativeId_13529_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_CumulativeId_13529_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_CumulativeId_13530_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_CumulativeId_13530_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_CumulativeId_13530_descriptor, new String[]{"TotalId"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_MakeWine_13541_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_MakeWine_13541_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_MakeWine_13541_descriptor, new String[]{"Num"});
      internal_static_greenPlum_com_gzbz_protobuf_S2C_MakeWine_13542_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_MakeWine_13542_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_MakeWine_13542_descriptor, new String[]{"Result", "TotalWineNum"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_TakePlumReward_13543_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_TakePlumReward_13543_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_TakePlumReward_13543_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_TakePlumReward_13544_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_TakePlumReward_13544_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_TakePlumReward_13544_descriptor, new String[]{"Result"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_Drink_13545_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_Drink_13545_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_Drink_13545_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_Drink_13546_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_Drink_13546_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_Drink_13546_descriptor, new String[]{"Result", "FreeNum"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_FreeDrinkNum_13547_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_FreeDrinkNum_13547_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_FreeDrinkNum_13547_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_FreeDrinkNum_13548_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_FreeDrinkNum_13548_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_FreeDrinkNum_13548_descriptor, new String[]{"FreeNum", "TotalWineNum", "IsTaked"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_CommitTask_13551_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_CommitTask_13551_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_CommitTask_13551_descriptor, new String[]{"TaskId"});
      internal_static_greenPlum_com_gzbz_protobuf_S2C_CommitTask_13552_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_CommitTask_13552_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_CommitTask_13552_descriptor, new String[]{"TaskId"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_GreenPlumTasks_13553_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_GreenPlumTasks_13553_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_GreenPlumTasks_13553_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_GreenPlumTasks_13554_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_GreenPlumTasks_13554_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_GreenPlumTasks_13554_descriptor, new String[]{"Task"});
      internal_static_greenPlum_com_gzbz_protobuf_S2C_UpdateTasks_13556_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_UpdateTasks_13556_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_UpdateTasks_13556_descriptor, new String[]{"Task"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_LaborOpenServerRank_13557_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_LaborOpenServerRank_13557_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_LaborOpenServerRank_13557_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_LaborOpenServerRank_13558_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_LaborOpenServerRank_13558_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_LaborOpenServerRank_13558_descriptor, new String[]{"Type", "Time"});
      internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenServerRank_13559_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenServerRank_13559_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenServerRank_13559_descriptor, new String[0]);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenServerRank_13560_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenServerRank_13560_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenServerRank_13560_descriptor, new String[]{"Type", "Time"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_OpenUi_13501 extends GeneratedMessageV3 implements C2S_OpenUi_13501OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenUi_13501 DEFAULT_INSTANCE = new C2S_OpenUi_13501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenUi_13501> PARSER = new AbstractParser<C2S_OpenUi_13501>() {
         public C2S_OpenUi_13501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenUi_13501(input, extensionRegistry);
         }
      };

      private C2S_OpenUi_13501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenUi_13501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenUi_13501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenUi_13501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenUi_13501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenUi_13501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_13501.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenUi_13501)) {
            return super.equals(obj);
         } else {
            C2S_OpenUi_13501 other = (C2S_OpenUi_13501)obj;
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

      public static C2S_OpenUi_13501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13501)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_13501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_13501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13501)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_13501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_13501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13501)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_13501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_13501 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_13501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_13501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_13501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_13501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_13501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_13501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_13501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_13501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenUi_13501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_13501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_13501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenUi_13501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenUi_13501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenUi_13501> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenUi_13501> getParserForType() {
         return PARSER;
      }

      public C2S_OpenUi_13501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenUi_13501OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenUi_13501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenUi_13501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_13501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_OpenUi_13501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenUi_13501_descriptor;
         }

         public C2S_OpenUi_13501 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_OpenUi_13501.getDefaultInstance();
         }

         public C2S_OpenUi_13501 build() {
            C2S_OpenUi_13501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenUi_13501 buildPartial() {
            C2S_OpenUi_13501 result = new C2S_OpenUi_13501(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenUi_13501) {
               return this.mergeFrom((C2S_OpenUi_13501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenUi_13501 other) {
            if (other == GreenPlumMsg.C2S_OpenUi_13501.getDefaultInstance()) {
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
            C2S_OpenUi_13501 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenUi_13501)GreenPlumMsg.C2S_OpenUi_13501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenUi_13501)e.getUnfinishedMessage();
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

   public static final class S2C_OpenUiResult_13502 extends GeneratedMessageV3 implements S2C_OpenUiResult_13502OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenUiResult_13502 DEFAULT_INSTANCE = new S2C_OpenUiResult_13502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenUiResult_13502> PARSER = new AbstractParser<S2C_OpenUiResult_13502>() {
         public S2C_OpenUiResult_13502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenUiResult_13502(input, extensionRegistry);
         }
      };

      private S2C_OpenUiResult_13502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenUiResult_13502() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenUiResult_13502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenUiResult_13502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenUiResult_13502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenUiResult_13502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_13502.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenUiResult_13502)) {
            return super.equals(obj);
         } else {
            S2C_OpenUiResult_13502 other = (S2C_OpenUiResult_13502)obj;
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

      public static S2C_OpenUiResult_13502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_13502)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_13502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_13502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_13502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_13502)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_13502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_13502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_13502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_13502)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_13502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_13502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_13502 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_13502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_13502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_13502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_13502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_13502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_13502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_13502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_13502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenUiResult_13502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_13502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_13502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenUiResult_13502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenUiResult_13502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenUiResult_13502> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenUiResult_13502> getParserForType() {
         return PARSER;
      }

      public S2C_OpenUiResult_13502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenUiResult_13502OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenUiResult_13502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenUiResult_13502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_13502.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_OpenUiResult_13502.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenUiResult_13502_descriptor;
         }

         public S2C_OpenUiResult_13502 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_OpenUiResult_13502.getDefaultInstance();
         }

         public S2C_OpenUiResult_13502 build() {
            S2C_OpenUiResult_13502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenUiResult_13502 buildPartial() {
            S2C_OpenUiResult_13502 result = new S2C_OpenUiResult_13502(this);
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
            if (other instanceof S2C_OpenUiResult_13502) {
               return this.mergeFrom((S2C_OpenUiResult_13502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenUiResult_13502 other) {
            if (other == GreenPlumMsg.S2C_OpenUiResult_13502.getDefaultInstance()) {
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
            S2C_OpenUiResult_13502 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenUiResult_13502)GreenPlumMsg.S2C_OpenUiResult_13502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenUiResult_13502)e.getUnfinishedMessage();
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

   public static final class C2S_OptionalGift_13511 extends GeneratedMessageV3 implements C2S_OptionalGift_13511OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OptionalGift_13511 DEFAULT_INSTANCE = new C2S_OptionalGift_13511();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OptionalGift_13511> PARSER = new AbstractParser<C2S_OptionalGift_13511>() {
         public C2S_OptionalGift_13511 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OptionalGift_13511(input, extensionRegistry);
         }
      };

      private C2S_OptionalGift_13511(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OptionalGift_13511() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OptionalGift_13511();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OptionalGift_13511(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGift_13511_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGift_13511_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGift_13511.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OptionalGift_13511)) {
            return super.equals(obj);
         } else {
            C2S_OptionalGift_13511 other = (C2S_OptionalGift_13511)obj;
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

      public static C2S_OptionalGift_13511 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_13511)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGift_13511 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_13511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGift_13511 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_13511)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGift_13511 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_13511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGift_13511 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_13511)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGift_13511 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGift_13511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGift_13511 parseFrom(InputStream input) throws IOException {
         return (C2S_OptionalGift_13511)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGift_13511 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGift_13511)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGift_13511 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OptionalGift_13511)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OptionalGift_13511 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGift_13511)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGift_13511 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OptionalGift_13511)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGift_13511 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGift_13511)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OptionalGift_13511 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OptionalGift_13511 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OptionalGift_13511> parser() {
         return PARSER;
      }

      public Parser<C2S_OptionalGift_13511> getParserForType() {
         return PARSER;
      }

      public C2S_OptionalGift_13511 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OptionalGift_13511OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGift_13511_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGift_13511_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGift_13511.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_OptionalGift_13511.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGift_13511_descriptor;
         }

         public C2S_OptionalGift_13511 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_OptionalGift_13511.getDefaultInstance();
         }

         public C2S_OptionalGift_13511 build() {
            C2S_OptionalGift_13511 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OptionalGift_13511 buildPartial() {
            C2S_OptionalGift_13511 result = new C2S_OptionalGift_13511(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OptionalGift_13511) {
               return this.mergeFrom((C2S_OptionalGift_13511)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OptionalGift_13511 other) {
            if (other == GreenPlumMsg.C2S_OptionalGift_13511.getDefaultInstance()) {
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
            C2S_OptionalGift_13511 parsedMessage = null;

            try {
               parsedMessage = (C2S_OptionalGift_13511)GreenPlumMsg.C2S_OptionalGift_13511.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OptionalGift_13511)e.getUnfinishedMessage();
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

   public static final class S2C_OptionalGift_13512 extends GeneratedMessageV3 implements S2C_OptionalGift_13512OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GIFTLIST_FIELD_NUMBER = 1;
      private List<ActivityMsg.CustomGiftData> giftList_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionalGift_13512 DEFAULT_INSTANCE = new S2C_OptionalGift_13512();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionalGift_13512> PARSER = new AbstractParser<S2C_OptionalGift_13512>() {
         public S2C_OptionalGift_13512 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionalGift_13512(input, extensionRegistry);
         }
      };

      private S2C_OptionalGift_13512(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionalGift_13512() {
         this.memoizedIsInitialized = -1;
         this.giftList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionalGift_13512();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionalGift_13512(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGift_13512_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGift_13512_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGift_13512.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OptionalGift_13512)) {
            return super.equals(obj);
         } else {
            S2C_OptionalGift_13512 other = (S2C_OptionalGift_13512)obj;
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

      public static S2C_OptionalGift_13512 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_13512)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGift_13512 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_13512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGift_13512 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_13512)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGift_13512 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_13512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGift_13512 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_13512)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGift_13512 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGift_13512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGift_13512 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionalGift_13512)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGift_13512 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGift_13512)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGift_13512 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionalGift_13512)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionalGift_13512 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGift_13512)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGift_13512 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionalGift_13512)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGift_13512 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGift_13512)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionalGift_13512 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionalGift_13512 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionalGift_13512> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionalGift_13512> getParserForType() {
         return PARSER;
      }

      public S2C_OptionalGift_13512 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionalGift_13512OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.CustomGiftData> giftList_;
         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> giftListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGift_13512_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGift_13512_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGift_13512.class, Builder.class);
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
            if (GreenPlumMsg.S2C_OptionalGift_13512.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGift_13512_descriptor;
         }

         public S2C_OptionalGift_13512 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_OptionalGift_13512.getDefaultInstance();
         }

         public S2C_OptionalGift_13512 build() {
            S2C_OptionalGift_13512 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionalGift_13512 buildPartial() {
            S2C_OptionalGift_13512 result = new S2C_OptionalGift_13512(this);
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
            if (other instanceof S2C_OptionalGift_13512) {
               return this.mergeFrom((S2C_OptionalGift_13512)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionalGift_13512 other) {
            if (other == GreenPlumMsg.S2C_OptionalGift_13512.getDefaultInstance()) {
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
                     this.giftListBuilder_ = GreenPlumMsg.S2C_OptionalGift_13512.alwaysUseFieldBuilders ? this.getGiftListFieldBuilder() : null;
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
            S2C_OptionalGift_13512 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionalGift_13512)GreenPlumMsg.S2C_OptionalGift_13512.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionalGift_13512)e.getUnfinishedMessage();
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

   public static final class C2S_OptionalGiftChoice_13513 extends GeneratedMessageV3 implements C2S_OptionalGiftChoice_13513OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CUSTOMID_FIELD_NUMBER = 1;
      private int customId_;
      public static final int BUYDATA_FIELD_NUMBER = 2;
      private List<ActivityMsg.CustomGiftBuyItemData> buyData_;
      private byte memoizedIsInitialized;
      private static final C2S_OptionalGiftChoice_13513 DEFAULT_INSTANCE = new C2S_OptionalGiftChoice_13513();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OptionalGiftChoice_13513> PARSER = new AbstractParser<C2S_OptionalGiftChoice_13513>() {
         public C2S_OptionalGiftChoice_13513 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OptionalGiftChoice_13513(input, extensionRegistry);
         }
      };

      private C2S_OptionalGiftChoice_13513(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OptionalGiftChoice_13513() {
         this.memoizedIsInitialized = -1;
         this.buyData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OptionalGiftChoice_13513();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OptionalGiftChoice_13513(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGiftChoice_13513_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGiftChoice_13513_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGiftChoice_13513.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OptionalGiftChoice_13513)) {
            return super.equals(obj);
         } else {
            C2S_OptionalGiftChoice_13513 other = (C2S_OptionalGiftChoice_13513)obj;
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

      public static C2S_OptionalGiftChoice_13513 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_13513)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftChoice_13513 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_13513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_13513 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_13513)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftChoice_13513 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_13513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_13513 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_13513)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftChoice_13513 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftChoice_13513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_13513 parseFrom(InputStream input) throws IOException {
         return (C2S_OptionalGiftChoice_13513)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftChoice_13513 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftChoice_13513)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_13513 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OptionalGiftChoice_13513)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftChoice_13513 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftChoice_13513)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGiftChoice_13513 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OptionalGiftChoice_13513)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftChoice_13513 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftChoice_13513)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OptionalGiftChoice_13513 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OptionalGiftChoice_13513 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OptionalGiftChoice_13513> parser() {
         return PARSER;
      }

      public Parser<C2S_OptionalGiftChoice_13513> getParserForType() {
         return PARSER;
      }

      public C2S_OptionalGiftChoice_13513 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OptionalGiftChoice_13513OrBuilder {
         private int bitField0_;
         private int customId_;
         private List<ActivityMsg.CustomGiftBuyItemData> buyData_;
         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftBuyItemData, ActivityMsg.CustomGiftBuyItemData.Builder, ActivityMsg.CustomGiftBuyItemDataOrBuilder> buyDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGiftChoice_13513_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGiftChoice_13513_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGiftChoice_13513.class, Builder.class);
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
            if (GreenPlumMsg.C2S_OptionalGiftChoice_13513.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OptionalGiftChoice_13513_descriptor;
         }

         public C2S_OptionalGiftChoice_13513 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_OptionalGiftChoice_13513.getDefaultInstance();
         }

         public C2S_OptionalGiftChoice_13513 build() {
            C2S_OptionalGiftChoice_13513 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OptionalGiftChoice_13513 buildPartial() {
            C2S_OptionalGiftChoice_13513 result = new C2S_OptionalGiftChoice_13513(this);
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
            if (other instanceof C2S_OptionalGiftChoice_13513) {
               return this.mergeFrom((C2S_OptionalGiftChoice_13513)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OptionalGiftChoice_13513 other) {
            if (other == GreenPlumMsg.C2S_OptionalGiftChoice_13513.getDefaultInstance()) {
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
                     this.buyDataBuilder_ = GreenPlumMsg.C2S_OptionalGiftChoice_13513.alwaysUseFieldBuilders ? this.getBuyDataFieldBuilder() : null;
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
            C2S_OptionalGiftChoice_13513 parsedMessage = null;

            try {
               parsedMessage = (C2S_OptionalGiftChoice_13513)GreenPlumMsg.C2S_OptionalGiftChoice_13513.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OptionalGiftChoice_13513)e.getUnfinishedMessage();
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

   public static final class S2C_OptionalGiftChoice_13514 extends GeneratedMessageV3 implements S2C_OptionalGiftChoice_13514OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTDATA_FIELD_NUMBER = 1;
      private ActivityMsg.CustomGiftData giftData_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionalGiftChoice_13514 DEFAULT_INSTANCE = new S2C_OptionalGiftChoice_13514();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionalGiftChoice_13514> PARSER = new AbstractParser<S2C_OptionalGiftChoice_13514>() {
         public S2C_OptionalGiftChoice_13514 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionalGiftChoice_13514(input, extensionRegistry);
         }
      };

      private S2C_OptionalGiftChoice_13514(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionalGiftChoice_13514() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionalGiftChoice_13514();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionalGiftChoice_13514(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftChoice_13514_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftChoice_13514_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftChoice_13514.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OptionalGiftChoice_13514)) {
            return super.equals(obj);
         } else {
            S2C_OptionalGiftChoice_13514 other = (S2C_OptionalGiftChoice_13514)obj;
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

      public static S2C_OptionalGiftChoice_13514 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_13514)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftChoice_13514 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_13514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_13514 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_13514)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftChoice_13514 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_13514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_13514 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_13514)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftChoice_13514 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftChoice_13514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_13514 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftChoice_13514)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftChoice_13514 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftChoice_13514)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_13514 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftChoice_13514)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftChoice_13514 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftChoice_13514)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftChoice_13514 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionalGiftChoice_13514)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftChoice_13514 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftChoice_13514)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionalGiftChoice_13514 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionalGiftChoice_13514 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionalGiftChoice_13514> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionalGiftChoice_13514> getParserForType() {
         return PARSER;
      }

      public S2C_OptionalGiftChoice_13514 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionalGiftChoice_13514OrBuilder {
         private int bitField0_;
         private ActivityMsg.CustomGiftData giftData_;
         private SingleFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> giftDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftChoice_13514_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftChoice_13514_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftChoice_13514.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_OptionalGiftChoice_13514.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftChoice_13514_descriptor;
         }

         public S2C_OptionalGiftChoice_13514 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_OptionalGiftChoice_13514.getDefaultInstance();
         }

         public S2C_OptionalGiftChoice_13514 build() {
            S2C_OptionalGiftChoice_13514 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionalGiftChoice_13514 buildPartial() {
            S2C_OptionalGiftChoice_13514 result = new S2C_OptionalGiftChoice_13514(this);
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
            if (other instanceof S2C_OptionalGiftChoice_13514) {
               return this.mergeFrom((S2C_OptionalGiftChoice_13514)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionalGiftChoice_13514 other) {
            if (other == GreenPlumMsg.S2C_OptionalGiftChoice_13514.getDefaultInstance()) {
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
            S2C_OptionalGiftChoice_13514 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionalGiftChoice_13514)GreenPlumMsg.S2C_OptionalGiftChoice_13514.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionalGiftChoice_13514)e.getUnfinishedMessage();
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

   public static final class S2C_OptionalGiftBuy_13516 extends GeneratedMessageV3 implements S2C_OptionalGiftBuy_13516OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTDATA_FIELD_NUMBER = 1;
      private ActivityMsg.CustomGiftData giftData_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionalGiftBuy_13516 DEFAULT_INSTANCE = new S2C_OptionalGiftBuy_13516();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionalGiftBuy_13516> PARSER = new AbstractParser<S2C_OptionalGiftBuy_13516>() {
         public S2C_OptionalGiftBuy_13516 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionalGiftBuy_13516(input, extensionRegistry);
         }
      };

      private S2C_OptionalGiftBuy_13516(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionalGiftBuy_13516() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionalGiftBuy_13516();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionalGiftBuy_13516(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftBuy_13516_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftBuy_13516_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftBuy_13516.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OptionalGiftBuy_13516)) {
            return super.equals(obj);
         } else {
            S2C_OptionalGiftBuy_13516 other = (S2C_OptionalGiftBuy_13516)obj;
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

      public static S2C_OptionalGiftBuy_13516 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_13516)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_13516 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_13516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_13516 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_13516)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_13516 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_13516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_13516 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_13516)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_13516 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_13516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_13516 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_13516)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_13516 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_13516)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_13516 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_13516)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_13516 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_13516)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_13516 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_13516)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_13516 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_13516)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionalGiftBuy_13516 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionalGiftBuy_13516 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionalGiftBuy_13516> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionalGiftBuy_13516> getParserForType() {
         return PARSER;
      }

      public S2C_OptionalGiftBuy_13516 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionalGiftBuy_13516OrBuilder {
         private int bitField0_;
         private ActivityMsg.CustomGiftData giftData_;
         private SingleFieldBuilderV3<ActivityMsg.CustomGiftData, ActivityMsg.CustomGiftData.Builder, ActivityMsg.CustomGiftDataOrBuilder> giftDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftBuy_13516_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftBuy_13516_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftBuy_13516.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_OptionalGiftBuy_13516.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OptionalGiftBuy_13516_descriptor;
         }

         public S2C_OptionalGiftBuy_13516 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_OptionalGiftBuy_13516.getDefaultInstance();
         }

         public S2C_OptionalGiftBuy_13516 build() {
            S2C_OptionalGiftBuy_13516 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionalGiftBuy_13516 buildPartial() {
            S2C_OptionalGiftBuy_13516 result = new S2C_OptionalGiftBuy_13516(this);
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
            if (other instanceof S2C_OptionalGiftBuy_13516) {
               return this.mergeFrom((S2C_OptionalGiftBuy_13516)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionalGiftBuy_13516 other) {
            if (other == GreenPlumMsg.S2C_OptionalGiftBuy_13516.getDefaultInstance()) {
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
            S2C_OptionalGiftBuy_13516 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionalGiftBuy_13516)GreenPlumMsg.S2C_OptionalGiftBuy_13516.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionalGiftBuy_13516)e.getUnfinishedMessage();
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

   public static final class C2S_Appointment_13521 extends GeneratedMessageV3 implements C2S_Appointment_13521OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Appointment_13521 DEFAULT_INSTANCE = new C2S_Appointment_13521();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Appointment_13521> PARSER = new AbstractParser<C2S_Appointment_13521>() {
         public C2S_Appointment_13521 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Appointment_13521(input, extensionRegistry);
         }
      };

      private C2S_Appointment_13521(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Appointment_13521() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Appointment_13521();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Appointment_13521(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Appointment_13521_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Appointment_13521_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Appointment_13521.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Appointment_13521)) {
            return super.equals(obj);
         } else {
            C2S_Appointment_13521 other = (C2S_Appointment_13521)obj;
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

      public static C2S_Appointment_13521 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Appointment_13521)PARSER.parseFrom(data);
      }

      public static C2S_Appointment_13521 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Appointment_13521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Appointment_13521 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Appointment_13521)PARSER.parseFrom(data);
      }

      public static C2S_Appointment_13521 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Appointment_13521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Appointment_13521 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Appointment_13521)PARSER.parseFrom(data);
      }

      public static C2S_Appointment_13521 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Appointment_13521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Appointment_13521 parseFrom(InputStream input) throws IOException {
         return (C2S_Appointment_13521)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Appointment_13521 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Appointment_13521)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Appointment_13521 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Appointment_13521)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Appointment_13521 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Appointment_13521)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Appointment_13521 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Appointment_13521)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Appointment_13521 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Appointment_13521)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Appointment_13521 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Appointment_13521 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Appointment_13521> parser() {
         return PARSER;
      }

      public Parser<C2S_Appointment_13521> getParserForType() {
         return PARSER;
      }

      public C2S_Appointment_13521 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Appointment_13521OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Appointment_13521_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Appointment_13521_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Appointment_13521.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_Appointment_13521.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Appointment_13521_descriptor;
         }

         public C2S_Appointment_13521 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_Appointment_13521.getDefaultInstance();
         }

         public C2S_Appointment_13521 build() {
            C2S_Appointment_13521 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Appointment_13521 buildPartial() {
            C2S_Appointment_13521 result = new C2S_Appointment_13521(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Appointment_13521) {
               return this.mergeFrom((C2S_Appointment_13521)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Appointment_13521 other) {
            if (other == GreenPlumMsg.C2S_Appointment_13521.getDefaultInstance()) {
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
            C2S_Appointment_13521 parsedMessage = null;

            try {
               parsedMessage = (C2S_Appointment_13521)GreenPlumMsg.C2S_Appointment_13521.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Appointment_13521)e.getUnfinishedMessage();
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

   public static final class S2C_Appointment_13522 extends GeneratedMessageV3 implements S2C_Appointment_13522OrBuilder {
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
      private static final S2C_Appointment_13522 DEFAULT_INSTANCE = new S2C_Appointment_13522();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Appointment_13522> PARSER = new AbstractParser<S2C_Appointment_13522>() {
         public S2C_Appointment_13522 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Appointment_13522(input, extensionRegistry);
         }
      };

      private S2C_Appointment_13522(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Appointment_13522() {
         this.memoizedIsInitialized = -1;
         this.hadGetKey_ = emptyIntList();
         this.boxs_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Appointment_13522();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Appointment_13522(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Appointment_13522_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Appointment_13522_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Appointment_13522.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Appointment_13522)) {
            return super.equals(obj);
         } else {
            S2C_Appointment_13522 other = (S2C_Appointment_13522)obj;
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

      public static S2C_Appointment_13522 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Appointment_13522)PARSER.parseFrom(data);
      }

      public static S2C_Appointment_13522 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Appointment_13522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Appointment_13522 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Appointment_13522)PARSER.parseFrom(data);
      }

      public static S2C_Appointment_13522 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Appointment_13522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Appointment_13522 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Appointment_13522)PARSER.parseFrom(data);
      }

      public static S2C_Appointment_13522 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Appointment_13522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Appointment_13522 parseFrom(InputStream input) throws IOException {
         return (S2C_Appointment_13522)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Appointment_13522 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Appointment_13522)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Appointment_13522 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Appointment_13522)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Appointment_13522 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Appointment_13522)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Appointment_13522 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Appointment_13522)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Appointment_13522 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Appointment_13522)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Appointment_13522 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Appointment_13522 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Appointment_13522> parser() {
         return PARSER;
      }

      public Parser<S2C_Appointment_13522> getParserForType() {
         return PARSER;
      }

      public S2C_Appointment_13522 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Appointment_13522OrBuilder {
         private int bitField0_;
         private Internal.IntList hadGetKey_;
         private int totalId_;
         private int hadGetId_;
         private Internal.IntList boxs_;
         private int curDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Appointment_13522_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Appointment_13522_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Appointment_13522.class, Builder.class);
         }

         private Builder() {
            this.hadGetKey_ = GreenPlumMsg.S2C_Appointment_13522.emptyIntList();
            this.boxs_ = GreenPlumMsg.S2C_Appointment_13522.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadGetKey_ = GreenPlumMsg.S2C_Appointment_13522.emptyIntList();
            this.boxs_ = GreenPlumMsg.S2C_Appointment_13522.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_Appointment_13522.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hadGetKey_ = GreenPlumMsg.S2C_Appointment_13522.emptyIntList();
            this.bitField0_ &= -2;
            this.totalId_ = 0;
            this.bitField0_ &= -3;
            this.hadGetId_ = 0;
            this.bitField0_ &= -5;
            this.boxs_ = GreenPlumMsg.S2C_Appointment_13522.emptyIntList();
            this.bitField0_ &= -9;
            this.curDay_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Appointment_13522_descriptor;
         }

         public S2C_Appointment_13522 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_Appointment_13522.getDefaultInstance();
         }

         public S2C_Appointment_13522 build() {
            S2C_Appointment_13522 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Appointment_13522 buildPartial() {
            S2C_Appointment_13522 result = new S2C_Appointment_13522(this);
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
            if (other instanceof S2C_Appointment_13522) {
               return this.mergeFrom((S2C_Appointment_13522)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Appointment_13522 other) {
            if (other == GreenPlumMsg.S2C_Appointment_13522.getDefaultInstance()) {
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
            S2C_Appointment_13522 parsedMessage = null;

            try {
               parsedMessage = (S2C_Appointment_13522)GreenPlumMsg.S2C_Appointment_13522.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Appointment_13522)e.getUnfinishedMessage();
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
               this.hadGetKey_ = GreenPlumMsg.S2C_Appointment_13522.mutableCopy(this.hadGetKey_);
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
            this.hadGetKey_ = GreenPlumMsg.S2C_Appointment_13522.emptyIntList();
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
               this.boxs_ = GreenPlumMsg.S2C_Appointment_13522.mutableCopy(this.boxs_);
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
            this.boxs_ = GreenPlumMsg.S2C_Appointment_13522.emptyIntList();
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

   public static final class C2S_DrawKey_13523 extends GeneratedMessageV3 implements C2S_DrawKey_13523OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_DrawKey_13523 DEFAULT_INSTANCE = new C2S_DrawKey_13523();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawKey_13523> PARSER = new AbstractParser<C2S_DrawKey_13523>() {
         public C2S_DrawKey_13523 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawKey_13523(input, extensionRegistry);
         }
      };

      private C2S_DrawKey_13523(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawKey_13523() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawKey_13523();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawKey_13523(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_DrawKey_13523_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_DrawKey_13523_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawKey_13523.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawKey_13523)) {
            return super.equals(obj);
         } else {
            C2S_DrawKey_13523 other = (C2S_DrawKey_13523)obj;
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

      public static C2S_DrawKey_13523 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_13523)PARSER.parseFrom(data);
      }

      public static C2S_DrawKey_13523 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_13523)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawKey_13523 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_13523)PARSER.parseFrom(data);
      }

      public static C2S_DrawKey_13523 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_13523)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawKey_13523 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_13523)PARSER.parseFrom(data);
      }

      public static C2S_DrawKey_13523 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawKey_13523)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawKey_13523 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawKey_13523)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawKey_13523 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawKey_13523)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawKey_13523 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawKey_13523)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawKey_13523 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawKey_13523)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawKey_13523 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawKey_13523)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawKey_13523 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawKey_13523)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawKey_13523 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawKey_13523 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawKey_13523> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawKey_13523> getParserForType() {
         return PARSER;
      }

      public C2S_DrawKey_13523 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawKey_13523OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_DrawKey_13523_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_DrawKey_13523_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawKey_13523.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_DrawKey_13523.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_DrawKey_13523_descriptor;
         }

         public C2S_DrawKey_13523 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_DrawKey_13523.getDefaultInstance();
         }

         public C2S_DrawKey_13523 build() {
            C2S_DrawKey_13523 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawKey_13523 buildPartial() {
            C2S_DrawKey_13523 result = new C2S_DrawKey_13523(this);
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
            if (other instanceof C2S_DrawKey_13523) {
               return this.mergeFrom((C2S_DrawKey_13523)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawKey_13523 other) {
            if (other == GreenPlumMsg.C2S_DrawKey_13523.getDefaultInstance()) {
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
            C2S_DrawKey_13523 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawKey_13523)GreenPlumMsg.C2S_DrawKey_13523.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawKey_13523)e.getUnfinishedMessage();
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

   public static final class S2C_DrawKey_13524 extends GeneratedMessageV3 implements S2C_DrawKey_13524OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawKey_13524 DEFAULT_INSTANCE = new S2C_DrawKey_13524();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawKey_13524> PARSER = new AbstractParser<S2C_DrawKey_13524>() {
         public S2C_DrawKey_13524 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawKey_13524(input, extensionRegistry);
         }
      };

      private S2C_DrawKey_13524(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawKey_13524() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawKey_13524();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawKey_13524(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_DrawKey_13524_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_DrawKey_13524_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawKey_13524.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawKey_13524)) {
            return super.equals(obj);
         } else {
            S2C_DrawKey_13524 other = (S2C_DrawKey_13524)obj;
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

      public static S2C_DrawKey_13524 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_13524)PARSER.parseFrom(data);
      }

      public static S2C_DrawKey_13524 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_13524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawKey_13524 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_13524)PARSER.parseFrom(data);
      }

      public static S2C_DrawKey_13524 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_13524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawKey_13524 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_13524)PARSER.parseFrom(data);
      }

      public static S2C_DrawKey_13524 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawKey_13524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawKey_13524 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawKey_13524)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawKey_13524 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawKey_13524)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawKey_13524 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawKey_13524)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawKey_13524 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawKey_13524)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawKey_13524 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawKey_13524)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawKey_13524 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawKey_13524)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawKey_13524 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawKey_13524 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawKey_13524> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawKey_13524> getParserForType() {
         return PARSER;
      }

      public S2C_DrawKey_13524 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawKey_13524OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_DrawKey_13524_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_DrawKey_13524_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawKey_13524.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_DrawKey_13524.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_DrawKey_13524_descriptor;
         }

         public S2C_DrawKey_13524 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_DrawKey_13524.getDefaultInstance();
         }

         public S2C_DrawKey_13524 build() {
            S2C_DrawKey_13524 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawKey_13524 buildPartial() {
            S2C_DrawKey_13524 result = new S2C_DrawKey_13524(this);
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
            if (other instanceof S2C_DrawKey_13524) {
               return this.mergeFrom((S2C_DrawKey_13524)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawKey_13524 other) {
            if (other == GreenPlumMsg.S2C_DrawKey_13524.getDefaultInstance()) {
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
            S2C_DrawKey_13524 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawKey_13524)GreenPlumMsg.S2C_DrawKey_13524.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawKey_13524)e.getUnfinishedMessage();
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

   public static final class C2S_Coincidence_13525 extends GeneratedMessageV3 implements C2S_Coincidence_13525OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Coincidence_13525 DEFAULT_INSTANCE = new C2S_Coincidence_13525();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Coincidence_13525> PARSER = new AbstractParser<C2S_Coincidence_13525>() {
         public C2S_Coincidence_13525 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Coincidence_13525(input, extensionRegistry);
         }
      };

      private C2S_Coincidence_13525(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Coincidence_13525() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Coincidence_13525();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Coincidence_13525(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Coincidence_13525_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Coincidence_13525_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Coincidence_13525.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Coincidence_13525)) {
            return super.equals(obj);
         } else {
            C2S_Coincidence_13525 other = (C2S_Coincidence_13525)obj;
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

      public static C2S_Coincidence_13525 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_13525)PARSER.parseFrom(data);
      }

      public static C2S_Coincidence_13525 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_13525)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Coincidence_13525 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_13525)PARSER.parseFrom(data);
      }

      public static C2S_Coincidence_13525 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_13525)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Coincidence_13525 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_13525)PARSER.parseFrom(data);
      }

      public static C2S_Coincidence_13525 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Coincidence_13525)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Coincidence_13525 parseFrom(InputStream input) throws IOException {
         return (C2S_Coincidence_13525)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Coincidence_13525 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Coincidence_13525)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Coincidence_13525 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Coincidence_13525)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Coincidence_13525 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Coincidence_13525)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Coincidence_13525 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Coincidence_13525)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Coincidence_13525 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Coincidence_13525)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Coincidence_13525 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Coincidence_13525 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Coincidence_13525> parser() {
         return PARSER;
      }

      public Parser<C2S_Coincidence_13525> getParserForType() {
         return PARSER;
      }

      public C2S_Coincidence_13525 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Coincidence_13525OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Coincidence_13525_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Coincidence_13525_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Coincidence_13525.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_Coincidence_13525.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Coincidence_13525_descriptor;
         }

         public C2S_Coincidence_13525 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_Coincidence_13525.getDefaultInstance();
         }

         public C2S_Coincidence_13525 build() {
            C2S_Coincidence_13525 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Coincidence_13525 buildPartial() {
            C2S_Coincidence_13525 result = new C2S_Coincidence_13525(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Coincidence_13525) {
               return this.mergeFrom((C2S_Coincidence_13525)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Coincidence_13525 other) {
            if (other == GreenPlumMsg.C2S_Coincidence_13525.getDefaultInstance()) {
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
            C2S_Coincidence_13525 parsedMessage = null;

            try {
               parsedMessage = (C2S_Coincidence_13525)GreenPlumMsg.C2S_Coincidence_13525.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Coincidence_13525)e.getUnfinishedMessage();
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

   public static final class S2C_Coincidence_13526 extends GeneratedMessageV3 implements S2C_Coincidence_13526OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HADGETID_FIELD_NUMBER = 1;
      private int hadGetId_;
      private byte memoizedIsInitialized;
      private static final S2C_Coincidence_13526 DEFAULT_INSTANCE = new S2C_Coincidence_13526();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Coincidence_13526> PARSER = new AbstractParser<S2C_Coincidence_13526>() {
         public S2C_Coincidence_13526 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Coincidence_13526(input, extensionRegistry);
         }
      };

      private S2C_Coincidence_13526(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Coincidence_13526() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Coincidence_13526();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Coincidence_13526(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Coincidence_13526_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Coincidence_13526_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Coincidence_13526.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Coincidence_13526)) {
            return super.equals(obj);
         } else {
            S2C_Coincidence_13526 other = (S2C_Coincidence_13526)obj;
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

      public static S2C_Coincidence_13526 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_13526)PARSER.parseFrom(data);
      }

      public static S2C_Coincidence_13526 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_13526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Coincidence_13526 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_13526)PARSER.parseFrom(data);
      }

      public static S2C_Coincidence_13526 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_13526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Coincidence_13526 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_13526)PARSER.parseFrom(data);
      }

      public static S2C_Coincidence_13526 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Coincidence_13526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Coincidence_13526 parseFrom(InputStream input) throws IOException {
         return (S2C_Coincidence_13526)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Coincidence_13526 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Coincidence_13526)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Coincidence_13526 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Coincidence_13526)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Coincidence_13526 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Coincidence_13526)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Coincidence_13526 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Coincidence_13526)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Coincidence_13526 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Coincidence_13526)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Coincidence_13526 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Coincidence_13526 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Coincidence_13526> parser() {
         return PARSER;
      }

      public Parser<S2C_Coincidence_13526> getParserForType() {
         return PARSER;
      }

      public S2C_Coincidence_13526 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Coincidence_13526OrBuilder {
         private int bitField0_;
         private int hadGetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Coincidence_13526_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Coincidence_13526_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Coincidence_13526.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_Coincidence_13526.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hadGetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Coincidence_13526_descriptor;
         }

         public S2C_Coincidence_13526 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_Coincidence_13526.getDefaultInstance();
         }

         public S2C_Coincidence_13526 build() {
            S2C_Coincidence_13526 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Coincidence_13526 buildPartial() {
            S2C_Coincidence_13526 result = new S2C_Coincidence_13526(this);
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
            if (other instanceof S2C_Coincidence_13526) {
               return this.mergeFrom((S2C_Coincidence_13526)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Coincidence_13526 other) {
            if (other == GreenPlumMsg.S2C_Coincidence_13526.getDefaultInstance()) {
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
            S2C_Coincidence_13526 parsedMessage = null;

            try {
               parsedMessage = (S2C_Coincidence_13526)GreenPlumMsg.S2C_Coincidence_13526.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Coincidence_13526)e.getUnfinishedMessage();
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

   public static final class C2S_CoincidenceBox_13527 extends GeneratedMessageV3 implements C2S_CoincidenceBox_13527OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_CoincidenceBox_13527 DEFAULT_INSTANCE = new C2S_CoincidenceBox_13527();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CoincidenceBox_13527> PARSER = new AbstractParser<C2S_CoincidenceBox_13527>() {
         public C2S_CoincidenceBox_13527 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CoincidenceBox_13527(input, extensionRegistry);
         }
      };

      private C2S_CoincidenceBox_13527(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CoincidenceBox_13527() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CoincidenceBox_13527();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CoincidenceBox_13527(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CoincidenceBox_13527_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CoincidenceBox_13527_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CoincidenceBox_13527.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CoincidenceBox_13527)) {
            return super.equals(obj);
         } else {
            C2S_CoincidenceBox_13527 other = (C2S_CoincidenceBox_13527)obj;
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

      public static C2S_CoincidenceBox_13527 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_13527)PARSER.parseFrom(data);
      }

      public static C2S_CoincidenceBox_13527 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_13527)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CoincidenceBox_13527 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_13527)PARSER.parseFrom(data);
      }

      public static C2S_CoincidenceBox_13527 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_13527)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CoincidenceBox_13527 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_13527)PARSER.parseFrom(data);
      }

      public static C2S_CoincidenceBox_13527 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CoincidenceBox_13527)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CoincidenceBox_13527 parseFrom(InputStream input) throws IOException {
         return (C2S_CoincidenceBox_13527)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CoincidenceBox_13527 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CoincidenceBox_13527)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CoincidenceBox_13527 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CoincidenceBox_13527)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CoincidenceBox_13527 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CoincidenceBox_13527)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CoincidenceBox_13527 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CoincidenceBox_13527)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CoincidenceBox_13527 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CoincidenceBox_13527)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CoincidenceBox_13527 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CoincidenceBox_13527 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CoincidenceBox_13527> parser() {
         return PARSER;
      }

      public Parser<C2S_CoincidenceBox_13527> getParserForType() {
         return PARSER;
      }

      public C2S_CoincidenceBox_13527 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CoincidenceBox_13527OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CoincidenceBox_13527_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CoincidenceBox_13527_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CoincidenceBox_13527.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_CoincidenceBox_13527.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CoincidenceBox_13527_descriptor;
         }

         public C2S_CoincidenceBox_13527 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_CoincidenceBox_13527.getDefaultInstance();
         }

         public C2S_CoincidenceBox_13527 build() {
            C2S_CoincidenceBox_13527 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CoincidenceBox_13527 buildPartial() {
            C2S_CoincidenceBox_13527 result = new C2S_CoincidenceBox_13527(this);
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
            if (other instanceof C2S_CoincidenceBox_13527) {
               return this.mergeFrom((C2S_CoincidenceBox_13527)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CoincidenceBox_13527 other) {
            if (other == GreenPlumMsg.C2S_CoincidenceBox_13527.getDefaultInstance()) {
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
            C2S_CoincidenceBox_13527 parsedMessage = null;

            try {
               parsedMessage = (C2S_CoincidenceBox_13527)GreenPlumMsg.C2S_CoincidenceBox_13527.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CoincidenceBox_13527)e.getUnfinishedMessage();
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

   public static final class S2C_CoincidenceBox_13528 extends GeneratedMessageV3 implements S2C_CoincidenceBox_13528OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_CoincidenceBox_13528 DEFAULT_INSTANCE = new S2C_CoincidenceBox_13528();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CoincidenceBox_13528> PARSER = new AbstractParser<S2C_CoincidenceBox_13528>() {
         public S2C_CoincidenceBox_13528 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CoincidenceBox_13528(input, extensionRegistry);
         }
      };

      private S2C_CoincidenceBox_13528(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CoincidenceBox_13528() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CoincidenceBox_13528();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CoincidenceBox_13528(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CoincidenceBox_13528_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CoincidenceBox_13528_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CoincidenceBox_13528.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CoincidenceBox_13528)) {
            return super.equals(obj);
         } else {
            S2C_CoincidenceBox_13528 other = (S2C_CoincidenceBox_13528)obj;
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

      public static S2C_CoincidenceBox_13528 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_13528)PARSER.parseFrom(data);
      }

      public static S2C_CoincidenceBox_13528 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_13528)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CoincidenceBox_13528 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_13528)PARSER.parseFrom(data);
      }

      public static S2C_CoincidenceBox_13528 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_13528)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CoincidenceBox_13528 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_13528)PARSER.parseFrom(data);
      }

      public static S2C_CoincidenceBox_13528 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CoincidenceBox_13528)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CoincidenceBox_13528 parseFrom(InputStream input) throws IOException {
         return (S2C_CoincidenceBox_13528)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CoincidenceBox_13528 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CoincidenceBox_13528)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CoincidenceBox_13528 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CoincidenceBox_13528)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CoincidenceBox_13528 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CoincidenceBox_13528)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CoincidenceBox_13528 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CoincidenceBox_13528)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CoincidenceBox_13528 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CoincidenceBox_13528)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CoincidenceBox_13528 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CoincidenceBox_13528 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CoincidenceBox_13528> parser() {
         return PARSER;
      }

      public Parser<S2C_CoincidenceBox_13528> getParserForType() {
         return PARSER;
      }

      public S2C_CoincidenceBox_13528 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CoincidenceBox_13528OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CoincidenceBox_13528_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CoincidenceBox_13528_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CoincidenceBox_13528.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_CoincidenceBox_13528.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CoincidenceBox_13528_descriptor;
         }

         public S2C_CoincidenceBox_13528 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_CoincidenceBox_13528.getDefaultInstance();
         }

         public S2C_CoincidenceBox_13528 build() {
            S2C_CoincidenceBox_13528 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CoincidenceBox_13528 buildPartial() {
            S2C_CoincidenceBox_13528 result = new S2C_CoincidenceBox_13528(this);
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
            if (other instanceof S2C_CoincidenceBox_13528) {
               return this.mergeFrom((S2C_CoincidenceBox_13528)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CoincidenceBox_13528 other) {
            if (other == GreenPlumMsg.S2C_CoincidenceBox_13528.getDefaultInstance()) {
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
            S2C_CoincidenceBox_13528 parsedMessage = null;

            try {
               parsedMessage = (S2C_CoincidenceBox_13528)GreenPlumMsg.S2C_CoincidenceBox_13528.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CoincidenceBox_13528)e.getUnfinishedMessage();
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

   public static final class C2S_CumulativeId_13529 extends GeneratedMessageV3 implements C2S_CumulativeId_13529OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CumulativeId_13529 DEFAULT_INSTANCE = new C2S_CumulativeId_13529();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CumulativeId_13529> PARSER = new AbstractParser<C2S_CumulativeId_13529>() {
         public C2S_CumulativeId_13529 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CumulativeId_13529(input, extensionRegistry);
         }
      };

      private C2S_CumulativeId_13529(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CumulativeId_13529() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CumulativeId_13529();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CumulativeId_13529(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CumulativeId_13529_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CumulativeId_13529_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CumulativeId_13529.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CumulativeId_13529)) {
            return super.equals(obj);
         } else {
            C2S_CumulativeId_13529 other = (C2S_CumulativeId_13529)obj;
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

      public static C2S_CumulativeId_13529 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_13529)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeId_13529 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_13529)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeId_13529 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_13529)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeId_13529 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_13529)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeId_13529 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_13529)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeId_13529 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeId_13529)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeId_13529 parseFrom(InputStream input) throws IOException {
         return (C2S_CumulativeId_13529)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CumulativeId_13529 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeId_13529)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CumulativeId_13529 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CumulativeId_13529)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CumulativeId_13529 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeId_13529)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CumulativeId_13529 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CumulativeId_13529)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CumulativeId_13529 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeId_13529)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CumulativeId_13529 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CumulativeId_13529 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CumulativeId_13529> parser() {
         return PARSER;
      }

      public Parser<C2S_CumulativeId_13529> getParserForType() {
         return PARSER;
      }

      public C2S_CumulativeId_13529 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CumulativeId_13529OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CumulativeId_13529_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CumulativeId_13529_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CumulativeId_13529.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_CumulativeId_13529.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CumulativeId_13529_descriptor;
         }

         public C2S_CumulativeId_13529 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_CumulativeId_13529.getDefaultInstance();
         }

         public C2S_CumulativeId_13529 build() {
            C2S_CumulativeId_13529 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CumulativeId_13529 buildPartial() {
            C2S_CumulativeId_13529 result = new C2S_CumulativeId_13529(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_CumulativeId_13529) {
               return this.mergeFrom((C2S_CumulativeId_13529)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CumulativeId_13529 other) {
            if (other == GreenPlumMsg.C2S_CumulativeId_13529.getDefaultInstance()) {
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
            C2S_CumulativeId_13529 parsedMessage = null;

            try {
               parsedMessage = (C2S_CumulativeId_13529)GreenPlumMsg.C2S_CumulativeId_13529.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CumulativeId_13529)e.getUnfinishedMessage();
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

   public static final class S2C_CumulativeId_13530 extends GeneratedMessageV3 implements S2C_CumulativeId_13530OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOTALID_FIELD_NUMBER = 1;
      private int totalId_;
      private byte memoizedIsInitialized;
      private static final S2C_CumulativeId_13530 DEFAULT_INSTANCE = new S2C_CumulativeId_13530();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CumulativeId_13530> PARSER = new AbstractParser<S2C_CumulativeId_13530>() {
         public S2C_CumulativeId_13530 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CumulativeId_13530(input, extensionRegistry);
         }
      };

      private S2C_CumulativeId_13530(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CumulativeId_13530() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CumulativeId_13530();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CumulativeId_13530(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CumulativeId_13530_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CumulativeId_13530_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CumulativeId_13530.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CumulativeId_13530)) {
            return super.equals(obj);
         } else {
            S2C_CumulativeId_13530 other = (S2C_CumulativeId_13530)obj;
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

      public static S2C_CumulativeId_13530 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_13530)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeId_13530 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_13530)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeId_13530 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_13530)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeId_13530 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_13530)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeId_13530 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_13530)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeId_13530 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeId_13530)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeId_13530 parseFrom(InputStream input) throws IOException {
         return (S2C_CumulativeId_13530)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CumulativeId_13530 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeId_13530)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CumulativeId_13530 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CumulativeId_13530)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CumulativeId_13530 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeId_13530)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CumulativeId_13530 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CumulativeId_13530)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CumulativeId_13530 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeId_13530)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CumulativeId_13530 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CumulativeId_13530 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CumulativeId_13530> parser() {
         return PARSER;
      }

      public Parser<S2C_CumulativeId_13530> getParserForType() {
         return PARSER;
      }

      public S2C_CumulativeId_13530 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CumulativeId_13530OrBuilder {
         private int bitField0_;
         private int totalId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CumulativeId_13530_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CumulativeId_13530_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CumulativeId_13530.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_CumulativeId_13530.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.totalId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CumulativeId_13530_descriptor;
         }

         public S2C_CumulativeId_13530 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_CumulativeId_13530.getDefaultInstance();
         }

         public S2C_CumulativeId_13530 build() {
            S2C_CumulativeId_13530 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CumulativeId_13530 buildPartial() {
            S2C_CumulativeId_13530 result = new S2C_CumulativeId_13530(this);
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
            if (other instanceof S2C_CumulativeId_13530) {
               return this.mergeFrom((S2C_CumulativeId_13530)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CumulativeId_13530 other) {
            if (other == GreenPlumMsg.S2C_CumulativeId_13530.getDefaultInstance()) {
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
            S2C_CumulativeId_13530 parsedMessage = null;

            try {
               parsedMessage = (S2C_CumulativeId_13530)GreenPlumMsg.S2C_CumulativeId_13530.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CumulativeId_13530)e.getUnfinishedMessage();
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

   public static final class C2S_MakeWine_13541 extends GeneratedMessageV3 implements C2S_MakeWine_13541OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_MakeWine_13541 DEFAULT_INSTANCE = new C2S_MakeWine_13541();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MakeWine_13541> PARSER = new AbstractParser<C2S_MakeWine_13541>() {
         public C2S_MakeWine_13541 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MakeWine_13541(input, extensionRegistry);
         }
      };

      private C2S_MakeWine_13541(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MakeWine_13541() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MakeWine_13541();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MakeWine_13541(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_MakeWine_13541_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_MakeWine_13541_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MakeWine_13541.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MakeWine_13541)) {
            return super.equals(obj);
         } else {
            C2S_MakeWine_13541 other = (C2S_MakeWine_13541)obj;
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

      public static C2S_MakeWine_13541 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_13541)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_13541 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_13541)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_13541 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_13541)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_13541 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_13541)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_13541 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_13541)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_13541 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_13541)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_13541 parseFrom(InputStream input) throws IOException {
         return (C2S_MakeWine_13541)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_13541 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_13541)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MakeWine_13541 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MakeWine_13541)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_13541 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_13541)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MakeWine_13541 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MakeWine_13541)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_13541 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_13541)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MakeWine_13541 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MakeWine_13541 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MakeWine_13541> parser() {
         return PARSER;
      }

      public Parser<C2S_MakeWine_13541> getParserForType() {
         return PARSER;
      }

      public C2S_MakeWine_13541 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MakeWine_13541OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_MakeWine_13541_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_MakeWine_13541_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MakeWine_13541.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_MakeWine_13541.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_MakeWine_13541_descriptor;
         }

         public C2S_MakeWine_13541 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_MakeWine_13541.getDefaultInstance();
         }

         public C2S_MakeWine_13541 build() {
            C2S_MakeWine_13541 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MakeWine_13541 buildPartial() {
            C2S_MakeWine_13541 result = new C2S_MakeWine_13541(this);
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
            if (other instanceof C2S_MakeWine_13541) {
               return this.mergeFrom((C2S_MakeWine_13541)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MakeWine_13541 other) {
            if (other == GreenPlumMsg.C2S_MakeWine_13541.getDefaultInstance()) {
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
            C2S_MakeWine_13541 parsedMessage = null;

            try {
               parsedMessage = (C2S_MakeWine_13541)GreenPlumMsg.C2S_MakeWine_13541.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MakeWine_13541)e.getUnfinishedMessage();
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

   public static final class S2C_MakeWine_13542 extends GeneratedMessageV3 implements S2C_MakeWine_13542OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TOTALWINENUM_FIELD_NUMBER = 2;
      private int totalWineNum_;
      private byte memoizedIsInitialized;
      private static final S2C_MakeWine_13542 DEFAULT_INSTANCE = new S2C_MakeWine_13542();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MakeWine_13542> PARSER = new AbstractParser<S2C_MakeWine_13542>() {
         public S2C_MakeWine_13542 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MakeWine_13542(input, extensionRegistry);
         }
      };

      private S2C_MakeWine_13542(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MakeWine_13542() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MakeWine_13542();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MakeWine_13542(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_MakeWine_13542_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_MakeWine_13542_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MakeWine_13542.class, Builder.class);
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
         } else if (!(obj instanceof S2C_MakeWine_13542)) {
            return super.equals(obj);
         } else {
            S2C_MakeWine_13542 other = (S2C_MakeWine_13542)obj;
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

      public static S2C_MakeWine_13542 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_13542)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_13542 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_13542)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_13542 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_13542)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_13542 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_13542)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_13542 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_13542)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_13542 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_13542)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_13542 parseFrom(InputStream input) throws IOException {
         return (S2C_MakeWine_13542)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_13542 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_13542)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MakeWine_13542 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MakeWine_13542)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_13542 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_13542)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MakeWine_13542 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MakeWine_13542)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_13542 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_13542)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MakeWine_13542 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MakeWine_13542 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MakeWine_13542> parser() {
         return PARSER;
      }

      public Parser<S2C_MakeWine_13542> getParserForType() {
         return PARSER;
      }

      public S2C_MakeWine_13542 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MakeWine_13542OrBuilder {
         private int bitField0_;
         private int result_;
         private int totalWineNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_MakeWine_13542_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_MakeWine_13542_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MakeWine_13542.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_MakeWine_13542.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_MakeWine_13542_descriptor;
         }

         public S2C_MakeWine_13542 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_MakeWine_13542.getDefaultInstance();
         }

         public S2C_MakeWine_13542 build() {
            S2C_MakeWine_13542 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MakeWine_13542 buildPartial() {
            S2C_MakeWine_13542 result = new S2C_MakeWine_13542(this);
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
            if (other instanceof S2C_MakeWine_13542) {
               return this.mergeFrom((S2C_MakeWine_13542)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MakeWine_13542 other) {
            if (other == GreenPlumMsg.S2C_MakeWine_13542.getDefaultInstance()) {
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
            S2C_MakeWine_13542 parsedMessage = null;

            try {
               parsedMessage = (S2C_MakeWine_13542)GreenPlumMsg.S2C_MakeWine_13542.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MakeWine_13542)e.getUnfinishedMessage();
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

   public static final class C2S_TakePlumReward_13543 extends GeneratedMessageV3 implements C2S_TakePlumReward_13543OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TakePlumReward_13543 DEFAULT_INSTANCE = new C2S_TakePlumReward_13543();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakePlumReward_13543> PARSER = new AbstractParser<C2S_TakePlumReward_13543>() {
         public C2S_TakePlumReward_13543 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakePlumReward_13543(input, extensionRegistry);
         }
      };

      private C2S_TakePlumReward_13543(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakePlumReward_13543() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakePlumReward_13543();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakePlumReward_13543(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_TakePlumReward_13543_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_TakePlumReward_13543_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakePlumReward_13543.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakePlumReward_13543)) {
            return super.equals(obj);
         } else {
            C2S_TakePlumReward_13543 other = (C2S_TakePlumReward_13543)obj;
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

      public static C2S_TakePlumReward_13543 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_13543)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_13543 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_13543)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_13543 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_13543)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_13543 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_13543)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_13543 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_13543)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_13543 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_13543)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_13543 parseFrom(InputStream input) throws IOException {
         return (C2S_TakePlumReward_13543)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_13543 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_13543)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakePlumReward_13543 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakePlumReward_13543)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_13543 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_13543)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakePlumReward_13543 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakePlumReward_13543)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_13543 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_13543)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakePlumReward_13543 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakePlumReward_13543 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakePlumReward_13543> parser() {
         return PARSER;
      }

      public Parser<C2S_TakePlumReward_13543> getParserForType() {
         return PARSER;
      }

      public C2S_TakePlumReward_13543 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakePlumReward_13543OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_TakePlumReward_13543_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_TakePlumReward_13543_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakePlumReward_13543.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_TakePlumReward_13543.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_TakePlumReward_13543_descriptor;
         }

         public C2S_TakePlumReward_13543 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_TakePlumReward_13543.getDefaultInstance();
         }

         public C2S_TakePlumReward_13543 build() {
            C2S_TakePlumReward_13543 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakePlumReward_13543 buildPartial() {
            C2S_TakePlumReward_13543 result = new C2S_TakePlumReward_13543(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TakePlumReward_13543) {
               return this.mergeFrom((C2S_TakePlumReward_13543)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakePlumReward_13543 other) {
            if (other == GreenPlumMsg.C2S_TakePlumReward_13543.getDefaultInstance()) {
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
            C2S_TakePlumReward_13543 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakePlumReward_13543)GreenPlumMsg.C2S_TakePlumReward_13543.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakePlumReward_13543)e.getUnfinishedMessage();
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

   public static final class S2C_TakePlumReward_13544 extends GeneratedMessageV3 implements S2C_TakePlumReward_13544OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_TakePlumReward_13544 DEFAULT_INSTANCE = new S2C_TakePlumReward_13544();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakePlumReward_13544> PARSER = new AbstractParser<S2C_TakePlumReward_13544>() {
         public S2C_TakePlumReward_13544 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakePlumReward_13544(input, extensionRegistry);
         }
      };

      private S2C_TakePlumReward_13544(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakePlumReward_13544() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakePlumReward_13544();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakePlumReward_13544(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_TakePlumReward_13544_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_TakePlumReward_13544_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakePlumReward_13544.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TakePlumReward_13544)) {
            return super.equals(obj);
         } else {
            S2C_TakePlumReward_13544 other = (S2C_TakePlumReward_13544)obj;
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

      public static S2C_TakePlumReward_13544 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_13544)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_13544 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_13544)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_13544 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_13544)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_13544 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_13544)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_13544 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_13544)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_13544 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_13544)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_13544 parseFrom(InputStream input) throws IOException {
         return (S2C_TakePlumReward_13544)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_13544 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_13544)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakePlumReward_13544 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakePlumReward_13544)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_13544 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_13544)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakePlumReward_13544 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakePlumReward_13544)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_13544 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_13544)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakePlumReward_13544 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakePlumReward_13544 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakePlumReward_13544> parser() {
         return PARSER;
      }

      public Parser<S2C_TakePlumReward_13544> getParserForType() {
         return PARSER;
      }

      public S2C_TakePlumReward_13544 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakePlumReward_13544OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_TakePlumReward_13544_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_TakePlumReward_13544_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakePlumReward_13544.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_TakePlumReward_13544.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_TakePlumReward_13544_descriptor;
         }

         public S2C_TakePlumReward_13544 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_TakePlumReward_13544.getDefaultInstance();
         }

         public S2C_TakePlumReward_13544 build() {
            S2C_TakePlumReward_13544 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakePlumReward_13544 buildPartial() {
            S2C_TakePlumReward_13544 result = new S2C_TakePlumReward_13544(this);
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
            if (other instanceof S2C_TakePlumReward_13544) {
               return this.mergeFrom((S2C_TakePlumReward_13544)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakePlumReward_13544 other) {
            if (other == GreenPlumMsg.S2C_TakePlumReward_13544.getDefaultInstance()) {
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
            S2C_TakePlumReward_13544 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakePlumReward_13544)GreenPlumMsg.S2C_TakePlumReward_13544.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakePlumReward_13544)e.getUnfinishedMessage();
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

   public static final class C2S_Drink_13545 extends GeneratedMessageV3 implements C2S_Drink_13545OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Drink_13545 DEFAULT_INSTANCE = new C2S_Drink_13545();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Drink_13545> PARSER = new AbstractParser<C2S_Drink_13545>() {
         public C2S_Drink_13545 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Drink_13545(input, extensionRegistry);
         }
      };

      private C2S_Drink_13545(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Drink_13545() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Drink_13545();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Drink_13545(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Drink_13545_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Drink_13545_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Drink_13545.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Drink_13545)) {
            return super.equals(obj);
         } else {
            C2S_Drink_13545 other = (C2S_Drink_13545)obj;
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

      public static C2S_Drink_13545 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Drink_13545)PARSER.parseFrom(data);
      }

      public static C2S_Drink_13545 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_13545)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_13545 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Drink_13545)PARSER.parseFrom(data);
      }

      public static C2S_Drink_13545 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_13545)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_13545 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Drink_13545)PARSER.parseFrom(data);
      }

      public static C2S_Drink_13545 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_13545)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_13545 parseFrom(InputStream input) throws IOException {
         return (C2S_Drink_13545)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Drink_13545 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_13545)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Drink_13545 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Drink_13545)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Drink_13545 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_13545)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Drink_13545 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Drink_13545)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Drink_13545 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_13545)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Drink_13545 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Drink_13545 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Drink_13545> parser() {
         return PARSER;
      }

      public Parser<C2S_Drink_13545> getParserForType() {
         return PARSER;
      }

      public C2S_Drink_13545 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Drink_13545OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Drink_13545_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Drink_13545_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Drink_13545.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_Drink_13545.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_Drink_13545_descriptor;
         }

         public C2S_Drink_13545 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_Drink_13545.getDefaultInstance();
         }

         public C2S_Drink_13545 build() {
            C2S_Drink_13545 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Drink_13545 buildPartial() {
            C2S_Drink_13545 result = new C2S_Drink_13545(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Drink_13545) {
               return this.mergeFrom((C2S_Drink_13545)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Drink_13545 other) {
            if (other == GreenPlumMsg.C2S_Drink_13545.getDefaultInstance()) {
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
            C2S_Drink_13545 parsedMessage = null;

            try {
               parsedMessage = (C2S_Drink_13545)GreenPlumMsg.C2S_Drink_13545.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Drink_13545)e.getUnfinishedMessage();
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

   public static final class S2C_Drink_13546 extends GeneratedMessageV3 implements S2C_Drink_13546OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int FREENUM_FIELD_NUMBER = 2;
      private int freeNum_;
      private byte memoizedIsInitialized;
      private static final S2C_Drink_13546 DEFAULT_INSTANCE = new S2C_Drink_13546();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Drink_13546> PARSER = new AbstractParser<S2C_Drink_13546>() {
         public S2C_Drink_13546 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Drink_13546(input, extensionRegistry);
         }
      };

      private S2C_Drink_13546(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Drink_13546() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Drink_13546();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Drink_13546(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Drink_13546_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Drink_13546_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Drink_13546.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Drink_13546)) {
            return super.equals(obj);
         } else {
            S2C_Drink_13546 other = (S2C_Drink_13546)obj;
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

      public static S2C_Drink_13546 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Drink_13546)PARSER.parseFrom(data);
      }

      public static S2C_Drink_13546 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_13546)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_13546 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Drink_13546)PARSER.parseFrom(data);
      }

      public static S2C_Drink_13546 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_13546)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_13546 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Drink_13546)PARSER.parseFrom(data);
      }

      public static S2C_Drink_13546 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_13546)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_13546 parseFrom(InputStream input) throws IOException {
         return (S2C_Drink_13546)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Drink_13546 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_13546)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Drink_13546 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Drink_13546)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Drink_13546 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_13546)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Drink_13546 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Drink_13546)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Drink_13546 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_13546)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Drink_13546 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Drink_13546 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Drink_13546> parser() {
         return PARSER;
      }

      public Parser<S2C_Drink_13546> getParserForType() {
         return PARSER;
      }

      public S2C_Drink_13546 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Drink_13546OrBuilder {
         private int bitField0_;
         private int result_;
         private int freeNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Drink_13546_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Drink_13546_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Drink_13546.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_Drink_13546.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_Drink_13546_descriptor;
         }

         public S2C_Drink_13546 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_Drink_13546.getDefaultInstance();
         }

         public S2C_Drink_13546 build() {
            S2C_Drink_13546 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Drink_13546 buildPartial() {
            S2C_Drink_13546 result = new S2C_Drink_13546(this);
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
            if (other instanceof S2C_Drink_13546) {
               return this.mergeFrom((S2C_Drink_13546)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Drink_13546 other) {
            if (other == GreenPlumMsg.S2C_Drink_13546.getDefaultInstance()) {
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
            S2C_Drink_13546 parsedMessage = null;

            try {
               parsedMessage = (S2C_Drink_13546)GreenPlumMsg.S2C_Drink_13546.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Drink_13546)e.getUnfinishedMessage();
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

   public static final class C2S_FreeDrinkNum_13547 extends GeneratedMessageV3 implements C2S_FreeDrinkNum_13547OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FreeDrinkNum_13547 DEFAULT_INSTANCE = new C2S_FreeDrinkNum_13547();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FreeDrinkNum_13547> PARSER = new AbstractParser<C2S_FreeDrinkNum_13547>() {
         public C2S_FreeDrinkNum_13547 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FreeDrinkNum_13547(input, extensionRegistry);
         }
      };

      private C2S_FreeDrinkNum_13547(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FreeDrinkNum_13547() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FreeDrinkNum_13547();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FreeDrinkNum_13547(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_FreeDrinkNum_13547_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_FreeDrinkNum_13547_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeDrinkNum_13547.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FreeDrinkNum_13547)) {
            return super.equals(obj);
         } else {
            C2S_FreeDrinkNum_13547 other = (C2S_FreeDrinkNum_13547)obj;
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

      public static C2S_FreeDrinkNum_13547 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_13547)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_13547 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_13547)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_13547 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_13547)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_13547 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_13547)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_13547 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_13547)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_13547 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_13547)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_13547 parseFrom(InputStream input) throws IOException {
         return (C2S_FreeDrinkNum_13547)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_13547 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_13547)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_13547 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FreeDrinkNum_13547)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_13547 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_13547)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_13547 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FreeDrinkNum_13547)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_13547 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_13547)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FreeDrinkNum_13547 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FreeDrinkNum_13547 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FreeDrinkNum_13547> parser() {
         return PARSER;
      }

      public Parser<C2S_FreeDrinkNum_13547> getParserForType() {
         return PARSER;
      }

      public C2S_FreeDrinkNum_13547 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FreeDrinkNum_13547OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_FreeDrinkNum_13547_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_FreeDrinkNum_13547_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeDrinkNum_13547.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_FreeDrinkNum_13547.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_FreeDrinkNum_13547_descriptor;
         }

         public C2S_FreeDrinkNum_13547 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_FreeDrinkNum_13547.getDefaultInstance();
         }

         public C2S_FreeDrinkNum_13547 build() {
            C2S_FreeDrinkNum_13547 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FreeDrinkNum_13547 buildPartial() {
            C2S_FreeDrinkNum_13547 result = new C2S_FreeDrinkNum_13547(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_FreeDrinkNum_13547) {
               return this.mergeFrom((C2S_FreeDrinkNum_13547)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FreeDrinkNum_13547 other) {
            if (other == GreenPlumMsg.C2S_FreeDrinkNum_13547.getDefaultInstance()) {
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
            C2S_FreeDrinkNum_13547 parsedMessage = null;

            try {
               parsedMessage = (C2S_FreeDrinkNum_13547)GreenPlumMsg.C2S_FreeDrinkNum_13547.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FreeDrinkNum_13547)e.getUnfinishedMessage();
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

   public static final class S2C_FreeDrinkNum_13548 extends GeneratedMessageV3 implements S2C_FreeDrinkNum_13548OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FREENUM_FIELD_NUMBER = 1;
      private int freeNum_;
      public static final int TOTALWINENUM_FIELD_NUMBER = 2;
      private int totalWineNum_;
      public static final int ISTAKED_FIELD_NUMBER = 3;
      private boolean isTaked_;
      private byte memoizedIsInitialized;
      private static final S2C_FreeDrinkNum_13548 DEFAULT_INSTANCE = new S2C_FreeDrinkNum_13548();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FreeDrinkNum_13548> PARSER = new AbstractParser<S2C_FreeDrinkNum_13548>() {
         public S2C_FreeDrinkNum_13548 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FreeDrinkNum_13548(input, extensionRegistry);
         }
      };

      private S2C_FreeDrinkNum_13548(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FreeDrinkNum_13548() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FreeDrinkNum_13548();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FreeDrinkNum_13548(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_FreeDrinkNum_13548_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_FreeDrinkNum_13548_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeDrinkNum_13548.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FreeDrinkNum_13548)) {
            return super.equals(obj);
         } else {
            S2C_FreeDrinkNum_13548 other = (S2C_FreeDrinkNum_13548)obj;
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

      public static S2C_FreeDrinkNum_13548 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_13548)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_13548 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_13548)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_13548 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_13548)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_13548 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_13548)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_13548 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_13548)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_13548 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_13548)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_13548 parseFrom(InputStream input) throws IOException {
         return (S2C_FreeDrinkNum_13548)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_13548 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_13548)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_13548 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FreeDrinkNum_13548)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_13548 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_13548)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_13548 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FreeDrinkNum_13548)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_13548 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_13548)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FreeDrinkNum_13548 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FreeDrinkNum_13548 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FreeDrinkNum_13548> parser() {
         return PARSER;
      }

      public Parser<S2C_FreeDrinkNum_13548> getParserForType() {
         return PARSER;
      }

      public S2C_FreeDrinkNum_13548 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FreeDrinkNum_13548OrBuilder {
         private int bitField0_;
         private int freeNum_;
         private int totalWineNum_;
         private boolean isTaked_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_FreeDrinkNum_13548_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_FreeDrinkNum_13548_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeDrinkNum_13548.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_FreeDrinkNum_13548.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_FreeDrinkNum_13548_descriptor;
         }

         public S2C_FreeDrinkNum_13548 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_FreeDrinkNum_13548.getDefaultInstance();
         }

         public S2C_FreeDrinkNum_13548 build() {
            S2C_FreeDrinkNum_13548 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FreeDrinkNum_13548 buildPartial() {
            S2C_FreeDrinkNum_13548 result = new S2C_FreeDrinkNum_13548(this);
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
            if (other instanceof S2C_FreeDrinkNum_13548) {
               return this.mergeFrom((S2C_FreeDrinkNum_13548)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FreeDrinkNum_13548 other) {
            if (other == GreenPlumMsg.S2C_FreeDrinkNum_13548.getDefaultInstance()) {
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
            S2C_FreeDrinkNum_13548 parsedMessage = null;

            try {
               parsedMessage = (S2C_FreeDrinkNum_13548)GreenPlumMsg.S2C_FreeDrinkNum_13548.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FreeDrinkNum_13548)e.getUnfinishedMessage();
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

   public static final class C2S_CommitTask_13551 extends GeneratedMessageV3 implements C2S_CommitTask_13551OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_13551 DEFAULT_INSTANCE = new C2S_CommitTask_13551();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_13551> PARSER = new AbstractParser<C2S_CommitTask_13551>() {
         public C2S_CommitTask_13551 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_13551(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_13551(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_13551() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_13551();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_13551(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CommitTask_13551_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CommitTask_13551_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_13551.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CommitTask_13551)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_13551 other = (C2S_CommitTask_13551)obj;
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

      public static C2S_CommitTask_13551 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13551)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_13551 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13551)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_13551 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13551)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_13551 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13551)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_13551 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13551)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_13551 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13551)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_13551 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_13551)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_13551 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_13551)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_13551 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_13551)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_13551 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_13551)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_13551 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_13551)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_13551 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_13551)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_13551 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_13551 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_13551> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_13551> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_13551 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_13551OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CommitTask_13551_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CommitTask_13551_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_13551.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_CommitTask_13551.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_CommitTask_13551_descriptor;
         }

         public C2S_CommitTask_13551 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_CommitTask_13551.getDefaultInstance();
         }

         public C2S_CommitTask_13551 build() {
            C2S_CommitTask_13551 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_13551 buildPartial() {
            C2S_CommitTask_13551 result = new C2S_CommitTask_13551(this);
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
            if (other instanceof C2S_CommitTask_13551) {
               return this.mergeFrom((C2S_CommitTask_13551)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_13551 other) {
            if (other == GreenPlumMsg.C2S_CommitTask_13551.getDefaultInstance()) {
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
            C2S_CommitTask_13551 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_13551)GreenPlumMsg.C2S_CommitTask_13551.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_13551)e.getUnfinishedMessage();
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

   public static final class S2C_CommitTask_13552 extends GeneratedMessageV3 implements S2C_CommitTask_13552OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_13552 DEFAULT_INSTANCE = new S2C_CommitTask_13552();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_13552> PARSER = new AbstractParser<S2C_CommitTask_13552>() {
         public S2C_CommitTask_13552 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_13552(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_13552(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_13552() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_13552();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_13552(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CommitTask_13552_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CommitTask_13552_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_13552.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CommitTask_13552)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_13552 other = (S2C_CommitTask_13552)obj;
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

      public static S2C_CommitTask_13552 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13552)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_13552 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13552)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_13552 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13552)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_13552 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13552)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_13552 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13552)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_13552 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13552)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_13552 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_13552)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_13552 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_13552)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_13552 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_13552)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_13552 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_13552)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_13552 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_13552)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_13552 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_13552)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_13552 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_13552 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_13552> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_13552> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_13552 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_13552OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CommitTask_13552_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CommitTask_13552_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_13552.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_CommitTask_13552.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_CommitTask_13552_descriptor;
         }

         public S2C_CommitTask_13552 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_CommitTask_13552.getDefaultInstance();
         }

         public S2C_CommitTask_13552 build() {
            S2C_CommitTask_13552 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_13552 buildPartial() {
            S2C_CommitTask_13552 result = new S2C_CommitTask_13552(this);
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
            if (other instanceof S2C_CommitTask_13552) {
               return this.mergeFrom((S2C_CommitTask_13552)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_13552 other) {
            if (other == GreenPlumMsg.S2C_CommitTask_13552.getDefaultInstance()) {
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
            S2C_CommitTask_13552 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_13552)GreenPlumMsg.S2C_CommitTask_13552.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_13552)e.getUnfinishedMessage();
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

   public static final class C2S_GreenPlumTasks_13553 extends GeneratedMessageV3 implements C2S_GreenPlumTasks_13553OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GreenPlumTasks_13553 DEFAULT_INSTANCE = new C2S_GreenPlumTasks_13553();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GreenPlumTasks_13553> PARSER = new AbstractParser<C2S_GreenPlumTasks_13553>() {
         public C2S_GreenPlumTasks_13553 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GreenPlumTasks_13553(input, extensionRegistry);
         }
      };

      private C2S_GreenPlumTasks_13553(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GreenPlumTasks_13553() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GreenPlumTasks_13553();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GreenPlumTasks_13553(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_GreenPlumTasks_13553_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_GreenPlumTasks_13553_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GreenPlumTasks_13553.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GreenPlumTasks_13553)) {
            return super.equals(obj);
         } else {
            C2S_GreenPlumTasks_13553 other = (C2S_GreenPlumTasks_13553)obj;
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

      public static C2S_GreenPlumTasks_13553 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GreenPlumTasks_13553)PARSER.parseFrom(data);
      }

      public static C2S_GreenPlumTasks_13553 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenPlumTasks_13553)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenPlumTasks_13553 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GreenPlumTasks_13553)PARSER.parseFrom(data);
      }

      public static C2S_GreenPlumTasks_13553 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenPlumTasks_13553)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenPlumTasks_13553 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GreenPlumTasks_13553)PARSER.parseFrom(data);
      }

      public static C2S_GreenPlumTasks_13553 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenPlumTasks_13553)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenPlumTasks_13553 parseFrom(InputStream input) throws IOException {
         return (C2S_GreenPlumTasks_13553)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GreenPlumTasks_13553 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenPlumTasks_13553)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GreenPlumTasks_13553 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GreenPlumTasks_13553)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GreenPlumTasks_13553 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenPlumTasks_13553)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GreenPlumTasks_13553 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GreenPlumTasks_13553)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GreenPlumTasks_13553 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenPlumTasks_13553)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GreenPlumTasks_13553 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GreenPlumTasks_13553 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GreenPlumTasks_13553> parser() {
         return PARSER;
      }

      public Parser<C2S_GreenPlumTasks_13553> getParserForType() {
         return PARSER;
      }

      public C2S_GreenPlumTasks_13553 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GreenPlumTasks_13553OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_GreenPlumTasks_13553_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_GreenPlumTasks_13553_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GreenPlumTasks_13553.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_GreenPlumTasks_13553.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_GreenPlumTasks_13553_descriptor;
         }

         public C2S_GreenPlumTasks_13553 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_GreenPlumTasks_13553.getDefaultInstance();
         }

         public C2S_GreenPlumTasks_13553 build() {
            C2S_GreenPlumTasks_13553 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GreenPlumTasks_13553 buildPartial() {
            C2S_GreenPlumTasks_13553 result = new C2S_GreenPlumTasks_13553(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GreenPlumTasks_13553) {
               return this.mergeFrom((C2S_GreenPlumTasks_13553)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GreenPlumTasks_13553 other) {
            if (other == GreenPlumMsg.C2S_GreenPlumTasks_13553.getDefaultInstance()) {
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
            C2S_GreenPlumTasks_13553 parsedMessage = null;

            try {
               parsedMessage = (C2S_GreenPlumTasks_13553)GreenPlumMsg.C2S_GreenPlumTasks_13553.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GreenPlumTasks_13553)e.getUnfinishedMessage();
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

   public static final class S2C_GreenPlumTasks_13554 extends GeneratedMessageV3 implements S2C_GreenPlumTasks_13554OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_GreenPlumTasks_13554 DEFAULT_INSTANCE = new S2C_GreenPlumTasks_13554();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GreenPlumTasks_13554> PARSER = new AbstractParser<S2C_GreenPlumTasks_13554>() {
         public S2C_GreenPlumTasks_13554 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GreenPlumTasks_13554(input, extensionRegistry);
         }
      };

      private S2C_GreenPlumTasks_13554(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GreenPlumTasks_13554() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GreenPlumTasks_13554();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GreenPlumTasks_13554(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_GreenPlumTasks_13554_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_GreenPlumTasks_13554_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GreenPlumTasks_13554.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GreenPlumTasks_13554)) {
            return super.equals(obj);
         } else {
            S2C_GreenPlumTasks_13554 other = (S2C_GreenPlumTasks_13554)obj;
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

      public static S2C_GreenPlumTasks_13554 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GreenPlumTasks_13554)PARSER.parseFrom(data);
      }

      public static S2C_GreenPlumTasks_13554 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenPlumTasks_13554)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenPlumTasks_13554 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GreenPlumTasks_13554)PARSER.parseFrom(data);
      }

      public static S2C_GreenPlumTasks_13554 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenPlumTasks_13554)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenPlumTasks_13554 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GreenPlumTasks_13554)PARSER.parseFrom(data);
      }

      public static S2C_GreenPlumTasks_13554 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenPlumTasks_13554)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenPlumTasks_13554 parseFrom(InputStream input) throws IOException {
         return (S2C_GreenPlumTasks_13554)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GreenPlumTasks_13554 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenPlumTasks_13554)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GreenPlumTasks_13554 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GreenPlumTasks_13554)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GreenPlumTasks_13554 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenPlumTasks_13554)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GreenPlumTasks_13554 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GreenPlumTasks_13554)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GreenPlumTasks_13554 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenPlumTasks_13554)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GreenPlumTasks_13554 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GreenPlumTasks_13554 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GreenPlumTasks_13554> parser() {
         return PARSER;
      }

      public Parser<S2C_GreenPlumTasks_13554> getParserForType() {
         return PARSER;
      }

      public S2C_GreenPlumTasks_13554 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GreenPlumTasks_13554OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_GreenPlumTasks_13554_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_GreenPlumTasks_13554_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GreenPlumTasks_13554.class, Builder.class);
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
            if (GreenPlumMsg.S2C_GreenPlumTasks_13554.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_GreenPlumTasks_13554_descriptor;
         }

         public S2C_GreenPlumTasks_13554 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_GreenPlumTasks_13554.getDefaultInstance();
         }

         public S2C_GreenPlumTasks_13554 build() {
            S2C_GreenPlumTasks_13554 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GreenPlumTasks_13554 buildPartial() {
            S2C_GreenPlumTasks_13554 result = new S2C_GreenPlumTasks_13554(this);
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
            if (other instanceof S2C_GreenPlumTasks_13554) {
               return this.mergeFrom((S2C_GreenPlumTasks_13554)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GreenPlumTasks_13554 other) {
            if (other == GreenPlumMsg.S2C_GreenPlumTasks_13554.getDefaultInstance()) {
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
                     this.taskBuilder_ = GreenPlumMsg.S2C_GreenPlumTasks_13554.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_GreenPlumTasks_13554 parsedMessage = null;

            try {
               parsedMessage = (S2C_GreenPlumTasks_13554)GreenPlumMsg.S2C_GreenPlumTasks_13554.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GreenPlumTasks_13554)e.getUnfinishedMessage();
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

   public static final class S2C_UpdateTasks_13556 extends GeneratedMessageV3 implements S2C_UpdateTasks_13556OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateTasks_13556 DEFAULT_INSTANCE = new S2C_UpdateTasks_13556();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateTasks_13556> PARSER = new AbstractParser<S2C_UpdateTasks_13556>() {
         public S2C_UpdateTasks_13556 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateTasks_13556(input, extensionRegistry);
         }
      };

      private S2C_UpdateTasks_13556(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateTasks_13556() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateTasks_13556();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateTasks_13556(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_UpdateTasks_13556_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_UpdateTasks_13556_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTasks_13556.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UpdateTasks_13556)) {
            return super.equals(obj);
         } else {
            S2C_UpdateTasks_13556 other = (S2C_UpdateTasks_13556)obj;
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

      public static S2C_UpdateTasks_13556 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13556)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_13556 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13556)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_13556 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13556)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_13556 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13556)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_13556 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13556)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_13556 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13556)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_13556 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateTasks_13556)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_13556 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_13556)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTasks_13556 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateTasks_13556)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_13556 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_13556)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTasks_13556 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateTasks_13556)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_13556 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_13556)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateTasks_13556 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateTasks_13556 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateTasks_13556> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateTasks_13556> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateTasks_13556 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateTasks_13556OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_UpdateTasks_13556_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_UpdateTasks_13556_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTasks_13556.class, Builder.class);
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
            if (GreenPlumMsg.S2C_UpdateTasks_13556.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_UpdateTasks_13556_descriptor;
         }

         public S2C_UpdateTasks_13556 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_UpdateTasks_13556.getDefaultInstance();
         }

         public S2C_UpdateTasks_13556 build() {
            S2C_UpdateTasks_13556 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateTasks_13556 buildPartial() {
            S2C_UpdateTasks_13556 result = new S2C_UpdateTasks_13556(this);
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
            if (other instanceof S2C_UpdateTasks_13556) {
               return this.mergeFrom((S2C_UpdateTasks_13556)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateTasks_13556 other) {
            if (other == GreenPlumMsg.S2C_UpdateTasks_13556.getDefaultInstance()) {
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
                     this.taskBuilder_ = GreenPlumMsg.S2C_UpdateTasks_13556.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_UpdateTasks_13556 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateTasks_13556)GreenPlumMsg.S2C_UpdateTasks_13556.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateTasks_13556)e.getUnfinishedMessage();
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

   public static final class C2S_LaborOpenServerRank_13557 extends GeneratedMessageV3 implements C2S_LaborOpenServerRank_13557OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LaborOpenServerRank_13557 DEFAULT_INSTANCE = new C2S_LaborOpenServerRank_13557();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LaborOpenServerRank_13557> PARSER = new AbstractParser<C2S_LaborOpenServerRank_13557>() {
         public C2S_LaborOpenServerRank_13557 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LaborOpenServerRank_13557(input, extensionRegistry);
         }
      };

      private C2S_LaborOpenServerRank_13557(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LaborOpenServerRank_13557() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LaborOpenServerRank_13557();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LaborOpenServerRank_13557(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_LaborOpenServerRank_13557_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_LaborOpenServerRank_13557_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LaborOpenServerRank_13557.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LaborOpenServerRank_13557)) {
            return super.equals(obj);
         } else {
            C2S_LaborOpenServerRank_13557 other = (C2S_LaborOpenServerRank_13557)obj;
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

      public static C2S_LaborOpenServerRank_13557 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_13557)PARSER.parseFrom(data);
      }

      public static C2S_LaborOpenServerRank_13557 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_13557)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_13557 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_13557)PARSER.parseFrom(data);
      }

      public static C2S_LaborOpenServerRank_13557 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_13557)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_13557 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_13557)PARSER.parseFrom(data);
      }

      public static C2S_LaborOpenServerRank_13557 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LaborOpenServerRank_13557)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_13557 parseFrom(InputStream input) throws IOException {
         return (C2S_LaborOpenServerRank_13557)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LaborOpenServerRank_13557 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LaborOpenServerRank_13557)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_13557 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LaborOpenServerRank_13557)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LaborOpenServerRank_13557 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LaborOpenServerRank_13557)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LaborOpenServerRank_13557 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LaborOpenServerRank_13557)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LaborOpenServerRank_13557 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LaborOpenServerRank_13557)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LaborOpenServerRank_13557 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LaborOpenServerRank_13557 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LaborOpenServerRank_13557> parser() {
         return PARSER;
      }

      public Parser<C2S_LaborOpenServerRank_13557> getParserForType() {
         return PARSER;
      }

      public C2S_LaborOpenServerRank_13557 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LaborOpenServerRank_13557OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_LaborOpenServerRank_13557_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_LaborOpenServerRank_13557_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LaborOpenServerRank_13557.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_LaborOpenServerRank_13557.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_LaborOpenServerRank_13557_descriptor;
         }

         public C2S_LaborOpenServerRank_13557 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_LaborOpenServerRank_13557.getDefaultInstance();
         }

         public C2S_LaborOpenServerRank_13557 build() {
            C2S_LaborOpenServerRank_13557 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LaborOpenServerRank_13557 buildPartial() {
            C2S_LaborOpenServerRank_13557 result = new C2S_LaborOpenServerRank_13557(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LaborOpenServerRank_13557) {
               return this.mergeFrom((C2S_LaborOpenServerRank_13557)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LaborOpenServerRank_13557 other) {
            if (other == GreenPlumMsg.C2S_LaborOpenServerRank_13557.getDefaultInstance()) {
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
            C2S_LaborOpenServerRank_13557 parsedMessage = null;

            try {
               parsedMessage = (C2S_LaborOpenServerRank_13557)GreenPlumMsg.C2S_LaborOpenServerRank_13557.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LaborOpenServerRank_13557)e.getUnfinishedMessage();
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

   public static final class S2C_LaborOpenServerRank_13558 extends GeneratedMessageV3 implements S2C_LaborOpenServerRank_13558OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int TIME_FIELD_NUMBER = 3;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2C_LaborOpenServerRank_13558 DEFAULT_INSTANCE = new S2C_LaborOpenServerRank_13558();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LaborOpenServerRank_13558> PARSER = new AbstractParser<S2C_LaborOpenServerRank_13558>() {
         public S2C_LaborOpenServerRank_13558 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LaborOpenServerRank_13558(input, extensionRegistry);
         }
      };

      private S2C_LaborOpenServerRank_13558(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LaborOpenServerRank_13558() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LaborOpenServerRank_13558();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LaborOpenServerRank_13558(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_LaborOpenServerRank_13558_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_LaborOpenServerRank_13558_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LaborOpenServerRank_13558.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LaborOpenServerRank_13558)) {
            return super.equals(obj);
         } else {
            S2C_LaborOpenServerRank_13558 other = (S2C_LaborOpenServerRank_13558)obj;
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

      public static S2C_LaborOpenServerRank_13558 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_13558)PARSER.parseFrom(data);
      }

      public static S2C_LaborOpenServerRank_13558 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_13558)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_13558 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_13558)PARSER.parseFrom(data);
      }

      public static S2C_LaborOpenServerRank_13558 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_13558)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_13558 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_13558)PARSER.parseFrom(data);
      }

      public static S2C_LaborOpenServerRank_13558 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LaborOpenServerRank_13558)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_13558 parseFrom(InputStream input) throws IOException {
         return (S2C_LaborOpenServerRank_13558)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LaborOpenServerRank_13558 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LaborOpenServerRank_13558)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_13558 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LaborOpenServerRank_13558)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LaborOpenServerRank_13558 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LaborOpenServerRank_13558)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LaborOpenServerRank_13558 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LaborOpenServerRank_13558)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LaborOpenServerRank_13558 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LaborOpenServerRank_13558)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LaborOpenServerRank_13558 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LaborOpenServerRank_13558 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LaborOpenServerRank_13558> parser() {
         return PARSER;
      }

      public Parser<S2C_LaborOpenServerRank_13558> getParserForType() {
         return PARSER;
      }

      public S2C_LaborOpenServerRank_13558 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LaborOpenServerRank_13558OrBuilder {
         private int bitField0_;
         private int type_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_LaborOpenServerRank_13558_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_LaborOpenServerRank_13558_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LaborOpenServerRank_13558.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_LaborOpenServerRank_13558.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_LaborOpenServerRank_13558_descriptor;
         }

         public S2C_LaborOpenServerRank_13558 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_LaborOpenServerRank_13558.getDefaultInstance();
         }

         public S2C_LaborOpenServerRank_13558 build() {
            S2C_LaborOpenServerRank_13558 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LaborOpenServerRank_13558 buildPartial() {
            S2C_LaborOpenServerRank_13558 result = new S2C_LaborOpenServerRank_13558(this);
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
            if (other instanceof S2C_LaborOpenServerRank_13558) {
               return this.mergeFrom((S2C_LaborOpenServerRank_13558)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LaborOpenServerRank_13558 other) {
            if (other == GreenPlumMsg.S2C_LaborOpenServerRank_13558.getDefaultInstance()) {
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
            S2C_LaborOpenServerRank_13558 parsedMessage = null;

            try {
               parsedMessage = (S2C_LaborOpenServerRank_13558)GreenPlumMsg.S2C_LaborOpenServerRank_13558.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LaborOpenServerRank_13558)e.getUnfinishedMessage();
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

   public static final class C2S_OpenServerRank_13559 extends GeneratedMessageV3 implements C2S_OpenServerRank_13559OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenServerRank_13559 DEFAULT_INSTANCE = new C2S_OpenServerRank_13559();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenServerRank_13559> PARSER = new AbstractParser<C2S_OpenServerRank_13559>() {
         public C2S_OpenServerRank_13559 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenServerRank_13559(input, extensionRegistry);
         }
      };

      private C2S_OpenServerRank_13559(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenServerRank_13559() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenServerRank_13559();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenServerRank_13559(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenServerRank_13559_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenServerRank_13559_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenServerRank_13559.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenServerRank_13559)) {
            return super.equals(obj);
         } else {
            C2S_OpenServerRank_13559 other = (C2S_OpenServerRank_13559)obj;
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

      public static C2S_OpenServerRank_13559 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_13559)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_13559 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_13559)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_13559 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_13559)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_13559 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_13559)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_13559 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_13559)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_13559 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_13559)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_13559 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenServerRank_13559)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_13559 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_13559)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenServerRank_13559 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenServerRank_13559)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_13559 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_13559)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenServerRank_13559 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenServerRank_13559)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_13559 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_13559)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenServerRank_13559 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenServerRank_13559 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenServerRank_13559> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenServerRank_13559> getParserForType() {
         return PARSER;
      }

      public C2S_OpenServerRank_13559 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenServerRank_13559OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenServerRank_13559_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenServerRank_13559_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenServerRank_13559.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.C2S_OpenServerRank_13559.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_C2S_OpenServerRank_13559_descriptor;
         }

         public C2S_OpenServerRank_13559 getDefaultInstanceForType() {
            return GreenPlumMsg.C2S_OpenServerRank_13559.getDefaultInstance();
         }

         public C2S_OpenServerRank_13559 build() {
            C2S_OpenServerRank_13559 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenServerRank_13559 buildPartial() {
            C2S_OpenServerRank_13559 result = new C2S_OpenServerRank_13559(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenServerRank_13559) {
               return this.mergeFrom((C2S_OpenServerRank_13559)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenServerRank_13559 other) {
            if (other == GreenPlumMsg.C2S_OpenServerRank_13559.getDefaultInstance()) {
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
            C2S_OpenServerRank_13559 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenServerRank_13559)GreenPlumMsg.C2S_OpenServerRank_13559.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenServerRank_13559)e.getUnfinishedMessage();
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

   public static final class S2C_OpenServerRank_13560 extends GeneratedMessageV3 implements S2C_OpenServerRank_13560OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int TIME_FIELD_NUMBER = 3;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenServerRank_13560 DEFAULT_INSTANCE = new S2C_OpenServerRank_13560();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenServerRank_13560> PARSER = new AbstractParser<S2C_OpenServerRank_13560>() {
         public S2C_OpenServerRank_13560 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenServerRank_13560(input, extensionRegistry);
         }
      };

      private S2C_OpenServerRank_13560(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenServerRank_13560() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenServerRank_13560();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenServerRank_13560(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenServerRank_13560_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenServerRank_13560_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenServerRank_13560.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenServerRank_13560)) {
            return super.equals(obj);
         } else {
            S2C_OpenServerRank_13560 other = (S2C_OpenServerRank_13560)obj;
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

      public static S2C_OpenServerRank_13560 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_13560)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_13560 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_13560)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_13560 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_13560)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_13560 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_13560)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_13560 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_13560)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_13560 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_13560)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_13560 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenServerRank_13560)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_13560 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_13560)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenServerRank_13560 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenServerRank_13560)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_13560 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_13560)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenServerRank_13560 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenServerRank_13560)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_13560 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_13560)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenServerRank_13560 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenServerRank_13560 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenServerRank_13560> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenServerRank_13560> getParserForType() {
         return PARSER;
      }

      public S2C_OpenServerRank_13560 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenServerRank_13560OrBuilder {
         private int bitField0_;
         private int type_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenServerRank_13560_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenServerRank_13560_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenServerRank_13560.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GreenPlumMsg.S2C_OpenServerRank_13560.alwaysUseFieldBuilders) {
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
            return GreenPlumMsg.internal_static_greenPlum_com_gzbz_protobuf_S2C_OpenServerRank_13560_descriptor;
         }

         public S2C_OpenServerRank_13560 getDefaultInstanceForType() {
            return GreenPlumMsg.S2C_OpenServerRank_13560.getDefaultInstance();
         }

         public S2C_OpenServerRank_13560 build() {
            S2C_OpenServerRank_13560 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenServerRank_13560 buildPartial() {
            S2C_OpenServerRank_13560 result = new S2C_OpenServerRank_13560(this);
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
            if (other instanceof S2C_OpenServerRank_13560) {
               return this.mergeFrom((S2C_OpenServerRank_13560)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenServerRank_13560 other) {
            if (other == GreenPlumMsg.S2C_OpenServerRank_13560.getDefaultInstance()) {
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
            S2C_OpenServerRank_13560 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenServerRank_13560)GreenPlumMsg.S2C_OpenServerRank_13560.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenServerRank_13560)e.getUnfinishedMessage();
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

   public interface C2S_Appointment_13521OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CoincidenceBox_13527OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Coincidence_13525OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CommitTask_13551OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_CumulativeId_13529OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawKey_13523OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Drink_13545OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FreeDrinkNum_13547OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GreenPlumTasks_13553OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LaborOpenServerRank_13557OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_MakeWine_13541OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_OpenServerRank_13559OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenUi_13501OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OptionalGiftChoice_13513OrBuilder extends MessageOrBuilder {
      boolean hasCustomId();

      int getCustomId();

      List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList();

      ActivityMsg.CustomGiftBuyItemData getBuyData(int index);

      int getBuyDataCount();

      List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList();

      ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index);
   }

   public interface C2S_OptionalGift_13511OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TakePlumReward_13543OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Appointment_13522OrBuilder extends MessageOrBuilder {
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

   public interface S2C_CoincidenceBox_13528OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_Coincidence_13526OrBuilder extends MessageOrBuilder {
      boolean hasHadGetId();

      int getHadGetId();
   }

   public interface S2C_CommitTask_13552OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_CumulativeId_13530OrBuilder extends MessageOrBuilder {
      boolean hasTotalId();

      int getTotalId();
   }

   public interface S2C_DrawKey_13524OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_Drink_13546OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasFreeNum();

      int getFreeNum();
   }

   public interface S2C_FreeDrinkNum_13548OrBuilder extends MessageOrBuilder {
      boolean hasFreeNum();

      int getFreeNum();

      boolean hasTotalWineNum();

      int getTotalWineNum();

      boolean hasIsTaked();

      boolean getIsTaked();
   }

   public interface S2C_GreenPlumTasks_13554OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LaborOpenServerRank_13558OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_MakeWine_13542OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTotalWineNum();

      int getTotalWineNum();
   }

   public interface S2C_OpenServerRank_13560OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_OpenUiResult_13502OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();
   }

   public interface S2C_OptionalGiftBuy_13516OrBuilder extends MessageOrBuilder {
      boolean hasGiftData();

      ActivityMsg.CustomGiftData getGiftData();

      ActivityMsg.CustomGiftDataOrBuilder getGiftDataOrBuilder();
   }

   public interface S2C_OptionalGiftChoice_13514OrBuilder extends MessageOrBuilder {
      boolean hasGiftData();

      ActivityMsg.CustomGiftData getGiftData();

      ActivityMsg.CustomGiftDataOrBuilder getGiftDataOrBuilder();
   }

   public interface S2C_OptionalGift_13512OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.CustomGiftData> getGiftListList();

      ActivityMsg.CustomGiftData getGiftList(int index);

      int getGiftListCount();

      List<? extends ActivityMsg.CustomGiftDataOrBuilder> getGiftListOrBuilderList();

      ActivityMsg.CustomGiftDataOrBuilder getGiftListOrBuilder(int index);
   }

   public interface S2C_TakePlumReward_13544OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_UpdateTasks_13556OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }
}
