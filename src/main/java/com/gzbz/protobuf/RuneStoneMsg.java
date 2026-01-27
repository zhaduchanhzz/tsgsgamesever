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

public final class RuneStoneMsg {
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_WearRuneStone_5401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_WearRuneStone_5401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_WearRuneStone_5402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_WearRuneStone_5402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_UndressRuneStone_5403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_UndressRuneStone_5403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_UndressRuneStone_5404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_UndressRuneStone_5404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneInherit_5407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneInherit_5407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneInherit_5408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneInherit_5408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneRecruitment_5409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneRecruitment_5409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneRecruitment_5410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneRecruitment_5410_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5411_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5411_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5412_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5412_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneDecompose_5413_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneDecompose_5413_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneDecompose_5414_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneDecompose_5414_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_RuneRecordList_5415_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_RuneRecordList_5415_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_RuneRecordList_5416_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_RuneRecordList_5416_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_RuneRecordData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_RuneRecordData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_ComposeStone_5418_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_ComposeStone_5418_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_ComposeStone_5419_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_ComposeStone_5419_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_HeroStoneLock_5420_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_HeroStoneLock_5420_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_HeroStoneLock_5421_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_HeroStoneLock_5421_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_BagStoneLock_5422_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_BagStoneLock_5422_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_BagStoneLock_5423_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_BagStoneLock_5423_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneHeroStrengthen_5426_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneHeroStrengthen_5426_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneHeroStrength_5427_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneHeroStrength_5427_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private RuneStoneMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fRuneStone.proto\u0012\u001bruneStone.com.gzbz.protobuf\u001a\fcommon.proto\"y\n\u0016C2S_WearRuneStone_5401\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\u0012\u0010\n\bitemCode\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000btypeOperate\u0018\u0004 \u0002(\u0005\"\u009a\u0001\n\u0016S2C_WearRuneStone_5402\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012#\n\u0004info\u0018\u0002 \u0001(\u000b2\u0015.common.RuneStoneWear\u0012$\n\u0006proAll\u0018\u0003 \u0003(\u000b2\u0014.common.RuneStonePro\u0012\u000e\n\u0006levSum\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000btypeOperate\u0018\u0005 \u0002(\u0005\"U\n\u0019C2S_UndressRuneStone_5403\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\"{\n\u0019S2C_UndressRuneStone_5404\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\u0012$\n\u0006proAll\u0018\u0004 \u0003(\u000b2\u0014.common.RuneStonePro\"{\n\u0017C2S_RuneStoneUpLev_5405\u0012&\n\bposition\u0018\u0001 \u0002(\u000e2\u0014.common.WearPosition\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000bconsumeItem\u0018\u0003 \u0003(\u0005\u0012\u0011\n\textraCode\u0018\u0004 \u0003(\u0005\"`\n\u0017S2C_RuneStoneUpLev_5406\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012#\n\u0004info\u0018\u0002 \u0002(\u000b2\u0015.common.RuneStoneWear\u0012\u000e\n\u0006levSum\u0018\u0004 \u0002(\u0005\"\u008a\u0001\n\u0019C2S_RuneStoneInherit_5407\u0012&\n\bposition\u0018\u0001 \u0002(\u000e2\u0014.common.WearPosition\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bitemCode\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006proKey\u0018\u0004 \u0002(\u0005\u0012\u0011\n\ttargetKey\u0018\u0005 \u0002(\u0005\"w\n\u0019S2C_RuneStoneInherit_5408\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012#\n\u0004info\u0018\u0002 \u0002(\u000b2\u0015.common.RuneStoneWear\u0012#\n\bruneItem\u0018\u0003 \u0002(\u000b2\u0011.common.RuneStone\"-\n\u001dC2S_RuneStoneRecruitment_5409\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"A\n\u001dS2C_RuneStoneRecruitment_5410\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0002 \u0001(\u0005\"O\n\u0017C2S_RuneStoneUpLev_5411\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000bconsumeItem\u0018\u0003 \u0003(\u0005\u0012\u0011\n\textraCode\u0018\u0004 \u0003(\u0005\"H\n\u0017S2C_RuneStoneUpLev_5412\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u001f\n\u0004info\u0018\u0002 \u0002(\u000b2\u0011.common.RuneStone\"+\n\u001bC2S_RuneStoneDecompose_5413\u0012\f\n\u0004code\u0018\u0002 \u0003(\u0005\"-\n\u001bS2C_RuneStoneDecompose_5414\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_RuneRecordList_5415\"¼\u0001\n\u0017S2C_RuneRecordList_5416\u0012=\n\bmyRecord\u0018\u0001 \u0003(\u000b2+.runeStone.com.gzbz.protobuf.RuneRecordData\u0012>\n\tallRecord\u0018\u0002 \u0003(\u000b2+.runeStone.com.gzbz.protobuf.RuneRecordData\u0012\u000e\n\u0006isFree\u0018\u0003 \u0001(\b\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0001(\u0005\"u\n\u000eRuneRecordData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\u0014\n\fresourceType\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nresourceId\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bresourceNum\u0018\u0005 \u0002(\u0005\";\n\u0015C2S_ComposeStone_5418\u0012\u0010\n\bitemCode\u0018\u0001 \u0003(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0003(\u0005\"'\n\u0015S2C_ComposeStone_5419\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"g\n\u0016C2S_HeroStoneLock_5420\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\u0012\u0013\n\u000btypeOperate\u0018\u0003 \u0002(\u0005\"g\n\u0016S2C_HeroStoneLock_5421\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\u0012\u0013\n\u000btypeOperate\u0018\u0003 \u0002(\u0005\">\n\u0015C2S_BagStoneLock_5422\u0012\u0010\n\bitemCode\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000btypeOperate\u0018\u0002 \u0002(\u0005\"N\n\u0015S2C_BagStoneLock_5423\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000btypeOperate\u0018\u0003 \u0002(\u0005\"\\\n C2S_RuneStoneHeroStrengthen_5426\u0012&\n\bposition\u0018\u0001 \u0002(\u000e2\u0014.common.WearPosition\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"\u007f\n\u001eS2C_RuneStoneHeroStrength_5427\u0012&\n\bposition\u0018\u0001 \u0002(\u000e2\u0014.common.WearPosition\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012#\n\u0004info\u0018\u0003 \u0002(\u000b2\u0015.common.RuneStoneWearB#\n\u0011com.gzbz.protobufB\fRuneStoneMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_runeStone_com_gzbz_protobuf_C2S_WearRuneStone_5401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_runeStone_com_gzbz_protobuf_C2S_WearRuneStone_5401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_WearRuneStone_5401_descriptor, new String[]{"HeroCode", "Position", "ItemCode", "TypeOperate"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_WearRuneStone_5402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_runeStone_com_gzbz_protobuf_S2C_WearRuneStone_5402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_WearRuneStone_5402_descriptor, new String[]{"HeroCode", "Info", "ProAll", "LevSum", "TypeOperate"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_UndressRuneStone_5403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_runeStone_com_gzbz_protobuf_C2S_UndressRuneStone_5403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_UndressRuneStone_5403_descriptor, new String[]{"HeroCode", "Position"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_UndressRuneStone_5404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_runeStone_com_gzbz_protobuf_S2C_UndressRuneStone_5404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_UndressRuneStone_5404_descriptor, new String[]{"HeroCode", "Position", "ProAll"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5405_descriptor, new String[]{"Position", "HeroCode", "ConsumeItem", "ExtraCode"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5406_descriptor, new String[]{"HeroCode", "Info", "LevSum"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneInherit_5407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneInherit_5407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneInherit_5407_descriptor, new String[]{"Position", "HeroCode", "ItemCode", "ProKey", "TargetKey"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneInherit_5408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneInherit_5408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneInherit_5408_descriptor, new String[]{"HeroCode", "Info", "RuneItem"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneRecruitment_5409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneRecruitment_5409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneRecruitment_5409_descriptor, new String[]{"Type"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneRecruitment_5410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneRecruitment_5410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneRecruitment_5410_descriptor, new String[]{"Type", "RecruitNum"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5411_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5411_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5411_descriptor, new String[]{"Code", "ConsumeItem", "ExtraCode"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5412_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5412_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5412_descriptor, new String[]{"Code", "Info"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneDecompose_5413_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneDecompose_5413_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneDecompose_5413_descriptor, new String[]{"Code"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneDecompose_5414_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneDecompose_5414_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneDecompose_5414_descriptor, new String[]{"Result"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneRecordList_5415_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneRecordList_5415_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_RuneRecordList_5415_descriptor, new String[0]);
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneRecordList_5416_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneRecordList_5416_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_RuneRecordList_5416_descriptor, new String[]{"MyRecord", "AllRecord", "IsFree", "RecruitNum"});
      internal_static_runeStone_com_gzbz_protobuf_RuneRecordData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_runeStone_com_gzbz_protobuf_RuneRecordData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_RuneRecordData_descriptor, new String[]{"PlayerId", "PlayerName", "ResourceType", "ResourceId", "ResourceNum"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_ComposeStone_5418_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_runeStone_com_gzbz_protobuf_C2S_ComposeStone_5418_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_ComposeStone_5418_descriptor, new String[]{"ItemCode", "TargetId"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_ComposeStone_5419_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_runeStone_com_gzbz_protobuf_S2C_ComposeStone_5419_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_ComposeStone_5419_descriptor, new String[]{"Result"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_HeroStoneLock_5420_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_runeStone_com_gzbz_protobuf_C2S_HeroStoneLock_5420_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_HeroStoneLock_5420_descriptor, new String[]{"HeroCode", "Position", "TypeOperate"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_HeroStoneLock_5421_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_runeStone_com_gzbz_protobuf_S2C_HeroStoneLock_5421_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_HeroStoneLock_5421_descriptor, new String[]{"HeroCode", "Position", "TypeOperate"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_BagStoneLock_5422_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_runeStone_com_gzbz_protobuf_C2S_BagStoneLock_5422_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_BagStoneLock_5422_descriptor, new String[]{"ItemCode", "TypeOperate"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_BagStoneLock_5423_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_runeStone_com_gzbz_protobuf_S2C_BagStoneLock_5423_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_BagStoneLock_5423_descriptor, new String[]{"Result", "ItemCode", "TypeOperate"});
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneHeroStrengthen_5426_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneHeroStrengthen_5426_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneHeroStrengthen_5426_descriptor, new String[]{"Position", "HeroCode"});
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneHeroStrength_5427_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneHeroStrength_5427_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneHeroStrength_5427_descriptor, new String[]{"Position", "HeroCode", "Info"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_WearRuneStone_5401 extends GeneratedMessageV3 implements C2S_WearRuneStone_5401OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int ITEMCODE_FIELD_NUMBER = 3;
      private int itemCode_;
      public static final int TYPEOPERATE_FIELD_NUMBER = 4;
      private int typeOperate_;
      private byte memoizedIsInitialized;
      private static final C2S_WearRuneStone_5401 DEFAULT_INSTANCE = new C2S_WearRuneStone_5401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WearRuneStone_5401> PARSER = new AbstractParser<C2S_WearRuneStone_5401>() {
         public C2S_WearRuneStone_5401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WearRuneStone_5401(input, extensionRegistry);
         }
      };

      private C2S_WearRuneStone_5401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WearRuneStone_5401() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WearRuneStone_5401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WearRuneStone_5401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.typeOperate_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_WearRuneStone_5401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_WearRuneStone_5401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WearRuneStone_5401.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasTypeOperate() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTypeOperate() {
         return this.typeOperate_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItemCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTypeOperate()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.itemCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.typeOperate_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.itemCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.typeOperate_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WearRuneStone_5401)) {
            return super.equals(obj);
         } else {
            C2S_WearRuneStone_5401 other = (C2S_WearRuneStone_5401)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasTypeOperate() != other.hasTypeOperate()) {
               return false;
            } else if (this.hasTypeOperate() && this.getTypeOperate() != other.getTypeOperate()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasTypeOperate()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTypeOperate();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WearRuneStone_5401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WearRuneStone_5401)PARSER.parseFrom(data);
      }

      public static C2S_WearRuneStone_5401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearRuneStone_5401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearRuneStone_5401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WearRuneStone_5401)PARSER.parseFrom(data);
      }

      public static C2S_WearRuneStone_5401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearRuneStone_5401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearRuneStone_5401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WearRuneStone_5401)PARSER.parseFrom(data);
      }

      public static C2S_WearRuneStone_5401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearRuneStone_5401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearRuneStone_5401 parseFrom(InputStream input) throws IOException {
         return (C2S_WearRuneStone_5401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WearRuneStone_5401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearRuneStone_5401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WearRuneStone_5401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WearRuneStone_5401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WearRuneStone_5401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearRuneStone_5401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WearRuneStone_5401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WearRuneStone_5401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WearRuneStone_5401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearRuneStone_5401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WearRuneStone_5401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WearRuneStone_5401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WearRuneStone_5401> parser() {
         return PARSER;
      }

      public Parser<C2S_WearRuneStone_5401> getParserForType() {
         return PARSER;
      }

      public C2S_WearRuneStone_5401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WearRuneStone_5401OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int itemCode_;
         private int typeOperate_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_WearRuneStone_5401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_WearRuneStone_5401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WearRuneStone_5401.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_WearRuneStone_5401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.bitField0_ &= -5;
            this.typeOperate_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_WearRuneStone_5401_descriptor;
         }

         public C2S_WearRuneStone_5401 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_WearRuneStone_5401.getDefaultInstance();
         }

