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

public final class AncientSwordMsg {
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordMain_24601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordMain_24601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordMain_24602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordMain_24602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_AncientMonster_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_AncientMonster_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_AncientHero_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_AncientHero_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetSword_24603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetSword_24603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetSword_24604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetSword_24604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordFlush_24605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordFlush_24605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordFlush_24606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordFlush_24606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24608_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24608_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClear_24609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClear_24609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordClear_24610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordClear_24610_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenMain_24611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenMain_24611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordTokenMain_24612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordTokenMain_24612_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24613_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24613_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24614_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24614_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenBuy_24615_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenBuy_24615_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_S2CR_AncientSwordBornMonster_24616_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_S2CR_AncientSwordBornMonster_24616_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_CR2S_AncientSwordBornMonster_24617_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_CR2S_AncientSwordBornMonster_24617_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_S2S_AncientSwordGetMonster_24618_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_S2S_AncientSwordGetMonster_24618_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClean_24619_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClean_24619_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetActive_24620_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetActive_24620_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetActive_24621_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetActive_24621_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordBornRobot_24622_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordBornRobot_24622_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private AncientSwordMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012AncientSword.proto\u0012\u001eancientSword.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u001c\n\u001aC2S_AncientSwordMain_24601\"ü\u0002\n\u001aS2C_AncientSwordMain_24602\u0012\u000b\n\u0003gas\u0018\u0001 \u0002(\u0005\u0012\u0011\n\thasUnlock\u0018\u0002 \u0002(\b\u0012<\n\u0004dayM\u0018\u0003 \u0003(\u000b2..ancientSword.com.gzbz.protobuf.AncientMonster\u0012=\n\u0005weekM\u0018\u0004 \u0003(\u000b2..ancientSword.com.gzbz.protobuf.AncientMonster\u0012\u0015\n\rshopCountdown\u0018\u0005 \u0002(\u0005\u0012\u000e\n\u0006buffId\u0018\u0006 \u0003(\u0005\u0012\u0013\n\u000bactiveValue\u0018\u0007 \u0002(\u0005\u0012\u0014\n\factiveReward\u0018\b \u0003(\u0005\u0012\u0011\n\tflushTime\u0018\t \u0002(\u0005\u00128\n\nbountyTask\u0018\n \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u000f\n\u0007taskEnd\u0018\u000b \u0002(\u0005\u0012\u0011\n\tactiveEnd\u0018\f \u0002(\u0005\"Â\u0001\n\u000eAncientMonster\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003key\u0018\u0002 \u0001(\u0005\u0012\n\n\u0002lv\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004name\u0018\u0004 \u0001(\t\u0012@\n\u000bancientHero\u0018\u0005 \u0003(\u000b2+.ancientSword.com.gzbz.protobuf.AncientHero\u0012\r\n\u0005power\u0018\u0006 \u0001(\u0003\u0012\r\n\u0005array\u0018\u0007 \u0001(\f\u0012\r\n\u0005index\u0018\b \u0001(\u0005\u0012\u000e\n\u0006heroId\u0018\t \u0001(\u0005\"X\n\u000bAncientHero\u0012\u000e\n\u0006heroId\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0001(\u0005\u0012\f\n\u0004star\u0018\u0003 \u0001(\u0005\u0012\u000b\n\u0003pos\u0018\u0004 \u0001(\u0005\u0012\u000f\n\u0007dressId\u0018\u0005 \u0001(\u0005\" \n\u001eC2S_AncientSwordGetSword_24603\"B\n\u001eS2C_AncientSwordGetSword_24604\u0012\u0010\n\bschedule\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006hasGet\u0018\u0002 \u0002(\b\"F\n\u001bC2S_AncientSwordFlush_24605\u0012\u000b\n\u0003key\u0018\u0001 \u0002(\u0005\u0012\u001a\n\u000bdirectFlush\u0018\u0002 \u0001(\b:\u0005false\"\u0094\u0001\n\u001bS2C_AncientSwordFlush_24606\u00129\n\u0001m\u0018\u0001 \u0003(\u000b2..ancientSword.com.gzbz.protobuf.AncientMonster\u0012\u0011\n\tflushTime\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bschedule\u0018\u0003 \u0002(\u0005\u0012\u0015\n\rshopCountdown\u0018\u0004 \u0002(\u0005\"2\n C2S_AncientSwordCommitTask_24607\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"{\n S2C_AncientSwordCommitTask_24608\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u000e\n\u0006buffId\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bactiveValue\u0018\u0003 \u0002(\u0005\",\n\u001bC2S_AncientSwordClear_24609\u0012\r\n\u0005clear\u0018\u0001 \u0002(\b\",\n\u001bS2C_AncientSwordClear_24610\u0012\r\n\u0005clear\u0018\u0001 \u0002(\b\"!\n\u001fC2S_AncientSwordTokenMain_24611\"ø\u0002\n\u001fS2C_AncientSwordTokenMain_24612\u0012\u0010\n\bintegral\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003VIP\u0018\u0003 \u0002(\b\u0012\u0011\n\tstartTime\u0018\u0004 \u0002(\u0003\u0012\u000f\n\u0007endTime\u0018\u0005 \u0002(\u0003\u0012\u0013\n\u000bbuyIntegral\u0018\u0006 \u0002(\u0005\u0012\r\n\u0005buyLv\u0018\u0007 \u0002(\u0005\u00125\n\u0007dayTask\u0018\b \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u0010\n\bdayReset\u0018\t \u0002(\u0003\u00126\n\bweekTask\u0018\n \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u0011\n\tweekReset\u0018\u000b \u0002(\u0003\u00127\n\tmonthTask\u0018\f \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u0012\n\nmonthReset\u0018\r \u0002(\u0003\"2\n C2S_AncientSwordCommitTask_24613\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"V\n S2C_AncientSwordCommitTask_24614\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"=\n\u001eC2S_AncientSwordTokenBuy_24615\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\"¼\u0001\n\"S2CR_AncientSwordBornMonster_24616\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005power\u0018\u0003 \u0002(\u0003\u0012\u0011\n\tmonsterId\u0018\u0004 \u0003(\u0005\u0012\u0013\n\u000bexistPlayer\u0018\u0005 \u0003(\u0005\u0012;\n\u0006status\u0018\u0006 \u0002(\u000e2+.ancientSword.com.gzbz.protobuf.CrossStatus\" \u0001\n\"CR2S_AncientSwordBornMonster_24617\u0012\u0014\n\fdestServerId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fdestPlayerId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tmonsterId\u0018\u0003 \u0002(\u0005\u0012;\n\u0006status\u0018\u0004 \u0002(\u000e2+.ancientSword.com.gzbz.protobuf.CrossStatus\" \u0001\n S2S_AncientSwordGetMonster_24618\u0012?\n\u0007monster\u0018\u0001 \u0002(\u000b2..ancientSword.com.gzbz.protobuf.AncientMonster\u0012;\n\u0006status\u0018\u0002 \u0002(\u000e2+.ancientSword.com.gzbz.protobuf.CrossStatus\"\u001d\n\u001bC2S_AncientSwordClean_24619\"-\n\u001fC2S_AncientSwordGetActive_24620\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"-\n\u001fS2C_AncientSwordGetActive_24621\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0096\u0001\n\u001fC2S_AncientSwordBornRobot_24622\u0012\u0011\n\tmonsterId\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0001(\u0005\u0012\u0016\n\u0007bornAll\u0018\u0003 \u0001(\b:\u0005false\u0012;\n\u0006status\u0018\u0004 \u0001(\u000e2+.ancientSword.com.gzbz.protobuf.CrossStatus*R\n\u000bCrossStatus\u0012\u0014\n\u0010BORN_DAY_MONSTER\u0010\u0001\u0012\u0015\n\u0011BORN_WEEK_MONSTER\u0010\u0002\u0012\u0016\n\u0012FLUSH_WEEK_MONSTER\u0010\u0003B&\n\u0011com.gzbz.protobufB\u000fAncientSwordMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordMain_24601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordMain_24601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordMain_24601_descriptor, new String[0]);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordMain_24602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordMain_24602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordMain_24602_descriptor, new String[]{"Gas", "HasUnlock", "DayM", "WeekM", "ShopCountdown", "BuffId", "ActiveValue", "ActiveReward", "FlushTime", "BountyTask", "TaskEnd", "ActiveEnd"});
      internal_static_ancientSword_com_gzbz_protobuf_AncientMonster_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_ancientSword_com_gzbz_protobuf_AncientMonster_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_AncientMonster_descriptor, new String[]{"Id", "Key", "Lv", "Name", "AncientHero", "Power", "Array", "Index", "HeroId"});
      internal_static_ancientSword_com_gzbz_protobuf_AncientHero_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_ancientSword_com_gzbz_protobuf_AncientHero_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_AncientHero_descriptor, new String[]{"HeroId", "Level", "Star", "Pos", "DressId"});
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetSword_24603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetSword_24603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetSword_24603_descriptor, new String[0]);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetSword_24604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetSword_24604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetSword_24604_descriptor, new String[]{"Schedule", "HasGet"});
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordFlush_24605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordFlush_24605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordFlush_24605_descriptor, new String[]{"Key", "DirectFlush"});
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordFlush_24606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordFlush_24606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordFlush_24606_descriptor, new String[]{"M", "FlushTime", "Schedule", "ShopCountdown"});
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24607_descriptor, new String[]{"TaskId"});
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24608_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24608_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24608_descriptor, new String[]{"Task", "BuffId", "ActiveValue"});
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClear_24609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClear_24609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClear_24609_descriptor, new String[]{"Clear"});
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordClear_24610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordClear_24610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordClear_24610_descriptor, new String[]{"Clear"});
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenMain_24611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenMain_24611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenMain_24611_descriptor, new String[0]);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordTokenMain_24612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordTokenMain_24612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordTokenMain_24612_descriptor, new String[]{"Integral", "Level", "VIP", "StartTime", "EndTime", "BuyIntegral", "BuyLv", "DayTask", "DayReset", "WeekTask", "WeekReset", "MonthTask", "MonthReset"});
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24613_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24613_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24613_descriptor, new String[]{"TaskId"});
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24614_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24614_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24614_descriptor, new String[]{"Task"});
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenBuy_24615_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenBuy_24615_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenBuy_24615_descriptor, new String[]{"Type", "Count"});
      internal_static_ancientSword_com_gzbz_protobuf_S2CR_AncientSwordBornMonster_24616_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_ancientSword_com_gzbz_protobuf_S2CR_AncientSwordBornMonster_24616_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_S2CR_AncientSwordBornMonster_24616_descriptor, new String[]{"ServerId", "PlayerId", "Power", "MonsterId", "ExistPlayer", "Status"});
      internal_static_ancientSword_com_gzbz_protobuf_CR2S_AncientSwordBornMonster_24617_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_ancientSword_com_gzbz_protobuf_CR2S_AncientSwordBornMonster_24617_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_CR2S_AncientSwordBornMonster_24617_descriptor, new String[]{"DestServerId", "DestPlayerId", "MonsterId", "Status"});
      internal_static_ancientSword_com_gzbz_protobuf_S2S_AncientSwordGetMonster_24618_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_ancientSword_com_gzbz_protobuf_S2S_AncientSwordGetMonster_24618_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_S2S_AncientSwordGetMonster_24618_descriptor, new String[]{"Monster", "Status"});
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClean_24619_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClean_24619_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClean_24619_descriptor, new String[0]);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetActive_24620_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetActive_24620_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetActive_24620_descriptor, new String[]{"Id"});
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetActive_24621_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetActive_24621_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetActive_24621_descriptor, new String[]{"Id"});
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordBornRobot_24622_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordBornRobot_24622_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordBornRobot_24622_descriptor, new String[]{"MonsterId", "Num", "BornAll", "Status"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static enum CrossStatus implements ProtocolMessageEnum {
      BORN_DAY_MONSTER(1),
      BORN_WEEK_MONSTER(2),
      FLUSH_WEEK_MONSTER(3);

      public static final int BORN_DAY_MONSTER_VALUE = 1;
      public static final int BORN_WEEK_MONSTER_VALUE = 2;
      public static final int FLUSH_WEEK_MONSTER_VALUE = 3;
      private static final Internal.EnumLiteMap<CrossStatus> internalValueMap = new Internal.EnumLiteMap<CrossStatus>() {
         public CrossStatus findValueByNumber(int number) {
            return AncientSwordMsg.CrossStatus.forNumber(number);
         }
      };
      private static final CrossStatus[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static CrossStatus valueOf(int value) {
         return forNumber(value);
      }

      public static CrossStatus forNumber(int value) {
         switch (value) {
            case 1:
               return BORN_DAY_MONSTER;
            case 2:
               return BORN_WEEK_MONSTER;
            case 3:
               return FLUSH_WEEK_MONSTER;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CrossStatus> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)AncientSwordMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static CrossStatus valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private CrossStatus(int value) {
         this.value = value;
      }
   }

   public static final class C2S_AncientSwordMain_24601 extends GeneratedMessageV3 implements C2S_AncientSwordMain_24601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordMain_24601 DEFAULT_INSTANCE = new C2S_AncientSwordMain_24601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordMain_24601> PARSER = new AbstractParser<C2S_AncientSwordMain_24601>() {
         public C2S_AncientSwordMain_24601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordMain_24601(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordMain_24601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordMain_24601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordMain_24601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordMain_24601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordMain_24601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordMain_24601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordMain_24601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AncientSwordMain_24601)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordMain_24601 other = (C2S_AncientSwordMain_24601)obj;
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

      public static C2S_AncientSwordMain_24601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordMain_24601)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordMain_24601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordMain_24601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordMain_24601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordMain_24601)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordMain_24601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordMain_24601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordMain_24601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordMain_24601)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordMain_24601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordMain_24601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordMain_24601 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordMain_24601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordMain_24601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordMain_24601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordMain_24601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordMain_24601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordMain_24601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordMain_24601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordMain_24601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordMain_24601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordMain_24601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordMain_24601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordMain_24601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordMain_24601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordMain_24601> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordMain_24601> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordMain_24601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordMain_24601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordMain_24601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordMain_24601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordMain_24601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordMain_24601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordMain_24601_descriptor;
         }

         public C2S_AncientSwordMain_24601 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordMain_24601.getDefaultInstance();
         }

         public C2S_AncientSwordMain_24601 build() {
            C2S_AncientSwordMain_24601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordMain_24601 buildPartial() {
            C2S_AncientSwordMain_24601 result = new C2S_AncientSwordMain_24601(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_AncientSwordMain_24601) {
               return this.mergeFrom((C2S_AncientSwordMain_24601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordMain_24601 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordMain_24601.getDefaultInstance()) {
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
            C2S_AncientSwordMain_24601 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordMain_24601)AncientSwordMsg.C2S_AncientSwordMain_24601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordMain_24601)e.getUnfinishedMessage();
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

   public static final class S2C_AncientSwordMain_24602 extends GeneratedMessageV3 implements S2C_AncientSwordMain_24602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GAS_FIELD_NUMBER = 1;
      private int gas_;
      public static final int HASUNLOCK_FIELD_NUMBER = 2;
      private boolean hasUnlock_;
      public static final int DAYM_FIELD_NUMBER = 3;
      private List<AncientMonster> dayM_;
      public static final int WEEKM_FIELD_NUMBER = 4;
      private List<AncientMonster> weekM_;
      public static final int SHOPCOUNTDOWN_FIELD_NUMBER = 5;
      private int shopCountdown_;
      public static final int BUFFID_FIELD_NUMBER = 6;
      private Internal.IntList buffId_;
      public static final int ACTIVEVALUE_FIELD_NUMBER = 7;
      private int activeValue_;
      public static final int ACTIVEREWARD_FIELD_NUMBER = 8;
      private Internal.IntList activeReward_;
      public static final int FLUSHTIME_FIELD_NUMBER = 9;
      private int flushTime_;
      public static final int BOUNTYTASK_FIELD_NUMBER = 10;
      private List<ActivityMsg.TaskData> bountyTask_;
      public static final int TASKEND_FIELD_NUMBER = 11;
      private int taskEnd_;
      public static final int ACTIVEEND_FIELD_NUMBER = 12;
      private int activeEnd_;
      private byte memoizedIsInitialized;
      private static final S2C_AncientSwordMain_24602 DEFAULT_INSTANCE = new S2C_AncientSwordMain_24602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AncientSwordMain_24602> PARSER = new AbstractParser<S2C_AncientSwordMain_24602>() {
         public S2C_AncientSwordMain_24602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AncientSwordMain_24602(input, extensionRegistry);
         }
      };

      private S2C_AncientSwordMain_24602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AncientSwordMain_24602() {
         this.memoizedIsInitialized = -1;
         this.dayM_ = Collections.emptyList();
         this.weekM_ = Collections.emptyList();
         this.buffId_ = emptyIntList();
         this.activeReward_ = emptyIntList();
         this.bountyTask_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AncientSwordMain_24602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AncientSwordMain_24602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gas_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hasUnlock_ = input.readBool();
                        continue;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.dayM_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.dayM_.add(input.readMessage(AncientSwordMsg.AncientMonster.PARSER, extensionRegistry));
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.weekM_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.weekM_.add(input.readMessage(AncientSwordMsg.AncientMonster.PARSER, extensionRegistry));
                        continue;
                     case 40:
                        this.bitField0_ |= 4;
                        this.shopCountdown_ = input.readInt32();
                        continue;
                     case 48:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.buffId_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        this.buffId_.addInt(input.readInt32());
                        continue;
                     case 50:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 32) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buffId_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }
                        break;
                     case 56:
                        this.bitField0_ |= 8;
                        this.activeValue_ = input.readInt32();
                        continue;
                     case 64:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.activeReward_ = newIntList();
                           mutable_bitField0_ |= 128;
                        }

                        this.activeReward_.addInt(input.readInt32());
                        continue;
                     case 66:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 128) == 0 && input.getBytesUntilLimit() > 0) {
                           this.activeReward_ = newIntList();
                           mutable_bitField0_ |= 128;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.activeReward_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 72:
                        this.bitField0_ |= 16;
                        this.flushTime_ = input.readInt32();
                        continue;
                     case 82:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.bountyTask_ = new ArrayList();
                           mutable_bitField0_ |= 512;
                        }

                        this.bountyTask_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        continue;
                     case 88:
                        this.bitField0_ |= 32;
                        this.taskEnd_ = input.readInt32();
                        continue;
                     case 96:
                        this.bitField0_ |= 64;
                        this.activeEnd_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.buffId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.dayM_ = Collections.unmodifiableList(this.dayM_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.weekM_ = Collections.unmodifiableList(this.weekM_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.buffId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 128) != 0) {
                  this.activeReward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 512) != 0) {
                  this.bountyTask_ = Collections.unmodifiableList(this.bountyTask_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordMain_24602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordMain_24602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordMain_24602.class, Builder.class);
      }

      public boolean hasGas() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGas() {
         return this.gas_;
      }

      public boolean hasHasUnlock() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getHasUnlock() {
         return this.hasUnlock_;
      }

      public List<AncientMonster> getDayMList() {
         return this.dayM_;
      }

      public List<? extends AncientMonsterOrBuilder> getDayMOrBuilderList() {
         return this.dayM_;
      }

      public int getDayMCount() {
         return this.dayM_.size();
      }

      public AncientMonster getDayM(int index) {
         return (AncientMonster)this.dayM_.get(index);
      }

      public AncientMonsterOrBuilder getDayMOrBuilder(int index) {
         return (AncientMonsterOrBuilder)this.dayM_.get(index);
      }

      public List<AncientMonster> getWeekMList() {
         return this.weekM_;
      }

      public List<? extends AncientMonsterOrBuilder> getWeekMOrBuilderList() {
         return this.weekM_;
      }

      public int getWeekMCount() {
         return this.weekM_.size();
      }

      public AncientMonster getWeekM(int index) {
         return (AncientMonster)this.weekM_.get(index);
      }

      public AncientMonsterOrBuilder getWeekMOrBuilder(int index) {
         return (AncientMonsterOrBuilder)this.weekM_.get(index);
      }

      public boolean hasShopCountdown() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getShopCountdown() {
         return this.shopCountdown_;
      }

      public List<Integer> getBuffIdList() {
         return this.buffId_;
      }

      public int getBuffIdCount() {
         return this.buffId_.size();
      }

      public int getBuffId(int index) {
         return this.buffId_.getInt(index);
      }

      public boolean hasActiveValue() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getActiveValue() {
         return this.activeValue_;
      }

      public List<Integer> getActiveRewardList() {
         return this.activeReward_;
      }

      public int getActiveRewardCount() {
         return this.activeReward_.size();
      }

      public int getActiveReward(int index) {
         return this.activeReward_.getInt(index);
      }

      public boolean hasFlushTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getFlushTime() {
         return this.flushTime_;
      }

      public List<ActivityMsg.TaskData> getBountyTaskList() {
         return this.bountyTask_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getBountyTaskOrBuilderList() {
         return this.bountyTask_;
      }

      public int getBountyTaskCount() {
         return this.bountyTask_.size();
      }

      public ActivityMsg.TaskData getBountyTask(int index) {
         return (ActivityMsg.TaskData)this.bountyTask_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getBountyTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.bountyTask_.get(index);
      }

      public boolean hasTaskEnd() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getTaskEnd() {
         return this.taskEnd_;
      }

      public boolean hasActiveEnd() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getActiveEnd() {
         return this.activeEnd_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGas()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHasUnlock()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShopCountdown()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActiveValue()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFlushTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTaskEnd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActiveEnd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getBountyTaskCount(); ++i) {
               if (!this.getBountyTask(i).isInitialized()) {
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
            output.writeInt32(1, this.gas_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.hasUnlock_);
         }

         for(int i = 0; i < this.dayM_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.dayM_.get(i));
         }

         for(int i = 0; i < this.weekM_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.weekM_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.shopCountdown_);
         }

         for(int i = 0; i < this.buffId_.size(); ++i) {
            output.writeInt32(6, this.buffId_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(7, this.activeValue_);
         }

         for(int i = 0; i < this.activeReward_.size(); ++i) {
            output.writeInt32(8, this.activeReward_.getInt(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(9, this.flushTime_);
         }

         for(int i = 0; i < this.bountyTask_.size(); ++i) {
            output.writeMessage(10, (MessageLite)this.bountyTask_.get(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(11, this.taskEnd_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(12, this.activeEnd_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gas_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.hasUnlock_);
            }

            for(int i = 0; i < this.dayM_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.dayM_.get(i));
            }

            for(int i = 0; i < this.weekM_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.weekM_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.shopCountdown_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.buffId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buffId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffIdList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.activeValue_);
            }

            dataSize = 0;

            for(int i = 0; i < this.activeReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.activeReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getActiveRewardList().size();
            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.flushTime_);
            }

            for(int i = 0; i < this.bountyTask_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.bountyTask_.get(i));
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.taskEnd_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.activeEnd_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AncientSwordMain_24602)) {
            return super.equals(obj);
         } else {
            S2C_AncientSwordMain_24602 other = (S2C_AncientSwordMain_24602)obj;
            if (this.hasGas() != other.hasGas()) {
               return false;
            } else if (this.hasGas() && this.getGas() != other.getGas()) {
               return false;
            } else if (this.hasHasUnlock() != other.hasHasUnlock()) {
               return false;
            } else if (this.hasHasUnlock() && this.getHasUnlock() != other.getHasUnlock()) {
               return false;
            } else if (!this.getDayMList().equals(other.getDayMList())) {
               return false;
            } else if (!this.getWeekMList().equals(other.getWeekMList())) {
               return false;
            } else if (this.hasShopCountdown() != other.hasShopCountdown()) {
               return false;
            } else if (this.hasShopCountdown() && this.getShopCountdown() != other.getShopCountdown()) {
               return false;
            } else if (!this.getBuffIdList().equals(other.getBuffIdList())) {
               return false;
            } else if (this.hasActiveValue() != other.hasActiveValue()) {
               return false;
            } else if (this.hasActiveValue() && this.getActiveValue() != other.getActiveValue()) {
               return false;
            } else if (!this.getActiveRewardList().equals(other.getActiveRewardList())) {
               return false;
            } else if (this.hasFlushTime() != other.hasFlushTime()) {
               return false;
            } else if (this.hasFlushTime() && this.getFlushTime() != other.getFlushTime()) {
               return false;
            } else if (!this.getBountyTaskList().equals(other.getBountyTaskList())) {
               return false;
            } else if (this.hasTaskEnd() != other.hasTaskEnd()) {
               return false;
            } else if (this.hasTaskEnd() && this.getTaskEnd() != other.getTaskEnd()) {
               return false;
            } else if (this.hasActiveEnd() != other.hasActiveEnd()) {
               return false;
            } else if (this.hasActiveEnd() && this.getActiveEnd() != other.getActiveEnd()) {
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
            if (this.hasGas()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGas();
            }

            if (this.hasHasUnlock()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getHasUnlock());
            }

            if (this.getDayMCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDayMList().hashCode();
            }

            if (this.getWeekMCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getWeekMList().hashCode();
            }

            if (this.hasShopCountdown()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getShopCountdown();
            }

            if (this.getBuffIdCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBuffIdList().hashCode();
            }

            if (this.hasActiveValue()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getActiveValue();
            }

            if (this.getActiveRewardCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getActiveRewardList().hashCode();
            }

            if (this.hasFlushTime()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getFlushTime();
            }

            if (this.getBountyTaskCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getBountyTaskList().hashCode();
            }

            if (this.hasTaskEnd()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getTaskEnd();
            }

            if (this.hasActiveEnd()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getActiveEnd();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AncientSwordMain_24602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordMain_24602)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordMain_24602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordMain_24602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordMain_24602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordMain_24602)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordMain_24602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordMain_24602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordMain_24602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordMain_24602)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordMain_24602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordMain_24602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordMain_24602 parseFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordMain_24602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordMain_24602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordMain_24602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordMain_24602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordMain_24602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordMain_24602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordMain_24602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordMain_24602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AncientSwordMain_24602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordMain_24602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordMain_24602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AncientSwordMain_24602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AncientSwordMain_24602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AncientSwordMain_24602> parser() {
         return PARSER;
      }

      public Parser<S2C_AncientSwordMain_24602> getParserForType() {
         return PARSER;
      }

      public S2C_AncientSwordMain_24602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AncientSwordMain_24602OrBuilder {
         private int bitField0_;
         private int gas_;
         private boolean hasUnlock_;
         private List<AncientMonster> dayM_;
         private RepeatedFieldBuilderV3<AncientMonster, AncientMonster.Builder, AncientMonsterOrBuilder> dayMBuilder_;
         private List<AncientMonster> weekM_;
         private RepeatedFieldBuilderV3<AncientMonster, AncientMonster.Builder, AncientMonsterOrBuilder> weekMBuilder_;
         private int shopCountdown_;
         private Internal.IntList buffId_;
         private int activeValue_;
         private Internal.IntList activeReward_;
         private int flushTime_;
         private List<ActivityMsg.TaskData> bountyTask_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> bountyTaskBuilder_;
         private int taskEnd_;
         private int activeEnd_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordMain_24602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordMain_24602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordMain_24602.class, Builder.class);
         }

         private Builder() {
            this.dayM_ = Collections.emptyList();
            this.weekM_ = Collections.emptyList();
            this.buffId_ = AncientSwordMsg.S2C_AncientSwordMain_24602.emptyIntList();
            this.activeReward_ = AncientSwordMsg.S2C_AncientSwordMain_24602.emptyIntList();
            this.bountyTask_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.dayM_ = Collections.emptyList();
            this.weekM_ = Collections.emptyList();
            this.buffId_ = AncientSwordMsg.S2C_AncientSwordMain_24602.emptyIntList();
            this.activeReward_ = AncientSwordMsg.S2C_AncientSwordMain_24602.emptyIntList();
            this.bountyTask_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.S2C_AncientSwordMain_24602.alwaysUseFieldBuilders) {
               this.getDayMFieldBuilder();
               this.getWeekMFieldBuilder();
               this.getBountyTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.gas_ = 0;
            this.bitField0_ &= -2;
            this.hasUnlock_ = false;
            this.bitField0_ &= -3;
            if (this.dayMBuilder_ == null) {
               this.dayM_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.dayMBuilder_.clear();
            }

            if (this.weekMBuilder_ == null) {
               this.weekM_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.weekMBuilder_.clear();
            }

            this.shopCountdown_ = 0;
            this.bitField0_ &= -17;
            this.buffId_ = AncientSwordMsg.S2C_AncientSwordMain_24602.emptyIntList();
            this.bitField0_ &= -33;
            this.activeValue_ = 0;
            this.bitField0_ &= -65;
            this.activeReward_ = AncientSwordMsg.S2C_AncientSwordMain_24602.emptyIntList();
            this.bitField0_ &= -129;
            this.flushTime_ = 0;
            this.bitField0_ &= -257;
            if (this.bountyTaskBuilder_ == null) {
               this.bountyTask_ = Collections.emptyList();
               this.bitField0_ &= -513;
            } else {
               this.bountyTaskBuilder_.clear();
            }

            this.taskEnd_ = 0;
            this.bitField0_ &= -1025;
            this.activeEnd_ = 0;
            this.bitField0_ &= -2049;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordMain_24602_descriptor;
         }

         public S2C_AncientSwordMain_24602 getDefaultInstanceForType() {
            return AncientSwordMsg.S2C_AncientSwordMain_24602.getDefaultInstance();
         }

         public S2C_AncientSwordMain_24602 build() {
            S2C_AncientSwordMain_24602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AncientSwordMain_24602 buildPartial() {
            S2C_AncientSwordMain_24602 result = new S2C_AncientSwordMain_24602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gas_ = this.gas_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hasUnlock_ = this.hasUnlock_;
               to_bitField0_ |= 2;
            }

            if (this.dayMBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.dayM_ = Collections.unmodifiableList(this.dayM_);
                  this.bitField0_ &= -5;
               }

               result.dayM_ = this.dayM_;
            } else {
               result.dayM_ = this.dayMBuilder_.build();
            }

            if (this.weekMBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.weekM_ = Collections.unmodifiableList(this.weekM_);
                  this.bitField0_ &= -9;
               }

               result.weekM_ = this.weekM_;
            } else {
               result.weekM_ = this.weekMBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.shopCountdown_ = this.shopCountdown_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 32) != 0) {
               this.buffId_.makeImmutable();
               this.bitField0_ &= -33;
            }

            result.buffId_ = this.buffId_;
            if ((from_bitField0_ & 64) != 0) {
               result.activeValue_ = this.activeValue_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 128) != 0) {
               this.activeReward_.makeImmutable();
               this.bitField0_ &= -129;
            }

            result.activeReward_ = this.activeReward_;
            if ((from_bitField0_ & 256) != 0) {
               result.flushTime_ = this.flushTime_;
               to_bitField0_ |= 16;
            }

            if (this.bountyTaskBuilder_ == null) {
               if ((this.bitField0_ & 512) != 0) {
                  this.bountyTask_ = Collections.unmodifiableList(this.bountyTask_);
                  this.bitField0_ &= -513;
               }

               result.bountyTask_ = this.bountyTask_;
            } else {
               result.bountyTask_ = this.bountyTaskBuilder_.build();
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.taskEnd_ = this.taskEnd_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.activeEnd_ = this.activeEnd_;
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
            if (other instanceof S2C_AncientSwordMain_24602) {
               return this.mergeFrom((S2C_AncientSwordMain_24602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AncientSwordMain_24602 other) {
            if (other == AncientSwordMsg.S2C_AncientSwordMain_24602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGas()) {
                  this.setGas(other.getGas());
               }

               if (other.hasHasUnlock()) {
                  this.setHasUnlock(other.getHasUnlock());
               }

               if (this.dayMBuilder_ == null) {
                  if (!other.dayM_.isEmpty()) {
                     if (this.dayM_.isEmpty()) {
                        this.dayM_ = other.dayM_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureDayMIsMutable();
                        this.dayM_.addAll(other.dayM_);
                     }

                     this.onChanged();
                  }
               } else if (!other.dayM_.isEmpty()) {
                  if (this.dayMBuilder_.isEmpty()) {
                     this.dayMBuilder_.dispose();
                     this.dayMBuilder_ = null;
                     this.dayM_ = other.dayM_;
                     this.bitField0_ &= -5;
                     this.dayMBuilder_ = AncientSwordMsg.S2C_AncientSwordMain_24602.alwaysUseFieldBuilders ? this.getDayMFieldBuilder() : null;
                  } else {
                     this.dayMBuilder_.addAllMessages(other.dayM_);
                  }
               }

               if (this.weekMBuilder_ == null) {
                  if (!other.weekM_.isEmpty()) {
                     if (this.weekM_.isEmpty()) {
                        this.weekM_ = other.weekM_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureWeekMIsMutable();
                        this.weekM_.addAll(other.weekM_);
                     }

                     this.onChanged();
                  }
               } else if (!other.weekM_.isEmpty()) {
                  if (this.weekMBuilder_.isEmpty()) {
                     this.weekMBuilder_.dispose();
                     this.weekMBuilder_ = null;
                     this.weekM_ = other.weekM_;
                     this.bitField0_ &= -9;
                     this.weekMBuilder_ = AncientSwordMsg.S2C_AncientSwordMain_24602.alwaysUseFieldBuilders ? this.getWeekMFieldBuilder() : null;
                  } else {
                     this.weekMBuilder_.addAllMessages(other.weekM_);
                  }
               }

               if (other.hasShopCountdown()) {
                  this.setShopCountdown(other.getShopCountdown());
               }

               if (!other.buffId_.isEmpty()) {
                  if (this.buffId_.isEmpty()) {
                     this.buffId_ = other.buffId_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureBuffIdIsMutable();
                     this.buffId_.addAll(other.buffId_);
                  }

                  this.onChanged();
               }

               if (other.hasActiveValue()) {
                  this.setActiveValue(other.getActiveValue());
               }

               if (!other.activeReward_.isEmpty()) {
                  if (this.activeReward_.isEmpty()) {
                     this.activeReward_ = other.activeReward_;
                     this.bitField0_ &= -129;
                  } else {
                     this.ensureActiveRewardIsMutable();
                     this.activeReward_.addAll(other.activeReward_);
                  }

                  this.onChanged();
               }

               if (other.hasFlushTime()) {
                  this.setFlushTime(other.getFlushTime());
               }

               if (this.bountyTaskBuilder_ == null) {
                  if (!other.bountyTask_.isEmpty()) {
                     if (this.bountyTask_.isEmpty()) {
                        this.bountyTask_ = other.bountyTask_;
                        this.bitField0_ &= -513;
                     } else {
                        this.ensureBountyTaskIsMutable();
                        this.bountyTask_.addAll(other.bountyTask_);
                     }

                     this.onChanged();
                  }
               } else if (!other.bountyTask_.isEmpty()) {
                  if (this.bountyTaskBuilder_.isEmpty()) {
                     this.bountyTaskBuilder_.dispose();
                     this.bountyTaskBuilder_ = null;
                     this.bountyTask_ = other.bountyTask_;
                     this.bitField0_ &= -513;
                     this.bountyTaskBuilder_ = AncientSwordMsg.S2C_AncientSwordMain_24602.alwaysUseFieldBuilders ? this.getBountyTaskFieldBuilder() : null;
                  } else {
                     this.bountyTaskBuilder_.addAllMessages(other.bountyTask_);
                  }
               }

               if (other.hasTaskEnd()) {
                  this.setTaskEnd(other.getTaskEnd());
               }

               if (other.hasActiveEnd()) {
                  this.setActiveEnd(other.getActiveEnd());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGas()) {
               return false;
            } else if (!this.hasHasUnlock()) {
               return false;
            } else if (!this.hasShopCountdown()) {
               return false;
            } else if (!this.hasActiveValue()) {
               return false;
            } else if (!this.hasFlushTime()) {
               return false;
            } else if (!this.hasTaskEnd()) {
               return false;
            } else if (!this.hasActiveEnd()) {
               return false;
            } else {
               for(int i = 0; i < this.getBountyTaskCount(); ++i) {
                  if (!this.getBountyTask(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AncientSwordMain_24602 parsedMessage = null;

            try {
               parsedMessage = (S2C_AncientSwordMain_24602)AncientSwordMsg.S2C_AncientSwordMain_24602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AncientSwordMain_24602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGas() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGas() {
            return this.gas_;
         }

         public Builder setGas(int value) {
            this.bitField0_ |= 1;
            this.gas_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGas() {
            this.bitField0_ &= -2;
            this.gas_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHasUnlock() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getHasUnlock() {
            return this.hasUnlock_;
         }

         public Builder setHasUnlock(boolean value) {
            this.bitField0_ |= 2;
            this.hasUnlock_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHasUnlock() {
            this.bitField0_ &= -3;
            this.hasUnlock_ = false;
            this.onChanged();
            return this;
         }

         private void ensureDayMIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.dayM_ = new ArrayList(this.dayM_);
               this.bitField0_ |= 4;
            }

         }

         public List<AncientMonster> getDayMList() {
            return this.dayMBuilder_ == null ? Collections.unmodifiableList(this.dayM_) : this.dayMBuilder_.getMessageList();
         }

         public int getDayMCount() {
            return this.dayMBuilder_ == null ? this.dayM_.size() : this.dayMBuilder_.getCount();
         }

         public AncientMonster getDayM(int index) {
            return this.dayMBuilder_ == null ? (AncientMonster)this.dayM_.get(index) : (AncientMonster)this.dayMBuilder_.getMessage(index);
         }

         public Builder setDayM(int index, AncientMonster value) {
            if (this.dayMBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDayMIsMutable();
               this.dayM_.set(index, value);
               this.onChanged();
            } else {
               this.dayMBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDayM(int index, AncientMonster.Builder builderForValue) {
            if (this.dayMBuilder_ == null) {
               this.ensureDayMIsMutable();
               this.dayM_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dayMBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDayM(AncientMonster value) {
            if (this.dayMBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDayMIsMutable();
               this.dayM_.add(value);
               this.onChanged();
            } else {
               this.dayMBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDayM(int index, AncientMonster value) {
            if (this.dayMBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDayMIsMutable();
               this.dayM_.add(index, value);
               this.onChanged();
            } else {
               this.dayMBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDayM(AncientMonster.Builder builderForValue) {
            if (this.dayMBuilder_ == null) {
               this.ensureDayMIsMutable();
               this.dayM_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dayMBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDayM(int index, AncientMonster.Builder builderForValue) {
            if (this.dayMBuilder_ == null) {
               this.ensureDayMIsMutable();
               this.dayM_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dayMBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDayM(Iterable<? extends AncientMonster> values) {
            if (this.dayMBuilder_ == null) {
               this.ensureDayMIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.dayM_);
               this.onChanged();
            } else {
               this.dayMBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDayM() {
            if (this.dayMBuilder_ == null) {
               this.dayM_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.dayMBuilder_.clear();
            }

            return this;
         }

         public Builder removeDayM(int index) {
            if (this.dayMBuilder_ == null) {
               this.ensureDayMIsMutable();
               this.dayM_.remove(index);
               this.onChanged();
            } else {
               this.dayMBuilder_.remove(index);
            }

            return this;
         }

         public AncientMonster.Builder getDayMBuilder(int index) {
            return (AncientMonster.Builder)this.getDayMFieldBuilder().getBuilder(index);
         }

         public AncientMonsterOrBuilder getDayMOrBuilder(int index) {
            return this.dayMBuilder_ == null ? (AncientMonsterOrBuilder)this.dayM_.get(index) : (AncientMonsterOrBuilder)this.dayMBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AncientMonsterOrBuilder> getDayMOrBuilderList() {
            return this.dayMBuilder_ != null ? this.dayMBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.dayM_);
         }

         public AncientMonster.Builder addDayMBuilder() {
            return (AncientMonster.Builder)this.getDayMFieldBuilder().addBuilder(AncientSwordMsg.AncientMonster.getDefaultInstance());
         }

         public AncientMonster.Builder addDayMBuilder(int index) {
            return (AncientMonster.Builder)this.getDayMFieldBuilder().addBuilder(index, AncientSwordMsg.AncientMonster.getDefaultInstance());
         }

         public List<AncientMonster.Builder> getDayMBuilderList() {
            return this.getDayMFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AncientMonster, AncientMonster.Builder, AncientMonsterOrBuilder> getDayMFieldBuilder() {
            if (this.dayMBuilder_ == null) {
               this.dayMBuilder_ = new RepeatedFieldBuilderV3(this.dayM_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.dayM_ = null;
            }

            return this.dayMBuilder_;
         }

         private void ensureWeekMIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.weekM_ = new ArrayList(this.weekM_);
               this.bitField0_ |= 8;
            }

         }

         public List<AncientMonster> getWeekMList() {
            return this.weekMBuilder_ == null ? Collections.unmodifiableList(this.weekM_) : this.weekMBuilder_.getMessageList();
         }

         public int getWeekMCount() {
            return this.weekMBuilder_ == null ? this.weekM_.size() : this.weekMBuilder_.getCount();
         }

         public AncientMonster getWeekM(int index) {
            return this.weekMBuilder_ == null ? (AncientMonster)this.weekM_.get(index) : (AncientMonster)this.weekMBuilder_.getMessage(index);
         }

         public Builder setWeekM(int index, AncientMonster value) {
            if (this.weekMBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeekMIsMutable();
               this.weekM_.set(index, value);
               this.onChanged();
            } else {
               this.weekMBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWeekM(int index, AncientMonster.Builder builderForValue) {
            if (this.weekMBuilder_ == null) {
               this.ensureWeekMIsMutable();
               this.weekM_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weekMBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWeekM(AncientMonster value) {
            if (this.weekMBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeekMIsMutable();
               this.weekM_.add(value);
               this.onChanged();
            } else {
               this.weekMBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWeekM(int index, AncientMonster value) {
            if (this.weekMBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeekMIsMutable();
               this.weekM_.add(index, value);
               this.onChanged();
            } else {
               this.weekMBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWeekM(AncientMonster.Builder builderForValue) {
            if (this.weekMBuilder_ == null) {
               this.ensureWeekMIsMutable();
               this.weekM_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.weekMBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWeekM(int index, AncientMonster.Builder builderForValue) {
            if (this.weekMBuilder_ == null) {
               this.ensureWeekMIsMutable();
               this.weekM_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weekMBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWeekM(Iterable<? extends AncientMonster> values) {
            if (this.weekMBuilder_ == null) {
               this.ensureWeekMIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.weekM_);
               this.onChanged();
            } else {
               this.weekMBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWeekM() {
            if (this.weekMBuilder_ == null) {
               this.weekM_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.weekMBuilder_.clear();
            }

            return this;
         }

         public Builder removeWeekM(int index) {
            if (this.weekMBuilder_ == null) {
               this.ensureWeekMIsMutable();
               this.weekM_.remove(index);
               this.onChanged();
            } else {
               this.weekMBuilder_.remove(index);
            }

            return this;
         }

         public AncientMonster.Builder getWeekMBuilder(int index) {
            return (AncientMonster.Builder)this.getWeekMFieldBuilder().getBuilder(index);
         }

         public AncientMonsterOrBuilder getWeekMOrBuilder(int index) {
            return this.weekMBuilder_ == null ? (AncientMonsterOrBuilder)this.weekM_.get(index) : (AncientMonsterOrBuilder)this.weekMBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AncientMonsterOrBuilder> getWeekMOrBuilderList() {
            return this.weekMBuilder_ != null ? this.weekMBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.weekM_);
         }

         public AncientMonster.Builder addWeekMBuilder() {
            return (AncientMonster.Builder)this.getWeekMFieldBuilder().addBuilder(AncientSwordMsg.AncientMonster.getDefaultInstance());
         }

         public AncientMonster.Builder addWeekMBuilder(int index) {
            return (AncientMonster.Builder)this.getWeekMFieldBuilder().addBuilder(index, AncientSwordMsg.AncientMonster.getDefaultInstance());
         }

         public List<AncientMonster.Builder> getWeekMBuilderList() {
            return this.getWeekMFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AncientMonster, AncientMonster.Builder, AncientMonsterOrBuilder> getWeekMFieldBuilder() {
            if (this.weekMBuilder_ == null) {
               this.weekMBuilder_ = new RepeatedFieldBuilderV3(this.weekM_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.weekM_ = null;
            }

            return this.weekMBuilder_;
         }

         public boolean hasShopCountdown() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getShopCountdown() {
            return this.shopCountdown_;
         }

         public Builder setShopCountdown(int value) {
            this.bitField0_ |= 16;
            this.shopCountdown_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopCountdown() {
            this.bitField0_ &= -17;
            this.shopCountdown_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBuffIdIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.buffId_ = AncientSwordMsg.S2C_AncientSwordMain_24602.mutableCopy(this.buffId_);
               this.bitField0_ |= 32;
            }

         }

         public List<Integer> getBuffIdList() {
            return (List<Integer>)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.buffId_) : this.buffId_);
         }

         public int getBuffIdCount() {
            return this.buffId_.size();
         }

         public int getBuffId(int index) {
            return this.buffId_.getInt(index);
         }

         public Builder setBuffId(int index, int value) {
            this.ensureBuffIdIsMutable();
            this.buffId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuffId(int value) {
            this.ensureBuffIdIsMutable();
            this.buffId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuffId(Iterable<? extends Integer> values) {
            this.ensureBuffIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buffId_);
            this.onChanged();
            return this;
         }

         public Builder clearBuffId() {
            this.buffId_ = AncientSwordMsg.S2C_AncientSwordMain_24602.emptyIntList();
            this.bitField0_ &= -33;
            this.onChanged();
            return this;
         }

         public boolean hasActiveValue() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getActiveValue() {
            return this.activeValue_;
         }

         public Builder setActiveValue(int value) {
            this.bitField0_ |= 64;
            this.activeValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActiveValue() {
            this.bitField0_ &= -65;
            this.activeValue_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureActiveRewardIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.activeReward_ = AncientSwordMsg.S2C_AncientSwordMain_24602.mutableCopy(this.activeReward_);
               this.bitField0_ |= 128;
            }

         }

         public List<Integer> getActiveRewardList() {
            return (List<Integer>)((this.bitField0_ & 128) != 0 ? Collections.unmodifiableList(this.activeReward_) : this.activeReward_);
         }

         public int getActiveRewardCount() {
            return this.activeReward_.size();
         }

         public int getActiveReward(int index) {
            return this.activeReward_.getInt(index);
         }

         public Builder setActiveReward(int index, int value) {
            this.ensureActiveRewardIsMutable();
            this.activeReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addActiveReward(int value) {
            this.ensureActiveRewardIsMutable();
            this.activeReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllActiveReward(Iterable<? extends Integer> values) {
            this.ensureActiveRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.activeReward_);
            this.onChanged();
            return this;
         }

         public Builder clearActiveReward() {
            this.activeReward_ = AncientSwordMsg.S2C_AncientSwordMain_24602.emptyIntList();
            this.bitField0_ &= -129;
            this.onChanged();
            return this;
         }

         public boolean hasFlushTime() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getFlushTime() {
            return this.flushTime_;
         }

         public Builder setFlushTime(int value) {
            this.bitField0_ |= 256;
            this.flushTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlushTime() {
            this.bitField0_ &= -257;
            this.flushTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBountyTaskIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.bountyTask_ = new ArrayList(this.bountyTask_);
               this.bitField0_ |= 512;
            }

         }

         public List<ActivityMsg.TaskData> getBountyTaskList() {
            return this.bountyTaskBuilder_ == null ? Collections.unmodifiableList(this.bountyTask_) : this.bountyTaskBuilder_.getMessageList();
         }

         public int getBountyTaskCount() {
            return this.bountyTaskBuilder_ == null ? this.bountyTask_.size() : this.bountyTaskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getBountyTask(int index) {
            return this.bountyTaskBuilder_ == null ? (ActivityMsg.TaskData)this.bountyTask_.get(index) : (ActivityMsg.TaskData)this.bountyTaskBuilder_.getMessage(index);
         }

         public Builder setBountyTask(int index, ActivityMsg.TaskData value) {
            if (this.bountyTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBountyTaskIsMutable();
               this.bountyTask_.set(index, value);
               this.onChanged();
            } else {
               this.bountyTaskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBountyTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.bountyTaskBuilder_ == null) {
               this.ensureBountyTaskIsMutable();
               this.bountyTask_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.bountyTaskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBountyTask(ActivityMsg.TaskData value) {
            if (this.bountyTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBountyTaskIsMutable();
               this.bountyTask_.add(value);
               this.onChanged();
            } else {
               this.bountyTaskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBountyTask(int index, ActivityMsg.TaskData value) {
            if (this.bountyTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBountyTaskIsMutable();
               this.bountyTask_.add(index, value);
               this.onChanged();
            } else {
               this.bountyTaskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBountyTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.bountyTaskBuilder_ == null) {
               this.ensureBountyTaskIsMutable();
               this.bountyTask_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.bountyTaskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBountyTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.bountyTaskBuilder_ == null) {
               this.ensureBountyTaskIsMutable();
               this.bountyTask_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.bountyTaskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBountyTask(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.bountyTaskBuilder_ == null) {
               this.ensureBountyTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.bountyTask_);
               this.onChanged();
            } else {
               this.bountyTaskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBountyTask() {
            if (this.bountyTaskBuilder_ == null) {
               this.bountyTask_ = Collections.emptyList();
               this.bitField0_ &= -513;
               this.onChanged();
            } else {
               this.bountyTaskBuilder_.clear();
            }

            return this;
         }

         public Builder removeBountyTask(int index) {
            if (this.bountyTaskBuilder_ == null) {
               this.ensureBountyTaskIsMutable();
               this.bountyTask_.remove(index);
               this.onChanged();
            } else {
               this.bountyTaskBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getBountyTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getBountyTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getBountyTaskOrBuilder(int index) {
            return this.bountyTaskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.bountyTask_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.bountyTaskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getBountyTaskOrBuilderList() {
            return this.bountyTaskBuilder_ != null ? this.bountyTaskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.bountyTask_);
         }

         public ActivityMsg.TaskData.Builder addBountyTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getBountyTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addBountyTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getBountyTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getBountyTaskBuilderList() {
            return this.getBountyTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getBountyTaskFieldBuilder() {
            if (this.bountyTaskBuilder_ == null) {
               this.bountyTaskBuilder_ = new RepeatedFieldBuilderV3(this.bountyTask_, (this.bitField0_ & 512) != 0, this.getParentForChildren(), this.isClean());
               this.bountyTask_ = null;
            }

            return this.bountyTaskBuilder_;
         }

         public boolean hasTaskEnd() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getTaskEnd() {
            return this.taskEnd_;
         }

         public Builder setTaskEnd(int value) {
            this.bitField0_ |= 1024;
            this.taskEnd_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskEnd() {
            this.bitField0_ &= -1025;
            this.taskEnd_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActiveEnd() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getActiveEnd() {
            return this.activeEnd_;
         }

         public Builder setActiveEnd(int value) {
            this.bitField0_ |= 2048;
            this.activeEnd_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActiveEnd() {
            this.bitField0_ &= -2049;
            this.activeEnd_ = 0;
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

   public static final class AncientMonster extends GeneratedMessageV3 implements AncientMonsterOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int KEY_FIELD_NUMBER = 2;
      private int key_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      public static final int NAME_FIELD_NUMBER = 4;
      private volatile Object name_;
      public static final int ANCIENTHERO_FIELD_NUMBER = 5;
      private List<AncientHero> ancientHero_;
      public static final int POWER_FIELD_NUMBER = 6;
      private long power_;
      public static final int ARRAY_FIELD_NUMBER = 7;
      private ByteString array_;
      public static final int INDEX_FIELD_NUMBER = 8;
      private int index_;
      public static final int HEROID_FIELD_NUMBER = 9;
      private int heroId_;
      private byte memoizedIsInitialized;
      private static final AncientMonster DEFAULT_INSTANCE = new AncientMonster();
      /** @deprecated */
      @Deprecated
      public static final Parser<AncientMonster> PARSER = new AbstractParser<AncientMonster>() {
         public AncientMonster parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new AncientMonster(input, extensionRegistry);
         }
      };

      private AncientMonster(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private AncientMonster() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
         this.ancientHero_ = Collections.emptyList();
         this.array_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new AncientMonster();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private AncientMonster(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.key_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lv_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.name_ = bs;
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.ancientHero_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.ancientHero_.add(input.readMessage(AncientSwordMsg.AncientHero.PARSER, extensionRegistry));
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.power_ = input.readInt64();
                        break;
                     case 58:
                        this.bitField0_ |= 32;
                        this.array_ = input.readBytes();
                        break;
                     case 64:
                        this.bitField0_ |= 64;
                        this.index_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 128;
                        this.heroId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.ancientHero_ = Collections.unmodifiableList(this.ancientHero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_AncientMonster_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_AncientMonster_fieldAccessorTable.ensureFieldAccessorsInitialized(AncientMonster.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasKey() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getKey() {
         return this.key_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 8) != 0;
      }

      public String getName() {
         Object ref = this.name_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.name_ = s;
            }

            return s;
         }
      }

      public ByteString getNameBytes() {
         Object ref = this.name_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.name_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public List<AncientHero> getAncientHeroList() {
         return this.ancientHero_;
      }

      public List<? extends AncientHeroOrBuilder> getAncientHeroOrBuilderList() {
         return this.ancientHero_;
      }

      public int getAncientHeroCount() {
         return this.ancientHero_.size();
      }

      public AncientHero getAncientHero(int index) {
         return (AncientHero)this.ancientHero_.get(index);
      }

      public AncientHeroOrBuilder getAncientHeroOrBuilder(int index) {
         return (AncientHeroOrBuilder)this.ancientHero_.get(index);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasArray() {
         return (this.bitField0_ & 32) != 0;
      }

      public ByteString getArray() {
         return this.array_;
      }

      public boolean hasIndex() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getIndex() {
         return this.index_;
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.key_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.name_);
         }

         for(int i = 0; i < this.ancientHero_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.ancientHero_.get(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(6, this.power_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBytes(7, this.array_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(8, this.index_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(9, this.heroId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.key_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.name_);
            }

            for(int i = 0; i < this.ancientHero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.ancientHero_.get(i));
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.power_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBytesSize(7, this.array_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.index_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.heroId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof AncientMonster)) {
            return super.equals(obj);
         } else {
            AncientMonster other = (AncientMonster)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasKey() != other.hasKey()) {
               return false;
            } else if (this.hasKey() && this.getKey() != other.getKey()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (!this.getAncientHeroList().equals(other.getAncientHeroList())) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasArray() != other.hasArray()) {
               return false;
            } else if (this.hasArray() && !this.getArray().equals(other.getArray())) {
               return false;
            } else if (this.hasIndex() != other.hasIndex()) {
               return false;
            } else if (this.hasIndex() && this.getIndex() != other.getIndex()) {
               return false;
            } else if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
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

            if (this.hasKey()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getKey();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.getAncientHeroCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getAncientHeroList().hashCode();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasArray()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getArray().hashCode();
            }

            if (this.hasIndex()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getIndex();
            }

            if (this.hasHeroId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getHeroId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static AncientMonster parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (AncientMonster)PARSER.parseFrom(data);
      }

      public static AncientMonster parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AncientMonster)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AncientMonster parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (AncientMonster)PARSER.parseFrom(data);
      }

      public static AncientMonster parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AncientMonster)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AncientMonster parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (AncientMonster)PARSER.parseFrom(data);
      }

      public static AncientMonster parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AncientMonster)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AncientMonster parseFrom(InputStream input) throws IOException {
         return (AncientMonster)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AncientMonster parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AncientMonster)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static AncientMonster parseDelimitedFrom(InputStream input) throws IOException {
         return (AncientMonster)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static AncientMonster parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AncientMonster)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static AncientMonster parseFrom(CodedInputStream input) throws IOException {
         return (AncientMonster)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AncientMonster parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AncientMonster)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(AncientMonster prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static AncientMonster getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<AncientMonster> parser() {
         return PARSER;
      }

      public Parser<AncientMonster> getParserForType() {
         return PARSER;
      }

      public AncientMonster getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AncientMonsterOrBuilder {
         private int bitField0_;
         private int id_;
         private int key_;
         private int lv_;
         private Object name_;
         private List<AncientHero> ancientHero_;
         private RepeatedFieldBuilderV3<AncientHero, AncientHero.Builder, AncientHeroOrBuilder> ancientHeroBuilder_;
         private long power_;
         private ByteString array_;
         private int index_;
         private int heroId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_AncientMonster_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_AncientMonster_fieldAccessorTable.ensureFieldAccessorsInitialized(AncientMonster.class, Builder.class);
         }

         private Builder() {
            this.name_ = "";
            this.ancientHero_ = Collections.emptyList();
            this.array_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.name_ = "";
            this.ancientHero_ = Collections.emptyList();
            this.array_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.AncientMonster.alwaysUseFieldBuilders) {
               this.getAncientHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.key_ = 0;
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            this.name_ = "";
            this.bitField0_ &= -9;
            if (this.ancientHeroBuilder_ == null) {
               this.ancientHero_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.ancientHeroBuilder_.clear();
            }

            this.power_ = 0L;
            this.bitField0_ &= -33;
            this.array_ = ByteString.EMPTY;
            this.bitField0_ &= -65;
            this.index_ = 0;
            this.bitField0_ &= -129;
            this.heroId_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_AncientMonster_descriptor;
         }

         public AncientMonster getDefaultInstanceForType() {
            return AncientSwordMsg.AncientMonster.getDefaultInstance();
         }

         public AncientMonster build() {
            AncientMonster result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public AncientMonster buildPartial() {
            AncientMonster result = new AncientMonster(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.key_ = this.key_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.name_ = this.name_;
            if (this.ancientHeroBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.ancientHero_ = Collections.unmodifiableList(this.ancientHero_);
                  this.bitField0_ &= -17;
               }

               result.ancientHero_ = this.ancientHero_;
            } else {
               result.ancientHero_ = this.ancientHeroBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               to_bitField0_ |= 32;
            }

            result.array_ = this.array_;
            if ((from_bitField0_ & 128) != 0) {
               result.index_ = this.index_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 128;
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
            if (other instanceof AncientMonster) {
               return this.mergeFrom((AncientMonster)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(AncientMonster other) {
            if (other == AncientSwordMsg.AncientMonster.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasKey()) {
                  this.setKey(other.getKey());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 8;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (this.ancientHeroBuilder_ == null) {
                  if (!other.ancientHero_.isEmpty()) {
                     if (this.ancientHero_.isEmpty()) {
                        this.ancientHero_ = other.ancientHero_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureAncientHeroIsMutable();
                        this.ancientHero_.addAll(other.ancientHero_);
                     }

                     this.onChanged();
                  }
               } else if (!other.ancientHero_.isEmpty()) {
                  if (this.ancientHeroBuilder_.isEmpty()) {
                     this.ancientHeroBuilder_.dispose();
                     this.ancientHeroBuilder_ = null;
                     this.ancientHero_ = other.ancientHero_;
                     this.bitField0_ &= -17;
                     this.ancientHeroBuilder_ = AncientSwordMsg.AncientMonster.alwaysUseFieldBuilders ? this.getAncientHeroFieldBuilder() : null;
                  } else {
                     this.ancientHeroBuilder_.addAllMessages(other.ancientHero_);
                  }
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasArray()) {
                  this.setArray(other.getArray());
               }

               if (other.hasIndex()) {
                  this.setIndex(other.getIndex());
               }

               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
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
            AncientMonster parsedMessage = null;

            try {
               parsedMessage = (AncientMonster)AncientSwordMsg.AncientMonster.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (AncientMonster)e.getUnfinishedMessage();
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

         public boolean hasKey() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getKey() {
            return this.key_;
         }

         public Builder setKey(int value) {
            this.bitField0_ |= 2;
            this.key_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearKey() {
            this.bitField0_ &= -3;
            this.key_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 4;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -5;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasName() {
            return (this.bitField0_ & 8) != 0;
         }

         public String getName() {
            Object ref = this.name_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.name_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.name_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -9;
            this.name_ = AncientSwordMsg.AncientMonster.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         private void ensureAncientHeroIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.ancientHero_ = new ArrayList(this.ancientHero_);
               this.bitField0_ |= 16;
            }

         }

         public List<AncientHero> getAncientHeroList() {
            return this.ancientHeroBuilder_ == null ? Collections.unmodifiableList(this.ancientHero_) : this.ancientHeroBuilder_.getMessageList();
         }

         public int getAncientHeroCount() {
            return this.ancientHeroBuilder_ == null ? this.ancientHero_.size() : this.ancientHeroBuilder_.getCount();
         }

         public AncientHero getAncientHero(int index) {
            return this.ancientHeroBuilder_ == null ? (AncientHero)this.ancientHero_.get(index) : (AncientHero)this.ancientHeroBuilder_.getMessage(index);
         }

         public Builder setAncientHero(int index, AncientHero value) {
            if (this.ancientHeroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAncientHeroIsMutable();
               this.ancientHero_.set(index, value);
               this.onChanged();
            } else {
               this.ancientHeroBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAncientHero(int index, AncientHero.Builder builderForValue) {
            if (this.ancientHeroBuilder_ == null) {
               this.ensureAncientHeroIsMutable();
               this.ancientHero_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ancientHeroBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAncientHero(AncientHero value) {
            if (this.ancientHeroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAncientHeroIsMutable();
               this.ancientHero_.add(value);
               this.onChanged();
            } else {
               this.ancientHeroBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAncientHero(int index, AncientHero value) {
            if (this.ancientHeroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAncientHeroIsMutable();
               this.ancientHero_.add(index, value);
               this.onChanged();
            } else {
               this.ancientHeroBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAncientHero(AncientHero.Builder builderForValue) {
            if (this.ancientHeroBuilder_ == null) {
               this.ensureAncientHeroIsMutable();
               this.ancientHero_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ancientHeroBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAncientHero(int index, AncientHero.Builder builderForValue) {
            if (this.ancientHeroBuilder_ == null) {
               this.ensureAncientHeroIsMutable();
               this.ancientHero_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ancientHeroBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAncientHero(Iterable<? extends AncientHero> values) {
            if (this.ancientHeroBuilder_ == null) {
               this.ensureAncientHeroIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ancientHero_);
               this.onChanged();
            } else {
               this.ancientHeroBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAncientHero() {
            if (this.ancientHeroBuilder_ == null) {
               this.ancientHero_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.ancientHeroBuilder_.clear();
            }

            return this;
         }

         public Builder removeAncientHero(int index) {
            if (this.ancientHeroBuilder_ == null) {
               this.ensureAncientHeroIsMutable();
               this.ancientHero_.remove(index);
               this.onChanged();
            } else {
               this.ancientHeroBuilder_.remove(index);
            }

            return this;
         }

         public AncientHero.Builder getAncientHeroBuilder(int index) {
            return (AncientHero.Builder)this.getAncientHeroFieldBuilder().getBuilder(index);
         }

         public AncientHeroOrBuilder getAncientHeroOrBuilder(int index) {
            return this.ancientHeroBuilder_ == null ? (AncientHeroOrBuilder)this.ancientHero_.get(index) : (AncientHeroOrBuilder)this.ancientHeroBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AncientHeroOrBuilder> getAncientHeroOrBuilderList() {
            return this.ancientHeroBuilder_ != null ? this.ancientHeroBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ancientHero_);
         }

         public AncientHero.Builder addAncientHeroBuilder() {
            return (AncientHero.Builder)this.getAncientHeroFieldBuilder().addBuilder(AncientSwordMsg.AncientHero.getDefaultInstance());
         }

         public AncientHero.Builder addAncientHeroBuilder(int index) {
            return (AncientHero.Builder)this.getAncientHeroFieldBuilder().addBuilder(index, AncientSwordMsg.AncientHero.getDefaultInstance());
         }

         public List<AncientHero.Builder> getAncientHeroBuilderList() {
            return this.getAncientHeroFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AncientHero, AncientHero.Builder, AncientHeroOrBuilder> getAncientHeroFieldBuilder() {
            if (this.ancientHeroBuilder_ == null) {
               this.ancientHeroBuilder_ = new RepeatedFieldBuilderV3(this.ancientHero_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.ancientHero_ = null;
            }

            return this.ancientHeroBuilder_;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 32;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -33;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasArray() {
            return (this.bitField0_ & 64) != 0;
         }

         public ByteString getArray() {
            return this.array_;
         }

         public Builder setArray(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.array_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArray() {
            this.bitField0_ &= -65;
            this.array_ = AncientSwordMsg.AncientMonster.getDefaultInstance().getArray();
            this.onChanged();
            return this;
         }

         public boolean hasIndex() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getIndex() {
            return this.index_;
         }

         public Builder setIndex(int value) {
            this.bitField0_ |= 128;
            this.index_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.bitField0_ &= -129;
            this.index_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 256;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -257;
            this.heroId_ = 0;
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

   public static final class AncientHero extends GeneratedMessageV3 implements AncientHeroOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      public static final int STAR_FIELD_NUMBER = 3;
      private int star_;
      public static final int POS_FIELD_NUMBER = 4;
      private int pos_;
      public static final int DRESSID_FIELD_NUMBER = 5;
      private int dressId_;
      private byte memoizedIsInitialized;
      private static final AncientHero DEFAULT_INSTANCE = new AncientHero();
      /** @deprecated */
      @Deprecated
      public static final Parser<AncientHero> PARSER = new AbstractParser<AncientHero>() {
         public AncientHero parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new AncientHero(input, extensionRegistry);
         }
      };

      private AncientHero(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private AncientHero() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new AncientHero();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private AncientHero(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.star_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.pos_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.dressId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_AncientHero_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_AncientHero_fieldAccessorTable.ensureFieldAccessorsInitialized(AncientHero.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStar() {
         return this.star_;
      }

      public boolean hasPos() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public boolean hasDressId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getDressId() {
         return this.dressId_;
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
            output.writeInt32(1, this.heroId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.level_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.star_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.pos_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.dressId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.star_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.pos_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof AncientHero)) {
            return super.equals(obj);
         } else {
            AncientHero other = (AncientHero)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
               return false;
            } else if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
               return false;
            } else if (this.hasDressId() != other.hasDressId()) {
               return false;
            } else if (this.hasDressId() && this.getDressId() != other.getDressId()) {
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
            if (this.hasHeroId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroId();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasStar()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStar();
            }

            if (this.hasPos()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPos();
            }

            if (this.hasDressId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static AncientHero parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (AncientHero)PARSER.parseFrom(data);
      }

      public static AncientHero parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AncientHero)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AncientHero parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (AncientHero)PARSER.parseFrom(data);
      }

      public static AncientHero parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AncientHero)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AncientHero parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (AncientHero)PARSER.parseFrom(data);
      }

      public static AncientHero parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AncientHero)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AncientHero parseFrom(InputStream input) throws IOException {
         return (AncientHero)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AncientHero parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AncientHero)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static AncientHero parseDelimitedFrom(InputStream input) throws IOException {
         return (AncientHero)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static AncientHero parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AncientHero)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static AncientHero parseFrom(CodedInputStream input) throws IOException {
         return (AncientHero)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AncientHero parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AncientHero)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(AncientHero prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static AncientHero getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<AncientHero> parser() {
         return PARSER;
      }

      public Parser<AncientHero> getParserForType() {
         return PARSER;
      }

      public AncientHero getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AncientHeroOrBuilder {
         private int bitField0_;
         private int heroId_;
         private int level_;
         private int star_;
         private int pos_;
         private int dressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_AncientHero_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_AncientHero_fieldAccessorTable.ensureFieldAccessorsInitialized(AncientHero.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.AncientHero.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            this.star_ = 0;
            this.bitField0_ &= -5;
            this.pos_ = 0;
            this.bitField0_ &= -9;
            this.dressId_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_AncientHero_descriptor;
         }

         public AncientHero getDefaultInstanceForType() {
            return AncientSwordMsg.AncientHero.getDefaultInstance();
         }

         public AncientHero build() {
            AncientHero result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public AncientHero buildPartial() {
            AncientHero result = new AncientHero(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.star_ = this.star_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.pos_ = this.pos_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dressId_ = this.dressId_;
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
            if (other instanceof AncientHero) {
               return this.mergeFrom((AncientHero)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(AncientHero other) {
            if (other == AncientSwordMsg.AncientHero.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               if (other.hasDressId()) {
                  this.setDressId(other.getDressId());
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
            AncientHero parsedMessage = null;

            try {
               parsedMessage = (AncientHero)AncientSwordMsg.AncientHero.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (AncientHero)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 1;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -2;
            this.heroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 2;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStar() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStar() {
            return this.star_;
         }

         public Builder setStar(int value) {
            this.bitField0_ |= 4;
            this.star_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStar() {
            this.bitField0_ &= -5;
            this.star_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 8;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -9;
            this.pos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDressId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDressId() {
            return this.dressId_;
         }

         public Builder setDressId(int value) {
            this.bitField0_ |= 16;
            this.dressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDressId() {
            this.bitField0_ &= -17;
            this.dressId_ = 0;
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

   public static final class C2S_AncientSwordGetSword_24603 extends GeneratedMessageV3 implements C2S_AncientSwordGetSword_24603OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordGetSword_24603 DEFAULT_INSTANCE = new C2S_AncientSwordGetSword_24603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordGetSword_24603> PARSER = new AbstractParser<C2S_AncientSwordGetSword_24603>() {
         public C2S_AncientSwordGetSword_24603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordGetSword_24603(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordGetSword_24603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordGetSword_24603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordGetSword_24603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordGetSword_24603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetSword_24603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetSword_24603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordGetSword_24603.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AncientSwordGetSword_24603)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordGetSword_24603 other = (C2S_AncientSwordGetSword_24603)obj;
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

      public static C2S_AncientSwordGetSword_24603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetSword_24603)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordGetSword_24603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetSword_24603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordGetSword_24603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetSword_24603)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordGetSword_24603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetSword_24603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordGetSword_24603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetSword_24603)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordGetSword_24603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetSword_24603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordGetSword_24603 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordGetSword_24603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordGetSword_24603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordGetSword_24603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordGetSword_24603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordGetSword_24603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordGetSword_24603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordGetSword_24603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordGetSword_24603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordGetSword_24603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordGetSword_24603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordGetSword_24603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordGetSword_24603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordGetSword_24603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordGetSword_24603> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordGetSword_24603> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordGetSword_24603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordGetSword_24603OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetSword_24603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetSword_24603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordGetSword_24603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordGetSword_24603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetSword_24603_descriptor;
         }

         public C2S_AncientSwordGetSword_24603 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordGetSword_24603.getDefaultInstance();
         }

         public C2S_AncientSwordGetSword_24603 build() {
            C2S_AncientSwordGetSword_24603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordGetSword_24603 buildPartial() {
            C2S_AncientSwordGetSword_24603 result = new C2S_AncientSwordGetSword_24603(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_AncientSwordGetSword_24603) {
               return this.mergeFrom((C2S_AncientSwordGetSword_24603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordGetSword_24603 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordGetSword_24603.getDefaultInstance()) {
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
            C2S_AncientSwordGetSword_24603 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordGetSword_24603)AncientSwordMsg.C2S_AncientSwordGetSword_24603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordGetSword_24603)e.getUnfinishedMessage();
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

   public static final class S2C_AncientSwordGetSword_24604 extends GeneratedMessageV3 implements S2C_AncientSwordGetSword_24604OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SCHEDULE_FIELD_NUMBER = 1;
      private int schedule_;
      public static final int HASGET_FIELD_NUMBER = 2;
      private boolean hasGet_;
      private byte memoizedIsInitialized;
      private static final S2C_AncientSwordGetSword_24604 DEFAULT_INSTANCE = new S2C_AncientSwordGetSword_24604();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AncientSwordGetSword_24604> PARSER = new AbstractParser<S2C_AncientSwordGetSword_24604>() {
         public S2C_AncientSwordGetSword_24604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AncientSwordGetSword_24604(input, extensionRegistry);
         }
      };

      private S2C_AncientSwordGetSword_24604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AncientSwordGetSword_24604() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AncientSwordGetSword_24604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AncientSwordGetSword_24604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.schedule_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hasGet_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetSword_24604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetSword_24604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordGetSword_24604.class, Builder.class);
      }

      public boolean hasSchedule() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSchedule() {
         return this.schedule_;
      }

      public boolean hasHasGet() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getHasGet() {
         return this.hasGet_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSchedule()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHasGet()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.schedule_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.hasGet_);
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
               size += CodedOutputStream.computeInt32Size(1, this.schedule_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.hasGet_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AncientSwordGetSword_24604)) {
            return super.equals(obj);
         } else {
            S2C_AncientSwordGetSword_24604 other = (S2C_AncientSwordGetSword_24604)obj;
            if (this.hasSchedule() != other.hasSchedule()) {
               return false;
            } else if (this.hasSchedule() && this.getSchedule() != other.getSchedule()) {
               return false;
            } else if (this.hasHasGet() != other.hasHasGet()) {
               return false;
            } else if (this.hasHasGet() && this.getHasGet() != other.getHasGet()) {
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
            if (this.hasSchedule()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSchedule();
            }

            if (this.hasHasGet()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getHasGet());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AncientSwordGetSword_24604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetSword_24604)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordGetSword_24604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetSword_24604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordGetSword_24604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetSword_24604)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordGetSword_24604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetSword_24604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordGetSword_24604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetSword_24604)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordGetSword_24604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetSword_24604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordGetSword_24604 parseFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordGetSword_24604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordGetSword_24604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordGetSword_24604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordGetSword_24604 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordGetSword_24604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordGetSword_24604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordGetSword_24604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordGetSword_24604 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AncientSwordGetSword_24604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordGetSword_24604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordGetSword_24604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AncientSwordGetSword_24604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AncientSwordGetSword_24604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AncientSwordGetSword_24604> parser() {
         return PARSER;
      }

      public Parser<S2C_AncientSwordGetSword_24604> getParserForType() {
         return PARSER;
      }

      public S2C_AncientSwordGetSword_24604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AncientSwordGetSword_24604OrBuilder {
         private int bitField0_;
         private int schedule_;
         private boolean hasGet_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetSword_24604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetSword_24604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordGetSword_24604.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.S2C_AncientSwordGetSword_24604.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.schedule_ = 0;
            this.bitField0_ &= -2;
            this.hasGet_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetSword_24604_descriptor;
         }

         public S2C_AncientSwordGetSword_24604 getDefaultInstanceForType() {
            return AncientSwordMsg.S2C_AncientSwordGetSword_24604.getDefaultInstance();
         }

         public S2C_AncientSwordGetSword_24604 build() {
            S2C_AncientSwordGetSword_24604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AncientSwordGetSword_24604 buildPartial() {
            S2C_AncientSwordGetSword_24604 result = new S2C_AncientSwordGetSword_24604(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.schedule_ = this.schedule_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hasGet_ = this.hasGet_;
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
            if (other instanceof S2C_AncientSwordGetSword_24604) {
               return this.mergeFrom((S2C_AncientSwordGetSword_24604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AncientSwordGetSword_24604 other) {
            if (other == AncientSwordMsg.S2C_AncientSwordGetSword_24604.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSchedule()) {
                  this.setSchedule(other.getSchedule());
               }

               if (other.hasHasGet()) {
                  this.setHasGet(other.getHasGet());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSchedule()) {
               return false;
            } else {
               return this.hasHasGet();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AncientSwordGetSword_24604 parsedMessage = null;

            try {
               parsedMessage = (S2C_AncientSwordGetSword_24604)AncientSwordMsg.S2C_AncientSwordGetSword_24604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AncientSwordGetSword_24604)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSchedule() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSchedule() {
            return this.schedule_;
         }

         public Builder setSchedule(int value) {
            this.bitField0_ |= 1;
            this.schedule_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSchedule() {
            this.bitField0_ &= -2;
            this.schedule_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHasGet() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getHasGet() {
            return this.hasGet_;
         }

         public Builder setHasGet(boolean value) {
            this.bitField0_ |= 2;
            this.hasGet_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHasGet() {
            this.bitField0_ &= -3;
            this.hasGet_ = false;
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

   public static final class C2S_AncientSwordFlush_24605 extends GeneratedMessageV3 implements C2S_AncientSwordFlush_24605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int KEY_FIELD_NUMBER = 1;
      private int key_;
      public static final int DIRECTFLUSH_FIELD_NUMBER = 2;
      private boolean directFlush_;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordFlush_24605 DEFAULT_INSTANCE = new C2S_AncientSwordFlush_24605();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordFlush_24605> PARSER = new AbstractParser<C2S_AncientSwordFlush_24605>() {
         public C2S_AncientSwordFlush_24605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordFlush_24605(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordFlush_24605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordFlush_24605() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordFlush_24605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordFlush_24605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.key_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.directFlush_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordFlush_24605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordFlush_24605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordFlush_24605.class, Builder.class);
      }

      public boolean hasKey() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getKey() {
         return this.key_;
      }

      public boolean hasDirectFlush() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getDirectFlush() {
         return this.directFlush_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasKey()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.key_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.directFlush_);
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
               size += CodedOutputStream.computeInt32Size(1, this.key_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.directFlush_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AncientSwordFlush_24605)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordFlush_24605 other = (C2S_AncientSwordFlush_24605)obj;
            if (this.hasKey() != other.hasKey()) {
               return false;
            } else if (this.hasKey() && this.getKey() != other.getKey()) {
               return false;
            } else if (this.hasDirectFlush() != other.hasDirectFlush()) {
               return false;
            } else if (this.hasDirectFlush() && this.getDirectFlush() != other.getDirectFlush()) {
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
            if (this.hasKey()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getKey();
            }

            if (this.hasDirectFlush()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getDirectFlush());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AncientSwordFlush_24605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordFlush_24605)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordFlush_24605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordFlush_24605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordFlush_24605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordFlush_24605)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordFlush_24605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordFlush_24605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordFlush_24605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordFlush_24605)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordFlush_24605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordFlush_24605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordFlush_24605 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordFlush_24605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordFlush_24605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordFlush_24605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordFlush_24605 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordFlush_24605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordFlush_24605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordFlush_24605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordFlush_24605 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordFlush_24605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordFlush_24605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordFlush_24605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordFlush_24605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordFlush_24605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordFlush_24605> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordFlush_24605> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordFlush_24605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordFlush_24605OrBuilder {
         private int bitField0_;
         private int key_;
         private boolean directFlush_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordFlush_24605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordFlush_24605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordFlush_24605.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordFlush_24605.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.key_ = 0;
            this.bitField0_ &= -2;
            this.directFlush_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordFlush_24605_descriptor;
         }

         public C2S_AncientSwordFlush_24605 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordFlush_24605.getDefaultInstance();
         }

         public C2S_AncientSwordFlush_24605 build() {
            C2S_AncientSwordFlush_24605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordFlush_24605 buildPartial() {
            C2S_AncientSwordFlush_24605 result = new C2S_AncientSwordFlush_24605(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.key_ = this.key_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.directFlush_ = this.directFlush_;
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
            if (other instanceof C2S_AncientSwordFlush_24605) {
               return this.mergeFrom((C2S_AncientSwordFlush_24605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordFlush_24605 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordFlush_24605.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasKey()) {
                  this.setKey(other.getKey());
               }

               if (other.hasDirectFlush()) {
                  this.setDirectFlush(other.getDirectFlush());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasKey();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AncientSwordFlush_24605 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordFlush_24605)AncientSwordMsg.C2S_AncientSwordFlush_24605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordFlush_24605)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasKey() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getKey() {
            return this.key_;
         }

         public Builder setKey(int value) {
            this.bitField0_ |= 1;
            this.key_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearKey() {
            this.bitField0_ &= -2;
            this.key_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDirectFlush() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getDirectFlush() {
            return this.directFlush_;
         }

         public Builder setDirectFlush(boolean value) {
            this.bitField0_ |= 2;
            this.directFlush_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDirectFlush() {
            this.bitField0_ &= -3;
            this.directFlush_ = false;
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

   public static final class S2C_AncientSwordFlush_24606 extends GeneratedMessageV3 implements S2C_AncientSwordFlush_24606OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int M_FIELD_NUMBER = 1;
      private List<AncientMonster> m_;
      public static final int FLUSHTIME_FIELD_NUMBER = 2;
      private int flushTime_;
      public static final int SCHEDULE_FIELD_NUMBER = 3;
      private int schedule_;
      public static final int SHOPCOUNTDOWN_FIELD_NUMBER = 4;
      private int shopCountdown_;
      private byte memoizedIsInitialized;
      private static final S2C_AncientSwordFlush_24606 DEFAULT_INSTANCE = new S2C_AncientSwordFlush_24606();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AncientSwordFlush_24606> PARSER = new AbstractParser<S2C_AncientSwordFlush_24606>() {
         public S2C_AncientSwordFlush_24606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AncientSwordFlush_24606(input, extensionRegistry);
         }
      };

      private S2C_AncientSwordFlush_24606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AncientSwordFlush_24606() {
         this.memoizedIsInitialized = -1;
         this.m_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AncientSwordFlush_24606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AncientSwordFlush_24606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.m_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.m_.add(input.readMessage(AncientSwordMsg.AncientMonster.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.flushTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.schedule_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.shopCountdown_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.m_ = Collections.unmodifiableList(this.m_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordFlush_24606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordFlush_24606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordFlush_24606.class, Builder.class);
      }

      public List<AncientMonster> getMList() {
         return this.m_;
      }

      public List<? extends AncientMonsterOrBuilder> getMOrBuilderList() {
         return this.m_;
      }

      public int getMCount() {
         return this.m_.size();
      }

      public AncientMonster getM(int index) {
         return (AncientMonster)this.m_.get(index);
      }

      public AncientMonsterOrBuilder getMOrBuilder(int index) {
         return (AncientMonsterOrBuilder)this.m_.get(index);
      }

      public boolean hasFlushTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFlushTime() {
         return this.flushTime_;
      }

      public boolean hasSchedule() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSchedule() {
         return this.schedule_;
      }

      public boolean hasShopCountdown() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getShopCountdown() {
         return this.shopCountdown_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFlushTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSchedule()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShopCountdown()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.m_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.m_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.flushTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.schedule_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.shopCountdown_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.m_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.m_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.flushTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.schedule_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.shopCountdown_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AncientSwordFlush_24606)) {
            return super.equals(obj);
         } else {
            S2C_AncientSwordFlush_24606 other = (S2C_AncientSwordFlush_24606)obj;
            if (!this.getMList().equals(other.getMList())) {
               return false;
            } else if (this.hasFlushTime() != other.hasFlushTime()) {
               return false;
            } else if (this.hasFlushTime() && this.getFlushTime() != other.getFlushTime()) {
               return false;
            } else if (this.hasSchedule() != other.hasSchedule()) {
               return false;
            } else if (this.hasSchedule() && this.getSchedule() != other.getSchedule()) {
               return false;
            } else if (this.hasShopCountdown() != other.hasShopCountdown()) {
               return false;
            } else if (this.hasShopCountdown() && this.getShopCountdown() != other.getShopCountdown()) {
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
            if (this.getMCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMList().hashCode();
            }

            if (this.hasFlushTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFlushTime();
            }

            if (this.hasSchedule()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSchedule();
            }

            if (this.hasShopCountdown()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getShopCountdown();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AncientSwordFlush_24606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordFlush_24606)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordFlush_24606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordFlush_24606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordFlush_24606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordFlush_24606)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordFlush_24606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordFlush_24606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordFlush_24606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordFlush_24606)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordFlush_24606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordFlush_24606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordFlush_24606 parseFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordFlush_24606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordFlush_24606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordFlush_24606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordFlush_24606 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordFlush_24606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordFlush_24606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordFlush_24606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordFlush_24606 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AncientSwordFlush_24606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordFlush_24606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordFlush_24606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AncientSwordFlush_24606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AncientSwordFlush_24606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AncientSwordFlush_24606> parser() {
         return PARSER;
      }

      public Parser<S2C_AncientSwordFlush_24606> getParserForType() {
         return PARSER;
      }

      public S2C_AncientSwordFlush_24606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AncientSwordFlush_24606OrBuilder {
         private int bitField0_;
         private List<AncientMonster> m_;
         private RepeatedFieldBuilderV3<AncientMonster, AncientMonster.Builder, AncientMonsterOrBuilder> mBuilder_;
         private int flushTime_;
         private int schedule_;
         private int shopCountdown_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordFlush_24606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordFlush_24606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordFlush_24606.class, Builder.class);
         }

         private Builder() {
            this.m_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.m_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.S2C_AncientSwordFlush_24606.alwaysUseFieldBuilders) {
               this.getMFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.mBuilder_ == null) {
               this.m_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.mBuilder_.clear();
            }

            this.flushTime_ = 0;
            this.bitField0_ &= -3;
            this.schedule_ = 0;
            this.bitField0_ &= -5;
            this.shopCountdown_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordFlush_24606_descriptor;
         }

         public S2C_AncientSwordFlush_24606 getDefaultInstanceForType() {
            return AncientSwordMsg.S2C_AncientSwordFlush_24606.getDefaultInstance();
         }

         public S2C_AncientSwordFlush_24606 build() {
            S2C_AncientSwordFlush_24606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AncientSwordFlush_24606 buildPartial() {
            S2C_AncientSwordFlush_24606 result = new S2C_AncientSwordFlush_24606(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.mBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.m_ = Collections.unmodifiableList(this.m_);
                  this.bitField0_ &= -2;
               }

               result.m_ = this.m_;
            } else {
               result.m_ = this.mBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.flushTime_ = this.flushTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.schedule_ = this.schedule_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.shopCountdown_ = this.shopCountdown_;
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
            if (other instanceof S2C_AncientSwordFlush_24606) {
               return this.mergeFrom((S2C_AncientSwordFlush_24606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AncientSwordFlush_24606 other) {
            if (other == AncientSwordMsg.S2C_AncientSwordFlush_24606.getDefaultInstance()) {
               return this;
            } else {
               if (this.mBuilder_ == null) {
                  if (!other.m_.isEmpty()) {
                     if (this.m_.isEmpty()) {
                        this.m_ = other.m_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMIsMutable();
                        this.m_.addAll(other.m_);
                     }

                     this.onChanged();
                  }
               } else if (!other.m_.isEmpty()) {
                  if (this.mBuilder_.isEmpty()) {
                     this.mBuilder_.dispose();
                     this.mBuilder_ = null;
                     this.m_ = other.m_;
                     this.bitField0_ &= -2;
                     this.mBuilder_ = AncientSwordMsg.S2C_AncientSwordFlush_24606.alwaysUseFieldBuilders ? this.getMFieldBuilder() : null;
                  } else {
                     this.mBuilder_.addAllMessages(other.m_);
                  }
               }

               if (other.hasFlushTime()) {
                  this.setFlushTime(other.getFlushTime());
               }

               if (other.hasSchedule()) {
                  this.setSchedule(other.getSchedule());
               }

               if (other.hasShopCountdown()) {
                  this.setShopCountdown(other.getShopCountdown());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFlushTime()) {
               return false;
            } else if (!this.hasSchedule()) {
               return false;
            } else {
               return this.hasShopCountdown();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AncientSwordFlush_24606 parsedMessage = null;

            try {
               parsedMessage = (S2C_AncientSwordFlush_24606)AncientSwordMsg.S2C_AncientSwordFlush_24606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AncientSwordFlush_24606)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.m_ = new ArrayList(this.m_);
               this.bitField0_ |= 1;
            }

         }

         public List<AncientMonster> getMList() {
            return this.mBuilder_ == null ? Collections.unmodifiableList(this.m_) : this.mBuilder_.getMessageList();
         }

         public int getMCount() {
            return this.mBuilder_ == null ? this.m_.size() : this.mBuilder_.getCount();
         }

         public AncientMonster getM(int index) {
            return this.mBuilder_ == null ? (AncientMonster)this.m_.get(index) : (AncientMonster)this.mBuilder_.getMessage(index);
         }

         public Builder setM(int index, AncientMonster value) {
            if (this.mBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMIsMutable();
               this.m_.set(index, value);
               this.onChanged();
            } else {
               this.mBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setM(int index, AncientMonster.Builder builderForValue) {
            if (this.mBuilder_ == null) {
               this.ensureMIsMutable();
               this.m_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addM(AncientMonster value) {
            if (this.mBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMIsMutable();
               this.m_.add(value);
               this.onChanged();
            } else {
               this.mBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addM(int index, AncientMonster value) {
            if (this.mBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMIsMutable();
               this.m_.add(index, value);
               this.onChanged();
            } else {
               this.mBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addM(AncientMonster.Builder builderForValue) {
            if (this.mBuilder_ == null) {
               this.ensureMIsMutable();
               this.m_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.mBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addM(int index, AncientMonster.Builder builderForValue) {
            if (this.mBuilder_ == null) {
               this.ensureMIsMutable();
               this.m_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllM(Iterable<? extends AncientMonster> values) {
            if (this.mBuilder_ == null) {
               this.ensureMIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.m_);
               this.onChanged();
            } else {
               this.mBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearM() {
            if (this.mBuilder_ == null) {
               this.m_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.mBuilder_.clear();
            }

            return this;
         }

         public Builder removeM(int index) {
            if (this.mBuilder_ == null) {
               this.ensureMIsMutable();
               this.m_.remove(index);
               this.onChanged();
            } else {
               this.mBuilder_.remove(index);
            }

            return this;
         }

         public AncientMonster.Builder getMBuilder(int index) {
            return (AncientMonster.Builder)this.getMFieldBuilder().getBuilder(index);
         }

         public AncientMonsterOrBuilder getMOrBuilder(int index) {
            return this.mBuilder_ == null ? (AncientMonsterOrBuilder)this.m_.get(index) : (AncientMonsterOrBuilder)this.mBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AncientMonsterOrBuilder> getMOrBuilderList() {
            return this.mBuilder_ != null ? this.mBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.m_);
         }

         public AncientMonster.Builder addMBuilder() {
            return (AncientMonster.Builder)this.getMFieldBuilder().addBuilder(AncientSwordMsg.AncientMonster.getDefaultInstance());
         }

         public AncientMonster.Builder addMBuilder(int index) {
            return (AncientMonster.Builder)this.getMFieldBuilder().addBuilder(index, AncientSwordMsg.AncientMonster.getDefaultInstance());
         }

         public List<AncientMonster.Builder> getMBuilderList() {
            return this.getMFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AncientMonster, AncientMonster.Builder, AncientMonsterOrBuilder> getMFieldBuilder() {
            if (this.mBuilder_ == null) {
               this.mBuilder_ = new RepeatedFieldBuilderV3(this.m_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.m_ = null;
            }

            return this.mBuilder_;
         }

         public boolean hasFlushTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFlushTime() {
            return this.flushTime_;
         }

         public Builder setFlushTime(int value) {
            this.bitField0_ |= 2;
            this.flushTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlushTime() {
            this.bitField0_ &= -3;
            this.flushTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSchedule() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSchedule() {
            return this.schedule_;
         }

         public Builder setSchedule(int value) {
            this.bitField0_ |= 4;
            this.schedule_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSchedule() {
            this.bitField0_ &= -5;
            this.schedule_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShopCountdown() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getShopCountdown() {
            return this.shopCountdown_;
         }

         public Builder setShopCountdown(int value) {
            this.bitField0_ |= 8;
            this.shopCountdown_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopCountdown() {
            this.bitField0_ &= -9;
            this.shopCountdown_ = 0;
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

   public static final class C2S_AncientSwordCommitTask_24607 extends GeneratedMessageV3 implements C2S_AncientSwordCommitTask_24607OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordCommitTask_24607 DEFAULT_INSTANCE = new C2S_AncientSwordCommitTask_24607();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordCommitTask_24607> PARSER = new AbstractParser<C2S_AncientSwordCommitTask_24607>() {
         public C2S_AncientSwordCommitTask_24607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordCommitTask_24607(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordCommitTask_24607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordCommitTask_24607() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordCommitTask_24607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordCommitTask_24607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordCommitTask_24607.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AncientSwordCommitTask_24607)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordCommitTask_24607 other = (C2S_AncientSwordCommitTask_24607)obj;
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

      public static C2S_AncientSwordCommitTask_24607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24607)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordCommitTask_24607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordCommitTask_24607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24607)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordCommitTask_24607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordCommitTask_24607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24607)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordCommitTask_24607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordCommitTask_24607 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordCommitTask_24607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordCommitTask_24607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordCommitTask_24607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordCommitTask_24607 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordCommitTask_24607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordCommitTask_24607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordCommitTask_24607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordCommitTask_24607 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordCommitTask_24607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordCommitTask_24607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordCommitTask_24607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordCommitTask_24607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordCommitTask_24607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordCommitTask_24607> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordCommitTask_24607> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordCommitTask_24607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordCommitTask_24607OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordCommitTask_24607.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordCommitTask_24607.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24607_descriptor;
         }

         public C2S_AncientSwordCommitTask_24607 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordCommitTask_24607.getDefaultInstance();
         }

         public C2S_AncientSwordCommitTask_24607 build() {
            C2S_AncientSwordCommitTask_24607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordCommitTask_24607 buildPartial() {
            C2S_AncientSwordCommitTask_24607 result = new C2S_AncientSwordCommitTask_24607(this);
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
            if (other instanceof C2S_AncientSwordCommitTask_24607) {
               return this.mergeFrom((C2S_AncientSwordCommitTask_24607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordCommitTask_24607 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordCommitTask_24607.getDefaultInstance()) {
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
            C2S_AncientSwordCommitTask_24607 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordCommitTask_24607)AncientSwordMsg.C2S_AncientSwordCommitTask_24607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordCommitTask_24607)e.getUnfinishedMessage();
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

   public static final class S2C_AncientSwordCommitTask_24608 extends GeneratedMessageV3 implements S2C_AncientSwordCommitTask_24608OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      public static final int BUFFID_FIELD_NUMBER = 2;
      private Internal.IntList buffId_;
      public static final int ACTIVEVALUE_FIELD_NUMBER = 3;
      private int activeValue_;
      private byte memoizedIsInitialized;
      private static final S2C_AncientSwordCommitTask_24608 DEFAULT_INSTANCE = new S2C_AncientSwordCommitTask_24608();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AncientSwordCommitTask_24608> PARSER = new AbstractParser<S2C_AncientSwordCommitTask_24608>() {
         public S2C_AncientSwordCommitTask_24608 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AncientSwordCommitTask_24608(input, extensionRegistry);
         }
      };

      private S2C_AncientSwordCommitTask_24608(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AncientSwordCommitTask_24608() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
         this.buffId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AncientSwordCommitTask_24608();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AncientSwordCommitTask_24608(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.buffId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.buffId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buffId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 1;
                        this.activeValue_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.buffId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.buffId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24608_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordCommitTask_24608.class, Builder.class);
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

      public List<Integer> getBuffIdList() {
         return this.buffId_;
      }

      public int getBuffIdCount() {
         return this.buffId_.size();
      }

      public int getBuffId(int index) {
         return this.buffId_.getInt(index);
      }

      public boolean hasActiveValue() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActiveValue() {
         return this.activeValue_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActiveValue()) {
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
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         for(int i = 0; i < this.buffId_.size(); ++i) {
            output.writeInt32(2, this.buffId_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(3, this.activeValue_);
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

            int dataSize = 0;

            for(int i = 0; i < this.buffId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buffId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffIdList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.activeValue_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AncientSwordCommitTask_24608)) {
            return super.equals(obj);
         } else {
            S2C_AncientSwordCommitTask_24608 other = (S2C_AncientSwordCommitTask_24608)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
               return false;
            } else if (!this.getBuffIdList().equals(other.getBuffIdList())) {
               return false;
            } else if (this.hasActiveValue() != other.hasActiveValue()) {
               return false;
            } else if (this.hasActiveValue() && this.getActiveValue() != other.getActiveValue()) {
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

            if (this.getBuffIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuffIdList().hashCode();
            }

            if (this.hasActiveValue()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getActiveValue();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AncientSwordCommitTask_24608 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24608)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordCommitTask_24608 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordCommitTask_24608 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24608)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordCommitTask_24608 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordCommitTask_24608 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24608)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordCommitTask_24608 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordCommitTask_24608 parseFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordCommitTask_24608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordCommitTask_24608 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordCommitTask_24608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordCommitTask_24608 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordCommitTask_24608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordCommitTask_24608 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordCommitTask_24608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordCommitTask_24608 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AncientSwordCommitTask_24608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordCommitTask_24608 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordCommitTask_24608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AncientSwordCommitTask_24608 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AncientSwordCommitTask_24608 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AncientSwordCommitTask_24608> parser() {
         return PARSER;
      }

      public Parser<S2C_AncientSwordCommitTask_24608> getParserForType() {
         return PARSER;
      }

      public S2C_AncientSwordCommitTask_24608 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AncientSwordCommitTask_24608OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;
         private Internal.IntList buffId_;
         private int activeValue_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24608_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordCommitTask_24608.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.buffId_ = AncientSwordMsg.S2C_AncientSwordCommitTask_24608.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.buffId_ = AncientSwordMsg.S2C_AncientSwordCommitTask_24608.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.S2C_AncientSwordCommitTask_24608.alwaysUseFieldBuilders) {
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

            this.buffId_ = AncientSwordMsg.S2C_AncientSwordCommitTask_24608.emptyIntList();
            this.bitField0_ &= -3;
            this.activeValue_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24608_descriptor;
         }

         public S2C_AncientSwordCommitTask_24608 getDefaultInstanceForType() {
            return AncientSwordMsg.S2C_AncientSwordCommitTask_24608.getDefaultInstance();
         }

         public S2C_AncientSwordCommitTask_24608 build() {
            S2C_AncientSwordCommitTask_24608 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AncientSwordCommitTask_24608 buildPartial() {
            S2C_AncientSwordCommitTask_24608 result = new S2C_AncientSwordCommitTask_24608(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
            }

            if ((this.bitField0_ & 2) != 0) {
               this.buffId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.buffId_ = this.buffId_;
            if ((from_bitField0_ & 4) != 0) {
               result.activeValue_ = this.activeValue_;
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
            if (other instanceof S2C_AncientSwordCommitTask_24608) {
               return this.mergeFrom((S2C_AncientSwordCommitTask_24608)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AncientSwordCommitTask_24608 other) {
            if (other == AncientSwordMsg.S2C_AncientSwordCommitTask_24608.getDefaultInstance()) {
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
                     this.taskBuilder_ = AncientSwordMsg.S2C_AncientSwordCommitTask_24608.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               if (!other.buffId_.isEmpty()) {
                  if (this.buffId_.isEmpty()) {
                     this.buffId_ = other.buffId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureBuffIdIsMutable();
                     this.buffId_.addAll(other.buffId_);
                  }

                  this.onChanged();
               }

               if (other.hasActiveValue()) {
                  this.setActiveValue(other.getActiveValue());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActiveValue()) {
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
            S2C_AncientSwordCommitTask_24608 parsedMessage = null;

            try {
               parsedMessage = (S2C_AncientSwordCommitTask_24608)AncientSwordMsg.S2C_AncientSwordCommitTask_24608.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AncientSwordCommitTask_24608)e.getUnfinishedMessage();
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

         private void ensureBuffIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.buffId_ = AncientSwordMsg.S2C_AncientSwordCommitTask_24608.mutableCopy(this.buffId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getBuffIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.buffId_) : this.buffId_);
         }

         public int getBuffIdCount() {
            return this.buffId_.size();
         }

         public int getBuffId(int index) {
            return this.buffId_.getInt(index);
         }

         public Builder setBuffId(int index, int value) {
            this.ensureBuffIdIsMutable();
            this.buffId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuffId(int value) {
            this.ensureBuffIdIsMutable();
            this.buffId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuffId(Iterable<? extends Integer> values) {
            this.ensureBuffIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buffId_);
            this.onChanged();
            return this;
         }

         public Builder clearBuffId() {
            this.buffId_ = AncientSwordMsg.S2C_AncientSwordCommitTask_24608.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasActiveValue() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getActiveValue() {
            return this.activeValue_;
         }

         public Builder setActiveValue(int value) {
            this.bitField0_ |= 4;
            this.activeValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActiveValue() {
            this.bitField0_ &= -5;
            this.activeValue_ = 0;
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

   public static final class C2S_AncientSwordClear_24609 extends GeneratedMessageV3 implements C2S_AncientSwordClear_24609OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CLEAR_FIELD_NUMBER = 1;
      private boolean clear_;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordClear_24609 DEFAULT_INSTANCE = new C2S_AncientSwordClear_24609();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordClear_24609> PARSER = new AbstractParser<C2S_AncientSwordClear_24609>() {
         public C2S_AncientSwordClear_24609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordClear_24609(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordClear_24609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordClear_24609() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordClear_24609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordClear_24609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.clear_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClear_24609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClear_24609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordClear_24609.class, Builder.class);
      }

      public boolean hasClear() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getClear() {
         return this.clear_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasClear()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.clear_);
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
               size += CodedOutputStream.computeBoolSize(1, this.clear_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AncientSwordClear_24609)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordClear_24609 other = (C2S_AncientSwordClear_24609)obj;
            if (this.hasClear() != other.hasClear()) {
               return false;
            } else if (this.hasClear() && this.getClear() != other.getClear()) {
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
            if (this.hasClear()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getClear());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AncientSwordClear_24609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClear_24609)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordClear_24609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClear_24609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordClear_24609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClear_24609)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordClear_24609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClear_24609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordClear_24609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClear_24609)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordClear_24609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClear_24609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordClear_24609 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordClear_24609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordClear_24609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordClear_24609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordClear_24609 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordClear_24609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordClear_24609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordClear_24609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordClear_24609 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordClear_24609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordClear_24609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordClear_24609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordClear_24609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordClear_24609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordClear_24609> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordClear_24609> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordClear_24609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordClear_24609OrBuilder {
         private int bitField0_;
         private boolean clear_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClear_24609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClear_24609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordClear_24609.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordClear_24609.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.clear_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClear_24609_descriptor;
         }

         public C2S_AncientSwordClear_24609 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordClear_24609.getDefaultInstance();
         }

         public C2S_AncientSwordClear_24609 build() {
            C2S_AncientSwordClear_24609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordClear_24609 buildPartial() {
            C2S_AncientSwordClear_24609 result = new C2S_AncientSwordClear_24609(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.clear_ = this.clear_;
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
            if (other instanceof C2S_AncientSwordClear_24609) {
               return this.mergeFrom((C2S_AncientSwordClear_24609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordClear_24609 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordClear_24609.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasClear()) {
                  this.setClear(other.getClear());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasClear();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AncientSwordClear_24609 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordClear_24609)AncientSwordMsg.C2S_AncientSwordClear_24609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordClear_24609)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasClear() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getClear() {
            return this.clear_;
         }

         public Builder setClear(boolean value) {
            this.bitField0_ |= 1;
            this.clear_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearClear() {
            this.bitField0_ &= -2;
            this.clear_ = false;
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

   public static final class S2C_AncientSwordClear_24610 extends GeneratedMessageV3 implements S2C_AncientSwordClear_24610OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CLEAR_FIELD_NUMBER = 1;
      private boolean clear_;
      private byte memoizedIsInitialized;
      private static final S2C_AncientSwordClear_24610 DEFAULT_INSTANCE = new S2C_AncientSwordClear_24610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AncientSwordClear_24610> PARSER = new AbstractParser<S2C_AncientSwordClear_24610>() {
         public S2C_AncientSwordClear_24610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AncientSwordClear_24610(input, extensionRegistry);
         }
      };

      private S2C_AncientSwordClear_24610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AncientSwordClear_24610() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AncientSwordClear_24610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AncientSwordClear_24610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.clear_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordClear_24610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordClear_24610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordClear_24610.class, Builder.class);
      }

      public boolean hasClear() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getClear() {
         return this.clear_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasClear()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.clear_);
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
               size += CodedOutputStream.computeBoolSize(1, this.clear_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AncientSwordClear_24610)) {
            return super.equals(obj);
         } else {
            S2C_AncientSwordClear_24610 other = (S2C_AncientSwordClear_24610)obj;
            if (this.hasClear() != other.hasClear()) {
               return false;
            } else if (this.hasClear() && this.getClear() != other.getClear()) {
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
            if (this.hasClear()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getClear());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AncientSwordClear_24610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordClear_24610)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordClear_24610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordClear_24610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordClear_24610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordClear_24610)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordClear_24610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordClear_24610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordClear_24610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordClear_24610)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordClear_24610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordClear_24610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordClear_24610 parseFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordClear_24610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordClear_24610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordClear_24610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordClear_24610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordClear_24610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordClear_24610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordClear_24610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordClear_24610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AncientSwordClear_24610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordClear_24610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordClear_24610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AncientSwordClear_24610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AncientSwordClear_24610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AncientSwordClear_24610> parser() {
         return PARSER;
      }

      public Parser<S2C_AncientSwordClear_24610> getParserForType() {
         return PARSER;
      }

      public S2C_AncientSwordClear_24610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AncientSwordClear_24610OrBuilder {
         private int bitField0_;
         private boolean clear_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordClear_24610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordClear_24610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordClear_24610.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.S2C_AncientSwordClear_24610.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.clear_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordClear_24610_descriptor;
         }

         public S2C_AncientSwordClear_24610 getDefaultInstanceForType() {
            return AncientSwordMsg.S2C_AncientSwordClear_24610.getDefaultInstance();
         }

         public S2C_AncientSwordClear_24610 build() {
            S2C_AncientSwordClear_24610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AncientSwordClear_24610 buildPartial() {
            S2C_AncientSwordClear_24610 result = new S2C_AncientSwordClear_24610(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.clear_ = this.clear_;
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
            if (other instanceof S2C_AncientSwordClear_24610) {
               return this.mergeFrom((S2C_AncientSwordClear_24610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AncientSwordClear_24610 other) {
            if (other == AncientSwordMsg.S2C_AncientSwordClear_24610.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasClear()) {
                  this.setClear(other.getClear());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasClear();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AncientSwordClear_24610 parsedMessage = null;

            try {
               parsedMessage = (S2C_AncientSwordClear_24610)AncientSwordMsg.S2C_AncientSwordClear_24610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AncientSwordClear_24610)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasClear() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getClear() {
            return this.clear_;
         }

         public Builder setClear(boolean value) {
            this.bitField0_ |= 1;
            this.clear_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearClear() {
            this.bitField0_ &= -2;
            this.clear_ = false;
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

   public static final class C2S_AncientSwordTokenMain_24611 extends GeneratedMessageV3 implements C2S_AncientSwordTokenMain_24611OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordTokenMain_24611 DEFAULT_INSTANCE = new C2S_AncientSwordTokenMain_24611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordTokenMain_24611> PARSER = new AbstractParser<C2S_AncientSwordTokenMain_24611>() {
         public C2S_AncientSwordTokenMain_24611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordTokenMain_24611(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordTokenMain_24611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordTokenMain_24611() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordTokenMain_24611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordTokenMain_24611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenMain_24611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenMain_24611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordTokenMain_24611.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AncientSwordTokenMain_24611)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordTokenMain_24611 other = (C2S_AncientSwordTokenMain_24611)obj;
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

      public static C2S_AncientSwordTokenMain_24611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenMain_24611)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordTokenMain_24611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenMain_24611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordTokenMain_24611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenMain_24611)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordTokenMain_24611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenMain_24611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordTokenMain_24611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenMain_24611)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordTokenMain_24611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenMain_24611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordTokenMain_24611 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordTokenMain_24611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordTokenMain_24611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordTokenMain_24611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordTokenMain_24611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordTokenMain_24611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordTokenMain_24611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordTokenMain_24611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordTokenMain_24611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordTokenMain_24611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordTokenMain_24611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordTokenMain_24611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordTokenMain_24611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordTokenMain_24611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordTokenMain_24611> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordTokenMain_24611> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordTokenMain_24611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordTokenMain_24611OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenMain_24611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenMain_24611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordTokenMain_24611.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordTokenMain_24611.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenMain_24611_descriptor;
         }

         public C2S_AncientSwordTokenMain_24611 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordTokenMain_24611.getDefaultInstance();
         }

         public C2S_AncientSwordTokenMain_24611 build() {
            C2S_AncientSwordTokenMain_24611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordTokenMain_24611 buildPartial() {
            C2S_AncientSwordTokenMain_24611 result = new C2S_AncientSwordTokenMain_24611(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_AncientSwordTokenMain_24611) {
               return this.mergeFrom((C2S_AncientSwordTokenMain_24611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordTokenMain_24611 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordTokenMain_24611.getDefaultInstance()) {
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
            C2S_AncientSwordTokenMain_24611 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordTokenMain_24611)AncientSwordMsg.C2S_AncientSwordTokenMain_24611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordTokenMain_24611)e.getUnfinishedMessage();
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

   public static final class S2C_AncientSwordTokenMain_24612 extends GeneratedMessageV3 implements S2C_AncientSwordTokenMain_24612OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INTEGRAL_FIELD_NUMBER = 1;
      private int integral_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      public static final int VIP_FIELD_NUMBER = 3;
      private boolean vIP_;
      public static final int STARTTIME_FIELD_NUMBER = 4;
      private long startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 5;
      private long endTime_;
      public static final int BUYINTEGRAL_FIELD_NUMBER = 6;
      private int buyIntegral_;
      public static final int BUYLV_FIELD_NUMBER = 7;
      private int buyLv_;
      public static final int DAYTASK_FIELD_NUMBER = 8;
      private List<ActivityMsg.TaskData> dayTask_;
      public static final int DAYRESET_FIELD_NUMBER = 9;
      private long dayReset_;
      public static final int WEEKTASK_FIELD_NUMBER = 10;
      private List<ActivityMsg.TaskData> weekTask_;
      public static final int WEEKRESET_FIELD_NUMBER = 11;
      private long weekReset_;
      public static final int MONTHTASK_FIELD_NUMBER = 12;
      private List<ActivityMsg.TaskData> monthTask_;
      public static final int MONTHRESET_FIELD_NUMBER = 13;
      private long monthReset_;
      private byte memoizedIsInitialized;
      private static final S2C_AncientSwordTokenMain_24612 DEFAULT_INSTANCE = new S2C_AncientSwordTokenMain_24612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AncientSwordTokenMain_24612> PARSER = new AbstractParser<S2C_AncientSwordTokenMain_24612>() {
         public S2C_AncientSwordTokenMain_24612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AncientSwordTokenMain_24612(input, extensionRegistry);
         }
      };

      private S2C_AncientSwordTokenMain_24612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AncientSwordTokenMain_24612() {
         this.memoizedIsInitialized = -1;
         this.dayTask_ = Collections.emptyList();
         this.weekTask_ = Collections.emptyList();
         this.monthTask_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AncientSwordTokenMain_24612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AncientSwordTokenMain_24612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.integral_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.vIP_ = input.readBool();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.startTime_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.endTime_ = input.readInt64();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.buyIntegral_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.buyLv_ = input.readInt32();
                        break;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.dayTask_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.dayTask_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     case 72:
                        this.bitField0_ |= 128;
                        this.dayReset_ = input.readInt64();
                        break;
                     case 82:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.weekTask_ = new ArrayList();
                           mutable_bitField0_ |= 512;
                        }

                        this.weekTask_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     case 88:
                        this.bitField0_ |= 256;
                        this.weekReset_ = input.readInt64();
                        break;
                     case 98:
                        if ((mutable_bitField0_ & 2048) == 0) {
                           this.monthTask_ = new ArrayList();
                           mutable_bitField0_ |= 2048;
                        }

                        this.monthTask_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     case 104:
                        this.bitField0_ |= 512;
                        this.monthReset_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 128) != 0) {
                  this.dayTask_ = Collections.unmodifiableList(this.dayTask_);
               }

               if ((mutable_bitField0_ & 512) != 0) {
                  this.weekTask_ = Collections.unmodifiableList(this.weekTask_);
               }

               if ((mutable_bitField0_ & 2048) != 0) {
                  this.monthTask_ = Collections.unmodifiableList(this.monthTask_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordTokenMain_24612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordTokenMain_24612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordTokenMain_24612.class, Builder.class);
      }

      public boolean hasIntegral() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIntegral() {
         return this.integral_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasVIP() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getVIP() {
         return this.vIP_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getEndTime() {
         return this.endTime_;
      }

      public boolean hasBuyIntegral() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getBuyIntegral() {
         return this.buyIntegral_;
      }

      public boolean hasBuyLv() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getBuyLv() {
         return this.buyLv_;
      }

      public List<ActivityMsg.TaskData> getDayTaskList() {
         return this.dayTask_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getDayTaskOrBuilderList() {
         return this.dayTask_;
      }

      public int getDayTaskCount() {
         return this.dayTask_.size();
      }

      public ActivityMsg.TaskData getDayTask(int index) {
         return (ActivityMsg.TaskData)this.dayTask_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getDayTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.dayTask_.get(index);
      }

      public boolean hasDayReset() {
         return (this.bitField0_ & 128) != 0;
      }

      public long getDayReset() {
         return this.dayReset_;
      }

      public List<ActivityMsg.TaskData> getWeekTaskList() {
         return this.weekTask_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getWeekTaskOrBuilderList() {
         return this.weekTask_;
      }

      public int getWeekTaskCount() {
         return this.weekTask_.size();
      }

      public ActivityMsg.TaskData getWeekTask(int index) {
         return (ActivityMsg.TaskData)this.weekTask_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getWeekTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.weekTask_.get(index);
      }

      public boolean hasWeekReset() {
         return (this.bitField0_ & 256) != 0;
      }

      public long getWeekReset() {
         return this.weekReset_;
      }

      public List<ActivityMsg.TaskData> getMonthTaskList() {
         return this.monthTask_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getMonthTaskOrBuilderList() {
         return this.monthTask_;
      }

      public int getMonthTaskCount() {
         return this.monthTask_.size();
      }

      public ActivityMsg.TaskData getMonthTask(int index) {
         return (ActivityMsg.TaskData)this.monthTask_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getMonthTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.monthTask_.get(index);
      }

      public boolean hasMonthReset() {
         return (this.bitField0_ & 512) != 0;
      }

      public long getMonthReset() {
         return this.monthReset_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIntegral()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVIP()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyIntegral()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDayReset()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWeekReset()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMonthReset()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getDayTaskCount(); ++i) {
               if (!this.getDayTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getWeekTaskCount(); ++i) {
               if (!this.getWeekTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getMonthTaskCount(); ++i) {
               if (!this.getMonthTask(i).isInitialized()) {
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
            output.writeInt32(1, this.integral_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.level_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.vIP_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.startTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(5, this.endTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.buyIntegral_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.buyLv_);
         }

         for(int i = 0; i < this.dayTask_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.dayTask_.get(i));
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt64(9, this.dayReset_);
         }

         for(int i = 0; i < this.weekTask_.size(); ++i) {
            output.writeMessage(10, (MessageLite)this.weekTask_.get(i));
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt64(11, this.weekReset_);
         }

         for(int i = 0; i < this.monthTask_.size(); ++i) {
            output.writeMessage(12, (MessageLite)this.monthTask_.get(i));
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt64(13, this.monthReset_);
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
               size += CodedOutputStream.computeInt32Size(1, this.integral_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.vIP_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.startTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.endTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.buyIntegral_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.buyLv_);
            }

            for(int i = 0; i < this.dayTask_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.dayTask_.get(i));
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt64Size(9, this.dayReset_);
            }

            for(int i = 0; i < this.weekTask_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.weekTask_.get(i));
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt64Size(11, this.weekReset_);
            }

            for(int i = 0; i < this.monthTask_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(12, (MessageLite)this.monthTask_.get(i));
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt64Size(13, this.monthReset_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AncientSwordTokenMain_24612)) {
            return super.equals(obj);
         } else {
            S2C_AncientSwordTokenMain_24612 other = (S2C_AncientSwordTokenMain_24612)obj;
            if (this.hasIntegral() != other.hasIntegral()) {
               return false;
            } else if (this.hasIntegral() && this.getIntegral() != other.getIntegral()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasVIP() != other.hasVIP()) {
               return false;
            } else if (this.hasVIP() && this.getVIP() != other.getVIP()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasBuyIntegral() != other.hasBuyIntegral()) {
               return false;
            } else if (this.hasBuyIntegral() && this.getBuyIntegral() != other.getBuyIntegral()) {
               return false;
            } else if (this.hasBuyLv() != other.hasBuyLv()) {
               return false;
            } else if (this.hasBuyLv() && this.getBuyLv() != other.getBuyLv()) {
               return false;
            } else if (!this.getDayTaskList().equals(other.getDayTaskList())) {
               return false;
            } else if (this.hasDayReset() != other.hasDayReset()) {
               return false;
            } else if (this.hasDayReset() && this.getDayReset() != other.getDayReset()) {
               return false;
            } else if (!this.getWeekTaskList().equals(other.getWeekTaskList())) {
               return false;
            } else if (this.hasWeekReset() != other.hasWeekReset()) {
               return false;
            } else if (this.hasWeekReset() && this.getWeekReset() != other.getWeekReset()) {
               return false;
            } else if (!this.getMonthTaskList().equals(other.getMonthTaskList())) {
               return false;
            } else if (this.hasMonthReset() != other.hasMonthReset()) {
               return false;
            } else if (this.hasMonthReset() && this.getMonthReset() != other.getMonthReset()) {
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
            if (this.hasIntegral()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIntegral();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasVIP()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getVIP());
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getStartTime());
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getEndTime());
            }

            if (this.hasBuyIntegral()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBuyIntegral();
            }

            if (this.hasBuyLv()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getBuyLv();
            }

            if (this.getDayTaskCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getDayTaskList().hashCode();
            }

            if (this.hasDayReset()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + Internal.hashLong(this.getDayReset());
            }

            if (this.getWeekTaskCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getWeekTaskList().hashCode();
            }

            if (this.hasWeekReset()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + Internal.hashLong(this.getWeekReset());
            }

            if (this.getMonthTaskCount() > 0) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getMonthTaskList().hashCode();
            }

            if (this.hasMonthReset()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + Internal.hashLong(this.getMonthReset());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AncientSwordTokenMain_24612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordTokenMain_24612)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordTokenMain_24612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordTokenMain_24612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordTokenMain_24612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordTokenMain_24612)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordTokenMain_24612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordTokenMain_24612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordTokenMain_24612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordTokenMain_24612)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordTokenMain_24612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordTokenMain_24612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordTokenMain_24612 parseFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordTokenMain_24612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordTokenMain_24612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordTokenMain_24612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordTokenMain_24612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordTokenMain_24612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordTokenMain_24612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordTokenMain_24612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordTokenMain_24612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AncientSwordTokenMain_24612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordTokenMain_24612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordTokenMain_24612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AncientSwordTokenMain_24612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AncientSwordTokenMain_24612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AncientSwordTokenMain_24612> parser() {
         return PARSER;
      }

      public Parser<S2C_AncientSwordTokenMain_24612> getParserForType() {
         return PARSER;
      }

      public S2C_AncientSwordTokenMain_24612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AncientSwordTokenMain_24612OrBuilder {
         private int bitField0_;
         private int integral_;
         private int level_;
         private boolean vIP_;
         private long startTime_;
         private long endTime_;
         private int buyIntegral_;
         private int buyLv_;
         private List<ActivityMsg.TaskData> dayTask_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> dayTaskBuilder_;
         private long dayReset_;
         private List<ActivityMsg.TaskData> weekTask_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> weekTaskBuilder_;
         private long weekReset_;
         private List<ActivityMsg.TaskData> monthTask_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> monthTaskBuilder_;
         private long monthReset_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordTokenMain_24612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordTokenMain_24612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordTokenMain_24612.class, Builder.class);
         }

         private Builder() {
            this.dayTask_ = Collections.emptyList();
            this.weekTask_ = Collections.emptyList();
            this.monthTask_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.dayTask_ = Collections.emptyList();
            this.weekTask_ = Collections.emptyList();
            this.monthTask_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.S2C_AncientSwordTokenMain_24612.alwaysUseFieldBuilders) {
               this.getDayTaskFieldBuilder();
               this.getWeekTaskFieldBuilder();
               this.getMonthTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.integral_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            this.vIP_ = false;
            this.bitField0_ &= -5;
            this.startTime_ = 0L;
            this.bitField0_ &= -9;
            this.endTime_ = 0L;
            this.bitField0_ &= -17;
            this.buyIntegral_ = 0;
            this.bitField0_ &= -33;
            this.buyLv_ = 0;
            this.bitField0_ &= -65;
            if (this.dayTaskBuilder_ == null) {
               this.dayTask_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.dayTaskBuilder_.clear();
            }

            this.dayReset_ = 0L;
            this.bitField0_ &= -257;
            if (this.weekTaskBuilder_ == null) {
               this.weekTask_ = Collections.emptyList();
               this.bitField0_ &= -513;
            } else {
               this.weekTaskBuilder_.clear();
            }

            this.weekReset_ = 0L;
            this.bitField0_ &= -1025;
            if (this.monthTaskBuilder_ == null) {
               this.monthTask_ = Collections.emptyList();
               this.bitField0_ &= -2049;
            } else {
               this.monthTaskBuilder_.clear();
            }

            this.monthReset_ = 0L;
            this.bitField0_ &= -4097;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordTokenMain_24612_descriptor;
         }

         public S2C_AncientSwordTokenMain_24612 getDefaultInstanceForType() {
            return AncientSwordMsg.S2C_AncientSwordTokenMain_24612.getDefaultInstance();
         }

         public S2C_AncientSwordTokenMain_24612 build() {
            S2C_AncientSwordTokenMain_24612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AncientSwordTokenMain_24612 buildPartial() {
            S2C_AncientSwordTokenMain_24612 result = new S2C_AncientSwordTokenMain_24612(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.integral_ = this.integral_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.vIP_ = this.vIP_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.buyIntegral_ = this.buyIntegral_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.buyLv_ = this.buyLv_;
               to_bitField0_ |= 64;
            }

            if (this.dayTaskBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.dayTask_ = Collections.unmodifiableList(this.dayTask_);
                  this.bitField0_ &= -129;
               }

               result.dayTask_ = this.dayTask_;
            } else {
               result.dayTask_ = this.dayTaskBuilder_.build();
            }

            if ((from_bitField0_ & 256) != 0) {
               result.dayReset_ = this.dayReset_;
               to_bitField0_ |= 128;
            }

            if (this.weekTaskBuilder_ == null) {
               if ((this.bitField0_ & 512) != 0) {
                  this.weekTask_ = Collections.unmodifiableList(this.weekTask_);
                  this.bitField0_ &= -513;
               }

               result.weekTask_ = this.weekTask_;
            } else {
               result.weekTask_ = this.weekTaskBuilder_.build();
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.weekReset_ = this.weekReset_;
               to_bitField0_ |= 256;
            }

            if (this.monthTaskBuilder_ == null) {
               if ((this.bitField0_ & 2048) != 0) {
                  this.monthTask_ = Collections.unmodifiableList(this.monthTask_);
                  this.bitField0_ &= -2049;
               }

               result.monthTask_ = this.monthTask_;
            } else {
               result.monthTask_ = this.monthTaskBuilder_.build();
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.monthReset_ = this.monthReset_;
               to_bitField0_ |= 512;
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
            if (other instanceof S2C_AncientSwordTokenMain_24612) {
               return this.mergeFrom((S2C_AncientSwordTokenMain_24612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AncientSwordTokenMain_24612 other) {
            if (other == AncientSwordMsg.S2C_AncientSwordTokenMain_24612.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIntegral()) {
                  this.setIntegral(other.getIntegral());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasVIP()) {
                  this.setVIP(other.getVIP());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasBuyIntegral()) {
                  this.setBuyIntegral(other.getBuyIntegral());
               }

               if (other.hasBuyLv()) {
                  this.setBuyLv(other.getBuyLv());
               }

               if (this.dayTaskBuilder_ == null) {
                  if (!other.dayTask_.isEmpty()) {
                     if (this.dayTask_.isEmpty()) {
                        this.dayTask_ = other.dayTask_;
                        this.bitField0_ &= -129;
                     } else {
                        this.ensureDayTaskIsMutable();
                        this.dayTask_.addAll(other.dayTask_);
                     }

                     this.onChanged();
                  }
               } else if (!other.dayTask_.isEmpty()) {
                  if (this.dayTaskBuilder_.isEmpty()) {
                     this.dayTaskBuilder_.dispose();
                     this.dayTaskBuilder_ = null;
                     this.dayTask_ = other.dayTask_;
                     this.bitField0_ &= -129;
                     this.dayTaskBuilder_ = AncientSwordMsg.S2C_AncientSwordTokenMain_24612.alwaysUseFieldBuilders ? this.getDayTaskFieldBuilder() : null;
                  } else {
                     this.dayTaskBuilder_.addAllMessages(other.dayTask_);
                  }
               }

               if (other.hasDayReset()) {
                  this.setDayReset(other.getDayReset());
               }

               if (this.weekTaskBuilder_ == null) {
                  if (!other.weekTask_.isEmpty()) {
                     if (this.weekTask_.isEmpty()) {
                        this.weekTask_ = other.weekTask_;
                        this.bitField0_ &= -513;
                     } else {
                        this.ensureWeekTaskIsMutable();
                        this.weekTask_.addAll(other.weekTask_);
                     }

                     this.onChanged();
                  }
               } else if (!other.weekTask_.isEmpty()) {
                  if (this.weekTaskBuilder_.isEmpty()) {
                     this.weekTaskBuilder_.dispose();
                     this.weekTaskBuilder_ = null;
                     this.weekTask_ = other.weekTask_;
                     this.bitField0_ &= -513;
                     this.weekTaskBuilder_ = AncientSwordMsg.S2C_AncientSwordTokenMain_24612.alwaysUseFieldBuilders ? this.getWeekTaskFieldBuilder() : null;
                  } else {
                     this.weekTaskBuilder_.addAllMessages(other.weekTask_);
                  }
               }

               if (other.hasWeekReset()) {
                  this.setWeekReset(other.getWeekReset());
               }

               if (this.monthTaskBuilder_ == null) {
                  if (!other.monthTask_.isEmpty()) {
                     if (this.monthTask_.isEmpty()) {
                        this.monthTask_ = other.monthTask_;
                        this.bitField0_ &= -2049;
                     } else {
                        this.ensureMonthTaskIsMutable();
                        this.monthTask_.addAll(other.monthTask_);
                     }

                     this.onChanged();
                  }
               } else if (!other.monthTask_.isEmpty()) {
                  if (this.monthTaskBuilder_.isEmpty()) {
                     this.monthTaskBuilder_.dispose();
                     this.monthTaskBuilder_ = null;
                     this.monthTask_ = other.monthTask_;
                     this.bitField0_ &= -2049;
                     this.monthTaskBuilder_ = AncientSwordMsg.S2C_AncientSwordTokenMain_24612.alwaysUseFieldBuilders ? this.getMonthTaskFieldBuilder() : null;
                  } else {
                     this.monthTaskBuilder_.addAllMessages(other.monthTask_);
                  }
               }

               if (other.hasMonthReset()) {
                  this.setMonthReset(other.getMonthReset());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIntegral()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else if (!this.hasVIP()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasBuyIntegral()) {
               return false;
            } else if (!this.hasBuyLv()) {
               return false;
            } else if (!this.hasDayReset()) {
               return false;
            } else if (!this.hasWeekReset()) {
               return false;
            } else if (!this.hasMonthReset()) {
               return false;
            } else {
               for(int i = 0; i < this.getDayTaskCount(); ++i) {
                  if (!this.getDayTask(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getWeekTaskCount(); ++i) {
                  if (!this.getWeekTask(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getMonthTaskCount(); ++i) {
                  if (!this.getMonthTask(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AncientSwordTokenMain_24612 parsedMessage = null;

            try {
               parsedMessage = (S2C_AncientSwordTokenMain_24612)AncientSwordMsg.S2C_AncientSwordTokenMain_24612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AncientSwordTokenMain_24612)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIntegral() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIntegral() {
            return this.integral_;
         }

         public Builder setIntegral(int value) {
            this.bitField0_ |= 1;
            this.integral_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIntegral() {
            this.bitField0_ &= -2;
            this.integral_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 2;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVIP() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getVIP() {
            return this.vIP_;
         }

         public Builder setVIP(boolean value) {
            this.bitField0_ |= 4;
            this.vIP_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVIP() {
            this.bitField0_ &= -5;
            this.vIP_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(long value) {
            this.bitField0_ |= 8;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -9;
            this.startTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(long value) {
            this.bitField0_ |= 16;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -17;
            this.endTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasBuyIntegral() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getBuyIntegral() {
            return this.buyIntegral_;
         }

         public Builder setBuyIntegral(int value) {
            this.bitField0_ |= 32;
            this.buyIntegral_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyIntegral() {
            this.bitField0_ &= -33;
            this.buyIntegral_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyLv() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getBuyLv() {
            return this.buyLv_;
         }

         public Builder setBuyLv(int value) {
            this.bitField0_ |= 64;
            this.buyLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyLv() {
            this.bitField0_ &= -65;
            this.buyLv_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureDayTaskIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.dayTask_ = new ArrayList(this.dayTask_);
               this.bitField0_ |= 128;
            }

         }

         public List<ActivityMsg.TaskData> getDayTaskList() {
            return this.dayTaskBuilder_ == null ? Collections.unmodifiableList(this.dayTask_) : this.dayTaskBuilder_.getMessageList();
         }

         public int getDayTaskCount() {
            return this.dayTaskBuilder_ == null ? this.dayTask_.size() : this.dayTaskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getDayTask(int index) {
            return this.dayTaskBuilder_ == null ? (ActivityMsg.TaskData)this.dayTask_.get(index) : (ActivityMsg.TaskData)this.dayTaskBuilder_.getMessage(index);
         }

         public Builder setDayTask(int index, ActivityMsg.TaskData value) {
            if (this.dayTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDayTaskIsMutable();
               this.dayTask_.set(index, value);
               this.onChanged();
            } else {
               this.dayTaskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDayTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.dayTaskBuilder_ == null) {
               this.ensureDayTaskIsMutable();
               this.dayTask_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dayTaskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDayTask(ActivityMsg.TaskData value) {
            if (this.dayTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDayTaskIsMutable();
               this.dayTask_.add(value);
               this.onChanged();
            } else {
               this.dayTaskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDayTask(int index, ActivityMsg.TaskData value) {
            if (this.dayTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDayTaskIsMutable();
               this.dayTask_.add(index, value);
               this.onChanged();
            } else {
               this.dayTaskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDayTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.dayTaskBuilder_ == null) {
               this.ensureDayTaskIsMutable();
               this.dayTask_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dayTaskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDayTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.dayTaskBuilder_ == null) {
               this.ensureDayTaskIsMutable();
               this.dayTask_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dayTaskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDayTask(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.dayTaskBuilder_ == null) {
               this.ensureDayTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.dayTask_);
               this.onChanged();
            } else {
               this.dayTaskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDayTask() {
            if (this.dayTaskBuilder_ == null) {
               this.dayTask_ = Collections.emptyList();
               this.bitField0_ &= -129;
               this.onChanged();
            } else {
               this.dayTaskBuilder_.clear();
            }

            return this;
         }

         public Builder removeDayTask(int index) {
            if (this.dayTaskBuilder_ == null) {
               this.ensureDayTaskIsMutable();
               this.dayTask_.remove(index);
               this.onChanged();
            } else {
               this.dayTaskBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getDayTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getDayTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getDayTaskOrBuilder(int index) {
            return this.dayTaskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.dayTask_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.dayTaskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getDayTaskOrBuilderList() {
            return this.dayTaskBuilder_ != null ? this.dayTaskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.dayTask_);
         }

         public ActivityMsg.TaskData.Builder addDayTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getDayTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addDayTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getDayTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getDayTaskBuilderList() {
            return this.getDayTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getDayTaskFieldBuilder() {
            if (this.dayTaskBuilder_ == null) {
               this.dayTaskBuilder_ = new RepeatedFieldBuilderV3(this.dayTask_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.dayTask_ = null;
            }

            return this.dayTaskBuilder_;
         }

         public boolean hasDayReset() {
            return (this.bitField0_ & 256) != 0;
         }

         public long getDayReset() {
            return this.dayReset_;
         }

         public Builder setDayReset(long value) {
            this.bitField0_ |= 256;
            this.dayReset_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDayReset() {
            this.bitField0_ &= -257;
            this.dayReset_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureWeekTaskIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.weekTask_ = new ArrayList(this.weekTask_);
               this.bitField0_ |= 512;
            }

         }

         public List<ActivityMsg.TaskData> getWeekTaskList() {
            return this.weekTaskBuilder_ == null ? Collections.unmodifiableList(this.weekTask_) : this.weekTaskBuilder_.getMessageList();
         }

         public int getWeekTaskCount() {
            return this.weekTaskBuilder_ == null ? this.weekTask_.size() : this.weekTaskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getWeekTask(int index) {
            return this.weekTaskBuilder_ == null ? (ActivityMsg.TaskData)this.weekTask_.get(index) : (ActivityMsg.TaskData)this.weekTaskBuilder_.getMessage(index);
         }

         public Builder setWeekTask(int index, ActivityMsg.TaskData value) {
            if (this.weekTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeekTaskIsMutable();
               this.weekTask_.set(index, value);
               this.onChanged();
            } else {
               this.weekTaskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWeekTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.weekTaskBuilder_ == null) {
               this.ensureWeekTaskIsMutable();
               this.weekTask_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weekTaskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWeekTask(ActivityMsg.TaskData value) {
            if (this.weekTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeekTaskIsMutable();
               this.weekTask_.add(value);
               this.onChanged();
            } else {
               this.weekTaskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWeekTask(int index, ActivityMsg.TaskData value) {
            if (this.weekTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeekTaskIsMutable();
               this.weekTask_.add(index, value);
               this.onChanged();
            } else {
               this.weekTaskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWeekTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.weekTaskBuilder_ == null) {
               this.ensureWeekTaskIsMutable();
               this.weekTask_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.weekTaskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWeekTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.weekTaskBuilder_ == null) {
               this.ensureWeekTaskIsMutable();
               this.weekTask_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weekTaskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWeekTask(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.weekTaskBuilder_ == null) {
               this.ensureWeekTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.weekTask_);
               this.onChanged();
            } else {
               this.weekTaskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWeekTask() {
            if (this.weekTaskBuilder_ == null) {
               this.weekTask_ = Collections.emptyList();
               this.bitField0_ &= -513;
               this.onChanged();
            } else {
               this.weekTaskBuilder_.clear();
            }

            return this;
         }

         public Builder removeWeekTask(int index) {
            if (this.weekTaskBuilder_ == null) {
               this.ensureWeekTaskIsMutable();
               this.weekTask_.remove(index);
               this.onChanged();
            } else {
               this.weekTaskBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getWeekTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getWeekTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getWeekTaskOrBuilder(int index) {
            return this.weekTaskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.weekTask_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.weekTaskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getWeekTaskOrBuilderList() {
            return this.weekTaskBuilder_ != null ? this.weekTaskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.weekTask_);
         }

         public ActivityMsg.TaskData.Builder addWeekTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getWeekTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addWeekTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getWeekTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getWeekTaskBuilderList() {
            return this.getWeekTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getWeekTaskFieldBuilder() {
            if (this.weekTaskBuilder_ == null) {
               this.weekTaskBuilder_ = new RepeatedFieldBuilderV3(this.weekTask_, (this.bitField0_ & 512) != 0, this.getParentForChildren(), this.isClean());
               this.weekTask_ = null;
            }

            return this.weekTaskBuilder_;
         }

         public boolean hasWeekReset() {
            return (this.bitField0_ & 1024) != 0;
         }

         public long getWeekReset() {
            return this.weekReset_;
         }

         public Builder setWeekReset(long value) {
            this.bitField0_ |= 1024;
            this.weekReset_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWeekReset() {
            this.bitField0_ &= -1025;
            this.weekReset_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureMonthTaskIsMutable() {
            if ((this.bitField0_ & 2048) == 0) {
               this.monthTask_ = new ArrayList(this.monthTask_);
               this.bitField0_ |= 2048;
            }

         }

         public List<ActivityMsg.TaskData> getMonthTaskList() {
            return this.monthTaskBuilder_ == null ? Collections.unmodifiableList(this.monthTask_) : this.monthTaskBuilder_.getMessageList();
         }

         public int getMonthTaskCount() {
            return this.monthTaskBuilder_ == null ? this.monthTask_.size() : this.monthTaskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getMonthTask(int index) {
            return this.monthTaskBuilder_ == null ? (ActivityMsg.TaskData)this.monthTask_.get(index) : (ActivityMsg.TaskData)this.monthTaskBuilder_.getMessage(index);
         }

         public Builder setMonthTask(int index, ActivityMsg.TaskData value) {
            if (this.monthTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMonthTaskIsMutable();
               this.monthTask_.set(index, value);
               this.onChanged();
            } else {
               this.monthTaskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMonthTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.monthTaskBuilder_ == null) {
               this.ensureMonthTaskIsMutable();
               this.monthTask_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.monthTaskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMonthTask(ActivityMsg.TaskData value) {
            if (this.monthTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMonthTaskIsMutable();
               this.monthTask_.add(value);
               this.onChanged();
            } else {
               this.monthTaskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMonthTask(int index, ActivityMsg.TaskData value) {
            if (this.monthTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMonthTaskIsMutable();
               this.monthTask_.add(index, value);
               this.onChanged();
            } else {
               this.monthTaskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMonthTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.monthTaskBuilder_ == null) {
               this.ensureMonthTaskIsMutable();
               this.monthTask_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.monthTaskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMonthTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.monthTaskBuilder_ == null) {
               this.ensureMonthTaskIsMutable();
               this.monthTask_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.monthTaskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMonthTask(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.monthTaskBuilder_ == null) {
               this.ensureMonthTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.monthTask_);
               this.onChanged();
            } else {
               this.monthTaskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMonthTask() {
            if (this.monthTaskBuilder_ == null) {
               this.monthTask_ = Collections.emptyList();
               this.bitField0_ &= -2049;
               this.onChanged();
            } else {
               this.monthTaskBuilder_.clear();
            }

            return this;
         }

         public Builder removeMonthTask(int index) {
            if (this.monthTaskBuilder_ == null) {
               this.ensureMonthTaskIsMutable();
               this.monthTask_.remove(index);
               this.onChanged();
            } else {
               this.monthTaskBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getMonthTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getMonthTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getMonthTaskOrBuilder(int index) {
            return this.monthTaskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.monthTask_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.monthTaskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getMonthTaskOrBuilderList() {
            return this.monthTaskBuilder_ != null ? this.monthTaskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.monthTask_);
         }

         public ActivityMsg.TaskData.Builder addMonthTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getMonthTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addMonthTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getMonthTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getMonthTaskBuilderList() {
            return this.getMonthTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getMonthTaskFieldBuilder() {
            if (this.monthTaskBuilder_ == null) {
               this.monthTaskBuilder_ = new RepeatedFieldBuilderV3(this.monthTask_, (this.bitField0_ & 2048) != 0, this.getParentForChildren(), this.isClean());
               this.monthTask_ = null;
            }

            return this.monthTaskBuilder_;
         }

         public boolean hasMonthReset() {
            return (this.bitField0_ & 4096) != 0;
         }

         public long getMonthReset() {
            return this.monthReset_;
         }

         public Builder setMonthReset(long value) {
            this.bitField0_ |= 4096;
            this.monthReset_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonthReset() {
            this.bitField0_ &= -4097;
            this.monthReset_ = 0L;
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

   public static final class C2S_AncientSwordCommitTask_24613 extends GeneratedMessageV3 implements C2S_AncientSwordCommitTask_24613OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordCommitTask_24613 DEFAULT_INSTANCE = new C2S_AncientSwordCommitTask_24613();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordCommitTask_24613> PARSER = new AbstractParser<C2S_AncientSwordCommitTask_24613>() {
         public C2S_AncientSwordCommitTask_24613 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordCommitTask_24613(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordCommitTask_24613(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordCommitTask_24613() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordCommitTask_24613();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordCommitTask_24613(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24613_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordCommitTask_24613.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AncientSwordCommitTask_24613)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordCommitTask_24613 other = (C2S_AncientSwordCommitTask_24613)obj;
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

      public static C2S_AncientSwordCommitTask_24613 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24613)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordCommitTask_24613 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordCommitTask_24613 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24613)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordCommitTask_24613 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordCommitTask_24613 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24613)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordCommitTask_24613 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordCommitTask_24613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordCommitTask_24613 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordCommitTask_24613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordCommitTask_24613 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordCommitTask_24613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordCommitTask_24613 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordCommitTask_24613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordCommitTask_24613 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordCommitTask_24613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordCommitTask_24613 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordCommitTask_24613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordCommitTask_24613 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordCommitTask_24613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordCommitTask_24613 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordCommitTask_24613 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordCommitTask_24613> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordCommitTask_24613> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordCommitTask_24613 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordCommitTask_24613OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24613_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordCommitTask_24613.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordCommitTask_24613.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordCommitTask_24613_descriptor;
         }

         public C2S_AncientSwordCommitTask_24613 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordCommitTask_24613.getDefaultInstance();
         }

         public C2S_AncientSwordCommitTask_24613 build() {
            C2S_AncientSwordCommitTask_24613 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordCommitTask_24613 buildPartial() {
            C2S_AncientSwordCommitTask_24613 result = new C2S_AncientSwordCommitTask_24613(this);
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
            if (other instanceof C2S_AncientSwordCommitTask_24613) {
               return this.mergeFrom((C2S_AncientSwordCommitTask_24613)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordCommitTask_24613 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordCommitTask_24613.getDefaultInstance()) {
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
            C2S_AncientSwordCommitTask_24613 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordCommitTask_24613)AncientSwordMsg.C2S_AncientSwordCommitTask_24613.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordCommitTask_24613)e.getUnfinishedMessage();
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

   public static final class S2C_AncientSwordCommitTask_24614 extends GeneratedMessageV3 implements S2C_AncientSwordCommitTask_24614OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_AncientSwordCommitTask_24614 DEFAULT_INSTANCE = new S2C_AncientSwordCommitTask_24614();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AncientSwordCommitTask_24614> PARSER = new AbstractParser<S2C_AncientSwordCommitTask_24614>() {
         public S2C_AncientSwordCommitTask_24614 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AncientSwordCommitTask_24614(input, extensionRegistry);
         }
      };

      private S2C_AncientSwordCommitTask_24614(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AncientSwordCommitTask_24614() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AncientSwordCommitTask_24614();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AncientSwordCommitTask_24614(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24614_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordCommitTask_24614.class, Builder.class);
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
         } else if (!(obj instanceof S2C_AncientSwordCommitTask_24614)) {
            return super.equals(obj);
         } else {
            S2C_AncientSwordCommitTask_24614 other = (S2C_AncientSwordCommitTask_24614)obj;
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

      public static S2C_AncientSwordCommitTask_24614 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24614)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordCommitTask_24614 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordCommitTask_24614 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24614)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordCommitTask_24614 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordCommitTask_24614 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24614)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordCommitTask_24614 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordCommitTask_24614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordCommitTask_24614 parseFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordCommitTask_24614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordCommitTask_24614 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordCommitTask_24614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordCommitTask_24614 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordCommitTask_24614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordCommitTask_24614 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordCommitTask_24614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordCommitTask_24614 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AncientSwordCommitTask_24614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordCommitTask_24614 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordCommitTask_24614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AncientSwordCommitTask_24614 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AncientSwordCommitTask_24614 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AncientSwordCommitTask_24614> parser() {
         return PARSER;
      }

      public Parser<S2C_AncientSwordCommitTask_24614> getParserForType() {
         return PARSER;
      }

      public S2C_AncientSwordCommitTask_24614 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AncientSwordCommitTask_24614OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24614_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordCommitTask_24614.class, Builder.class);
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
            if (AncientSwordMsg.S2C_AncientSwordCommitTask_24614.alwaysUseFieldBuilders) {
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
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordCommitTask_24614_descriptor;
         }

         public S2C_AncientSwordCommitTask_24614 getDefaultInstanceForType() {
            return AncientSwordMsg.S2C_AncientSwordCommitTask_24614.getDefaultInstance();
         }

         public S2C_AncientSwordCommitTask_24614 build() {
            S2C_AncientSwordCommitTask_24614 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AncientSwordCommitTask_24614 buildPartial() {
            S2C_AncientSwordCommitTask_24614 result = new S2C_AncientSwordCommitTask_24614(this);
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
            if (other instanceof S2C_AncientSwordCommitTask_24614) {
               return this.mergeFrom((S2C_AncientSwordCommitTask_24614)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AncientSwordCommitTask_24614 other) {
            if (other == AncientSwordMsg.S2C_AncientSwordCommitTask_24614.getDefaultInstance()) {
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
                     this.taskBuilder_ = AncientSwordMsg.S2C_AncientSwordCommitTask_24614.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_AncientSwordCommitTask_24614 parsedMessage = null;

            try {
               parsedMessage = (S2C_AncientSwordCommitTask_24614)AncientSwordMsg.S2C_AncientSwordCommitTask_24614.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AncientSwordCommitTask_24614)e.getUnfinishedMessage();
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

   public static final class C2S_AncientSwordTokenBuy_24615 extends GeneratedMessageV3 implements C2S_AncientSwordTokenBuy_24615OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordTokenBuy_24615 DEFAULT_INSTANCE = new C2S_AncientSwordTokenBuy_24615();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordTokenBuy_24615> PARSER = new AbstractParser<C2S_AncientSwordTokenBuy_24615>() {
         public C2S_AncientSwordTokenBuy_24615 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordTokenBuy_24615(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordTokenBuy_24615(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordTokenBuy_24615() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordTokenBuy_24615();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordTokenBuy_24615(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenBuy_24615_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenBuy_24615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordTokenBuy_24615.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
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
         } else if (!this.hasType()) {
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
            output.writeInt32(1, this.type_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
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
         } else if (!(obj instanceof C2S_AncientSwordTokenBuy_24615)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordTokenBuy_24615 other = (C2S_AncientSwordTokenBuy_24615)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
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

      public static C2S_AncientSwordTokenBuy_24615 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenBuy_24615)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenBuy_24615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenBuy_24615)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenBuy_24615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenBuy_24615)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordTokenBuy_24615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordTokenBuy_24615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordTokenBuy_24615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordTokenBuy_24615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordTokenBuy_24615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordTokenBuy_24615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordTokenBuy_24615 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordTokenBuy_24615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordTokenBuy_24615 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordTokenBuy_24615 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordTokenBuy_24615> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordTokenBuy_24615> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordTokenBuy_24615 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordTokenBuy_24615OrBuilder {
         private int bitField0_;
         private int type_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenBuy_24615_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenBuy_24615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordTokenBuy_24615.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordTokenBuy_24615.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordTokenBuy_24615_descriptor;
         }

         public C2S_AncientSwordTokenBuy_24615 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordTokenBuy_24615.getDefaultInstance();
         }

         public C2S_AncientSwordTokenBuy_24615 build() {
            C2S_AncientSwordTokenBuy_24615 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordTokenBuy_24615 buildPartial() {
            C2S_AncientSwordTokenBuy_24615 result = new C2S_AncientSwordTokenBuy_24615(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_AncientSwordTokenBuy_24615) {
               return this.mergeFrom((C2S_AncientSwordTokenBuy_24615)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordTokenBuy_24615 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordTokenBuy_24615.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
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
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AncientSwordTokenBuy_24615 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordTokenBuy_24615)AncientSwordMsg.C2S_AncientSwordTokenBuy_24615.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordTokenBuy_24615)e.getUnfinishedMessage();
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

   public static final class S2CR_AncientSwordBornMonster_24616 extends GeneratedMessageV3 implements S2CR_AncientSwordBornMonster_24616OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int POWER_FIELD_NUMBER = 3;
      private long power_;
      public static final int MONSTERID_FIELD_NUMBER = 4;
      private Internal.IntList monsterId_;
      public static final int EXISTPLAYER_FIELD_NUMBER = 5;
      private Internal.IntList existPlayer_;
      public static final int STATUS_FIELD_NUMBER = 6;
      private int status_;
      private byte memoizedIsInitialized;
      private static final S2CR_AncientSwordBornMonster_24616 DEFAULT_INSTANCE = new S2CR_AncientSwordBornMonster_24616();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AncientSwordBornMonster_24616> PARSER = new AbstractParser<S2CR_AncientSwordBornMonster_24616>() {
         public S2CR_AncientSwordBornMonster_24616 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AncientSwordBornMonster_24616(input, extensionRegistry);
         }
      };

      private S2CR_AncientSwordBornMonster_24616(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AncientSwordBornMonster_24616() {
         this.memoizedIsInitialized = -1;
         this.monsterId_ = emptyIntList();
         this.existPlayer_ = emptyIntList();
         this.status_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AncientSwordBornMonster_24616();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AncientSwordBornMonster_24616(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.power_ = input.readInt64();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.monsterId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.monsterId_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.monsterId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.existPlayer_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.existPlayer_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.existPlayer_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.existPlayer_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 48:
                        int rawValue = input.readEnum();
                        CrossStatus value = AncientSwordMsg.CrossStatus.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(6, rawValue);
                        } else {
                           this.bitField0_ |= 8;
                           this.status_ = rawValue;
                        }
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.monsterId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.monsterId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.existPlayer_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2CR_AncientSwordBornMonster_24616_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2CR_AncientSwordBornMonster_24616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AncientSwordBornMonster_24616.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPower() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public List<Integer> getMonsterIdList() {
         return this.monsterId_;
      }

      public int getMonsterIdCount() {
         return this.monsterId_.size();
      }

      public int getMonsterId(int index) {
         return this.monsterId_.getInt(index);
      }

      public List<Integer> getExistPlayerList() {
         return this.existPlayer_;
      }

      public int getExistPlayerCount() {
         return this.existPlayer_.size();
      }

      public int getExistPlayer(int index) {
         return this.existPlayer_.getInt(index);
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 8) != 0;
      }

      public CrossStatus getStatus() {
         CrossStatus result = AncientSwordMsg.CrossStatus.valueOf(this.status_);
         return result == null ? AncientSwordMsg.CrossStatus.BORN_DAY_MONSTER : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.power_);
         }

         for(int i = 0; i < this.monsterId_.size(); ++i) {
            output.writeInt32(4, this.monsterId_.getInt(i));
         }

         for(int i = 0; i < this.existPlayer_.size(); ++i) {
            output.writeInt32(5, this.existPlayer_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(6, this.status_);
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
               size += CodedOutputStream.computeInt32Size(1, this.serverId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.power_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.monsterId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.monsterId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getMonsterIdList().size();
            dataSize = 0;

            for(int i = 0; i < this.existPlayer_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.existPlayer_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getExistPlayerList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(6, this.status_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_AncientSwordBornMonster_24616)) {
            return super.equals(obj);
         } else {
            S2CR_AncientSwordBornMonster_24616 other = (S2CR_AncientSwordBornMonster_24616)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (!this.getMonsterIdList().equals(other.getMonsterIdList())) {
               return false;
            } else if (!this.getExistPlayerList().equals(other.getExistPlayerList())) {
               return false;
            } else if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.status_ != other.status_) {
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
            if (this.hasServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.getMonsterIdCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMonsterIdList().hashCode();
            }

            if (this.getExistPlayerCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getExistPlayerList().hashCode();
            }

            if (this.hasStatus()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.status_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_AncientSwordBornMonster_24616 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AncientSwordBornMonster_24616)PARSER.parseFrom(data);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AncientSwordBornMonster_24616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AncientSwordBornMonster_24616)PARSER.parseFrom(data);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AncientSwordBornMonster_24616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AncientSwordBornMonster_24616)PARSER.parseFrom(data);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AncientSwordBornMonster_24616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseFrom(InputStream input) throws IOException {
         return (S2CR_AncientSwordBornMonster_24616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AncientSwordBornMonster_24616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AncientSwordBornMonster_24616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AncientSwordBornMonster_24616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AncientSwordBornMonster_24616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AncientSwordBornMonster_24616 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AncientSwordBornMonster_24616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AncientSwordBornMonster_24616 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AncientSwordBornMonster_24616 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AncientSwordBornMonster_24616> parser() {
         return PARSER;
      }

      public Parser<S2CR_AncientSwordBornMonster_24616> getParserForType() {
         return PARSER;
      }

      public S2CR_AncientSwordBornMonster_24616 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AncientSwordBornMonster_24616OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private long power_;
         private Internal.IntList monsterId_;
         private Internal.IntList existPlayer_;
         private int status_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2CR_AncientSwordBornMonster_24616_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2CR_AncientSwordBornMonster_24616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AncientSwordBornMonster_24616.class, Builder.class);
         }

         private Builder() {
            this.monsterId_ = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.emptyIntList();
            this.existPlayer_ = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.emptyIntList();
            this.status_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.monsterId_ = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.emptyIntList();
            this.existPlayer_ = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.emptyIntList();
            this.status_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.power_ = 0L;
            this.bitField0_ &= -5;
            this.monsterId_ = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.emptyIntList();
            this.bitField0_ &= -9;
            this.existPlayer_ = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.emptyIntList();
            this.bitField0_ &= -17;
            this.status_ = 1;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2CR_AncientSwordBornMonster_24616_descriptor;
         }

         public S2CR_AncientSwordBornMonster_24616 getDefaultInstanceForType() {
            return AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.getDefaultInstance();
         }

         public S2CR_AncientSwordBornMonster_24616 build() {
            S2CR_AncientSwordBornMonster_24616 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AncientSwordBornMonster_24616 buildPartial() {
            S2CR_AncientSwordBornMonster_24616 result = new S2CR_AncientSwordBornMonster_24616(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.monsterId_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.monsterId_ = this.monsterId_;
            if ((this.bitField0_ & 16) != 0) {
               this.existPlayer_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.existPlayer_ = this.existPlayer_;
            if ((from_bitField0_ & 32) != 0) {
               to_bitField0_ |= 8;
            }

            result.status_ = this.status_;
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
            if (other instanceof S2CR_AncientSwordBornMonster_24616) {
               return this.mergeFrom((S2CR_AncientSwordBornMonster_24616)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AncientSwordBornMonster_24616 other) {
            if (other == AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (!other.monsterId_.isEmpty()) {
                  if (this.monsterId_.isEmpty()) {
                     this.monsterId_ = other.monsterId_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureMonsterIdIsMutable();
                     this.monsterId_.addAll(other.monsterId_);
                  }

                  this.onChanged();
               }

               if (!other.existPlayer_.isEmpty()) {
                  if (this.existPlayer_.isEmpty()) {
                     this.existPlayer_ = other.existPlayer_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureExistPlayerIsMutable();
                     this.existPlayer_.addAll(other.existPlayer_);
                  }

                  this.onChanged();
               }

               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPower()) {
               return false;
            } else {
               return this.hasStatus();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_AncientSwordBornMonster_24616 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AncientSwordBornMonster_24616)AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AncientSwordBornMonster_24616)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 1;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 2;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 4;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -5;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureMonsterIdIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.monsterId_ = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.mutableCopy(this.monsterId_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getMonsterIdList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.monsterId_) : this.monsterId_);
         }

         public int getMonsterIdCount() {
            return this.monsterId_.size();
         }

         public int getMonsterId(int index) {
            return this.monsterId_.getInt(index);
         }

         public Builder setMonsterId(int index, int value) {
            this.ensureMonsterIdIsMutable();
            this.monsterId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMonsterId(int value) {
            this.ensureMonsterIdIsMutable();
            this.monsterId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMonsterId(Iterable<? extends Integer> values) {
            this.ensureMonsterIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.monsterId_);
            this.onChanged();
            return this;
         }

         public Builder clearMonsterId() {
            this.monsterId_ = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureExistPlayerIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.existPlayer_ = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.mutableCopy(this.existPlayer_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getExistPlayerList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.existPlayer_) : this.existPlayer_);
         }

         public int getExistPlayerCount() {
            return this.existPlayer_.size();
         }

         public int getExistPlayer(int index) {
            return this.existPlayer_.getInt(index);
         }

         public Builder setExistPlayer(int index, int value) {
            this.ensureExistPlayerIsMutable();
            this.existPlayer_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addExistPlayer(int value) {
            this.ensureExistPlayerIsMutable();
            this.existPlayer_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllExistPlayer(Iterable<? extends Integer> values) {
            this.ensureExistPlayerIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.existPlayer_);
            this.onChanged();
            return this;
         }

         public Builder clearExistPlayer() {
            this.existPlayer_ = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 32) != 0;
         }

         public CrossStatus getStatus() {
            CrossStatus result = AncientSwordMsg.CrossStatus.valueOf(this.status_);
            return result == null ? AncientSwordMsg.CrossStatus.BORN_DAY_MONSTER : result;
         }

         public Builder setStatus(CrossStatus value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.status_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearStatus() {
            this.bitField0_ &= -33;
            this.status_ = 1;
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

   public static final class CR2S_AncientSwordBornMonster_24617 extends GeneratedMessageV3 implements CR2S_AncientSwordBornMonster_24617OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DESTSERVERID_FIELD_NUMBER = 1;
      private int destServerId_;
      public static final int DESTPLAYERID_FIELD_NUMBER = 2;
      private int destPlayerId_;
      public static final int MONSTERID_FIELD_NUMBER = 3;
      private int monsterId_;
      public static final int STATUS_FIELD_NUMBER = 4;
      private int status_;
      private byte memoizedIsInitialized;
      private static final CR2S_AncientSwordBornMonster_24617 DEFAULT_INSTANCE = new CR2S_AncientSwordBornMonster_24617();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_AncientSwordBornMonster_24617> PARSER = new AbstractParser<CR2S_AncientSwordBornMonster_24617>() {
         public CR2S_AncientSwordBornMonster_24617 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_AncientSwordBornMonster_24617(input, extensionRegistry);
         }
      };

      private CR2S_AncientSwordBornMonster_24617(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_AncientSwordBornMonster_24617() {
         this.memoizedIsInitialized = -1;
         this.status_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_AncientSwordBornMonster_24617();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_AncientSwordBornMonster_24617(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.destServerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.destPlayerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.monsterId_ = input.readInt32();
                        break;
                     case 32:
                        int rawValue = input.readEnum();
                        CrossStatus value = AncientSwordMsg.CrossStatus.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(4, rawValue);
                        } else {
                           this.bitField0_ |= 8;
                           this.status_ = rawValue;
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_CR2S_AncientSwordBornMonster_24617_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_CR2S_AncientSwordBornMonster_24617_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_AncientSwordBornMonster_24617.class, Builder.class);
      }

      public boolean hasDestServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDestServerId() {
         return this.destServerId_;
      }

      public boolean hasDestPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDestPlayerId() {
         return this.destPlayerId_;
      }

      public boolean hasMonsterId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMonsterId() {
         return this.monsterId_;
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 8) != 0;
      }

      public CrossStatus getStatus() {
         CrossStatus result = AncientSwordMsg.CrossStatus.valueOf(this.status_);
         return result == null ? AncientSwordMsg.CrossStatus.BORN_DAY_MONSTER : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDestServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMonsterId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.destServerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.destPlayerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.monsterId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(4, this.status_);
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
               size += CodedOutputStream.computeInt32Size(1, this.destServerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.destPlayerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.monsterId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(4, this.status_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_AncientSwordBornMonster_24617)) {
            return super.equals(obj);
         } else {
            CR2S_AncientSwordBornMonster_24617 other = (CR2S_AncientSwordBornMonster_24617)obj;
            if (this.hasDestServerId() != other.hasDestServerId()) {
               return false;
            } else if (this.hasDestServerId() && this.getDestServerId() != other.getDestServerId()) {
               return false;
            } else if (this.hasDestPlayerId() != other.hasDestPlayerId()) {
               return false;
            } else if (this.hasDestPlayerId() && this.getDestPlayerId() != other.getDestPlayerId()) {
               return false;
            } else if (this.hasMonsterId() != other.hasMonsterId()) {
               return false;
            } else if (this.hasMonsterId() && this.getMonsterId() != other.getMonsterId()) {
               return false;
            } else if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.status_ != other.status_) {
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
            if (this.hasDestServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDestServerId();
            }

            if (this.hasDestPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDestPlayerId();
            }

            if (this.hasMonsterId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMonsterId();
            }

            if (this.hasStatus()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.status_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_AncientSwordBornMonster_24617 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_AncientSwordBornMonster_24617)PARSER.parseFrom(data);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AncientSwordBornMonster_24617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_AncientSwordBornMonster_24617)PARSER.parseFrom(data);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AncientSwordBornMonster_24617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_AncientSwordBornMonster_24617)PARSER.parseFrom(data);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AncientSwordBornMonster_24617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseFrom(InputStream input) throws IOException {
         return (CR2S_AncientSwordBornMonster_24617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AncientSwordBornMonster_24617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_AncientSwordBornMonster_24617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AncientSwordBornMonster_24617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_AncientSwordBornMonster_24617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_AncientSwordBornMonster_24617 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AncientSwordBornMonster_24617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_AncientSwordBornMonster_24617 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_AncientSwordBornMonster_24617 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_AncientSwordBornMonster_24617> parser() {
         return PARSER;
      }

      public Parser<CR2S_AncientSwordBornMonster_24617> getParserForType() {
         return PARSER;
      }

      public CR2S_AncientSwordBornMonster_24617 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_AncientSwordBornMonster_24617OrBuilder {
         private int bitField0_;
         private int destServerId_;
         private int destPlayerId_;
         private int monsterId_;
         private int status_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_CR2S_AncientSwordBornMonster_24617_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_CR2S_AncientSwordBornMonster_24617_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_AncientSwordBornMonster_24617.class, Builder.class);
         }

         private Builder() {
            this.status_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.status_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.CR2S_AncientSwordBornMonster_24617.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.destServerId_ = 0;
            this.bitField0_ &= -2;
            this.destPlayerId_ = 0;
            this.bitField0_ &= -3;
            this.monsterId_ = 0;
            this.bitField0_ &= -5;
            this.status_ = 1;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_CR2S_AncientSwordBornMonster_24617_descriptor;
         }

         public CR2S_AncientSwordBornMonster_24617 getDefaultInstanceForType() {
            return AncientSwordMsg.CR2S_AncientSwordBornMonster_24617.getDefaultInstance();
         }

         public CR2S_AncientSwordBornMonster_24617 build() {
            CR2S_AncientSwordBornMonster_24617 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_AncientSwordBornMonster_24617 buildPartial() {
            CR2S_AncientSwordBornMonster_24617 result = new CR2S_AncientSwordBornMonster_24617(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.destServerId_ = this.destServerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.destPlayerId_ = this.destPlayerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.monsterId_ = this.monsterId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.status_ = this.status_;
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
            if (other instanceof CR2S_AncientSwordBornMonster_24617) {
               return this.mergeFrom((CR2S_AncientSwordBornMonster_24617)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_AncientSwordBornMonster_24617 other) {
            if (other == AncientSwordMsg.CR2S_AncientSwordBornMonster_24617.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDestServerId()) {
                  this.setDestServerId(other.getDestServerId());
               }

               if (other.hasDestPlayerId()) {
                  this.setDestPlayerId(other.getDestPlayerId());
               }

               if (other.hasMonsterId()) {
                  this.setMonsterId(other.getMonsterId());
               }

               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDestServerId()) {
               return false;
            } else if (!this.hasDestPlayerId()) {
               return false;
            } else if (!this.hasMonsterId()) {
               return false;
            } else {
               return this.hasStatus();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_AncientSwordBornMonster_24617 parsedMessage = null;

            try {
               parsedMessage = (CR2S_AncientSwordBornMonster_24617)AncientSwordMsg.CR2S_AncientSwordBornMonster_24617.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_AncientSwordBornMonster_24617)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDestServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDestServerId() {
            return this.destServerId_;
         }

         public Builder setDestServerId(int value) {
            this.bitField0_ |= 1;
            this.destServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestServerId() {
            this.bitField0_ &= -2;
            this.destServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDestPlayerId() {
            return this.destPlayerId_;
         }

         public Builder setDestPlayerId(int value) {
            this.bitField0_ |= 2;
            this.destPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestPlayerId() {
            this.bitField0_ &= -3;
            this.destPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMonsterId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMonsterId() {
            return this.monsterId_;
         }

         public Builder setMonsterId(int value) {
            this.bitField0_ |= 4;
            this.monsterId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonsterId() {
            this.bitField0_ &= -5;
            this.monsterId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 8) != 0;
         }

         public CrossStatus getStatus() {
            CrossStatus result = AncientSwordMsg.CrossStatus.valueOf(this.status_);
            return result == null ? AncientSwordMsg.CrossStatus.BORN_DAY_MONSTER : result;
         }

         public Builder setStatus(CrossStatus value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.status_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearStatus() {
            this.bitField0_ &= -9;
            this.status_ = 1;
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

   public static final class S2S_AncientSwordGetMonster_24618 extends GeneratedMessageV3 implements S2S_AncientSwordGetMonster_24618OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MONSTER_FIELD_NUMBER = 1;
      private AncientMonster monster_;
      public static final int STATUS_FIELD_NUMBER = 2;
      private int status_;
      private byte memoizedIsInitialized;
      private static final S2S_AncientSwordGetMonster_24618 DEFAULT_INSTANCE = new S2S_AncientSwordGetMonster_24618();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_AncientSwordGetMonster_24618> PARSER = new AbstractParser<S2S_AncientSwordGetMonster_24618>() {
         public S2S_AncientSwordGetMonster_24618 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_AncientSwordGetMonster_24618(input, extensionRegistry);
         }
      };

      private S2S_AncientSwordGetMonster_24618(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_AncientSwordGetMonster_24618() {
         this.memoizedIsInitialized = -1;
         this.status_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_AncientSwordGetMonster_24618();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_AncientSwordGetMonster_24618(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        AncientMonster.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.monster_.toBuilder();
                        }

                        this.monster_ = (AncientMonster)input.readMessage(AncientSwordMsg.AncientMonster.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.monster_);
                           this.monster_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CrossStatus value = AncientSwordMsg.CrossStatus.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.status_ = rawValue;
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2S_AncientSwordGetMonster_24618_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2S_AncientSwordGetMonster_24618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_AncientSwordGetMonster_24618.class, Builder.class);
      }

      public boolean hasMonster() {
         return (this.bitField0_ & 1) != 0;
      }

      public AncientMonster getMonster() {
         return this.monster_ == null ? AncientSwordMsg.AncientMonster.getDefaultInstance() : this.monster_;
      }

      public AncientMonsterOrBuilder getMonsterOrBuilder() {
         return this.monster_ == null ? AncientSwordMsg.AncientMonster.getDefaultInstance() : this.monster_;
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 2) != 0;
      }

      public CrossStatus getStatus() {
         CrossStatus result = AncientSwordMsg.CrossStatus.valueOf(this.status_);
         return result == null ? AncientSwordMsg.CrossStatus.BORN_DAY_MONSTER : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMonster()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getMonster());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.status_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getMonster());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.status_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_AncientSwordGetMonster_24618)) {
            return super.equals(obj);
         } else {
            S2S_AncientSwordGetMonster_24618 other = (S2S_AncientSwordGetMonster_24618)obj;
            if (this.hasMonster() != other.hasMonster()) {
               return false;
            } else if (this.hasMonster() && !this.getMonster().equals(other.getMonster())) {
               return false;
            } else if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.status_ != other.status_) {
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
            if (this.hasMonster()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMonster().hashCode();
            }

            if (this.hasStatus()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.status_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_AncientSwordGetMonster_24618 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_AncientSwordGetMonster_24618)PARSER.parseFrom(data);
      }

      public static S2S_AncientSwordGetMonster_24618 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_AncientSwordGetMonster_24618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_AncientSwordGetMonster_24618 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_AncientSwordGetMonster_24618)PARSER.parseFrom(data);
      }

      public static S2S_AncientSwordGetMonster_24618 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_AncientSwordGetMonster_24618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_AncientSwordGetMonster_24618 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_AncientSwordGetMonster_24618)PARSER.parseFrom(data);
      }

      public static S2S_AncientSwordGetMonster_24618 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_AncientSwordGetMonster_24618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_AncientSwordGetMonster_24618 parseFrom(InputStream input) throws IOException {
         return (S2S_AncientSwordGetMonster_24618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_AncientSwordGetMonster_24618 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_AncientSwordGetMonster_24618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_AncientSwordGetMonster_24618 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_AncientSwordGetMonster_24618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_AncientSwordGetMonster_24618 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_AncientSwordGetMonster_24618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_AncientSwordGetMonster_24618 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_AncientSwordGetMonster_24618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_AncientSwordGetMonster_24618 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_AncientSwordGetMonster_24618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_AncientSwordGetMonster_24618 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_AncientSwordGetMonster_24618 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_AncientSwordGetMonster_24618> parser() {
         return PARSER;
      }

      public Parser<S2S_AncientSwordGetMonster_24618> getParserForType() {
         return PARSER;
      }

      public S2S_AncientSwordGetMonster_24618 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_AncientSwordGetMonster_24618OrBuilder {
         private int bitField0_;
         private AncientMonster monster_;
         private SingleFieldBuilderV3<AncientMonster, AncientMonster.Builder, AncientMonsterOrBuilder> monsterBuilder_;
         private int status_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2S_AncientSwordGetMonster_24618_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2S_AncientSwordGetMonster_24618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_AncientSwordGetMonster_24618.class, Builder.class);
         }

         private Builder() {
            this.status_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.status_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.S2S_AncientSwordGetMonster_24618.alwaysUseFieldBuilders) {
               this.getMonsterFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.monsterBuilder_ == null) {
               this.monster_ = null;
            } else {
               this.monsterBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.status_ = 1;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2S_AncientSwordGetMonster_24618_descriptor;
         }

         public S2S_AncientSwordGetMonster_24618 getDefaultInstanceForType() {
            return AncientSwordMsg.S2S_AncientSwordGetMonster_24618.getDefaultInstance();
         }

         public S2S_AncientSwordGetMonster_24618 build() {
            S2S_AncientSwordGetMonster_24618 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_AncientSwordGetMonster_24618 buildPartial() {
            S2S_AncientSwordGetMonster_24618 result = new S2S_AncientSwordGetMonster_24618(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.monsterBuilder_ == null) {
                  result.monster_ = this.monster_;
               } else {
                  result.monster_ = (AncientMonster)this.monsterBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.status_ = this.status_;
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
            if (other instanceof S2S_AncientSwordGetMonster_24618) {
               return this.mergeFrom((S2S_AncientSwordGetMonster_24618)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_AncientSwordGetMonster_24618 other) {
            if (other == AncientSwordMsg.S2S_AncientSwordGetMonster_24618.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMonster()) {
                  this.mergeMonster(other.getMonster());
               }

               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMonster()) {
               return false;
            } else {
               return this.hasStatus();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_AncientSwordGetMonster_24618 parsedMessage = null;

            try {
               parsedMessage = (S2S_AncientSwordGetMonster_24618)AncientSwordMsg.S2S_AncientSwordGetMonster_24618.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_AncientSwordGetMonster_24618)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMonster() {
            return (this.bitField0_ & 1) != 0;
         }

         public AncientMonster getMonster() {
            if (this.monsterBuilder_ == null) {
               return this.monster_ == null ? AncientSwordMsg.AncientMonster.getDefaultInstance() : this.monster_;
            } else {
               return (AncientMonster)this.monsterBuilder_.getMessage();
            }
         }

         public Builder setMonster(AncientMonster value) {
            if (this.monsterBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.monster_ = value;
               this.onChanged();
            } else {
               this.monsterBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setMonster(AncientMonster.Builder builderForValue) {
            if (this.monsterBuilder_ == null) {
               this.monster_ = builderForValue.build();
               this.onChanged();
            } else {
               this.monsterBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMonster(AncientMonster value) {
            if (this.monsterBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.monster_ != null && this.monster_ != AncientSwordMsg.AncientMonster.getDefaultInstance()) {
                  this.monster_ = AncientSwordMsg.AncientMonster.newBuilder(this.monster_).mergeFrom(value).buildPartial();
               } else {
                  this.monster_ = value;
               }

               this.onChanged();
            } else {
               this.monsterBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearMonster() {
            if (this.monsterBuilder_ == null) {
               this.monster_ = null;
               this.onChanged();
            } else {
               this.monsterBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public AncientMonster.Builder getMonsterBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (AncientMonster.Builder)this.getMonsterFieldBuilder().getBuilder();
         }

         public AncientMonsterOrBuilder getMonsterOrBuilder() {
            if (this.monsterBuilder_ != null) {
               return (AncientMonsterOrBuilder)this.monsterBuilder_.getMessageOrBuilder();
            } else {
               return this.monster_ == null ? AncientSwordMsg.AncientMonster.getDefaultInstance() : this.monster_;
            }
         }

         private SingleFieldBuilderV3<AncientMonster, AncientMonster.Builder, AncientMonsterOrBuilder> getMonsterFieldBuilder() {
            if (this.monsterBuilder_ == null) {
               this.monsterBuilder_ = new SingleFieldBuilderV3(this.getMonster(), this.getParentForChildren(), this.isClean());
               this.monster_ = null;
            }

            return this.monsterBuilder_;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 2) != 0;
         }

         public CrossStatus getStatus() {
            CrossStatus result = AncientSwordMsg.CrossStatus.valueOf(this.status_);
            return result == null ? AncientSwordMsg.CrossStatus.BORN_DAY_MONSTER : result;
         }

         public Builder setStatus(CrossStatus value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.status_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearStatus() {
            this.bitField0_ &= -3;
            this.status_ = 1;
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

   public static final class C2S_AncientSwordClean_24619 extends GeneratedMessageV3 implements C2S_AncientSwordClean_24619OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordClean_24619 DEFAULT_INSTANCE = new C2S_AncientSwordClean_24619();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordClean_24619> PARSER = new AbstractParser<C2S_AncientSwordClean_24619>() {
         public C2S_AncientSwordClean_24619 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordClean_24619(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordClean_24619(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordClean_24619() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordClean_24619();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordClean_24619(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClean_24619_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClean_24619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordClean_24619.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AncientSwordClean_24619)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordClean_24619 other = (C2S_AncientSwordClean_24619)obj;
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

      public static C2S_AncientSwordClean_24619 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClean_24619)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordClean_24619 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClean_24619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordClean_24619 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClean_24619)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordClean_24619 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClean_24619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordClean_24619 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClean_24619)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordClean_24619 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordClean_24619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordClean_24619 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordClean_24619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordClean_24619 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordClean_24619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordClean_24619 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordClean_24619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordClean_24619 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordClean_24619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordClean_24619 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordClean_24619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordClean_24619 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordClean_24619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordClean_24619 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordClean_24619 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordClean_24619> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordClean_24619> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordClean_24619 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordClean_24619OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClean_24619_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClean_24619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordClean_24619.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordClean_24619.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordClean_24619_descriptor;
         }

         public C2S_AncientSwordClean_24619 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordClean_24619.getDefaultInstance();
         }

         public C2S_AncientSwordClean_24619 build() {
            C2S_AncientSwordClean_24619 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordClean_24619 buildPartial() {
            C2S_AncientSwordClean_24619 result = new C2S_AncientSwordClean_24619(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_AncientSwordClean_24619) {
               return this.mergeFrom((C2S_AncientSwordClean_24619)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordClean_24619 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordClean_24619.getDefaultInstance()) {
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
            C2S_AncientSwordClean_24619 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordClean_24619)AncientSwordMsg.C2S_AncientSwordClean_24619.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordClean_24619)e.getUnfinishedMessage();
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

   public static final class C2S_AncientSwordGetActive_24620 extends GeneratedMessageV3 implements C2S_AncientSwordGetActive_24620OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordGetActive_24620 DEFAULT_INSTANCE = new C2S_AncientSwordGetActive_24620();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordGetActive_24620> PARSER = new AbstractParser<C2S_AncientSwordGetActive_24620>() {
         public C2S_AncientSwordGetActive_24620 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordGetActive_24620(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordGetActive_24620(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordGetActive_24620() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordGetActive_24620();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordGetActive_24620(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetActive_24620_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetActive_24620_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordGetActive_24620.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AncientSwordGetActive_24620)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordGetActive_24620 other = (C2S_AncientSwordGetActive_24620)obj;
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

      public static C2S_AncientSwordGetActive_24620 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetActive_24620)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordGetActive_24620 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetActive_24620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordGetActive_24620 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetActive_24620)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordGetActive_24620 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetActive_24620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordGetActive_24620 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetActive_24620)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordGetActive_24620 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordGetActive_24620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordGetActive_24620 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordGetActive_24620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordGetActive_24620 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordGetActive_24620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordGetActive_24620 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordGetActive_24620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordGetActive_24620 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordGetActive_24620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordGetActive_24620 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordGetActive_24620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordGetActive_24620 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordGetActive_24620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordGetActive_24620 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordGetActive_24620 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordGetActive_24620> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordGetActive_24620> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordGetActive_24620 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordGetActive_24620OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetActive_24620_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetActive_24620_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordGetActive_24620.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordGetActive_24620.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordGetActive_24620_descriptor;
         }

         public C2S_AncientSwordGetActive_24620 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordGetActive_24620.getDefaultInstance();
         }

         public C2S_AncientSwordGetActive_24620 build() {
            C2S_AncientSwordGetActive_24620 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordGetActive_24620 buildPartial() {
            C2S_AncientSwordGetActive_24620 result = new C2S_AncientSwordGetActive_24620(this);
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
            if (other instanceof C2S_AncientSwordGetActive_24620) {
               return this.mergeFrom((C2S_AncientSwordGetActive_24620)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordGetActive_24620 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordGetActive_24620.getDefaultInstance()) {
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
            C2S_AncientSwordGetActive_24620 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordGetActive_24620)AncientSwordMsg.C2S_AncientSwordGetActive_24620.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordGetActive_24620)e.getUnfinishedMessage();
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

   public static final class S2C_AncientSwordGetActive_24621 extends GeneratedMessageV3 implements S2C_AncientSwordGetActive_24621OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_AncientSwordGetActive_24621 DEFAULT_INSTANCE = new S2C_AncientSwordGetActive_24621();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AncientSwordGetActive_24621> PARSER = new AbstractParser<S2C_AncientSwordGetActive_24621>() {
         public S2C_AncientSwordGetActive_24621 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AncientSwordGetActive_24621(input, extensionRegistry);
         }
      };

      private S2C_AncientSwordGetActive_24621(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AncientSwordGetActive_24621() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AncientSwordGetActive_24621();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AncientSwordGetActive_24621(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetActive_24621_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetActive_24621_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordGetActive_24621.class, Builder.class);
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
         } else if (!(obj instanceof S2C_AncientSwordGetActive_24621)) {
            return super.equals(obj);
         } else {
            S2C_AncientSwordGetActive_24621 other = (S2C_AncientSwordGetActive_24621)obj;
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

      public static S2C_AncientSwordGetActive_24621 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetActive_24621)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordGetActive_24621 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetActive_24621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordGetActive_24621 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetActive_24621)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordGetActive_24621 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetActive_24621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordGetActive_24621 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetActive_24621)PARSER.parseFrom(data);
      }

      public static S2C_AncientSwordGetActive_24621 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AncientSwordGetActive_24621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AncientSwordGetActive_24621 parseFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordGetActive_24621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordGetActive_24621 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordGetActive_24621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordGetActive_24621 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AncientSwordGetActive_24621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordGetActive_24621 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordGetActive_24621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AncientSwordGetActive_24621 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AncientSwordGetActive_24621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AncientSwordGetActive_24621 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AncientSwordGetActive_24621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AncientSwordGetActive_24621 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AncientSwordGetActive_24621 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AncientSwordGetActive_24621> parser() {
         return PARSER;
      }

      public Parser<S2C_AncientSwordGetActive_24621> getParserForType() {
         return PARSER;
      }

      public S2C_AncientSwordGetActive_24621 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AncientSwordGetActive_24621OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetActive_24621_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetActive_24621_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AncientSwordGetActive_24621.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.S2C_AncientSwordGetActive_24621.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_S2C_AncientSwordGetActive_24621_descriptor;
         }

         public S2C_AncientSwordGetActive_24621 getDefaultInstanceForType() {
            return AncientSwordMsg.S2C_AncientSwordGetActive_24621.getDefaultInstance();
         }

         public S2C_AncientSwordGetActive_24621 build() {
            S2C_AncientSwordGetActive_24621 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AncientSwordGetActive_24621 buildPartial() {
            S2C_AncientSwordGetActive_24621 result = new S2C_AncientSwordGetActive_24621(this);
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
            if (other instanceof S2C_AncientSwordGetActive_24621) {
               return this.mergeFrom((S2C_AncientSwordGetActive_24621)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AncientSwordGetActive_24621 other) {
            if (other == AncientSwordMsg.S2C_AncientSwordGetActive_24621.getDefaultInstance()) {
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
            S2C_AncientSwordGetActive_24621 parsedMessage = null;

            try {
               parsedMessage = (S2C_AncientSwordGetActive_24621)AncientSwordMsg.S2C_AncientSwordGetActive_24621.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AncientSwordGetActive_24621)e.getUnfinishedMessage();
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

   public static final class C2S_AncientSwordBornRobot_24622 extends GeneratedMessageV3 implements C2S_AncientSwordBornRobot_24622OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MONSTERID_FIELD_NUMBER = 1;
      private int monsterId_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      public static final int BORNALL_FIELD_NUMBER = 3;
      private boolean bornAll_;
      public static final int STATUS_FIELD_NUMBER = 4;
      private int status_;
      private byte memoizedIsInitialized;
      private static final C2S_AncientSwordBornRobot_24622 DEFAULT_INSTANCE = new C2S_AncientSwordBornRobot_24622();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AncientSwordBornRobot_24622> PARSER = new AbstractParser<C2S_AncientSwordBornRobot_24622>() {
         public C2S_AncientSwordBornRobot_24622 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AncientSwordBornRobot_24622(input, extensionRegistry);
         }
      };

      private C2S_AncientSwordBornRobot_24622(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AncientSwordBornRobot_24622() {
         this.memoizedIsInitialized = -1;
         this.status_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AncientSwordBornRobot_24622();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AncientSwordBornRobot_24622(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.monsterId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.bornAll_ = input.readBool();
                        break;
                     case 32:
                        int rawValue = input.readEnum();
                        CrossStatus value = AncientSwordMsg.CrossStatus.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(4, rawValue);
                        } else {
                           this.bitField0_ |= 8;
                           this.status_ = rawValue;
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
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordBornRobot_24622_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordBornRobot_24622_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordBornRobot_24622.class, Builder.class);
      }

      public boolean hasMonsterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMonsterId() {
         return this.monsterId_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasBornAll() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getBornAll() {
         return this.bornAll_;
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 8) != 0;
      }

      public CrossStatus getStatus() {
         CrossStatus result = AncientSwordMsg.CrossStatus.valueOf(this.status_);
         return result == null ? AncientSwordMsg.CrossStatus.BORN_DAY_MONSTER : result;
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
            output.writeInt32(1, this.monsterId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.bornAll_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(4, this.status_);
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
               size += CodedOutputStream.computeInt32Size(1, this.monsterId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.bornAll_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(4, this.status_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AncientSwordBornRobot_24622)) {
            return super.equals(obj);
         } else {
            C2S_AncientSwordBornRobot_24622 other = (C2S_AncientSwordBornRobot_24622)obj;
            if (this.hasMonsterId() != other.hasMonsterId()) {
               return false;
            } else if (this.hasMonsterId() && this.getMonsterId() != other.getMonsterId()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasBornAll() != other.hasBornAll()) {
               return false;
            } else if (this.hasBornAll() && this.getBornAll() != other.getBornAll()) {
               return false;
            } else if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.status_ != other.status_) {
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
            if (this.hasMonsterId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMonsterId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasBornAll()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getBornAll());
            }

            if (this.hasStatus()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.status_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AncientSwordBornRobot_24622 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordBornRobot_24622)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordBornRobot_24622 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordBornRobot_24622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordBornRobot_24622 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordBornRobot_24622)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordBornRobot_24622 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordBornRobot_24622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordBornRobot_24622 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordBornRobot_24622)PARSER.parseFrom(data);
      }

      public static C2S_AncientSwordBornRobot_24622 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AncientSwordBornRobot_24622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AncientSwordBornRobot_24622 parseFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordBornRobot_24622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordBornRobot_24622 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordBornRobot_24622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordBornRobot_24622 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AncientSwordBornRobot_24622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordBornRobot_24622 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordBornRobot_24622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AncientSwordBornRobot_24622 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AncientSwordBornRobot_24622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AncientSwordBornRobot_24622 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AncientSwordBornRobot_24622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AncientSwordBornRobot_24622 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AncientSwordBornRobot_24622 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AncientSwordBornRobot_24622> parser() {
         return PARSER;
      }

      public Parser<C2S_AncientSwordBornRobot_24622> getParserForType() {
         return PARSER;
      }

      public C2S_AncientSwordBornRobot_24622 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AncientSwordBornRobot_24622OrBuilder {
         private int bitField0_;
         private int monsterId_;
         private int num_;
         private boolean bornAll_;
         private int status_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordBornRobot_24622_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordBornRobot_24622_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AncientSwordBornRobot_24622.class, Builder.class);
         }

         private Builder() {
            this.status_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.status_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AncientSwordMsg.C2S_AncientSwordBornRobot_24622.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.monsterId_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            this.bornAll_ = false;
            this.bitField0_ &= -5;
            this.status_ = 1;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AncientSwordMsg.internal_static_ancientSword_com_gzbz_protobuf_C2S_AncientSwordBornRobot_24622_descriptor;
         }

         public C2S_AncientSwordBornRobot_24622 getDefaultInstanceForType() {
            return AncientSwordMsg.C2S_AncientSwordBornRobot_24622.getDefaultInstance();
         }

         public C2S_AncientSwordBornRobot_24622 build() {
            C2S_AncientSwordBornRobot_24622 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AncientSwordBornRobot_24622 buildPartial() {
            C2S_AncientSwordBornRobot_24622 result = new C2S_AncientSwordBornRobot_24622(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.monsterId_ = this.monsterId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.bornAll_ = this.bornAll_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.status_ = this.status_;
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
            if (other instanceof C2S_AncientSwordBornRobot_24622) {
               return this.mergeFrom((C2S_AncientSwordBornRobot_24622)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AncientSwordBornRobot_24622 other) {
            if (other == AncientSwordMsg.C2S_AncientSwordBornRobot_24622.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMonsterId()) {
                  this.setMonsterId(other.getMonsterId());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasBornAll()) {
                  this.setBornAll(other.getBornAll());
               }

               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
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
            C2S_AncientSwordBornRobot_24622 parsedMessage = null;

            try {
               parsedMessage = (C2S_AncientSwordBornRobot_24622)AncientSwordMsg.C2S_AncientSwordBornRobot_24622.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AncientSwordBornRobot_24622)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMonsterId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMonsterId() {
            return this.monsterId_;
         }

         public Builder setMonsterId(int value) {
            this.bitField0_ |= 1;
            this.monsterId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonsterId() {
            this.bitField0_ &= -2;
            this.monsterId_ = 0;
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

         public boolean hasBornAll() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getBornAll() {
            return this.bornAll_;
         }

         public Builder setBornAll(boolean value) {
            this.bitField0_ |= 4;
            this.bornAll_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBornAll() {
            this.bitField0_ &= -5;
            this.bornAll_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 8) != 0;
         }

         public CrossStatus getStatus() {
            CrossStatus result = AncientSwordMsg.CrossStatus.valueOf(this.status_);
            return result == null ? AncientSwordMsg.CrossStatus.BORN_DAY_MONSTER : result;
         }

         public Builder setStatus(CrossStatus value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.status_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearStatus() {
            this.bitField0_ &= -9;
            this.status_ = 1;
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

   public interface AncientHeroOrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasLevel();

      int getLevel();

      boolean hasStar();

      int getStar();

      boolean hasPos();

      int getPos();

      boolean hasDressId();

      int getDressId();
   }

   public interface AncientMonsterOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasKey();

      int getKey();

      boolean hasLv();

      int getLv();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      List<AncientHero> getAncientHeroList();

      AncientHero getAncientHero(int index);

      int getAncientHeroCount();

      List<? extends AncientHeroOrBuilder> getAncientHeroOrBuilderList();

      AncientHeroOrBuilder getAncientHeroOrBuilder(int index);

      boolean hasPower();

      long getPower();

      boolean hasArray();

      ByteString getArray();

      boolean hasIndex();

      int getIndex();

      boolean hasHeroId();

      int getHeroId();
   }

   public interface C2S_AncientSwordBornRobot_24622OrBuilder extends MessageOrBuilder {
      boolean hasMonsterId();

      int getMonsterId();

      boolean hasNum();

      int getNum();

      boolean hasBornAll();

      boolean getBornAll();

      boolean hasStatus();

      CrossStatus getStatus();
   }

   public interface C2S_AncientSwordClean_24619OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_AncientSwordClear_24609OrBuilder extends MessageOrBuilder {
      boolean hasClear();

      boolean getClear();
   }

   public interface C2S_AncientSwordCommitTask_24607OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_AncientSwordCommitTask_24613OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_AncientSwordFlush_24605OrBuilder extends MessageOrBuilder {
      boolean hasKey();

      int getKey();

      boolean hasDirectFlush();

      boolean getDirectFlush();
   }

   public interface C2S_AncientSwordGetActive_24620OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_AncientSwordGetSword_24603OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_AncientSwordMain_24601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_AncientSwordTokenBuy_24615OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasCount();

      int getCount();
   }

   public interface C2S_AncientSwordTokenMain_24611OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_AncientSwordBornMonster_24617OrBuilder extends MessageOrBuilder {
      boolean hasDestServerId();

      int getDestServerId();

      boolean hasDestPlayerId();

      int getDestPlayerId();

      boolean hasMonsterId();

      int getMonsterId();

      boolean hasStatus();

      CrossStatus getStatus();
   }

   public interface S2CR_AncientSwordBornMonster_24616OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPower();

      long getPower();

      List<Integer> getMonsterIdList();

      int getMonsterIdCount();

      int getMonsterId(int index);

      List<Integer> getExistPlayerList();

      int getExistPlayerCount();

      int getExistPlayer(int index);

      boolean hasStatus();

      CrossStatus getStatus();
   }

   public interface S2C_AncientSwordClear_24610OrBuilder extends MessageOrBuilder {
      boolean hasClear();

      boolean getClear();
   }

   public interface S2C_AncientSwordCommitTask_24608OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);

      List<Integer> getBuffIdList();

      int getBuffIdCount();

      int getBuffId(int index);

      boolean hasActiveValue();

      int getActiveValue();
   }

   public interface S2C_AncientSwordCommitTask_24614OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_AncientSwordFlush_24606OrBuilder extends MessageOrBuilder {
      List<AncientMonster> getMList();

      AncientMonster getM(int index);

      int getMCount();

      List<? extends AncientMonsterOrBuilder> getMOrBuilderList();

      AncientMonsterOrBuilder getMOrBuilder(int index);

      boolean hasFlushTime();

      int getFlushTime();

      boolean hasSchedule();

      int getSchedule();

      boolean hasShopCountdown();

      int getShopCountdown();
   }

   public interface S2C_AncientSwordGetActive_24621OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_AncientSwordGetSword_24604OrBuilder extends MessageOrBuilder {
      boolean hasSchedule();

      int getSchedule();

      boolean hasHasGet();

      boolean getHasGet();
   }

   public interface S2C_AncientSwordMain_24602OrBuilder extends MessageOrBuilder {
      boolean hasGas();

      int getGas();

      boolean hasHasUnlock();

      boolean getHasUnlock();

      List<AncientMonster> getDayMList();

      AncientMonster getDayM(int index);

      int getDayMCount();

      List<? extends AncientMonsterOrBuilder> getDayMOrBuilderList();

      AncientMonsterOrBuilder getDayMOrBuilder(int index);

      List<AncientMonster> getWeekMList();

      AncientMonster getWeekM(int index);

      int getWeekMCount();

      List<? extends AncientMonsterOrBuilder> getWeekMOrBuilderList();

      AncientMonsterOrBuilder getWeekMOrBuilder(int index);

      boolean hasShopCountdown();

      int getShopCountdown();

      List<Integer> getBuffIdList();

      int getBuffIdCount();

      int getBuffId(int index);

      boolean hasActiveValue();

      int getActiveValue();

      List<Integer> getActiveRewardList();

      int getActiveRewardCount();

      int getActiveReward(int index);

      boolean hasFlushTime();

      int getFlushTime();

      List<ActivityMsg.TaskData> getBountyTaskList();

      ActivityMsg.TaskData getBountyTask(int index);

      int getBountyTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getBountyTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getBountyTaskOrBuilder(int index);

      boolean hasTaskEnd();

      int getTaskEnd();

      boolean hasActiveEnd();

      int getActiveEnd();
   }

   public interface S2C_AncientSwordTokenMain_24612OrBuilder extends MessageOrBuilder {
      boolean hasIntegral();

      int getIntegral();

      boolean hasLevel();

      int getLevel();

      boolean hasVIP();

      boolean getVIP();

      boolean hasStartTime();

      long getStartTime();

      boolean hasEndTime();

      long getEndTime();

      boolean hasBuyIntegral();

      int getBuyIntegral();

      boolean hasBuyLv();

      int getBuyLv();

      List<ActivityMsg.TaskData> getDayTaskList();

      ActivityMsg.TaskData getDayTask(int index);

      int getDayTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getDayTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getDayTaskOrBuilder(int index);

      boolean hasDayReset();

      long getDayReset();

      List<ActivityMsg.TaskData> getWeekTaskList();

      ActivityMsg.TaskData getWeekTask(int index);

      int getWeekTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getWeekTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getWeekTaskOrBuilder(int index);

      boolean hasWeekReset();

      long getWeekReset();

      List<ActivityMsg.TaskData> getMonthTaskList();

      ActivityMsg.TaskData getMonthTask(int index);

      int getMonthTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getMonthTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getMonthTaskOrBuilder(int index);

      boolean hasMonthReset();

      long getMonthReset();
   }

   public interface S2S_AncientSwordGetMonster_24618OrBuilder extends MessageOrBuilder {
      boolean hasMonster();

      AncientMonster getMonster();

      AncientMonsterOrBuilder getMonsterOrBuilder();

      boolean hasStatus();

      CrossStatus getStatus();
   }
}
