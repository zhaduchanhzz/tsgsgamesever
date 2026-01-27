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

public final class WarNorthMsg {
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_SectionData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_SectionData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_CopyData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_CopyData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_SacrificeRecordData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_SacrificeRecordData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthMainInfo_11001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthMainInfo_11001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthMainInfo_11002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthMainInfo_11002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionTargetReward_11003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionTargetReward_11003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionTargetReward_11004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionTargetReward_11004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionInfo_11005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionInfo_11005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionInfo_11006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionInfo_11006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthCopyInfo_11008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthCopyInfo_11008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionBoxReward_11009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionBoxReward_11009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionBoxReward_11010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionBoxReward_11010_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeInfo_11011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeInfo_11011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeInfo_11012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeInfo_11012_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthDoSacrifice_11013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthDoSacrifice_11013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthDoSacrifice_11014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthDoSacrifice_11014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeBoxReward_11015_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeBoxReward_11015_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeBoxReward_11016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeBoxReward_11016_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeRecordList_11017_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeRecordList_11017_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecordList_11018_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecordList_11018_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecord_11020_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecord_11020_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthBuyChallengeCount_11021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthBuyChallengeCount_11021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthBuyChallengeCount_11022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthBuyChallengeCount_11022_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private WarNorthMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eWarNorth.proto\u0012\u001awarNorth.com.gzbz.protobuf\"=\n\u000bSectionData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004star\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fgotRewardIds\u0018\u0003 \u0003(\u0005\"F\n\bCopyData\u0012\u000e\n\u0006copyId\u0018\u0001 \u0002(\u0005\u0012\u001b\n\u0013satisfiedConditions\u0018\u0002 \u0003(\u0005\u0012\r\n\u0005power\u0018\u0003 \u0002(\u0003\"z\n\u0013SacrificeRecordData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\u0014\n\fresourceType\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nresourceId\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bresourceNum\u0018\u0005 \u0002(\u0005\"\u001c\n\u001aC2S_WarNorthMainInfo_11001\"\u0084\u0001\n\u001aS2C_WarNorthMainInfo_11002\u0012<\n\u000bsectionList\u0018\u0001 \u0003(\u000b2'.warNorth.com.gzbz.protobuf.SectionData\u0012\u0016\n\u000echallengeCount\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bbuyCount\u0018\u0003 \u0002(\u0005\"7\n%C2S_WarNorthSectionTargetReward_11003\u0012\u000e\n\u0006target\u0018\u0001 \u0002(\u0005\"7\n%S2C_WarNorthSectionTargetReward_11004\u0012\u000e\n\u0006target\u0018\u0001 \u0002(\u0005\"0\n\u001dC2S_WarNorthSectionInfo_11005\u0012\u000f\n\u0007section\u0018\u0001 \u0002(\u0005\"f\n\u001dS2C_WarNorthSectionInfo_11006\u0012\u000f\n\u0007section\u0018\u0001 \u0002(\u0005\u00124\n\u0006copies\u0018\u0002 \u0003(\u000b2$.warNorth.com.gzbz.protobuf.CopyData\"P\n\u001aS2C_WarNorthCopyInfo_11008\u00122\n\u0004copy\u0018\u0001 \u0002(\u000b2$.warNorth.com.gzbz.protobuf.CopyData\"B\n\"C2S_WarNorthSectionBoxReward_11009\u0012\u000f\n\u0007section\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003box\u0018\u0002 \u0002(\u0005\"B\n\"S2C_WarNorthSectionBoxReward_11010\u0012\u000f\n\u0007section\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003box\u0018\u0002 \u0002(\u0005\"!\n\u001fC2S_WarNorthSacrificeInfo_11011\"\u009c\u0001\n\u001fS2C_WarNorthSacrificeInfo_11012\u0012\u0016\n\u000esacrificeCount\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esacrificePoint\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bgotBoxes\u0018\u0003 \u0003(\u0005\u0012\u001a\n\u0012sacrificeFreeCount\u0018\u0004 \u0002(\u0005\u0012\u001b\n\u0013dailySacrificeCount\u0018\u0005 \u0002(\u0005\"-\n\u001dC2S_WarNorthDoSacrifice_11013\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"b\n\u001dS2C_WarNorthDoSacrifice_11014\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esacrificeCount\u0018\u0002 \u0002(\u0005\u0012\u001b\n\u0013dailySacrificeCount\u0018\u0003 \u0002(\u0005\"2\n$C2S_WarNorthSacrificeBoxReward_11015\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"J\n$S2C_WarNorthSacrificeBoxReward_11016\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esacrificePoint\u0018\u0002 \u0002(\u0005\"5\n%C2S_WarNorthSacrificeRecordList_11017\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"z\n%S2C_WarNorthSacrificeRecordList_11018\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012C\n\nrecordList\u0018\u0002 \u0003(\u000b2/.warNorth.com.gzbz.protobuf.SacrificeRecordData\"h\n!S2C_WarNorthSacrificeRecord_11020\u0012C\n\nrecordList\u0018\u0001 \u0003(\u000b2/.warNorth.com.gzbz.protobuf.SacrificeRecordData\"%\n#C2S_WarNorthBuyChallengeCount_11021\"7\n#S2C_WarNorthBuyChallengeCount_11022\u0012\u0010\n\bbuyCount\u0018\u0001 \u0002(\u0005B\"\n\u0011com.gzbz.protobufB\u000bWarNorthMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_warNorth_com_gzbz_protobuf_SectionData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_warNorth_com_gzbz_protobuf_SectionData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_SectionData_descriptor, new String[]{"Id", "Star", "GotRewardIds"});
      internal_static_warNorth_com_gzbz_protobuf_CopyData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_warNorth_com_gzbz_protobuf_CopyData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_CopyData_descriptor, new String[]{"CopyId", "SatisfiedConditions", "Power"});
      internal_static_warNorth_com_gzbz_protobuf_SacrificeRecordData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_warNorth_com_gzbz_protobuf_SacrificeRecordData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_SacrificeRecordData_descriptor, new String[]{"PlayerId", "PlayerName", "ResourceType", "ResourceId", "ResourceNum"});
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthMainInfo_11001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthMainInfo_11001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthMainInfo_11001_descriptor, new String[0]);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthMainInfo_11002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthMainInfo_11002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthMainInfo_11002_descriptor, new String[]{"SectionList", "ChallengeCount", "BuyCount"});
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionTargetReward_11003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionTargetReward_11003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionTargetReward_11003_descriptor, new String[]{"Target"});
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionTargetReward_11004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionTargetReward_11004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionTargetReward_11004_descriptor, new String[]{"Target"});
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionInfo_11005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionInfo_11005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionInfo_11005_descriptor, new String[]{"Section"});
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionInfo_11006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionInfo_11006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionInfo_11006_descriptor, new String[]{"Section", "Copies"});
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthCopyInfo_11008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthCopyInfo_11008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthCopyInfo_11008_descriptor, new String[]{"Copy"});
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionBoxReward_11009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionBoxReward_11009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionBoxReward_11009_descriptor, new String[]{"Section", "Box"});
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionBoxReward_11010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionBoxReward_11010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionBoxReward_11010_descriptor, new String[]{"Section", "Box"});
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeInfo_11011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeInfo_11011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeInfo_11011_descriptor, new String[0]);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeInfo_11012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeInfo_11012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeInfo_11012_descriptor, new String[]{"SacrificeCount", "SacrificePoint", "GotBoxes", "SacrificeFreeCount", "DailySacrificeCount"});
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthDoSacrifice_11013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthDoSacrifice_11013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthDoSacrifice_11013_descriptor, new String[]{"Type"});
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthDoSacrifice_11014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthDoSacrifice_11014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthDoSacrifice_11014_descriptor, new String[]{"Type", "SacrificeCount", "DailySacrificeCount"});
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeBoxReward_11015_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeBoxReward_11015_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeBoxReward_11015_descriptor, new String[]{"Id"});
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeBoxReward_11016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeBoxReward_11016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeBoxReward_11016_descriptor, new String[]{"Id", "SacrificePoint"});
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeRecordList_11017_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeRecordList_11017_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeRecordList_11017_descriptor, new String[]{"Type"});
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecordList_11018_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecordList_11018_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecordList_11018_descriptor, new String[]{"Type", "RecordList"});
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecord_11020_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecord_11020_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecord_11020_descriptor, new String[]{"RecordList"});
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthBuyChallengeCount_11021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthBuyChallengeCount_11021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthBuyChallengeCount_11021_descriptor, new String[0]);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthBuyChallengeCount_11022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthBuyChallengeCount_11022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthBuyChallengeCount_11022_descriptor, new String[]{"BuyCount"});
   }

   public static final class SectionData extends GeneratedMessageV3 implements SectionDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int STAR_FIELD_NUMBER = 2;
      private int star_;
      public static final int GOTREWARDIDS_FIELD_NUMBER = 3;
      private Internal.IntList gotRewardIds_;
      private byte memoizedIsInitialized;
      private static final SectionData DEFAULT_INSTANCE = new SectionData();
      /** @deprecated */
      @Deprecated
      public static final Parser<SectionData> PARSER = new AbstractParser<SectionData>() {
         public SectionData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SectionData(input, extensionRegistry);
         }
      };

      private SectionData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SectionData() {
         this.memoizedIsInitialized = -1;
         this.gotRewardIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SectionData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SectionData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.star_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gotRewardIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gotRewardIds_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRewardIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotRewardIds_.addInt(input.readInt32());
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
                  this.gotRewardIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_SectionData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_SectionData_fieldAccessorTable.ensureFieldAccessorsInitialized(SectionData.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStar() {
         return this.star_;
      }

      public List<Integer> getGotRewardIdsList() {
         return this.gotRewardIds_;
      }

      public int getGotRewardIdsCount() {
         return this.gotRewardIds_.size();
      }

      public int getGotRewardIds(int index) {
         return this.gotRewardIds_.getInt(index);
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
         } else if (!this.hasStar()) {
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
            output.writeInt32(2, this.star_);
         }

         for(int i = 0; i < this.gotRewardIds_.size(); ++i) {
            output.writeInt32(3, this.gotRewardIds_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.star_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotRewardIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotRewardIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRewardIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SectionData)) {
            return super.equals(obj);
         } else {
            SectionData other = (SectionData)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
               return false;
            } else if (!this.getGotRewardIdsList().equals(other.getGotRewardIdsList())) {
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

            if (this.hasStar()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStar();
            }

            if (this.getGotRewardIdsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotRewardIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SectionData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SectionData)PARSER.parseFrom(data);
      }

      public static SectionData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SectionData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SectionData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SectionData)PARSER.parseFrom(data);
      }

      public static SectionData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SectionData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SectionData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SectionData)PARSER.parseFrom(data);
      }

      public static SectionData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SectionData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SectionData parseFrom(InputStream input) throws IOException {
         return (SectionData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SectionData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SectionData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SectionData parseDelimitedFrom(InputStream input) throws IOException {
         return (SectionData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SectionData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SectionData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SectionData parseFrom(CodedInputStream input) throws IOException {
         return (SectionData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SectionData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SectionData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SectionData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SectionData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SectionData> parser() {
         return PARSER;
      }

      public Parser<SectionData> getParserForType() {
         return PARSER;
      }

      public SectionData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SectionDataOrBuilder {
         private int bitField0_;
         private int id_;
         private int star_;
         private Internal.IntList gotRewardIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_SectionData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_SectionData_fieldAccessorTable.ensureFieldAccessorsInitialized(SectionData.class, Builder.class);
         }

         private Builder() {
            this.gotRewardIds_ = WarNorthMsg.SectionData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewardIds_ = WarNorthMsg.SectionData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.SectionData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.star_ = 0;
            this.bitField0_ &= -3;
            this.gotRewardIds_ = WarNorthMsg.SectionData.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_SectionData_descriptor;
         }

         public SectionData getDefaultInstanceForType() {
            return WarNorthMsg.SectionData.getDefaultInstance();
         }

         public SectionData build() {
            SectionData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SectionData buildPartial() {
            SectionData result = new SectionData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.star_ = this.star_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotRewardIds_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotRewardIds_ = this.gotRewardIds_;
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
            if (other instanceof SectionData) {
               return this.mergeFrom((SectionData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SectionData other) {
            if (other == WarNorthMsg.SectionData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               if (!other.gotRewardIds_.isEmpty()) {
                  if (this.gotRewardIds_.isEmpty()) {
                     this.gotRewardIds_ = other.gotRewardIds_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGotRewardIdsIsMutable();
                     this.gotRewardIds_.addAll(other.gotRewardIds_);
                  }

                  this.onChanged();
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
               return this.hasStar();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SectionData parsedMessage = null;

            try {
               parsedMessage = (SectionData)WarNorthMsg.SectionData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SectionData)e.getUnfinishedMessage();
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

         public boolean hasStar() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStar() {
            return this.star_;
         }

         public Builder setStar(int value) {
            this.bitField0_ |= 2;
            this.star_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStar() {
            this.bitField0_ &= -3;
            this.star_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotRewardIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotRewardIds_ = WarNorthMsg.SectionData.mutableCopy(this.gotRewardIds_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getGotRewardIdsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.gotRewardIds_) : this.gotRewardIds_);
         }

         public int getGotRewardIdsCount() {
            return this.gotRewardIds_.size();
         }

         public int getGotRewardIds(int index) {
            return this.gotRewardIds_.getInt(index);
         }

         public Builder setGotRewardIds(int index, int value) {
            this.ensureGotRewardIdsIsMutable();
            this.gotRewardIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotRewardIds(int value) {
            this.ensureGotRewardIdsIsMutable();
            this.gotRewardIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotRewardIds(Iterable<? extends Integer> values) {
            this.ensureGotRewardIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotRewardIds_);
            this.onChanged();
            return this;
         }

         public Builder clearGotRewardIds() {
            this.gotRewardIds_ = WarNorthMsg.SectionData.emptyIntList();
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

   public static final class CopyData extends GeneratedMessageV3 implements CopyDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COPYID_FIELD_NUMBER = 1;
      private int copyId_;
      public static final int SATISFIEDCONDITIONS_FIELD_NUMBER = 2;
      private Internal.IntList satisfiedConditions_;
      public static final int POWER_FIELD_NUMBER = 3;
      private long power_;
      private byte memoizedIsInitialized;
      private static final CopyData DEFAULT_INSTANCE = new CopyData();
      /** @deprecated */
      @Deprecated
      public static final Parser<CopyData> PARSER = new AbstractParser<CopyData>() {
         public CopyData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CopyData(input, extensionRegistry);
         }
      };

      private CopyData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CopyData() {
         this.memoizedIsInitialized = -1;
         this.satisfiedConditions_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CopyData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CopyData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.copyId_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.satisfiedConditions_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.satisfiedConditions_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.satisfiedConditions_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.power_ = input.readInt64();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.satisfiedConditions_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.satisfiedConditions_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_CopyData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_CopyData_fieldAccessorTable.ensureFieldAccessorsInitialized(CopyData.class, Builder.class);
      }

      public boolean hasCopyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCopyId() {
         return this.copyId_;
      }

      public List<Integer> getSatisfiedConditionsList() {
         return this.satisfiedConditions_;
      }

      public int getSatisfiedConditionsCount() {
         return this.satisfiedConditions_.size();
      }

      public int getSatisfiedConditions(int index) {
         return this.satisfiedConditions_.getInt(index);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCopyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.copyId_);
         }

         for(int i = 0; i < this.satisfiedConditions_.size(); ++i) {
            output.writeInt32(2, this.satisfiedConditions_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(3, this.power_);
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
               size += CodedOutputStream.computeInt32Size(1, this.copyId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.satisfiedConditions_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.satisfiedConditions_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSatisfiedConditionsList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.power_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CopyData)) {
            return super.equals(obj);
         } else {
            CopyData other = (CopyData)obj;
            if (this.hasCopyId() != other.hasCopyId()) {
               return false;
            } else if (this.hasCopyId() && this.getCopyId() != other.getCopyId()) {
               return false;
            } else if (!this.getSatisfiedConditionsList().equals(other.getSatisfiedConditionsList())) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
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
            if (this.hasCopyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCopyId();
            }

            if (this.getSatisfiedConditionsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSatisfiedConditionsList().hashCode();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CopyData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CopyData)PARSER.parseFrom(data);
      }

      public static CopyData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CopyData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CopyData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CopyData)PARSER.parseFrom(data);
      }

      public static CopyData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CopyData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CopyData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CopyData)PARSER.parseFrom(data);
      }

      public static CopyData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CopyData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CopyData parseFrom(InputStream input) throws IOException {
         return (CopyData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CopyData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CopyData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CopyData parseDelimitedFrom(InputStream input) throws IOException {
         return (CopyData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CopyData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CopyData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CopyData parseFrom(CodedInputStream input) throws IOException {
         return (CopyData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CopyData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CopyData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CopyData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CopyData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CopyData> parser() {
         return PARSER;
      }

      public Parser<CopyData> getParserForType() {
         return PARSER;
      }

      public CopyData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CopyDataOrBuilder {
         private int bitField0_;
         private int copyId_;
         private Internal.IntList satisfiedConditions_;
         private long power_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_CopyData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_CopyData_fieldAccessorTable.ensureFieldAccessorsInitialized(CopyData.class, Builder.class);
         }

         private Builder() {
            this.satisfiedConditions_ = WarNorthMsg.CopyData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.satisfiedConditions_ = WarNorthMsg.CopyData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.CopyData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.copyId_ = 0;
            this.bitField0_ &= -2;
            this.satisfiedConditions_ = WarNorthMsg.CopyData.emptyIntList();
            this.bitField0_ &= -3;
            this.power_ = 0L;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_CopyData_descriptor;
         }

         public CopyData getDefaultInstanceForType() {
            return WarNorthMsg.CopyData.getDefaultInstance();
         }

         public CopyData build() {
            CopyData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CopyData buildPartial() {
            CopyData result = new CopyData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.copyId_ = this.copyId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.satisfiedConditions_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.satisfiedConditions_ = this.satisfiedConditions_;
            if ((from_bitField0_ & 4) != 0) {
               result.power_ = this.power_;
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
            if (other instanceof CopyData) {
               return this.mergeFrom((CopyData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CopyData other) {
            if (other == WarNorthMsg.CopyData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCopyId()) {
                  this.setCopyId(other.getCopyId());
               }

               if (!other.satisfiedConditions_.isEmpty()) {
                  if (this.satisfiedConditions_.isEmpty()) {
                     this.satisfiedConditions_ = other.satisfiedConditions_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureSatisfiedConditionsIsMutable();
                     this.satisfiedConditions_.addAll(other.satisfiedConditions_);
                  }

                  this.onChanged();
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCopyId()) {
               return false;
            } else {
               return this.hasPower();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CopyData parsedMessage = null;

            try {
               parsedMessage = (CopyData)WarNorthMsg.CopyData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CopyData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCopyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCopyId() {
            return this.copyId_;
         }

         public Builder setCopyId(int value) {
            this.bitField0_ |= 1;
            this.copyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCopyId() {
            this.bitField0_ &= -2;
            this.copyId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSatisfiedConditionsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.satisfiedConditions_ = WarNorthMsg.CopyData.mutableCopy(this.satisfiedConditions_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getSatisfiedConditionsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.satisfiedConditions_) : this.satisfiedConditions_);
         }

         public int getSatisfiedConditionsCount() {
            return this.satisfiedConditions_.size();
         }

         public int getSatisfiedConditions(int index) {
            return this.satisfiedConditions_.getInt(index);
         }

         public Builder setSatisfiedConditions(int index, int value) {
            this.ensureSatisfiedConditionsIsMutable();
            this.satisfiedConditions_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSatisfiedConditions(int value) {
            this.ensureSatisfiedConditionsIsMutable();
            this.satisfiedConditions_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSatisfiedConditions(Iterable<? extends Integer> values) {
            this.ensureSatisfiedConditionsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.satisfiedConditions_);
            this.onChanged();
            return this;
         }

         public Builder clearSatisfiedConditions() {
            this.satisfiedConditions_ = WarNorthMsg.CopyData.emptyIntList();
            this.bitField0_ &= -3;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class SacrificeRecordData extends GeneratedMessageV3 implements SacrificeRecordDataOrBuilder {
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
      private static final SacrificeRecordData DEFAULT_INSTANCE = new SacrificeRecordData();
      /** @deprecated */
      @Deprecated
      public static final Parser<SacrificeRecordData> PARSER = new AbstractParser<SacrificeRecordData>() {
         public SacrificeRecordData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SacrificeRecordData(input, extensionRegistry);
         }
      };

      private SacrificeRecordData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SacrificeRecordData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SacrificeRecordData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SacrificeRecordData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_SacrificeRecordData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_SacrificeRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(SacrificeRecordData.class, Builder.class);
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
         } else if (!(obj instanceof SacrificeRecordData)) {
            return super.equals(obj);
         } else {
            SacrificeRecordData other = (SacrificeRecordData)obj;
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

      public static SacrificeRecordData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data);
      }

      public static SacrificeRecordData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SacrificeRecordData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data);
      }

      public static SacrificeRecordData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SacrificeRecordData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data);
      }

      public static SacrificeRecordData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SacrificeRecordData parseFrom(InputStream input) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SacrificeRecordData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SacrificeRecordData parseDelimitedFrom(InputStream input) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SacrificeRecordData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SacrificeRecordData parseFrom(CodedInputStream input) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SacrificeRecordData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SacrificeRecordData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SacrificeRecordData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SacrificeRecordData> parser() {
         return PARSER;
      }

      public Parser<SacrificeRecordData> getParserForType() {
         return PARSER;
      }

      public SacrificeRecordData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SacrificeRecordDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int resourceType_;
         private int resourceId_;
         private int resourceNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_SacrificeRecordData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_SacrificeRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(SacrificeRecordData.class, Builder.class);
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
            if (WarNorthMsg.SacrificeRecordData.alwaysUseFieldBuilders) {
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
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_SacrificeRecordData_descriptor;
         }

         public SacrificeRecordData getDefaultInstanceForType() {
            return WarNorthMsg.SacrificeRecordData.getDefaultInstance();
         }

         public SacrificeRecordData build() {
            SacrificeRecordData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SacrificeRecordData buildPartial() {
            SacrificeRecordData result = new SacrificeRecordData(this);
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
            if (other instanceof SacrificeRecordData) {
               return this.mergeFrom((SacrificeRecordData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SacrificeRecordData other) {
            if (other == WarNorthMsg.SacrificeRecordData.getDefaultInstance()) {
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
            SacrificeRecordData parsedMessage = null;

            try {
               parsedMessage = (SacrificeRecordData)WarNorthMsg.SacrificeRecordData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SacrificeRecordData)e.getUnfinishedMessage();
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
            this.playerName_ = WarNorthMsg.SacrificeRecordData.getDefaultInstance().getPlayerName();
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

   public static final class C2S_WarNorthMainInfo_11001 extends GeneratedMessageV3 implements C2S_WarNorthMainInfo_11001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarNorthMainInfo_11001 DEFAULT_INSTANCE = new C2S_WarNorthMainInfo_11001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarNorthMainInfo_11001> PARSER = new AbstractParser<C2S_WarNorthMainInfo_11001>() {
         public C2S_WarNorthMainInfo_11001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarNorthMainInfo_11001(input, extensionRegistry);
         }
      };

      private C2S_WarNorthMainInfo_11001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarNorthMainInfo_11001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarNorthMainInfo_11001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarNorthMainInfo_11001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthMainInfo_11001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthMainInfo_11001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthMainInfo_11001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarNorthMainInfo_11001)) {
            return super.equals(obj);
         } else {
            C2S_WarNorthMainInfo_11001 other = (C2S_WarNorthMainInfo_11001)obj;
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

      public static C2S_WarNorthMainInfo_11001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthMainInfo_11001)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthMainInfo_11001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthMainInfo_11001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthMainInfo_11001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthMainInfo_11001)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthMainInfo_11001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthMainInfo_11001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthMainInfo_11001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthMainInfo_11001)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthMainInfo_11001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthMainInfo_11001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthMainInfo_11001 parseFrom(InputStream input) throws IOException {
         return (C2S_WarNorthMainInfo_11001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthMainInfo_11001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthMainInfo_11001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthMainInfo_11001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarNorthMainInfo_11001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarNorthMainInfo_11001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthMainInfo_11001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthMainInfo_11001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarNorthMainInfo_11001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthMainInfo_11001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthMainInfo_11001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarNorthMainInfo_11001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarNorthMainInfo_11001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarNorthMainInfo_11001> parser() {
         return PARSER;
      }

      public Parser<C2S_WarNorthMainInfo_11001> getParserForType() {
         return PARSER;
      }

      public C2S_WarNorthMainInfo_11001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarNorthMainInfo_11001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthMainInfo_11001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthMainInfo_11001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthMainInfo_11001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.C2S_WarNorthMainInfo_11001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthMainInfo_11001_descriptor;
         }

         public C2S_WarNorthMainInfo_11001 getDefaultInstanceForType() {
            return WarNorthMsg.C2S_WarNorthMainInfo_11001.getDefaultInstance();
         }

         public C2S_WarNorthMainInfo_11001 build() {
            C2S_WarNorthMainInfo_11001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarNorthMainInfo_11001 buildPartial() {
            C2S_WarNorthMainInfo_11001 result = new C2S_WarNorthMainInfo_11001(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarNorthMainInfo_11001) {
               return this.mergeFrom((C2S_WarNorthMainInfo_11001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarNorthMainInfo_11001 other) {
            if (other == WarNorthMsg.C2S_WarNorthMainInfo_11001.getDefaultInstance()) {
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
            C2S_WarNorthMainInfo_11001 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarNorthMainInfo_11001)WarNorthMsg.C2S_WarNorthMainInfo_11001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarNorthMainInfo_11001)e.getUnfinishedMessage();
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

   public static final class S2C_WarNorthMainInfo_11002 extends GeneratedMessageV3 implements S2C_WarNorthMainInfo_11002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SECTIONLIST_FIELD_NUMBER = 1;
      private List<SectionData> sectionList_;
      public static final int CHALLENGECOUNT_FIELD_NUMBER = 2;
      private int challengeCount_;
      public static final int BUYCOUNT_FIELD_NUMBER = 3;
      private int buyCount_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthMainInfo_11002 DEFAULT_INSTANCE = new S2C_WarNorthMainInfo_11002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthMainInfo_11002> PARSER = new AbstractParser<S2C_WarNorthMainInfo_11002>() {
         public S2C_WarNorthMainInfo_11002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthMainInfo_11002(input, extensionRegistry);
         }
      };

      private S2C_WarNorthMainInfo_11002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthMainInfo_11002() {
         this.memoizedIsInitialized = -1;
         this.sectionList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthMainInfo_11002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthMainInfo_11002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.sectionList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.sectionList_.add(input.readMessage(WarNorthMsg.SectionData.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.challengeCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.buyCount_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.sectionList_ = Collections.unmodifiableList(this.sectionList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthMainInfo_11002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthMainInfo_11002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthMainInfo_11002.class, Builder.class);
      }

      public List<SectionData> getSectionListList() {
         return this.sectionList_;
      }

      public List<? extends SectionDataOrBuilder> getSectionListOrBuilderList() {
         return this.sectionList_;
      }

      public int getSectionListCount() {
         return this.sectionList_.size();
      }

      public SectionData getSectionList(int index) {
         return (SectionData)this.sectionList_.get(index);
      }

      public SectionDataOrBuilder getSectionListOrBuilder(int index) {
         return (SectionDataOrBuilder)this.sectionList_.get(index);
      }

      public boolean hasChallengeCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChallengeCount() {
         return this.challengeCount_;
      }

      public boolean hasBuyCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyCount() {
         return this.buyCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChallengeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getSectionListCount(); ++i) {
               if (!this.getSectionList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.sectionList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.sectionList_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.challengeCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.buyCount_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.sectionList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.sectionList_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.challengeCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.buyCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthMainInfo_11002)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthMainInfo_11002 other = (S2C_WarNorthMainInfo_11002)obj;
            if (!this.getSectionListList().equals(other.getSectionListList())) {
               return false;
            } else if (this.hasChallengeCount() != other.hasChallengeCount()) {
               return false;
            } else if (this.hasChallengeCount() && this.getChallengeCount() != other.getChallengeCount()) {
               return false;
            } else if (this.hasBuyCount() != other.hasBuyCount()) {
               return false;
            } else if (this.hasBuyCount() && this.getBuyCount() != other.getBuyCount()) {
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
            if (this.getSectionListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSectionListList().hashCode();
            }

            if (this.hasChallengeCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getChallengeCount();
            }

            if (this.hasBuyCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuyCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthMainInfo_11002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthMainInfo_11002)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthMainInfo_11002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthMainInfo_11002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthMainInfo_11002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthMainInfo_11002)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthMainInfo_11002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthMainInfo_11002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthMainInfo_11002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthMainInfo_11002)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthMainInfo_11002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthMainInfo_11002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthMainInfo_11002 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthMainInfo_11002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthMainInfo_11002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthMainInfo_11002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthMainInfo_11002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthMainInfo_11002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthMainInfo_11002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthMainInfo_11002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthMainInfo_11002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthMainInfo_11002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthMainInfo_11002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthMainInfo_11002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthMainInfo_11002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthMainInfo_11002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthMainInfo_11002> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthMainInfo_11002> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthMainInfo_11002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthMainInfo_11002OrBuilder {
         private int bitField0_;
         private List<SectionData> sectionList_;
         private RepeatedFieldBuilderV3<SectionData, SectionData.Builder, SectionDataOrBuilder> sectionListBuilder_;
         private int challengeCount_;
         private int buyCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthMainInfo_11002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthMainInfo_11002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthMainInfo_11002.class, Builder.class);
         }

         private Builder() {
            this.sectionList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.sectionList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthMainInfo_11002.alwaysUseFieldBuilders) {
               this.getSectionListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.sectionListBuilder_ == null) {
               this.sectionList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.sectionListBuilder_.clear();
            }

            this.challengeCount_ = 0;
            this.bitField0_ &= -3;
            this.buyCount_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthMainInfo_11002_descriptor;
         }

         public S2C_WarNorthMainInfo_11002 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthMainInfo_11002.getDefaultInstance();
         }

         public S2C_WarNorthMainInfo_11002 build() {
            S2C_WarNorthMainInfo_11002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthMainInfo_11002 buildPartial() {
            S2C_WarNorthMainInfo_11002 result = new S2C_WarNorthMainInfo_11002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.sectionListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.sectionList_ = Collections.unmodifiableList(this.sectionList_);
                  this.bitField0_ &= -2;
               }

               result.sectionList_ = this.sectionList_;
            } else {
               result.sectionList_ = this.sectionListBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.challengeCount_ = this.challengeCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.buyCount_ = this.buyCount_;
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
            if (other instanceof S2C_WarNorthMainInfo_11002) {
               return this.mergeFrom((S2C_WarNorthMainInfo_11002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthMainInfo_11002 other) {
            if (other == WarNorthMsg.S2C_WarNorthMainInfo_11002.getDefaultInstance()) {
               return this;
            } else {
               if (this.sectionListBuilder_ == null) {
                  if (!other.sectionList_.isEmpty()) {
                     if (this.sectionList_.isEmpty()) {
                        this.sectionList_ = other.sectionList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureSectionListIsMutable();
                        this.sectionList_.addAll(other.sectionList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.sectionList_.isEmpty()) {
                  if (this.sectionListBuilder_.isEmpty()) {
                     this.sectionListBuilder_.dispose();
                     this.sectionListBuilder_ = null;
                     this.sectionList_ = other.sectionList_;
                     this.bitField0_ &= -2;
                     this.sectionListBuilder_ = WarNorthMsg.S2C_WarNorthMainInfo_11002.alwaysUseFieldBuilders ? this.getSectionListFieldBuilder() : null;
                  } else {
                     this.sectionListBuilder_.addAllMessages(other.sectionList_);
                  }
               }

               if (other.hasChallengeCount()) {
                  this.setChallengeCount(other.getChallengeCount());
               }

               if (other.hasBuyCount()) {
                  this.setBuyCount(other.getBuyCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChallengeCount()) {
               return false;
            } else if (!this.hasBuyCount()) {
               return false;
            } else {
               for(int i = 0; i < this.getSectionListCount(); ++i) {
                  if (!this.getSectionList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthMainInfo_11002 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthMainInfo_11002)WarNorthMsg.S2C_WarNorthMainInfo_11002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthMainInfo_11002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureSectionListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.sectionList_ = new ArrayList(this.sectionList_);
               this.bitField0_ |= 1;
            }

         }

         public List<SectionData> getSectionListList() {
            return this.sectionListBuilder_ == null ? Collections.unmodifiableList(this.sectionList_) : this.sectionListBuilder_.getMessageList();
         }

         public int getSectionListCount() {
            return this.sectionListBuilder_ == null ? this.sectionList_.size() : this.sectionListBuilder_.getCount();
         }

         public SectionData getSectionList(int index) {
            return this.sectionListBuilder_ == null ? (SectionData)this.sectionList_.get(index) : (SectionData)this.sectionListBuilder_.getMessage(index);
         }

         public Builder setSectionList(int index, SectionData value) {
            if (this.sectionListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSectionListIsMutable();
               this.sectionList_.set(index, value);
               this.onChanged();
            } else {
               this.sectionListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSectionList(int index, SectionData.Builder builderForValue) {
            if (this.sectionListBuilder_ == null) {
               this.ensureSectionListIsMutable();
               this.sectionList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.sectionListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSectionList(SectionData value) {
            if (this.sectionListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSectionListIsMutable();
               this.sectionList_.add(value);
               this.onChanged();
            } else {
               this.sectionListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSectionList(int index, SectionData value) {
            if (this.sectionListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSectionListIsMutable();
               this.sectionList_.add(index, value);
               this.onChanged();
            } else {
               this.sectionListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSectionList(SectionData.Builder builderForValue) {
            if (this.sectionListBuilder_ == null) {
               this.ensureSectionListIsMutable();
               this.sectionList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.sectionListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSectionList(int index, SectionData.Builder builderForValue) {
            if (this.sectionListBuilder_ == null) {
               this.ensureSectionListIsMutable();
               this.sectionList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.sectionListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSectionList(Iterable<? extends SectionData> values) {
            if (this.sectionListBuilder_ == null) {
               this.ensureSectionListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.sectionList_);
               this.onChanged();
            } else {
               this.sectionListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSectionList() {
            if (this.sectionListBuilder_ == null) {
               this.sectionList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.sectionListBuilder_.clear();
            }

            return this;
         }

         public Builder removeSectionList(int index) {
            if (this.sectionListBuilder_ == null) {
               this.ensureSectionListIsMutable();
               this.sectionList_.remove(index);
               this.onChanged();
            } else {
               this.sectionListBuilder_.remove(index);
            }

            return this;
         }

         public SectionData.Builder getSectionListBuilder(int index) {
            return (SectionData.Builder)this.getSectionListFieldBuilder().getBuilder(index);
         }

         public SectionDataOrBuilder getSectionListOrBuilder(int index) {
            return this.sectionListBuilder_ == null ? (SectionDataOrBuilder)this.sectionList_.get(index) : (SectionDataOrBuilder)this.sectionListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SectionDataOrBuilder> getSectionListOrBuilderList() {
            return this.sectionListBuilder_ != null ? this.sectionListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.sectionList_);
         }

         public SectionData.Builder addSectionListBuilder() {
            return (SectionData.Builder)this.getSectionListFieldBuilder().addBuilder(WarNorthMsg.SectionData.getDefaultInstance());
         }

         public SectionData.Builder addSectionListBuilder(int index) {
            return (SectionData.Builder)this.getSectionListFieldBuilder().addBuilder(index, WarNorthMsg.SectionData.getDefaultInstance());
         }

         public List<SectionData.Builder> getSectionListBuilderList() {
            return this.getSectionListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SectionData, SectionData.Builder, SectionDataOrBuilder> getSectionListFieldBuilder() {
            if (this.sectionListBuilder_ == null) {
               this.sectionListBuilder_ = new RepeatedFieldBuilderV3(this.sectionList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.sectionList_ = null;
            }

            return this.sectionListBuilder_;
         }

         public boolean hasChallengeCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getChallengeCount() {
            return this.challengeCount_;
         }

         public Builder setChallengeCount(int value) {
            this.bitField0_ |= 2;
            this.challengeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChallengeCount() {
            this.bitField0_ &= -3;
            this.challengeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBuyCount() {
            return this.buyCount_;
         }

         public Builder setBuyCount(int value) {
            this.bitField0_ |= 4;
            this.buyCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyCount() {
            this.bitField0_ &= -5;
            this.buyCount_ = 0;
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

   public static final class C2S_WarNorthSectionTargetReward_11003 extends GeneratedMessageV3 implements C2S_WarNorthSectionTargetReward_11003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGET_FIELD_NUMBER = 1;
      private int target_;
      private byte memoizedIsInitialized;
      private static final C2S_WarNorthSectionTargetReward_11003 DEFAULT_INSTANCE = new C2S_WarNorthSectionTargetReward_11003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarNorthSectionTargetReward_11003> PARSER = new AbstractParser<C2S_WarNorthSectionTargetReward_11003>() {
         public C2S_WarNorthSectionTargetReward_11003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarNorthSectionTargetReward_11003(input, extensionRegistry);
         }
      };

      private C2S_WarNorthSectionTargetReward_11003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarNorthSectionTargetReward_11003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarNorthSectionTargetReward_11003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarNorthSectionTargetReward_11003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.target_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionTargetReward_11003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionTargetReward_11003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSectionTargetReward_11003.class, Builder.class);
      }

      public boolean hasTarget() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTarget() {
         return this.target_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTarget()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.target_);
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
               size += CodedOutputStream.computeInt32Size(1, this.target_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarNorthSectionTargetReward_11003)) {
            return super.equals(obj);
         } else {
            C2S_WarNorthSectionTargetReward_11003 other = (C2S_WarNorthSectionTargetReward_11003)obj;
            if (this.hasTarget() != other.hasTarget()) {
               return false;
            } else if (this.hasTarget() && this.getTarget() != other.getTarget()) {
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
            if (this.hasTarget()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTarget();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionTargetReward_11003)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionTargetReward_11003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionTargetReward_11003)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionTargetReward_11003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionTargetReward_11003)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionTargetReward_11003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSectionTargetReward_11003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSectionTargetReward_11003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSectionTargetReward_11003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSectionTargetReward_11003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarNorthSectionTargetReward_11003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSectionTargetReward_11003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSectionTargetReward_11003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarNorthSectionTargetReward_11003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarNorthSectionTargetReward_11003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarNorthSectionTargetReward_11003> parser() {
         return PARSER;
      }

      public Parser<C2S_WarNorthSectionTargetReward_11003> getParserForType() {
         return PARSER;
      }

      public C2S_WarNorthSectionTargetReward_11003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarNorthSectionTargetReward_11003OrBuilder {
         private int bitField0_;
         private int target_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionTargetReward_11003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionTargetReward_11003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSectionTargetReward_11003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.C2S_WarNorthSectionTargetReward_11003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.target_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionTargetReward_11003_descriptor;
         }

         public C2S_WarNorthSectionTargetReward_11003 getDefaultInstanceForType() {
            return WarNorthMsg.C2S_WarNorthSectionTargetReward_11003.getDefaultInstance();
         }

         public C2S_WarNorthSectionTargetReward_11003 build() {
            C2S_WarNorthSectionTargetReward_11003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarNorthSectionTargetReward_11003 buildPartial() {
            C2S_WarNorthSectionTargetReward_11003 result = new C2S_WarNorthSectionTargetReward_11003(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.target_ = this.target_;
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
            if (other instanceof C2S_WarNorthSectionTargetReward_11003) {
               return this.mergeFrom((C2S_WarNorthSectionTargetReward_11003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarNorthSectionTargetReward_11003 other) {
            if (other == WarNorthMsg.C2S_WarNorthSectionTargetReward_11003.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTarget()) {
                  this.setTarget(other.getTarget());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTarget();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarNorthSectionTargetReward_11003 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarNorthSectionTargetReward_11003)WarNorthMsg.C2S_WarNorthSectionTargetReward_11003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarNorthSectionTargetReward_11003)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTarget() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTarget() {
            return this.target_;
         }

         public Builder setTarget(int value) {
            this.bitField0_ |= 1;
            this.target_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTarget() {
            this.bitField0_ &= -2;
            this.target_ = 0;
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

   public static final class S2C_WarNorthSectionTargetReward_11004 extends GeneratedMessageV3 implements S2C_WarNorthSectionTargetReward_11004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGET_FIELD_NUMBER = 1;
      private int target_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthSectionTargetReward_11004 DEFAULT_INSTANCE = new S2C_WarNorthSectionTargetReward_11004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthSectionTargetReward_11004> PARSER = new AbstractParser<S2C_WarNorthSectionTargetReward_11004>() {
         public S2C_WarNorthSectionTargetReward_11004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthSectionTargetReward_11004(input, extensionRegistry);
         }
      };

      private S2C_WarNorthSectionTargetReward_11004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthSectionTargetReward_11004() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthSectionTargetReward_11004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthSectionTargetReward_11004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.target_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionTargetReward_11004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionTargetReward_11004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSectionTargetReward_11004.class, Builder.class);
      }

      public boolean hasTarget() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTarget() {
         return this.target_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTarget()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.target_);
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
               size += CodedOutputStream.computeInt32Size(1, this.target_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthSectionTargetReward_11004)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthSectionTargetReward_11004 other = (S2C_WarNorthSectionTargetReward_11004)obj;
            if (this.hasTarget() != other.hasTarget()) {
               return false;
            } else if (this.hasTarget() && this.getTarget() != other.getTarget()) {
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
            if (this.hasTarget()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTarget();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionTargetReward_11004)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionTargetReward_11004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionTargetReward_11004)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionTargetReward_11004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionTargetReward_11004)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionTargetReward_11004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSectionTargetReward_11004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSectionTargetReward_11004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSectionTargetReward_11004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSectionTargetReward_11004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthSectionTargetReward_11004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSectionTargetReward_11004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSectionTargetReward_11004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthSectionTargetReward_11004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthSectionTargetReward_11004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthSectionTargetReward_11004> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthSectionTargetReward_11004> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthSectionTargetReward_11004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthSectionTargetReward_11004OrBuilder {
         private int bitField0_;
         private int target_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionTargetReward_11004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionTargetReward_11004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSectionTargetReward_11004.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthSectionTargetReward_11004.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.target_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionTargetReward_11004_descriptor;
         }

         public S2C_WarNorthSectionTargetReward_11004 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthSectionTargetReward_11004.getDefaultInstance();
         }

         public S2C_WarNorthSectionTargetReward_11004 build() {
            S2C_WarNorthSectionTargetReward_11004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthSectionTargetReward_11004 buildPartial() {
            S2C_WarNorthSectionTargetReward_11004 result = new S2C_WarNorthSectionTargetReward_11004(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.target_ = this.target_;
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
            if (other instanceof S2C_WarNorthSectionTargetReward_11004) {
               return this.mergeFrom((S2C_WarNorthSectionTargetReward_11004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthSectionTargetReward_11004 other) {
            if (other == WarNorthMsg.S2C_WarNorthSectionTargetReward_11004.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTarget()) {
                  this.setTarget(other.getTarget());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTarget();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthSectionTargetReward_11004 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthSectionTargetReward_11004)WarNorthMsg.S2C_WarNorthSectionTargetReward_11004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthSectionTargetReward_11004)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTarget() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTarget() {
            return this.target_;
         }

         public Builder setTarget(int value) {
            this.bitField0_ |= 1;
            this.target_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTarget() {
            this.bitField0_ &= -2;
            this.target_ = 0;
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

   public static final class C2S_WarNorthSectionInfo_11005 extends GeneratedMessageV3 implements C2S_WarNorthSectionInfo_11005OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SECTION_FIELD_NUMBER = 1;
      private int section_;
      private byte memoizedIsInitialized;
      private static final C2S_WarNorthSectionInfo_11005 DEFAULT_INSTANCE = new C2S_WarNorthSectionInfo_11005();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarNorthSectionInfo_11005> PARSER = new AbstractParser<C2S_WarNorthSectionInfo_11005>() {
         public C2S_WarNorthSectionInfo_11005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarNorthSectionInfo_11005(input, extensionRegistry);
         }
      };

      private C2S_WarNorthSectionInfo_11005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarNorthSectionInfo_11005() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarNorthSectionInfo_11005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarNorthSectionInfo_11005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.section_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionInfo_11005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionInfo_11005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSectionInfo_11005.class, Builder.class);
      }

      public boolean hasSection() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSection() {
         return this.section_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSection()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.section_);
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
               size += CodedOutputStream.computeInt32Size(1, this.section_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarNorthSectionInfo_11005)) {
            return super.equals(obj);
         } else {
            C2S_WarNorthSectionInfo_11005 other = (C2S_WarNorthSectionInfo_11005)obj;
            if (this.hasSection() != other.hasSection()) {
               return false;
            } else if (this.hasSection() && this.getSection() != other.getSection()) {
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
            if (this.hasSection()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSection();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarNorthSectionInfo_11005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionInfo_11005)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSectionInfo_11005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionInfo_11005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSectionInfo_11005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionInfo_11005)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSectionInfo_11005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionInfo_11005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSectionInfo_11005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionInfo_11005)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSectionInfo_11005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionInfo_11005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSectionInfo_11005 parseFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSectionInfo_11005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSectionInfo_11005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSectionInfo_11005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSectionInfo_11005 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSectionInfo_11005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSectionInfo_11005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSectionInfo_11005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSectionInfo_11005 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarNorthSectionInfo_11005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSectionInfo_11005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSectionInfo_11005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarNorthSectionInfo_11005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarNorthSectionInfo_11005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarNorthSectionInfo_11005> parser() {
         return PARSER;
      }

      public Parser<C2S_WarNorthSectionInfo_11005> getParserForType() {
         return PARSER;
      }

      public C2S_WarNorthSectionInfo_11005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarNorthSectionInfo_11005OrBuilder {
         private int bitField0_;
         private int section_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionInfo_11005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionInfo_11005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSectionInfo_11005.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.C2S_WarNorthSectionInfo_11005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.section_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionInfo_11005_descriptor;
         }

         public C2S_WarNorthSectionInfo_11005 getDefaultInstanceForType() {
            return WarNorthMsg.C2S_WarNorthSectionInfo_11005.getDefaultInstance();
         }

         public C2S_WarNorthSectionInfo_11005 build() {
            C2S_WarNorthSectionInfo_11005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarNorthSectionInfo_11005 buildPartial() {
            C2S_WarNorthSectionInfo_11005 result = new C2S_WarNorthSectionInfo_11005(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.section_ = this.section_;
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
            if (other instanceof C2S_WarNorthSectionInfo_11005) {
               return this.mergeFrom((C2S_WarNorthSectionInfo_11005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarNorthSectionInfo_11005 other) {
            if (other == WarNorthMsg.C2S_WarNorthSectionInfo_11005.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSection()) {
                  this.setSection(other.getSection());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSection();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarNorthSectionInfo_11005 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarNorthSectionInfo_11005)WarNorthMsg.C2S_WarNorthSectionInfo_11005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarNorthSectionInfo_11005)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSection() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSection() {
            return this.section_;
         }

         public Builder setSection(int value) {
            this.bitField0_ |= 1;
            this.section_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSection() {
            this.bitField0_ &= -2;
            this.section_ = 0;
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

   public static final class S2C_WarNorthSectionInfo_11006 extends GeneratedMessageV3 implements S2C_WarNorthSectionInfo_11006OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SECTION_FIELD_NUMBER = 1;
      private int section_;
      public static final int COPIES_FIELD_NUMBER = 2;
      private List<CopyData> copies_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthSectionInfo_11006 DEFAULT_INSTANCE = new S2C_WarNorthSectionInfo_11006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthSectionInfo_11006> PARSER = new AbstractParser<S2C_WarNorthSectionInfo_11006>() {
         public S2C_WarNorthSectionInfo_11006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthSectionInfo_11006(input, extensionRegistry);
         }
      };

      private S2C_WarNorthSectionInfo_11006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthSectionInfo_11006() {
         this.memoizedIsInitialized = -1;
         this.copies_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthSectionInfo_11006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthSectionInfo_11006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.section_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.copies_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.copies_.add(input.readMessage(WarNorthMsg.CopyData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.copies_ = Collections.unmodifiableList(this.copies_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionInfo_11006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionInfo_11006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSectionInfo_11006.class, Builder.class);
      }

      public boolean hasSection() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSection() {
         return this.section_;
      }

      public List<CopyData> getCopiesList() {
         return this.copies_;
      }

      public List<? extends CopyDataOrBuilder> getCopiesOrBuilderList() {
         return this.copies_;
      }

      public int getCopiesCount() {
         return this.copies_.size();
      }

      public CopyData getCopies(int index) {
         return (CopyData)this.copies_.get(index);
      }

      public CopyDataOrBuilder getCopiesOrBuilder(int index) {
         return (CopyDataOrBuilder)this.copies_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSection()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getCopiesCount(); ++i) {
               if (!this.getCopies(i).isInitialized()) {
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
            output.writeInt32(1, this.section_);
         }

         for(int i = 0; i < this.copies_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.copies_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.section_);
            }

            for(int i = 0; i < this.copies_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.copies_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthSectionInfo_11006)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthSectionInfo_11006 other = (S2C_WarNorthSectionInfo_11006)obj;
            if (this.hasSection() != other.hasSection()) {
               return false;
            } else if (this.hasSection() && this.getSection() != other.getSection()) {
               return false;
            } else if (!this.getCopiesList().equals(other.getCopiesList())) {
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
            if (this.hasSection()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSection();
            }

            if (this.getCopiesCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCopiesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthSectionInfo_11006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionInfo_11006)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSectionInfo_11006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionInfo_11006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSectionInfo_11006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionInfo_11006)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSectionInfo_11006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionInfo_11006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSectionInfo_11006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionInfo_11006)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSectionInfo_11006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionInfo_11006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSectionInfo_11006 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSectionInfo_11006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSectionInfo_11006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSectionInfo_11006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSectionInfo_11006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSectionInfo_11006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSectionInfo_11006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSectionInfo_11006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSectionInfo_11006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthSectionInfo_11006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSectionInfo_11006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSectionInfo_11006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthSectionInfo_11006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthSectionInfo_11006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthSectionInfo_11006> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthSectionInfo_11006> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthSectionInfo_11006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthSectionInfo_11006OrBuilder {
         private int bitField0_;
         private int section_;
         private List<CopyData> copies_;
         private RepeatedFieldBuilderV3<CopyData, CopyData.Builder, CopyDataOrBuilder> copiesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionInfo_11006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionInfo_11006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSectionInfo_11006.class, Builder.class);
         }

         private Builder() {
            this.copies_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.copies_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthSectionInfo_11006.alwaysUseFieldBuilders) {
               this.getCopiesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.section_ = 0;
            this.bitField0_ &= -2;
            if (this.copiesBuilder_ == null) {
               this.copies_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.copiesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionInfo_11006_descriptor;
         }

         public S2C_WarNorthSectionInfo_11006 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthSectionInfo_11006.getDefaultInstance();
         }

         public S2C_WarNorthSectionInfo_11006 build() {
            S2C_WarNorthSectionInfo_11006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthSectionInfo_11006 buildPartial() {
            S2C_WarNorthSectionInfo_11006 result = new S2C_WarNorthSectionInfo_11006(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.section_ = this.section_;
               to_bitField0_ |= 1;
            }

            if (this.copiesBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.copies_ = Collections.unmodifiableList(this.copies_);
                  this.bitField0_ &= -3;
               }

               result.copies_ = this.copies_;
            } else {
               result.copies_ = this.copiesBuilder_.build();
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
            if (other instanceof S2C_WarNorthSectionInfo_11006) {
               return this.mergeFrom((S2C_WarNorthSectionInfo_11006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthSectionInfo_11006 other) {
            if (other == WarNorthMsg.S2C_WarNorthSectionInfo_11006.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSection()) {
                  this.setSection(other.getSection());
               }

               if (this.copiesBuilder_ == null) {
                  if (!other.copies_.isEmpty()) {
                     if (this.copies_.isEmpty()) {
                        this.copies_ = other.copies_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureCopiesIsMutable();
                        this.copies_.addAll(other.copies_);
                     }

                     this.onChanged();
                  }
               } else if (!other.copies_.isEmpty()) {
                  if (this.copiesBuilder_.isEmpty()) {
                     this.copiesBuilder_.dispose();
                     this.copiesBuilder_ = null;
                     this.copies_ = other.copies_;
                     this.bitField0_ &= -3;
                     this.copiesBuilder_ = WarNorthMsg.S2C_WarNorthSectionInfo_11006.alwaysUseFieldBuilders ? this.getCopiesFieldBuilder() : null;
                  } else {
                     this.copiesBuilder_.addAllMessages(other.copies_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSection()) {
               return false;
            } else {
               for(int i = 0; i < this.getCopiesCount(); ++i) {
                  if (!this.getCopies(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthSectionInfo_11006 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthSectionInfo_11006)WarNorthMsg.S2C_WarNorthSectionInfo_11006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthSectionInfo_11006)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSection() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSection() {
            return this.section_;
         }

         public Builder setSection(int value) {
            this.bitField0_ |= 1;
            this.section_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSection() {
            this.bitField0_ &= -2;
            this.section_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureCopiesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.copies_ = new ArrayList(this.copies_);
               this.bitField0_ |= 2;
            }

         }

         public List<CopyData> getCopiesList() {
            return this.copiesBuilder_ == null ? Collections.unmodifiableList(this.copies_) : this.copiesBuilder_.getMessageList();
         }

         public int getCopiesCount() {
            return this.copiesBuilder_ == null ? this.copies_.size() : this.copiesBuilder_.getCount();
         }

         public CopyData getCopies(int index) {
            return this.copiesBuilder_ == null ? (CopyData)this.copies_.get(index) : (CopyData)this.copiesBuilder_.getMessage(index);
         }

         public Builder setCopies(int index, CopyData value) {
            if (this.copiesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCopiesIsMutable();
               this.copies_.set(index, value);
               this.onChanged();
            } else {
               this.copiesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCopies(int index, CopyData.Builder builderForValue) {
            if (this.copiesBuilder_ == null) {
               this.ensureCopiesIsMutable();
               this.copies_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.copiesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCopies(CopyData value) {
            if (this.copiesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCopiesIsMutable();
               this.copies_.add(value);
               this.onChanged();
            } else {
               this.copiesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCopies(int index, CopyData value) {
            if (this.copiesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCopiesIsMutable();
               this.copies_.add(index, value);
               this.onChanged();
            } else {
               this.copiesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCopies(CopyData.Builder builderForValue) {
            if (this.copiesBuilder_ == null) {
               this.ensureCopiesIsMutable();
               this.copies_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.copiesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCopies(int index, CopyData.Builder builderForValue) {
            if (this.copiesBuilder_ == null) {
               this.ensureCopiesIsMutable();
               this.copies_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.copiesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCopies(Iterable<? extends CopyData> values) {
            if (this.copiesBuilder_ == null) {
               this.ensureCopiesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.copies_);
               this.onChanged();
            } else {
               this.copiesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCopies() {
            if (this.copiesBuilder_ == null) {
               this.copies_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.copiesBuilder_.clear();
            }

            return this;
         }

         public Builder removeCopies(int index) {
            if (this.copiesBuilder_ == null) {
               this.ensureCopiesIsMutable();
               this.copies_.remove(index);
               this.onChanged();
            } else {
               this.copiesBuilder_.remove(index);
            }

            return this;
         }

         public CopyData.Builder getCopiesBuilder(int index) {
            return (CopyData.Builder)this.getCopiesFieldBuilder().getBuilder(index);
         }

         public CopyDataOrBuilder getCopiesOrBuilder(int index) {
            return this.copiesBuilder_ == null ? (CopyDataOrBuilder)this.copies_.get(index) : (CopyDataOrBuilder)this.copiesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CopyDataOrBuilder> getCopiesOrBuilderList() {
            return this.copiesBuilder_ != null ? this.copiesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.copies_);
         }

         public CopyData.Builder addCopiesBuilder() {
            return (CopyData.Builder)this.getCopiesFieldBuilder().addBuilder(WarNorthMsg.CopyData.getDefaultInstance());
         }

         public CopyData.Builder addCopiesBuilder(int index) {
            return (CopyData.Builder)this.getCopiesFieldBuilder().addBuilder(index, WarNorthMsg.CopyData.getDefaultInstance());
         }

         public List<CopyData.Builder> getCopiesBuilderList() {
            return this.getCopiesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CopyData, CopyData.Builder, CopyDataOrBuilder> getCopiesFieldBuilder() {
            if (this.copiesBuilder_ == null) {
               this.copiesBuilder_ = new RepeatedFieldBuilderV3(this.copies_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.copies_ = null;
            }

            return this.copiesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_WarNorthCopyInfo_11008 extends GeneratedMessageV3 implements S2C_WarNorthCopyInfo_11008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COPY_FIELD_NUMBER = 1;
      private CopyData copy_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthCopyInfo_11008 DEFAULT_INSTANCE = new S2C_WarNorthCopyInfo_11008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthCopyInfo_11008> PARSER = new AbstractParser<S2C_WarNorthCopyInfo_11008>() {
         public S2C_WarNorthCopyInfo_11008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthCopyInfo_11008(input, extensionRegistry);
         }
      };

      private S2C_WarNorthCopyInfo_11008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthCopyInfo_11008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthCopyInfo_11008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthCopyInfo_11008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CopyData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.copy_.toBuilder();
                        }

                        this.copy_ = (CopyData)input.readMessage(WarNorthMsg.CopyData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.copy_);
                           this.copy_ = subBuilder.buildPartial();
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthCopyInfo_11008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthCopyInfo_11008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthCopyInfo_11008.class, Builder.class);
      }

      public boolean hasCopy() {
         return (this.bitField0_ & 1) != 0;
      }

      public CopyData getCopy() {
         return this.copy_ == null ? WarNorthMsg.CopyData.getDefaultInstance() : this.copy_;
      }

      public CopyDataOrBuilder getCopyOrBuilder() {
         return this.copy_ == null ? WarNorthMsg.CopyData.getDefaultInstance() : this.copy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCopy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getCopy().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getCopy());
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
               size += CodedOutputStream.computeMessageSize(1, this.getCopy());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthCopyInfo_11008)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthCopyInfo_11008 other = (S2C_WarNorthCopyInfo_11008)obj;
            if (this.hasCopy() != other.hasCopy()) {
               return false;
            } else if (this.hasCopy() && !this.getCopy().equals(other.getCopy())) {
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
            if (this.hasCopy()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCopy().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthCopyInfo_11008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthCopyInfo_11008)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthCopyInfo_11008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthCopyInfo_11008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthCopyInfo_11008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthCopyInfo_11008)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthCopyInfo_11008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthCopyInfo_11008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthCopyInfo_11008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthCopyInfo_11008)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthCopyInfo_11008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthCopyInfo_11008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthCopyInfo_11008 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthCopyInfo_11008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthCopyInfo_11008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthCopyInfo_11008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthCopyInfo_11008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthCopyInfo_11008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthCopyInfo_11008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthCopyInfo_11008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthCopyInfo_11008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthCopyInfo_11008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthCopyInfo_11008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthCopyInfo_11008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthCopyInfo_11008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthCopyInfo_11008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthCopyInfo_11008> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthCopyInfo_11008> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthCopyInfo_11008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthCopyInfo_11008OrBuilder {
         private int bitField0_;
         private CopyData copy_;
         private SingleFieldBuilderV3<CopyData, CopyData.Builder, CopyDataOrBuilder> copyBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthCopyInfo_11008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthCopyInfo_11008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthCopyInfo_11008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthCopyInfo_11008.alwaysUseFieldBuilders) {
               this.getCopyFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.copyBuilder_ == null) {
               this.copy_ = null;
            } else {
               this.copyBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthCopyInfo_11008_descriptor;
         }

         public S2C_WarNorthCopyInfo_11008 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthCopyInfo_11008.getDefaultInstance();
         }

         public S2C_WarNorthCopyInfo_11008 build() {
            S2C_WarNorthCopyInfo_11008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthCopyInfo_11008 buildPartial() {
            S2C_WarNorthCopyInfo_11008 result = new S2C_WarNorthCopyInfo_11008(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.copyBuilder_ == null) {
                  result.copy_ = this.copy_;
               } else {
                  result.copy_ = (CopyData)this.copyBuilder_.build();
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
            if (other instanceof S2C_WarNorthCopyInfo_11008) {
               return this.mergeFrom((S2C_WarNorthCopyInfo_11008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthCopyInfo_11008 other) {
            if (other == WarNorthMsg.S2C_WarNorthCopyInfo_11008.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCopy()) {
                  this.mergeCopy(other.getCopy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCopy()) {
               return false;
            } else {
               return this.getCopy().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthCopyInfo_11008 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthCopyInfo_11008)WarNorthMsg.S2C_WarNorthCopyInfo_11008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthCopyInfo_11008)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCopy() {
            return (this.bitField0_ & 1) != 0;
         }

         public CopyData getCopy() {
            if (this.copyBuilder_ == null) {
               return this.copy_ == null ? WarNorthMsg.CopyData.getDefaultInstance() : this.copy_;
            } else {
               return (CopyData)this.copyBuilder_.getMessage();
            }
         }

         public Builder setCopy(CopyData value) {
            if (this.copyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.copy_ = value;
               this.onChanged();
            } else {
               this.copyBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setCopy(CopyData.Builder builderForValue) {
            if (this.copyBuilder_ == null) {
               this.copy_ = builderForValue.build();
               this.onChanged();
            } else {
               this.copyBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeCopy(CopyData value) {
            if (this.copyBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.copy_ != null && this.copy_ != WarNorthMsg.CopyData.getDefaultInstance()) {
                  this.copy_ = WarNorthMsg.CopyData.newBuilder(this.copy_).mergeFrom(value).buildPartial();
               } else {
                  this.copy_ = value;
               }

               this.onChanged();
            } else {
               this.copyBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearCopy() {
            if (this.copyBuilder_ == null) {
               this.copy_ = null;
               this.onChanged();
            } else {
               this.copyBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CopyData.Builder getCopyBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CopyData.Builder)this.getCopyFieldBuilder().getBuilder();
         }

         public CopyDataOrBuilder getCopyOrBuilder() {
            if (this.copyBuilder_ != null) {
               return (CopyDataOrBuilder)this.copyBuilder_.getMessageOrBuilder();
            } else {
               return this.copy_ == null ? WarNorthMsg.CopyData.getDefaultInstance() : this.copy_;
            }
         }

         private SingleFieldBuilderV3<CopyData, CopyData.Builder, CopyDataOrBuilder> getCopyFieldBuilder() {
            if (this.copyBuilder_ == null) {
               this.copyBuilder_ = new SingleFieldBuilderV3(this.getCopy(), this.getParentForChildren(), this.isClean());
               this.copy_ = null;
            }

            return this.copyBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarNorthSectionBoxReward_11009 extends GeneratedMessageV3 implements C2S_WarNorthSectionBoxReward_11009OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SECTION_FIELD_NUMBER = 1;
      private int section_;
      public static final int BOX_FIELD_NUMBER = 2;
      private int box_;
      private byte memoizedIsInitialized;
      private static final C2S_WarNorthSectionBoxReward_11009 DEFAULT_INSTANCE = new C2S_WarNorthSectionBoxReward_11009();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarNorthSectionBoxReward_11009> PARSER = new AbstractParser<C2S_WarNorthSectionBoxReward_11009>() {
         public C2S_WarNorthSectionBoxReward_11009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarNorthSectionBoxReward_11009(input, extensionRegistry);
         }
      };

      private C2S_WarNorthSectionBoxReward_11009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarNorthSectionBoxReward_11009() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarNorthSectionBoxReward_11009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarNorthSectionBoxReward_11009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.section_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.box_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionBoxReward_11009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionBoxReward_11009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSectionBoxReward_11009.class, Builder.class);
      }

      public boolean hasSection() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSection() {
         return this.section_;
      }

      public boolean hasBox() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBox() {
         return this.box_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSection()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBox()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.section_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.box_);
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
               size += CodedOutputStream.computeInt32Size(1, this.section_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.box_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarNorthSectionBoxReward_11009)) {
            return super.equals(obj);
         } else {
            C2S_WarNorthSectionBoxReward_11009 other = (C2S_WarNorthSectionBoxReward_11009)obj;
            if (this.hasSection() != other.hasSection()) {
               return false;
            } else if (this.hasSection() && this.getSection() != other.getSection()) {
               return false;
            } else if (this.hasBox() != other.hasBox()) {
               return false;
            } else if (this.hasBox() && this.getBox() != other.getBox()) {
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
            if (this.hasSection()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSection();
            }

            if (this.hasBox()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBox();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionBoxReward_11009)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionBoxReward_11009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionBoxReward_11009)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionBoxReward_11009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionBoxReward_11009)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSectionBoxReward_11009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSectionBoxReward_11009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSectionBoxReward_11009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSectionBoxReward_11009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSectionBoxReward_11009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarNorthSectionBoxReward_11009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSectionBoxReward_11009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSectionBoxReward_11009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarNorthSectionBoxReward_11009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarNorthSectionBoxReward_11009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarNorthSectionBoxReward_11009> parser() {
         return PARSER;
      }

      public Parser<C2S_WarNorthSectionBoxReward_11009> getParserForType() {
         return PARSER;
      }

      public C2S_WarNorthSectionBoxReward_11009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarNorthSectionBoxReward_11009OrBuilder {
         private int bitField0_;
         private int section_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionBoxReward_11009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionBoxReward_11009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSectionBoxReward_11009.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.C2S_WarNorthSectionBoxReward_11009.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.section_ = 0;
            this.bitField0_ &= -2;
            this.box_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSectionBoxReward_11009_descriptor;
         }

         public C2S_WarNorthSectionBoxReward_11009 getDefaultInstanceForType() {
            return WarNorthMsg.C2S_WarNorthSectionBoxReward_11009.getDefaultInstance();
         }

         public C2S_WarNorthSectionBoxReward_11009 build() {
            C2S_WarNorthSectionBoxReward_11009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarNorthSectionBoxReward_11009 buildPartial() {
            C2S_WarNorthSectionBoxReward_11009 result = new C2S_WarNorthSectionBoxReward_11009(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.section_ = this.section_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.box_ = this.box_;
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
            if (other instanceof C2S_WarNorthSectionBoxReward_11009) {
               return this.mergeFrom((C2S_WarNorthSectionBoxReward_11009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarNorthSectionBoxReward_11009 other) {
            if (other == WarNorthMsg.C2S_WarNorthSectionBoxReward_11009.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSection()) {
                  this.setSection(other.getSection());
               }

               if (other.hasBox()) {
                  this.setBox(other.getBox());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSection()) {
               return false;
            } else {
               return this.hasBox();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarNorthSectionBoxReward_11009 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarNorthSectionBoxReward_11009)WarNorthMsg.C2S_WarNorthSectionBoxReward_11009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarNorthSectionBoxReward_11009)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSection() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSection() {
            return this.section_;
         }

         public Builder setSection(int value) {
            this.bitField0_ |= 1;
            this.section_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSection() {
            this.bitField0_ &= -2;
            this.section_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBox() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBox() {
            return this.box_;
         }

         public Builder setBox(int value) {
            this.bitField0_ |= 2;
            this.box_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBox() {
            this.bitField0_ &= -3;
            this.box_ = 0;
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

   public static final class S2C_WarNorthSectionBoxReward_11010 extends GeneratedMessageV3 implements S2C_WarNorthSectionBoxReward_11010OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SECTION_FIELD_NUMBER = 1;
      private int section_;
      public static final int BOX_FIELD_NUMBER = 2;
      private int box_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthSectionBoxReward_11010 DEFAULT_INSTANCE = new S2C_WarNorthSectionBoxReward_11010();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthSectionBoxReward_11010> PARSER = new AbstractParser<S2C_WarNorthSectionBoxReward_11010>() {
         public S2C_WarNorthSectionBoxReward_11010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthSectionBoxReward_11010(input, extensionRegistry);
         }
      };

      private S2C_WarNorthSectionBoxReward_11010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthSectionBoxReward_11010() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthSectionBoxReward_11010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthSectionBoxReward_11010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.section_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.box_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionBoxReward_11010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionBoxReward_11010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSectionBoxReward_11010.class, Builder.class);
      }

      public boolean hasSection() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSection() {
         return this.section_;
      }

      public boolean hasBox() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBox() {
         return this.box_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSection()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBox()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.section_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.box_);
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
               size += CodedOutputStream.computeInt32Size(1, this.section_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.box_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthSectionBoxReward_11010)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthSectionBoxReward_11010 other = (S2C_WarNorthSectionBoxReward_11010)obj;
            if (this.hasSection() != other.hasSection()) {
               return false;
            } else if (this.hasSection() && this.getSection() != other.getSection()) {
               return false;
            } else if (this.hasBox() != other.hasBox()) {
               return false;
            } else if (this.hasBox() && this.getBox() != other.getBox()) {
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
            if (this.hasSection()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSection();
            }

            if (this.hasBox()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBox();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionBoxReward_11010)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionBoxReward_11010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionBoxReward_11010)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionBoxReward_11010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionBoxReward_11010)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSectionBoxReward_11010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSectionBoxReward_11010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSectionBoxReward_11010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSectionBoxReward_11010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSectionBoxReward_11010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthSectionBoxReward_11010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSectionBoxReward_11010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSectionBoxReward_11010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthSectionBoxReward_11010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthSectionBoxReward_11010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthSectionBoxReward_11010> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthSectionBoxReward_11010> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthSectionBoxReward_11010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthSectionBoxReward_11010OrBuilder {
         private int bitField0_;
         private int section_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionBoxReward_11010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionBoxReward_11010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSectionBoxReward_11010.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthSectionBoxReward_11010.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.section_ = 0;
            this.bitField0_ &= -2;
            this.box_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSectionBoxReward_11010_descriptor;
         }

         public S2C_WarNorthSectionBoxReward_11010 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthSectionBoxReward_11010.getDefaultInstance();
         }

         public S2C_WarNorthSectionBoxReward_11010 build() {
            S2C_WarNorthSectionBoxReward_11010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthSectionBoxReward_11010 buildPartial() {
            S2C_WarNorthSectionBoxReward_11010 result = new S2C_WarNorthSectionBoxReward_11010(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.section_ = this.section_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.box_ = this.box_;
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
            if (other instanceof S2C_WarNorthSectionBoxReward_11010) {
               return this.mergeFrom((S2C_WarNorthSectionBoxReward_11010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthSectionBoxReward_11010 other) {
            if (other == WarNorthMsg.S2C_WarNorthSectionBoxReward_11010.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSection()) {
                  this.setSection(other.getSection());
               }

               if (other.hasBox()) {
                  this.setBox(other.getBox());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSection()) {
               return false;
            } else {
               return this.hasBox();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthSectionBoxReward_11010 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthSectionBoxReward_11010)WarNorthMsg.S2C_WarNorthSectionBoxReward_11010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthSectionBoxReward_11010)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSection() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSection() {
            return this.section_;
         }

         public Builder setSection(int value) {
            this.bitField0_ |= 1;
            this.section_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSection() {
            this.bitField0_ &= -2;
            this.section_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBox() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBox() {
            return this.box_;
         }

         public Builder setBox(int value) {
            this.bitField0_ |= 2;
            this.box_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBox() {
            this.bitField0_ &= -3;
            this.box_ = 0;
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

   public static final class C2S_WarNorthSacrificeInfo_11011 extends GeneratedMessageV3 implements C2S_WarNorthSacrificeInfo_11011OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarNorthSacrificeInfo_11011 DEFAULT_INSTANCE = new C2S_WarNorthSacrificeInfo_11011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarNorthSacrificeInfo_11011> PARSER = new AbstractParser<C2S_WarNorthSacrificeInfo_11011>() {
         public C2S_WarNorthSacrificeInfo_11011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarNorthSacrificeInfo_11011(input, extensionRegistry);
         }
      };

      private C2S_WarNorthSacrificeInfo_11011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarNorthSacrificeInfo_11011() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarNorthSacrificeInfo_11011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarNorthSacrificeInfo_11011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeInfo_11011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeInfo_11011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSacrificeInfo_11011.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarNorthSacrificeInfo_11011)) {
            return super.equals(obj);
         } else {
            C2S_WarNorthSacrificeInfo_11011 other = (C2S_WarNorthSacrificeInfo_11011)obj;
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

      public static C2S_WarNorthSacrificeInfo_11011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeInfo_11011)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeInfo_11011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeInfo_11011)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeInfo_11011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeInfo_11011)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeInfo_11011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSacrificeInfo_11011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSacrificeInfo_11011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSacrificeInfo_11011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSacrificeInfo_11011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarNorthSacrificeInfo_11011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSacrificeInfo_11011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSacrificeInfo_11011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarNorthSacrificeInfo_11011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarNorthSacrificeInfo_11011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarNorthSacrificeInfo_11011> parser() {
         return PARSER;
      }

      public Parser<C2S_WarNorthSacrificeInfo_11011> getParserForType() {
         return PARSER;
      }

      public C2S_WarNorthSacrificeInfo_11011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarNorthSacrificeInfo_11011OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeInfo_11011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeInfo_11011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSacrificeInfo_11011.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.C2S_WarNorthSacrificeInfo_11011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeInfo_11011_descriptor;
         }

         public C2S_WarNorthSacrificeInfo_11011 getDefaultInstanceForType() {
            return WarNorthMsg.C2S_WarNorthSacrificeInfo_11011.getDefaultInstance();
         }

         public C2S_WarNorthSacrificeInfo_11011 build() {
            C2S_WarNorthSacrificeInfo_11011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarNorthSacrificeInfo_11011 buildPartial() {
            C2S_WarNorthSacrificeInfo_11011 result = new C2S_WarNorthSacrificeInfo_11011(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarNorthSacrificeInfo_11011) {
               return this.mergeFrom((C2S_WarNorthSacrificeInfo_11011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarNorthSacrificeInfo_11011 other) {
            if (other == WarNorthMsg.C2S_WarNorthSacrificeInfo_11011.getDefaultInstance()) {
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
            C2S_WarNorthSacrificeInfo_11011 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarNorthSacrificeInfo_11011)WarNorthMsg.C2S_WarNorthSacrificeInfo_11011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarNorthSacrificeInfo_11011)e.getUnfinishedMessage();
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

   public static final class S2C_WarNorthSacrificeInfo_11012 extends GeneratedMessageV3 implements S2C_WarNorthSacrificeInfo_11012OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SACRIFICECOUNT_FIELD_NUMBER = 1;
      private int sacrificeCount_;
      public static final int SACRIFICEPOINT_FIELD_NUMBER = 2;
      private int sacrificePoint_;
      public static final int GOTBOXES_FIELD_NUMBER = 3;
      private Internal.IntList gotBoxes_;
      public static final int SACRIFICEFREECOUNT_FIELD_NUMBER = 4;
      private int sacrificeFreeCount_;
      public static final int DAILYSACRIFICECOUNT_FIELD_NUMBER = 5;
      private int dailySacrificeCount_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthSacrificeInfo_11012 DEFAULT_INSTANCE = new S2C_WarNorthSacrificeInfo_11012();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthSacrificeInfo_11012> PARSER = new AbstractParser<S2C_WarNorthSacrificeInfo_11012>() {
         public S2C_WarNorthSacrificeInfo_11012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthSacrificeInfo_11012(input, extensionRegistry);
         }
      };

      private S2C_WarNorthSacrificeInfo_11012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthSacrificeInfo_11012() {
         this.memoizedIsInitialized = -1;
         this.gotBoxes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthSacrificeInfo_11012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthSacrificeInfo_11012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sacrificeCount_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.sacrificePoint_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gotBoxes_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gotBoxes_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotBoxes_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.sacrificeFreeCount_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 8;
                        this.dailySacrificeCount_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gotBoxes_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.gotBoxes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeInfo_11012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeInfo_11012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSacrificeInfo_11012.class, Builder.class);
      }

      public boolean hasSacrificeCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSacrificeCount() {
         return this.sacrificeCount_;
      }

      public boolean hasSacrificePoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSacrificePoint() {
         return this.sacrificePoint_;
      }

      public List<Integer> getGotBoxesList() {
         return this.gotBoxes_;
      }

      public int getGotBoxesCount() {
         return this.gotBoxes_.size();
      }

      public int getGotBoxes(int index) {
         return this.gotBoxes_.getInt(index);
      }

      public boolean hasSacrificeFreeCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSacrificeFreeCount() {
         return this.sacrificeFreeCount_;
      }

      public boolean hasDailySacrificeCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDailySacrificeCount() {
         return this.dailySacrificeCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSacrificeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSacrificePoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSacrificeFreeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailySacrificeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.sacrificeCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.sacrificePoint_);
         }

         for(int i = 0; i < this.gotBoxes_.size(); ++i) {
            output.writeInt32(3, this.gotBoxes_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.sacrificeFreeCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.dailySacrificeCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.sacrificeCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.sacrificePoint_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotBoxes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotBoxes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotBoxesList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.sacrificeFreeCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dailySacrificeCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthSacrificeInfo_11012)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthSacrificeInfo_11012 other = (S2C_WarNorthSacrificeInfo_11012)obj;
            if (this.hasSacrificeCount() != other.hasSacrificeCount()) {
               return false;
            } else if (this.hasSacrificeCount() && this.getSacrificeCount() != other.getSacrificeCount()) {
               return false;
            } else if (this.hasSacrificePoint() != other.hasSacrificePoint()) {
               return false;
            } else if (this.hasSacrificePoint() && this.getSacrificePoint() != other.getSacrificePoint()) {
               return false;
            } else if (!this.getGotBoxesList().equals(other.getGotBoxesList())) {
               return false;
            } else if (this.hasSacrificeFreeCount() != other.hasSacrificeFreeCount()) {
               return false;
            } else if (this.hasSacrificeFreeCount() && this.getSacrificeFreeCount() != other.getSacrificeFreeCount()) {
               return false;
            } else if (this.hasDailySacrificeCount() != other.hasDailySacrificeCount()) {
               return false;
            } else if (this.hasDailySacrificeCount() && this.getDailySacrificeCount() != other.getDailySacrificeCount()) {
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
            if (this.hasSacrificeCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSacrificeCount();
            }

            if (this.hasSacrificePoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSacrificePoint();
            }

            if (this.getGotBoxesCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotBoxesList().hashCode();
            }

            if (this.hasSacrificeFreeCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSacrificeFreeCount();
            }

            if (this.hasDailySacrificeCount()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDailySacrificeCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeInfo_11012)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeInfo_11012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeInfo_11012)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeInfo_11012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeInfo_11012)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeInfo_11012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSacrificeInfo_11012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeInfo_11012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSacrificeInfo_11012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeInfo_11012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthSacrificeInfo_11012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeInfo_11012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeInfo_11012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthSacrificeInfo_11012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthSacrificeInfo_11012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthSacrificeInfo_11012> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthSacrificeInfo_11012> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthSacrificeInfo_11012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthSacrificeInfo_11012OrBuilder {
         private int bitField0_;
         private int sacrificeCount_;
         private int sacrificePoint_;
         private Internal.IntList gotBoxes_;
         private int sacrificeFreeCount_;
         private int dailySacrificeCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeInfo_11012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeInfo_11012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSacrificeInfo_11012.class, Builder.class);
         }

         private Builder() {
            this.gotBoxes_ = WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotBoxes_ = WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.sacrificeCount_ = 0;
            this.bitField0_ &= -2;
            this.sacrificePoint_ = 0;
            this.bitField0_ &= -3;
            this.gotBoxes_ = WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.emptyIntList();
            this.bitField0_ &= -5;
            this.sacrificeFreeCount_ = 0;
            this.bitField0_ &= -9;
            this.dailySacrificeCount_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeInfo_11012_descriptor;
         }

         public S2C_WarNorthSacrificeInfo_11012 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.getDefaultInstance();
         }

         public S2C_WarNorthSacrificeInfo_11012 build() {
            S2C_WarNorthSacrificeInfo_11012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthSacrificeInfo_11012 buildPartial() {
            S2C_WarNorthSacrificeInfo_11012 result = new S2C_WarNorthSacrificeInfo_11012(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.sacrificeCount_ = this.sacrificeCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sacrificePoint_ = this.sacrificePoint_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotBoxes_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotBoxes_ = this.gotBoxes_;
            if ((from_bitField0_ & 8) != 0) {
               result.sacrificeFreeCount_ = this.sacrificeFreeCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dailySacrificeCount_ = this.dailySacrificeCount_;
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
            if (other instanceof S2C_WarNorthSacrificeInfo_11012) {
               return this.mergeFrom((S2C_WarNorthSacrificeInfo_11012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthSacrificeInfo_11012 other) {
            if (other == WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSacrificeCount()) {
                  this.setSacrificeCount(other.getSacrificeCount());
               }

               if (other.hasSacrificePoint()) {
                  this.setSacrificePoint(other.getSacrificePoint());
               }

               if (!other.gotBoxes_.isEmpty()) {
                  if (this.gotBoxes_.isEmpty()) {
                     this.gotBoxes_ = other.gotBoxes_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGotBoxesIsMutable();
                     this.gotBoxes_.addAll(other.gotBoxes_);
                  }

                  this.onChanged();
               }

               if (other.hasSacrificeFreeCount()) {
                  this.setSacrificeFreeCount(other.getSacrificeFreeCount());
               }

               if (other.hasDailySacrificeCount()) {
                  this.setDailySacrificeCount(other.getDailySacrificeCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSacrificeCount()) {
               return false;
            } else if (!this.hasSacrificePoint()) {
               return false;
            } else if (!this.hasSacrificeFreeCount()) {
               return false;
            } else {
               return this.hasDailySacrificeCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthSacrificeInfo_11012 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthSacrificeInfo_11012)WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthSacrificeInfo_11012)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSacrificeCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSacrificeCount() {
            return this.sacrificeCount_;
         }

         public Builder setSacrificeCount(int value) {
            this.bitField0_ |= 1;
            this.sacrificeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificeCount() {
            this.bitField0_ &= -2;
            this.sacrificeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSacrificePoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSacrificePoint() {
            return this.sacrificePoint_;
         }

         public Builder setSacrificePoint(int value) {
            this.bitField0_ |= 2;
            this.sacrificePoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificePoint() {
            this.bitField0_ &= -3;
            this.sacrificePoint_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotBoxesIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotBoxes_ = WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.mutableCopy(this.gotBoxes_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getGotBoxesList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.gotBoxes_) : this.gotBoxes_);
         }

         public int getGotBoxesCount() {
            return this.gotBoxes_.size();
         }

         public int getGotBoxes(int index) {
            return this.gotBoxes_.getInt(index);
         }

         public Builder setGotBoxes(int index, int value) {
            this.ensureGotBoxesIsMutable();
            this.gotBoxes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotBoxes(int value) {
            this.ensureGotBoxesIsMutable();
            this.gotBoxes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotBoxes(Iterable<? extends Integer> values) {
            this.ensureGotBoxesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotBoxes_);
            this.onChanged();
            return this;
         }

         public Builder clearGotBoxes() {
            this.gotBoxes_ = WarNorthMsg.S2C_WarNorthSacrificeInfo_11012.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasSacrificeFreeCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSacrificeFreeCount() {
            return this.sacrificeFreeCount_;
         }

         public Builder setSacrificeFreeCount(int value) {
            this.bitField0_ |= 8;
            this.sacrificeFreeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificeFreeCount() {
            this.bitField0_ &= -9;
            this.sacrificeFreeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailySacrificeCount() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDailySacrificeCount() {
            return this.dailySacrificeCount_;
         }

         public Builder setDailySacrificeCount(int value) {
            this.bitField0_ |= 16;
            this.dailySacrificeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailySacrificeCount() {
            this.bitField0_ &= -17;
            this.dailySacrificeCount_ = 0;
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

   public static final class C2S_WarNorthDoSacrifice_11013 extends GeneratedMessageV3 implements C2S_WarNorthDoSacrifice_11013OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_WarNorthDoSacrifice_11013 DEFAULT_INSTANCE = new C2S_WarNorthDoSacrifice_11013();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarNorthDoSacrifice_11013> PARSER = new AbstractParser<C2S_WarNorthDoSacrifice_11013>() {
         public C2S_WarNorthDoSacrifice_11013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarNorthDoSacrifice_11013(input, extensionRegistry);
         }
      };

      private C2S_WarNorthDoSacrifice_11013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarNorthDoSacrifice_11013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarNorthDoSacrifice_11013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarNorthDoSacrifice_11013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthDoSacrifice_11013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthDoSacrifice_11013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthDoSacrifice_11013.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarNorthDoSacrifice_11013)) {
            return super.equals(obj);
         } else {
            C2S_WarNorthDoSacrifice_11013 other = (C2S_WarNorthDoSacrifice_11013)obj;
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

      public static C2S_WarNorthDoSacrifice_11013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthDoSacrifice_11013)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthDoSacrifice_11013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthDoSacrifice_11013)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthDoSacrifice_11013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthDoSacrifice_11013)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthDoSacrifice_11013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseFrom(InputStream input) throws IOException {
         return (C2S_WarNorthDoSacrifice_11013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthDoSacrifice_11013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarNorthDoSacrifice_11013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthDoSacrifice_11013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarNorthDoSacrifice_11013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthDoSacrifice_11013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthDoSacrifice_11013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarNorthDoSacrifice_11013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarNorthDoSacrifice_11013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarNorthDoSacrifice_11013> parser() {
         return PARSER;
      }

      public Parser<C2S_WarNorthDoSacrifice_11013> getParserForType() {
         return PARSER;
      }

      public C2S_WarNorthDoSacrifice_11013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarNorthDoSacrifice_11013OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthDoSacrifice_11013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthDoSacrifice_11013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthDoSacrifice_11013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.C2S_WarNorthDoSacrifice_11013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthDoSacrifice_11013_descriptor;
         }

         public C2S_WarNorthDoSacrifice_11013 getDefaultInstanceForType() {
            return WarNorthMsg.C2S_WarNorthDoSacrifice_11013.getDefaultInstance();
         }

         public C2S_WarNorthDoSacrifice_11013 build() {
            C2S_WarNorthDoSacrifice_11013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarNorthDoSacrifice_11013 buildPartial() {
            C2S_WarNorthDoSacrifice_11013 result = new C2S_WarNorthDoSacrifice_11013(this);
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
            if (other instanceof C2S_WarNorthDoSacrifice_11013) {
               return this.mergeFrom((C2S_WarNorthDoSacrifice_11013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarNorthDoSacrifice_11013 other) {
            if (other == WarNorthMsg.C2S_WarNorthDoSacrifice_11013.getDefaultInstance()) {
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
            C2S_WarNorthDoSacrifice_11013 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarNorthDoSacrifice_11013)WarNorthMsg.C2S_WarNorthDoSacrifice_11013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarNorthDoSacrifice_11013)e.getUnfinishedMessage();
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

   public static final class S2C_WarNorthDoSacrifice_11014 extends GeneratedMessageV3 implements S2C_WarNorthDoSacrifice_11014OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int SACRIFICECOUNT_FIELD_NUMBER = 2;
      private int sacrificeCount_;
      public static final int DAILYSACRIFICECOUNT_FIELD_NUMBER = 3;
      private int dailySacrificeCount_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthDoSacrifice_11014 DEFAULT_INSTANCE = new S2C_WarNorthDoSacrifice_11014();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthDoSacrifice_11014> PARSER = new AbstractParser<S2C_WarNorthDoSacrifice_11014>() {
         public S2C_WarNorthDoSacrifice_11014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthDoSacrifice_11014(input, extensionRegistry);
         }
      };

      private S2C_WarNorthDoSacrifice_11014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthDoSacrifice_11014() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthDoSacrifice_11014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthDoSacrifice_11014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sacrificeCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.dailySacrificeCount_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthDoSacrifice_11014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthDoSacrifice_11014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthDoSacrifice_11014.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasSacrificeCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSacrificeCount() {
         return this.sacrificeCount_;
      }

      public boolean hasDailySacrificeCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDailySacrificeCount() {
         return this.dailySacrificeCount_;
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
         } else if (!this.hasSacrificeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailySacrificeCount()) {
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
            output.writeInt32(2, this.sacrificeCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.dailySacrificeCount_);
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
               size += CodedOutputStream.computeInt32Size(2, this.sacrificeCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.dailySacrificeCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthDoSacrifice_11014)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthDoSacrifice_11014 other = (S2C_WarNorthDoSacrifice_11014)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasSacrificeCount() != other.hasSacrificeCount()) {
               return false;
            } else if (this.hasSacrificeCount() && this.getSacrificeCount() != other.getSacrificeCount()) {
               return false;
            } else if (this.hasDailySacrificeCount() != other.hasDailySacrificeCount()) {
               return false;
            } else if (this.hasDailySacrificeCount() && this.getDailySacrificeCount() != other.getDailySacrificeCount()) {
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

            if (this.hasSacrificeCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSacrificeCount();
            }

            if (this.hasDailySacrificeCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDailySacrificeCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthDoSacrifice_11014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthDoSacrifice_11014)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthDoSacrifice_11014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthDoSacrifice_11014)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthDoSacrifice_11014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthDoSacrifice_11014)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthDoSacrifice_11014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthDoSacrifice_11014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthDoSacrifice_11014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthDoSacrifice_11014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthDoSacrifice_11014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthDoSacrifice_11014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthDoSacrifice_11014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthDoSacrifice_11014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthDoSacrifice_11014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthDoSacrifice_11014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthDoSacrifice_11014> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthDoSacrifice_11014> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthDoSacrifice_11014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthDoSacrifice_11014OrBuilder {
         private int bitField0_;
         private int type_;
         private int sacrificeCount_;
         private int dailySacrificeCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthDoSacrifice_11014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthDoSacrifice_11014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthDoSacrifice_11014.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthDoSacrifice_11014.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.sacrificeCount_ = 0;
            this.bitField0_ &= -3;
            this.dailySacrificeCount_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthDoSacrifice_11014_descriptor;
         }

         public S2C_WarNorthDoSacrifice_11014 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthDoSacrifice_11014.getDefaultInstance();
         }

         public S2C_WarNorthDoSacrifice_11014 build() {
            S2C_WarNorthDoSacrifice_11014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthDoSacrifice_11014 buildPartial() {
            S2C_WarNorthDoSacrifice_11014 result = new S2C_WarNorthDoSacrifice_11014(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sacrificeCount_ = this.sacrificeCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.dailySacrificeCount_ = this.dailySacrificeCount_;
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
            if (other instanceof S2C_WarNorthDoSacrifice_11014) {
               return this.mergeFrom((S2C_WarNorthDoSacrifice_11014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthDoSacrifice_11014 other) {
            if (other == WarNorthMsg.S2C_WarNorthDoSacrifice_11014.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasSacrificeCount()) {
                  this.setSacrificeCount(other.getSacrificeCount());
               }

               if (other.hasDailySacrificeCount()) {
                  this.setDailySacrificeCount(other.getDailySacrificeCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasSacrificeCount()) {
               return false;
            } else {
               return this.hasDailySacrificeCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthDoSacrifice_11014 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthDoSacrifice_11014)WarNorthMsg.S2C_WarNorthDoSacrifice_11014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthDoSacrifice_11014)e.getUnfinishedMessage();
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

         public boolean hasSacrificeCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSacrificeCount() {
            return this.sacrificeCount_;
         }

         public Builder setSacrificeCount(int value) {
            this.bitField0_ |= 2;
            this.sacrificeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificeCount() {
            this.bitField0_ &= -3;
            this.sacrificeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailySacrificeCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDailySacrificeCount() {
            return this.dailySacrificeCount_;
         }

         public Builder setDailySacrificeCount(int value) {
            this.bitField0_ |= 4;
            this.dailySacrificeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailySacrificeCount() {
            this.bitField0_ &= -5;
            this.dailySacrificeCount_ = 0;
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

   public static final class C2S_WarNorthSacrificeBoxReward_11015 extends GeneratedMessageV3 implements C2S_WarNorthSacrificeBoxReward_11015OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_WarNorthSacrificeBoxReward_11015 DEFAULT_INSTANCE = new C2S_WarNorthSacrificeBoxReward_11015();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarNorthSacrificeBoxReward_11015> PARSER = new AbstractParser<C2S_WarNorthSacrificeBoxReward_11015>() {
         public C2S_WarNorthSacrificeBoxReward_11015 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarNorthSacrificeBoxReward_11015(input, extensionRegistry);
         }
      };

      private C2S_WarNorthSacrificeBoxReward_11015(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarNorthSacrificeBoxReward_11015() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarNorthSacrificeBoxReward_11015();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarNorthSacrificeBoxReward_11015(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeBoxReward_11015_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeBoxReward_11015_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSacrificeBoxReward_11015.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarNorthSacrificeBoxReward_11015)) {
            return super.equals(obj);
         } else {
            C2S_WarNorthSacrificeBoxReward_11015 other = (C2S_WarNorthSacrificeBoxReward_11015)obj;
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

      public static C2S_WarNorthSacrificeBoxReward_11015 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeBoxReward_11015)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeBoxReward_11015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeBoxReward_11015)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeBoxReward_11015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeBoxReward_11015)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeBoxReward_11015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSacrificeBoxReward_11015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSacrificeBoxReward_11015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSacrificeBoxReward_11015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSacrificeBoxReward_11015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarNorthSacrificeBoxReward_11015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSacrificeBoxReward_11015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarNorthSacrificeBoxReward_11015 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarNorthSacrificeBoxReward_11015 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarNorthSacrificeBoxReward_11015> parser() {
         return PARSER;
      }

      public Parser<C2S_WarNorthSacrificeBoxReward_11015> getParserForType() {
         return PARSER;
      }

      public C2S_WarNorthSacrificeBoxReward_11015 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarNorthSacrificeBoxReward_11015OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeBoxReward_11015_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeBoxReward_11015_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSacrificeBoxReward_11015.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.C2S_WarNorthSacrificeBoxReward_11015.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeBoxReward_11015_descriptor;
         }

         public C2S_WarNorthSacrificeBoxReward_11015 getDefaultInstanceForType() {
            return WarNorthMsg.C2S_WarNorthSacrificeBoxReward_11015.getDefaultInstance();
         }

         public C2S_WarNorthSacrificeBoxReward_11015 build() {
            C2S_WarNorthSacrificeBoxReward_11015 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarNorthSacrificeBoxReward_11015 buildPartial() {
            C2S_WarNorthSacrificeBoxReward_11015 result = new C2S_WarNorthSacrificeBoxReward_11015(this);
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
            if (other instanceof C2S_WarNorthSacrificeBoxReward_11015) {
               return this.mergeFrom((C2S_WarNorthSacrificeBoxReward_11015)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarNorthSacrificeBoxReward_11015 other) {
            if (other == WarNorthMsg.C2S_WarNorthSacrificeBoxReward_11015.getDefaultInstance()) {
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
            C2S_WarNorthSacrificeBoxReward_11015 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarNorthSacrificeBoxReward_11015)WarNorthMsg.C2S_WarNorthSacrificeBoxReward_11015.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarNorthSacrificeBoxReward_11015)e.getUnfinishedMessage();
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

   public static final class S2C_WarNorthSacrificeBoxReward_11016 extends GeneratedMessageV3 implements S2C_WarNorthSacrificeBoxReward_11016OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int SACRIFICEPOINT_FIELD_NUMBER = 2;
      private int sacrificePoint_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthSacrificeBoxReward_11016 DEFAULT_INSTANCE = new S2C_WarNorthSacrificeBoxReward_11016();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthSacrificeBoxReward_11016> PARSER = new AbstractParser<S2C_WarNorthSacrificeBoxReward_11016>() {
         public S2C_WarNorthSacrificeBoxReward_11016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthSacrificeBoxReward_11016(input, extensionRegistry);
         }
      };

      private S2C_WarNorthSacrificeBoxReward_11016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthSacrificeBoxReward_11016() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthSacrificeBoxReward_11016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthSacrificeBoxReward_11016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sacrificePoint_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeBoxReward_11016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeBoxReward_11016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSacrificeBoxReward_11016.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasSacrificePoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSacrificePoint() {
         return this.sacrificePoint_;
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
         } else if (!this.hasSacrificePoint()) {
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
            output.writeInt32(2, this.sacrificePoint_);
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
               size += CodedOutputStream.computeInt32Size(2, this.sacrificePoint_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthSacrificeBoxReward_11016)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthSacrificeBoxReward_11016 other = (S2C_WarNorthSacrificeBoxReward_11016)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasSacrificePoint() != other.hasSacrificePoint()) {
               return false;
            } else if (this.hasSacrificePoint() && this.getSacrificePoint() != other.getSacrificePoint()) {
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

            if (this.hasSacrificePoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSacrificePoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeBoxReward_11016)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeBoxReward_11016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeBoxReward_11016)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeBoxReward_11016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeBoxReward_11016)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeBoxReward_11016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSacrificeBoxReward_11016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeBoxReward_11016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSacrificeBoxReward_11016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeBoxReward_11016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthSacrificeBoxReward_11016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeBoxReward_11016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthSacrificeBoxReward_11016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthSacrificeBoxReward_11016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthSacrificeBoxReward_11016> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthSacrificeBoxReward_11016> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthSacrificeBoxReward_11016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthSacrificeBoxReward_11016OrBuilder {
         private int bitField0_;
         private int id_;
         private int sacrificePoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeBoxReward_11016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeBoxReward_11016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSacrificeBoxReward_11016.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthSacrificeBoxReward_11016.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.sacrificePoint_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeBoxReward_11016_descriptor;
         }

         public S2C_WarNorthSacrificeBoxReward_11016 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthSacrificeBoxReward_11016.getDefaultInstance();
         }

         public S2C_WarNorthSacrificeBoxReward_11016 build() {
            S2C_WarNorthSacrificeBoxReward_11016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthSacrificeBoxReward_11016 buildPartial() {
            S2C_WarNorthSacrificeBoxReward_11016 result = new S2C_WarNorthSacrificeBoxReward_11016(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sacrificePoint_ = this.sacrificePoint_;
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
            if (other instanceof S2C_WarNorthSacrificeBoxReward_11016) {
               return this.mergeFrom((S2C_WarNorthSacrificeBoxReward_11016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthSacrificeBoxReward_11016 other) {
            if (other == WarNorthMsg.S2C_WarNorthSacrificeBoxReward_11016.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasSacrificePoint()) {
                  this.setSacrificePoint(other.getSacrificePoint());
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
               return this.hasSacrificePoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthSacrificeBoxReward_11016 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthSacrificeBoxReward_11016)WarNorthMsg.S2C_WarNorthSacrificeBoxReward_11016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthSacrificeBoxReward_11016)e.getUnfinishedMessage();
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

         public boolean hasSacrificePoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSacrificePoint() {
            return this.sacrificePoint_;
         }

         public Builder setSacrificePoint(int value) {
            this.bitField0_ |= 2;
            this.sacrificePoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificePoint() {
            this.bitField0_ &= -3;
            this.sacrificePoint_ = 0;
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

   public static final class C2S_WarNorthSacrificeRecordList_11017 extends GeneratedMessageV3 implements C2S_WarNorthSacrificeRecordList_11017OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_WarNorthSacrificeRecordList_11017 DEFAULT_INSTANCE = new C2S_WarNorthSacrificeRecordList_11017();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarNorthSacrificeRecordList_11017> PARSER = new AbstractParser<C2S_WarNorthSacrificeRecordList_11017>() {
         public C2S_WarNorthSacrificeRecordList_11017 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarNorthSacrificeRecordList_11017(input, extensionRegistry);
         }
      };

      private C2S_WarNorthSacrificeRecordList_11017(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarNorthSacrificeRecordList_11017() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarNorthSacrificeRecordList_11017();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarNorthSacrificeRecordList_11017(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeRecordList_11017_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeRecordList_11017_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSacrificeRecordList_11017.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarNorthSacrificeRecordList_11017)) {
            return super.equals(obj);
         } else {
            C2S_WarNorthSacrificeRecordList_11017 other = (C2S_WarNorthSacrificeRecordList_11017)obj;
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

      public static C2S_WarNorthSacrificeRecordList_11017 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeRecordList_11017)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeRecordList_11017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeRecordList_11017)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeRecordList_11017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeRecordList_11017)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthSacrificeRecordList_11017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSacrificeRecordList_11017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSacrificeRecordList_11017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarNorthSacrificeRecordList_11017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSacrificeRecordList_11017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarNorthSacrificeRecordList_11017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthSacrificeRecordList_11017 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthSacrificeRecordList_11017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarNorthSacrificeRecordList_11017 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarNorthSacrificeRecordList_11017 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarNorthSacrificeRecordList_11017> parser() {
         return PARSER;
      }

      public Parser<C2S_WarNorthSacrificeRecordList_11017> getParserForType() {
         return PARSER;
      }

      public C2S_WarNorthSacrificeRecordList_11017 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarNorthSacrificeRecordList_11017OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeRecordList_11017_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeRecordList_11017_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthSacrificeRecordList_11017.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.C2S_WarNorthSacrificeRecordList_11017.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthSacrificeRecordList_11017_descriptor;
         }

         public C2S_WarNorthSacrificeRecordList_11017 getDefaultInstanceForType() {
            return WarNorthMsg.C2S_WarNorthSacrificeRecordList_11017.getDefaultInstance();
         }

         public C2S_WarNorthSacrificeRecordList_11017 build() {
            C2S_WarNorthSacrificeRecordList_11017 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarNorthSacrificeRecordList_11017 buildPartial() {
            C2S_WarNorthSacrificeRecordList_11017 result = new C2S_WarNorthSacrificeRecordList_11017(this);
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
            if (other instanceof C2S_WarNorthSacrificeRecordList_11017) {
               return this.mergeFrom((C2S_WarNorthSacrificeRecordList_11017)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarNorthSacrificeRecordList_11017 other) {
            if (other == WarNorthMsg.C2S_WarNorthSacrificeRecordList_11017.getDefaultInstance()) {
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
            C2S_WarNorthSacrificeRecordList_11017 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarNorthSacrificeRecordList_11017)WarNorthMsg.C2S_WarNorthSacrificeRecordList_11017.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarNorthSacrificeRecordList_11017)e.getUnfinishedMessage();
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

   public static final class S2C_WarNorthSacrificeRecordList_11018 extends GeneratedMessageV3 implements S2C_WarNorthSacrificeRecordList_11018OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int RECORDLIST_FIELD_NUMBER = 2;
      private List<SacrificeRecordData> recordList_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthSacrificeRecordList_11018 DEFAULT_INSTANCE = new S2C_WarNorthSacrificeRecordList_11018();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthSacrificeRecordList_11018> PARSER = new AbstractParser<S2C_WarNorthSacrificeRecordList_11018>() {
         public S2C_WarNorthSacrificeRecordList_11018 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthSacrificeRecordList_11018(input, extensionRegistry);
         }
      };

      private S2C_WarNorthSacrificeRecordList_11018(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthSacrificeRecordList_11018() {
         this.memoizedIsInitialized = -1;
         this.recordList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthSacrificeRecordList_11018();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthSacrificeRecordList_11018(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.recordList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.recordList_.add(input.readMessage(WarNorthMsg.SacrificeRecordData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.recordList_ = Collections.unmodifiableList(this.recordList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecordList_11018_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecordList_11018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSacrificeRecordList_11018.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<SacrificeRecordData> getRecordListList() {
         return this.recordList_;
      }

      public List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList() {
         return this.recordList_;
      }

      public int getRecordListCount() {
         return this.recordList_.size();
      }

      public SacrificeRecordData getRecordList(int index) {
         return (SacrificeRecordData)this.recordList_.get(index);
      }

      public SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index) {
         return (SacrificeRecordDataOrBuilder)this.recordList_.get(index);
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
            for(int i = 0; i < this.getRecordListCount(); ++i) {
               if (!this.getRecordList(i).isInitialized()) {
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
            output.writeInt32(1, this.type_);
         }

         for(int i = 0; i < this.recordList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.recordList_.get(i));
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

            for(int i = 0; i < this.recordList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.recordList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthSacrificeRecordList_11018)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthSacrificeRecordList_11018 other = (S2C_WarNorthSacrificeRecordList_11018)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getRecordListList().equals(other.getRecordListList())) {
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

            if (this.getRecordListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecordList_11018)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecordList_11018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecordList_11018)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecordList_11018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecordList_11018)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecordList_11018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSacrificeRecordList_11018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeRecordList_11018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSacrificeRecordList_11018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeRecordList_11018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthSacrificeRecordList_11018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeRecordList_11018 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeRecordList_11018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthSacrificeRecordList_11018 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthSacrificeRecordList_11018 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthSacrificeRecordList_11018> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthSacrificeRecordList_11018> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthSacrificeRecordList_11018 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthSacrificeRecordList_11018OrBuilder {
         private int bitField0_;
         private int type_;
         private List<SacrificeRecordData> recordList_;
         private RepeatedFieldBuilderV3<SacrificeRecordData, SacrificeRecordData.Builder, SacrificeRecordDataOrBuilder> recordListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecordList_11018_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecordList_11018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSacrificeRecordList_11018.class, Builder.class);
         }

         private Builder() {
            this.recordList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recordList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthSacrificeRecordList_11018.alwaysUseFieldBuilders) {
               this.getRecordListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            if (this.recordListBuilder_ == null) {
               this.recordList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.recordListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecordList_11018_descriptor;
         }

         public S2C_WarNorthSacrificeRecordList_11018 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthSacrificeRecordList_11018.getDefaultInstance();
         }

         public S2C_WarNorthSacrificeRecordList_11018 build() {
            S2C_WarNorthSacrificeRecordList_11018 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthSacrificeRecordList_11018 buildPartial() {
            S2C_WarNorthSacrificeRecordList_11018 result = new S2C_WarNorthSacrificeRecordList_11018(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if (this.recordListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.recordList_ = Collections.unmodifiableList(this.recordList_);
                  this.bitField0_ &= -3;
               }

               result.recordList_ = this.recordList_;
            } else {
               result.recordList_ = this.recordListBuilder_.build();
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
            if (other instanceof S2C_WarNorthSacrificeRecordList_11018) {
               return this.mergeFrom((S2C_WarNorthSacrificeRecordList_11018)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthSacrificeRecordList_11018 other) {
            if (other == WarNorthMsg.S2C_WarNorthSacrificeRecordList_11018.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.recordListBuilder_ == null) {
                  if (!other.recordList_.isEmpty()) {
                     if (this.recordList_.isEmpty()) {
                        this.recordList_ = other.recordList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRecordListIsMutable();
                        this.recordList_.addAll(other.recordList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recordList_.isEmpty()) {
                  if (this.recordListBuilder_.isEmpty()) {
                     this.recordListBuilder_.dispose();
                     this.recordListBuilder_ = null;
                     this.recordList_ = other.recordList_;
                     this.bitField0_ &= -3;
                     this.recordListBuilder_ = WarNorthMsg.S2C_WarNorthSacrificeRecordList_11018.alwaysUseFieldBuilders ? this.getRecordListFieldBuilder() : null;
                  } else {
                     this.recordListBuilder_.addAllMessages(other.recordList_);
                  }
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
               for(int i = 0; i < this.getRecordListCount(); ++i) {
                  if (!this.getRecordList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthSacrificeRecordList_11018 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthSacrificeRecordList_11018)WarNorthMsg.S2C_WarNorthSacrificeRecordList_11018.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthSacrificeRecordList_11018)e.getUnfinishedMessage();
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

         private void ensureRecordListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.recordList_ = new ArrayList(this.recordList_);
               this.bitField0_ |= 2;
            }

         }

         public List<SacrificeRecordData> getRecordListList() {
            return this.recordListBuilder_ == null ? Collections.unmodifiableList(this.recordList_) : this.recordListBuilder_.getMessageList();
         }

         public int getRecordListCount() {
            return this.recordListBuilder_ == null ? this.recordList_.size() : this.recordListBuilder_.getCount();
         }

         public SacrificeRecordData getRecordList(int index) {
            return this.recordListBuilder_ == null ? (SacrificeRecordData)this.recordList_.get(index) : (SacrificeRecordData)this.recordListBuilder_.getMessage(index);
         }

         public Builder setRecordList(int index, SacrificeRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.set(index, value);
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecordList(int index, SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(SacrificeRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.add(value);
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecordList(int index, SacrificeRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.add(index, value);
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecordList(SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(int index, SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordList(Iterable<? extends SacrificeRecordData> values) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recordList_);
               this.onChanged();
            } else {
               this.recordListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecordList() {
            if (this.recordListBuilder_ == null) {
               this.recordList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.recordListBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecordList(int index) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.remove(index);
               this.onChanged();
            } else {
               this.recordListBuilder_.remove(index);
            }

            return this;
         }

         public SacrificeRecordData.Builder getRecordListBuilder(int index) {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().getBuilder(index);
         }

         public SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index) {
            return this.recordListBuilder_ == null ? (SacrificeRecordDataOrBuilder)this.recordList_.get(index) : (SacrificeRecordDataOrBuilder)this.recordListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList() {
            return this.recordListBuilder_ != null ? this.recordListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordList_);
         }

         public SacrificeRecordData.Builder addRecordListBuilder() {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(WarNorthMsg.SacrificeRecordData.getDefaultInstance());
         }

         public SacrificeRecordData.Builder addRecordListBuilder(int index) {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(index, WarNorthMsg.SacrificeRecordData.getDefaultInstance());
         }

         public List<SacrificeRecordData.Builder> getRecordListBuilderList() {
            return this.getRecordListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SacrificeRecordData, SacrificeRecordData.Builder, SacrificeRecordDataOrBuilder> getRecordListFieldBuilder() {
            if (this.recordListBuilder_ == null) {
               this.recordListBuilder_ = new RepeatedFieldBuilderV3(this.recordList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.recordList_ = null;
            }

            return this.recordListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_WarNorthSacrificeRecord_11020 extends GeneratedMessageV3 implements S2C_WarNorthSacrificeRecord_11020OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORDLIST_FIELD_NUMBER = 1;
      private List<SacrificeRecordData> recordList_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthSacrificeRecord_11020 DEFAULT_INSTANCE = new S2C_WarNorthSacrificeRecord_11020();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthSacrificeRecord_11020> PARSER = new AbstractParser<S2C_WarNorthSacrificeRecord_11020>() {
         public S2C_WarNorthSacrificeRecord_11020 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthSacrificeRecord_11020(input, extensionRegistry);
         }
      };

      private S2C_WarNorthSacrificeRecord_11020(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthSacrificeRecord_11020() {
         this.memoizedIsInitialized = -1;
         this.recordList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthSacrificeRecord_11020();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthSacrificeRecord_11020(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.recordList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recordList_.add(input.readMessage(WarNorthMsg.SacrificeRecordData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.recordList_ = Collections.unmodifiableList(this.recordList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecord_11020_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecord_11020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSacrificeRecord_11020.class, Builder.class);
      }

      public List<SacrificeRecordData> getRecordListList() {
         return this.recordList_;
      }

      public List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList() {
         return this.recordList_;
      }

      public int getRecordListCount() {
         return this.recordList_.size();
      }

      public SacrificeRecordData getRecordList(int index) {
         return (SacrificeRecordData)this.recordList_.get(index);
      }

      public SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index) {
         return (SacrificeRecordDataOrBuilder)this.recordList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRecordListCount(); ++i) {
               if (!this.getRecordList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.recordList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.recordList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.recordList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.recordList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthSacrificeRecord_11020)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthSacrificeRecord_11020 other = (S2C_WarNorthSacrificeRecord_11020)obj;
            if (!this.getRecordListList().equals(other.getRecordListList())) {
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
            if (this.getRecordListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecord_11020)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecord_11020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecord_11020)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecord_11020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecord_11020)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthSacrificeRecord_11020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSacrificeRecord_11020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeRecord_11020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthSacrificeRecord_11020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeRecord_11020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthSacrificeRecord_11020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthSacrificeRecord_11020 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthSacrificeRecord_11020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthSacrificeRecord_11020 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthSacrificeRecord_11020 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthSacrificeRecord_11020> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthSacrificeRecord_11020> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthSacrificeRecord_11020 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthSacrificeRecord_11020OrBuilder {
         private int bitField0_;
         private List<SacrificeRecordData> recordList_;
         private RepeatedFieldBuilderV3<SacrificeRecordData, SacrificeRecordData.Builder, SacrificeRecordDataOrBuilder> recordListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecord_11020_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecord_11020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthSacrificeRecord_11020.class, Builder.class);
         }

         private Builder() {
            this.recordList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recordList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthSacrificeRecord_11020.alwaysUseFieldBuilders) {
               this.getRecordListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.recordListBuilder_ == null) {
               this.recordList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.recordListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthSacrificeRecord_11020_descriptor;
         }

         public S2C_WarNorthSacrificeRecord_11020 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthSacrificeRecord_11020.getDefaultInstance();
         }

         public S2C_WarNorthSacrificeRecord_11020 build() {
            S2C_WarNorthSacrificeRecord_11020 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthSacrificeRecord_11020 buildPartial() {
            S2C_WarNorthSacrificeRecord_11020 result = new S2C_WarNorthSacrificeRecord_11020(this);
            int from_bitField0_ = this.bitField0_;
            if (this.recordListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.recordList_ = Collections.unmodifiableList(this.recordList_);
                  this.bitField0_ &= -2;
               }

               result.recordList_ = this.recordList_;
            } else {
               result.recordList_ = this.recordListBuilder_.build();
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
            if (other instanceof S2C_WarNorthSacrificeRecord_11020) {
               return this.mergeFrom((S2C_WarNorthSacrificeRecord_11020)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthSacrificeRecord_11020 other) {
            if (other == WarNorthMsg.S2C_WarNorthSacrificeRecord_11020.getDefaultInstance()) {
               return this;
            } else {
               if (this.recordListBuilder_ == null) {
                  if (!other.recordList_.isEmpty()) {
                     if (this.recordList_.isEmpty()) {
                        this.recordList_ = other.recordList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRecordListIsMutable();
                        this.recordList_.addAll(other.recordList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recordList_.isEmpty()) {
                  if (this.recordListBuilder_.isEmpty()) {
                     this.recordListBuilder_.dispose();
                     this.recordListBuilder_ = null;
                     this.recordList_ = other.recordList_;
                     this.bitField0_ &= -2;
                     this.recordListBuilder_ = WarNorthMsg.S2C_WarNorthSacrificeRecord_11020.alwaysUseFieldBuilders ? this.getRecordListFieldBuilder() : null;
                  } else {
                     this.recordListBuilder_.addAllMessages(other.recordList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRecordListCount(); ++i) {
               if (!this.getRecordList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthSacrificeRecord_11020 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthSacrificeRecord_11020)WarNorthMsg.S2C_WarNorthSacrificeRecord_11020.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthSacrificeRecord_11020)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recordList_ = new ArrayList(this.recordList_);
               this.bitField0_ |= 1;
            }

         }

         public List<SacrificeRecordData> getRecordListList() {
            return this.recordListBuilder_ == null ? Collections.unmodifiableList(this.recordList_) : this.recordListBuilder_.getMessageList();
         }

         public int getRecordListCount() {
            return this.recordListBuilder_ == null ? this.recordList_.size() : this.recordListBuilder_.getCount();
         }

         public SacrificeRecordData getRecordList(int index) {
            return this.recordListBuilder_ == null ? (SacrificeRecordData)this.recordList_.get(index) : (SacrificeRecordData)this.recordListBuilder_.getMessage(index);
         }

         public Builder setRecordList(int index, SacrificeRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.set(index, value);
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecordList(int index, SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(SacrificeRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.add(value);
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecordList(int index, SacrificeRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.add(index, value);
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecordList(SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(int index, SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordList(Iterable<? extends SacrificeRecordData> values) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recordList_);
               this.onChanged();
            } else {
               this.recordListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecordList() {
            if (this.recordListBuilder_ == null) {
               this.recordList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.recordListBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecordList(int index) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.remove(index);
               this.onChanged();
            } else {
               this.recordListBuilder_.remove(index);
            }

            return this;
         }

         public SacrificeRecordData.Builder getRecordListBuilder(int index) {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().getBuilder(index);
         }

         public SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index) {
            return this.recordListBuilder_ == null ? (SacrificeRecordDataOrBuilder)this.recordList_.get(index) : (SacrificeRecordDataOrBuilder)this.recordListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList() {
            return this.recordListBuilder_ != null ? this.recordListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordList_);
         }

         public SacrificeRecordData.Builder addRecordListBuilder() {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(WarNorthMsg.SacrificeRecordData.getDefaultInstance());
         }

         public SacrificeRecordData.Builder addRecordListBuilder(int index) {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(index, WarNorthMsg.SacrificeRecordData.getDefaultInstance());
         }

         public List<SacrificeRecordData.Builder> getRecordListBuilderList() {
            return this.getRecordListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SacrificeRecordData, SacrificeRecordData.Builder, SacrificeRecordDataOrBuilder> getRecordListFieldBuilder() {
            if (this.recordListBuilder_ == null) {
               this.recordListBuilder_ = new RepeatedFieldBuilderV3(this.recordList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.recordList_ = null;
            }

            return this.recordListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarNorthBuyChallengeCount_11021 extends GeneratedMessageV3 implements C2S_WarNorthBuyChallengeCount_11021OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarNorthBuyChallengeCount_11021 DEFAULT_INSTANCE = new C2S_WarNorthBuyChallengeCount_11021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarNorthBuyChallengeCount_11021> PARSER = new AbstractParser<C2S_WarNorthBuyChallengeCount_11021>() {
         public C2S_WarNorthBuyChallengeCount_11021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarNorthBuyChallengeCount_11021(input, extensionRegistry);
         }
      };

      private C2S_WarNorthBuyChallengeCount_11021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarNorthBuyChallengeCount_11021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarNorthBuyChallengeCount_11021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarNorthBuyChallengeCount_11021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthBuyChallengeCount_11021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthBuyChallengeCount_11021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthBuyChallengeCount_11021.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarNorthBuyChallengeCount_11021)) {
            return super.equals(obj);
         } else {
            C2S_WarNorthBuyChallengeCount_11021 other = (C2S_WarNorthBuyChallengeCount_11021)obj;
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

      public static C2S_WarNorthBuyChallengeCount_11021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthBuyChallengeCount_11021)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthBuyChallengeCount_11021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthBuyChallengeCount_11021)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthBuyChallengeCount_11021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarNorthBuyChallengeCount_11021)PARSER.parseFrom(data);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarNorthBuyChallengeCount_11021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseFrom(InputStream input) throws IOException {
         return (C2S_WarNorthBuyChallengeCount_11021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthBuyChallengeCount_11021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarNorthBuyChallengeCount_11021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthBuyChallengeCount_11021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarNorthBuyChallengeCount_11021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarNorthBuyChallengeCount_11021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarNorthBuyChallengeCount_11021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarNorthBuyChallengeCount_11021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarNorthBuyChallengeCount_11021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarNorthBuyChallengeCount_11021> parser() {
         return PARSER;
      }

      public Parser<C2S_WarNorthBuyChallengeCount_11021> getParserForType() {
         return PARSER;
      }

      public C2S_WarNorthBuyChallengeCount_11021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarNorthBuyChallengeCount_11021OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthBuyChallengeCount_11021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthBuyChallengeCount_11021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarNorthBuyChallengeCount_11021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.C2S_WarNorthBuyChallengeCount_11021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_C2S_WarNorthBuyChallengeCount_11021_descriptor;
         }

         public C2S_WarNorthBuyChallengeCount_11021 getDefaultInstanceForType() {
            return WarNorthMsg.C2S_WarNorthBuyChallengeCount_11021.getDefaultInstance();
         }

         public C2S_WarNorthBuyChallengeCount_11021 build() {
            C2S_WarNorthBuyChallengeCount_11021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarNorthBuyChallengeCount_11021 buildPartial() {
            C2S_WarNorthBuyChallengeCount_11021 result = new C2S_WarNorthBuyChallengeCount_11021(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarNorthBuyChallengeCount_11021) {
               return this.mergeFrom((C2S_WarNorthBuyChallengeCount_11021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarNorthBuyChallengeCount_11021 other) {
            if (other == WarNorthMsg.C2S_WarNorthBuyChallengeCount_11021.getDefaultInstance()) {
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
            C2S_WarNorthBuyChallengeCount_11021 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarNorthBuyChallengeCount_11021)WarNorthMsg.C2S_WarNorthBuyChallengeCount_11021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarNorthBuyChallengeCount_11021)e.getUnfinishedMessage();
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

   public static final class S2C_WarNorthBuyChallengeCount_11022 extends GeneratedMessageV3 implements S2C_WarNorthBuyChallengeCount_11022OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYCOUNT_FIELD_NUMBER = 1;
      private int buyCount_;
      private byte memoizedIsInitialized;
      private static final S2C_WarNorthBuyChallengeCount_11022 DEFAULT_INSTANCE = new S2C_WarNorthBuyChallengeCount_11022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarNorthBuyChallengeCount_11022> PARSER = new AbstractParser<S2C_WarNorthBuyChallengeCount_11022>() {
         public S2C_WarNorthBuyChallengeCount_11022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarNorthBuyChallengeCount_11022(input, extensionRegistry);
         }
      };

      private S2C_WarNorthBuyChallengeCount_11022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarNorthBuyChallengeCount_11022() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarNorthBuyChallengeCount_11022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarNorthBuyChallengeCount_11022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyCount_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthBuyChallengeCount_11022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthBuyChallengeCount_11022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthBuyChallengeCount_11022.class, Builder.class);
      }

      public boolean hasBuyCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyCount() {
         return this.buyCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarNorthBuyChallengeCount_11022)) {
            return super.equals(obj);
         } else {
            S2C_WarNorthBuyChallengeCount_11022 other = (S2C_WarNorthBuyChallengeCount_11022)obj;
            if (this.hasBuyCount() != other.hasBuyCount()) {
               return false;
            } else if (this.hasBuyCount() && this.getBuyCount() != other.getBuyCount()) {
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
            if (this.hasBuyCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthBuyChallengeCount_11022)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthBuyChallengeCount_11022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthBuyChallengeCount_11022)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthBuyChallengeCount_11022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarNorthBuyChallengeCount_11022)PARSER.parseFrom(data);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarNorthBuyChallengeCount_11022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseFrom(InputStream input) throws IOException {
         return (S2C_WarNorthBuyChallengeCount_11022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthBuyChallengeCount_11022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarNorthBuyChallengeCount_11022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthBuyChallengeCount_11022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarNorthBuyChallengeCount_11022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarNorthBuyChallengeCount_11022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarNorthBuyChallengeCount_11022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarNorthBuyChallengeCount_11022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarNorthBuyChallengeCount_11022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarNorthBuyChallengeCount_11022> parser() {
         return PARSER;
      }

      public Parser<S2C_WarNorthBuyChallengeCount_11022> getParserForType() {
         return PARSER;
      }

      public S2C_WarNorthBuyChallengeCount_11022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarNorthBuyChallengeCount_11022OrBuilder {
         private int bitField0_;
         private int buyCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthBuyChallengeCount_11022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthBuyChallengeCount_11022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarNorthBuyChallengeCount_11022.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarNorthMsg.S2C_WarNorthBuyChallengeCount_11022.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyCount_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarNorthMsg.internal_static_warNorth_com_gzbz_protobuf_S2C_WarNorthBuyChallengeCount_11022_descriptor;
         }

         public S2C_WarNorthBuyChallengeCount_11022 getDefaultInstanceForType() {
            return WarNorthMsg.S2C_WarNorthBuyChallengeCount_11022.getDefaultInstance();
         }

         public S2C_WarNorthBuyChallengeCount_11022 build() {
            S2C_WarNorthBuyChallengeCount_11022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarNorthBuyChallengeCount_11022 buildPartial() {
            S2C_WarNorthBuyChallengeCount_11022 result = new S2C_WarNorthBuyChallengeCount_11022(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyCount_ = this.buyCount_;
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
            if (other instanceof S2C_WarNorthBuyChallengeCount_11022) {
               return this.mergeFrom((S2C_WarNorthBuyChallengeCount_11022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarNorthBuyChallengeCount_11022 other) {
            if (other == WarNorthMsg.S2C_WarNorthBuyChallengeCount_11022.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyCount()) {
                  this.setBuyCount(other.getBuyCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyCount();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarNorthBuyChallengeCount_11022 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarNorthBuyChallengeCount_11022)WarNorthMsg.S2C_WarNorthBuyChallengeCount_11022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarNorthBuyChallengeCount_11022)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyCount() {
            return this.buyCount_;
         }

         public Builder setBuyCount(int value) {
            this.bitField0_ |= 1;
            this.buyCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyCount() {
            this.bitField0_ &= -2;
            this.buyCount_ = 0;
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

   public interface C2S_WarNorthBuyChallengeCount_11021OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarNorthDoSacrifice_11013OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_WarNorthMainInfo_11001OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarNorthSacrificeBoxReward_11015OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_WarNorthSacrificeInfo_11011OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarNorthSacrificeRecordList_11017OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_WarNorthSectionBoxReward_11009OrBuilder extends MessageOrBuilder {
      boolean hasSection();

      int getSection();

      boolean hasBox();

      int getBox();
   }

   public interface C2S_WarNorthSectionInfo_11005OrBuilder extends MessageOrBuilder {
      boolean hasSection();

      int getSection();
   }

   public interface C2S_WarNorthSectionTargetReward_11003OrBuilder extends MessageOrBuilder {
      boolean hasTarget();

      int getTarget();
   }

   public interface CopyDataOrBuilder extends MessageOrBuilder {
      boolean hasCopyId();

      int getCopyId();

      List<Integer> getSatisfiedConditionsList();

      int getSatisfiedConditionsCount();

      int getSatisfiedConditions(int index);

      boolean hasPower();

      long getPower();
   }

   public interface S2C_WarNorthBuyChallengeCount_11022OrBuilder extends MessageOrBuilder {
      boolean hasBuyCount();

      int getBuyCount();
   }

   public interface S2C_WarNorthCopyInfo_11008OrBuilder extends MessageOrBuilder {
      boolean hasCopy();

      CopyData getCopy();

      CopyDataOrBuilder getCopyOrBuilder();
   }

   public interface S2C_WarNorthDoSacrifice_11014OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasSacrificeCount();

      int getSacrificeCount();

      boolean hasDailySacrificeCount();

      int getDailySacrificeCount();
   }

   public interface S2C_WarNorthMainInfo_11002OrBuilder extends MessageOrBuilder {
      List<SectionData> getSectionListList();

      SectionData getSectionList(int index);

      int getSectionListCount();

      List<? extends SectionDataOrBuilder> getSectionListOrBuilderList();

      SectionDataOrBuilder getSectionListOrBuilder(int index);

      boolean hasChallengeCount();

      int getChallengeCount();

      boolean hasBuyCount();

      int getBuyCount();
   }

   public interface S2C_WarNorthSacrificeBoxReward_11016OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasSacrificePoint();

      int getSacrificePoint();
   }

   public interface S2C_WarNorthSacrificeInfo_11012OrBuilder extends MessageOrBuilder {
      boolean hasSacrificeCount();

      int getSacrificeCount();

      boolean hasSacrificePoint();

      int getSacrificePoint();

      List<Integer> getGotBoxesList();

      int getGotBoxesCount();

      int getGotBoxes(int index);

      boolean hasSacrificeFreeCount();

      int getSacrificeFreeCount();

      boolean hasDailySacrificeCount();

      int getDailySacrificeCount();
   }

   public interface S2C_WarNorthSacrificeRecordList_11018OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<SacrificeRecordData> getRecordListList();

      SacrificeRecordData getRecordList(int index);

      int getRecordListCount();

      List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList();

      SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index);
   }

   public interface S2C_WarNorthSacrificeRecord_11020OrBuilder extends MessageOrBuilder {
      List<SacrificeRecordData> getRecordListList();

      SacrificeRecordData getRecordList(int index);

      int getRecordListCount();

      List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList();

      SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index);
   }

   public interface S2C_WarNorthSectionBoxReward_11010OrBuilder extends MessageOrBuilder {
      boolean hasSection();

      int getSection();

      boolean hasBox();

      int getBox();
   }

   public interface S2C_WarNorthSectionInfo_11006OrBuilder extends MessageOrBuilder {
      boolean hasSection();

      int getSection();

      List<CopyData> getCopiesList();

      CopyData getCopies(int index);

      int getCopiesCount();

      List<? extends CopyDataOrBuilder> getCopiesOrBuilderList();

      CopyDataOrBuilder getCopiesOrBuilder(int index);
   }

   public interface S2C_WarNorthSectionTargetReward_11004OrBuilder extends MessageOrBuilder {
      boolean hasTarget();

      int getTarget();
   }

   public interface SacrificeRecordDataOrBuilder extends MessageOrBuilder {
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

   public interface SectionDataOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasStar();

      int getStar();

      List<Integer> getGotRewardIdsList();

      int getGotRewardIdsCount();

      int getGotRewardIds(int index);
   }
}
