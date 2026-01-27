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

public final class BagMsg {
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_Item_Info_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_Item_Info_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_ItemDatas_3003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_ItemDatas_3003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_ItemDatas_3004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_ItemDatas_3004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_ItemUpdate_3006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_ItemUpdate_3006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_ItemUse_3007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_ItemUse_3007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_ItemUse_3008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_ItemUse_3008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_ItemSell_3009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_ItemSell_3009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_ItemSell_3010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_ItemSell_3010_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_ItemCompose_3011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_ItemCompose_3011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_ItemCompose_3012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_ItemCompose_3012_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_OpenBox_3013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_OpenBox_3013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_OpenBox_3014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_OpenBox_3014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_OpenSelectBox_3015_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_OpenSelectBox_3015_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_OpenSelectBox_3016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_OpenSelectBox_3016_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_ItemBuy_3017_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_ItemBuy_3017_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_ItemBuyResult_3018_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_ItemBuyResult_3018_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_ViceCompose_3019_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_ViceCompose_3019_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_ViceCompose_3020_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_ViceCompose_3020_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_HeroDressUse_3021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_HeroDressUse_3021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_HeroDressUse_3022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_HeroDressUse_3022_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_ComposeRandomItem_3023_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_ComposeRandomItem_3023_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_ComposeRandomItem_3024_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_ComposeRandomItem_3024_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_MultiSelect_3025_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_MultiSelect_3025_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_MultiSelect_3026_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_MultiSelect_3026_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_EquipExtraCompose_3027_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_EquipExtraCompose_3027_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_EquipExtraCompose_3028_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_EquipExtraCompose_3028_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_ReqItemInfo_3029_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_ReqItemInfo_3029_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_CommonBuy_3031_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_CommonBuy_3031_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_CommonBuy_3032_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_CommonBuy_3032_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_ItemUseNum_3033_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_ItemUseNum_3033_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_ItemUseNum_3034_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_ItemUseNum_3034_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_OneKeyItemCompose_3035_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_OneKeyItemCompose_3035_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_OneKeyItemCompose_3036_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_OneKeyItemCompose_3036_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_CustomPrestige_3037_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_CustomPrestige_3037_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_CustomPrestigeChanged_3038_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_CustomPrestigeChanged_3038_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_C2S_OpenMultipleSelectBox_3201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_C2S_OpenMultipleSelectBox_3201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_OpenMultipleSelectBox_3202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_OpenMultipleSelectBox_3202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_SelectBoxInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_SelectBoxInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_bag_com_gzbz_protobuf_S2C_UpdateCumulative_3208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_bag_com_gzbz_protobuf_S2C_UpdateCumulative_3208_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private BagMsg() {
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
      String[] descriptorData = new String[]{"\n\tBag.proto\u0012\u0015bag.com.gzbz.protobuf\u001a\fcommon.proto\"\u0086\b\n\tItem_Info\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bsubclass\u0018\u0004 \u0001(\u0005\u0012\r\n\u0005score\u0018\u0005 \u0001(\u0005\u0012(\n\nproperties\u0018\u0006 \u0003(\u000b2\u0014.common.PropertyInfo\u0012\u000e\n\u0006skills\u0018\u0007 \u0003(\u0005\u0012\r\n\u0005level\u0018\b \u0001(\u0005\u0012(\n\nrecastPros\u0018\t \u0003(\u000b2\u0014.common.PropertyInfo\u0012\u0014\n\frecastSkills\u0018\n \u0003(\u0005\u0012\u0010\n\bheroCode\u0018\f \u0001(\u0005\u0012\u0010\n\bbreachLv\u0018\r \u0001(\u0005\u0012\u0010\n\bclearNum\u0018\u000e \u0003(\u0005\u0012(\n\nstrongPros\u0018\u000f \u0003(\u000b2\u0014.common.PropertyInfo\u0012%\n\u0007runePro\u0018\u0010 \u0003(\u000b2\u0014.common.RuneStonePro\u0012\u0012\n\nisRuneLock\u0018\u0011 \u0001(\b\u0012\u0017\n\u000fornamentLockPro\u0018\u0012 \u0003(\u0005\u0012\u0012\n\nenableTime\u0018\u0013 \u0001(\u0005\u0012\u0019\n\u0011ornamentProColour\u0018\u0014 \u0003(\u0005\u0012\u001e\n\u0016ornamentExtraProColour\u0018\u0015 \u0003(\u0005\u0012\u000b\n\u0003exp\u0018\u0016 \u0001(\u0005\u0012\u0013\n\u000bartificeVal\u0018\u0017 \u0001(\u0005\u0012\u000e\n\u0006skinId\u0018\u0018 \u0001(\u0005\u0012\u000e\n\u0006isUsed\u0018\u0019 \u0001(\b\u0012\u000e\n\u0006isLock\u0018\u001a \u0001(\b\u0012\u0011\n\tlockSkill\u0018\u001b \u0001(\u0005\u0012\u0019\n\u0011isMainSkillUnlock\u0018\u001c \u0001(\b\u0012\u0010\n\bpetGroup\u0018\u001d \u0003(\u0005\u0012\u000f\n\u0007petStar\u0018\u001e \u0001(\u0005\u0012\u0016\n\u000ehorseLockSkill\u0018\u001f \u0003(\u0005\u0012\u0010\n\bisAwaken\u0018  \u0001(\b\u0012\u0019\n\u0011runeStoneStrength\u0018! \u0001(\u0005\u0012\u0013\n\u000bawakenIndex\u0018\" \u0003(\u0005\u0012\u0017\n\u000fupgradeProgress\u0018# \u0001(\u0005\u0012.\n\u000erefineProperty\u0018$ \u0003(\u000b2\u0016.common.RefineProperty\u0012\u0013\n\u000bbreakUpTime\u0018% \u0001(\u0005\u0012*\n\fgodBeastInfo\u0018& \u0001(\u000b2\u0014.common.GodBeastInfo\u0012+\n\rexclusiveAttr\u0018' \u0003(\u000b2\u0014.common.PropertyInfo\u00128\n\u0013exclusiveWeaponData\u0018( \u0001(\u000b2\u001b.common.ExclusiveWeaponData\u0012&\n\nneiDanInfo\u0018) \u0001(\u000b2\u0012.common.NeiDanInfo\u0012\u000f\n\u0007paramId\u0018* \u0001(\u0005\"&\n\u0012C2S_ItemDatas_3003\u0012\u0010\n\bsubclass\u0018\u0001 \u0002(\u0005\"W\n\u0012S2C_ItemDatas_3004\u0012\u0010\n\bsubclass\u0018\u0001 \u0002(\u0005\u0012/\n\u0005items\u0018\u0002 \u0003(\u000b2 .bag.com.gzbz.protobuf.Item_Info\"F\n\u0013S2C_ItemUpdate_3006\u0012/\n\u0005items\u0018\u0001 \u0003(\u000b2 .bag.com.gzbz.protobuf.Item_Info\"-\n\u0010C2S_ItemUse_3007\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"\"\n\u0010S2C_ItemUse_3008\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"A\n\u0011C2S_ItemSell_3009\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tguideStep\u0018\u0003 \u0001(\u0005\"#\n\u0011S2C_ItemSell_3010\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"D\n\u0014C2S_ItemCompose_3011\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tguideStep\u0018\u0003 \u0001(\u0005\"&\n\u0014S2C_ItemCompose_3012\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"-\n\u0010C2S_OpenBox_3013\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"-\n\u0010S2C_OpenBox_3014\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"?\n\u0016C2S_OpenSelectBox_3015\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0003 \u0002(\u0005\"2\n\u0016S2C_OpenSelectBox_3016\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\"+\n\u0010C2S_ItemBuy_3017\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"(\n\u0016S2C_ItemBuyResult_3018\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"1\n\u0014C2S_ViceCompose_3019\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"&\n\u0014S2C_ViceCompose_3020\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"%\n\u0015C2S_HeroDressUse_3021\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"7\n\u0015S2C_HeroDressUse_3022\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0002 \u0002(\u0005\"7\n\u001aC2S_ComposeRandomItem_3023\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\",\n\u001aS2C_ComposeRandomItem_3024\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"0\n\u0014C2S_MultiSelect_3025\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\"&\n\u0014S2C_MultiSelect_3026\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\">\n\u001aC2S_EquipExtraCompose_3027\u0012\u000e\n\u0006itemId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\",\n\u001aS2C_EquipExtraCompose_3028\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"&\n\u0014C2S_ReqItemInfo_3029\u0012\u000e\n\u0006itemId\u0018\u0001 \u0003(\u0005\"E\n\u0012C2S_CommonBuy_3031\u0012\u000e\n\u0006itemId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nisShowTips\u0018\u0003 \u0001(\b\"$\n\u0012S2C_CommonBuy_3032\u0012\u000e\n\u0006itemId\u0018\u0001 \u0002(\u0005\"\u0015\n\u0013C2S_ItemUseNum_3033\"8\n\u0013S2C_ItemUseNum_3034\u0012!\n\u0006values\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"\u001c\n\u001aC2S_OneKeyItemCompose_3035\",\n\u001aS2C_OneKeyItemCompose_3036\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"9\n\u0017C2S_CustomPrestige_3037\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bprestige\u0018\u0002 \u0002(\t\"B\n\u001eS2C_CustomPrestigeChanged_3038\u0012\u000e\n\u0006itemId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bprestige\u0018\u0002 \u0002(\t\"S\n\u001eC2S_OpenMultipleSelectBox_3201\u00121\n\u0003box\u0018\u0001 \u0003(\u000b2$.bag.com.gzbz.protobuf.SelectBoxInfo\"S\n\u001eS2C_OpenMultipleSelectBox_3202\u00121\n\u0003box\u0018\u0001 \u0003(\u000b2$.bag.com.gzbz.protobuf.SelectBoxInfo\"6\n\rSelectBoxInfo\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0003 \u0002(\u0005\">\n\u0019S2C_UpdateCumulative_3208\u0012!\n\u0006values\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataIIB\u001d\n\u0011com.gzbz.protobufB\u0006BagMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_bag_com_gzbz_protobuf_Item_Info_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_bag_com_gzbz_protobuf_Item_Info_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_Item_Info_descriptor, new String[]{"Code", "Id", "Num", "Subclass", "Score", "Properties", "Skills", "Level", "RecastPros", "RecastSkills", "HeroCode", "BreachLv", "ClearNum", "StrongPros", "RunePro", "IsRuneLock", "OrnamentLockPro", "EnableTime", "OrnamentProColour", "OrnamentExtraProColour", "Exp", "ArtificeVal", "SkinId", "IsUsed", "IsLock", "LockSkill", "IsMainSkillUnlock", "PetGroup", "PetStar", "HorseLockSkill", "IsAwaken", "RuneStoneStrength", "AwakenIndex", "UpgradeProgress", "RefineProperty", "BreakUpTime", "GodBeastInfo", "ExclusiveAttr", "ExclusiveWeaponData", "NeiDanInfo", "ParamId"});
      internal_static_bag_com_gzbz_protobuf_C2S_ItemDatas_3003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_bag_com_gzbz_protobuf_C2S_ItemDatas_3003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_ItemDatas_3003_descriptor, new String[]{"Subclass"});
      internal_static_bag_com_gzbz_protobuf_S2C_ItemDatas_3004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_bag_com_gzbz_protobuf_S2C_ItemDatas_3004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_ItemDatas_3004_descriptor, new String[]{"Subclass", "Items"});
      internal_static_bag_com_gzbz_protobuf_S2C_ItemUpdate_3006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_bag_com_gzbz_protobuf_S2C_ItemUpdate_3006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_ItemUpdate_3006_descriptor, new String[]{"Items"});
      internal_static_bag_com_gzbz_protobuf_C2S_ItemUse_3007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_bag_com_gzbz_protobuf_C2S_ItemUse_3007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_ItemUse_3007_descriptor, new String[]{"Code", "Num"});
      internal_static_bag_com_gzbz_protobuf_S2C_ItemUse_3008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_bag_com_gzbz_protobuf_S2C_ItemUse_3008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_ItemUse_3008_descriptor, new String[]{"Result"});
      internal_static_bag_com_gzbz_protobuf_C2S_ItemSell_3009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_bag_com_gzbz_protobuf_C2S_ItemSell_3009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_ItemSell_3009_descriptor, new String[]{"Code", "Num", "GuideStep"});
      internal_static_bag_com_gzbz_protobuf_S2C_ItemSell_3010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_bag_com_gzbz_protobuf_S2C_ItemSell_3010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_ItemSell_3010_descriptor, new String[]{"Result"});
      internal_static_bag_com_gzbz_protobuf_C2S_ItemCompose_3011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_bag_com_gzbz_protobuf_C2S_ItemCompose_3011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_ItemCompose_3011_descriptor, new String[]{"Code", "Num", "GuideStep"});
      internal_static_bag_com_gzbz_protobuf_S2C_ItemCompose_3012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_bag_com_gzbz_protobuf_S2C_ItemCompose_3012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_ItemCompose_3012_descriptor, new String[]{"Result"});
      internal_static_bag_com_gzbz_protobuf_C2S_OpenBox_3013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_bag_com_gzbz_protobuf_C2S_OpenBox_3013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_OpenBox_3013_descriptor, new String[]{"Code", "Num"});
      internal_static_bag_com_gzbz_protobuf_S2C_OpenBox_3014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_bag_com_gzbz_protobuf_S2C_OpenBox_3014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_OpenBox_3014_descriptor, new String[]{"Code", "Num"});
      internal_static_bag_com_gzbz_protobuf_C2S_OpenSelectBox_3015_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_bag_com_gzbz_protobuf_C2S_OpenSelectBox_3015_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_OpenSelectBox_3015_descriptor, new String[]{"Code", "Id", "Num"});
      internal_static_bag_com_gzbz_protobuf_S2C_OpenSelectBox_3016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_bag_com_gzbz_protobuf_S2C_OpenSelectBox_3016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_OpenSelectBox_3016_descriptor, new String[]{"Code", "Id"});
      internal_static_bag_com_gzbz_protobuf_C2S_ItemBuy_3017_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_bag_com_gzbz_protobuf_C2S_ItemBuy_3017_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_ItemBuy_3017_descriptor, new String[]{"Id", "Num"});
      internal_static_bag_com_gzbz_protobuf_S2C_ItemBuyResult_3018_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_bag_com_gzbz_protobuf_S2C_ItemBuyResult_3018_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_ItemBuyResult_3018_descriptor, new String[]{"Result"});
      internal_static_bag_com_gzbz_protobuf_C2S_ViceCompose_3019_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_bag_com_gzbz_protobuf_C2S_ViceCompose_3019_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_ViceCompose_3019_descriptor, new String[]{"Code", "Num"});
      internal_static_bag_com_gzbz_protobuf_S2C_ViceCompose_3020_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_bag_com_gzbz_protobuf_S2C_ViceCompose_3020_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_ViceCompose_3020_descriptor, new String[]{"Result"});
      internal_static_bag_com_gzbz_protobuf_C2S_HeroDressUse_3021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_bag_com_gzbz_protobuf_C2S_HeroDressUse_3021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_HeroDressUse_3021_descriptor, new String[]{"Code"});
      internal_static_bag_com_gzbz_protobuf_S2C_HeroDressUse_3022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_bag_com_gzbz_protobuf_S2C_HeroDressUse_3022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_HeroDressUse_3022_descriptor, new String[]{"Result", "ItemId"});
      internal_static_bag_com_gzbz_protobuf_C2S_ComposeRandomItem_3023_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_bag_com_gzbz_protobuf_C2S_ComposeRandomItem_3023_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_ComposeRandomItem_3023_descriptor, new String[]{"Code", "Num"});
      internal_static_bag_com_gzbz_protobuf_S2C_ComposeRandomItem_3024_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_bag_com_gzbz_protobuf_S2C_ComposeRandomItem_3024_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_ComposeRandomItem_3024_descriptor, new String[]{"Result"});
      internal_static_bag_com_gzbz_protobuf_C2S_MultiSelect_3025_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_bag_com_gzbz_protobuf_C2S_MultiSelect_3025_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_MultiSelect_3025_descriptor, new String[]{"Code", "Id"});
      internal_static_bag_com_gzbz_protobuf_S2C_MultiSelect_3026_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_bag_com_gzbz_protobuf_S2C_MultiSelect_3026_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_MultiSelect_3026_descriptor, new String[]{"Result"});
      internal_static_bag_com_gzbz_protobuf_C2S_EquipExtraCompose_3027_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_bag_com_gzbz_protobuf_C2S_EquipExtraCompose_3027_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_EquipExtraCompose_3027_descriptor, new String[]{"ItemId", "HeroCode"});
      internal_static_bag_com_gzbz_protobuf_S2C_EquipExtraCompose_3028_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_bag_com_gzbz_protobuf_S2C_EquipExtraCompose_3028_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_EquipExtraCompose_3028_descriptor, new String[]{"Result"});
      internal_static_bag_com_gzbz_protobuf_C2S_ReqItemInfo_3029_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_bag_com_gzbz_protobuf_C2S_ReqItemInfo_3029_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_ReqItemInfo_3029_descriptor, new String[]{"ItemId"});
      internal_static_bag_com_gzbz_protobuf_C2S_CommonBuy_3031_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_bag_com_gzbz_protobuf_C2S_CommonBuy_3031_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_CommonBuy_3031_descriptor, new String[]{"ItemId", "Num", "IsShowTips"});
      internal_static_bag_com_gzbz_protobuf_S2C_CommonBuy_3032_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_bag_com_gzbz_protobuf_S2C_CommonBuy_3032_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_CommonBuy_3032_descriptor, new String[]{"ItemId"});
      internal_static_bag_com_gzbz_protobuf_C2S_ItemUseNum_3033_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_bag_com_gzbz_protobuf_C2S_ItemUseNum_3033_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_ItemUseNum_3033_descriptor, new String[0]);
      internal_static_bag_com_gzbz_protobuf_S2C_ItemUseNum_3034_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_bag_com_gzbz_protobuf_S2C_ItemUseNum_3034_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_ItemUseNum_3034_descriptor, new String[]{"Values"});
      internal_static_bag_com_gzbz_protobuf_C2S_OneKeyItemCompose_3035_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_bag_com_gzbz_protobuf_C2S_OneKeyItemCompose_3035_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_OneKeyItemCompose_3035_descriptor, new String[0]);
      internal_static_bag_com_gzbz_protobuf_S2C_OneKeyItemCompose_3036_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_bag_com_gzbz_protobuf_S2C_OneKeyItemCompose_3036_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_OneKeyItemCompose_3036_descriptor, new String[]{"Result"});
      internal_static_bag_com_gzbz_protobuf_C2S_CustomPrestige_3037_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_bag_com_gzbz_protobuf_C2S_CustomPrestige_3037_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_CustomPrestige_3037_descriptor, new String[]{"Code", "Prestige"});
      internal_static_bag_com_gzbz_protobuf_S2C_CustomPrestigeChanged_3038_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_bag_com_gzbz_protobuf_S2C_CustomPrestigeChanged_3038_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_CustomPrestigeChanged_3038_descriptor, new String[]{"ItemId", "Prestige"});
      internal_static_bag_com_gzbz_protobuf_C2S_OpenMultipleSelectBox_3201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_bag_com_gzbz_protobuf_C2S_OpenMultipleSelectBox_3201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_C2S_OpenMultipleSelectBox_3201_descriptor, new String[]{"Box"});
      internal_static_bag_com_gzbz_protobuf_S2C_OpenMultipleSelectBox_3202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_bag_com_gzbz_protobuf_S2C_OpenMultipleSelectBox_3202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_OpenMultipleSelectBox_3202_descriptor, new String[]{"Box"});
      internal_static_bag_com_gzbz_protobuf_SelectBoxInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_bag_com_gzbz_protobuf_SelectBoxInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_SelectBoxInfo_descriptor, new String[]{"Code", "Id", "Num"});
      internal_static_bag_com_gzbz_protobuf_S2C_UpdateCumulative_3208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_bag_com_gzbz_protobuf_S2C_UpdateCumulative_3208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_bag_com_gzbz_protobuf_S2C_UpdateCumulative_3208_descriptor, new String[]{"Values"});
      CommonMsg.getDescriptor();
   }

   public static final class Item_Info extends GeneratedMessageV3 implements Item_InfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int NUM_FIELD_NUMBER = 3;
      private int num_;
      public static final int SUBCLASS_FIELD_NUMBER = 4;
      private int subclass_;
      public static final int SCORE_FIELD_NUMBER = 5;
      private int score_;
      public static final int PROPERTIES_FIELD_NUMBER = 6;
      private List<CommonMsg.PropertyInfo> properties_;
      public static final int SKILLS_FIELD_NUMBER = 7;
      private Internal.IntList skills_;
      public static final int LEVEL_FIELD_NUMBER = 8;
      private int level_;
      public static final int RECASTPROS_FIELD_NUMBER = 9;
      private List<CommonMsg.PropertyInfo> recastPros_;
      public static final int RECASTSKILLS_FIELD_NUMBER = 10;
      private Internal.IntList recastSkills_;
      public static final int HEROCODE_FIELD_NUMBER = 12;
      private int heroCode_;
      public static final int BREACHLV_FIELD_NUMBER = 13;
      private int breachLv_;
      public static final int CLEARNUM_FIELD_NUMBER = 14;
      private Internal.IntList clearNum_;
      public static final int STRONGPROS_FIELD_NUMBER = 15;
      private List<CommonMsg.PropertyInfo> strongPros_;
      public static final int RUNEPRO_FIELD_NUMBER = 16;
      private List<CommonMsg.RuneStonePro> runePro_;
      public static final int ISRUNELOCK_FIELD_NUMBER = 17;
      private boolean isRuneLock_;
      public static final int ORNAMENTLOCKPRO_FIELD_NUMBER = 18;
      private Internal.IntList ornamentLockPro_;
      public static final int ENABLETIME_FIELD_NUMBER = 19;
      private int enableTime_;
      public static final int ORNAMENTPROCOLOUR_FIELD_NUMBER = 20;
      private Internal.IntList ornamentProColour_;
      public static final int ORNAMENTEXTRAPROCOLOUR_FIELD_NUMBER = 21;
      private Internal.IntList ornamentExtraProColour_;
      public static final int EXP_FIELD_NUMBER = 22;
      private int exp_;
      public static final int ARTIFICEVAL_FIELD_NUMBER = 23;
      private int artificeVal_;
      public static final int SKINID_FIELD_NUMBER = 24;
      private int skinId_;
      public static final int ISUSED_FIELD_NUMBER = 25;
      private boolean isUsed_;
      public static final int ISLOCK_FIELD_NUMBER = 26;
      private boolean isLock_;
      public static final int LOCKSKILL_FIELD_NUMBER = 27;
      private int lockSkill_;
      public static final int ISMAINSKILLUNLOCK_FIELD_NUMBER = 28;
      private boolean isMainSkillUnlock_;
      public static final int PETGROUP_FIELD_NUMBER = 29;
      private Internal.IntList petGroup_;
      public static final int PETSTAR_FIELD_NUMBER = 30;
      private int petStar_;
      public static final int HORSELOCKSKILL_FIELD_NUMBER = 31;
      private Internal.IntList horseLockSkill_;
      public static final int ISAWAKEN_FIELD_NUMBER = 32;
      private boolean isAwaken_;
      public static final int RUNESTONESTRENGTH_FIELD_NUMBER = 33;
      private int runeStoneStrength_;
      public static final int AWAKENINDEX_FIELD_NUMBER = 34;
      private Internal.IntList awakenIndex_;
      public static final int UPGRADEPROGRESS_FIELD_NUMBER = 35;
      private int upgradeProgress_;
      public static final int REFINEPROPERTY_FIELD_NUMBER = 36;
      private List<CommonMsg.RefineProperty> refineProperty_;
      public static final int BREAKUPTIME_FIELD_NUMBER = 37;
      private int breakUpTime_;
      public static final int GODBEASTINFO_FIELD_NUMBER = 38;
      private CommonMsg.GodBeastInfo godBeastInfo_;
      public static final int EXCLUSIVEATTR_FIELD_NUMBER = 39;
      private List<CommonMsg.PropertyInfo> exclusiveAttr_;
      public static final int EXCLUSIVEWEAPONDATA_FIELD_NUMBER = 40;
      private CommonMsg.ExclusiveWeaponData exclusiveWeaponData_;
      public static final int NEIDANINFO_FIELD_NUMBER = 41;
      private CommonMsg.NeiDanInfo neiDanInfo_;
      public static final int PARAMID_FIELD_NUMBER = 42;
      private int paramId_;
      private byte memoizedIsInitialized;
      private static final Item_Info DEFAULT_INSTANCE = new Item_Info();
      /** @deprecated */
      @Deprecated
      public static final Parser<Item_Info> PARSER = new AbstractParser<Item_Info>() {
         public Item_Info parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Item_Info(input, extensionRegistry);
         }
      };

      private Item_Info(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Item_Info() {
         this.memoizedIsInitialized = -1;
         this.properties_ = Collections.emptyList();
         this.skills_ = emptyIntList();
         this.recastPros_ = Collections.emptyList();
         this.recastSkills_ = emptyIntList();
         this.clearNum_ = emptyIntList();
         this.strongPros_ = Collections.emptyList();
         this.runePro_ = Collections.emptyList();
         this.ornamentLockPro_ = emptyIntList();
         this.ornamentProColour_ = emptyIntList();
         this.ornamentExtraProColour_ = emptyIntList();
         this.petGroup_ = emptyIntList();
         this.horseLockSkill_ = emptyIntList();
         this.awakenIndex_ = emptyIntList();
         this.refineProperty_ = Collections.emptyList();
         this.exclusiveAttr_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Item_Info();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Item_Info(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            int mutable_bitField1_ = 0;
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
                        this.code_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.id_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.num_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 8;
                        this.subclass_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 16;
                        this.score_ = input.readInt32();
                        continue;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.properties_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.properties_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        continue;
                     case 56:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.skills_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        this.skills_.addInt(input.readInt32());
                        continue;
                     case 58:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 64) == 0 && input.getBytesUntilLimit() > 0) {
                           this.skills_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }
                        break;
                     case 64:
                        this.bitField0_ |= 32;
                        this.level_ = input.readInt32();
                        continue;
                     case 74:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.recastPros_ = new ArrayList();
                           mutable_bitField0_ |= 256;
                        }

                        this.recastPros_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        continue;
                     case 80:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.recastSkills_ = newIntList();
                           mutable_bitField0_ |= 512;
                        }

                        this.recastSkills_.addInt(input.readInt32());
                        continue;
                     case 82:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 512) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recastSkills_ = newIntList();
                           mutable_bitField0_ |= 512;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recastSkills_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 96:
                        this.bitField0_ |= 64;
                        this.heroCode_ = input.readInt32();
                        continue;
                     case 104:
                        this.bitField0_ |= 128;
                        this.breachLv_ = input.readInt32();
                        continue;
                     case 112:
                        if ((mutable_bitField0_ & 4096) == 0) {
                           this.clearNum_ = newIntList();
                           mutable_bitField0_ |= 4096;
                        }

                        this.clearNum_.addInt(input.readInt32());
                        continue;
                     case 114:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4096) == 0 && input.getBytesUntilLimit() > 0) {
                           this.clearNum_ = newIntList();
                           mutable_bitField0_ |= 4096;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.clearNum_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 122:
                        if ((mutable_bitField0_ & 8192) == 0) {
                           this.strongPros_ = new ArrayList();
                           mutable_bitField0_ |= 8192;
                        }

                        this.strongPros_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        continue;
                     case 130:
                        if ((mutable_bitField0_ & 16384) == 0) {
                           this.runePro_ = new ArrayList();
                           mutable_bitField0_ |= 16384;
                        }

                        this.runePro_.add(input.readMessage(CommonMsg.RuneStonePro.PARSER, extensionRegistry));
                        continue;
                     case 136:
                        this.bitField0_ |= 256;
                        this.isRuneLock_ = input.readBool();
                        continue;
                     case 144:
                        if ((mutable_bitField0_ & 65536) == 0) {
                           this.ornamentLockPro_ = newIntList();
                           mutable_bitField0_ |= 65536;
                        }

                        this.ornamentLockPro_.addInt(input.readInt32());
                        continue;
                     case 146:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 65536) == 0 && input.getBytesUntilLimit() > 0) {
                           this.ornamentLockPro_ = newIntList();
                           mutable_bitField0_ |= 65536;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.ornamentLockPro_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 152:
                        this.bitField0_ |= 512;
                        this.enableTime_ = input.readInt32();
                        continue;
                     case 160:
                        if ((mutable_bitField0_ & 262144) == 0) {
                           this.ornamentProColour_ = newIntList();
                           mutable_bitField0_ |= 262144;
                        }

                        this.ornamentProColour_.addInt(input.readInt32());
                        continue;
                     case 162:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 262144) == 0 && input.getBytesUntilLimit() > 0) {
                           this.ornamentProColour_ = newIntList();
                           mutable_bitField0_ |= 262144;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.ornamentProColour_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 168:
                        if ((mutable_bitField0_ & 524288) == 0) {
                           this.ornamentExtraProColour_ = newIntList();
                           mutable_bitField0_ |= 524288;
                        }

                        this.ornamentExtraProColour_.addInt(input.readInt32());
                        continue;
                     case 170:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 524288) == 0 && input.getBytesUntilLimit() > 0) {
                           this.ornamentExtraProColour_ = newIntList();
                           mutable_bitField0_ |= 524288;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.ornamentExtraProColour_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 176:
                        this.bitField0_ |= 1024;
                        this.exp_ = input.readInt32();
                        continue;
                     case 184:
                        this.bitField0_ |= 2048;
                        this.artificeVal_ = input.readInt32();
                        continue;
                     case 192:
                        this.bitField0_ |= 4096;
                        this.skinId_ = input.readInt32();
                        continue;
                     case 200:
                        this.bitField0_ |= 8192;
                        this.isUsed_ = input.readBool();
                        continue;
                     case 208:
                        this.bitField0_ |= 16384;
                        this.isLock_ = input.readBool();
                        continue;
                     case 216:
                        this.bitField0_ |= 32768;
                        this.lockSkill_ = input.readInt32();
                        continue;
                     case 224:
                        this.bitField0_ |= 65536;
                        this.isMainSkillUnlock_ = input.readBool();
                        continue;
                     case 232:
                        if ((mutable_bitField0_ & 134217728) == 0) {
                           this.petGroup_ = newIntList();
                           mutable_bitField0_ |= 134217728;
                        }

                        this.petGroup_.addInt(input.readInt32());
                        continue;
                     case 234:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 134217728) == 0 && input.getBytesUntilLimit() > 0) {
                           this.petGroup_ = newIntList();
                           mutable_bitField0_ |= 134217728;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.petGroup_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 240:
                        this.bitField0_ |= 131072;
                        this.petStar_ = input.readInt32();
                        continue;
                     case 248:
                        if ((mutable_bitField0_ & 536870912) == 0) {
                           this.horseLockSkill_ = newIntList();
                           mutable_bitField0_ |= 536870912;
                        }

                        this.horseLockSkill_.addInt(input.readInt32());
                        continue;
                     case 250:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 536870912) == 0 && input.getBytesUntilLimit() > 0) {
                           this.horseLockSkill_ = newIntList();
                           mutable_bitField0_ |= 536870912;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.horseLockSkill_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 256:
                        this.bitField0_ |= 262144;
                        this.isAwaken_ = input.readBool();
                        continue;
                     case 264:
                        this.bitField0_ |= 524288;
                        this.runeStoneStrength_ = input.readInt32();
                        continue;
                     case 272:
                        if ((mutable_bitField1_ & 1) == 0) {
                           this.awakenIndex_ = newIntList();
                           mutable_bitField1_ |= 1;
                        }

                        this.awakenIndex_.addInt(input.readInt32());
                        continue;
                     case 274:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField1_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.awakenIndex_ = newIntList();
                           mutable_bitField1_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.awakenIndex_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 280:
                        this.bitField0_ |= 1048576;
                        this.upgradeProgress_ = input.readInt32();
                        continue;
                     case 290:
                        if ((mutable_bitField1_ & 4) == 0) {
                           this.refineProperty_ = new ArrayList();
                           mutable_bitField1_ |= 4;
                        }

                        this.refineProperty_.add(input.readMessage(CommonMsg.RefineProperty.PARSER, extensionRegistry));
                        continue;
                     case 296:
                        this.bitField0_ |= 2097152;
                        this.breakUpTime_ = input.readInt32();
                        continue;
                     case 306:
                        CommonMsg.GodBeastInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4194304) != 0) {
                           subBuilder = this.godBeastInfo_.toBuilder();
                        }

                        this.godBeastInfo_ = (CommonMsg.GodBeastInfo)input.readMessage(CommonMsg.GodBeastInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.godBeastInfo_);
                           this.godBeastInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4194304;
                        continue;
                     case 314:
                        if ((mutable_bitField1_ & 32) == 0) {
                           this.exclusiveAttr_ = new ArrayList();
                           mutable_bitField1_ |= 32;
                        }

                        this.exclusiveAttr_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        continue;
                     case 322:
                        CommonMsg.ExclusiveWeaponData.Builder subBuilder = null;
                        if ((this.bitField0_ & 8388608) != 0) {
                           subBuilder = this.exclusiveWeaponData_.toBuilder();
                        }

                        this.exclusiveWeaponData_ = (CommonMsg.ExclusiveWeaponData)input.readMessage(CommonMsg.ExclusiveWeaponData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.exclusiveWeaponData_);
                           this.exclusiveWeaponData_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8388608;
                        continue;
                     case 330:
                        CommonMsg.NeiDanInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 16777216) != 0) {
                           subBuilder = this.neiDanInfo_.toBuilder();
                        }

                        this.neiDanInfo_ = (CommonMsg.NeiDanInfo)input.readMessage(CommonMsg.NeiDanInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.neiDanInfo_);
                           this.neiDanInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 16777216;
                        continue;
                     case 336:
                        this.bitField0_ |= 33554432;
                        this.paramId_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.skills_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 32) != 0) {
                  this.properties_ = Collections.unmodifiableList(this.properties_);
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.skills_.makeImmutable();
               }

               if ((mutable_bitField0_ & 256) != 0) {
                  this.recastPros_ = Collections.unmodifiableList(this.recastPros_);
               }

               if ((mutable_bitField0_ & 512) != 0) {
                  this.recastSkills_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4096) != 0) {
                  this.clearNum_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8192) != 0) {
                  this.strongPros_ = Collections.unmodifiableList(this.strongPros_);
               }

               if ((mutable_bitField0_ & 16384) != 0) {
                  this.runePro_ = Collections.unmodifiableList(this.runePro_);
               }

               if ((mutable_bitField0_ & 65536) != 0) {
                  this.ornamentLockPro_.makeImmutable();
               }

               if ((mutable_bitField0_ & 262144) != 0) {
                  this.ornamentProColour_.makeImmutable();
               }

               if ((mutable_bitField0_ & 524288) != 0) {
                  this.ornamentExtraProColour_.makeImmutable();
               }

               if ((mutable_bitField0_ & 134217728) != 0) {
                  this.petGroup_.makeImmutable();
               }

               if ((mutable_bitField0_ & 536870912) != 0) {
                  this.horseLockSkill_.makeImmutable();
               }

               if ((mutable_bitField1_ & 1) != 0) {
                  this.awakenIndex_.makeImmutable();
               }

               if ((mutable_bitField1_ & 4) != 0) {
                  this.refineProperty_ = Collections.unmodifiableList(this.refineProperty_);
               }

               if ((mutable_bitField1_ & 32) != 0) {
                  this.exclusiveAttr_ = Collections.unmodifiableList(this.exclusiveAttr_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_Item_Info_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_Item_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(Item_Info.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasSubclass() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSubclass() {
         return this.subclass_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public List<CommonMsg.PropertyInfo> getPropertiesList() {
         return this.properties_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertiesOrBuilderList() {
         return this.properties_;
      }

      public int getPropertiesCount() {
         return this.properties_.size();
      }

      public CommonMsg.PropertyInfo getProperties(int index) {
         return (CommonMsg.PropertyInfo)this.properties_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPropertiesOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.properties_.get(index);
      }

      public List<Integer> getSkillsList() {
         return this.skills_;
      }

      public int getSkillsCount() {
         return this.skills_.size();
      }

      public int getSkills(int index) {
         return this.skills_.getInt(index);
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public List<CommonMsg.PropertyInfo> getRecastProsList() {
         return this.recastPros_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getRecastProsOrBuilderList() {
         return this.recastPros_;
      }

      public int getRecastProsCount() {
         return this.recastPros_.size();
      }

      public CommonMsg.PropertyInfo getRecastPros(int index) {
         return (CommonMsg.PropertyInfo)this.recastPros_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getRecastProsOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.recastPros_.get(index);
      }

      public List<Integer> getRecastSkillsList() {
         return this.recastSkills_;
      }

      public int getRecastSkillsCount() {
         return this.recastSkills_.size();
      }

      public int getRecastSkills(int index) {
         return this.recastSkills_.getInt(index);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasBreachLv() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getBreachLv() {
         return this.breachLv_;
      }

      public List<Integer> getClearNumList() {
         return this.clearNum_;
      }

      public int getClearNumCount() {
         return this.clearNum_.size();
      }

      public int getClearNum(int index) {
         return this.clearNum_.getInt(index);
      }

      public List<CommonMsg.PropertyInfo> getStrongProsList() {
         return this.strongPros_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getStrongProsOrBuilderList() {
         return this.strongPros_;
      }

      public int getStrongProsCount() {
         return this.strongPros_.size();
      }

      public CommonMsg.PropertyInfo getStrongPros(int index) {
         return (CommonMsg.PropertyInfo)this.strongPros_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getStrongProsOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.strongPros_.get(index);
      }

      public List<CommonMsg.RuneStonePro> getRuneProList() {
         return this.runePro_;
      }

      public List<? extends CommonMsg.RuneStoneProOrBuilder> getRuneProOrBuilderList() {
         return this.runePro_;
      }

      public int getRuneProCount() {
         return this.runePro_.size();
      }

      public CommonMsg.RuneStonePro getRunePro(int index) {
         return (CommonMsg.RuneStonePro)this.runePro_.get(index);
      }

      public CommonMsg.RuneStoneProOrBuilder getRuneProOrBuilder(int index) {
         return (CommonMsg.RuneStoneProOrBuilder)this.runePro_.get(index);
      }

      public boolean hasIsRuneLock() {
         return (this.bitField0_ & 256) != 0;
      }

      public boolean getIsRuneLock() {
         return this.isRuneLock_;
      }

      public List<Integer> getOrnamentLockProList() {
         return this.ornamentLockPro_;
      }

      public int getOrnamentLockProCount() {
         return this.ornamentLockPro_.size();
      }

      public int getOrnamentLockPro(int index) {
         return this.ornamentLockPro_.getInt(index);
      }

      public boolean hasEnableTime() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getEnableTime() {
         return this.enableTime_;
      }

      public List<Integer> getOrnamentProColourList() {
         return this.ornamentProColour_;
      }

      public int getOrnamentProColourCount() {
         return this.ornamentProColour_.size();
      }

      public int getOrnamentProColour(int index) {
         return this.ornamentProColour_.getInt(index);
      }

      public List<Integer> getOrnamentExtraProColourList() {
         return this.ornamentExtraProColour_;
      }

      public int getOrnamentExtraProColourCount() {
         return this.ornamentExtraProColour_.size();
      }

      public int getOrnamentExtraProColour(int index) {
         return this.ornamentExtraProColour_.getInt(index);
      }

      public boolean hasExp() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getExp() {
         return this.exp_;
      }

      public boolean hasArtificeVal() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getArtificeVal() {
         return this.artificeVal_;
      }

      public boolean hasSkinId() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getSkinId() {
         return this.skinId_;
      }

      public boolean hasIsUsed() {
         return (this.bitField0_ & 8192) != 0;
      }

      public boolean getIsUsed() {
         return this.isUsed_;
      }

      public boolean hasIsLock() {
         return (this.bitField0_ & 16384) != 0;
      }

      public boolean getIsLock() {
         return this.isLock_;
      }

      public boolean hasLockSkill() {
         return (this.bitField0_ & '耀') != 0;
      }

      public int getLockSkill() {
         return this.lockSkill_;
      }

      public boolean hasIsMainSkillUnlock() {
         return (this.bitField0_ & 65536) != 0;
      }

      public boolean getIsMainSkillUnlock() {
         return this.isMainSkillUnlock_;
      }

      public List<Integer> getPetGroupList() {
         return this.petGroup_;
      }

      public int getPetGroupCount() {
         return this.petGroup_.size();
      }

      public int getPetGroup(int index) {
         return this.petGroup_.getInt(index);
      }

      public boolean hasPetStar() {
         return (this.bitField0_ & 131072) != 0;
      }

      public int getPetStar() {
         return this.petStar_;
      }

      public List<Integer> getHorseLockSkillList() {
         return this.horseLockSkill_;
      }

      public int getHorseLockSkillCount() {
         return this.horseLockSkill_.size();
      }

      public int getHorseLockSkill(int index) {
         return this.horseLockSkill_.getInt(index);
      }

      public boolean hasIsAwaken() {
         return (this.bitField0_ & 262144) != 0;
      }

      public boolean getIsAwaken() {
         return this.isAwaken_;
      }

      public boolean hasRuneStoneStrength() {
         return (this.bitField0_ & 524288) != 0;
      }

      public int getRuneStoneStrength() {
         return this.runeStoneStrength_;
      }

      public List<Integer> getAwakenIndexList() {
         return this.awakenIndex_;
      }

      public int getAwakenIndexCount() {
         return this.awakenIndex_.size();
      }

      public int getAwakenIndex(int index) {
         return this.awakenIndex_.getInt(index);
      }

      public boolean hasUpgradeProgress() {
         return (this.bitField0_ & 1048576) != 0;
      }

      public int getUpgradeProgress() {
         return this.upgradeProgress_;
      }

      public List<CommonMsg.RefineProperty> getRefinePropertyList() {
         return this.refineProperty_;
      }

      public List<? extends CommonMsg.RefinePropertyOrBuilder> getRefinePropertyOrBuilderList() {
         return this.refineProperty_;
      }

      public int getRefinePropertyCount() {
         return this.refineProperty_.size();
      }

      public CommonMsg.RefineProperty getRefineProperty(int index) {
         return (CommonMsg.RefineProperty)this.refineProperty_.get(index);
      }

      public CommonMsg.RefinePropertyOrBuilder getRefinePropertyOrBuilder(int index) {
         return (CommonMsg.RefinePropertyOrBuilder)this.refineProperty_.get(index);
      }

      public boolean hasBreakUpTime() {
         return (this.bitField0_ & 2097152) != 0;
      }

      public int getBreakUpTime() {
         return this.breakUpTime_;
      }

      public boolean hasGodBeastInfo() {
         return (this.bitField0_ & 4194304) != 0;
      }

      public CommonMsg.GodBeastInfo getGodBeastInfo() {
         return this.godBeastInfo_ == null ? CommonMsg.GodBeastInfo.getDefaultInstance() : this.godBeastInfo_;
      }

      public CommonMsg.GodBeastInfoOrBuilder getGodBeastInfoOrBuilder() {
         return this.godBeastInfo_ == null ? CommonMsg.GodBeastInfo.getDefaultInstance() : this.godBeastInfo_;
      }

      public List<CommonMsg.PropertyInfo> getExclusiveAttrList() {
         return this.exclusiveAttr_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getExclusiveAttrOrBuilderList() {
         return this.exclusiveAttr_;
      }

      public int getExclusiveAttrCount() {
         return this.exclusiveAttr_.size();
      }

      public CommonMsg.PropertyInfo getExclusiveAttr(int index) {
         return (CommonMsg.PropertyInfo)this.exclusiveAttr_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getExclusiveAttrOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.exclusiveAttr_.get(index);
      }

      public boolean hasExclusiveWeaponData() {
         return (this.bitField0_ & 8388608) != 0;
      }

      public CommonMsg.ExclusiveWeaponData getExclusiveWeaponData() {
         return this.exclusiveWeaponData_ == null ? CommonMsg.ExclusiveWeaponData.getDefaultInstance() : this.exclusiveWeaponData_;
      }

      public CommonMsg.ExclusiveWeaponDataOrBuilder getExclusiveWeaponDataOrBuilder() {
         return this.exclusiveWeaponData_ == null ? CommonMsg.ExclusiveWeaponData.getDefaultInstance() : this.exclusiveWeaponData_;
      }

      public boolean hasNeiDanInfo() {
         return (this.bitField0_ & 16777216) != 0;
      }

      public CommonMsg.NeiDanInfo getNeiDanInfo() {
         return this.neiDanInfo_ == null ? CommonMsg.NeiDanInfo.getDefaultInstance() : this.neiDanInfo_;
      }

      public CommonMsg.NeiDanInfoOrBuilder getNeiDanInfoOrBuilder() {
         return this.neiDanInfo_ == null ? CommonMsg.NeiDanInfo.getDefaultInstance() : this.neiDanInfo_;
      }

      public boolean hasParamId() {
         return (this.bitField0_ & 33554432) != 0;
      }

      public int getParamId() {
         return this.paramId_;
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
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPropertiesCount(); ++i) {
               if (!this.getProperties(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRecastProsCount(); ++i) {
               if (!this.getRecastPros(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getStrongProsCount(); ++i) {
               if (!this.getStrongPros(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRuneProCount(); ++i) {
               if (!this.getRunePro(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRefinePropertyCount(); ++i) {
               if (!this.getRefineProperty(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasGodBeastInfo() && !this.getGodBeastInfo().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               for(int i = 0; i < this.getExclusiveAttrCount(); ++i) {
                  if (!this.getExclusiveAttr(i).isInitialized()) {
                     this.memoizedIsInitialized = 0;
                     return false;
                  }
               }

               if (this.hasExclusiveWeaponData() && !this.getExclusiveWeaponData().isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               } else if (this.hasNeiDanInfo() && !this.getNeiDanInfo().isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               } else {
                  this.memoizedIsInitialized = 1;
                  return true;
               }
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.num_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.subclass_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.score_);
         }

         for(int i = 0; i < this.properties_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.properties_.get(i));
         }

         for(int i = 0; i < this.skills_.size(); ++i) {
            output.writeInt32(7, this.skills_.getInt(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(8, this.level_);
         }

         for(int i = 0; i < this.recastPros_.size(); ++i) {
            output.writeMessage(9, (MessageLite)this.recastPros_.get(i));
         }

         for(int i = 0; i < this.recastSkills_.size(); ++i) {
            output.writeInt32(10, this.recastSkills_.getInt(i));
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(12, this.heroCode_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(13, this.breachLv_);
         }

         for(int i = 0; i < this.clearNum_.size(); ++i) {
            output.writeInt32(14, this.clearNum_.getInt(i));
         }

         for(int i = 0; i < this.strongPros_.size(); ++i) {
            output.writeMessage(15, (MessageLite)this.strongPros_.get(i));
         }

         for(int i = 0; i < this.runePro_.size(); ++i) {
            output.writeMessage(16, (MessageLite)this.runePro_.get(i));
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeBool(17, this.isRuneLock_);
         }

         for(int i = 0; i < this.ornamentLockPro_.size(); ++i) {
            output.writeInt32(18, this.ornamentLockPro_.getInt(i));
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(19, this.enableTime_);
         }

         for(int i = 0; i < this.ornamentProColour_.size(); ++i) {
            output.writeInt32(20, this.ornamentProColour_.getInt(i));
         }

         for(int i = 0; i < this.ornamentExtraProColour_.size(); ++i) {
            output.writeInt32(21, this.ornamentExtraProColour_.getInt(i));
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(22, this.exp_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(23, this.artificeVal_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(24, this.skinId_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeBool(25, this.isUsed_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            output.writeBool(26, this.isLock_);
         }

         if ((this.bitField0_ & '耀') != 0) {
            output.writeInt32(27, this.lockSkill_);
         }

         if ((this.bitField0_ & 65536) != 0) {
            output.writeBool(28, this.isMainSkillUnlock_);
         }

         for(int i = 0; i < this.petGroup_.size(); ++i) {
            output.writeInt32(29, this.petGroup_.getInt(i));
         }

         if ((this.bitField0_ & 131072) != 0) {
            output.writeInt32(30, this.petStar_);
         }

         for(int i = 0; i < this.horseLockSkill_.size(); ++i) {
            output.writeInt32(31, this.horseLockSkill_.getInt(i));
         }

         if ((this.bitField0_ & 262144) != 0) {
            output.writeBool(32, this.isAwaken_);
         }

         if ((this.bitField0_ & 524288) != 0) {
            output.writeInt32(33, this.runeStoneStrength_);
         }

         for(int i = 0; i < this.awakenIndex_.size(); ++i) {
            output.writeInt32(34, this.awakenIndex_.getInt(i));
         }

         if ((this.bitField0_ & 1048576) != 0) {
            output.writeInt32(35, this.upgradeProgress_);
         }

         for(int i = 0; i < this.refineProperty_.size(); ++i) {
            output.writeMessage(36, (MessageLite)this.refineProperty_.get(i));
         }

         if ((this.bitField0_ & 2097152) != 0) {
            output.writeInt32(37, this.breakUpTime_);
         }

         if ((this.bitField0_ & 4194304) != 0) {
            output.writeMessage(38, this.getGodBeastInfo());
         }

         for(int i = 0; i < this.exclusiveAttr_.size(); ++i) {
            output.writeMessage(39, (MessageLite)this.exclusiveAttr_.get(i));
         }

         if ((this.bitField0_ & 8388608) != 0) {
            output.writeMessage(40, this.getExclusiveWeaponData());
         }

         if ((this.bitField0_ & 16777216) != 0) {
            output.writeMessage(41, this.getNeiDanInfo());
         }

         if ((this.bitField0_ & 33554432) != 0) {
            output.writeInt32(42, this.paramId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.num_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.subclass_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.score_);
            }

            for(int i = 0; i < this.properties_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.properties_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.skills_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.skills_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSkillsList().size();
            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.level_);
            }

            for(int i = 0; i < this.recastPros_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(9, (MessageLite)this.recastPros_.get(i));
            }

            dataSize = 0;

            for(int i = 0; i < this.recastSkills_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recastSkills_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecastSkillsList().size();
            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.heroCode_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.breachLv_);
            }

            dataSize = 0;

            for(int i = 0; i < this.clearNum_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.clearNum_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getClearNumList().size();

            for(int i = 0; i < this.strongPros_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(15, (MessageLite)this.strongPros_.get(i));
            }

            for(int i = 0; i < this.runePro_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(16, (MessageLite)this.runePro_.get(i));
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeBoolSize(17, this.isRuneLock_);
            }

            dataSize = 0;

            for(int i = 0; i < this.ornamentLockPro_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.ornamentLockPro_.getInt(i));
            }

            size += dataSize;
            size += 2 * this.getOrnamentLockProList().size();
            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(19, this.enableTime_);
            }

            dataSize = 0;

            for(int i = 0; i < this.ornamentProColour_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.ornamentProColour_.getInt(i));
            }

            size += dataSize;
            size += 2 * this.getOrnamentProColourList().size();
            dataSize = 0;

            for(int i = 0; i < this.ornamentExtraProColour_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.ornamentExtraProColour_.getInt(i));
            }

            size += dataSize;
            size += 2 * this.getOrnamentExtraProColourList().size();
            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(22, this.exp_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(23, this.artificeVal_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(24, this.skinId_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeBoolSize(25, this.isUsed_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += CodedOutputStream.computeBoolSize(26, this.isLock_);
            }

            if ((this.bitField0_ & '耀') != 0) {
               size += CodedOutputStream.computeInt32Size(27, this.lockSkill_);
            }

            if ((this.bitField0_ & 65536) != 0) {
               size += CodedOutputStream.computeBoolSize(28, this.isMainSkillUnlock_);
            }

            dataSize = 0;

            for(int i = 0; i < this.petGroup_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.petGroup_.getInt(i));
            }

            size += dataSize;
            size += 2 * this.getPetGroupList().size();
            if ((this.bitField0_ & 131072) != 0) {
               size += CodedOutputStream.computeInt32Size(30, this.petStar_);
            }

            dataSize = 0;

            for(int i = 0; i < this.horseLockSkill_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.horseLockSkill_.getInt(i));
            }

            size += dataSize;
            size += 2 * this.getHorseLockSkillList().size();
            if ((this.bitField0_ & 262144) != 0) {
               size += CodedOutputStream.computeBoolSize(32, this.isAwaken_);
            }

            if ((this.bitField0_ & 524288) != 0) {
               size += CodedOutputStream.computeInt32Size(33, this.runeStoneStrength_);
            }

            dataSize = 0;

            for(int i = 0; i < this.awakenIndex_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.awakenIndex_.getInt(i));
            }

            size += dataSize;
            size += 2 * this.getAwakenIndexList().size();
            if ((this.bitField0_ & 1048576) != 0) {
               size += CodedOutputStream.computeInt32Size(35, this.upgradeProgress_);
            }

            for(int i = 0; i < this.refineProperty_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(36, (MessageLite)this.refineProperty_.get(i));
            }

            if ((this.bitField0_ & 2097152) != 0) {
               size += CodedOutputStream.computeInt32Size(37, this.breakUpTime_);
            }

            if ((this.bitField0_ & 4194304) != 0) {
               size += CodedOutputStream.computeMessageSize(38, this.getGodBeastInfo());
            }

            for(int i = 0; i < this.exclusiveAttr_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(39, (MessageLite)this.exclusiveAttr_.get(i));
            }

            if ((this.bitField0_ & 8388608) != 0) {
               size += CodedOutputStream.computeMessageSize(40, this.getExclusiveWeaponData());
            }

            if ((this.bitField0_ & 16777216) != 0) {
               size += CodedOutputStream.computeMessageSize(41, this.getNeiDanInfo());
            }

            if ((this.bitField0_ & 33554432) != 0) {
               size += CodedOutputStream.computeInt32Size(42, this.paramId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Item_Info)) {
            return super.equals(obj);
         } else {
            Item_Info other = (Item_Info)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasSubclass() != other.hasSubclass()) {
               return false;
            } else if (this.hasSubclass() && this.getSubclass() != other.getSubclass()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (!this.getPropertiesList().equals(other.getPropertiesList())) {
               return false;
            } else if (!this.getSkillsList().equals(other.getSkillsList())) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (!this.getRecastProsList().equals(other.getRecastProsList())) {
               return false;
            } else if (!this.getRecastSkillsList().equals(other.getRecastSkillsList())) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasBreachLv() != other.hasBreachLv()) {
               return false;
            } else if (this.hasBreachLv() && this.getBreachLv() != other.getBreachLv()) {
               return false;
            } else if (!this.getClearNumList().equals(other.getClearNumList())) {
               return false;
            } else if (!this.getStrongProsList().equals(other.getStrongProsList())) {
               return false;
            } else if (!this.getRuneProList().equals(other.getRuneProList())) {
               return false;
            } else if (this.hasIsRuneLock() != other.hasIsRuneLock()) {
               return false;
            } else if (this.hasIsRuneLock() && this.getIsRuneLock() != other.getIsRuneLock()) {
               return false;
            } else if (!this.getOrnamentLockProList().equals(other.getOrnamentLockProList())) {
               return false;
            } else if (this.hasEnableTime() != other.hasEnableTime()) {
               return false;
            } else if (this.hasEnableTime() && this.getEnableTime() != other.getEnableTime()) {
               return false;
            } else if (!this.getOrnamentProColourList().equals(other.getOrnamentProColourList())) {
               return false;
            } else if (!this.getOrnamentExtraProColourList().equals(other.getOrnamentExtraProColourList())) {
               return false;
            } else if (this.hasExp() != other.hasExp()) {
               return false;
            } else if (this.hasExp() && this.getExp() != other.getExp()) {
               return false;
            } else if (this.hasArtificeVal() != other.hasArtificeVal()) {
               return false;
            } else if (this.hasArtificeVal() && this.getArtificeVal() != other.getArtificeVal()) {
               return false;
            } else if (this.hasSkinId() != other.hasSkinId()) {
               return false;
            } else if (this.hasSkinId() && this.getSkinId() != other.getSkinId()) {
               return false;
            } else if (this.hasIsUsed() != other.hasIsUsed()) {
               return false;
            } else if (this.hasIsUsed() && this.getIsUsed() != other.getIsUsed()) {
               return false;
            } else if (this.hasIsLock() != other.hasIsLock()) {
               return false;
            } else if (this.hasIsLock() && this.getIsLock() != other.getIsLock()) {
               return false;
            } else if (this.hasLockSkill() != other.hasLockSkill()) {
               return false;
            } else if (this.hasLockSkill() && this.getLockSkill() != other.getLockSkill()) {
               return false;
            } else if (this.hasIsMainSkillUnlock() != other.hasIsMainSkillUnlock()) {
               return false;
            } else if (this.hasIsMainSkillUnlock() && this.getIsMainSkillUnlock() != other.getIsMainSkillUnlock()) {
               return false;
            } else if (!this.getPetGroupList().equals(other.getPetGroupList())) {
               return false;
            } else if (this.hasPetStar() != other.hasPetStar()) {
               return false;
            } else if (this.hasPetStar() && this.getPetStar() != other.getPetStar()) {
               return false;
            } else if (!this.getHorseLockSkillList().equals(other.getHorseLockSkillList())) {
               return false;
            } else if (this.hasIsAwaken() != other.hasIsAwaken()) {
               return false;
            } else if (this.hasIsAwaken() && this.getIsAwaken() != other.getIsAwaken()) {
               return false;
            } else if (this.hasRuneStoneStrength() != other.hasRuneStoneStrength()) {
               return false;
            } else if (this.hasRuneStoneStrength() && this.getRuneStoneStrength() != other.getRuneStoneStrength()) {
               return false;
            } else if (!this.getAwakenIndexList().equals(other.getAwakenIndexList())) {
               return false;
            } else if (this.hasUpgradeProgress() != other.hasUpgradeProgress()) {
               return false;
            } else if (this.hasUpgradeProgress() && this.getUpgradeProgress() != other.getUpgradeProgress()) {
               return false;
            } else if (!this.getRefinePropertyList().equals(other.getRefinePropertyList())) {
               return false;
            } else if (this.hasBreakUpTime() != other.hasBreakUpTime()) {
               return false;
            } else if (this.hasBreakUpTime() && this.getBreakUpTime() != other.getBreakUpTime()) {
               return false;
            } else if (this.hasGodBeastInfo() != other.hasGodBeastInfo()) {
               return false;
            } else if (this.hasGodBeastInfo() && !this.getGodBeastInfo().equals(other.getGodBeastInfo())) {
               return false;
            } else if (!this.getExclusiveAttrList().equals(other.getExclusiveAttrList())) {
               return false;
            } else if (this.hasExclusiveWeaponData() != other.hasExclusiveWeaponData()) {
               return false;
            } else if (this.hasExclusiveWeaponData() && !this.getExclusiveWeaponData().equals(other.getExclusiveWeaponData())) {
               return false;
            } else if (this.hasNeiDanInfo() != other.hasNeiDanInfo()) {
               return false;
            } else if (this.hasNeiDanInfo() && !this.getNeiDanInfo().equals(other.getNeiDanInfo())) {
               return false;
            } else if (this.hasParamId() != other.hasParamId()) {
               return false;
            } else if (this.hasParamId() && this.getParamId() != other.getParamId()) {
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

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasSubclass()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSubclass();
            }

            if (this.hasScore()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getScore();
            }

            if (this.getPropertiesCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getPropertiesList().hashCode();
            }

            if (this.getSkillsCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getSkillsList().hashCode();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getLevel();
            }

            if (this.getRecastProsCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getRecastProsList().hashCode();
            }

            if (this.getRecastSkillsCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getRecastSkillsList().hashCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasBreachLv()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getBreachLv();
            }

            if (this.getClearNumCount() > 0) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getClearNumList().hashCode();
            }

            if (this.getStrongProsCount() > 0) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getStrongProsList().hashCode();
            }

            if (this.getRuneProCount() > 0) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getRuneProList().hashCode();
            }

            if (this.hasIsRuneLock()) {
               hash = 37 * hash + 17;
               hash = 53 * hash + Internal.hashBoolean(this.getIsRuneLock());
            }

            if (this.getOrnamentLockProCount() > 0) {
               hash = 37 * hash + 18;
               hash = 53 * hash + this.getOrnamentLockProList().hashCode();
            }

            if (this.hasEnableTime()) {
               hash = 37 * hash + 19;
               hash = 53 * hash + this.getEnableTime();
            }

            if (this.getOrnamentProColourCount() > 0) {
               hash = 37 * hash + 20;
               hash = 53 * hash + this.getOrnamentProColourList().hashCode();
            }

            if (this.getOrnamentExtraProColourCount() > 0) {
               hash = 37 * hash + 21;
               hash = 53 * hash + this.getOrnamentExtraProColourList().hashCode();
            }

            if (this.hasExp()) {
               hash = 37 * hash + 22;
               hash = 53 * hash + this.getExp();
            }

            if (this.hasArtificeVal()) {
               hash = 37 * hash + 23;
               hash = 53 * hash + this.getArtificeVal();
            }

            if (this.hasSkinId()) {
               hash = 37 * hash + 24;
               hash = 53 * hash + this.getSkinId();
            }

            if (this.hasIsUsed()) {
               hash = 37 * hash + 25;
               hash = 53 * hash + Internal.hashBoolean(this.getIsUsed());
            }

            if (this.hasIsLock()) {
               hash = 37 * hash + 26;
               hash = 53 * hash + Internal.hashBoolean(this.getIsLock());
            }

            if (this.hasLockSkill()) {
               hash = 37 * hash + 27;
               hash = 53 * hash + this.getLockSkill();
            }

            if (this.hasIsMainSkillUnlock()) {
               hash = 37 * hash + 28;
               hash = 53 * hash + Internal.hashBoolean(this.getIsMainSkillUnlock());
            }

            if (this.getPetGroupCount() > 0) {
               hash = 37 * hash + 29;
               hash = 53 * hash + this.getPetGroupList().hashCode();
            }

            if (this.hasPetStar()) {
               hash = 37 * hash + 30;
               hash = 53 * hash + this.getPetStar();
            }

            if (this.getHorseLockSkillCount() > 0) {
               hash = 37 * hash + 31;
               hash = 53 * hash + this.getHorseLockSkillList().hashCode();
            }

            if (this.hasIsAwaken()) {
               hash = 37 * hash + 32;
               hash = 53 * hash + Internal.hashBoolean(this.getIsAwaken());
            }

            if (this.hasRuneStoneStrength()) {
               hash = 37 * hash + 33;
               hash = 53 * hash + this.getRuneStoneStrength();
            }

            if (this.getAwakenIndexCount() > 0) {
               hash = 37 * hash + 34;
               hash = 53 * hash + this.getAwakenIndexList().hashCode();
            }

            if (this.hasUpgradeProgress()) {
               hash = 37 * hash + 35;
               hash = 53 * hash + this.getUpgradeProgress();
            }

            if (this.getRefinePropertyCount() > 0) {
               hash = 37 * hash + 36;
               hash = 53 * hash + this.getRefinePropertyList().hashCode();
            }

            if (this.hasBreakUpTime()) {
               hash = 37 * hash + 37;
               hash = 53 * hash + this.getBreakUpTime();
            }

            if (this.hasGodBeastInfo()) {
               hash = 37 * hash + 38;
               hash = 53 * hash + this.getGodBeastInfo().hashCode();
            }

            if (this.getExclusiveAttrCount() > 0) {
               hash = 37 * hash + 39;
               hash = 53 * hash + this.getExclusiveAttrList().hashCode();
            }

            if (this.hasExclusiveWeaponData()) {
               hash = 37 * hash + 40;
               hash = 53 * hash + this.getExclusiveWeaponData().hashCode();
            }

            if (this.hasNeiDanInfo()) {
               hash = 37 * hash + 41;
               hash = 53 * hash + this.getNeiDanInfo().hashCode();
            }

            if (this.hasParamId()) {
               hash = 37 * hash + 42;
               hash = 53 * hash + this.getParamId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Item_Info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Item_Info)PARSER.parseFrom(data);
      }

      public static Item_Info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Item_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Item_Info parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Item_Info)PARSER.parseFrom(data);
      }

      public static Item_Info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Item_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Item_Info parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Item_Info)PARSER.parseFrom(data);
      }

      public static Item_Info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Item_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Item_Info parseFrom(InputStream input) throws IOException {
         return (Item_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Item_Info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Item_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Item_Info parseDelimitedFrom(InputStream input) throws IOException {
         return (Item_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Item_Info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Item_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Item_Info parseFrom(CodedInputStream input) throws IOException {
         return (Item_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Item_Info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Item_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Item_Info prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Item_Info getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Item_Info> parser() {
         return PARSER;
      }

      public Parser<Item_Info> getParserForType() {
         return PARSER;
      }

      public Item_Info getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Item_InfoOrBuilder {
         private int bitField0_;
         private int bitField1_;
         private int code_;
         private int id_;
         private int num_;
         private int subclass_;
         private int score_;
         private List<CommonMsg.PropertyInfo> properties_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> propertiesBuilder_;
         private Internal.IntList skills_;
         private int level_;
         private List<CommonMsg.PropertyInfo> recastPros_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> recastProsBuilder_;
         private Internal.IntList recastSkills_;
         private int heroCode_;
         private int breachLv_;
         private Internal.IntList clearNum_;
         private List<CommonMsg.PropertyInfo> strongPros_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> strongProsBuilder_;
         private List<CommonMsg.RuneStonePro> runePro_;
         private RepeatedFieldBuilderV3<CommonMsg.RuneStonePro, CommonMsg.RuneStonePro.Builder, CommonMsg.RuneStoneProOrBuilder> runeProBuilder_;
         private boolean isRuneLock_;
         private Internal.IntList ornamentLockPro_;
         private int enableTime_;
         private Internal.IntList ornamentProColour_;
         private Internal.IntList ornamentExtraProColour_;
         private int exp_;
         private int artificeVal_;
         private int skinId_;
         private boolean isUsed_;
         private boolean isLock_;
         private int lockSkill_;
         private boolean isMainSkillUnlock_;
         private Internal.IntList petGroup_;
         private int petStar_;
         private Internal.IntList horseLockSkill_;
         private boolean isAwaken_;
         private int runeStoneStrength_;
         private Internal.IntList awakenIndex_;
         private int upgradeProgress_;
         private List<CommonMsg.RefineProperty> refineProperty_;
         private RepeatedFieldBuilderV3<CommonMsg.RefineProperty, CommonMsg.RefineProperty.Builder, CommonMsg.RefinePropertyOrBuilder> refinePropertyBuilder_;
         private int breakUpTime_;
         private CommonMsg.GodBeastInfo godBeastInfo_;
         private SingleFieldBuilderV3<CommonMsg.GodBeastInfo, CommonMsg.GodBeastInfo.Builder, CommonMsg.GodBeastInfoOrBuilder> godBeastInfoBuilder_;
         private List<CommonMsg.PropertyInfo> exclusiveAttr_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> exclusiveAttrBuilder_;
         private CommonMsg.ExclusiveWeaponData exclusiveWeaponData_;
         private SingleFieldBuilderV3<CommonMsg.ExclusiveWeaponData, CommonMsg.ExclusiveWeaponData.Builder, CommonMsg.ExclusiveWeaponDataOrBuilder> exclusiveWeaponDataBuilder_;
         private CommonMsg.NeiDanInfo neiDanInfo_;
         private SingleFieldBuilderV3<CommonMsg.NeiDanInfo, CommonMsg.NeiDanInfo.Builder, CommonMsg.NeiDanInfoOrBuilder> neiDanInfoBuilder_;
         private int paramId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_Item_Info_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_Item_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(Item_Info.class, Builder.class);
         }

         private Builder() {
            this.properties_ = Collections.emptyList();
            this.skills_ = BagMsg.Item_Info.emptyIntList();
            this.recastPros_ = Collections.emptyList();
            this.recastSkills_ = BagMsg.Item_Info.emptyIntList();
            this.clearNum_ = BagMsg.Item_Info.emptyIntList();
            this.strongPros_ = Collections.emptyList();
            this.runePro_ = Collections.emptyList();
            this.ornamentLockPro_ = BagMsg.Item_Info.emptyIntList();
            this.ornamentProColour_ = BagMsg.Item_Info.emptyIntList();
            this.ornamentExtraProColour_ = BagMsg.Item_Info.emptyIntList();
            this.petGroup_ = BagMsg.Item_Info.emptyIntList();
            this.horseLockSkill_ = BagMsg.Item_Info.emptyIntList();
            this.awakenIndex_ = BagMsg.Item_Info.emptyIntList();
            this.refineProperty_ = Collections.emptyList();
            this.exclusiveAttr_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.properties_ = Collections.emptyList();
            this.skills_ = BagMsg.Item_Info.emptyIntList();
            this.recastPros_ = Collections.emptyList();
            this.recastSkills_ = BagMsg.Item_Info.emptyIntList();
            this.clearNum_ = BagMsg.Item_Info.emptyIntList();
            this.strongPros_ = Collections.emptyList();
            this.runePro_ = Collections.emptyList();
            this.ornamentLockPro_ = BagMsg.Item_Info.emptyIntList();
            this.ornamentProColour_ = BagMsg.Item_Info.emptyIntList();
            this.ornamentExtraProColour_ = BagMsg.Item_Info.emptyIntList();
            this.petGroup_ = BagMsg.Item_Info.emptyIntList();
            this.horseLockSkill_ = BagMsg.Item_Info.emptyIntList();
            this.awakenIndex_ = BagMsg.Item_Info.emptyIntList();
            this.refineProperty_ = Collections.emptyList();
            this.exclusiveAttr_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.Item_Info.alwaysUseFieldBuilders) {
               this.getPropertiesFieldBuilder();
               this.getRecastProsFieldBuilder();
               this.getStrongProsFieldBuilder();
               this.getRuneProFieldBuilder();
               this.getRefinePropertyFieldBuilder();
               this.getGodBeastInfoFieldBuilder();
               this.getExclusiveAttrFieldBuilder();
               this.getExclusiveWeaponDataFieldBuilder();
               this.getNeiDanInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.bitField0_ &= -5;
            this.subclass_ = 0;
            this.bitField0_ &= -9;
            this.score_ = 0;
            this.bitField0_ &= -17;
            if (this.propertiesBuilder_ == null) {
               this.properties_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.propertiesBuilder_.clear();
            }

            this.skills_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -65;
            this.level_ = 0;
            this.bitField0_ &= -129;
            if (this.recastProsBuilder_ == null) {
               this.recastPros_ = Collections.emptyList();
               this.bitField0_ &= -257;
            } else {
               this.recastProsBuilder_.clear();
            }

            this.recastSkills_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -513;
            this.heroCode_ = 0;
            this.bitField0_ &= -1025;
            this.breachLv_ = 0;
            this.bitField0_ &= -2049;
            this.clearNum_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -4097;
            if (this.strongProsBuilder_ == null) {
               this.strongPros_ = Collections.emptyList();
               this.bitField0_ &= -8193;
            } else {
               this.strongProsBuilder_.clear();
            }

            if (this.runeProBuilder_ == null) {
               this.runePro_ = Collections.emptyList();
               this.bitField0_ &= -16385;
            } else {
               this.runeProBuilder_.clear();
            }

            this.isRuneLock_ = false;
            this.bitField0_ &= -32769;
            this.ornamentLockPro_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -65537;
            this.enableTime_ = 0;
            this.bitField0_ &= -131073;
            this.ornamentProColour_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -262145;
            this.ornamentExtraProColour_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -524289;
            this.exp_ = 0;
            this.bitField0_ &= -1048577;
            this.artificeVal_ = 0;
            this.bitField0_ &= -2097153;
            this.skinId_ = 0;
            this.bitField0_ &= -4194305;
            this.isUsed_ = false;
            this.bitField0_ &= -8388609;
            this.isLock_ = false;
            this.bitField0_ &= -16777217;
            this.lockSkill_ = 0;
            this.bitField0_ &= -33554433;
            this.isMainSkillUnlock_ = false;
            this.bitField0_ &= -67108865;
            this.petGroup_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -134217729;
            this.petStar_ = 0;
            this.bitField0_ &= -268435457;
            this.horseLockSkill_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -536870913;
            this.isAwaken_ = false;
            this.bitField0_ &= -1073741825;
            this.runeStoneStrength_ = 0;
            this.bitField0_ &= Integer.MAX_VALUE;
            this.awakenIndex_ = BagMsg.Item_Info.emptyIntList();
            this.bitField1_ &= -2;
            this.upgradeProgress_ = 0;
            this.bitField1_ &= -3;
            if (this.refinePropertyBuilder_ == null) {
               this.refineProperty_ = Collections.emptyList();
               this.bitField1_ &= -5;
            } else {
               this.refinePropertyBuilder_.clear();
            }

            this.breakUpTime_ = 0;
            this.bitField1_ &= -9;
            if (this.godBeastInfoBuilder_ == null) {
               this.godBeastInfo_ = null;
            } else {
               this.godBeastInfoBuilder_.clear();
            }

            this.bitField1_ &= -17;
            if (this.exclusiveAttrBuilder_ == null) {
               this.exclusiveAttr_ = Collections.emptyList();
               this.bitField1_ &= -33;
            } else {
               this.exclusiveAttrBuilder_.clear();
            }

            if (this.exclusiveWeaponDataBuilder_ == null) {
               this.exclusiveWeaponData_ = null;
            } else {
               this.exclusiveWeaponDataBuilder_.clear();
            }

            this.bitField1_ &= -65;
            if (this.neiDanInfoBuilder_ == null) {
               this.neiDanInfo_ = null;
            } else {
               this.neiDanInfoBuilder_.clear();
            }

            this.bitField1_ &= -129;
            this.paramId_ = 0;
            this.bitField1_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_Item_Info_descriptor;
         }

         public Item_Info getDefaultInstanceForType() {
            return BagMsg.Item_Info.getDefaultInstance();
         }

         public Item_Info build() {
            Item_Info result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Item_Info buildPartial() {
            Item_Info result = new Item_Info(this);
            int from_bitField0_ = this.bitField0_;
            int from_bitField1_ = this.bitField1_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.subclass_ = this.subclass_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 16;
            }

            if (this.propertiesBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.properties_ = Collections.unmodifiableList(this.properties_);
                  this.bitField0_ &= -33;
               }

               result.properties_ = this.properties_;
            } else {
               result.properties_ = this.propertiesBuilder_.build();
            }

            if ((this.bitField0_ & 64) != 0) {
               this.skills_.makeImmutable();
               this.bitField0_ &= -65;
            }

            result.skills_ = this.skills_;
            if ((from_bitField0_ & 128) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 32;
            }

            if (this.recastProsBuilder_ == null) {
               if ((this.bitField0_ & 256) != 0) {
                  this.recastPros_ = Collections.unmodifiableList(this.recastPros_);
                  this.bitField0_ &= -257;
               }

               result.recastPros_ = this.recastPros_;
            } else {
               result.recastPros_ = this.recastProsBuilder_.build();
            }

            if ((this.bitField0_ & 512) != 0) {
               this.recastSkills_.makeImmutable();
               this.bitField0_ &= -513;
            }

            result.recastSkills_ = this.recastSkills_;
            if ((from_bitField0_ & 1024) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.breachLv_ = this.breachLv_;
               to_bitField0_ |= 128;
            }

            if ((this.bitField0_ & 4096) != 0) {
               this.clearNum_.makeImmutable();
               this.bitField0_ &= -4097;
            }

            result.clearNum_ = this.clearNum_;
            if (this.strongProsBuilder_ == null) {
               if ((this.bitField0_ & 8192) != 0) {
                  this.strongPros_ = Collections.unmodifiableList(this.strongPros_);
                  this.bitField0_ &= -8193;
               }

               result.strongPros_ = this.strongPros_;
            } else {
               result.strongPros_ = this.strongProsBuilder_.build();
            }

            if (this.runeProBuilder_ == null) {
               if ((this.bitField0_ & 16384) != 0) {
                  this.runePro_ = Collections.unmodifiableList(this.runePro_);
                  this.bitField0_ &= -16385;
               }

               result.runePro_ = this.runePro_;
            } else {
               result.runePro_ = this.runeProBuilder_.build();
            }

            if ((from_bitField0_ & '耀') != 0) {
               result.isRuneLock_ = this.isRuneLock_;
               to_bitField0_ |= 256;
            }

            if ((this.bitField0_ & 65536) != 0) {
               this.ornamentLockPro_.makeImmutable();
               this.bitField0_ &= -65537;
            }

            result.ornamentLockPro_ = this.ornamentLockPro_;
            if ((from_bitField0_ & 131072) != 0) {
               result.enableTime_ = this.enableTime_;
               to_bitField0_ |= 512;
            }

            if ((this.bitField0_ & 262144) != 0) {
               this.ornamentProColour_.makeImmutable();
               this.bitField0_ &= -262145;
            }

            result.ornamentProColour_ = this.ornamentProColour_;
            if ((this.bitField0_ & 524288) != 0) {
               this.ornamentExtraProColour_.makeImmutable();
               this.bitField0_ &= -524289;
            }

            result.ornamentExtraProColour_ = this.ornamentExtraProColour_;
            if ((from_bitField0_ & 1048576) != 0) {
               result.exp_ = this.exp_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2097152) != 0) {
               result.artificeVal_ = this.artificeVal_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4194304) != 0) {
               result.skinId_ = this.skinId_;
               to_bitField0_ |= 4096;
            }

            if ((from_bitField0_ & 8388608) != 0) {
               result.isUsed_ = this.isUsed_;
               to_bitField0_ |= 8192;
            }

            if ((from_bitField0_ & 16777216) != 0) {
               result.isLock_ = this.isLock_;
               to_bitField0_ |= 16384;
            }

            if ((from_bitField0_ & 33554432) != 0) {
               result.lockSkill_ = this.lockSkill_;
               to_bitField0_ |= 32768;
            }

            if ((from_bitField0_ & 67108864) != 0) {
               result.isMainSkillUnlock_ = this.isMainSkillUnlock_;
               to_bitField0_ |= 65536;
            }

            if ((this.bitField0_ & 134217728) != 0) {
               this.petGroup_.makeImmutable();
               this.bitField0_ &= -134217729;
            }

            result.petGroup_ = this.petGroup_;
            if ((from_bitField0_ & 268435456) != 0) {
               result.petStar_ = this.petStar_;
               to_bitField0_ |= 131072;
            }

            if ((this.bitField0_ & 536870912) != 0) {
               this.horseLockSkill_.makeImmutable();
               this.bitField0_ &= -536870913;
            }

            result.horseLockSkill_ = this.horseLockSkill_;
            if ((from_bitField0_ & 1073741824) != 0) {
               result.isAwaken_ = this.isAwaken_;
               to_bitField0_ |= 262144;
            }

            if ((from_bitField0_ & Integer.MIN_VALUE) != 0) {
               result.runeStoneStrength_ = this.runeStoneStrength_;
               to_bitField0_ |= 524288;
            }

            if ((this.bitField1_ & 1) != 0) {
               this.awakenIndex_.makeImmutable();
               this.bitField1_ &= -2;
            }

            result.awakenIndex_ = this.awakenIndex_;
            if ((from_bitField1_ & 2) != 0) {
               result.upgradeProgress_ = this.upgradeProgress_;
               to_bitField0_ |= 1048576;
            }

            if (this.refinePropertyBuilder_ == null) {
               if ((this.bitField1_ & 4) != 0) {
                  this.refineProperty_ = Collections.unmodifiableList(this.refineProperty_);
                  this.bitField1_ &= -5;
               }

               result.refineProperty_ = this.refineProperty_;
            } else {
               result.refineProperty_ = this.refinePropertyBuilder_.build();
            }

            if ((from_bitField1_ & 8) != 0) {
               result.breakUpTime_ = this.breakUpTime_;
               to_bitField0_ |= 2097152;
            }

            if ((from_bitField1_ & 16) != 0) {
               if (this.godBeastInfoBuilder_ == null) {
                  result.godBeastInfo_ = this.godBeastInfo_;
               } else {
                  result.godBeastInfo_ = (CommonMsg.GodBeastInfo)this.godBeastInfoBuilder_.build();
               }

               to_bitField0_ |= 4194304;
            }

            if (this.exclusiveAttrBuilder_ == null) {
               if ((this.bitField1_ & 32) != 0) {
                  this.exclusiveAttr_ = Collections.unmodifiableList(this.exclusiveAttr_);
                  this.bitField1_ &= -33;
               }

               result.exclusiveAttr_ = this.exclusiveAttr_;
            } else {
               result.exclusiveAttr_ = this.exclusiveAttrBuilder_.build();
            }

            if ((from_bitField1_ & 64) != 0) {
               if (this.exclusiveWeaponDataBuilder_ == null) {
                  result.exclusiveWeaponData_ = this.exclusiveWeaponData_;
               } else {
                  result.exclusiveWeaponData_ = (CommonMsg.ExclusiveWeaponData)this.exclusiveWeaponDataBuilder_.build();
               }

               to_bitField0_ |= 8388608;
            }

            if ((from_bitField1_ & 128) != 0) {
               if (this.neiDanInfoBuilder_ == null) {
                  result.neiDanInfo_ = this.neiDanInfo_;
               } else {
                  result.neiDanInfo_ = (CommonMsg.NeiDanInfo)this.neiDanInfoBuilder_.build();
               }

               to_bitField0_ |= 16777216;
            }

            if ((from_bitField1_ & 256) != 0) {
               result.paramId_ = this.paramId_;
               to_bitField0_ |= 33554432;
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
            if (other instanceof Item_Info) {
               return this.mergeFrom((Item_Info)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Item_Info other) {
            if (other == BagMsg.Item_Info.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasSubclass()) {
                  this.setSubclass(other.getSubclass());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (this.propertiesBuilder_ == null) {
                  if (!other.properties_.isEmpty()) {
                     if (this.properties_.isEmpty()) {
                        this.properties_ = other.properties_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensurePropertiesIsMutable();
                        this.properties_.addAll(other.properties_);
                     }

                     this.onChanged();
                  }
               } else if (!other.properties_.isEmpty()) {
                  if (this.propertiesBuilder_.isEmpty()) {
                     this.propertiesBuilder_.dispose();
                     this.propertiesBuilder_ = null;
                     this.properties_ = other.properties_;
                     this.bitField0_ &= -33;
                     this.propertiesBuilder_ = BagMsg.Item_Info.alwaysUseFieldBuilders ? this.getPropertiesFieldBuilder() : null;
                  } else {
                     this.propertiesBuilder_.addAllMessages(other.properties_);
                  }
               }

               if (!other.skills_.isEmpty()) {
                  if (this.skills_.isEmpty()) {
                     this.skills_ = other.skills_;
                     this.bitField0_ &= -65;
                  } else {
                     this.ensureSkillsIsMutable();
                     this.skills_.addAll(other.skills_);
                  }

                  this.onChanged();
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (this.recastProsBuilder_ == null) {
                  if (!other.recastPros_.isEmpty()) {
                     if (this.recastPros_.isEmpty()) {
                        this.recastPros_ = other.recastPros_;
                        this.bitField0_ &= -257;
                     } else {
                        this.ensureRecastProsIsMutable();
                        this.recastPros_.addAll(other.recastPros_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recastPros_.isEmpty()) {
                  if (this.recastProsBuilder_.isEmpty()) {
                     this.recastProsBuilder_.dispose();
                     this.recastProsBuilder_ = null;
                     this.recastPros_ = other.recastPros_;
                     this.bitField0_ &= -257;
                     this.recastProsBuilder_ = BagMsg.Item_Info.alwaysUseFieldBuilders ? this.getRecastProsFieldBuilder() : null;
                  } else {
                     this.recastProsBuilder_.addAllMessages(other.recastPros_);
                  }
               }

               if (!other.recastSkills_.isEmpty()) {
                  if (this.recastSkills_.isEmpty()) {
                     this.recastSkills_ = other.recastSkills_;
                     this.bitField0_ &= -513;
                  } else {
                     this.ensureRecastSkillsIsMutable();
                     this.recastSkills_.addAll(other.recastSkills_);
                  }

                  this.onChanged();
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasBreachLv()) {
                  this.setBreachLv(other.getBreachLv());
               }

               if (!other.clearNum_.isEmpty()) {
                  if (this.clearNum_.isEmpty()) {
                     this.clearNum_ = other.clearNum_;
                     this.bitField0_ &= -4097;
                  } else {
                     this.ensureClearNumIsMutable();
                     this.clearNum_.addAll(other.clearNum_);
                  }

                  this.onChanged();
               }

               if (this.strongProsBuilder_ == null) {
                  if (!other.strongPros_.isEmpty()) {
                     if (this.strongPros_.isEmpty()) {
                        this.strongPros_ = other.strongPros_;
                        this.bitField0_ &= -8193;
                     } else {
                        this.ensureStrongProsIsMutable();
                        this.strongPros_.addAll(other.strongPros_);
                     }

                     this.onChanged();
                  }
               } else if (!other.strongPros_.isEmpty()) {
                  if (this.strongProsBuilder_.isEmpty()) {
                     this.strongProsBuilder_.dispose();
                     this.strongProsBuilder_ = null;
                     this.strongPros_ = other.strongPros_;
                     this.bitField0_ &= -8193;
                     this.strongProsBuilder_ = BagMsg.Item_Info.alwaysUseFieldBuilders ? this.getStrongProsFieldBuilder() : null;
                  } else {
                     this.strongProsBuilder_.addAllMessages(other.strongPros_);
                  }
               }

               if (this.runeProBuilder_ == null) {
                  if (!other.runePro_.isEmpty()) {
                     if (this.runePro_.isEmpty()) {
                        this.runePro_ = other.runePro_;
                        this.bitField0_ &= -16385;
                     } else {
                        this.ensureRuneProIsMutable();
                        this.runePro_.addAll(other.runePro_);
                     }

                     this.onChanged();
                  }
               } else if (!other.runePro_.isEmpty()) {
                  if (this.runeProBuilder_.isEmpty()) {
                     this.runeProBuilder_.dispose();
                     this.runeProBuilder_ = null;
                     this.runePro_ = other.runePro_;
                     this.bitField0_ &= -16385;
                     this.runeProBuilder_ = BagMsg.Item_Info.alwaysUseFieldBuilders ? this.getRuneProFieldBuilder() : null;
                  } else {
                     this.runeProBuilder_.addAllMessages(other.runePro_);
                  }
               }

               if (other.hasIsRuneLock()) {
                  this.setIsRuneLock(other.getIsRuneLock());
               }

               if (!other.ornamentLockPro_.isEmpty()) {
                  if (this.ornamentLockPro_.isEmpty()) {
                     this.ornamentLockPro_ = other.ornamentLockPro_;
                     this.bitField0_ &= -65537;
                  } else {
                     this.ensureOrnamentLockProIsMutable();
                     this.ornamentLockPro_.addAll(other.ornamentLockPro_);
                  }

                  this.onChanged();
               }

               if (other.hasEnableTime()) {
                  this.setEnableTime(other.getEnableTime());
               }

               if (!other.ornamentProColour_.isEmpty()) {
                  if (this.ornamentProColour_.isEmpty()) {
                     this.ornamentProColour_ = other.ornamentProColour_;
                     this.bitField0_ &= -262145;
                  } else {
                     this.ensureOrnamentProColourIsMutable();
                     this.ornamentProColour_.addAll(other.ornamentProColour_);
                  }

                  this.onChanged();
               }

               if (!other.ornamentExtraProColour_.isEmpty()) {
                  if (this.ornamentExtraProColour_.isEmpty()) {
                     this.ornamentExtraProColour_ = other.ornamentExtraProColour_;
                     this.bitField0_ &= -524289;
                  } else {
                     this.ensureOrnamentExtraProColourIsMutable();
                     this.ornamentExtraProColour_.addAll(other.ornamentExtraProColour_);
                  }

                  this.onChanged();
               }

               if (other.hasExp()) {
                  this.setExp(other.getExp());
               }

               if (other.hasArtificeVal()) {
                  this.setArtificeVal(other.getArtificeVal());
               }

               if (other.hasSkinId()) {
                  this.setSkinId(other.getSkinId());
               }

               if (other.hasIsUsed()) {
                  this.setIsUsed(other.getIsUsed());
               }

               if (other.hasIsLock()) {
                  this.setIsLock(other.getIsLock());
               }

               if (other.hasLockSkill()) {
                  this.setLockSkill(other.getLockSkill());
               }

               if (other.hasIsMainSkillUnlock()) {
                  this.setIsMainSkillUnlock(other.getIsMainSkillUnlock());
               }

               if (!other.petGroup_.isEmpty()) {
                  if (this.petGroup_.isEmpty()) {
                     this.petGroup_ = other.petGroup_;
                     this.bitField0_ &= -134217729;
                  } else {
                     this.ensurePetGroupIsMutable();
                     this.petGroup_.addAll(other.petGroup_);
                  }

                  this.onChanged();
               }

               if (other.hasPetStar()) {
                  this.setPetStar(other.getPetStar());
               }

               if (!other.horseLockSkill_.isEmpty()) {
                  if (this.horseLockSkill_.isEmpty()) {
                     this.horseLockSkill_ = other.horseLockSkill_;
                     this.bitField0_ &= -536870913;
                  } else {
                     this.ensureHorseLockSkillIsMutable();
                     this.horseLockSkill_.addAll(other.horseLockSkill_);
                  }

                  this.onChanged();
               }

               if (other.hasIsAwaken()) {
                  this.setIsAwaken(other.getIsAwaken());
               }

               if (other.hasRuneStoneStrength()) {
                  this.setRuneStoneStrength(other.getRuneStoneStrength());
               }

               if (!other.awakenIndex_.isEmpty()) {
                  if (this.awakenIndex_.isEmpty()) {
                     this.awakenIndex_ = other.awakenIndex_;
                     this.bitField1_ &= -2;
                  } else {
                     this.ensureAwakenIndexIsMutable();
                     this.awakenIndex_.addAll(other.awakenIndex_);
                  }

                  this.onChanged();
               }

               if (other.hasUpgradeProgress()) {
                  this.setUpgradeProgress(other.getUpgradeProgress());
               }

               if (this.refinePropertyBuilder_ == null) {
                  if (!other.refineProperty_.isEmpty()) {
                     if (this.refineProperty_.isEmpty()) {
                        this.refineProperty_ = other.refineProperty_;
                        this.bitField1_ &= -5;
                     } else {
                        this.ensureRefinePropertyIsMutable();
                        this.refineProperty_.addAll(other.refineProperty_);
                     }

                     this.onChanged();
                  }
               } else if (!other.refineProperty_.isEmpty()) {
                  if (this.refinePropertyBuilder_.isEmpty()) {
                     this.refinePropertyBuilder_.dispose();
                     this.refinePropertyBuilder_ = null;
                     this.refineProperty_ = other.refineProperty_;
                     this.bitField1_ &= -5;
                     this.refinePropertyBuilder_ = BagMsg.Item_Info.alwaysUseFieldBuilders ? this.getRefinePropertyFieldBuilder() : null;
                  } else {
                     this.refinePropertyBuilder_.addAllMessages(other.refineProperty_);
                  }
               }

               if (other.hasBreakUpTime()) {
                  this.setBreakUpTime(other.getBreakUpTime());
               }

               if (other.hasGodBeastInfo()) {
                  this.mergeGodBeastInfo(other.getGodBeastInfo());
               }

               if (this.exclusiveAttrBuilder_ == null) {
                  if (!other.exclusiveAttr_.isEmpty()) {
                     if (this.exclusiveAttr_.isEmpty()) {
                        this.exclusiveAttr_ = other.exclusiveAttr_;
                        this.bitField1_ &= -33;
                     } else {
                        this.ensureExclusiveAttrIsMutable();
                        this.exclusiveAttr_.addAll(other.exclusiveAttr_);
                     }

                     this.onChanged();
                  }
               } else if (!other.exclusiveAttr_.isEmpty()) {
                  if (this.exclusiveAttrBuilder_.isEmpty()) {
                     this.exclusiveAttrBuilder_.dispose();
                     this.exclusiveAttrBuilder_ = null;
                     this.exclusiveAttr_ = other.exclusiveAttr_;
                     this.bitField1_ &= -33;
                     this.exclusiveAttrBuilder_ = BagMsg.Item_Info.alwaysUseFieldBuilders ? this.getExclusiveAttrFieldBuilder() : null;
                  } else {
                     this.exclusiveAttrBuilder_.addAllMessages(other.exclusiveAttr_);
                  }
               }

               if (other.hasExclusiveWeaponData()) {
                  this.mergeExclusiveWeaponData(other.getExclusiveWeaponData());
               }

               if (other.hasNeiDanInfo()) {
                  this.mergeNeiDanInfo(other.getNeiDanInfo());
               }

               if (other.hasParamId()) {
                  this.setParamId(other.getParamId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else if (!this.hasNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getPropertiesCount(); ++i) {
                  if (!this.getProperties(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getRecastProsCount(); ++i) {
                  if (!this.getRecastPros(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getStrongProsCount(); ++i) {
                  if (!this.getStrongPros(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getRuneProCount(); ++i) {
                  if (!this.getRunePro(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getRefinePropertyCount(); ++i) {
                  if (!this.getRefineProperty(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasGodBeastInfo() && !this.getGodBeastInfo().isInitialized()) {
                  return false;
               } else {
                  for(int i = 0; i < this.getExclusiveAttrCount(); ++i) {
                     if (!this.getExclusiveAttr(i).isInitialized()) {
                        return false;
                     }
                  }

                  if (this.hasExclusiveWeaponData() && !this.getExclusiveWeaponData().isInitialized()) {
                     return false;
                  } else if (this.hasNeiDanInfo() && !this.getNeiDanInfo().isInitialized()) {
                     return false;
                  } else {
                     return true;
                  }
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Item_Info parsedMessage = null;

            try {
               parsedMessage = (Item_Info)BagMsg.Item_Info.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Item_Info)e.getUnfinishedMessage();
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

         public boolean hasNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 4;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -5;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSubclass() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSubclass() {
            return this.subclass_;
         }

         public Builder setSubclass(int value) {
            this.bitField0_ |= 8;
            this.subclass_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSubclass() {
            this.bitField0_ &= -9;
            this.subclass_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getScore() {
            return this.score_;
         }

         public Builder setScore(int value) {
            this.bitField0_ |= 16;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -17;
            this.score_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePropertiesIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.properties_ = new ArrayList(this.properties_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.PropertyInfo> getPropertiesList() {
            return this.propertiesBuilder_ == null ? Collections.unmodifiableList(this.properties_) : this.propertiesBuilder_.getMessageList();
         }

         public int getPropertiesCount() {
            return this.propertiesBuilder_ == null ? this.properties_.size() : this.propertiesBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getProperties(int index) {
            return this.propertiesBuilder_ == null ? (CommonMsg.PropertyInfo)this.properties_.get(index) : (CommonMsg.PropertyInfo)this.propertiesBuilder_.getMessage(index);
         }

         public Builder setProperties(int index, CommonMsg.PropertyInfo value) {
            if (this.propertiesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertiesIsMutable();
               this.properties_.set(index, value);
               this.onChanged();
            } else {
               this.propertiesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setProperties(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertiesBuilder_ == null) {
               this.ensurePropertiesIsMutable();
               this.properties_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertiesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addProperties(CommonMsg.PropertyInfo value) {
            if (this.propertiesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertiesIsMutable();
               this.properties_.add(value);
               this.onChanged();
            } else {
               this.propertiesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addProperties(int index, CommonMsg.PropertyInfo value) {
            if (this.propertiesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertiesIsMutable();
               this.properties_.add(index, value);
               this.onChanged();
            } else {
               this.propertiesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addProperties(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertiesBuilder_ == null) {
               this.ensurePropertiesIsMutable();
               this.properties_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertiesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addProperties(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertiesBuilder_ == null) {
               this.ensurePropertiesIsMutable();
               this.properties_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertiesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllProperties(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.propertiesBuilder_ == null) {
               this.ensurePropertiesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.properties_);
               this.onChanged();
            } else {
               this.propertiesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearProperties() {
            if (this.propertiesBuilder_ == null) {
               this.properties_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.propertiesBuilder_.clear();
            }

            return this;
         }

         public Builder removeProperties(int index) {
            if (this.propertiesBuilder_ == null) {
               this.ensurePropertiesIsMutable();
               this.properties_.remove(index);
               this.onChanged();
            } else {
               this.propertiesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPropertiesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertiesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPropertiesOrBuilder(int index) {
            return this.propertiesBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.properties_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.propertiesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertiesOrBuilderList() {
            return this.propertiesBuilder_ != null ? this.propertiesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.properties_);
         }

         public CommonMsg.PropertyInfo.Builder addPropertiesBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertiesFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPropertiesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertiesFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPropertiesBuilderList() {
            return this.getPropertiesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPropertiesFieldBuilder() {
            if (this.propertiesBuilder_ == null) {
               this.propertiesBuilder_ = new RepeatedFieldBuilderV3(this.properties_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.properties_ = null;
            }

            return this.propertiesBuilder_;
         }

         private void ensureSkillsIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.skills_ = BagMsg.Item_Info.mutableCopy(this.skills_);
               this.bitField0_ |= 64;
            }

         }

         public List<Integer> getSkillsList() {
            return (List<Integer>)((this.bitField0_ & 64) != 0 ? Collections.unmodifiableList(this.skills_) : this.skills_);
         }

         public int getSkillsCount() {
            return this.skills_.size();
         }

         public int getSkills(int index) {
            return this.skills_.getInt(index);
         }

         public Builder setSkills(int index, int value) {
            this.ensureSkillsIsMutable();
            this.skills_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSkills(int value) {
            this.ensureSkillsIsMutable();
            this.skills_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSkills(Iterable<? extends Integer> values) {
            this.ensureSkillsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.skills_);
            this.onChanged();
            return this;
         }

         public Builder clearSkills() {
            this.skills_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -65;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 128;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -129;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRecastProsIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.recastPros_ = new ArrayList(this.recastPros_);
               this.bitField0_ |= 256;
            }

         }

         public List<CommonMsg.PropertyInfo> getRecastProsList() {
            return this.recastProsBuilder_ == null ? Collections.unmodifiableList(this.recastPros_) : this.recastProsBuilder_.getMessageList();
         }

         public int getRecastProsCount() {
            return this.recastProsBuilder_ == null ? this.recastPros_.size() : this.recastProsBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getRecastPros(int index) {
            return this.recastProsBuilder_ == null ? (CommonMsg.PropertyInfo)this.recastPros_.get(index) : (CommonMsg.PropertyInfo)this.recastProsBuilder_.getMessage(index);
         }

         public Builder setRecastPros(int index, CommonMsg.PropertyInfo value) {
            if (this.recastProsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecastProsIsMutable();
               this.recastPros_.set(index, value);
               this.onChanged();
            } else {
               this.recastProsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecastPros(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.recastProsBuilder_ == null) {
               this.ensureRecastProsIsMutable();
               this.recastPros_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recastProsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecastPros(CommonMsg.PropertyInfo value) {
            if (this.recastProsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecastProsIsMutable();
               this.recastPros_.add(value);
               this.onChanged();
            } else {
               this.recastProsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecastPros(int index, CommonMsg.PropertyInfo value) {
            if (this.recastProsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecastProsIsMutable();
               this.recastPros_.add(index, value);
               this.onChanged();
            } else {
               this.recastProsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecastPros(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.recastProsBuilder_ == null) {
               this.ensureRecastProsIsMutable();
               this.recastPros_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recastProsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecastPros(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.recastProsBuilder_ == null) {
               this.ensureRecastProsIsMutable();
               this.recastPros_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recastProsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecastPros(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.recastProsBuilder_ == null) {
               this.ensureRecastProsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recastPros_);
               this.onChanged();
            } else {
               this.recastProsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecastPros() {
            if (this.recastProsBuilder_ == null) {
               this.recastPros_ = Collections.emptyList();
               this.bitField0_ &= -257;
               this.onChanged();
            } else {
               this.recastProsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecastPros(int index) {
            if (this.recastProsBuilder_ == null) {
               this.ensureRecastProsIsMutable();
               this.recastPros_.remove(index);
               this.onChanged();
            } else {
               this.recastProsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getRecastProsBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getRecastProsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getRecastProsOrBuilder(int index) {
            return this.recastProsBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.recastPros_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.recastProsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getRecastProsOrBuilderList() {
            return this.recastProsBuilder_ != null ? this.recastProsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recastPros_);
         }

         public CommonMsg.PropertyInfo.Builder addRecastProsBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getRecastProsFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addRecastProsBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getRecastProsFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getRecastProsBuilderList() {
            return this.getRecastProsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getRecastProsFieldBuilder() {
            if (this.recastProsBuilder_ == null) {
               this.recastProsBuilder_ = new RepeatedFieldBuilderV3(this.recastPros_, (this.bitField0_ & 256) != 0, this.getParentForChildren(), this.isClean());
               this.recastPros_ = null;
            }

            return this.recastProsBuilder_;
         }

         private void ensureRecastSkillsIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.recastSkills_ = BagMsg.Item_Info.mutableCopy(this.recastSkills_);
               this.bitField0_ |= 512;
            }

         }

         public List<Integer> getRecastSkillsList() {
            return (List<Integer>)((this.bitField0_ & 512) != 0 ? Collections.unmodifiableList(this.recastSkills_) : this.recastSkills_);
         }

         public int getRecastSkillsCount() {
            return this.recastSkills_.size();
         }

         public int getRecastSkills(int index) {
            return this.recastSkills_.getInt(index);
         }

         public Builder setRecastSkills(int index, int value) {
            this.ensureRecastSkillsIsMutable();
            this.recastSkills_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecastSkills(int value) {
            this.ensureRecastSkillsIsMutable();
            this.recastSkills_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecastSkills(Iterable<? extends Integer> values) {
            this.ensureRecastSkillsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recastSkills_);
            this.onChanged();
            return this;
         }

         public Builder clearRecastSkills() {
            this.recastSkills_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -513;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1024;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -1025;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBreachLv() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getBreachLv() {
            return this.breachLv_;
         }

         public Builder setBreachLv(int value) {
            this.bitField0_ |= 2048;
            this.breachLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBreachLv() {
            this.bitField0_ &= -2049;
            this.breachLv_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureClearNumIsMutable() {
            if ((this.bitField0_ & 4096) == 0) {
               this.clearNum_ = BagMsg.Item_Info.mutableCopy(this.clearNum_);
               this.bitField0_ |= 4096;
            }

         }

         public List<Integer> getClearNumList() {
            return (List<Integer>)((this.bitField0_ & 4096) != 0 ? Collections.unmodifiableList(this.clearNum_) : this.clearNum_);
         }

         public int getClearNumCount() {
            return this.clearNum_.size();
         }

         public int getClearNum(int index) {
            return this.clearNum_.getInt(index);
         }

         public Builder setClearNum(int index, int value) {
            this.ensureClearNumIsMutable();
            this.clearNum_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addClearNum(int value) {
            this.ensureClearNumIsMutable();
            this.clearNum_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllClearNum(Iterable<? extends Integer> values) {
            this.ensureClearNumIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.clearNum_);
            this.onChanged();
            return this;
         }

         public Builder clearClearNum() {
            this.clearNum_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -4097;
            this.onChanged();
            return this;
         }

         private void ensureStrongProsIsMutable() {
            if ((this.bitField0_ & 8192) == 0) {
               this.strongPros_ = new ArrayList(this.strongPros_);
               this.bitField0_ |= 8192;
            }

         }

         public List<CommonMsg.PropertyInfo> getStrongProsList() {
            return this.strongProsBuilder_ == null ? Collections.unmodifiableList(this.strongPros_) : this.strongProsBuilder_.getMessageList();
         }

         public int getStrongProsCount() {
            return this.strongProsBuilder_ == null ? this.strongPros_.size() : this.strongProsBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getStrongPros(int index) {
            return this.strongProsBuilder_ == null ? (CommonMsg.PropertyInfo)this.strongPros_.get(index) : (CommonMsg.PropertyInfo)this.strongProsBuilder_.getMessage(index);
         }

         public Builder setStrongPros(int index, CommonMsg.PropertyInfo value) {
            if (this.strongProsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrongProsIsMutable();
               this.strongPros_.set(index, value);
               this.onChanged();
            } else {
               this.strongProsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setStrongPros(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.strongProsBuilder_ == null) {
               this.ensureStrongProsIsMutable();
               this.strongPros_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.strongProsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addStrongPros(CommonMsg.PropertyInfo value) {
            if (this.strongProsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrongProsIsMutable();
               this.strongPros_.add(value);
               this.onChanged();
            } else {
               this.strongProsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addStrongPros(int index, CommonMsg.PropertyInfo value) {
            if (this.strongProsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrongProsIsMutable();
               this.strongPros_.add(index, value);
               this.onChanged();
            } else {
               this.strongProsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addStrongPros(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.strongProsBuilder_ == null) {
               this.ensureStrongProsIsMutable();
               this.strongPros_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.strongProsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addStrongPros(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.strongProsBuilder_ == null) {
               this.ensureStrongProsIsMutable();
               this.strongPros_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.strongProsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllStrongPros(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.strongProsBuilder_ == null) {
               this.ensureStrongProsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.strongPros_);
               this.onChanged();
            } else {
               this.strongProsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearStrongPros() {
            if (this.strongProsBuilder_ == null) {
               this.strongPros_ = Collections.emptyList();
               this.bitField0_ &= -8193;
               this.onChanged();
            } else {
               this.strongProsBuilder_.clear();
            }

            return this;
         }

         public Builder removeStrongPros(int index) {
            if (this.strongProsBuilder_ == null) {
               this.ensureStrongProsIsMutable();
               this.strongPros_.remove(index);
               this.onChanged();
            } else {
               this.strongProsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getStrongProsBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getStrongProsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getStrongProsOrBuilder(int index) {
            return this.strongProsBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.strongPros_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.strongProsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getStrongProsOrBuilderList() {
            return this.strongProsBuilder_ != null ? this.strongProsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.strongPros_);
         }

         public CommonMsg.PropertyInfo.Builder addStrongProsBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getStrongProsFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addStrongProsBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getStrongProsFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getStrongProsBuilderList() {
            return this.getStrongProsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getStrongProsFieldBuilder() {
            if (this.strongProsBuilder_ == null) {
               this.strongProsBuilder_ = new RepeatedFieldBuilderV3(this.strongPros_, (this.bitField0_ & 8192) != 0, this.getParentForChildren(), this.isClean());
               this.strongPros_ = null;
            }

            return this.strongProsBuilder_;
         }

         private void ensureRuneProIsMutable() {
            if ((this.bitField0_ & 16384) == 0) {
               this.runePro_ = new ArrayList(this.runePro_);
               this.bitField0_ |= 16384;
            }

         }

         public List<CommonMsg.RuneStonePro> getRuneProList() {
            return this.runeProBuilder_ == null ? Collections.unmodifiableList(this.runePro_) : this.runeProBuilder_.getMessageList();
         }

         public int getRuneProCount() {
            return this.runeProBuilder_ == null ? this.runePro_.size() : this.runeProBuilder_.getCount();
         }

         public CommonMsg.RuneStonePro getRunePro(int index) {
            return this.runeProBuilder_ == null ? (CommonMsg.RuneStonePro)this.runePro_.get(index) : (CommonMsg.RuneStonePro)this.runeProBuilder_.getMessage(index);
         }

         public Builder setRunePro(int index, CommonMsg.RuneStonePro value) {
            if (this.runeProBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRuneProIsMutable();
               this.runePro_.set(index, value);
               this.onChanged();
            } else {
               this.runeProBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRunePro(int index, CommonMsg.RuneStonePro.Builder builderForValue) {
            if (this.runeProBuilder_ == null) {
               this.ensureRuneProIsMutable();
               this.runePro_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.runeProBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRunePro(CommonMsg.RuneStonePro value) {
            if (this.runeProBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRuneProIsMutable();
               this.runePro_.add(value);
               this.onChanged();
            } else {
               this.runeProBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRunePro(int index, CommonMsg.RuneStonePro value) {
            if (this.runeProBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRuneProIsMutable();
               this.runePro_.add(index, value);
               this.onChanged();
            } else {
               this.runeProBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRunePro(CommonMsg.RuneStonePro.Builder builderForValue) {
            if (this.runeProBuilder_ == null) {
               this.ensureRuneProIsMutable();
               this.runePro_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.runeProBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRunePro(int index, CommonMsg.RuneStonePro.Builder builderForValue) {
            if (this.runeProBuilder_ == null) {
               this.ensureRuneProIsMutable();
               this.runePro_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.runeProBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRunePro(Iterable<? extends CommonMsg.RuneStonePro> values) {
            if (this.runeProBuilder_ == null) {
               this.ensureRuneProIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.runePro_);
               this.onChanged();
            } else {
               this.runeProBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRunePro() {
            if (this.runeProBuilder_ == null) {
               this.runePro_ = Collections.emptyList();
               this.bitField0_ &= -16385;
               this.onChanged();
            } else {
               this.runeProBuilder_.clear();
            }

            return this;
         }

         public Builder removeRunePro(int index) {
            if (this.runeProBuilder_ == null) {
               this.ensureRuneProIsMutable();
               this.runePro_.remove(index);
               this.onChanged();
            } else {
               this.runeProBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.RuneStonePro.Builder getRuneProBuilder(int index) {
            return (CommonMsg.RuneStonePro.Builder)this.getRuneProFieldBuilder().getBuilder(index);
         }

         public CommonMsg.RuneStoneProOrBuilder getRuneProOrBuilder(int index) {
            return this.runeProBuilder_ == null ? (CommonMsg.RuneStoneProOrBuilder)this.runePro_.get(index) : (CommonMsg.RuneStoneProOrBuilder)this.runeProBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.RuneStoneProOrBuilder> getRuneProOrBuilderList() {
            return this.runeProBuilder_ != null ? this.runeProBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.runePro_);
         }

         public CommonMsg.RuneStonePro.Builder addRuneProBuilder() {
            return (CommonMsg.RuneStonePro.Builder)this.getRuneProFieldBuilder().addBuilder(CommonMsg.RuneStonePro.getDefaultInstance());
         }

         public CommonMsg.RuneStonePro.Builder addRuneProBuilder(int index) {
            return (CommonMsg.RuneStonePro.Builder)this.getRuneProFieldBuilder().addBuilder(index, CommonMsg.RuneStonePro.getDefaultInstance());
         }

         public List<CommonMsg.RuneStonePro.Builder> getRuneProBuilderList() {
            return this.getRuneProFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.RuneStonePro, CommonMsg.RuneStonePro.Builder, CommonMsg.RuneStoneProOrBuilder> getRuneProFieldBuilder() {
            if (this.runeProBuilder_ == null) {
               this.runeProBuilder_ = new RepeatedFieldBuilderV3(this.runePro_, (this.bitField0_ & 16384) != 0, this.getParentForChildren(), this.isClean());
               this.runePro_ = null;
            }

            return this.runeProBuilder_;
         }

         public boolean hasIsRuneLock() {
            return (this.bitField0_ & '耀') != 0;
         }

         public boolean getIsRuneLock() {
            return this.isRuneLock_;
         }

         public Builder setIsRuneLock(boolean value) {
            this.bitField0_ |= 32768;
            this.isRuneLock_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsRuneLock() {
            this.bitField0_ &= -32769;
            this.isRuneLock_ = false;
            this.onChanged();
            return this;
         }

         private void ensureOrnamentLockProIsMutable() {
            if ((this.bitField0_ & 65536) == 0) {
               this.ornamentLockPro_ = BagMsg.Item_Info.mutableCopy(this.ornamentLockPro_);
               this.bitField0_ |= 65536;
            }

         }

         public List<Integer> getOrnamentLockProList() {
            return (List<Integer>)((this.bitField0_ & 65536) != 0 ? Collections.unmodifiableList(this.ornamentLockPro_) : this.ornamentLockPro_);
         }

         public int getOrnamentLockProCount() {
            return this.ornamentLockPro_.size();
         }

         public int getOrnamentLockPro(int index) {
            return this.ornamentLockPro_.getInt(index);
         }

         public Builder setOrnamentLockPro(int index, int value) {
            this.ensureOrnamentLockProIsMutable();
            this.ornamentLockPro_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addOrnamentLockPro(int value) {
            this.ensureOrnamentLockProIsMutable();
            this.ornamentLockPro_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllOrnamentLockPro(Iterable<? extends Integer> values) {
            this.ensureOrnamentLockProIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ornamentLockPro_);
            this.onChanged();
            return this;
         }

         public Builder clearOrnamentLockPro() {
            this.ornamentLockPro_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -65537;
            this.onChanged();
            return this;
         }

         public boolean hasEnableTime() {
            return (this.bitField0_ & 131072) != 0;
         }

         public int getEnableTime() {
            return this.enableTime_;
         }

         public Builder setEnableTime(int value) {
            this.bitField0_ |= 131072;
            this.enableTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnableTime() {
            this.bitField0_ &= -131073;
            this.enableTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureOrnamentProColourIsMutable() {
            if ((this.bitField0_ & 262144) == 0) {
               this.ornamentProColour_ = BagMsg.Item_Info.mutableCopy(this.ornamentProColour_);
               this.bitField0_ |= 262144;
            }

         }

         public List<Integer> getOrnamentProColourList() {
            return (List<Integer>)((this.bitField0_ & 262144) != 0 ? Collections.unmodifiableList(this.ornamentProColour_) : this.ornamentProColour_);
         }

         public int getOrnamentProColourCount() {
            return this.ornamentProColour_.size();
         }

         public int getOrnamentProColour(int index) {
            return this.ornamentProColour_.getInt(index);
         }

         public Builder setOrnamentProColour(int index, int value) {
            this.ensureOrnamentProColourIsMutable();
            this.ornamentProColour_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addOrnamentProColour(int value) {
            this.ensureOrnamentProColourIsMutable();
            this.ornamentProColour_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllOrnamentProColour(Iterable<? extends Integer> values) {
            this.ensureOrnamentProColourIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ornamentProColour_);
            this.onChanged();
            return this;
         }

         public Builder clearOrnamentProColour() {
            this.ornamentProColour_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -262145;
            this.onChanged();
            return this;
         }

         private void ensureOrnamentExtraProColourIsMutable() {
            if ((this.bitField0_ & 524288) == 0) {
               this.ornamentExtraProColour_ = BagMsg.Item_Info.mutableCopy(this.ornamentExtraProColour_);
               this.bitField0_ |= 524288;
            }

         }

         public List<Integer> getOrnamentExtraProColourList() {
            return (List<Integer>)((this.bitField0_ & 524288) != 0 ? Collections.unmodifiableList(this.ornamentExtraProColour_) : this.ornamentExtraProColour_);
         }

         public int getOrnamentExtraProColourCount() {
            return this.ornamentExtraProColour_.size();
         }

         public int getOrnamentExtraProColour(int index) {
            return this.ornamentExtraProColour_.getInt(index);
         }

         public Builder setOrnamentExtraProColour(int index, int value) {
            this.ensureOrnamentExtraProColourIsMutable();
            this.ornamentExtraProColour_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addOrnamentExtraProColour(int value) {
            this.ensureOrnamentExtraProColourIsMutable();
            this.ornamentExtraProColour_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllOrnamentExtraProColour(Iterable<? extends Integer> values) {
            this.ensureOrnamentExtraProColourIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ornamentExtraProColour_);
            this.onChanged();
            return this;
         }

         public Builder clearOrnamentExtraProColour() {
            this.ornamentExtraProColour_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -524289;
            this.onChanged();
            return this;
         }

         public boolean hasExp() {
            return (this.bitField0_ & 1048576) != 0;
         }

         public int getExp() {
            return this.exp_;
         }

         public Builder setExp(int value) {
            this.bitField0_ |= 1048576;
            this.exp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExp() {
            this.bitField0_ &= -1048577;
            this.exp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasArtificeVal() {
            return (this.bitField0_ & 2097152) != 0;
         }

         public int getArtificeVal() {
            return this.artificeVal_;
         }

         public Builder setArtificeVal(int value) {
            this.bitField0_ |= 2097152;
            this.artificeVal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearArtificeVal() {
            this.bitField0_ &= -2097153;
            this.artificeVal_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkinId() {
            return (this.bitField0_ & 4194304) != 0;
         }

         public int getSkinId() {
            return this.skinId_;
         }

         public Builder setSkinId(int value) {
            this.bitField0_ |= 4194304;
            this.skinId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkinId() {
            this.bitField0_ &= -4194305;
            this.skinId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsUsed() {
            return (this.bitField0_ & 8388608) != 0;
         }

         public boolean getIsUsed() {
            return this.isUsed_;
         }

         public Builder setIsUsed(boolean value) {
            this.bitField0_ |= 8388608;
            this.isUsed_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsUsed() {
            this.bitField0_ &= -8388609;
            this.isUsed_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsLock() {
            return (this.bitField0_ & 16777216) != 0;
         }

         public boolean getIsLock() {
            return this.isLock_;
         }

         public Builder setIsLock(boolean value) {
            this.bitField0_ |= 16777216;
            this.isLock_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsLock() {
            this.bitField0_ &= -16777217;
            this.isLock_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasLockSkill() {
            return (this.bitField0_ & 33554432) != 0;
         }

         public int getLockSkill() {
            return this.lockSkill_;
         }

         public Builder setLockSkill(int value) {
            this.bitField0_ |= 33554432;
            this.lockSkill_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLockSkill() {
            this.bitField0_ &= -33554433;
            this.lockSkill_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsMainSkillUnlock() {
            return (this.bitField0_ & 67108864) != 0;
         }

         public boolean getIsMainSkillUnlock() {
            return this.isMainSkillUnlock_;
         }

         public Builder setIsMainSkillUnlock(boolean value) {
            this.bitField0_ |= 67108864;
            this.isMainSkillUnlock_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsMainSkillUnlock() {
            this.bitField0_ &= -67108865;
            this.isMainSkillUnlock_ = false;
            this.onChanged();
            return this;
         }

         private void ensurePetGroupIsMutable() {
            if ((this.bitField0_ & 134217728) == 0) {
               this.petGroup_ = BagMsg.Item_Info.mutableCopy(this.petGroup_);
               this.bitField0_ |= 134217728;
            }

         }

         public List<Integer> getPetGroupList() {
            return (List<Integer>)((this.bitField0_ & 134217728) != 0 ? Collections.unmodifiableList(this.petGroup_) : this.petGroup_);
         }

         public int getPetGroupCount() {
            return this.petGroup_.size();
         }

         public int getPetGroup(int index) {
            return this.petGroup_.getInt(index);
         }

         public Builder setPetGroup(int index, int value) {
            this.ensurePetGroupIsMutable();
            this.petGroup_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPetGroup(int value) {
            this.ensurePetGroupIsMutable();
            this.petGroup_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPetGroup(Iterable<? extends Integer> values) {
            this.ensurePetGroupIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.petGroup_);
            this.onChanged();
            return this;
         }

         public Builder clearPetGroup() {
            this.petGroup_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -134217729;
            this.onChanged();
            return this;
         }

         public boolean hasPetStar() {
            return (this.bitField0_ & 268435456) != 0;
         }

         public int getPetStar() {
            return this.petStar_;
         }

         public Builder setPetStar(int value) {
            this.bitField0_ |= 268435456;
            this.petStar_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPetStar() {
            this.bitField0_ &= -268435457;
            this.petStar_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHorseLockSkillIsMutable() {
            if ((this.bitField0_ & 536870912) == 0) {
               this.horseLockSkill_ = BagMsg.Item_Info.mutableCopy(this.horseLockSkill_);
               this.bitField0_ |= 536870912;
            }

         }

         public List<Integer> getHorseLockSkillList() {
            return (List<Integer>)((this.bitField0_ & 536870912) != 0 ? Collections.unmodifiableList(this.horseLockSkill_) : this.horseLockSkill_);
         }

         public int getHorseLockSkillCount() {
            return this.horseLockSkill_.size();
         }

         public int getHorseLockSkill(int index) {
            return this.horseLockSkill_.getInt(index);
         }

         public Builder setHorseLockSkill(int index, int value) {
            this.ensureHorseLockSkillIsMutable();
            this.horseLockSkill_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHorseLockSkill(int value) {
            this.ensureHorseLockSkillIsMutable();
            this.horseLockSkill_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHorseLockSkill(Iterable<? extends Integer> values) {
            this.ensureHorseLockSkillIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.horseLockSkill_);
            this.onChanged();
            return this;
         }

         public Builder clearHorseLockSkill() {
            this.horseLockSkill_ = BagMsg.Item_Info.emptyIntList();
            this.bitField0_ &= -536870913;
            this.onChanged();
            return this;
         }

         public boolean hasIsAwaken() {
            return (this.bitField0_ & 1073741824) != 0;
         }

         public boolean getIsAwaken() {
            return this.isAwaken_;
         }

         public Builder setIsAwaken(boolean value) {
            this.bitField0_ |= 1073741824;
            this.isAwaken_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsAwaken() {
            this.bitField0_ &= -1073741825;
            this.isAwaken_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasRuneStoneStrength() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
         }

         public int getRuneStoneStrength() {
            return this.runeStoneStrength_;
         }

         public Builder setRuneStoneStrength(int value) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.runeStoneStrength_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRuneStoneStrength() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.runeStoneStrength_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAwakenIndexIsMutable() {
            if ((this.bitField1_ & 1) == 0) {
               this.awakenIndex_ = BagMsg.Item_Info.mutableCopy(this.awakenIndex_);
               this.bitField1_ |= 1;
            }

         }

         public List<Integer> getAwakenIndexList() {
            return (List<Integer>)((this.bitField1_ & 1) != 0 ? Collections.unmodifiableList(this.awakenIndex_) : this.awakenIndex_);
         }

         public int getAwakenIndexCount() {
            return this.awakenIndex_.size();
         }

         public int getAwakenIndex(int index) {
            return this.awakenIndex_.getInt(index);
         }

         public Builder setAwakenIndex(int index, int value) {
            this.ensureAwakenIndexIsMutable();
            this.awakenIndex_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addAwakenIndex(int value) {
            this.ensureAwakenIndexIsMutable();
            this.awakenIndex_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllAwakenIndex(Iterable<? extends Integer> values) {
            this.ensureAwakenIndexIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awakenIndex_);
            this.onChanged();
            return this;
         }

         public Builder clearAwakenIndex() {
            this.awakenIndex_ = BagMsg.Item_Info.emptyIntList();
            this.bitField1_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasUpgradeProgress() {
            return (this.bitField1_ & 2) != 0;
         }

         public int getUpgradeProgress() {
            return this.upgradeProgress_;
         }

         public Builder setUpgradeProgress(int value) {
            this.bitField1_ |= 2;
            this.upgradeProgress_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUpgradeProgress() {
            this.bitField1_ &= -3;
            this.upgradeProgress_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRefinePropertyIsMutable() {
            if ((this.bitField1_ & 4) == 0) {
               this.refineProperty_ = new ArrayList(this.refineProperty_);
               this.bitField1_ |= 4;
            }

         }

         public List<CommonMsg.RefineProperty> getRefinePropertyList() {
            return this.refinePropertyBuilder_ == null ? Collections.unmodifiableList(this.refineProperty_) : this.refinePropertyBuilder_.getMessageList();
         }

         public int getRefinePropertyCount() {
            return this.refinePropertyBuilder_ == null ? this.refineProperty_.size() : this.refinePropertyBuilder_.getCount();
         }

         public CommonMsg.RefineProperty getRefineProperty(int index) {
            return this.refinePropertyBuilder_ == null ? (CommonMsg.RefineProperty)this.refineProperty_.get(index) : (CommonMsg.RefineProperty)this.refinePropertyBuilder_.getMessage(index);
         }

         public Builder setRefineProperty(int index, CommonMsg.RefineProperty value) {
            if (this.refinePropertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRefinePropertyIsMutable();
               this.refineProperty_.set(index, value);
               this.onChanged();
            } else {
               this.refinePropertyBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRefineProperty(int index, CommonMsg.RefineProperty.Builder builderForValue) {
            if (this.refinePropertyBuilder_ == null) {
               this.ensureRefinePropertyIsMutable();
               this.refineProperty_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.refinePropertyBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRefineProperty(CommonMsg.RefineProperty value) {
            if (this.refinePropertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRefinePropertyIsMutable();
               this.refineProperty_.add(value);
               this.onChanged();
            } else {
               this.refinePropertyBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRefineProperty(int index, CommonMsg.RefineProperty value) {
            if (this.refinePropertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRefinePropertyIsMutable();
               this.refineProperty_.add(index, value);
               this.onChanged();
            } else {
               this.refinePropertyBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRefineProperty(CommonMsg.RefineProperty.Builder builderForValue) {
            if (this.refinePropertyBuilder_ == null) {
               this.ensureRefinePropertyIsMutable();
               this.refineProperty_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.refinePropertyBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRefineProperty(int index, CommonMsg.RefineProperty.Builder builderForValue) {
            if (this.refinePropertyBuilder_ == null) {
               this.ensureRefinePropertyIsMutable();
               this.refineProperty_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.refinePropertyBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRefineProperty(Iterable<? extends CommonMsg.RefineProperty> values) {
            if (this.refinePropertyBuilder_ == null) {
               this.ensureRefinePropertyIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.refineProperty_);
               this.onChanged();
            } else {
               this.refinePropertyBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRefineProperty() {
            if (this.refinePropertyBuilder_ == null) {
               this.refineProperty_ = Collections.emptyList();
               this.bitField1_ &= -5;
               this.onChanged();
            } else {
               this.refinePropertyBuilder_.clear();
            }

            return this;
         }

         public Builder removeRefineProperty(int index) {
            if (this.refinePropertyBuilder_ == null) {
               this.ensureRefinePropertyIsMutable();
               this.refineProperty_.remove(index);
               this.onChanged();
            } else {
               this.refinePropertyBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.RefineProperty.Builder getRefinePropertyBuilder(int index) {
            return (CommonMsg.RefineProperty.Builder)this.getRefinePropertyFieldBuilder().getBuilder(index);
         }

         public CommonMsg.RefinePropertyOrBuilder getRefinePropertyOrBuilder(int index) {
            return this.refinePropertyBuilder_ == null ? (CommonMsg.RefinePropertyOrBuilder)this.refineProperty_.get(index) : (CommonMsg.RefinePropertyOrBuilder)this.refinePropertyBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.RefinePropertyOrBuilder> getRefinePropertyOrBuilderList() {
            return this.refinePropertyBuilder_ != null ? this.refinePropertyBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.refineProperty_);
         }

         public CommonMsg.RefineProperty.Builder addRefinePropertyBuilder() {
            return (CommonMsg.RefineProperty.Builder)this.getRefinePropertyFieldBuilder().addBuilder(CommonMsg.RefineProperty.getDefaultInstance());
         }

         public CommonMsg.RefineProperty.Builder addRefinePropertyBuilder(int index) {
            return (CommonMsg.RefineProperty.Builder)this.getRefinePropertyFieldBuilder().addBuilder(index, CommonMsg.RefineProperty.getDefaultInstance());
         }

         public List<CommonMsg.RefineProperty.Builder> getRefinePropertyBuilderList() {
            return this.getRefinePropertyFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.RefineProperty, CommonMsg.RefineProperty.Builder, CommonMsg.RefinePropertyOrBuilder> getRefinePropertyFieldBuilder() {
            if (this.refinePropertyBuilder_ == null) {
               this.refinePropertyBuilder_ = new RepeatedFieldBuilderV3(this.refineProperty_, (this.bitField1_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.refineProperty_ = null;
            }

            return this.refinePropertyBuilder_;
         }

         public boolean hasBreakUpTime() {
            return (this.bitField1_ & 8) != 0;
         }

         public int getBreakUpTime() {
            return this.breakUpTime_;
         }

         public Builder setBreakUpTime(int value) {
            this.bitField1_ |= 8;
            this.breakUpTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBreakUpTime() {
            this.bitField1_ &= -9;
            this.breakUpTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGodBeastInfo() {
            return (this.bitField1_ & 16) != 0;
         }

         public CommonMsg.GodBeastInfo getGodBeastInfo() {
            if (this.godBeastInfoBuilder_ == null) {
               return this.godBeastInfo_ == null ? CommonMsg.GodBeastInfo.getDefaultInstance() : this.godBeastInfo_;
            } else {
               return (CommonMsg.GodBeastInfo)this.godBeastInfoBuilder_.getMessage();
            }
         }

         public Builder setGodBeastInfo(CommonMsg.GodBeastInfo value) {
            if (this.godBeastInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.godBeastInfo_ = value;
               this.onChanged();
            } else {
               this.godBeastInfoBuilder_.setMessage(value);
            }

            this.bitField1_ |= 16;
            return this;
         }

         public Builder setGodBeastInfo(CommonMsg.GodBeastInfo.Builder builderForValue) {
            if (this.godBeastInfoBuilder_ == null) {
               this.godBeastInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.godBeastInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField1_ |= 16;
            return this;
         }

         public Builder mergeGodBeastInfo(CommonMsg.GodBeastInfo value) {
            if (this.godBeastInfoBuilder_ == null) {
               if ((this.bitField1_ & 16) != 0 && this.godBeastInfo_ != null && this.godBeastInfo_ != CommonMsg.GodBeastInfo.getDefaultInstance()) {
                  this.godBeastInfo_ = CommonMsg.GodBeastInfo.newBuilder(this.godBeastInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.godBeastInfo_ = value;
               }

               this.onChanged();
            } else {
               this.godBeastInfoBuilder_.mergeFrom(value);
            }

            this.bitField1_ |= 16;
            return this;
         }

         public Builder clearGodBeastInfo() {
            if (this.godBeastInfoBuilder_ == null) {
               this.godBeastInfo_ = null;
               this.onChanged();
            } else {
               this.godBeastInfoBuilder_.clear();
            }

            this.bitField1_ &= -17;
            return this;
         }

         public CommonMsg.GodBeastInfo.Builder getGodBeastInfoBuilder() {
            this.bitField1_ |= 16;
            this.onChanged();
            return (CommonMsg.GodBeastInfo.Builder)this.getGodBeastInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.GodBeastInfoOrBuilder getGodBeastInfoOrBuilder() {
            if (this.godBeastInfoBuilder_ != null) {
               return (CommonMsg.GodBeastInfoOrBuilder)this.godBeastInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.godBeastInfo_ == null ? CommonMsg.GodBeastInfo.getDefaultInstance() : this.godBeastInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.GodBeastInfo, CommonMsg.GodBeastInfo.Builder, CommonMsg.GodBeastInfoOrBuilder> getGodBeastInfoFieldBuilder() {
            if (this.godBeastInfoBuilder_ == null) {
               this.godBeastInfoBuilder_ = new SingleFieldBuilderV3(this.getGodBeastInfo(), this.getParentForChildren(), this.isClean());
               this.godBeastInfo_ = null;
            }

            return this.godBeastInfoBuilder_;
         }

         private void ensureExclusiveAttrIsMutable() {
            if ((this.bitField1_ & 32) == 0) {
               this.exclusiveAttr_ = new ArrayList(this.exclusiveAttr_);
               this.bitField1_ |= 32;
            }

         }

         public List<CommonMsg.PropertyInfo> getExclusiveAttrList() {
            return this.exclusiveAttrBuilder_ == null ? Collections.unmodifiableList(this.exclusiveAttr_) : this.exclusiveAttrBuilder_.getMessageList();
         }

         public int getExclusiveAttrCount() {
            return this.exclusiveAttrBuilder_ == null ? this.exclusiveAttr_.size() : this.exclusiveAttrBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getExclusiveAttr(int index) {
            return this.exclusiveAttrBuilder_ == null ? (CommonMsg.PropertyInfo)this.exclusiveAttr_.get(index) : (CommonMsg.PropertyInfo)this.exclusiveAttrBuilder_.getMessage(index);
         }

         public Builder setExclusiveAttr(int index, CommonMsg.PropertyInfo value) {
            if (this.exclusiveAttrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExclusiveAttrIsMutable();
               this.exclusiveAttr_.set(index, value);
               this.onChanged();
            } else {
               this.exclusiveAttrBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setExclusiveAttr(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.exclusiveAttrBuilder_ == null) {
               this.ensureExclusiveAttrIsMutable();
               this.exclusiveAttr_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.exclusiveAttrBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addExclusiveAttr(CommonMsg.PropertyInfo value) {
            if (this.exclusiveAttrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExclusiveAttrIsMutable();
               this.exclusiveAttr_.add(value);
               this.onChanged();
            } else {
               this.exclusiveAttrBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addExclusiveAttr(int index, CommonMsg.PropertyInfo value) {
            if (this.exclusiveAttrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExclusiveAttrIsMutable();
               this.exclusiveAttr_.add(index, value);
               this.onChanged();
            } else {
               this.exclusiveAttrBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addExclusiveAttr(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.exclusiveAttrBuilder_ == null) {
               this.ensureExclusiveAttrIsMutable();
               this.exclusiveAttr_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.exclusiveAttrBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addExclusiveAttr(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.exclusiveAttrBuilder_ == null) {
               this.ensureExclusiveAttrIsMutable();
               this.exclusiveAttr_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.exclusiveAttrBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllExclusiveAttr(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.exclusiveAttrBuilder_ == null) {
               this.ensureExclusiveAttrIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.exclusiveAttr_);
               this.onChanged();
            } else {
               this.exclusiveAttrBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearExclusiveAttr() {
            if (this.exclusiveAttrBuilder_ == null) {
               this.exclusiveAttr_ = Collections.emptyList();
               this.bitField1_ &= -33;
               this.onChanged();
            } else {
               this.exclusiveAttrBuilder_.clear();
            }

            return this;
         }

         public Builder removeExclusiveAttr(int index) {
            if (this.exclusiveAttrBuilder_ == null) {
               this.ensureExclusiveAttrIsMutable();
               this.exclusiveAttr_.remove(index);
               this.onChanged();
            } else {
               this.exclusiveAttrBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getExclusiveAttrBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getExclusiveAttrFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getExclusiveAttrOrBuilder(int index) {
            return this.exclusiveAttrBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.exclusiveAttr_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.exclusiveAttrBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getExclusiveAttrOrBuilderList() {
            return this.exclusiveAttrBuilder_ != null ? this.exclusiveAttrBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.exclusiveAttr_);
         }

         public CommonMsg.PropertyInfo.Builder addExclusiveAttrBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getExclusiveAttrFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addExclusiveAttrBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getExclusiveAttrFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getExclusiveAttrBuilderList() {
            return this.getExclusiveAttrFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getExclusiveAttrFieldBuilder() {
            if (this.exclusiveAttrBuilder_ == null) {
               this.exclusiveAttrBuilder_ = new RepeatedFieldBuilderV3(this.exclusiveAttr_, (this.bitField1_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.exclusiveAttr_ = null;
            }

            return this.exclusiveAttrBuilder_;
         }

         public boolean hasExclusiveWeaponData() {
            return (this.bitField1_ & 64) != 0;
         }

         public CommonMsg.ExclusiveWeaponData getExclusiveWeaponData() {
            if (this.exclusiveWeaponDataBuilder_ == null) {
               return this.exclusiveWeaponData_ == null ? CommonMsg.ExclusiveWeaponData.getDefaultInstance() : this.exclusiveWeaponData_;
            } else {
               return (CommonMsg.ExclusiveWeaponData)this.exclusiveWeaponDataBuilder_.getMessage();
            }
         }

         public Builder setExclusiveWeaponData(CommonMsg.ExclusiveWeaponData value) {
            if (this.exclusiveWeaponDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.exclusiveWeaponData_ = value;
               this.onChanged();
            } else {
               this.exclusiveWeaponDataBuilder_.setMessage(value);
            }

            this.bitField1_ |= 64;
            return this;
         }

         public Builder setExclusiveWeaponData(CommonMsg.ExclusiveWeaponData.Builder builderForValue) {
            if (this.exclusiveWeaponDataBuilder_ == null) {
               this.exclusiveWeaponData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.exclusiveWeaponDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField1_ |= 64;
            return this;
         }

         public Builder mergeExclusiveWeaponData(CommonMsg.ExclusiveWeaponData value) {
            if (this.exclusiveWeaponDataBuilder_ == null) {
               if ((this.bitField1_ & 64) != 0 && this.exclusiveWeaponData_ != null && this.exclusiveWeaponData_ != CommonMsg.ExclusiveWeaponData.getDefaultInstance()) {
                  this.exclusiveWeaponData_ = CommonMsg.ExclusiveWeaponData.newBuilder(this.exclusiveWeaponData_).mergeFrom(value).buildPartial();
               } else {
                  this.exclusiveWeaponData_ = value;
               }

               this.onChanged();
            } else {
               this.exclusiveWeaponDataBuilder_.mergeFrom(value);
            }

            this.bitField1_ |= 64;
            return this;
         }

         public Builder clearExclusiveWeaponData() {
            if (this.exclusiveWeaponDataBuilder_ == null) {
               this.exclusiveWeaponData_ = null;
               this.onChanged();
            } else {
               this.exclusiveWeaponDataBuilder_.clear();
            }

            this.bitField1_ &= -65;
            return this;
         }

         public CommonMsg.ExclusiveWeaponData.Builder getExclusiveWeaponDataBuilder() {
            this.bitField1_ |= 64;
            this.onChanged();
            return (CommonMsg.ExclusiveWeaponData.Builder)this.getExclusiveWeaponDataFieldBuilder().getBuilder();
         }

         public CommonMsg.ExclusiveWeaponDataOrBuilder getExclusiveWeaponDataOrBuilder() {
            if (this.exclusiveWeaponDataBuilder_ != null) {
               return (CommonMsg.ExclusiveWeaponDataOrBuilder)this.exclusiveWeaponDataBuilder_.getMessageOrBuilder();
            } else {
               return this.exclusiveWeaponData_ == null ? CommonMsg.ExclusiveWeaponData.getDefaultInstance() : this.exclusiveWeaponData_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ExclusiveWeaponData, CommonMsg.ExclusiveWeaponData.Builder, CommonMsg.ExclusiveWeaponDataOrBuilder> getExclusiveWeaponDataFieldBuilder() {
            if (this.exclusiveWeaponDataBuilder_ == null) {
               this.exclusiveWeaponDataBuilder_ = new SingleFieldBuilderV3(this.getExclusiveWeaponData(), this.getParentForChildren(), this.isClean());
               this.exclusiveWeaponData_ = null;
            }

            return this.exclusiveWeaponDataBuilder_;
         }

         public boolean hasNeiDanInfo() {
            return (this.bitField1_ & 128) != 0;
         }

         public CommonMsg.NeiDanInfo getNeiDanInfo() {
            if (this.neiDanInfoBuilder_ == null) {
               return this.neiDanInfo_ == null ? CommonMsg.NeiDanInfo.getDefaultInstance() : this.neiDanInfo_;
            } else {
               return (CommonMsg.NeiDanInfo)this.neiDanInfoBuilder_.getMessage();
            }
         }

         public Builder setNeiDanInfo(CommonMsg.NeiDanInfo value) {
            if (this.neiDanInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.neiDanInfo_ = value;
               this.onChanged();
            } else {
               this.neiDanInfoBuilder_.setMessage(value);
            }

            this.bitField1_ |= 128;
            return this;
         }

         public Builder setNeiDanInfo(CommonMsg.NeiDanInfo.Builder builderForValue) {
            if (this.neiDanInfoBuilder_ == null) {
               this.neiDanInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.neiDanInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField1_ |= 128;
            return this;
         }

         public Builder mergeNeiDanInfo(CommonMsg.NeiDanInfo value) {
            if (this.neiDanInfoBuilder_ == null) {
               if ((this.bitField1_ & 128) != 0 && this.neiDanInfo_ != null && this.neiDanInfo_ != CommonMsg.NeiDanInfo.getDefaultInstance()) {
                  this.neiDanInfo_ = CommonMsg.NeiDanInfo.newBuilder(this.neiDanInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.neiDanInfo_ = value;
               }

               this.onChanged();
            } else {
               this.neiDanInfoBuilder_.mergeFrom(value);
            }

            this.bitField1_ |= 128;
            return this;
         }

         public Builder clearNeiDanInfo() {
            if (this.neiDanInfoBuilder_ == null) {
               this.neiDanInfo_ = null;
               this.onChanged();
            } else {
               this.neiDanInfoBuilder_.clear();
            }

            this.bitField1_ &= -129;
            return this;
         }

         public CommonMsg.NeiDanInfo.Builder getNeiDanInfoBuilder() {
            this.bitField1_ |= 128;
            this.onChanged();
            return (CommonMsg.NeiDanInfo.Builder)this.getNeiDanInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.NeiDanInfoOrBuilder getNeiDanInfoOrBuilder() {
            if (this.neiDanInfoBuilder_ != null) {
               return (CommonMsg.NeiDanInfoOrBuilder)this.neiDanInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.neiDanInfo_ == null ? CommonMsg.NeiDanInfo.getDefaultInstance() : this.neiDanInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.NeiDanInfo, CommonMsg.NeiDanInfo.Builder, CommonMsg.NeiDanInfoOrBuilder> getNeiDanInfoFieldBuilder() {
            if (this.neiDanInfoBuilder_ == null) {
               this.neiDanInfoBuilder_ = new SingleFieldBuilderV3(this.getNeiDanInfo(), this.getParentForChildren(), this.isClean());
               this.neiDanInfo_ = null;
            }

            return this.neiDanInfoBuilder_;
         }

         public boolean hasParamId() {
            return (this.bitField1_ & 256) != 0;
         }

         public int getParamId() {
            return this.paramId_;
         }

         public Builder setParamId(int value) {
            this.bitField1_ |= 256;
            this.paramId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearParamId() {
            this.bitField1_ &= -257;
            this.paramId_ = 0;
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

   public static final class C2S_ItemDatas_3003 extends GeneratedMessageV3 implements C2S_ItemDatas_3003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SUBCLASS_FIELD_NUMBER = 1;
      private int subclass_;
      private byte memoizedIsInitialized;
      private static final C2S_ItemDatas_3003 DEFAULT_INSTANCE = new C2S_ItemDatas_3003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ItemDatas_3003> PARSER = new AbstractParser<C2S_ItemDatas_3003>() {
         public C2S_ItemDatas_3003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ItemDatas_3003(input, extensionRegistry);
         }
      };

      private C2S_ItemDatas_3003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ItemDatas_3003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ItemDatas_3003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ItemDatas_3003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.subclass_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemDatas_3003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemDatas_3003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemDatas_3003.class, Builder.class);
      }

      public boolean hasSubclass() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSubclass() {
         return this.subclass_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSubclass()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.subclass_);
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
               size += CodedOutputStream.computeInt32Size(1, this.subclass_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ItemDatas_3003)) {
            return super.equals(obj);
         } else {
            C2S_ItemDatas_3003 other = (C2S_ItemDatas_3003)obj;
            if (this.hasSubclass() != other.hasSubclass()) {
               return false;
            } else if (this.hasSubclass() && this.getSubclass() != other.getSubclass()) {
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
            if (this.hasSubclass()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSubclass();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ItemDatas_3003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ItemDatas_3003)PARSER.parseFrom(data);
      }

      public static C2S_ItemDatas_3003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemDatas_3003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemDatas_3003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ItemDatas_3003)PARSER.parseFrom(data);
      }

      public static C2S_ItemDatas_3003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemDatas_3003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemDatas_3003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ItemDatas_3003)PARSER.parseFrom(data);
      }

      public static C2S_ItemDatas_3003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemDatas_3003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemDatas_3003 parseFrom(InputStream input) throws IOException {
         return (C2S_ItemDatas_3003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemDatas_3003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemDatas_3003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemDatas_3003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ItemDatas_3003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ItemDatas_3003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemDatas_3003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemDatas_3003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ItemDatas_3003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemDatas_3003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemDatas_3003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ItemDatas_3003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ItemDatas_3003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ItemDatas_3003> parser() {
         return PARSER;
      }

      public Parser<C2S_ItemDatas_3003> getParserForType() {
         return PARSER;
      }

      public C2S_ItemDatas_3003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ItemDatas_3003OrBuilder {
         private int bitField0_;
         private int subclass_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemDatas_3003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemDatas_3003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemDatas_3003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_ItemDatas_3003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.subclass_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemDatas_3003_descriptor;
         }

         public C2S_ItemDatas_3003 getDefaultInstanceForType() {
            return BagMsg.C2S_ItemDatas_3003.getDefaultInstance();
         }

         public C2S_ItemDatas_3003 build() {
            C2S_ItemDatas_3003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ItemDatas_3003 buildPartial() {
            C2S_ItemDatas_3003 result = new C2S_ItemDatas_3003(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.subclass_ = this.subclass_;
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
            if (other instanceof C2S_ItemDatas_3003) {
               return this.mergeFrom((C2S_ItemDatas_3003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ItemDatas_3003 other) {
            if (other == BagMsg.C2S_ItemDatas_3003.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSubclass()) {
                  this.setSubclass(other.getSubclass());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSubclass();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ItemDatas_3003 parsedMessage = null;

            try {
               parsedMessage = (C2S_ItemDatas_3003)BagMsg.C2S_ItemDatas_3003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ItemDatas_3003)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSubclass() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSubclass() {
            return this.subclass_;
         }

         public Builder setSubclass(int value) {
            this.bitField0_ |= 1;
            this.subclass_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSubclass() {
            this.bitField0_ &= -2;
            this.subclass_ = 0;
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

   public static final class S2C_ItemDatas_3004 extends GeneratedMessageV3 implements S2C_ItemDatas_3004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SUBCLASS_FIELD_NUMBER = 1;
      private int subclass_;
      public static final int ITEMS_FIELD_NUMBER = 2;
      private List<Item_Info> items_;
      private byte memoizedIsInitialized;
      private static final S2C_ItemDatas_3004 DEFAULT_INSTANCE = new S2C_ItemDatas_3004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ItemDatas_3004> PARSER = new AbstractParser<S2C_ItemDatas_3004>() {
         public S2C_ItemDatas_3004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ItemDatas_3004(input, extensionRegistry);
         }
      };

      private S2C_ItemDatas_3004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ItemDatas_3004() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ItemDatas_3004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ItemDatas_3004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.subclass_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.items_.add(input.readMessage(BagMsg.Item_Info.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemDatas_3004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemDatas_3004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemDatas_3004.class, Builder.class);
      }

      public boolean hasSubclass() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSubclass() {
         return this.subclass_;
      }

      public List<Item_Info> getItemsList() {
         return this.items_;
      }

      public List<? extends Item_InfoOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public Item_Info getItems(int index) {
         return (Item_Info)this.items_.get(index);
      }

      public Item_InfoOrBuilder getItemsOrBuilder(int index) {
         return (Item_InfoOrBuilder)this.items_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSubclass()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
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
            output.writeInt32(1, this.subclass_);
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.items_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.subclass_);
            }

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.items_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ItemDatas_3004)) {
            return super.equals(obj);
         } else {
            S2C_ItemDatas_3004 other = (S2C_ItemDatas_3004)obj;
            if (this.hasSubclass() != other.hasSubclass()) {
               return false;
            } else if (this.hasSubclass() && this.getSubclass() != other.getSubclass()) {
               return false;
            } else if (!this.getItemsList().equals(other.getItemsList())) {
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
            if (this.hasSubclass()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSubclass();
            }

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ItemDatas_3004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ItemDatas_3004)PARSER.parseFrom(data);
      }

      public static S2C_ItemDatas_3004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemDatas_3004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemDatas_3004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ItemDatas_3004)PARSER.parseFrom(data);
      }

      public static S2C_ItemDatas_3004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemDatas_3004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemDatas_3004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ItemDatas_3004)PARSER.parseFrom(data);
      }

      public static S2C_ItemDatas_3004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemDatas_3004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemDatas_3004 parseFrom(InputStream input) throws IOException {
         return (S2C_ItemDatas_3004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemDatas_3004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemDatas_3004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemDatas_3004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ItemDatas_3004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ItemDatas_3004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemDatas_3004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemDatas_3004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ItemDatas_3004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemDatas_3004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemDatas_3004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ItemDatas_3004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ItemDatas_3004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ItemDatas_3004> parser() {
         return PARSER;
      }

      public Parser<S2C_ItemDatas_3004> getParserForType() {
         return PARSER;
      }

      public S2C_ItemDatas_3004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ItemDatas_3004OrBuilder {
         private int bitField0_;
         private int subclass_;
         private List<Item_Info> items_;
         private RepeatedFieldBuilderV3<Item_Info, Item_Info.Builder, Item_InfoOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemDatas_3004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemDatas_3004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemDatas_3004.class, Builder.class);
         }

         private Builder() {
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_ItemDatas_3004.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.subclass_ = 0;
            this.bitField0_ &= -2;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemDatas_3004_descriptor;
         }

         public S2C_ItemDatas_3004 getDefaultInstanceForType() {
            return BagMsg.S2C_ItemDatas_3004.getDefaultInstance();
         }

         public S2C_ItemDatas_3004 build() {
            S2C_ItemDatas_3004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ItemDatas_3004 buildPartial() {
            S2C_ItemDatas_3004 result = new S2C_ItemDatas_3004(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.subclass_ = this.subclass_;
               to_bitField0_ |= 1;
            }

            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -3;
               }

               result.items_ = this.items_;
            } else {
               result.items_ = this.itemsBuilder_.build();
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
            if (other instanceof S2C_ItemDatas_3004) {
               return this.mergeFrom((S2C_ItemDatas_3004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ItemDatas_3004 other) {
            if (other == BagMsg.S2C_ItemDatas_3004.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSubclass()) {
                  this.setSubclass(other.getSubclass());
               }

               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureItemsIsMutable();
                        this.items_.addAll(other.items_);
                     }

                     this.onChanged();
                  }
               } else if (!other.items_.isEmpty()) {
                  if (this.itemsBuilder_.isEmpty()) {
                     this.itemsBuilder_.dispose();
                     this.itemsBuilder_ = null;
                     this.items_ = other.items_;
                     this.bitField0_ &= -3;
                     this.itemsBuilder_ = BagMsg.S2C_ItemDatas_3004.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
                  } else {
                     this.itemsBuilder_.addAllMessages(other.items_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSubclass()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemsCount(); ++i) {
                  if (!this.getItems(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ItemDatas_3004 parsedMessage = null;

            try {
               parsedMessage = (S2C_ItemDatas_3004)BagMsg.S2C_ItemDatas_3004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ItemDatas_3004)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSubclass() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSubclass() {
            return this.subclass_;
         }

         public Builder setSubclass(int value) {
            this.bitField0_ |= 1;
            this.subclass_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSubclass() {
            this.bitField0_ &= -2;
            this.subclass_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 2;
            }

         }

         public List<Item_Info> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public Item_Info getItems(int index) {
            return this.itemsBuilder_ == null ? (Item_Info)this.items_.get(index) : (Item_Info)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, Item_Info value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.set(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItems(int index, Item_Info.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(Item_Info value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItems(int index, Item_Info value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItems(Item_Info.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, Item_Info.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends Item_Info> values) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.items_);
               this.onChanged();
            } else {
               this.itemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItems() {
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeItems(int index) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.remove(index);
               this.onChanged();
            } else {
               this.itemsBuilder_.remove(index);
            }

            return this;
         }

         public Item_Info.Builder getItemsBuilder(int index) {
            return (Item_Info.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public Item_InfoOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (Item_InfoOrBuilder)this.items_.get(index) : (Item_InfoOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Item_InfoOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public Item_Info.Builder addItemsBuilder() {
            return (Item_Info.Builder)this.getItemsFieldBuilder().addBuilder(BagMsg.Item_Info.getDefaultInstance());
         }

         public Item_Info.Builder addItemsBuilder(int index) {
            return (Item_Info.Builder)this.getItemsFieldBuilder().addBuilder(index, BagMsg.Item_Info.getDefaultInstance());
         }

         public List<Item_Info.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Item_Info, Item_Info.Builder, Item_InfoOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.items_ = null;
            }

            return this.itemsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_ItemUpdate_3006 extends GeneratedMessageV3 implements S2C_ItemUpdate_3006OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMS_FIELD_NUMBER = 1;
      private List<Item_Info> items_;
      private byte memoizedIsInitialized;
      private static final S2C_ItemUpdate_3006 DEFAULT_INSTANCE = new S2C_ItemUpdate_3006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ItemUpdate_3006> PARSER = new AbstractParser<S2C_ItemUpdate_3006>() {
         public S2C_ItemUpdate_3006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ItemUpdate_3006(input, extensionRegistry);
         }
      };

      private S2C_ItemUpdate_3006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ItemUpdate_3006() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ItemUpdate_3006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ItemUpdate_3006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.items_.add(input.readMessage(BagMsg.Item_Info.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUpdate_3006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUpdate_3006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemUpdate_3006.class, Builder.class);
      }

      public List<Item_Info> getItemsList() {
         return this.items_;
      }

      public List<? extends Item_InfoOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public Item_Info getItems(int index) {
         return (Item_Info)this.items_.get(index);
      }

      public Item_InfoOrBuilder getItemsOrBuilder(int index) {
         return (Item_InfoOrBuilder)this.items_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.items_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.items_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ItemUpdate_3006)) {
            return super.equals(obj);
         } else {
            S2C_ItemUpdate_3006 other = (S2C_ItemUpdate_3006)obj;
            if (!this.getItemsList().equals(other.getItemsList())) {
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
            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ItemUpdate_3006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ItemUpdate_3006)PARSER.parseFrom(data);
      }

      public static S2C_ItemUpdate_3006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemUpdate_3006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemUpdate_3006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ItemUpdate_3006)PARSER.parseFrom(data);
      }

      public static S2C_ItemUpdate_3006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemUpdate_3006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemUpdate_3006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ItemUpdate_3006)PARSER.parseFrom(data);
      }

      public static S2C_ItemUpdate_3006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemUpdate_3006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemUpdate_3006 parseFrom(InputStream input) throws IOException {
         return (S2C_ItemUpdate_3006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemUpdate_3006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemUpdate_3006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemUpdate_3006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ItemUpdate_3006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ItemUpdate_3006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemUpdate_3006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemUpdate_3006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ItemUpdate_3006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemUpdate_3006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemUpdate_3006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ItemUpdate_3006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ItemUpdate_3006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ItemUpdate_3006> parser() {
         return PARSER;
      }

      public Parser<S2C_ItemUpdate_3006> getParserForType() {
         return PARSER;
      }

      public S2C_ItemUpdate_3006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ItemUpdate_3006OrBuilder {
         private int bitField0_;
         private List<Item_Info> items_;
         private RepeatedFieldBuilderV3<Item_Info, Item_Info.Builder, Item_InfoOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUpdate_3006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUpdate_3006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemUpdate_3006.class, Builder.class);
         }

         private Builder() {
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_ItemUpdate_3006.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUpdate_3006_descriptor;
         }

         public S2C_ItemUpdate_3006 getDefaultInstanceForType() {
            return BagMsg.S2C_ItemUpdate_3006.getDefaultInstance();
         }

         public S2C_ItemUpdate_3006 build() {
            S2C_ItemUpdate_3006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ItemUpdate_3006 buildPartial() {
            S2C_ItemUpdate_3006 result = new S2C_ItemUpdate_3006(this);
            int from_bitField0_ = this.bitField0_;
            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -2;
               }

               result.items_ = this.items_;
            } else {
               result.items_ = this.itemsBuilder_.build();
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
            if (other instanceof S2C_ItemUpdate_3006) {
               return this.mergeFrom((S2C_ItemUpdate_3006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ItemUpdate_3006 other) {
            if (other == BagMsg.S2C_ItemUpdate_3006.getDefaultInstance()) {
               return this;
            } else {
               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureItemsIsMutable();
                        this.items_.addAll(other.items_);
                     }

                     this.onChanged();
                  }
               } else if (!other.items_.isEmpty()) {
                  if (this.itemsBuilder_.isEmpty()) {
                     this.itemsBuilder_.dispose();
                     this.itemsBuilder_ = null;
                     this.items_ = other.items_;
                     this.bitField0_ &= -2;
                     this.itemsBuilder_ = BagMsg.S2C_ItemUpdate_3006.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
                  } else {
                     this.itemsBuilder_.addAllMessages(other.items_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ItemUpdate_3006 parsedMessage = null;

            try {
               parsedMessage = (S2C_ItemUpdate_3006)BagMsg.S2C_ItemUpdate_3006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ItemUpdate_3006)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 1;
            }

         }

         public List<Item_Info> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public Item_Info getItems(int index) {
            return this.itemsBuilder_ == null ? (Item_Info)this.items_.get(index) : (Item_Info)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, Item_Info value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.set(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItems(int index, Item_Info.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(Item_Info value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItems(int index, Item_Info value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItems(Item_Info.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, Item_Info.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends Item_Info> values) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.items_);
               this.onChanged();
            } else {
               this.itemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItems() {
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeItems(int index) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.remove(index);
               this.onChanged();
            } else {
               this.itemsBuilder_.remove(index);
            }

            return this;
         }

         public Item_Info.Builder getItemsBuilder(int index) {
            return (Item_Info.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public Item_InfoOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (Item_InfoOrBuilder)this.items_.get(index) : (Item_InfoOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Item_InfoOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public Item_Info.Builder addItemsBuilder() {
            return (Item_Info.Builder)this.getItemsFieldBuilder().addBuilder(BagMsg.Item_Info.getDefaultInstance());
         }

         public Item_Info.Builder addItemsBuilder(int index) {
            return (Item_Info.Builder)this.getItemsFieldBuilder().addBuilder(index, BagMsg.Item_Info.getDefaultInstance());
         }

         public List<Item_Info.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Item_Info, Item_Info.Builder, Item_InfoOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.items_ = null;
            }

            return this.itemsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ItemUse_3007 extends GeneratedMessageV3 implements C2S_ItemUse_3007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_ItemUse_3007 DEFAULT_INSTANCE = new C2S_ItemUse_3007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ItemUse_3007> PARSER = new AbstractParser<C2S_ItemUse_3007>() {
         public C2S_ItemUse_3007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ItemUse_3007(input, extensionRegistry);
         }
      };

      private C2S_ItemUse_3007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ItemUse_3007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ItemUse_3007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ItemUse_3007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemUse_3007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemUse_3007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemUse_3007.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else if (!this.hasCode()) {
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
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
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
         } else if (!(obj instanceof C2S_ItemUse_3007)) {
            return super.equals(obj);
         } else {
            C2S_ItemUse_3007 other = (C2S_ItemUse_3007)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
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

      public static C2S_ItemUse_3007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ItemUse_3007)PARSER.parseFrom(data);
      }

      public static C2S_ItemUse_3007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemUse_3007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemUse_3007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ItemUse_3007)PARSER.parseFrom(data);
      }

      public static C2S_ItemUse_3007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemUse_3007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemUse_3007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ItemUse_3007)PARSER.parseFrom(data);
      }

      public static C2S_ItemUse_3007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemUse_3007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemUse_3007 parseFrom(InputStream input) throws IOException {
         return (C2S_ItemUse_3007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemUse_3007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemUse_3007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemUse_3007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ItemUse_3007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ItemUse_3007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemUse_3007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemUse_3007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ItemUse_3007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemUse_3007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemUse_3007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ItemUse_3007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ItemUse_3007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ItemUse_3007> parser() {
         return PARSER;
      }

      public Parser<C2S_ItemUse_3007> getParserForType() {
         return PARSER;
      }

      public C2S_ItemUse_3007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ItemUse_3007OrBuilder {
         private int bitField0_;
         private int code_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemUse_3007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemUse_3007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemUse_3007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_ItemUse_3007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemUse_3007_descriptor;
         }

         public C2S_ItemUse_3007 getDefaultInstanceForType() {
            return BagMsg.C2S_ItemUse_3007.getDefaultInstance();
         }

         public C2S_ItemUse_3007 build() {
            C2S_ItemUse_3007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ItemUse_3007 buildPartial() {
            C2S_ItemUse_3007 result = new C2S_ItemUse_3007(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_ItemUse_3007) {
               return this.mergeFrom((C2S_ItemUse_3007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ItemUse_3007 other) {
            if (other == BagMsg.C2S_ItemUse_3007.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ItemUse_3007 parsedMessage = null;

            try {
               parsedMessage = (C2S_ItemUse_3007)BagMsg.C2S_ItemUse_3007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ItemUse_3007)e.getUnfinishedMessage();
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

   public static final class S2C_ItemUse_3008 extends GeneratedMessageV3 implements S2C_ItemUse_3008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ItemUse_3008 DEFAULT_INSTANCE = new S2C_ItemUse_3008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ItemUse_3008> PARSER = new AbstractParser<S2C_ItemUse_3008>() {
         public S2C_ItemUse_3008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ItemUse_3008(input, extensionRegistry);
         }
      };

      private S2C_ItemUse_3008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ItemUse_3008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ItemUse_3008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ItemUse_3008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUse_3008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUse_3008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemUse_3008.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ItemUse_3008)) {
            return super.equals(obj);
         } else {
            S2C_ItemUse_3008 other = (S2C_ItemUse_3008)obj;
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

      public static S2C_ItemUse_3008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ItemUse_3008)PARSER.parseFrom(data);
      }

      public static S2C_ItemUse_3008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemUse_3008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemUse_3008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ItemUse_3008)PARSER.parseFrom(data);
      }

      public static S2C_ItemUse_3008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemUse_3008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemUse_3008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ItemUse_3008)PARSER.parseFrom(data);
      }

      public static S2C_ItemUse_3008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemUse_3008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemUse_3008 parseFrom(InputStream input) throws IOException {
         return (S2C_ItemUse_3008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemUse_3008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemUse_3008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemUse_3008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ItemUse_3008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ItemUse_3008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemUse_3008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemUse_3008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ItemUse_3008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemUse_3008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemUse_3008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ItemUse_3008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ItemUse_3008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ItemUse_3008> parser() {
         return PARSER;
      }

      public Parser<S2C_ItemUse_3008> getParserForType() {
         return PARSER;
      }

      public S2C_ItemUse_3008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ItemUse_3008OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUse_3008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUse_3008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemUse_3008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_ItemUse_3008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUse_3008_descriptor;
         }

         public S2C_ItemUse_3008 getDefaultInstanceForType() {
            return BagMsg.S2C_ItemUse_3008.getDefaultInstance();
         }

         public S2C_ItemUse_3008 build() {
            S2C_ItemUse_3008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ItemUse_3008 buildPartial() {
            S2C_ItemUse_3008 result = new S2C_ItemUse_3008(this);
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
            if (other instanceof S2C_ItemUse_3008) {
               return this.mergeFrom((S2C_ItemUse_3008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ItemUse_3008 other) {
            if (other == BagMsg.S2C_ItemUse_3008.getDefaultInstance()) {
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
            S2C_ItemUse_3008 parsedMessage = null;

            try {
               parsedMessage = (S2C_ItemUse_3008)BagMsg.S2C_ItemUse_3008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ItemUse_3008)e.getUnfinishedMessage();
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

   public static final class C2S_ItemSell_3009 extends GeneratedMessageV3 implements C2S_ItemSell_3009OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      public static final int GUIDESTEP_FIELD_NUMBER = 3;
      private int guideStep_;
      private byte memoizedIsInitialized;
      private static final C2S_ItemSell_3009 DEFAULT_INSTANCE = new C2S_ItemSell_3009();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ItemSell_3009> PARSER = new AbstractParser<C2S_ItemSell_3009>() {
         public C2S_ItemSell_3009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ItemSell_3009(input, extensionRegistry);
         }
      };

      private C2S_ItemSell_3009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ItemSell_3009() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ItemSell_3009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ItemSell_3009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.guideStep_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemSell_3009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemSell_3009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemSell_3009.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasGuideStep() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGuideStep() {
         return this.guideStep_;
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.guideStep_);
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
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.guideStep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ItemSell_3009)) {
            return super.equals(obj);
         } else {
            C2S_ItemSell_3009 other = (C2S_ItemSell_3009)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasGuideStep() != other.hasGuideStep()) {
               return false;
            } else if (this.hasGuideStep() && this.getGuideStep() != other.getGuideStep()) {
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

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasGuideStep()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGuideStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ItemSell_3009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ItemSell_3009)PARSER.parseFrom(data);
      }

      public static C2S_ItemSell_3009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemSell_3009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemSell_3009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ItemSell_3009)PARSER.parseFrom(data);
      }

      public static C2S_ItemSell_3009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemSell_3009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemSell_3009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ItemSell_3009)PARSER.parseFrom(data);
      }

      public static C2S_ItemSell_3009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemSell_3009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemSell_3009 parseFrom(InputStream input) throws IOException {
         return (C2S_ItemSell_3009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemSell_3009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemSell_3009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemSell_3009 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ItemSell_3009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ItemSell_3009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemSell_3009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemSell_3009 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ItemSell_3009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemSell_3009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemSell_3009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ItemSell_3009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ItemSell_3009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ItemSell_3009> parser() {
         return PARSER;
      }

      public Parser<C2S_ItemSell_3009> getParserForType() {
         return PARSER;
      }

      public C2S_ItemSell_3009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ItemSell_3009OrBuilder {
         private int bitField0_;
         private int code_;
         private int num_;
         private int guideStep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemSell_3009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemSell_3009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemSell_3009.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_ItemSell_3009.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            this.guideStep_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemSell_3009_descriptor;
         }

         public C2S_ItemSell_3009 getDefaultInstanceForType() {
            return BagMsg.C2S_ItemSell_3009.getDefaultInstance();
         }

         public C2S_ItemSell_3009 build() {
            C2S_ItemSell_3009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ItemSell_3009 buildPartial() {
            C2S_ItemSell_3009 result = new C2S_ItemSell_3009(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.guideStep_ = this.guideStep_;
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
            if (other instanceof C2S_ItemSell_3009) {
               return this.mergeFrom((C2S_ItemSell_3009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ItemSell_3009 other) {
            if (other == BagMsg.C2S_ItemSell_3009.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasGuideStep()) {
                  this.setGuideStep(other.getGuideStep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ItemSell_3009 parsedMessage = null;

            try {
               parsedMessage = (C2S_ItemSell_3009)BagMsg.C2S_ItemSell_3009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ItemSell_3009)e.getUnfinishedMessage();
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

         public boolean hasGuideStep() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGuideStep() {
            return this.guideStep_;
         }

         public Builder setGuideStep(int value) {
            this.bitField0_ |= 4;
            this.guideStep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuideStep() {
            this.bitField0_ &= -5;
            this.guideStep_ = 0;
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

   public static final class S2C_ItemSell_3010 extends GeneratedMessageV3 implements S2C_ItemSell_3010OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ItemSell_3010 DEFAULT_INSTANCE = new S2C_ItemSell_3010();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ItemSell_3010> PARSER = new AbstractParser<S2C_ItemSell_3010>() {
         public S2C_ItemSell_3010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ItemSell_3010(input, extensionRegistry);
         }
      };

      private S2C_ItemSell_3010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ItemSell_3010() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ItemSell_3010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ItemSell_3010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemSell_3010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemSell_3010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemSell_3010.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ItemSell_3010)) {
            return super.equals(obj);
         } else {
            S2C_ItemSell_3010 other = (S2C_ItemSell_3010)obj;
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

      public static S2C_ItemSell_3010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ItemSell_3010)PARSER.parseFrom(data);
      }

      public static S2C_ItemSell_3010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemSell_3010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemSell_3010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ItemSell_3010)PARSER.parseFrom(data);
      }

      public static S2C_ItemSell_3010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemSell_3010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemSell_3010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ItemSell_3010)PARSER.parseFrom(data);
      }

      public static S2C_ItemSell_3010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemSell_3010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemSell_3010 parseFrom(InputStream input) throws IOException {
         return (S2C_ItemSell_3010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemSell_3010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemSell_3010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemSell_3010 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ItemSell_3010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ItemSell_3010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemSell_3010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemSell_3010 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ItemSell_3010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemSell_3010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemSell_3010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ItemSell_3010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ItemSell_3010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ItemSell_3010> parser() {
         return PARSER;
      }

      public Parser<S2C_ItemSell_3010> getParserForType() {
         return PARSER;
      }

      public S2C_ItemSell_3010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ItemSell_3010OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemSell_3010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemSell_3010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemSell_3010.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_ItemSell_3010.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemSell_3010_descriptor;
         }

         public S2C_ItemSell_3010 getDefaultInstanceForType() {
            return BagMsg.S2C_ItemSell_3010.getDefaultInstance();
         }

         public S2C_ItemSell_3010 build() {
            S2C_ItemSell_3010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ItemSell_3010 buildPartial() {
            S2C_ItemSell_3010 result = new S2C_ItemSell_3010(this);
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
            if (other instanceof S2C_ItemSell_3010) {
               return this.mergeFrom((S2C_ItemSell_3010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ItemSell_3010 other) {
            if (other == BagMsg.S2C_ItemSell_3010.getDefaultInstance()) {
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
            S2C_ItemSell_3010 parsedMessage = null;

            try {
               parsedMessage = (S2C_ItemSell_3010)BagMsg.S2C_ItemSell_3010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ItemSell_3010)e.getUnfinishedMessage();
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

   public static final class C2S_ItemCompose_3011 extends GeneratedMessageV3 implements C2S_ItemCompose_3011OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      public static final int GUIDESTEP_FIELD_NUMBER = 3;
      private int guideStep_;
      private byte memoizedIsInitialized;
      private static final C2S_ItemCompose_3011 DEFAULT_INSTANCE = new C2S_ItemCompose_3011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ItemCompose_3011> PARSER = new AbstractParser<C2S_ItemCompose_3011>() {
         public C2S_ItemCompose_3011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ItemCompose_3011(input, extensionRegistry);
         }
      };

      private C2S_ItemCompose_3011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ItemCompose_3011() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ItemCompose_3011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ItemCompose_3011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.guideStep_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemCompose_3011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemCompose_3011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemCompose_3011.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasGuideStep() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGuideStep() {
         return this.guideStep_;
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.guideStep_);
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
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.guideStep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ItemCompose_3011)) {
            return super.equals(obj);
         } else {
            C2S_ItemCompose_3011 other = (C2S_ItemCompose_3011)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasGuideStep() != other.hasGuideStep()) {
               return false;
            } else if (this.hasGuideStep() && this.getGuideStep() != other.getGuideStep()) {
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

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasGuideStep()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGuideStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ItemCompose_3011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ItemCompose_3011)PARSER.parseFrom(data);
      }

      public static C2S_ItemCompose_3011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemCompose_3011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemCompose_3011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ItemCompose_3011)PARSER.parseFrom(data);
      }

      public static C2S_ItemCompose_3011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemCompose_3011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemCompose_3011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ItemCompose_3011)PARSER.parseFrom(data);
      }

      public static C2S_ItemCompose_3011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemCompose_3011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemCompose_3011 parseFrom(InputStream input) throws IOException {
         return (C2S_ItemCompose_3011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemCompose_3011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemCompose_3011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemCompose_3011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ItemCompose_3011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ItemCompose_3011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemCompose_3011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemCompose_3011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ItemCompose_3011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemCompose_3011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemCompose_3011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ItemCompose_3011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ItemCompose_3011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ItemCompose_3011> parser() {
         return PARSER;
      }

      public Parser<C2S_ItemCompose_3011> getParserForType() {
         return PARSER;
      }

      public C2S_ItemCompose_3011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ItemCompose_3011OrBuilder {
         private int bitField0_;
         private int code_;
         private int num_;
         private int guideStep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemCompose_3011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemCompose_3011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemCompose_3011.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_ItemCompose_3011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            this.guideStep_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemCompose_3011_descriptor;
         }

         public C2S_ItemCompose_3011 getDefaultInstanceForType() {
            return BagMsg.C2S_ItemCompose_3011.getDefaultInstance();
         }

         public C2S_ItemCompose_3011 build() {
            C2S_ItemCompose_3011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ItemCompose_3011 buildPartial() {
            C2S_ItemCompose_3011 result = new C2S_ItemCompose_3011(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.guideStep_ = this.guideStep_;
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
            if (other instanceof C2S_ItemCompose_3011) {
               return this.mergeFrom((C2S_ItemCompose_3011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ItemCompose_3011 other) {
            if (other == BagMsg.C2S_ItemCompose_3011.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasGuideStep()) {
                  this.setGuideStep(other.getGuideStep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ItemCompose_3011 parsedMessage = null;

            try {
               parsedMessage = (C2S_ItemCompose_3011)BagMsg.C2S_ItemCompose_3011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ItemCompose_3011)e.getUnfinishedMessage();
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

         public boolean hasGuideStep() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGuideStep() {
            return this.guideStep_;
         }

         public Builder setGuideStep(int value) {
            this.bitField0_ |= 4;
            this.guideStep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuideStep() {
            this.bitField0_ &= -5;
            this.guideStep_ = 0;
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

   public static final class S2C_ItemCompose_3012 extends GeneratedMessageV3 implements S2C_ItemCompose_3012OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ItemCompose_3012 DEFAULT_INSTANCE = new S2C_ItemCompose_3012();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ItemCompose_3012> PARSER = new AbstractParser<S2C_ItemCompose_3012>() {
         public S2C_ItemCompose_3012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ItemCompose_3012(input, extensionRegistry);
         }
      };

      private S2C_ItemCompose_3012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ItemCompose_3012() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ItemCompose_3012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ItemCompose_3012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemCompose_3012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemCompose_3012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemCompose_3012.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ItemCompose_3012)) {
            return super.equals(obj);
         } else {
            S2C_ItemCompose_3012 other = (S2C_ItemCompose_3012)obj;
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

      public static S2C_ItemCompose_3012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ItemCompose_3012)PARSER.parseFrom(data);
      }

      public static S2C_ItemCompose_3012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemCompose_3012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemCompose_3012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ItemCompose_3012)PARSER.parseFrom(data);
      }

      public static S2C_ItemCompose_3012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemCompose_3012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemCompose_3012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ItemCompose_3012)PARSER.parseFrom(data);
      }

      public static S2C_ItemCompose_3012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemCompose_3012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemCompose_3012 parseFrom(InputStream input) throws IOException {
         return (S2C_ItemCompose_3012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemCompose_3012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemCompose_3012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemCompose_3012 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ItemCompose_3012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ItemCompose_3012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemCompose_3012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemCompose_3012 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ItemCompose_3012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemCompose_3012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemCompose_3012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ItemCompose_3012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ItemCompose_3012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ItemCompose_3012> parser() {
         return PARSER;
      }

      public Parser<S2C_ItemCompose_3012> getParserForType() {
         return PARSER;
      }

      public S2C_ItemCompose_3012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ItemCompose_3012OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemCompose_3012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemCompose_3012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemCompose_3012.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_ItemCompose_3012.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemCompose_3012_descriptor;
         }

         public S2C_ItemCompose_3012 getDefaultInstanceForType() {
            return BagMsg.S2C_ItemCompose_3012.getDefaultInstance();
         }

         public S2C_ItemCompose_3012 build() {
            S2C_ItemCompose_3012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ItemCompose_3012 buildPartial() {
            S2C_ItemCompose_3012 result = new S2C_ItemCompose_3012(this);
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
            if (other instanceof S2C_ItemCompose_3012) {
               return this.mergeFrom((S2C_ItemCompose_3012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ItemCompose_3012 other) {
            if (other == BagMsg.S2C_ItemCompose_3012.getDefaultInstance()) {
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
            S2C_ItemCompose_3012 parsedMessage = null;

            try {
               parsedMessage = (S2C_ItemCompose_3012)BagMsg.S2C_ItemCompose_3012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ItemCompose_3012)e.getUnfinishedMessage();
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

   public static final class C2S_OpenBox_3013 extends GeneratedMessageV3 implements C2S_OpenBox_3013OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenBox_3013 DEFAULT_INSTANCE = new C2S_OpenBox_3013();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenBox_3013> PARSER = new AbstractParser<C2S_OpenBox_3013>() {
         public C2S_OpenBox_3013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenBox_3013(input, extensionRegistry);
         }
      };

      private C2S_OpenBox_3013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenBox_3013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenBox_3013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenBox_3013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenBox_3013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenBox_3013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenBox_3013.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else if (!this.hasCode()) {
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
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
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
         } else if (!(obj instanceof C2S_OpenBox_3013)) {
            return super.equals(obj);
         } else {
            C2S_OpenBox_3013 other = (C2S_OpenBox_3013)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
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

      public static C2S_OpenBox_3013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_3013)PARSER.parseFrom(data);
      }

      public static C2S_OpenBox_3013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_3013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenBox_3013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_3013)PARSER.parseFrom(data);
      }

      public static C2S_OpenBox_3013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_3013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenBox_3013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_3013)PARSER.parseFrom(data);
      }

      public static C2S_OpenBox_3013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_3013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenBox_3013 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenBox_3013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenBox_3013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenBox_3013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenBox_3013 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenBox_3013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenBox_3013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenBox_3013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenBox_3013 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenBox_3013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenBox_3013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenBox_3013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenBox_3013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenBox_3013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenBox_3013> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenBox_3013> getParserForType() {
         return PARSER;
      }

      public C2S_OpenBox_3013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenBox_3013OrBuilder {
         private int bitField0_;
         private int code_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenBox_3013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenBox_3013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenBox_3013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_OpenBox_3013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenBox_3013_descriptor;
         }

         public C2S_OpenBox_3013 getDefaultInstanceForType() {
            return BagMsg.C2S_OpenBox_3013.getDefaultInstance();
         }

         public C2S_OpenBox_3013 build() {
            C2S_OpenBox_3013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenBox_3013 buildPartial() {
            C2S_OpenBox_3013 result = new C2S_OpenBox_3013(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_OpenBox_3013) {
               return this.mergeFrom((C2S_OpenBox_3013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenBox_3013 other) {
            if (other == BagMsg.C2S_OpenBox_3013.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OpenBox_3013 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenBox_3013)BagMsg.C2S_OpenBox_3013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenBox_3013)e.getUnfinishedMessage();
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

   public static final class S2C_OpenBox_3014 extends GeneratedMessageV3 implements S2C_OpenBox_3014OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenBox_3014 DEFAULT_INSTANCE = new S2C_OpenBox_3014();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenBox_3014> PARSER = new AbstractParser<S2C_OpenBox_3014>() {
         public S2C_OpenBox_3014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenBox_3014(input, extensionRegistry);
         }
      };

      private S2C_OpenBox_3014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenBox_3014() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenBox_3014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenBox_3014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenBox_3014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenBox_3014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenBox_3014.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else if (!this.hasCode()) {
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
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
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
         } else if (!(obj instanceof S2C_OpenBox_3014)) {
            return super.equals(obj);
         } else {
            S2C_OpenBox_3014 other = (S2C_OpenBox_3014)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
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

      public static S2C_OpenBox_3014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenBox_3014)PARSER.parseFrom(data);
      }

      public static S2C_OpenBox_3014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenBox_3014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenBox_3014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenBox_3014)PARSER.parseFrom(data);
      }

      public static S2C_OpenBox_3014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenBox_3014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenBox_3014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenBox_3014)PARSER.parseFrom(data);
      }

      public static S2C_OpenBox_3014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenBox_3014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenBox_3014 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenBox_3014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenBox_3014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenBox_3014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenBox_3014 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenBox_3014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenBox_3014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenBox_3014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenBox_3014 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenBox_3014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenBox_3014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenBox_3014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenBox_3014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenBox_3014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenBox_3014> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenBox_3014> getParserForType() {
         return PARSER;
      }

      public S2C_OpenBox_3014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenBox_3014OrBuilder {
         private int bitField0_;
         private int code_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenBox_3014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenBox_3014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenBox_3014.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_OpenBox_3014.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenBox_3014_descriptor;
         }

         public S2C_OpenBox_3014 getDefaultInstanceForType() {
            return BagMsg.S2C_OpenBox_3014.getDefaultInstance();
         }

         public S2C_OpenBox_3014 build() {
            S2C_OpenBox_3014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenBox_3014 buildPartial() {
            S2C_OpenBox_3014 result = new S2C_OpenBox_3014(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof S2C_OpenBox_3014) {
               return this.mergeFrom((S2C_OpenBox_3014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenBox_3014 other) {
            if (other == BagMsg.S2C_OpenBox_3014.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenBox_3014 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenBox_3014)BagMsg.S2C_OpenBox_3014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenBox_3014)e.getUnfinishedMessage();
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

   public static final class C2S_OpenSelectBox_3015 extends GeneratedMessageV3 implements C2S_OpenSelectBox_3015OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int NUM_FIELD_NUMBER = 3;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenSelectBox_3015 DEFAULT_INSTANCE = new C2S_OpenSelectBox_3015();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenSelectBox_3015> PARSER = new AbstractParser<C2S_OpenSelectBox_3015>() {
         public C2S_OpenSelectBox_3015 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenSelectBox_3015(input, extensionRegistry);
         }
      };

      private C2S_OpenSelectBox_3015(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenSelectBox_3015() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenSelectBox_3015();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenSelectBox_3015(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.id_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenSelectBox_3015_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenSelectBox_3015_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenSelectBox_3015.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.num_);
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
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OpenSelectBox_3015)) {
            return super.equals(obj);
         } else {
            C2S_OpenSelectBox_3015 other = (C2S_OpenSelectBox_3015)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OpenSelectBox_3015 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenSelectBox_3015)PARSER.parseFrom(data);
      }

      public static C2S_OpenSelectBox_3015 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenSelectBox_3015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenSelectBox_3015 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenSelectBox_3015)PARSER.parseFrom(data);
      }

      public static C2S_OpenSelectBox_3015 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenSelectBox_3015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenSelectBox_3015 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenSelectBox_3015)PARSER.parseFrom(data);
      }

      public static C2S_OpenSelectBox_3015 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenSelectBox_3015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenSelectBox_3015 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenSelectBox_3015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenSelectBox_3015 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenSelectBox_3015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenSelectBox_3015 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenSelectBox_3015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenSelectBox_3015 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenSelectBox_3015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenSelectBox_3015 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenSelectBox_3015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenSelectBox_3015 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenSelectBox_3015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenSelectBox_3015 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenSelectBox_3015 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenSelectBox_3015> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenSelectBox_3015> getParserForType() {
         return PARSER;
      }

      public C2S_OpenSelectBox_3015 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenSelectBox_3015OrBuilder {
         private int bitField0_;
         private int code_;
         private int id_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenSelectBox_3015_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenSelectBox_3015_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenSelectBox_3015.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_OpenSelectBox_3015.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenSelectBox_3015_descriptor;
         }

         public C2S_OpenSelectBox_3015 getDefaultInstanceForType() {
            return BagMsg.C2S_OpenSelectBox_3015.getDefaultInstance();
         }

         public C2S_OpenSelectBox_3015 build() {
            C2S_OpenSelectBox_3015 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenSelectBox_3015 buildPartial() {
            C2S_OpenSelectBox_3015 result = new C2S_OpenSelectBox_3015(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_OpenSelectBox_3015) {
               return this.mergeFrom((C2S_OpenSelectBox_3015)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenSelectBox_3015 other) {
            if (other == BagMsg.C2S_OpenSelectBox_3015.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
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
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OpenSelectBox_3015 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenSelectBox_3015)BagMsg.C2S_OpenSelectBox_3015.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenSelectBox_3015)e.getUnfinishedMessage();
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

         public boolean hasNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 4;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -5;
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

   public static final class S2C_OpenSelectBox_3016 extends GeneratedMessageV3 implements S2C_OpenSelectBox_3016OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenSelectBox_3016 DEFAULT_INSTANCE = new S2C_OpenSelectBox_3016();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenSelectBox_3016> PARSER = new AbstractParser<S2C_OpenSelectBox_3016>() {
         public S2C_OpenSelectBox_3016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenSelectBox_3016(input, extensionRegistry);
         }
      };

      private S2C_OpenSelectBox_3016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenSelectBox_3016() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenSelectBox_3016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenSelectBox_3016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenSelectBox_3016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenSelectBox_3016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenSelectBox_3016.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else if (!this.hasCode()) {
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
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
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
         } else if (!(obj instanceof S2C_OpenSelectBox_3016)) {
            return super.equals(obj);
         } else {
            S2C_OpenSelectBox_3016 other = (S2C_OpenSelectBox_3016)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
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

      public static S2C_OpenSelectBox_3016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenSelectBox_3016)PARSER.parseFrom(data);
      }

      public static S2C_OpenSelectBox_3016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenSelectBox_3016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenSelectBox_3016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenSelectBox_3016)PARSER.parseFrom(data);
      }

      public static S2C_OpenSelectBox_3016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenSelectBox_3016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenSelectBox_3016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenSelectBox_3016)PARSER.parseFrom(data);
      }

      public static S2C_OpenSelectBox_3016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenSelectBox_3016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenSelectBox_3016 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenSelectBox_3016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenSelectBox_3016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenSelectBox_3016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenSelectBox_3016 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenSelectBox_3016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenSelectBox_3016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenSelectBox_3016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenSelectBox_3016 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenSelectBox_3016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenSelectBox_3016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenSelectBox_3016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenSelectBox_3016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenSelectBox_3016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenSelectBox_3016> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenSelectBox_3016> getParserForType() {
         return PARSER;
      }

      public S2C_OpenSelectBox_3016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenSelectBox_3016OrBuilder {
         private int bitField0_;
         private int code_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenSelectBox_3016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenSelectBox_3016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenSelectBox_3016.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_OpenSelectBox_3016.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenSelectBox_3016_descriptor;
         }

         public S2C_OpenSelectBox_3016 getDefaultInstanceForType() {
            return BagMsg.S2C_OpenSelectBox_3016.getDefaultInstance();
         }

         public S2C_OpenSelectBox_3016 build() {
            S2C_OpenSelectBox_3016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenSelectBox_3016 buildPartial() {
            S2C_OpenSelectBox_3016 result = new S2C_OpenSelectBox_3016(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof S2C_OpenSelectBox_3016) {
               return this.mergeFrom((S2C_OpenSelectBox_3016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenSelectBox_3016 other) {
            if (other == BagMsg.S2C_OpenSelectBox_3016.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenSelectBox_3016 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenSelectBox_3016)BagMsg.S2C_OpenSelectBox_3016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenSelectBox_3016)e.getUnfinishedMessage();
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

   public static final class C2S_ItemBuy_3017 extends GeneratedMessageV3 implements C2S_ItemBuy_3017OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_ItemBuy_3017 DEFAULT_INSTANCE = new C2S_ItemBuy_3017();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ItemBuy_3017> PARSER = new AbstractParser<C2S_ItemBuy_3017>() {
         public C2S_ItemBuy_3017 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ItemBuy_3017(input, extensionRegistry);
         }
      };

      private C2S_ItemBuy_3017(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ItemBuy_3017() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ItemBuy_3017();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ItemBuy_3017(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemBuy_3017_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemBuy_3017_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemBuy_3017.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
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
         } else if (!this.hasId()) {
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
            output.writeInt32(1, this.id_);
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
               size += CodedOutputStream.computeInt32Size(1, this.id_);
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
         } else if (!(obj instanceof C2S_ItemBuy_3017)) {
            return super.equals(obj);
         } else {
            C2S_ItemBuy_3017 other = (C2S_ItemBuy_3017)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
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

      public static C2S_ItemBuy_3017 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ItemBuy_3017)PARSER.parseFrom(data);
      }

      public static C2S_ItemBuy_3017 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemBuy_3017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemBuy_3017 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ItemBuy_3017)PARSER.parseFrom(data);
      }

      public static C2S_ItemBuy_3017 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemBuy_3017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemBuy_3017 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ItemBuy_3017)PARSER.parseFrom(data);
      }

      public static C2S_ItemBuy_3017 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemBuy_3017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemBuy_3017 parseFrom(InputStream input) throws IOException {
         return (C2S_ItemBuy_3017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemBuy_3017 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemBuy_3017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemBuy_3017 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ItemBuy_3017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ItemBuy_3017 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemBuy_3017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemBuy_3017 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ItemBuy_3017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemBuy_3017 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemBuy_3017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ItemBuy_3017 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ItemBuy_3017 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ItemBuy_3017> parser() {
         return PARSER;
      }

      public Parser<C2S_ItemBuy_3017> getParserForType() {
         return PARSER;
      }

      public C2S_ItemBuy_3017 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ItemBuy_3017OrBuilder {
         private int bitField0_;
         private int id_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemBuy_3017_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemBuy_3017_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemBuy_3017.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_ItemBuy_3017.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemBuy_3017_descriptor;
         }

         public C2S_ItemBuy_3017 getDefaultInstanceForType() {
            return BagMsg.C2S_ItemBuy_3017.getDefaultInstance();
         }

         public C2S_ItemBuy_3017 build() {
            C2S_ItemBuy_3017 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ItemBuy_3017 buildPartial() {
            C2S_ItemBuy_3017 result = new C2S_ItemBuy_3017(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof C2S_ItemBuy_3017) {
               return this.mergeFrom((C2S_ItemBuy_3017)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ItemBuy_3017 other) {
            if (other == BagMsg.C2S_ItemBuy_3017.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
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
            if (!this.hasId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ItemBuy_3017 parsedMessage = null;

            try {
               parsedMessage = (C2S_ItemBuy_3017)BagMsg.C2S_ItemBuy_3017.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ItemBuy_3017)e.getUnfinishedMessage();
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

   public static final class S2C_ItemBuyResult_3018 extends GeneratedMessageV3 implements S2C_ItemBuyResult_3018OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ItemBuyResult_3018 DEFAULT_INSTANCE = new S2C_ItemBuyResult_3018();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ItemBuyResult_3018> PARSER = new AbstractParser<S2C_ItemBuyResult_3018>() {
         public S2C_ItemBuyResult_3018 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ItemBuyResult_3018(input, extensionRegistry);
         }
      };

      private S2C_ItemBuyResult_3018(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ItemBuyResult_3018() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ItemBuyResult_3018();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ItemBuyResult_3018(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemBuyResult_3018_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemBuyResult_3018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemBuyResult_3018.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ItemBuyResult_3018)) {
            return super.equals(obj);
         } else {
            S2C_ItemBuyResult_3018 other = (S2C_ItemBuyResult_3018)obj;
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

      public static S2C_ItemBuyResult_3018 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ItemBuyResult_3018)PARSER.parseFrom(data);
      }

      public static S2C_ItemBuyResult_3018 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemBuyResult_3018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemBuyResult_3018 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ItemBuyResult_3018)PARSER.parseFrom(data);
      }

      public static S2C_ItemBuyResult_3018 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemBuyResult_3018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemBuyResult_3018 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ItemBuyResult_3018)PARSER.parseFrom(data);
      }

      public static S2C_ItemBuyResult_3018 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemBuyResult_3018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemBuyResult_3018 parseFrom(InputStream input) throws IOException {
         return (S2C_ItemBuyResult_3018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemBuyResult_3018 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemBuyResult_3018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemBuyResult_3018 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ItemBuyResult_3018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ItemBuyResult_3018 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemBuyResult_3018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemBuyResult_3018 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ItemBuyResult_3018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemBuyResult_3018 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemBuyResult_3018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ItemBuyResult_3018 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ItemBuyResult_3018 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ItemBuyResult_3018> parser() {
         return PARSER;
      }

      public Parser<S2C_ItemBuyResult_3018> getParserForType() {
         return PARSER;
      }

      public S2C_ItemBuyResult_3018 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ItemBuyResult_3018OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemBuyResult_3018_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemBuyResult_3018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemBuyResult_3018.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_ItemBuyResult_3018.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemBuyResult_3018_descriptor;
         }

         public S2C_ItemBuyResult_3018 getDefaultInstanceForType() {
            return BagMsg.S2C_ItemBuyResult_3018.getDefaultInstance();
         }

         public S2C_ItemBuyResult_3018 build() {
            S2C_ItemBuyResult_3018 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ItemBuyResult_3018 buildPartial() {
            S2C_ItemBuyResult_3018 result = new S2C_ItemBuyResult_3018(this);
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
            if (other instanceof S2C_ItemBuyResult_3018) {
               return this.mergeFrom((S2C_ItemBuyResult_3018)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ItemBuyResult_3018 other) {
            if (other == BagMsg.S2C_ItemBuyResult_3018.getDefaultInstance()) {
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
            S2C_ItemBuyResult_3018 parsedMessage = null;

            try {
               parsedMessage = (S2C_ItemBuyResult_3018)BagMsg.S2C_ItemBuyResult_3018.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ItemBuyResult_3018)e.getUnfinishedMessage();
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

   public static final class C2S_ViceCompose_3019 extends GeneratedMessageV3 implements C2S_ViceCompose_3019OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_ViceCompose_3019 DEFAULT_INSTANCE = new C2S_ViceCompose_3019();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ViceCompose_3019> PARSER = new AbstractParser<C2S_ViceCompose_3019>() {
         public C2S_ViceCompose_3019 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ViceCompose_3019(input, extensionRegistry);
         }
      };

      private C2S_ViceCompose_3019(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ViceCompose_3019() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ViceCompose_3019();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ViceCompose_3019(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ViceCompose_3019_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ViceCompose_3019_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ViceCompose_3019.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else if (!this.hasCode()) {
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
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
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
         } else if (!(obj instanceof C2S_ViceCompose_3019)) {
            return super.equals(obj);
         } else {
            C2S_ViceCompose_3019 other = (C2S_ViceCompose_3019)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
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

      public static C2S_ViceCompose_3019 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ViceCompose_3019)PARSER.parseFrom(data);
      }

      public static C2S_ViceCompose_3019 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ViceCompose_3019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ViceCompose_3019 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ViceCompose_3019)PARSER.parseFrom(data);
      }

      public static C2S_ViceCompose_3019 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ViceCompose_3019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ViceCompose_3019 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ViceCompose_3019)PARSER.parseFrom(data);
      }

      public static C2S_ViceCompose_3019 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ViceCompose_3019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ViceCompose_3019 parseFrom(InputStream input) throws IOException {
         return (C2S_ViceCompose_3019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ViceCompose_3019 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ViceCompose_3019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ViceCompose_3019 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ViceCompose_3019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ViceCompose_3019 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ViceCompose_3019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ViceCompose_3019 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ViceCompose_3019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ViceCompose_3019 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ViceCompose_3019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ViceCompose_3019 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ViceCompose_3019 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ViceCompose_3019> parser() {
         return PARSER;
      }

      public Parser<C2S_ViceCompose_3019> getParserForType() {
         return PARSER;
      }

      public C2S_ViceCompose_3019 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ViceCompose_3019OrBuilder {
         private int bitField0_;
         private int code_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ViceCompose_3019_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ViceCompose_3019_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ViceCompose_3019.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_ViceCompose_3019.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ViceCompose_3019_descriptor;
         }

         public C2S_ViceCompose_3019 getDefaultInstanceForType() {
            return BagMsg.C2S_ViceCompose_3019.getDefaultInstance();
         }

         public C2S_ViceCompose_3019 build() {
            C2S_ViceCompose_3019 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ViceCompose_3019 buildPartial() {
            C2S_ViceCompose_3019 result = new C2S_ViceCompose_3019(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_ViceCompose_3019) {
               return this.mergeFrom((C2S_ViceCompose_3019)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ViceCompose_3019 other) {
            if (other == BagMsg.C2S_ViceCompose_3019.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ViceCompose_3019 parsedMessage = null;

            try {
               parsedMessage = (C2S_ViceCompose_3019)BagMsg.C2S_ViceCompose_3019.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ViceCompose_3019)e.getUnfinishedMessage();
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

   public static final class S2C_ViceCompose_3020 extends GeneratedMessageV3 implements S2C_ViceCompose_3020OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ViceCompose_3020 DEFAULT_INSTANCE = new S2C_ViceCompose_3020();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ViceCompose_3020> PARSER = new AbstractParser<S2C_ViceCompose_3020>() {
         public S2C_ViceCompose_3020 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ViceCompose_3020(input, extensionRegistry);
         }
      };

      private S2C_ViceCompose_3020(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ViceCompose_3020() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ViceCompose_3020();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ViceCompose_3020(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ViceCompose_3020_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ViceCompose_3020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ViceCompose_3020.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ViceCompose_3020)) {
            return super.equals(obj);
         } else {
            S2C_ViceCompose_3020 other = (S2C_ViceCompose_3020)obj;
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

      public static S2C_ViceCompose_3020 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ViceCompose_3020)PARSER.parseFrom(data);
      }

      public static S2C_ViceCompose_3020 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ViceCompose_3020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ViceCompose_3020 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ViceCompose_3020)PARSER.parseFrom(data);
      }

      public static S2C_ViceCompose_3020 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ViceCompose_3020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ViceCompose_3020 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ViceCompose_3020)PARSER.parseFrom(data);
      }

      public static S2C_ViceCompose_3020 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ViceCompose_3020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ViceCompose_3020 parseFrom(InputStream input) throws IOException {
         return (S2C_ViceCompose_3020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ViceCompose_3020 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ViceCompose_3020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ViceCompose_3020 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ViceCompose_3020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ViceCompose_3020 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ViceCompose_3020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ViceCompose_3020 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ViceCompose_3020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ViceCompose_3020 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ViceCompose_3020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ViceCompose_3020 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ViceCompose_3020 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ViceCompose_3020> parser() {
         return PARSER;
      }

      public Parser<S2C_ViceCompose_3020> getParserForType() {
         return PARSER;
      }

      public S2C_ViceCompose_3020 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ViceCompose_3020OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ViceCompose_3020_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ViceCompose_3020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ViceCompose_3020.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_ViceCompose_3020.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ViceCompose_3020_descriptor;
         }

         public S2C_ViceCompose_3020 getDefaultInstanceForType() {
            return BagMsg.S2C_ViceCompose_3020.getDefaultInstance();
         }

         public S2C_ViceCompose_3020 build() {
            S2C_ViceCompose_3020 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ViceCompose_3020 buildPartial() {
            S2C_ViceCompose_3020 result = new S2C_ViceCompose_3020(this);
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
            if (other instanceof S2C_ViceCompose_3020) {
               return this.mergeFrom((S2C_ViceCompose_3020)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ViceCompose_3020 other) {
            if (other == BagMsg.S2C_ViceCompose_3020.getDefaultInstance()) {
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
            S2C_ViceCompose_3020 parsedMessage = null;

            try {
               parsedMessage = (S2C_ViceCompose_3020)BagMsg.S2C_ViceCompose_3020.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ViceCompose_3020)e.getUnfinishedMessage();
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

   public static final class C2S_HeroDressUse_3021 extends GeneratedMessageV3 implements C2S_HeroDressUse_3021OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroDressUse_3021 DEFAULT_INSTANCE = new C2S_HeroDressUse_3021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroDressUse_3021> PARSER = new AbstractParser<C2S_HeroDressUse_3021>() {
         public C2S_HeroDressUse_3021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroDressUse_3021(input, extensionRegistry);
         }
      };

      private C2S_HeroDressUse_3021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroDressUse_3021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroDressUse_3021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroDressUse_3021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_HeroDressUse_3021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_HeroDressUse_3021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroDressUse_3021.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
            output.writeInt32(1, this.code_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroDressUse_3021)) {
            return super.equals(obj);
         } else {
            C2S_HeroDressUse_3021 other = (C2S_HeroDressUse_3021)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroDressUse_3021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroDressUse_3021)PARSER.parseFrom(data);
      }

      public static C2S_HeroDressUse_3021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroDressUse_3021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroDressUse_3021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroDressUse_3021)PARSER.parseFrom(data);
      }

      public static C2S_HeroDressUse_3021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroDressUse_3021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroDressUse_3021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroDressUse_3021)PARSER.parseFrom(data);
      }

      public static C2S_HeroDressUse_3021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroDressUse_3021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroDressUse_3021 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroDressUse_3021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroDressUse_3021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroDressUse_3021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroDressUse_3021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroDressUse_3021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroDressUse_3021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroDressUse_3021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroDressUse_3021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroDressUse_3021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroDressUse_3021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroDressUse_3021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroDressUse_3021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroDressUse_3021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroDressUse_3021> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroDressUse_3021> getParserForType() {
         return PARSER;
      }

      public C2S_HeroDressUse_3021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroDressUse_3021OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_HeroDressUse_3021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_HeroDressUse_3021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroDressUse_3021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_HeroDressUse_3021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_HeroDressUse_3021_descriptor;
         }

         public C2S_HeroDressUse_3021 getDefaultInstanceForType() {
            return BagMsg.C2S_HeroDressUse_3021.getDefaultInstance();
         }

         public C2S_HeroDressUse_3021 build() {
            C2S_HeroDressUse_3021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroDressUse_3021 buildPartial() {
            C2S_HeroDressUse_3021 result = new C2S_HeroDressUse_3021(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_HeroDressUse_3021) {
               return this.mergeFrom((C2S_HeroDressUse_3021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroDressUse_3021 other) {
            if (other == BagMsg.C2S_HeroDressUse_3021.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            C2S_HeroDressUse_3021 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroDressUse_3021)BagMsg.C2S_HeroDressUse_3021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroDressUse_3021)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_HeroDressUse_3022 extends GeneratedMessageV3 implements S2C_HeroDressUse_3022OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ITEMID_FIELD_NUMBER = 2;
      private int itemId_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroDressUse_3022 DEFAULT_INSTANCE = new S2C_HeroDressUse_3022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroDressUse_3022> PARSER = new AbstractParser<S2C_HeroDressUse_3022>() {
         public S2C_HeroDressUse_3022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroDressUse_3022(input, extensionRegistry);
         }
      };

      private S2C_HeroDressUse_3022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroDressUse_3022() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroDressUse_3022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroDressUse_3022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_HeroDressUse_3022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_HeroDressUse_3022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroDressUse_3022.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemId() {
         return this.itemId_;
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
         } else if (!this.hasItemId()) {
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
            output.writeInt32(2, this.itemId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.itemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroDressUse_3022)) {
            return super.equals(obj);
         } else {
            S2C_HeroDressUse_3022 other = (S2C_HeroDressUse_3022)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
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

            if (this.hasItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroDressUse_3022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroDressUse_3022)PARSER.parseFrom(data);
      }

      public static S2C_HeroDressUse_3022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroDressUse_3022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroDressUse_3022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroDressUse_3022)PARSER.parseFrom(data);
      }

      public static S2C_HeroDressUse_3022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroDressUse_3022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroDressUse_3022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroDressUse_3022)PARSER.parseFrom(data);
      }

      public static S2C_HeroDressUse_3022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroDressUse_3022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroDressUse_3022 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroDressUse_3022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroDressUse_3022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroDressUse_3022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroDressUse_3022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroDressUse_3022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroDressUse_3022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroDressUse_3022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroDressUse_3022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroDressUse_3022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroDressUse_3022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroDressUse_3022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroDressUse_3022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroDressUse_3022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroDressUse_3022> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroDressUse_3022> getParserForType() {
         return PARSER;
      }

      public S2C_HeroDressUse_3022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroDressUse_3022OrBuilder {
         private int bitField0_;
         private int result_;
         private int itemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_HeroDressUse_3022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_HeroDressUse_3022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroDressUse_3022.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_HeroDressUse_3022.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.itemId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_HeroDressUse_3022_descriptor;
         }

         public S2C_HeroDressUse_3022 getDefaultInstanceForType() {
            return BagMsg.S2C_HeroDressUse_3022.getDefaultInstance();
         }

         public S2C_HeroDressUse_3022 build() {
            S2C_HeroDressUse_3022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroDressUse_3022 buildPartial() {
            S2C_HeroDressUse_3022 result = new S2C_HeroDressUse_3022(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemId_ = this.itemId_;
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
            if (other instanceof S2C_HeroDressUse_3022) {
               return this.mergeFrom((S2C_HeroDressUse_3022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroDressUse_3022 other) {
            if (other == BagMsg.S2C_HeroDressUse_3022.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
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
               return this.hasItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroDressUse_3022 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroDressUse_3022)BagMsg.S2C_HeroDressUse_3022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroDressUse_3022)e.getUnfinishedMessage();
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

         public boolean hasItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 2;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -3;
            this.itemId_ = 0;
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

   public static final class C2S_ComposeRandomItem_3023 extends GeneratedMessageV3 implements C2S_ComposeRandomItem_3023OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_ComposeRandomItem_3023 DEFAULT_INSTANCE = new C2S_ComposeRandomItem_3023();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ComposeRandomItem_3023> PARSER = new AbstractParser<C2S_ComposeRandomItem_3023>() {
         public C2S_ComposeRandomItem_3023 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ComposeRandomItem_3023(input, extensionRegistry);
         }
      };

      private C2S_ComposeRandomItem_3023(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ComposeRandomItem_3023() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ComposeRandomItem_3023();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ComposeRandomItem_3023(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ComposeRandomItem_3023_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ComposeRandomItem_3023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ComposeRandomItem_3023.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else if (!this.hasCode()) {
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
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
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
         } else if (!(obj instanceof C2S_ComposeRandomItem_3023)) {
            return super.equals(obj);
         } else {
            C2S_ComposeRandomItem_3023 other = (C2S_ComposeRandomItem_3023)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
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

      public static C2S_ComposeRandomItem_3023 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ComposeRandomItem_3023)PARSER.parseFrom(data);
      }

      public static C2S_ComposeRandomItem_3023 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeRandomItem_3023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeRandomItem_3023 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ComposeRandomItem_3023)PARSER.parseFrom(data);
      }

      public static C2S_ComposeRandomItem_3023 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeRandomItem_3023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeRandomItem_3023 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ComposeRandomItem_3023)PARSER.parseFrom(data);
      }

      public static C2S_ComposeRandomItem_3023 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeRandomItem_3023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeRandomItem_3023 parseFrom(InputStream input) throws IOException {
         return (C2S_ComposeRandomItem_3023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ComposeRandomItem_3023 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeRandomItem_3023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ComposeRandomItem_3023 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ComposeRandomItem_3023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ComposeRandomItem_3023 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeRandomItem_3023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ComposeRandomItem_3023 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ComposeRandomItem_3023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ComposeRandomItem_3023 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeRandomItem_3023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ComposeRandomItem_3023 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ComposeRandomItem_3023 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ComposeRandomItem_3023> parser() {
         return PARSER;
      }

      public Parser<C2S_ComposeRandomItem_3023> getParserForType() {
         return PARSER;
      }

      public C2S_ComposeRandomItem_3023 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ComposeRandomItem_3023OrBuilder {
         private int bitField0_;
         private int code_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ComposeRandomItem_3023_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ComposeRandomItem_3023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ComposeRandomItem_3023.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_ComposeRandomItem_3023.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ComposeRandomItem_3023_descriptor;
         }

         public C2S_ComposeRandomItem_3023 getDefaultInstanceForType() {
            return BagMsg.C2S_ComposeRandomItem_3023.getDefaultInstance();
         }

         public C2S_ComposeRandomItem_3023 build() {
            C2S_ComposeRandomItem_3023 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ComposeRandomItem_3023 buildPartial() {
            C2S_ComposeRandomItem_3023 result = new C2S_ComposeRandomItem_3023(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_ComposeRandomItem_3023) {
               return this.mergeFrom((C2S_ComposeRandomItem_3023)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ComposeRandomItem_3023 other) {
            if (other == BagMsg.C2S_ComposeRandomItem_3023.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ComposeRandomItem_3023 parsedMessage = null;

            try {
               parsedMessage = (C2S_ComposeRandomItem_3023)BagMsg.C2S_ComposeRandomItem_3023.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ComposeRandomItem_3023)e.getUnfinishedMessage();
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

   public static final class S2C_ComposeRandomItem_3024 extends GeneratedMessageV3 implements S2C_ComposeRandomItem_3024OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ComposeRandomItem_3024 DEFAULT_INSTANCE = new S2C_ComposeRandomItem_3024();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ComposeRandomItem_3024> PARSER = new AbstractParser<S2C_ComposeRandomItem_3024>() {
         public S2C_ComposeRandomItem_3024 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ComposeRandomItem_3024(input, extensionRegistry);
         }
      };

      private S2C_ComposeRandomItem_3024(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ComposeRandomItem_3024() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ComposeRandomItem_3024();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ComposeRandomItem_3024(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ComposeRandomItem_3024_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ComposeRandomItem_3024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ComposeRandomItem_3024.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ComposeRandomItem_3024)) {
            return super.equals(obj);
         } else {
            S2C_ComposeRandomItem_3024 other = (S2C_ComposeRandomItem_3024)obj;
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

      public static S2C_ComposeRandomItem_3024 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ComposeRandomItem_3024)PARSER.parseFrom(data);
      }

      public static S2C_ComposeRandomItem_3024 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeRandomItem_3024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeRandomItem_3024 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ComposeRandomItem_3024)PARSER.parseFrom(data);
      }

      public static S2C_ComposeRandomItem_3024 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeRandomItem_3024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeRandomItem_3024 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ComposeRandomItem_3024)PARSER.parseFrom(data);
      }

      public static S2C_ComposeRandomItem_3024 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeRandomItem_3024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeRandomItem_3024 parseFrom(InputStream input) throws IOException {
         return (S2C_ComposeRandomItem_3024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ComposeRandomItem_3024 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeRandomItem_3024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ComposeRandomItem_3024 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ComposeRandomItem_3024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ComposeRandomItem_3024 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeRandomItem_3024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ComposeRandomItem_3024 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ComposeRandomItem_3024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ComposeRandomItem_3024 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeRandomItem_3024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ComposeRandomItem_3024 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ComposeRandomItem_3024 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ComposeRandomItem_3024> parser() {
         return PARSER;
      }

      public Parser<S2C_ComposeRandomItem_3024> getParserForType() {
         return PARSER;
      }

      public S2C_ComposeRandomItem_3024 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ComposeRandomItem_3024OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ComposeRandomItem_3024_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ComposeRandomItem_3024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ComposeRandomItem_3024.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_ComposeRandomItem_3024.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ComposeRandomItem_3024_descriptor;
         }

         public S2C_ComposeRandomItem_3024 getDefaultInstanceForType() {
            return BagMsg.S2C_ComposeRandomItem_3024.getDefaultInstance();
         }

         public S2C_ComposeRandomItem_3024 build() {
            S2C_ComposeRandomItem_3024 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ComposeRandomItem_3024 buildPartial() {
            S2C_ComposeRandomItem_3024 result = new S2C_ComposeRandomItem_3024(this);
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
            if (other instanceof S2C_ComposeRandomItem_3024) {
               return this.mergeFrom((S2C_ComposeRandomItem_3024)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ComposeRandomItem_3024 other) {
            if (other == BagMsg.S2C_ComposeRandomItem_3024.getDefaultInstance()) {
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
            S2C_ComposeRandomItem_3024 parsedMessage = null;

            try {
               parsedMessage = (S2C_ComposeRandomItem_3024)BagMsg.S2C_ComposeRandomItem_3024.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ComposeRandomItem_3024)e.getUnfinishedMessage();
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

   public static final class C2S_MultiSelect_3025 extends GeneratedMessageV3 implements C2S_MultiSelect_3025OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ID_FIELD_NUMBER = 2;
      private Internal.IntList id_;
      private byte memoizedIsInitialized;
      private static final C2S_MultiSelect_3025 DEFAULT_INSTANCE = new C2S_MultiSelect_3025();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MultiSelect_3025> PARSER = new AbstractParser<C2S_MultiSelect_3025>() {
         public C2S_MultiSelect_3025 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MultiSelect_3025(input, extensionRegistry);
         }
      };

      private C2S_MultiSelect_3025(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MultiSelect_3025() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MultiSelect_3025();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MultiSelect_3025(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.id_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.id_.addInt(input.readInt32());
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
                  this.id_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_MultiSelect_3025_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_MultiSelect_3025_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MultiSelect_3025.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
            output.writeInt32(1, this.code_);
         }

         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(2, this.id_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MultiSelect_3025)) {
            return super.equals(obj);
         } else {
            C2S_MultiSelect_3025 other = (C2S_MultiSelect_3025)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (!this.getIdList().equals(other.getIdList())) {
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

            if (this.getIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MultiSelect_3025 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MultiSelect_3025)PARSER.parseFrom(data);
      }

      public static C2S_MultiSelect_3025 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MultiSelect_3025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MultiSelect_3025 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MultiSelect_3025)PARSER.parseFrom(data);
      }

      public static C2S_MultiSelect_3025 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MultiSelect_3025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MultiSelect_3025 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MultiSelect_3025)PARSER.parseFrom(data);
      }

      public static C2S_MultiSelect_3025 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MultiSelect_3025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MultiSelect_3025 parseFrom(InputStream input) throws IOException {
         return (C2S_MultiSelect_3025)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MultiSelect_3025 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MultiSelect_3025)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MultiSelect_3025 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MultiSelect_3025)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MultiSelect_3025 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MultiSelect_3025)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MultiSelect_3025 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MultiSelect_3025)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MultiSelect_3025 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MultiSelect_3025)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MultiSelect_3025 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MultiSelect_3025 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MultiSelect_3025> parser() {
         return PARSER;
      }

      public Parser<C2S_MultiSelect_3025> getParserForType() {
         return PARSER;
      }

      public C2S_MultiSelect_3025 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MultiSelect_3025OrBuilder {
         private int bitField0_;
         private int code_;
         private Internal.IntList id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_MultiSelect_3025_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_MultiSelect_3025_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MultiSelect_3025.class, Builder.class);
         }

         private Builder() {
            this.id_ = BagMsg.C2S_MultiSelect_3025.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = BagMsg.C2S_MultiSelect_3025.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_MultiSelect_3025.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.id_ = BagMsg.C2S_MultiSelect_3025.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_MultiSelect_3025_descriptor;
         }

         public C2S_MultiSelect_3025 getDefaultInstanceForType() {
            return BagMsg.C2S_MultiSelect_3025.getDefaultInstance();
         }

         public C2S_MultiSelect_3025 build() {
            C2S_MultiSelect_3025 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MultiSelect_3025 buildPartial() {
            C2S_MultiSelect_3025 result = new C2S_MultiSelect_3025(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.id_ = this.id_;
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
            if (other instanceof C2S_MultiSelect_3025) {
               return this.mergeFrom((C2S_MultiSelect_3025)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MultiSelect_3025 other) {
            if (other == BagMsg.C2S_MultiSelect_3025.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
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

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MultiSelect_3025 parsedMessage = null;

            try {
               parsedMessage = (C2S_MultiSelect_3025)BagMsg.C2S_MultiSelect_3025.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MultiSelect_3025)e.getUnfinishedMessage();
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

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.id_ = BagMsg.C2S_MultiSelect_3025.mutableCopy(this.id_);
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
            this.id_ = BagMsg.C2S_MultiSelect_3025.emptyIntList();
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

   public static final class S2C_MultiSelect_3026 extends GeneratedMessageV3 implements S2C_MultiSelect_3026OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_MultiSelect_3026 DEFAULT_INSTANCE = new S2C_MultiSelect_3026();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MultiSelect_3026> PARSER = new AbstractParser<S2C_MultiSelect_3026>() {
         public S2C_MultiSelect_3026 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MultiSelect_3026(input, extensionRegistry);
         }
      };

      private S2C_MultiSelect_3026(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MultiSelect_3026() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MultiSelect_3026();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MultiSelect_3026(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_MultiSelect_3026_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_MultiSelect_3026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MultiSelect_3026.class, Builder.class);
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
         } else if (!(obj instanceof S2C_MultiSelect_3026)) {
            return super.equals(obj);
         } else {
            S2C_MultiSelect_3026 other = (S2C_MultiSelect_3026)obj;
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

      public static S2C_MultiSelect_3026 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MultiSelect_3026)PARSER.parseFrom(data);
      }

      public static S2C_MultiSelect_3026 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MultiSelect_3026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MultiSelect_3026 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MultiSelect_3026)PARSER.parseFrom(data);
      }

      public static S2C_MultiSelect_3026 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MultiSelect_3026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MultiSelect_3026 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MultiSelect_3026)PARSER.parseFrom(data);
      }

      public static S2C_MultiSelect_3026 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MultiSelect_3026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MultiSelect_3026 parseFrom(InputStream input) throws IOException {
         return (S2C_MultiSelect_3026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MultiSelect_3026 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MultiSelect_3026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MultiSelect_3026 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MultiSelect_3026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MultiSelect_3026 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MultiSelect_3026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MultiSelect_3026 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MultiSelect_3026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MultiSelect_3026 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MultiSelect_3026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MultiSelect_3026 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MultiSelect_3026 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MultiSelect_3026> parser() {
         return PARSER;
      }

      public Parser<S2C_MultiSelect_3026> getParserForType() {
         return PARSER;
      }

      public S2C_MultiSelect_3026 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MultiSelect_3026OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_MultiSelect_3026_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_MultiSelect_3026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MultiSelect_3026.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_MultiSelect_3026.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_MultiSelect_3026_descriptor;
         }

         public S2C_MultiSelect_3026 getDefaultInstanceForType() {
            return BagMsg.S2C_MultiSelect_3026.getDefaultInstance();
         }

         public S2C_MultiSelect_3026 build() {
            S2C_MultiSelect_3026 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MultiSelect_3026 buildPartial() {
            S2C_MultiSelect_3026 result = new S2C_MultiSelect_3026(this);
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
            if (other instanceof S2C_MultiSelect_3026) {
               return this.mergeFrom((S2C_MultiSelect_3026)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MultiSelect_3026 other) {
            if (other == BagMsg.S2C_MultiSelect_3026.getDefaultInstance()) {
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
            S2C_MultiSelect_3026 parsedMessage = null;

            try {
               parsedMessage = (S2C_MultiSelect_3026)BagMsg.S2C_MultiSelect_3026.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MultiSelect_3026)e.getUnfinishedMessage();
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

   public static final class C2S_EquipExtraCompose_3027 extends GeneratedMessageV3 implements C2S_EquipExtraCompose_3027OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMID_FIELD_NUMBER = 1;
      private int itemId_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_EquipExtraCompose_3027 DEFAULT_INSTANCE = new C2S_EquipExtraCompose_3027();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EquipExtraCompose_3027> PARSER = new AbstractParser<C2S_EquipExtraCompose_3027>() {
         public C2S_EquipExtraCompose_3027 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EquipExtraCompose_3027(input, extensionRegistry);
         }
      };

      private C2S_EquipExtraCompose_3027(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EquipExtraCompose_3027() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EquipExtraCompose_3027();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EquipExtraCompose_3027(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemId_ = input.readInt32();
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_EquipExtraCompose_3027_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_EquipExtraCompose_3027_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EquipExtraCompose_3027.class, Builder.class);
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemId() {
         return this.itemId_;
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
         } else if (!this.hasItemId()) {
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
            output.writeInt32(1, this.itemId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemId_);
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
         } else if (!(obj instanceof C2S_EquipExtraCompose_3027)) {
            return super.equals(obj);
         } else {
            C2S_EquipExtraCompose_3027 other = (C2S_EquipExtraCompose_3027)obj;
            if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
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
            if (this.hasItemId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemId();
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

      public static C2S_EquipExtraCompose_3027 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EquipExtraCompose_3027)PARSER.parseFrom(data);
      }

      public static C2S_EquipExtraCompose_3027 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EquipExtraCompose_3027)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EquipExtraCompose_3027 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EquipExtraCompose_3027)PARSER.parseFrom(data);
      }

      public static C2S_EquipExtraCompose_3027 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EquipExtraCompose_3027)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EquipExtraCompose_3027 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EquipExtraCompose_3027)PARSER.parseFrom(data);
      }

      public static C2S_EquipExtraCompose_3027 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EquipExtraCompose_3027)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EquipExtraCompose_3027 parseFrom(InputStream input) throws IOException {
         return (C2S_EquipExtraCompose_3027)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EquipExtraCompose_3027 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EquipExtraCompose_3027)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EquipExtraCompose_3027 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EquipExtraCompose_3027)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EquipExtraCompose_3027 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EquipExtraCompose_3027)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EquipExtraCompose_3027 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EquipExtraCompose_3027)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EquipExtraCompose_3027 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EquipExtraCompose_3027)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EquipExtraCompose_3027 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EquipExtraCompose_3027 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EquipExtraCompose_3027> parser() {
         return PARSER;
      }

      public Parser<C2S_EquipExtraCompose_3027> getParserForType() {
         return PARSER;
      }

      public C2S_EquipExtraCompose_3027 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EquipExtraCompose_3027OrBuilder {
         private int bitField0_;
         private int itemId_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_EquipExtraCompose_3027_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_EquipExtraCompose_3027_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EquipExtraCompose_3027.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_EquipExtraCompose_3027.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemId_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_EquipExtraCompose_3027_descriptor;
         }

         public C2S_EquipExtraCompose_3027 getDefaultInstanceForType() {
            return BagMsg.C2S_EquipExtraCompose_3027.getDefaultInstance();
         }

         public C2S_EquipExtraCompose_3027 build() {
            C2S_EquipExtraCompose_3027 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EquipExtraCompose_3027 buildPartial() {
            C2S_EquipExtraCompose_3027 result = new C2S_EquipExtraCompose_3027(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemId_ = this.itemId_;
               to_bitField0_ |= 1;
            }

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
            if (other instanceof C2S_EquipExtraCompose_3027) {
               return this.mergeFrom((C2S_EquipExtraCompose_3027)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EquipExtraCompose_3027 other) {
            if (other == BagMsg.C2S_EquipExtraCompose_3027.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
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
            if (!this.hasItemId()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EquipExtraCompose_3027 parsedMessage = null;

            try {
               parsedMessage = (C2S_EquipExtraCompose_3027)BagMsg.C2S_EquipExtraCompose_3027.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EquipExtraCompose_3027)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 1;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -2;
            this.itemId_ = 0;
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

   public static final class S2C_EquipExtraCompose_3028 extends GeneratedMessageV3 implements S2C_EquipExtraCompose_3028OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_EquipExtraCompose_3028 DEFAULT_INSTANCE = new S2C_EquipExtraCompose_3028();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EquipExtraCompose_3028> PARSER = new AbstractParser<S2C_EquipExtraCompose_3028>() {
         public S2C_EquipExtraCompose_3028 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EquipExtraCompose_3028(input, extensionRegistry);
         }
      };

      private S2C_EquipExtraCompose_3028(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EquipExtraCompose_3028() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EquipExtraCompose_3028();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EquipExtraCompose_3028(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_EquipExtraCompose_3028_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_EquipExtraCompose_3028_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EquipExtraCompose_3028.class, Builder.class);
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
         } else if (!(obj instanceof S2C_EquipExtraCompose_3028)) {
            return super.equals(obj);
         } else {
            S2C_EquipExtraCompose_3028 other = (S2C_EquipExtraCompose_3028)obj;
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

      public static S2C_EquipExtraCompose_3028 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EquipExtraCompose_3028)PARSER.parseFrom(data);
      }

      public static S2C_EquipExtraCompose_3028 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EquipExtraCompose_3028)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EquipExtraCompose_3028 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EquipExtraCompose_3028)PARSER.parseFrom(data);
      }

      public static S2C_EquipExtraCompose_3028 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EquipExtraCompose_3028)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EquipExtraCompose_3028 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EquipExtraCompose_3028)PARSER.parseFrom(data);
      }

      public static S2C_EquipExtraCompose_3028 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EquipExtraCompose_3028)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EquipExtraCompose_3028 parseFrom(InputStream input) throws IOException {
         return (S2C_EquipExtraCompose_3028)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EquipExtraCompose_3028 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EquipExtraCompose_3028)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EquipExtraCompose_3028 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EquipExtraCompose_3028)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EquipExtraCompose_3028 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EquipExtraCompose_3028)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EquipExtraCompose_3028 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EquipExtraCompose_3028)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EquipExtraCompose_3028 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EquipExtraCompose_3028)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EquipExtraCompose_3028 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EquipExtraCompose_3028 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EquipExtraCompose_3028> parser() {
         return PARSER;
      }

      public Parser<S2C_EquipExtraCompose_3028> getParserForType() {
         return PARSER;
      }

      public S2C_EquipExtraCompose_3028 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EquipExtraCompose_3028OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_EquipExtraCompose_3028_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_EquipExtraCompose_3028_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EquipExtraCompose_3028.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_EquipExtraCompose_3028.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_EquipExtraCompose_3028_descriptor;
         }

         public S2C_EquipExtraCompose_3028 getDefaultInstanceForType() {
            return BagMsg.S2C_EquipExtraCompose_3028.getDefaultInstance();
         }

         public S2C_EquipExtraCompose_3028 build() {
            S2C_EquipExtraCompose_3028 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EquipExtraCompose_3028 buildPartial() {
            S2C_EquipExtraCompose_3028 result = new S2C_EquipExtraCompose_3028(this);
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
            if (other instanceof S2C_EquipExtraCompose_3028) {
               return this.mergeFrom((S2C_EquipExtraCompose_3028)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EquipExtraCompose_3028 other) {
            if (other == BagMsg.S2C_EquipExtraCompose_3028.getDefaultInstance()) {
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
            S2C_EquipExtraCompose_3028 parsedMessage = null;

            try {
               parsedMessage = (S2C_EquipExtraCompose_3028)BagMsg.S2C_EquipExtraCompose_3028.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EquipExtraCompose_3028)e.getUnfinishedMessage();
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

   public static final class C2S_ReqItemInfo_3029 extends GeneratedMessageV3 implements C2S_ReqItemInfo_3029OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMID_FIELD_NUMBER = 1;
      private Internal.IntList itemId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReqItemInfo_3029 DEFAULT_INSTANCE = new C2S_ReqItemInfo_3029();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReqItemInfo_3029> PARSER = new AbstractParser<C2S_ReqItemInfo_3029>() {
         public C2S_ReqItemInfo_3029 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReqItemInfo_3029(input, extensionRegistry);
         }
      };

      private C2S_ReqItemInfo_3029(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReqItemInfo_3029() {
         this.memoizedIsInitialized = -1;
         this.itemId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReqItemInfo_3029();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReqItemInfo_3029(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.itemId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.itemId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.itemId_.addInt(input.readInt32());
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
                  this.itemId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ReqItemInfo_3029_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ReqItemInfo_3029_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReqItemInfo_3029.class, Builder.class);
      }

      public List<Integer> getItemIdList() {
         return this.itemId_;
      }

      public int getItemIdCount() {
         return this.itemId_.size();
      }

      public int getItemId(int index) {
         return this.itemId_.getInt(index);
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
         for(int i = 0; i < this.itemId_.size(); ++i) {
            output.writeInt32(1, this.itemId_.getInt(i));
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

            for(int i = 0; i < this.itemId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.itemId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getItemIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReqItemInfo_3029)) {
            return super.equals(obj);
         } else {
            C2S_ReqItemInfo_3029 other = (C2S_ReqItemInfo_3029)obj;
            if (!this.getItemIdList().equals(other.getItemIdList())) {
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
            if (this.getItemIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReqItemInfo_3029 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReqItemInfo_3029)PARSER.parseFrom(data);
      }

      public static C2S_ReqItemInfo_3029 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReqItemInfo_3029)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReqItemInfo_3029 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReqItemInfo_3029)PARSER.parseFrom(data);
      }

      public static C2S_ReqItemInfo_3029 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReqItemInfo_3029)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReqItemInfo_3029 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReqItemInfo_3029)PARSER.parseFrom(data);
      }

      public static C2S_ReqItemInfo_3029 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReqItemInfo_3029)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReqItemInfo_3029 parseFrom(InputStream input) throws IOException {
         return (C2S_ReqItemInfo_3029)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReqItemInfo_3029 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReqItemInfo_3029)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReqItemInfo_3029 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReqItemInfo_3029)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReqItemInfo_3029 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReqItemInfo_3029)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReqItemInfo_3029 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReqItemInfo_3029)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReqItemInfo_3029 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReqItemInfo_3029)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReqItemInfo_3029 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReqItemInfo_3029 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReqItemInfo_3029> parser() {
         return PARSER;
      }

      public Parser<C2S_ReqItemInfo_3029> getParserForType() {
         return PARSER;
      }

      public C2S_ReqItemInfo_3029 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReqItemInfo_3029OrBuilder {
         private int bitField0_;
         private Internal.IntList itemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ReqItemInfo_3029_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ReqItemInfo_3029_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReqItemInfo_3029.class, Builder.class);
         }

         private Builder() {
            this.itemId_ = BagMsg.C2S_ReqItemInfo_3029.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemId_ = BagMsg.C2S_ReqItemInfo_3029.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_ReqItemInfo_3029.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemId_ = BagMsg.C2S_ReqItemInfo_3029.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ReqItemInfo_3029_descriptor;
         }

         public C2S_ReqItemInfo_3029 getDefaultInstanceForType() {
            return BagMsg.C2S_ReqItemInfo_3029.getDefaultInstance();
         }

         public C2S_ReqItemInfo_3029 build() {
            C2S_ReqItemInfo_3029 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReqItemInfo_3029 buildPartial() {
            C2S_ReqItemInfo_3029 result = new C2S_ReqItemInfo_3029(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.itemId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.itemId_ = this.itemId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ReqItemInfo_3029) {
               return this.mergeFrom((C2S_ReqItemInfo_3029)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReqItemInfo_3029 other) {
            if (other == BagMsg.C2S_ReqItemInfo_3029.getDefaultInstance()) {
               return this;
            } else {
               if (!other.itemId_.isEmpty()) {
                  if (this.itemId_.isEmpty()) {
                     this.itemId_ = other.itemId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureItemIdIsMutable();
                     this.itemId_.addAll(other.itemId_);
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
            C2S_ReqItemInfo_3029 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReqItemInfo_3029)BagMsg.C2S_ReqItemInfo_3029.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReqItemInfo_3029)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.itemId_ = BagMsg.C2S_ReqItemInfo_3029.mutableCopy(this.itemId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getItemIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.itemId_) : this.itemId_);
         }

         public int getItemIdCount() {
            return this.itemId_.size();
         }

         public int getItemId(int index) {
            return this.itemId_.getInt(index);
         }

         public Builder setItemId(int index, int value) {
            this.ensureItemIdIsMutable();
            this.itemId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addItemId(int value) {
            this.ensureItemIdIsMutable();
            this.itemId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllItemId(Iterable<? extends Integer> values) {
            this.ensureItemIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemId_);
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.itemId_ = BagMsg.C2S_ReqItemInfo_3029.emptyIntList();
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

   public static final class C2S_CommonBuy_3031 extends GeneratedMessageV3 implements C2S_CommonBuy_3031OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMID_FIELD_NUMBER = 1;
      private int itemId_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      public static final int ISSHOWTIPS_FIELD_NUMBER = 3;
      private boolean isShowTips_;
      private byte memoizedIsInitialized;
      private static final C2S_CommonBuy_3031 DEFAULT_INSTANCE = new C2S_CommonBuy_3031();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommonBuy_3031> PARSER = new AbstractParser<C2S_CommonBuy_3031>() {
         public C2S_CommonBuy_3031 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommonBuy_3031(input, extensionRegistry);
         }
      };

      private C2S_CommonBuy_3031(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommonBuy_3031() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommonBuy_3031();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommonBuy_3031(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isShowTips_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_CommonBuy_3031_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_CommonBuy_3031_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommonBuy_3031.class, Builder.class);
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemId() {
         return this.itemId_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasIsShowTips() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsShowTips() {
         return this.isShowTips_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemId()) {
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
            output.writeInt32(1, this.itemId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isShowTips_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isShowTips_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CommonBuy_3031)) {
            return super.equals(obj);
         } else {
            C2S_CommonBuy_3031 other = (C2S_CommonBuy_3031)obj;
            if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasIsShowTips() != other.hasIsShowTips()) {
               return false;
            } else if (this.hasIsShowTips() && this.getIsShowTips() != other.getIsShowTips()) {
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
            if (this.hasItemId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasIsShowTips()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsShowTips());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CommonBuy_3031 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommonBuy_3031)PARSER.parseFrom(data);
      }

      public static C2S_CommonBuy_3031 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommonBuy_3031)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommonBuy_3031 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommonBuy_3031)PARSER.parseFrom(data);
      }

      public static C2S_CommonBuy_3031 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommonBuy_3031)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommonBuy_3031 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommonBuy_3031)PARSER.parseFrom(data);
      }

      public static C2S_CommonBuy_3031 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommonBuy_3031)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommonBuy_3031 parseFrom(InputStream input) throws IOException {
         return (C2S_CommonBuy_3031)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommonBuy_3031 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommonBuy_3031)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommonBuy_3031 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommonBuy_3031)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommonBuy_3031 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommonBuy_3031)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommonBuy_3031 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommonBuy_3031)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommonBuy_3031 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommonBuy_3031)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommonBuy_3031 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommonBuy_3031 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommonBuy_3031> parser() {
         return PARSER;
      }

      public Parser<C2S_CommonBuy_3031> getParserForType() {
         return PARSER;
      }

      public C2S_CommonBuy_3031 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommonBuy_3031OrBuilder {
         private int bitField0_;
         private int itemId_;
         private int num_;
         private boolean isShowTips_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_CommonBuy_3031_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_CommonBuy_3031_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommonBuy_3031.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_CommonBuy_3031.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemId_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            this.isShowTips_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_CommonBuy_3031_descriptor;
         }

         public C2S_CommonBuy_3031 getDefaultInstanceForType() {
            return BagMsg.C2S_CommonBuy_3031.getDefaultInstance();
         }

         public C2S_CommonBuy_3031 build() {
            C2S_CommonBuy_3031 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommonBuy_3031 buildPartial() {
            C2S_CommonBuy_3031 result = new C2S_CommonBuy_3031(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemId_ = this.itemId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isShowTips_ = this.isShowTips_;
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
            if (other instanceof C2S_CommonBuy_3031) {
               return this.mergeFrom((C2S_CommonBuy_3031)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommonBuy_3031 other) {
            if (other == BagMsg.C2S_CommonBuy_3031.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasIsShowTips()) {
                  this.setIsShowTips(other.getIsShowTips());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItemId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CommonBuy_3031 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommonBuy_3031)BagMsg.C2S_CommonBuy_3031.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommonBuy_3031)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 1;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -2;
            this.itemId_ = 0;
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

         public boolean hasIsShowTips() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsShowTips() {
            return this.isShowTips_;
         }

         public Builder setIsShowTips(boolean value) {
            this.bitField0_ |= 4;
            this.isShowTips_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsShowTips() {
            this.bitField0_ &= -5;
            this.isShowTips_ = false;
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

   public static final class S2C_CommonBuy_3032 extends GeneratedMessageV3 implements S2C_CommonBuy_3032OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMID_FIELD_NUMBER = 1;
      private int itemId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommonBuy_3032 DEFAULT_INSTANCE = new S2C_CommonBuy_3032();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommonBuy_3032> PARSER = new AbstractParser<S2C_CommonBuy_3032>() {
         public S2C_CommonBuy_3032 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommonBuy_3032(input, extensionRegistry);
         }
      };

      private S2C_CommonBuy_3032(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommonBuy_3032() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommonBuy_3032();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommonBuy_3032(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_CommonBuy_3032_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_CommonBuy_3032_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommonBuy_3032.class, Builder.class);
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemId() {
         return this.itemId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CommonBuy_3032)) {
            return super.equals(obj);
         } else {
            S2C_CommonBuy_3032 other = (S2C_CommonBuy_3032)obj;
            if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
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
            if (this.hasItemId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CommonBuy_3032 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommonBuy_3032)PARSER.parseFrom(data);
      }

      public static S2C_CommonBuy_3032 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommonBuy_3032)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommonBuy_3032 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommonBuy_3032)PARSER.parseFrom(data);
      }

      public static S2C_CommonBuy_3032 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommonBuy_3032)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommonBuy_3032 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommonBuy_3032)PARSER.parseFrom(data);
      }

      public static S2C_CommonBuy_3032 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommonBuy_3032)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommonBuy_3032 parseFrom(InputStream input) throws IOException {
         return (S2C_CommonBuy_3032)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommonBuy_3032 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommonBuy_3032)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommonBuy_3032 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommonBuy_3032)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommonBuy_3032 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommonBuy_3032)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommonBuy_3032 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommonBuy_3032)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommonBuy_3032 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommonBuy_3032)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommonBuy_3032 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommonBuy_3032 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommonBuy_3032> parser() {
         return PARSER;
      }

      public Parser<S2C_CommonBuy_3032> getParserForType() {
         return PARSER;
      }

      public S2C_CommonBuy_3032 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommonBuy_3032OrBuilder {
         private int bitField0_;
         private int itemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_CommonBuy_3032_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_CommonBuy_3032_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommonBuy_3032.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_CommonBuy_3032.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_CommonBuy_3032_descriptor;
         }

         public S2C_CommonBuy_3032 getDefaultInstanceForType() {
            return BagMsg.S2C_CommonBuy_3032.getDefaultInstance();
         }

         public S2C_CommonBuy_3032 build() {
            S2C_CommonBuy_3032 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommonBuy_3032 buildPartial() {
            S2C_CommonBuy_3032 result = new S2C_CommonBuy_3032(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemId_ = this.itemId_;
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
            if (other instanceof S2C_CommonBuy_3032) {
               return this.mergeFrom((S2C_CommonBuy_3032)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommonBuy_3032 other) {
            if (other == BagMsg.S2C_CommonBuy_3032.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasItemId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CommonBuy_3032 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommonBuy_3032)BagMsg.S2C_CommonBuy_3032.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommonBuy_3032)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 1;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -2;
            this.itemId_ = 0;
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

   public static final class C2S_ItemUseNum_3033 extends GeneratedMessageV3 implements C2S_ItemUseNum_3033OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ItemUseNum_3033 DEFAULT_INSTANCE = new C2S_ItemUseNum_3033();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ItemUseNum_3033> PARSER = new AbstractParser<C2S_ItemUseNum_3033>() {
         public C2S_ItemUseNum_3033 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ItemUseNum_3033(input, extensionRegistry);
         }
      };

      private C2S_ItemUseNum_3033(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ItemUseNum_3033() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ItemUseNum_3033();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ItemUseNum_3033(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemUseNum_3033_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemUseNum_3033_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemUseNum_3033.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ItemUseNum_3033)) {
            return super.equals(obj);
         } else {
            C2S_ItemUseNum_3033 other = (C2S_ItemUseNum_3033)obj;
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

      public static C2S_ItemUseNum_3033 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ItemUseNum_3033)PARSER.parseFrom(data);
      }

      public static C2S_ItemUseNum_3033 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemUseNum_3033)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemUseNum_3033 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ItemUseNum_3033)PARSER.parseFrom(data);
      }

      public static C2S_ItemUseNum_3033 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemUseNum_3033)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemUseNum_3033 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ItemUseNum_3033)PARSER.parseFrom(data);
      }

      public static C2S_ItemUseNum_3033 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemUseNum_3033)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemUseNum_3033 parseFrom(InputStream input) throws IOException {
         return (C2S_ItemUseNum_3033)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemUseNum_3033 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemUseNum_3033)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemUseNum_3033 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ItemUseNum_3033)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ItemUseNum_3033 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemUseNum_3033)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemUseNum_3033 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ItemUseNum_3033)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemUseNum_3033 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemUseNum_3033)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ItemUseNum_3033 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ItemUseNum_3033 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ItemUseNum_3033> parser() {
         return PARSER;
      }

      public Parser<C2S_ItemUseNum_3033> getParserForType() {
         return PARSER;
      }

      public C2S_ItemUseNum_3033 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ItemUseNum_3033OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemUseNum_3033_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemUseNum_3033_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemUseNum_3033.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_ItemUseNum_3033.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_ItemUseNum_3033_descriptor;
         }

         public C2S_ItemUseNum_3033 getDefaultInstanceForType() {
            return BagMsg.C2S_ItemUseNum_3033.getDefaultInstance();
         }

         public C2S_ItemUseNum_3033 build() {
            C2S_ItemUseNum_3033 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ItemUseNum_3033 buildPartial() {
            C2S_ItemUseNum_3033 result = new C2S_ItemUseNum_3033(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ItemUseNum_3033) {
               return this.mergeFrom((C2S_ItemUseNum_3033)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ItemUseNum_3033 other) {
            if (other == BagMsg.C2S_ItemUseNum_3033.getDefaultInstance()) {
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
            C2S_ItemUseNum_3033 parsedMessage = null;

            try {
               parsedMessage = (C2S_ItemUseNum_3033)BagMsg.C2S_ItemUseNum_3033.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ItemUseNum_3033)e.getUnfinishedMessage();
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

   public static final class S2C_ItemUseNum_3034 extends GeneratedMessageV3 implements S2C_ItemUseNum_3034OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int VALUES_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> values_;
      private byte memoizedIsInitialized;
      private static final S2C_ItemUseNum_3034 DEFAULT_INSTANCE = new S2C_ItemUseNum_3034();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ItemUseNum_3034> PARSER = new AbstractParser<S2C_ItemUseNum_3034>() {
         public S2C_ItemUseNum_3034 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ItemUseNum_3034(input, extensionRegistry);
         }
      };

      private S2C_ItemUseNum_3034(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ItemUseNum_3034() {
         this.memoizedIsInitialized = -1;
         this.values_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ItemUseNum_3034();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ItemUseNum_3034(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.values_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.values_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.values_ = Collections.unmodifiableList(this.values_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUseNum_3034_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUseNum_3034_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemUseNum_3034.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getValuesList() {
         return this.values_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getValuesOrBuilderList() {
         return this.values_;
      }

      public int getValuesCount() {
         return this.values_.size();
      }

      public CommonMsg.MapDataII getValues(int index) {
         return (CommonMsg.MapDataII)this.values_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getValuesOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.values_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getValuesCount(); ++i) {
               if (!this.getValues(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.values_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.values_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.values_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.values_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ItemUseNum_3034)) {
            return super.equals(obj);
         } else {
            S2C_ItemUseNum_3034 other = (S2C_ItemUseNum_3034)obj;
            if (!this.getValuesList().equals(other.getValuesList())) {
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
            if (this.getValuesCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getValuesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ItemUseNum_3034 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ItemUseNum_3034)PARSER.parseFrom(data);
      }

      public static S2C_ItemUseNum_3034 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemUseNum_3034)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemUseNum_3034 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ItemUseNum_3034)PARSER.parseFrom(data);
      }

      public static S2C_ItemUseNum_3034 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemUseNum_3034)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemUseNum_3034 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ItemUseNum_3034)PARSER.parseFrom(data);
      }

      public static S2C_ItemUseNum_3034 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemUseNum_3034)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemUseNum_3034 parseFrom(InputStream input) throws IOException {
         return (S2C_ItemUseNum_3034)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemUseNum_3034 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemUseNum_3034)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemUseNum_3034 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ItemUseNum_3034)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ItemUseNum_3034 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemUseNum_3034)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemUseNum_3034 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ItemUseNum_3034)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemUseNum_3034 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemUseNum_3034)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ItemUseNum_3034 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ItemUseNum_3034 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ItemUseNum_3034> parser() {
         return PARSER;
      }

      public Parser<S2C_ItemUseNum_3034> getParserForType() {
         return PARSER;
      }

      public S2C_ItemUseNum_3034 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ItemUseNum_3034OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> values_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> valuesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUseNum_3034_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUseNum_3034_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemUseNum_3034.class, Builder.class);
         }

         private Builder() {
            this.values_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.values_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_ItemUseNum_3034.alwaysUseFieldBuilders) {
               this.getValuesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.valuesBuilder_ == null) {
               this.values_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.valuesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_ItemUseNum_3034_descriptor;
         }

         public S2C_ItemUseNum_3034 getDefaultInstanceForType() {
            return BagMsg.S2C_ItemUseNum_3034.getDefaultInstance();
         }

         public S2C_ItemUseNum_3034 build() {
            S2C_ItemUseNum_3034 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ItemUseNum_3034 buildPartial() {
            S2C_ItemUseNum_3034 result = new S2C_ItemUseNum_3034(this);
            int from_bitField0_ = this.bitField0_;
            if (this.valuesBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.values_ = Collections.unmodifiableList(this.values_);
                  this.bitField0_ &= -2;
               }

               result.values_ = this.values_;
            } else {
               result.values_ = this.valuesBuilder_.build();
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
            if (other instanceof S2C_ItemUseNum_3034) {
               return this.mergeFrom((S2C_ItemUseNum_3034)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ItemUseNum_3034 other) {
            if (other == BagMsg.S2C_ItemUseNum_3034.getDefaultInstance()) {
               return this;
            } else {
               if (this.valuesBuilder_ == null) {
                  if (!other.values_.isEmpty()) {
                     if (this.values_.isEmpty()) {
                        this.values_ = other.values_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureValuesIsMutable();
                        this.values_.addAll(other.values_);
                     }

                     this.onChanged();
                  }
               } else if (!other.values_.isEmpty()) {
                  if (this.valuesBuilder_.isEmpty()) {
                     this.valuesBuilder_.dispose();
                     this.valuesBuilder_ = null;
                     this.values_ = other.values_;
                     this.bitField0_ &= -2;
                     this.valuesBuilder_ = BagMsg.S2C_ItemUseNum_3034.alwaysUseFieldBuilders ? this.getValuesFieldBuilder() : null;
                  } else {
                     this.valuesBuilder_.addAllMessages(other.values_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getValuesCount(); ++i) {
               if (!this.getValues(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ItemUseNum_3034 parsedMessage = null;

            try {
               parsedMessage = (S2C_ItemUseNum_3034)BagMsg.S2C_ItemUseNum_3034.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ItemUseNum_3034)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureValuesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.values_ = new ArrayList(this.values_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getValuesList() {
            return this.valuesBuilder_ == null ? Collections.unmodifiableList(this.values_) : this.valuesBuilder_.getMessageList();
         }

         public int getValuesCount() {
            return this.valuesBuilder_ == null ? this.values_.size() : this.valuesBuilder_.getCount();
         }

         public CommonMsg.MapDataII getValues(int index) {
            return this.valuesBuilder_ == null ? (CommonMsg.MapDataII)this.values_.get(index) : (CommonMsg.MapDataII)this.valuesBuilder_.getMessage(index);
         }

         public Builder setValues(int index, CommonMsg.MapDataII value) {
            if (this.valuesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureValuesIsMutable();
               this.values_.set(index, value);
               this.onChanged();
            } else {
               this.valuesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setValues(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.valuesBuilder_ == null) {
               this.ensureValuesIsMutable();
               this.values_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.valuesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addValues(CommonMsg.MapDataII value) {
            if (this.valuesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureValuesIsMutable();
               this.values_.add(value);
               this.onChanged();
            } else {
               this.valuesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addValues(int index, CommonMsg.MapDataII value) {
            if (this.valuesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureValuesIsMutable();
               this.values_.add(index, value);
               this.onChanged();
            } else {
               this.valuesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addValues(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.valuesBuilder_ == null) {
               this.ensureValuesIsMutable();
               this.values_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.valuesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addValues(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.valuesBuilder_ == null) {
               this.ensureValuesIsMutable();
               this.values_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.valuesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllValues(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.valuesBuilder_ == null) {
               this.ensureValuesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.values_);
               this.onChanged();
            } else {
               this.valuesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearValues() {
            if (this.valuesBuilder_ == null) {
               this.values_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.valuesBuilder_.clear();
            }

            return this;
         }

         public Builder removeValues(int index) {
            if (this.valuesBuilder_ == null) {
               this.ensureValuesIsMutable();
               this.values_.remove(index);
               this.onChanged();
            } else {
               this.valuesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getValuesBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getValuesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getValuesOrBuilder(int index) {
            return this.valuesBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.values_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.valuesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getValuesOrBuilderList() {
            return this.valuesBuilder_ != null ? this.valuesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.values_);
         }

         public CommonMsg.MapDataII.Builder addValuesBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getValuesFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addValuesBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getValuesFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getValuesBuilderList() {
            return this.getValuesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getValuesFieldBuilder() {
            if (this.valuesBuilder_ == null) {
               this.valuesBuilder_ = new RepeatedFieldBuilderV3(this.values_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.values_ = null;
            }

            return this.valuesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OneKeyItemCompose_3035 extends GeneratedMessageV3 implements C2S_OneKeyItemCompose_3035OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OneKeyItemCompose_3035 DEFAULT_INSTANCE = new C2S_OneKeyItemCompose_3035();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OneKeyItemCompose_3035> PARSER = new AbstractParser<C2S_OneKeyItemCompose_3035>() {
         public C2S_OneKeyItemCompose_3035 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OneKeyItemCompose_3035(input, extensionRegistry);
         }
      };

      private C2S_OneKeyItemCompose_3035(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OneKeyItemCompose_3035() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OneKeyItemCompose_3035();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OneKeyItemCompose_3035(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OneKeyItemCompose_3035_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OneKeyItemCompose_3035_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyItemCompose_3035.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OneKeyItemCompose_3035)) {
            return super.equals(obj);
         } else {
            C2S_OneKeyItemCompose_3035 other = (C2S_OneKeyItemCompose_3035)obj;
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

      public static C2S_OneKeyItemCompose_3035 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyItemCompose_3035)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyItemCompose_3035 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyItemCompose_3035)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyItemCompose_3035 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyItemCompose_3035)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyItemCompose_3035 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyItemCompose_3035)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyItemCompose_3035 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyItemCompose_3035)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyItemCompose_3035 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyItemCompose_3035)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyItemCompose_3035 parseFrom(InputStream input) throws IOException {
         return (C2S_OneKeyItemCompose_3035)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyItemCompose_3035 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyItemCompose_3035)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyItemCompose_3035 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OneKeyItemCompose_3035)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OneKeyItemCompose_3035 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyItemCompose_3035)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyItemCompose_3035 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OneKeyItemCompose_3035)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyItemCompose_3035 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyItemCompose_3035)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OneKeyItemCompose_3035 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OneKeyItemCompose_3035 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OneKeyItemCompose_3035> parser() {
         return PARSER;
      }

      public Parser<C2S_OneKeyItemCompose_3035> getParserForType() {
         return PARSER;
      }

      public C2S_OneKeyItemCompose_3035 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OneKeyItemCompose_3035OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OneKeyItemCompose_3035_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OneKeyItemCompose_3035_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyItemCompose_3035.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_OneKeyItemCompose_3035.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OneKeyItemCompose_3035_descriptor;
         }

         public C2S_OneKeyItemCompose_3035 getDefaultInstanceForType() {
            return BagMsg.C2S_OneKeyItemCompose_3035.getDefaultInstance();
         }

         public C2S_OneKeyItemCompose_3035 build() {
            C2S_OneKeyItemCompose_3035 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OneKeyItemCompose_3035 buildPartial() {
            C2S_OneKeyItemCompose_3035 result = new C2S_OneKeyItemCompose_3035(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OneKeyItemCompose_3035) {
               return this.mergeFrom((C2S_OneKeyItemCompose_3035)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OneKeyItemCompose_3035 other) {
            if (other == BagMsg.C2S_OneKeyItemCompose_3035.getDefaultInstance()) {
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
            C2S_OneKeyItemCompose_3035 parsedMessage = null;

            try {
               parsedMessage = (C2S_OneKeyItemCompose_3035)BagMsg.C2S_OneKeyItemCompose_3035.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OneKeyItemCompose_3035)e.getUnfinishedMessage();
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

   public static final class S2C_OneKeyItemCompose_3036 extends GeneratedMessageV3 implements S2C_OneKeyItemCompose_3036OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_OneKeyItemCompose_3036 DEFAULT_INSTANCE = new S2C_OneKeyItemCompose_3036();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OneKeyItemCompose_3036> PARSER = new AbstractParser<S2C_OneKeyItemCompose_3036>() {
         public S2C_OneKeyItemCompose_3036 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OneKeyItemCompose_3036(input, extensionRegistry);
         }
      };

      private S2C_OneKeyItemCompose_3036(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OneKeyItemCompose_3036() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OneKeyItemCompose_3036();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OneKeyItemCompose_3036(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OneKeyItemCompose_3036_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OneKeyItemCompose_3036_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyItemCompose_3036.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OneKeyItemCompose_3036)) {
            return super.equals(obj);
         } else {
            S2C_OneKeyItemCompose_3036 other = (S2C_OneKeyItemCompose_3036)obj;
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

      public static S2C_OneKeyItemCompose_3036 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyItemCompose_3036)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyItemCompose_3036 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyItemCompose_3036)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyItemCompose_3036 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyItemCompose_3036)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyItemCompose_3036 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyItemCompose_3036)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyItemCompose_3036 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyItemCompose_3036)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyItemCompose_3036 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyItemCompose_3036)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyItemCompose_3036 parseFrom(InputStream input) throws IOException {
         return (S2C_OneKeyItemCompose_3036)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyItemCompose_3036 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyItemCompose_3036)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyItemCompose_3036 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OneKeyItemCompose_3036)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OneKeyItemCompose_3036 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyItemCompose_3036)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyItemCompose_3036 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OneKeyItemCompose_3036)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyItemCompose_3036 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyItemCompose_3036)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OneKeyItemCompose_3036 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OneKeyItemCompose_3036 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OneKeyItemCompose_3036> parser() {
         return PARSER;
      }

      public Parser<S2C_OneKeyItemCompose_3036> getParserForType() {
         return PARSER;
      }

      public S2C_OneKeyItemCompose_3036 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OneKeyItemCompose_3036OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OneKeyItemCompose_3036_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OneKeyItemCompose_3036_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyItemCompose_3036.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_OneKeyItemCompose_3036.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OneKeyItemCompose_3036_descriptor;
         }

         public S2C_OneKeyItemCompose_3036 getDefaultInstanceForType() {
            return BagMsg.S2C_OneKeyItemCompose_3036.getDefaultInstance();
         }

         public S2C_OneKeyItemCompose_3036 build() {
            S2C_OneKeyItemCompose_3036 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OneKeyItemCompose_3036 buildPartial() {
            S2C_OneKeyItemCompose_3036 result = new S2C_OneKeyItemCompose_3036(this);
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
            if (other instanceof S2C_OneKeyItemCompose_3036) {
               return this.mergeFrom((S2C_OneKeyItemCompose_3036)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OneKeyItemCompose_3036 other) {
            if (other == BagMsg.S2C_OneKeyItemCompose_3036.getDefaultInstance()) {
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
            S2C_OneKeyItemCompose_3036 parsedMessage = null;

            try {
               parsedMessage = (S2C_OneKeyItemCompose_3036)BagMsg.S2C_OneKeyItemCompose_3036.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OneKeyItemCompose_3036)e.getUnfinishedMessage();
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

   public static final class C2S_CustomPrestige_3037 extends GeneratedMessageV3 implements C2S_CustomPrestige_3037OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int PRESTIGE_FIELD_NUMBER = 2;
      private volatile Object prestige_;
      private byte memoizedIsInitialized;
      private static final C2S_CustomPrestige_3037 DEFAULT_INSTANCE = new C2S_CustomPrestige_3037();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CustomPrestige_3037> PARSER = new AbstractParser<C2S_CustomPrestige_3037>() {
         public C2S_CustomPrestige_3037 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CustomPrestige_3037(input, extensionRegistry);
         }
      };

      private C2S_CustomPrestige_3037(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CustomPrestige_3037() {
         this.memoizedIsInitialized = -1;
         this.prestige_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CustomPrestige_3037();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CustomPrestige_3037(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.prestige_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_CustomPrestige_3037_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_CustomPrestige_3037_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CustomPrestige_3037.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasPrestige() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getPrestige() {
         Object ref = this.prestige_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.prestige_ = s;
            }

            return s;
         }
      }

      public ByteString getPrestigeBytes() {
         Object ref = this.prestige_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.prestige_ = b;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPrestige()) {
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
            GeneratedMessageV3.writeString(output, 2, this.prestige_);
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
               size += GeneratedMessageV3.computeStringSize(2, this.prestige_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CustomPrestige_3037)) {
            return super.equals(obj);
         } else {
            C2S_CustomPrestige_3037 other = (C2S_CustomPrestige_3037)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPrestige().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CustomPrestige_3037 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CustomPrestige_3037)PARSER.parseFrom(data);
      }

      public static C2S_CustomPrestige_3037 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CustomPrestige_3037)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CustomPrestige_3037 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CustomPrestige_3037)PARSER.parseFrom(data);
      }

      public static C2S_CustomPrestige_3037 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CustomPrestige_3037)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CustomPrestige_3037 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CustomPrestige_3037)PARSER.parseFrom(data);
      }

      public static C2S_CustomPrestige_3037 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CustomPrestige_3037)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CustomPrestige_3037 parseFrom(InputStream input) throws IOException {
         return (C2S_CustomPrestige_3037)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CustomPrestige_3037 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CustomPrestige_3037)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CustomPrestige_3037 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CustomPrestige_3037)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CustomPrestige_3037 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CustomPrestige_3037)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CustomPrestige_3037 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CustomPrestige_3037)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CustomPrestige_3037 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CustomPrestige_3037)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CustomPrestige_3037 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CustomPrestige_3037 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CustomPrestige_3037> parser() {
         return PARSER;
      }

      public Parser<C2S_CustomPrestige_3037> getParserForType() {
         return PARSER;
      }

      public C2S_CustomPrestige_3037 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CustomPrestige_3037OrBuilder {
         private int bitField0_;
         private int code_;
         private Object prestige_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_CustomPrestige_3037_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_CustomPrestige_3037_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CustomPrestige_3037.class, Builder.class);
         }

         private Builder() {
            this.prestige_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.prestige_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_CustomPrestige_3037.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.prestige_ = "";
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_CustomPrestige_3037_descriptor;
         }

         public C2S_CustomPrestige_3037 getDefaultInstanceForType() {
            return BagMsg.C2S_CustomPrestige_3037.getDefaultInstance();
         }

         public C2S_CustomPrestige_3037 build() {
            C2S_CustomPrestige_3037 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CustomPrestige_3037 buildPartial() {
            C2S_CustomPrestige_3037 result = new C2S_CustomPrestige_3037(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.prestige_ = this.prestige_;
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
            if (other instanceof C2S_CustomPrestige_3037) {
               return this.mergeFrom((C2S_CustomPrestige_3037)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CustomPrestige_3037 other) {
            if (other == BagMsg.C2S_CustomPrestige_3037.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasPrestige()) {
                  this.bitField0_ |= 2;
                  this.prestige_ = other.prestige_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasPrestige();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CustomPrestige_3037 parsedMessage = null;

            try {
               parsedMessage = (C2S_CustomPrestige_3037)BagMsg.C2S_CustomPrestige_3037.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CustomPrestige_3037)e.getUnfinishedMessage();
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

         public boolean hasPrestige() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getPrestige() {
            Object ref = this.prestige_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.prestige_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPrestigeBytes() {
            Object ref = this.prestige_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.prestige_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPrestige(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.prestige_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPrestige() {
            this.bitField0_ &= -3;
            this.prestige_ = BagMsg.C2S_CustomPrestige_3037.getDefaultInstance().getPrestige();
            this.onChanged();
            return this;
         }

         public Builder setPrestigeBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.prestige_ = value;
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

   public static final class S2C_CustomPrestigeChanged_3038 extends GeneratedMessageV3 implements S2C_CustomPrestigeChanged_3038OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMID_FIELD_NUMBER = 1;
      private int itemId_;
      public static final int PRESTIGE_FIELD_NUMBER = 2;
      private volatile Object prestige_;
      private byte memoizedIsInitialized;
      private static final S2C_CustomPrestigeChanged_3038 DEFAULT_INSTANCE = new S2C_CustomPrestigeChanged_3038();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CustomPrestigeChanged_3038> PARSER = new AbstractParser<S2C_CustomPrestigeChanged_3038>() {
         public S2C_CustomPrestigeChanged_3038 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CustomPrestigeChanged_3038(input, extensionRegistry);
         }
      };

      private S2C_CustomPrestigeChanged_3038(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CustomPrestigeChanged_3038() {
         this.memoizedIsInitialized = -1;
         this.prestige_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CustomPrestigeChanged_3038();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CustomPrestigeChanged_3038(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemId_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.prestige_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_CustomPrestigeChanged_3038_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_CustomPrestigeChanged_3038_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CustomPrestigeChanged_3038.class, Builder.class);
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemId() {
         return this.itemId_;
      }

      public boolean hasPrestige() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getPrestige() {
         Object ref = this.prestige_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.prestige_ = s;
            }

            return s;
         }
      }

      public ByteString getPrestigeBytes() {
         Object ref = this.prestige_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.prestige_ = b;
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
         } else if (!this.hasItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPrestige()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.prestige_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.prestige_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CustomPrestigeChanged_3038)) {
            return super.equals(obj);
         } else {
            S2C_CustomPrestigeChanged_3038 other = (S2C_CustomPrestigeChanged_3038)obj;
            if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
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
            if (this.hasItemId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemId();
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPrestige().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CustomPrestigeChanged_3038 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CustomPrestigeChanged_3038)PARSER.parseFrom(data);
      }

      public static S2C_CustomPrestigeChanged_3038 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CustomPrestigeChanged_3038)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CustomPrestigeChanged_3038 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CustomPrestigeChanged_3038)PARSER.parseFrom(data);
      }

      public static S2C_CustomPrestigeChanged_3038 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CustomPrestigeChanged_3038)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CustomPrestigeChanged_3038 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CustomPrestigeChanged_3038)PARSER.parseFrom(data);
      }

      public static S2C_CustomPrestigeChanged_3038 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CustomPrestigeChanged_3038)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CustomPrestigeChanged_3038 parseFrom(InputStream input) throws IOException {
         return (S2C_CustomPrestigeChanged_3038)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CustomPrestigeChanged_3038 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CustomPrestigeChanged_3038)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CustomPrestigeChanged_3038 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CustomPrestigeChanged_3038)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CustomPrestigeChanged_3038 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CustomPrestigeChanged_3038)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CustomPrestigeChanged_3038 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CustomPrestigeChanged_3038)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CustomPrestigeChanged_3038 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CustomPrestigeChanged_3038)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CustomPrestigeChanged_3038 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CustomPrestigeChanged_3038 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CustomPrestigeChanged_3038> parser() {
         return PARSER;
      }

      public Parser<S2C_CustomPrestigeChanged_3038> getParserForType() {
         return PARSER;
      }

      public S2C_CustomPrestigeChanged_3038 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CustomPrestigeChanged_3038OrBuilder {
         private int bitField0_;
         private int itemId_;
         private Object prestige_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_CustomPrestigeChanged_3038_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_CustomPrestigeChanged_3038_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CustomPrestigeChanged_3038.class, Builder.class);
         }

         private Builder() {
            this.prestige_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.prestige_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_CustomPrestigeChanged_3038.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemId_ = 0;
            this.bitField0_ &= -2;
            this.prestige_ = "";
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_CustomPrestigeChanged_3038_descriptor;
         }

         public S2C_CustomPrestigeChanged_3038 getDefaultInstanceForType() {
            return BagMsg.S2C_CustomPrestigeChanged_3038.getDefaultInstance();
         }

         public S2C_CustomPrestigeChanged_3038 build() {
            S2C_CustomPrestigeChanged_3038 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CustomPrestigeChanged_3038 buildPartial() {
            S2C_CustomPrestigeChanged_3038 result = new S2C_CustomPrestigeChanged_3038(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemId_ = this.itemId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.prestige_ = this.prestige_;
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
            if (other instanceof S2C_CustomPrestigeChanged_3038) {
               return this.mergeFrom((S2C_CustomPrestigeChanged_3038)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CustomPrestigeChanged_3038 other) {
            if (other == BagMsg.S2C_CustomPrestigeChanged_3038.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
               }

               if (other.hasPrestige()) {
                  this.bitField0_ |= 2;
                  this.prestige_ = other.prestige_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItemId()) {
               return false;
            } else {
               return this.hasPrestige();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CustomPrestigeChanged_3038 parsedMessage = null;

            try {
               parsedMessage = (S2C_CustomPrestigeChanged_3038)BagMsg.S2C_CustomPrestigeChanged_3038.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CustomPrestigeChanged_3038)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 1;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -2;
            this.itemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPrestige() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getPrestige() {
            Object ref = this.prestige_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.prestige_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPrestigeBytes() {
            Object ref = this.prestige_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.prestige_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPrestige(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.prestige_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPrestige() {
            this.bitField0_ &= -3;
            this.prestige_ = BagMsg.S2C_CustomPrestigeChanged_3038.getDefaultInstance().getPrestige();
            this.onChanged();
            return this;
         }

         public Builder setPrestigeBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.prestige_ = value;
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

   public static final class C2S_OpenMultipleSelectBox_3201 extends GeneratedMessageV3 implements C2S_OpenMultipleSelectBox_3201OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int BOX_FIELD_NUMBER = 1;
      private List<SelectBoxInfo> box_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenMultipleSelectBox_3201 DEFAULT_INSTANCE = new C2S_OpenMultipleSelectBox_3201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenMultipleSelectBox_3201> PARSER = new AbstractParser<C2S_OpenMultipleSelectBox_3201>() {
         public C2S_OpenMultipleSelectBox_3201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenMultipleSelectBox_3201(input, extensionRegistry);
         }
      };

      private C2S_OpenMultipleSelectBox_3201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenMultipleSelectBox_3201() {
         this.memoizedIsInitialized = -1;
         this.box_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenMultipleSelectBox_3201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenMultipleSelectBox_3201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.box_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.box_.add(input.readMessage(BagMsg.SelectBoxInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.box_ = Collections.unmodifiableList(this.box_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenMultipleSelectBox_3201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenMultipleSelectBox_3201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenMultipleSelectBox_3201.class, Builder.class);
      }

      public List<SelectBoxInfo> getBoxList() {
         return this.box_;
      }

      public List<? extends SelectBoxInfoOrBuilder> getBoxOrBuilderList() {
         return this.box_;
      }

      public int getBoxCount() {
         return this.box_.size();
      }

      public SelectBoxInfo getBox(int index) {
         return (SelectBoxInfo)this.box_.get(index);
      }

      public SelectBoxInfoOrBuilder getBoxOrBuilder(int index) {
         return (SelectBoxInfoOrBuilder)this.box_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getBoxCount(); ++i) {
               if (!this.getBox(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.box_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.box_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.box_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.box_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OpenMultipleSelectBox_3201)) {
            return super.equals(obj);
         } else {
            C2S_OpenMultipleSelectBox_3201 other = (C2S_OpenMultipleSelectBox_3201)obj;
            if (!this.getBoxList().equals(other.getBoxList())) {
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
            if (this.getBoxCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBoxList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OpenMultipleSelectBox_3201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenMultipleSelectBox_3201)PARSER.parseFrom(data);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMultipleSelectBox_3201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenMultipleSelectBox_3201)PARSER.parseFrom(data);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMultipleSelectBox_3201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenMultipleSelectBox_3201)PARSER.parseFrom(data);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMultipleSelectBox_3201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenMultipleSelectBox_3201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMultipleSelectBox_3201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenMultipleSelectBox_3201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMultipleSelectBox_3201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenMultipleSelectBox_3201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenMultipleSelectBox_3201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMultipleSelectBox_3201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenMultipleSelectBox_3201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenMultipleSelectBox_3201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenMultipleSelectBox_3201> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenMultipleSelectBox_3201> getParserForType() {
         return PARSER;
      }

      public C2S_OpenMultipleSelectBox_3201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenMultipleSelectBox_3201OrBuilder {
         private int bitField0_;
         private List<SelectBoxInfo> box_;
         private RepeatedFieldBuilderV3<SelectBoxInfo, SelectBoxInfo.Builder, SelectBoxInfoOrBuilder> boxBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenMultipleSelectBox_3201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenMultipleSelectBox_3201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenMultipleSelectBox_3201.class, Builder.class);
         }

         private Builder() {
            this.box_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.box_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.C2S_OpenMultipleSelectBox_3201.alwaysUseFieldBuilders) {
               this.getBoxFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.boxBuilder_ == null) {
               this.box_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.boxBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_C2S_OpenMultipleSelectBox_3201_descriptor;
         }

         public C2S_OpenMultipleSelectBox_3201 getDefaultInstanceForType() {
            return BagMsg.C2S_OpenMultipleSelectBox_3201.getDefaultInstance();
         }

         public C2S_OpenMultipleSelectBox_3201 build() {
            C2S_OpenMultipleSelectBox_3201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenMultipleSelectBox_3201 buildPartial() {
            C2S_OpenMultipleSelectBox_3201 result = new C2S_OpenMultipleSelectBox_3201(this);
            int from_bitField0_ = this.bitField0_;
            if (this.boxBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.box_ = Collections.unmodifiableList(this.box_);
                  this.bitField0_ &= -2;
               }

               result.box_ = this.box_;
            } else {
               result.box_ = this.boxBuilder_.build();
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
            if (other instanceof C2S_OpenMultipleSelectBox_3201) {
               return this.mergeFrom((C2S_OpenMultipleSelectBox_3201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenMultipleSelectBox_3201 other) {
            if (other == BagMsg.C2S_OpenMultipleSelectBox_3201.getDefaultInstance()) {
               return this;
            } else {
               if (this.boxBuilder_ == null) {
                  if (!other.box_.isEmpty()) {
                     if (this.box_.isEmpty()) {
                        this.box_ = other.box_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureBoxIsMutable();
                        this.box_.addAll(other.box_);
                     }

                     this.onChanged();
                  }
               } else if (!other.box_.isEmpty()) {
                  if (this.boxBuilder_.isEmpty()) {
                     this.boxBuilder_.dispose();
                     this.boxBuilder_ = null;
                     this.box_ = other.box_;
                     this.bitField0_ &= -2;
                     this.boxBuilder_ = BagMsg.C2S_OpenMultipleSelectBox_3201.alwaysUseFieldBuilders ? this.getBoxFieldBuilder() : null;
                  } else {
                     this.boxBuilder_.addAllMessages(other.box_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getBoxCount(); ++i) {
               if (!this.getBox(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OpenMultipleSelectBox_3201 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenMultipleSelectBox_3201)BagMsg.C2S_OpenMultipleSelectBox_3201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenMultipleSelectBox_3201)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureBoxIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.box_ = new ArrayList(this.box_);
               this.bitField0_ |= 1;
            }

         }

         public List<SelectBoxInfo> getBoxList() {
            return this.boxBuilder_ == null ? Collections.unmodifiableList(this.box_) : this.boxBuilder_.getMessageList();
         }

         public int getBoxCount() {
            return this.boxBuilder_ == null ? this.box_.size() : this.boxBuilder_.getCount();
         }

         public SelectBoxInfo getBox(int index) {
            return this.boxBuilder_ == null ? (SelectBoxInfo)this.box_.get(index) : (SelectBoxInfo)this.boxBuilder_.getMessage(index);
         }

         public Builder setBox(int index, SelectBoxInfo value) {
            if (this.boxBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxIsMutable();
               this.box_.set(index, value);
               this.onChanged();
            } else {
               this.boxBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBox(int index, SelectBoxInfo.Builder builderForValue) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.boxBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBox(SelectBoxInfo value) {
            if (this.boxBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxIsMutable();
               this.box_.add(value);
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBox(int index, SelectBoxInfo value) {
            if (this.boxBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxIsMutable();
               this.box_.add(index, value);
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBox(SelectBoxInfo.Builder builderForValue) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBox(int index, SelectBoxInfo.Builder builderForValue) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBox(Iterable<? extends SelectBoxInfo> values) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.box_);
               this.onChanged();
            } else {
               this.boxBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBox() {
            if (this.boxBuilder_ == null) {
               this.box_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.boxBuilder_.clear();
            }

            return this;
         }

         public Builder removeBox(int index) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.remove(index);
               this.onChanged();
            } else {
               this.boxBuilder_.remove(index);
            }

            return this;
         }

         public SelectBoxInfo.Builder getBoxBuilder(int index) {
            return (SelectBoxInfo.Builder)this.getBoxFieldBuilder().getBuilder(index);
         }

         public SelectBoxInfoOrBuilder getBoxOrBuilder(int index) {
            return this.boxBuilder_ == null ? (SelectBoxInfoOrBuilder)this.box_.get(index) : (SelectBoxInfoOrBuilder)this.boxBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SelectBoxInfoOrBuilder> getBoxOrBuilderList() {
            return this.boxBuilder_ != null ? this.boxBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.box_);
         }

         public SelectBoxInfo.Builder addBoxBuilder() {
            return (SelectBoxInfo.Builder)this.getBoxFieldBuilder().addBuilder(BagMsg.SelectBoxInfo.getDefaultInstance());
         }

         public SelectBoxInfo.Builder addBoxBuilder(int index) {
            return (SelectBoxInfo.Builder)this.getBoxFieldBuilder().addBuilder(index, BagMsg.SelectBoxInfo.getDefaultInstance());
         }

         public List<SelectBoxInfo.Builder> getBoxBuilderList() {
            return this.getBoxFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SelectBoxInfo, SelectBoxInfo.Builder, SelectBoxInfoOrBuilder> getBoxFieldBuilder() {
            if (this.boxBuilder_ == null) {
               this.boxBuilder_ = new RepeatedFieldBuilderV3(this.box_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.box_ = null;
            }

            return this.boxBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_OpenMultipleSelectBox_3202 extends GeneratedMessageV3 implements S2C_OpenMultipleSelectBox_3202OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int BOX_FIELD_NUMBER = 1;
      private List<SelectBoxInfo> box_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenMultipleSelectBox_3202 DEFAULT_INSTANCE = new S2C_OpenMultipleSelectBox_3202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenMultipleSelectBox_3202> PARSER = new AbstractParser<S2C_OpenMultipleSelectBox_3202>() {
         public S2C_OpenMultipleSelectBox_3202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenMultipleSelectBox_3202(input, extensionRegistry);
         }
      };

      private S2C_OpenMultipleSelectBox_3202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenMultipleSelectBox_3202() {
         this.memoizedIsInitialized = -1;
         this.box_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenMultipleSelectBox_3202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenMultipleSelectBox_3202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.box_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.box_.add(input.readMessage(BagMsg.SelectBoxInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.box_ = Collections.unmodifiableList(this.box_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenMultipleSelectBox_3202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenMultipleSelectBox_3202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenMultipleSelectBox_3202.class, Builder.class);
      }

      public List<SelectBoxInfo> getBoxList() {
         return this.box_;
      }

      public List<? extends SelectBoxInfoOrBuilder> getBoxOrBuilderList() {
         return this.box_;
      }

      public int getBoxCount() {
         return this.box_.size();
      }

      public SelectBoxInfo getBox(int index) {
         return (SelectBoxInfo)this.box_.get(index);
      }

      public SelectBoxInfoOrBuilder getBoxOrBuilder(int index) {
         return (SelectBoxInfoOrBuilder)this.box_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getBoxCount(); ++i) {
               if (!this.getBox(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.box_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.box_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.box_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.box_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenMultipleSelectBox_3202)) {
            return super.equals(obj);
         } else {
            S2C_OpenMultipleSelectBox_3202 other = (S2C_OpenMultipleSelectBox_3202)obj;
            if (!this.getBoxList().equals(other.getBoxList())) {
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
            if (this.getBoxCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBoxList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenMultipleSelectBox_3202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenMultipleSelectBox_3202)PARSER.parseFrom(data);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMultipleSelectBox_3202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenMultipleSelectBox_3202)PARSER.parseFrom(data);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMultipleSelectBox_3202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenMultipleSelectBox_3202)PARSER.parseFrom(data);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMultipleSelectBox_3202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenMultipleSelectBox_3202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMultipleSelectBox_3202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenMultipleSelectBox_3202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMultipleSelectBox_3202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenMultipleSelectBox_3202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenMultipleSelectBox_3202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMultipleSelectBox_3202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenMultipleSelectBox_3202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenMultipleSelectBox_3202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenMultipleSelectBox_3202> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenMultipleSelectBox_3202> getParserForType() {
         return PARSER;
      }

      public S2C_OpenMultipleSelectBox_3202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenMultipleSelectBox_3202OrBuilder {
         private int bitField0_;
         private List<SelectBoxInfo> box_;
         private RepeatedFieldBuilderV3<SelectBoxInfo, SelectBoxInfo.Builder, SelectBoxInfoOrBuilder> boxBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenMultipleSelectBox_3202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenMultipleSelectBox_3202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenMultipleSelectBox_3202.class, Builder.class);
         }

         private Builder() {
            this.box_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.box_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_OpenMultipleSelectBox_3202.alwaysUseFieldBuilders) {
               this.getBoxFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.boxBuilder_ == null) {
               this.box_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.boxBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_OpenMultipleSelectBox_3202_descriptor;
         }

         public S2C_OpenMultipleSelectBox_3202 getDefaultInstanceForType() {
            return BagMsg.S2C_OpenMultipleSelectBox_3202.getDefaultInstance();
         }

         public S2C_OpenMultipleSelectBox_3202 build() {
            S2C_OpenMultipleSelectBox_3202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenMultipleSelectBox_3202 buildPartial() {
            S2C_OpenMultipleSelectBox_3202 result = new S2C_OpenMultipleSelectBox_3202(this);
            int from_bitField0_ = this.bitField0_;
            if (this.boxBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.box_ = Collections.unmodifiableList(this.box_);
                  this.bitField0_ &= -2;
               }

               result.box_ = this.box_;
            } else {
               result.box_ = this.boxBuilder_.build();
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
            if (other instanceof S2C_OpenMultipleSelectBox_3202) {
               return this.mergeFrom((S2C_OpenMultipleSelectBox_3202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenMultipleSelectBox_3202 other) {
            if (other == BagMsg.S2C_OpenMultipleSelectBox_3202.getDefaultInstance()) {
               return this;
            } else {
               if (this.boxBuilder_ == null) {
                  if (!other.box_.isEmpty()) {
                     if (this.box_.isEmpty()) {
                        this.box_ = other.box_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureBoxIsMutable();
                        this.box_.addAll(other.box_);
                     }

                     this.onChanged();
                  }
               } else if (!other.box_.isEmpty()) {
                  if (this.boxBuilder_.isEmpty()) {
                     this.boxBuilder_.dispose();
                     this.boxBuilder_ = null;
                     this.box_ = other.box_;
                     this.bitField0_ &= -2;
                     this.boxBuilder_ = BagMsg.S2C_OpenMultipleSelectBox_3202.alwaysUseFieldBuilders ? this.getBoxFieldBuilder() : null;
                  } else {
                     this.boxBuilder_.addAllMessages(other.box_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getBoxCount(); ++i) {
               if (!this.getBox(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenMultipleSelectBox_3202 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenMultipleSelectBox_3202)BagMsg.S2C_OpenMultipleSelectBox_3202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenMultipleSelectBox_3202)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureBoxIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.box_ = new ArrayList(this.box_);
               this.bitField0_ |= 1;
            }

         }

         public List<SelectBoxInfo> getBoxList() {
            return this.boxBuilder_ == null ? Collections.unmodifiableList(this.box_) : this.boxBuilder_.getMessageList();
         }

         public int getBoxCount() {
            return this.boxBuilder_ == null ? this.box_.size() : this.boxBuilder_.getCount();
         }

         public SelectBoxInfo getBox(int index) {
            return this.boxBuilder_ == null ? (SelectBoxInfo)this.box_.get(index) : (SelectBoxInfo)this.boxBuilder_.getMessage(index);
         }

         public Builder setBox(int index, SelectBoxInfo value) {
            if (this.boxBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxIsMutable();
               this.box_.set(index, value);
               this.onChanged();
            } else {
               this.boxBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBox(int index, SelectBoxInfo.Builder builderForValue) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.boxBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBox(SelectBoxInfo value) {
            if (this.boxBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxIsMutable();
               this.box_.add(value);
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBox(int index, SelectBoxInfo value) {
            if (this.boxBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxIsMutable();
               this.box_.add(index, value);
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBox(SelectBoxInfo.Builder builderForValue) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBox(int index, SelectBoxInfo.Builder builderForValue) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBox(Iterable<? extends SelectBoxInfo> values) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.box_);
               this.onChanged();
            } else {
               this.boxBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBox() {
            if (this.boxBuilder_ == null) {
               this.box_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.boxBuilder_.clear();
            }

            return this;
         }

         public Builder removeBox(int index) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.remove(index);
               this.onChanged();
            } else {
               this.boxBuilder_.remove(index);
            }

            return this;
         }

         public SelectBoxInfo.Builder getBoxBuilder(int index) {
            return (SelectBoxInfo.Builder)this.getBoxFieldBuilder().getBuilder(index);
         }

         public SelectBoxInfoOrBuilder getBoxOrBuilder(int index) {
            return this.boxBuilder_ == null ? (SelectBoxInfoOrBuilder)this.box_.get(index) : (SelectBoxInfoOrBuilder)this.boxBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SelectBoxInfoOrBuilder> getBoxOrBuilderList() {
            return this.boxBuilder_ != null ? this.boxBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.box_);
         }

         public SelectBoxInfo.Builder addBoxBuilder() {
            return (SelectBoxInfo.Builder)this.getBoxFieldBuilder().addBuilder(BagMsg.SelectBoxInfo.getDefaultInstance());
         }

         public SelectBoxInfo.Builder addBoxBuilder(int index) {
            return (SelectBoxInfo.Builder)this.getBoxFieldBuilder().addBuilder(index, BagMsg.SelectBoxInfo.getDefaultInstance());
         }

         public List<SelectBoxInfo.Builder> getBoxBuilderList() {
            return this.getBoxFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SelectBoxInfo, SelectBoxInfo.Builder, SelectBoxInfoOrBuilder> getBoxFieldBuilder() {
            if (this.boxBuilder_ == null) {
               this.boxBuilder_ = new RepeatedFieldBuilderV3(this.box_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.box_ = null;
            }

            return this.boxBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class SelectBoxInfo extends GeneratedMessageV3 implements SelectBoxInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int NUM_FIELD_NUMBER = 3;
      private int num_;
      private byte memoizedIsInitialized;
      private static final SelectBoxInfo DEFAULT_INSTANCE = new SelectBoxInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<SelectBoxInfo> PARSER = new AbstractParser<SelectBoxInfo>() {
         public SelectBoxInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SelectBoxInfo(input, extensionRegistry);
         }
      };

      private SelectBoxInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SelectBoxInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SelectBoxInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SelectBoxInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.id_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return BagMsg.internal_static_bag_com_gzbz_protobuf_SelectBoxInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_SelectBoxInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectBoxInfo.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.num_);
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
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SelectBoxInfo)) {
            return super.equals(obj);
         } else {
            SelectBoxInfo other = (SelectBoxInfo)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SelectBoxInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SelectBoxInfo)PARSER.parseFrom(data);
      }

      public static SelectBoxInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SelectBoxInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SelectBoxInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SelectBoxInfo)PARSER.parseFrom(data);
      }

      public static SelectBoxInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SelectBoxInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SelectBoxInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SelectBoxInfo)PARSER.parseFrom(data);
      }

      public static SelectBoxInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SelectBoxInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SelectBoxInfo parseFrom(InputStream input) throws IOException {
         return (SelectBoxInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SelectBoxInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SelectBoxInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SelectBoxInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (SelectBoxInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SelectBoxInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SelectBoxInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SelectBoxInfo parseFrom(CodedInputStream input) throws IOException {
         return (SelectBoxInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SelectBoxInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SelectBoxInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SelectBoxInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SelectBoxInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SelectBoxInfo> parser() {
         return PARSER;
      }

      public Parser<SelectBoxInfo> getParserForType() {
         return PARSER;
      }

      public SelectBoxInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SelectBoxInfoOrBuilder {
         private int bitField0_;
         private int code_;
         private int id_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_SelectBoxInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_SelectBoxInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectBoxInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.SelectBoxInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_SelectBoxInfo_descriptor;
         }

         public SelectBoxInfo getDefaultInstanceForType() {
            return BagMsg.SelectBoxInfo.getDefaultInstance();
         }

         public SelectBoxInfo build() {
            SelectBoxInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SelectBoxInfo buildPartial() {
            SelectBoxInfo result = new SelectBoxInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof SelectBoxInfo) {
               return this.mergeFrom((SelectBoxInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SelectBoxInfo other) {
            if (other == BagMsg.SelectBoxInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
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
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SelectBoxInfo parsedMessage = null;

            try {
               parsedMessage = (SelectBoxInfo)BagMsg.SelectBoxInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SelectBoxInfo)e.getUnfinishedMessage();
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

         public boolean hasNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 4;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -5;
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

   public static final class S2C_UpdateCumulative_3208 extends GeneratedMessageV3 implements S2C_UpdateCumulative_3208OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int VALUES_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> values_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateCumulative_3208 DEFAULT_INSTANCE = new S2C_UpdateCumulative_3208();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateCumulative_3208> PARSER = new AbstractParser<S2C_UpdateCumulative_3208>() {
         public S2C_UpdateCumulative_3208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateCumulative_3208(input, extensionRegistry);
         }
      };

      private S2C_UpdateCumulative_3208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateCumulative_3208() {
         this.memoizedIsInitialized = -1;
         this.values_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateCumulative_3208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateCumulative_3208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.values_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.values_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.values_ = Collections.unmodifiableList(this.values_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_UpdateCumulative_3208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_UpdateCumulative_3208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateCumulative_3208.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getValuesList() {
         return this.values_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getValuesOrBuilderList() {
         return this.values_;
      }

      public int getValuesCount() {
         return this.values_.size();
      }

      public CommonMsg.MapDataII getValues(int index) {
         return (CommonMsg.MapDataII)this.values_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getValuesOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.values_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getValuesCount(); ++i) {
               if (!this.getValues(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.values_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.values_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.values_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.values_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateCumulative_3208)) {
            return super.equals(obj);
         } else {
            S2C_UpdateCumulative_3208 other = (S2C_UpdateCumulative_3208)obj;
            if (!this.getValuesList().equals(other.getValuesList())) {
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
            if (this.getValuesCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getValuesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateCumulative_3208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateCumulative_3208)PARSER.parseFrom(data);
      }

      public static S2C_UpdateCumulative_3208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateCumulative_3208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateCumulative_3208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateCumulative_3208)PARSER.parseFrom(data);
      }

      public static S2C_UpdateCumulative_3208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateCumulative_3208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateCumulative_3208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateCumulative_3208)PARSER.parseFrom(data);
      }

      public static S2C_UpdateCumulative_3208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateCumulative_3208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateCumulative_3208 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateCumulative_3208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateCumulative_3208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateCumulative_3208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateCumulative_3208 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateCumulative_3208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateCumulative_3208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateCumulative_3208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateCumulative_3208 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateCumulative_3208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateCumulative_3208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateCumulative_3208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateCumulative_3208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateCumulative_3208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateCumulative_3208> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateCumulative_3208> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateCumulative_3208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateCumulative_3208OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> values_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> valuesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_UpdateCumulative_3208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_UpdateCumulative_3208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateCumulative_3208.class, Builder.class);
         }

         private Builder() {
            this.values_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.values_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BagMsg.S2C_UpdateCumulative_3208.alwaysUseFieldBuilders) {
               this.getValuesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.valuesBuilder_ == null) {
               this.values_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.valuesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BagMsg.internal_static_bag_com_gzbz_protobuf_S2C_UpdateCumulative_3208_descriptor;
         }

         public S2C_UpdateCumulative_3208 getDefaultInstanceForType() {
            return BagMsg.S2C_UpdateCumulative_3208.getDefaultInstance();
         }

         public S2C_UpdateCumulative_3208 build() {
            S2C_UpdateCumulative_3208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateCumulative_3208 buildPartial() {
            S2C_UpdateCumulative_3208 result = new S2C_UpdateCumulative_3208(this);
            int from_bitField0_ = this.bitField0_;
            if (this.valuesBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.values_ = Collections.unmodifiableList(this.values_);
                  this.bitField0_ &= -2;
               }

               result.values_ = this.values_;
            } else {
               result.values_ = this.valuesBuilder_.build();
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
            if (other instanceof S2C_UpdateCumulative_3208) {
               return this.mergeFrom((S2C_UpdateCumulative_3208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateCumulative_3208 other) {
            if (other == BagMsg.S2C_UpdateCumulative_3208.getDefaultInstance()) {
               return this;
            } else {
               if (this.valuesBuilder_ == null) {
                  if (!other.values_.isEmpty()) {
                     if (this.values_.isEmpty()) {
                        this.values_ = other.values_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureValuesIsMutable();
                        this.values_.addAll(other.values_);
                     }

                     this.onChanged();
                  }
               } else if (!other.values_.isEmpty()) {
                  if (this.valuesBuilder_.isEmpty()) {
                     this.valuesBuilder_.dispose();
                     this.valuesBuilder_ = null;
                     this.values_ = other.values_;
                     this.bitField0_ &= -2;
                     this.valuesBuilder_ = BagMsg.S2C_UpdateCumulative_3208.alwaysUseFieldBuilders ? this.getValuesFieldBuilder() : null;
                  } else {
                     this.valuesBuilder_.addAllMessages(other.values_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getValuesCount(); ++i) {
               if (!this.getValues(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateCumulative_3208 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateCumulative_3208)BagMsg.S2C_UpdateCumulative_3208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateCumulative_3208)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureValuesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.values_ = new ArrayList(this.values_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getValuesList() {
            return this.valuesBuilder_ == null ? Collections.unmodifiableList(this.values_) : this.valuesBuilder_.getMessageList();
         }

         public int getValuesCount() {
            return this.valuesBuilder_ == null ? this.values_.size() : this.valuesBuilder_.getCount();
         }

         public CommonMsg.MapDataII getValues(int index) {
            return this.valuesBuilder_ == null ? (CommonMsg.MapDataII)this.values_.get(index) : (CommonMsg.MapDataII)this.valuesBuilder_.getMessage(index);
         }

         public Builder setValues(int index, CommonMsg.MapDataII value) {
            if (this.valuesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureValuesIsMutable();
               this.values_.set(index, value);
               this.onChanged();
            } else {
               this.valuesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setValues(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.valuesBuilder_ == null) {
               this.ensureValuesIsMutable();
               this.values_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.valuesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addValues(CommonMsg.MapDataII value) {
            if (this.valuesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureValuesIsMutable();
               this.values_.add(value);
               this.onChanged();
            } else {
               this.valuesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addValues(int index, CommonMsg.MapDataII value) {
            if (this.valuesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureValuesIsMutable();
               this.values_.add(index, value);
               this.onChanged();
            } else {
               this.valuesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addValues(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.valuesBuilder_ == null) {
               this.ensureValuesIsMutable();
               this.values_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.valuesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addValues(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.valuesBuilder_ == null) {
               this.ensureValuesIsMutable();
               this.values_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.valuesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllValues(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.valuesBuilder_ == null) {
               this.ensureValuesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.values_);
               this.onChanged();
            } else {
               this.valuesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearValues() {
            if (this.valuesBuilder_ == null) {
               this.values_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.valuesBuilder_.clear();
            }

            return this;
         }

         public Builder removeValues(int index) {
            if (this.valuesBuilder_ == null) {
               this.ensureValuesIsMutable();
               this.values_.remove(index);
               this.onChanged();
            } else {
               this.valuesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getValuesBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getValuesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getValuesOrBuilder(int index) {
            return this.valuesBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.values_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.valuesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getValuesOrBuilderList() {
            return this.valuesBuilder_ != null ? this.valuesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.values_);
         }

         public CommonMsg.MapDataII.Builder addValuesBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getValuesFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addValuesBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getValuesFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getValuesBuilderList() {
            return this.getValuesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getValuesFieldBuilder() {
            if (this.valuesBuilder_ == null) {
               this.valuesBuilder_ = new RepeatedFieldBuilderV3(this.values_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.values_ = null;
            }

            return this.valuesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_CommonBuy_3031OrBuilder extends MessageOrBuilder {
      boolean hasItemId();

      int getItemId();

      boolean hasNum();

      int getNum();

      boolean hasIsShowTips();

      boolean getIsShowTips();
   }

   public interface C2S_ComposeRandomItem_3023OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_CustomPrestige_3037OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasPrestige();

      String getPrestige();

      ByteString getPrestigeBytes();
   }

   public interface C2S_EquipExtraCompose_3027OrBuilder extends MessageOrBuilder {
      boolean hasItemId();

      int getItemId();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_HeroDressUse_3021OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_ItemBuy_3017OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_ItemCompose_3011OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasNum();

      int getNum();

      boolean hasGuideStep();

      int getGuideStep();
   }

   public interface C2S_ItemDatas_3003OrBuilder extends MessageOrBuilder {
      boolean hasSubclass();

      int getSubclass();
   }

   public interface C2S_ItemSell_3009OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasNum();

      int getNum();

      boolean hasGuideStep();

      int getGuideStep();
   }

   public interface C2S_ItemUseNum_3033OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ItemUse_3007OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_MultiSelect_3025OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);
   }

   public interface C2S_OneKeyItemCompose_3035OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenBox_3013OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_OpenMultipleSelectBox_3201OrBuilder extends MessageOrBuilder {
      List<SelectBoxInfo> getBoxList();

      SelectBoxInfo getBox(int index);

      int getBoxCount();

      List<? extends SelectBoxInfoOrBuilder> getBoxOrBuilderList();

      SelectBoxInfoOrBuilder getBoxOrBuilder(int index);
   }

   public interface C2S_OpenSelectBox_3015OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasId();

      int getId();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_ReqItemInfo_3029OrBuilder extends MessageOrBuilder {
      List<Integer> getItemIdList();

      int getItemIdCount();

      int getItemId(int index);
   }

   public interface C2S_ViceCompose_3019OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasNum();

      int getNum();
   }

   public interface Item_InfoOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasId();

      int getId();

      boolean hasNum();

      int getNum();

      boolean hasSubclass();

      int getSubclass();

      boolean hasScore();

      int getScore();

      List<CommonMsg.PropertyInfo> getPropertiesList();

      CommonMsg.PropertyInfo getProperties(int index);

      int getPropertiesCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertiesOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPropertiesOrBuilder(int index);

      List<Integer> getSkillsList();

      int getSkillsCount();

      int getSkills(int index);

      boolean hasLevel();

      int getLevel();

      List<CommonMsg.PropertyInfo> getRecastProsList();

      CommonMsg.PropertyInfo getRecastPros(int index);

      int getRecastProsCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getRecastProsOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getRecastProsOrBuilder(int index);

      List<Integer> getRecastSkillsList();

      int getRecastSkillsCount();

      int getRecastSkills(int index);

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasBreachLv();

      int getBreachLv();

      List<Integer> getClearNumList();

      int getClearNumCount();

      int getClearNum(int index);

      List<CommonMsg.PropertyInfo> getStrongProsList();

      CommonMsg.PropertyInfo getStrongPros(int index);

      int getStrongProsCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getStrongProsOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getStrongProsOrBuilder(int index);

      List<CommonMsg.RuneStonePro> getRuneProList();

      CommonMsg.RuneStonePro getRunePro(int index);

      int getRuneProCount();

      List<? extends CommonMsg.RuneStoneProOrBuilder> getRuneProOrBuilderList();

      CommonMsg.RuneStoneProOrBuilder getRuneProOrBuilder(int index);

      boolean hasIsRuneLock();

      boolean getIsRuneLock();

      List<Integer> getOrnamentLockProList();

      int getOrnamentLockProCount();

      int getOrnamentLockPro(int index);

      boolean hasEnableTime();

      int getEnableTime();

      List<Integer> getOrnamentProColourList();

      int getOrnamentProColourCount();

      int getOrnamentProColour(int index);

      List<Integer> getOrnamentExtraProColourList();

      int getOrnamentExtraProColourCount();

      int getOrnamentExtraProColour(int index);

      boolean hasExp();

      int getExp();

      boolean hasArtificeVal();

      int getArtificeVal();

      boolean hasSkinId();

      int getSkinId();

      boolean hasIsUsed();

      boolean getIsUsed();

      boolean hasIsLock();

      boolean getIsLock();

      boolean hasLockSkill();

      int getLockSkill();

      boolean hasIsMainSkillUnlock();

      boolean getIsMainSkillUnlock();

      List<Integer> getPetGroupList();

      int getPetGroupCount();

      int getPetGroup(int index);

      boolean hasPetStar();

      int getPetStar();

      List<Integer> getHorseLockSkillList();

      int getHorseLockSkillCount();

      int getHorseLockSkill(int index);

      boolean hasIsAwaken();

      boolean getIsAwaken();

      boolean hasRuneStoneStrength();

      int getRuneStoneStrength();

      List<Integer> getAwakenIndexList();

      int getAwakenIndexCount();

      int getAwakenIndex(int index);

      boolean hasUpgradeProgress();

      int getUpgradeProgress();

      List<CommonMsg.RefineProperty> getRefinePropertyList();

      CommonMsg.RefineProperty getRefineProperty(int index);

      int getRefinePropertyCount();

      List<? extends CommonMsg.RefinePropertyOrBuilder> getRefinePropertyOrBuilderList();

      CommonMsg.RefinePropertyOrBuilder getRefinePropertyOrBuilder(int index);

      boolean hasBreakUpTime();

      int getBreakUpTime();

      boolean hasGodBeastInfo();

      CommonMsg.GodBeastInfo getGodBeastInfo();

      CommonMsg.GodBeastInfoOrBuilder getGodBeastInfoOrBuilder();

      List<CommonMsg.PropertyInfo> getExclusiveAttrList();

      CommonMsg.PropertyInfo getExclusiveAttr(int index);

      int getExclusiveAttrCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getExclusiveAttrOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getExclusiveAttrOrBuilder(int index);

      boolean hasExclusiveWeaponData();

      CommonMsg.ExclusiveWeaponData getExclusiveWeaponData();

      CommonMsg.ExclusiveWeaponDataOrBuilder getExclusiveWeaponDataOrBuilder();

      boolean hasNeiDanInfo();

      CommonMsg.NeiDanInfo getNeiDanInfo();

      CommonMsg.NeiDanInfoOrBuilder getNeiDanInfoOrBuilder();

      boolean hasParamId();

      int getParamId();
   }

   public interface S2C_CommonBuy_3032OrBuilder extends MessageOrBuilder {
      boolean hasItemId();

      int getItemId();
   }

   public interface S2C_ComposeRandomItem_3024OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_CustomPrestigeChanged_3038OrBuilder extends MessageOrBuilder {
      boolean hasItemId();

      int getItemId();

      boolean hasPrestige();

      String getPrestige();

      ByteString getPrestigeBytes();
   }

   public interface S2C_EquipExtraCompose_3028OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_HeroDressUse_3022OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasItemId();

      int getItemId();
   }

   public interface S2C_ItemBuyResult_3018OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_ItemCompose_3012OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_ItemDatas_3004OrBuilder extends MessageOrBuilder {
      boolean hasSubclass();

      int getSubclass();

      List<Item_Info> getItemsList();

      Item_Info getItems(int index);

      int getItemsCount();

      List<? extends Item_InfoOrBuilder> getItemsOrBuilderList();

      Item_InfoOrBuilder getItemsOrBuilder(int index);
   }

   public interface S2C_ItemSell_3010OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_ItemUpdate_3006OrBuilder extends MessageOrBuilder {
      List<Item_Info> getItemsList();

      Item_Info getItems(int index);

      int getItemsCount();

      List<? extends Item_InfoOrBuilder> getItemsOrBuilderList();

      Item_InfoOrBuilder getItemsOrBuilder(int index);
   }

   public interface S2C_ItemUseNum_3034OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getValuesList();

      CommonMsg.MapDataII getValues(int index);

      int getValuesCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getValuesOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getValuesOrBuilder(int index);
   }

   public interface S2C_ItemUse_3008OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_MultiSelect_3026OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_OneKeyItemCompose_3036OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_OpenBox_3014OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasNum();

      int getNum();
   }

   public interface S2C_OpenMultipleSelectBox_3202OrBuilder extends MessageOrBuilder {
      List<SelectBoxInfo> getBoxList();

      SelectBoxInfo getBox(int index);

      int getBoxCount();

      List<? extends SelectBoxInfoOrBuilder> getBoxOrBuilderList();

      SelectBoxInfoOrBuilder getBoxOrBuilder(int index);
   }

   public interface S2C_OpenSelectBox_3016OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasId();

      int getId();
   }

   public interface S2C_UpdateCumulative_3208OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getValuesList();

      CommonMsg.MapDataII getValues(int index);

      int getValuesCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getValuesOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getValuesOrBuilder(int index);
   }

   public interface S2C_ViceCompose_3020OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface SelectBoxInfoOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasId();

      int getId();

      boolean hasNum();

      int getNum();
   }
}
