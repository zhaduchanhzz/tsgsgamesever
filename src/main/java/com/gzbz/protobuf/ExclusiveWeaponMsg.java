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

public final class ExclusiveWeaponMsg {
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_WearStatus_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_WearStatus_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LvUp_24501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LvUp_24501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LvUp_24502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LvUp_24502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_StarUp_24503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_StarUp_24503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_StarUp_24504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_StarUp_24504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Wear_24505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Wear_24505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Wear_24506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Wear_24506_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Undress_24507_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Undress_24507_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Undress_24508_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Undress_24508_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_UnlockLibraryInfo_24509_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_UnlockLibraryInfo_24509_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_UnlockLibraryInfo_24510_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_UnlockLibraryInfo_24510_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Decompose_24511_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Decompose_24511_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Decompose_24512_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Decompose_24512_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Inherit_24513_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Inherit_24513_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Inherit_24514_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Inherit_24514_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Reset_24515_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Reset_24515_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Reset_24516_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Reset_24516_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LearnSoulSkill_24517_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LearnSoulSkill_24517_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LearnSoulSkill_24518_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LearnSoulSkill_24518_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Lock_24519_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Lock_24519_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Lock_24520_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Lock_24520_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticeInfo_24521_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticeInfo_24521_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticeInfo_24522_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticeInfo_24522_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticePointUnlock_24523_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticePointUnlock_24523_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticePointUnlock_24524_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticePointUnlock_24524_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_WeaponLibStarUp_24525_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_WeaponLibStarUp_24525_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_WeaponLibStarUp_24526_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_WeaponLibStarUp_24526_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ExclusiveWeaponMsg() {
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
      String[] descriptorData = new String[]{"\n\u0015ExclusiveWeapon.proto\u0012!exclusiveWeapon.com.gzbz.protobuf\u001a\fcommon.proto\"c\n\nWearStatus\u0012\u000e\n\u0006status\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0001(\u0005\u0012!\n\u0003pos\u0018\u0003 \u0001(\u000e2\u0014.common.WearPosition\u0012\u0010\n\bitemCode\u0018\u0004 \u0001(\u0005\"S\n\u000eC2S_LvUp_24501\u0012A\n\nwearStatus\u0018\u0001 \u0002(\u000b2-.exclusiveWeapon.com.gzbz.protobuf.WearStatus\"\u0010\n\u000eS2C_LvUp_24502\"k\n\u0010C2S_StarUp_24503\u0012A\n\nwearStatus\u0018\u0001 \u0002(\u000b2-.exclusiveWeapon.com.gzbz.protobuf.WearStatus\u0012\u0014\n\fcostItemCode\u0018\u0002 \u0003(\u0005\"\u0012\n\u0010S2C_StarUp_24504\"\u0088\u0001\n\u000eC2S_Wear_24505\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012!\n\u0003pos\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\u0012A\n\nwearStatus\u0018\u0003 \u0002(\u000b2-.exclusiveWeapon.com.gzbz.protobuf.WearStatus\"\u0010\n\u000eS2C_Wear_24506\"H\n\u0011C2S_Undress_24507\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012!\n\u0003pos\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\"\u0013\n\u0011S2C_Undress_24508\"\u001d\n\u001bC2S_UnlockLibraryInfo_24509\"l\n\u001bS2C_UnlockLibraryInfo_24510\u0012'\n\fweaponIdStar\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\u0012$\n\tweaponLib\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\"'\n\u0013C2S_Decompose_24511\u0012\u0010\n\bitemCode\u0018\u0001 \u0003(\u0005\"\u0015\n\u0013S2C_Decompose_24512\"\u0094\u0001\n\u0011C2S_Inherit_24513\u0012=\n\u0006source\u0018\u0001 \u0002(\u000b2-.exclusiveWeapon.com.gzbz.protobuf.WearStatus\u0012@\n\tbeInherit\u0018\u0002 \u0002(\u000b2-.exclusiveWeapon.com.gzbz.protobuf.WearStatus\"\u0013\n\u0011S2C_Inherit_24514\"b\n\u000fC2S_Reset_24515\u0012A\n\nwearStatus\u0018\u0001 \u0002(\u000b2-.exclusiveWeapon.com.gzbz.protobuf.WearStatus\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\"\u0011\n\u000fS2C_Reset_24516\"K\n\u0018C2S_LearnSoulSkill_24517\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004slot\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0003 \u0002(\u0005\"\u001a\n\u0018S2C_LearnSoulSkill_24518\"a\n\u000eC2S_Lock_24519\u0012A\n\nwearStatus\u0018\u0001 \u0002(\u000b2-.exclusiveWeapon.com.gzbz.protobuf.WearStatus\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\"\u0010\n\u000eS2C_Lock_24520\"\u0016\n\u0014C2S_NoticeInfo_24521\"(\n\u0014S2C_NoticeInfo_24522\u0012\u0010\n\bunlockId\u0018\u0001 \u0003(\u0005\"\u001d\n\u001bC2S_NoticePointUnlock_24523\"/\n\u001bS2C_NoticePointUnlock_24524\u0012\u0010\n\bunlockId\u0018\u0001 \u0003(\u0005\";\n\u0019C2S_WeaponLibStarUp_24525\u0012\u0010\n\bweaponId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004star\u0018\u0002 \u0002(\u0005\"j\n\u0019S2C_WeaponLibStarUp_24526\u0012'\n\fweaponIdStar\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\u0012$\n\tweaponLib\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataIIB)\n\u0011com.gzbz.protobufB\u0012ExclusiveWeaponMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_WearStatus_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_WearStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_WearStatus_descriptor, new String[]{"Status", "HeroCode", "Pos", "ItemCode"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LvUp_24501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LvUp_24501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LvUp_24501_descriptor, new String[]{"WearStatus"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LvUp_24502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LvUp_24502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LvUp_24502_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_StarUp_24503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_StarUp_24503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_StarUp_24503_descriptor, new String[]{"WearStatus", "CostItemCode"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_StarUp_24504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_StarUp_24504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_StarUp_24504_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Wear_24505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Wear_24505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Wear_24505_descriptor, new String[]{"HeroCode", "Pos", "WearStatus"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Wear_24506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Wear_24506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Wear_24506_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Undress_24507_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Undress_24507_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Undress_24507_descriptor, new String[]{"HeroCode", "Pos"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Undress_24508_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Undress_24508_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Undress_24508_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_UnlockLibraryInfo_24509_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_UnlockLibraryInfo_24509_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_UnlockLibraryInfo_24509_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_UnlockLibraryInfo_24510_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_UnlockLibraryInfo_24510_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_UnlockLibraryInfo_24510_descriptor, new String[]{"WeaponIdStar", "WeaponLib"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Decompose_24511_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Decompose_24511_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Decompose_24511_descriptor, new String[]{"ItemCode"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Decompose_24512_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Decompose_24512_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Decompose_24512_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Inherit_24513_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Inherit_24513_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Inherit_24513_descriptor, new String[]{"Source", "BeInherit"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Inherit_24514_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Inherit_24514_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Inherit_24514_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Reset_24515_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Reset_24515_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Reset_24515_descriptor, new String[]{"WearStatus", "Type"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Reset_24516_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Reset_24516_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Reset_24516_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LearnSoulSkill_24517_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LearnSoulSkill_24517_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LearnSoulSkill_24517_descriptor, new String[]{"HeroCode", "Slot", "SkillId"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LearnSoulSkill_24518_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LearnSoulSkill_24518_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LearnSoulSkill_24518_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Lock_24519_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Lock_24519_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Lock_24519_descriptor, new String[]{"WearStatus", "Type"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Lock_24520_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Lock_24520_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Lock_24520_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticeInfo_24521_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticeInfo_24521_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticeInfo_24521_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticeInfo_24522_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticeInfo_24522_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticeInfo_24522_descriptor, new String[]{"UnlockId"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticePointUnlock_24523_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticePointUnlock_24523_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticePointUnlock_24523_descriptor, new String[0]);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticePointUnlock_24524_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticePointUnlock_24524_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticePointUnlock_24524_descriptor, new String[]{"UnlockId"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_WeaponLibStarUp_24525_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_WeaponLibStarUp_24525_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_WeaponLibStarUp_24525_descriptor, new String[]{"WeaponId", "Star"});
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_WeaponLibStarUp_24526_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_WeaponLibStarUp_24526_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_WeaponLibStarUp_24526_descriptor, new String[]{"WeaponIdStar", "WeaponLib"});
      CommonMsg.getDescriptor();
   }

