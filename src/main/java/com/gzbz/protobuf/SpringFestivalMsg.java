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

public final class SpringFestivalMsg {
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_BlessData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_BlessData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_DicePlateData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_DicePlateData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_DiceData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_DiceData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_PrayData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_PrayData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeMain_12401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeMain_12401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeMain_12402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeMain_12402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBlessList_12403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBlessList_12403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessList_12404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessList_12404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBless_12405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBless_12405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBless_12406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBless_12406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessNotify_12408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessNotify_12408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_LuckMain_12409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_LuckMain_12409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_LuckMain_12410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_LuckMain_12410_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_LuckRollDice_12411_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_LuckRollDice_12411_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_LuckRollDice_12412_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_LuckRollDice_12412_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxMain_12413_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxMain_12413_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxMain_12414_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxMain_12414_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxCommitTask_12415_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxCommitTask_12415_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxCommitTask_12416_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxCommitTask_12416_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxTasks_12418_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxTasks_12418_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_PrayMain_12419_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_PrayMain_12419_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_PrayMain_12420_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_PrayMain_12420_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_PrayItemList_12421_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_PrayItemList_12421_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_PrayItemList_12422_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_PrayItemList_12422_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_Pray_12423_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_Pray_12423_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_Pray_12424_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_Pray_12424_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_PrayReward_12425_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_PrayReward_12425_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_PrayReward_12426_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_PrayReward_12426_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_C2S_PrayStarBuy_12427_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_C2S_PrayStarBuy_12427_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_springFestival_com_gzbz_protobuf_S2C_PrayStarBuy_12428_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_springFestival_com_gzbz_protobuf_S2C_PrayStarBuy_12428_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private SpringFestivalMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014SpringFestival.proto\u0012 springFestival.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\".\n\tBlessData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007content\u0018\u0002 \u0002(\t\"*\n\rDicePlateData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\"&\n\bDiceData\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"^\n\bPrayData\u0012\u0010\n\bcustomId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\titemIndex\u0018\u0002 \u0002(\u0005\u0012\u001e\n\u0004item\u0018\u0003 \u0001(\u000b2\u0010.common.ItemInfo\u0012\r\n\u0005isGot\u0018\u0004 \u0001(\b\"\u0018\n\u0016C2S_EnvelopeMain_12401\")\n\u0016S2C_EnvelopeMain_12402\u0012\u000f\n\u0007endTime\u0018\u0001 \u0002(\u0005\"\u001d\n\u001bC2S_EnvelopeBlessList_12403\"q\n\u001bS2C_EnvelopeBlessList_12404\u0012\u0012\n\nblessCount\u0018\u0001 \u0002(\u0005\u0012>\n\tblessData\u0018\u0002 \u0003(\u000b2+.springFestival.com.gzbz.protobuf.BlessData\"*\n\u0017C2S_EnvelopeBless_12405\u0012\u000f\n\u0007content\u0018\u0001 \u0002(\t\"*\n\u0017S2C_EnvelopeBless_12406\u0012\u000f\n\u0007content\u0018\u0001 \u0002(\t\"_\n\u001dS2C_EnvelopeBlessNotify_12408\u0012>\n\tblessData\u0018\u0001 \u0002(\u000b2+.springFestival.com.gzbz.protobuf.BlessData\"\u0014\n\u0012C2S_LuckMain_12409\"X\n\u0012S2C_LuckMain_12410\u0012B\n\tdicePlate\u0018\u0001 \u0003(\u000b2/.springFestival.com.gzbz.protobuf.DicePlateData\"-\n\u0016C2S_LuckRollDice_12411\u0012\u0013\n\u000bdicePlateId\u0018\u0001 \u0002(\u0005\"g\n\u0016S2C_LuckRollDice_12412\u0012\u0013\n\u000bdicePlateId\u0018\u0001 \u0002(\u0005\u00128\n\u0004dice\u0018\u0002 \u0003(\u000b2*.springFestival.com.gzbz.protobuf.DiceData\"\u0017\n\u0015C2S_GiftBoxMain_12413\"_\n\u0015S2C_GiftBoxMain_12414\u0012\u0012\n\ngotGiftBox\u0018\u0001 \u0002(\u0005\u00122\n\u0004task\u0018\u0002 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"-\n\u001bC2S_GiftBoxCommitTask_12415\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"A\n\u001bS2C_GiftBoxCommitTask_12416\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotGiftBox\u0018\u0002 \u0002(\u0005\"L\n\u0016S2C_GiftBoxTasks_12418\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0014\n\u0012C2S_PrayMain_12419\"R\n\u0012S2C_PrayMain_12420\u0012<\n\bprayData\u0018\u0001 \u0003(\u000b2*.springFestival.com.gzbz.protobuf.PrayData\"*\n\u0016C2S_PrayItemList_12421\u0012\u0010\n\bcustomId\u0018\u0001 \u0002(\u0005\"J\n\u0016S2C_PrayItemList_12422\u0012\u0010\n\bcustomId\u0018\u0001 \u0002(\u0005\u0012\u001e\n\u0004item\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\"N\n\u000eC2S_Pray_12423\u0012<\n\bprayData\u0018\u0001 \u0003(\u000b2*.springFestival.com.gzbz.protobuf.PrayData\"N\n\u000eS2C_Pray_12424\u0012<\n\bprayData\u0018\u0001 \u0003(\u000b2*.springFestival.com.gzbz.protobuf.PrayData\"(\n\u0014C2S_PrayReward_12425\u0012\u0010\n\bcustomId\u0018\u0001 \u0002(\u0005\"(\n\u0014S2C_PrayReward_12426\u0012\u0010\n\bcustomId\u0018\u0001 \u0002(\u0005\"'\n\u0015C2S_PrayStarBuy_12427\u0012\u000e\n\u0006buyNum\u0018\u0001 \u0002(\u0005\"'\n\u0015S2C_PrayStarBuy_12428\u0012\u000e\n\u0006buyNum\u0018\u0001 \u0002(\u0005B(\n\u0011com.gzbz.protobufB\u0011SpringFestivalMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_springFestival_com_gzbz_protobuf_BlessData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_springFestival_com_gzbz_protobuf_BlessData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_BlessData_descriptor, new String[]{"PlayerId", "Content"});
      internal_static_springFestival_com_gzbz_protobuf_DicePlateData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_springFestival_com_gzbz_protobuf_DicePlateData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_DicePlateData_descriptor, new String[]{"Id", "Count"});
      internal_static_springFestival_com_gzbz_protobuf_DiceData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_springFestival_com_gzbz_protobuf_DiceData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_DiceData_descriptor, new String[]{"Index", "Num"});
      internal_static_springFestival_com_gzbz_protobuf_PrayData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_springFestival_com_gzbz_protobuf_PrayData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_PrayData_descriptor, new String[]{"CustomId", "ItemIndex", "Item", "IsGot"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeMain_12401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeMain_12401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeMain_12401_descriptor, new String[0]);
      internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeMain_12402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeMain_12402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeMain_12402_descriptor, new String[]{"EndTime"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBlessList_12403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBlessList_12403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBlessList_12403_descriptor, new String[0]);
      internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessList_12404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessList_12404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessList_12404_descriptor, new String[]{"BlessCount", "BlessData"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBless_12405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBless_12405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBless_12405_descriptor, new String[]{"Content"});
      internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBless_12406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBless_12406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBless_12406_descriptor, new String[]{"Content"});
      internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessNotify_12408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessNotify_12408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessNotify_12408_descriptor, new String[]{"BlessData"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_LuckMain_12409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_springFestival_com_gzbz_protobuf_C2S_LuckMain_12409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_LuckMain_12409_descriptor, new String[0]);
      internal_static_springFestival_com_gzbz_protobuf_S2C_LuckMain_12410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_springFestival_com_gzbz_protobuf_S2C_LuckMain_12410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_LuckMain_12410_descriptor, new String[]{"DicePlate"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_LuckRollDice_12411_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_springFestival_com_gzbz_protobuf_C2S_LuckRollDice_12411_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_LuckRollDice_12411_descriptor, new String[]{"DicePlateId"});
      internal_static_springFestival_com_gzbz_protobuf_S2C_LuckRollDice_12412_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_springFestival_com_gzbz_protobuf_S2C_LuckRollDice_12412_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_LuckRollDice_12412_descriptor, new String[]{"DicePlateId", "Dice"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxMain_12413_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxMain_12413_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxMain_12413_descriptor, new String[0]);
      internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxMain_12414_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxMain_12414_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxMain_12414_descriptor, new String[]{"GotGiftBox", "Task"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxCommitTask_12415_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxCommitTask_12415_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxCommitTask_12415_descriptor, new String[]{"TaskId"});
      internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxCommitTask_12416_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxCommitTask_12416_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxCommitTask_12416_descriptor, new String[]{"TaskId", "GotGiftBox"});
      internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxTasks_12418_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxTasks_12418_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxTasks_12418_descriptor, new String[]{"Task"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_PrayMain_12419_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_springFestival_com_gzbz_protobuf_C2S_PrayMain_12419_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_PrayMain_12419_descriptor, new String[0]);
      internal_static_springFestival_com_gzbz_protobuf_S2C_PrayMain_12420_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_springFestival_com_gzbz_protobuf_S2C_PrayMain_12420_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_PrayMain_12420_descriptor, new String[]{"PrayData"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_PrayItemList_12421_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_springFestival_com_gzbz_protobuf_C2S_PrayItemList_12421_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_PrayItemList_12421_descriptor, new String[]{"CustomId"});
      internal_static_springFestival_com_gzbz_protobuf_S2C_PrayItemList_12422_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_springFestival_com_gzbz_protobuf_S2C_PrayItemList_12422_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_PrayItemList_12422_descriptor, new String[]{"CustomId", "Item"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_Pray_12423_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_springFestival_com_gzbz_protobuf_C2S_Pray_12423_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_Pray_12423_descriptor, new String[]{"PrayData"});
      internal_static_springFestival_com_gzbz_protobuf_S2C_Pray_12424_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_springFestival_com_gzbz_protobuf_S2C_Pray_12424_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_Pray_12424_descriptor, new String[]{"PrayData"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_PrayReward_12425_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_springFestival_com_gzbz_protobuf_C2S_PrayReward_12425_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_PrayReward_12425_descriptor, new String[]{"CustomId"});
      internal_static_springFestival_com_gzbz_protobuf_S2C_PrayReward_12426_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_springFestival_com_gzbz_protobuf_S2C_PrayReward_12426_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_PrayReward_12426_descriptor, new String[]{"CustomId"});
      internal_static_springFestival_com_gzbz_protobuf_C2S_PrayStarBuy_12427_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_springFestival_com_gzbz_protobuf_C2S_PrayStarBuy_12427_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_C2S_PrayStarBuy_12427_descriptor, new String[]{"BuyNum"});
      internal_static_springFestival_com_gzbz_protobuf_S2C_PrayStarBuy_12428_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_springFestival_com_gzbz_protobuf_S2C_PrayStarBuy_12428_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_springFestival_com_gzbz_protobuf_S2C_PrayStarBuy_12428_descriptor, new String[]{"BuyNum"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class BlessData extends GeneratedMessageV3 implements BlessDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int CONTENT_FIELD_NUMBER = 2;
      private volatile Object content_;
      private byte memoizedIsInitialized;
      private static final BlessData DEFAULT_INSTANCE = new BlessData();
      /** @deprecated */
      @Deprecated
      public static final Parser<BlessData> PARSER = new AbstractParser<BlessData>() {
         public BlessData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new BlessData(input, extensionRegistry);
         }
      };

      private BlessData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private BlessData() {
         this.memoizedIsInitialized = -1;
         this.content_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new BlessData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private BlessData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerId_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.content_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_BlessData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_BlessData_fieldAccessorTable.ensureFieldAccessorsInitialized(BlessData.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasContent() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getContent() {
         Object ref = this.content_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.content_ = s;
            }

            return s;
         }
      }

      public ByteString getContentBytes() {
         Object ref = this.content_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.content_ = b;
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
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasContent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.content_);
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
               size += CodedOutputStream.computeInt32Size(1, this.playerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.content_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof BlessData)) {
            return super.equals(obj);
         } else {
            BlessData other = (BlessData)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasContent() != other.hasContent()) {
               return false;
            } else if (this.hasContent() && !this.getContent().equals(other.getContent())) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasContent()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getContent().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static BlessData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (BlessData)PARSER.parseFrom(data);
      }

      public static BlessData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BlessData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BlessData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (BlessData)PARSER.parseFrom(data);
      }

      public static BlessData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BlessData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BlessData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (BlessData)PARSER.parseFrom(data);
      }

      public static BlessData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BlessData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BlessData parseFrom(InputStream input) throws IOException {
         return (BlessData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BlessData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BlessData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static BlessData parseDelimitedFrom(InputStream input) throws IOException {
         return (BlessData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static BlessData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BlessData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static BlessData parseFrom(CodedInputStream input) throws IOException {
         return (BlessData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BlessData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BlessData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(BlessData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static BlessData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<BlessData> parser() {
         return PARSER;
      }

      public Parser<BlessData> getParserForType() {
         return PARSER;
      }

      public BlessData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BlessDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object content_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_BlessData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_BlessData_fieldAccessorTable.ensureFieldAccessorsInitialized(BlessData.class, Builder.class);
         }

         private Builder() {
            this.content_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.content_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.BlessData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.content_ = "";
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_BlessData_descriptor;
         }

         public BlessData getDefaultInstanceForType() {
            return SpringFestivalMsg.BlessData.getDefaultInstance();
         }

         public BlessData build() {
            BlessData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public BlessData buildPartial() {
            BlessData result = new BlessData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.content_ = this.content_;
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
            if (other instanceof BlessData) {
               return this.mergeFrom((BlessData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(BlessData other) {
            if (other == SpringFestivalMsg.BlessData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasContent()) {
                  this.bitField0_ |= 2;
                  this.content_ = other.content_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else {
               return this.hasContent();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            BlessData parsedMessage = null;

            try {
               parsedMessage = (BlessData)SpringFestivalMsg.BlessData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (BlessData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 1;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasContent() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getContent() {
            Object ref = this.content_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.content_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContentBytes() {
            Object ref = this.content_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.content_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContent(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContent() {
            this.bitField0_ &= -3;
            this.content_ = SpringFestivalMsg.BlessData.getDefaultInstance().getContent();
            this.onChanged();
            return this;
         }

         public Builder setContentBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.content_ = value;
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

   public static final class DicePlateData extends GeneratedMessageV3 implements DicePlateDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      private byte memoizedIsInitialized;
      private static final DicePlateData DEFAULT_INSTANCE = new DicePlateData();
      /** @deprecated */
      @Deprecated
      public static final Parser<DicePlateData> PARSER = new AbstractParser<DicePlateData>() {
         public DicePlateData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DicePlateData(input, extensionRegistry);
         }
      };

      private DicePlateData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DicePlateData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DicePlateData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DicePlateData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.count_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_DicePlateData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_DicePlateData_fieldAccessorTable.ensureFieldAccessorsInitialized(DicePlateData.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCount() {
         return this.count_;
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
         } else if (!this.hasCount()) {
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
            output.writeInt32(2, this.count_);
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
               size += CodedOutputStream.computeInt32Size(2, this.count_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof DicePlateData)) {
            return super.equals(obj);
         } else {
            DicePlateData other = (DicePlateData)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
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

            if (this.hasCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static DicePlateData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DicePlateData)PARSER.parseFrom(data);
      }

      public static DicePlateData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DicePlateData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DicePlateData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DicePlateData)PARSER.parseFrom(data);
      }

      public static DicePlateData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DicePlateData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DicePlateData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DicePlateData)PARSER.parseFrom(data);
      }

      public static DicePlateData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DicePlateData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DicePlateData parseFrom(InputStream input) throws IOException {
         return (DicePlateData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DicePlateData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DicePlateData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DicePlateData parseDelimitedFrom(InputStream input) throws IOException {
         return (DicePlateData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DicePlateData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DicePlateData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DicePlateData parseFrom(CodedInputStream input) throws IOException {
         return (DicePlateData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DicePlateData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DicePlateData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DicePlateData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DicePlateData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DicePlateData> parser() {
         return PARSER;
      }

      public Parser<DicePlateData> getParserForType() {
         return PARSER;
      }

      public DicePlateData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DicePlateDataOrBuilder {
         private int bitField0_;
         private int id_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_DicePlateData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_DicePlateData_fieldAccessorTable.ensureFieldAccessorsInitialized(DicePlateData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.DicePlateData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_DicePlateData_descriptor;
         }

         public DicePlateData getDefaultInstanceForType() {
            return SpringFestivalMsg.DicePlateData.getDefaultInstance();
         }

         public DicePlateData build() {
            DicePlateData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DicePlateData buildPartial() {
            DicePlateData result = new DicePlateData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.count_ = this.count_;
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
            if (other instanceof DicePlateData) {
               return this.mergeFrom((DicePlateData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DicePlateData other) {
            if (other == SpringFestivalMsg.DicePlateData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
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
               return this.hasCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            DicePlateData parsedMessage = null;

            try {
               parsedMessage = (DicePlateData)SpringFestivalMsg.DicePlateData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DicePlateData)e.getUnfinishedMessage();
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

         public boolean hasCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 2;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -3;
            this.count_ = 0;
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

   public static final class DiceData extends GeneratedMessageV3 implements DiceDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INDEX_FIELD_NUMBER = 1;
      private int index_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final DiceData DEFAULT_INSTANCE = new DiceData();
      /** @deprecated */
      @Deprecated
      public static final Parser<DiceData> PARSER = new AbstractParser<DiceData>() {
         public DiceData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DiceData(input, extensionRegistry);
         }
      };

      private DiceData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DiceData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DiceData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DiceData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.index_ = input.readInt32();
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
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_DiceData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_DiceData_fieldAccessorTable.ensureFieldAccessorsInitialized(DiceData.class, Builder.class);
      }

      public boolean hasIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIndex() {
         return this.index_;
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
         } else if (!this.hasIndex()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.index_);
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
               size += CodedOutputStream.computeInt32Size(1, this.index_);
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
         } else if (!(obj instanceof DiceData)) {
            return super.equals(obj);
         } else {
            DiceData other = (DiceData)obj;
            if (this.hasIndex() != other.hasIndex()) {
               return false;
            } else if (this.hasIndex() && this.getIndex() != other.getIndex()) {
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
            if (this.hasIndex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIndex();
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

      public static DiceData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DiceData)PARSER.parseFrom(data);
      }

      public static DiceData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DiceData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DiceData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DiceData)PARSER.parseFrom(data);
      }

      public static DiceData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DiceData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DiceData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DiceData)PARSER.parseFrom(data);
      }

      public static DiceData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DiceData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DiceData parseFrom(InputStream input) throws IOException {
         return (DiceData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DiceData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DiceData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DiceData parseDelimitedFrom(InputStream input) throws IOException {
         return (DiceData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DiceData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DiceData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DiceData parseFrom(CodedInputStream input) throws IOException {
         return (DiceData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DiceData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DiceData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DiceData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DiceData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DiceData> parser() {
         return PARSER;
      }

      public Parser<DiceData> getParserForType() {
         return PARSER;
      }

      public DiceData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DiceDataOrBuilder {
         private int bitField0_;
         private int index_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_DiceData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_DiceData_fieldAccessorTable.ensureFieldAccessorsInitialized(DiceData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.DiceData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.index_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_DiceData_descriptor;
         }

         public DiceData getDefaultInstanceForType() {
            return SpringFestivalMsg.DiceData.getDefaultInstance();
         }

         public DiceData build() {
            DiceData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DiceData buildPartial() {
            DiceData result = new DiceData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.index_ = this.index_;
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
            if (other instanceof DiceData) {
               return this.mergeFrom((DiceData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DiceData other) {
            if (other == SpringFestivalMsg.DiceData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIndex()) {
                  this.setIndex(other.getIndex());
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
            if (!this.hasIndex()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            DiceData parsedMessage = null;

            try {
               parsedMessage = (DiceData)SpringFestivalMsg.DiceData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DiceData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIndex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIndex() {
            return this.index_;
         }

         public Builder setIndex(int value) {
            this.bitField0_ |= 1;
            this.index_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.bitField0_ &= -2;
            this.index_ = 0;
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

   public static final class PrayData extends GeneratedMessageV3 implements PrayDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CUSTOMID_FIELD_NUMBER = 1;
      private int customId_;
      public static final int ITEMINDEX_FIELD_NUMBER = 2;
      private int itemIndex_;
      public static final int ITEM_FIELD_NUMBER = 3;
      private CommonMsg.ItemInfo item_;
      public static final int ISGOT_FIELD_NUMBER = 4;
      private boolean isGot_;
      private byte memoizedIsInitialized;
      private static final PrayData DEFAULT_INSTANCE = new PrayData();
      /** @deprecated */
      @Deprecated
      public static final Parser<PrayData> PARSER = new AbstractParser<PrayData>() {
         public PrayData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PrayData(input, extensionRegistry);
         }
      };

      private PrayData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PrayData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PrayData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PrayData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemIndex_ = input.readInt32();
                        break;
                     case 26:
                        CommonMsg.ItemInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.item_.toBuilder();
                        }

                        this.item_ = (CommonMsg.ItemInfo)input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.item_);
                           this.item_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isGot_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_PrayData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_PrayData_fieldAccessorTable.ensureFieldAccessorsInitialized(PrayData.class, Builder.class);
      }

      public boolean hasCustomId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCustomId() {
         return this.customId_;
      }

      public boolean hasItemIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemIndex() {
         return this.itemIndex_;
      }

      public boolean hasItem() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.ItemInfo getItem() {
         return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
      }

      public CommonMsg.ItemInfoOrBuilder getItemOrBuilder() {
         return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
      }

      public boolean hasIsGot() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsGot() {
         return this.isGot_;
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
         } else if (!this.hasItemIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasItem() && !this.getItem().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.customId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemIndex_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getItem());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isGot_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemIndex_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getItem());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isGot_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PrayData)) {
            return super.equals(obj);
         } else {
            PrayData other = (PrayData)obj;
            if (this.hasCustomId() != other.hasCustomId()) {
               return false;
            } else if (this.hasCustomId() && this.getCustomId() != other.getCustomId()) {
               return false;
            } else if (this.hasItemIndex() != other.hasItemIndex()) {
               return false;
            } else if (this.hasItemIndex() && this.getItemIndex() != other.getItemIndex()) {
               return false;
            } else if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && !this.getItem().equals(other.getItem())) {
               return false;
            } else if (this.hasIsGot() != other.hasIsGot()) {
               return false;
            } else if (this.hasIsGot() && this.getIsGot() != other.getIsGot()) {
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

            if (this.hasItemIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemIndex();
            }

            if (this.hasItem()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItem().hashCode();
            }

            if (this.hasIsGot()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGot());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PrayData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PrayData)PARSER.parseFrom(data);
      }

      public static PrayData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PrayData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PrayData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PrayData)PARSER.parseFrom(data);
      }

      public static PrayData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PrayData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PrayData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PrayData)PARSER.parseFrom(data);
      }

      public static PrayData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PrayData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PrayData parseFrom(InputStream input) throws IOException {
         return (PrayData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PrayData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PrayData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PrayData parseDelimitedFrom(InputStream input) throws IOException {
         return (PrayData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PrayData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PrayData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PrayData parseFrom(CodedInputStream input) throws IOException {
         return (PrayData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PrayData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PrayData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PrayData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PrayData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PrayData> parser() {
         return PARSER;
      }

      public Parser<PrayData> getParserForType() {
         return PARSER;
      }

      public PrayData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PrayDataOrBuilder {
         private int bitField0_;
         private int customId_;
         private int itemIndex_;
         private CommonMsg.ItemInfo item_;
         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemBuilder_;
         private boolean isGot_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_PrayData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_PrayData_fieldAccessorTable.ensureFieldAccessorsInitialized(PrayData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.PrayData.alwaysUseFieldBuilders) {
               this.getItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.customId_ = 0;
            this.bitField0_ &= -2;
            this.itemIndex_ = 0;
            this.bitField0_ &= -3;
            if (this.itemBuilder_ == null) {
               this.item_ = null;
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -5;
            this.isGot_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_PrayData_descriptor;
         }

         public PrayData getDefaultInstanceForType() {
            return SpringFestivalMsg.PrayData.getDefaultInstance();
         }

         public PrayData build() {
            PrayData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PrayData buildPartial() {
            PrayData result = new PrayData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.customId_ = this.customId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemIndex_ = this.itemIndex_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.itemBuilder_ == null) {
                  result.item_ = this.item_;
               } else {
                  result.item_ = (CommonMsg.ItemInfo)this.itemBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isGot_ = this.isGot_;
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
            if (other instanceof PrayData) {
               return this.mergeFrom((PrayData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PrayData other) {
            if (other == SpringFestivalMsg.PrayData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCustomId()) {
                  this.setCustomId(other.getCustomId());
               }

               if (other.hasItemIndex()) {
                  this.setItemIndex(other.getItemIndex());
               }

               if (other.hasItem()) {
                  this.mergeItem(other.getItem());
               }

               if (other.hasIsGot()) {
                  this.setIsGot(other.getIsGot());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCustomId()) {
               return false;
            } else if (!this.hasItemIndex()) {
               return false;
            } else {
               return !this.hasItem() || this.getItem().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PrayData parsedMessage = null;

            try {
               parsedMessage = (PrayData)SpringFestivalMsg.PrayData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PrayData)e.getUnfinishedMessage();
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

         public boolean hasItem() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.ItemInfo getItem() {
            if (this.itemBuilder_ == null) {
               return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
            } else {
               return (CommonMsg.ItemInfo)this.itemBuilder_.getMessage();
            }
         }

         public Builder setItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.item_ = value;
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setItem(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.item_ = builderForValue.build();
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.item_ != null && this.item_ != CommonMsg.ItemInfo.getDefaultInstance()) {
                  this.item_ = CommonMsg.ItemInfo.newBuilder(this.item_).mergeFrom(value).buildPartial();
               } else {
                  this.item_ = value;
               }

               this.onChanged();
            } else {
               this.itemBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearItem() {
            if (this.itemBuilder_ == null) {
               this.item_ = null;
               this.onChanged();
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().getBuilder();
         }

         public CommonMsg.ItemInfoOrBuilder getItemOrBuilder() {
            if (this.itemBuilder_ != null) {
               return (CommonMsg.ItemInfoOrBuilder)this.itemBuilder_.getMessageOrBuilder();
            } else {
               return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new SingleFieldBuilderV3(this.getItem(), this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public boolean hasIsGot() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsGot() {
            return this.isGot_;
         }

         public Builder setIsGot(boolean value) {
            this.bitField0_ |= 8;
            this.isGot_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGot() {
            this.bitField0_ &= -9;
            this.isGot_ = false;
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

   public static final class C2S_EnvelopeMain_12401 extends GeneratedMessageV3 implements C2S_EnvelopeMain_12401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_EnvelopeMain_12401 DEFAULT_INSTANCE = new C2S_EnvelopeMain_12401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnvelopeMain_12401> PARSER = new AbstractParser<C2S_EnvelopeMain_12401>() {
         public C2S_EnvelopeMain_12401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnvelopeMain_12401(input, extensionRegistry);
         }
      };

      private C2S_EnvelopeMain_12401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnvelopeMain_12401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnvelopeMain_12401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnvelopeMain_12401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeMain_12401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeMain_12401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnvelopeMain_12401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_EnvelopeMain_12401)) {
            return super.equals(obj);
         } else {
            C2S_EnvelopeMain_12401 other = (C2S_EnvelopeMain_12401)obj;
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

      public static C2S_EnvelopeMain_12401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeMain_12401)PARSER.parseFrom(data);
      }

      public static C2S_EnvelopeMain_12401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeMain_12401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnvelopeMain_12401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeMain_12401)PARSER.parseFrom(data);
      }

      public static C2S_EnvelopeMain_12401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeMain_12401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnvelopeMain_12401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeMain_12401)PARSER.parseFrom(data);
      }

      public static C2S_EnvelopeMain_12401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeMain_12401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnvelopeMain_12401 parseFrom(InputStream input) throws IOException {
         return (C2S_EnvelopeMain_12401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnvelopeMain_12401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnvelopeMain_12401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnvelopeMain_12401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnvelopeMain_12401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnvelopeMain_12401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnvelopeMain_12401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnvelopeMain_12401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnvelopeMain_12401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnvelopeMain_12401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnvelopeMain_12401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnvelopeMain_12401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnvelopeMain_12401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnvelopeMain_12401> parser() {
         return PARSER;
      }

      public Parser<C2S_EnvelopeMain_12401> getParserForType() {
         return PARSER;
      }

      public C2S_EnvelopeMain_12401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnvelopeMain_12401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeMain_12401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeMain_12401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnvelopeMain_12401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_EnvelopeMain_12401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeMain_12401_descriptor;
         }

         public C2S_EnvelopeMain_12401 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_EnvelopeMain_12401.getDefaultInstance();
         }

         public C2S_EnvelopeMain_12401 build() {
            C2S_EnvelopeMain_12401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnvelopeMain_12401 buildPartial() {
            C2S_EnvelopeMain_12401 result = new C2S_EnvelopeMain_12401(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_EnvelopeMain_12401) {
               return this.mergeFrom((C2S_EnvelopeMain_12401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnvelopeMain_12401 other) {
            if (other == SpringFestivalMsg.C2S_EnvelopeMain_12401.getDefaultInstance()) {
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
            C2S_EnvelopeMain_12401 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnvelopeMain_12401)SpringFestivalMsg.C2S_EnvelopeMain_12401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnvelopeMain_12401)e.getUnfinishedMessage();
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

   public static final class S2C_EnvelopeMain_12402 extends GeneratedMessageV3 implements S2C_EnvelopeMain_12402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENDTIME_FIELD_NUMBER = 1;
      private int endTime_;
      private byte memoizedIsInitialized;
      private static final S2C_EnvelopeMain_12402 DEFAULT_INSTANCE = new S2C_EnvelopeMain_12402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnvelopeMain_12402> PARSER = new AbstractParser<S2C_EnvelopeMain_12402>() {
         public S2C_EnvelopeMain_12402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnvelopeMain_12402(input, extensionRegistry);
         }
      };

      private S2C_EnvelopeMain_12402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnvelopeMain_12402() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnvelopeMain_12402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnvelopeMain_12402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeMain_12402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeMain_12402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnvelopeMain_12402.class, Builder.class);
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.endTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnvelopeMain_12402)) {
            return super.equals(obj);
         } else {
            S2C_EnvelopeMain_12402 other = (S2C_EnvelopeMain_12402)obj;
            if (this.hasEndTime() != other.hasEndTime()) {
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
            if (this.hasEndTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEndTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnvelopeMain_12402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeMain_12402)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeMain_12402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeMain_12402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeMain_12402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeMain_12402)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeMain_12402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeMain_12402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeMain_12402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeMain_12402)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeMain_12402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeMain_12402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeMain_12402 parseFrom(InputStream input) throws IOException {
         return (S2C_EnvelopeMain_12402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeMain_12402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeMain_12402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnvelopeMain_12402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnvelopeMain_12402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeMain_12402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeMain_12402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnvelopeMain_12402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnvelopeMain_12402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeMain_12402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeMain_12402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnvelopeMain_12402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnvelopeMain_12402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnvelopeMain_12402> parser() {
         return PARSER;
      }

      public Parser<S2C_EnvelopeMain_12402> getParserForType() {
         return PARSER;
      }

      public S2C_EnvelopeMain_12402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnvelopeMain_12402OrBuilder {
         private int bitField0_;
         private int endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeMain_12402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeMain_12402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnvelopeMain_12402.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_EnvelopeMain_12402.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.endTime_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeMain_12402_descriptor;
         }

         public S2C_EnvelopeMain_12402 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_EnvelopeMain_12402.getDefaultInstance();
         }

         public S2C_EnvelopeMain_12402 build() {
            S2C_EnvelopeMain_12402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnvelopeMain_12402 buildPartial() {
            S2C_EnvelopeMain_12402 result = new S2C_EnvelopeMain_12402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.endTime_ = this.endTime_;
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
            if (other instanceof S2C_EnvelopeMain_12402) {
               return this.mergeFrom((S2C_EnvelopeMain_12402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnvelopeMain_12402 other) {
            if (other == SpringFestivalMsg.S2C_EnvelopeMain_12402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEndTime();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnvelopeMain_12402 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnvelopeMain_12402)SpringFestivalMsg.S2C_EnvelopeMain_12402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnvelopeMain_12402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 1;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -2;
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

   public static final class C2S_EnvelopeBlessList_12403 extends GeneratedMessageV3 implements C2S_EnvelopeBlessList_12403OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_EnvelopeBlessList_12403 DEFAULT_INSTANCE = new C2S_EnvelopeBlessList_12403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnvelopeBlessList_12403> PARSER = new AbstractParser<C2S_EnvelopeBlessList_12403>() {
         public C2S_EnvelopeBlessList_12403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnvelopeBlessList_12403(input, extensionRegistry);
         }
      };

      private C2S_EnvelopeBlessList_12403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnvelopeBlessList_12403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnvelopeBlessList_12403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnvelopeBlessList_12403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBlessList_12403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBlessList_12403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnvelopeBlessList_12403.class, Builder.class);
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
         } else if (!(obj instanceof C2S_EnvelopeBlessList_12403)) {
            return super.equals(obj);
         } else {
            C2S_EnvelopeBlessList_12403 other = (C2S_EnvelopeBlessList_12403)obj;
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

      public static C2S_EnvelopeBlessList_12403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBlessList_12403)PARSER.parseFrom(data);
      }

      public static C2S_EnvelopeBlessList_12403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBlessList_12403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnvelopeBlessList_12403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBlessList_12403)PARSER.parseFrom(data);
      }

      public static C2S_EnvelopeBlessList_12403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBlessList_12403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnvelopeBlessList_12403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBlessList_12403)PARSER.parseFrom(data);
      }

      public static C2S_EnvelopeBlessList_12403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBlessList_12403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnvelopeBlessList_12403 parseFrom(InputStream input) throws IOException {
         return (C2S_EnvelopeBlessList_12403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnvelopeBlessList_12403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnvelopeBlessList_12403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnvelopeBlessList_12403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnvelopeBlessList_12403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnvelopeBlessList_12403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnvelopeBlessList_12403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnvelopeBlessList_12403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnvelopeBlessList_12403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnvelopeBlessList_12403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnvelopeBlessList_12403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnvelopeBlessList_12403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnvelopeBlessList_12403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnvelopeBlessList_12403> parser() {
         return PARSER;
      }

      public Parser<C2S_EnvelopeBlessList_12403> getParserForType() {
         return PARSER;
      }

      public C2S_EnvelopeBlessList_12403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnvelopeBlessList_12403OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBlessList_12403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBlessList_12403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnvelopeBlessList_12403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_EnvelopeBlessList_12403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBlessList_12403_descriptor;
         }

         public C2S_EnvelopeBlessList_12403 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_EnvelopeBlessList_12403.getDefaultInstance();
         }

         public C2S_EnvelopeBlessList_12403 build() {
            C2S_EnvelopeBlessList_12403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnvelopeBlessList_12403 buildPartial() {
            C2S_EnvelopeBlessList_12403 result = new C2S_EnvelopeBlessList_12403(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_EnvelopeBlessList_12403) {
               return this.mergeFrom((C2S_EnvelopeBlessList_12403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnvelopeBlessList_12403 other) {
            if (other == SpringFestivalMsg.C2S_EnvelopeBlessList_12403.getDefaultInstance()) {
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
            C2S_EnvelopeBlessList_12403 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnvelopeBlessList_12403)SpringFestivalMsg.C2S_EnvelopeBlessList_12403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnvelopeBlessList_12403)e.getUnfinishedMessage();
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

   public static final class S2C_EnvelopeBlessList_12404 extends GeneratedMessageV3 implements S2C_EnvelopeBlessList_12404OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BLESSCOUNT_FIELD_NUMBER = 1;
      private int blessCount_;
      public static final int BLESSDATA_FIELD_NUMBER = 2;
      private List<BlessData> blessData_;
      private byte memoizedIsInitialized;
      private static final S2C_EnvelopeBlessList_12404 DEFAULT_INSTANCE = new S2C_EnvelopeBlessList_12404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnvelopeBlessList_12404> PARSER = new AbstractParser<S2C_EnvelopeBlessList_12404>() {
         public S2C_EnvelopeBlessList_12404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnvelopeBlessList_12404(input, extensionRegistry);
         }
      };

      private S2C_EnvelopeBlessList_12404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnvelopeBlessList_12404() {
         this.memoizedIsInitialized = -1;
         this.blessData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnvelopeBlessList_12404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnvelopeBlessList_12404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.blessCount_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.blessData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.blessData_.add(input.readMessage(SpringFestivalMsg.BlessData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.blessData_ = Collections.unmodifiableList(this.blessData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessList_12404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessList_12404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnvelopeBlessList_12404.class, Builder.class);
      }

      public boolean hasBlessCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBlessCount() {
         return this.blessCount_;
      }

      public List<BlessData> getBlessDataList() {
         return this.blessData_;
      }

      public List<? extends BlessDataOrBuilder> getBlessDataOrBuilderList() {
         return this.blessData_;
      }

      public int getBlessDataCount() {
         return this.blessData_.size();
      }

      public BlessData getBlessData(int index) {
         return (BlessData)this.blessData_.get(index);
      }

      public BlessDataOrBuilder getBlessDataOrBuilder(int index) {
         return (BlessDataOrBuilder)this.blessData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBlessCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getBlessDataCount(); ++i) {
               if (!this.getBlessData(i).isInitialized()) {
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
            output.writeInt32(1, this.blessCount_);
         }

         for(int i = 0; i < this.blessData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.blessData_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.blessCount_);
            }

            for(int i = 0; i < this.blessData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.blessData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnvelopeBlessList_12404)) {
            return super.equals(obj);
         } else {
            S2C_EnvelopeBlessList_12404 other = (S2C_EnvelopeBlessList_12404)obj;
            if (this.hasBlessCount() != other.hasBlessCount()) {
               return false;
            } else if (this.hasBlessCount() && this.getBlessCount() != other.getBlessCount()) {
               return false;
            } else if (!this.getBlessDataList().equals(other.getBlessDataList())) {
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
            if (this.hasBlessCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBlessCount();
            }

            if (this.getBlessDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBlessDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnvelopeBlessList_12404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessList_12404)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeBlessList_12404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessList_12404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeBlessList_12404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessList_12404)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeBlessList_12404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessList_12404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeBlessList_12404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessList_12404)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeBlessList_12404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessList_12404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeBlessList_12404 parseFrom(InputStream input) throws IOException {
         return (S2C_EnvelopeBlessList_12404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeBlessList_12404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeBlessList_12404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnvelopeBlessList_12404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnvelopeBlessList_12404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeBlessList_12404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeBlessList_12404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnvelopeBlessList_12404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnvelopeBlessList_12404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeBlessList_12404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeBlessList_12404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnvelopeBlessList_12404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnvelopeBlessList_12404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnvelopeBlessList_12404> parser() {
         return PARSER;
      }

      public Parser<S2C_EnvelopeBlessList_12404> getParserForType() {
         return PARSER;
      }

      public S2C_EnvelopeBlessList_12404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnvelopeBlessList_12404OrBuilder {
         private int bitField0_;
         private int blessCount_;
         private List<BlessData> blessData_;
         private RepeatedFieldBuilderV3<BlessData, BlessData.Builder, BlessDataOrBuilder> blessDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessList_12404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessList_12404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnvelopeBlessList_12404.class, Builder.class);
         }

         private Builder() {
            this.blessData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.blessData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_EnvelopeBlessList_12404.alwaysUseFieldBuilders) {
               this.getBlessDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.blessCount_ = 0;
            this.bitField0_ &= -2;
            if (this.blessDataBuilder_ == null) {
               this.blessData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.blessDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessList_12404_descriptor;
         }

         public S2C_EnvelopeBlessList_12404 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_EnvelopeBlessList_12404.getDefaultInstance();
         }

         public S2C_EnvelopeBlessList_12404 build() {
            S2C_EnvelopeBlessList_12404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnvelopeBlessList_12404 buildPartial() {
            S2C_EnvelopeBlessList_12404 result = new S2C_EnvelopeBlessList_12404(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.blessCount_ = this.blessCount_;
               to_bitField0_ |= 1;
            }

            if (this.blessDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.blessData_ = Collections.unmodifiableList(this.blessData_);
                  this.bitField0_ &= -3;
               }

               result.blessData_ = this.blessData_;
            } else {
               result.blessData_ = this.blessDataBuilder_.build();
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
            if (other instanceof S2C_EnvelopeBlessList_12404) {
               return this.mergeFrom((S2C_EnvelopeBlessList_12404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnvelopeBlessList_12404 other) {
            if (other == SpringFestivalMsg.S2C_EnvelopeBlessList_12404.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBlessCount()) {
                  this.setBlessCount(other.getBlessCount());
               }

               if (this.blessDataBuilder_ == null) {
                  if (!other.blessData_.isEmpty()) {
                     if (this.blessData_.isEmpty()) {
                        this.blessData_ = other.blessData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureBlessDataIsMutable();
                        this.blessData_.addAll(other.blessData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.blessData_.isEmpty()) {
                  if (this.blessDataBuilder_.isEmpty()) {
                     this.blessDataBuilder_.dispose();
                     this.blessDataBuilder_ = null;
                     this.blessData_ = other.blessData_;
                     this.bitField0_ &= -3;
                     this.blessDataBuilder_ = SpringFestivalMsg.S2C_EnvelopeBlessList_12404.alwaysUseFieldBuilders ? this.getBlessDataFieldBuilder() : null;
                  } else {
                     this.blessDataBuilder_.addAllMessages(other.blessData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBlessCount()) {
               return false;
            } else {
               for(int i = 0; i < this.getBlessDataCount(); ++i) {
                  if (!this.getBlessData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnvelopeBlessList_12404 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnvelopeBlessList_12404)SpringFestivalMsg.S2C_EnvelopeBlessList_12404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnvelopeBlessList_12404)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBlessCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBlessCount() {
            return this.blessCount_;
         }

         public Builder setBlessCount(int value) {
            this.bitField0_ |= 1;
            this.blessCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBlessCount() {
            this.bitField0_ &= -2;
            this.blessCount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBlessDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.blessData_ = new ArrayList(this.blessData_);
               this.bitField0_ |= 2;
            }

         }

         public List<BlessData> getBlessDataList() {
            return this.blessDataBuilder_ == null ? Collections.unmodifiableList(this.blessData_) : this.blessDataBuilder_.getMessageList();
         }

         public int getBlessDataCount() {
            return this.blessDataBuilder_ == null ? this.blessData_.size() : this.blessDataBuilder_.getCount();
         }

         public BlessData getBlessData(int index) {
            return this.blessDataBuilder_ == null ? (BlessData)this.blessData_.get(index) : (BlessData)this.blessDataBuilder_.getMessage(index);
         }

         public Builder setBlessData(int index, BlessData value) {
            if (this.blessDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBlessDataIsMutable();
               this.blessData_.set(index, value);
               this.onChanged();
            } else {
               this.blessDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBlessData(int index, BlessData.Builder builderForValue) {
            if (this.blessDataBuilder_ == null) {
               this.ensureBlessDataIsMutable();
               this.blessData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.blessDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBlessData(BlessData value) {
            if (this.blessDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBlessDataIsMutable();
               this.blessData_.add(value);
               this.onChanged();
            } else {
               this.blessDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBlessData(int index, BlessData value) {
            if (this.blessDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBlessDataIsMutable();
               this.blessData_.add(index, value);
               this.onChanged();
            } else {
               this.blessDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBlessData(BlessData.Builder builderForValue) {
            if (this.blessDataBuilder_ == null) {
               this.ensureBlessDataIsMutable();
               this.blessData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.blessDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBlessData(int index, BlessData.Builder builderForValue) {
            if (this.blessDataBuilder_ == null) {
               this.ensureBlessDataIsMutable();
               this.blessData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.blessDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBlessData(Iterable<? extends BlessData> values) {
            if (this.blessDataBuilder_ == null) {
               this.ensureBlessDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.blessData_);
               this.onChanged();
            } else {
               this.blessDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBlessData() {
            if (this.blessDataBuilder_ == null) {
               this.blessData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.blessDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeBlessData(int index) {
            if (this.blessDataBuilder_ == null) {
               this.ensureBlessDataIsMutable();
               this.blessData_.remove(index);
               this.onChanged();
            } else {
               this.blessDataBuilder_.remove(index);
            }

            return this;
         }

         public BlessData.Builder getBlessDataBuilder(int index) {
            return (BlessData.Builder)this.getBlessDataFieldBuilder().getBuilder(index);
         }

         public BlessDataOrBuilder getBlessDataOrBuilder(int index) {
            return this.blessDataBuilder_ == null ? (BlessDataOrBuilder)this.blessData_.get(index) : (BlessDataOrBuilder)this.blessDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends BlessDataOrBuilder> getBlessDataOrBuilderList() {
            return this.blessDataBuilder_ != null ? this.blessDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.blessData_);
         }

         public BlessData.Builder addBlessDataBuilder() {
            return (BlessData.Builder)this.getBlessDataFieldBuilder().addBuilder(SpringFestivalMsg.BlessData.getDefaultInstance());
         }

         public BlessData.Builder addBlessDataBuilder(int index) {
            return (BlessData.Builder)this.getBlessDataFieldBuilder().addBuilder(index, SpringFestivalMsg.BlessData.getDefaultInstance());
         }

         public List<BlessData.Builder> getBlessDataBuilderList() {
            return this.getBlessDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<BlessData, BlessData.Builder, BlessDataOrBuilder> getBlessDataFieldBuilder() {
            if (this.blessDataBuilder_ == null) {
               this.blessDataBuilder_ = new RepeatedFieldBuilderV3(this.blessData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.blessData_ = null;
            }

            return this.blessDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_EnvelopeBless_12405 extends GeneratedMessageV3 implements C2S_EnvelopeBless_12405OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CONTENT_FIELD_NUMBER = 1;
      private volatile Object content_;
      private byte memoizedIsInitialized;
      private static final C2S_EnvelopeBless_12405 DEFAULT_INSTANCE = new C2S_EnvelopeBless_12405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnvelopeBless_12405> PARSER = new AbstractParser<C2S_EnvelopeBless_12405>() {
         public C2S_EnvelopeBless_12405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnvelopeBless_12405(input, extensionRegistry);
         }
      };

      private C2S_EnvelopeBless_12405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnvelopeBless_12405() {
         this.memoizedIsInitialized = -1;
         this.content_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnvelopeBless_12405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnvelopeBless_12405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.content_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBless_12405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBless_12405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnvelopeBless_12405.class, Builder.class);
      }

      public boolean hasContent() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getContent() {
         Object ref = this.content_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.content_ = s;
            }

            return s;
         }
      }

      public ByteString getContentBytes() {
         Object ref = this.content_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.content_ = b;
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
         } else if (!this.hasContent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.content_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.content_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_EnvelopeBless_12405)) {
            return super.equals(obj);
         } else {
            C2S_EnvelopeBless_12405 other = (C2S_EnvelopeBless_12405)obj;
            if (this.hasContent() != other.hasContent()) {
               return false;
            } else if (this.hasContent() && !this.getContent().equals(other.getContent())) {
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
            if (this.hasContent()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getContent().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_EnvelopeBless_12405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBless_12405)PARSER.parseFrom(data);
      }

      public static C2S_EnvelopeBless_12405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBless_12405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnvelopeBless_12405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBless_12405)PARSER.parseFrom(data);
      }

      public static C2S_EnvelopeBless_12405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBless_12405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnvelopeBless_12405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBless_12405)PARSER.parseFrom(data);
      }

      public static C2S_EnvelopeBless_12405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnvelopeBless_12405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnvelopeBless_12405 parseFrom(InputStream input) throws IOException {
         return (C2S_EnvelopeBless_12405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnvelopeBless_12405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnvelopeBless_12405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnvelopeBless_12405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnvelopeBless_12405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnvelopeBless_12405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnvelopeBless_12405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnvelopeBless_12405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnvelopeBless_12405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnvelopeBless_12405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnvelopeBless_12405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnvelopeBless_12405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnvelopeBless_12405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnvelopeBless_12405> parser() {
         return PARSER;
      }

      public Parser<C2S_EnvelopeBless_12405> getParserForType() {
         return PARSER;
      }

      public C2S_EnvelopeBless_12405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnvelopeBless_12405OrBuilder {
         private int bitField0_;
         private Object content_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBless_12405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBless_12405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnvelopeBless_12405.class, Builder.class);
         }

         private Builder() {
            this.content_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.content_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_EnvelopeBless_12405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.content_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_EnvelopeBless_12405_descriptor;
         }

         public C2S_EnvelopeBless_12405 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_EnvelopeBless_12405.getDefaultInstance();
         }

         public C2S_EnvelopeBless_12405 build() {
            C2S_EnvelopeBless_12405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnvelopeBless_12405 buildPartial() {
            C2S_EnvelopeBless_12405 result = new C2S_EnvelopeBless_12405(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.content_ = this.content_;
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
            if (other instanceof C2S_EnvelopeBless_12405) {
               return this.mergeFrom((C2S_EnvelopeBless_12405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnvelopeBless_12405 other) {
            if (other == SpringFestivalMsg.C2S_EnvelopeBless_12405.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasContent()) {
                  this.bitField0_ |= 1;
                  this.content_ = other.content_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasContent();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EnvelopeBless_12405 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnvelopeBless_12405)SpringFestivalMsg.C2S_EnvelopeBless_12405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnvelopeBless_12405)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasContent() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getContent() {
            Object ref = this.content_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.content_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContentBytes() {
            Object ref = this.content_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.content_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContent(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContent() {
            this.bitField0_ &= -2;
            this.content_ = SpringFestivalMsg.C2S_EnvelopeBless_12405.getDefaultInstance().getContent();
            this.onChanged();
            return this;
         }

         public Builder setContentBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.content_ = value;
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

   public static final class S2C_EnvelopeBless_12406 extends GeneratedMessageV3 implements S2C_EnvelopeBless_12406OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CONTENT_FIELD_NUMBER = 1;
      private volatile Object content_;
      private byte memoizedIsInitialized;
      private static final S2C_EnvelopeBless_12406 DEFAULT_INSTANCE = new S2C_EnvelopeBless_12406();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnvelopeBless_12406> PARSER = new AbstractParser<S2C_EnvelopeBless_12406>() {
         public S2C_EnvelopeBless_12406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnvelopeBless_12406(input, extensionRegistry);
         }
      };

      private S2C_EnvelopeBless_12406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnvelopeBless_12406() {
         this.memoizedIsInitialized = -1;
         this.content_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnvelopeBless_12406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnvelopeBless_12406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.content_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBless_12406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBless_12406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnvelopeBless_12406.class, Builder.class);
      }

      public boolean hasContent() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getContent() {
         Object ref = this.content_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.content_ = s;
            }

            return s;
         }
      }

      public ByteString getContentBytes() {
         Object ref = this.content_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.content_ = b;
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
         } else if (!this.hasContent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.content_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.content_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnvelopeBless_12406)) {
            return super.equals(obj);
         } else {
            S2C_EnvelopeBless_12406 other = (S2C_EnvelopeBless_12406)obj;
            if (this.hasContent() != other.hasContent()) {
               return false;
            } else if (this.hasContent() && !this.getContent().equals(other.getContent())) {
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
            if (this.hasContent()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getContent().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnvelopeBless_12406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBless_12406)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeBless_12406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBless_12406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeBless_12406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBless_12406)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeBless_12406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBless_12406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeBless_12406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBless_12406)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeBless_12406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBless_12406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeBless_12406 parseFrom(InputStream input) throws IOException {
         return (S2C_EnvelopeBless_12406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeBless_12406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeBless_12406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnvelopeBless_12406 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnvelopeBless_12406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeBless_12406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeBless_12406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnvelopeBless_12406 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnvelopeBless_12406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeBless_12406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeBless_12406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnvelopeBless_12406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnvelopeBless_12406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnvelopeBless_12406> parser() {
         return PARSER;
      }

      public Parser<S2C_EnvelopeBless_12406> getParserForType() {
         return PARSER;
      }

      public S2C_EnvelopeBless_12406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnvelopeBless_12406OrBuilder {
         private int bitField0_;
         private Object content_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBless_12406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBless_12406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnvelopeBless_12406.class, Builder.class);
         }

         private Builder() {
            this.content_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.content_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_EnvelopeBless_12406.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.content_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBless_12406_descriptor;
         }

         public S2C_EnvelopeBless_12406 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_EnvelopeBless_12406.getDefaultInstance();
         }

         public S2C_EnvelopeBless_12406 build() {
            S2C_EnvelopeBless_12406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnvelopeBless_12406 buildPartial() {
            S2C_EnvelopeBless_12406 result = new S2C_EnvelopeBless_12406(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.content_ = this.content_;
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
            if (other instanceof S2C_EnvelopeBless_12406) {
               return this.mergeFrom((S2C_EnvelopeBless_12406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnvelopeBless_12406 other) {
            if (other == SpringFestivalMsg.S2C_EnvelopeBless_12406.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasContent()) {
                  this.bitField0_ |= 1;
                  this.content_ = other.content_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasContent();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnvelopeBless_12406 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnvelopeBless_12406)SpringFestivalMsg.S2C_EnvelopeBless_12406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnvelopeBless_12406)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasContent() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getContent() {
            Object ref = this.content_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.content_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContentBytes() {
            Object ref = this.content_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.content_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContent(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContent() {
            this.bitField0_ &= -2;
            this.content_ = SpringFestivalMsg.S2C_EnvelopeBless_12406.getDefaultInstance().getContent();
            this.onChanged();
            return this;
         }

         public Builder setContentBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.content_ = value;
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

   public static final class S2C_EnvelopeBlessNotify_12408 extends GeneratedMessageV3 implements S2C_EnvelopeBlessNotify_12408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BLESSDATA_FIELD_NUMBER = 1;
      private BlessData blessData_;
      private byte memoizedIsInitialized;
      private static final S2C_EnvelopeBlessNotify_12408 DEFAULT_INSTANCE = new S2C_EnvelopeBlessNotify_12408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnvelopeBlessNotify_12408> PARSER = new AbstractParser<S2C_EnvelopeBlessNotify_12408>() {
         public S2C_EnvelopeBlessNotify_12408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnvelopeBlessNotify_12408(input, extensionRegistry);
         }
      };

      private S2C_EnvelopeBlessNotify_12408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnvelopeBlessNotify_12408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnvelopeBlessNotify_12408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnvelopeBlessNotify_12408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        BlessData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.blessData_.toBuilder();
                        }

                        this.blessData_ = (BlessData)input.readMessage(SpringFestivalMsg.BlessData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.blessData_);
                           this.blessData_ = subBuilder.buildPartial();
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
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessNotify_12408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessNotify_12408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnvelopeBlessNotify_12408.class, Builder.class);
      }

      public boolean hasBlessData() {
         return (this.bitField0_ & 1) != 0;
      }

      public BlessData getBlessData() {
         return this.blessData_ == null ? SpringFestivalMsg.BlessData.getDefaultInstance() : this.blessData_;
      }

      public BlessDataOrBuilder getBlessDataOrBuilder() {
         return this.blessData_ == null ? SpringFestivalMsg.BlessData.getDefaultInstance() : this.blessData_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBlessData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBlessData().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getBlessData());
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
               size += CodedOutputStream.computeMessageSize(1, this.getBlessData());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnvelopeBlessNotify_12408)) {
            return super.equals(obj);
         } else {
            S2C_EnvelopeBlessNotify_12408 other = (S2C_EnvelopeBlessNotify_12408)obj;
            if (this.hasBlessData() != other.hasBlessData()) {
               return false;
            } else if (this.hasBlessData() && !this.getBlessData().equals(other.getBlessData())) {
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
            if (this.hasBlessData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBlessData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnvelopeBlessNotify_12408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessNotify_12408)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessNotify_12408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessNotify_12408)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessNotify_12408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessNotify_12408)PARSER.parseFrom(data);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnvelopeBlessNotify_12408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseFrom(InputStream input) throws IOException {
         return (S2C_EnvelopeBlessNotify_12408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeBlessNotify_12408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnvelopeBlessNotify_12408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeBlessNotify_12408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnvelopeBlessNotify_12408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnvelopeBlessNotify_12408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnvelopeBlessNotify_12408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnvelopeBlessNotify_12408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnvelopeBlessNotify_12408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnvelopeBlessNotify_12408> parser() {
         return PARSER;
      }

      public Parser<S2C_EnvelopeBlessNotify_12408> getParserForType() {
         return PARSER;
      }

      public S2C_EnvelopeBlessNotify_12408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnvelopeBlessNotify_12408OrBuilder {
         private int bitField0_;
         private BlessData blessData_;
         private SingleFieldBuilderV3<BlessData, BlessData.Builder, BlessDataOrBuilder> blessDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessNotify_12408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessNotify_12408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnvelopeBlessNotify_12408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_EnvelopeBlessNotify_12408.alwaysUseFieldBuilders) {
               this.getBlessDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.blessDataBuilder_ == null) {
               this.blessData_ = null;
            } else {
               this.blessDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_EnvelopeBlessNotify_12408_descriptor;
         }

         public S2C_EnvelopeBlessNotify_12408 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_EnvelopeBlessNotify_12408.getDefaultInstance();
         }

         public S2C_EnvelopeBlessNotify_12408 build() {
            S2C_EnvelopeBlessNotify_12408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnvelopeBlessNotify_12408 buildPartial() {
            S2C_EnvelopeBlessNotify_12408 result = new S2C_EnvelopeBlessNotify_12408(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.blessDataBuilder_ == null) {
                  result.blessData_ = this.blessData_;
               } else {
                  result.blessData_ = (BlessData)this.blessDataBuilder_.build();
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
            if (other instanceof S2C_EnvelopeBlessNotify_12408) {
               return this.mergeFrom((S2C_EnvelopeBlessNotify_12408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnvelopeBlessNotify_12408 other) {
            if (other == SpringFestivalMsg.S2C_EnvelopeBlessNotify_12408.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBlessData()) {
                  this.mergeBlessData(other.getBlessData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBlessData()) {
               return false;
            } else {
               return this.getBlessData().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnvelopeBlessNotify_12408 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnvelopeBlessNotify_12408)SpringFestivalMsg.S2C_EnvelopeBlessNotify_12408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnvelopeBlessNotify_12408)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBlessData() {
            return (this.bitField0_ & 1) != 0;
         }

         public BlessData getBlessData() {
            if (this.blessDataBuilder_ == null) {
               return this.blessData_ == null ? SpringFestivalMsg.BlessData.getDefaultInstance() : this.blessData_;
            } else {
               return (BlessData)this.blessDataBuilder_.getMessage();
            }
         }

         public Builder setBlessData(BlessData value) {
            if (this.blessDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.blessData_ = value;
               this.onChanged();
            } else {
               this.blessDataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setBlessData(BlessData.Builder builderForValue) {
            if (this.blessDataBuilder_ == null) {
               this.blessData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.blessDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeBlessData(BlessData value) {
            if (this.blessDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.blessData_ != null && this.blessData_ != SpringFestivalMsg.BlessData.getDefaultInstance()) {
                  this.blessData_ = SpringFestivalMsg.BlessData.newBuilder(this.blessData_).mergeFrom(value).buildPartial();
               } else {
                  this.blessData_ = value;
               }

               this.onChanged();
            } else {
               this.blessDataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearBlessData() {
            if (this.blessDataBuilder_ == null) {
               this.blessData_ = null;
               this.onChanged();
            } else {
               this.blessDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public BlessData.Builder getBlessDataBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (BlessData.Builder)this.getBlessDataFieldBuilder().getBuilder();
         }

         public BlessDataOrBuilder getBlessDataOrBuilder() {
            if (this.blessDataBuilder_ != null) {
               return (BlessDataOrBuilder)this.blessDataBuilder_.getMessageOrBuilder();
            } else {
               return this.blessData_ == null ? SpringFestivalMsg.BlessData.getDefaultInstance() : this.blessData_;
            }
         }

         private SingleFieldBuilderV3<BlessData, BlessData.Builder, BlessDataOrBuilder> getBlessDataFieldBuilder() {
            if (this.blessDataBuilder_ == null) {
               this.blessDataBuilder_ = new SingleFieldBuilderV3(this.getBlessData(), this.getParentForChildren(), this.isClean());
               this.blessData_ = null;
            }

            return this.blessDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LuckMain_12409 extends GeneratedMessageV3 implements C2S_LuckMain_12409OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckMain_12409 DEFAULT_INSTANCE = new C2S_LuckMain_12409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckMain_12409> PARSER = new AbstractParser<C2S_LuckMain_12409>() {
         public C2S_LuckMain_12409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckMain_12409(input, extensionRegistry);
         }
      };

      private C2S_LuckMain_12409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckMain_12409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckMain_12409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckMain_12409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_LuckMain_12409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_LuckMain_12409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckMain_12409.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckMain_12409)) {
            return super.equals(obj);
         } else {
            C2S_LuckMain_12409 other = (C2S_LuckMain_12409)obj;
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

      public static C2S_LuckMain_12409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckMain_12409)PARSER.parseFrom(data);
      }

      public static C2S_LuckMain_12409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckMain_12409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckMain_12409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckMain_12409)PARSER.parseFrom(data);
      }

      public static C2S_LuckMain_12409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckMain_12409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckMain_12409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckMain_12409)PARSER.parseFrom(data);
      }

      public static C2S_LuckMain_12409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckMain_12409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckMain_12409 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckMain_12409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckMain_12409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckMain_12409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckMain_12409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckMain_12409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckMain_12409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckMain_12409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckMain_12409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckMain_12409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckMain_12409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckMain_12409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckMain_12409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckMain_12409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckMain_12409> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckMain_12409> getParserForType() {
         return PARSER;
      }

      public C2S_LuckMain_12409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckMain_12409OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_LuckMain_12409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_LuckMain_12409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckMain_12409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_LuckMain_12409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_LuckMain_12409_descriptor;
         }

         public C2S_LuckMain_12409 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_LuckMain_12409.getDefaultInstance();
         }

         public C2S_LuckMain_12409 build() {
            C2S_LuckMain_12409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckMain_12409 buildPartial() {
            C2S_LuckMain_12409 result = new C2S_LuckMain_12409(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LuckMain_12409) {
               return this.mergeFrom((C2S_LuckMain_12409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckMain_12409 other) {
            if (other == SpringFestivalMsg.C2S_LuckMain_12409.getDefaultInstance()) {
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
            C2S_LuckMain_12409 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckMain_12409)SpringFestivalMsg.C2S_LuckMain_12409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckMain_12409)e.getUnfinishedMessage();
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

   public static final class S2C_LuckMain_12410 extends GeneratedMessageV3 implements S2C_LuckMain_12410OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int DICEPLATE_FIELD_NUMBER = 1;
      private List<DicePlateData> dicePlate_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckMain_12410 DEFAULT_INSTANCE = new S2C_LuckMain_12410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckMain_12410> PARSER = new AbstractParser<S2C_LuckMain_12410>() {
         public S2C_LuckMain_12410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckMain_12410(input, extensionRegistry);
         }
      };

      private S2C_LuckMain_12410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckMain_12410() {
         this.memoizedIsInitialized = -1;
         this.dicePlate_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckMain_12410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckMain_12410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.dicePlate_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.dicePlate_.add(input.readMessage(SpringFestivalMsg.DicePlateData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.dicePlate_ = Collections.unmodifiableList(this.dicePlate_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_LuckMain_12410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_LuckMain_12410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckMain_12410.class, Builder.class);
      }

      public List<DicePlateData> getDicePlateList() {
         return this.dicePlate_;
      }

      public List<? extends DicePlateDataOrBuilder> getDicePlateOrBuilderList() {
         return this.dicePlate_;
      }

      public int getDicePlateCount() {
         return this.dicePlate_.size();
      }

      public DicePlateData getDicePlate(int index) {
         return (DicePlateData)this.dicePlate_.get(index);
      }

      public DicePlateDataOrBuilder getDicePlateOrBuilder(int index) {
         return (DicePlateDataOrBuilder)this.dicePlate_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getDicePlateCount(); ++i) {
               if (!this.getDicePlate(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.dicePlate_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.dicePlate_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.dicePlate_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.dicePlate_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LuckMain_12410)) {
            return super.equals(obj);
         } else {
            S2C_LuckMain_12410 other = (S2C_LuckMain_12410)obj;
            if (!this.getDicePlateList().equals(other.getDicePlateList())) {
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
            if (this.getDicePlateCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDicePlateList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LuckMain_12410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckMain_12410)PARSER.parseFrom(data);
      }

      public static S2C_LuckMain_12410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckMain_12410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckMain_12410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckMain_12410)PARSER.parseFrom(data);
      }

      public static S2C_LuckMain_12410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckMain_12410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckMain_12410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckMain_12410)PARSER.parseFrom(data);
      }

      public static S2C_LuckMain_12410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckMain_12410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckMain_12410 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckMain_12410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckMain_12410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckMain_12410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckMain_12410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckMain_12410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckMain_12410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckMain_12410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckMain_12410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckMain_12410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckMain_12410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckMain_12410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckMain_12410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckMain_12410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckMain_12410> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckMain_12410> getParserForType() {
         return PARSER;
      }

      public S2C_LuckMain_12410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckMain_12410OrBuilder {
         private int bitField0_;
         private List<DicePlateData> dicePlate_;
         private RepeatedFieldBuilderV3<DicePlateData, DicePlateData.Builder, DicePlateDataOrBuilder> dicePlateBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_LuckMain_12410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_LuckMain_12410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckMain_12410.class, Builder.class);
         }

         private Builder() {
            this.dicePlate_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.dicePlate_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_LuckMain_12410.alwaysUseFieldBuilders) {
               this.getDicePlateFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dicePlateBuilder_ == null) {
               this.dicePlate_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.dicePlateBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_LuckMain_12410_descriptor;
         }

         public S2C_LuckMain_12410 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_LuckMain_12410.getDefaultInstance();
         }

         public S2C_LuckMain_12410 build() {
            S2C_LuckMain_12410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckMain_12410 buildPartial() {
            S2C_LuckMain_12410 result = new S2C_LuckMain_12410(this);
            int from_bitField0_ = this.bitField0_;
            if (this.dicePlateBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.dicePlate_ = Collections.unmodifiableList(this.dicePlate_);
                  this.bitField0_ &= -2;
               }

               result.dicePlate_ = this.dicePlate_;
            } else {
               result.dicePlate_ = this.dicePlateBuilder_.build();
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
            if (other instanceof S2C_LuckMain_12410) {
               return this.mergeFrom((S2C_LuckMain_12410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckMain_12410 other) {
            if (other == SpringFestivalMsg.S2C_LuckMain_12410.getDefaultInstance()) {
               return this;
            } else {
               if (this.dicePlateBuilder_ == null) {
                  if (!other.dicePlate_.isEmpty()) {
                     if (this.dicePlate_.isEmpty()) {
                        this.dicePlate_ = other.dicePlate_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureDicePlateIsMutable();
                        this.dicePlate_.addAll(other.dicePlate_);
                     }

                     this.onChanged();
                  }
               } else if (!other.dicePlate_.isEmpty()) {
                  if (this.dicePlateBuilder_.isEmpty()) {
                     this.dicePlateBuilder_.dispose();
                     this.dicePlateBuilder_ = null;
                     this.dicePlate_ = other.dicePlate_;
                     this.bitField0_ &= -2;
                     this.dicePlateBuilder_ = SpringFestivalMsg.S2C_LuckMain_12410.alwaysUseFieldBuilders ? this.getDicePlateFieldBuilder() : null;
                  } else {
                     this.dicePlateBuilder_.addAllMessages(other.dicePlate_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getDicePlateCount(); ++i) {
               if (!this.getDicePlate(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LuckMain_12410 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckMain_12410)SpringFestivalMsg.S2C_LuckMain_12410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckMain_12410)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureDicePlateIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.dicePlate_ = new ArrayList(this.dicePlate_);
               this.bitField0_ |= 1;
            }

         }

         public List<DicePlateData> getDicePlateList() {
            return this.dicePlateBuilder_ == null ? Collections.unmodifiableList(this.dicePlate_) : this.dicePlateBuilder_.getMessageList();
         }

         public int getDicePlateCount() {
            return this.dicePlateBuilder_ == null ? this.dicePlate_.size() : this.dicePlateBuilder_.getCount();
         }

         public DicePlateData getDicePlate(int index) {
            return this.dicePlateBuilder_ == null ? (DicePlateData)this.dicePlate_.get(index) : (DicePlateData)this.dicePlateBuilder_.getMessage(index);
         }

         public Builder setDicePlate(int index, DicePlateData value) {
            if (this.dicePlateBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDicePlateIsMutable();
               this.dicePlate_.set(index, value);
               this.onChanged();
            } else {
               this.dicePlateBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDicePlate(int index, DicePlateData.Builder builderForValue) {
            if (this.dicePlateBuilder_ == null) {
               this.ensureDicePlateIsMutable();
               this.dicePlate_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dicePlateBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDicePlate(DicePlateData value) {
            if (this.dicePlateBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDicePlateIsMutable();
               this.dicePlate_.add(value);
               this.onChanged();
            } else {
               this.dicePlateBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDicePlate(int index, DicePlateData value) {
            if (this.dicePlateBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDicePlateIsMutable();
               this.dicePlate_.add(index, value);
               this.onChanged();
            } else {
               this.dicePlateBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDicePlate(DicePlateData.Builder builderForValue) {
            if (this.dicePlateBuilder_ == null) {
               this.ensureDicePlateIsMutable();
               this.dicePlate_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dicePlateBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDicePlate(int index, DicePlateData.Builder builderForValue) {
            if (this.dicePlateBuilder_ == null) {
               this.ensureDicePlateIsMutable();
               this.dicePlate_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dicePlateBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDicePlate(Iterable<? extends DicePlateData> values) {
            if (this.dicePlateBuilder_ == null) {
               this.ensureDicePlateIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.dicePlate_);
               this.onChanged();
            } else {
               this.dicePlateBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDicePlate() {
            if (this.dicePlateBuilder_ == null) {
               this.dicePlate_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.dicePlateBuilder_.clear();
            }

            return this;
         }

         public Builder removeDicePlate(int index) {
            if (this.dicePlateBuilder_ == null) {
               this.ensureDicePlateIsMutable();
               this.dicePlate_.remove(index);
               this.onChanged();
            } else {
               this.dicePlateBuilder_.remove(index);
            }

            return this;
         }

         public DicePlateData.Builder getDicePlateBuilder(int index) {
            return (DicePlateData.Builder)this.getDicePlateFieldBuilder().getBuilder(index);
         }

         public DicePlateDataOrBuilder getDicePlateOrBuilder(int index) {
            return this.dicePlateBuilder_ == null ? (DicePlateDataOrBuilder)this.dicePlate_.get(index) : (DicePlateDataOrBuilder)this.dicePlateBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends DicePlateDataOrBuilder> getDicePlateOrBuilderList() {
            return this.dicePlateBuilder_ != null ? this.dicePlateBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.dicePlate_);
         }

         public DicePlateData.Builder addDicePlateBuilder() {
            return (DicePlateData.Builder)this.getDicePlateFieldBuilder().addBuilder(SpringFestivalMsg.DicePlateData.getDefaultInstance());
         }

         public DicePlateData.Builder addDicePlateBuilder(int index) {
            return (DicePlateData.Builder)this.getDicePlateFieldBuilder().addBuilder(index, SpringFestivalMsg.DicePlateData.getDefaultInstance());
         }

         public List<DicePlateData.Builder> getDicePlateBuilderList() {
            return this.getDicePlateFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DicePlateData, DicePlateData.Builder, DicePlateDataOrBuilder> getDicePlateFieldBuilder() {
            if (this.dicePlateBuilder_ == null) {
               this.dicePlateBuilder_ = new RepeatedFieldBuilderV3(this.dicePlate_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.dicePlate_ = null;
            }

            return this.dicePlateBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LuckRollDice_12411 extends GeneratedMessageV3 implements C2S_LuckRollDice_12411OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DICEPLATEID_FIELD_NUMBER = 1;
      private int dicePlateId_;
      private byte memoizedIsInitialized;
      private static final C2S_LuckRollDice_12411 DEFAULT_INSTANCE = new C2S_LuckRollDice_12411();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckRollDice_12411> PARSER = new AbstractParser<C2S_LuckRollDice_12411>() {
         public C2S_LuckRollDice_12411 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckRollDice_12411(input, extensionRegistry);
         }
      };

      private C2S_LuckRollDice_12411(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckRollDice_12411() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckRollDice_12411();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckRollDice_12411(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dicePlateId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_LuckRollDice_12411_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_LuckRollDice_12411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckRollDice_12411.class, Builder.class);
      }

      public boolean hasDicePlateId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDicePlateId() {
         return this.dicePlateId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDicePlateId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dicePlateId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.dicePlateId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LuckRollDice_12411)) {
            return super.equals(obj);
         } else {
            C2S_LuckRollDice_12411 other = (C2S_LuckRollDice_12411)obj;
            if (this.hasDicePlateId() != other.hasDicePlateId()) {
               return false;
            } else if (this.hasDicePlateId() && this.getDicePlateId() != other.getDicePlateId()) {
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
            if (this.hasDicePlateId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDicePlateId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LuckRollDice_12411 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckRollDice_12411)PARSER.parseFrom(data);
      }

      public static C2S_LuckRollDice_12411 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckRollDice_12411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckRollDice_12411 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckRollDice_12411)PARSER.parseFrom(data);
      }

      public static C2S_LuckRollDice_12411 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckRollDice_12411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckRollDice_12411 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckRollDice_12411)PARSER.parseFrom(data);
      }

      public static C2S_LuckRollDice_12411 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckRollDice_12411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckRollDice_12411 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckRollDice_12411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckRollDice_12411 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckRollDice_12411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckRollDice_12411 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckRollDice_12411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckRollDice_12411 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckRollDice_12411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckRollDice_12411 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckRollDice_12411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckRollDice_12411 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckRollDice_12411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckRollDice_12411 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckRollDice_12411 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckRollDice_12411> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckRollDice_12411> getParserForType() {
         return PARSER;
      }

      public C2S_LuckRollDice_12411 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckRollDice_12411OrBuilder {
         private int bitField0_;
         private int dicePlateId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_LuckRollDice_12411_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_LuckRollDice_12411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckRollDice_12411.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_LuckRollDice_12411.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dicePlateId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_LuckRollDice_12411_descriptor;
         }

         public C2S_LuckRollDice_12411 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_LuckRollDice_12411.getDefaultInstance();
         }

         public C2S_LuckRollDice_12411 build() {
            C2S_LuckRollDice_12411 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckRollDice_12411 buildPartial() {
            C2S_LuckRollDice_12411 result = new C2S_LuckRollDice_12411(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dicePlateId_ = this.dicePlateId_;
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
            if (other instanceof C2S_LuckRollDice_12411) {
               return this.mergeFrom((C2S_LuckRollDice_12411)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckRollDice_12411 other) {
            if (other == SpringFestivalMsg.C2S_LuckRollDice_12411.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDicePlateId()) {
                  this.setDicePlateId(other.getDicePlateId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDicePlateId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LuckRollDice_12411 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckRollDice_12411)SpringFestivalMsg.C2S_LuckRollDice_12411.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckRollDice_12411)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDicePlateId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDicePlateId() {
            return this.dicePlateId_;
         }

         public Builder setDicePlateId(int value) {
            this.bitField0_ |= 1;
            this.dicePlateId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDicePlateId() {
            this.bitField0_ &= -2;
            this.dicePlateId_ = 0;
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

   public static final class S2C_LuckRollDice_12412 extends GeneratedMessageV3 implements S2C_LuckRollDice_12412OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DICEPLATEID_FIELD_NUMBER = 1;
      private int dicePlateId_;
      public static final int DICE_FIELD_NUMBER = 2;
      private List<DiceData> dice_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckRollDice_12412 DEFAULT_INSTANCE = new S2C_LuckRollDice_12412();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckRollDice_12412> PARSER = new AbstractParser<S2C_LuckRollDice_12412>() {
         public S2C_LuckRollDice_12412 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckRollDice_12412(input, extensionRegistry);
         }
      };

      private S2C_LuckRollDice_12412(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckRollDice_12412() {
         this.memoizedIsInitialized = -1;
         this.dice_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckRollDice_12412();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckRollDice_12412(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dicePlateId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.dice_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.dice_.add(input.readMessage(SpringFestivalMsg.DiceData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.dice_ = Collections.unmodifiableList(this.dice_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_LuckRollDice_12412_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_LuckRollDice_12412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckRollDice_12412.class, Builder.class);
      }

      public boolean hasDicePlateId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDicePlateId() {
         return this.dicePlateId_;
      }

      public List<DiceData> getDiceList() {
         return this.dice_;
      }

      public List<? extends DiceDataOrBuilder> getDiceOrBuilderList() {
         return this.dice_;
      }

      public int getDiceCount() {
         return this.dice_.size();
      }

      public DiceData getDice(int index) {
         return (DiceData)this.dice_.get(index);
      }

      public DiceDataOrBuilder getDiceOrBuilder(int index) {
         return (DiceDataOrBuilder)this.dice_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDicePlateId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getDiceCount(); ++i) {
               if (!this.getDice(i).isInitialized()) {
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
            output.writeInt32(1, this.dicePlateId_);
         }

         for(int i = 0; i < this.dice_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.dice_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.dicePlateId_);
            }

            for(int i = 0; i < this.dice_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.dice_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LuckRollDice_12412)) {
            return super.equals(obj);
         } else {
            S2C_LuckRollDice_12412 other = (S2C_LuckRollDice_12412)obj;
            if (this.hasDicePlateId() != other.hasDicePlateId()) {
               return false;
            } else if (this.hasDicePlateId() && this.getDicePlateId() != other.getDicePlateId()) {
               return false;
            } else if (!this.getDiceList().equals(other.getDiceList())) {
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
            if (this.hasDicePlateId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDicePlateId();
            }

            if (this.getDiceCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDiceList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LuckRollDice_12412 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckRollDice_12412)PARSER.parseFrom(data);
      }

      public static S2C_LuckRollDice_12412 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckRollDice_12412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckRollDice_12412 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckRollDice_12412)PARSER.parseFrom(data);
      }

      public static S2C_LuckRollDice_12412 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckRollDice_12412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckRollDice_12412 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckRollDice_12412)PARSER.parseFrom(data);
      }

      public static S2C_LuckRollDice_12412 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckRollDice_12412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckRollDice_12412 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckRollDice_12412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckRollDice_12412 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckRollDice_12412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckRollDice_12412 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckRollDice_12412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckRollDice_12412 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckRollDice_12412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckRollDice_12412 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckRollDice_12412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckRollDice_12412 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckRollDice_12412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckRollDice_12412 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckRollDice_12412 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckRollDice_12412> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckRollDice_12412> getParserForType() {
         return PARSER;
      }

      public S2C_LuckRollDice_12412 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckRollDice_12412OrBuilder {
         private int bitField0_;
         private int dicePlateId_;
         private List<DiceData> dice_;
         private RepeatedFieldBuilderV3<DiceData, DiceData.Builder, DiceDataOrBuilder> diceBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_LuckRollDice_12412_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_LuckRollDice_12412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckRollDice_12412.class, Builder.class);
         }

         private Builder() {
            this.dice_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.dice_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_LuckRollDice_12412.alwaysUseFieldBuilders) {
               this.getDiceFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.dicePlateId_ = 0;
            this.bitField0_ &= -2;
            if (this.diceBuilder_ == null) {
               this.dice_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.diceBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_LuckRollDice_12412_descriptor;
         }

         public S2C_LuckRollDice_12412 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_LuckRollDice_12412.getDefaultInstance();
         }

         public S2C_LuckRollDice_12412 build() {
            S2C_LuckRollDice_12412 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckRollDice_12412 buildPartial() {
            S2C_LuckRollDice_12412 result = new S2C_LuckRollDice_12412(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dicePlateId_ = this.dicePlateId_;
               to_bitField0_ |= 1;
            }

            if (this.diceBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.dice_ = Collections.unmodifiableList(this.dice_);
                  this.bitField0_ &= -3;
               }

               result.dice_ = this.dice_;
            } else {
               result.dice_ = this.diceBuilder_.build();
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
            if (other instanceof S2C_LuckRollDice_12412) {
               return this.mergeFrom((S2C_LuckRollDice_12412)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckRollDice_12412 other) {
            if (other == SpringFestivalMsg.S2C_LuckRollDice_12412.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDicePlateId()) {
                  this.setDicePlateId(other.getDicePlateId());
               }

               if (this.diceBuilder_ == null) {
                  if (!other.dice_.isEmpty()) {
                     if (this.dice_.isEmpty()) {
                        this.dice_ = other.dice_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureDiceIsMutable();
                        this.dice_.addAll(other.dice_);
                     }

                     this.onChanged();
                  }
               } else if (!other.dice_.isEmpty()) {
                  if (this.diceBuilder_.isEmpty()) {
                     this.diceBuilder_.dispose();
                     this.diceBuilder_ = null;
                     this.dice_ = other.dice_;
                     this.bitField0_ &= -3;
                     this.diceBuilder_ = SpringFestivalMsg.S2C_LuckRollDice_12412.alwaysUseFieldBuilders ? this.getDiceFieldBuilder() : null;
                  } else {
                     this.diceBuilder_.addAllMessages(other.dice_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDicePlateId()) {
               return false;
            } else {
               for(int i = 0; i < this.getDiceCount(); ++i) {
                  if (!this.getDice(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LuckRollDice_12412 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckRollDice_12412)SpringFestivalMsg.S2C_LuckRollDice_12412.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckRollDice_12412)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDicePlateId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDicePlateId() {
            return this.dicePlateId_;
         }

         public Builder setDicePlateId(int value) {
            this.bitField0_ |= 1;
            this.dicePlateId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDicePlateId() {
            this.bitField0_ &= -2;
            this.dicePlateId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureDiceIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.dice_ = new ArrayList(this.dice_);
               this.bitField0_ |= 2;
            }

         }

         public List<DiceData> getDiceList() {
            return this.diceBuilder_ == null ? Collections.unmodifiableList(this.dice_) : this.diceBuilder_.getMessageList();
         }

         public int getDiceCount() {
            return this.diceBuilder_ == null ? this.dice_.size() : this.diceBuilder_.getCount();
         }

         public DiceData getDice(int index) {
            return this.diceBuilder_ == null ? (DiceData)this.dice_.get(index) : (DiceData)this.diceBuilder_.getMessage(index);
         }

         public Builder setDice(int index, DiceData value) {
            if (this.diceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDiceIsMutable();
               this.dice_.set(index, value);
               this.onChanged();
            } else {
               this.diceBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDice(int index, DiceData.Builder builderForValue) {
            if (this.diceBuilder_ == null) {
               this.ensureDiceIsMutable();
               this.dice_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.diceBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDice(DiceData value) {
            if (this.diceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDiceIsMutable();
               this.dice_.add(value);
               this.onChanged();
            } else {
               this.diceBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDice(int index, DiceData value) {
            if (this.diceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDiceIsMutable();
               this.dice_.add(index, value);
               this.onChanged();
            } else {
               this.diceBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDice(DiceData.Builder builderForValue) {
            if (this.diceBuilder_ == null) {
               this.ensureDiceIsMutable();
               this.dice_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.diceBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDice(int index, DiceData.Builder builderForValue) {
            if (this.diceBuilder_ == null) {
               this.ensureDiceIsMutable();
               this.dice_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.diceBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDice(Iterable<? extends DiceData> values) {
            if (this.diceBuilder_ == null) {
               this.ensureDiceIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.dice_);
               this.onChanged();
            } else {
               this.diceBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDice() {
            if (this.diceBuilder_ == null) {
               this.dice_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.diceBuilder_.clear();
            }

            return this;
         }

         public Builder removeDice(int index) {
            if (this.diceBuilder_ == null) {
               this.ensureDiceIsMutable();
               this.dice_.remove(index);
               this.onChanged();
            } else {
               this.diceBuilder_.remove(index);
            }

            return this;
         }

         public DiceData.Builder getDiceBuilder(int index) {
            return (DiceData.Builder)this.getDiceFieldBuilder().getBuilder(index);
         }

         public DiceDataOrBuilder getDiceOrBuilder(int index) {
            return this.diceBuilder_ == null ? (DiceDataOrBuilder)this.dice_.get(index) : (DiceDataOrBuilder)this.diceBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends DiceDataOrBuilder> getDiceOrBuilderList() {
            return this.diceBuilder_ != null ? this.diceBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.dice_);
         }

         public DiceData.Builder addDiceBuilder() {
            return (DiceData.Builder)this.getDiceFieldBuilder().addBuilder(SpringFestivalMsg.DiceData.getDefaultInstance());
         }

         public DiceData.Builder addDiceBuilder(int index) {
            return (DiceData.Builder)this.getDiceFieldBuilder().addBuilder(index, SpringFestivalMsg.DiceData.getDefaultInstance());
         }

         public List<DiceData.Builder> getDiceBuilderList() {
            return this.getDiceFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DiceData, DiceData.Builder, DiceDataOrBuilder> getDiceFieldBuilder() {
            if (this.diceBuilder_ == null) {
               this.diceBuilder_ = new RepeatedFieldBuilderV3(this.dice_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.dice_ = null;
            }

            return this.diceBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_GiftBoxMain_12413 extends GeneratedMessageV3 implements C2S_GiftBoxMain_12413OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GiftBoxMain_12413 DEFAULT_INSTANCE = new C2S_GiftBoxMain_12413();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GiftBoxMain_12413> PARSER = new AbstractParser<C2S_GiftBoxMain_12413>() {
         public C2S_GiftBoxMain_12413 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GiftBoxMain_12413(input, extensionRegistry);
         }
      };

      private C2S_GiftBoxMain_12413(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GiftBoxMain_12413() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GiftBoxMain_12413();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GiftBoxMain_12413(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxMain_12413_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxMain_12413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiftBoxMain_12413.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GiftBoxMain_12413)) {
            return super.equals(obj);
         } else {
            C2S_GiftBoxMain_12413 other = (C2S_GiftBoxMain_12413)obj;
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

      public static C2S_GiftBoxMain_12413 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxMain_12413)PARSER.parseFrom(data);
      }

      public static C2S_GiftBoxMain_12413 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxMain_12413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftBoxMain_12413 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxMain_12413)PARSER.parseFrom(data);
      }

      public static C2S_GiftBoxMain_12413 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxMain_12413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftBoxMain_12413 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxMain_12413)PARSER.parseFrom(data);
      }

      public static C2S_GiftBoxMain_12413 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxMain_12413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftBoxMain_12413 parseFrom(InputStream input) throws IOException {
         return (C2S_GiftBoxMain_12413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiftBoxMain_12413 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftBoxMain_12413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiftBoxMain_12413 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GiftBoxMain_12413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GiftBoxMain_12413 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftBoxMain_12413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiftBoxMain_12413 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GiftBoxMain_12413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiftBoxMain_12413 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftBoxMain_12413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GiftBoxMain_12413 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GiftBoxMain_12413 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GiftBoxMain_12413> parser() {
         return PARSER;
      }

      public Parser<C2S_GiftBoxMain_12413> getParserForType() {
         return PARSER;
      }

      public C2S_GiftBoxMain_12413 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GiftBoxMain_12413OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxMain_12413_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxMain_12413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiftBoxMain_12413.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_GiftBoxMain_12413.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxMain_12413_descriptor;
         }

         public C2S_GiftBoxMain_12413 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_GiftBoxMain_12413.getDefaultInstance();
         }

         public C2S_GiftBoxMain_12413 build() {
            C2S_GiftBoxMain_12413 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GiftBoxMain_12413 buildPartial() {
            C2S_GiftBoxMain_12413 result = new C2S_GiftBoxMain_12413(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GiftBoxMain_12413) {
               return this.mergeFrom((C2S_GiftBoxMain_12413)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GiftBoxMain_12413 other) {
            if (other == SpringFestivalMsg.C2S_GiftBoxMain_12413.getDefaultInstance()) {
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
            C2S_GiftBoxMain_12413 parsedMessage = null;

            try {
               parsedMessage = (C2S_GiftBoxMain_12413)SpringFestivalMsg.C2S_GiftBoxMain_12413.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GiftBoxMain_12413)e.getUnfinishedMessage();
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

   public static final class S2C_GiftBoxMain_12414 extends GeneratedMessageV3 implements S2C_GiftBoxMain_12414OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTGIFTBOX_FIELD_NUMBER = 1;
      private int gotGiftBox_;
      public static final int TASK_FIELD_NUMBER = 2;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_GiftBoxMain_12414 DEFAULT_INSTANCE = new S2C_GiftBoxMain_12414();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GiftBoxMain_12414> PARSER = new AbstractParser<S2C_GiftBoxMain_12414>() {
         public S2C_GiftBoxMain_12414 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GiftBoxMain_12414(input, extensionRegistry);
         }
      };

      private S2C_GiftBoxMain_12414(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GiftBoxMain_12414() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GiftBoxMain_12414();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GiftBoxMain_12414(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gotGiftBox_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 2;
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxMain_12414_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxMain_12414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiftBoxMain_12414.class, Builder.class);
      }

      public boolean hasGotGiftBox() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGotGiftBox() {
         return this.gotGiftBox_;
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
         } else if (!this.hasGotGiftBox()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.gotGiftBox_);
         }

         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.task_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.gotGiftBox_);
            }

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GiftBoxMain_12414)) {
            return super.equals(obj);
         } else {
            S2C_GiftBoxMain_12414 other = (S2C_GiftBoxMain_12414)obj;
            if (this.hasGotGiftBox() != other.hasGotGiftBox()) {
               return false;
            } else if (this.hasGotGiftBox() && this.getGotGiftBox() != other.getGotGiftBox()) {
               return false;
            } else if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.hasGotGiftBox()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotGiftBox();
            }

            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GiftBoxMain_12414 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxMain_12414)PARSER.parseFrom(data);
      }

      public static S2C_GiftBoxMain_12414 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxMain_12414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBoxMain_12414 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxMain_12414)PARSER.parseFrom(data);
      }

      public static S2C_GiftBoxMain_12414 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxMain_12414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBoxMain_12414 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxMain_12414)PARSER.parseFrom(data);
      }

      public static S2C_GiftBoxMain_12414 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxMain_12414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBoxMain_12414 parseFrom(InputStream input) throws IOException {
         return (S2C_GiftBoxMain_12414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiftBoxMain_12414 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBoxMain_12414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiftBoxMain_12414 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GiftBoxMain_12414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GiftBoxMain_12414 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBoxMain_12414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiftBoxMain_12414 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GiftBoxMain_12414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiftBoxMain_12414 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBoxMain_12414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GiftBoxMain_12414 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GiftBoxMain_12414 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GiftBoxMain_12414> parser() {
         return PARSER;
      }

      public Parser<S2C_GiftBoxMain_12414> getParserForType() {
         return PARSER;
      }

      public S2C_GiftBoxMain_12414 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GiftBoxMain_12414OrBuilder {
         private int bitField0_;
         private int gotGiftBox_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxMain_12414_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxMain_12414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiftBoxMain_12414.class, Builder.class);
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
            if (SpringFestivalMsg.S2C_GiftBoxMain_12414.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.gotGiftBox_ = 0;
            this.bitField0_ &= -2;
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxMain_12414_descriptor;
         }

         public S2C_GiftBoxMain_12414 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_GiftBoxMain_12414.getDefaultInstance();
         }

         public S2C_GiftBoxMain_12414 build() {
            S2C_GiftBoxMain_12414 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GiftBoxMain_12414 buildPartial() {
            S2C_GiftBoxMain_12414 result = new S2C_GiftBoxMain_12414(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gotGiftBox_ = this.gotGiftBox_;
               to_bitField0_ |= 1;
            }

            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -3;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_GiftBoxMain_12414) {
               return this.mergeFrom((S2C_GiftBoxMain_12414)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GiftBoxMain_12414 other) {
            if (other == SpringFestivalMsg.S2C_GiftBoxMain_12414.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGotGiftBox()) {
                  this.setGotGiftBox(other.getGotGiftBox());
               }

               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.taskBuilder_ = SpringFestivalMsg.S2C_GiftBoxMain_12414.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            if (!this.hasGotGiftBox()) {
               return false;
            } else {
               for(int i = 0; i < this.getTaskCount(); ++i) {
                  if (!this.getTask(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GiftBoxMain_12414 parsedMessage = null;

            try {
               parsedMessage = (S2C_GiftBoxMain_12414)SpringFestivalMsg.S2C_GiftBoxMain_12414.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GiftBoxMain_12414)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGotGiftBox() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGotGiftBox() {
            return this.gotGiftBox_;
         }

         public Builder setGotGiftBox(int value) {
            this.bitField0_ |= 1;
            this.gotGiftBox_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotGiftBox() {
            this.bitField0_ &= -2;
            this.gotGiftBox_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 2;
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
               this.bitField0_ &= -3;
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
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_GiftBoxCommitTask_12415 extends GeneratedMessageV3 implements C2S_GiftBoxCommitTask_12415OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_GiftBoxCommitTask_12415 DEFAULT_INSTANCE = new C2S_GiftBoxCommitTask_12415();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GiftBoxCommitTask_12415> PARSER = new AbstractParser<C2S_GiftBoxCommitTask_12415>() {
         public C2S_GiftBoxCommitTask_12415 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GiftBoxCommitTask_12415(input, extensionRegistry);
         }
      };

      private C2S_GiftBoxCommitTask_12415(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GiftBoxCommitTask_12415() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GiftBoxCommitTask_12415();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GiftBoxCommitTask_12415(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxCommitTask_12415_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxCommitTask_12415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiftBoxCommitTask_12415.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GiftBoxCommitTask_12415)) {
            return super.equals(obj);
         } else {
            C2S_GiftBoxCommitTask_12415 other = (C2S_GiftBoxCommitTask_12415)obj;
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

      public static C2S_GiftBoxCommitTask_12415 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxCommitTask_12415)PARSER.parseFrom(data);
      }

      public static C2S_GiftBoxCommitTask_12415 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxCommitTask_12415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftBoxCommitTask_12415 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxCommitTask_12415)PARSER.parseFrom(data);
      }

      public static C2S_GiftBoxCommitTask_12415 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxCommitTask_12415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftBoxCommitTask_12415 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxCommitTask_12415)PARSER.parseFrom(data);
      }

      public static C2S_GiftBoxCommitTask_12415 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftBoxCommitTask_12415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftBoxCommitTask_12415 parseFrom(InputStream input) throws IOException {
         return (C2S_GiftBoxCommitTask_12415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiftBoxCommitTask_12415 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftBoxCommitTask_12415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiftBoxCommitTask_12415 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GiftBoxCommitTask_12415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GiftBoxCommitTask_12415 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftBoxCommitTask_12415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiftBoxCommitTask_12415 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GiftBoxCommitTask_12415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiftBoxCommitTask_12415 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftBoxCommitTask_12415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GiftBoxCommitTask_12415 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GiftBoxCommitTask_12415 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GiftBoxCommitTask_12415> parser() {
         return PARSER;
      }

      public Parser<C2S_GiftBoxCommitTask_12415> getParserForType() {
         return PARSER;
      }

      public C2S_GiftBoxCommitTask_12415 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GiftBoxCommitTask_12415OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxCommitTask_12415_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxCommitTask_12415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiftBoxCommitTask_12415.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_GiftBoxCommitTask_12415.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_GiftBoxCommitTask_12415_descriptor;
         }

         public C2S_GiftBoxCommitTask_12415 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_GiftBoxCommitTask_12415.getDefaultInstance();
         }

         public C2S_GiftBoxCommitTask_12415 build() {
            C2S_GiftBoxCommitTask_12415 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GiftBoxCommitTask_12415 buildPartial() {
            C2S_GiftBoxCommitTask_12415 result = new C2S_GiftBoxCommitTask_12415(this);
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
            if (other instanceof C2S_GiftBoxCommitTask_12415) {
               return this.mergeFrom((C2S_GiftBoxCommitTask_12415)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GiftBoxCommitTask_12415 other) {
            if (other == SpringFestivalMsg.C2S_GiftBoxCommitTask_12415.getDefaultInstance()) {
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
            C2S_GiftBoxCommitTask_12415 parsedMessage = null;

            try {
               parsedMessage = (C2S_GiftBoxCommitTask_12415)SpringFestivalMsg.C2S_GiftBoxCommitTask_12415.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GiftBoxCommitTask_12415)e.getUnfinishedMessage();
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

   public static final class S2C_GiftBoxCommitTask_12416 extends GeneratedMessageV3 implements S2C_GiftBoxCommitTask_12416OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      public static final int GOTGIFTBOX_FIELD_NUMBER = 2;
      private int gotGiftBox_;
      private byte memoizedIsInitialized;
      private static final S2C_GiftBoxCommitTask_12416 DEFAULT_INSTANCE = new S2C_GiftBoxCommitTask_12416();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GiftBoxCommitTask_12416> PARSER = new AbstractParser<S2C_GiftBoxCommitTask_12416>() {
         public S2C_GiftBoxCommitTask_12416 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GiftBoxCommitTask_12416(input, extensionRegistry);
         }
      };

      private S2C_GiftBoxCommitTask_12416(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GiftBoxCommitTask_12416() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GiftBoxCommitTask_12416();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GiftBoxCommitTask_12416(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.gotGiftBox_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxCommitTask_12416_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxCommitTask_12416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiftBoxCommitTask_12416.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public boolean hasGotGiftBox() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGotGiftBox() {
         return this.gotGiftBox_;
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
         } else if (!this.hasGotGiftBox()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.gotGiftBox_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.gotGiftBox_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GiftBoxCommitTask_12416)) {
            return super.equals(obj);
         } else {
            S2C_GiftBoxCommitTask_12416 other = (S2C_GiftBoxCommitTask_12416)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else if (this.hasGotGiftBox() != other.hasGotGiftBox()) {
               return false;
            } else if (this.hasGotGiftBox() && this.getGotGiftBox() != other.getGotGiftBox()) {
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

            if (this.hasGotGiftBox()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotGiftBox();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GiftBoxCommitTask_12416 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxCommitTask_12416)PARSER.parseFrom(data);
      }

      public static S2C_GiftBoxCommitTask_12416 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxCommitTask_12416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBoxCommitTask_12416 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxCommitTask_12416)PARSER.parseFrom(data);
      }

      public static S2C_GiftBoxCommitTask_12416 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxCommitTask_12416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBoxCommitTask_12416 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxCommitTask_12416)PARSER.parseFrom(data);
      }

      public static S2C_GiftBoxCommitTask_12416 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxCommitTask_12416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBoxCommitTask_12416 parseFrom(InputStream input) throws IOException {
         return (S2C_GiftBoxCommitTask_12416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiftBoxCommitTask_12416 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBoxCommitTask_12416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiftBoxCommitTask_12416 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GiftBoxCommitTask_12416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GiftBoxCommitTask_12416 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBoxCommitTask_12416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiftBoxCommitTask_12416 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GiftBoxCommitTask_12416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiftBoxCommitTask_12416 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBoxCommitTask_12416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GiftBoxCommitTask_12416 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GiftBoxCommitTask_12416 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GiftBoxCommitTask_12416> parser() {
         return PARSER;
      }

      public Parser<S2C_GiftBoxCommitTask_12416> getParserForType() {
         return PARSER;
      }

      public S2C_GiftBoxCommitTask_12416 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GiftBoxCommitTask_12416OrBuilder {
         private int bitField0_;
         private int taskId_;
         private int gotGiftBox_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxCommitTask_12416_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxCommitTask_12416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiftBoxCommitTask_12416.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_GiftBoxCommitTask_12416.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            this.gotGiftBox_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxCommitTask_12416_descriptor;
         }

         public S2C_GiftBoxCommitTask_12416 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_GiftBoxCommitTask_12416.getDefaultInstance();
         }

         public S2C_GiftBoxCommitTask_12416 build() {
            S2C_GiftBoxCommitTask_12416 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GiftBoxCommitTask_12416 buildPartial() {
            S2C_GiftBoxCommitTask_12416 result = new S2C_GiftBoxCommitTask_12416(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.gotGiftBox_ = this.gotGiftBox_;
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
            if (other instanceof S2C_GiftBoxCommitTask_12416) {
               return this.mergeFrom((S2C_GiftBoxCommitTask_12416)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GiftBoxCommitTask_12416 other) {
            if (other == SpringFestivalMsg.S2C_GiftBoxCommitTask_12416.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               if (other.hasGotGiftBox()) {
                  this.setGotGiftBox(other.getGotGiftBox());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTaskId()) {
               return false;
            } else {
               return this.hasGotGiftBox();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GiftBoxCommitTask_12416 parsedMessage = null;

            try {
               parsedMessage = (S2C_GiftBoxCommitTask_12416)SpringFestivalMsg.S2C_GiftBoxCommitTask_12416.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GiftBoxCommitTask_12416)e.getUnfinishedMessage();
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

         public boolean hasGotGiftBox() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGotGiftBox() {
            return this.gotGiftBox_;
         }

         public Builder setGotGiftBox(int value) {
            this.bitField0_ |= 2;
            this.gotGiftBox_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotGiftBox() {
            this.bitField0_ &= -3;
            this.gotGiftBox_ = 0;
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

   public static final class S2C_GiftBoxTasks_12418 extends GeneratedMessageV3 implements S2C_GiftBoxTasks_12418OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_GiftBoxTasks_12418 DEFAULT_INSTANCE = new S2C_GiftBoxTasks_12418();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GiftBoxTasks_12418> PARSER = new AbstractParser<S2C_GiftBoxTasks_12418>() {
         public S2C_GiftBoxTasks_12418 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GiftBoxTasks_12418(input, extensionRegistry);
         }
      };

      private S2C_GiftBoxTasks_12418(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GiftBoxTasks_12418() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GiftBoxTasks_12418();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GiftBoxTasks_12418(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxTasks_12418_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxTasks_12418_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiftBoxTasks_12418.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GiftBoxTasks_12418)) {
            return super.equals(obj);
         } else {
            S2C_GiftBoxTasks_12418 other = (S2C_GiftBoxTasks_12418)obj;
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

      public static S2C_GiftBoxTasks_12418 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxTasks_12418)PARSER.parseFrom(data);
      }

      public static S2C_GiftBoxTasks_12418 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxTasks_12418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBoxTasks_12418 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxTasks_12418)PARSER.parseFrom(data);
      }

      public static S2C_GiftBoxTasks_12418 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxTasks_12418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBoxTasks_12418 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxTasks_12418)PARSER.parseFrom(data);
      }

      public static S2C_GiftBoxTasks_12418 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBoxTasks_12418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBoxTasks_12418 parseFrom(InputStream input) throws IOException {
         return (S2C_GiftBoxTasks_12418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiftBoxTasks_12418 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBoxTasks_12418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiftBoxTasks_12418 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GiftBoxTasks_12418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GiftBoxTasks_12418 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBoxTasks_12418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiftBoxTasks_12418 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GiftBoxTasks_12418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiftBoxTasks_12418 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBoxTasks_12418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GiftBoxTasks_12418 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GiftBoxTasks_12418 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GiftBoxTasks_12418> parser() {
         return PARSER;
      }

      public Parser<S2C_GiftBoxTasks_12418> getParserForType() {
         return PARSER;
      }

      public S2C_GiftBoxTasks_12418 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GiftBoxTasks_12418OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxTasks_12418_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxTasks_12418_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiftBoxTasks_12418.class, Builder.class);
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
            if (SpringFestivalMsg.S2C_GiftBoxTasks_12418.alwaysUseFieldBuilders) {
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
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_GiftBoxTasks_12418_descriptor;
         }

         public S2C_GiftBoxTasks_12418 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_GiftBoxTasks_12418.getDefaultInstance();
         }

         public S2C_GiftBoxTasks_12418 build() {
            S2C_GiftBoxTasks_12418 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GiftBoxTasks_12418 buildPartial() {
            S2C_GiftBoxTasks_12418 result = new S2C_GiftBoxTasks_12418(this);
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
            if (other instanceof S2C_GiftBoxTasks_12418) {
               return this.mergeFrom((S2C_GiftBoxTasks_12418)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GiftBoxTasks_12418 other) {
            if (other == SpringFestivalMsg.S2C_GiftBoxTasks_12418.getDefaultInstance()) {
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
                     this.taskBuilder_ = SpringFestivalMsg.S2C_GiftBoxTasks_12418.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_GiftBoxTasks_12418 parsedMessage = null;

            try {
               parsedMessage = (S2C_GiftBoxTasks_12418)SpringFestivalMsg.S2C_GiftBoxTasks_12418.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GiftBoxTasks_12418)e.getUnfinishedMessage();
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

   public static final class C2S_PrayMain_12419 extends GeneratedMessageV3 implements C2S_PrayMain_12419OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PrayMain_12419 DEFAULT_INSTANCE = new C2S_PrayMain_12419();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PrayMain_12419> PARSER = new AbstractParser<C2S_PrayMain_12419>() {
         public C2S_PrayMain_12419 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PrayMain_12419(input, extensionRegistry);
         }
      };

      private C2S_PrayMain_12419(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PrayMain_12419() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PrayMain_12419();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PrayMain_12419(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayMain_12419_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayMain_12419_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayMain_12419.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PrayMain_12419)) {
            return super.equals(obj);
         } else {
            C2S_PrayMain_12419 other = (C2S_PrayMain_12419)obj;
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

      public static C2S_PrayMain_12419 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PrayMain_12419)PARSER.parseFrom(data);
      }

      public static C2S_PrayMain_12419 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayMain_12419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayMain_12419 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PrayMain_12419)PARSER.parseFrom(data);
      }

      public static C2S_PrayMain_12419 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayMain_12419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayMain_12419 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PrayMain_12419)PARSER.parseFrom(data);
      }

      public static C2S_PrayMain_12419 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayMain_12419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayMain_12419 parseFrom(InputStream input) throws IOException {
         return (C2S_PrayMain_12419)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayMain_12419 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayMain_12419)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayMain_12419 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PrayMain_12419)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PrayMain_12419 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayMain_12419)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayMain_12419 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PrayMain_12419)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayMain_12419 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayMain_12419)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PrayMain_12419 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PrayMain_12419 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PrayMain_12419> parser() {
         return PARSER;
      }

      public Parser<C2S_PrayMain_12419> getParserForType() {
         return PARSER;
      }

      public C2S_PrayMain_12419 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PrayMain_12419OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayMain_12419_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayMain_12419_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayMain_12419.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_PrayMain_12419.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayMain_12419_descriptor;
         }

         public C2S_PrayMain_12419 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_PrayMain_12419.getDefaultInstance();
         }

         public C2S_PrayMain_12419 build() {
            C2S_PrayMain_12419 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PrayMain_12419 buildPartial() {
            C2S_PrayMain_12419 result = new C2S_PrayMain_12419(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_PrayMain_12419) {
               return this.mergeFrom((C2S_PrayMain_12419)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PrayMain_12419 other) {
            if (other == SpringFestivalMsg.C2S_PrayMain_12419.getDefaultInstance()) {
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
            C2S_PrayMain_12419 parsedMessage = null;

            try {
               parsedMessage = (C2S_PrayMain_12419)SpringFestivalMsg.C2S_PrayMain_12419.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PrayMain_12419)e.getUnfinishedMessage();
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

   public static final class S2C_PrayMain_12420 extends GeneratedMessageV3 implements S2C_PrayMain_12420OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PRAYDATA_FIELD_NUMBER = 1;
      private List<PrayData> prayData_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayMain_12420 DEFAULT_INSTANCE = new S2C_PrayMain_12420();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayMain_12420> PARSER = new AbstractParser<S2C_PrayMain_12420>() {
         public S2C_PrayMain_12420 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayMain_12420(input, extensionRegistry);
         }
      };

      private S2C_PrayMain_12420(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayMain_12420() {
         this.memoizedIsInitialized = -1;
         this.prayData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayMain_12420();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayMain_12420(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.prayData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.prayData_.add(input.readMessage(SpringFestivalMsg.PrayData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.prayData_ = Collections.unmodifiableList(this.prayData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayMain_12420_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayMain_12420_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayMain_12420.class, Builder.class);
      }

      public List<PrayData> getPrayDataList() {
         return this.prayData_;
      }

      public List<? extends PrayDataOrBuilder> getPrayDataOrBuilderList() {
         return this.prayData_;
      }

      public int getPrayDataCount() {
         return this.prayData_.size();
      }

      public PrayData getPrayData(int index) {
         return (PrayData)this.prayData_.get(index);
      }

      public PrayDataOrBuilder getPrayDataOrBuilder(int index) {
         return (PrayDataOrBuilder)this.prayData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPrayDataCount(); ++i) {
               if (!this.getPrayData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.prayData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.prayData_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.prayData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.prayData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrayMain_12420)) {
            return super.equals(obj);
         } else {
            S2C_PrayMain_12420 other = (S2C_PrayMain_12420)obj;
            if (!this.getPrayDataList().equals(other.getPrayDataList())) {
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
            if (this.getPrayDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrayMain_12420 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayMain_12420)PARSER.parseFrom(data);
      }

      public static S2C_PrayMain_12420 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayMain_12420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayMain_12420 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayMain_12420)PARSER.parseFrom(data);
      }

      public static S2C_PrayMain_12420 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayMain_12420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayMain_12420 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayMain_12420)PARSER.parseFrom(data);
      }

      public static S2C_PrayMain_12420 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayMain_12420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayMain_12420 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayMain_12420)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayMain_12420 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayMain_12420)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayMain_12420 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayMain_12420)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayMain_12420 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayMain_12420)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayMain_12420 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayMain_12420)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayMain_12420 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayMain_12420)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayMain_12420 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayMain_12420 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayMain_12420> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayMain_12420> getParserForType() {
         return PARSER;
      }

      public S2C_PrayMain_12420 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayMain_12420OrBuilder {
         private int bitField0_;
         private List<PrayData> prayData_;
         private RepeatedFieldBuilderV3<PrayData, PrayData.Builder, PrayDataOrBuilder> prayDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayMain_12420_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayMain_12420_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayMain_12420.class, Builder.class);
         }

         private Builder() {
            this.prayData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.prayData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_PrayMain_12420.alwaysUseFieldBuilders) {
               this.getPrayDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.prayDataBuilder_ == null) {
               this.prayData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.prayDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayMain_12420_descriptor;
         }

         public S2C_PrayMain_12420 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_PrayMain_12420.getDefaultInstance();
         }

         public S2C_PrayMain_12420 build() {
            S2C_PrayMain_12420 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayMain_12420 buildPartial() {
            S2C_PrayMain_12420 result = new S2C_PrayMain_12420(this);
            int from_bitField0_ = this.bitField0_;
            if (this.prayDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.prayData_ = Collections.unmodifiableList(this.prayData_);
                  this.bitField0_ &= -2;
               }

               result.prayData_ = this.prayData_;
            } else {
               result.prayData_ = this.prayDataBuilder_.build();
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
            if (other instanceof S2C_PrayMain_12420) {
               return this.mergeFrom((S2C_PrayMain_12420)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayMain_12420 other) {
            if (other == SpringFestivalMsg.S2C_PrayMain_12420.getDefaultInstance()) {
               return this;
            } else {
               if (this.prayDataBuilder_ == null) {
                  if (!other.prayData_.isEmpty()) {
                     if (this.prayData_.isEmpty()) {
                        this.prayData_ = other.prayData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePrayDataIsMutable();
                        this.prayData_.addAll(other.prayData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.prayData_.isEmpty()) {
                  if (this.prayDataBuilder_.isEmpty()) {
                     this.prayDataBuilder_.dispose();
                     this.prayDataBuilder_ = null;
                     this.prayData_ = other.prayData_;
                     this.bitField0_ &= -2;
                     this.prayDataBuilder_ = SpringFestivalMsg.S2C_PrayMain_12420.alwaysUseFieldBuilders ? this.getPrayDataFieldBuilder() : null;
                  } else {
                     this.prayDataBuilder_.addAllMessages(other.prayData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPrayDataCount(); ++i) {
               if (!this.getPrayData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrayMain_12420 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayMain_12420)SpringFestivalMsg.S2C_PrayMain_12420.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayMain_12420)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePrayDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.prayData_ = new ArrayList(this.prayData_);
               this.bitField0_ |= 1;
            }

         }

         public List<PrayData> getPrayDataList() {
            return this.prayDataBuilder_ == null ? Collections.unmodifiableList(this.prayData_) : this.prayDataBuilder_.getMessageList();
         }

         public int getPrayDataCount() {
            return this.prayDataBuilder_ == null ? this.prayData_.size() : this.prayDataBuilder_.getCount();
         }

         public PrayData getPrayData(int index) {
            return this.prayDataBuilder_ == null ? (PrayData)this.prayData_.get(index) : (PrayData)this.prayDataBuilder_.getMessage(index);
         }

         public Builder setPrayData(int index, PrayData value) {
            if (this.prayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayDataIsMutable();
               this.prayData_.set(index, value);
               this.onChanged();
            } else {
               this.prayDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPrayData(int index, PrayData.Builder builderForValue) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prayDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPrayData(PrayData value) {
            if (this.prayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayDataIsMutable();
               this.prayData_.add(value);
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPrayData(int index, PrayData value) {
            if (this.prayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayDataIsMutable();
               this.prayData_.add(index, value);
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPrayData(PrayData.Builder builderForValue) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPrayData(int index, PrayData.Builder builderForValue) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPrayData(Iterable<? extends PrayData> values) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.prayData_);
               this.onChanged();
            } else {
               this.prayDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPrayData() {
            if (this.prayDataBuilder_ == null) {
               this.prayData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.prayDataBuilder_.clear();
            }

            return this;
         }

         public Builder removePrayData(int index) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.remove(index);
               this.onChanged();
            } else {
               this.prayDataBuilder_.remove(index);
            }

            return this;
         }

         public PrayData.Builder getPrayDataBuilder(int index) {
            return (PrayData.Builder)this.getPrayDataFieldBuilder().getBuilder(index);
         }

         public PrayDataOrBuilder getPrayDataOrBuilder(int index) {
            return this.prayDataBuilder_ == null ? (PrayDataOrBuilder)this.prayData_.get(index) : (PrayDataOrBuilder)this.prayDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PrayDataOrBuilder> getPrayDataOrBuilderList() {
            return this.prayDataBuilder_ != null ? this.prayDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.prayData_);
         }

         public PrayData.Builder addPrayDataBuilder() {
            return (PrayData.Builder)this.getPrayDataFieldBuilder().addBuilder(SpringFestivalMsg.PrayData.getDefaultInstance());
         }

         public PrayData.Builder addPrayDataBuilder(int index) {
            return (PrayData.Builder)this.getPrayDataFieldBuilder().addBuilder(index, SpringFestivalMsg.PrayData.getDefaultInstance());
         }

         public List<PrayData.Builder> getPrayDataBuilderList() {
            return this.getPrayDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PrayData, PrayData.Builder, PrayDataOrBuilder> getPrayDataFieldBuilder() {
            if (this.prayDataBuilder_ == null) {
               this.prayDataBuilder_ = new RepeatedFieldBuilderV3(this.prayData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.prayData_ = null;
            }

            return this.prayDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_PrayItemList_12421 extends GeneratedMessageV3 implements C2S_PrayItemList_12421OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CUSTOMID_FIELD_NUMBER = 1;
      private int customId_;
      private byte memoizedIsInitialized;
      private static final C2S_PrayItemList_12421 DEFAULT_INSTANCE = new C2S_PrayItemList_12421();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PrayItemList_12421> PARSER = new AbstractParser<C2S_PrayItemList_12421>() {
         public C2S_PrayItemList_12421 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PrayItemList_12421(input, extensionRegistry);
         }
      };

      private C2S_PrayItemList_12421(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PrayItemList_12421() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PrayItemList_12421();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PrayItemList_12421(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayItemList_12421_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayItemList_12421_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayItemList_12421.class, Builder.class);
      }

      public boolean hasCustomId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCustomId() {
         return this.customId_;
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
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.customId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PrayItemList_12421)) {
            return super.equals(obj);
         } else {
            C2S_PrayItemList_12421 other = (C2S_PrayItemList_12421)obj;
            if (this.hasCustomId() != other.hasCustomId()) {
               return false;
            } else if (this.hasCustomId() && this.getCustomId() != other.getCustomId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PrayItemList_12421 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PrayItemList_12421)PARSER.parseFrom(data);
      }

      public static C2S_PrayItemList_12421 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayItemList_12421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayItemList_12421 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PrayItemList_12421)PARSER.parseFrom(data);
      }

      public static C2S_PrayItemList_12421 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayItemList_12421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayItemList_12421 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PrayItemList_12421)PARSER.parseFrom(data);
      }

      public static C2S_PrayItemList_12421 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayItemList_12421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayItemList_12421 parseFrom(InputStream input) throws IOException {
         return (C2S_PrayItemList_12421)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayItemList_12421 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayItemList_12421)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayItemList_12421 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PrayItemList_12421)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PrayItemList_12421 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayItemList_12421)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayItemList_12421 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PrayItemList_12421)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayItemList_12421 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayItemList_12421)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PrayItemList_12421 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PrayItemList_12421 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PrayItemList_12421> parser() {
         return PARSER;
      }

      public Parser<C2S_PrayItemList_12421> getParserForType() {
         return PARSER;
      }

      public C2S_PrayItemList_12421 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PrayItemList_12421OrBuilder {
         private int bitField0_;
         private int customId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayItemList_12421_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayItemList_12421_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayItemList_12421.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_PrayItemList_12421.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.customId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayItemList_12421_descriptor;
         }

         public C2S_PrayItemList_12421 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_PrayItemList_12421.getDefaultInstance();
         }

         public C2S_PrayItemList_12421 build() {
            C2S_PrayItemList_12421 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PrayItemList_12421 buildPartial() {
            C2S_PrayItemList_12421 result = new C2S_PrayItemList_12421(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.customId_ = this.customId_;
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
            if (other instanceof C2S_PrayItemList_12421) {
               return this.mergeFrom((C2S_PrayItemList_12421)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PrayItemList_12421 other) {
            if (other == SpringFestivalMsg.C2S_PrayItemList_12421.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCustomId()) {
                  this.setCustomId(other.getCustomId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCustomId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PrayItemList_12421 parsedMessage = null;

            try {
               parsedMessage = (C2S_PrayItemList_12421)SpringFestivalMsg.C2S_PrayItemList_12421.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PrayItemList_12421)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_PrayItemList_12422 extends GeneratedMessageV3 implements S2C_PrayItemList_12422OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CUSTOMID_FIELD_NUMBER = 1;
      private int customId_;
      public static final int ITEM_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> item_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayItemList_12422 DEFAULT_INSTANCE = new S2C_PrayItemList_12422();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayItemList_12422> PARSER = new AbstractParser<S2C_PrayItemList_12422>() {
         public S2C_PrayItemList_12422 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayItemList_12422(input, extensionRegistry);
         }
      };

      private S2C_PrayItemList_12422(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayItemList_12422() {
         this.memoizedIsInitialized = -1;
         this.item_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayItemList_12422();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayItemList_12422(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.item_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.item_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.item_ = Collections.unmodifiableList(this.item_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayItemList_12422_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayItemList_12422_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayItemList_12422.class, Builder.class);
      }

      public boolean hasCustomId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCustomId() {
         return this.customId_;
      }

      public List<CommonMsg.ItemInfo> getItemList() {
         return this.item_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList() {
         return this.item_;
      }

      public int getItemCount() {
         return this.item_.size();
      }

      public CommonMsg.ItemInfo getItem(int index) {
         return (CommonMsg.ItemInfo)this.item_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.item_.get(index);
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
            for(int i = 0; i < this.getItemCount(); ++i) {
               if (!this.getItem(i).isInitialized()) {
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

         for(int i = 0; i < this.item_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.item_.get(i));
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

            for(int i = 0; i < this.item_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.item_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrayItemList_12422)) {
            return super.equals(obj);
         } else {
            S2C_PrayItemList_12422 other = (S2C_PrayItemList_12422)obj;
            if (this.hasCustomId() != other.hasCustomId()) {
               return false;
            } else if (this.hasCustomId() && this.getCustomId() != other.getCustomId()) {
               return false;
            } else if (!this.getItemList().equals(other.getItemList())) {
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

            if (this.getItemCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrayItemList_12422 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayItemList_12422)PARSER.parseFrom(data);
      }

      public static S2C_PrayItemList_12422 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayItemList_12422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayItemList_12422 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayItemList_12422)PARSER.parseFrom(data);
      }

      public static S2C_PrayItemList_12422 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayItemList_12422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayItemList_12422 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayItemList_12422)PARSER.parseFrom(data);
      }

      public static S2C_PrayItemList_12422 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayItemList_12422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayItemList_12422 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayItemList_12422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayItemList_12422 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayItemList_12422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayItemList_12422 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayItemList_12422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayItemList_12422 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayItemList_12422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayItemList_12422 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayItemList_12422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayItemList_12422 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayItemList_12422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayItemList_12422 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayItemList_12422 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayItemList_12422> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayItemList_12422> getParserForType() {
         return PARSER;
      }

      public S2C_PrayItemList_12422 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayItemList_12422OrBuilder {
         private int bitField0_;
         private int customId_;
         private List<CommonMsg.ItemInfo> item_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayItemList_12422_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayItemList_12422_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayItemList_12422.class, Builder.class);
         }

         private Builder() {
            this.item_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.item_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_PrayItemList_12422.alwaysUseFieldBuilders) {
               this.getItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.customId_ = 0;
            this.bitField0_ &= -2;
            if (this.itemBuilder_ == null) {
               this.item_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.itemBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayItemList_12422_descriptor;
         }

         public S2C_PrayItemList_12422 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_PrayItemList_12422.getDefaultInstance();
         }

         public S2C_PrayItemList_12422 build() {
            S2C_PrayItemList_12422 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayItemList_12422 buildPartial() {
            S2C_PrayItemList_12422 result = new S2C_PrayItemList_12422(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.customId_ = this.customId_;
               to_bitField0_ |= 1;
            }

            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.item_ = Collections.unmodifiableList(this.item_);
                  this.bitField0_ &= -3;
               }

               result.item_ = this.item_;
            } else {
               result.item_ = this.itemBuilder_.build();
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
            if (other instanceof S2C_PrayItemList_12422) {
               return this.mergeFrom((S2C_PrayItemList_12422)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayItemList_12422 other) {
            if (other == SpringFestivalMsg.S2C_PrayItemList_12422.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCustomId()) {
                  this.setCustomId(other.getCustomId());
               }

               if (this.itemBuilder_ == null) {
                  if (!other.item_.isEmpty()) {
                     if (this.item_.isEmpty()) {
                        this.item_ = other.item_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureItemIsMutable();
                        this.item_.addAll(other.item_);
                     }

                     this.onChanged();
                  }
               } else if (!other.item_.isEmpty()) {
                  if (this.itemBuilder_.isEmpty()) {
                     this.itemBuilder_.dispose();
                     this.itemBuilder_ = null;
                     this.item_ = other.item_;
                     this.bitField0_ &= -3;
                     this.itemBuilder_ = SpringFestivalMsg.S2C_PrayItemList_12422.alwaysUseFieldBuilders ? this.getItemFieldBuilder() : null;
                  } else {
                     this.itemBuilder_.addAllMessages(other.item_);
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
               for(int i = 0; i < this.getItemCount(); ++i) {
                  if (!this.getItem(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrayItemList_12422 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayItemList_12422)SpringFestivalMsg.S2C_PrayItemList_12422.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayItemList_12422)e.getUnfinishedMessage();
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

         private void ensureItemIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.item_ = new ArrayList(this.item_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getItemList() {
            return this.itemBuilder_ == null ? Collections.unmodifiableList(this.item_) : this.itemBuilder_.getMessageList();
         }

         public int getItemCount() {
            return this.itemBuilder_ == null ? this.item_.size() : this.itemBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItem(int index) {
            return this.itemBuilder_ == null ? (CommonMsg.ItemInfo)this.item_.get(index) : (CommonMsg.ItemInfo)this.itemBuilder_.getMessage(index);
         }

         public Builder setItem(int index, CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.set(index, value);
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.add(value);
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItem(int index, CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.add(index, value);
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItem(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItem(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.item_);
               this.onChanged();
            } else {
               this.itemBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItem() {
            if (this.itemBuilder_ == null) {
               this.item_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.itemBuilder_.clear();
            }

            return this;
         }

         public Builder removeItem(int index) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.remove(index);
               this.onChanged();
            } else {
               this.itemBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index) {
            return this.itemBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.item_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList() {
            return this.itemBuilder_ != null ? this.itemBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.item_);
         }

         public CommonMsg.ItemInfo.Builder addItemBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemBuilderList() {
            return this.getItemFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new RepeatedFieldBuilderV3(this.item_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Pray_12423 extends GeneratedMessageV3 implements C2S_Pray_12423OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PRAYDATA_FIELD_NUMBER = 1;
      private List<PrayData> prayData_;
      private byte memoizedIsInitialized;
      private static final C2S_Pray_12423 DEFAULT_INSTANCE = new C2S_Pray_12423();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Pray_12423> PARSER = new AbstractParser<C2S_Pray_12423>() {
         public C2S_Pray_12423 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Pray_12423(input, extensionRegistry);
         }
      };

      private C2S_Pray_12423(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Pray_12423() {
         this.memoizedIsInitialized = -1;
         this.prayData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Pray_12423();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Pray_12423(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.prayData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.prayData_.add(input.readMessage(SpringFestivalMsg.PrayData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.prayData_ = Collections.unmodifiableList(this.prayData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_Pray_12423_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_Pray_12423_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_12423.class, Builder.class);
      }

      public List<PrayData> getPrayDataList() {
         return this.prayData_;
      }

      public List<? extends PrayDataOrBuilder> getPrayDataOrBuilderList() {
         return this.prayData_;
      }

      public int getPrayDataCount() {
         return this.prayData_.size();
      }

      public PrayData getPrayData(int index) {
         return (PrayData)this.prayData_.get(index);
      }

      public PrayDataOrBuilder getPrayDataOrBuilder(int index) {
         return (PrayDataOrBuilder)this.prayData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPrayDataCount(); ++i) {
               if (!this.getPrayData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.prayData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.prayData_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.prayData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.prayData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Pray_12423)) {
            return super.equals(obj);
         } else {
            C2S_Pray_12423 other = (C2S_Pray_12423)obj;
            if (!this.getPrayDataList().equals(other.getPrayDataList())) {
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
            if (this.getPrayDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Pray_12423 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Pray_12423)PARSER.parseFrom(data);
      }

      public static C2S_Pray_12423 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_12423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_12423 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Pray_12423)PARSER.parseFrom(data);
      }

      public static C2S_Pray_12423 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_12423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_12423 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Pray_12423)PARSER.parseFrom(data);
      }

      public static C2S_Pray_12423 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_12423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_12423 parseFrom(InputStream input) throws IOException {
         return (C2S_Pray_12423)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_12423 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_12423)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_12423 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Pray_12423)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Pray_12423 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_12423)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_12423 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Pray_12423)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_12423 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_12423)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Pray_12423 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Pray_12423 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Pray_12423> parser() {
         return PARSER;
      }

      public Parser<C2S_Pray_12423> getParserForType() {
         return PARSER;
      }

      public C2S_Pray_12423 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Pray_12423OrBuilder {
         private int bitField0_;
         private List<PrayData> prayData_;
         private RepeatedFieldBuilderV3<PrayData, PrayData.Builder, PrayDataOrBuilder> prayDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_Pray_12423_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_Pray_12423_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_12423.class, Builder.class);
         }

         private Builder() {
            this.prayData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.prayData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_Pray_12423.alwaysUseFieldBuilders) {
               this.getPrayDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.prayDataBuilder_ == null) {
               this.prayData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.prayDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_Pray_12423_descriptor;
         }

         public C2S_Pray_12423 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_Pray_12423.getDefaultInstance();
         }

         public C2S_Pray_12423 build() {
            C2S_Pray_12423 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Pray_12423 buildPartial() {
            C2S_Pray_12423 result = new C2S_Pray_12423(this);
            int from_bitField0_ = this.bitField0_;
            if (this.prayDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.prayData_ = Collections.unmodifiableList(this.prayData_);
                  this.bitField0_ &= -2;
               }

               result.prayData_ = this.prayData_;
            } else {
               result.prayData_ = this.prayDataBuilder_.build();
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
            if (other instanceof C2S_Pray_12423) {
               return this.mergeFrom((C2S_Pray_12423)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Pray_12423 other) {
            if (other == SpringFestivalMsg.C2S_Pray_12423.getDefaultInstance()) {
               return this;
            } else {
               if (this.prayDataBuilder_ == null) {
                  if (!other.prayData_.isEmpty()) {
                     if (this.prayData_.isEmpty()) {
                        this.prayData_ = other.prayData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePrayDataIsMutable();
                        this.prayData_.addAll(other.prayData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.prayData_.isEmpty()) {
                  if (this.prayDataBuilder_.isEmpty()) {
                     this.prayDataBuilder_.dispose();
                     this.prayDataBuilder_ = null;
                     this.prayData_ = other.prayData_;
                     this.bitField0_ &= -2;
                     this.prayDataBuilder_ = SpringFestivalMsg.C2S_Pray_12423.alwaysUseFieldBuilders ? this.getPrayDataFieldBuilder() : null;
                  } else {
                     this.prayDataBuilder_.addAllMessages(other.prayData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPrayDataCount(); ++i) {
               if (!this.getPrayData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Pray_12423 parsedMessage = null;

            try {
               parsedMessage = (C2S_Pray_12423)SpringFestivalMsg.C2S_Pray_12423.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Pray_12423)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePrayDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.prayData_ = new ArrayList(this.prayData_);
               this.bitField0_ |= 1;
            }

         }

         public List<PrayData> getPrayDataList() {
            return this.prayDataBuilder_ == null ? Collections.unmodifiableList(this.prayData_) : this.prayDataBuilder_.getMessageList();
         }

         public int getPrayDataCount() {
            return this.prayDataBuilder_ == null ? this.prayData_.size() : this.prayDataBuilder_.getCount();
         }

         public PrayData getPrayData(int index) {
            return this.prayDataBuilder_ == null ? (PrayData)this.prayData_.get(index) : (PrayData)this.prayDataBuilder_.getMessage(index);
         }

         public Builder setPrayData(int index, PrayData value) {
            if (this.prayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayDataIsMutable();
               this.prayData_.set(index, value);
               this.onChanged();
            } else {
               this.prayDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPrayData(int index, PrayData.Builder builderForValue) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prayDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPrayData(PrayData value) {
            if (this.prayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayDataIsMutable();
               this.prayData_.add(value);
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPrayData(int index, PrayData value) {
            if (this.prayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayDataIsMutable();
               this.prayData_.add(index, value);
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPrayData(PrayData.Builder builderForValue) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPrayData(int index, PrayData.Builder builderForValue) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPrayData(Iterable<? extends PrayData> values) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.prayData_);
               this.onChanged();
            } else {
               this.prayDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPrayData() {
            if (this.prayDataBuilder_ == null) {
               this.prayData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.prayDataBuilder_.clear();
            }

            return this;
         }

         public Builder removePrayData(int index) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.remove(index);
               this.onChanged();
            } else {
               this.prayDataBuilder_.remove(index);
            }

            return this;
         }

         public PrayData.Builder getPrayDataBuilder(int index) {
            return (PrayData.Builder)this.getPrayDataFieldBuilder().getBuilder(index);
         }

         public PrayDataOrBuilder getPrayDataOrBuilder(int index) {
            return this.prayDataBuilder_ == null ? (PrayDataOrBuilder)this.prayData_.get(index) : (PrayDataOrBuilder)this.prayDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PrayDataOrBuilder> getPrayDataOrBuilderList() {
            return this.prayDataBuilder_ != null ? this.prayDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.prayData_);
         }

         public PrayData.Builder addPrayDataBuilder() {
            return (PrayData.Builder)this.getPrayDataFieldBuilder().addBuilder(SpringFestivalMsg.PrayData.getDefaultInstance());
         }

         public PrayData.Builder addPrayDataBuilder(int index) {
            return (PrayData.Builder)this.getPrayDataFieldBuilder().addBuilder(index, SpringFestivalMsg.PrayData.getDefaultInstance());
         }

         public List<PrayData.Builder> getPrayDataBuilderList() {
            return this.getPrayDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PrayData, PrayData.Builder, PrayDataOrBuilder> getPrayDataFieldBuilder() {
            if (this.prayDataBuilder_ == null) {
               this.prayDataBuilder_ = new RepeatedFieldBuilderV3(this.prayData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.prayData_ = null;
            }

            return this.prayDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Pray_12424 extends GeneratedMessageV3 implements S2C_Pray_12424OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PRAYDATA_FIELD_NUMBER = 1;
      private List<PrayData> prayData_;
      private byte memoizedIsInitialized;
      private static final S2C_Pray_12424 DEFAULT_INSTANCE = new S2C_Pray_12424();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Pray_12424> PARSER = new AbstractParser<S2C_Pray_12424>() {
         public S2C_Pray_12424 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Pray_12424(input, extensionRegistry);
         }
      };

      private S2C_Pray_12424(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Pray_12424() {
         this.memoizedIsInitialized = -1;
         this.prayData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Pray_12424();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Pray_12424(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.prayData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.prayData_.add(input.readMessage(SpringFestivalMsg.PrayData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.prayData_ = Collections.unmodifiableList(this.prayData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_Pray_12424_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_Pray_12424_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_12424.class, Builder.class);
      }

      public List<PrayData> getPrayDataList() {
         return this.prayData_;
      }

      public List<? extends PrayDataOrBuilder> getPrayDataOrBuilderList() {
         return this.prayData_;
      }

      public int getPrayDataCount() {
         return this.prayData_.size();
      }

      public PrayData getPrayData(int index) {
         return (PrayData)this.prayData_.get(index);
      }

      public PrayDataOrBuilder getPrayDataOrBuilder(int index) {
         return (PrayDataOrBuilder)this.prayData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPrayDataCount(); ++i) {
               if (!this.getPrayData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.prayData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.prayData_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.prayData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.prayData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Pray_12424)) {
            return super.equals(obj);
         } else {
            S2C_Pray_12424 other = (S2C_Pray_12424)obj;
            if (!this.getPrayDataList().equals(other.getPrayDataList())) {
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
            if (this.getPrayDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Pray_12424 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Pray_12424)PARSER.parseFrom(data);
      }

      public static S2C_Pray_12424 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_12424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_12424 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Pray_12424)PARSER.parseFrom(data);
      }

      public static S2C_Pray_12424 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_12424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_12424 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Pray_12424)PARSER.parseFrom(data);
      }

      public static S2C_Pray_12424 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_12424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_12424 parseFrom(InputStream input) throws IOException {
         return (S2C_Pray_12424)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_12424 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_12424)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_12424 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Pray_12424)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Pray_12424 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_12424)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_12424 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Pray_12424)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_12424 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_12424)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Pray_12424 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Pray_12424 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Pray_12424> parser() {
         return PARSER;
      }

      public Parser<S2C_Pray_12424> getParserForType() {
         return PARSER;
      }

      public S2C_Pray_12424 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Pray_12424OrBuilder {
         private int bitField0_;
         private List<PrayData> prayData_;
         private RepeatedFieldBuilderV3<PrayData, PrayData.Builder, PrayDataOrBuilder> prayDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_Pray_12424_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_Pray_12424_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_12424.class, Builder.class);
         }

         private Builder() {
            this.prayData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.prayData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_Pray_12424.alwaysUseFieldBuilders) {
               this.getPrayDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.prayDataBuilder_ == null) {
               this.prayData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.prayDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_Pray_12424_descriptor;
         }

         public S2C_Pray_12424 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_Pray_12424.getDefaultInstance();
         }

         public S2C_Pray_12424 build() {
            S2C_Pray_12424 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Pray_12424 buildPartial() {
            S2C_Pray_12424 result = new S2C_Pray_12424(this);
            int from_bitField0_ = this.bitField0_;
            if (this.prayDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.prayData_ = Collections.unmodifiableList(this.prayData_);
                  this.bitField0_ &= -2;
               }

               result.prayData_ = this.prayData_;
            } else {
               result.prayData_ = this.prayDataBuilder_.build();
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
            if (other instanceof S2C_Pray_12424) {
               return this.mergeFrom((S2C_Pray_12424)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Pray_12424 other) {
            if (other == SpringFestivalMsg.S2C_Pray_12424.getDefaultInstance()) {
               return this;
            } else {
               if (this.prayDataBuilder_ == null) {
                  if (!other.prayData_.isEmpty()) {
                     if (this.prayData_.isEmpty()) {
                        this.prayData_ = other.prayData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePrayDataIsMutable();
                        this.prayData_.addAll(other.prayData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.prayData_.isEmpty()) {
                  if (this.prayDataBuilder_.isEmpty()) {
                     this.prayDataBuilder_.dispose();
                     this.prayDataBuilder_ = null;
                     this.prayData_ = other.prayData_;
                     this.bitField0_ &= -2;
                     this.prayDataBuilder_ = SpringFestivalMsg.S2C_Pray_12424.alwaysUseFieldBuilders ? this.getPrayDataFieldBuilder() : null;
                  } else {
                     this.prayDataBuilder_.addAllMessages(other.prayData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPrayDataCount(); ++i) {
               if (!this.getPrayData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Pray_12424 parsedMessage = null;

            try {
               parsedMessage = (S2C_Pray_12424)SpringFestivalMsg.S2C_Pray_12424.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Pray_12424)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePrayDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.prayData_ = new ArrayList(this.prayData_);
               this.bitField0_ |= 1;
            }

         }

         public List<PrayData> getPrayDataList() {
            return this.prayDataBuilder_ == null ? Collections.unmodifiableList(this.prayData_) : this.prayDataBuilder_.getMessageList();
         }

         public int getPrayDataCount() {
            return this.prayDataBuilder_ == null ? this.prayData_.size() : this.prayDataBuilder_.getCount();
         }

         public PrayData getPrayData(int index) {
            return this.prayDataBuilder_ == null ? (PrayData)this.prayData_.get(index) : (PrayData)this.prayDataBuilder_.getMessage(index);
         }

         public Builder setPrayData(int index, PrayData value) {
            if (this.prayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayDataIsMutable();
               this.prayData_.set(index, value);
               this.onChanged();
            } else {
               this.prayDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPrayData(int index, PrayData.Builder builderForValue) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prayDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPrayData(PrayData value) {
            if (this.prayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayDataIsMutable();
               this.prayData_.add(value);
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPrayData(int index, PrayData value) {
            if (this.prayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayDataIsMutable();
               this.prayData_.add(index, value);
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPrayData(PrayData.Builder builderForValue) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPrayData(int index, PrayData.Builder builderForValue) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prayDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPrayData(Iterable<? extends PrayData> values) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.prayData_);
               this.onChanged();
            } else {
               this.prayDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPrayData() {
            if (this.prayDataBuilder_ == null) {
               this.prayData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.prayDataBuilder_.clear();
            }

            return this;
         }

         public Builder removePrayData(int index) {
            if (this.prayDataBuilder_ == null) {
               this.ensurePrayDataIsMutable();
               this.prayData_.remove(index);
               this.onChanged();
            } else {
               this.prayDataBuilder_.remove(index);
            }

            return this;
         }

         public PrayData.Builder getPrayDataBuilder(int index) {
            return (PrayData.Builder)this.getPrayDataFieldBuilder().getBuilder(index);
         }

         public PrayDataOrBuilder getPrayDataOrBuilder(int index) {
            return this.prayDataBuilder_ == null ? (PrayDataOrBuilder)this.prayData_.get(index) : (PrayDataOrBuilder)this.prayDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PrayDataOrBuilder> getPrayDataOrBuilderList() {
            return this.prayDataBuilder_ != null ? this.prayDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.prayData_);
         }

         public PrayData.Builder addPrayDataBuilder() {
            return (PrayData.Builder)this.getPrayDataFieldBuilder().addBuilder(SpringFestivalMsg.PrayData.getDefaultInstance());
         }

         public PrayData.Builder addPrayDataBuilder(int index) {
            return (PrayData.Builder)this.getPrayDataFieldBuilder().addBuilder(index, SpringFestivalMsg.PrayData.getDefaultInstance());
         }

         public List<PrayData.Builder> getPrayDataBuilderList() {
            return this.getPrayDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PrayData, PrayData.Builder, PrayDataOrBuilder> getPrayDataFieldBuilder() {
            if (this.prayDataBuilder_ == null) {
               this.prayDataBuilder_ = new RepeatedFieldBuilderV3(this.prayData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.prayData_ = null;
            }

            return this.prayDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_PrayReward_12425 extends GeneratedMessageV3 implements C2S_PrayReward_12425OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CUSTOMID_FIELD_NUMBER = 1;
      private int customId_;
      private byte memoizedIsInitialized;
      private static final C2S_PrayReward_12425 DEFAULT_INSTANCE = new C2S_PrayReward_12425();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PrayReward_12425> PARSER = new AbstractParser<C2S_PrayReward_12425>() {
         public C2S_PrayReward_12425 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PrayReward_12425(input, extensionRegistry);
         }
      };

      private C2S_PrayReward_12425(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PrayReward_12425() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PrayReward_12425();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PrayReward_12425(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayReward_12425_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayReward_12425_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayReward_12425.class, Builder.class);
      }

      public boolean hasCustomId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCustomId() {
         return this.customId_;
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
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.customId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PrayReward_12425)) {
            return super.equals(obj);
         } else {
            C2S_PrayReward_12425 other = (C2S_PrayReward_12425)obj;
            if (this.hasCustomId() != other.hasCustomId()) {
               return false;
            } else if (this.hasCustomId() && this.getCustomId() != other.getCustomId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PrayReward_12425 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PrayReward_12425)PARSER.parseFrom(data);
      }

      public static C2S_PrayReward_12425 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayReward_12425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayReward_12425 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PrayReward_12425)PARSER.parseFrom(data);
      }

      public static C2S_PrayReward_12425 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayReward_12425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayReward_12425 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PrayReward_12425)PARSER.parseFrom(data);
      }

      public static C2S_PrayReward_12425 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayReward_12425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayReward_12425 parseFrom(InputStream input) throws IOException {
         return (C2S_PrayReward_12425)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayReward_12425 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayReward_12425)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayReward_12425 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PrayReward_12425)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PrayReward_12425 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayReward_12425)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayReward_12425 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PrayReward_12425)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayReward_12425 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayReward_12425)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PrayReward_12425 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PrayReward_12425 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PrayReward_12425> parser() {
         return PARSER;
      }

      public Parser<C2S_PrayReward_12425> getParserForType() {
         return PARSER;
      }

      public C2S_PrayReward_12425 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PrayReward_12425OrBuilder {
         private int bitField0_;
         private int customId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayReward_12425_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayReward_12425_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayReward_12425.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_PrayReward_12425.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.customId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayReward_12425_descriptor;
         }

         public C2S_PrayReward_12425 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_PrayReward_12425.getDefaultInstance();
         }

         public C2S_PrayReward_12425 build() {
            C2S_PrayReward_12425 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PrayReward_12425 buildPartial() {
            C2S_PrayReward_12425 result = new C2S_PrayReward_12425(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.customId_ = this.customId_;
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
            if (other instanceof C2S_PrayReward_12425) {
               return this.mergeFrom((C2S_PrayReward_12425)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PrayReward_12425 other) {
            if (other == SpringFestivalMsg.C2S_PrayReward_12425.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCustomId()) {
                  this.setCustomId(other.getCustomId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCustomId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PrayReward_12425 parsedMessage = null;

            try {
               parsedMessage = (C2S_PrayReward_12425)SpringFestivalMsg.C2S_PrayReward_12425.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PrayReward_12425)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_PrayReward_12426 extends GeneratedMessageV3 implements S2C_PrayReward_12426OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CUSTOMID_FIELD_NUMBER = 1;
      private int customId_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayReward_12426 DEFAULT_INSTANCE = new S2C_PrayReward_12426();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayReward_12426> PARSER = new AbstractParser<S2C_PrayReward_12426>() {
         public S2C_PrayReward_12426 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayReward_12426(input, extensionRegistry);
         }
      };

      private S2C_PrayReward_12426(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayReward_12426() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayReward_12426();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayReward_12426(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayReward_12426_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayReward_12426_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayReward_12426.class, Builder.class);
      }

      public boolean hasCustomId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCustomId() {
         return this.customId_;
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
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.customId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrayReward_12426)) {
            return super.equals(obj);
         } else {
            S2C_PrayReward_12426 other = (S2C_PrayReward_12426)obj;
            if (this.hasCustomId() != other.hasCustomId()) {
               return false;
            } else if (this.hasCustomId() && this.getCustomId() != other.getCustomId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrayReward_12426 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayReward_12426)PARSER.parseFrom(data);
      }

      public static S2C_PrayReward_12426 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayReward_12426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayReward_12426 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayReward_12426)PARSER.parseFrom(data);
      }

      public static S2C_PrayReward_12426 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayReward_12426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayReward_12426 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayReward_12426)PARSER.parseFrom(data);
      }

      public static S2C_PrayReward_12426 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayReward_12426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayReward_12426 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayReward_12426)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayReward_12426 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayReward_12426)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayReward_12426 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayReward_12426)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayReward_12426 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayReward_12426)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayReward_12426 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayReward_12426)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayReward_12426 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayReward_12426)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayReward_12426 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayReward_12426 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayReward_12426> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayReward_12426> getParserForType() {
         return PARSER;
      }

      public S2C_PrayReward_12426 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayReward_12426OrBuilder {
         private int bitField0_;
         private int customId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayReward_12426_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayReward_12426_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayReward_12426.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_PrayReward_12426.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.customId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayReward_12426_descriptor;
         }

         public S2C_PrayReward_12426 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_PrayReward_12426.getDefaultInstance();
         }

         public S2C_PrayReward_12426 build() {
            S2C_PrayReward_12426 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayReward_12426 buildPartial() {
            S2C_PrayReward_12426 result = new S2C_PrayReward_12426(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.customId_ = this.customId_;
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
            if (other instanceof S2C_PrayReward_12426) {
               return this.mergeFrom((S2C_PrayReward_12426)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayReward_12426 other) {
            if (other == SpringFestivalMsg.S2C_PrayReward_12426.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCustomId()) {
                  this.setCustomId(other.getCustomId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCustomId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrayReward_12426 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayReward_12426)SpringFestivalMsg.S2C_PrayReward_12426.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayReward_12426)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_PrayStarBuy_12427 extends GeneratedMessageV3 implements C2S_PrayStarBuy_12427OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYNUM_FIELD_NUMBER = 1;
      private int buyNum_;
      private byte memoizedIsInitialized;
      private static final C2S_PrayStarBuy_12427 DEFAULT_INSTANCE = new C2S_PrayStarBuy_12427();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PrayStarBuy_12427> PARSER = new AbstractParser<C2S_PrayStarBuy_12427>() {
         public C2S_PrayStarBuy_12427 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PrayStarBuy_12427(input, extensionRegistry);
         }
      };

      private C2S_PrayStarBuy_12427(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PrayStarBuy_12427() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PrayStarBuy_12427();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PrayStarBuy_12427(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayStarBuy_12427_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayStarBuy_12427_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayStarBuy_12427.class, Builder.class);
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PrayStarBuy_12427)) {
            return super.equals(obj);
         } else {
            C2S_PrayStarBuy_12427 other = (C2S_PrayStarBuy_12427)obj;
            if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
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
            if (this.hasBuyNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PrayStarBuy_12427 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PrayStarBuy_12427)PARSER.parseFrom(data);
      }

      public static C2S_PrayStarBuy_12427 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayStarBuy_12427)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayStarBuy_12427 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PrayStarBuy_12427)PARSER.parseFrom(data);
      }

      public static C2S_PrayStarBuy_12427 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayStarBuy_12427)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayStarBuy_12427 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PrayStarBuy_12427)PARSER.parseFrom(data);
      }

      public static C2S_PrayStarBuy_12427 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayStarBuy_12427)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayStarBuy_12427 parseFrom(InputStream input) throws IOException {
         return (C2S_PrayStarBuy_12427)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayStarBuy_12427 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayStarBuy_12427)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayStarBuy_12427 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PrayStarBuy_12427)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PrayStarBuy_12427 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayStarBuy_12427)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayStarBuy_12427 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PrayStarBuy_12427)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayStarBuy_12427 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayStarBuy_12427)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PrayStarBuy_12427 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PrayStarBuy_12427 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PrayStarBuy_12427> parser() {
         return PARSER;
      }

      public Parser<C2S_PrayStarBuy_12427> getParserForType() {
         return PARSER;
      }

      public C2S_PrayStarBuy_12427 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PrayStarBuy_12427OrBuilder {
         private int bitField0_;
         private int buyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayStarBuy_12427_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayStarBuy_12427_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayStarBuy_12427.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.C2S_PrayStarBuy_12427.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_C2S_PrayStarBuy_12427_descriptor;
         }

         public C2S_PrayStarBuy_12427 getDefaultInstanceForType() {
            return SpringFestivalMsg.C2S_PrayStarBuy_12427.getDefaultInstance();
         }

         public C2S_PrayStarBuy_12427 build() {
            C2S_PrayStarBuy_12427 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PrayStarBuy_12427 buildPartial() {
            C2S_PrayStarBuy_12427 result = new C2S_PrayStarBuy_12427(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyNum_ = this.buyNum_;
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
            if (other instanceof C2S_PrayStarBuy_12427) {
               return this.mergeFrom((C2S_PrayStarBuy_12427)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PrayStarBuy_12427 other) {
            if (other == SpringFestivalMsg.C2S_PrayStarBuy_12427.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PrayStarBuy_12427 parsedMessage = null;

            try {
               parsedMessage = (C2S_PrayStarBuy_12427)SpringFestivalMsg.C2S_PrayStarBuy_12427.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PrayStarBuy_12427)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 1;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
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

   public static final class S2C_PrayStarBuy_12428 extends GeneratedMessageV3 implements S2C_PrayStarBuy_12428OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYNUM_FIELD_NUMBER = 1;
      private int buyNum_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayStarBuy_12428 DEFAULT_INSTANCE = new S2C_PrayStarBuy_12428();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayStarBuy_12428> PARSER = new AbstractParser<S2C_PrayStarBuy_12428>() {
         public S2C_PrayStarBuy_12428 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayStarBuy_12428(input, extensionRegistry);
         }
      };

      private S2C_PrayStarBuy_12428(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayStarBuy_12428() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayStarBuy_12428();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayStarBuy_12428(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayStarBuy_12428_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayStarBuy_12428_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayStarBuy_12428.class, Builder.class);
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrayStarBuy_12428)) {
            return super.equals(obj);
         } else {
            S2C_PrayStarBuy_12428 other = (S2C_PrayStarBuy_12428)obj;
            if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
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
            if (this.hasBuyNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrayStarBuy_12428 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayStarBuy_12428)PARSER.parseFrom(data);
      }

      public static S2C_PrayStarBuy_12428 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayStarBuy_12428)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayStarBuy_12428 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayStarBuy_12428)PARSER.parseFrom(data);
      }

      public static S2C_PrayStarBuy_12428 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayStarBuy_12428)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayStarBuy_12428 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayStarBuy_12428)PARSER.parseFrom(data);
      }

      public static S2C_PrayStarBuy_12428 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayStarBuy_12428)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayStarBuy_12428 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayStarBuy_12428)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayStarBuy_12428 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayStarBuy_12428)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayStarBuy_12428 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayStarBuy_12428)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayStarBuy_12428 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayStarBuy_12428)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayStarBuy_12428 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayStarBuy_12428)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayStarBuy_12428 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayStarBuy_12428)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayStarBuy_12428 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayStarBuy_12428 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayStarBuy_12428> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayStarBuy_12428> getParserForType() {
         return PARSER;
      }

      public S2C_PrayStarBuy_12428 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayStarBuy_12428OrBuilder {
         private int bitField0_;
         private int buyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayStarBuy_12428_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayStarBuy_12428_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayStarBuy_12428.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SpringFestivalMsg.S2C_PrayStarBuy_12428.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SpringFestivalMsg.internal_static_springFestival_com_gzbz_protobuf_S2C_PrayStarBuy_12428_descriptor;
         }

         public S2C_PrayStarBuy_12428 getDefaultInstanceForType() {
            return SpringFestivalMsg.S2C_PrayStarBuy_12428.getDefaultInstance();
         }

         public S2C_PrayStarBuy_12428 build() {
            S2C_PrayStarBuy_12428 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayStarBuy_12428 buildPartial() {
            S2C_PrayStarBuy_12428 result = new S2C_PrayStarBuy_12428(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyNum_ = this.buyNum_;
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
            if (other instanceof S2C_PrayStarBuy_12428) {
               return this.mergeFrom((S2C_PrayStarBuy_12428)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayStarBuy_12428 other) {
            if (other == SpringFestivalMsg.S2C_PrayStarBuy_12428.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrayStarBuy_12428 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayStarBuy_12428)SpringFestivalMsg.S2C_PrayStarBuy_12428.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayStarBuy_12428)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 1;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
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

   public interface BlessDataOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasContent();

      String getContent();

      ByteString getContentBytes();
   }

   public interface C2S_EnvelopeBlessList_12403OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_EnvelopeBless_12405OrBuilder extends MessageOrBuilder {
      boolean hasContent();

      String getContent();

      ByteString getContentBytes();
   }

   public interface C2S_EnvelopeMain_12401OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GiftBoxCommitTask_12415OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_GiftBoxMain_12413OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LuckMain_12409OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LuckRollDice_12411OrBuilder extends MessageOrBuilder {
      boolean hasDicePlateId();

      int getDicePlateId();
   }

   public interface C2S_PrayItemList_12421OrBuilder extends MessageOrBuilder {
      boolean hasCustomId();

      int getCustomId();
   }

   public interface C2S_PrayMain_12419OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PrayReward_12425OrBuilder extends MessageOrBuilder {
      boolean hasCustomId();

      int getCustomId();
   }

   public interface C2S_PrayStarBuy_12427OrBuilder extends MessageOrBuilder {
      boolean hasBuyNum();

      int getBuyNum();
   }

   public interface C2S_Pray_12423OrBuilder extends MessageOrBuilder {
      List<PrayData> getPrayDataList();

      PrayData getPrayData(int index);

      int getPrayDataCount();

      List<? extends PrayDataOrBuilder> getPrayDataOrBuilderList();

      PrayDataOrBuilder getPrayDataOrBuilder(int index);
   }

   public interface DiceDataOrBuilder extends MessageOrBuilder {
      boolean hasIndex();

      int getIndex();

      boolean hasNum();

      int getNum();
   }

   public interface DicePlateDataOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasCount();

      int getCount();
   }

   public interface PrayDataOrBuilder extends MessageOrBuilder {
      boolean hasCustomId();

      int getCustomId();

      boolean hasItemIndex();

      int getItemIndex();

      boolean hasItem();

      CommonMsg.ItemInfo getItem();

      CommonMsg.ItemInfoOrBuilder getItemOrBuilder();

      boolean hasIsGot();

      boolean getIsGot();
   }

   public interface S2C_EnvelopeBlessList_12404OrBuilder extends MessageOrBuilder {
      boolean hasBlessCount();

      int getBlessCount();

      List<BlessData> getBlessDataList();

      BlessData getBlessData(int index);

      int getBlessDataCount();

      List<? extends BlessDataOrBuilder> getBlessDataOrBuilderList();

      BlessDataOrBuilder getBlessDataOrBuilder(int index);
   }

   public interface S2C_EnvelopeBlessNotify_12408OrBuilder extends MessageOrBuilder {
      boolean hasBlessData();

      BlessData getBlessData();

      BlessDataOrBuilder getBlessDataOrBuilder();
   }

   public interface S2C_EnvelopeBless_12406OrBuilder extends MessageOrBuilder {
      boolean hasContent();

      String getContent();

      ByteString getContentBytes();
   }

   public interface S2C_EnvelopeMain_12402OrBuilder extends MessageOrBuilder {
      boolean hasEndTime();

      int getEndTime();
   }

   public interface S2C_GiftBoxCommitTask_12416OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();

      boolean hasGotGiftBox();

      int getGotGiftBox();
   }

   public interface S2C_GiftBoxMain_12414OrBuilder extends MessageOrBuilder {
      boolean hasGotGiftBox();

      int getGotGiftBox();

      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_GiftBoxTasks_12418OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LuckMain_12410OrBuilder extends MessageOrBuilder {
      List<DicePlateData> getDicePlateList();

      DicePlateData getDicePlate(int index);

      int getDicePlateCount();

      List<? extends DicePlateDataOrBuilder> getDicePlateOrBuilderList();

      DicePlateDataOrBuilder getDicePlateOrBuilder(int index);
   }

   public interface S2C_LuckRollDice_12412OrBuilder extends MessageOrBuilder {
      boolean hasDicePlateId();

      int getDicePlateId();

      List<DiceData> getDiceList();

      DiceData getDice(int index);

      int getDiceCount();

      List<? extends DiceDataOrBuilder> getDiceOrBuilderList();

      DiceDataOrBuilder getDiceOrBuilder(int index);
   }

   public interface S2C_PrayItemList_12422OrBuilder extends MessageOrBuilder {
      boolean hasCustomId();

      int getCustomId();

      List<CommonMsg.ItemInfo> getItemList();

      CommonMsg.ItemInfo getItem(int index);

      int getItemCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index);
   }

   public interface S2C_PrayMain_12420OrBuilder extends MessageOrBuilder {
      List<PrayData> getPrayDataList();

      PrayData getPrayData(int index);

      int getPrayDataCount();

      List<? extends PrayDataOrBuilder> getPrayDataOrBuilderList();

      PrayDataOrBuilder getPrayDataOrBuilder(int index);
   }

   public interface S2C_PrayReward_12426OrBuilder extends MessageOrBuilder {
      boolean hasCustomId();

      int getCustomId();
   }

   public interface S2C_PrayStarBuy_12428OrBuilder extends MessageOrBuilder {
      boolean hasBuyNum();

      int getBuyNum();
   }

   public interface S2C_Pray_12424OrBuilder extends MessageOrBuilder {
      List<PrayData> getPrayDataList();

      PrayData getPrayData(int index);

      int getPrayDataCount();

      List<? extends PrayDataOrBuilder> getPrayDataOrBuilderList();

      PrayDataOrBuilder getPrayDataOrBuilder(int index);
   }
}
