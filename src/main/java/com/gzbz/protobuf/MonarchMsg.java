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

public final class MonarchMsg {
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_MonarchItem_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_MonarchItem_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_MonarchInfo_9001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_MonarchInfo_9001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_MonarchInfo_9002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_MonarchInfo_9002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_MonarchChangeInfo_9003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_MonarchChangeInfo_9003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_MonarchChangeInfo_9004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_MonarchChangeInfo_9004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_MonarchAcquire_9006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_MonarchAcquire_9006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_AlterRoleName_9007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_AlterRoleName_9007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_AlterRoleName_9008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_AlterRoleName_9008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_AlterProvince_9009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_AlterProvince_9009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_BugFeedback_9011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_BugFeedback_9011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_ActivationMonarch_9012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_ActivationMonarch_9012_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_ActivationMonarch_9013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_ActivationMonarch_9013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressPrestige_9014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressPrestige_9014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressPrestige_9015_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressPrestige_9015_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_WearSecondTitle_9016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_WearSecondTitle_9016_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_WearSecondTitle_9017_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_WearSecondTitle_9017_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressSecondTitle_9018_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressSecondTitle_9018_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressSecondTitle_9019_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressSecondTitle_9019_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_NotifyHead_9020_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_NotifyHead_9020_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeTaskList_9021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeTaskList_9021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeTaskList_9022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeTaskList_9022_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_NativeHead_9023_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_NativeHead_9023_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_NativeHead_9024_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_NativeHead_9024_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeUpLv_9025_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeUpLv_9025_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeUpLv_9026_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeUpLv_9026_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_C2S_HideTrendHead_9027_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_C2S_HideTrendHead_9027_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_monarch_com_gzbz_protobuf_S2C_HideTrendHead_9028_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_monarch_com_gzbz_protobuf_S2C_HideTrendHead_9028_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private MonarchMsg() {
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
      String[] descriptorData = new String[]{"\n\rMonarch.proto\u0012\u0019monarch.com.gzbz.protobuf\u001a\fcommon.proto\"s\n\u000bMonarchItem\u0012\u000b\n\u0003idx\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bacquireTime\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tagingTime\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005ifUse\u0018\u0004 \u0002(\b\u0012\u0012\n\nprestigeLv\u0018\u0005 \u0001(\u0005\u0012\f\n\u0004name\u0018\u0006 \u0001(\t\"(\n\u0014C2S_MonarchInfo_9001\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"ë\u0001\n\u0014S2C_MonarchInfo_9002\u0012\u0011\n\talterName\u0018\u0001 \u0002(\u0005\u0012:\n\nheadFrames\u0018\u0002 \u0003(\u000b2&.monarch.com.gzbz.protobuf.MonarchItem\u00129\n\tprestiges\u0018\u0003 \u0003(\u000b2&.monarch.com.gzbz.protobuf.MonarchItem\u0012\u000f\n\u0007skinIds\u0018\u0004 \u0003(\u0005\u0012\r\n\u0005heads\u0018\u0005 \u0003(\u0005\u0012\u0012\n\ntrendHeads\u0018\u0006 \u0003(\u0005\u0012\u0015\n\rshowTrendHead\u0018\u0007 \u0003(\u0005\"B\n\u001aC2S_MonarchChangeInfo_9003\u0012\u0010\n\bchangeId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nchangeType\u0018\u0002 \u0002(\u0005\"L\n\u001aS2C_MonarchChangeInfo_9004\u0012\u000b\n\u0003idx\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nchangeType\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005oldId\u0018\u0003 \u0002(\u0005\"j\n\u0017S2C_MonarchAcquire_9006\u0012\u000b\n\u0003idx\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\u00124\n\u0004item\u0018\u0004 \u0002(\u000b2&.monarch.com.gzbz.protobuf.MonarchItem\"*\n\u0016C2S_AlterRoleName_9007\u0012\u0010\n\broleName\u0018\u0001 \u0002(\t\".\n\u0016S2C_AlterRoleName_9008\u0012\u0014\n\falterNameNum\u0018\u0001 \u0002(\u0005\"<\n\u0016C2S_AlterProvince_9009\u0012\u0012\n\nprovinceId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006cityId\u0018\u0002 \u0002(\u0005\"6\n\u0014C2S_BugFeedback_9011\u0012\r\n\u0005title\u0018\u0001 \u0002(\t\u0012\u000f\n\u0007message\u0018\u0002 \u0002(\t\"6\n\u001aC2S_ActivationMonarch_9012\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\"T\n\u001aS2C_ActivationMonarch_9013\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006result\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0004 \u0002(\u0005\"\u001d\n\u001bC2S_UnderDressPrestige_9014\"-\n\u001bS2C_UnderDressPrestige_9015\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"&\n\u0018C2S_WearSecondTitle_9016\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"*\n\u0018S2C_WearSecondTitle_9017\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\" \n\u001eC2S_UnderDressSecondTitle_9018\"0\n\u001eS2C_UnderDressSecondTitle_9019\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"/\n\u0013S2C_NotifyHead_9020\u0012\n\n\u0002id\u0018\u0001 \u0003(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\"\u001b\n\u0019C2S_PrestigeTaskList_9021\";\n\u0019S2C_PrestigeTaskList_9022\u0012\u001e\n\btaskList\u0018\u0001 \u0003(\u000b2\f.common.Task\"(\n\u0013C2S_NativeHead_9023\u0012\u0011\n\ttimeStamp\u0018\u0001 \u0002(\u0005\"(\n\u0013S2C_NativeHead_9024\u0012\u0011\n\ttimeStamp\u0018\u0001 \u0002(\u0005\")\n\u0015C2S_PrestigeUpLv_9025\u0012\u0010\n\bitemCode\u0018\u0001 \u0002(\u0005\"Q\n\u0015S2C_PrestigeUpLv_9026\u00128\n\bprestige\u0018\u0001 \u0002(\u000b2&.monarch.com.gzbz.protobuf.MonarchItem\"?\n\u0016C2S_HideTrendHead_9027\u0012\u0015\n\rhideTrendHead\u0018\u0001 \u0002(\b\u0012\u000e\n\u0006headId\u0018\u0002 \u0002(\u0005\"/\n\u0016S2C_HideTrendHead_9028\u0012\u0015\n\rshowTrendHead\u0018\u0007 \u0003(\u0005B!\n\u0011com.gzbz.protobufB\nMonarchMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_monarch_com_gzbz_protobuf_MonarchItem_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_monarch_com_gzbz_protobuf_MonarchItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_MonarchItem_descriptor, new String[]{"Idx", "AcquireTime", "AgingTime", "IfUse", "PrestigeLv", "Name"});
      internal_static_monarch_com_gzbz_protobuf_C2S_MonarchInfo_9001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_monarch_com_gzbz_protobuf_C2S_MonarchInfo_9001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_MonarchInfo_9001_descriptor, new String[]{"PlayerId"});
      internal_static_monarch_com_gzbz_protobuf_S2C_MonarchInfo_9002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_monarch_com_gzbz_protobuf_S2C_MonarchInfo_9002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_MonarchInfo_9002_descriptor, new String[]{"AlterName", "HeadFrames", "Prestiges", "SkinIds", "Heads", "TrendHeads", "ShowTrendHead"});
      internal_static_monarch_com_gzbz_protobuf_C2S_MonarchChangeInfo_9003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_monarch_com_gzbz_protobuf_C2S_MonarchChangeInfo_9003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_MonarchChangeInfo_9003_descriptor, new String[]{"ChangeId", "ChangeType"});
      internal_static_monarch_com_gzbz_protobuf_S2C_MonarchChangeInfo_9004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_monarch_com_gzbz_protobuf_S2C_MonarchChangeInfo_9004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_MonarchChangeInfo_9004_descriptor, new String[]{"Idx", "ChangeType", "OldId"});
      internal_static_monarch_com_gzbz_protobuf_S2C_MonarchAcquire_9006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_monarch_com_gzbz_protobuf_S2C_MonarchAcquire_9006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_MonarchAcquire_9006_descriptor, new String[]{"Idx", "Type", "Item"});
      internal_static_monarch_com_gzbz_protobuf_C2S_AlterRoleName_9007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_monarch_com_gzbz_protobuf_C2S_AlterRoleName_9007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_AlterRoleName_9007_descriptor, new String[]{"RoleName"});
      internal_static_monarch_com_gzbz_protobuf_S2C_AlterRoleName_9008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_monarch_com_gzbz_protobuf_S2C_AlterRoleName_9008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_AlterRoleName_9008_descriptor, new String[]{"AlterNameNum"});
      internal_static_monarch_com_gzbz_protobuf_C2S_AlterProvince_9009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_monarch_com_gzbz_protobuf_C2S_AlterProvince_9009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_AlterProvince_9009_descriptor, new String[]{"ProvinceId", "CityId"});
      internal_static_monarch_com_gzbz_protobuf_C2S_BugFeedback_9011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_monarch_com_gzbz_protobuf_C2S_BugFeedback_9011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_BugFeedback_9011_descriptor, new String[]{"Title", "Message"});
      internal_static_monarch_com_gzbz_protobuf_C2S_ActivationMonarch_9012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_monarch_com_gzbz_protobuf_C2S_ActivationMonarch_9012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_ActivationMonarch_9012_descriptor, new String[]{"Type", "Id"});
      internal_static_monarch_com_gzbz_protobuf_S2C_ActivationMonarch_9013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_monarch_com_gzbz_protobuf_S2C_ActivationMonarch_9013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_ActivationMonarch_9013_descriptor, new String[]{"Type", "Id", "Result", "Time"});
      internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressPrestige_9014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressPrestige_9014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressPrestige_9014_descriptor, new String[0]);
      internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressPrestige_9015_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressPrestige_9015_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressPrestige_9015_descriptor, new String[]{"Result"});
      internal_static_monarch_com_gzbz_protobuf_C2S_WearSecondTitle_9016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_monarch_com_gzbz_protobuf_C2S_WearSecondTitle_9016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_WearSecondTitle_9016_descriptor, new String[]{"Id"});
      internal_static_monarch_com_gzbz_protobuf_S2C_WearSecondTitle_9017_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_monarch_com_gzbz_protobuf_S2C_WearSecondTitle_9017_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_WearSecondTitle_9017_descriptor, new String[]{"Result"});
      internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressSecondTitle_9018_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressSecondTitle_9018_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressSecondTitle_9018_descriptor, new String[0]);
      internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressSecondTitle_9019_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressSecondTitle_9019_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressSecondTitle_9019_descriptor, new String[]{"Result"});
      internal_static_monarch_com_gzbz_protobuf_S2C_NotifyHead_9020_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_monarch_com_gzbz_protobuf_S2C_NotifyHead_9020_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_NotifyHead_9020_descriptor, new String[]{"Id", "Type"});
      internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeTaskList_9021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeTaskList_9021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeTaskList_9021_descriptor, new String[0]);
      internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeTaskList_9022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeTaskList_9022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeTaskList_9022_descriptor, new String[]{"TaskList"});
      internal_static_monarch_com_gzbz_protobuf_C2S_NativeHead_9023_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_monarch_com_gzbz_protobuf_C2S_NativeHead_9023_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_NativeHead_9023_descriptor, new String[]{"TimeStamp"});
      internal_static_monarch_com_gzbz_protobuf_S2C_NativeHead_9024_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_monarch_com_gzbz_protobuf_S2C_NativeHead_9024_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_NativeHead_9024_descriptor, new String[]{"TimeStamp"});
      internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeUpLv_9025_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeUpLv_9025_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeUpLv_9025_descriptor, new String[]{"ItemCode"});
      internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeUpLv_9026_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeUpLv_9026_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeUpLv_9026_descriptor, new String[]{"Prestige"});
      internal_static_monarch_com_gzbz_protobuf_C2S_HideTrendHead_9027_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_monarch_com_gzbz_protobuf_C2S_HideTrendHead_9027_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_C2S_HideTrendHead_9027_descriptor, new String[]{"HideTrendHead", "HeadId"});
      internal_static_monarch_com_gzbz_protobuf_S2C_HideTrendHead_9028_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_monarch_com_gzbz_protobuf_S2C_HideTrendHead_9028_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_monarch_com_gzbz_protobuf_S2C_HideTrendHead_9028_descriptor, new String[]{"ShowTrendHead"});
      CommonMsg.getDescriptor();
   }

   public static final class MonarchItem extends GeneratedMessageV3 implements MonarchItemOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDX_FIELD_NUMBER = 1;
      private int idx_;
      public static final int ACQUIRETIME_FIELD_NUMBER = 2;
      private int acquireTime_;
      public static final int AGINGTIME_FIELD_NUMBER = 3;
      private int agingTime_;
      public static final int IFUSE_FIELD_NUMBER = 4;
      private boolean ifUse_;
      public static final int PRESTIGELV_FIELD_NUMBER = 5;
      private int prestigeLv_;
      public static final int NAME_FIELD_NUMBER = 6;
      private volatile Object name_;
      private byte memoizedIsInitialized;
      private static final MonarchItem DEFAULT_INSTANCE = new MonarchItem();
      /** @deprecated */
      @Deprecated
      public static final Parser<MonarchItem> PARSER = new AbstractParser<MonarchItem>() {
         public MonarchItem parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MonarchItem(input, extensionRegistry);
         }
      };

      private MonarchItem(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MonarchItem() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new MonarchItem();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MonarchItem(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.idx_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.acquireTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.agingTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.ifUse_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.prestigeLv_ = input.readInt32();
                        break;
                     case 50:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 32;
                        this.name_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_MonarchItem_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_MonarchItem_fieldAccessorTable.ensureFieldAccessorsInitialized(MonarchItem.class, Builder.class);
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public boolean hasAcquireTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAcquireTime() {
         return this.acquireTime_;
      }

      public boolean hasAgingTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAgingTime() {
         return this.agingTime_;
      }

      public boolean hasIfUse() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIfUse() {
         return this.ifUse_;
      }

      public boolean hasPrestigeLv() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getPrestigeLv() {
         return this.prestigeLv_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 32) != 0;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAcquireTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAgingTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIfUse()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.idx_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.acquireTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.agingTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.ifUse_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.prestigeLv_);
         }

         if ((this.bitField0_ & 32) != 0) {
            GeneratedMessageV3.writeString(output, 6, this.name_);
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
               size += CodedOutputStream.computeInt32Size(1, this.idx_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.acquireTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.agingTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.ifUse_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.prestigeLv_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += GeneratedMessageV3.computeStringSize(6, this.name_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MonarchItem)) {
            return super.equals(obj);
         } else {
            MonarchItem other = (MonarchItem)obj;
            if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
               return false;
            } else if (this.hasAcquireTime() != other.hasAcquireTime()) {
               return false;
            } else if (this.hasAcquireTime() && this.getAcquireTime() != other.getAcquireTime()) {
               return false;
            } else if (this.hasAgingTime() != other.hasAgingTime()) {
               return false;
            } else if (this.hasAgingTime() && this.getAgingTime() != other.getAgingTime()) {
               return false;
            } else if (this.hasIfUse() != other.hasIfUse()) {
               return false;
            } else if (this.hasIfUse() && this.getIfUse() != other.getIfUse()) {
               return false;
            } else if (this.hasPrestigeLv() != other.hasPrestigeLv()) {
               return false;
            } else if (this.hasPrestigeLv() && this.getPrestigeLv() != other.getPrestigeLv()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
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
            if (this.hasIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdx();
            }

            if (this.hasAcquireTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAcquireTime();
            }

            if (this.hasAgingTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAgingTime();
            }

            if (this.hasIfUse()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIfUse());
            }

            if (this.hasPrestigeLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPrestigeLv();
            }

            if (this.hasName()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MonarchItem parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MonarchItem)PARSER.parseFrom(data);
      }

      public static MonarchItem parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MonarchItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MonarchItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MonarchItem)PARSER.parseFrom(data);
      }

      public static MonarchItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MonarchItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MonarchItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MonarchItem)PARSER.parseFrom(data);
      }

      public static MonarchItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MonarchItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MonarchItem parseFrom(InputStream input) throws IOException {
         return (MonarchItem)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MonarchItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MonarchItem)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MonarchItem parseDelimitedFrom(InputStream input) throws IOException {
         return (MonarchItem)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MonarchItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MonarchItem)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MonarchItem parseFrom(CodedInputStream input) throws IOException {
         return (MonarchItem)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MonarchItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MonarchItem)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(MonarchItem prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static MonarchItem getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MonarchItem> parser() {
         return PARSER;
      }

      public Parser<MonarchItem> getParserForType() {
         return PARSER;
      }

      public MonarchItem getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MonarchItemOrBuilder {
         private int bitField0_;
         private int idx_;
         private int acquireTime_;
         private int agingTime_;
         private boolean ifUse_;
         private int prestigeLv_;
         private Object name_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_MonarchItem_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_MonarchItem_fieldAccessorTable.ensureFieldAccessorsInitialized(MonarchItem.class, Builder.class);
         }

         private Builder() {
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.MonarchItem.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = 0;
            this.bitField0_ &= -2;
            this.acquireTime_ = 0;
            this.bitField0_ &= -3;
            this.agingTime_ = 0;
            this.bitField0_ &= -5;
            this.ifUse_ = false;
            this.bitField0_ &= -9;
            this.prestigeLv_ = 0;
            this.bitField0_ &= -17;
            this.name_ = "";
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_MonarchItem_descriptor;
         }

         public MonarchItem getDefaultInstanceForType() {
            return MonarchMsg.MonarchItem.getDefaultInstance();
         }

         public MonarchItem build() {
            MonarchItem result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MonarchItem buildPartial() {
            MonarchItem result = new MonarchItem(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.idx_ = this.idx_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.acquireTime_ = this.acquireTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.agingTime_ = this.agingTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.ifUse_ = this.ifUse_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.prestigeLv_ = this.prestigeLv_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               to_bitField0_ |= 32;
            }

            result.name_ = this.name_;
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
            if (other instanceof MonarchItem) {
               return this.mergeFrom((MonarchItem)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(MonarchItem other) {
            if (other == MonarchMsg.MonarchItem.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
               }

               if (other.hasAcquireTime()) {
                  this.setAcquireTime(other.getAcquireTime());
               }

               if (other.hasAgingTime()) {
                  this.setAgingTime(other.getAgingTime());
               }

               if (other.hasIfUse()) {
                  this.setIfUse(other.getIfUse());
               }

               if (other.hasPrestigeLv()) {
                  this.setPrestigeLv(other.getPrestigeLv());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 32;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIdx()) {
               return false;
            } else if (!this.hasAcquireTime()) {
               return false;
            } else if (!this.hasAgingTime()) {
               return false;
            } else {
               return this.hasIfUse();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MonarchItem parsedMessage = null;

            try {
               parsedMessage = (MonarchItem)MonarchMsg.MonarchItem.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (MonarchItem)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 1;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -2;
            this.idx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAcquireTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAcquireTime() {
            return this.acquireTime_;
         }

         public Builder setAcquireTime(int value) {
            this.bitField0_ |= 2;
            this.acquireTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAcquireTime() {
            this.bitField0_ &= -3;
            this.acquireTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAgingTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAgingTime() {
            return this.agingTime_;
         }

         public Builder setAgingTime(int value) {
            this.bitField0_ |= 4;
            this.agingTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAgingTime() {
            this.bitField0_ &= -5;
            this.agingTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIfUse() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIfUse() {
            return this.ifUse_;
         }

         public Builder setIfUse(boolean value) {
            this.bitField0_ |= 8;
            this.ifUse_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIfUse() {
            this.bitField0_ &= -9;
            this.ifUse_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasPrestigeLv() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getPrestigeLv() {
            return this.prestigeLv_;
         }

         public Builder setPrestigeLv(int value) {
            this.bitField0_ |= 16;
            this.prestigeLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrestigeLv() {
            this.bitField0_ &= -17;
            this.prestigeLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasName() {
            return (this.bitField0_ & 32) != 0;
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
               this.bitField0_ |= 32;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -33;
            this.name_ = MonarchMsg.MonarchItem.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.name_ = value;
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

   public static final class C2S_MonarchInfo_9001 extends GeneratedMessageV3 implements C2S_MonarchInfo_9001OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_MonarchInfo_9001 DEFAULT_INSTANCE = new C2S_MonarchInfo_9001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MonarchInfo_9001> PARSER = new AbstractParser<C2S_MonarchInfo_9001>() {
         public C2S_MonarchInfo_9001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MonarchInfo_9001(input, extensionRegistry);
         }
      };

      private C2S_MonarchInfo_9001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MonarchInfo_9001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MonarchInfo_9001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MonarchInfo_9001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_MonarchInfo_9001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_MonarchInfo_9001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonarchInfo_9001.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MonarchInfo_9001)) {
            return super.equals(obj);
         } else {
            C2S_MonarchInfo_9001 other = (C2S_MonarchInfo_9001)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MonarchInfo_9001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MonarchInfo_9001)PARSER.parseFrom(data);
      }

      public static C2S_MonarchInfo_9001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonarchInfo_9001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonarchInfo_9001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MonarchInfo_9001)PARSER.parseFrom(data);
      }

      public static C2S_MonarchInfo_9001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonarchInfo_9001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonarchInfo_9001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MonarchInfo_9001)PARSER.parseFrom(data);
      }

      public static C2S_MonarchInfo_9001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonarchInfo_9001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonarchInfo_9001 parseFrom(InputStream input) throws IOException {
         return (C2S_MonarchInfo_9001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonarchInfo_9001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonarchInfo_9001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonarchInfo_9001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MonarchInfo_9001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MonarchInfo_9001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonarchInfo_9001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonarchInfo_9001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MonarchInfo_9001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonarchInfo_9001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonarchInfo_9001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MonarchInfo_9001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MonarchInfo_9001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MonarchInfo_9001> parser() {
         return PARSER;
      }

      public Parser<C2S_MonarchInfo_9001> getParserForType() {
         return PARSER;
      }

      public C2S_MonarchInfo_9001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MonarchInfo_9001OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_MonarchInfo_9001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_MonarchInfo_9001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonarchInfo_9001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_MonarchInfo_9001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_MonarchInfo_9001_descriptor;
         }

         public C2S_MonarchInfo_9001 getDefaultInstanceForType() {
            return MonarchMsg.C2S_MonarchInfo_9001.getDefaultInstance();
         }

         public C2S_MonarchInfo_9001 build() {
            C2S_MonarchInfo_9001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MonarchInfo_9001 buildPartial() {
            C2S_MonarchInfo_9001 result = new C2S_MonarchInfo_9001(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof C2S_MonarchInfo_9001) {
               return this.mergeFrom((C2S_MonarchInfo_9001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MonarchInfo_9001 other) {
            if (other == MonarchMsg.C2S_MonarchInfo_9001.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPlayerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MonarchInfo_9001 parsedMessage = null;

            try {
               parsedMessage = (C2S_MonarchInfo_9001)MonarchMsg.C2S_MonarchInfo_9001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MonarchInfo_9001)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_MonarchInfo_9002 extends GeneratedMessageV3 implements S2C_MonarchInfo_9002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ALTERNAME_FIELD_NUMBER = 1;
      private int alterName_;
      public static final int HEADFRAMES_FIELD_NUMBER = 2;
      private List<MonarchItem> headFrames_;
      public static final int PRESTIGES_FIELD_NUMBER = 3;
      private List<MonarchItem> prestiges_;
      public static final int SKINIDS_FIELD_NUMBER = 4;
      private Internal.IntList skinIds_;
      public static final int HEADS_FIELD_NUMBER = 5;
      private Internal.IntList heads_;
      public static final int TRENDHEADS_FIELD_NUMBER = 6;
      private Internal.IntList trendHeads_;
      public static final int SHOWTRENDHEAD_FIELD_NUMBER = 7;
      private Internal.IntList showTrendHead_;
      private byte memoizedIsInitialized;
      private static final S2C_MonarchInfo_9002 DEFAULT_INSTANCE = new S2C_MonarchInfo_9002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MonarchInfo_9002> PARSER = new AbstractParser<S2C_MonarchInfo_9002>() {
         public S2C_MonarchInfo_9002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MonarchInfo_9002(input, extensionRegistry);
         }
      };

      private S2C_MonarchInfo_9002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MonarchInfo_9002() {
         this.memoizedIsInitialized = -1;
         this.headFrames_ = Collections.emptyList();
         this.prestiges_ = Collections.emptyList();
         this.skinIds_ = emptyIntList();
         this.heads_ = emptyIntList();
         this.trendHeads_ = emptyIntList();
         this.showTrendHead_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MonarchInfo_9002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MonarchInfo_9002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.alterName_ = input.readInt32();
                        continue;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.headFrames_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.headFrames_.add(input.readMessage(MonarchMsg.MonarchItem.PARSER, extensionRegistry));
                        continue;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.prestiges_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.prestiges_.add(input.readMessage(MonarchMsg.MonarchItem.PARSER, extensionRegistry));
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.skinIds_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.skinIds_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.skinIds_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.heads_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.heads_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heads_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heads_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 48:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.trendHeads_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        this.trendHeads_.addInt(input.readInt32());
                        continue;
                     case 50:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 32) == 0 && input.getBytesUntilLimit() > 0) {
                           this.trendHeads_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.trendHeads_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 56:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.showTrendHead_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        this.showTrendHead_.addInt(input.readInt32());
                        continue;
                     case 58:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 64) == 0 && input.getBytesUntilLimit() > 0) {
                           this.showTrendHead_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.showTrendHead_.addInt(input.readInt32());
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
                     this.skinIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.headFrames_ = Collections.unmodifiableList(this.headFrames_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.prestiges_ = Collections.unmodifiableList(this.prestiges_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.skinIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.heads_.makeImmutable();
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.trendHeads_.makeImmutable();
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.showTrendHead_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchInfo_9002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchInfo_9002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonarchInfo_9002.class, Builder.class);
      }

      public boolean hasAlterName() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAlterName() {
         return this.alterName_;
      }

      public List<MonarchItem> getHeadFramesList() {
         return this.headFrames_;
      }

      public List<? extends MonarchItemOrBuilder> getHeadFramesOrBuilderList() {
         return this.headFrames_;
      }

      public int getHeadFramesCount() {
         return this.headFrames_.size();
      }

      public MonarchItem getHeadFrames(int index) {
         return (MonarchItem)this.headFrames_.get(index);
      }

      public MonarchItemOrBuilder getHeadFramesOrBuilder(int index) {
         return (MonarchItemOrBuilder)this.headFrames_.get(index);
      }

      public List<MonarchItem> getPrestigesList() {
         return this.prestiges_;
      }

      public List<? extends MonarchItemOrBuilder> getPrestigesOrBuilderList() {
         return this.prestiges_;
      }

      public int getPrestigesCount() {
         return this.prestiges_.size();
      }

      public MonarchItem getPrestiges(int index) {
         return (MonarchItem)this.prestiges_.get(index);
      }

      public MonarchItemOrBuilder getPrestigesOrBuilder(int index) {
         return (MonarchItemOrBuilder)this.prestiges_.get(index);
      }

      public List<Integer> getSkinIdsList() {
         return this.skinIds_;
      }

      public int getSkinIdsCount() {
         return this.skinIds_.size();
      }

      public int getSkinIds(int index) {
         return this.skinIds_.getInt(index);
      }

      public List<Integer> getHeadsList() {
         return this.heads_;
      }

      public int getHeadsCount() {
         return this.heads_.size();
      }

      public int getHeads(int index) {
         return this.heads_.getInt(index);
      }

      public List<Integer> getTrendHeadsList() {
         return this.trendHeads_;
      }

      public int getTrendHeadsCount() {
         return this.trendHeads_.size();
      }

      public int getTrendHeads(int index) {
         return this.trendHeads_.getInt(index);
      }

      public List<Integer> getShowTrendHeadList() {
         return this.showTrendHead_;
      }

      public int getShowTrendHeadCount() {
         return this.showTrendHead_.size();
      }

      public int getShowTrendHead(int index) {
         return this.showTrendHead_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAlterName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHeadFramesCount(); ++i) {
               if (!this.getHeadFrames(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getPrestigesCount(); ++i) {
               if (!this.getPrestiges(i).isInitialized()) {
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
            output.writeInt32(1, this.alterName_);
         }

         for(int i = 0; i < this.headFrames_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.headFrames_.get(i));
         }

         for(int i = 0; i < this.prestiges_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.prestiges_.get(i));
         }

         for(int i = 0; i < this.skinIds_.size(); ++i) {
            output.writeInt32(4, this.skinIds_.getInt(i));
         }

         for(int i = 0; i < this.heads_.size(); ++i) {
            output.writeInt32(5, this.heads_.getInt(i));
         }

         for(int i = 0; i < this.trendHeads_.size(); ++i) {
            output.writeInt32(6, this.trendHeads_.getInt(i));
         }

         for(int i = 0; i < this.showTrendHead_.size(); ++i) {
            output.writeInt32(7, this.showTrendHead_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.alterName_);
            }

            for(int i = 0; i < this.headFrames_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.headFrames_.get(i));
            }

            for(int i = 0; i < this.prestiges_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.prestiges_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.skinIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.skinIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSkinIdsList().size();
            dataSize = 0;

            for(int i = 0; i < this.heads_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heads_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeadsList().size();
            dataSize = 0;

            for(int i = 0; i < this.trendHeads_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.trendHeads_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTrendHeadsList().size();
            dataSize = 0;

            for(int i = 0; i < this.showTrendHead_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.showTrendHead_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getShowTrendHeadList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MonarchInfo_9002)) {
            return super.equals(obj);
         } else {
            S2C_MonarchInfo_9002 other = (S2C_MonarchInfo_9002)obj;
            if (this.hasAlterName() != other.hasAlterName()) {
               return false;
            } else if (this.hasAlterName() && this.getAlterName() != other.getAlterName()) {
               return false;
            } else if (!this.getHeadFramesList().equals(other.getHeadFramesList())) {
               return false;
            } else if (!this.getPrestigesList().equals(other.getPrestigesList())) {
               return false;
            } else if (!this.getSkinIdsList().equals(other.getSkinIdsList())) {
               return false;
            } else if (!this.getHeadsList().equals(other.getHeadsList())) {
               return false;
            } else if (!this.getTrendHeadsList().equals(other.getTrendHeadsList())) {
               return false;
            } else if (!this.getShowTrendHeadList().equals(other.getShowTrendHeadList())) {
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
            if (this.hasAlterName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAlterName();
            }

            if (this.getHeadFramesCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeadFramesList().hashCode();
            }

            if (this.getPrestigesCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPrestigesList().hashCode();
            }

            if (this.getSkinIdsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSkinIdsList().hashCode();
            }

            if (this.getHeadsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeadsList().hashCode();
            }

            if (this.getTrendHeadsCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTrendHeadsList().hashCode();
            }

            if (this.getShowTrendHeadCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getShowTrendHeadList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MonarchInfo_9002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MonarchInfo_9002)PARSER.parseFrom(data);
      }

      public static S2C_MonarchInfo_9002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonarchInfo_9002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonarchInfo_9002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MonarchInfo_9002)PARSER.parseFrom(data);
      }

      public static S2C_MonarchInfo_9002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonarchInfo_9002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonarchInfo_9002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MonarchInfo_9002)PARSER.parseFrom(data);
      }

      public static S2C_MonarchInfo_9002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonarchInfo_9002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonarchInfo_9002 parseFrom(InputStream input) throws IOException {
         return (S2C_MonarchInfo_9002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonarchInfo_9002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonarchInfo_9002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonarchInfo_9002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MonarchInfo_9002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MonarchInfo_9002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonarchInfo_9002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonarchInfo_9002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MonarchInfo_9002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonarchInfo_9002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonarchInfo_9002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MonarchInfo_9002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MonarchInfo_9002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MonarchInfo_9002> parser() {
         return PARSER;
      }

      public Parser<S2C_MonarchInfo_9002> getParserForType() {
         return PARSER;
      }

      public S2C_MonarchInfo_9002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MonarchInfo_9002OrBuilder {
         private int bitField0_;
         private int alterName_;
         private List<MonarchItem> headFrames_;
         private RepeatedFieldBuilderV3<MonarchItem, MonarchItem.Builder, MonarchItemOrBuilder> headFramesBuilder_;
         private List<MonarchItem> prestiges_;
         private RepeatedFieldBuilderV3<MonarchItem, MonarchItem.Builder, MonarchItemOrBuilder> prestigesBuilder_;
         private Internal.IntList skinIds_;
         private Internal.IntList heads_;
         private Internal.IntList trendHeads_;
         private Internal.IntList showTrendHead_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchInfo_9002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchInfo_9002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonarchInfo_9002.class, Builder.class);
         }

         private Builder() {
            this.headFrames_ = Collections.emptyList();
            this.prestiges_ = Collections.emptyList();
            this.skinIds_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.heads_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.trendHeads_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.showTrendHead_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.headFrames_ = Collections.emptyList();
            this.prestiges_ = Collections.emptyList();
            this.skinIds_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.heads_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.trendHeads_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.showTrendHead_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_MonarchInfo_9002.alwaysUseFieldBuilders) {
               this.getHeadFramesFieldBuilder();
               this.getPrestigesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.alterName_ = 0;
            this.bitField0_ &= -2;
            if (this.headFramesBuilder_ == null) {
               this.headFrames_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.headFramesBuilder_.clear();
            }

            if (this.prestigesBuilder_ == null) {
               this.prestiges_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.prestigesBuilder_.clear();
            }

            this.skinIds_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.bitField0_ &= -9;
            this.heads_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.bitField0_ &= -17;
            this.trendHeads_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.bitField0_ &= -33;
            this.showTrendHead_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchInfo_9002_descriptor;
         }

         public S2C_MonarchInfo_9002 getDefaultInstanceForType() {
            return MonarchMsg.S2C_MonarchInfo_9002.getDefaultInstance();
         }

         public S2C_MonarchInfo_9002 build() {
            S2C_MonarchInfo_9002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MonarchInfo_9002 buildPartial() {
            S2C_MonarchInfo_9002 result = new S2C_MonarchInfo_9002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.alterName_ = this.alterName_;
               to_bitField0_ |= 1;
            }

            if (this.headFramesBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.headFrames_ = Collections.unmodifiableList(this.headFrames_);
                  this.bitField0_ &= -3;
               }

               result.headFrames_ = this.headFrames_;
            } else {
               result.headFrames_ = this.headFramesBuilder_.build();
            }

            if (this.prestigesBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.prestiges_ = Collections.unmodifiableList(this.prestiges_);
                  this.bitField0_ &= -5;
               }

               result.prestiges_ = this.prestiges_;
            } else {
               result.prestiges_ = this.prestigesBuilder_.build();
            }

            if ((this.bitField0_ & 8) != 0) {
               this.skinIds_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.skinIds_ = this.skinIds_;
            if ((this.bitField0_ & 16) != 0) {
               this.heads_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.heads_ = this.heads_;
            if ((this.bitField0_ & 32) != 0) {
               this.trendHeads_.makeImmutable();
               this.bitField0_ &= -33;
            }

            result.trendHeads_ = this.trendHeads_;
            if ((this.bitField0_ & 64) != 0) {
               this.showTrendHead_.makeImmutable();
               this.bitField0_ &= -65;
            }

            result.showTrendHead_ = this.showTrendHead_;
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
            if (other instanceof S2C_MonarchInfo_9002) {
               return this.mergeFrom((S2C_MonarchInfo_9002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MonarchInfo_9002 other) {
            if (other == MonarchMsg.S2C_MonarchInfo_9002.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAlterName()) {
                  this.setAlterName(other.getAlterName());
               }

               if (this.headFramesBuilder_ == null) {
                  if (!other.headFrames_.isEmpty()) {
                     if (this.headFrames_.isEmpty()) {
                        this.headFrames_ = other.headFrames_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureHeadFramesIsMutable();
                        this.headFrames_.addAll(other.headFrames_);
                     }

                     this.onChanged();
                  }
               } else if (!other.headFrames_.isEmpty()) {
                  if (this.headFramesBuilder_.isEmpty()) {
                     this.headFramesBuilder_.dispose();
                     this.headFramesBuilder_ = null;
                     this.headFrames_ = other.headFrames_;
                     this.bitField0_ &= -3;
                     this.headFramesBuilder_ = MonarchMsg.S2C_MonarchInfo_9002.alwaysUseFieldBuilders ? this.getHeadFramesFieldBuilder() : null;
                  } else {
                     this.headFramesBuilder_.addAllMessages(other.headFrames_);
                  }
               }

               if (this.prestigesBuilder_ == null) {
                  if (!other.prestiges_.isEmpty()) {
                     if (this.prestiges_.isEmpty()) {
                        this.prestiges_ = other.prestiges_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensurePrestigesIsMutable();
                        this.prestiges_.addAll(other.prestiges_);
                     }

                     this.onChanged();
                  }
               } else if (!other.prestiges_.isEmpty()) {
                  if (this.prestigesBuilder_.isEmpty()) {
                     this.prestigesBuilder_.dispose();
                     this.prestigesBuilder_ = null;
                     this.prestiges_ = other.prestiges_;
                     this.bitField0_ &= -5;
                     this.prestigesBuilder_ = MonarchMsg.S2C_MonarchInfo_9002.alwaysUseFieldBuilders ? this.getPrestigesFieldBuilder() : null;
                  } else {
                     this.prestigesBuilder_.addAllMessages(other.prestiges_);
                  }
               }

               if (!other.skinIds_.isEmpty()) {
                  if (this.skinIds_.isEmpty()) {
                     this.skinIds_ = other.skinIds_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureSkinIdsIsMutable();
                     this.skinIds_.addAll(other.skinIds_);
                  }

                  this.onChanged();
               }

               if (!other.heads_.isEmpty()) {
                  if (this.heads_.isEmpty()) {
                     this.heads_ = other.heads_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureHeadsIsMutable();
                     this.heads_.addAll(other.heads_);
                  }

                  this.onChanged();
               }

               if (!other.trendHeads_.isEmpty()) {
                  if (this.trendHeads_.isEmpty()) {
                     this.trendHeads_ = other.trendHeads_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureTrendHeadsIsMutable();
                     this.trendHeads_.addAll(other.trendHeads_);
                  }

                  this.onChanged();
               }

               if (!other.showTrendHead_.isEmpty()) {
                  if (this.showTrendHead_.isEmpty()) {
                     this.showTrendHead_ = other.showTrendHead_;
                     this.bitField0_ &= -65;
                  } else {
                     this.ensureShowTrendHeadIsMutable();
                     this.showTrendHead_.addAll(other.showTrendHead_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasAlterName()) {
               return false;
            } else {
               for(int i = 0; i < this.getHeadFramesCount(); ++i) {
                  if (!this.getHeadFrames(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getPrestigesCount(); ++i) {
                  if (!this.getPrestiges(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MonarchInfo_9002 parsedMessage = null;

            try {
               parsedMessage = (S2C_MonarchInfo_9002)MonarchMsg.S2C_MonarchInfo_9002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MonarchInfo_9002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAlterName() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAlterName() {
            return this.alterName_;
         }

         public Builder setAlterName(int value) {
            this.bitField0_ |= 1;
            this.alterName_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAlterName() {
            this.bitField0_ &= -2;
            this.alterName_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeadFramesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.headFrames_ = new ArrayList(this.headFrames_);
               this.bitField0_ |= 2;
            }

         }

         public List<MonarchItem> getHeadFramesList() {
            return this.headFramesBuilder_ == null ? Collections.unmodifiableList(this.headFrames_) : this.headFramesBuilder_.getMessageList();
         }

         public int getHeadFramesCount() {
            return this.headFramesBuilder_ == null ? this.headFrames_.size() : this.headFramesBuilder_.getCount();
         }

         public MonarchItem getHeadFrames(int index) {
            return this.headFramesBuilder_ == null ? (MonarchItem)this.headFrames_.get(index) : (MonarchItem)this.headFramesBuilder_.getMessage(index);
         }

         public Builder setHeadFrames(int index, MonarchItem value) {
            if (this.headFramesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeadFramesIsMutable();
               this.headFrames_.set(index, value);
               this.onChanged();
            } else {
               this.headFramesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHeadFrames(int index, MonarchItem.Builder builderForValue) {
            if (this.headFramesBuilder_ == null) {
               this.ensureHeadFramesIsMutable();
               this.headFrames_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.headFramesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHeadFrames(MonarchItem value) {
            if (this.headFramesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeadFramesIsMutable();
               this.headFrames_.add(value);
               this.onChanged();
            } else {
               this.headFramesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHeadFrames(int index, MonarchItem value) {
            if (this.headFramesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeadFramesIsMutable();
               this.headFrames_.add(index, value);
               this.onChanged();
            } else {
               this.headFramesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHeadFrames(MonarchItem.Builder builderForValue) {
            if (this.headFramesBuilder_ == null) {
               this.ensureHeadFramesIsMutable();
               this.headFrames_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.headFramesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHeadFrames(int index, MonarchItem.Builder builderForValue) {
            if (this.headFramesBuilder_ == null) {
               this.ensureHeadFramesIsMutable();
               this.headFrames_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.headFramesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHeadFrames(Iterable<? extends MonarchItem> values) {
            if (this.headFramesBuilder_ == null) {
               this.ensureHeadFramesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.headFrames_);
               this.onChanged();
            } else {
               this.headFramesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHeadFrames() {
            if (this.headFramesBuilder_ == null) {
               this.headFrames_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.headFramesBuilder_.clear();
            }

            return this;
         }

         public Builder removeHeadFrames(int index) {
            if (this.headFramesBuilder_ == null) {
               this.ensureHeadFramesIsMutable();
               this.headFrames_.remove(index);
               this.onChanged();
            } else {
               this.headFramesBuilder_.remove(index);
            }

            return this;
         }

         public MonarchItem.Builder getHeadFramesBuilder(int index) {
            return (MonarchItem.Builder)this.getHeadFramesFieldBuilder().getBuilder(index);
         }

         public MonarchItemOrBuilder getHeadFramesOrBuilder(int index) {
            return this.headFramesBuilder_ == null ? (MonarchItemOrBuilder)this.headFrames_.get(index) : (MonarchItemOrBuilder)this.headFramesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MonarchItemOrBuilder> getHeadFramesOrBuilderList() {
            return this.headFramesBuilder_ != null ? this.headFramesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.headFrames_);
         }

         public MonarchItem.Builder addHeadFramesBuilder() {
            return (MonarchItem.Builder)this.getHeadFramesFieldBuilder().addBuilder(MonarchMsg.MonarchItem.getDefaultInstance());
         }

         public MonarchItem.Builder addHeadFramesBuilder(int index) {
            return (MonarchItem.Builder)this.getHeadFramesFieldBuilder().addBuilder(index, MonarchMsg.MonarchItem.getDefaultInstance());
         }

         public List<MonarchItem.Builder> getHeadFramesBuilderList() {
            return this.getHeadFramesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MonarchItem, MonarchItem.Builder, MonarchItemOrBuilder> getHeadFramesFieldBuilder() {
            if (this.headFramesBuilder_ == null) {
               this.headFramesBuilder_ = new RepeatedFieldBuilderV3(this.headFrames_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.headFrames_ = null;
            }

            return this.headFramesBuilder_;
         }

         private void ensurePrestigesIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.prestiges_ = new ArrayList(this.prestiges_);
               this.bitField0_ |= 4;
            }

         }

         public List<MonarchItem> getPrestigesList() {
            return this.prestigesBuilder_ == null ? Collections.unmodifiableList(this.prestiges_) : this.prestigesBuilder_.getMessageList();
         }

         public int getPrestigesCount() {
            return this.prestigesBuilder_ == null ? this.prestiges_.size() : this.prestigesBuilder_.getCount();
         }

         public MonarchItem getPrestiges(int index) {
            return this.prestigesBuilder_ == null ? (MonarchItem)this.prestiges_.get(index) : (MonarchItem)this.prestigesBuilder_.getMessage(index);
         }

         public Builder setPrestiges(int index, MonarchItem value) {
            if (this.prestigesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrestigesIsMutable();
               this.prestiges_.set(index, value);
               this.onChanged();
            } else {
               this.prestigesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPrestiges(int index, MonarchItem.Builder builderForValue) {
            if (this.prestigesBuilder_ == null) {
               this.ensurePrestigesIsMutable();
               this.prestiges_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prestigesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPrestiges(MonarchItem value) {
            if (this.prestigesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrestigesIsMutable();
               this.prestiges_.add(value);
               this.onChanged();
            } else {
               this.prestigesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPrestiges(int index, MonarchItem value) {
            if (this.prestigesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrestigesIsMutable();
               this.prestiges_.add(index, value);
               this.onChanged();
            } else {
               this.prestigesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPrestiges(MonarchItem.Builder builderForValue) {
            if (this.prestigesBuilder_ == null) {
               this.ensurePrestigesIsMutable();
               this.prestiges_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.prestigesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPrestiges(int index, MonarchItem.Builder builderForValue) {
            if (this.prestigesBuilder_ == null) {
               this.ensurePrestigesIsMutable();
               this.prestiges_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prestigesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPrestiges(Iterable<? extends MonarchItem> values) {
            if (this.prestigesBuilder_ == null) {
               this.ensurePrestigesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.prestiges_);
               this.onChanged();
            } else {
               this.prestigesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPrestiges() {
            if (this.prestigesBuilder_ == null) {
               this.prestiges_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.prestigesBuilder_.clear();
            }

            return this;
         }

         public Builder removePrestiges(int index) {
            if (this.prestigesBuilder_ == null) {
               this.ensurePrestigesIsMutable();
               this.prestiges_.remove(index);
               this.onChanged();
            } else {
               this.prestigesBuilder_.remove(index);
            }

            return this;
         }

         public MonarchItem.Builder getPrestigesBuilder(int index) {
            return (MonarchItem.Builder)this.getPrestigesFieldBuilder().getBuilder(index);
         }

         public MonarchItemOrBuilder getPrestigesOrBuilder(int index) {
            return this.prestigesBuilder_ == null ? (MonarchItemOrBuilder)this.prestiges_.get(index) : (MonarchItemOrBuilder)this.prestigesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MonarchItemOrBuilder> getPrestigesOrBuilderList() {
            return this.prestigesBuilder_ != null ? this.prestigesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.prestiges_);
         }

         public MonarchItem.Builder addPrestigesBuilder() {
            return (MonarchItem.Builder)this.getPrestigesFieldBuilder().addBuilder(MonarchMsg.MonarchItem.getDefaultInstance());
         }

         public MonarchItem.Builder addPrestigesBuilder(int index) {
            return (MonarchItem.Builder)this.getPrestigesFieldBuilder().addBuilder(index, MonarchMsg.MonarchItem.getDefaultInstance());
         }

         public List<MonarchItem.Builder> getPrestigesBuilderList() {
            return this.getPrestigesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MonarchItem, MonarchItem.Builder, MonarchItemOrBuilder> getPrestigesFieldBuilder() {
            if (this.prestigesBuilder_ == null) {
               this.prestigesBuilder_ = new RepeatedFieldBuilderV3(this.prestiges_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.prestiges_ = null;
            }

            return this.prestigesBuilder_;
         }

         private void ensureSkinIdsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.skinIds_ = MonarchMsg.S2C_MonarchInfo_9002.mutableCopy(this.skinIds_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getSkinIdsList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.skinIds_) : this.skinIds_);
         }

         public int getSkinIdsCount() {
            return this.skinIds_.size();
         }

         public int getSkinIds(int index) {
            return this.skinIds_.getInt(index);
         }

         public Builder setSkinIds(int index, int value) {
            this.ensureSkinIdsIsMutable();
            this.skinIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSkinIds(int value) {
            this.ensureSkinIdsIsMutable();
            this.skinIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSkinIds(Iterable<? extends Integer> values) {
            this.ensureSkinIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.skinIds_);
            this.onChanged();
            return this;
         }

         public Builder clearSkinIds() {
            this.skinIds_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureHeadsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.heads_ = MonarchMsg.S2C_MonarchInfo_9002.mutableCopy(this.heads_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getHeadsList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.heads_) : this.heads_);
         }

         public int getHeadsCount() {
            return this.heads_.size();
         }

         public int getHeads(int index) {
            return this.heads_.getInt(index);
         }

         public Builder setHeads(int index, int value) {
            this.ensureHeadsIsMutable();
            this.heads_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeads(int value) {
            this.ensureHeadsIsMutable();
            this.heads_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeads(Iterable<? extends Integer> values) {
            this.ensureHeadsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heads_);
            this.onChanged();
            return this;
         }

         public Builder clearHeads() {
            this.heads_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         private void ensureTrendHeadsIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.trendHeads_ = MonarchMsg.S2C_MonarchInfo_9002.mutableCopy(this.trendHeads_);
               this.bitField0_ |= 32;
            }

         }

         public List<Integer> getTrendHeadsList() {
            return (List<Integer>)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.trendHeads_) : this.trendHeads_);
         }

         public int getTrendHeadsCount() {
            return this.trendHeads_.size();
         }

         public int getTrendHeads(int index) {
            return this.trendHeads_.getInt(index);
         }

         public Builder setTrendHeads(int index, int value) {
            this.ensureTrendHeadsIsMutable();
            this.trendHeads_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTrendHeads(int value) {
            this.ensureTrendHeadsIsMutable();
            this.trendHeads_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTrendHeads(Iterable<? extends Integer> values) {
            this.ensureTrendHeadsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.trendHeads_);
            this.onChanged();
            return this;
         }

         public Builder clearTrendHeads() {
            this.trendHeads_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.bitField0_ &= -33;
            this.onChanged();
            return this;
         }

         private void ensureShowTrendHeadIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.showTrendHead_ = MonarchMsg.S2C_MonarchInfo_9002.mutableCopy(this.showTrendHead_);
               this.bitField0_ |= 64;
            }

         }

         public List<Integer> getShowTrendHeadList() {
            return (List<Integer>)((this.bitField0_ & 64) != 0 ? Collections.unmodifiableList(this.showTrendHead_) : this.showTrendHead_);
         }

         public int getShowTrendHeadCount() {
            return this.showTrendHead_.size();
         }

         public int getShowTrendHead(int index) {
            return this.showTrendHead_.getInt(index);
         }

         public Builder setShowTrendHead(int index, int value) {
            this.ensureShowTrendHeadIsMutable();
            this.showTrendHead_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addShowTrendHead(int value) {
            this.ensureShowTrendHeadIsMutable();
            this.showTrendHead_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllShowTrendHead(Iterable<? extends Integer> values) {
            this.ensureShowTrendHeadIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.showTrendHead_);
            this.onChanged();
            return this;
         }

         public Builder clearShowTrendHead() {
            this.showTrendHead_ = MonarchMsg.S2C_MonarchInfo_9002.emptyIntList();
            this.bitField0_ &= -65;
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

   public static final class C2S_MonarchChangeInfo_9003 extends GeneratedMessageV3 implements C2S_MonarchChangeInfo_9003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHANGEID_FIELD_NUMBER = 1;
      private int changeId_;
      public static final int CHANGETYPE_FIELD_NUMBER = 2;
      private int changeType_;
      private byte memoizedIsInitialized;
      private static final C2S_MonarchChangeInfo_9003 DEFAULT_INSTANCE = new C2S_MonarchChangeInfo_9003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MonarchChangeInfo_9003> PARSER = new AbstractParser<C2S_MonarchChangeInfo_9003>() {
         public C2S_MonarchChangeInfo_9003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MonarchChangeInfo_9003(input, extensionRegistry);
         }
      };

      private C2S_MonarchChangeInfo_9003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MonarchChangeInfo_9003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MonarchChangeInfo_9003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MonarchChangeInfo_9003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.changeId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.changeType_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_MonarchChangeInfo_9003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_MonarchChangeInfo_9003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonarchChangeInfo_9003.class, Builder.class);
      }

      public boolean hasChangeId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChangeId() {
         return this.changeId_;
      }

      public boolean hasChangeType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getChangeType() {
         return this.changeType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChangeId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChangeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.changeId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.changeType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.changeId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.changeType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MonarchChangeInfo_9003)) {
            return super.equals(obj);
         } else {
            C2S_MonarchChangeInfo_9003 other = (C2S_MonarchChangeInfo_9003)obj;
            if (this.hasChangeId() != other.hasChangeId()) {
               return false;
            } else if (this.hasChangeId() && this.getChangeId() != other.getChangeId()) {
               return false;
            } else if (this.hasChangeType() != other.hasChangeType()) {
               return false;
            } else if (this.hasChangeType() && this.getChangeType() != other.getChangeType()) {
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
            if (this.hasChangeId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChangeId();
            }

            if (this.hasChangeType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getChangeType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MonarchChangeInfo_9003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MonarchChangeInfo_9003)PARSER.parseFrom(data);
      }

      public static C2S_MonarchChangeInfo_9003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonarchChangeInfo_9003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonarchChangeInfo_9003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MonarchChangeInfo_9003)PARSER.parseFrom(data);
      }

      public static C2S_MonarchChangeInfo_9003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonarchChangeInfo_9003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonarchChangeInfo_9003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MonarchChangeInfo_9003)PARSER.parseFrom(data);
      }

      public static C2S_MonarchChangeInfo_9003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonarchChangeInfo_9003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonarchChangeInfo_9003 parseFrom(InputStream input) throws IOException {
         return (C2S_MonarchChangeInfo_9003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonarchChangeInfo_9003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonarchChangeInfo_9003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonarchChangeInfo_9003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MonarchChangeInfo_9003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MonarchChangeInfo_9003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonarchChangeInfo_9003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonarchChangeInfo_9003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MonarchChangeInfo_9003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonarchChangeInfo_9003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonarchChangeInfo_9003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MonarchChangeInfo_9003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MonarchChangeInfo_9003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MonarchChangeInfo_9003> parser() {
         return PARSER;
      }

      public Parser<C2S_MonarchChangeInfo_9003> getParserForType() {
         return PARSER;
      }

      public C2S_MonarchChangeInfo_9003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MonarchChangeInfo_9003OrBuilder {
         private int bitField0_;
         private int changeId_;
         private int changeType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_MonarchChangeInfo_9003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_MonarchChangeInfo_9003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonarchChangeInfo_9003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_MonarchChangeInfo_9003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.changeId_ = 0;
            this.bitField0_ &= -2;
            this.changeType_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_MonarchChangeInfo_9003_descriptor;
         }

         public C2S_MonarchChangeInfo_9003 getDefaultInstanceForType() {
            return MonarchMsg.C2S_MonarchChangeInfo_9003.getDefaultInstance();
         }

         public C2S_MonarchChangeInfo_9003 build() {
            C2S_MonarchChangeInfo_9003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MonarchChangeInfo_9003 buildPartial() {
            C2S_MonarchChangeInfo_9003 result = new C2S_MonarchChangeInfo_9003(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.changeId_ = this.changeId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.changeType_ = this.changeType_;
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
            if (other instanceof C2S_MonarchChangeInfo_9003) {
               return this.mergeFrom((C2S_MonarchChangeInfo_9003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MonarchChangeInfo_9003 other) {
            if (other == MonarchMsg.C2S_MonarchChangeInfo_9003.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChangeId()) {
                  this.setChangeId(other.getChangeId());
               }

               if (other.hasChangeType()) {
                  this.setChangeType(other.getChangeType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChangeId()) {
               return false;
            } else {
               return this.hasChangeType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MonarchChangeInfo_9003 parsedMessage = null;

            try {
               parsedMessage = (C2S_MonarchChangeInfo_9003)MonarchMsg.C2S_MonarchChangeInfo_9003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MonarchChangeInfo_9003)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChangeId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChangeId() {
            return this.changeId_;
         }

         public Builder setChangeId(int value) {
            this.bitField0_ |= 1;
            this.changeId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChangeId() {
            this.bitField0_ &= -2;
            this.changeId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChangeType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getChangeType() {
            return this.changeType_;
         }

         public Builder setChangeType(int value) {
            this.bitField0_ |= 2;
            this.changeType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChangeType() {
            this.bitField0_ &= -3;
            this.changeType_ = 0;
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

   public static final class S2C_MonarchChangeInfo_9004 extends GeneratedMessageV3 implements S2C_MonarchChangeInfo_9004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDX_FIELD_NUMBER = 1;
      private int idx_;
      public static final int CHANGETYPE_FIELD_NUMBER = 2;
      private int changeType_;
      public static final int OLDID_FIELD_NUMBER = 3;
      private int oldId_;
      private byte memoizedIsInitialized;
      private static final S2C_MonarchChangeInfo_9004 DEFAULT_INSTANCE = new S2C_MonarchChangeInfo_9004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MonarchChangeInfo_9004> PARSER = new AbstractParser<S2C_MonarchChangeInfo_9004>() {
         public S2C_MonarchChangeInfo_9004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MonarchChangeInfo_9004(input, extensionRegistry);
         }
      };

      private S2C_MonarchChangeInfo_9004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MonarchChangeInfo_9004() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MonarchChangeInfo_9004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MonarchChangeInfo_9004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.idx_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.changeType_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.oldId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchChangeInfo_9004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchChangeInfo_9004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonarchChangeInfo_9004.class, Builder.class);
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public boolean hasChangeType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getChangeType() {
         return this.changeType_;
      }

      public boolean hasOldId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getOldId() {
         return this.oldId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChangeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOldId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.idx_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.changeType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.oldId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.idx_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.changeType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.oldId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MonarchChangeInfo_9004)) {
            return super.equals(obj);
         } else {
            S2C_MonarchChangeInfo_9004 other = (S2C_MonarchChangeInfo_9004)obj;
            if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
               return false;
            } else if (this.hasChangeType() != other.hasChangeType()) {
               return false;
            } else if (this.hasChangeType() && this.getChangeType() != other.getChangeType()) {
               return false;
            } else if (this.hasOldId() != other.hasOldId()) {
               return false;
            } else if (this.hasOldId() && this.getOldId() != other.getOldId()) {
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
            if (this.hasIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdx();
            }

            if (this.hasChangeType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getChangeType();
            }

            if (this.hasOldId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getOldId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MonarchChangeInfo_9004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MonarchChangeInfo_9004)PARSER.parseFrom(data);
      }

      public static S2C_MonarchChangeInfo_9004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonarchChangeInfo_9004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonarchChangeInfo_9004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MonarchChangeInfo_9004)PARSER.parseFrom(data);
      }

      public static S2C_MonarchChangeInfo_9004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonarchChangeInfo_9004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonarchChangeInfo_9004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MonarchChangeInfo_9004)PARSER.parseFrom(data);
      }

      public static S2C_MonarchChangeInfo_9004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonarchChangeInfo_9004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonarchChangeInfo_9004 parseFrom(InputStream input) throws IOException {
         return (S2C_MonarchChangeInfo_9004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonarchChangeInfo_9004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonarchChangeInfo_9004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonarchChangeInfo_9004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MonarchChangeInfo_9004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MonarchChangeInfo_9004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonarchChangeInfo_9004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonarchChangeInfo_9004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MonarchChangeInfo_9004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonarchChangeInfo_9004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonarchChangeInfo_9004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MonarchChangeInfo_9004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MonarchChangeInfo_9004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MonarchChangeInfo_9004> parser() {
         return PARSER;
      }

      public Parser<S2C_MonarchChangeInfo_9004> getParserForType() {
         return PARSER;
      }

      public S2C_MonarchChangeInfo_9004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MonarchChangeInfo_9004OrBuilder {
         private int bitField0_;
         private int idx_;
         private int changeType_;
         private int oldId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchChangeInfo_9004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchChangeInfo_9004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonarchChangeInfo_9004.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_MonarchChangeInfo_9004.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = 0;
            this.bitField0_ &= -2;
            this.changeType_ = 0;
            this.bitField0_ &= -3;
            this.oldId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchChangeInfo_9004_descriptor;
         }

         public S2C_MonarchChangeInfo_9004 getDefaultInstanceForType() {
            return MonarchMsg.S2C_MonarchChangeInfo_9004.getDefaultInstance();
         }

         public S2C_MonarchChangeInfo_9004 build() {
            S2C_MonarchChangeInfo_9004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MonarchChangeInfo_9004 buildPartial() {
            S2C_MonarchChangeInfo_9004 result = new S2C_MonarchChangeInfo_9004(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.idx_ = this.idx_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.changeType_ = this.changeType_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.oldId_ = this.oldId_;
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
            if (other instanceof S2C_MonarchChangeInfo_9004) {
               return this.mergeFrom((S2C_MonarchChangeInfo_9004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MonarchChangeInfo_9004 other) {
            if (other == MonarchMsg.S2C_MonarchChangeInfo_9004.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
               }

               if (other.hasChangeType()) {
                  this.setChangeType(other.getChangeType());
               }

               if (other.hasOldId()) {
                  this.setOldId(other.getOldId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIdx()) {
               return false;
            } else if (!this.hasChangeType()) {
               return false;
            } else {
               return this.hasOldId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MonarchChangeInfo_9004 parsedMessage = null;

            try {
               parsedMessage = (S2C_MonarchChangeInfo_9004)MonarchMsg.S2C_MonarchChangeInfo_9004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MonarchChangeInfo_9004)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 1;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -2;
            this.idx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChangeType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getChangeType() {
            return this.changeType_;
         }

         public Builder setChangeType(int value) {
            this.bitField0_ |= 2;
            this.changeType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChangeType() {
            this.bitField0_ &= -3;
            this.changeType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOldId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getOldId() {
            return this.oldId_;
         }

         public Builder setOldId(int value) {
            this.bitField0_ |= 4;
            this.oldId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOldId() {
            this.bitField0_ &= -5;
            this.oldId_ = 0;
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

   public static final class S2C_MonarchAcquire_9006 extends GeneratedMessageV3 implements S2C_MonarchAcquire_9006OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDX_FIELD_NUMBER = 1;
      private int idx_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int ITEM_FIELD_NUMBER = 4;
      private MonarchItem item_;
      private byte memoizedIsInitialized;
      private static final S2C_MonarchAcquire_9006 DEFAULT_INSTANCE = new S2C_MonarchAcquire_9006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MonarchAcquire_9006> PARSER = new AbstractParser<S2C_MonarchAcquire_9006>() {
         public S2C_MonarchAcquire_9006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MonarchAcquire_9006(input, extensionRegistry);
         }
      };

      private S2C_MonarchAcquire_9006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MonarchAcquire_9006() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MonarchAcquire_9006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MonarchAcquire_9006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.idx_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.type_ = input.readInt32();
                        break;
                     case 34:
                        MonarchItem.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.item_.toBuilder();
                        }

                        this.item_ = (MonarchItem)input.readMessage(MonarchMsg.MonarchItem.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.item_);
                           this.item_ = subBuilder.buildPartial();
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchAcquire_9006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchAcquire_9006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonarchAcquire_9006.class, Builder.class);
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasItem() {
         return (this.bitField0_ & 4) != 0;
      }

      public MonarchItem getItem() {
         return this.item_ == null ? MonarchMsg.MonarchItem.getDefaultInstance() : this.item_;
      }

      public MonarchItemOrBuilder getItemOrBuilder() {
         return this.item_ == null ? MonarchMsg.MonarchItem.getDefaultInstance() : this.item_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getItem().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.idx_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getItem());
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
               size += CodedOutputStream.computeInt32Size(1, this.idx_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getItem());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MonarchAcquire_9006)) {
            return super.equals(obj);
         } else {
            S2C_MonarchAcquire_9006 other = (S2C_MonarchAcquire_9006)obj;
            if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && !this.getItem().equals(other.getItem())) {
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
            if (this.hasIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdx();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            if (this.hasItem()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getItem().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MonarchAcquire_9006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MonarchAcquire_9006)PARSER.parseFrom(data);
      }

      public static S2C_MonarchAcquire_9006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonarchAcquire_9006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonarchAcquire_9006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MonarchAcquire_9006)PARSER.parseFrom(data);
      }

      public static S2C_MonarchAcquire_9006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonarchAcquire_9006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonarchAcquire_9006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MonarchAcquire_9006)PARSER.parseFrom(data);
      }

      public static S2C_MonarchAcquire_9006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonarchAcquire_9006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonarchAcquire_9006 parseFrom(InputStream input) throws IOException {
         return (S2C_MonarchAcquire_9006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonarchAcquire_9006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonarchAcquire_9006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonarchAcquire_9006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MonarchAcquire_9006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MonarchAcquire_9006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonarchAcquire_9006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonarchAcquire_9006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MonarchAcquire_9006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonarchAcquire_9006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonarchAcquire_9006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MonarchAcquire_9006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MonarchAcquire_9006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MonarchAcquire_9006> parser() {
         return PARSER;
      }

      public Parser<S2C_MonarchAcquire_9006> getParserForType() {
         return PARSER;
      }

      public S2C_MonarchAcquire_9006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MonarchAcquire_9006OrBuilder {
         private int bitField0_;
         private int idx_;
         private int type_;
         private MonarchItem item_;
         private SingleFieldBuilderV3<MonarchItem, MonarchItem.Builder, MonarchItemOrBuilder> itemBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchAcquire_9006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchAcquire_9006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonarchAcquire_9006.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_MonarchAcquire_9006.alwaysUseFieldBuilders) {
               this.getItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            if (this.itemBuilder_ == null) {
               this.item_ = null;
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_MonarchAcquire_9006_descriptor;
         }

         public S2C_MonarchAcquire_9006 getDefaultInstanceForType() {
            return MonarchMsg.S2C_MonarchAcquire_9006.getDefaultInstance();
         }

         public S2C_MonarchAcquire_9006 build() {
            S2C_MonarchAcquire_9006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MonarchAcquire_9006 buildPartial() {
            S2C_MonarchAcquire_9006 result = new S2C_MonarchAcquire_9006(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.idx_ = this.idx_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.itemBuilder_ == null) {
                  result.item_ = this.item_;
               } else {
                  result.item_ = (MonarchItem)this.itemBuilder_.build();
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
            if (other instanceof S2C_MonarchAcquire_9006) {
               return this.mergeFrom((S2C_MonarchAcquire_9006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MonarchAcquire_9006 other) {
            if (other == MonarchMsg.S2C_MonarchAcquire_9006.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasItem()) {
                  this.mergeItem(other.getItem());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIdx()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else if (!this.hasItem()) {
               return false;
            } else {
               return this.getItem().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MonarchAcquire_9006 parsedMessage = null;

            try {
               parsedMessage = (S2C_MonarchAcquire_9006)MonarchMsg.S2C_MonarchAcquire_9006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MonarchAcquire_9006)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 1;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -2;
            this.idx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItem() {
            return (this.bitField0_ & 4) != 0;
         }

         public MonarchItem getItem() {
            if (this.itemBuilder_ == null) {
               return this.item_ == null ? MonarchMsg.MonarchItem.getDefaultInstance() : this.item_;
            } else {
               return (MonarchItem)this.itemBuilder_.getMessage();
            }
         }

         public Builder setItem(MonarchItem value) {
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

         public Builder setItem(MonarchItem.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.item_ = builderForValue.build();
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeItem(MonarchItem value) {
            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.item_ != null && this.item_ != MonarchMsg.MonarchItem.getDefaultInstance()) {
                  this.item_ = MonarchMsg.MonarchItem.newBuilder(this.item_).mergeFrom(value).buildPartial();
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

         public MonarchItem.Builder getItemBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (MonarchItem.Builder)this.getItemFieldBuilder().getBuilder();
         }

         public MonarchItemOrBuilder getItemOrBuilder() {
            if (this.itemBuilder_ != null) {
               return (MonarchItemOrBuilder)this.itemBuilder_.getMessageOrBuilder();
            } else {
               return this.item_ == null ? MonarchMsg.MonarchItem.getDefaultInstance() : this.item_;
            }
         }

         private SingleFieldBuilderV3<MonarchItem, MonarchItem.Builder, MonarchItemOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new SingleFieldBuilderV3(this.getItem(), this.getParentForChildren(), this.isClean());
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

   public static final class C2S_AlterRoleName_9007 extends GeneratedMessageV3 implements C2S_AlterRoleName_9007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROLENAME_FIELD_NUMBER = 1;
      private volatile Object roleName_;
      private byte memoizedIsInitialized;
      private static final C2S_AlterRoleName_9007 DEFAULT_INSTANCE = new C2S_AlterRoleName_9007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AlterRoleName_9007> PARSER = new AbstractParser<C2S_AlterRoleName_9007>() {
         public C2S_AlterRoleName_9007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AlterRoleName_9007(input, extensionRegistry);
         }
      };

      private C2S_AlterRoleName_9007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AlterRoleName_9007() {
         this.memoizedIsInitialized = -1;
         this.roleName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AlterRoleName_9007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AlterRoleName_9007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.roleName_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_AlterRoleName_9007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_AlterRoleName_9007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AlterRoleName_9007.class, Builder.class);
      }

      public boolean hasRoleName() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getRoleName() {
         Object ref = this.roleName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.roleName_ = s;
            }

            return s;
         }
      }

      public ByteString getRoleNameBytes() {
         Object ref = this.roleName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.roleName_ = b;
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
         } else if (!this.hasRoleName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.roleName_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.roleName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AlterRoleName_9007)) {
            return super.equals(obj);
         } else {
            C2S_AlterRoleName_9007 other = (C2S_AlterRoleName_9007)obj;
            if (this.hasRoleName() != other.hasRoleName()) {
               return false;
            } else if (this.hasRoleName() && !this.getRoleName().equals(other.getRoleName())) {
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
            if (this.hasRoleName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRoleName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AlterRoleName_9007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AlterRoleName_9007)PARSER.parseFrom(data);
      }

      public static C2S_AlterRoleName_9007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AlterRoleName_9007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AlterRoleName_9007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AlterRoleName_9007)PARSER.parseFrom(data);
      }

      public static C2S_AlterRoleName_9007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AlterRoleName_9007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AlterRoleName_9007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AlterRoleName_9007)PARSER.parseFrom(data);
      }

      public static C2S_AlterRoleName_9007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AlterRoleName_9007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AlterRoleName_9007 parseFrom(InputStream input) throws IOException {
         return (C2S_AlterRoleName_9007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AlterRoleName_9007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AlterRoleName_9007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AlterRoleName_9007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AlterRoleName_9007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AlterRoleName_9007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AlterRoleName_9007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AlterRoleName_9007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AlterRoleName_9007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AlterRoleName_9007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AlterRoleName_9007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AlterRoleName_9007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AlterRoleName_9007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AlterRoleName_9007> parser() {
         return PARSER;
      }

      public Parser<C2S_AlterRoleName_9007> getParserForType() {
         return PARSER;
      }

      public C2S_AlterRoleName_9007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AlterRoleName_9007OrBuilder {
         private int bitField0_;
         private Object roleName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_AlterRoleName_9007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_AlterRoleName_9007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AlterRoleName_9007.class, Builder.class);
         }

         private Builder() {
            this.roleName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.roleName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_AlterRoleName_9007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.roleName_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_AlterRoleName_9007_descriptor;
         }

         public C2S_AlterRoleName_9007 getDefaultInstanceForType() {
            return MonarchMsg.C2S_AlterRoleName_9007.getDefaultInstance();
         }

         public C2S_AlterRoleName_9007 build() {
            C2S_AlterRoleName_9007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AlterRoleName_9007 buildPartial() {
            C2S_AlterRoleName_9007 result = new C2S_AlterRoleName_9007(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.roleName_ = this.roleName_;
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
            if (other instanceof C2S_AlterRoleName_9007) {
               return this.mergeFrom((C2S_AlterRoleName_9007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AlterRoleName_9007 other) {
            if (other == MonarchMsg.C2S_AlterRoleName_9007.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRoleName()) {
                  this.bitField0_ |= 1;
                  this.roleName_ = other.roleName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRoleName();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AlterRoleName_9007 parsedMessage = null;

            try {
               parsedMessage = (C2S_AlterRoleName_9007)MonarchMsg.C2S_AlterRoleName_9007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AlterRoleName_9007)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRoleName() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getRoleName() {
            Object ref = this.roleName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.roleName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getRoleNameBytes() {
            Object ref = this.roleName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.roleName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setRoleName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.roleName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearRoleName() {
            this.bitField0_ &= -2;
            this.roleName_ = MonarchMsg.C2S_AlterRoleName_9007.getDefaultInstance().getRoleName();
            this.onChanged();
            return this;
         }

         public Builder setRoleNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.roleName_ = value;
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

   public static final class S2C_AlterRoleName_9008 extends GeneratedMessageV3 implements S2C_AlterRoleName_9008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ALTERNAMENUM_FIELD_NUMBER = 1;
      private int alterNameNum_;
      private byte memoizedIsInitialized;
      private static final S2C_AlterRoleName_9008 DEFAULT_INSTANCE = new S2C_AlterRoleName_9008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AlterRoleName_9008> PARSER = new AbstractParser<S2C_AlterRoleName_9008>() {
         public S2C_AlterRoleName_9008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AlterRoleName_9008(input, extensionRegistry);
         }
      };

      private S2C_AlterRoleName_9008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AlterRoleName_9008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AlterRoleName_9008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AlterRoleName_9008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.alterNameNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_AlterRoleName_9008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_AlterRoleName_9008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AlterRoleName_9008.class, Builder.class);
      }

      public boolean hasAlterNameNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAlterNameNum() {
         return this.alterNameNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAlterNameNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.alterNameNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.alterNameNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AlterRoleName_9008)) {
            return super.equals(obj);
         } else {
            S2C_AlterRoleName_9008 other = (S2C_AlterRoleName_9008)obj;
            if (this.hasAlterNameNum() != other.hasAlterNameNum()) {
               return false;
            } else if (this.hasAlterNameNum() && this.getAlterNameNum() != other.getAlterNameNum()) {
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
            if (this.hasAlterNameNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAlterNameNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AlterRoleName_9008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AlterRoleName_9008)PARSER.parseFrom(data);
      }

      public static S2C_AlterRoleName_9008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AlterRoleName_9008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AlterRoleName_9008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AlterRoleName_9008)PARSER.parseFrom(data);
      }

      public static S2C_AlterRoleName_9008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AlterRoleName_9008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AlterRoleName_9008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AlterRoleName_9008)PARSER.parseFrom(data);
      }

      public static S2C_AlterRoleName_9008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AlterRoleName_9008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AlterRoleName_9008 parseFrom(InputStream input) throws IOException {
         return (S2C_AlterRoleName_9008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AlterRoleName_9008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AlterRoleName_9008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AlterRoleName_9008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AlterRoleName_9008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AlterRoleName_9008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AlterRoleName_9008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AlterRoleName_9008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AlterRoleName_9008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AlterRoleName_9008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AlterRoleName_9008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AlterRoleName_9008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AlterRoleName_9008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AlterRoleName_9008> parser() {
         return PARSER;
      }

      public Parser<S2C_AlterRoleName_9008> getParserForType() {
         return PARSER;
      }

      public S2C_AlterRoleName_9008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AlterRoleName_9008OrBuilder {
         private int bitField0_;
         private int alterNameNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_AlterRoleName_9008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_AlterRoleName_9008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AlterRoleName_9008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_AlterRoleName_9008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.alterNameNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_AlterRoleName_9008_descriptor;
         }

         public S2C_AlterRoleName_9008 getDefaultInstanceForType() {
            return MonarchMsg.S2C_AlterRoleName_9008.getDefaultInstance();
         }

         public S2C_AlterRoleName_9008 build() {
            S2C_AlterRoleName_9008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AlterRoleName_9008 buildPartial() {
            S2C_AlterRoleName_9008 result = new S2C_AlterRoleName_9008(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.alterNameNum_ = this.alterNameNum_;
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
            if (other instanceof S2C_AlterRoleName_9008) {
               return this.mergeFrom((S2C_AlterRoleName_9008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AlterRoleName_9008 other) {
            if (other == MonarchMsg.S2C_AlterRoleName_9008.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAlterNameNum()) {
                  this.setAlterNameNum(other.getAlterNameNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasAlterNameNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AlterRoleName_9008 parsedMessage = null;

            try {
               parsedMessage = (S2C_AlterRoleName_9008)MonarchMsg.S2C_AlterRoleName_9008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AlterRoleName_9008)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAlterNameNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAlterNameNum() {
            return this.alterNameNum_;
         }

         public Builder setAlterNameNum(int value) {
            this.bitField0_ |= 1;
            this.alterNameNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAlterNameNum() {
            this.bitField0_ &= -2;
            this.alterNameNum_ = 0;
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

   public static final class C2S_AlterProvince_9009 extends GeneratedMessageV3 implements C2S_AlterProvince_9009OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PROVINCEID_FIELD_NUMBER = 1;
      private int provinceId_;
      public static final int CITYID_FIELD_NUMBER = 2;
      private int cityId_;
      private byte memoizedIsInitialized;
      private static final C2S_AlterProvince_9009 DEFAULT_INSTANCE = new C2S_AlterProvince_9009();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AlterProvince_9009> PARSER = new AbstractParser<C2S_AlterProvince_9009>() {
         public C2S_AlterProvince_9009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AlterProvince_9009(input, extensionRegistry);
         }
      };

      private C2S_AlterProvince_9009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AlterProvince_9009() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AlterProvince_9009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AlterProvince_9009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.provinceId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.cityId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_AlterProvince_9009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_AlterProvince_9009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AlterProvince_9009.class, Builder.class);
      }

      public boolean hasProvinceId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getProvinceId() {
         return this.provinceId_;
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasProvinceId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.provinceId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.cityId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.provinceId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.cityId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AlterProvince_9009)) {
            return super.equals(obj);
         } else {
            C2S_AlterProvince_9009 other = (C2S_AlterProvince_9009)obj;
            if (this.hasProvinceId() != other.hasProvinceId()) {
               return false;
            } else if (this.hasProvinceId() && this.getProvinceId() != other.getProvinceId()) {
               return false;
            } else if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
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
            if (this.hasProvinceId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getProvinceId();
            }

            if (this.hasCityId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCityId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AlterProvince_9009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AlterProvince_9009)PARSER.parseFrom(data);
      }

      public static C2S_AlterProvince_9009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AlterProvince_9009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AlterProvince_9009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AlterProvince_9009)PARSER.parseFrom(data);
      }

      public static C2S_AlterProvince_9009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AlterProvince_9009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AlterProvince_9009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AlterProvince_9009)PARSER.parseFrom(data);
      }

      public static C2S_AlterProvince_9009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AlterProvince_9009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AlterProvince_9009 parseFrom(InputStream input) throws IOException {
         return (C2S_AlterProvince_9009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AlterProvince_9009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AlterProvince_9009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AlterProvince_9009 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AlterProvince_9009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AlterProvince_9009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AlterProvince_9009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AlterProvince_9009 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AlterProvince_9009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AlterProvince_9009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AlterProvince_9009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AlterProvince_9009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AlterProvince_9009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AlterProvince_9009> parser() {
         return PARSER;
      }

      public Parser<C2S_AlterProvince_9009> getParserForType() {
         return PARSER;
      }

      public C2S_AlterProvince_9009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AlterProvince_9009OrBuilder {
         private int bitField0_;
         private int provinceId_;
         private int cityId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_AlterProvince_9009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_AlterProvince_9009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AlterProvince_9009.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_AlterProvince_9009.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.provinceId_ = 0;
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_AlterProvince_9009_descriptor;
         }

         public C2S_AlterProvince_9009 getDefaultInstanceForType() {
            return MonarchMsg.C2S_AlterProvince_9009.getDefaultInstance();
         }

         public C2S_AlterProvince_9009 build() {
            C2S_AlterProvince_9009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AlterProvince_9009 buildPartial() {
            C2S_AlterProvince_9009 result = new C2S_AlterProvince_9009(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.provinceId_ = this.provinceId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.cityId_ = this.cityId_;
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
            if (other instanceof C2S_AlterProvince_9009) {
               return this.mergeFrom((C2S_AlterProvince_9009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AlterProvince_9009 other) {
            if (other == MonarchMsg.C2S_AlterProvince_9009.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasProvinceId()) {
                  this.setProvinceId(other.getProvinceId());
               }

               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasProvinceId()) {
               return false;
            } else {
               return this.hasCityId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AlterProvince_9009 parsedMessage = null;

            try {
               parsedMessage = (C2S_AlterProvince_9009)MonarchMsg.C2S_AlterProvince_9009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AlterProvince_9009)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasProvinceId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getProvinceId() {
            return this.provinceId_;
         }

         public Builder setProvinceId(int value) {
            this.bitField0_ |= 1;
            this.provinceId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProvinceId() {
            this.bitField0_ &= -2;
            this.provinceId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 2;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -3;
            this.cityId_ = 0;
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

   public static final class C2S_BugFeedback_9011 extends GeneratedMessageV3 implements C2S_BugFeedback_9011OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TITLE_FIELD_NUMBER = 1;
      private volatile Object title_;
      public static final int MESSAGE_FIELD_NUMBER = 2;
      private volatile Object message_;
      private byte memoizedIsInitialized;
      private static final C2S_BugFeedback_9011 DEFAULT_INSTANCE = new C2S_BugFeedback_9011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BugFeedback_9011> PARSER = new AbstractParser<C2S_BugFeedback_9011>() {
         public C2S_BugFeedback_9011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BugFeedback_9011(input, extensionRegistry);
         }
      };

      private C2S_BugFeedback_9011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BugFeedback_9011() {
         this.memoizedIsInitialized = -1;
         this.title_ = "";
         this.message_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BugFeedback_9011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BugFeedback_9011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.title_ = bs;
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.message_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_BugFeedback_9011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_BugFeedback_9011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BugFeedback_9011.class, Builder.class);
      }

      public boolean hasTitle() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getTitle() {
         Object ref = this.title_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.title_ = s;
            }

            return s;
         }
      }

      public ByteString getTitleBytes() {
         Object ref = this.title_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.title_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasMessage() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getMessage() {
         Object ref = this.message_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.message_ = s;
            }

            return s;
         }
      }

      public ByteString getMessageBytes() {
         Object ref = this.message_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.message_ = b;
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
         } else if (!this.hasTitle()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMessage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.title_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.message_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.title_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.message_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BugFeedback_9011)) {
            return super.equals(obj);
         } else {
            C2S_BugFeedback_9011 other = (C2S_BugFeedback_9011)obj;
            if (this.hasTitle() != other.hasTitle()) {
               return false;
            } else if (this.hasTitle() && !this.getTitle().equals(other.getTitle())) {
               return false;
            } else if (this.hasMessage() != other.hasMessage()) {
               return false;
            } else if (this.hasMessage() && !this.getMessage().equals(other.getMessage())) {
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
            if (this.hasTitle()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTitle().hashCode();
            }

            if (this.hasMessage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMessage().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BugFeedback_9011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BugFeedback_9011)PARSER.parseFrom(data);
      }

      public static C2S_BugFeedback_9011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BugFeedback_9011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BugFeedback_9011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BugFeedback_9011)PARSER.parseFrom(data);
      }

      public static C2S_BugFeedback_9011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BugFeedback_9011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BugFeedback_9011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BugFeedback_9011)PARSER.parseFrom(data);
      }

      public static C2S_BugFeedback_9011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BugFeedback_9011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BugFeedback_9011 parseFrom(InputStream input) throws IOException {
         return (C2S_BugFeedback_9011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BugFeedback_9011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BugFeedback_9011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BugFeedback_9011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BugFeedback_9011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BugFeedback_9011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BugFeedback_9011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BugFeedback_9011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BugFeedback_9011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BugFeedback_9011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BugFeedback_9011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BugFeedback_9011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BugFeedback_9011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BugFeedback_9011> parser() {
         return PARSER;
      }

      public Parser<C2S_BugFeedback_9011> getParserForType() {
         return PARSER;
      }

      public C2S_BugFeedback_9011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BugFeedback_9011OrBuilder {
         private int bitField0_;
         private Object title_;
         private Object message_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_BugFeedback_9011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_BugFeedback_9011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BugFeedback_9011.class, Builder.class);
         }

         private Builder() {
            this.title_ = "";
            this.message_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.title_ = "";
            this.message_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_BugFeedback_9011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.title_ = "";
            this.bitField0_ &= -2;
            this.message_ = "";
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_BugFeedback_9011_descriptor;
         }

         public C2S_BugFeedback_9011 getDefaultInstanceForType() {
            return MonarchMsg.C2S_BugFeedback_9011.getDefaultInstance();
         }

         public C2S_BugFeedback_9011 build() {
            C2S_BugFeedback_9011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BugFeedback_9011 buildPartial() {
            C2S_BugFeedback_9011 result = new C2S_BugFeedback_9011(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.title_ = this.title_;
            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.message_ = this.message_;
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
            if (other instanceof C2S_BugFeedback_9011) {
               return this.mergeFrom((C2S_BugFeedback_9011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BugFeedback_9011 other) {
            if (other == MonarchMsg.C2S_BugFeedback_9011.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTitle()) {
                  this.bitField0_ |= 1;
                  this.title_ = other.title_;
                  this.onChanged();
               }

               if (other.hasMessage()) {
                  this.bitField0_ |= 2;
                  this.message_ = other.message_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTitle()) {
               return false;
            } else {
               return this.hasMessage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BugFeedback_9011 parsedMessage = null;

            try {
               parsedMessage = (C2S_BugFeedback_9011)MonarchMsg.C2S_BugFeedback_9011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BugFeedback_9011)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getTitle() {
            Object ref = this.title_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.title_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getTitleBytes() {
            Object ref = this.title_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.title_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setTitle(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.title_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearTitle() {
            this.bitField0_ &= -2;
            this.title_ = MonarchMsg.C2S_BugFeedback_9011.getDefaultInstance().getTitle();
            this.onChanged();
            return this;
         }

         public Builder setTitleBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.title_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasMessage() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getMessage() {
            Object ref = this.message_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.message_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getMessageBytes() {
            Object ref = this.message_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.message_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setMessage(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.message_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearMessage() {
            this.bitField0_ &= -3;
            this.message_ = MonarchMsg.C2S_BugFeedback_9011.getDefaultInstance().getMessage();
            this.onChanged();
            return this;
         }

         public Builder setMessageBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.message_ = value;
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

   public static final class C2S_ActivationMonarch_9012 extends GeneratedMessageV3 implements C2S_ActivationMonarch_9012OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ActivationMonarch_9012 DEFAULT_INSTANCE = new C2S_ActivationMonarch_9012();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivationMonarch_9012> PARSER = new AbstractParser<C2S_ActivationMonarch_9012>() {
         public C2S_ActivationMonarch_9012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivationMonarch_9012(input, extensionRegistry);
         }
      };

      private C2S_ActivationMonarch_9012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivationMonarch_9012() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivationMonarch_9012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivationMonarch_9012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_ActivationMonarch_9012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_ActivationMonarch_9012_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivationMonarch_9012.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
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
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ActivationMonarch_9012)) {
            return super.equals(obj);
         } else {
            C2S_ActivationMonarch_9012 other = (C2S_ActivationMonarch_9012)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ActivationMonarch_9012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivationMonarch_9012)PARSER.parseFrom(data);
      }

      public static C2S_ActivationMonarch_9012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivationMonarch_9012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivationMonarch_9012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivationMonarch_9012)PARSER.parseFrom(data);
      }

      public static C2S_ActivationMonarch_9012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivationMonarch_9012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivationMonarch_9012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivationMonarch_9012)PARSER.parseFrom(data);
      }

      public static C2S_ActivationMonarch_9012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivationMonarch_9012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivationMonarch_9012 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivationMonarch_9012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivationMonarch_9012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivationMonarch_9012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivationMonarch_9012 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivationMonarch_9012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivationMonarch_9012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivationMonarch_9012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivationMonarch_9012 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivationMonarch_9012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivationMonarch_9012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivationMonarch_9012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivationMonarch_9012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivationMonarch_9012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivationMonarch_9012> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivationMonarch_9012> getParserForType() {
         return PARSER;
      }

      public C2S_ActivationMonarch_9012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivationMonarch_9012OrBuilder {
         private int bitField0_;
         private int type_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_ActivationMonarch_9012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_ActivationMonarch_9012_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivationMonarch_9012.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_ActivationMonarch_9012.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_ActivationMonarch_9012_descriptor;
         }

         public C2S_ActivationMonarch_9012 getDefaultInstanceForType() {
            return MonarchMsg.C2S_ActivationMonarch_9012.getDefaultInstance();
         }

         public C2S_ActivationMonarch_9012 build() {
            C2S_ActivationMonarch_9012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivationMonarch_9012 buildPartial() {
            C2S_ActivationMonarch_9012 result = new C2S_ActivationMonarch_9012(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof C2S_ActivationMonarch_9012) {
               return this.mergeFrom((C2S_ActivationMonarch_9012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivationMonarch_9012 other) {
            if (other == MonarchMsg.C2S_ActivationMonarch_9012.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
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
               return this.hasId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ActivationMonarch_9012 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivationMonarch_9012)MonarchMsg.C2S_ActivationMonarch_9012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivationMonarch_9012)e.getUnfinishedMessage();
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

         public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 2;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -3;
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

   public static final class S2C_ActivationMonarch_9013 extends GeneratedMessageV3 implements S2C_ActivationMonarch_9013OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int RESULT_FIELD_NUMBER = 3;
      private int result_;
      public static final int TIME_FIELD_NUMBER = 4;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivationMonarch_9013 DEFAULT_INSTANCE = new S2C_ActivationMonarch_9013();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivationMonarch_9013> PARSER = new AbstractParser<S2C_ActivationMonarch_9013>() {
         public S2C_ActivationMonarch_9013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivationMonarch_9013(input, extensionRegistry);
         }
      };

      private S2C_ActivationMonarch_9013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivationMonarch_9013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivationMonarch_9013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivationMonarch_9013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.id_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.result_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_ActivationMonarch_9013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_ActivationMonarch_9013_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivationMonarch_9013.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
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
            output.writeInt32(2, this.id_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.result_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.time_);
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
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.result_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivationMonarch_9013)) {
            return super.equals(obj);
         } else {
            S2C_ActivationMonarch_9013 other = (S2C_ActivationMonarch_9013)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivationMonarch_9013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivationMonarch_9013)PARSER.parseFrom(data);
      }

      public static S2C_ActivationMonarch_9013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivationMonarch_9013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivationMonarch_9013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivationMonarch_9013)PARSER.parseFrom(data);
      }

      public static S2C_ActivationMonarch_9013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivationMonarch_9013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivationMonarch_9013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivationMonarch_9013)PARSER.parseFrom(data);
      }

      public static S2C_ActivationMonarch_9013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivationMonarch_9013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivationMonarch_9013 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivationMonarch_9013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivationMonarch_9013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivationMonarch_9013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivationMonarch_9013 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivationMonarch_9013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivationMonarch_9013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivationMonarch_9013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivationMonarch_9013 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivationMonarch_9013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivationMonarch_9013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivationMonarch_9013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivationMonarch_9013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivationMonarch_9013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivationMonarch_9013> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivationMonarch_9013> getParserForType() {
         return PARSER;
      }

      public S2C_ActivationMonarch_9013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivationMonarch_9013OrBuilder {
         private int bitField0_;
         private int type_;
         private int id_;
         private int result_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_ActivationMonarch_9013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_ActivationMonarch_9013_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivationMonarch_9013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_ActivationMonarch_9013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.bitField0_ &= -5;
            this.time_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_ActivationMonarch_9013_descriptor;
         }

         public S2C_ActivationMonarch_9013 getDefaultInstanceForType() {
            return MonarchMsg.S2C_ActivationMonarch_9013.getDefaultInstance();
         }

         public S2C_ActivationMonarch_9013 build() {
            S2C_ActivationMonarch_9013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivationMonarch_9013 buildPartial() {
            S2C_ActivationMonarch_9013 result = new S2C_ActivationMonarch_9013(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof S2C_ActivationMonarch_9013) {
               return this.mergeFrom((S2C_ActivationMonarch_9013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivationMonarch_9013 other) {
            if (other == MonarchMsg.S2C_ActivationMonarch_9013.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            if (!this.hasType()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else {
               return this.hasTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivationMonarch_9013 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivationMonarch_9013)MonarchMsg.S2C_ActivationMonarch_9013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivationMonarch_9013)e.getUnfinishedMessage();
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

         public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 2;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -3;
            this.id_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 4;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -5;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 8;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -9;
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

   public static final class C2S_UnderDressPrestige_9014 extends GeneratedMessageV3 implements C2S_UnderDressPrestige_9014OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_UnderDressPrestige_9014 DEFAULT_INSTANCE = new C2S_UnderDressPrestige_9014();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnderDressPrestige_9014> PARSER = new AbstractParser<C2S_UnderDressPrestige_9014>() {
         public C2S_UnderDressPrestige_9014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnderDressPrestige_9014(input, extensionRegistry);
         }
      };

      private C2S_UnderDressPrestige_9014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnderDressPrestige_9014() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnderDressPrestige_9014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnderDressPrestige_9014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressPrestige_9014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressPrestige_9014_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnderDressPrestige_9014.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UnderDressPrestige_9014)) {
            return super.equals(obj);
         } else {
            C2S_UnderDressPrestige_9014 other = (C2S_UnderDressPrestige_9014)obj;
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

      public static C2S_UnderDressPrestige_9014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnderDressPrestige_9014)PARSER.parseFrom(data);
      }

      public static C2S_UnderDressPrestige_9014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnderDressPrestige_9014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnderDressPrestige_9014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnderDressPrestige_9014)PARSER.parseFrom(data);
      }

      public static C2S_UnderDressPrestige_9014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnderDressPrestige_9014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnderDressPrestige_9014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnderDressPrestige_9014)PARSER.parseFrom(data);
      }

      public static C2S_UnderDressPrestige_9014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnderDressPrestige_9014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnderDressPrestige_9014 parseFrom(InputStream input) throws IOException {
         return (C2S_UnderDressPrestige_9014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnderDressPrestige_9014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnderDressPrestige_9014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnderDressPrestige_9014 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnderDressPrestige_9014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnderDressPrestige_9014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnderDressPrestige_9014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnderDressPrestige_9014 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnderDressPrestige_9014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnderDressPrestige_9014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnderDressPrestige_9014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnderDressPrestige_9014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnderDressPrestige_9014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnderDressPrestige_9014> parser() {
         return PARSER;
      }

      public Parser<C2S_UnderDressPrestige_9014> getParserForType() {
         return PARSER;
      }

      public C2S_UnderDressPrestige_9014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnderDressPrestige_9014OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressPrestige_9014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressPrestige_9014_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnderDressPrestige_9014.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_UnderDressPrestige_9014.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressPrestige_9014_descriptor;
         }

         public C2S_UnderDressPrestige_9014 getDefaultInstanceForType() {
            return MonarchMsg.C2S_UnderDressPrestige_9014.getDefaultInstance();
         }

         public C2S_UnderDressPrestige_9014 build() {
            C2S_UnderDressPrestige_9014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnderDressPrestige_9014 buildPartial() {
            C2S_UnderDressPrestige_9014 result = new C2S_UnderDressPrestige_9014(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_UnderDressPrestige_9014) {
               return this.mergeFrom((C2S_UnderDressPrestige_9014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnderDressPrestige_9014 other) {
            if (other == MonarchMsg.C2S_UnderDressPrestige_9014.getDefaultInstance()) {
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
            C2S_UnderDressPrestige_9014 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnderDressPrestige_9014)MonarchMsg.C2S_UnderDressPrestige_9014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnderDressPrestige_9014)e.getUnfinishedMessage();
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

   public static final class S2C_UnderDressPrestige_9015 extends GeneratedMessageV3 implements S2C_UnderDressPrestige_9015OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_UnderDressPrestige_9015 DEFAULT_INSTANCE = new S2C_UnderDressPrestige_9015();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnderDressPrestige_9015> PARSER = new AbstractParser<S2C_UnderDressPrestige_9015>() {
         public S2C_UnderDressPrestige_9015 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnderDressPrestige_9015(input, extensionRegistry);
         }
      };

      private S2C_UnderDressPrestige_9015(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnderDressPrestige_9015() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnderDressPrestige_9015();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnderDressPrestige_9015(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressPrestige_9015_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressPrestige_9015_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnderDressPrestige_9015.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UnderDressPrestige_9015)) {
            return super.equals(obj);
         } else {
            S2C_UnderDressPrestige_9015 other = (S2C_UnderDressPrestige_9015)obj;
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

      public static S2C_UnderDressPrestige_9015 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnderDressPrestige_9015)PARSER.parseFrom(data);
      }

      public static S2C_UnderDressPrestige_9015 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnderDressPrestige_9015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnderDressPrestige_9015 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnderDressPrestige_9015)PARSER.parseFrom(data);
      }

      public static S2C_UnderDressPrestige_9015 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnderDressPrestige_9015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnderDressPrestige_9015 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnderDressPrestige_9015)PARSER.parseFrom(data);
      }

      public static S2C_UnderDressPrestige_9015 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnderDressPrestige_9015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnderDressPrestige_9015 parseFrom(InputStream input) throws IOException {
         return (S2C_UnderDressPrestige_9015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnderDressPrestige_9015 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnderDressPrestige_9015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnderDressPrestige_9015 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnderDressPrestige_9015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnderDressPrestige_9015 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnderDressPrestige_9015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnderDressPrestige_9015 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnderDressPrestige_9015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnderDressPrestige_9015 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnderDressPrestige_9015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnderDressPrestige_9015 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnderDressPrestige_9015 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnderDressPrestige_9015> parser() {
         return PARSER;
      }

      public Parser<S2C_UnderDressPrestige_9015> getParserForType() {
         return PARSER;
      }

      public S2C_UnderDressPrestige_9015 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnderDressPrestige_9015OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressPrestige_9015_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressPrestige_9015_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnderDressPrestige_9015.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_UnderDressPrestige_9015.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressPrestige_9015_descriptor;
         }

         public S2C_UnderDressPrestige_9015 getDefaultInstanceForType() {
            return MonarchMsg.S2C_UnderDressPrestige_9015.getDefaultInstance();
         }

         public S2C_UnderDressPrestige_9015 build() {
            S2C_UnderDressPrestige_9015 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnderDressPrestige_9015 buildPartial() {
            S2C_UnderDressPrestige_9015 result = new S2C_UnderDressPrestige_9015(this);
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
            if (other instanceof S2C_UnderDressPrestige_9015) {
               return this.mergeFrom((S2C_UnderDressPrestige_9015)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnderDressPrestige_9015 other) {
            if (other == MonarchMsg.S2C_UnderDressPrestige_9015.getDefaultInstance()) {
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
            S2C_UnderDressPrestige_9015 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnderDressPrestige_9015)MonarchMsg.S2C_UnderDressPrestige_9015.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnderDressPrestige_9015)e.getUnfinishedMessage();
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

   public static final class C2S_WearSecondTitle_9016 extends GeneratedMessageV3 implements C2S_WearSecondTitle_9016OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_WearSecondTitle_9016 DEFAULT_INSTANCE = new C2S_WearSecondTitle_9016();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WearSecondTitle_9016> PARSER = new AbstractParser<C2S_WearSecondTitle_9016>() {
         public C2S_WearSecondTitle_9016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WearSecondTitle_9016(input, extensionRegistry);
         }
      };

      private C2S_WearSecondTitle_9016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WearSecondTitle_9016() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WearSecondTitle_9016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WearSecondTitle_9016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_WearSecondTitle_9016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_WearSecondTitle_9016_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WearSecondTitle_9016.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WearSecondTitle_9016)) {
            return super.equals(obj);
         } else {
            C2S_WearSecondTitle_9016 other = (C2S_WearSecondTitle_9016)obj;
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

      public static C2S_WearSecondTitle_9016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WearSecondTitle_9016)PARSER.parseFrom(data);
      }

      public static C2S_WearSecondTitle_9016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearSecondTitle_9016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearSecondTitle_9016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WearSecondTitle_9016)PARSER.parseFrom(data);
      }

      public static C2S_WearSecondTitle_9016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearSecondTitle_9016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearSecondTitle_9016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WearSecondTitle_9016)PARSER.parseFrom(data);
      }

      public static C2S_WearSecondTitle_9016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearSecondTitle_9016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearSecondTitle_9016 parseFrom(InputStream input) throws IOException {
         return (C2S_WearSecondTitle_9016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WearSecondTitle_9016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearSecondTitle_9016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WearSecondTitle_9016 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WearSecondTitle_9016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WearSecondTitle_9016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearSecondTitle_9016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WearSecondTitle_9016 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WearSecondTitle_9016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WearSecondTitle_9016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearSecondTitle_9016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WearSecondTitle_9016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WearSecondTitle_9016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WearSecondTitle_9016> parser() {
         return PARSER;
      }

      public Parser<C2S_WearSecondTitle_9016> getParserForType() {
         return PARSER;
      }

      public C2S_WearSecondTitle_9016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WearSecondTitle_9016OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_WearSecondTitle_9016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_WearSecondTitle_9016_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WearSecondTitle_9016.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_WearSecondTitle_9016.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_WearSecondTitle_9016_descriptor;
         }

         public C2S_WearSecondTitle_9016 getDefaultInstanceForType() {
            return MonarchMsg.C2S_WearSecondTitle_9016.getDefaultInstance();
         }

         public C2S_WearSecondTitle_9016 build() {
            C2S_WearSecondTitle_9016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WearSecondTitle_9016 buildPartial() {
            C2S_WearSecondTitle_9016 result = new C2S_WearSecondTitle_9016(this);
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
            if (other instanceof C2S_WearSecondTitle_9016) {
               return this.mergeFrom((C2S_WearSecondTitle_9016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WearSecondTitle_9016 other) {
            if (other == MonarchMsg.C2S_WearSecondTitle_9016.getDefaultInstance()) {
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
            C2S_WearSecondTitle_9016 parsedMessage = null;

            try {
               parsedMessage = (C2S_WearSecondTitle_9016)MonarchMsg.C2S_WearSecondTitle_9016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WearSecondTitle_9016)e.getUnfinishedMessage();
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

   public static final class S2C_WearSecondTitle_9017 extends GeneratedMessageV3 implements S2C_WearSecondTitle_9017OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_WearSecondTitle_9017 DEFAULT_INSTANCE = new S2C_WearSecondTitle_9017();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WearSecondTitle_9017> PARSER = new AbstractParser<S2C_WearSecondTitle_9017>() {
         public S2C_WearSecondTitle_9017 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WearSecondTitle_9017(input, extensionRegistry);
         }
      };

      private S2C_WearSecondTitle_9017(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WearSecondTitle_9017() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WearSecondTitle_9017();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WearSecondTitle_9017(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_WearSecondTitle_9017_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_WearSecondTitle_9017_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearSecondTitle_9017.class, Builder.class);
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
         } else if (!(obj instanceof S2C_WearSecondTitle_9017)) {
            return super.equals(obj);
         } else {
            S2C_WearSecondTitle_9017 other = (S2C_WearSecondTitle_9017)obj;
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

      public static S2C_WearSecondTitle_9017 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WearSecondTitle_9017)PARSER.parseFrom(data);
      }

      public static S2C_WearSecondTitle_9017 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearSecondTitle_9017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearSecondTitle_9017 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WearSecondTitle_9017)PARSER.parseFrom(data);
      }

      public static S2C_WearSecondTitle_9017 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearSecondTitle_9017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearSecondTitle_9017 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WearSecondTitle_9017)PARSER.parseFrom(data);
      }

      public static S2C_WearSecondTitle_9017 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearSecondTitle_9017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearSecondTitle_9017 parseFrom(InputStream input) throws IOException {
         return (S2C_WearSecondTitle_9017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearSecondTitle_9017 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearSecondTitle_9017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearSecondTitle_9017 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WearSecondTitle_9017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WearSecondTitle_9017 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearSecondTitle_9017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearSecondTitle_9017 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WearSecondTitle_9017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearSecondTitle_9017 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearSecondTitle_9017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WearSecondTitle_9017 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WearSecondTitle_9017 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WearSecondTitle_9017> parser() {
         return PARSER;
      }

      public Parser<S2C_WearSecondTitle_9017> getParserForType() {
         return PARSER;
      }

      public S2C_WearSecondTitle_9017 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WearSecondTitle_9017OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_WearSecondTitle_9017_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_WearSecondTitle_9017_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearSecondTitle_9017.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_WearSecondTitle_9017.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_WearSecondTitle_9017_descriptor;
         }

         public S2C_WearSecondTitle_9017 getDefaultInstanceForType() {
            return MonarchMsg.S2C_WearSecondTitle_9017.getDefaultInstance();
         }

         public S2C_WearSecondTitle_9017 build() {
            S2C_WearSecondTitle_9017 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WearSecondTitle_9017 buildPartial() {
            S2C_WearSecondTitle_9017 result = new S2C_WearSecondTitle_9017(this);
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
            if (other instanceof S2C_WearSecondTitle_9017) {
               return this.mergeFrom((S2C_WearSecondTitle_9017)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WearSecondTitle_9017 other) {
            if (other == MonarchMsg.S2C_WearSecondTitle_9017.getDefaultInstance()) {
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
            S2C_WearSecondTitle_9017 parsedMessage = null;

            try {
               parsedMessage = (S2C_WearSecondTitle_9017)MonarchMsg.S2C_WearSecondTitle_9017.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WearSecondTitle_9017)e.getUnfinishedMessage();
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

   public static final class C2S_UnderDressSecondTitle_9018 extends GeneratedMessageV3 implements C2S_UnderDressSecondTitle_9018OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_UnderDressSecondTitle_9018 DEFAULT_INSTANCE = new C2S_UnderDressSecondTitle_9018();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnderDressSecondTitle_9018> PARSER = new AbstractParser<C2S_UnderDressSecondTitle_9018>() {
         public C2S_UnderDressSecondTitle_9018 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnderDressSecondTitle_9018(input, extensionRegistry);
         }
      };

      private C2S_UnderDressSecondTitle_9018(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnderDressSecondTitle_9018() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnderDressSecondTitle_9018();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnderDressSecondTitle_9018(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressSecondTitle_9018_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressSecondTitle_9018_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnderDressSecondTitle_9018.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UnderDressSecondTitle_9018)) {
            return super.equals(obj);
         } else {
            C2S_UnderDressSecondTitle_9018 other = (C2S_UnderDressSecondTitle_9018)obj;
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

      public static C2S_UnderDressSecondTitle_9018 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnderDressSecondTitle_9018)PARSER.parseFrom(data);
      }

      public static C2S_UnderDressSecondTitle_9018 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnderDressSecondTitle_9018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnderDressSecondTitle_9018 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnderDressSecondTitle_9018)PARSER.parseFrom(data);
      }

      public static C2S_UnderDressSecondTitle_9018 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnderDressSecondTitle_9018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnderDressSecondTitle_9018 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnderDressSecondTitle_9018)PARSER.parseFrom(data);
      }

      public static C2S_UnderDressSecondTitle_9018 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnderDressSecondTitle_9018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnderDressSecondTitle_9018 parseFrom(InputStream input) throws IOException {
         return (C2S_UnderDressSecondTitle_9018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnderDressSecondTitle_9018 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnderDressSecondTitle_9018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnderDressSecondTitle_9018 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnderDressSecondTitle_9018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnderDressSecondTitle_9018 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnderDressSecondTitle_9018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnderDressSecondTitle_9018 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnderDressSecondTitle_9018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnderDressSecondTitle_9018 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnderDressSecondTitle_9018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnderDressSecondTitle_9018 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnderDressSecondTitle_9018 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnderDressSecondTitle_9018> parser() {
         return PARSER;
      }

      public Parser<C2S_UnderDressSecondTitle_9018> getParserForType() {
         return PARSER;
      }

      public C2S_UnderDressSecondTitle_9018 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnderDressSecondTitle_9018OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressSecondTitle_9018_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressSecondTitle_9018_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnderDressSecondTitle_9018.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_UnderDressSecondTitle_9018.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_UnderDressSecondTitle_9018_descriptor;
         }

         public C2S_UnderDressSecondTitle_9018 getDefaultInstanceForType() {
            return MonarchMsg.C2S_UnderDressSecondTitle_9018.getDefaultInstance();
         }

         public C2S_UnderDressSecondTitle_9018 build() {
            C2S_UnderDressSecondTitle_9018 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnderDressSecondTitle_9018 buildPartial() {
            C2S_UnderDressSecondTitle_9018 result = new C2S_UnderDressSecondTitle_9018(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_UnderDressSecondTitle_9018) {
               return this.mergeFrom((C2S_UnderDressSecondTitle_9018)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnderDressSecondTitle_9018 other) {
            if (other == MonarchMsg.C2S_UnderDressSecondTitle_9018.getDefaultInstance()) {
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
            C2S_UnderDressSecondTitle_9018 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnderDressSecondTitle_9018)MonarchMsg.C2S_UnderDressSecondTitle_9018.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnderDressSecondTitle_9018)e.getUnfinishedMessage();
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

   public static final class S2C_UnderDressSecondTitle_9019 extends GeneratedMessageV3 implements S2C_UnderDressSecondTitle_9019OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_UnderDressSecondTitle_9019 DEFAULT_INSTANCE = new S2C_UnderDressSecondTitle_9019();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnderDressSecondTitle_9019> PARSER = new AbstractParser<S2C_UnderDressSecondTitle_9019>() {
         public S2C_UnderDressSecondTitle_9019 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnderDressSecondTitle_9019(input, extensionRegistry);
         }
      };

      private S2C_UnderDressSecondTitle_9019(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnderDressSecondTitle_9019() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnderDressSecondTitle_9019();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnderDressSecondTitle_9019(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressSecondTitle_9019_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressSecondTitle_9019_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnderDressSecondTitle_9019.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UnderDressSecondTitle_9019)) {
            return super.equals(obj);
         } else {
            S2C_UnderDressSecondTitle_9019 other = (S2C_UnderDressSecondTitle_9019)obj;
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

      public static S2C_UnderDressSecondTitle_9019 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnderDressSecondTitle_9019)PARSER.parseFrom(data);
      }

      public static S2C_UnderDressSecondTitle_9019 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnderDressSecondTitle_9019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnderDressSecondTitle_9019 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnderDressSecondTitle_9019)PARSER.parseFrom(data);
      }

      public static S2C_UnderDressSecondTitle_9019 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnderDressSecondTitle_9019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnderDressSecondTitle_9019 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnderDressSecondTitle_9019)PARSER.parseFrom(data);
      }

      public static S2C_UnderDressSecondTitle_9019 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnderDressSecondTitle_9019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnderDressSecondTitle_9019 parseFrom(InputStream input) throws IOException {
         return (S2C_UnderDressSecondTitle_9019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnderDressSecondTitle_9019 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnderDressSecondTitle_9019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnderDressSecondTitle_9019 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnderDressSecondTitle_9019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnderDressSecondTitle_9019 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnderDressSecondTitle_9019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnderDressSecondTitle_9019 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnderDressSecondTitle_9019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnderDressSecondTitle_9019 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnderDressSecondTitle_9019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnderDressSecondTitle_9019 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnderDressSecondTitle_9019 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnderDressSecondTitle_9019> parser() {
         return PARSER;
      }

      public Parser<S2C_UnderDressSecondTitle_9019> getParserForType() {
         return PARSER;
      }

      public S2C_UnderDressSecondTitle_9019 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnderDressSecondTitle_9019OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressSecondTitle_9019_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressSecondTitle_9019_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnderDressSecondTitle_9019.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_UnderDressSecondTitle_9019.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_UnderDressSecondTitle_9019_descriptor;
         }

         public S2C_UnderDressSecondTitle_9019 getDefaultInstanceForType() {
            return MonarchMsg.S2C_UnderDressSecondTitle_9019.getDefaultInstance();
         }

         public S2C_UnderDressSecondTitle_9019 build() {
            S2C_UnderDressSecondTitle_9019 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnderDressSecondTitle_9019 buildPartial() {
            S2C_UnderDressSecondTitle_9019 result = new S2C_UnderDressSecondTitle_9019(this);
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
            if (other instanceof S2C_UnderDressSecondTitle_9019) {
               return this.mergeFrom((S2C_UnderDressSecondTitle_9019)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnderDressSecondTitle_9019 other) {
            if (other == MonarchMsg.S2C_UnderDressSecondTitle_9019.getDefaultInstance()) {
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
            S2C_UnderDressSecondTitle_9019 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnderDressSecondTitle_9019)MonarchMsg.S2C_UnderDressSecondTitle_9019.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnderDressSecondTitle_9019)e.getUnfinishedMessage();
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

   public static final class S2C_NotifyHead_9020 extends GeneratedMessageV3 implements S2C_NotifyHead_9020OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private Internal.IntList id_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_NotifyHead_9020 DEFAULT_INSTANCE = new S2C_NotifyHead_9020();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NotifyHead_9020> PARSER = new AbstractParser<S2C_NotifyHead_9020>() {
         public S2C_NotifyHead_9020 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NotifyHead_9020(input, extensionRegistry);
         }
      };

      private S2C_NotifyHead_9020(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NotifyHead_9020() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NotifyHead_9020();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NotifyHead_9020(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.id_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.type_ = input.readInt32();
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.id_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_NotifyHead_9020_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_NotifyHead_9020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NotifyHead_9020.class, Builder.class);
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
         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(1, this.id_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.type_);
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

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NotifyHead_9020)) {
            return super.equals(obj);
         } else {
            S2C_NotifyHead_9020 other = (S2C_NotifyHead_9020)obj;
            if (!this.getIdList().equals(other.getIdList())) {
               return false;
            } else if (this.hasType() != other.hasType()) {
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
            if (this.getIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NotifyHead_9020 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NotifyHead_9020)PARSER.parseFrom(data);
      }

      public static S2C_NotifyHead_9020 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyHead_9020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyHead_9020 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NotifyHead_9020)PARSER.parseFrom(data);
      }

      public static S2C_NotifyHead_9020 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyHead_9020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyHead_9020 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NotifyHead_9020)PARSER.parseFrom(data);
      }

      public static S2C_NotifyHead_9020 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyHead_9020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyHead_9020 parseFrom(InputStream input) throws IOException {
         return (S2C_NotifyHead_9020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NotifyHead_9020 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyHead_9020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NotifyHead_9020 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NotifyHead_9020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NotifyHead_9020 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyHead_9020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NotifyHead_9020 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NotifyHead_9020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NotifyHead_9020 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyHead_9020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NotifyHead_9020 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NotifyHead_9020 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NotifyHead_9020> parser() {
         return PARSER;
      }

      public Parser<S2C_NotifyHead_9020> getParserForType() {
         return PARSER;
      }

      public S2C_NotifyHead_9020 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NotifyHead_9020OrBuilder {
         private int bitField0_;
         private Internal.IntList id_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_NotifyHead_9020_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_NotifyHead_9020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NotifyHead_9020.class, Builder.class);
         }

         private Builder() {
            this.id_ = MonarchMsg.S2C_NotifyHead_9020.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = MonarchMsg.S2C_NotifyHead_9020.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_NotifyHead_9020.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = MonarchMsg.S2C_NotifyHead_9020.emptyIntList();
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_NotifyHead_9020_descriptor;
         }

         public S2C_NotifyHead_9020 getDefaultInstanceForType() {
            return MonarchMsg.S2C_NotifyHead_9020.getDefaultInstance();
         }

         public S2C_NotifyHead_9020 build() {
            S2C_NotifyHead_9020 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NotifyHead_9020 buildPartial() {
            S2C_NotifyHead_9020 result = new S2C_NotifyHead_9020(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.id_ = this.id_;
            if ((from_bitField0_ & 2) != 0) {
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
            if (other instanceof S2C_NotifyHead_9020) {
               return this.mergeFrom((S2C_NotifyHead_9020)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NotifyHead_9020 other) {
            if (other == MonarchMsg.S2C_NotifyHead_9020.getDefaultInstance()) {
               return this;
            } else {
               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureIdIsMutable();
                     this.id_.addAll(other.id_);
                  }

                  this.onChanged();
               }

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
            S2C_NotifyHead_9020 parsedMessage = null;

            try {
               parsedMessage = (S2C_NotifyHead_9020)MonarchMsg.S2C_NotifyHead_9020.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NotifyHead_9020)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.id_ = MonarchMsg.S2C_NotifyHead_9020.mutableCopy(this.id_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
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
            this.id_ = MonarchMsg.S2C_NotifyHead_9020.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
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

   public static final class C2S_PrestigeTaskList_9021 extends GeneratedMessageV3 implements C2S_PrestigeTaskList_9021OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PrestigeTaskList_9021 DEFAULT_INSTANCE = new C2S_PrestigeTaskList_9021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PrestigeTaskList_9021> PARSER = new AbstractParser<C2S_PrestigeTaskList_9021>() {
         public C2S_PrestigeTaskList_9021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PrestigeTaskList_9021(input, extensionRegistry);
         }
      };

      private C2S_PrestigeTaskList_9021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PrestigeTaskList_9021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PrestigeTaskList_9021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PrestigeTaskList_9021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeTaskList_9021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeTaskList_9021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrestigeTaskList_9021.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PrestigeTaskList_9021)) {
            return super.equals(obj);
         } else {
            C2S_PrestigeTaskList_9021 other = (C2S_PrestigeTaskList_9021)obj;
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

      public static C2S_PrestigeTaskList_9021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PrestigeTaskList_9021)PARSER.parseFrom(data);
      }

      public static C2S_PrestigeTaskList_9021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrestigeTaskList_9021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrestigeTaskList_9021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PrestigeTaskList_9021)PARSER.parseFrom(data);
      }

      public static C2S_PrestigeTaskList_9021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrestigeTaskList_9021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrestigeTaskList_9021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PrestigeTaskList_9021)PARSER.parseFrom(data);
      }

      public static C2S_PrestigeTaskList_9021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrestigeTaskList_9021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrestigeTaskList_9021 parseFrom(InputStream input) throws IOException {
         return (C2S_PrestigeTaskList_9021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrestigeTaskList_9021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrestigeTaskList_9021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrestigeTaskList_9021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PrestigeTaskList_9021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PrestigeTaskList_9021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrestigeTaskList_9021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrestigeTaskList_9021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PrestigeTaskList_9021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrestigeTaskList_9021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrestigeTaskList_9021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PrestigeTaskList_9021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PrestigeTaskList_9021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PrestigeTaskList_9021> parser() {
         return PARSER;
      }

      public Parser<C2S_PrestigeTaskList_9021> getParserForType() {
         return PARSER;
      }

      public C2S_PrestigeTaskList_9021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PrestigeTaskList_9021OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeTaskList_9021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeTaskList_9021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrestigeTaskList_9021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_PrestigeTaskList_9021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeTaskList_9021_descriptor;
         }

         public C2S_PrestigeTaskList_9021 getDefaultInstanceForType() {
            return MonarchMsg.C2S_PrestigeTaskList_9021.getDefaultInstance();
         }

         public C2S_PrestigeTaskList_9021 build() {
            C2S_PrestigeTaskList_9021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PrestigeTaskList_9021 buildPartial() {
            C2S_PrestigeTaskList_9021 result = new C2S_PrestigeTaskList_9021(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_PrestigeTaskList_9021) {
               return this.mergeFrom((C2S_PrestigeTaskList_9021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PrestigeTaskList_9021 other) {
            if (other == MonarchMsg.C2S_PrestigeTaskList_9021.getDefaultInstance()) {
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
            C2S_PrestigeTaskList_9021 parsedMessage = null;

            try {
               parsedMessage = (C2S_PrestigeTaskList_9021)MonarchMsg.C2S_PrestigeTaskList_9021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PrestigeTaskList_9021)e.getUnfinishedMessage();
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

   public static final class S2C_PrestigeTaskList_9022 extends GeneratedMessageV3 implements S2C_PrestigeTaskList_9022OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_PrestigeTaskList_9022 DEFAULT_INSTANCE = new S2C_PrestigeTaskList_9022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrestigeTaskList_9022> PARSER = new AbstractParser<S2C_PrestigeTaskList_9022>() {
         public S2C_PrestigeTaskList_9022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrestigeTaskList_9022(input, extensionRegistry);
         }
      };

      private S2C_PrestigeTaskList_9022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrestigeTaskList_9022() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrestigeTaskList_9022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrestigeTaskList_9022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.taskList_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeTaskList_9022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeTaskList_9022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrestigeTaskList_9022.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public CommonMsg.Task getTaskList(int index) {
         return (CommonMsg.Task)this.taskList_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.taskList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.taskList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.taskList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrestigeTaskList_9022)) {
            return super.equals(obj);
         } else {
            S2C_PrestigeTaskList_9022 other = (S2C_PrestigeTaskList_9022)obj;
            if (!this.getTaskListList().equals(other.getTaskListList())) {
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
            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrestigeTaskList_9022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrestigeTaskList_9022)PARSER.parseFrom(data);
      }

      public static S2C_PrestigeTaskList_9022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrestigeTaskList_9022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrestigeTaskList_9022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrestigeTaskList_9022)PARSER.parseFrom(data);
      }

      public static S2C_PrestigeTaskList_9022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrestigeTaskList_9022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrestigeTaskList_9022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrestigeTaskList_9022)PARSER.parseFrom(data);
      }

      public static S2C_PrestigeTaskList_9022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrestigeTaskList_9022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrestigeTaskList_9022 parseFrom(InputStream input) throws IOException {
         return (S2C_PrestigeTaskList_9022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrestigeTaskList_9022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrestigeTaskList_9022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrestigeTaskList_9022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrestigeTaskList_9022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrestigeTaskList_9022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrestigeTaskList_9022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrestigeTaskList_9022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrestigeTaskList_9022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrestigeTaskList_9022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrestigeTaskList_9022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrestigeTaskList_9022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrestigeTaskList_9022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrestigeTaskList_9022> parser() {
         return PARSER;
      }

      public Parser<S2C_PrestigeTaskList_9022> getParserForType() {
         return PARSER;
      }

      public S2C_PrestigeTaskList_9022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrestigeTaskList_9022OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> taskList_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeTaskList_9022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeTaskList_9022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrestigeTaskList_9022.class, Builder.class);
         }

         private Builder() {
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_PrestigeTaskList_9022.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeTaskList_9022_descriptor;
         }

         public S2C_PrestigeTaskList_9022 getDefaultInstanceForType() {
            return MonarchMsg.S2C_PrestigeTaskList_9022.getDefaultInstance();
         }

         public S2C_PrestigeTaskList_9022 build() {
            S2C_PrestigeTaskList_9022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrestigeTaskList_9022 buildPartial() {
            S2C_PrestigeTaskList_9022 result = new S2C_PrestigeTaskList_9022(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -2;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
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
            if (other instanceof S2C_PrestigeTaskList_9022) {
               return this.mergeFrom((S2C_PrestigeTaskList_9022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrestigeTaskList_9022 other) {
            if (other == MonarchMsg.S2C_PrestigeTaskList_9022.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -2;
                     this.taskListBuilder_ = MonarchMsg.S2C_PrestigeTaskList_9022.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrestigeTaskList_9022 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrestigeTaskList_9022)MonarchMsg.S2C_PrestigeTaskList_9022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrestigeTaskList_9022)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public CommonMsg.Task getTaskList(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.Task)this.taskList_.get(index) : (CommonMsg.Task)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, CommonMsg.Task value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(CommonMsg.Task value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, CommonMsg.Task value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.taskList_.get(index) : (CommonMsg.TaskOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public CommonMsg.Task.Builder addTaskListBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_NativeHead_9023 extends GeneratedMessageV3 implements C2S_NativeHead_9023OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TIMESTAMP_FIELD_NUMBER = 1;
      private int timeStamp_;
      private byte memoizedIsInitialized;
      private static final C2S_NativeHead_9023 DEFAULT_INSTANCE = new C2S_NativeHead_9023();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NativeHead_9023> PARSER = new AbstractParser<C2S_NativeHead_9023>() {
         public C2S_NativeHead_9023 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NativeHead_9023(input, extensionRegistry);
         }
      };

      private C2S_NativeHead_9023(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NativeHead_9023() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NativeHead_9023();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NativeHead_9023(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.timeStamp_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_NativeHead_9023_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_NativeHead_9023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NativeHead_9023.class, Builder.class);
      }

      public boolean hasTimeStamp() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTimeStamp() {
         return this.timeStamp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTimeStamp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.timeStamp_);
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
               size += CodedOutputStream.computeInt32Size(1, this.timeStamp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_NativeHead_9023)) {
            return super.equals(obj);
         } else {
            C2S_NativeHead_9023 other = (C2S_NativeHead_9023)obj;
            if (this.hasTimeStamp() != other.hasTimeStamp()) {
               return false;
            } else if (this.hasTimeStamp() && this.getTimeStamp() != other.getTimeStamp()) {
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
            if (this.hasTimeStamp()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTimeStamp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_NativeHead_9023 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NativeHead_9023)PARSER.parseFrom(data);
      }

      public static C2S_NativeHead_9023 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NativeHead_9023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NativeHead_9023 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NativeHead_9023)PARSER.parseFrom(data);
      }

      public static C2S_NativeHead_9023 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NativeHead_9023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NativeHead_9023 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NativeHead_9023)PARSER.parseFrom(data);
      }

      public static C2S_NativeHead_9023 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NativeHead_9023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NativeHead_9023 parseFrom(InputStream input) throws IOException {
         return (C2S_NativeHead_9023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NativeHead_9023 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NativeHead_9023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NativeHead_9023 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NativeHead_9023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NativeHead_9023 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NativeHead_9023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NativeHead_9023 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NativeHead_9023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NativeHead_9023 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NativeHead_9023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NativeHead_9023 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NativeHead_9023 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NativeHead_9023> parser() {
         return PARSER;
      }

      public Parser<C2S_NativeHead_9023> getParserForType() {
         return PARSER;
      }

      public C2S_NativeHead_9023 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NativeHead_9023OrBuilder {
         private int bitField0_;
         private int timeStamp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_NativeHead_9023_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_NativeHead_9023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NativeHead_9023.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_NativeHead_9023.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.timeStamp_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_NativeHead_9023_descriptor;
         }

         public C2S_NativeHead_9023 getDefaultInstanceForType() {
            return MonarchMsg.C2S_NativeHead_9023.getDefaultInstance();
         }

         public C2S_NativeHead_9023 build() {
            C2S_NativeHead_9023 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NativeHead_9023 buildPartial() {
            C2S_NativeHead_9023 result = new C2S_NativeHead_9023(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.timeStamp_ = this.timeStamp_;
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
            if (other instanceof C2S_NativeHead_9023) {
               return this.mergeFrom((C2S_NativeHead_9023)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NativeHead_9023 other) {
            if (other == MonarchMsg.C2S_NativeHead_9023.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTimeStamp()) {
                  this.setTimeStamp(other.getTimeStamp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTimeStamp();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_NativeHead_9023 parsedMessage = null;

            try {
               parsedMessage = (C2S_NativeHead_9023)MonarchMsg.C2S_NativeHead_9023.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NativeHead_9023)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTimeStamp() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTimeStamp() {
            return this.timeStamp_;
         }

         public Builder setTimeStamp(int value) {
            this.bitField0_ |= 1;
            this.timeStamp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTimeStamp() {
            this.bitField0_ &= -2;
            this.timeStamp_ = 0;
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

   public static final class S2C_NativeHead_9024 extends GeneratedMessageV3 implements S2C_NativeHead_9024OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TIMESTAMP_FIELD_NUMBER = 1;
      private int timeStamp_;
      private byte memoizedIsInitialized;
      private static final S2C_NativeHead_9024 DEFAULT_INSTANCE = new S2C_NativeHead_9024();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NativeHead_9024> PARSER = new AbstractParser<S2C_NativeHead_9024>() {
         public S2C_NativeHead_9024 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NativeHead_9024(input, extensionRegistry);
         }
      };

      private S2C_NativeHead_9024(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NativeHead_9024() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NativeHead_9024();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NativeHead_9024(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.timeStamp_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_NativeHead_9024_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_NativeHead_9024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NativeHead_9024.class, Builder.class);
      }

      public boolean hasTimeStamp() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTimeStamp() {
         return this.timeStamp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTimeStamp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.timeStamp_);
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
               size += CodedOutputStream.computeInt32Size(1, this.timeStamp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NativeHead_9024)) {
            return super.equals(obj);
         } else {
            S2C_NativeHead_9024 other = (S2C_NativeHead_9024)obj;
            if (this.hasTimeStamp() != other.hasTimeStamp()) {
               return false;
            } else if (this.hasTimeStamp() && this.getTimeStamp() != other.getTimeStamp()) {
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
            if (this.hasTimeStamp()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTimeStamp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NativeHead_9024 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NativeHead_9024)PARSER.parseFrom(data);
      }

      public static S2C_NativeHead_9024 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NativeHead_9024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NativeHead_9024 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NativeHead_9024)PARSER.parseFrom(data);
      }

      public static S2C_NativeHead_9024 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NativeHead_9024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NativeHead_9024 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NativeHead_9024)PARSER.parseFrom(data);
      }

      public static S2C_NativeHead_9024 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NativeHead_9024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NativeHead_9024 parseFrom(InputStream input) throws IOException {
         return (S2C_NativeHead_9024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NativeHead_9024 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NativeHead_9024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NativeHead_9024 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NativeHead_9024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NativeHead_9024 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NativeHead_9024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NativeHead_9024 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NativeHead_9024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NativeHead_9024 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NativeHead_9024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NativeHead_9024 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NativeHead_9024 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NativeHead_9024> parser() {
         return PARSER;
      }

      public Parser<S2C_NativeHead_9024> getParserForType() {
         return PARSER;
      }

      public S2C_NativeHead_9024 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NativeHead_9024OrBuilder {
         private int bitField0_;
         private int timeStamp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_NativeHead_9024_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_NativeHead_9024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NativeHead_9024.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_NativeHead_9024.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.timeStamp_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_NativeHead_9024_descriptor;
         }

         public S2C_NativeHead_9024 getDefaultInstanceForType() {
            return MonarchMsg.S2C_NativeHead_9024.getDefaultInstance();
         }

         public S2C_NativeHead_9024 build() {
            S2C_NativeHead_9024 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NativeHead_9024 buildPartial() {
            S2C_NativeHead_9024 result = new S2C_NativeHead_9024(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.timeStamp_ = this.timeStamp_;
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
            if (other instanceof S2C_NativeHead_9024) {
               return this.mergeFrom((S2C_NativeHead_9024)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NativeHead_9024 other) {
            if (other == MonarchMsg.S2C_NativeHead_9024.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTimeStamp()) {
                  this.setTimeStamp(other.getTimeStamp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTimeStamp();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_NativeHead_9024 parsedMessage = null;

            try {
               parsedMessage = (S2C_NativeHead_9024)MonarchMsg.S2C_NativeHead_9024.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NativeHead_9024)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTimeStamp() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTimeStamp() {
            return this.timeStamp_;
         }

         public Builder setTimeStamp(int value) {
            this.bitField0_ |= 1;
            this.timeStamp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTimeStamp() {
            this.bitField0_ &= -2;
            this.timeStamp_ = 0;
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

   public static final class C2S_PrestigeUpLv_9025 extends GeneratedMessageV3 implements C2S_PrestigeUpLv_9025OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private int itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_PrestigeUpLv_9025 DEFAULT_INSTANCE = new C2S_PrestigeUpLv_9025();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PrestigeUpLv_9025> PARSER = new AbstractParser<C2S_PrestigeUpLv_9025>() {
         public C2S_PrestigeUpLv_9025 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PrestigeUpLv_9025(input, extensionRegistry);
         }
      };

      private C2S_PrestigeUpLv_9025(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PrestigeUpLv_9025() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PrestigeUpLv_9025();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PrestigeUpLv_9025(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeUpLv_9025_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeUpLv_9025_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrestigeUpLv_9025.class, Builder.class);
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemCode_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PrestigeUpLv_9025)) {
            return super.equals(obj);
         } else {
            C2S_PrestigeUpLv_9025 other = (C2S_PrestigeUpLv_9025)obj;
            if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PrestigeUpLv_9025 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PrestigeUpLv_9025)PARSER.parseFrom(data);
      }

      public static C2S_PrestigeUpLv_9025 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrestigeUpLv_9025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrestigeUpLv_9025 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PrestigeUpLv_9025)PARSER.parseFrom(data);
      }

      public static C2S_PrestigeUpLv_9025 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrestigeUpLv_9025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrestigeUpLv_9025 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PrestigeUpLv_9025)PARSER.parseFrom(data);
      }

      public static C2S_PrestigeUpLv_9025 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrestigeUpLv_9025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrestigeUpLv_9025 parseFrom(InputStream input) throws IOException {
         return (C2S_PrestigeUpLv_9025)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrestigeUpLv_9025 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrestigeUpLv_9025)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrestigeUpLv_9025 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PrestigeUpLv_9025)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PrestigeUpLv_9025 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrestigeUpLv_9025)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrestigeUpLv_9025 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PrestigeUpLv_9025)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrestigeUpLv_9025 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrestigeUpLv_9025)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PrestigeUpLv_9025 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PrestigeUpLv_9025 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PrestigeUpLv_9025> parser() {
         return PARSER;
      }

      public Parser<C2S_PrestigeUpLv_9025> getParserForType() {
         return PARSER;
      }

      public C2S_PrestigeUpLv_9025 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PrestigeUpLv_9025OrBuilder {
         private int bitField0_;
         private int itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeUpLv_9025_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeUpLv_9025_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrestigeUpLv_9025.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_PrestigeUpLv_9025.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_PrestigeUpLv_9025_descriptor;
         }

         public C2S_PrestigeUpLv_9025 getDefaultInstanceForType() {
            return MonarchMsg.C2S_PrestigeUpLv_9025.getDefaultInstance();
         }

         public C2S_PrestigeUpLv_9025 build() {
            C2S_PrestigeUpLv_9025 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PrestigeUpLv_9025 buildPartial() {
            C2S_PrestigeUpLv_9025 result = new C2S_PrestigeUpLv_9025(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemCode_ = this.itemCode_;
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
            if (other instanceof C2S_PrestigeUpLv_9025) {
               return this.mergeFrom((C2S_PrestigeUpLv_9025)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PrestigeUpLv_9025 other) {
            if (other == MonarchMsg.C2S_PrestigeUpLv_9025.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasItemCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PrestigeUpLv_9025 parsedMessage = null;

            try {
               parsedMessage = (C2S_PrestigeUpLv_9025)MonarchMsg.C2S_PrestigeUpLv_9025.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PrestigeUpLv_9025)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_PrestigeUpLv_9026 extends GeneratedMessageV3 implements S2C_PrestigeUpLv_9026OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRESTIGE_FIELD_NUMBER = 1;
      private MonarchItem prestige_;
      private byte memoizedIsInitialized;
      private static final S2C_PrestigeUpLv_9026 DEFAULT_INSTANCE = new S2C_PrestigeUpLv_9026();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrestigeUpLv_9026> PARSER = new AbstractParser<S2C_PrestigeUpLv_9026>() {
         public S2C_PrestigeUpLv_9026 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrestigeUpLv_9026(input, extensionRegistry);
         }
      };

      private S2C_PrestigeUpLv_9026(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrestigeUpLv_9026() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrestigeUpLv_9026();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrestigeUpLv_9026(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MonarchItem.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.prestige_.toBuilder();
                        }

                        this.prestige_ = (MonarchItem)input.readMessage(MonarchMsg.MonarchItem.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.prestige_);
                           this.prestige_ = subBuilder.buildPartial();
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeUpLv_9026_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeUpLv_9026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrestigeUpLv_9026.class, Builder.class);
      }

      public boolean hasPrestige() {
         return (this.bitField0_ & 1) != 0;
      }

      public MonarchItem getPrestige() {
         return this.prestige_ == null ? MonarchMsg.MonarchItem.getDefaultInstance() : this.prestige_;
      }

      public MonarchItemOrBuilder getPrestigeOrBuilder() {
         return this.prestige_ == null ? MonarchMsg.MonarchItem.getDefaultInstance() : this.prestige_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrestige()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPrestige().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getPrestige());
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
               size += CodedOutputStream.computeMessageSize(1, this.getPrestige());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrestigeUpLv_9026)) {
            return super.equals(obj);
         } else {
            S2C_PrestigeUpLv_9026 other = (S2C_PrestigeUpLv_9026)obj;
            if (this.hasPrestige() != other.hasPrestige()) {
               return false;
            } else if (this.hasPrestige() && !this.getPrestige().equals(other.getPrestige())) {
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
            if (this.hasPrestige()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrestige().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrestigeUpLv_9026 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrestigeUpLv_9026)PARSER.parseFrom(data);
      }

      public static S2C_PrestigeUpLv_9026 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrestigeUpLv_9026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrestigeUpLv_9026 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrestigeUpLv_9026)PARSER.parseFrom(data);
      }

      public static S2C_PrestigeUpLv_9026 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrestigeUpLv_9026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrestigeUpLv_9026 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrestigeUpLv_9026)PARSER.parseFrom(data);
      }

      public static S2C_PrestigeUpLv_9026 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrestigeUpLv_9026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrestigeUpLv_9026 parseFrom(InputStream input) throws IOException {
         return (S2C_PrestigeUpLv_9026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrestigeUpLv_9026 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrestigeUpLv_9026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrestigeUpLv_9026 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrestigeUpLv_9026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrestigeUpLv_9026 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrestigeUpLv_9026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrestigeUpLv_9026 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrestigeUpLv_9026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrestigeUpLv_9026 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrestigeUpLv_9026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrestigeUpLv_9026 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrestigeUpLv_9026 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrestigeUpLv_9026> parser() {
         return PARSER;
      }

      public Parser<S2C_PrestigeUpLv_9026> getParserForType() {
         return PARSER;
      }

      public S2C_PrestigeUpLv_9026 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrestigeUpLv_9026OrBuilder {
         private int bitField0_;
         private MonarchItem prestige_;
         private SingleFieldBuilderV3<MonarchItem, MonarchItem.Builder, MonarchItemOrBuilder> prestigeBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeUpLv_9026_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeUpLv_9026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrestigeUpLv_9026.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_PrestigeUpLv_9026.alwaysUseFieldBuilders) {
               this.getPrestigeFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.prestigeBuilder_ == null) {
               this.prestige_ = null;
            } else {
               this.prestigeBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_PrestigeUpLv_9026_descriptor;
         }

         public S2C_PrestigeUpLv_9026 getDefaultInstanceForType() {
            return MonarchMsg.S2C_PrestigeUpLv_9026.getDefaultInstance();
         }

         public S2C_PrestigeUpLv_9026 build() {
            S2C_PrestigeUpLv_9026 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrestigeUpLv_9026 buildPartial() {
            S2C_PrestigeUpLv_9026 result = new S2C_PrestigeUpLv_9026(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.prestigeBuilder_ == null) {
                  result.prestige_ = this.prestige_;
               } else {
                  result.prestige_ = (MonarchItem)this.prestigeBuilder_.build();
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
            if (other instanceof S2C_PrestigeUpLv_9026) {
               return this.mergeFrom((S2C_PrestigeUpLv_9026)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrestigeUpLv_9026 other) {
            if (other == MonarchMsg.S2C_PrestigeUpLv_9026.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrestige()) {
                  this.mergePrestige(other.getPrestige());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPrestige()) {
               return false;
            } else {
               return this.getPrestige().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrestigeUpLv_9026 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrestigeUpLv_9026)MonarchMsg.S2C_PrestigeUpLv_9026.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrestigeUpLv_9026)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrestige() {
            return (this.bitField0_ & 1) != 0;
         }

         public MonarchItem getPrestige() {
            if (this.prestigeBuilder_ == null) {
               return this.prestige_ == null ? MonarchMsg.MonarchItem.getDefaultInstance() : this.prestige_;
            } else {
               return (MonarchItem)this.prestigeBuilder_.getMessage();
            }
         }

         public Builder setPrestige(MonarchItem value) {
            if (this.prestigeBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.prestige_ = value;
               this.onChanged();
            } else {
               this.prestigeBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPrestige(MonarchItem.Builder builderForValue) {
            if (this.prestigeBuilder_ == null) {
               this.prestige_ = builderForValue.build();
               this.onChanged();
            } else {
               this.prestigeBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePrestige(MonarchItem value) {
            if (this.prestigeBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.prestige_ != null && this.prestige_ != MonarchMsg.MonarchItem.getDefaultInstance()) {
                  this.prestige_ = MonarchMsg.MonarchItem.newBuilder(this.prestige_).mergeFrom(value).buildPartial();
               } else {
                  this.prestige_ = value;
               }

               this.onChanged();
            } else {
               this.prestigeBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPrestige() {
            if (this.prestigeBuilder_ == null) {
               this.prestige_ = null;
               this.onChanged();
            } else {
               this.prestigeBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MonarchItem.Builder getPrestigeBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MonarchItem.Builder)this.getPrestigeFieldBuilder().getBuilder();
         }

         public MonarchItemOrBuilder getPrestigeOrBuilder() {
            if (this.prestigeBuilder_ != null) {
               return (MonarchItemOrBuilder)this.prestigeBuilder_.getMessageOrBuilder();
            } else {
               return this.prestige_ == null ? MonarchMsg.MonarchItem.getDefaultInstance() : this.prestige_;
            }
         }

         private SingleFieldBuilderV3<MonarchItem, MonarchItem.Builder, MonarchItemOrBuilder> getPrestigeFieldBuilder() {
            if (this.prestigeBuilder_ == null) {
               this.prestigeBuilder_ = new SingleFieldBuilderV3(this.getPrestige(), this.getParentForChildren(), this.isClean());
               this.prestige_ = null;
            }

            return this.prestigeBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_HideTrendHead_9027 extends GeneratedMessageV3 implements C2S_HideTrendHead_9027OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HIDETRENDHEAD_FIELD_NUMBER = 1;
      private boolean hideTrendHead_;
      public static final int HEADID_FIELD_NUMBER = 2;
      private int headId_;
      private byte memoizedIsInitialized;
      private static final C2S_HideTrendHead_9027 DEFAULT_INSTANCE = new C2S_HideTrendHead_9027();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HideTrendHead_9027> PARSER = new AbstractParser<C2S_HideTrendHead_9027>() {
         public C2S_HideTrendHead_9027 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HideTrendHead_9027(input, extensionRegistry);
         }
      };

      private C2S_HideTrendHead_9027(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HideTrendHead_9027() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HideTrendHead_9027();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HideTrendHead_9027(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hideTrendHead_ = input.readBool();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.headId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_HideTrendHead_9027_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_HideTrendHead_9027_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HideTrendHead_9027.class, Builder.class);
      }

      public boolean hasHideTrendHead() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getHideTrendHead() {
         return this.hideTrendHead_;
      }

      public boolean hasHeadId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeadId() {
         return this.headId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHideTrendHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.hideTrendHead_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.headId_);
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
               size += CodedOutputStream.computeBoolSize(1, this.hideTrendHead_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.headId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HideTrendHead_9027)) {
            return super.equals(obj);
         } else {
            C2S_HideTrendHead_9027 other = (C2S_HideTrendHead_9027)obj;
            if (this.hasHideTrendHead() != other.hasHideTrendHead()) {
               return false;
            } else if (this.hasHideTrendHead() && this.getHideTrendHead() != other.getHideTrendHead()) {
               return false;
            } else if (this.hasHeadId() != other.hasHeadId()) {
               return false;
            } else if (this.hasHeadId() && this.getHeadId() != other.getHeadId()) {
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
            if (this.hasHideTrendHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getHideTrendHead());
            }

            if (this.hasHeadId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeadId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HideTrendHead_9027 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HideTrendHead_9027)PARSER.parseFrom(data);
      }

      public static C2S_HideTrendHead_9027 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HideTrendHead_9027)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HideTrendHead_9027 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HideTrendHead_9027)PARSER.parseFrom(data);
      }

      public static C2S_HideTrendHead_9027 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HideTrendHead_9027)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HideTrendHead_9027 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HideTrendHead_9027)PARSER.parseFrom(data);
      }

      public static C2S_HideTrendHead_9027 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HideTrendHead_9027)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HideTrendHead_9027 parseFrom(InputStream input) throws IOException {
         return (C2S_HideTrendHead_9027)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HideTrendHead_9027 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HideTrendHead_9027)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HideTrendHead_9027 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HideTrendHead_9027)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HideTrendHead_9027 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HideTrendHead_9027)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HideTrendHead_9027 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HideTrendHead_9027)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HideTrendHead_9027 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HideTrendHead_9027)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HideTrendHead_9027 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HideTrendHead_9027 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HideTrendHead_9027> parser() {
         return PARSER;
      }

      public Parser<C2S_HideTrendHead_9027> getParserForType() {
         return PARSER;
      }

      public C2S_HideTrendHead_9027 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HideTrendHead_9027OrBuilder {
         private int bitField0_;
         private boolean hideTrendHead_;
         private int headId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_HideTrendHead_9027_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_HideTrendHead_9027_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HideTrendHead_9027.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.C2S_HideTrendHead_9027.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hideTrendHead_ = false;
            this.bitField0_ &= -2;
            this.headId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_C2S_HideTrendHead_9027_descriptor;
         }

         public C2S_HideTrendHead_9027 getDefaultInstanceForType() {
            return MonarchMsg.C2S_HideTrendHead_9027.getDefaultInstance();
         }

         public C2S_HideTrendHead_9027 build() {
            C2S_HideTrendHead_9027 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HideTrendHead_9027 buildPartial() {
            C2S_HideTrendHead_9027 result = new C2S_HideTrendHead_9027(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hideTrendHead_ = this.hideTrendHead_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.headId_ = this.headId_;
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
            if (other instanceof C2S_HideTrendHead_9027) {
               return this.mergeFrom((C2S_HideTrendHead_9027)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HideTrendHead_9027 other) {
            if (other == MonarchMsg.C2S_HideTrendHead_9027.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHideTrendHead()) {
                  this.setHideTrendHead(other.getHideTrendHead());
               }

               if (other.hasHeadId()) {
                  this.setHeadId(other.getHeadId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHideTrendHead()) {
               return false;
            } else {
               return this.hasHeadId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HideTrendHead_9027 parsedMessage = null;

            try {
               parsedMessage = (C2S_HideTrendHead_9027)MonarchMsg.C2S_HideTrendHead_9027.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HideTrendHead_9027)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHideTrendHead() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getHideTrendHead() {
            return this.hideTrendHead_;
         }

         public Builder setHideTrendHead(boolean value) {
            this.bitField0_ |= 1;
            this.hideTrendHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHideTrendHead() {
            this.bitField0_ &= -2;
            this.hideTrendHead_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasHeadId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeadId() {
            return this.headId_;
         }

         public Builder setHeadId(int value) {
            this.bitField0_ |= 2;
            this.headId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadId() {
            this.bitField0_ &= -3;
            this.headId_ = 0;
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

   public static final class S2C_HideTrendHead_9028 extends GeneratedMessageV3 implements S2C_HideTrendHead_9028OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SHOWTRENDHEAD_FIELD_NUMBER = 7;
      private Internal.IntList showTrendHead_;
      private byte memoizedIsInitialized;
      private static final S2C_HideTrendHead_9028 DEFAULT_INSTANCE = new S2C_HideTrendHead_9028();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HideTrendHead_9028> PARSER = new AbstractParser<S2C_HideTrendHead_9028>() {
         public S2C_HideTrendHead_9028 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HideTrendHead_9028(input, extensionRegistry);
         }
      };

      private S2C_HideTrendHead_9028(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HideTrendHead_9028() {
         this.memoizedIsInitialized = -1;
         this.showTrendHead_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HideTrendHead_9028();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HideTrendHead_9028(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 56:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.showTrendHead_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.showTrendHead_.addInt(input.readInt32());
                        break;
                     case 58:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.showTrendHead_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.showTrendHead_.addInt(input.readInt32());
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
                  this.showTrendHead_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_HideTrendHead_9028_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_HideTrendHead_9028_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HideTrendHead_9028.class, Builder.class);
      }

      public List<Integer> getShowTrendHeadList() {
         return this.showTrendHead_;
      }

      public int getShowTrendHeadCount() {
         return this.showTrendHead_.size();
      }

      public int getShowTrendHead(int index) {
         return this.showTrendHead_.getInt(index);
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
         for(int i = 0; i < this.showTrendHead_.size(); ++i) {
            output.writeInt32(7, this.showTrendHead_.getInt(i));
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

            for(int i = 0; i < this.showTrendHead_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.showTrendHead_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getShowTrendHeadList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HideTrendHead_9028)) {
            return super.equals(obj);
         } else {
            S2C_HideTrendHead_9028 other = (S2C_HideTrendHead_9028)obj;
            if (!this.getShowTrendHeadList().equals(other.getShowTrendHeadList())) {
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
            if (this.getShowTrendHeadCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getShowTrendHeadList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HideTrendHead_9028 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HideTrendHead_9028)PARSER.parseFrom(data);
      }

      public static S2C_HideTrendHead_9028 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HideTrendHead_9028)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HideTrendHead_9028 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HideTrendHead_9028)PARSER.parseFrom(data);
      }

      public static S2C_HideTrendHead_9028 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HideTrendHead_9028)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HideTrendHead_9028 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HideTrendHead_9028)PARSER.parseFrom(data);
      }

      public static S2C_HideTrendHead_9028 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HideTrendHead_9028)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HideTrendHead_9028 parseFrom(InputStream input) throws IOException {
         return (S2C_HideTrendHead_9028)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HideTrendHead_9028 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HideTrendHead_9028)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HideTrendHead_9028 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HideTrendHead_9028)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HideTrendHead_9028 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HideTrendHead_9028)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HideTrendHead_9028 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HideTrendHead_9028)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HideTrendHead_9028 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HideTrendHead_9028)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HideTrendHead_9028 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HideTrendHead_9028 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HideTrendHead_9028> parser() {
         return PARSER;
      }

      public Parser<S2C_HideTrendHead_9028> getParserForType() {
         return PARSER;
      }

      public S2C_HideTrendHead_9028 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HideTrendHead_9028OrBuilder {
         private int bitField0_;
         private Internal.IntList showTrendHead_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_HideTrendHead_9028_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_HideTrendHead_9028_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HideTrendHead_9028.class, Builder.class);
         }

         private Builder() {
            this.showTrendHead_ = MonarchMsg.S2C_HideTrendHead_9028.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.showTrendHead_ = MonarchMsg.S2C_HideTrendHead_9028.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MonarchMsg.S2C_HideTrendHead_9028.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.showTrendHead_ = MonarchMsg.S2C_HideTrendHead_9028.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MonarchMsg.internal_static_monarch_com_gzbz_protobuf_S2C_HideTrendHead_9028_descriptor;
         }

         public S2C_HideTrendHead_9028 getDefaultInstanceForType() {
            return MonarchMsg.S2C_HideTrendHead_9028.getDefaultInstance();
         }

         public S2C_HideTrendHead_9028 build() {
            S2C_HideTrendHead_9028 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HideTrendHead_9028 buildPartial() {
            S2C_HideTrendHead_9028 result = new S2C_HideTrendHead_9028(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.showTrendHead_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.showTrendHead_ = this.showTrendHead_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_HideTrendHead_9028) {
               return this.mergeFrom((S2C_HideTrendHead_9028)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HideTrendHead_9028 other) {
            if (other == MonarchMsg.S2C_HideTrendHead_9028.getDefaultInstance()) {
               return this;
            } else {
               if (!other.showTrendHead_.isEmpty()) {
                  if (this.showTrendHead_.isEmpty()) {
                     this.showTrendHead_ = other.showTrendHead_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureShowTrendHeadIsMutable();
                     this.showTrendHead_.addAll(other.showTrendHead_);
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
            S2C_HideTrendHead_9028 parsedMessage = null;

            try {
               parsedMessage = (S2C_HideTrendHead_9028)MonarchMsg.S2C_HideTrendHead_9028.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HideTrendHead_9028)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureShowTrendHeadIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.showTrendHead_ = MonarchMsg.S2C_HideTrendHead_9028.mutableCopy(this.showTrendHead_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getShowTrendHeadList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.showTrendHead_) : this.showTrendHead_);
         }

         public int getShowTrendHeadCount() {
            return this.showTrendHead_.size();
         }

         public int getShowTrendHead(int index) {
            return this.showTrendHead_.getInt(index);
         }

         public Builder setShowTrendHead(int index, int value) {
            this.ensureShowTrendHeadIsMutable();
            this.showTrendHead_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addShowTrendHead(int value) {
            this.ensureShowTrendHeadIsMutable();
            this.showTrendHead_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllShowTrendHead(Iterable<? extends Integer> values) {
            this.ensureShowTrendHeadIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.showTrendHead_);
            this.onChanged();
            return this;
         }

         public Builder clearShowTrendHead() {
            this.showTrendHead_ = MonarchMsg.S2C_HideTrendHead_9028.emptyIntList();
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

   public interface C2S_ActivationMonarch_9012OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasId();

      int getId();
   }

   public interface C2S_AlterProvince_9009OrBuilder extends MessageOrBuilder {
      boolean hasProvinceId();

      int getProvinceId();

      boolean hasCityId();

      int getCityId();
   }

   public interface C2S_AlterRoleName_9007OrBuilder extends MessageOrBuilder {
      boolean hasRoleName();

      String getRoleName();

      ByteString getRoleNameBytes();
   }

   public interface C2S_BugFeedback_9011OrBuilder extends MessageOrBuilder {
      boolean hasTitle();

      String getTitle();

      ByteString getTitleBytes();

      boolean hasMessage();

      String getMessage();

      ByteString getMessageBytes();
   }

   public interface C2S_HideTrendHead_9027OrBuilder extends MessageOrBuilder {
      boolean hasHideTrendHead();

      boolean getHideTrendHead();

      boolean hasHeadId();

      int getHeadId();
   }

   public interface C2S_MonarchChangeInfo_9003OrBuilder extends MessageOrBuilder {
      boolean hasChangeId();

      int getChangeId();

      boolean hasChangeType();

      int getChangeType();
   }

   public interface C2S_MonarchInfo_9001OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface C2S_NativeHead_9023OrBuilder extends MessageOrBuilder {
      boolean hasTimeStamp();

      int getTimeStamp();
   }

   public interface C2S_PrestigeTaskList_9021OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PrestigeUpLv_9025OrBuilder extends MessageOrBuilder {
      boolean hasItemCode();

      int getItemCode();
   }

   public interface C2S_UnderDressPrestige_9014OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_UnderDressSecondTitle_9018OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WearSecondTitle_9016OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface MonarchItemOrBuilder extends MessageOrBuilder {
      boolean hasIdx();

      int getIdx();

      boolean hasAcquireTime();

      int getAcquireTime();

      boolean hasAgingTime();

      int getAgingTime();

      boolean hasIfUse();

      boolean getIfUse();

      boolean hasPrestigeLv();

      int getPrestigeLv();

      boolean hasName();

      String getName();

      ByteString getNameBytes();
   }

   public interface S2C_ActivationMonarch_9013OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasId();

      int getId();

      boolean hasResult();

      int getResult();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_AlterRoleName_9008OrBuilder extends MessageOrBuilder {
      boolean hasAlterNameNum();

      int getAlterNameNum();
   }

   public interface S2C_HideTrendHead_9028OrBuilder extends MessageOrBuilder {
      List<Integer> getShowTrendHeadList();

      int getShowTrendHeadCount();

      int getShowTrendHead(int index);
   }

   public interface S2C_MonarchAcquire_9006OrBuilder extends MessageOrBuilder {
      boolean hasIdx();

      int getIdx();

      boolean hasType();

      int getType();

      boolean hasItem();

      MonarchItem getItem();

      MonarchItemOrBuilder getItemOrBuilder();
   }

   public interface S2C_MonarchChangeInfo_9004OrBuilder extends MessageOrBuilder {
      boolean hasIdx();

      int getIdx();

      boolean hasChangeType();

      int getChangeType();

      boolean hasOldId();

      int getOldId();
   }

   public interface S2C_MonarchInfo_9002OrBuilder extends MessageOrBuilder {
      boolean hasAlterName();

      int getAlterName();

      List<MonarchItem> getHeadFramesList();

      MonarchItem getHeadFrames(int index);

      int getHeadFramesCount();

      List<? extends MonarchItemOrBuilder> getHeadFramesOrBuilderList();

      MonarchItemOrBuilder getHeadFramesOrBuilder(int index);

      List<MonarchItem> getPrestigesList();

      MonarchItem getPrestiges(int index);

      int getPrestigesCount();

      List<? extends MonarchItemOrBuilder> getPrestigesOrBuilderList();

      MonarchItemOrBuilder getPrestigesOrBuilder(int index);

      List<Integer> getSkinIdsList();

      int getSkinIdsCount();

      int getSkinIds(int index);

      List<Integer> getHeadsList();

      int getHeadsCount();

      int getHeads(int index);

      List<Integer> getTrendHeadsList();

      int getTrendHeadsCount();

      int getTrendHeads(int index);

      List<Integer> getShowTrendHeadList();

      int getShowTrendHeadCount();

      int getShowTrendHead(int index);
   }

   public interface S2C_NativeHead_9024OrBuilder extends MessageOrBuilder {
      boolean hasTimeStamp();

      int getTimeStamp();
   }

   public interface S2C_NotifyHead_9020OrBuilder extends MessageOrBuilder {
      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);

      boolean hasType();

      int getType();
   }

   public interface S2C_PrestigeTaskList_9022OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskListList();

      CommonMsg.Task getTaskList(int index);

      int getTaskListCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index);
   }

   public interface S2C_PrestigeUpLv_9026OrBuilder extends MessageOrBuilder {
      boolean hasPrestige();

      MonarchItem getPrestige();

      MonarchItemOrBuilder getPrestigeOrBuilder();
   }

   public interface S2C_UnderDressPrestige_9015OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_UnderDressSecondTitle_9019OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_WearSecondTitle_9017OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }
}