   public static final class WearStatus extends GeneratedMessageV3 implements WearStatusOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATUS_FIELD_NUMBER = 1;
      private int status_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int POS_FIELD_NUMBER = 3;
      private int pos_;
      public static final int ITEMCODE_FIELD_NUMBER = 4;
      private int itemCode_;
      private byte memoizedIsInitialized;
      private static final WearStatus DEFAULT_INSTANCE = new WearStatus();
      /** @deprecated */
      @Deprecated
      public static final Parser<WearStatus> PARSER = new AbstractParser<WearStatus>() {
         public WearStatus parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WearStatus(input, extensionRegistry);
         }
      };

      private WearStatus(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WearStatus() {
         this.memoizedIsInitialized = -1;
         this.pos_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WearStatus();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WearStatus(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.status_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.pos_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_WearStatus_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_WearStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(WearStatus.class, Builder.class);
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStatus() {
         return this.status_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPos() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.WearPosition getPos() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.pos_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 8) != 0;
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
            output.writeInt32(1, this.status_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.pos_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.itemCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.status_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.pos_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.itemCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WearStatus)) {
            return super.equals(obj);
         } else {
            WearStatus other = (WearStatus)obj;
            if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.getStatus() != other.getStatus()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.pos_ != other.pos_) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
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
            if (this.hasStatus()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStatus();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPos()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.pos_;
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getItemCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WearStatus parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WearStatus)PARSER.parseFrom(data);
      }

      public static WearStatus parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WearStatus)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WearStatus parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WearStatus)PARSER.parseFrom(data);
      }

      public static WearStatus parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WearStatus)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WearStatus parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WearStatus)PARSER.parseFrom(data);
      }

      public static WearStatus parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WearStatus)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WearStatus parseFrom(InputStream input) throws IOException {
         return (WearStatus)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WearStatus parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WearStatus)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WearStatus parseDelimitedFrom(InputStream input) throws IOException {
         return (WearStatus)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WearStatus parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WearStatus)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WearStatus parseFrom(CodedInputStream input) throws IOException {
         return (WearStatus)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WearStatus parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WearStatus)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WearStatus prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WearStatus getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WearStatus> parser() {
         return PARSER;
      }

      public Parser<WearStatus> getParserForType() {
         return PARSER;
      }

      public WearStatus getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WearStatusOrBuilder {
         private int bitField0_;
         private int status_;
         private int heroCode_;
         private int pos_;
         private int itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_WearStatus_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_WearStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(WearStatus.class, Builder.class);
         }

         private Builder() {
            this.pos_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.pos_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.WearStatus.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.status_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.pos_ = 1;
            this.bitField0_ &= -5;
            this.itemCode_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_WearStatus_descriptor;
         }

         public WearStatus getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.WearStatus.getDefaultInstance();
         }

         public WearStatus build() {
            WearStatus result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WearStatus buildPartial() {
            WearStatus result = new WearStatus(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.status_ = this.status_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.pos_ = this.pos_;
            if ((from_bitField0_ & 8) != 0) {
               result.itemCode_ = this.itemCode_;
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
            if (other instanceof WearStatus) {
               return this.mergeFrom((WearStatus)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WearStatus other) {
            if (other == ExclusiveWeaponMsg.WearStatus.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStatus();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WearStatus parsedMessage = null;

            try {
               parsedMessage = (WearStatus)ExclusiveWeaponMsg.WearStatus.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WearStatus)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStatus() {
            return this.status_;
         }

         public Builder setStatus(int value) {
            this.bitField0_ |= 1;
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStatus() {
            this.bitField0_ &= -2;
            this.status_ = 0;
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

         public boolean hasPos() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.WearPosition getPos() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.pos_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPos(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.pos_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPos() {
            this.bitField0_ &= -5;
            this.pos_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 8;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -9;
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

   public static final class C2S_LvUp_24501 extends GeneratedMessageV3 implements C2S_LvUp_24501OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEARSTATUS_FIELD_NUMBER = 1;
      private WearStatus wearStatus_;
      private byte memoizedIsInitialized;
      private static final C2S_LvUp_24501 DEFAULT_INSTANCE = new C2S_LvUp_24501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LvUp_24501> PARSER = new AbstractParser<C2S_LvUp_24501>() {
         public C2S_LvUp_24501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LvUp_24501(input, extensionRegistry);
         }
      };

      private C2S_LvUp_24501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LvUp_24501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LvUp_24501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LvUp_24501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        WearStatus.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.wearStatus_.toBuilder();
                        }

                        this.wearStatus_ = (WearStatus)input.readMessage(ExclusiveWeaponMsg.WearStatus.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.wearStatus_);
                           this.wearStatus_ = subBuilder.buildPartial();
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LvUp_24501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LvUp_24501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LvUp_24501.class, Builder.class);
      }

      public boolean hasWearStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public WearStatus getWearStatus() {
         return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
      }

      public WearStatusOrBuilder getWearStatusOrBuilder() {
         return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWearStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getWearStatus().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getWearStatus());
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
               size += CodedOutputStream.computeMessageSize(1, this.getWearStatus());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LvUp_24501)) {
            return super.equals(obj);
         } else {
            C2S_LvUp_24501 other = (C2S_LvUp_24501)obj;
            if (this.hasWearStatus() != other.hasWearStatus()) {
               return false;
            } else if (this.hasWearStatus() && !this.getWearStatus().equals(other.getWearStatus())) {
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
            if (this.hasWearStatus()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWearStatus().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LvUp_24501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LvUp_24501)PARSER.parseFrom(data);
      }

      public static C2S_LvUp_24501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LvUp_24501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LvUp_24501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LvUp_24501)PARSER.parseFrom(data);
      }

      public static C2S_LvUp_24501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LvUp_24501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LvUp_24501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LvUp_24501)PARSER.parseFrom(data);
      }

      public static C2S_LvUp_24501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LvUp_24501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LvUp_24501 parseFrom(InputStream input) throws IOException {
         return (C2S_LvUp_24501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LvUp_24501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LvUp_24501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LvUp_24501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LvUp_24501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LvUp_24501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LvUp_24501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LvUp_24501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LvUp_24501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LvUp_24501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LvUp_24501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LvUp_24501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LvUp_24501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LvUp_24501> parser() {
         return PARSER;
      }

      public Parser<C2S_LvUp_24501> getParserForType() {
         return PARSER;
      }

      public C2S_LvUp_24501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LvUp_24501OrBuilder {
         private int bitField0_;
         private WearStatus wearStatus_;
         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> wearStatusBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LvUp_24501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LvUp_24501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LvUp_24501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_LvUp_24501.alwaysUseFieldBuilders) {
               this.getWearStatusFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = null;
            } else {
               this.wearStatusBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LvUp_24501_descriptor;
         }

         public C2S_LvUp_24501 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_LvUp_24501.getDefaultInstance();
         }

         public C2S_LvUp_24501 build() {
            C2S_LvUp_24501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LvUp_24501 buildPartial() {
            C2S_LvUp_24501 result = new C2S_LvUp_24501(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.wearStatusBuilder_ == null) {
                  result.wearStatus_ = this.wearStatus_;
               } else {
                  result.wearStatus_ = (WearStatus)this.wearStatusBuilder_.build();
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
            if (other instanceof C2S_LvUp_24501) {
               return this.mergeFrom((C2S_LvUp_24501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LvUp_24501 other) {
            if (other == ExclusiveWeaponMsg.C2S_LvUp_24501.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWearStatus()) {
                  this.mergeWearStatus(other.getWearStatus());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWearStatus()) {
               return false;
            } else {
               return this.getWearStatus().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LvUp_24501 parsedMessage = null;

            try {
               parsedMessage = (C2S_LvUp_24501)ExclusiveWeaponMsg.C2S_LvUp_24501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LvUp_24501)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWearStatus() {
            return (this.bitField0_ & 1) != 0;
         }

         public WearStatus getWearStatus() {
            if (this.wearStatusBuilder_ == null) {
               return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
            } else {
               return (WearStatus)this.wearStatusBuilder_.getMessage();
            }
         }

         public Builder setWearStatus(WearStatus value) {
            if (this.wearStatusBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.wearStatus_ = value;
               this.onChanged();
            } else {
               this.wearStatusBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setWearStatus(WearStatus.Builder builderForValue) {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = builderForValue.build();
               this.onChanged();
            } else {
               this.wearStatusBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeWearStatus(WearStatus value) {
            if (this.wearStatusBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.wearStatus_ != null && this.wearStatus_ != ExclusiveWeaponMsg.WearStatus.getDefaultInstance()) {
                  this.wearStatus_ = ExclusiveWeaponMsg.WearStatus.newBuilder(this.wearStatus_).mergeFrom(value).buildPartial();
               } else {
                  this.wearStatus_ = value;
               }

               this.onChanged();
            } else {
               this.wearStatusBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearWearStatus() {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = null;
               this.onChanged();
            } else {
               this.wearStatusBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WearStatus.Builder getWearStatusBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WearStatus.Builder)this.getWearStatusFieldBuilder().getBuilder();
         }

         public WearStatusOrBuilder getWearStatusOrBuilder() {
            if (this.wearStatusBuilder_ != null) {
               return (WearStatusOrBuilder)this.wearStatusBuilder_.getMessageOrBuilder();
            } else {
               return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
            }
         }

         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> getWearStatusFieldBuilder() {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatusBuilder_ = new SingleFieldBuilderV3(this.getWearStatus(), this.getParentForChildren(), this.isClean());
               this.wearStatus_ = null;
            }

            return this.wearStatusBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_LvUp_24502 extends GeneratedMessageV3 implements S2C_LvUp_24502OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_LvUp_24502 DEFAULT_INSTANCE = new S2C_LvUp_24502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LvUp_24502> PARSER = new AbstractParser<S2C_LvUp_24502>() {
         public S2C_LvUp_24502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LvUp_24502(input, extensionRegistry);
         }
      };

      private S2C_LvUp_24502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LvUp_24502() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LvUp_24502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LvUp_24502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LvUp_24502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LvUp_24502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LvUp_24502.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LvUp_24502)) {
            return super.equals(obj);
         } else {
            S2C_LvUp_24502 other = (S2C_LvUp_24502)obj;
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

      public static S2C_LvUp_24502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LvUp_24502)PARSER.parseFrom(data);
      }

      public static S2C_LvUp_24502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LvUp_24502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LvUp_24502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LvUp_24502)PARSER.parseFrom(data);
      }

      public static S2C_LvUp_24502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LvUp_24502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LvUp_24502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LvUp_24502)PARSER.parseFrom(data);
      }

      public static S2C_LvUp_24502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LvUp_24502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LvUp_24502 parseFrom(InputStream input) throws IOException {
         return (S2C_LvUp_24502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LvUp_24502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LvUp_24502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LvUp_24502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LvUp_24502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LvUp_24502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LvUp_24502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LvUp_24502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LvUp_24502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LvUp_24502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LvUp_24502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LvUp_24502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LvUp_24502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LvUp_24502> parser() {
         return PARSER;
      }

      public Parser<S2C_LvUp_24502> getParserForType() {
         return PARSER;
      }

      public S2C_LvUp_24502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LvUp_24502OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LvUp_24502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LvUp_24502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LvUp_24502.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_LvUp_24502.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LvUp_24502_descriptor;
         }

         public S2C_LvUp_24502 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_LvUp_24502.getDefaultInstance();
         }

         public S2C_LvUp_24502 build() {
            S2C_LvUp_24502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LvUp_24502 buildPartial() {
            S2C_LvUp_24502 result = new S2C_LvUp_24502(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_LvUp_24502) {
               return this.mergeFrom((S2C_LvUp_24502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LvUp_24502 other) {
            if (other == ExclusiveWeaponMsg.S2C_LvUp_24502.getDefaultInstance()) {
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
            S2C_LvUp_24502 parsedMessage = null;

            try {
               parsedMessage = (S2C_LvUp_24502)ExclusiveWeaponMsg.S2C_LvUp_24502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LvUp_24502)e.getUnfinishedMessage();
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

   public static final class C2S_StarUp_24503 extends GeneratedMessageV3 implements C2S_StarUp_24503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEARSTATUS_FIELD_NUMBER = 1;
      private WearStatus wearStatus_;
      public static final int COSTITEMCODE_FIELD_NUMBER = 2;
      private Internal.IntList costItemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_StarUp_24503 DEFAULT_INSTANCE = new C2S_StarUp_24503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StarUp_24503> PARSER = new AbstractParser<C2S_StarUp_24503>() {
         public C2S_StarUp_24503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StarUp_24503(input, extensionRegistry);
         }
      };

      private C2S_StarUp_24503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StarUp_24503() {
         this.memoizedIsInitialized = -1;
         this.costItemCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StarUp_24503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StarUp_24503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        WearStatus.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.wearStatus_.toBuilder();
                        }

                        this.wearStatus_ = (WearStatus)input.readMessage(ExclusiveWeaponMsg.WearStatus.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.wearStatus_);
                           this.wearStatus_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.costItemCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.costItemCode_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.costItemCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.costItemCode_.addInt(input.readInt32());
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
                  this.costItemCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_StarUp_24503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_StarUp_24503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StarUp_24503.class, Builder.class);
      }

      public boolean hasWearStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public WearStatus getWearStatus() {
         return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
      }

      public WearStatusOrBuilder getWearStatusOrBuilder() {
         return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
      }

      public List<Integer> getCostItemCodeList() {
         return this.costItemCode_;
      }

      public int getCostItemCodeCount() {
         return this.costItemCode_.size();
      }

      public int getCostItemCode(int index) {
         return this.costItemCode_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWearStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getWearStatus().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getWearStatus());
         }

         for(int i = 0; i < this.costItemCode_.size(); ++i) {
            output.writeInt32(2, this.costItemCode_.getInt(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getWearStatus());
            }

            int dataSize = 0;

            for(int i = 0; i < this.costItemCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.costItemCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCostItemCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StarUp_24503)) {
            return super.equals(obj);
         } else {
            C2S_StarUp_24503 other = (C2S_StarUp_24503)obj;
            if (this.hasWearStatus() != other.hasWearStatus()) {
               return false;
            } else if (this.hasWearStatus() && !this.getWearStatus().equals(other.getWearStatus())) {
               return false;
            } else if (!this.getCostItemCodeList().equals(other.getCostItemCodeList())) {
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
            if (this.hasWearStatus()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWearStatus().hashCode();
            }

            if (this.getCostItemCodeCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCostItemCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StarUp_24503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StarUp_24503)PARSER.parseFrom(data);
      }

      public static C2S_StarUp_24503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarUp_24503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarUp_24503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StarUp_24503)PARSER.parseFrom(data);
      }

      public static C2S_StarUp_24503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarUp_24503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarUp_24503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StarUp_24503)PARSER.parseFrom(data);
      }

      public static C2S_StarUp_24503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarUp_24503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarUp_24503 parseFrom(InputStream input) throws IOException {
         return (C2S_StarUp_24503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StarUp_24503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarUp_24503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StarUp_24503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StarUp_24503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StarUp_24503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarUp_24503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StarUp_24503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StarUp_24503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StarUp_24503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarUp_24503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StarUp_24503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StarUp_24503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StarUp_24503> parser() {
         return PARSER;
      }

      public Parser<C2S_StarUp_24503> getParserForType() {
         return PARSER;
      }

      public C2S_StarUp_24503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StarUp_24503OrBuilder {
         private int bitField0_;
         private WearStatus wearStatus_;
         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> wearStatusBuilder_;
         private Internal.IntList costItemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_StarUp_24503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_StarUp_24503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StarUp_24503.class, Builder.class);
         }

         private Builder() {
            this.costItemCode_ = ExclusiveWeaponMsg.C2S_StarUp_24503.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.costItemCode_ = ExclusiveWeaponMsg.C2S_StarUp_24503.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_StarUp_24503.alwaysUseFieldBuilders) {
               this.getWearStatusFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = null;
            } else {
               this.wearStatusBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.costItemCode_ = ExclusiveWeaponMsg.C2S_StarUp_24503.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_StarUp_24503_descriptor;
         }

         public C2S_StarUp_24503 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_StarUp_24503.getDefaultInstance();
         }

         public C2S_StarUp_24503 build() {
            C2S_StarUp_24503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StarUp_24503 buildPartial() {
            C2S_StarUp_24503 result = new C2S_StarUp_24503(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.wearStatusBuilder_ == null) {
                  result.wearStatus_ = this.wearStatus_;
               } else {
                  result.wearStatus_ = (WearStatus)this.wearStatusBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.costItemCode_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.costItemCode_ = this.costItemCode_;
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
            if (other instanceof C2S_StarUp_24503) {
               return this.mergeFrom((C2S_StarUp_24503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StarUp_24503 other) {
            if (other == ExclusiveWeaponMsg.C2S_StarUp_24503.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWearStatus()) {
                  this.mergeWearStatus(other.getWearStatus());
               }

               if (!other.costItemCode_.isEmpty()) {
                  if (this.costItemCode_.isEmpty()) {
                     this.costItemCode_ = other.costItemCode_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureCostItemCodeIsMutable();
                     this.costItemCode_.addAll(other.costItemCode_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWearStatus()) {
               return false;
            } else {
               return this.getWearStatus().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_StarUp_24503 parsedMessage = null;

            try {
               parsedMessage = (C2S_StarUp_24503)ExclusiveWeaponMsg.C2S_StarUp_24503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StarUp_24503)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWearStatus() {
            return (this.bitField0_ & 1) != 0;
         }

         public WearStatus getWearStatus() {
            if (this.wearStatusBuilder_ == null) {
               return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
            } else {
               return (WearStatus)this.wearStatusBuilder_.getMessage();
            }
         }

         public Builder setWearStatus(WearStatus value) {
            if (this.wearStatusBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.wearStatus_ = value;
               this.onChanged();
            } else {
               this.wearStatusBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setWearStatus(WearStatus.Builder builderForValue) {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = builderForValue.build();
               this.onChanged();
            } else {
               this.wearStatusBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeWearStatus(WearStatus value) {
            if (this.wearStatusBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.wearStatus_ != null && this.wearStatus_ != ExclusiveWeaponMsg.WearStatus.getDefaultInstance()) {
                  this.wearStatus_ = ExclusiveWeaponMsg.WearStatus.newBuilder(this.wearStatus_).mergeFrom(value).buildPartial();
               } else {
                  this.wearStatus_ = value;
               }

               this.onChanged();
            } else {
               this.wearStatusBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearWearStatus() {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = null;
               this.onChanged();
            } else {
               this.wearStatusBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WearStatus.Builder getWearStatusBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WearStatus.Builder)this.getWearStatusFieldBuilder().getBuilder();
         }

         public WearStatusOrBuilder getWearStatusOrBuilder() {
            if (this.wearStatusBuilder_ != null) {
               return (WearStatusOrBuilder)this.wearStatusBuilder_.getMessageOrBuilder();
            } else {
               return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
            }
         }

         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> getWearStatusFieldBuilder() {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatusBuilder_ = new SingleFieldBuilderV3(this.getWearStatus(), this.getParentForChildren(), this.isClean());
               this.wearStatus_ = null;
            }

            return this.wearStatusBuilder_;
         }

         private void ensureCostItemCodeIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.costItemCode_ = ExclusiveWeaponMsg.C2S_StarUp_24503.mutableCopy(this.costItemCode_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getCostItemCodeList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.costItemCode_) : this.costItemCode_);
         }

         public int getCostItemCodeCount() {
            return this.costItemCode_.size();
         }

         public int getCostItemCode(int index) {
            return this.costItemCode_.getInt(index);
         }

         public Builder setCostItemCode(int index, int value) {
            this.ensureCostItemCodeIsMutable();
            this.costItemCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCostItemCode(int value) {
            this.ensureCostItemCodeIsMutable();
            this.costItemCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCostItemCode(Iterable<? extends Integer> values) {
            this.ensureCostItemCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.costItemCode_);
            this.onChanged();
            return this;
         }

         public Builder clearCostItemCode() {
            this.costItemCode_ = ExclusiveWeaponMsg.C2S_StarUp_24503.emptyIntList();
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

   public static final class S2C_StarUp_24504 extends GeneratedMessageV3 implements S2C_StarUp_24504OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_StarUp_24504 DEFAULT_INSTANCE = new S2C_StarUp_24504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StarUp_24504> PARSER = new AbstractParser<S2C_StarUp_24504>() {
         public S2C_StarUp_24504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StarUp_24504(input, extensionRegistry);
         }
      };

      private S2C_StarUp_24504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StarUp_24504() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StarUp_24504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StarUp_24504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_StarUp_24504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_StarUp_24504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StarUp_24504.class, Builder.class);
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
         } else if (!(obj instanceof S2C_StarUp_24504)) {
            return super.equals(obj);
         } else {
            S2C_StarUp_24504 other = (S2C_StarUp_24504)obj;
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

      public static S2C_StarUp_24504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StarUp_24504)PARSER.parseFrom(data);
      }

      public static S2C_StarUp_24504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StarUp_24504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StarUp_24504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StarUp_24504)PARSER.parseFrom(data);
      }

      public static S2C_StarUp_24504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StarUp_24504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StarUp_24504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StarUp_24504)PARSER.parseFrom(data);
      }

      public static S2C_StarUp_24504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StarUp_24504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StarUp_24504 parseFrom(InputStream input) throws IOException {
         return (S2C_StarUp_24504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StarUp_24504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StarUp_24504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StarUp_24504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StarUp_24504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StarUp_24504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StarUp_24504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StarUp_24504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StarUp_24504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StarUp_24504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StarUp_24504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StarUp_24504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StarUp_24504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StarUp_24504> parser() {
         return PARSER;
      }

      public Parser<S2C_StarUp_24504> getParserForType() {
         return PARSER;
      }

      public S2C_StarUp_24504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StarUp_24504OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_StarUp_24504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_StarUp_24504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StarUp_24504.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_StarUp_24504.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_StarUp_24504_descriptor;
         }

         public S2C_StarUp_24504 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_StarUp_24504.getDefaultInstance();
         }

         public S2C_StarUp_24504 build() {
            S2C_StarUp_24504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StarUp_24504 buildPartial() {
            S2C_StarUp_24504 result = new S2C_StarUp_24504(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_StarUp_24504) {
               return this.mergeFrom((S2C_StarUp_24504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StarUp_24504 other) {
            if (other == ExclusiveWeaponMsg.S2C_StarUp_24504.getDefaultInstance()) {
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
            S2C_StarUp_24504 parsedMessage = null;

            try {
               parsedMessage = (S2C_StarUp_24504)ExclusiveWeaponMsg.S2C_StarUp_24504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StarUp_24504)e.getUnfinishedMessage();
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

   public static final class C2S_Wear_24505 extends GeneratedMessageV3 implements C2S_Wear_24505OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POS_FIELD_NUMBER = 2;
      private int pos_;
      public static final int WEARSTATUS_FIELD_NUMBER = 3;
      private WearStatus wearStatus_;
      private byte memoizedIsInitialized;
      private static final C2S_Wear_24505 DEFAULT_INSTANCE = new C2S_Wear_24505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Wear_24505> PARSER = new AbstractParser<C2S_Wear_24505>() {
         public C2S_Wear_24505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Wear_24505(input, extensionRegistry);
         }
      };

      private C2S_Wear_24505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Wear_24505() {
         this.memoizedIsInitialized = -1;
         this.pos_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Wear_24505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Wear_24505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.pos_ = rawValue;
                        }
                        break;
                     case 26:
                        WearStatus.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.wearStatus_.toBuilder();
                        }

                        this.wearStatus_ = (WearStatus)input.readMessage(ExclusiveWeaponMsg.WearStatus.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.wearStatus_);
                           this.wearStatus_ = subBuilder.buildPartial();
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Wear_24505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Wear_24505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Wear_24505.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPos() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.WearPosition getPos() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.pos_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasWearStatus() {
         return (this.bitField0_ & 4) != 0;
      }

      public WearStatus getWearStatus() {
         return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
      }

      public WearStatusOrBuilder getWearStatusOrBuilder() {
         return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
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
         } else if (!this.hasPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWearStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getWearStatus().isInitialized()) {
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
            output.writeEnum(2, this.pos_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getWearStatus());
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
               size += CodedOutputStream.computeEnumSize(2, this.pos_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getWearStatus());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Wear_24505)) {
            return super.equals(obj);
         } else {
            C2S_Wear_24505 other = (C2S_Wear_24505)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.pos_ != other.pos_) {
               return false;
            } else if (this.hasWearStatus() != other.hasWearStatus()) {
               return false;
            } else if (this.hasWearStatus() && !this.getWearStatus().equals(other.getWearStatus())) {
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

            if (this.hasPos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.pos_;
            }

            if (this.hasWearStatus()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWearStatus().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Wear_24505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Wear_24505)PARSER.parseFrom(data);
      }

      public static C2S_Wear_24505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Wear_24505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Wear_24505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Wear_24505)PARSER.parseFrom(data);
      }

      public static C2S_Wear_24505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Wear_24505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Wear_24505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Wear_24505)PARSER.parseFrom(data);
      }

      public static C2S_Wear_24505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Wear_24505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Wear_24505 parseFrom(InputStream input) throws IOException {
         return (C2S_Wear_24505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Wear_24505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Wear_24505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Wear_24505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Wear_24505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Wear_24505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Wear_24505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Wear_24505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Wear_24505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Wear_24505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Wear_24505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Wear_24505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Wear_24505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Wear_24505> parser() {
         return PARSER;
      }

      public Parser<C2S_Wear_24505> getParserForType() {
         return PARSER;
      }

      public C2S_Wear_24505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Wear_24505OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int pos_;
         private WearStatus wearStatus_;
         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> wearStatusBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Wear_24505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Wear_24505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Wear_24505.class, Builder.class);
         }

         private Builder() {
            this.pos_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.pos_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_Wear_24505.alwaysUseFieldBuilders) {
               this.getWearStatusFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.pos_ = 1;
            this.bitField0_ &= -3;
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = null;
            } else {
               this.wearStatusBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Wear_24505_descriptor;
         }

         public C2S_Wear_24505 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_Wear_24505.getDefaultInstance();
         }

         public C2S_Wear_24505 build() {
            C2S_Wear_24505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Wear_24505 buildPartial() {
            C2S_Wear_24505 result = new C2S_Wear_24505(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.pos_ = this.pos_;
            if ((from_bitField0_ & 4) != 0) {
               if (this.wearStatusBuilder_ == null) {
                  result.wearStatus_ = this.wearStatus_;
               } else {
                  result.wearStatus_ = (WearStatus)this.wearStatusBuilder_.build();
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
            if (other instanceof C2S_Wear_24505) {
               return this.mergeFrom((C2S_Wear_24505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Wear_24505 other) {
            if (other == ExclusiveWeaponMsg.C2S_Wear_24505.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               if (other.hasWearStatus()) {
                  this.mergeWearStatus(other.getWearStatus());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPos()) {
               return false;
            } else if (!this.hasWearStatus()) {
               return false;
            } else {
               return this.getWearStatus().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Wear_24505 parsedMessage = null;

            try {
               parsedMessage = (C2S_Wear_24505)ExclusiveWeaponMsg.C2S_Wear_24505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Wear_24505)e.getUnfinishedMessage();
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

         public boolean hasPos() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.WearPosition getPos() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.pos_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPos(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.pos_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPos() {
            this.bitField0_ &= -3;
            this.pos_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasWearStatus() {
            return (this.bitField0_ & 4) != 0;
         }

         public WearStatus getWearStatus() {
            if (this.wearStatusBuilder_ == null) {
               return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
            } else {
               return (WearStatus)this.wearStatusBuilder_.getMessage();
            }
         }

         public Builder setWearStatus(WearStatus value) {
            if (this.wearStatusBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.wearStatus_ = value;
               this.onChanged();
            } else {
               this.wearStatusBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setWearStatus(WearStatus.Builder builderForValue) {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = builderForValue.build();
               this.onChanged();
            } else {
               this.wearStatusBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeWearStatus(WearStatus value) {
            if (this.wearStatusBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.wearStatus_ != null && this.wearStatus_ != ExclusiveWeaponMsg.WearStatus.getDefaultInstance()) {
                  this.wearStatus_ = ExclusiveWeaponMsg.WearStatus.newBuilder(this.wearStatus_).mergeFrom(value).buildPartial();
               } else {
                  this.wearStatus_ = value;
               }

               this.onChanged();
            } else {
               this.wearStatusBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearWearStatus() {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = null;
               this.onChanged();
            } else {
               this.wearStatusBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public WearStatus.Builder getWearStatusBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (WearStatus.Builder)this.getWearStatusFieldBuilder().getBuilder();
         }

         public WearStatusOrBuilder getWearStatusOrBuilder() {
            if (this.wearStatusBuilder_ != null) {
               return (WearStatusOrBuilder)this.wearStatusBuilder_.getMessageOrBuilder();
            } else {
               return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
            }
         }

         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> getWearStatusFieldBuilder() {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatusBuilder_ = new SingleFieldBuilderV3(this.getWearStatus(), this.getParentForChildren(), this.isClean());
               this.wearStatus_ = null;
            }

            return this.wearStatusBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Wear_24506 extends GeneratedMessageV3 implements S2C_Wear_24506OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_Wear_24506 DEFAULT_INSTANCE = new S2C_Wear_24506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Wear_24506> PARSER = new AbstractParser<S2C_Wear_24506>() {
         public S2C_Wear_24506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Wear_24506(input, extensionRegistry);
         }
      };

      private S2C_Wear_24506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Wear_24506() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Wear_24506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Wear_24506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Wear_24506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Wear_24506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Wear_24506.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Wear_24506)) {
            return super.equals(obj);
         } else {
            S2C_Wear_24506 other = (S2C_Wear_24506)obj;
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

      public static S2C_Wear_24506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Wear_24506)PARSER.parseFrom(data);
      }

      public static S2C_Wear_24506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Wear_24506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Wear_24506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Wear_24506)PARSER.parseFrom(data);
      }

      public static S2C_Wear_24506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Wear_24506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Wear_24506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Wear_24506)PARSER.parseFrom(data);
      }

      public static S2C_Wear_24506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Wear_24506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Wear_24506 parseFrom(InputStream input) throws IOException {
         return (S2C_Wear_24506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Wear_24506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Wear_24506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Wear_24506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Wear_24506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Wear_24506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Wear_24506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Wear_24506 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Wear_24506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Wear_24506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Wear_24506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Wear_24506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Wear_24506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Wear_24506> parser() {
         return PARSER;
      }

      public Parser<S2C_Wear_24506> getParserForType() {
         return PARSER;
      }

      public S2C_Wear_24506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Wear_24506OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Wear_24506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Wear_24506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Wear_24506.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_Wear_24506.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Wear_24506_descriptor;
         }

         public S2C_Wear_24506 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_Wear_24506.getDefaultInstance();
         }

         public S2C_Wear_24506 build() {
            S2C_Wear_24506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Wear_24506 buildPartial() {
            S2C_Wear_24506 result = new S2C_Wear_24506(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_Wear_24506) {
               return this.mergeFrom((S2C_Wear_24506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Wear_24506 other) {
            if (other == ExclusiveWeaponMsg.S2C_Wear_24506.getDefaultInstance()) {
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
            S2C_Wear_24506 parsedMessage = null;

            try {
               parsedMessage = (S2C_Wear_24506)ExclusiveWeaponMsg.S2C_Wear_24506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Wear_24506)e.getUnfinishedMessage();
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

   public static final class C2S_Undress_24507 extends GeneratedMessageV3 implements C2S_Undress_24507OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POS_FIELD_NUMBER = 2;
      private int pos_;
      private byte memoizedIsInitialized;
      private static final C2S_Undress_24507 DEFAULT_INSTANCE = new C2S_Undress_24507();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Undress_24507> PARSER = new AbstractParser<C2S_Undress_24507>() {
         public C2S_Undress_24507 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Undress_24507(input, extensionRegistry);
         }
      };

      private C2S_Undress_24507(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Undress_24507() {
         this.memoizedIsInitialized = -1;
         this.pos_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Undress_24507();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Undress_24507(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.pos_ = rawValue;
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Undress_24507_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Undress_24507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Undress_24507.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPos() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.WearPosition getPos() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.pos_);
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
         } else if (!this.hasPos()) {
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
            output.writeEnum(2, this.pos_);
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
               size += CodedOutputStream.computeEnumSize(2, this.pos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Undress_24507)) {
            return super.equals(obj);
         } else {
            C2S_Undress_24507 other = (C2S_Undress_24507)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.pos_ != other.pos_) {
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

            if (this.hasPos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.pos_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Undress_24507 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Undress_24507)PARSER.parseFrom(data);
      }

      public static C2S_Undress_24507 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Undress_24507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Undress_24507 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Undress_24507)PARSER.parseFrom(data);
      }

      public static C2S_Undress_24507 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Undress_24507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Undress_24507 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Undress_24507)PARSER.parseFrom(data);
      }

      public static C2S_Undress_24507 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Undress_24507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Undress_24507 parseFrom(InputStream input) throws IOException {
         return (C2S_Undress_24507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Undress_24507 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Undress_24507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Undress_24507 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Undress_24507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Undress_24507 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Undress_24507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Undress_24507 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Undress_24507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Undress_24507 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Undress_24507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Undress_24507 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Undress_24507 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Undress_24507> parser() {
         return PARSER;
      }

      public Parser<C2S_Undress_24507> getParserForType() {
         return PARSER;
      }

      public C2S_Undress_24507 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Undress_24507OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int pos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Undress_24507_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Undress_24507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Undress_24507.class, Builder.class);
         }

         private Builder() {
            this.pos_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.pos_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_Undress_24507.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.pos_ = 1;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Undress_24507_descriptor;
         }

         public C2S_Undress_24507 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_Undress_24507.getDefaultInstance();
         }

         public C2S_Undress_24507 build() {
            C2S_Undress_24507 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Undress_24507 buildPartial() {
            C2S_Undress_24507 result = new C2S_Undress_24507(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.pos_ = this.pos_;
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
            if (other instanceof C2S_Undress_24507) {
               return this.mergeFrom((C2S_Undress_24507)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Undress_24507 other) {
            if (other == ExclusiveWeaponMsg.C2S_Undress_24507.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPos()) {
                  this.setPos(other.getPos());
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
               return this.hasPos();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Undress_24507 parsedMessage = null;

            try {
               parsedMessage = (C2S_Undress_24507)ExclusiveWeaponMsg.C2S_Undress_24507.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Undress_24507)e.getUnfinishedMessage();
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

         public boolean hasPos() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.WearPosition getPos() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.pos_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPos(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.pos_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPos() {
            this.bitField0_ &= -3;
            this.pos_ = 1;
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

   public static final class S2C_Undress_24508 extends GeneratedMessageV3 implements S2C_Undress_24508OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_Undress_24508 DEFAULT_INSTANCE = new S2C_Undress_24508();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Undress_24508> PARSER = new AbstractParser<S2C_Undress_24508>() {
         public S2C_Undress_24508 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Undress_24508(input, extensionRegistry);
         }
      };

      private S2C_Undress_24508(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Undress_24508() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Undress_24508();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Undress_24508(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Undress_24508_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Undress_24508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Undress_24508.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Undress_24508)) {
            return super.equals(obj);
         } else {
            S2C_Undress_24508 other = (S2C_Undress_24508)obj;
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

      public static S2C_Undress_24508 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Undress_24508)PARSER.parseFrom(data);
      }

      public static S2C_Undress_24508 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Undress_24508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Undress_24508 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Undress_24508)PARSER.parseFrom(data);
      }

      public static S2C_Undress_24508 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Undress_24508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Undress_24508 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Undress_24508)PARSER.parseFrom(data);
      }

      public static S2C_Undress_24508 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Undress_24508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Undress_24508 parseFrom(InputStream input) throws IOException {
         return (S2C_Undress_24508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Undress_24508 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Undress_24508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Undress_24508 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Undress_24508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Undress_24508 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Undress_24508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Undress_24508 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Undress_24508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Undress_24508 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Undress_24508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Undress_24508 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Undress_24508 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Undress_24508> parser() {
         return PARSER;
      }

      public Parser<S2C_Undress_24508> getParserForType() {
         return PARSER;
      }

      public S2C_Undress_24508 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Undress_24508OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Undress_24508_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Undress_24508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Undress_24508.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_Undress_24508.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Undress_24508_descriptor;
         }

         public S2C_Undress_24508 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_Undress_24508.getDefaultInstance();
         }

         public S2C_Undress_24508 build() {
            S2C_Undress_24508 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Undress_24508 buildPartial() {
            S2C_Undress_24508 result = new S2C_Undress_24508(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_Undress_24508) {
               return this.mergeFrom((S2C_Undress_24508)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Undress_24508 other) {
            if (other == ExclusiveWeaponMsg.S2C_Undress_24508.getDefaultInstance()) {
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
            S2C_Undress_24508 parsedMessage = null;

            try {
               parsedMessage = (S2C_Undress_24508)ExclusiveWeaponMsg.S2C_Undress_24508.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Undress_24508)e.getUnfinishedMessage();
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

   public static final class C2S_UnlockLibraryInfo_24509 extends GeneratedMessageV3 implements C2S_UnlockLibraryInfo_24509OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_UnlockLibraryInfo_24509 DEFAULT_INSTANCE = new C2S_UnlockLibraryInfo_24509();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnlockLibraryInfo_24509> PARSER = new AbstractParser<C2S_UnlockLibraryInfo_24509>() {
         public C2S_UnlockLibraryInfo_24509 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnlockLibraryInfo_24509(input, extensionRegistry);
         }
      };

      private C2S_UnlockLibraryInfo_24509(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnlockLibraryInfo_24509() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnlockLibraryInfo_24509();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnlockLibraryInfo_24509(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_UnlockLibraryInfo_24509_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_UnlockLibraryInfo_24509_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockLibraryInfo_24509.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UnlockLibraryInfo_24509)) {
            return super.equals(obj);
         } else {
            C2S_UnlockLibraryInfo_24509 other = (C2S_UnlockLibraryInfo_24509)obj;
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

      public static C2S_UnlockLibraryInfo_24509 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnlockLibraryInfo_24509)PARSER.parseFrom(data);
      }

      public static C2S_UnlockLibraryInfo_24509 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockLibraryInfo_24509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockLibraryInfo_24509 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnlockLibraryInfo_24509)PARSER.parseFrom(data);
      }

      public static C2S_UnlockLibraryInfo_24509 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockLibraryInfo_24509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockLibraryInfo_24509 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnlockLibraryInfo_24509)PARSER.parseFrom(data);
      }

      public static C2S_UnlockLibraryInfo_24509 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockLibraryInfo_24509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockLibraryInfo_24509 parseFrom(InputStream input) throws IOException {
         return (C2S_UnlockLibraryInfo_24509)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockLibraryInfo_24509 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockLibraryInfo_24509)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockLibraryInfo_24509 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnlockLibraryInfo_24509)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnlockLibraryInfo_24509 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockLibraryInfo_24509)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockLibraryInfo_24509 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnlockLibraryInfo_24509)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockLibraryInfo_24509 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockLibraryInfo_24509)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnlockLibraryInfo_24509 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnlockLibraryInfo_24509 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnlockLibraryInfo_24509> parser() {
         return PARSER;
      }

      public Parser<C2S_UnlockLibraryInfo_24509> getParserForType() {
         return PARSER;
      }

      public C2S_UnlockLibraryInfo_24509 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnlockLibraryInfo_24509OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_UnlockLibraryInfo_24509_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_UnlockLibraryInfo_24509_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockLibraryInfo_24509.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_UnlockLibraryInfo_24509.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_UnlockLibraryInfo_24509_descriptor;
         }

         public C2S_UnlockLibraryInfo_24509 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_UnlockLibraryInfo_24509.getDefaultInstance();
         }

         public C2S_UnlockLibraryInfo_24509 build() {
            C2S_UnlockLibraryInfo_24509 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnlockLibraryInfo_24509 buildPartial() {
            C2S_UnlockLibraryInfo_24509 result = new C2S_UnlockLibraryInfo_24509(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_UnlockLibraryInfo_24509) {
               return this.mergeFrom((C2S_UnlockLibraryInfo_24509)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnlockLibraryInfo_24509 other) {
            if (other == ExclusiveWeaponMsg.C2S_UnlockLibraryInfo_24509.getDefaultInstance()) {
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
            C2S_UnlockLibraryInfo_24509 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnlockLibraryInfo_24509)ExclusiveWeaponMsg.C2S_UnlockLibraryInfo_24509.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnlockLibraryInfo_24509)e.getUnfinishedMessage();
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

   public static final class S2C_UnlockLibraryInfo_24510 extends GeneratedMessageV3 implements S2C_UnlockLibraryInfo_24510OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int WEAPONIDSTAR_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> weaponIdStar_;
      public static final int WEAPONLIB_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> weaponLib_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockLibraryInfo_24510 DEFAULT_INSTANCE = new S2C_UnlockLibraryInfo_24510();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockLibraryInfo_24510> PARSER = new AbstractParser<S2C_UnlockLibraryInfo_24510>() {
         public S2C_UnlockLibraryInfo_24510 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockLibraryInfo_24510(input, extensionRegistry);
         }
      };

      private S2C_UnlockLibraryInfo_24510(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockLibraryInfo_24510() {
         this.memoizedIsInitialized = -1;
         this.weaponIdStar_ = Collections.emptyList();
         this.weaponLib_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockLibraryInfo_24510();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockLibraryInfo_24510(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.weaponIdStar_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.weaponIdStar_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.weaponLib_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.weaponLib_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.weaponIdStar_ = Collections.unmodifiableList(this.weaponIdStar_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.weaponLib_ = Collections.unmodifiableList(this.weaponLib_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_UnlockLibraryInfo_24510_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_UnlockLibraryInfo_24510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockLibraryInfo_24510.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getWeaponIdStarList() {
         return this.weaponIdStar_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponIdStarOrBuilderList() {
         return this.weaponIdStar_;
      }

      public int getWeaponIdStarCount() {
         return this.weaponIdStar_.size();
      }

      public CommonMsg.MapDataII getWeaponIdStar(int index) {
         return (CommonMsg.MapDataII)this.weaponIdStar_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getWeaponIdStarOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.weaponIdStar_.get(index);
      }

      public List<CommonMsg.MapDataII> getWeaponLibList() {
         return this.weaponLib_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponLibOrBuilderList() {
         return this.weaponLib_;
      }

      public int getWeaponLibCount() {
         return this.weaponLib_.size();
      }

      public CommonMsg.MapDataII getWeaponLib(int index) {
         return (CommonMsg.MapDataII)this.weaponLib_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getWeaponLibOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.weaponLib_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getWeaponIdStarCount(); ++i) {
               if (!this.getWeaponIdStar(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getWeaponLibCount(); ++i) {
               if (!this.getWeaponLib(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.weaponIdStar_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.weaponIdStar_.get(i));
         }

         for(int i = 0; i < this.weaponLib_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.weaponLib_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.weaponIdStar_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.weaponIdStar_.get(i));
            }

            for(int i = 0; i < this.weaponLib_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.weaponLib_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnlockLibraryInfo_24510)) {
            return super.equals(obj);
         } else {
            S2C_UnlockLibraryInfo_24510 other = (S2C_UnlockLibraryInfo_24510)obj;
            if (!this.getWeaponIdStarList().equals(other.getWeaponIdStarList())) {
               return false;
            } else if (!this.getWeaponLibList().equals(other.getWeaponLibList())) {
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
            if (this.getWeaponIdStarCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWeaponIdStarList().hashCode();
            }

            if (this.getWeaponLibCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getWeaponLibList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnlockLibraryInfo_24510 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockLibraryInfo_24510)PARSER.parseFrom(data);
      }

      public static S2C_UnlockLibraryInfo_24510 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockLibraryInfo_24510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockLibraryInfo_24510 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockLibraryInfo_24510)PARSER.parseFrom(data);
      }

      public static S2C_UnlockLibraryInfo_24510 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockLibraryInfo_24510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockLibraryInfo_24510 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockLibraryInfo_24510)PARSER.parseFrom(data);
      }

      public static S2C_UnlockLibraryInfo_24510 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockLibraryInfo_24510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockLibraryInfo_24510 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockLibraryInfo_24510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockLibraryInfo_24510 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockLibraryInfo_24510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockLibraryInfo_24510 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockLibraryInfo_24510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockLibraryInfo_24510 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockLibraryInfo_24510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockLibraryInfo_24510 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockLibraryInfo_24510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockLibraryInfo_24510 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockLibraryInfo_24510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockLibraryInfo_24510 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockLibraryInfo_24510 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockLibraryInfo_24510> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockLibraryInfo_24510> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockLibraryInfo_24510 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockLibraryInfo_24510OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> weaponIdStar_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> weaponIdStarBuilder_;
         private List<CommonMsg.MapDataII> weaponLib_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> weaponLibBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_UnlockLibraryInfo_24510_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_UnlockLibraryInfo_24510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockLibraryInfo_24510.class, Builder.class);
         }

         private Builder() {
            this.weaponIdStar_ = Collections.emptyList();
            this.weaponLib_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.weaponIdStar_ = Collections.emptyList();
            this.weaponLib_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_UnlockLibraryInfo_24510.alwaysUseFieldBuilders) {
               this.getWeaponIdStarFieldBuilder();
               this.getWeaponLibFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.weaponIdStarBuilder_ == null) {
               this.weaponIdStar_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.weaponIdStarBuilder_.clear();
            }

            if (this.weaponLibBuilder_ == null) {
               this.weaponLib_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.weaponLibBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_UnlockLibraryInfo_24510_descriptor;
         }

         public S2C_UnlockLibraryInfo_24510 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_UnlockLibraryInfo_24510.getDefaultInstance();
         }

         public S2C_UnlockLibraryInfo_24510 build() {
            S2C_UnlockLibraryInfo_24510 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockLibraryInfo_24510 buildPartial() {
            S2C_UnlockLibraryInfo_24510 result = new S2C_UnlockLibraryInfo_24510(this);
            int from_bitField0_ = this.bitField0_;
            if (this.weaponIdStarBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.weaponIdStar_ = Collections.unmodifiableList(this.weaponIdStar_);
                  this.bitField0_ &= -2;
               }

               result.weaponIdStar_ = this.weaponIdStar_;
            } else {
               result.weaponIdStar_ = this.weaponIdStarBuilder_.build();
            }

            if (this.weaponLibBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.weaponLib_ = Collections.unmodifiableList(this.weaponLib_);
                  this.bitField0_ &= -3;
               }

               result.weaponLib_ = this.weaponLib_;
            } else {
               result.weaponLib_ = this.weaponLibBuilder_.build();
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
            if (other instanceof S2C_UnlockLibraryInfo_24510) {
               return this.mergeFrom((S2C_UnlockLibraryInfo_24510)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockLibraryInfo_24510 other) {
            if (other == ExclusiveWeaponMsg.S2C_UnlockLibraryInfo_24510.getDefaultInstance()) {
               return this;
            } else {
               if (this.weaponIdStarBuilder_ == null) {
                  if (!other.weaponIdStar_.isEmpty()) {
                     if (this.weaponIdStar_.isEmpty()) {
                        this.weaponIdStar_ = other.weaponIdStar_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureWeaponIdStarIsMutable();
                        this.weaponIdStar_.addAll(other.weaponIdStar_);
                     }

                     this.onChanged();
                  }
               } else if (!other.weaponIdStar_.isEmpty()) {
                  if (this.weaponIdStarBuilder_.isEmpty()) {
                     this.weaponIdStarBuilder_.dispose();
                     this.weaponIdStarBuilder_ = null;
                     this.weaponIdStar_ = other.weaponIdStar_;
                     this.bitField0_ &= -2;
                     this.weaponIdStarBuilder_ = ExclusiveWeaponMsg.S2C_UnlockLibraryInfo_24510.alwaysUseFieldBuilders ? this.getWeaponIdStarFieldBuilder() : null;
                  } else {
                     this.weaponIdStarBuilder_.addAllMessages(other.weaponIdStar_);
                  }
               }

               if (this.weaponLibBuilder_ == null) {
                  if (!other.weaponLib_.isEmpty()) {
                     if (this.weaponLib_.isEmpty()) {
                        this.weaponLib_ = other.weaponLib_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureWeaponLibIsMutable();
                        this.weaponLib_.addAll(other.weaponLib_);
                     }

                     this.onChanged();
                  }
               } else if (!other.weaponLib_.isEmpty()) {
                  if (this.weaponLibBuilder_.isEmpty()) {
                     this.weaponLibBuilder_.dispose();
                     this.weaponLibBuilder_ = null;
                     this.weaponLib_ = other.weaponLib_;
                     this.bitField0_ &= -3;
                     this.weaponLibBuilder_ = ExclusiveWeaponMsg.S2C_UnlockLibraryInfo_24510.alwaysUseFieldBuilders ? this.getWeaponLibFieldBuilder() : null;
                  } else {
                     this.weaponLibBuilder_.addAllMessages(other.weaponLib_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getWeaponIdStarCount(); ++i) {
               if (!this.getWeaponIdStar(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getWeaponLibCount(); ++i) {
               if (!this.getWeaponLib(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnlockLibraryInfo_24510 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockLibraryInfo_24510)ExclusiveWeaponMsg.S2C_UnlockLibraryInfo_24510.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockLibraryInfo_24510)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureWeaponIdStarIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.weaponIdStar_ = new ArrayList(this.weaponIdStar_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getWeaponIdStarList() {
            return this.weaponIdStarBuilder_ == null ? Collections.unmodifiableList(this.weaponIdStar_) : this.weaponIdStarBuilder_.getMessageList();
         }

         public int getWeaponIdStarCount() {
            return this.weaponIdStarBuilder_ == null ? this.weaponIdStar_.size() : this.weaponIdStarBuilder_.getCount();
         }

         public CommonMsg.MapDataII getWeaponIdStar(int index) {
            return this.weaponIdStarBuilder_ == null ? (CommonMsg.MapDataII)this.weaponIdStar_.get(index) : (CommonMsg.MapDataII)this.weaponIdStarBuilder_.getMessage(index);
         }

         public Builder setWeaponIdStar(int index, CommonMsg.MapDataII value) {
            if (this.weaponIdStarBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.set(index, value);
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWeaponIdStar(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponIdStarBuilder_ == null) {
               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWeaponIdStar(CommonMsg.MapDataII value) {
            if (this.weaponIdStarBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.add(value);
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWeaponIdStar(int index, CommonMsg.MapDataII value) {
            if (this.weaponIdStarBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.add(index, value);
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWeaponIdStar(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponIdStarBuilder_ == null) {
               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWeaponIdStar(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponIdStarBuilder_ == null) {
               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWeaponIdStar(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.weaponIdStarBuilder_ == null) {
               this.ensureWeaponIdStarIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.weaponIdStar_);
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWeaponIdStar() {
            if (this.weaponIdStarBuilder_ == null) {
               this.weaponIdStar_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.clear();
            }

            return this;
         }

         public Builder removeWeaponIdStar(int index) {
            if (this.weaponIdStarBuilder_ == null) {
               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.remove(index);
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getWeaponIdStarBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWeaponIdStarFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getWeaponIdStarOrBuilder(int index) {
            return this.weaponIdStarBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.weaponIdStar_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.weaponIdStarBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponIdStarOrBuilderList() {
            return this.weaponIdStarBuilder_ != null ? this.weaponIdStarBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.weaponIdStar_);
         }

         public CommonMsg.MapDataII.Builder addWeaponIdStarBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getWeaponIdStarFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addWeaponIdStarBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWeaponIdStarFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getWeaponIdStarBuilderList() {
            return this.getWeaponIdStarFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getWeaponIdStarFieldBuilder() {
            if (this.weaponIdStarBuilder_ == null) {
               this.weaponIdStarBuilder_ = new RepeatedFieldBuilderV3(this.weaponIdStar_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.weaponIdStar_ = null;
            }

            return this.weaponIdStarBuilder_;
         }

         private void ensureWeaponLibIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.weaponLib_ = new ArrayList(this.weaponLib_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getWeaponLibList() {
            return this.weaponLibBuilder_ == null ? Collections.unmodifiableList(this.weaponLib_) : this.weaponLibBuilder_.getMessageList();
         }

         public int getWeaponLibCount() {
            return this.weaponLibBuilder_ == null ? this.weaponLib_.size() : this.weaponLibBuilder_.getCount();
         }

         public CommonMsg.MapDataII getWeaponLib(int index) {
            return this.weaponLibBuilder_ == null ? (CommonMsg.MapDataII)this.weaponLib_.get(index) : (CommonMsg.MapDataII)this.weaponLibBuilder_.getMessage(index);
         }

         public Builder setWeaponLib(int index, CommonMsg.MapDataII value) {
            if (this.weaponLibBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponLibIsMutable();
               this.weaponLib_.set(index, value);
               this.onChanged();
            } else {
               this.weaponLibBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWeaponLib(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponLibBuilder_ == null) {
               this.ensureWeaponLibIsMutable();
               this.weaponLib_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weaponLibBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWeaponLib(CommonMsg.MapDataII value) {
            if (this.weaponLibBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponLibIsMutable();
               this.weaponLib_.add(value);
               this.onChanged();
            } else {
               this.weaponLibBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWeaponLib(int index, CommonMsg.MapDataII value) {
            if (this.weaponLibBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponLibIsMutable();
               this.weaponLib_.add(index, value);
               this.onChanged();
            } else {
               this.weaponLibBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWeaponLib(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponLibBuilder_ == null) {
               this.ensureWeaponLibIsMutable();
               this.weaponLib_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.weaponLibBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWeaponLib(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponLibBuilder_ == null) {
               this.ensureWeaponLibIsMutable();
               this.weaponLib_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weaponLibBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWeaponLib(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.weaponLibBuilder_ == null) {
               this.ensureWeaponLibIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.weaponLib_);
               this.onChanged();
            } else {
               this.weaponLibBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWeaponLib() {
            if (this.weaponLibBuilder_ == null) {
               this.weaponLib_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.weaponLibBuilder_.clear();
            }

            return this;
         }

         public Builder removeWeaponLib(int index) {
            if (this.weaponLibBuilder_ == null) {
               this.ensureWeaponLibIsMutable();
               this.weaponLib_.remove(index);
               this.onChanged();
            } else {
               this.weaponLibBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getWeaponLibBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWeaponLibFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getWeaponLibOrBuilder(int index) {
            return this.weaponLibBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.weaponLib_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.weaponLibBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponLibOrBuilderList() {
            return this.weaponLibBuilder_ != null ? this.weaponLibBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.weaponLib_);
         }

         public CommonMsg.MapDataII.Builder addWeaponLibBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getWeaponLibFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addWeaponLibBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWeaponLibFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getWeaponLibBuilderList() {
            return this.getWeaponLibFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getWeaponLibFieldBuilder() {
            if (this.weaponLibBuilder_ == null) {
               this.weaponLibBuilder_ = new RepeatedFieldBuilderV3(this.weaponLib_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.weaponLib_ = null;
            }

            return this.weaponLibBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Decompose_24511 extends GeneratedMessageV3 implements C2S_Decompose_24511OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private Internal.IntList itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_Decompose_24511 DEFAULT_INSTANCE = new C2S_Decompose_24511();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Decompose_24511> PARSER = new AbstractParser<C2S_Decompose_24511>() {
         public C2S_Decompose_24511 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Decompose_24511(input, extensionRegistry);
         }
      };

      private C2S_Decompose_24511(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Decompose_24511() {
         this.memoizedIsInitialized = -1;
         this.itemCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Decompose_24511();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Decompose_24511(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemCode_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.itemCode_.addInt(input.readInt32());
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
                  this.itemCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Decompose_24511_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Decompose_24511_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Decompose_24511.class, Builder.class);
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
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Decompose_24511)) {
            return super.equals(obj);
         } else {
            C2S_Decompose_24511 other = (C2S_Decompose_24511)obj;
            if (!this.getItemCodeList().equals(other.getItemCodeList())) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Decompose_24511 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Decompose_24511)PARSER.parseFrom(data);
      }

      public static C2S_Decompose_24511 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Decompose_24511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Decompose_24511 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Decompose_24511)PARSER.parseFrom(data);
      }

      public static C2S_Decompose_24511 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Decompose_24511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Decompose_24511 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Decompose_24511)PARSER.parseFrom(data);
      }

      public static C2S_Decompose_24511 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Decompose_24511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Decompose_24511 parseFrom(InputStream input) throws IOException {
         return (C2S_Decompose_24511)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Decompose_24511 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Decompose_24511)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Decompose_24511 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Decompose_24511)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Decompose_24511 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Decompose_24511)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Decompose_24511 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Decompose_24511)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Decompose_24511 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Decompose_24511)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Decompose_24511 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Decompose_24511 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Decompose_24511> parser() {
         return PARSER;
      }

      public Parser<C2S_Decompose_24511> getParserForType() {
         return PARSER;
      }

      public C2S_Decompose_24511 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Decompose_24511OrBuilder {
         private int bitField0_;
         private Internal.IntList itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Decompose_24511_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Decompose_24511_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Decompose_24511.class, Builder.class);
         }

         private Builder() {
            this.itemCode_ = ExclusiveWeaponMsg.C2S_Decompose_24511.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemCode_ = ExclusiveWeaponMsg.C2S_Decompose_24511.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_Decompose_24511.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = ExclusiveWeaponMsg.C2S_Decompose_24511.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Decompose_24511_descriptor;
         }

         public C2S_Decompose_24511 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_Decompose_24511.getDefaultInstance();
         }

         public C2S_Decompose_24511 build() {
            C2S_Decompose_24511 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Decompose_24511 buildPartial() {
            C2S_Decompose_24511 result = new C2S_Decompose_24511(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.itemCode_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.itemCode_ = this.itemCode_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Decompose_24511) {
               return this.mergeFrom((C2S_Decompose_24511)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Decompose_24511 other) {
            if (other == ExclusiveWeaponMsg.C2S_Decompose_24511.getDefaultInstance()) {
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

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Decompose_24511 parsedMessage = null;

            try {
               parsedMessage = (C2S_Decompose_24511)ExclusiveWeaponMsg.C2S_Decompose_24511.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Decompose_24511)e.getUnfinishedMessage();
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
               this.itemCode_ = ExclusiveWeaponMsg.C2S_Decompose_24511.mutableCopy(this.itemCode_);
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
            this.itemCode_ = ExclusiveWeaponMsg.C2S_Decompose_24511.emptyIntList();
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

   public static final class S2C_Decompose_24512 extends GeneratedMessageV3 implements S2C_Decompose_24512OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_Decompose_24512 DEFAULT_INSTANCE = new S2C_Decompose_24512();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Decompose_24512> PARSER = new AbstractParser<S2C_Decompose_24512>() {
         public S2C_Decompose_24512 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Decompose_24512(input, extensionRegistry);
         }
      };

      private S2C_Decompose_24512(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Decompose_24512() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Decompose_24512();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Decompose_24512(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Decompose_24512_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Decompose_24512_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Decompose_24512.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Decompose_24512)) {
            return super.equals(obj);
         } else {
            S2C_Decompose_24512 other = (S2C_Decompose_24512)obj;
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

      public static S2C_Decompose_24512 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Decompose_24512)PARSER.parseFrom(data);
      }

      public static S2C_Decompose_24512 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Decompose_24512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Decompose_24512 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Decompose_24512)PARSER.parseFrom(data);
      }

      public static S2C_Decompose_24512 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Decompose_24512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Decompose_24512 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Decompose_24512)PARSER.parseFrom(data);
      }

      public static S2C_Decompose_24512 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Decompose_24512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Decompose_24512 parseFrom(InputStream input) throws IOException {
         return (S2C_Decompose_24512)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Decompose_24512 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Decompose_24512)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Decompose_24512 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Decompose_24512)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Decompose_24512 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Decompose_24512)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Decompose_24512 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Decompose_24512)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Decompose_24512 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Decompose_24512)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Decompose_24512 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Decompose_24512 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Decompose_24512> parser() {
         return PARSER;
      }

      public Parser<S2C_Decompose_24512> getParserForType() {
         return PARSER;
      }

      public S2C_Decompose_24512 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Decompose_24512OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Decompose_24512_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Decompose_24512_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Decompose_24512.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_Decompose_24512.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Decompose_24512_descriptor;
         }

         public S2C_Decompose_24512 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_Decompose_24512.getDefaultInstance();
         }

         public S2C_Decompose_24512 build() {
            S2C_Decompose_24512 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Decompose_24512 buildPartial() {
            S2C_Decompose_24512 result = new S2C_Decompose_24512(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_Decompose_24512) {
               return this.mergeFrom((S2C_Decompose_24512)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Decompose_24512 other) {
            if (other == ExclusiveWeaponMsg.S2C_Decompose_24512.getDefaultInstance()) {
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
            S2C_Decompose_24512 parsedMessage = null;

            try {
               parsedMessage = (S2C_Decompose_24512)ExclusiveWeaponMsg.S2C_Decompose_24512.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Decompose_24512)e.getUnfinishedMessage();
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

   public static final class C2S_Inherit_24513 extends GeneratedMessageV3 implements C2S_Inherit_24513OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SOURCE_FIELD_NUMBER = 1;
      private WearStatus source_;
      public static final int BEINHERIT_FIELD_NUMBER = 2;
      private WearStatus beInherit_;
      private byte memoizedIsInitialized;
      private static final C2S_Inherit_24513 DEFAULT_INSTANCE = new C2S_Inherit_24513();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Inherit_24513> PARSER = new AbstractParser<C2S_Inherit_24513>() {
         public C2S_Inherit_24513 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Inherit_24513(input, extensionRegistry);
         }
      };

      private C2S_Inherit_24513(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Inherit_24513() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Inherit_24513();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Inherit_24513(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        WearStatus.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.source_.toBuilder();
                        }

                        this.source_ = (WearStatus)input.readMessage(ExclusiveWeaponMsg.WearStatus.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.source_);
                           this.source_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        WearStatus.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.beInherit_.toBuilder();
                        }

                        this.beInherit_ = (WearStatus)input.readMessage(ExclusiveWeaponMsg.WearStatus.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.beInherit_);
                           this.beInherit_ = subBuilder.buildPartial();
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Inherit_24513_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Inherit_24513_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Inherit_24513.class, Builder.class);
      }

      public boolean hasSource() {
         return (this.bitField0_ & 1) != 0;
      }

      public WearStatus getSource() {
         return this.source_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.source_;
      }

      public WearStatusOrBuilder getSourceOrBuilder() {
         return this.source_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.source_;
      }

      public boolean hasBeInherit() {
         return (this.bitField0_ & 2) != 0;
      }

      public WearStatus getBeInherit() {
         return this.beInherit_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.beInherit_;
      }

      public WearStatusOrBuilder getBeInheritOrBuilder() {
         return this.beInherit_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.beInherit_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSource()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBeInherit()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getSource().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBeInherit().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getSource());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getBeInherit());
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
               size += CodedOutputStream.computeMessageSize(1, this.getSource());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getBeInherit());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Inherit_24513)) {
            return super.equals(obj);
         } else {
            C2S_Inherit_24513 other = (C2S_Inherit_24513)obj;
            if (this.hasSource() != other.hasSource()) {
               return false;
            } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
               return false;
            } else if (this.hasBeInherit() != other.hasBeInherit()) {
               return false;
            } else if (this.hasBeInherit() && !this.getBeInherit().equals(other.getBeInherit())) {
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
            if (this.hasSource()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSource().hashCode();
            }

            if (this.hasBeInherit()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBeInherit().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Inherit_24513 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Inherit_24513)PARSER.parseFrom(data);
      }

      public static C2S_Inherit_24513 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Inherit_24513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Inherit_24513 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Inherit_24513)PARSER.parseFrom(data);
      }

      public static C2S_Inherit_24513 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Inherit_24513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Inherit_24513 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Inherit_24513)PARSER.parseFrom(data);
      }

      public static C2S_Inherit_24513 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Inherit_24513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Inherit_24513 parseFrom(InputStream input) throws IOException {
         return (C2S_Inherit_24513)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Inherit_24513 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Inherit_24513)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Inherit_24513 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Inherit_24513)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Inherit_24513 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Inherit_24513)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Inherit_24513 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Inherit_24513)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Inherit_24513 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Inherit_24513)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Inherit_24513 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Inherit_24513 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Inherit_24513> parser() {
         return PARSER;
      }

      public Parser<C2S_Inherit_24513> getParserForType() {
         return PARSER;
      }

      public C2S_Inherit_24513 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Inherit_24513OrBuilder {
         private int bitField0_;
         private WearStatus source_;
         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> sourceBuilder_;
         private WearStatus beInherit_;
         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> beInheritBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Inherit_24513_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Inherit_24513_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Inherit_24513.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_Inherit_24513.alwaysUseFieldBuilders) {
               this.getSourceFieldBuilder();
               this.getBeInheritFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.sourceBuilder_ == null) {
               this.source_ = null;
            } else {
               this.sourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.beInheritBuilder_ == null) {
               this.beInherit_ = null;
            } else {
               this.beInheritBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Inherit_24513_descriptor;
         }

         public C2S_Inherit_24513 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_Inherit_24513.getDefaultInstance();
         }

         public C2S_Inherit_24513 build() {
            C2S_Inherit_24513 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Inherit_24513 buildPartial() {
            C2S_Inherit_24513 result = new C2S_Inherit_24513(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.sourceBuilder_ == null) {
                  result.source_ = this.source_;
               } else {
                  result.source_ = (WearStatus)this.sourceBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.beInheritBuilder_ == null) {
                  result.beInherit_ = this.beInherit_;
               } else {
                  result.beInherit_ = (WearStatus)this.beInheritBuilder_.build();
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
            if (other instanceof C2S_Inherit_24513) {
               return this.mergeFrom((C2S_Inherit_24513)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Inherit_24513 other) {
            if (other == ExclusiveWeaponMsg.C2S_Inherit_24513.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSource()) {
                  this.mergeSource(other.getSource());
               }

               if (other.hasBeInherit()) {
                  this.mergeBeInherit(other.getBeInherit());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSource()) {
               return false;
            } else if (!this.hasBeInherit()) {
               return false;
            } else if (!this.getSource().isInitialized()) {
               return false;
            } else {
               return this.getBeInherit().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Inherit_24513 parsedMessage = null;

            try {
               parsedMessage = (C2S_Inherit_24513)ExclusiveWeaponMsg.C2S_Inherit_24513.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Inherit_24513)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSource() {
            return (this.bitField0_ & 1) != 0;
         }

         public WearStatus getSource() {
            if (this.sourceBuilder_ == null) {
               return this.source_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.source_;
            } else {
               return (WearStatus)this.sourceBuilder_.getMessage();
            }
         }

         public Builder setSource(WearStatus value) {
            if (this.sourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.source_ = value;
               this.onChanged();
            } else {
               this.sourceBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setSource(WearStatus.Builder builderForValue) {
            if (this.sourceBuilder_ == null) {
               this.source_ = builderForValue.build();
               this.onChanged();
            } else {
               this.sourceBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeSource(WearStatus value) {
            if (this.sourceBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.source_ != null && this.source_ != ExclusiveWeaponMsg.WearStatus.getDefaultInstance()) {
                  this.source_ = ExclusiveWeaponMsg.WearStatus.newBuilder(this.source_).mergeFrom(value).buildPartial();
               } else {
                  this.source_ = value;
               }

               this.onChanged();
            } else {
               this.sourceBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearSource() {
            if (this.sourceBuilder_ == null) {
               this.source_ = null;
               this.onChanged();
            } else {
               this.sourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WearStatus.Builder getSourceBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WearStatus.Builder)this.getSourceFieldBuilder().getBuilder();
         }

         public WearStatusOrBuilder getSourceOrBuilder() {
            if (this.sourceBuilder_ != null) {
               return (WearStatusOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
            } else {
               return this.source_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.source_;
            }
         }

         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> getSourceFieldBuilder() {
            if (this.sourceBuilder_ == null) {
               this.sourceBuilder_ = new SingleFieldBuilderV3(this.getSource(), this.getParentForChildren(), this.isClean());
               this.source_ = null;
            }

            return this.sourceBuilder_;
         }

         public boolean hasBeInherit() {
            return (this.bitField0_ & 2) != 0;
         }

         public WearStatus getBeInherit() {
            if (this.beInheritBuilder_ == null) {
               return this.beInherit_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.beInherit_;
            } else {
               return (WearStatus)this.beInheritBuilder_.getMessage();
            }
         }

         public Builder setBeInherit(WearStatus value) {
            if (this.beInheritBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.beInherit_ = value;
               this.onChanged();
            } else {
               this.beInheritBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setBeInherit(WearStatus.Builder builderForValue) {
            if (this.beInheritBuilder_ == null) {
               this.beInherit_ = builderForValue.build();
               this.onChanged();
            } else {
               this.beInheritBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeBeInherit(WearStatus value) {
            if (this.beInheritBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.beInherit_ != null && this.beInherit_ != ExclusiveWeaponMsg.WearStatus.getDefaultInstance()) {
                  this.beInherit_ = ExclusiveWeaponMsg.WearStatus.newBuilder(this.beInherit_).mergeFrom(value).buildPartial();
               } else {
                  this.beInherit_ = value;
               }

               this.onChanged();
            } else {
               this.beInheritBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearBeInherit() {
            if (this.beInheritBuilder_ == null) {
               this.beInherit_ = null;
               this.onChanged();
            } else {
               this.beInheritBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public WearStatus.Builder getBeInheritBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (WearStatus.Builder)this.getBeInheritFieldBuilder().getBuilder();
         }

         public WearStatusOrBuilder getBeInheritOrBuilder() {
            if (this.beInheritBuilder_ != null) {
               return (WearStatusOrBuilder)this.beInheritBuilder_.getMessageOrBuilder();
            } else {
               return this.beInherit_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.beInherit_;
            }
         }

         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> getBeInheritFieldBuilder() {
            if (this.beInheritBuilder_ == null) {
               this.beInheritBuilder_ = new SingleFieldBuilderV3(this.getBeInherit(), this.getParentForChildren(), this.isClean());
               this.beInherit_ = null;
            }

            return this.beInheritBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Inherit_24514 extends GeneratedMessageV3 implements S2C_Inherit_24514OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_Inherit_24514 DEFAULT_INSTANCE = new S2C_Inherit_24514();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Inherit_24514> PARSER = new AbstractParser<S2C_Inherit_24514>() {
         public S2C_Inherit_24514 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Inherit_24514(input, extensionRegistry);
         }
      };

      private S2C_Inherit_24514(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Inherit_24514() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Inherit_24514();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Inherit_24514(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Inherit_24514_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Inherit_24514_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Inherit_24514.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Inherit_24514)) {
            return super.equals(obj);
         } else {
            S2C_Inherit_24514 other = (S2C_Inherit_24514)obj;
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

      public static S2C_Inherit_24514 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Inherit_24514)PARSER.parseFrom(data);
      }

      public static S2C_Inherit_24514 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Inherit_24514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Inherit_24514 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Inherit_24514)PARSER.parseFrom(data);
      }

      public static S2C_Inherit_24514 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Inherit_24514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Inherit_24514 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Inherit_24514)PARSER.parseFrom(data);
      }

      public static S2C_Inherit_24514 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Inherit_24514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Inherit_24514 parseFrom(InputStream input) throws IOException {
         return (S2C_Inherit_24514)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Inherit_24514 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Inherit_24514)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Inherit_24514 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Inherit_24514)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Inherit_24514 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Inherit_24514)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Inherit_24514 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Inherit_24514)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Inherit_24514 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Inherit_24514)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Inherit_24514 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Inherit_24514 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Inherit_24514> parser() {
         return PARSER;
      }

      public Parser<S2C_Inherit_24514> getParserForType() {
         return PARSER;
      }

      public S2C_Inherit_24514 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Inherit_24514OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Inherit_24514_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Inherit_24514_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Inherit_24514.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_Inherit_24514.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Inherit_24514_descriptor;
         }

         public S2C_Inherit_24514 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_Inherit_24514.getDefaultInstance();
         }

         public S2C_Inherit_24514 build() {
            S2C_Inherit_24514 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Inherit_24514 buildPartial() {
            S2C_Inherit_24514 result = new S2C_Inherit_24514(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_Inherit_24514) {
               return this.mergeFrom((S2C_Inherit_24514)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Inherit_24514 other) {
            if (other == ExclusiveWeaponMsg.S2C_Inherit_24514.getDefaultInstance()) {
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
            S2C_Inherit_24514 parsedMessage = null;

            try {
               parsedMessage = (S2C_Inherit_24514)ExclusiveWeaponMsg.S2C_Inherit_24514.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Inherit_24514)e.getUnfinishedMessage();
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

   public static final class C2S_Reset_24515 extends GeneratedMessageV3 implements C2S_Reset_24515OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEARSTATUS_FIELD_NUMBER = 1;
      private WearStatus wearStatus_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Reset_24515 DEFAULT_INSTANCE = new C2S_Reset_24515();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Reset_24515> PARSER = new AbstractParser<C2S_Reset_24515>() {
         public C2S_Reset_24515 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Reset_24515(input, extensionRegistry);
         }
      };

      private C2S_Reset_24515(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Reset_24515() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Reset_24515();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Reset_24515(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        WearStatus.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.wearStatus_.toBuilder();
                        }

                        this.wearStatus_ = (WearStatus)input.readMessage(ExclusiveWeaponMsg.WearStatus.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.wearStatus_);
                           this.wearStatus_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Reset_24515_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Reset_24515_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Reset_24515.class, Builder.class);
      }

      public boolean hasWearStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public WearStatus getWearStatus() {
         return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
      }

      public WearStatusOrBuilder getWearStatusOrBuilder() {
         return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasWearStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getWearStatus().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getWearStatus());
         }

         if ((this.bitField0_ & 2) != 0) {
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
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(1, this.getWearStatus());
            }

            if ((this.bitField0_ & 2) != 0) {
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
         } else if (!(obj instanceof C2S_Reset_24515)) {
            return super.equals(obj);
         } else {
            C2S_Reset_24515 other = (C2S_Reset_24515)obj;
            if (this.hasWearStatus() != other.hasWearStatus()) {
               return false;
            } else if (this.hasWearStatus() && !this.getWearStatus().equals(other.getWearStatus())) {
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
            if (this.hasWearStatus()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWearStatus().hashCode();
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

      public static C2S_Reset_24515 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Reset_24515)PARSER.parseFrom(data);
      }

      public static C2S_Reset_24515 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_24515)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_24515 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Reset_24515)PARSER.parseFrom(data);
      }

      public static C2S_Reset_24515 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_24515)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_24515 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Reset_24515)PARSER.parseFrom(data);
      }

      public static C2S_Reset_24515 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_24515)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_24515 parseFrom(InputStream input) throws IOException {
         return (C2S_Reset_24515)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Reset_24515 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_24515)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Reset_24515 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Reset_24515)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Reset_24515 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_24515)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Reset_24515 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Reset_24515)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Reset_24515 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_24515)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Reset_24515 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Reset_24515 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Reset_24515> parser() {
         return PARSER;
      }

      public Parser<C2S_Reset_24515> getParserForType() {
         return PARSER;
      }

      public C2S_Reset_24515 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Reset_24515OrBuilder {
         private int bitField0_;
         private WearStatus wearStatus_;
         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> wearStatusBuilder_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Reset_24515_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Reset_24515_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Reset_24515.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_Reset_24515.alwaysUseFieldBuilders) {
               this.getWearStatusFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = null;
            } else {
               this.wearStatusBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Reset_24515_descriptor;
         }

         public C2S_Reset_24515 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_Reset_24515.getDefaultInstance();
         }

         public C2S_Reset_24515 build() {
            C2S_Reset_24515 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Reset_24515 buildPartial() {
            C2S_Reset_24515 result = new C2S_Reset_24515(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.wearStatusBuilder_ == null) {
                  result.wearStatus_ = this.wearStatus_;
               } else {
                  result.wearStatus_ = (WearStatus)this.wearStatusBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_Reset_24515) {
               return this.mergeFrom((C2S_Reset_24515)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Reset_24515 other) {
            if (other == ExclusiveWeaponMsg.C2S_Reset_24515.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWearStatus()) {
                  this.mergeWearStatus(other.getWearStatus());
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
            if (!this.hasWearStatus()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else {
               return this.getWearStatus().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Reset_24515 parsedMessage = null;

            try {
               parsedMessage = (C2S_Reset_24515)ExclusiveWeaponMsg.C2S_Reset_24515.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Reset_24515)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWearStatus() {
            return (this.bitField0_ & 1) != 0;
         }

         public WearStatus getWearStatus() {
            if (this.wearStatusBuilder_ == null) {
               return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
            } else {
               return (WearStatus)this.wearStatusBuilder_.getMessage();
            }
         }

         public Builder setWearStatus(WearStatus value) {
            if (this.wearStatusBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.wearStatus_ = value;
               this.onChanged();
            } else {
               this.wearStatusBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setWearStatus(WearStatus.Builder builderForValue) {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = builderForValue.build();
               this.onChanged();
            } else {
               this.wearStatusBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeWearStatus(WearStatus value) {
            if (this.wearStatusBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.wearStatus_ != null && this.wearStatus_ != ExclusiveWeaponMsg.WearStatus.getDefaultInstance()) {
                  this.wearStatus_ = ExclusiveWeaponMsg.WearStatus.newBuilder(this.wearStatus_).mergeFrom(value).buildPartial();
               } else {
                  this.wearStatus_ = value;
               }

               this.onChanged();
            } else {
               this.wearStatusBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearWearStatus() {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = null;
               this.onChanged();
            } else {
               this.wearStatusBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WearStatus.Builder getWearStatusBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WearStatus.Builder)this.getWearStatusFieldBuilder().getBuilder();
         }

         public WearStatusOrBuilder getWearStatusOrBuilder() {
            if (this.wearStatusBuilder_ != null) {
               return (WearStatusOrBuilder)this.wearStatusBuilder_.getMessageOrBuilder();
            } else {
               return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
            }
         }

         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> getWearStatusFieldBuilder() {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatusBuilder_ = new SingleFieldBuilderV3(this.getWearStatus(), this.getParentForChildren(), this.isClean());
               this.wearStatus_ = null;
            }

            return this.wearStatusBuilder_;
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

   public static final class S2C_Reset_24516 extends GeneratedMessageV3 implements S2C_Reset_24516OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_Reset_24516 DEFAULT_INSTANCE = new S2C_Reset_24516();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Reset_24516> PARSER = new AbstractParser<S2C_Reset_24516>() {
         public S2C_Reset_24516 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Reset_24516(input, extensionRegistry);
         }
      };

      private S2C_Reset_24516(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Reset_24516() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Reset_24516();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Reset_24516(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Reset_24516_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Reset_24516_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Reset_24516.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Reset_24516)) {
            return super.equals(obj);
         } else {
            S2C_Reset_24516 other = (S2C_Reset_24516)obj;
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

      public static S2C_Reset_24516 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Reset_24516)PARSER.parseFrom(data);
      }

      public static S2C_Reset_24516 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_24516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_24516 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Reset_24516)PARSER.parseFrom(data);
      }

      public static S2C_Reset_24516 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_24516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_24516 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Reset_24516)PARSER.parseFrom(data);
      }

      public static S2C_Reset_24516 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_24516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_24516 parseFrom(InputStream input) throws IOException {
         return (S2C_Reset_24516)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Reset_24516 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_24516)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Reset_24516 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Reset_24516)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Reset_24516 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_24516)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Reset_24516 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Reset_24516)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Reset_24516 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_24516)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Reset_24516 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Reset_24516 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Reset_24516> parser() {
         return PARSER;
      }

      public Parser<S2C_Reset_24516> getParserForType() {
         return PARSER;
      }

      public S2C_Reset_24516 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Reset_24516OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Reset_24516_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Reset_24516_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Reset_24516.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_Reset_24516.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Reset_24516_descriptor;
         }

         public S2C_Reset_24516 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_Reset_24516.getDefaultInstance();
         }

         public S2C_Reset_24516 build() {
            S2C_Reset_24516 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Reset_24516 buildPartial() {
            S2C_Reset_24516 result = new S2C_Reset_24516(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_Reset_24516) {
               return this.mergeFrom((S2C_Reset_24516)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Reset_24516 other) {
            if (other == ExclusiveWeaponMsg.S2C_Reset_24516.getDefaultInstance()) {
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
            S2C_Reset_24516 parsedMessage = null;

            try {
               parsedMessage = (S2C_Reset_24516)ExclusiveWeaponMsg.S2C_Reset_24516.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Reset_24516)e.getUnfinishedMessage();
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

   public static final class C2S_LearnSoulSkill_24517 extends GeneratedMessageV3 implements C2S_LearnSoulSkill_24517OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int SLOT_FIELD_NUMBER = 2;
      private int slot_;
      public static final int SKILLID_FIELD_NUMBER = 3;
      private int skillId_;
      private byte memoizedIsInitialized;
      private static final C2S_LearnSoulSkill_24517 DEFAULT_INSTANCE = new C2S_LearnSoulSkill_24517();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LearnSoulSkill_24517> PARSER = new AbstractParser<C2S_LearnSoulSkill_24517>() {
         public C2S_LearnSoulSkill_24517 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LearnSoulSkill_24517(input, extensionRegistry);
         }
      };

      private C2S_LearnSoulSkill_24517(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LearnSoulSkill_24517() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LearnSoulSkill_24517();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LearnSoulSkill_24517(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.slot_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.skillId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LearnSoulSkill_24517_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LearnSoulSkill_24517_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LearnSoulSkill_24517.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasSlot() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSlot() {
         return this.slot_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
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
         } else if (!this.hasSlot()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSkillId()) {
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
            output.writeInt32(2, this.slot_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.skillId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.slot_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.skillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LearnSoulSkill_24517)) {
            return super.equals(obj);
         } else {
            C2S_LearnSoulSkill_24517 other = (C2S_LearnSoulSkill_24517)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasSlot() != other.hasSlot()) {
               return false;
            } else if (this.hasSlot() && this.getSlot() != other.getSlot()) {
               return false;
            } else if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
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

            if (this.hasSlot()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSlot();
            }

            if (this.hasSkillId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSkillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LearnSoulSkill_24517 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LearnSoulSkill_24517)PARSER.parseFrom(data);
      }

      public static C2S_LearnSoulSkill_24517 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnSoulSkill_24517)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnSoulSkill_24517 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LearnSoulSkill_24517)PARSER.parseFrom(data);
      }

      public static C2S_LearnSoulSkill_24517 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnSoulSkill_24517)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnSoulSkill_24517 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LearnSoulSkill_24517)PARSER.parseFrom(data);
      }

      public static C2S_LearnSoulSkill_24517 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnSoulSkill_24517)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnSoulSkill_24517 parseFrom(InputStream input) throws IOException {
         return (C2S_LearnSoulSkill_24517)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LearnSoulSkill_24517 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnSoulSkill_24517)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LearnSoulSkill_24517 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LearnSoulSkill_24517)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LearnSoulSkill_24517 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnSoulSkill_24517)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LearnSoulSkill_24517 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LearnSoulSkill_24517)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LearnSoulSkill_24517 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnSoulSkill_24517)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LearnSoulSkill_24517 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LearnSoulSkill_24517 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LearnSoulSkill_24517> parser() {
         return PARSER;
      }

      public Parser<C2S_LearnSoulSkill_24517> getParserForType() {
         return PARSER;
      }

      public C2S_LearnSoulSkill_24517 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LearnSoulSkill_24517OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int slot_;
         private int skillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LearnSoulSkill_24517_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LearnSoulSkill_24517_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LearnSoulSkill_24517.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_LearnSoulSkill_24517.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.slot_ = 0;
            this.bitField0_ &= -3;
            this.skillId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_LearnSoulSkill_24517_descriptor;
         }

         public C2S_LearnSoulSkill_24517 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_LearnSoulSkill_24517.getDefaultInstance();
         }

         public C2S_LearnSoulSkill_24517 build() {
            C2S_LearnSoulSkill_24517 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LearnSoulSkill_24517 buildPartial() {
            C2S_LearnSoulSkill_24517 result = new C2S_LearnSoulSkill_24517(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.slot_ = this.slot_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.skillId_ = this.skillId_;
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
            if (other instanceof C2S_LearnSoulSkill_24517) {
               return this.mergeFrom((C2S_LearnSoulSkill_24517)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LearnSoulSkill_24517 other) {
            if (other == ExclusiveWeaponMsg.C2S_LearnSoulSkill_24517.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasSlot()) {
                  this.setSlot(other.getSlot());
               }

               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasSlot()) {
               return false;
            } else {
               return this.hasSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LearnSoulSkill_24517 parsedMessage = null;

            try {
               parsedMessage = (C2S_LearnSoulSkill_24517)ExclusiveWeaponMsg.C2S_LearnSoulSkill_24517.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LearnSoulSkill_24517)e.getUnfinishedMessage();
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

         public boolean hasSlot() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSlot() {
            return this.slot_;
         }

         public Builder setSlot(int value) {
            this.bitField0_ |= 2;
            this.slot_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlot() {
            this.bitField0_ &= -3;
            this.slot_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkillId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 4;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -5;
            this.skillId_ = 0;
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

   public static final class S2C_LearnSoulSkill_24518 extends GeneratedMessageV3 implements S2C_LearnSoulSkill_24518OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_LearnSoulSkill_24518 DEFAULT_INSTANCE = new S2C_LearnSoulSkill_24518();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LearnSoulSkill_24518> PARSER = new AbstractParser<S2C_LearnSoulSkill_24518>() {
         public S2C_LearnSoulSkill_24518 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LearnSoulSkill_24518(input, extensionRegistry);
         }
      };

      private S2C_LearnSoulSkill_24518(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LearnSoulSkill_24518() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LearnSoulSkill_24518();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LearnSoulSkill_24518(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LearnSoulSkill_24518_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LearnSoulSkill_24518_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LearnSoulSkill_24518.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LearnSoulSkill_24518)) {
            return super.equals(obj);
         } else {
            S2C_LearnSoulSkill_24518 other = (S2C_LearnSoulSkill_24518)obj;
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

      public static S2C_LearnSoulSkill_24518 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LearnSoulSkill_24518)PARSER.parseFrom(data);
      }

      public static S2C_LearnSoulSkill_24518 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnSoulSkill_24518)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnSoulSkill_24518 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LearnSoulSkill_24518)PARSER.parseFrom(data);
      }

      public static S2C_LearnSoulSkill_24518 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnSoulSkill_24518)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnSoulSkill_24518 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LearnSoulSkill_24518)PARSER.parseFrom(data);
      }

      public static S2C_LearnSoulSkill_24518 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnSoulSkill_24518)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnSoulSkill_24518 parseFrom(InputStream input) throws IOException {
         return (S2C_LearnSoulSkill_24518)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LearnSoulSkill_24518 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnSoulSkill_24518)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LearnSoulSkill_24518 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LearnSoulSkill_24518)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LearnSoulSkill_24518 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnSoulSkill_24518)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LearnSoulSkill_24518 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LearnSoulSkill_24518)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LearnSoulSkill_24518 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnSoulSkill_24518)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LearnSoulSkill_24518 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LearnSoulSkill_24518 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LearnSoulSkill_24518> parser() {
         return PARSER;
      }

      public Parser<S2C_LearnSoulSkill_24518> getParserForType() {
         return PARSER;
      }

      public S2C_LearnSoulSkill_24518 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LearnSoulSkill_24518OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LearnSoulSkill_24518_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LearnSoulSkill_24518_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LearnSoulSkill_24518.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_LearnSoulSkill_24518.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_LearnSoulSkill_24518_descriptor;
         }

         public S2C_LearnSoulSkill_24518 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_LearnSoulSkill_24518.getDefaultInstance();
         }

         public S2C_LearnSoulSkill_24518 build() {
            S2C_LearnSoulSkill_24518 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LearnSoulSkill_24518 buildPartial() {
            S2C_LearnSoulSkill_24518 result = new S2C_LearnSoulSkill_24518(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_LearnSoulSkill_24518) {
               return this.mergeFrom((S2C_LearnSoulSkill_24518)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LearnSoulSkill_24518 other) {
            if (other == ExclusiveWeaponMsg.S2C_LearnSoulSkill_24518.getDefaultInstance()) {
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
            S2C_LearnSoulSkill_24518 parsedMessage = null;

            try {
               parsedMessage = (S2C_LearnSoulSkill_24518)ExclusiveWeaponMsg.S2C_LearnSoulSkill_24518.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LearnSoulSkill_24518)e.getUnfinishedMessage();
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

   public static final class C2S_Lock_24519 extends GeneratedMessageV3 implements C2S_Lock_24519OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEARSTATUS_FIELD_NUMBER = 1;
      private WearStatus wearStatus_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Lock_24519 DEFAULT_INSTANCE = new C2S_Lock_24519();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Lock_24519> PARSER = new AbstractParser<C2S_Lock_24519>() {
         public C2S_Lock_24519 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Lock_24519(input, extensionRegistry);
         }
      };

      private C2S_Lock_24519(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Lock_24519() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Lock_24519();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Lock_24519(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        WearStatus.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.wearStatus_.toBuilder();
                        }

                        this.wearStatus_ = (WearStatus)input.readMessage(ExclusiveWeaponMsg.WearStatus.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.wearStatus_);
                           this.wearStatus_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Lock_24519_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Lock_24519_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Lock_24519.class, Builder.class);
      }

      public boolean hasWearStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public WearStatus getWearStatus() {
         return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
      }

      public WearStatusOrBuilder getWearStatusOrBuilder() {
         return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasWearStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getWearStatus().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getWearStatus());
         }

         if ((this.bitField0_ & 2) != 0) {
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
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(1, this.getWearStatus());
            }

            if ((this.bitField0_ & 2) != 0) {
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
         } else if (!(obj instanceof C2S_Lock_24519)) {
            return super.equals(obj);
         } else {
            C2S_Lock_24519 other = (C2S_Lock_24519)obj;
            if (this.hasWearStatus() != other.hasWearStatus()) {
               return false;
            } else if (this.hasWearStatus() && !this.getWearStatus().equals(other.getWearStatus())) {
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
            if (this.hasWearStatus()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWearStatus().hashCode();
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

      public static C2S_Lock_24519 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Lock_24519)PARSER.parseFrom(data);
      }

      public static C2S_Lock_24519 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Lock_24519)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Lock_24519 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Lock_24519)PARSER.parseFrom(data);
      }

      public static C2S_Lock_24519 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Lock_24519)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Lock_24519 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Lock_24519)PARSER.parseFrom(data);
      }

      public static C2S_Lock_24519 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Lock_24519)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Lock_24519 parseFrom(InputStream input) throws IOException {
         return (C2S_Lock_24519)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Lock_24519 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Lock_24519)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Lock_24519 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Lock_24519)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Lock_24519 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Lock_24519)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Lock_24519 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Lock_24519)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Lock_24519 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Lock_24519)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Lock_24519 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Lock_24519 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Lock_24519> parser() {
         return PARSER;
      }

      public Parser<C2S_Lock_24519> getParserForType() {
         return PARSER;
      }

      public C2S_Lock_24519 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Lock_24519OrBuilder {
         private int bitField0_;
         private WearStatus wearStatus_;
         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> wearStatusBuilder_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Lock_24519_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Lock_24519_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Lock_24519.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_Lock_24519.alwaysUseFieldBuilders) {
               this.getWearStatusFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = null;
            } else {
               this.wearStatusBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_Lock_24519_descriptor;
         }

         public C2S_Lock_24519 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_Lock_24519.getDefaultInstance();
         }

         public C2S_Lock_24519 build() {
            C2S_Lock_24519 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Lock_24519 buildPartial() {
            C2S_Lock_24519 result = new C2S_Lock_24519(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.wearStatusBuilder_ == null) {
                  result.wearStatus_ = this.wearStatus_;
               } else {
                  result.wearStatus_ = (WearStatus)this.wearStatusBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_Lock_24519) {
               return this.mergeFrom((C2S_Lock_24519)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Lock_24519 other) {
            if (other == ExclusiveWeaponMsg.C2S_Lock_24519.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWearStatus()) {
                  this.mergeWearStatus(other.getWearStatus());
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
            if (!this.hasWearStatus()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else {
               return this.getWearStatus().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Lock_24519 parsedMessage = null;

            try {
               parsedMessage = (C2S_Lock_24519)ExclusiveWeaponMsg.C2S_Lock_24519.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Lock_24519)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWearStatus() {
            return (this.bitField0_ & 1) != 0;
         }

         public WearStatus getWearStatus() {
            if (this.wearStatusBuilder_ == null) {
               return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
            } else {
               return (WearStatus)this.wearStatusBuilder_.getMessage();
            }
         }

         public Builder setWearStatus(WearStatus value) {
            if (this.wearStatusBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.wearStatus_ = value;
               this.onChanged();
            } else {
               this.wearStatusBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setWearStatus(WearStatus.Builder builderForValue) {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = builderForValue.build();
               this.onChanged();
            } else {
               this.wearStatusBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeWearStatus(WearStatus value) {
            if (this.wearStatusBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.wearStatus_ != null && this.wearStatus_ != ExclusiveWeaponMsg.WearStatus.getDefaultInstance()) {
                  this.wearStatus_ = ExclusiveWeaponMsg.WearStatus.newBuilder(this.wearStatus_).mergeFrom(value).buildPartial();
               } else {
                  this.wearStatus_ = value;
               }

               this.onChanged();
            } else {
               this.wearStatusBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearWearStatus() {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatus_ = null;
               this.onChanged();
            } else {
               this.wearStatusBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WearStatus.Builder getWearStatusBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WearStatus.Builder)this.getWearStatusFieldBuilder().getBuilder();
         }

         public WearStatusOrBuilder getWearStatusOrBuilder() {
            if (this.wearStatusBuilder_ != null) {
               return (WearStatusOrBuilder)this.wearStatusBuilder_.getMessageOrBuilder();
            } else {
               return this.wearStatus_ == null ? ExclusiveWeaponMsg.WearStatus.getDefaultInstance() : this.wearStatus_;
            }
         }

         private SingleFieldBuilderV3<WearStatus, WearStatus.Builder, WearStatusOrBuilder> getWearStatusFieldBuilder() {
            if (this.wearStatusBuilder_ == null) {
               this.wearStatusBuilder_ = new SingleFieldBuilderV3(this.getWearStatus(), this.getParentForChildren(), this.isClean());
               this.wearStatus_ = null;
            }

            return this.wearStatusBuilder_;
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

   public static final class S2C_Lock_24520 extends GeneratedMessageV3 implements S2C_Lock_24520OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_Lock_24520 DEFAULT_INSTANCE = new S2C_Lock_24520();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Lock_24520> PARSER = new AbstractParser<S2C_Lock_24520>() {
         public S2C_Lock_24520 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Lock_24520(input, extensionRegistry);
         }
      };

      private S2C_Lock_24520(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Lock_24520() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Lock_24520();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Lock_24520(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Lock_24520_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Lock_24520_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Lock_24520.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Lock_24520)) {
            return super.equals(obj);
         } else {
            S2C_Lock_24520 other = (S2C_Lock_24520)obj;
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

      public static S2C_Lock_24520 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Lock_24520)PARSER.parseFrom(data);
      }

      public static S2C_Lock_24520 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Lock_24520)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Lock_24520 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Lock_24520)PARSER.parseFrom(data);
      }

      public static S2C_Lock_24520 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Lock_24520)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Lock_24520 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Lock_24520)PARSER.parseFrom(data);
      }

      public static S2C_Lock_24520 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Lock_24520)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Lock_24520 parseFrom(InputStream input) throws IOException {
         return (S2C_Lock_24520)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Lock_24520 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Lock_24520)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Lock_24520 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Lock_24520)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Lock_24520 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Lock_24520)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Lock_24520 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Lock_24520)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Lock_24520 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Lock_24520)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Lock_24520 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Lock_24520 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Lock_24520> parser() {
         return PARSER;
      }

      public Parser<S2C_Lock_24520> getParserForType() {
         return PARSER;
      }

      public S2C_Lock_24520 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Lock_24520OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Lock_24520_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Lock_24520_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Lock_24520.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_Lock_24520.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_Lock_24520_descriptor;
         }

         public S2C_Lock_24520 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_Lock_24520.getDefaultInstance();
         }

         public S2C_Lock_24520 build() {
            S2C_Lock_24520 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Lock_24520 buildPartial() {
            S2C_Lock_24520 result = new S2C_Lock_24520(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_Lock_24520) {
               return this.mergeFrom((S2C_Lock_24520)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Lock_24520 other) {
            if (other == ExclusiveWeaponMsg.S2C_Lock_24520.getDefaultInstance()) {
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
            S2C_Lock_24520 parsedMessage = null;

            try {
               parsedMessage = (S2C_Lock_24520)ExclusiveWeaponMsg.S2C_Lock_24520.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Lock_24520)e.getUnfinishedMessage();
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

   public static final class C2S_NoticeInfo_24521 extends GeneratedMessageV3 implements C2S_NoticeInfo_24521OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_NoticeInfo_24521 DEFAULT_INSTANCE = new C2S_NoticeInfo_24521();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NoticeInfo_24521> PARSER = new AbstractParser<C2S_NoticeInfo_24521>() {
         public C2S_NoticeInfo_24521 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NoticeInfo_24521(input, extensionRegistry);
         }
      };

      private C2S_NoticeInfo_24521(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NoticeInfo_24521() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NoticeInfo_24521();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NoticeInfo_24521(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticeInfo_24521_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticeInfo_24521_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticeInfo_24521.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NoticeInfo_24521)) {
            return super.equals(obj);
         } else {
            C2S_NoticeInfo_24521 other = (C2S_NoticeInfo_24521)obj;
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

      public static C2S_NoticeInfo_24521 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_24521)PARSER.parseFrom(data);
      }

      public static C2S_NoticeInfo_24521 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_24521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticeInfo_24521 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_24521)PARSER.parseFrom(data);
      }

      public static C2S_NoticeInfo_24521 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_24521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticeInfo_24521 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_24521)PARSER.parseFrom(data);
      }

      public static C2S_NoticeInfo_24521 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_24521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticeInfo_24521 parseFrom(InputStream input) throws IOException {
         return (C2S_NoticeInfo_24521)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticeInfo_24521 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticeInfo_24521)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticeInfo_24521 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NoticeInfo_24521)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NoticeInfo_24521 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticeInfo_24521)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticeInfo_24521 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NoticeInfo_24521)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticeInfo_24521 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticeInfo_24521)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NoticeInfo_24521 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NoticeInfo_24521 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NoticeInfo_24521> parser() {
         return PARSER;
      }

      public Parser<C2S_NoticeInfo_24521> getParserForType() {
         return PARSER;
      }

      public C2S_NoticeInfo_24521 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NoticeInfo_24521OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticeInfo_24521_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticeInfo_24521_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticeInfo_24521.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_NoticeInfo_24521.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticeInfo_24521_descriptor;
         }

         public C2S_NoticeInfo_24521 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_NoticeInfo_24521.getDefaultInstance();
         }

         public C2S_NoticeInfo_24521 build() {
            C2S_NoticeInfo_24521 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NoticeInfo_24521 buildPartial() {
            C2S_NoticeInfo_24521 result = new C2S_NoticeInfo_24521(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_NoticeInfo_24521) {
               return this.mergeFrom((C2S_NoticeInfo_24521)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NoticeInfo_24521 other) {
            if (other == ExclusiveWeaponMsg.C2S_NoticeInfo_24521.getDefaultInstance()) {
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
            C2S_NoticeInfo_24521 parsedMessage = null;

            try {
               parsedMessage = (C2S_NoticeInfo_24521)ExclusiveWeaponMsg.C2S_NoticeInfo_24521.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NoticeInfo_24521)e.getUnfinishedMessage();
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

   public static final class S2C_NoticeInfo_24522 extends GeneratedMessageV3 implements S2C_NoticeInfo_24522OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int UNLOCKID_FIELD_NUMBER = 1;
      private Internal.IntList unlockId_;
      private byte memoizedIsInitialized;
      private static final S2C_NoticeInfo_24522 DEFAULT_INSTANCE = new S2C_NoticeInfo_24522();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NoticeInfo_24522> PARSER = new AbstractParser<S2C_NoticeInfo_24522>() {
         public S2C_NoticeInfo_24522 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NoticeInfo_24522(input, extensionRegistry);
         }
      };

      private S2C_NoticeInfo_24522(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NoticeInfo_24522() {
         this.memoizedIsInitialized = -1;
         this.unlockId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NoticeInfo_24522();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NoticeInfo_24522(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.unlockId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.unlockId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.unlockId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.unlockId_.addInt(input.readInt32());
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
                  this.unlockId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticeInfo_24522_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticeInfo_24522_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticeInfo_24522.class, Builder.class);
      }

      public List<Integer> getUnlockIdList() {
         return this.unlockId_;
      }

      public int getUnlockIdCount() {
         return this.unlockId_.size();
      }

      public int getUnlockId(int index) {
         return this.unlockId_.getInt(index);
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
         for(int i = 0; i < this.unlockId_.size(); ++i) {
            output.writeInt32(1, this.unlockId_.getInt(i));
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

            for(int i = 0; i < this.unlockId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.unlockId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getUnlockIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NoticeInfo_24522)) {
            return super.equals(obj);
         } else {
            S2C_NoticeInfo_24522 other = (S2C_NoticeInfo_24522)obj;
            if (!this.getUnlockIdList().equals(other.getUnlockIdList())) {
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
            if (this.getUnlockIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnlockIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NoticeInfo_24522 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_24522)PARSER.parseFrom(data);
      }

      public static S2C_NoticeInfo_24522 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_24522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticeInfo_24522 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_24522)PARSER.parseFrom(data);
      }

      public static S2C_NoticeInfo_24522 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_24522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticeInfo_24522 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_24522)PARSER.parseFrom(data);
      }

      public static S2C_NoticeInfo_24522 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_24522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticeInfo_24522 parseFrom(InputStream input) throws IOException {
         return (S2C_NoticeInfo_24522)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticeInfo_24522 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticeInfo_24522)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticeInfo_24522 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NoticeInfo_24522)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NoticeInfo_24522 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticeInfo_24522)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticeInfo_24522 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NoticeInfo_24522)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticeInfo_24522 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticeInfo_24522)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NoticeInfo_24522 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NoticeInfo_24522 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NoticeInfo_24522> parser() {
         return PARSER;
      }

      public Parser<S2C_NoticeInfo_24522> getParserForType() {
         return PARSER;
      }

      public S2C_NoticeInfo_24522 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NoticeInfo_24522OrBuilder {
         private int bitField0_;
         private Internal.IntList unlockId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticeInfo_24522_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticeInfo_24522_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticeInfo_24522.class, Builder.class);
         }

         private Builder() {
            this.unlockId_ = ExclusiveWeaponMsg.S2C_NoticeInfo_24522.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unlockId_ = ExclusiveWeaponMsg.S2C_NoticeInfo_24522.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_NoticeInfo_24522.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unlockId_ = ExclusiveWeaponMsg.S2C_NoticeInfo_24522.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticeInfo_24522_descriptor;
         }

         public S2C_NoticeInfo_24522 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_NoticeInfo_24522.getDefaultInstance();
         }

         public S2C_NoticeInfo_24522 build() {
            S2C_NoticeInfo_24522 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NoticeInfo_24522 buildPartial() {
            S2C_NoticeInfo_24522 result = new S2C_NoticeInfo_24522(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.unlockId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.unlockId_ = this.unlockId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_NoticeInfo_24522) {
               return this.mergeFrom((S2C_NoticeInfo_24522)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NoticeInfo_24522 other) {
            if (other == ExclusiveWeaponMsg.S2C_NoticeInfo_24522.getDefaultInstance()) {
               return this;
            } else {
               if (!other.unlockId_.isEmpty()) {
                  if (this.unlockId_.isEmpty()) {
                     this.unlockId_ = other.unlockId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureUnlockIdIsMutable();
                     this.unlockId_.addAll(other.unlockId_);
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
            S2C_NoticeInfo_24522 parsedMessage = null;

            try {
               parsedMessage = (S2C_NoticeInfo_24522)ExclusiveWeaponMsg.S2C_NoticeInfo_24522.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NoticeInfo_24522)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureUnlockIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.unlockId_ = ExclusiveWeaponMsg.S2C_NoticeInfo_24522.mutableCopy(this.unlockId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getUnlockIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.unlockId_) : this.unlockId_);
         }

         public int getUnlockIdCount() {
            return this.unlockId_.size();
         }

         public int getUnlockId(int index) {
            return this.unlockId_.getInt(index);
         }

         public Builder setUnlockId(int index, int value) {
            this.ensureUnlockIdIsMutable();
            this.unlockId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addUnlockId(int value) {
            this.ensureUnlockIdIsMutable();
            this.unlockId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllUnlockId(Iterable<? extends Integer> values) {
            this.ensureUnlockIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.unlockId_);
            this.onChanged();
            return this;
         }

         public Builder clearUnlockId() {
            this.unlockId_ = ExclusiveWeaponMsg.S2C_NoticeInfo_24522.emptyIntList();
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

   public static final class C2S_NoticePointUnlock_24523 extends GeneratedMessageV3 implements C2S_NoticePointUnlock_24523OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_NoticePointUnlock_24523 DEFAULT_INSTANCE = new C2S_NoticePointUnlock_24523();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NoticePointUnlock_24523> PARSER = new AbstractParser<C2S_NoticePointUnlock_24523>() {
         public C2S_NoticePointUnlock_24523 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NoticePointUnlock_24523(input, extensionRegistry);
         }
      };

      private C2S_NoticePointUnlock_24523(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NoticePointUnlock_24523() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NoticePointUnlock_24523();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NoticePointUnlock_24523(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticePointUnlock_24523_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticePointUnlock_24523_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticePointUnlock_24523.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NoticePointUnlock_24523)) {
            return super.equals(obj);
         } else {
            C2S_NoticePointUnlock_24523 other = (C2S_NoticePointUnlock_24523)obj;
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

      public static C2S_NoticePointUnlock_24523 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_24523)PARSER.parseFrom(data);
      }

      public static C2S_NoticePointUnlock_24523 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_24523)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticePointUnlock_24523 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_24523)PARSER.parseFrom(data);
      }

      public static C2S_NoticePointUnlock_24523 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_24523)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticePointUnlock_24523 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_24523)PARSER.parseFrom(data);
      }

      public static C2S_NoticePointUnlock_24523 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_24523)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticePointUnlock_24523 parseFrom(InputStream input) throws IOException {
         return (C2S_NoticePointUnlock_24523)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticePointUnlock_24523 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticePointUnlock_24523)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticePointUnlock_24523 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NoticePointUnlock_24523)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NoticePointUnlock_24523 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticePointUnlock_24523)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticePointUnlock_24523 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NoticePointUnlock_24523)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticePointUnlock_24523 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticePointUnlock_24523)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NoticePointUnlock_24523 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NoticePointUnlock_24523 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NoticePointUnlock_24523> parser() {
         return PARSER;
      }

      public Parser<C2S_NoticePointUnlock_24523> getParserForType() {
         return PARSER;
      }

      public C2S_NoticePointUnlock_24523 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NoticePointUnlock_24523OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticePointUnlock_24523_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticePointUnlock_24523_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticePointUnlock_24523.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_NoticePointUnlock_24523.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_NoticePointUnlock_24523_descriptor;
         }

         public C2S_NoticePointUnlock_24523 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_NoticePointUnlock_24523.getDefaultInstance();
         }

         public C2S_NoticePointUnlock_24523 build() {
            C2S_NoticePointUnlock_24523 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NoticePointUnlock_24523 buildPartial() {
            C2S_NoticePointUnlock_24523 result = new C2S_NoticePointUnlock_24523(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_NoticePointUnlock_24523) {
               return this.mergeFrom((C2S_NoticePointUnlock_24523)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NoticePointUnlock_24523 other) {
            if (other == ExclusiveWeaponMsg.C2S_NoticePointUnlock_24523.getDefaultInstance()) {
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
            C2S_NoticePointUnlock_24523 parsedMessage = null;

            try {
               parsedMessage = (C2S_NoticePointUnlock_24523)ExclusiveWeaponMsg.C2S_NoticePointUnlock_24523.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NoticePointUnlock_24523)e.getUnfinishedMessage();
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

   public static final class S2C_NoticePointUnlock_24524 extends GeneratedMessageV3 implements S2C_NoticePointUnlock_24524OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int UNLOCKID_FIELD_NUMBER = 1;
      private Internal.IntList unlockId_;
      private byte memoizedIsInitialized;
      private static final S2C_NoticePointUnlock_24524 DEFAULT_INSTANCE = new S2C_NoticePointUnlock_24524();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NoticePointUnlock_24524> PARSER = new AbstractParser<S2C_NoticePointUnlock_24524>() {
         public S2C_NoticePointUnlock_24524 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NoticePointUnlock_24524(input, extensionRegistry);
         }
      };

      private S2C_NoticePointUnlock_24524(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NoticePointUnlock_24524() {
         this.memoizedIsInitialized = -1;
         this.unlockId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NoticePointUnlock_24524();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NoticePointUnlock_24524(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.unlockId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.unlockId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.unlockId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.unlockId_.addInt(input.readInt32());
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
                  this.unlockId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticePointUnlock_24524_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticePointUnlock_24524_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticePointUnlock_24524.class, Builder.class);
      }

      public List<Integer> getUnlockIdList() {
         return this.unlockId_;
      }

      public int getUnlockIdCount() {
         return this.unlockId_.size();
      }

      public int getUnlockId(int index) {
         return this.unlockId_.getInt(index);
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
         for(int i = 0; i < this.unlockId_.size(); ++i) {
            output.writeInt32(1, this.unlockId_.getInt(i));
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

            for(int i = 0; i < this.unlockId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.unlockId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getUnlockIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NoticePointUnlock_24524)) {
            return super.equals(obj);
         } else {
            S2C_NoticePointUnlock_24524 other = (S2C_NoticePointUnlock_24524)obj;
            if (!this.getUnlockIdList().equals(other.getUnlockIdList())) {
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
            if (this.getUnlockIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnlockIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NoticePointUnlock_24524 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_24524)PARSER.parseFrom(data);
      }

      public static S2C_NoticePointUnlock_24524 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_24524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePointUnlock_24524 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_24524)PARSER.parseFrom(data);
      }

      public static S2C_NoticePointUnlock_24524 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_24524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePointUnlock_24524 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_24524)PARSER.parseFrom(data);
      }

      public static S2C_NoticePointUnlock_24524 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_24524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePointUnlock_24524 parseFrom(InputStream input) throws IOException {
         return (S2C_NoticePointUnlock_24524)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticePointUnlock_24524 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePointUnlock_24524)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticePointUnlock_24524 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NoticePointUnlock_24524)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NoticePointUnlock_24524 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePointUnlock_24524)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticePointUnlock_24524 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NoticePointUnlock_24524)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticePointUnlock_24524 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePointUnlock_24524)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NoticePointUnlock_24524 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NoticePointUnlock_24524 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NoticePointUnlock_24524> parser() {
         return PARSER;
      }

      public Parser<S2C_NoticePointUnlock_24524> getParserForType() {
         return PARSER;
      }

      public S2C_NoticePointUnlock_24524 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NoticePointUnlock_24524OrBuilder {
         private int bitField0_;
         private Internal.IntList unlockId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticePointUnlock_24524_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticePointUnlock_24524_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticePointUnlock_24524.class, Builder.class);
         }

         private Builder() {
            this.unlockId_ = ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unlockId_ = ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unlockId_ = ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_NoticePointUnlock_24524_descriptor;
         }

         public S2C_NoticePointUnlock_24524 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.getDefaultInstance();
         }

         public S2C_NoticePointUnlock_24524 build() {
            S2C_NoticePointUnlock_24524 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NoticePointUnlock_24524 buildPartial() {
            S2C_NoticePointUnlock_24524 result = new S2C_NoticePointUnlock_24524(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.unlockId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.unlockId_ = this.unlockId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_NoticePointUnlock_24524) {
               return this.mergeFrom((S2C_NoticePointUnlock_24524)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NoticePointUnlock_24524 other) {
            if (other == ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.getDefaultInstance()) {
               return this;
            } else {
               if (!other.unlockId_.isEmpty()) {
                  if (this.unlockId_.isEmpty()) {
                     this.unlockId_ = other.unlockId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureUnlockIdIsMutable();
                     this.unlockId_.addAll(other.unlockId_);
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
            S2C_NoticePointUnlock_24524 parsedMessage = null;

            try {
               parsedMessage = (S2C_NoticePointUnlock_24524)ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NoticePointUnlock_24524)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureUnlockIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.unlockId_ = ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.mutableCopy(this.unlockId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getUnlockIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.unlockId_) : this.unlockId_);
         }

         public int getUnlockIdCount() {
            return this.unlockId_.size();
         }

         public int getUnlockId(int index) {
            return this.unlockId_.getInt(index);
         }

         public Builder setUnlockId(int index, int value) {
            this.ensureUnlockIdIsMutable();
            this.unlockId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addUnlockId(int value) {
            this.ensureUnlockIdIsMutable();
            this.unlockId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllUnlockId(Iterable<? extends Integer> values) {
            this.ensureUnlockIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.unlockId_);
            this.onChanged();
            return this;
         }

         public Builder clearUnlockId() {
            this.unlockId_ = ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.emptyIntList();
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

   public static final class C2S_WeaponLibStarUp_24525 extends GeneratedMessageV3 implements C2S_WeaponLibStarUp_24525OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEAPONID_FIELD_NUMBER = 1;
      private int weaponId_;
      public static final int STAR_FIELD_NUMBER = 2;
      private int star_;
      private byte memoizedIsInitialized;
      private static final C2S_WeaponLibStarUp_24525 DEFAULT_INSTANCE = new C2S_WeaponLibStarUp_24525();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WeaponLibStarUp_24525> PARSER = new AbstractParser<C2S_WeaponLibStarUp_24525>() {
         public C2S_WeaponLibStarUp_24525 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WeaponLibStarUp_24525(input, extensionRegistry);
         }
      };

      private C2S_WeaponLibStarUp_24525(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WeaponLibStarUp_24525() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WeaponLibStarUp_24525();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WeaponLibStarUp_24525(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.weaponId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.star_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_WeaponLibStarUp_24525_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_WeaponLibStarUp_24525_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WeaponLibStarUp_24525.class, Builder.class);
      }

      public boolean hasWeaponId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWeaponId() {
         return this.weaponId_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStar() {
         return this.star_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWeaponId()) {
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
            output.writeInt32(1, this.weaponId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.star_);
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
               size += CodedOutputStream.computeInt32Size(1, this.weaponId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.star_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WeaponLibStarUp_24525)) {
            return super.equals(obj);
         } else {
            C2S_WeaponLibStarUp_24525 other = (C2S_WeaponLibStarUp_24525)obj;
            if (this.hasWeaponId() != other.hasWeaponId()) {
               return false;
            } else if (this.hasWeaponId() && this.getWeaponId() != other.getWeaponId()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
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
            if (this.hasWeaponId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWeaponId();
            }

            if (this.hasStar()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStar();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WeaponLibStarUp_24525 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WeaponLibStarUp_24525)PARSER.parseFrom(data);
      }

      public static C2S_WeaponLibStarUp_24525 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeaponLibStarUp_24525)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeaponLibStarUp_24525 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WeaponLibStarUp_24525)PARSER.parseFrom(data);
      }

      public static C2S_WeaponLibStarUp_24525 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeaponLibStarUp_24525)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeaponLibStarUp_24525 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WeaponLibStarUp_24525)PARSER.parseFrom(data);
      }

      public static C2S_WeaponLibStarUp_24525 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeaponLibStarUp_24525)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeaponLibStarUp_24525 parseFrom(InputStream input) throws IOException {
         return (C2S_WeaponLibStarUp_24525)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WeaponLibStarUp_24525 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeaponLibStarUp_24525)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WeaponLibStarUp_24525 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WeaponLibStarUp_24525)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WeaponLibStarUp_24525 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeaponLibStarUp_24525)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WeaponLibStarUp_24525 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WeaponLibStarUp_24525)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WeaponLibStarUp_24525 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeaponLibStarUp_24525)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WeaponLibStarUp_24525 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WeaponLibStarUp_24525 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WeaponLibStarUp_24525> parser() {
         return PARSER;
      }

      public Parser<C2S_WeaponLibStarUp_24525> getParserForType() {
         return PARSER;
      }

      public C2S_WeaponLibStarUp_24525 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WeaponLibStarUp_24525OrBuilder {
         private int bitField0_;
         private int weaponId_;
         private int star_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_WeaponLibStarUp_24525_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_WeaponLibStarUp_24525_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WeaponLibStarUp_24525.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.C2S_WeaponLibStarUp_24525.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.weaponId_ = 0;
            this.bitField0_ &= -2;
            this.star_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_C2S_WeaponLibStarUp_24525_descriptor;
         }

         public C2S_WeaponLibStarUp_24525 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.C2S_WeaponLibStarUp_24525.getDefaultInstance();
         }

         public C2S_WeaponLibStarUp_24525 build() {
            C2S_WeaponLibStarUp_24525 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WeaponLibStarUp_24525 buildPartial() {
            C2S_WeaponLibStarUp_24525 result = new C2S_WeaponLibStarUp_24525(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.weaponId_ = this.weaponId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.star_ = this.star_;
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
            if (other instanceof C2S_WeaponLibStarUp_24525) {
               return this.mergeFrom((C2S_WeaponLibStarUp_24525)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WeaponLibStarUp_24525 other) {
            if (other == ExclusiveWeaponMsg.C2S_WeaponLibStarUp_24525.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWeaponId()) {
                  this.setWeaponId(other.getWeaponId());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWeaponId()) {
               return false;
            } else {
               return this.hasStar();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WeaponLibStarUp_24525 parsedMessage = null;

            try {
               parsedMessage = (C2S_WeaponLibStarUp_24525)ExclusiveWeaponMsg.C2S_WeaponLibStarUp_24525.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WeaponLibStarUp_24525)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWeaponId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWeaponId() {
            return this.weaponId_;
         }

         public Builder setWeaponId(int value) {
            this.bitField0_ |= 1;
            this.weaponId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWeaponId() {
            this.bitField0_ &= -2;
            this.weaponId_ = 0;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_WeaponLibStarUp_24526 extends GeneratedMessageV3 implements S2C_WeaponLibStarUp_24526OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int WEAPONIDSTAR_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> weaponIdStar_;
      public static final int WEAPONLIB_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> weaponLib_;
      private byte memoizedIsInitialized;
      private static final S2C_WeaponLibStarUp_24526 DEFAULT_INSTANCE = new S2C_WeaponLibStarUp_24526();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WeaponLibStarUp_24526> PARSER = new AbstractParser<S2C_WeaponLibStarUp_24526>() {
         public S2C_WeaponLibStarUp_24526 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WeaponLibStarUp_24526(input, extensionRegistry);
         }
      };

      private S2C_WeaponLibStarUp_24526(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WeaponLibStarUp_24526() {
         this.memoizedIsInitialized = -1;
         this.weaponIdStar_ = Collections.emptyList();
         this.weaponLib_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WeaponLibStarUp_24526();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WeaponLibStarUp_24526(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.weaponIdStar_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.weaponIdStar_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.weaponLib_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.weaponLib_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.weaponIdStar_ = Collections.unmodifiableList(this.weaponIdStar_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.weaponLib_ = Collections.unmodifiableList(this.weaponLib_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_WeaponLibStarUp_24526_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_WeaponLibStarUp_24526_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WeaponLibStarUp_24526.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getWeaponIdStarList() {
         return this.weaponIdStar_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponIdStarOrBuilderList() {
         return this.weaponIdStar_;
      }

      public int getWeaponIdStarCount() {
         return this.weaponIdStar_.size();
      }

      public CommonMsg.MapDataII getWeaponIdStar(int index) {
         return (CommonMsg.MapDataII)this.weaponIdStar_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getWeaponIdStarOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.weaponIdStar_.get(index);
      }

      public List<CommonMsg.MapDataII> getWeaponLibList() {
         return this.weaponLib_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponLibOrBuilderList() {
         return this.weaponLib_;
      }

      public int getWeaponLibCount() {
         return this.weaponLib_.size();
      }

      public CommonMsg.MapDataII getWeaponLib(int index) {
         return (CommonMsg.MapDataII)this.weaponLib_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getWeaponLibOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.weaponLib_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getWeaponIdStarCount(); ++i) {
               if (!this.getWeaponIdStar(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getWeaponLibCount(); ++i) {
               if (!this.getWeaponLib(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.weaponIdStar_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.weaponIdStar_.get(i));
         }

         for(int i = 0; i < this.weaponLib_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.weaponLib_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.weaponIdStar_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.weaponIdStar_.get(i));
            }

            for(int i = 0; i < this.weaponLib_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.weaponLib_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WeaponLibStarUp_24526)) {
            return super.equals(obj);
         } else {
            S2C_WeaponLibStarUp_24526 other = (S2C_WeaponLibStarUp_24526)obj;
            if (!this.getWeaponIdStarList().equals(other.getWeaponIdStarList())) {
               return false;
            } else if (!this.getWeaponLibList().equals(other.getWeaponLibList())) {
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
            if (this.getWeaponIdStarCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWeaponIdStarList().hashCode();
            }

            if (this.getWeaponLibCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getWeaponLibList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WeaponLibStarUp_24526 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WeaponLibStarUp_24526)PARSER.parseFrom(data);
      }

      public static S2C_WeaponLibStarUp_24526 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeaponLibStarUp_24526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeaponLibStarUp_24526 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WeaponLibStarUp_24526)PARSER.parseFrom(data);
      }

      public static S2C_WeaponLibStarUp_24526 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeaponLibStarUp_24526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeaponLibStarUp_24526 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WeaponLibStarUp_24526)PARSER.parseFrom(data);
      }

      public static S2C_WeaponLibStarUp_24526 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeaponLibStarUp_24526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeaponLibStarUp_24526 parseFrom(InputStream input) throws IOException {
         return (S2C_WeaponLibStarUp_24526)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WeaponLibStarUp_24526 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeaponLibStarUp_24526)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WeaponLibStarUp_24526 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WeaponLibStarUp_24526)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WeaponLibStarUp_24526 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeaponLibStarUp_24526)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WeaponLibStarUp_24526 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WeaponLibStarUp_24526)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WeaponLibStarUp_24526 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeaponLibStarUp_24526)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WeaponLibStarUp_24526 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WeaponLibStarUp_24526 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WeaponLibStarUp_24526> parser() {
         return PARSER;
      }

      public Parser<S2C_WeaponLibStarUp_24526> getParserForType() {
         return PARSER;
      }

      public S2C_WeaponLibStarUp_24526 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WeaponLibStarUp_24526OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> weaponIdStar_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> weaponIdStarBuilder_;
         private List<CommonMsg.MapDataII> weaponLib_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> weaponLibBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_WeaponLibStarUp_24526_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_WeaponLibStarUp_24526_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WeaponLibStarUp_24526.class, Builder.class);
         }

         private Builder() {
            this.weaponIdStar_ = Collections.emptyList();
            this.weaponLib_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.weaponIdStar_ = Collections.emptyList();
            this.weaponLib_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveWeaponMsg.S2C_WeaponLibStarUp_24526.alwaysUseFieldBuilders) {
               this.getWeaponIdStarFieldBuilder();
               this.getWeaponLibFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.weaponIdStarBuilder_ == null) {
               this.weaponIdStar_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.weaponIdStarBuilder_.clear();
            }

            if (this.weaponLibBuilder_ == null) {
               this.weaponLib_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.weaponLibBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveWeaponMsg.internal_static_exclusiveWeapon_com_gzbz_protobuf_S2C_WeaponLibStarUp_24526_descriptor;
         }

         public S2C_WeaponLibStarUp_24526 getDefaultInstanceForType() {
            return ExclusiveWeaponMsg.S2C_WeaponLibStarUp_24526.getDefaultInstance();
         }

         public S2C_WeaponLibStarUp_24526 build() {
            S2C_WeaponLibStarUp_24526 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WeaponLibStarUp_24526 buildPartial() {
            S2C_WeaponLibStarUp_24526 result = new S2C_WeaponLibStarUp_24526(this);
            int from_bitField0_ = this.bitField0_;
            if (this.weaponIdStarBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.weaponIdStar_ = Collections.unmodifiableList(this.weaponIdStar_);
                  this.bitField0_ &= -2;
               }

               result.weaponIdStar_ = this.weaponIdStar_;
            } else {
               result.weaponIdStar_ = this.weaponIdStarBuilder_.build();
            }

            if (this.weaponLibBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.weaponLib_ = Collections.unmodifiableList(this.weaponLib_);
                  this.bitField0_ &= -3;
               }

               result.weaponLib_ = this.weaponLib_;
            } else {
               result.weaponLib_ = this.weaponLibBuilder_.build();
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
            if (other instanceof S2C_WeaponLibStarUp_24526) {
               return this.mergeFrom((S2C_WeaponLibStarUp_24526)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WeaponLibStarUp_24526 other) {
            if (other == ExclusiveWeaponMsg.S2C_WeaponLibStarUp_24526.getDefaultInstance()) {
               return this;
            } else {
               if (this.weaponIdStarBuilder_ == null) {
                  if (!other.weaponIdStar_.isEmpty()) {
                     if (this.weaponIdStar_.isEmpty()) {
                        this.weaponIdStar_ = other.weaponIdStar_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureWeaponIdStarIsMutable();
                        this.weaponIdStar_.addAll(other.weaponIdStar_);
                     }

                     this.onChanged();
                  }
               } else if (!other.weaponIdStar_.isEmpty()) {
                  if (this.weaponIdStarBuilder_.isEmpty()) {
                     this.weaponIdStarBuilder_.dispose();
                     this.weaponIdStarBuilder_ = null;
                     this.weaponIdStar_ = other.weaponIdStar_;
                     this.bitField0_ &= -2;
                     this.weaponIdStarBuilder_ = ExclusiveWeaponMsg.S2C_WeaponLibStarUp_24526.alwaysUseFieldBuilders ? this.getWeaponIdStarFieldBuilder() : null;
                  } else {
                     this.weaponIdStarBuilder_.addAllMessages(other.weaponIdStar_);
                  }
               }

               if (this.weaponLibBuilder_ == null) {
                  if (!other.weaponLib_.isEmpty()) {
                     if (this.weaponLib_.isEmpty()) {
                        this.weaponLib_ = other.weaponLib_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureWeaponLibIsMutable();
                        this.weaponLib_.addAll(other.weaponLib_);
                     }

                     this.onChanged();
                  }
               } else if (!other.weaponLib_.isEmpty()) {
                  if (this.weaponLibBuilder_.isEmpty()) {
                     this.weaponLibBuilder_.dispose();
                     this.weaponLibBuilder_ = null;
                     this.weaponLib_ = other.weaponLib_;
                     this.bitField0_ &= -3;
                     this.weaponLibBuilder_ = ExclusiveWeaponMsg.S2C_WeaponLibStarUp_24526.alwaysUseFieldBuilders ? this.getWeaponLibFieldBuilder() : null;
                  } else {
                     this.weaponLibBuilder_.addAllMessages(other.weaponLib_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getWeaponIdStarCount(); ++i) {
               if (!this.getWeaponIdStar(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getWeaponLibCount(); ++i) {
               if (!this.getWeaponLib(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WeaponLibStarUp_24526 parsedMessage = null;

            try {
               parsedMessage = (S2C_WeaponLibStarUp_24526)ExclusiveWeaponMsg.S2C_WeaponLibStarUp_24526.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WeaponLibStarUp_24526)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureWeaponIdStarIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.weaponIdStar_ = new ArrayList(this.weaponIdStar_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getWeaponIdStarList() {
            return this.weaponIdStarBuilder_ == null ? Collections.unmodifiableList(this.weaponIdStar_) : this.weaponIdStarBuilder_.getMessageList();
         }

         public int getWeaponIdStarCount() {
            return this.weaponIdStarBuilder_ == null ? this.weaponIdStar_.size() : this.weaponIdStarBuilder_.getCount();
         }

         public CommonMsg.MapDataII getWeaponIdStar(int index) {
            return this.weaponIdStarBuilder_ == null ? (CommonMsg.MapDataII)this.weaponIdStar_.get(index) : (CommonMsg.MapDataII)this.weaponIdStarBuilder_.getMessage(index);
         }

         public Builder setWeaponIdStar(int index, CommonMsg.MapDataII value) {
            if (this.weaponIdStarBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.set(index, value);
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWeaponIdStar(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponIdStarBuilder_ == null) {
               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWeaponIdStar(CommonMsg.MapDataII value) {
            if (this.weaponIdStarBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.add(value);
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWeaponIdStar(int index, CommonMsg.MapDataII value) {
            if (this.weaponIdStarBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.add(index, value);
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWeaponIdStar(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponIdStarBuilder_ == null) {
               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWeaponIdStar(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponIdStarBuilder_ == null) {
               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWeaponIdStar(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.weaponIdStarBuilder_ == null) {
               this.ensureWeaponIdStarIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.weaponIdStar_);
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWeaponIdStar() {
            if (this.weaponIdStarBuilder_ == null) {
               this.weaponIdStar_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.clear();
            }

            return this;
         }

         public Builder removeWeaponIdStar(int index) {
            if (this.weaponIdStarBuilder_ == null) {
               this.ensureWeaponIdStarIsMutable();
               this.weaponIdStar_.remove(index);
               this.onChanged();
            } else {
               this.weaponIdStarBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getWeaponIdStarBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWeaponIdStarFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getWeaponIdStarOrBuilder(int index) {
            return this.weaponIdStarBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.weaponIdStar_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.weaponIdStarBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponIdStarOrBuilderList() {
            return this.weaponIdStarBuilder_ != null ? this.weaponIdStarBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.weaponIdStar_);
         }

         public CommonMsg.MapDataII.Builder addWeaponIdStarBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getWeaponIdStarFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addWeaponIdStarBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWeaponIdStarFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getWeaponIdStarBuilderList() {
            return this.getWeaponIdStarFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getWeaponIdStarFieldBuilder() {
            if (this.weaponIdStarBuilder_ == null) {
               this.weaponIdStarBuilder_ = new RepeatedFieldBuilderV3(this.weaponIdStar_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.weaponIdStar_ = null;
            }

            return this.weaponIdStarBuilder_;
         }

         private void ensureWeaponLibIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.weaponLib_ = new ArrayList(this.weaponLib_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getWeaponLibList() {
            return this.weaponLibBuilder_ == null ? Collections.unmodifiableList(this.weaponLib_) : this.weaponLibBuilder_.getMessageList();
         }

         public int getWeaponLibCount() {
            return this.weaponLibBuilder_ == null ? this.weaponLib_.size() : this.weaponLibBuilder_.getCount();
         }

         public CommonMsg.MapDataII getWeaponLib(int index) {
            return this.weaponLibBuilder_ == null ? (CommonMsg.MapDataII)this.weaponLib_.get(index) : (CommonMsg.MapDataII)this.weaponLibBuilder_.getMessage(index);
         }

         public Builder setWeaponLib(int index, CommonMsg.MapDataII value) {
            if (this.weaponLibBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponLibIsMutable();
               this.weaponLib_.set(index, value);
               this.onChanged();
            } else {
               this.weaponLibBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWeaponLib(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponLibBuilder_ == null) {
               this.ensureWeaponLibIsMutable();
               this.weaponLib_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weaponLibBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWeaponLib(CommonMsg.MapDataII value) {
            if (this.weaponLibBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponLibIsMutable();
               this.weaponLib_.add(value);
               this.onChanged();
            } else {
               this.weaponLibBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWeaponLib(int index, CommonMsg.MapDataII value) {
            if (this.weaponLibBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeaponLibIsMutable();
               this.weaponLib_.add(index, value);
               this.onChanged();
            } else {
               this.weaponLibBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWeaponLib(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponLibBuilder_ == null) {
               this.ensureWeaponLibIsMutable();
               this.weaponLib_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.weaponLibBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWeaponLib(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.weaponLibBuilder_ == null) {
               this.ensureWeaponLibIsMutable();
               this.weaponLib_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weaponLibBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWeaponLib(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.weaponLibBuilder_ == null) {
               this.ensureWeaponLibIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.weaponLib_);
               this.onChanged();
            } else {
               this.weaponLibBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWeaponLib() {
            if (this.weaponLibBuilder_ == null) {
               this.weaponLib_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.weaponLibBuilder_.clear();
            }

            return this;
         }

         public Builder removeWeaponLib(int index) {
            if (this.weaponLibBuilder_ == null) {
               this.ensureWeaponLibIsMutable();
               this.weaponLib_.remove(index);
               this.onChanged();
            } else {
               this.weaponLibBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getWeaponLibBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWeaponLibFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getWeaponLibOrBuilder(int index) {
            return this.weaponLibBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.weaponLib_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.weaponLibBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponLibOrBuilderList() {
            return this.weaponLibBuilder_ != null ? this.weaponLibBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.weaponLib_);
         }

         public CommonMsg.MapDataII.Builder addWeaponLibBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getWeaponLibFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addWeaponLibBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWeaponLibFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getWeaponLibBuilderList() {
            return this.getWeaponLibFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getWeaponLibFieldBuilder() {
            if (this.weaponLibBuilder_ == null) {
               this.weaponLibBuilder_ = new RepeatedFieldBuilderV3(this.weaponLib_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.weaponLib_ = null;
            }

            return this.weaponLibBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_Decompose_24511OrBuilder extends MessageOrBuilder {
      List<Integer> getItemCodeList();

      int getItemCodeCount();

      int getItemCode(int index);
   }

   public interface C2S_Inherit_24513OrBuilder extends MessageOrBuilder {
      boolean hasSource();

      WearStatus getSource();

      WearStatusOrBuilder getSourceOrBuilder();

      boolean hasBeInherit();

      WearStatus getBeInherit();

      WearStatusOrBuilder getBeInheritOrBuilder();
   }

   public interface C2S_LearnSoulSkill_24517OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasSlot();

      int getSlot();

      boolean hasSkillId();

      int getSkillId();
   }

   public interface C2S_Lock_24519OrBuilder extends MessageOrBuilder {
      boolean hasWearStatus();

      WearStatus getWearStatus();

      WearStatusOrBuilder getWearStatusOrBuilder();

      boolean hasType();

      int getType();
   }

   public interface C2S_LvUp_24501OrBuilder extends MessageOrBuilder {
      boolean hasWearStatus();

      WearStatus getWearStatus();

      WearStatusOrBuilder getWearStatusOrBuilder();
   }

   public interface C2S_NoticeInfo_24521OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_NoticePointUnlock_24523OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Reset_24515OrBuilder extends MessageOrBuilder {
      boolean hasWearStatus();

      WearStatus getWearStatus();

      WearStatusOrBuilder getWearStatusOrBuilder();

      boolean hasType();

      int getType();
   }

   public interface C2S_StarUp_24503OrBuilder extends MessageOrBuilder {
      boolean hasWearStatus();

      WearStatus getWearStatus();

      WearStatusOrBuilder getWearStatusOrBuilder();

      List<Integer> getCostItemCodeList();

      int getCostItemCodeCount();

      int getCostItemCode(int index);
   }

   public interface C2S_Undress_24507OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPos();

      CommonMsg.WearPosition getPos();
   }

   public interface C2S_UnlockLibraryInfo_24509OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WeaponLibStarUp_24525OrBuilder extends MessageOrBuilder {
      boolean hasWeaponId();

      int getWeaponId();

      boolean hasStar();

      int getStar();
   }

   public interface C2S_Wear_24505OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPos();

      CommonMsg.WearPosition getPos();

      boolean hasWearStatus();

      WearStatus getWearStatus();

      WearStatusOrBuilder getWearStatusOrBuilder();
   }

   public interface S2C_Decompose_24512OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Inherit_24514OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_LearnSoulSkill_24518OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Lock_24520OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_LvUp_24502OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_NoticeInfo_24522OrBuilder extends MessageOrBuilder {
      List<Integer> getUnlockIdList();

      int getUnlockIdCount();

      int getUnlockId(int index);
   }

   public interface S2C_NoticePointUnlock_24524OrBuilder extends MessageOrBuilder {
      List<Integer> getUnlockIdList();

      int getUnlockIdCount();

      int getUnlockId(int index);
   }

   public interface S2C_Reset_24516OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_StarUp_24504OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Undress_24508OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_UnlockLibraryInfo_24510OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getWeaponIdStarList();

      CommonMsg.MapDataII getWeaponIdStar(int index);

      int getWeaponIdStarCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponIdStarOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getWeaponIdStarOrBuilder(int index);

      List<CommonMsg.MapDataII> getWeaponLibList();

      CommonMsg.MapDataII getWeaponLib(int index);

      int getWeaponLibCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponLibOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getWeaponLibOrBuilder(int index);
   }

   public interface S2C_WeaponLibStarUp_24526OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getWeaponIdStarList();

      CommonMsg.MapDataII getWeaponIdStar(int index);

      int getWeaponIdStarCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponIdStarOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getWeaponIdStarOrBuilder(int index);

      List<CommonMsg.MapDataII> getWeaponLibList();

      CommonMsg.MapDataII getWeaponLib(int index);

      int getWeaponLibCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getWeaponLibOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getWeaponLibOrBuilder(int index);
   }

   public interface S2C_Wear_24506OrBuilder extends MessageOrBuilder {
   }

   public interface WearStatusOrBuilder extends MessageOrBuilder {
      boolean hasStatus();

      int getStatus();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPos();

      CommonMsg.WearPosition getPos();

      boolean hasItemCode();

      int getItemCode();
   }
}