         public C2S_WearRuneStone_5401 build() {
            C2S_WearRuneStone_5401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WearRuneStone_5401 buildPartial() {
            C2S_WearRuneStone_5401 result = new C2S_WearRuneStone_5401(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 4) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.typeOperate_ = this.typeOperate_;
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
            if (other instanceof C2S_WearRuneStone_5401) {
               return this.mergeFrom((C2S_WearRuneStone_5401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WearRuneStone_5401 other) {
            if (other == RuneStoneMsg.C2S_WearRuneStone_5401.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasTypeOperate()) {
                  this.setTypeOperate(other.getTypeOperate());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else if (!this.hasItemCode()) {
               return false;
            } else {
               return this.hasTypeOperate();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WearRuneStone_5401 parsedMessage = null;

            try {
               parsedMessage = (C2S_WearRuneStone_5401)RuneStoneMsg.C2S_WearRuneStone_5401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WearRuneStone_5401)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 4;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -5;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTypeOperate() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTypeOperate() {
            return this.typeOperate_;
         }

         public Builder setTypeOperate(int value) {
            this.bitField0_ |= 8;
            this.typeOperate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTypeOperate() {
            this.bitField0_ &= -9;
            this.typeOperate_ = 0;
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

   public static final class S2C_WearRuneStone_5402 extends GeneratedMessageV3 implements S2C_WearRuneStone_5402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int INFO_FIELD_NUMBER = 2;
      private CommonMsg.RuneStoneWear info_;
      public static final int PROALL_FIELD_NUMBER = 3;
      private List<CommonMsg.RuneStonePro> proAll_;
      public static final int LEVSUM_FIELD_NUMBER = 4;
      private int levSum_;
      public static final int TYPEOPERATE_FIELD_NUMBER = 5;
      private int typeOperate_;
      private byte memoizedIsInitialized;
      private static final S2C_WearRuneStone_5402 DEFAULT_INSTANCE = new S2C_WearRuneStone_5402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WearRuneStone_5402> PARSER = new AbstractParser<S2C_WearRuneStone_5402>() {
         public S2C_WearRuneStone_5402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WearRuneStone_5402(input, extensionRegistry);
         }
      };

      private S2C_WearRuneStone_5402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WearRuneStone_5402() {
         this.memoizedIsInitialized = -1;
         this.proAll_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WearRuneStone_5402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WearRuneStone_5402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.RuneStoneWear.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (CommonMsg.RuneStoneWear)input.readMessage(CommonMsg.RuneStoneWear.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.proAll_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.proAll_.add(input.readMessage(CommonMsg.RuneStonePro.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.levSum_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.typeOperate_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.proAll_ = Collections.unmodifiableList(this.proAll_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_WearRuneStone_5402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_WearRuneStone_5402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearRuneStone_5402.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RuneStoneWear getInfo() {
         return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
      }

      public CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
      }

      public List<CommonMsg.RuneStonePro> getProAllList() {
         return this.proAll_;
      }

      public List<? extends CommonMsg.RuneStoneProOrBuilder> getProAllOrBuilderList() {
         return this.proAll_;
      }

      public int getProAllCount() {
         return this.proAll_.size();
      }

      public CommonMsg.RuneStonePro getProAll(int index) {
         return (CommonMsg.RuneStonePro)this.proAll_.get(index);
      }

      public CommonMsg.RuneStoneProOrBuilder getProAllOrBuilder(int index) {
         return (CommonMsg.RuneStoneProOrBuilder)this.proAll_.get(index);
      }

      public boolean hasLevSum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevSum() {
         return this.levSum_;
      }

      public boolean hasTypeOperate() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTypeOperate() {
         return this.typeOperate_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTypeOperate()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasInfo() && !this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getProAllCount(); ++i) {
               if (!this.getProAll(i).isInitialized()) {
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getInfo());
         }

         for(int i = 0; i < this.proAll_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.proAll_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.levSum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.typeOperate_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getInfo());
            }

            for(int i = 0; i < this.proAll_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.proAll_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.levSum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.typeOperate_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WearRuneStone_5402)) {
            return super.equals(obj);
         } else {
            S2C_WearRuneStone_5402 other = (S2C_WearRuneStone_5402)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (!this.getProAllList().equals(other.getProAllList())) {
               return false;
            } else if (this.hasLevSum() != other.hasLevSum()) {
               return false;
            } else if (this.hasLevSum() && this.getLevSum() != other.getLevSum()) {
               return false;
            } else if (this.hasTypeOperate() != other.hasTypeOperate()) {
               return false;
            } else if (this.hasTypeOperate() && this.getTypeOperate() != other.getTypeOperate()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            if (this.getProAllCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getProAllList().hashCode();
            }

            if (this.hasLevSum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLevSum();
            }

            if (this.hasTypeOperate()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTypeOperate();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WearRuneStone_5402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WearRuneStone_5402)PARSER.parseFrom(data);
      }

      public static S2C_WearRuneStone_5402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearRuneStone_5402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearRuneStone_5402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WearRuneStone_5402)PARSER.parseFrom(data);
      }

      public static S2C_WearRuneStone_5402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearRuneStone_5402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearRuneStone_5402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WearRuneStone_5402)PARSER.parseFrom(data);
      }

      public static S2C_WearRuneStone_5402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearRuneStone_5402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearRuneStone_5402 parseFrom(InputStream input) throws IOException {
         return (S2C_WearRuneStone_5402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearRuneStone_5402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearRuneStone_5402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearRuneStone_5402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WearRuneStone_5402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WearRuneStone_5402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearRuneStone_5402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearRuneStone_5402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WearRuneStone_5402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearRuneStone_5402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearRuneStone_5402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WearRuneStone_5402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WearRuneStone_5402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WearRuneStone_5402> parser() {
         return PARSER;
      }

      public Parser<S2C_WearRuneStone_5402> getParserForType() {
         return PARSER;
      }

      public S2C_WearRuneStone_5402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WearRuneStone_5402OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private CommonMsg.RuneStoneWear info_;
         private SingleFieldBuilderV3<CommonMsg.RuneStoneWear, CommonMsg.RuneStoneWear.Builder, CommonMsg.RuneStoneWearOrBuilder> infoBuilder_;
         private List<CommonMsg.RuneStonePro> proAll_;
         private RepeatedFieldBuilderV3<CommonMsg.RuneStonePro, CommonMsg.RuneStonePro.Builder, CommonMsg.RuneStoneProOrBuilder> proAllBuilder_;
         private int levSum_;
         private int typeOperate_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_WearRuneStone_5402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_WearRuneStone_5402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearRuneStone_5402.class, Builder.class);
         }

         private Builder() {
            this.proAll_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.proAll_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_WearRuneStone_5402.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
               this.getProAllFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.proAllBuilder_ == null) {
               this.proAll_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.proAllBuilder_.clear();
            }

            this.levSum_ = 0;
            this.bitField0_ &= -9;
            this.typeOperate_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_WearRuneStone_5402_descriptor;
         }

         public S2C_WearRuneStone_5402 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_WearRuneStone_5402.getDefaultInstance();
         }

         public S2C_WearRuneStone_5402 build() {
            S2C_WearRuneStone_5402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WearRuneStone_5402 buildPartial() {
            S2C_WearRuneStone_5402 result = new S2C_WearRuneStone_5402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (CommonMsg.RuneStoneWear)this.infoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if (this.proAllBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.proAll_ = Collections.unmodifiableList(this.proAll_);
                  this.bitField0_ &= -5;
               }

               result.proAll_ = this.proAll_;
            } else {
               result.proAll_ = this.proAllBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.levSum_ = this.levSum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.typeOperate_ = this.typeOperate_;
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
            if (other instanceof S2C_WearRuneStone_5402) {
               return this.mergeFrom((S2C_WearRuneStone_5402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WearRuneStone_5402 other) {
            if (other == RuneStoneMsg.S2C_WearRuneStone_5402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (this.proAllBuilder_ == null) {
                  if (!other.proAll_.isEmpty()) {
                     if (this.proAll_.isEmpty()) {
                        this.proAll_ = other.proAll_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureProAllIsMutable();
                        this.proAll_.addAll(other.proAll_);
                     }

                     this.onChanged();
                  }
               } else if (!other.proAll_.isEmpty()) {
                  if (this.proAllBuilder_.isEmpty()) {
                     this.proAllBuilder_.dispose();
                     this.proAllBuilder_ = null;
                     this.proAll_ = other.proAll_;
                     this.bitField0_ &= -5;
                     this.proAllBuilder_ = RuneStoneMsg.S2C_WearRuneStone_5402.alwaysUseFieldBuilders ? this.getProAllFieldBuilder() : null;
                  } else {
                     this.proAllBuilder_.addAllMessages(other.proAll_);
                  }
               }

               if (other.hasLevSum()) {
                  this.setLevSum(other.getLevSum());
               }

               if (other.hasTypeOperate()) {
                  this.setTypeOperate(other.getTypeOperate());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasLevSum()) {
               return false;
            } else if (!this.hasTypeOperate()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getProAllCount(); ++i) {
                  if (!this.getProAll(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WearRuneStone_5402 parsedMessage = null;

            try {
               parsedMessage = (S2C_WearRuneStone_5402)RuneStoneMsg.S2C_WearRuneStone_5402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WearRuneStone_5402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RuneStoneWear getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
            } else {
               return (CommonMsg.RuneStoneWear)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(CommonMsg.RuneStoneWear value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setInfo(CommonMsg.RuneStoneWear.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(CommonMsg.RuneStoneWear value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != CommonMsg.RuneStoneWear.getDefaultInstance()) {
                  this.info_ = CommonMsg.RuneStoneWear.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.RuneStoneWear.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.RuneStoneWear.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (CommonMsg.RuneStoneWearOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.RuneStoneWear, CommonMsg.RuneStoneWear.Builder, CommonMsg.RuneStoneWearOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         private void ensureProAllIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.proAll_ = new ArrayList(this.proAll_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.RuneStonePro> getProAllList() {
            return this.proAllBuilder_ == null ? Collections.unmodifiableList(this.proAll_) : this.proAllBuilder_.getMessageList();
         }

         public int getProAllCount() {
            return this.proAllBuilder_ == null ? this.proAll_.size() : this.proAllBuilder_.getCount();
         }

         public CommonMsg.RuneStonePro getProAll(int index) {
            return this.proAllBuilder_ == null ? (CommonMsg.RuneStonePro)this.proAll_.get(index) : (CommonMsg.RuneStonePro)this.proAllBuilder_.getMessage(index);
         }

         public Builder setProAll(int index, CommonMsg.RuneStonePro value) {
            if (this.proAllBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProAllIsMutable();
               this.proAll_.set(index, value);
               this.onChanged();
            } else {
               this.proAllBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setProAll(int index, CommonMsg.RuneStonePro.Builder builderForValue) {
            if (this.proAllBuilder_ == null) {
               this.ensureProAllIsMutable();
               this.proAll_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.proAllBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addProAll(CommonMsg.RuneStonePro value) {
            if (this.proAllBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProAllIsMutable();
               this.proAll_.add(value);
               this.onChanged();
            } else {
               this.proAllBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addProAll(int index, CommonMsg.RuneStonePro value) {
            if (this.proAllBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProAllIsMutable();
               this.proAll_.add(index, value);
               this.onChanged();
            } else {
               this.proAllBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addProAll(CommonMsg.RuneStonePro.Builder builderForValue) {
            if (this.proAllBuilder_ == null) {
               this.ensureProAllIsMutable();
               this.proAll_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.proAllBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addProAll(int index, CommonMsg.RuneStonePro.Builder builderForValue) {
            if (this.proAllBuilder_ == null) {
               this.ensureProAllIsMutable();
               this.proAll_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.proAllBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllProAll(Iterable<? extends CommonMsg.RuneStonePro> values) {
            if (this.proAllBuilder_ == null) {
               this.ensureProAllIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.proAll_);
               this.onChanged();
            } else {
               this.proAllBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearProAll() {
            if (this.proAllBuilder_ == null) {
               this.proAll_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.proAllBuilder_.clear();
            }

            return this;
         }

         public Builder removeProAll(int index) {
            if (this.proAllBuilder_ == null) {
               this.ensureProAllIsMutable();
               this.proAll_.remove(index);
               this.onChanged();
            } else {
               this.proAllBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.RuneStonePro.Builder getProAllBuilder(int index) {
            return (CommonMsg.RuneStonePro.Builder)this.getProAllFieldBuilder().getBuilder(index);
         }

         public CommonMsg.RuneStoneProOrBuilder getProAllOrBuilder(int index) {
            return this.proAllBuilder_ == null ? (CommonMsg.RuneStoneProOrBuilder)this.proAll_.get(index) : (CommonMsg.RuneStoneProOrBuilder)this.proAllBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.RuneStoneProOrBuilder> getProAllOrBuilderList() {
            return this.proAllBuilder_ != null ? this.proAllBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.proAll_);
         }

         public CommonMsg.RuneStonePro.Builder addProAllBuilder() {
            return (CommonMsg.RuneStonePro.Builder)this.getProAllFieldBuilder().addBuilder(CommonMsg.RuneStonePro.getDefaultInstance());
         }

         public CommonMsg.RuneStonePro.Builder addProAllBuilder(int index) {
            return (CommonMsg.RuneStonePro.Builder)this.getProAllFieldBuilder().addBuilder(index, CommonMsg.RuneStonePro.getDefaultInstance());
         }

         public List<CommonMsg.RuneStonePro.Builder> getProAllBuilderList() {
            return this.getProAllFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.RuneStonePro, CommonMsg.RuneStonePro.Builder, CommonMsg.RuneStoneProOrBuilder> getProAllFieldBuilder() {
            if (this.proAllBuilder_ == null) {
               this.proAllBuilder_ = new RepeatedFieldBuilderV3(this.proAll_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.proAll_ = null;
            }

            return this.proAllBuilder_;
         }

         public boolean hasLevSum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getLevSum() {
            return this.levSum_;
         }

         public Builder setLevSum(int value) {
            this.bitField0_ |= 8;
            this.levSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevSum() {
            this.bitField0_ &= -9;
            this.levSum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTypeOperate() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getTypeOperate() {
            return this.typeOperate_;
         }

         public Builder setTypeOperate(int value) {
            this.bitField0_ |= 16;
            this.typeOperate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTypeOperate() {
            this.bitField0_ &= -17;
            this.typeOperate_ = 0;
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

   public static final class C2S_UndressRuneStone_5403 extends GeneratedMessageV3 implements C2S_UndressRuneStone_5403OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_UndressRuneStone_5403 DEFAULT_INSTANCE = new C2S_UndressRuneStone_5403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UndressRuneStone_5403> PARSER = new AbstractParser<C2S_UndressRuneStone_5403>() {
         public C2S_UndressRuneStone_5403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UndressRuneStone_5403(input, extensionRegistry);
         }
      };

      private C2S_UndressRuneStone_5403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UndressRuneStone_5403() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UndressRuneStone_5403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UndressRuneStone_5403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_UndressRuneStone_5403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_UndressRuneStone_5403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UndressRuneStone_5403.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UndressRuneStone_5403)) {
            return super.equals(obj);
         } else {
            C2S_UndressRuneStone_5403 other = (C2S_UndressRuneStone_5403)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UndressRuneStone_5403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UndressRuneStone_5403)PARSER.parseFrom(data);
      }

      public static C2S_UndressRuneStone_5403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressRuneStone_5403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressRuneStone_5403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UndressRuneStone_5403)PARSER.parseFrom(data);
      }

      public static C2S_UndressRuneStone_5403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressRuneStone_5403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressRuneStone_5403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UndressRuneStone_5403)PARSER.parseFrom(data);
      }

      public static C2S_UndressRuneStone_5403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressRuneStone_5403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressRuneStone_5403 parseFrom(InputStream input) throws IOException {
         return (C2S_UndressRuneStone_5403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UndressRuneStone_5403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressRuneStone_5403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UndressRuneStone_5403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UndressRuneStone_5403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UndressRuneStone_5403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressRuneStone_5403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UndressRuneStone_5403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UndressRuneStone_5403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UndressRuneStone_5403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressRuneStone_5403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UndressRuneStone_5403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UndressRuneStone_5403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UndressRuneStone_5403> parser() {
         return PARSER;
      }

      public Parser<C2S_UndressRuneStone_5403> getParserForType() {
         return PARSER;
      }

      public C2S_UndressRuneStone_5403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UndressRuneStone_5403OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_UndressRuneStone_5403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_UndressRuneStone_5403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UndressRuneStone_5403.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_UndressRuneStone_5403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_UndressRuneStone_5403_descriptor;
         }

         public C2S_UndressRuneStone_5403 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_UndressRuneStone_5403.getDefaultInstance();
         }

         public C2S_UndressRuneStone_5403 build() {
            C2S_UndressRuneStone_5403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UndressRuneStone_5403 buildPartial() {
            C2S_UndressRuneStone_5403 result = new C2S_UndressRuneStone_5403(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
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
            if (other instanceof C2S_UndressRuneStone_5403) {
               return this.mergeFrom((C2S_UndressRuneStone_5403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UndressRuneStone_5403 other) {
            if (other == RuneStoneMsg.C2S_UndressRuneStone_5403.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UndressRuneStone_5403 parsedMessage = null;

            try {
               parsedMessage = (C2S_UndressRuneStone_5403)RuneStoneMsg.C2S_UndressRuneStone_5403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UndressRuneStone_5403)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
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

   public static final class S2C_UndressRuneStone_5404 extends GeneratedMessageV3 implements S2C_UndressRuneStone_5404OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int PROALL_FIELD_NUMBER = 4;
      private List<CommonMsg.RuneStonePro> proAll_;
      private byte memoizedIsInitialized;
      private static final S2C_UndressRuneStone_5404 DEFAULT_INSTANCE = new S2C_UndressRuneStone_5404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UndressRuneStone_5404> PARSER = new AbstractParser<S2C_UndressRuneStone_5404>() {
         public S2C_UndressRuneStone_5404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UndressRuneStone_5404(input, extensionRegistry);
         }
      };

      private S2C_UndressRuneStone_5404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UndressRuneStone_5404() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
         this.proAll_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UndressRuneStone_5404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UndressRuneStone_5404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.proAll_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.proAll_.add(input.readMessage(CommonMsg.RuneStonePro.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.proAll_ = Collections.unmodifiableList(this.proAll_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_UndressRuneStone_5404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_UndressRuneStone_5404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressRuneStone_5404.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public List<CommonMsg.RuneStonePro> getProAllList() {
         return this.proAll_;
      }

      public List<? extends CommonMsg.RuneStoneProOrBuilder> getProAllOrBuilderList() {
         return this.proAll_;
      }

      public int getProAllCount() {
         return this.proAll_.size();
      }

      public CommonMsg.RuneStonePro getProAll(int index) {
         return (CommonMsg.RuneStonePro)this.proAll_.get(index);
      }

      public CommonMsg.RuneStoneProOrBuilder getProAllOrBuilder(int index) {
         return (CommonMsg.RuneStoneProOrBuilder)this.proAll_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getProAllCount(); ++i) {
               if (!this.getProAll(i).isInitialized()) {
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         for(int i = 0; i < this.proAll_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.proAll_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            for(int i = 0; i < this.proAll_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.proAll_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UndressRuneStone_5404)) {
            return super.equals(obj);
         } else {
            S2C_UndressRuneStone_5404 other = (S2C_UndressRuneStone_5404)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (!this.getProAllList().equals(other.getProAllList())) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.getProAllCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getProAllList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UndressRuneStone_5404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UndressRuneStone_5404)PARSER.parseFrom(data);
      }

      public static S2C_UndressRuneStone_5404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressRuneStone_5404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressRuneStone_5404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UndressRuneStone_5404)PARSER.parseFrom(data);
      }

      public static S2C_UndressRuneStone_5404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressRuneStone_5404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressRuneStone_5404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UndressRuneStone_5404)PARSER.parseFrom(data);
      }

      public static S2C_UndressRuneStone_5404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressRuneStone_5404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressRuneStone_5404 parseFrom(InputStream input) throws IOException {
         return (S2C_UndressRuneStone_5404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressRuneStone_5404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressRuneStone_5404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressRuneStone_5404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UndressRuneStone_5404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UndressRuneStone_5404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressRuneStone_5404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressRuneStone_5404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UndressRuneStone_5404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressRuneStone_5404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressRuneStone_5404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UndressRuneStone_5404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UndressRuneStone_5404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UndressRuneStone_5404> parser() {
         return PARSER;
      }

      public Parser<S2C_UndressRuneStone_5404> getParserForType() {
         return PARSER;
      }

      public S2C_UndressRuneStone_5404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UndressRuneStone_5404OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private List<CommonMsg.RuneStonePro> proAll_;
         private RepeatedFieldBuilderV3<CommonMsg.RuneStonePro, CommonMsg.RuneStonePro.Builder, CommonMsg.RuneStoneProOrBuilder> proAllBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_UndressRuneStone_5404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_UndressRuneStone_5404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressRuneStone_5404.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.proAll_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.proAll_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_UndressRuneStone_5404.alwaysUseFieldBuilders) {
               this.getProAllFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            if (this.proAllBuilder_ == null) {
               this.proAll_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.proAllBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_UndressRuneStone_5404_descriptor;
         }

         public S2C_UndressRuneStone_5404 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_UndressRuneStone_5404.getDefaultInstance();
         }

         public S2C_UndressRuneStone_5404 build() {
            S2C_UndressRuneStone_5404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UndressRuneStone_5404 buildPartial() {
            S2C_UndressRuneStone_5404 result = new S2C_UndressRuneStone_5404(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if (this.proAllBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.proAll_ = Collections.unmodifiableList(this.proAll_);
                  this.bitField0_ &= -5;
               }

               result.proAll_ = this.proAll_;
            } else {
               result.proAll_ = this.proAllBuilder_.build();
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
            if (other instanceof S2C_UndressRuneStone_5404) {
               return this.mergeFrom((S2C_UndressRuneStone_5404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UndressRuneStone_5404 other) {
            if (other == RuneStoneMsg.S2C_UndressRuneStone_5404.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (this.proAllBuilder_ == null) {
                  if (!other.proAll_.isEmpty()) {
                     if (this.proAll_.isEmpty()) {
                        this.proAll_ = other.proAll_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureProAllIsMutable();
                        this.proAll_.addAll(other.proAll_);
                     }

                     this.onChanged();
                  }
               } else if (!other.proAll_.isEmpty()) {
                  if (this.proAllBuilder_.isEmpty()) {
                     this.proAllBuilder_.dispose();
                     this.proAllBuilder_ = null;
                     this.proAll_ = other.proAll_;
                     this.bitField0_ &= -5;
                     this.proAllBuilder_ = RuneStoneMsg.S2C_UndressRuneStone_5404.alwaysUseFieldBuilders ? this.getProAllFieldBuilder() : null;
                  } else {
                     this.proAllBuilder_.addAllMessages(other.proAll_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               for(int i = 0; i < this.getProAllCount(); ++i) {
                  if (!this.getProAll(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UndressRuneStone_5404 parsedMessage = null;

            try {
               parsedMessage = (S2C_UndressRuneStone_5404)RuneStoneMsg.S2C_UndressRuneStone_5404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UndressRuneStone_5404)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         private void ensureProAllIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.proAll_ = new ArrayList(this.proAll_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.RuneStonePro> getProAllList() {
            return this.proAllBuilder_ == null ? Collections.unmodifiableList(this.proAll_) : this.proAllBuilder_.getMessageList();
         }

         public int getProAllCount() {
            return this.proAllBuilder_ == null ? this.proAll_.size() : this.proAllBuilder_.getCount();
         }

         public CommonMsg.RuneStonePro getProAll(int index) {
            return this.proAllBuilder_ == null ? (CommonMsg.RuneStonePro)this.proAll_.get(index) : (CommonMsg.RuneStonePro)this.proAllBuilder_.getMessage(index);
         }

         public Builder setProAll(int index, CommonMsg.RuneStonePro value) {
            if (this.proAllBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProAllIsMutable();
               this.proAll_.set(index, value);
               this.onChanged();
            } else {
               this.proAllBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setProAll(int index, CommonMsg.RuneStonePro.Builder builderForValue) {
            if (this.proAllBuilder_ == null) {
               this.ensureProAllIsMutable();
               this.proAll_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.proAllBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addProAll(CommonMsg.RuneStonePro value) {
            if (this.proAllBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProAllIsMutable();
               this.proAll_.add(value);
               this.onChanged();
            } else {
               this.proAllBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addProAll(int index, CommonMsg.RuneStonePro value) {
            if (this.proAllBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProAllIsMutable();
               this.proAll_.add(index, value);
               this.onChanged();
            } else {
               this.proAllBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addProAll(CommonMsg.RuneStonePro.Builder builderForValue) {
            if (this.proAllBuilder_ == null) {
               this.ensureProAllIsMutable();
               this.proAll_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.proAllBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addProAll(int index, CommonMsg.RuneStonePro.Builder builderForValue) {
            if (this.proAllBuilder_ == null) {
               this.ensureProAllIsMutable();
               this.proAll_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.proAllBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllProAll(Iterable<? extends CommonMsg.RuneStonePro> values) {
            if (this.proAllBuilder_ == null) {
               this.ensureProAllIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.proAll_);
               this.onChanged();
            } else {
               this.proAllBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearProAll() {
            if (this.proAllBuilder_ == null) {
               this.proAll_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.proAllBuilder_.clear();
            }

            return this;
         }

         public Builder removeProAll(int index) {
            if (this.proAllBuilder_ == null) {
               this.ensureProAllIsMutable();
               this.proAll_.remove(index);
               this.onChanged();
            } else {
               this.proAllBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.RuneStonePro.Builder getProAllBuilder(int index) {
            return (CommonMsg.RuneStonePro.Builder)this.getProAllFieldBuilder().getBuilder(index);
         }

         public CommonMsg.RuneStoneProOrBuilder getProAllOrBuilder(int index) {
            return this.proAllBuilder_ == null ? (CommonMsg.RuneStoneProOrBuilder)this.proAll_.get(index) : (CommonMsg.RuneStoneProOrBuilder)this.proAllBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.RuneStoneProOrBuilder> getProAllOrBuilderList() {
            return this.proAllBuilder_ != null ? this.proAllBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.proAll_);
         }

         public CommonMsg.RuneStonePro.Builder addProAllBuilder() {
            return (CommonMsg.RuneStonePro.Builder)this.getProAllFieldBuilder().addBuilder(CommonMsg.RuneStonePro.getDefaultInstance());
         }

         public CommonMsg.RuneStonePro.Builder addProAllBuilder(int index) {
            return (CommonMsg.RuneStonePro.Builder)this.getProAllFieldBuilder().addBuilder(index, CommonMsg.RuneStonePro.getDefaultInstance());
         }

         public List<CommonMsg.RuneStonePro.Builder> getProAllBuilderList() {
            return this.getProAllFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.RuneStonePro, CommonMsg.RuneStonePro.Builder, CommonMsg.RuneStoneProOrBuilder> getProAllFieldBuilder() {
            if (this.proAllBuilder_ == null) {
               this.proAllBuilder_ = new RepeatedFieldBuilderV3(this.proAll_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.proAll_ = null;
            }

            return this.proAllBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RuneStoneUpLev_5405 extends GeneratedMessageV3 implements C2S_RuneStoneUpLev_5405OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int CONSUMEITEM_FIELD_NUMBER = 3;
      private Internal.IntList consumeItem_;
      public static final int EXTRACODE_FIELD_NUMBER = 4;
      private Internal.IntList extraCode_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneStoneUpLev_5405 DEFAULT_INSTANCE = new C2S_RuneStoneUpLev_5405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneStoneUpLev_5405> PARSER = new AbstractParser<C2S_RuneStoneUpLev_5405>() {
         public C2S_RuneStoneUpLev_5405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneStoneUpLev_5405(input, extensionRegistry);
         }
      };

      private C2S_RuneStoneUpLev_5405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneStoneUpLev_5405() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
         this.consumeItem_ = emptyIntList();
         this.extraCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneStoneUpLev_5405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneStoneUpLev_5405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.position_ = rawValue;
                        }
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.consumeItem_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.consumeItem_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.consumeItem_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.extraCode_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.extraCode_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.extraCode_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.extraCode_.addInt(input.readInt32());
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
                     this.consumeItem_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.consumeItem_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.extraCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneUpLev_5405.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public List<Integer> getConsumeItemList() {
         return this.consumeItem_;
      }

      public int getConsumeItemCount() {
         return this.consumeItem_.size();
      }

      public int getConsumeItem(int index) {
         return this.consumeItem_.getInt(index);
      }

      public List<Integer> getExtraCodeList() {
         return this.extraCode_;
      }

      public int getExtraCodeCount() {
         return this.extraCode_.size();
      }

      public int getExtraCode(int index) {
         return this.extraCode_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
         }

         for(int i = 0; i < this.consumeItem_.size(); ++i) {
            output.writeInt32(3, this.consumeItem_.getInt(i));
         }

         for(int i = 0; i < this.extraCode_.size(); ++i) {
            output.writeInt32(4, this.extraCode_.getInt(i));
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
               size += CodedOutputStream.computeEnumSize(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.consumeItem_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.consumeItem_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getConsumeItemList().size();
            dataSize = 0;

            for(int i = 0; i < this.extraCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.extraCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getExtraCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RuneStoneUpLev_5405)) {
            return super.equals(obj);
         } else {
            C2S_RuneStoneUpLev_5405 other = (C2S_RuneStoneUpLev_5405)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (!this.getConsumeItemList().equals(other.getConsumeItemList())) {
               return false;
            } else if (!this.getExtraCodeList().equals(other.getExtraCodeList())) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.position_;
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.getConsumeItemCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getConsumeItemList().hashCode();
            }

            if (this.getExtraCodeCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getExtraCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RuneStoneUpLev_5405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5405)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneUpLev_5405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneUpLev_5405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5405)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneUpLev_5405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneUpLev_5405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5405)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneUpLev_5405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneUpLev_5405 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneUpLev_5405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneUpLev_5405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneUpLev_5405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneUpLev_5405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneUpLev_5405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneUpLev_5405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneUpLev_5405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneUpLev_5405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneStoneUpLev_5405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneUpLev_5405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneUpLev_5405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneStoneUpLev_5405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneStoneUpLev_5405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneStoneUpLev_5405> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneStoneUpLev_5405> getParserForType() {
         return PARSER;
      }

      public C2S_RuneStoneUpLev_5405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneStoneUpLev_5405OrBuilder {
         private int bitField0_;
         private int position_;
         private int heroCode_;
         private Internal.IntList consumeItem_;
         private Internal.IntList extraCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneUpLev_5405.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.consumeItem_ = RuneStoneMsg.C2S_RuneStoneUpLev_5405.emptyIntList();
            this.extraCode_ = RuneStoneMsg.C2S_RuneStoneUpLev_5405.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.consumeItem_ = RuneStoneMsg.C2S_RuneStoneUpLev_5405.emptyIntList();
            this.extraCode_ = RuneStoneMsg.C2S_RuneStoneUpLev_5405.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_RuneStoneUpLev_5405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 1;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.consumeItem_ = RuneStoneMsg.C2S_RuneStoneUpLev_5405.emptyIntList();
            this.bitField0_ &= -5;
            this.extraCode_ = RuneStoneMsg.C2S_RuneStoneUpLev_5405.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5405_descriptor;
         }

         public C2S_RuneStoneUpLev_5405 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_RuneStoneUpLev_5405.getDefaultInstance();
         }

         public C2S_RuneStoneUpLev_5405 build() {
            C2S_RuneStoneUpLev_5405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneStoneUpLev_5405 buildPartial() {
            C2S_RuneStoneUpLev_5405 result = new C2S_RuneStoneUpLev_5405(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.consumeItem_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.consumeItem_ = this.consumeItem_;
            if ((this.bitField0_ & 8) != 0) {
               this.extraCode_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.extraCode_ = this.extraCode_;
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
            if (other instanceof C2S_RuneStoneUpLev_5405) {
               return this.mergeFrom((C2S_RuneStoneUpLev_5405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneStoneUpLev_5405 other) {
            if (other == RuneStoneMsg.C2S_RuneStoneUpLev_5405.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (!other.consumeItem_.isEmpty()) {
                  if (this.consumeItem_.isEmpty()) {
                     this.consumeItem_ = other.consumeItem_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureConsumeItemIsMutable();
                     this.consumeItem_.addAll(other.consumeItem_);
                  }

                  this.onChanged();
               }

               if (!other.extraCode_.isEmpty()) {
                  if (this.extraCode_.isEmpty()) {
                     this.extraCode_ = other.extraCode_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureExtraCodeIsMutable();
                     this.extraCode_.addAll(other.extraCode_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RuneStoneUpLev_5405 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneStoneUpLev_5405)RuneStoneMsg.C2S_RuneStoneUpLev_5405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneStoneUpLev_5405)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureConsumeItemIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.consumeItem_ = RuneStoneMsg.C2S_RuneStoneUpLev_5405.mutableCopy(this.consumeItem_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getConsumeItemList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.consumeItem_) : this.consumeItem_);
         }

         public int getConsumeItemCount() {
            return this.consumeItem_.size();
         }

         public int getConsumeItem(int index) {
            return this.consumeItem_.getInt(index);
         }

         public Builder setConsumeItem(int index, int value) {
            this.ensureConsumeItemIsMutable();
            this.consumeItem_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addConsumeItem(int value) {
            this.ensureConsumeItemIsMutable();
            this.consumeItem_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllConsumeItem(Iterable<? extends Integer> values) {
            this.ensureConsumeItemIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.consumeItem_);
            this.onChanged();
            return this;
         }

         public Builder clearConsumeItem() {
            this.consumeItem_ = RuneStoneMsg.C2S_RuneStoneUpLev_5405.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureExtraCodeIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.extraCode_ = RuneStoneMsg.C2S_RuneStoneUpLev_5405.mutableCopy(this.extraCode_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getExtraCodeList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.extraCode_) : this.extraCode_);
         }

         public int getExtraCodeCount() {
            return this.extraCode_.size();
         }

         public int getExtraCode(int index) {
            return this.extraCode_.getInt(index);
         }

         public Builder setExtraCode(int index, int value) {
            this.ensureExtraCodeIsMutable();
            this.extraCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addExtraCode(int value) {
            this.ensureExtraCodeIsMutable();
            this.extraCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllExtraCode(Iterable<? extends Integer> values) {
            this.ensureExtraCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.extraCode_);
            this.onChanged();
            return this;
         }

         public Builder clearExtraCode() {
            this.extraCode_ = RuneStoneMsg.C2S_RuneStoneUpLev_5405.emptyIntList();
            this.bitField0_ &= -9;
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

   public static final class S2C_RuneStoneUpLev_5406 extends GeneratedMessageV3 implements S2C_RuneStoneUpLev_5406OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int INFO_FIELD_NUMBER = 2;
      private CommonMsg.RuneStoneWear info_;
      public static final int LEVSUM_FIELD_NUMBER = 4;
      private int levSum_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneStoneUpLev_5406 DEFAULT_INSTANCE = new S2C_RuneStoneUpLev_5406();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneStoneUpLev_5406> PARSER = new AbstractParser<S2C_RuneStoneUpLev_5406>() {
         public S2C_RuneStoneUpLev_5406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneStoneUpLev_5406(input, extensionRegistry);
         }
      };

      private S2C_RuneStoneUpLev_5406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneStoneUpLev_5406() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneStoneUpLev_5406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneStoneUpLev_5406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.RuneStoneWear.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (CommonMsg.RuneStoneWear)input.readMessage(CommonMsg.RuneStoneWear.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.levSum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneUpLev_5406.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RuneStoneWear getInfo() {
         return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
      }

      public CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
      }

      public boolean hasLevSum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevSum() {
         return this.levSum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.levSum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.levSum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneStoneUpLev_5406)) {
            return super.equals(obj);
         } else {
            S2C_RuneStoneUpLev_5406 other = (S2C_RuneStoneUpLev_5406)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (this.hasLevSum() != other.hasLevSum()) {
               return false;
            } else if (this.hasLevSum() && this.getLevSum() != other.getLevSum()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            if (this.hasLevSum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLevSum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneStoneUpLev_5406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5406)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneUpLev_5406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneUpLev_5406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5406)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneUpLev_5406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneUpLev_5406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5406)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneUpLev_5406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneUpLev_5406 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneUpLev_5406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneUpLev_5406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneUpLev_5406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneUpLev_5406 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneUpLev_5406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneUpLev_5406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneUpLev_5406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneUpLev_5406 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneStoneUpLev_5406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneUpLev_5406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneUpLev_5406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneStoneUpLev_5406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneStoneUpLev_5406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneStoneUpLev_5406> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneStoneUpLev_5406> getParserForType() {
         return PARSER;
      }

      public S2C_RuneStoneUpLev_5406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneStoneUpLev_5406OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private CommonMsg.RuneStoneWear info_;
         private SingleFieldBuilderV3<CommonMsg.RuneStoneWear, CommonMsg.RuneStoneWear.Builder, CommonMsg.RuneStoneWearOrBuilder> infoBuilder_;
         private int levSum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneUpLev_5406.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_RuneStoneUpLev_5406.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.levSum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5406_descriptor;
         }

         public S2C_RuneStoneUpLev_5406 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_RuneStoneUpLev_5406.getDefaultInstance();
         }

         public S2C_RuneStoneUpLev_5406 build() {
            S2C_RuneStoneUpLev_5406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneStoneUpLev_5406 buildPartial() {
            S2C_RuneStoneUpLev_5406 result = new S2C_RuneStoneUpLev_5406(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (CommonMsg.RuneStoneWear)this.infoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.levSum_ = this.levSum_;
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
            if (other instanceof S2C_RuneStoneUpLev_5406) {
               return this.mergeFrom((S2C_RuneStoneUpLev_5406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneStoneUpLev_5406 other) {
            if (other == RuneStoneMsg.S2C_RuneStoneUpLev_5406.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (other.hasLevSum()) {
                  this.setLevSum(other.getLevSum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasInfo()) {
               return false;
            } else if (!this.hasLevSum()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneStoneUpLev_5406 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneStoneUpLev_5406)RuneStoneMsg.S2C_RuneStoneUpLev_5406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneStoneUpLev_5406)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RuneStoneWear getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
            } else {
               return (CommonMsg.RuneStoneWear)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(CommonMsg.RuneStoneWear value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setInfo(CommonMsg.RuneStoneWear.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(CommonMsg.RuneStoneWear value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != CommonMsg.RuneStoneWear.getDefaultInstance()) {
                  this.info_ = CommonMsg.RuneStoneWear.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.RuneStoneWear.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.RuneStoneWear.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (CommonMsg.RuneStoneWearOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.RuneStoneWear, CommonMsg.RuneStoneWear.Builder, CommonMsg.RuneStoneWearOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasLevSum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevSum() {
            return this.levSum_;
         }

         public Builder setLevSum(int value) {
            this.bitField0_ |= 4;
            this.levSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevSum() {
            this.bitField0_ &= -5;
            this.levSum_ = 0;
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

   public static final class C2S_RuneStoneInherit_5407 extends GeneratedMessageV3 implements C2S_RuneStoneInherit_5407OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 3;
      private int itemCode_;
      public static final int PROKEY_FIELD_NUMBER = 4;
      private int proKey_;
      public static final int TARGETKEY_FIELD_NUMBER = 5;
      private int targetKey_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneStoneInherit_5407 DEFAULT_INSTANCE = new C2S_RuneStoneInherit_5407();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneStoneInherit_5407> PARSER = new AbstractParser<C2S_RuneStoneInherit_5407>() {
         public C2S_RuneStoneInherit_5407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneStoneInherit_5407(input, extensionRegistry);
         }
      };

      private C2S_RuneStoneInherit_5407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneStoneInherit_5407() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneStoneInherit_5407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneStoneInherit_5407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.position_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.proKey_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.targetKey_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneInherit_5407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneInherit_5407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneInherit_5407.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasProKey() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getProKey() {
         return this.proKey_;
      }

      public boolean hasTargetKey() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getTargetKey() {
         return this.targetKey_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasProKey()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTargetKey()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.itemCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.proKey_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.targetKey_);
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
               size += CodedOutputStream.computeEnumSize(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.itemCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.proKey_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.targetKey_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RuneStoneInherit_5407)) {
            return super.equals(obj);
         } else {
            C2S_RuneStoneInherit_5407 other = (C2S_RuneStoneInherit_5407)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasProKey() != other.hasProKey()) {
               return false;
            } else if (this.hasProKey() && this.getProKey() != other.getProKey()) {
               return false;
            } else if (this.hasTargetKey() != other.hasTargetKey()) {
               return false;
            } else if (this.hasTargetKey() && this.getTargetKey() != other.getTargetKey()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.position_;
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasProKey()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getProKey();
            }

            if (this.hasTargetKey()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTargetKey();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RuneStoneInherit_5407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneInherit_5407)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneInherit_5407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneInherit_5407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneInherit_5407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneInherit_5407)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneInherit_5407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneInherit_5407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneInherit_5407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneInherit_5407)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneInherit_5407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneInherit_5407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneInherit_5407 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneInherit_5407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneInherit_5407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneInherit_5407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneInherit_5407 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneInherit_5407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneInherit_5407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneInherit_5407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneInherit_5407 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneStoneInherit_5407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneInherit_5407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneInherit_5407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneStoneInherit_5407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneStoneInherit_5407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneStoneInherit_5407> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneStoneInherit_5407> getParserForType() {
         return PARSER;
      }

      public C2S_RuneStoneInherit_5407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneStoneInherit_5407OrBuilder {
         private int bitField0_;
         private int position_;
         private int heroCode_;
         private int itemCode_;
         private int proKey_;
         private int targetKey_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneInherit_5407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneInherit_5407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneInherit_5407.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_RuneStoneInherit_5407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 1;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.bitField0_ &= -5;
            this.proKey_ = 0;
            this.bitField0_ &= -9;
            this.targetKey_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneInherit_5407_descriptor;
         }

         public C2S_RuneStoneInherit_5407 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_RuneStoneInherit_5407.getDefaultInstance();
         }

         public C2S_RuneStoneInherit_5407 build() {
            C2S_RuneStoneInherit_5407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneStoneInherit_5407 buildPartial() {
            C2S_RuneStoneInherit_5407 result = new C2S_RuneStoneInherit_5407(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.proKey_ = this.proKey_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.targetKey_ = this.targetKey_;
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
            if (other instanceof C2S_RuneStoneInherit_5407) {
               return this.mergeFrom((C2S_RuneStoneInherit_5407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneStoneInherit_5407 other) {
            if (other == RuneStoneMsg.C2S_RuneStoneInherit_5407.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasProKey()) {
                  this.setProKey(other.getProKey());
               }

               if (other.hasTargetKey()) {
                  this.setTargetKey(other.getTargetKey());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasProKey()) {
               return false;
            } else {
               return this.hasTargetKey();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RuneStoneInherit_5407 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneStoneInherit_5407)RuneStoneMsg.C2S_RuneStoneInherit_5407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneStoneInherit_5407)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 4;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -5;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasProKey() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getProKey() {
            return this.proKey_;
         }

         public Builder setProKey(int value) {
            this.bitField0_ |= 8;
            this.proKey_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProKey() {
            this.bitField0_ &= -9;
            this.proKey_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTargetKey() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getTargetKey() {
            return this.targetKey_;
         }

         public Builder setTargetKey(int value) {
            this.bitField0_ |= 16;
            this.targetKey_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetKey() {
            this.bitField0_ &= -17;
            this.targetKey_ = 0;
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

   public static final class S2C_RuneStoneInherit_5408 extends GeneratedMessageV3 implements S2C_RuneStoneInherit_5408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int INFO_FIELD_NUMBER = 2;
      private CommonMsg.RuneStoneWear info_;
      public static final int RUNEITEM_FIELD_NUMBER = 3;
      private CommonMsg.RuneStone runeItem_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneStoneInherit_5408 DEFAULT_INSTANCE = new S2C_RuneStoneInherit_5408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneStoneInherit_5408> PARSER = new AbstractParser<S2C_RuneStoneInherit_5408>() {
         public S2C_RuneStoneInherit_5408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneStoneInherit_5408(input, extensionRegistry);
         }
      };

      private S2C_RuneStoneInherit_5408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneStoneInherit_5408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneStoneInherit_5408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneStoneInherit_5408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.RuneStoneWear.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (CommonMsg.RuneStoneWear)input.readMessage(CommonMsg.RuneStoneWear.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        CommonMsg.RuneStone.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.runeItem_.toBuilder();
                        }

                        this.runeItem_ = (CommonMsg.RuneStone)input.readMessage(CommonMsg.RuneStone.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.runeItem_);
                           this.runeItem_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneInherit_5408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneInherit_5408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneInherit_5408.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RuneStoneWear getInfo() {
         return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
      }

      public CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
      }

      public boolean hasRuneItem() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.RuneStone getRuneItem() {
         return this.runeItem_ == null ? CommonMsg.RuneStone.getDefaultInstance() : this.runeItem_;
      }

      public CommonMsg.RuneStoneOrBuilder getRuneItemOrBuilder() {
         return this.runeItem_ == null ? CommonMsg.RuneStone.getDefaultInstance() : this.runeItem_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRuneItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRuneItem().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getRuneItem());
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getRuneItem());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneStoneInherit_5408)) {
            return super.equals(obj);
         } else {
            S2C_RuneStoneInherit_5408 other = (S2C_RuneStoneInherit_5408)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (this.hasRuneItem() != other.hasRuneItem()) {
               return false;
            } else if (this.hasRuneItem() && !this.getRuneItem().equals(other.getRuneItem())) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            if (this.hasRuneItem()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRuneItem().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneStoneInherit_5408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneInherit_5408)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneInherit_5408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneInherit_5408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneInherit_5408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneInherit_5408)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneInherit_5408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneInherit_5408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneInherit_5408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneInherit_5408)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneInherit_5408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneInherit_5408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneInherit_5408 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneInherit_5408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneInherit_5408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneInherit_5408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneInherit_5408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneInherit_5408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneInherit_5408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneInherit_5408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneInherit_5408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneStoneInherit_5408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneInherit_5408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneInherit_5408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneStoneInherit_5408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneStoneInherit_5408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneStoneInherit_5408> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneStoneInherit_5408> getParserForType() {
         return PARSER;
      }

      public S2C_RuneStoneInherit_5408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneStoneInherit_5408OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private CommonMsg.RuneStoneWear info_;
         private SingleFieldBuilderV3<CommonMsg.RuneStoneWear, CommonMsg.RuneStoneWear.Builder, CommonMsg.RuneStoneWearOrBuilder> infoBuilder_;
         private CommonMsg.RuneStone runeItem_;
         private SingleFieldBuilderV3<CommonMsg.RuneStone, CommonMsg.RuneStone.Builder, CommonMsg.RuneStoneOrBuilder> runeItemBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneInherit_5408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneInherit_5408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneInherit_5408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_RuneStoneInherit_5408.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
               this.getRuneItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.runeItemBuilder_ == null) {
               this.runeItem_ = null;
            } else {
               this.runeItemBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneInherit_5408_descriptor;
         }

         public S2C_RuneStoneInherit_5408 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_RuneStoneInherit_5408.getDefaultInstance();
         }

         public S2C_RuneStoneInherit_5408 build() {
            S2C_RuneStoneInherit_5408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneStoneInherit_5408 buildPartial() {
            S2C_RuneStoneInherit_5408 result = new S2C_RuneStoneInherit_5408(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (CommonMsg.RuneStoneWear)this.infoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.runeItemBuilder_ == null) {
                  result.runeItem_ = this.runeItem_;
               } else {
                  result.runeItem_ = (CommonMsg.RuneStone)this.runeItemBuilder_.build();
               }

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
            if (other instanceof S2C_RuneStoneInherit_5408) {
               return this.mergeFrom((S2C_RuneStoneInherit_5408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneStoneInherit_5408 other) {
            if (other == RuneStoneMsg.S2C_RuneStoneInherit_5408.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (other.hasRuneItem()) {
                  this.mergeRuneItem(other.getRuneItem());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasInfo()) {
               return false;
            } else if (!this.hasRuneItem()) {
               return false;
            } else if (!this.getInfo().isInitialized()) {
               return false;
            } else {
               return this.getRuneItem().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneStoneInherit_5408 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneStoneInherit_5408)RuneStoneMsg.S2C_RuneStoneInherit_5408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneStoneInherit_5408)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RuneStoneWear getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
            } else {
               return (CommonMsg.RuneStoneWear)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(CommonMsg.RuneStoneWear value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setInfo(CommonMsg.RuneStoneWear.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(CommonMsg.RuneStoneWear value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != CommonMsg.RuneStoneWear.getDefaultInstance()) {
                  this.info_ = CommonMsg.RuneStoneWear.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.RuneStoneWear.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.RuneStoneWear.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (CommonMsg.RuneStoneWearOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.RuneStoneWear, CommonMsg.RuneStoneWear.Builder, CommonMsg.RuneStoneWearOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasRuneItem() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.RuneStone getRuneItem() {
            if (this.runeItemBuilder_ == null) {
               return this.runeItem_ == null ? CommonMsg.RuneStone.getDefaultInstance() : this.runeItem_;
            } else {
               return (CommonMsg.RuneStone)this.runeItemBuilder_.getMessage();
            }
         }

         public Builder setRuneItem(CommonMsg.RuneStone value) {
            if (this.runeItemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.runeItem_ = value;
               this.onChanged();
            } else {
               this.runeItemBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setRuneItem(CommonMsg.RuneStone.Builder builderForValue) {
            if (this.runeItemBuilder_ == null) {
               this.runeItem_ = builderForValue.build();
               this.onChanged();
            } else {
               this.runeItemBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeRuneItem(CommonMsg.RuneStone value) {
            if (this.runeItemBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.runeItem_ != null && this.runeItem_ != CommonMsg.RuneStone.getDefaultInstance()) {
                  this.runeItem_ = CommonMsg.RuneStone.newBuilder(this.runeItem_).mergeFrom(value).buildPartial();
               } else {
                  this.runeItem_ = value;
               }

               this.onChanged();
            } else {
               this.runeItemBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearRuneItem() {
            if (this.runeItemBuilder_ == null) {
               this.runeItem_ = null;
               this.onChanged();
            } else {
               this.runeItemBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public CommonMsg.RuneStone.Builder getRuneItemBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (CommonMsg.RuneStone.Builder)this.getRuneItemFieldBuilder().getBuilder();
         }

         public CommonMsg.RuneStoneOrBuilder getRuneItemOrBuilder() {
            if (this.runeItemBuilder_ != null) {
               return (CommonMsg.RuneStoneOrBuilder)this.runeItemBuilder_.getMessageOrBuilder();
            } else {
               return this.runeItem_ == null ? CommonMsg.RuneStone.getDefaultInstance() : this.runeItem_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.RuneStone, CommonMsg.RuneStone.Builder, CommonMsg.RuneStoneOrBuilder> getRuneItemFieldBuilder() {
            if (this.runeItemBuilder_ == null) {
               this.runeItemBuilder_ = new SingleFieldBuilderV3(this.getRuneItem(), this.getParentForChildren(), this.isClean());
               this.runeItem_ = null;
            }

            return this.runeItemBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RuneStoneRecruitment_5409 extends GeneratedMessageV3 implements C2S_RuneStoneRecruitment_5409OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneStoneRecruitment_5409 DEFAULT_INSTANCE = new C2S_RuneStoneRecruitment_5409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneStoneRecruitment_5409> PARSER = new AbstractParser<C2S_RuneStoneRecruitment_5409>() {
         public C2S_RuneStoneRecruitment_5409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneStoneRecruitment_5409(input, extensionRegistry);
         }
      };

      private C2S_RuneStoneRecruitment_5409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneStoneRecruitment_5409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneStoneRecruitment_5409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneStoneRecruitment_5409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneRecruitment_5409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneRecruitment_5409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneRecruitment_5409.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RuneStoneRecruitment_5409)) {
            return super.equals(obj);
         } else {
            C2S_RuneStoneRecruitment_5409 other = (C2S_RuneStoneRecruitment_5409)obj;
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

      public static C2S_RuneStoneRecruitment_5409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneRecruitment_5409)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneRecruitment_5409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneRecruitment_5409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneRecruitment_5409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneRecruitment_5409)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneRecruitment_5409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneRecruitment_5409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneRecruitment_5409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneRecruitment_5409)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneRecruitment_5409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneRecruitment_5409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneRecruitment_5409 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneRecruitment_5409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneRecruitment_5409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneRecruitment_5409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneRecruitment_5409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneRecruitment_5409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneRecruitment_5409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneRecruitment_5409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneRecruitment_5409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneStoneRecruitment_5409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneRecruitment_5409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneRecruitment_5409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneStoneRecruitment_5409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneStoneRecruitment_5409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneStoneRecruitment_5409> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneStoneRecruitment_5409> getParserForType() {
         return PARSER;
      }

      public C2S_RuneStoneRecruitment_5409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneStoneRecruitment_5409OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneRecruitment_5409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneRecruitment_5409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneRecruitment_5409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_RuneStoneRecruitment_5409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneRecruitment_5409_descriptor;
         }

         public C2S_RuneStoneRecruitment_5409 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_RuneStoneRecruitment_5409.getDefaultInstance();
         }

         public C2S_RuneStoneRecruitment_5409 build() {
            C2S_RuneStoneRecruitment_5409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneStoneRecruitment_5409 buildPartial() {
            C2S_RuneStoneRecruitment_5409 result = new C2S_RuneStoneRecruitment_5409(this);
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
            if (other instanceof C2S_RuneStoneRecruitment_5409) {
               return this.mergeFrom((C2S_RuneStoneRecruitment_5409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneStoneRecruitment_5409 other) {
            if (other == RuneStoneMsg.C2S_RuneStoneRecruitment_5409.getDefaultInstance()) {
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
            C2S_RuneStoneRecruitment_5409 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneStoneRecruitment_5409)RuneStoneMsg.C2S_RuneStoneRecruitment_5409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneStoneRecruitment_5409)e.getUnfinishedMessage();
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

   public static final class S2C_RuneStoneRecruitment_5410 extends GeneratedMessageV3 implements S2C_RuneStoneRecruitment_5410OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int RECRUITNUM_FIELD_NUMBER = 2;
      private int recruitNum_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneStoneRecruitment_5410 DEFAULT_INSTANCE = new S2C_RuneStoneRecruitment_5410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneStoneRecruitment_5410> PARSER = new AbstractParser<S2C_RuneStoneRecruitment_5410>() {
         public S2C_RuneStoneRecruitment_5410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneStoneRecruitment_5410(input, extensionRegistry);
         }
      };

      private S2C_RuneStoneRecruitment_5410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneStoneRecruitment_5410() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneStoneRecruitment_5410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneStoneRecruitment_5410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneRecruitment_5410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneRecruitment_5410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneRecruitment_5410.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasRecruitNum() {
         return (this.bitField0_ & 2) != 0;
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
            output.writeInt32(2, this.recruitNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.recruitNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneStoneRecruitment_5410)) {
            return super.equals(obj);
         } else {
            S2C_RuneStoneRecruitment_5410 other = (S2C_RuneStoneRecruitment_5410)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasRecruitNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecruitNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneStoneRecruitment_5410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneRecruitment_5410)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneRecruitment_5410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneRecruitment_5410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneRecruitment_5410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneRecruitment_5410)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneRecruitment_5410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneRecruitment_5410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneRecruitment_5410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneRecruitment_5410)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneRecruitment_5410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneRecruitment_5410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneRecruitment_5410 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneRecruitment_5410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneRecruitment_5410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneRecruitment_5410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneRecruitment_5410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneRecruitment_5410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneRecruitment_5410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneRecruitment_5410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneRecruitment_5410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneStoneRecruitment_5410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneRecruitment_5410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneRecruitment_5410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneStoneRecruitment_5410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneStoneRecruitment_5410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneStoneRecruitment_5410> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneStoneRecruitment_5410> getParserForType() {
         return PARSER;
      }

      public S2C_RuneStoneRecruitment_5410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneStoneRecruitment_5410OrBuilder {
         private int bitField0_;
         private int type_;
         private int recruitNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneRecruitment_5410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneRecruitment_5410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneRecruitment_5410.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_RuneStoneRecruitment_5410.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.recruitNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneRecruitment_5410_descriptor;
         }

         public S2C_RuneStoneRecruitment_5410 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_RuneStoneRecruitment_5410.getDefaultInstance();
         }

         public S2C_RuneStoneRecruitment_5410 build() {
            S2C_RuneStoneRecruitment_5410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneStoneRecruitment_5410 buildPartial() {
            S2C_RuneStoneRecruitment_5410 result = new S2C_RuneStoneRecruitment_5410(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.recruitNum_ = this.recruitNum_;
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
            if (other instanceof S2C_RuneStoneRecruitment_5410) {
               return this.mergeFrom((S2C_RuneStoneRecruitment_5410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneStoneRecruitment_5410 other) {
            if (other == RuneStoneMsg.S2C_RuneStoneRecruitment_5410.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
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
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneStoneRecruitment_5410 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneStoneRecruitment_5410)RuneStoneMsg.S2C_RuneStoneRecruitment_5410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneStoneRecruitment_5410)e.getUnfinishedMessage();
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

         public boolean hasRecruitNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRecruitNum() {
            return this.recruitNum_;
         }

         public Builder setRecruitNum(int value) {
            this.bitField0_ |= 2;
            this.recruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitNum() {
            this.bitField0_ &= -3;
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

   public static final class C2S_RuneStoneUpLev_5411 extends GeneratedMessageV3 implements C2S_RuneStoneUpLev_5411OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int CONSUMEITEM_FIELD_NUMBER = 3;
      private Internal.IntList consumeItem_;
      public static final int EXTRACODE_FIELD_NUMBER = 4;
      private Internal.IntList extraCode_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneStoneUpLev_5411 DEFAULT_INSTANCE = new C2S_RuneStoneUpLev_5411();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneStoneUpLev_5411> PARSER = new AbstractParser<C2S_RuneStoneUpLev_5411>() {
         public C2S_RuneStoneUpLev_5411 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneStoneUpLev_5411(input, extensionRegistry);
         }
      };

      private C2S_RuneStoneUpLev_5411(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneStoneUpLev_5411() {
         this.memoizedIsInitialized = -1;
         this.consumeItem_ = emptyIntList();
         this.extraCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneStoneUpLev_5411();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneStoneUpLev_5411(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.consumeItem_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.consumeItem_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.consumeItem_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.extraCode_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.extraCode_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.extraCode_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.extraCode_.addInt(input.readInt32());
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
                     this.consumeItem_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.consumeItem_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.extraCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5411_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneUpLev_5411.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public List<Integer> getConsumeItemList() {
         return this.consumeItem_;
      }

      public int getConsumeItemCount() {
         return this.consumeItem_.size();
      }

      public int getConsumeItem(int index) {
         return this.consumeItem_.getInt(index);
      }

      public List<Integer> getExtraCodeList() {
         return this.extraCode_;
      }

      public int getExtraCodeCount() {
         return this.extraCode_.size();
      }

      public int getExtraCode(int index) {
         return this.extraCode_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.code_);
         }

         for(int i = 0; i < this.consumeItem_.size(); ++i) {
            output.writeInt32(3, this.consumeItem_.getInt(i));
         }

         for(int i = 0; i < this.extraCode_.size(); ++i) {
            output.writeInt32(4, this.extraCode_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.consumeItem_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.consumeItem_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getConsumeItemList().size();
            dataSize = 0;

            for(int i = 0; i < this.extraCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.extraCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getExtraCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RuneStoneUpLev_5411)) {
            return super.equals(obj);
         } else {
            C2S_RuneStoneUpLev_5411 other = (C2S_RuneStoneUpLev_5411)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (!this.getConsumeItemList().equals(other.getConsumeItemList())) {
               return false;
            } else if (!this.getExtraCodeList().equals(other.getExtraCodeList())) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.getConsumeItemCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getConsumeItemList().hashCode();
            }

            if (this.getExtraCodeCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getExtraCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RuneStoneUpLev_5411 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5411)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneUpLev_5411 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneUpLev_5411 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5411)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneUpLev_5411 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneUpLev_5411 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5411)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneUpLev_5411 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneUpLev_5411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneUpLev_5411 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneUpLev_5411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneUpLev_5411 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneUpLev_5411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneUpLev_5411 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneUpLev_5411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneUpLev_5411 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneUpLev_5411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneUpLev_5411 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneStoneUpLev_5411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneUpLev_5411 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneUpLev_5411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneStoneUpLev_5411 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneStoneUpLev_5411 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneStoneUpLev_5411> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneStoneUpLev_5411> getParserForType() {
         return PARSER;
      }

      public C2S_RuneStoneUpLev_5411 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneStoneUpLev_5411OrBuilder {
         private int bitField0_;
         private int code_;
         private Internal.IntList consumeItem_;
         private Internal.IntList extraCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5411_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneUpLev_5411.class, Builder.class);
         }

         private Builder() {
            this.consumeItem_ = RuneStoneMsg.C2S_RuneStoneUpLev_5411.emptyIntList();
            this.extraCode_ = RuneStoneMsg.C2S_RuneStoneUpLev_5411.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.consumeItem_ = RuneStoneMsg.C2S_RuneStoneUpLev_5411.emptyIntList();
            this.extraCode_ = RuneStoneMsg.C2S_RuneStoneUpLev_5411.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_RuneStoneUpLev_5411.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.consumeItem_ = RuneStoneMsg.C2S_RuneStoneUpLev_5411.emptyIntList();
            this.bitField0_ &= -3;
            this.extraCode_ = RuneStoneMsg.C2S_RuneStoneUpLev_5411.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneUpLev_5411_descriptor;
         }

         public C2S_RuneStoneUpLev_5411 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_RuneStoneUpLev_5411.getDefaultInstance();
         }

         public C2S_RuneStoneUpLev_5411 build() {
            C2S_RuneStoneUpLev_5411 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneStoneUpLev_5411 buildPartial() {
            C2S_RuneStoneUpLev_5411 result = new C2S_RuneStoneUpLev_5411(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.consumeItem_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.consumeItem_ = this.consumeItem_;
            if ((this.bitField0_ & 4) != 0) {
               this.extraCode_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.extraCode_ = this.extraCode_;
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
            if (other instanceof C2S_RuneStoneUpLev_5411) {
               return this.mergeFrom((C2S_RuneStoneUpLev_5411)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneStoneUpLev_5411 other) {
            if (other == RuneStoneMsg.C2S_RuneStoneUpLev_5411.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (!other.consumeItem_.isEmpty()) {
                  if (this.consumeItem_.isEmpty()) {
                     this.consumeItem_ = other.consumeItem_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureConsumeItemIsMutable();
                     this.consumeItem_.addAll(other.consumeItem_);
                  }

                  this.onChanged();
               }

               if (!other.extraCode_.isEmpty()) {
                  if (this.extraCode_.isEmpty()) {
                     this.extraCode_ = other.extraCode_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureExtraCodeIsMutable();
                     this.extraCode_.addAll(other.extraCode_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RuneStoneUpLev_5411 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneStoneUpLev_5411)RuneStoneMsg.C2S_RuneStoneUpLev_5411.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneStoneUpLev_5411)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureConsumeItemIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.consumeItem_ = RuneStoneMsg.C2S_RuneStoneUpLev_5411.mutableCopy(this.consumeItem_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getConsumeItemList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.consumeItem_) : this.consumeItem_);
         }

         public int getConsumeItemCount() {
            return this.consumeItem_.size();
         }

         public int getConsumeItem(int index) {
            return this.consumeItem_.getInt(index);
         }

         public Builder setConsumeItem(int index, int value) {
            this.ensureConsumeItemIsMutable();
            this.consumeItem_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addConsumeItem(int value) {
            this.ensureConsumeItemIsMutable();
            this.consumeItem_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllConsumeItem(Iterable<? extends Integer> values) {
            this.ensureConsumeItemIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.consumeItem_);
            this.onChanged();
            return this;
         }

         public Builder clearConsumeItem() {
            this.consumeItem_ = RuneStoneMsg.C2S_RuneStoneUpLev_5411.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureExtraCodeIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.extraCode_ = RuneStoneMsg.C2S_RuneStoneUpLev_5411.mutableCopy(this.extraCode_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getExtraCodeList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.extraCode_) : this.extraCode_);
         }

         public int getExtraCodeCount() {
            return this.extraCode_.size();
         }

         public int getExtraCode(int index) {
            return this.extraCode_.getInt(index);
         }

         public Builder setExtraCode(int index, int value) {
            this.ensureExtraCodeIsMutable();
            this.extraCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addExtraCode(int value) {
            this.ensureExtraCodeIsMutable();
            this.extraCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllExtraCode(Iterable<? extends Integer> values) {
            this.ensureExtraCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.extraCode_);
            this.onChanged();
            return this;
         }

         public Builder clearExtraCode() {
            this.extraCode_ = RuneStoneMsg.C2S_RuneStoneUpLev_5411.emptyIntList();
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

   public static final class S2C_RuneStoneUpLev_5412 extends GeneratedMessageV3 implements S2C_RuneStoneUpLev_5412OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int INFO_FIELD_NUMBER = 2;
      private CommonMsg.RuneStone info_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneStoneUpLev_5412 DEFAULT_INSTANCE = new S2C_RuneStoneUpLev_5412();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneStoneUpLev_5412> PARSER = new AbstractParser<S2C_RuneStoneUpLev_5412>() {
         public S2C_RuneStoneUpLev_5412 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneStoneUpLev_5412(input, extensionRegistry);
         }
      };

      private S2C_RuneStoneUpLev_5412(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneStoneUpLev_5412() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneStoneUpLev_5412();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneStoneUpLev_5412(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.RuneStone.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (CommonMsg.RuneStone)input.readMessage(CommonMsg.RuneStone.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5412_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneUpLev_5412.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RuneStone getInfo() {
         return this.info_ == null ? CommonMsg.RuneStone.getDefaultInstance() : this.info_;
      }

      public CommonMsg.RuneStoneOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? CommonMsg.RuneStone.getDefaultInstance() : this.info_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getInfo());
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneStoneUpLev_5412)) {
            return super.equals(obj);
         } else {
            S2C_RuneStoneUpLev_5412 other = (S2C_RuneStoneUpLev_5412)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneStoneUpLev_5412 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5412)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneUpLev_5412 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneUpLev_5412 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5412)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneUpLev_5412 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneUpLev_5412 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5412)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneUpLev_5412 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneUpLev_5412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneUpLev_5412 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneUpLev_5412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneUpLev_5412 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneUpLev_5412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneUpLev_5412 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneUpLev_5412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneUpLev_5412 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneUpLev_5412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneUpLev_5412 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneStoneUpLev_5412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneUpLev_5412 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneUpLev_5412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneStoneUpLev_5412 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneStoneUpLev_5412 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneStoneUpLev_5412> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneStoneUpLev_5412> getParserForType() {
         return PARSER;
      }

      public S2C_RuneStoneUpLev_5412 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneStoneUpLev_5412OrBuilder {
         private int bitField0_;
         private int code_;
         private CommonMsg.RuneStone info_;
         private SingleFieldBuilderV3<CommonMsg.RuneStone, CommonMsg.RuneStone.Builder, CommonMsg.RuneStoneOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5412_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneUpLev_5412.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_RuneStoneUpLev_5412.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneUpLev_5412_descriptor;
         }

         public S2C_RuneStoneUpLev_5412 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_RuneStoneUpLev_5412.getDefaultInstance();
         }

         public S2C_RuneStoneUpLev_5412 build() {
            S2C_RuneStoneUpLev_5412 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneStoneUpLev_5412 buildPartial() {
            S2C_RuneStoneUpLev_5412 result = new S2C_RuneStoneUpLev_5412(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (CommonMsg.RuneStone)this.infoBuilder_.build();
               }

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
            if (other instanceof S2C_RuneStoneUpLev_5412) {
               return this.mergeFrom((S2C_RuneStoneUpLev_5412)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneStoneUpLev_5412 other) {
            if (other == RuneStoneMsg.S2C_RuneStoneUpLev_5412.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneStoneUpLev_5412 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneStoneUpLev_5412)RuneStoneMsg.S2C_RuneStoneUpLev_5412.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneStoneUpLev_5412)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RuneStone getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? CommonMsg.RuneStone.getDefaultInstance() : this.info_;
            } else {
               return (CommonMsg.RuneStone)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(CommonMsg.RuneStone value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setInfo(CommonMsg.RuneStone.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(CommonMsg.RuneStone value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != CommonMsg.RuneStone.getDefaultInstance()) {
                  this.info_ = CommonMsg.RuneStone.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.RuneStone.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.RuneStone.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.RuneStoneOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (CommonMsg.RuneStoneOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? CommonMsg.RuneStone.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.RuneStone, CommonMsg.RuneStone.Builder, CommonMsg.RuneStoneOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RuneStoneDecompose_5413 extends GeneratedMessageV3 implements C2S_RuneStoneDecompose_5413OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CODE_FIELD_NUMBER = 2;
      private Internal.IntList code_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneStoneDecompose_5413 DEFAULT_INSTANCE = new C2S_RuneStoneDecompose_5413();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneStoneDecompose_5413> PARSER = new AbstractParser<C2S_RuneStoneDecompose_5413>() {
         public C2S_RuneStoneDecompose_5413 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneStoneDecompose_5413(input, extensionRegistry);
         }
      };

      private C2S_RuneStoneDecompose_5413(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneStoneDecompose_5413() {
         this.memoizedIsInitialized = -1;
         this.code_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneStoneDecompose_5413();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneStoneDecompose_5413(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.code_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.code_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.code_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.code_.addInt(input.readInt32());
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
                  this.code_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneDecompose_5413_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneDecompose_5413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneDecompose_5413.class, Builder.class);
      }

      public List<Integer> getCodeList() {
         return this.code_;
      }

      public int getCodeCount() {
         return this.code_.size();
      }

      public int getCode(int index) {
         return this.code_.getInt(index);
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
         for(int i = 0; i < this.code_.size(); ++i) {
            output.writeInt32(2, this.code_.getInt(i));
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

            for(int i = 0; i < this.code_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.code_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RuneStoneDecompose_5413)) {
            return super.equals(obj);
         } else {
            C2S_RuneStoneDecompose_5413 other = (C2S_RuneStoneDecompose_5413)obj;
            if (!this.getCodeList().equals(other.getCodeList())) {
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
            if (this.getCodeCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RuneStoneDecompose_5413 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneDecompose_5413)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneDecompose_5413 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneDecompose_5413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneDecompose_5413 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneDecompose_5413)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneDecompose_5413 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneDecompose_5413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneDecompose_5413 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneDecompose_5413)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneDecompose_5413 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneDecompose_5413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneDecompose_5413 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneDecompose_5413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneDecompose_5413 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneDecompose_5413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneDecompose_5413 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneDecompose_5413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneDecompose_5413 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneDecompose_5413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneDecompose_5413 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneStoneDecompose_5413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneDecompose_5413 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneDecompose_5413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneStoneDecompose_5413 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneStoneDecompose_5413 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneStoneDecompose_5413> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneStoneDecompose_5413> getParserForType() {
         return PARSER;
      }

      public C2S_RuneStoneDecompose_5413 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneStoneDecompose_5413OrBuilder {
         private int bitField0_;
         private Internal.IntList code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneDecompose_5413_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneDecompose_5413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneDecompose_5413.class, Builder.class);
         }

         private Builder() {
            this.code_ = RuneStoneMsg.C2S_RuneStoneDecompose_5413.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.code_ = RuneStoneMsg.C2S_RuneStoneDecompose_5413.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_RuneStoneDecompose_5413.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = RuneStoneMsg.C2S_RuneStoneDecompose_5413.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneDecompose_5413_descriptor;
         }

         public C2S_RuneStoneDecompose_5413 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_RuneStoneDecompose_5413.getDefaultInstance();
         }

         public C2S_RuneStoneDecompose_5413 build() {
            C2S_RuneStoneDecompose_5413 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneStoneDecompose_5413 buildPartial() {
            C2S_RuneStoneDecompose_5413 result = new C2S_RuneStoneDecompose_5413(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.code_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.code_ = this.code_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_RuneStoneDecompose_5413) {
               return this.mergeFrom((C2S_RuneStoneDecompose_5413)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneStoneDecompose_5413 other) {
            if (other == RuneStoneMsg.C2S_RuneStoneDecompose_5413.getDefaultInstance()) {
               return this;
            } else {
               if (!other.code_.isEmpty()) {
                  if (this.code_.isEmpty()) {
                     this.code_ = other.code_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureCodeIsMutable();
                     this.code_.addAll(other.code_);
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
            C2S_RuneStoneDecompose_5413 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneStoneDecompose_5413)RuneStoneMsg.C2S_RuneStoneDecompose_5413.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneStoneDecompose_5413)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCodeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.code_ = RuneStoneMsg.C2S_RuneStoneDecompose_5413.mutableCopy(this.code_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getCodeList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.code_) : this.code_);
         }

         public int getCodeCount() {
            return this.code_.size();
         }

         public int getCode(int index) {
            return this.code_.getInt(index);
         }

         public Builder setCode(int index, int value) {
            this.ensureCodeIsMutable();
            this.code_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCode(int value) {
            this.ensureCodeIsMutable();
            this.code_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCode(Iterable<? extends Integer> values) {
            this.ensureCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.code_);
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.code_ = RuneStoneMsg.C2S_RuneStoneDecompose_5413.emptyIntList();
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

   public static final class S2C_RuneStoneDecompose_5414 extends GeneratedMessageV3 implements S2C_RuneStoneDecompose_5414OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneStoneDecompose_5414 DEFAULT_INSTANCE = new S2C_RuneStoneDecompose_5414();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneStoneDecompose_5414> PARSER = new AbstractParser<S2C_RuneStoneDecompose_5414>() {
         public S2C_RuneStoneDecompose_5414 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneStoneDecompose_5414(input, extensionRegistry);
         }
      };

      private S2C_RuneStoneDecompose_5414(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneStoneDecompose_5414() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneStoneDecompose_5414();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneStoneDecompose_5414(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneDecompose_5414_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneDecompose_5414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneDecompose_5414.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RuneStoneDecompose_5414)) {
            return super.equals(obj);
         } else {
            S2C_RuneStoneDecompose_5414 other = (S2C_RuneStoneDecompose_5414)obj;
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

      public static S2C_RuneStoneDecompose_5414 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneDecompose_5414)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneDecompose_5414 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneDecompose_5414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneDecompose_5414 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneDecompose_5414)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneDecompose_5414 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneDecompose_5414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneDecompose_5414 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneDecompose_5414)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneDecompose_5414 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneDecompose_5414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneDecompose_5414 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneDecompose_5414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneDecompose_5414 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneDecompose_5414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneDecompose_5414 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneDecompose_5414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneDecompose_5414 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneDecompose_5414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneDecompose_5414 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneStoneDecompose_5414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneDecompose_5414 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneDecompose_5414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneStoneDecompose_5414 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneStoneDecompose_5414 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneStoneDecompose_5414> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneStoneDecompose_5414> getParserForType() {
         return PARSER;
      }

      public S2C_RuneStoneDecompose_5414 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneStoneDecompose_5414OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneDecompose_5414_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneDecompose_5414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneDecompose_5414.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_RuneStoneDecompose_5414.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneDecompose_5414_descriptor;
         }

         public S2C_RuneStoneDecompose_5414 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_RuneStoneDecompose_5414.getDefaultInstance();
         }

         public S2C_RuneStoneDecompose_5414 build() {
            S2C_RuneStoneDecompose_5414 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneStoneDecompose_5414 buildPartial() {
            S2C_RuneStoneDecompose_5414 result = new S2C_RuneStoneDecompose_5414(this);
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
            if (other instanceof S2C_RuneStoneDecompose_5414) {
               return this.mergeFrom((S2C_RuneStoneDecompose_5414)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneStoneDecompose_5414 other) {
            if (other == RuneStoneMsg.S2C_RuneStoneDecompose_5414.getDefaultInstance()) {
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
            S2C_RuneStoneDecompose_5414 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneStoneDecompose_5414)RuneStoneMsg.S2C_RuneStoneDecompose_5414.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneStoneDecompose_5414)e.getUnfinishedMessage();
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

   public static final class C2S_RuneRecordList_5415 extends GeneratedMessageV3 implements C2S_RuneRecordList_5415OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RuneRecordList_5415 DEFAULT_INSTANCE = new C2S_RuneRecordList_5415();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneRecordList_5415> PARSER = new AbstractParser<C2S_RuneRecordList_5415>() {
         public C2S_RuneRecordList_5415 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneRecordList_5415(input, extensionRegistry);
         }
      };

      private C2S_RuneRecordList_5415(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneRecordList_5415() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneRecordList_5415();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneRecordList_5415(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneRecordList_5415_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneRecordList_5415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneRecordList_5415.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RuneRecordList_5415)) {
            return super.equals(obj);
         } else {
            C2S_RuneRecordList_5415 other = (C2S_RuneRecordList_5415)obj;
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

      public static C2S_RuneRecordList_5415 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneRecordList_5415)PARSER.parseFrom(data);
      }

      public static C2S_RuneRecordList_5415 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneRecordList_5415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneRecordList_5415 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneRecordList_5415)PARSER.parseFrom(data);
      }

      public static C2S_RuneRecordList_5415 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneRecordList_5415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneRecordList_5415 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneRecordList_5415)PARSER.parseFrom(data);
      }

      public static C2S_RuneRecordList_5415 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneRecordList_5415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneRecordList_5415 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneRecordList_5415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneRecordList_5415 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneRecordList_5415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneRecordList_5415 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneRecordList_5415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneRecordList_5415 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneRecordList_5415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneRecordList_5415 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneRecordList_5415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneRecordList_5415 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneRecordList_5415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneRecordList_5415 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneRecordList_5415 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneRecordList_5415> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneRecordList_5415> getParserForType() {
         return PARSER;
      }

      public C2S_RuneRecordList_5415 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneRecordList_5415OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneRecordList_5415_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneRecordList_5415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneRecordList_5415.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_RuneRecordList_5415.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneRecordList_5415_descriptor;
         }

         public C2S_RuneRecordList_5415 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_RuneRecordList_5415.getDefaultInstance();
         }

         public C2S_RuneRecordList_5415 build() {
            C2S_RuneRecordList_5415 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneRecordList_5415 buildPartial() {
            C2S_RuneRecordList_5415 result = new C2S_RuneRecordList_5415(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_RuneRecordList_5415) {
               return this.mergeFrom((C2S_RuneRecordList_5415)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneRecordList_5415 other) {
            if (other == RuneStoneMsg.C2S_RuneRecordList_5415.getDefaultInstance()) {
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
            C2S_RuneRecordList_5415 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneRecordList_5415)RuneStoneMsg.C2S_RuneRecordList_5415.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneRecordList_5415)e.getUnfinishedMessage();
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

   public static final class S2C_RuneRecordList_5416 extends GeneratedMessageV3 implements S2C_RuneRecordList_5416OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<RuneRecordData> myRecord_;
      public static final int ALLRECORD_FIELD_NUMBER = 2;
      private List<RuneRecordData> allRecord_;
      public static final int ISFREE_FIELD_NUMBER = 3;
      private boolean isFree_;
      public static final int RECRUITNUM_FIELD_NUMBER = 4;
      private int recruitNum_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneRecordList_5416 DEFAULT_INSTANCE = new S2C_RuneRecordList_5416();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneRecordList_5416> PARSER = new AbstractParser<S2C_RuneRecordList_5416>() {
         public S2C_RuneRecordList_5416 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneRecordList_5416(input, extensionRegistry);
         }
      };

      private S2C_RuneRecordList_5416(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneRecordList_5416() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
         this.allRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneRecordList_5416();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneRecordList_5416(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(RuneStoneMsg.RuneRecordData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.allRecord_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.allRecord_.add(input.readMessage(RuneStoneMsg.RuneRecordData.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 1;
                        this.isFree_ = input.readBool();
                        break;
                     case 32:
                        this.bitField0_ |= 2;
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneRecordList_5416_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneRecordList_5416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneRecordList_5416.class, Builder.class);
      }

      public List<RuneRecordData> getMyRecordList() {
         return this.myRecord_;
      }

      public List<? extends RuneRecordDataOrBuilder> getMyRecordOrBuilderList() {
         return this.myRecord_;
      }

      public int getMyRecordCount() {
         return this.myRecord_.size();
      }

      public RuneRecordData getMyRecord(int index) {
         return (RuneRecordData)this.myRecord_.get(index);
      }

      public RuneRecordDataOrBuilder getMyRecordOrBuilder(int index) {
         return (RuneRecordDataOrBuilder)this.myRecord_.get(index);
      }

      public List<RuneRecordData> getAllRecordList() {
         return this.allRecord_;
      }

      public List<? extends RuneRecordDataOrBuilder> getAllRecordOrBuilderList() {
         return this.allRecord_;
      }

      public int getAllRecordCount() {
         return this.allRecord_.size();
      }

      public RuneRecordData getAllRecord(int index) {
         return (RuneRecordData)this.allRecord_.get(index);
      }

      public RuneRecordDataOrBuilder getAllRecordOrBuilder(int index) {
         return (RuneRecordDataOrBuilder)this.allRecord_.get(index);
      }

      public boolean hasIsFree() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsFree() {
         return this.isFree_;
      }

      public boolean hasRecruitNum() {
         return (this.bitField0_ & 2) != 0;
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
         } else {
            for(int i = 0; i < this.getMyRecordCount(); ++i) {
               if (!this.getMyRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getAllRecordCount(); ++i) {
               if (!this.getAllRecord(i).isInitialized()) {
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

         for(int i = 0; i < this.allRecord_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.allRecord_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(3, this.isFree_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.recruitNum_);
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

            for(int i = 0; i < this.allRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.allRecord_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isFree_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.recruitNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneRecordList_5416)) {
            return super.equals(obj);
         } else {
            S2C_RuneRecordList_5416 other = (S2C_RuneRecordList_5416)obj;
            if (!this.getMyRecordList().equals(other.getMyRecordList())) {
               return false;
            } else if (!this.getAllRecordList().equals(other.getAllRecordList())) {
               return false;
            } else if (this.hasIsFree() != other.hasIsFree()) {
               return false;
            } else if (this.hasIsFree() && this.getIsFree() != other.getIsFree()) {
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
            if (this.getMyRecordCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMyRecordList().hashCode();
            }

            if (this.getAllRecordCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAllRecordList().hashCode();
            }

            if (this.hasIsFree()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsFree());
            }

            if (this.hasRecruitNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRecruitNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneRecordList_5416 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneRecordList_5416)PARSER.parseFrom(data);
      }

      public static S2C_RuneRecordList_5416 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneRecordList_5416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneRecordList_5416 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneRecordList_5416)PARSER.parseFrom(data);
      }

      public static S2C_RuneRecordList_5416 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneRecordList_5416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneRecordList_5416 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneRecordList_5416)PARSER.parseFrom(data);
      }

      public static S2C_RuneRecordList_5416 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneRecordList_5416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneRecordList_5416 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneRecordList_5416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneRecordList_5416 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneRecordList_5416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneRecordList_5416 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneRecordList_5416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneRecordList_5416 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneRecordList_5416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneRecordList_5416 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneRecordList_5416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneRecordList_5416 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneRecordList_5416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneRecordList_5416 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneRecordList_5416 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneRecordList_5416> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneRecordList_5416> getParserForType() {
         return PARSER;
      }

      public S2C_RuneRecordList_5416 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneRecordList_5416OrBuilder {
         private int bitField0_;
         private List<RuneRecordData> myRecord_;
         private RepeatedFieldBuilderV3<RuneRecordData, RuneRecordData.Builder, RuneRecordDataOrBuilder> myRecordBuilder_;
         private List<RuneRecordData> allRecord_;
         private RepeatedFieldBuilderV3<RuneRecordData, RuneRecordData.Builder, RuneRecordDataOrBuilder> allRecordBuilder_;
         private boolean isFree_;
         private int recruitNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneRecordList_5416_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneRecordList_5416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneRecordList_5416.class, Builder.class);
         }

         private Builder() {
            this.myRecord_ = Collections.emptyList();
            this.allRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.myRecord_ = Collections.emptyList();
            this.allRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_RuneRecordList_5416.alwaysUseFieldBuilders) {
               this.getMyRecordFieldBuilder();
               this.getAllRecordFieldBuilder();
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

            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.allRecordBuilder_.clear();
            }

            this.isFree_ = false;
            this.bitField0_ &= -5;
            this.recruitNum_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneRecordList_5416_descriptor;
         }

         public S2C_RuneRecordList_5416 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_RuneRecordList_5416.getDefaultInstance();
         }

         public S2C_RuneRecordList_5416 build() {
            S2C_RuneRecordList_5416 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneRecordList_5416 buildPartial() {
            S2C_RuneRecordList_5416 result = new S2C_RuneRecordList_5416(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.myRecordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
                  this.bitField0_ &= -2;
               }

               result.myRecord_ = this.myRecord_;
            } else {
               result.myRecord_ = this.myRecordBuilder_.build();
            }

            if (this.allRecordBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
                  this.bitField0_ &= -3;
               }

               result.allRecord_ = this.allRecord_;
            } else {
               result.allRecord_ = this.allRecordBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isFree_ = this.isFree_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.recruitNum_ = this.recruitNum_;
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
            if (other instanceof S2C_RuneRecordList_5416) {
               return this.mergeFrom((S2C_RuneRecordList_5416)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneRecordList_5416 other) {
            if (other == RuneStoneMsg.S2C_RuneRecordList_5416.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = RuneStoneMsg.S2C_RuneRecordList_5416.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
                  } else {
                     this.myRecordBuilder_.addAllMessages(other.myRecord_);
                  }
               }

               if (this.allRecordBuilder_ == null) {
                  if (!other.allRecord_.isEmpty()) {
                     if (this.allRecord_.isEmpty()) {
                        this.allRecord_ = other.allRecord_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureAllRecordIsMutable();
                        this.allRecord_.addAll(other.allRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.allRecord_.isEmpty()) {
                  if (this.allRecordBuilder_.isEmpty()) {
                     this.allRecordBuilder_.dispose();
                     this.allRecordBuilder_ = null;
                     this.allRecord_ = other.allRecord_;
                     this.bitField0_ &= -3;
                     this.allRecordBuilder_ = RuneStoneMsg.S2C_RuneRecordList_5416.alwaysUseFieldBuilders ? this.getAllRecordFieldBuilder() : null;
                  } else {
                     this.allRecordBuilder_.addAllMessages(other.allRecord_);
                  }
               }

               if (other.hasIsFree()) {
                  this.setIsFree(other.getIsFree());
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
            for(int i = 0; i < this.getMyRecordCount(); ++i) {
               if (!this.getMyRecord(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getAllRecordCount(); ++i) {
               if (!this.getAllRecord(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneRecordList_5416 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneRecordList_5416)RuneStoneMsg.S2C_RuneRecordList_5416.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneRecordList_5416)e.getUnfinishedMessage();
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

         public List<RuneRecordData> getMyRecordList() {
            return this.myRecordBuilder_ == null ? Collections.unmodifiableList(this.myRecord_) : this.myRecordBuilder_.getMessageList();
         }

         public int getMyRecordCount() {
            return this.myRecordBuilder_ == null ? this.myRecord_.size() : this.myRecordBuilder_.getCount();
         }

         public RuneRecordData getMyRecord(int index) {
            return this.myRecordBuilder_ == null ? (RuneRecordData)this.myRecord_.get(index) : (RuneRecordData)this.myRecordBuilder_.getMessage(index);
         }

         public Builder setMyRecord(int index, RuneRecordData value) {
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

         public Builder setMyRecord(int index, RuneRecordData.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(RuneRecordData value) {
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

         public Builder addMyRecord(int index, RuneRecordData value) {
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

         public Builder addMyRecord(RuneRecordData.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(int index, RuneRecordData.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyRecord(Iterable<? extends RuneRecordData> values) {
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

         public RuneRecordData.Builder getMyRecordBuilder(int index) {
            return (RuneRecordData.Builder)this.getMyRecordFieldBuilder().getBuilder(index);
         }

         public RuneRecordDataOrBuilder getMyRecordOrBuilder(int index) {
            return this.myRecordBuilder_ == null ? (RuneRecordDataOrBuilder)this.myRecord_.get(index) : (RuneRecordDataOrBuilder)this.myRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RuneRecordDataOrBuilder> getMyRecordOrBuilderList() {
            return this.myRecordBuilder_ != null ? this.myRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myRecord_);
         }

         public RuneRecordData.Builder addMyRecordBuilder() {
            return (RuneRecordData.Builder)this.getMyRecordFieldBuilder().addBuilder(RuneStoneMsg.RuneRecordData.getDefaultInstance());
         }

         public RuneRecordData.Builder addMyRecordBuilder(int index) {
            return (RuneRecordData.Builder)this.getMyRecordFieldBuilder().addBuilder(index, RuneStoneMsg.RuneRecordData.getDefaultInstance());
         }

         public List<RuneRecordData.Builder> getMyRecordBuilderList() {
            return this.getMyRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RuneRecordData, RuneRecordData.Builder, RuneRecordDataOrBuilder> getMyRecordFieldBuilder() {
            if (this.myRecordBuilder_ == null) {
               this.myRecordBuilder_ = new RepeatedFieldBuilderV3(this.myRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.myRecord_ = null;
            }

            return this.myRecordBuilder_;
         }

         private void ensureAllRecordIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.allRecord_ = new ArrayList(this.allRecord_);
               this.bitField0_ |= 2;
            }

         }

         public List<RuneRecordData> getAllRecordList() {
            return this.allRecordBuilder_ == null ? Collections.unmodifiableList(this.allRecord_) : this.allRecordBuilder_.getMessageList();
         }

         public int getAllRecordCount() {
            return this.allRecordBuilder_ == null ? this.allRecord_.size() : this.allRecordBuilder_.getCount();
         }

         public RuneRecordData getAllRecord(int index) {
            return this.allRecordBuilder_ == null ? (RuneRecordData)this.allRecord_.get(index) : (RuneRecordData)this.allRecordBuilder_.getMessage(index);
         }

         public Builder setAllRecord(int index, RuneRecordData value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAllRecord(int index, RuneRecordData.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(RuneRecordData value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAllRecord(int index, RuneRecordData value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAllRecord(RuneRecordData.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(int index, RuneRecordData.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAllRecord(Iterable<? extends RuneRecordData> values) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.allRecord_);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAllRecord() {
            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.allRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeAllRecord(int index) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.remove(index);
               this.onChanged();
            } else {
               this.allRecordBuilder_.remove(index);
            }

            return this;
         }

         public RuneRecordData.Builder getAllRecordBuilder(int index) {
            return (RuneRecordData.Builder)this.getAllRecordFieldBuilder().getBuilder(index);
         }

         public RuneRecordDataOrBuilder getAllRecordOrBuilder(int index) {
            return this.allRecordBuilder_ == null ? (RuneRecordDataOrBuilder)this.allRecord_.get(index) : (RuneRecordDataOrBuilder)this.allRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RuneRecordDataOrBuilder> getAllRecordOrBuilderList() {
            return this.allRecordBuilder_ != null ? this.allRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.allRecord_);
         }

         public RuneRecordData.Builder addAllRecordBuilder() {
            return (RuneRecordData.Builder)this.getAllRecordFieldBuilder().addBuilder(RuneStoneMsg.RuneRecordData.getDefaultInstance());
         }

         public RuneRecordData.Builder addAllRecordBuilder(int index) {
            return (RuneRecordData.Builder)this.getAllRecordFieldBuilder().addBuilder(index, RuneStoneMsg.RuneRecordData.getDefaultInstance());
         }

         public List<RuneRecordData.Builder> getAllRecordBuilderList() {
            return this.getAllRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RuneRecordData, RuneRecordData.Builder, RuneRecordDataOrBuilder> getAllRecordFieldBuilder() {
            if (this.allRecordBuilder_ == null) {
               this.allRecordBuilder_ = new RepeatedFieldBuilderV3(this.allRecord_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.allRecord_ = null;
            }

            return this.allRecordBuilder_;
         }

         public boolean hasIsFree() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsFree() {
            return this.isFree_;
         }

         public Builder setIsFree(boolean value) {
            this.bitField0_ |= 4;
            this.isFree_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsFree() {
            this.bitField0_ &= -5;
            this.isFree_ = false;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class RuneRecordData extends GeneratedMessageV3 implements RuneRecordDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int RESOURCETYPE_FIELD_NUMBER = 3;
      private int resourceType_;
      public static final int RESOURCEID_FIELD_NUMBER = 4;
      private int resourceId_;
      public static final int RESOURCENUM_FIELD_NUMBER = 5;
      private int resourceNum_;
      private byte memoizedIsInitialized;
      private static final RuneRecordData DEFAULT_INSTANCE = new RuneRecordData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RuneRecordData> PARSER = new AbstractParser<RuneRecordData>() {
         public RuneRecordData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RuneRecordData(input, extensionRegistry);
         }
      };

      private RuneRecordData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RuneRecordData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RuneRecordData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RuneRecordData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerName_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.resourceType_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.resourceId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.resourceNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_RuneRecordData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_RuneRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(RuneRecordData.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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

      public boolean hasResourceType() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getResourceType() {
         return this.resourceType_;
      }

      public boolean hasResourceId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getResourceId() {
         return this.resourceId_;
      }

      public boolean hasResourceNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getResourceNum() {
         return this.resourceNum_;
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
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResourceType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResourceId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResourceNum()) {
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
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.resourceType_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.resourceId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.resourceNum_);
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
               size += GeneratedMessageV3.computeStringSize(2, this.playerName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.resourceType_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.resourceId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.resourceNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RuneRecordData)) {
            return super.equals(obj);
         } else {
            RuneRecordData other = (RuneRecordData)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasResourceType() != other.hasResourceType()) {
               return false;
            } else if (this.hasResourceType() && this.getResourceType() != other.getResourceType()) {
               return false;
            } else if (this.hasResourceId() != other.hasResourceId()) {
               return false;
            } else if (this.hasResourceId() && this.getResourceId() != other.getResourceId()) {
               return false;
            } else if (this.hasResourceNum() != other.hasResourceNum()) {
               return false;
            } else if (this.hasResourceNum() && this.getResourceNum() != other.getResourceNum()) {
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

            if (this.hasPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasResourceType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getResourceType();
            }

            if (this.hasResourceId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getResourceId();
            }

            if (this.hasResourceNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getResourceNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RuneRecordData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RuneRecordData)PARSER.parseFrom(data);
      }

      public static RuneRecordData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RuneRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RuneRecordData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RuneRecordData)PARSER.parseFrom(data);
      }

      public static RuneRecordData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RuneRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RuneRecordData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RuneRecordData)PARSER.parseFrom(data);
      }

      public static RuneRecordData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RuneRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RuneRecordData parseFrom(InputStream input) throws IOException {
         return (RuneRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RuneRecordData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RuneRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RuneRecordData parseDelimitedFrom(InputStream input) throws IOException {
         return (RuneRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RuneRecordData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RuneRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RuneRecordData parseFrom(CodedInputStream input) throws IOException {
         return (RuneRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RuneRecordData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RuneRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RuneRecordData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RuneRecordData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RuneRecordData> parser() {
         return PARSER;
      }

      public Parser<RuneRecordData> getParserForType() {
         return PARSER;
      }

      public RuneRecordData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RuneRecordDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int resourceType_;
         private int resourceId_;
         private int resourceNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_RuneRecordData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_RuneRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(RuneRecordData.class, Builder.class);
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
            if (RuneStoneMsg.RuneRecordData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.resourceType_ = 0;
            this.bitField0_ &= -5;
            this.resourceId_ = 0;
            this.bitField0_ &= -9;
            this.resourceNum_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_RuneRecordData_descriptor;
         }

         public RuneRecordData getDefaultInstanceForType() {
            return RuneStoneMsg.RuneRecordData.getDefaultInstance();
         }

         public RuneRecordData build() {
            RuneRecordData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RuneRecordData buildPartial() {
            RuneRecordData result = new RuneRecordData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 4) != 0) {
               result.resourceType_ = this.resourceType_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.resourceId_ = this.resourceId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.resourceNum_ = this.resourceNum_;
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
            if (other instanceof RuneRecordData) {
               return this.mergeFrom((RuneRecordData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RuneRecordData other) {
            if (other == RuneStoneMsg.RuneRecordData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 2;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasResourceType()) {
                  this.setResourceType(other.getResourceType());
               }

               if (other.hasResourceId()) {
                  this.setResourceId(other.getResourceId());
               }

               if (other.hasResourceNum()) {
                  this.setResourceNum(other.getResourceNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasResourceType()) {
               return false;
            } else if (!this.hasResourceId()) {
               return false;
            } else {
               return this.hasResourceNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RuneRecordData parsedMessage = null;

            try {
               parsedMessage = (RuneRecordData)RuneStoneMsg.RuneRecordData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RuneRecordData)e.getUnfinishedMessage();
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

         public boolean hasPlayerName() {
            return (this.bitField0_ & 2) != 0;
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
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -3;
            this.playerName_ = RuneStoneMsg.RuneRecordData.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasResourceType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResourceType() {
            return this.resourceType_;
         }

         public Builder setResourceType(int value) {
            this.bitField0_ |= 4;
            this.resourceType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResourceType() {
            this.bitField0_ &= -5;
            this.resourceType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResourceId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getResourceId() {
            return this.resourceId_;
         }

         public Builder setResourceId(int value) {
            this.bitField0_ |= 8;
            this.resourceId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResourceId() {
            this.bitField0_ &= -9;
            this.resourceId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResourceNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getResourceNum() {
            return this.resourceNum_;
         }

         public Builder setResourceNum(int value) {
            this.bitField0_ |= 16;
            this.resourceNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResourceNum() {
            this.bitField0_ &= -17;
            this.resourceNum_ = 0;
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

   public static final class C2S_ComposeStone_5418 extends GeneratedMessageV3 implements C2S_ComposeStone_5418OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private Internal.IntList itemCode_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private Internal.IntList targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_ComposeStone_5418 DEFAULT_INSTANCE = new C2S_ComposeStone_5418();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ComposeStone_5418> PARSER = new AbstractParser<C2S_ComposeStone_5418>() {
         public C2S_ComposeStone_5418 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ComposeStone_5418(input, extensionRegistry);
         }
      };

      private C2S_ComposeStone_5418(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ComposeStone_5418() {
         this.memoizedIsInitialized = -1;
         this.itemCode_ = emptyIntList();
         this.targetId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ComposeStone_5418();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ComposeStone_5418(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemCode_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.targetId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.targetId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.targetId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.targetId_.addInt(input.readInt32());
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
                     this.itemCode_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.itemCode_.makeImmutable();
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.targetId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_ComposeStone_5418_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_ComposeStone_5418_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ComposeStone_5418.class, Builder.class);
      }

      public List<Integer> getItemCodeList() {
         return this.itemCode_;
      }

      public int getItemCodeCount() {
         return this.itemCode_.size();
      }

      public int getItemCode(int index) {
         return this.itemCode_.getInt(index);
      }

      public List<Integer> getTargetIdList() {
         return this.targetId_;
      }

      public int getTargetIdCount() {
         return this.targetId_.size();
      }

      public int getTargetId(int index) {
         return this.targetId_.getInt(index);
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
         for(int i = 0; i < this.itemCode_.size(); ++i) {
            output.writeInt32(1, this.itemCode_.getInt(i));
         }

         for(int i = 0; i < this.targetId_.size(); ++i) {
            output.writeInt32(2, this.targetId_.getInt(i));
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

            for(int i = 0; i < this.itemCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.itemCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getItemCodeList().size();
            dataSize = 0;

            for(int i = 0; i < this.targetId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.targetId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTargetIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ComposeStone_5418)) {
            return super.equals(obj);
         } else {
            C2S_ComposeStone_5418 other = (C2S_ComposeStone_5418)obj;
            if (!this.getItemCodeList().equals(other.getItemCodeList())) {
               return false;
            } else if (!this.getTargetIdList().equals(other.getTargetIdList())) {
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
            if (this.getItemCodeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemCodeList().hashCode();
            }

            if (this.getTargetIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTargetIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ComposeStone_5418 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5418)PARSER.parseFrom(data);
      }

      public static C2S_ComposeStone_5418 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeStone_5418 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5418)PARSER.parseFrom(data);
      }

      public static C2S_ComposeStone_5418 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeStone_5418 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5418)PARSER.parseFrom(data);
      }

      public static C2S_ComposeStone_5418 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeStone_5418 parseFrom(InputStream input) throws IOException {
         return (C2S_ComposeStone_5418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ComposeStone_5418 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeStone_5418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ComposeStone_5418 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ComposeStone_5418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ComposeStone_5418 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeStone_5418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ComposeStone_5418 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ComposeStone_5418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ComposeStone_5418 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeStone_5418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ComposeStone_5418 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ComposeStone_5418 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ComposeStone_5418> parser() {
         return PARSER;
      }

      public Parser<C2S_ComposeStone_5418> getParserForType() {
         return PARSER;
      }

      public C2S_ComposeStone_5418 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ComposeStone_5418OrBuilder {
         private int bitField0_;
         private Internal.IntList itemCode_;
         private Internal.IntList targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_ComposeStone_5418_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_ComposeStone_5418_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ComposeStone_5418.class, Builder.class);
         }

         private Builder() {
            this.itemCode_ = RuneStoneMsg.C2S_ComposeStone_5418.emptyIntList();
            this.targetId_ = RuneStoneMsg.C2S_ComposeStone_5418.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemCode_ = RuneStoneMsg.C2S_ComposeStone_5418.emptyIntList();
            this.targetId_ = RuneStoneMsg.C2S_ComposeStone_5418.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_ComposeStone_5418.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = RuneStoneMsg.C2S_ComposeStone_5418.emptyIntList();
            this.bitField0_ &= -2;
            this.targetId_ = RuneStoneMsg.C2S_ComposeStone_5418.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_ComposeStone_5418_descriptor;
         }

         public C2S_ComposeStone_5418 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_ComposeStone_5418.getDefaultInstance();
         }

         public C2S_ComposeStone_5418 build() {
            C2S_ComposeStone_5418 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ComposeStone_5418 buildPartial() {
            C2S_ComposeStone_5418 result = new C2S_ComposeStone_5418(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.itemCode_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.itemCode_ = this.itemCode_;
            if ((this.bitField0_ & 2) != 0) {
               this.targetId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.targetId_ = this.targetId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ComposeStone_5418) {
               return this.mergeFrom((C2S_ComposeStone_5418)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ComposeStone_5418 other) {
            if (other == RuneStoneMsg.C2S_ComposeStone_5418.getDefaultInstance()) {
               return this;
            } else {
               if (!other.itemCode_.isEmpty()) {
                  if (this.itemCode_.isEmpty()) {
                     this.itemCode_ = other.itemCode_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureItemCodeIsMutable();
                     this.itemCode_.addAll(other.itemCode_);
                  }

                  this.onChanged();
               }

               if (!other.targetId_.isEmpty()) {
                  if (this.targetId_.isEmpty()) {
                     this.targetId_ = other.targetId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTargetIdIsMutable();
                     this.targetId_.addAll(other.targetId_);
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
            C2S_ComposeStone_5418 parsedMessage = null;

            try {
               parsedMessage = (C2S_ComposeStone_5418)RuneStoneMsg.C2S_ComposeStone_5418.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ComposeStone_5418)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemCodeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.itemCode_ = RuneStoneMsg.C2S_ComposeStone_5418.mutableCopy(this.itemCode_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getItemCodeList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.itemCode_) : this.itemCode_);
         }

         public int getItemCodeCount() {
            return this.itemCode_.size();
         }

         public int getItemCode(int index) {
            return this.itemCode_.getInt(index);
         }

         public Builder setItemCode(int index, int value) {
            this.ensureItemCodeIsMutable();
            this.itemCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addItemCode(int value) {
            this.ensureItemCodeIsMutable();
            this.itemCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllItemCode(Iterable<? extends Integer> values) {
            this.ensureItemCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemCode_);
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.itemCode_ = RuneStoneMsg.C2S_ComposeStone_5418.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         private void ensureTargetIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.targetId_ = RuneStoneMsg.C2S_ComposeStone_5418.mutableCopy(this.targetId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getTargetIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.targetId_) : this.targetId_);
         }

         public int getTargetIdCount() {
            return this.targetId_.size();
         }

         public int getTargetId(int index) {
            return this.targetId_.getInt(index);
         }

         public Builder setTargetId(int index, int value) {
            this.ensureTargetIdIsMutable();
            this.targetId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTargetId(int value) {
            this.ensureTargetIdIsMutable();
            this.targetId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTargetId(Iterable<? extends Integer> values) {
            this.ensureTargetIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.targetId_);
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.targetId_ = RuneStoneMsg.C2S_ComposeStone_5418.emptyIntList();
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

   public static final class S2C_ComposeStone_5419 extends GeneratedMessageV3 implements S2C_ComposeStone_5419OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ComposeStone_5419 DEFAULT_INSTANCE = new S2C_ComposeStone_5419();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ComposeStone_5419> PARSER = new AbstractParser<S2C_ComposeStone_5419>() {
         public S2C_ComposeStone_5419 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ComposeStone_5419(input, extensionRegistry);
         }
      };

      private S2C_ComposeStone_5419(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ComposeStone_5419() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ComposeStone_5419();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ComposeStone_5419(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_ComposeStone_5419_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_ComposeStone_5419_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ComposeStone_5419.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ComposeStone_5419)) {
            return super.equals(obj);
         } else {
            S2C_ComposeStone_5419 other = (S2C_ComposeStone_5419)obj;
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

      public static S2C_ComposeStone_5419 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5419)PARSER.parseFrom(data);
      }

      public static S2C_ComposeStone_5419 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeStone_5419 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5419)PARSER.parseFrom(data);
      }

      public static S2C_ComposeStone_5419 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeStone_5419 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5419)PARSER.parseFrom(data);
      }

      public static S2C_ComposeStone_5419 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeStone_5419 parseFrom(InputStream input) throws IOException {
         return (S2C_ComposeStone_5419)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ComposeStone_5419 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeStone_5419)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ComposeStone_5419 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ComposeStone_5419)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ComposeStone_5419 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeStone_5419)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ComposeStone_5419 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ComposeStone_5419)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ComposeStone_5419 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeStone_5419)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ComposeStone_5419 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ComposeStone_5419 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ComposeStone_5419> parser() {
         return PARSER;
      }

      public Parser<S2C_ComposeStone_5419> getParserForType() {
         return PARSER;
      }

      public S2C_ComposeStone_5419 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ComposeStone_5419OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_ComposeStone_5419_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_ComposeStone_5419_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ComposeStone_5419.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_ComposeStone_5419.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_ComposeStone_5419_descriptor;
         }

         public S2C_ComposeStone_5419 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_ComposeStone_5419.getDefaultInstance();
         }

         public S2C_ComposeStone_5419 build() {
            S2C_ComposeStone_5419 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ComposeStone_5419 buildPartial() {
            S2C_ComposeStone_5419 result = new S2C_ComposeStone_5419(this);
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
            if (other instanceof S2C_ComposeStone_5419) {
               return this.mergeFrom((S2C_ComposeStone_5419)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ComposeStone_5419 other) {
            if (other == RuneStoneMsg.S2C_ComposeStone_5419.getDefaultInstance()) {
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
            S2C_ComposeStone_5419 parsedMessage = null;

            try {
               parsedMessage = (S2C_ComposeStone_5419)RuneStoneMsg.S2C_ComposeStone_5419.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ComposeStone_5419)e.getUnfinishedMessage();
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

   public static final class C2S_HeroStoneLock_5420 extends GeneratedMessageV3 implements C2S_HeroStoneLock_5420OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int TYPEOPERATE_FIELD_NUMBER = 3;
      private int typeOperate_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroStoneLock_5420 DEFAULT_INSTANCE = new C2S_HeroStoneLock_5420();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroStoneLock_5420> PARSER = new AbstractParser<C2S_HeroStoneLock_5420>() {
         public C2S_HeroStoneLock_5420 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroStoneLock_5420(input, extensionRegistry);
         }
      };

      private C2S_HeroStoneLock_5420(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroStoneLock_5420() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroStoneLock_5420();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroStoneLock_5420(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.typeOperate_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_HeroStoneLock_5420_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_HeroStoneLock_5420_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroStoneLock_5420.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasTypeOperate() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTypeOperate() {
         return this.typeOperate_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTypeOperate()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.typeOperate_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.typeOperate_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroStoneLock_5420)) {
            return super.equals(obj);
         } else {
            C2S_HeroStoneLock_5420 other = (C2S_HeroStoneLock_5420)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasTypeOperate() != other.hasTypeOperate()) {
               return false;
            } else if (this.hasTypeOperate() && this.getTypeOperate() != other.getTypeOperate()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.hasTypeOperate()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTypeOperate();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroStoneLock_5420 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroStoneLock_5420)PARSER.parseFrom(data);
      }

      public static C2S_HeroStoneLock_5420 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStoneLock_5420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStoneLock_5420 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroStoneLock_5420)PARSER.parseFrom(data);
      }

      public static C2S_HeroStoneLock_5420 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStoneLock_5420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStoneLock_5420 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroStoneLock_5420)PARSER.parseFrom(data);
      }

      public static C2S_HeroStoneLock_5420 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStoneLock_5420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStoneLock_5420 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroStoneLock_5420)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroStoneLock_5420 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStoneLock_5420)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroStoneLock_5420 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroStoneLock_5420)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroStoneLock_5420 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStoneLock_5420)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroStoneLock_5420 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroStoneLock_5420)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroStoneLock_5420 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStoneLock_5420)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroStoneLock_5420 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroStoneLock_5420 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroStoneLock_5420> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroStoneLock_5420> getParserForType() {
         return PARSER;
      }

      public C2S_HeroStoneLock_5420 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroStoneLock_5420OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int typeOperate_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_HeroStoneLock_5420_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_HeroStoneLock_5420_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroStoneLock_5420.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_HeroStoneLock_5420.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.typeOperate_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_HeroStoneLock_5420_descriptor;
         }

         public C2S_HeroStoneLock_5420 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_HeroStoneLock_5420.getDefaultInstance();
         }

         public C2S_HeroStoneLock_5420 build() {
            C2S_HeroStoneLock_5420 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroStoneLock_5420 buildPartial() {
            C2S_HeroStoneLock_5420 result = new C2S_HeroStoneLock_5420(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 4) != 0) {
               result.typeOperate_ = this.typeOperate_;
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
            if (other instanceof C2S_HeroStoneLock_5420) {
               return this.mergeFrom((C2S_HeroStoneLock_5420)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroStoneLock_5420 other) {
            if (other == RuneStoneMsg.C2S_HeroStoneLock_5420.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasTypeOperate()) {
                  this.setTypeOperate(other.getTypeOperate());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasTypeOperate();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroStoneLock_5420 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroStoneLock_5420)RuneStoneMsg.C2S_HeroStoneLock_5420.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroStoneLock_5420)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasTypeOperate() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTypeOperate() {
            return this.typeOperate_;
         }

         public Builder setTypeOperate(int value) {
            this.bitField0_ |= 4;
            this.typeOperate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTypeOperate() {
            this.bitField0_ &= -5;
            this.typeOperate_ = 0;
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

   public static final class S2C_HeroStoneLock_5421 extends GeneratedMessageV3 implements S2C_HeroStoneLock_5421OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int TYPEOPERATE_FIELD_NUMBER = 3;
      private int typeOperate_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroStoneLock_5421 DEFAULT_INSTANCE = new S2C_HeroStoneLock_5421();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroStoneLock_5421> PARSER = new AbstractParser<S2C_HeroStoneLock_5421>() {
         public S2C_HeroStoneLock_5421 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroStoneLock_5421(input, extensionRegistry);
         }
      };

      private S2C_HeroStoneLock_5421(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroStoneLock_5421() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroStoneLock_5421();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroStoneLock_5421(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.typeOperate_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_HeroStoneLock_5421_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_HeroStoneLock_5421_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroStoneLock_5421.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasTypeOperate() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTypeOperate() {
         return this.typeOperate_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTypeOperate()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.typeOperate_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.typeOperate_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroStoneLock_5421)) {
            return super.equals(obj);
         } else {
            S2C_HeroStoneLock_5421 other = (S2C_HeroStoneLock_5421)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasTypeOperate() != other.hasTypeOperate()) {
               return false;
            } else if (this.hasTypeOperate() && this.getTypeOperate() != other.getTypeOperate()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.hasTypeOperate()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTypeOperate();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroStoneLock_5421 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroStoneLock_5421)PARSER.parseFrom(data);
      }

      public static S2C_HeroStoneLock_5421 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStoneLock_5421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStoneLock_5421 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroStoneLock_5421)PARSER.parseFrom(data);
      }

      public static S2C_HeroStoneLock_5421 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStoneLock_5421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStoneLock_5421 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroStoneLock_5421)PARSER.parseFrom(data);
      }

      public static S2C_HeroStoneLock_5421 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStoneLock_5421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStoneLock_5421 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroStoneLock_5421)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroStoneLock_5421 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStoneLock_5421)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroStoneLock_5421 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroStoneLock_5421)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroStoneLock_5421 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStoneLock_5421)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroStoneLock_5421 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroStoneLock_5421)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroStoneLock_5421 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStoneLock_5421)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroStoneLock_5421 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroStoneLock_5421 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroStoneLock_5421> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroStoneLock_5421> getParserForType() {
         return PARSER;
      }

      public S2C_HeroStoneLock_5421 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroStoneLock_5421OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int typeOperate_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_HeroStoneLock_5421_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_HeroStoneLock_5421_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroStoneLock_5421.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_HeroStoneLock_5421.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.typeOperate_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_HeroStoneLock_5421_descriptor;
         }

         public S2C_HeroStoneLock_5421 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_HeroStoneLock_5421.getDefaultInstance();
         }

         public S2C_HeroStoneLock_5421 build() {
            S2C_HeroStoneLock_5421 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroStoneLock_5421 buildPartial() {
            S2C_HeroStoneLock_5421 result = new S2C_HeroStoneLock_5421(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 4) != 0) {
               result.typeOperate_ = this.typeOperate_;
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
            if (other instanceof S2C_HeroStoneLock_5421) {
               return this.mergeFrom((S2C_HeroStoneLock_5421)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroStoneLock_5421 other) {
            if (other == RuneStoneMsg.S2C_HeroStoneLock_5421.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasTypeOperate()) {
                  this.setTypeOperate(other.getTypeOperate());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasTypeOperate();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroStoneLock_5421 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroStoneLock_5421)RuneStoneMsg.S2C_HeroStoneLock_5421.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroStoneLock_5421)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasTypeOperate() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTypeOperate() {
            return this.typeOperate_;
         }

         public Builder setTypeOperate(int value) {
            this.bitField0_ |= 4;
            this.typeOperate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTypeOperate() {
            this.bitField0_ &= -5;
            this.typeOperate_ = 0;
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

   public static final class C2S_BagStoneLock_5422 extends GeneratedMessageV3 implements C2S_BagStoneLock_5422OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private int itemCode_;
      public static final int TYPEOPERATE_FIELD_NUMBER = 2;
      private int typeOperate_;
      private byte memoizedIsInitialized;
      private static final C2S_BagStoneLock_5422 DEFAULT_INSTANCE = new C2S_BagStoneLock_5422();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BagStoneLock_5422> PARSER = new AbstractParser<C2S_BagStoneLock_5422>() {
         public C2S_BagStoneLock_5422 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BagStoneLock_5422(input, extensionRegistry);
         }
      };

      private C2S_BagStoneLock_5422(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BagStoneLock_5422() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BagStoneLock_5422();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BagStoneLock_5422(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.typeOperate_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_BagStoneLock_5422_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_BagStoneLock_5422_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BagStoneLock_5422.class, Builder.class);
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasTypeOperate() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTypeOperate() {
         return this.typeOperate_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTypeOperate()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.typeOperate_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.typeOperate_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BagStoneLock_5422)) {
            return super.equals(obj);
         } else {
            C2S_BagStoneLock_5422 other = (C2S_BagStoneLock_5422)obj;
            if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasTypeOperate() != other.hasTypeOperate()) {
               return false;
            } else if (this.hasTypeOperate() && this.getTypeOperate() != other.getTypeOperate()) {
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
            if (this.hasItemCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasTypeOperate()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTypeOperate();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BagStoneLock_5422 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BagStoneLock_5422)PARSER.parseFrom(data);
      }

      public static C2S_BagStoneLock_5422 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BagStoneLock_5422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BagStoneLock_5422 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BagStoneLock_5422)PARSER.parseFrom(data);
      }

      public static C2S_BagStoneLock_5422 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BagStoneLock_5422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BagStoneLock_5422 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BagStoneLock_5422)PARSER.parseFrom(data);
      }

      public static C2S_BagStoneLock_5422 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BagStoneLock_5422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BagStoneLock_5422 parseFrom(InputStream input) throws IOException {
         return (C2S_BagStoneLock_5422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BagStoneLock_5422 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BagStoneLock_5422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BagStoneLock_5422 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BagStoneLock_5422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BagStoneLock_5422 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BagStoneLock_5422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BagStoneLock_5422 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BagStoneLock_5422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BagStoneLock_5422 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BagStoneLock_5422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BagStoneLock_5422 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BagStoneLock_5422 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BagStoneLock_5422> parser() {
         return PARSER;
      }

      public Parser<C2S_BagStoneLock_5422> getParserForType() {
         return PARSER;
      }

      public C2S_BagStoneLock_5422 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BagStoneLock_5422OrBuilder {
         private int bitField0_;
         private int itemCode_;
         private int typeOperate_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_BagStoneLock_5422_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_BagStoneLock_5422_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BagStoneLock_5422.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_BagStoneLock_5422.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = 0;
            this.bitField0_ &= -2;
            this.typeOperate_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_BagStoneLock_5422_descriptor;
         }

         public C2S_BagStoneLock_5422 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_BagStoneLock_5422.getDefaultInstance();
         }

         public C2S_BagStoneLock_5422 build() {
            C2S_BagStoneLock_5422 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BagStoneLock_5422 buildPartial() {
            C2S_BagStoneLock_5422 result = new C2S_BagStoneLock_5422(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.typeOperate_ = this.typeOperate_;
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
            if (other instanceof C2S_BagStoneLock_5422) {
               return this.mergeFrom((C2S_BagStoneLock_5422)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BagStoneLock_5422 other) {
            if (other == RuneStoneMsg.C2S_BagStoneLock_5422.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasTypeOperate()) {
                  this.setTypeOperate(other.getTypeOperate());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItemCode()) {
               return false;
            } else {
               return this.hasTypeOperate();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BagStoneLock_5422 parsedMessage = null;

            try {
               parsedMessage = (C2S_BagStoneLock_5422)RuneStoneMsg.C2S_BagStoneLock_5422.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BagStoneLock_5422)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 1;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTypeOperate() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTypeOperate() {
            return this.typeOperate_;
         }

         public Builder setTypeOperate(int value) {
            this.bitField0_ |= 2;
            this.typeOperate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTypeOperate() {
            this.bitField0_ &= -3;
            this.typeOperate_ = 0;
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

   public static final class S2C_BagStoneLock_5423 extends GeneratedMessageV3 implements S2C_BagStoneLock_5423OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int TYPEOPERATE_FIELD_NUMBER = 3;
      private int typeOperate_;
      private byte memoizedIsInitialized;
      private static final S2C_BagStoneLock_5423 DEFAULT_INSTANCE = new S2C_BagStoneLock_5423();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BagStoneLock_5423> PARSER = new AbstractParser<S2C_BagStoneLock_5423>() {
         public S2C_BagStoneLock_5423 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BagStoneLock_5423(input, extensionRegistry);
         }
      };

      private S2C_BagStoneLock_5423(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BagStoneLock_5423() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BagStoneLock_5423();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BagStoneLock_5423(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.typeOperate_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_BagStoneLock_5423_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_BagStoneLock_5423_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BagStoneLock_5423.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasTypeOperate() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTypeOperate() {
         return this.typeOperate_;
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
         } else if (!this.hasItemCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTypeOperate()) {
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
            output.writeInt32(2, this.itemCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.typeOperate_);
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
               size += CodedOutputStream.computeInt32Size(2, this.itemCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.typeOperate_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BagStoneLock_5423)) {
            return super.equals(obj);
         } else {
            S2C_BagStoneLock_5423 other = (S2C_BagStoneLock_5423)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasTypeOperate() != other.hasTypeOperate()) {
               return false;
            } else if (this.hasTypeOperate() && this.getTypeOperate() != other.getTypeOperate()) {
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

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasTypeOperate()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTypeOperate();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BagStoneLock_5423 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BagStoneLock_5423)PARSER.parseFrom(data);
      }

      public static S2C_BagStoneLock_5423 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BagStoneLock_5423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BagStoneLock_5423 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BagStoneLock_5423)PARSER.parseFrom(data);
      }

      public static S2C_BagStoneLock_5423 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BagStoneLock_5423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BagStoneLock_5423 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BagStoneLock_5423)PARSER.parseFrom(data);
      }

      public static S2C_BagStoneLock_5423 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BagStoneLock_5423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BagStoneLock_5423 parseFrom(InputStream input) throws IOException {
         return (S2C_BagStoneLock_5423)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BagStoneLock_5423 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BagStoneLock_5423)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BagStoneLock_5423 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BagStoneLock_5423)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BagStoneLock_5423 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BagStoneLock_5423)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BagStoneLock_5423 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BagStoneLock_5423)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BagStoneLock_5423 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BagStoneLock_5423)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BagStoneLock_5423 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BagStoneLock_5423 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BagStoneLock_5423> parser() {
         return PARSER;
      }

      public Parser<S2C_BagStoneLock_5423> getParserForType() {
         return PARSER;
      }

      public S2C_BagStoneLock_5423 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BagStoneLock_5423OrBuilder {
         private int bitField0_;
         private int result_;
         private int itemCode_;
         private int typeOperate_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_BagStoneLock_5423_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_BagStoneLock_5423_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BagStoneLock_5423.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_BagStoneLock_5423.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.typeOperate_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_BagStoneLock_5423_descriptor;
         }

         public S2C_BagStoneLock_5423 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_BagStoneLock_5423.getDefaultInstance();
         }

         public S2C_BagStoneLock_5423 build() {
            S2C_BagStoneLock_5423 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BagStoneLock_5423 buildPartial() {
            S2C_BagStoneLock_5423 result = new S2C_BagStoneLock_5423(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.typeOperate_ = this.typeOperate_;
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
            if (other instanceof S2C_BagStoneLock_5423) {
               return this.mergeFrom((S2C_BagStoneLock_5423)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BagStoneLock_5423 other) {
            if (other == RuneStoneMsg.S2C_BagStoneLock_5423.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasTypeOperate()) {
                  this.setTypeOperate(other.getTypeOperate());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasItemCode()) {
               return false;
            } else {
               return this.hasTypeOperate();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BagStoneLock_5423 parsedMessage = null;

            try {
               parsedMessage = (S2C_BagStoneLock_5423)RuneStoneMsg.S2C_BagStoneLock_5423.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BagStoneLock_5423)e.getUnfinishedMessage();
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

         public boolean hasItemCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 2;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTypeOperate() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTypeOperate() {
            return this.typeOperate_;
         }

         public Builder setTypeOperate(int value) {
            this.bitField0_ |= 4;
            this.typeOperate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTypeOperate() {
            this.bitField0_ &= -5;
            this.typeOperate_ = 0;
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

   public static final class C2S_RuneStoneHeroStrengthen_5426 extends GeneratedMessageV3 implements C2S_RuneStoneHeroStrengthen_5426OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneStoneHeroStrengthen_5426 DEFAULT_INSTANCE = new C2S_RuneStoneHeroStrengthen_5426();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneStoneHeroStrengthen_5426> PARSER = new AbstractParser<C2S_RuneStoneHeroStrengthen_5426>() {
         public C2S_RuneStoneHeroStrengthen_5426 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneStoneHeroStrengthen_5426(input, extensionRegistry);
         }
      };

      private C2S_RuneStoneHeroStrengthen_5426(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneStoneHeroStrengthen_5426() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneStoneHeroStrengthen_5426();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneStoneHeroStrengthen_5426(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.position_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneHeroStrengthen_5426_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneHeroStrengthen_5426_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneHeroStrengthen_5426.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
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
               size += CodedOutputStream.computeEnumSize(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RuneStoneHeroStrengthen_5426)) {
            return super.equals(obj);
         } else {
            C2S_RuneStoneHeroStrengthen_5426 other = (C2S_RuneStoneHeroStrengthen_5426)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.position_;
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneHeroStrengthen_5426)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneHeroStrengthen_5426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneHeroStrengthen_5426)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneHeroStrengthen_5426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneHeroStrengthen_5426)PARSER.parseFrom(data);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneStoneHeroStrengthen_5426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneHeroStrengthen_5426)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneHeroStrengthen_5426)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneStoneHeroStrengthen_5426)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneHeroStrengthen_5426)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneStoneHeroStrengthen_5426)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneStoneHeroStrengthen_5426 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneStoneHeroStrengthen_5426)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneStoneHeroStrengthen_5426 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneStoneHeroStrengthen_5426 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneStoneHeroStrengthen_5426> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneStoneHeroStrengthen_5426> getParserForType() {
         return PARSER;
      }

      public C2S_RuneStoneHeroStrengthen_5426 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneStoneHeroStrengthen_5426OrBuilder {
         private int bitField0_;
         private int position_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneHeroStrengthen_5426_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneHeroStrengthen_5426_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneStoneHeroStrengthen_5426.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.C2S_RuneStoneHeroStrengthen_5426.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 1;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_C2S_RuneStoneHeroStrengthen_5426_descriptor;
         }

         public C2S_RuneStoneHeroStrengthen_5426 getDefaultInstanceForType() {
            return RuneStoneMsg.C2S_RuneStoneHeroStrengthen_5426.getDefaultInstance();
         }

         public C2S_RuneStoneHeroStrengthen_5426 build() {
            C2S_RuneStoneHeroStrengthen_5426 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneStoneHeroStrengthen_5426 buildPartial() {
            C2S_RuneStoneHeroStrengthen_5426 result = new C2S_RuneStoneHeroStrengthen_5426(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_RuneStoneHeroStrengthen_5426) {
               return this.mergeFrom((C2S_RuneStoneHeroStrengthen_5426)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneStoneHeroStrengthen_5426 other) {
            if (other == RuneStoneMsg.C2S_RuneStoneHeroStrengthen_5426.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RuneStoneHeroStrengthen_5426 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneStoneHeroStrengthen_5426)RuneStoneMsg.C2S_RuneStoneHeroStrengthen_5426.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneStoneHeroStrengthen_5426)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
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

   public static final class S2C_RuneStoneHeroStrength_5427 extends GeneratedMessageV3 implements S2C_RuneStoneHeroStrength_5427OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int INFO_FIELD_NUMBER = 3;
      private CommonMsg.RuneStoneWear info_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneStoneHeroStrength_5427 DEFAULT_INSTANCE = new S2C_RuneStoneHeroStrength_5427();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneStoneHeroStrength_5427> PARSER = new AbstractParser<S2C_RuneStoneHeroStrength_5427>() {
         public S2C_RuneStoneHeroStrength_5427 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneStoneHeroStrength_5427(input, extensionRegistry);
         }
      };

      private S2C_RuneStoneHeroStrength_5427(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneStoneHeroStrength_5427() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneStoneHeroStrength_5427();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneStoneHeroStrength_5427(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.position_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 26:
                        CommonMsg.RuneStoneWear.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (CommonMsg.RuneStoneWear)input.readMessage(CommonMsg.RuneStoneWear.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneHeroStrength_5427_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneHeroStrength_5427_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneHeroStrength_5427.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.RuneStoneWear getInfo() {
         return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
      }

      public CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getInfo());
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
               size += CodedOutputStream.computeEnumSize(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneStoneHeroStrength_5427)) {
            return super.equals(obj);
         } else {
            S2C_RuneStoneHeroStrength_5427 other = (S2C_RuneStoneHeroStrength_5427)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.position_;
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneStoneHeroStrength_5427 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneHeroStrength_5427)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneHeroStrength_5427)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneHeroStrength_5427)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneHeroStrength_5427)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneHeroStrength_5427)PARSER.parseFrom(data);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneStoneHeroStrength_5427)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneHeroStrength_5427)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneHeroStrength_5427)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneStoneHeroStrength_5427)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneHeroStrength_5427)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneStoneHeroStrength_5427)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneStoneHeroStrength_5427 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneStoneHeroStrength_5427)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneStoneHeroStrength_5427 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneStoneHeroStrength_5427 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneStoneHeroStrength_5427> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneStoneHeroStrength_5427> getParserForType() {
         return PARSER;
      }

      public S2C_RuneStoneHeroStrength_5427 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneStoneHeroStrength_5427OrBuilder {
         private int bitField0_;
         private int position_;
         private int heroCode_;
         private CommonMsg.RuneStoneWear info_;
         private SingleFieldBuilderV3<CommonMsg.RuneStoneWear, CommonMsg.RuneStoneWear.Builder, CommonMsg.RuneStoneWearOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneHeroStrength_5427_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneHeroStrength_5427_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneStoneHeroStrength_5427.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneStoneMsg.S2C_RuneStoneHeroStrength_5427.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 1;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneStoneMsg.internal_static_runeStone_com_gzbz_protobuf_S2C_RuneStoneHeroStrength_5427_descriptor;
         }

         public S2C_RuneStoneHeroStrength_5427 getDefaultInstanceForType() {
            return RuneStoneMsg.S2C_RuneStoneHeroStrength_5427.getDefaultInstance();
         }

         public S2C_RuneStoneHeroStrength_5427 build() {
            S2C_RuneStoneHeroStrength_5427 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneStoneHeroStrength_5427 buildPartial() {
            S2C_RuneStoneHeroStrength_5427 result = new S2C_RuneStoneHeroStrength_5427(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (CommonMsg.RuneStoneWear)this.infoBuilder_.build();
               }

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
            if (other instanceof S2C_RuneStoneHeroStrength_5427) {
               return this.mergeFrom((S2C_RuneStoneHeroStrength_5427)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneStoneHeroStrength_5427 other) {
            if (other == RuneStoneMsg.S2C_RuneStoneHeroStrength_5427.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneStoneHeroStrength_5427 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneStoneHeroStrength_5427)RuneStoneMsg.S2C_RuneStoneHeroStrength_5427.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneStoneHeroStrength_5427)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.RuneStoneWear getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
            } else {
               return (CommonMsg.RuneStoneWear)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(CommonMsg.RuneStoneWear value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setInfo(CommonMsg.RuneStoneWear.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeInfo(CommonMsg.RuneStoneWear value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.info_ != null && this.info_ != CommonMsg.RuneStoneWear.getDefaultInstance()) {
                  this.info_ = CommonMsg.RuneStoneWear.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public CommonMsg.RuneStoneWear.Builder getInfoBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (CommonMsg.RuneStoneWear.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (CommonMsg.RuneStoneWearOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? CommonMsg.RuneStoneWear.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.RuneStoneWear, CommonMsg.RuneStoneWear.Builder, CommonMsg.RuneStoneWearOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_BagStoneLock_5422OrBuilder extends MessageOrBuilder {
      boolean hasItemCode();

      int getItemCode();

      boolean hasTypeOperate();

      int getTypeOperate();
   }

   public interface C2S_ComposeStone_5418OrBuilder extends MessageOrBuilder {
      List<Integer> getItemCodeList();

      int getItemCodeCount();

      int getItemCode(int index);

      List<Integer> getTargetIdList();

      int getTargetIdCount();

      int getTargetId(int index);
   }

   public interface C2S_HeroStoneLock_5420OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasTypeOperate();

      int getTypeOperate();
   }

   public interface C2S_RuneRecordList_5415OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RuneStoneDecompose_5413OrBuilder extends MessageOrBuilder {
      List<Integer> getCodeList();

      int getCodeCount();

      int getCode(int index);
   }

   public interface C2S_RuneStoneHeroStrengthen_5426OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_RuneStoneInherit_5407OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();

      boolean hasProKey();

      int getProKey();

      boolean hasTargetKey();

      int getTargetKey();
   }

   public interface C2S_RuneStoneRecruitment_5409OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_RuneStoneUpLev_5405OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasHeroCode();

      int getHeroCode();

      List<Integer> getConsumeItemList();

      int getConsumeItemCount();

      int getConsumeItem(int index);

      List<Integer> getExtraCodeList();

      int getExtraCodeCount();

      int getExtraCode(int index);
   }

   public interface C2S_RuneStoneUpLev_5411OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      List<Integer> getConsumeItemList();

      int getConsumeItemCount();

      int getConsumeItem(int index);

      List<Integer> getExtraCodeList();

      int getExtraCodeCount();

      int getExtraCode(int index);
   }

   public interface C2S_UndressRuneStone_5403OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();
   }

   public interface C2S_WearRuneStone_5401OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasItemCode();

      int getItemCode();

      boolean hasTypeOperate();

      int getTypeOperate();
   }

   public interface RuneRecordDataOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasResourceType();

      int getResourceType();

      boolean hasResourceId();

      int getResourceId();

      boolean hasResourceNum();

      int getResourceNum();
   }

   public interface S2C_BagStoneLock_5423OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasItemCode();

      int getItemCode();

      boolean hasTypeOperate();

      int getTypeOperate();
   }

   public interface S2C_ComposeStone_5419OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_HeroStoneLock_5421OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasTypeOperate();

      int getTypeOperate();
   }

   public interface S2C_RuneRecordList_5416OrBuilder extends MessageOrBuilder {
      List<RuneRecordData> getMyRecordList();

      RuneRecordData getMyRecord(int index);

      int getMyRecordCount();

      List<? extends RuneRecordDataOrBuilder> getMyRecordOrBuilderList();

      RuneRecordDataOrBuilder getMyRecordOrBuilder(int index);

      List<RuneRecordData> getAllRecordList();

      RuneRecordData getAllRecord(int index);

      int getAllRecordCount();

      List<? extends RuneRecordDataOrBuilder> getAllRecordOrBuilderList();

      RuneRecordDataOrBuilder getAllRecordOrBuilder(int index);

      boolean hasIsFree();

      boolean getIsFree();

      boolean hasRecruitNum();

      int getRecruitNum();
   }

   public interface S2C_RuneStoneDecompose_5414OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_RuneStoneHeroStrength_5427OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasInfo();

      CommonMsg.RuneStoneWear getInfo();

      CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder();
   }

   public interface S2C_RuneStoneInherit_5408OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasInfo();

      CommonMsg.RuneStoneWear getInfo();

      CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder();

      boolean hasRuneItem();

      CommonMsg.RuneStone getRuneItem();

      CommonMsg.RuneStoneOrBuilder getRuneItemOrBuilder();
   }

   public interface S2C_RuneStoneRecruitment_5410OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasRecruitNum();

      int getRecruitNum();
   }

   public interface S2C_RuneStoneUpLev_5406OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasInfo();

      CommonMsg.RuneStoneWear getInfo();

      CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder();

      boolean hasLevSum();

      int getLevSum();
   }

   public interface S2C_RuneStoneUpLev_5412OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasInfo();

      CommonMsg.RuneStone getInfo();

      CommonMsg.RuneStoneOrBuilder getInfoOrBuilder();
   }

   public interface S2C_UndressRuneStone_5404OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      List<CommonMsg.RuneStonePro> getProAllList();

      CommonMsg.RuneStonePro getProAll(int index);

      int getProAllCount();

      List<? extends CommonMsg.RuneStoneProOrBuilder> getProAllOrBuilderList();

      CommonMsg.RuneStoneProOrBuilder getProAllOrBuilder(int index);
   }

   public interface S2C_WearRuneStone_5402OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasInfo();

      CommonMsg.RuneStoneWear getInfo();

      CommonMsg.RuneStoneWearOrBuilder getInfoOrBuilder();

      List<CommonMsg.RuneStonePro> getProAllList();

      CommonMsg.RuneStonePro getProAll(int index);

      int getProAllCount();

      List<? extends CommonMsg.RuneStoneProOrBuilder> getProAllOrBuilderList();

      CommonMsg.RuneStoneProOrBuilder getProAllOrBuilder(int index);

      boolean hasLevSum();

      int getLevSum();

      boolean hasTypeOperate();

      int getTypeOperate();
   }
}
